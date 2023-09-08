package to2;

import com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.view.AdLandingGeneralVideoView;
import com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.view.AdLandingGeneralVideoWrapper;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: to2.a */
public class C101910a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AdLandingGeneralVideoWrapper f300074d;

    public C101910a(AdLandingGeneralVideoWrapper adLandingGeneralVideoWrapper) {
        this.f300074d = adLandingGeneralVideoWrapper;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper$2");
        AdLandingGeneralVideoView adLandingGeneralVideoView = this.f300074d.f274031d;
        if (adLandingGeneralVideoView != null) {
            adLandingGeneralVideoView.pause();
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper$2");
    }
}
