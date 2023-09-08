package p757xv;

import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import oa1.C117731d;

/* renamed from: xv.w */
public class C38853w {
    /* renamed from: a */
    public static boolean m41953a() {
        int e = C117731d.m166007c().mo182443e("clicfg_deep_background_process_reclaim", 0, true, true);
        Log.m105924i("MicroMsg.ProcessReclaimSwitch", "isAppDeepBackgroundEnabled:" + e);
        return BuildInfo.IS_FLAVOR_RED || BuildInfo.DEBUG || e == 0;
    }

    /* renamed from: b */
    public static boolean m41954b() {
        int e = C117731d.m166007c().mo182443e("clicfg_exdevice_auto_release", 1, true, true);
        Log.m105924i("MicroMsg.ProcessReclaimSwitch", "isExDeviceProcessReclaimDisabled:" + e);
        return !BuildInfo.IS_FLAVOR_RED && !BuildInfo.DEBUG && e == 0;
    }
}
