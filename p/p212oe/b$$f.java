package p212oe;

import com.tencent.p014mm.plugin.lite.LiteAppCenter;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import java.util.HashMap;
import java.util.Map;
import kj2.C117407d;
import oa1.C117731d;

/* renamed from: oe.b$$f */
public final class b$$f {

    /* renamed from: a */
    public static final Map<String, Boolean> f352149a = new HashMap();

    /* renamed from: a */
    public static boolean m166056a() {
        return m166057b() || C117750b.m166048f();
    }

    /* renamed from: b */
    public static boolean m166057b() {
        return WeChatEnvironment.hasDebugger() || WeChatEnvironment.isCoolassistEnv();
    }

    /* renamed from: c */
    public static boolean m166058c() {
        return m166059d(LiteAppCenter.FRAMEWORK_TYPE_BASE, 50000);
    }

    /* renamed from: d */
    public static boolean m166059d(String str, int i) {
        Map<String, Boolean> map = f352149a;
        if (((HashMap) map).containsKey(str)) {
            return Boolean.TRUE.equals(((HashMap) map).get(str));
        }
        C117731d c = C117731d.m166007c();
        boolean z = false;
        int max = Math.max(Util.safeParseInt(c.mo182444f("clicfg_battery_dice_" + str.toLowerCase(), String.valueOf(i), false, true)), 10);
        double random = Math.random();
        if (max >= 1 && random < 1.0d / ((double) max)) {
            Log.m105924i("Matrix.battery.BatteryCanaryConfigs", "dice hit, go kv stat!");
            z = true;
        }
        C117407d.INSTANCE.idkeyStat(1540, z ? 0 : 1, 1, false);
        ((HashMap) map).put(str, Boolean.valueOf(z));
        return z;
    }

    /* renamed from: e */
    public static boolean m166060e() {
        if (!(m166056a() || m166061f() || m166059d("powerStat", 50))) {
            return false;
        }
        if (m166057b() || !m166061f()) {
            return m166056a() || m166059d("powerCompare", 50);
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m166061f() {
        return C117750b.m166050h() && m166059d("powerTest", 10);
    }
}
