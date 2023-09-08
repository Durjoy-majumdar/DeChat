package bs3;

import com.tencent.p014mm.plugin.multitalk.model.C105845w;
import com.tencent.p014mm.sdk.platformtools.Log;
import ds3.C107065e;
import nw3.C109782f;

/* renamed from: bs3.b */
public final class C104161b {

    /* renamed from: a */
    public static int f308394a = 2;

    /* renamed from: b */
    public static boolean f308395b;

    /* renamed from: a */
    public static String m138992a(String str, Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(250);
        for (Throwable th : objArr) {
            if (th != null) {
                stringBuffer.append("|");
                if (th instanceof Throwable) {
                    stringBuffer.append(th.getMessage());
                } else {
                    stringBuffer.append(th.toString());
                }
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: b */
    public static void m138993b(String str, Object... objArr) {
        if (f308395b && f308394a <= 1 && str != null && objArr != null) {
            String a = m138992a(str, objArr);
            m138996e(1, str, " " + a);
        }
    }

    /* renamed from: c */
    public static void m138994c(String str, Object... objArr) {
        if (f308395b && f308394a <= 4 && str != null && objArr != null) {
            String a = m138992a(str, objArr);
            m138996e(4, str, " " + a);
        }
    }

    /* renamed from: d */
    public static void m138995d(String str, Object... objArr) {
        if (f308395b && f308394a <= 2 && str != null && objArr != null) {
            String a = m138992a(str, objArr);
            m138996e(2, str, " " + a);
        }
    }

    /* renamed from: e */
    public static void m138996e(int i, String str, String str2) {
        C107065e eVar = C109782f.f328551V0;
        if (eVar != null) {
            String str3 = "MTSDK" + str;
            C105845w.this.getClass();
            if (i == 0) {
                Log.m105926v(str3, str2);
            } else if (i == 1) {
                Log.m105918d(str3, str2);
            } else if (i == 2) {
                Log.m105924i(str3, str2);
            } else if (i == 3) {
                Log.m105928w(str3, str2);
            } else if (i == 4) {
                Log.m105920e(str3, str2);
            } else if (i != 5) {
                Log.m105926v(str3, str2);
            } else {
                Log.m105922f(str3, str2);
            }
        }
    }

    /* renamed from: f */
    public static void m138997f(String str, Object... objArr) {
        if (f308395b && f308394a <= 3 && str != null && objArr != null) {
            String a = m138992a(str, objArr);
            m138996e(3, str, " " + a);
        }
    }
}
