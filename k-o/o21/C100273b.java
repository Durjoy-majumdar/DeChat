package o21;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import f40.C86709a0;
import p823sg.C90193h;
import te3.C101834rc0;

/* renamed from: o21.b */
public class C100273b {
    /* renamed from: a */
    public static String m131073a(String str, int i) {
        return C90193h.m112878f((str + i + System.currentTimeMillis()).getBytes());
    }

    /* renamed from: b */
    public static C86009m1 m131074b(String str) {
        C86009m1 m1Var = new C86009m1(String.format("%s%s/%d/", new Object[]{C86709a0.m107535s().f251806d, "chatroom_notice/", Integer.valueOf(str.hashCode() & 255)}));
        if (!m1Var.mo119967g() || !m1Var.mo119977o()) {
            m1Var.mo119987x();
        }
        return m1Var;
    }

    /* renamed from: c */
    public static String m131075c(C101834rc0 rc02) {
        if (rc02 == null) {
            return "";
        }
        String str = rc02.f299280T;
        if (Util.isNullOrNil(str) || !C86709a0.m107522a()) {
            return "";
        }
        C86009m1 b = m131074b(str);
        boolean z = false;
        if (rc02.f299258I == 8 && !Util.isNullOrNil(rc02.f299297d)) {
            str = rc02.f299297d;
            b = m131074b(rc02.f299280T);
            z = true;
        }
        String str2 = rc02.f299262K;
        if (str2 != null && str2.trim().length() > 0 && !z) {
            str = str + "." + rc02.f299262K;
        }
        C86009m1 m1Var = new C86009m1(b, str);
        if (m1Var.mo119967g() || Util.isNullOrNil(rc02.f299266M)) {
            return m1Var.mo119971i();
        }
        String f = C90193h.m112878f((rc02.f299266M + rc02.f299280T).getBytes());
        if (Util.isNullOrNil(f)) {
            return m1Var.mo119971i();
        }
        String str3 = rc02.f299262K;
        if (str3 != null && str3.trim().length() > 0) {
            f = f + "." + rc02.f299262K;
        }
        C86009m1 m1Var2 = new C86009m1(b, f);
        if (m1Var2.mo119967g()) {
            return m1Var2.mo119971i();
        }
        String str4 = rc02.f299280T;
        String str5 = rc02.f299262K;
        if (str5 != null && str5.trim().length() > 0) {
            str4 = str4 + "." + rc02.f299262K;
        }
        Log.m105918d("MicroMsg.EditorLogic", "use dataId.fmt, " + str4);
        return new C86009m1(b, str4).mo119971i();
    }

    /* renamed from: d */
    public static String m131076d(float f) {
        if (f < 1024.0f) {
            return String.format("%.1fB", new Object[]{Float.valueOf(f)});
        } else if (f < 1048576.0f) {
            return String.format("%.1fKB", new Object[]{Float.valueOf(f / 1024.0f)});
        } else if (f < 1.07374182E9f) {
            return String.format("%.1fMB", new Object[]{Float.valueOf((f / 1024.0f) / 1024.0f)});
        } else {
            return String.format("%.1fGB", new Object[]{Float.valueOf(((f / 1024.0f) / 1024.0f) / 1024.0f)});
        }
    }

    /* renamed from: e */
    public static String m131077e(C101834rc0 rc02) {
        if (rc02 == null || Util.isNullOrNil(rc02.f299280T)) {
            return "";
        }
        String str = rc02.f299280T + "_t";
        return new C86009m1(m131074b(str), str).mo119971i();
    }
}
