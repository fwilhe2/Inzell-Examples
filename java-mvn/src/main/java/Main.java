import com.github.fwilhe.inzell.SheetKt;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Double> l = new LinkedList<>();
        l.add(1.2);
        l.add(3.2);
        l.add(4.2);
        Object x = SheetKt.buildFunctionOf(l);
        System.out.println(x.toString());
    }
}