package wo2;

import android.content.Context;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import wo2.C102466d;

/* renamed from: wo2.e */
public class C102469e implements Runnable {
    public C102469e(C102466d.C102468b bVar) {
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$TimeStaticBuilder$1");
        try {
            Context context = MMApplicationContext.getContext();
            if (NetStatusUtil.isWifi(context)) {
                C102466d.m135251a(1676, 9);
                Log.m105924i("AdLandingPageStaticHelper", "network wifi");
            } else if (NetStatusUtil.is5G(context)) {
                C102466d.m135251a(1676, 10);
                Log.m105924i("AdLandingPageStaticHelper", "network 5G");
            } else if (NetStatusUtil.is4G(context)) {
                C102466d.m135251a(1676, 11);
                Log.m105924i("AdLandingPageStaticHelper", "network 4G");
            } else {
                C102466d.m135251a(1676, 12);
                Log.m105924i("AdLandingPageStaticHelper", "network other");
            }
        } catch (Throwable th) {
            Log.m105920e("AdLandingPageStaticHelper", "reportEnterNetWorkType, exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$TimeStaticBuilder$1");
    }
}
