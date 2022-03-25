package creational;

import org.json.simple.JSONObject;

import java.io.IOException;

public class JSONBookMetadataFormatter implements BookMetadataFormatter {
    
    private JSONObject jsonObject;

    public JSONBookMetadataFormatter() throws IOException {
        reset();
    }

    @Override
    public BookMetadataFormatter reset() {
        String headers = "";
        for (Book.Metadata metadata : Book.Metadata.values()) {
            headers = headers+metadata.value;
        }
        JSONObject.escape(headers);

        return this;
    }

    @Override
    public BookMetadataFormatter append(Book b) {
        String authors = String.join("|", b.getAuthors());
        String text = "";
        text = JSONObject.escape(b.getISBN()+ b.getTitle()+b.getPublisher()+authors);
        System.out.println(text);
        return this;
    }

    @Override
    public String getMetadataString() {
        return jsonObject.toString();
    }
}
