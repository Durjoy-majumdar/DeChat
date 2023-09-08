package ps2;

import bo2.C92277a;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import h81.C32735h;
import p749xh.C102646h;

/* renamed from: ps2.y */
public class C100902y implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f295481d;

    public C100902y(String str) {
        this.f295481d = str;
    }

    public void run() {
        boolean z;
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper$5");
        if (C100894u.m132239s(this.f295481d)) {
            C92277a aVar = null;
            SnsMethodCalculate.markStartTimeMs("isJsApiPreload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
            try {
                int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_ad_landing_page_forbid_jsapi_preload, 1);
                Log.m105924i("AdLandingPageResPreloader", "adVideoPreload, isJsApiPreload, cfg=" + Qe);
                z = Qe == 1;
                SnsMethodCalculate.markEndTimeMs("isJsApiPreload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
            } catch (Throwable th) {
                Log.m105920e("AdLandingPageResPreloader", "isJsApiPreload, exp=" + th.toString());
                SnsMethodCalculate.markEndTimeMs("isJsApiPreload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
                z = false;
            }
            if (!z) {
                Log.m105924i("AdLandingPagesPreDownloadResHelper", "preDownloadAdLandingPagesForJsapiPreload，forbid preload video");
                aVar = new C92277a();
                aVar.f264109c = true;
                aVar.f264110d = 0;
            } else {
                Log.m105924i("AdLandingPagesPreDownloadResHelper", "preDownloadAdLandingPagesForJsapiPreload");
            }
            C100884n.m132183e().mo140357l(this.f295481d, C102646h.COL_ADXML, aVar, 8);
        } else {
            Log.m105928w("AdLandingPagesPreDownloadResHelper", "preDownloadAdLandingPagesForJsapiPreload, inValidCanvas");
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper$5");
    }
}
