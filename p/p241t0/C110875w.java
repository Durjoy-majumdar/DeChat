package p241t0;

/* renamed from: t0.w */
public final class C110875w {

    /* renamed from: a */
    public static final Object f331664a = new Object();

    /* renamed from: a */
    public static final void m151169a(int i, int i2) {
        boolean z = false;
        if (i >= 0 && i < i2) {
            z = true;
        }
        if (!z) {
            throw new IndexOutOfBoundsException("index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
    }
}
