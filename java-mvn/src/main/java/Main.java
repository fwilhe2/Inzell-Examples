import com.github.fwilhe.inzell.*;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static double foo(int i) {
        return Math.sqrt(i);
    }

    public static void main(String[] args) {
        List<Column> l = new LinkedList<>();
        l.add(new Column("sqrt", Main::foo));
        l.add(new Column("cosine", StdlibKt::cosine));
        l.add(new Column("powerOfTwo", StdlibKt::powerOfTwo));
        l.add(new Column("random", StdlibKt::random));

        Sheet s = SheetKt.javaSpreadsheetBuilder(l, "abc");

        new CsvPrinter(s).printToStandardOut();
    }
}