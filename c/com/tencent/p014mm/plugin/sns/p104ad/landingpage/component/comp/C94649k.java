package com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.k */
public class C94649k implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C94651l f273878d;

    public C94649k(C94651l lVar) {
        this.f273878d = lVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingGeneralVideoComponent$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent$10");
        C94651l lVar = this.f273878d;
        SnsMethodCalculate.markStartTimeMs("access$602", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        lVar.f273896N = true;
        SnsMethodCalculate.markEndTimeMs("access$602", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        C94651l lVar2 = this.f273878d;
        SnsMethodCalculate.markStartTimeMs("access$502", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        lVar2.f273912y = 3;
        SnsMethodCalculate.markEndTimeMs("access$502", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        C94651l lVar3 = this.f273878d;
        SnsMethodCalculate.markStartTimeMs("access$1908", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        lVar3.f273904V++;
        SnsMethodCalculate.markEndTimeMs("access$1908", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        this.f273878d.f273885C.setVisibility(8);
        C94651l lVar4 = this.f273878d;
        SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        lVar4.mo130245d0(true);
        SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent$10");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingGeneralVideoComponent$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
