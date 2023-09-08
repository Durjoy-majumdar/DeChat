package com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import d14.C58100z0;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.g0 */
public final class C94643g0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ AdLandingMusicComponent f273859d;

    public C94643g0(AdLandingMusicComponent adLandingMusicComponent) {
        this.f273859d = adLandingMusicComponent;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingMusicComponent$initPlayer$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initPlayer$1");
        if (this.f273859d.mo130165M().getState() == 0) {
            ((C58100z0) this.f273859d.mo130169Q()).mo82832d(1);
        } else {
            ((C58100z0) this.f273859d.mo130169Q()).mo82832d(2);
        }
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initPlayer$1");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingMusicComponent$initPlayer$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
