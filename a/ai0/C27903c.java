package ai0;

import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82260t;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import di3.C86312j;
import h81.C32735h;
import java.util.HashSet;
import java.util.Set;

/* renamed from: ai0.c */
public class C27903c {

    /* renamed from: a */
    public static Set<Integer> f77075a;

    static {
        HashSet hashSet = new HashSet();
        f77075a = hashSet;
        hashSet.add(1001);
        f77075a.add(Integer.valueOf(C82260t.CTRL_INDEX));
        f77075a.add(1104);
        f77075a.add(1103);
    }

    /* renamed from: a */
    public static boolean m38028a() {
        int decodeInt = MultiProcessMMKV.getMMKV("appbrandAd").decodeInt("showad", -1);
        if (decodeInt >= 0) {
            Log.m105925i("MicroMsg.AppBrandAdABTests[AppBrandSplashAd]", "canShowAppBrandAd, command value:%s", Integer.valueOf(decodeInt));
            return decodeInt == 1;
        }
        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_appbrand_ad, 0);
        Log.m105925i("MicroMsg.AppBrandAdABTests[AppBrandSplashAd]", "canShowAppBrandAd, experiment value:%s", Integer.valueOf(Qe));
        return Qe == 1;
    }

    /* renamed from: b */
    public static int m38029b() {
        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_appbrand_ad_check_block_time, 0);
        Log.m105925i("MicroMsg.AppBrandAdABTests[AppBrandSplashAd]", "getCheckBlockTimeThreshold, timeThreshold:%d", Integer.valueOf(Qe));
        return Qe;
    }
}
