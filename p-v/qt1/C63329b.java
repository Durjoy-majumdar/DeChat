package qt1;

import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.file.XVFSFile;
import gy3.C87412m;
import z04.C112550d0;
import z04.C112551y;

/* renamed from: qt1.b */
public final class C63329b {

    /* renamed from: a */
    public static final C63329b f179694a = new C63329b();

    /* renamed from: b */
    public static boolean f179695b = false;

    static {
        boolean z = BuildInfo.DEBUG;
    }

    /* renamed from: a */
    public final String mo88230a() {
        String str = "";
        if (!f179695b) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nstack=>");
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        if (stackTrace.length >= 4) {
            StringBuilder sb4 = new StringBuilder();
            int length = stackTrace.length;
            for (int i = 3; i < length; i++) {
                String className = stackTrace[i].getClassName();
                C87412m.m108593f(className, "stes[i].className");
                if (C112550d0.m153801u(className, "com.tencent.", false)) {
                    String className2 = stackTrace[i].getClassName();
                    C87412m.m108593f(className2, "stes[i].className");
                    if (C112550d0.m153801u(className2, "sdk.platformtools.Log", false)) {
                        continue;
                    } else {
                        sb4.append("[");
                        String className3 = stackTrace[i].getClassName();
                        C87412m.m108593f(className3, "stes[i].className");
                        sb4.append(C112551y.m153814n(className3, "com.tencent.mm", str, false));
                        sb4.append(XVFSFile.PATH_SEPARATOR);
                        sb4.append(stackTrace[i].getMethodName());
                        sb4.append('(' + stackTrace[i].getLineNumber() + ")]");
                        if (i >= 6) {
                            break;
                        }
                    }
                }
            }
            str = sb4.toString();
            C87412m.m108593f(str, "t.toString()");
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: b */
    public final void mo88231b(String str, String str2, int i) {
        if (i == 0) {
            Log.m105926v(str, str2);
        } else if (i == 1) {
            Log.m105918d(str, str2);
        } else if (i == 2) {
            Log.m105924i(str, str2);
        } else if (i == 3) {
            Log.m105928w(str, str2);
        } else if (i != 4) {
            Log.m105926v(str, str2);
        } else {
            Log.m105920e(str, str2);
        }
    }

    /* renamed from: c */
    public final void mo88232c(String str, String str2, int i) {
        String str3;
        if (!f179695b) {
            mo88231b(str, str2, i);
        } else if (str2.length() < 4000) {
            mo88231b(str, str2, i);
        } else {
            int i2 = 0;
            int i3 = 0;
            while (i2 < str2.length()) {
                int i4 = i2 + 4000;
                if (str2.length() <= i4) {
                    str3 = str2.substring(i2);
                    C87412m.m108593f(str3, "this as java.lang.String).substring(startIndex)");
                } else {
                    str3 = str2.substring(i2, i4);
                    C87412m.m108593f(str3, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                mo88231b(str, "=>id:" + i3 + ' ' + str3, i);
                i3++;
                i2 = i4;
            }
        }
    }

    /* renamed from: d */
    public final void mo88233d(String str, String str2) {
        C87412m.m108594g(str, "tag");
        C87412m.m108594g(str2, "msg");
        mo88232c("Finder.LiveTracker", str + XVFSFile.PATH_SEPARATOR_CHAR + str2 + ' ' + mo88230a(), 2);
    }
}
