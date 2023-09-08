package com.tencent.p014mm.plugin.appbrand.task;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.appbrand.task.b */
public final class C1971b {

    /* renamed from: a */
    public static boolean f11883a = true;

    static {
        long currentTicks = Util.currentTicks();
        int decodeInt = MultiProcessMMKV.getMMKV("appbrand_process_force_preload").decodeInt("appbrand_process_force_preload", 0);
        if (decodeInt == 1) {
            Log.m105925i("MicroMsg.AppBrandForcePreloadConfig", "[ForcePreload] storage config = [%d] == 1, accepted (mmkv cost [%d]ms)", Integer.valueOf(decodeInt), Long.valueOf(Util.ticksToNow(currentTicks)));
            return;
        }
        Log.m105925i("MicroMsg.AppBrandForcePreloadConfig", "[ForcePreload] storage config = [%d] != 1, buildConfig = [%b] reject (mmkv cost [%d]ms)", Integer.valueOf(decodeInt), Boolean.FALSE, Long.valueOf(Util.ticksToNow(currentTicks)));
    }

    /* renamed from: a */
    public static final void m1955a() {
        Log.m105924i("MicroMsg.AppBrandForcePreloadConfig", "[ForcePreload] disableForcePreload");
        f11883a = false;
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("appbrand_process_force_preload");
        mmkv.encode("appbrand_process_force_preload", -1);
        mmkv.apply();
    }

    /* renamed from: b */
    public static final void m1956b() {
        Log.m105924i("MicroMsg.AppBrandForcePreloadConfig", "[ForcePreload] enableForcePreload");
        f11883a = true;
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("appbrand_process_force_preload");
        mmkv.encode("appbrand_process_force_preload", 1);
        mmkv.apply();
    }

    /* renamed from: c */
    public static final boolean m1957c() {
        Log.m105925i("MicroMsg.AppBrandForcePreloadConfig", "[ForcePreload] forcePreload = [%b]", Boolean.valueOf(f11883a));
        return f11883a;
    }
}
