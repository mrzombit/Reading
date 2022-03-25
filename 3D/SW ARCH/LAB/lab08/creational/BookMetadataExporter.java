package creational;

import java.io.PrintStream;

public abstract class BookMetadataExporter extends BookCollection {

    public abstract Export createExport(PrintStream out);
}
