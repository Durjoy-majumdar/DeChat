package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.e2 */
public class C95086e2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C95050a2 f275981d;

    public C95086e2(C95050a2 a2Var) {
        this.f275981d = a2Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent$7");
        C95050a2 a2Var = this.f275981d;
        SnsMethodCalculate.markStartTimeMs("access$1608", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        a2Var.f275877W++;
        SnsMethodCalculate.markEndTimeMs("access$1608", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        C95050a2 a2Var2 = this.f275981d;
        SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        Runnable runnable = a2Var2.f275857H;
        SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        a2Var2.mo131544V(runnable);
        SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        C95050a2 a2Var3 = this.f275981d;
        SnsMethodCalculate.markStartTimeMs("access$1200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        boolean z = a2Var3.f275859J;
        SnsMethodCalculate.markEndTimeMs("access$1200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        if (z) {
            this.f275981d.mo140727E();
            this.f275981d.mo130234M();
        } else {
            this.f275981d.mo130232G();
        }
        C95050a2 a2Var4 = this.f275981d;
        SnsMethodCalculate.markStartTimeMs("access$1702", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        a2Var4.getClass();
        SnsMethodCalculate.markEndTimeMs("access$1702", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent$7");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
