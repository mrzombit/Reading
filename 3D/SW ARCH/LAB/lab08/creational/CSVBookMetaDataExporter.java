package creational;

import java.io.PrintStream;

public class CSVBookMetaDataExporter extends BookMetadataExporter {

    @Override
    public Export createExport(PrintStream out) {
        return new CSVExporter();
    }

}
