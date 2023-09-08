package d91;

import com.tencent.p014mm.pointers.PBool;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import h81.C32735h;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import pa1.C35418c;

/* renamed from: d91.a */
public final class C20449a {

    /* renamed from: a */
    public static PBool f57467a;

    /* renamed from: b */
    public static PBool f57468b;

    /* renamed from: c */
    public static PBool f57469c;

    /* renamed from: d */
    public static PBool f57470d;

    /* renamed from: e */
    public static PBool f57471e;

    /* renamed from: f */
    public static PBool f57472f;

    /* renamed from: g */
    public static PInt f57473g;

    /* renamed from: h */
    public static ConcurrentHashMap<Long, PBool> f57474h = new ConcurrentHashMap<>();

    /* renamed from: i */
    public static String f57475i = null;

    /* renamed from: j */
    public static final List<String> f57476j = new ArrayList();

    /* renamed from: k */
    public static boolean f57477k = false;

    /* renamed from: l */
    public static boolean f57478l = false;

    /* renamed from: m */
    public static int f57479m = 0;

    /* renamed from: n */
    public static String f57480n = "";

    /* renamed from: o */
    public static String f57481o = "";

    /* renamed from: p */
    public static boolean f57482p = false;

    /* renamed from: a */
    public static boolean m22049a() {
        if (f57472f == null) {
            boolean z = false;
            String c = C35418c.m40699b().mo60251c(C32735h.C32737c.clicfg_hellhound_usingasyncevent, "1", false);
            PBool pBool = new PBool();
            f57472f = pBool;
            if (Util.getInt(c, 0) > 0) {
                z = true;
            }
            pBool.value = z;
        }
        if (!f57472f.value) {
            Log.m105924i("HABBYGE-MALI.HellhoundConfig", "HellhoundConfig, fetchAsyncEventSwitch: [false]");
        }
        return f57472f.value;
    }

    /* renamed from: b */
    public static boolean m22050b() {
        if (f57471e == null) {
            boolean z = false;
            String c = C35418c.m40699b().mo60251c(C32735h.C32737c.clicfg_hellhound_finder_switch, "1", false);
            PBool pBool = new PBool();
            f57471e = pBool;
            if (Util.getInt(c, 0) > 0) {
                z = true;
            }
            pBool.value = z;
        }
        if (!f57471e.value) {
            Log.m105924i("HABBYGE-MALI.HellhoundConfig", "HellhoundConfig, fetchFinderSwitch: [false]");
        }
        return f57471e.value;
    }

    /* renamed from: c */
    public static boolean m22051c() {
        if (f57468b == null) {
            boolean z = false;
            String c = C35418c.m40699b().mo60251c(C32735h.C32737c.clicfg_hellhound_frontback_switch, "1", false);
            PBool pBool = new PBool();
            f57468b = pBool;
            if (Util.getInt(c, 0) > 0) {
                z = true;
            }
            pBool.value = z;
        }
        if (!f57468b.value) {
            Log.m105924i("HABBYGE-MALI.HellhoundConfig", "HellhoundConfig, frontbackSwitch: [false]");
        }
        return f57468b.value;
    }

    /* renamed from: d */
    public static boolean m22052d() {
        if (f57467a == null) {
            boolean z = false;
            String c = C35418c.m40699b().mo60251c(C32735h.C32737c.clicfg_hellhound_switch, "1", false);
            PBool pBool = new PBool();
            f57467a = pBool;
            if (Util.getInt(c, 0) > 0) {
                z = true;
            }
            pBool.value = z;
        }
        if (!f57467a.value) {
            Log.m105924i("HABBYGE-MALI.HellhoundConfig", "HellhoundConfig, hellhoundSwitch: [false]");
        }
        return f57467a.value;
    }

    /* renamed from: e */
    public static boolean m22053e() {
        if (f57469c == null) {
            boolean z = false;
            String c = C35418c.m40699b().mo60251c(C32735h.C32737c.clicfg_hellhound_frontback_switch, "1", false);
            PBool pBool = new PBool();
            f57469c = pBool;
            if (Util.getInt(c, 0) > 0) {
                z = true;
            }
            pBool.value = z;
        }
        if (!f57469c.value) {
            Log.m105924i("HABBYGE-MALI.HellhoundConfig", "HellhoundConfig, sessionSwitch: [false]");
        }
        return f57469c.value;
    }

    /* renamed from: f */
    public static void m22054f(String str) {
        Log.m105924i("HABBYGE-MALI.HellhoundConfig", "FinderLiveCommentScene set " + str);
        if (str == null) {
            str = "";
        }
        f57480n = str;
    }
}
