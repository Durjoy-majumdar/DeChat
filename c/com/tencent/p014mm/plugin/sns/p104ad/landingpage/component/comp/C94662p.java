package com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.p */
public class C94662p implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C94651l f273929d;

    public C94662p(C94651l lVar) {
        this.f273929d = lVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingGeneralVideoComponent$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent$7");
        if (!C94651l.m119777Q(this.f273929d).f296580G) {
            C94651l lVar = this.f273929d;
            SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
            Runnable runnable = lVar.f273913y0;
            SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
            SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
            lVar.mo130239V(runnable);
            SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        }
        C94651l lVar2 = this.f273929d;
        SnsMethodCalculate.markStartTimeMs("access$1108", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        lVar2.f273900R++;
        SnsMethodCalculate.markEndTimeMs("access$1108", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        C94651l lVar3 = this.f273929d;
        SnsMethodCalculate.markStartTimeMs("access$1200", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        boolean z = lVar3.f273893K;
        SnsMethodCalculate.markEndTimeMs("access$1200", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        if (z) {
            this.f273929d.mo140727E();
            this.f273929d.mo130234M();
        } else {
            this.f273929d.mo130232G();
        }
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent$7");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingGeneralVideoComponent$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
