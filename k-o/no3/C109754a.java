package no3;

import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: no3.a */
public class C109754a {
    /* renamed from: a */
    public static long m149075a(int i, int i2) {
        return ((long) i2) | (((long) i) << 32);
    }

    /* renamed from: b */
    public static <T extends CharSequence> T m149076b(T t) {
        if (TextUtils.isEmpty(t)) {
            return t;
        }
        int i = 100000;
        if (t.length() <= 100000) {
            return t;
        }
        if (Character.isHighSurrogate(t.charAt(99999)) && Character.isLowSurrogate(t.charAt(100000))) {
            i = 99999;
        }
        return t.subSequence(0, i);
    }

    /* renamed from: c */
    public static int m149077c(long j) {
        return (int) (j & Util.MAX_32BIT_VALUE);
    }
}
