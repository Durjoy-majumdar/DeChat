package x51;

import te3.C101824o80;

/* renamed from: x51.f */
public class C102561f {
    /* renamed from: a */
    public static boolean m135421a(int i) {
        return m135423c(i, 128);
    }

    /* renamed from: b */
    public static boolean m135422b(C101824o80 o802) {
        if (o802 == null) {
            return false;
        }
        return m135423c(o802.f299001n, 1);
    }

    /* renamed from: c */
    public static boolean m135423c(int i, int i2) {
        return (i & i2) == i2;
    }

    /* renamed from: d */
    public static boolean m135424d(int i) {
        return m135423c(i, 4) || m135423c(i, 8);
    }

    /* renamed from: e */
    public static boolean m135425e(C101824o80 o802) {
        if (!(o802 == null ? false : m135423c(o802.f299000j, 4))) {
            return o802 == null ? false : m135423c(o802.f299000j, 8);
        }
    }
}
