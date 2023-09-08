package p333e8;

/* renamed from: e8.a */
public final class C20528a {
    /* renamed from: a */
    public static void m22237a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public static void m22238b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: c */
    public static int m22239c(int i, int i2, int i3) {
        if (i >= i2 && i < i3) {
            return i;
        }
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: d */
    public static void m22240d(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: e */
    public static void m22241e(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
