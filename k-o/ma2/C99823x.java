package ma2;

import a70.C112760b;
import gy3.C87412m;
import p823sg.C90193h;
import z04.C119027c;

/* renamed from: ma2.x */
public final class C99823x {

    /* renamed from: a */
    public static final C99823x f292522a = new C99823x();

    /* renamed from: a */
    public final String mo139180a() {
        StringBuilder sb = new StringBuilder();
        sb.append(C112760b.m154239k() + "music/");
        byte[] bytes = String.valueOf(System.currentTimeMillis()).getBytes(C119027c.f356488a);
        C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
        sb.append(C90193h.m112878f(bytes));
        return sb.toString();
    }

    /* renamed from: b */
    public final String mo139181b() {
        StringBuilder sb = new StringBuilder();
        sb.append(C112760b.m154239k() + "music/");
        byte[] bytes = String.valueOf(System.currentTimeMillis()).getBytes(C119027c.f356488a);
        C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
        sb.append(C90193h.m112878f(bytes));
        sb.append("_thumb");
        return sb.toString();
    }
}
