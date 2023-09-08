package p24;

import gy3.C87412m;
import o24.C21766h;
import z04.C119027c;

/* renamed from: p24.a */
public final class C21916a {

    /* renamed from: a */
    public static final byte[] f61968a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(C119027c.f356488a);
        C87412m.m108593f(bytes, "(this as java.lang.String).getBytes(charset)");
        f61968a = bytes;
    }

    /* renamed from: a */
    public static final String m25178a(C21766h hVar, long j) {
        C87412m.m108594g(hVar, "$this$readUtf8Line");
        if (j > 0) {
            long j2 = j - 1;
            if (hVar.mo34130c(j2) == ((byte) 13)) {
                String j3 = hVar.mo34141j(j2, C119027c.f356488a);
                hVar.skip(2);
                return j3;
            }
        }
        String j4 = hVar.mo34141j(j, C119027c.f356488a);
        hVar.skip(1);
        return j4;
    }
}
