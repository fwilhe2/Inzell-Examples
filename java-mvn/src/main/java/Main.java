import com.github.fwilhe.inzell.*;

public class Main {
    public static double foo(int i) {
        return Math.sqrt(i);
    }

    public static void main(String[] args) {

        new CsvPrinter(
                new SpreadsheetBuilder()
                        .setCaption("test")
                        .addColumn(new Column("sqrt", Main::foo))
                        .addColumn(new Column("cosine", StdlibKt::cosine))
                        .build())
                .printToStandardOut();
    }
}