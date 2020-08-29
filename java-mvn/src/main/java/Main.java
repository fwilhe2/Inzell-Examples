import com.github.fwilhe.inzell.Column;
import com.github.fwilhe.inzell.CsvPrinter;
import com.github.fwilhe.inzell.SpreadsheetBuilder;
import com.github.fwilhe.inzell.StandardLibrary;

public class Main {
    public static double foo(int i) {
        return Math.sqrt(i);
    }

    public static void main(String[] args) {
        new CsvPrinter(
                new SpreadsheetBuilder()
                        .setCaption("test")
                        .addColumn(new Column("sqrt", Main::foo))
                        .addColumn(new Column("cosine", StandardLibrary::cosine))
                        .build())
                .printToStandardOut();
    }
}