package ma2;

import f40.C86709a0;
import gy3.C87412m;
import p823sg.C90193h;
import z04.C119027c;

/* renamed from: ma2.t */
public final class C61454t {

    /* renamed from: a */
    public static final C61454t f174766a = new C61454t();

    /* renamed from: a */
    public final String mo86429a() {
        return C86709a0.m107535s().f251806d + "music/cover/";
    }

    /* renamed from: b */
    public final String mo86430b(String str) {
        if (str == null) {
            return "";
        }
        return (mo86429a() + "img/") + str + ".p";
    }

    /* renamed from: c */
    public final String mo86431c(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        String str2 = mo86429a() + "video/";
        byte[] bytes = str.getBytes(C119027c.f356488a);
        C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
        String f = C90193h.m112878f(bytes);
        if (f == null) {
            return "";
        }
        return str2 + f + ".v";
    }
}
