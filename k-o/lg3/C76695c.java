package lg3;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import f40.C86718e;
import lc3.C10485b;
import oa1.C117731d;
import p573jk.C76417a;

/* renamed from: lg3.c */
public class C76695c {

    /* renamed from: a */
    public static final C76417a.C76418a f224393a = new C76696a();

    /* renamed from: b */
    public static boolean f224394b;

    /* renamed from: c */
    public static boolean f224395c;

    /* renamed from: d */
    public static boolean f224396d;

    /* renamed from: e */
    public static boolean f224397e;

    /* renamed from: f */
    public static Boolean f224398f;

    /* renamed from: lg3.c$a */
    public class C76696a implements C76417a.C76418a {
    }

    /* renamed from: a */
    public static MultiProcessMMKV m92340a() {
        Log.m105919d("MicroMsg.MMCareModeManager", "getKV, uin:%s", Integer.valueOf(C86718e.m107549h()));
        return MultiProcessMMKV.getMMKV("care_mode" + "_" + C86718e.m107549h());
    }

    /* renamed from: b */
    public static boolean m92341b() {
        if (!MMApplicationContext.isMainProcess()) {
            Log.m105928w("MicroMsg.MMCareModeManager", "not main process!!");
            return false;
        } else if (!C86709a0.m107522a()) {
            Log.m105928w("MicroMsg.MMCareModeManager", "accout not ready");
            return false;
        } else {
            if (!f224395c) {
                f224394b = Util.nullAsFalse(Boolean.valueOf(C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_SETTING_CARE_MODE_STATE_BOOLEAN_SYNC, false)));
                f224395c = true;
            }
            return f224394b;
        }
    }

    /* renamed from: c */
    public static boolean m92342c() {
        if (f224398f == null) {
            try {
                if (Util.getInt(C117731d.m166007c().mo182444f("clicfg_care_mode_switch", "1", false, true), 1) > 0) {
                    Log.m105924i("MicroMsg.MMCareModeManager", "openCareModeEntrance!!");
                    f224398f = new Boolean(true);
                } else {
                    f224398f = new Boolean(false);
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.MMCareModeManager", e, "closeCareModeEntrance", new Object[0]);
                f224398f = new Boolean(false);
            }
        }
        if (!f224398f.booleanValue()) {
            return true;
        }
        String c = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("DisableCareModeEntry");
        if (Util.isNullOrNil(c)) {
            Log.m105924i("MicroMsg.MMCareModeManager", "isHideCareModeEntrance, ShowCareMode is null");
            return false;
        }
        int parseInt = Integer.parseInt(c);
        Log.m105925i("MicroMsg.MMCareModeManager", "isHideCareModeEntrance, val is %s", Integer.valueOf(parseInt));
        return c != null && parseInt > 0;
    }

    /* renamed from: d */
    public static boolean m92343d() {
        if (!MMApplicationContext.isMainProcess()) {
            Log.m105928w("MicroMsg.MMCareModeManager", "not main process!!");
            return false;
        } else if (!C86709a0.m107522a()) {
            Log.m105928w("MicroMsg.MMCareModeManager", "accout not ready");
            return false;
        } else {
            if (!f224397e) {
                f224396d = Util.nullAsFalse(Boolean.valueOf(C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_SETTING_CARE_MODE_LISTEN_BOOLEAN, false)));
                f224397e = true;
            }
            return f224396d;
        }
    }

    /* renamed from: e */
    public static void m92344e(boolean z) {
        m92340a().edit().putBoolean("care_mode_change", z).commit();
        Log.m105925i("MicroMsg.MMCareModeManager", "setCareModeChange:%s", Boolean.valueOf(z));
    }

    /* renamed from: f */
    public static void m92345f(int i) {
        m92340a().edit().putInt("care_mode_font_size", i).commit();
        Log.m105925i("MicroMsg.MMCareModeManager", "setCareModeFontSize:%s", Integer.valueOf(i));
    }

    /* renamed from: g */
    public static void m92346g(boolean z) {
        boolean nullAsFalse = Util.nullAsFalse(Boolean.valueOf(C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_SETTING_CARE_MODE_STATE_BOOLEAN_SYNC, false)));
        if (z && nullAsFalse != f224394b) {
            m92344e(true);
            Log.m105925i("MicroMsg.MMCareModeManager", "care mode state change, before:%s, now:%s", Boolean.valueOf(f224394b), Boolean.valueOf(nullAsFalse));
        }
        f224394b = nullAsFalse;
    }

    /* renamed from: h */
    public static void m92347h() {
        f224396d = Util.nullAsFalse(Boolean.valueOf(C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_SETTING_CARE_MODE_LISTEN_BOOLEAN, false)));
        f224397e = false;
    }
}
