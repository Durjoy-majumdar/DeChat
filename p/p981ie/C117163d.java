package p981ie;

import android.content.Context;

/* renamed from: ie.d */
public class C117163d {
    /* renamed from: a */
    public static Boolean m165224a(Context context, int i) {
        if (C117159b.m165218s(context)) {
            return null;
        }
        long e = C117159b.m165204e(context);
        if (e == -1) {
            return null;
        }
        return Boolean.valueOf(e > ((long) i));
    }

    /* renamed from: b */
    public static Boolean m165225b(Context context) {
        if (C117159b.m165218s(context)) {
            return null;
        }
        long e = C117159b.m165204e(context);
        if (e == -1) {
            return null;
        }
        return Boolean.valueOf(e > 0);
    }
}
