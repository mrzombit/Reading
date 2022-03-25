package creational;

public class CSVExporter implements Export{

    @Override
    public String exports() {
        System.out.println("Exported CSV");
        return null;
    }

}
