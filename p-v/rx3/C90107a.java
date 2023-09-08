package rx3;

import gy3.C87412m;
import java.io.PrintWriter;
import java.io.StringWriter;
import zx3.C91945b;

/* renamed from: rx3.a */
public class C90107a {
    /* renamed from: a */
    public static final void m112735a(Throwable th, Throwable th4) {
        C87412m.m108594g(th, "<this>");
        C87412m.m108594g(th4, "exception");
        if (th != th4) {
            C91945b.f263216a.mo109775a(th, th4);
        }
    }

    /* renamed from: b */
    public static final String m112736b(Throwable th) {
        C87412m.m108594g(th, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        C87412m.m108593f(stringWriter2, "sw.toString()");
        return stringWriter2;
    }
}
