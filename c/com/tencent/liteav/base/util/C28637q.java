package com.tencent.liteav.base.util;

import android.text.TextUtils;
import j20.C117292a;
import k20.C9556a;

/* renamed from: com.tencent.liteav.base.util.q */
public final class C28637q {

    /* renamed from: a */
    private static final Object f78569a = new Object();

    /* renamed from: b */
    private static boolean f78570b = false;

    /* renamed from: c */
    private static String f78571c = "";
    private byte _hellAccFlag_;

    /* renamed from: a */
    public static boolean m38304a() {
        boolean z;
        boolean z2;
        synchronized (f78569a) {
            if (!f78570b) {
                "load library txsoundtouch ".concat(String.valueOf(m38306b("txsoundtouch")));
                "load library txffmpeg ".concat(String.valueOf(m38306b("txffmpeg")));
                boolean b = m38306b("livesdk");
                "load library livesdk ".concat(String.valueOf(b));
                boolean b2 = m38306b("liteavsdk");
                "load library liteavsdk ".concat(String.valueOf(b2));
                if (!b) {
                    if (!b2) {
                        z2 = false;
                        f78570b = z2;
                    }
                }
                z2 = true;
                f78570b = z2;
            }
            z = f78570b;
        }
        return z;
    }

    /* renamed from: b */
    private static boolean m38306b(String str) {
        try {
            C9556a aVar = new C9556a();
            aVar.mo10233c(str);
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/liteav/base/util/q", "b", "(Ljava/lang/String;)Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            System.loadLibrary((String) aVar.mo10231a(0));
            C117292a.m165359e(obj, "com/tencent/liteav/base/util/q", "b", "(Ljava/lang/String;)Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            return true;
        } catch (Error e) {
            e.toString();
            return m38305a(f78571c, str);
        } catch (Exception e2) {
            e2.toString();
            return m38305a(f78571c, str);
        }
    }

    /* renamed from: a */
    private static boolean m38305a(String str, String str2) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            System.load(str + "/lib" + str2 + ".so");
            return true;
        } catch (Error e) {
            e.toString();
            return false;
        } catch (Exception e2) {
            e2.toString();
            return false;
        }
    }

    /* renamed from: a */
    public static void m38303a(String str) {
        "setLibraryPath ".concat(String.valueOf(str));
        f78571c = str;
    }
}
