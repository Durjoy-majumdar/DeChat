package com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.i */
public class C94645i implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C94646j f273861d;

    public C94645i(C94646j jVar) {
        this.f273861d = jVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingFloatJumpComp$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp$1");
        try {
            Log.m105918d("SnsAd.FloatJumpComp", "the root is clicked!");
            C94646j jVar = this.f273861d;
            SnsMethodCalculate.markStartTimeMs("access$008", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
            jVar.f273862A++;
            SnsMethodCalculate.markEndTimeMs("access$008", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
            C94646j jVar2 = this.f273861d;
            SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
            jVar2.mo130227G(false);
            SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp$1");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingFloatJumpComp$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
