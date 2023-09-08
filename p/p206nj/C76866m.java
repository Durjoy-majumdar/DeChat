package p206nj;

import android.os.Build;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: nj.m */
public class C76866m {
    /* renamed from: a */
    public static boolean m92672a() {
        return Util.nullAs(Build.MANUFACTURER, "").toLowerCase().contains("honor".toLowerCase());
    }

    /* renamed from: b */
    public static boolean m92673b() {
        return Util.nullAs(Build.MANUFACTURER, "").toLowerCase().contains("huawei".toLowerCase());
    }

    /* renamed from: c */
    public static boolean m92674c() {
        return Util.nullAs(Build.MANUFACTURER, "").toLowerCase().contains("oppo".toLowerCase());
    }

    /* renamed from: d */
    public static boolean m92675d() {
        return Util.nullAs(Build.MANUFACTURER, "").toLowerCase().contains("realme".toLowerCase());
    }

    /* renamed from: e */
    public static boolean m92676e() {
        return Util.nullAs(Build.MANUFACTURER, "").toLowerCase().contains("samsung".toLowerCase());
    }

    /* renamed from: f */
    public static boolean m92677f() {
        return Util.nullAs(Build.MANUFACTURER, "").toLowerCase().contains("vivo".toLowerCase());
    }
}
