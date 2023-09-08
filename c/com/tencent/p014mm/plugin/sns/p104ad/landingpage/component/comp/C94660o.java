package com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.o */
public class C94660o implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C94651l f273926d;

    public C94660o(C94651l lVar) {
        this.f273926d = lVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingGeneralVideoComponent$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent$6");
        Log.m105925i("MicroMsg.Sns.AdLandingGeneralVideoComponent", "play btn onclick isPlaying[%b]", Boolean.valueOf(this.f273926d.mo130233K()));
        C94651l lVar = this.f273926d;
        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        Runnable runnable = lVar.f273913y0;
        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        lVar.mo130239V(runnable);
        SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        if (this.f273926d.mo130233K()) {
            this.f273926d.mo130241X();
            C94651l lVar2 = this.f273926d;
            SnsMethodCalculate.markStartTimeMs("access$502", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
            lVar2.f273912y = 4;
            SnsMethodCalculate.markEndTimeMs("access$502", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        } else {
            C94651l lVar3 = this.f273926d;
            SnsMethodCalculate.markStartTimeMs("access$602", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
            lVar3.f273896N = true;
            SnsMethodCalculate.markEndTimeMs("access$602", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
            C94651l lVar4 = this.f273926d;
            SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
            lVar4.mo130245d0(true);
            SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
            C94651l lVar5 = this.f273926d;
            SnsMethodCalculate.markStartTimeMs("access$502", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
            lVar5.f273912y = 3;
            SnsMethodCalculate.markEndTimeMs("access$502", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        }
        C94651l lVar6 = this.f273926d;
        SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        boolean z = lVar6.f296492v;
        SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        if (z) {
            C94651l lVar7 = this.f273926d;
            SnsMethodCalculate.markStartTimeMs("access$908", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
            lVar7.f273898Q++;
            SnsMethodCalculate.markEndTimeMs("access$908", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        }
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent$6");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingGeneralVideoComponent$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
