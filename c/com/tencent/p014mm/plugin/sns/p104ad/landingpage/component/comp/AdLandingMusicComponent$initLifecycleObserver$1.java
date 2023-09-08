package com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp;

import androidx.lifecycle.C0124r;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C97621e;
import kotlin.Metadata;
import nb0.C88912b;
import nb0.C88913c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, mo182094d2 = {"com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingMusicComponent$initLifecycleObserver$1", "Landroidx/lifecycle/r;", "Lrx3/b0;", "onDestroy", "onPause", "onResume", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initLifecycleObserver$1 */
public final class AdLandingMusicComponent$initLifecycleObserver$1 implements C0124r {

    /* renamed from: d */
    public final /* synthetic */ C39623j f273758d;

    /* renamed from: e */
    public final /* synthetic */ AdLandingMusicComponent f273759e;

    public AdLandingMusicComponent$initLifecycleObserver$1(C39623j jVar, AdLandingMusicComponent adLandingMusicComponent) {
        this.f273758d = jVar;
        this.f273759e = adLandingMusicComponent;
    }

    @C112974b0(C39623j.C39625b.ON_DESTROY)
    public final void onDestroy() {
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initLifecycleObserver$1");
        Log.m105924i("MicroMsg.Sns.AdLandingMusicComponent", "onDestroy activity");
        this.f273758d.removeObserver(this);
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initLifecycleObserver$1");
    }

    @C112974b0(C39623j.C39625b.ON_PAUSE)
    public final void onPause() {
        SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initLifecycleObserver$1");
        Log.m105924i("MicroMsg.Sns.AdLandingMusicComponent", "onPause activity");
        if (AdLandingMusicComponent.m119664H(this.f273759e).length() == 0) {
            SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initLifecycleObserver$1");
            return;
        }
        C88913c.m111007e(AdLandingMusicComponent.m119664H(this.f273759e));
        this.f273759e.mo130166N().mo142083a();
        C97621e E = AdLandingMusicComponent.m119662E(this.f273759e);
        if (E != null) {
            E.mo136889a();
        }
        SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initLifecycleObserver$1");
    }

    @C112974b0(C39623j.C39625b.ON_RESUME)
    public final void onResume() {
        SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initLifecycleObserver$1");
        Log.m105924i("MicroMsg.Sns.AdLandingMusicComponent", "onResume activity");
        if (AdLandingMusicComponent.m119664H(this.f273759e).length() == 0) {
            SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initLifecycleObserver$1");
            return;
        }
        if (this.f273759e.mo130171U()) {
            C88913c.m111008f(AdLandingMusicComponent.m119664H(this.f273759e), (C88912b) null);
            this.f273759e.mo130166N().mo142084b();
            C97621e E = AdLandingMusicComponent.m119662E(this.f273759e);
            if (E != null) {
                AdLandingMusicComponent adLandingMusicComponent = this.f273759e;
                adLandingMusicComponent.getClass();
                SnsMethodCalculate.markStartTimeMs("getAudioRespond", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
                C97621e.C97622a aVar = adLandingMusicComponent.f273741K;
                SnsMethodCalculate.markEndTimeMs("getAudioRespond", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
                E.mo136891c(aVar);
            }
            AdLandingMusicComponent adLandingMusicComponent2 = this.f273759e;
            SnsMethodCalculate.markStartTimeMs("access$getPlayCount$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
            int i = adLandingMusicComponent2.f273745P;
            SnsMethodCalculate.markEndTimeMs("access$getPlayCount$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
            SnsMethodCalculate.markStartTimeMs("access$setPlayCount$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
            adLandingMusicComponent2.f273745P = i + 1;
            SnsMethodCalculate.markEndTimeMs("access$setPlayCount$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        }
        SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initLifecycleObserver$1");
    }
}
