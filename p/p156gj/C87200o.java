package p156gj;

import android.os.Build;

/* renamed from: gj.o */
public class C87200o {

    /* renamed from: a */
    public static String f252868a;

    /* renamed from: b */
    public static final String f252869b = Build.BRAND;

    /* renamed from: c */
    public static final String f252870c = (C87203t.m108275k() + Build.CPU_ABI);

    /* renamed from: d */
    public static final String f252871d;

    /* renamed from: e */
    public static String f252872e;

    /* renamed from: f */
    public static String f252873f;

    /* renamed from: g */
    public static final String f252874g;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append("android-");
        int i = Build.VERSION.SDK_INT;
        sb.append(i);
        f252868a = sb.toString();
        StringBuilder sb4 = new StringBuilder();
        String str = Build.MANUFACTURER;
        sb4.append(str);
        sb4.append("-");
        sb4.append(C87203t.m108275k());
        f252871d = sb4.toString();
        f252872e = "android-" + i;
        f252873f = "" + i;
        f252874g = "android-" + str;
    }
}
