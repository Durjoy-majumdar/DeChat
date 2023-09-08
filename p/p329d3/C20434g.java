package p329d3;

import java.util.Locale;

/* renamed from: d3.g */
public final class C20434g {
    /* renamed from: a */
    public static void m22017a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public static void m22018b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: c */
    public static int m22019c(int i, int i2, int i3, String str) {
        if (i < i2) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i3)}));
        } else if (i <= i3) {
            return i;
        } else {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i3)}));
        }
    }

    /* renamed from: d */
    public static <T> T m22020d(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: e */
    public static void m22021e(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }
}
