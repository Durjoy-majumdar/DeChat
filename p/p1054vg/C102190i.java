package p1054vg;

/* renamed from: vg.i */
public final class C102190i {
    /* renamed from: a */
    public static int m134653a(String str, int i) {
        if (str == null) {
            return i;
        }
        try {
            return str.length() <= 0 ? i : Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i;
        }
    }
}
