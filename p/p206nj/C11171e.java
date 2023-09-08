package p206nj;

import android.os.Build;

/* renamed from: nj.e */
public class C11171e {
    /* renamed from: a */
    public static boolean m11044a(int i) {
        return Build.VERSION.SDK_INT < i;
    }

    /* renamed from: b */
    public static boolean m11045b(int i) {
        return Build.VERSION.SDK_INT > i;
    }

    /* renamed from: c */
    public static boolean m11046c(int i) {
        return Build.VERSION.SDK_INT >= i;
    }
}
