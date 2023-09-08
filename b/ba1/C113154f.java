package ba1;

import com.tencent.p014mm.sdk.platformtools.Log;
import e91.C116711b;
import f91.C116850b;

/* renamed from: ba1.f */
public final class C113154f {
    /* renamed from: a */
    public static String m154823a() {
        int i = C116711b.m164584i();
        if (i == 0) {
            return "-1";
        }
        String c = C116850b.m164833c("mmkv_key_hellsess_dtail_RptChe_" + i);
        if (c == null || c.isEmpty()) {
            return null;
        }
        return c;
    }

    /* renamed from: b */
    public static String m154824b() {
        int i = C116711b.m164584i();
        if (i == 0) {
            return "-1";
        }
        String c = C116850b.m164833c("mmkv_key_hellsess_merge_RptChe_" + i);
        if (c == null || c.isEmpty()) {
            return null;
        }
        return c;
    }

    /* renamed from: c */
    public static String m154825c() {
        int i = C116711b.m164584i();
        if (i == 0) {
            return "-1";
        }
        String c = C116850b.m164833c("mmkv_key_hellSenubARptChe_" + i);
        if (c == null || c.isEmpty()) {
            return null;
        }
        return c;
    }

    /* renamed from: d */
    public static void m154826d(String str) {
        int i = C116711b.m164584i();
        if (i != 0) {
            if (str == null) {
                str = "";
            }
            try {
                C116850b.m164835e("mmkv_key_hellsess_dtail_RptChe_" + i, str);
            } catch (Exception e) {
                Log.printErrStackTrace("HABBYGE-MALI.HellSessionReportCache", e, "HellSessionReportCache.writeBackOfFlow", new Object[0]);
            }
        }
    }

    /* renamed from: e */
    public static void m154827e(String str) {
        int i = C116711b.m164584i();
        if (i != 0) {
            if (str == null) {
                str = "";
            }
            try {
                C116850b.m164835e("mmkv_key_hellsess_merge_RptChe_" + i, str);
            } catch (Exception e) {
                Log.printErrStackTrace("HABBYGE-MALI.HellSessionReportCache", e, "HellSessionReportCache.writeBackOfFlow", new Object[0]);
            }
        }
    }

    /* renamed from: f */
    public static void m154828f(String str) {
        int i = C116711b.m164584i();
        if (i != 0) {
            if (str == null) {
                str = "";
            }
            try {
                C116850b.m164835e("mmkv_key_hellSenubARptChe_" + i, str);
            } catch (Exception e) {
                Log.printErrStackTrace("HABBYGE-MALI.HellSessionReportCache", e, "writeBackOfSessionUBA.writeBackOfFlow", new Object[0]);
            }
        }
    }

    /* renamed from: g */
    public static void m154829g(String str) {
        String str2;
        if (str != null && !str.isEmpty()) {
            String a = m154823a();
            if (a == null || a.isEmpty()) {
                m154826d(System.currentTimeMillis() + "@" + str);
            } else if ("-1".equals(a)) {
                Log.m105920e("HABBYGE-MALI.HellSessionReportCache", "storeSessionDetail not login");
            } else {
                if (a.split("@").length <= 1) {
                    str2 = a + "@" + str;
                } else {
                    str2 = a + "|" + str;
                }
                m154826d(str2);
            }
        }
    }

    /* renamed from: h */
    public static void m154830h(String str) {
        String str2;
        if (str != null && !str.isEmpty()) {
            String b = m154824b();
            if (b == null || b.isEmpty()) {
                m154827e(System.currentTimeMillis() + "@" + str);
            } else if ("-1".equals(b)) {
                Log.m105920e("HABBYGE-MALI.HellSessionReportCache", "storeSessionDetail not login");
            } else {
                if (b.split("@").length <= 1) {
                    str2 = b + "@" + str;
                } else {
                    str2 = b + "|" + str;
                }
                m154827e(str2);
            }
        }
    }

    /* renamed from: i */
    public static void m154831i(String str) {
        String str2;
        if (str != null && !str.isEmpty()) {
            String c = m154825c();
            if (c == null || c.isEmpty()) {
                m154828f(System.currentTimeMillis() + "@" + str);
            } else if ("-1".equals(c)) {
                Log.m105920e("HABBYGE-MALI.HellSessionReportCache", "storeFlow not login");
            } else {
                if (c.split("@").length <= 1) {
                    str2 = c + "@" + str;
                } else {
                    str2 = c + "|" + str;
                }
                m154828f(str2);
            }
        }
    }
}
