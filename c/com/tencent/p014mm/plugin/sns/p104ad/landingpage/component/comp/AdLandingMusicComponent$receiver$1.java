package com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import d14.C58100z0;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingMusicComponent$receiver$1", "Landroid/content/BroadcastReceiver;", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$receiver$1 */
public final class AdLandingMusicComponent$receiver$1 extends BroadcastReceiver {

    /* renamed from: a */
    public final /* synthetic */ AdLandingMusicComponent f273760a;

    public AdLandingMusicComponent$receiver$1(AdLandingMusicComponent adLandingMusicComponent) {
        this.f273760a = adLandingMusicComponent;
    }

    public void onReceive(Context context, Intent intent) {
        SnsMethodCalculate.markStartTimeMs("onReceive", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$receiver$1");
        C87412m.m108594g(context, "context");
        C87412m.m108594g(intent, "intent");
        if (C87412m.m108589b(intent.getStringExtra("identity"), AdLandingMusicComponent.m119664H(this.f273760a))) {
            SnsMethodCalculate.markEndTimeMs("onReceive", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$receiver$1");
            return;
        }
        try {
            if (C87412m.m108589b("com.tencent.mm.adlanding.close_exposure_voice", intent.getAction())) {
                ((C58100z0) this.f273760a.mo130169Q()).mo82832d(2);
            }
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("onReceive", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$receiver$1");
    }
}
