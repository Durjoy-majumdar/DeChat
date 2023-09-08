package wo2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;

/* renamed from: wo2.b */
public class C102464b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f301719d;

    public C102464b(boolean z) {
        this.f301719d = z;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$CacheHitStaticHelper$2");
        try {
            int i = C102466d.f301721a;
            SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
            SnsMethodCalculate.markStartTimeMs("isWifi", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
            boolean isWifi = NetStatusUtil.isWifi(MMApplicationContext.getContext());
            SnsMethodCalculate.markEndTimeMs("isWifi", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
            SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
            if (isWifi) {
                if (this.f301719d) {
                    C102466d.m135251a(1676, 5);
                } else {
                    C102466d.m135251a(1676, 6);
                }
            } else if (this.f301719d) {
                C102466d.m135251a(1676, 7);
            } else {
                C102466d.m135251a(1676, 8);
            }
        } catch (Throwable th) {
            Log.m105920e("AdLandingPageStaticHelper.CacheHitStaticHelper", "reportSightCacheHit exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$CacheHitStaticHelper$2");
    }
}
