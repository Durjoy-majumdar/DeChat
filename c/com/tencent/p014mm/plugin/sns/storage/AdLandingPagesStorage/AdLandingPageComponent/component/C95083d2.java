package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.d2 */
public class C95083d2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C95050a2 f275977d;

    public C95083d2(C95050a2 a2Var) {
        this.f275977d = a2Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent$6");
        Log.m105925i("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent", "play btn onclick isPlaying[%b]", Boolean.valueOf(this.f275977d.mo130233K()));
        C95050a2 a2Var = this.f275977d;
        SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        Runnable runnable = a2Var.f275857H;
        SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        a2Var.mo131544V(runnable);
        SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        if (this.f275977d.mo130233K()) {
            C95050a2 a2Var2 = this.f275977d;
            SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
            a2Var2.mo131548b0(true);
            SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
            C95050a2 a2Var3 = this.f275977d;
            SnsMethodCalculate.markStartTimeMs("access$1102", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
            a2Var3.f275865Q = 4;
            SnsMethodCalculate.markEndTimeMs("access$1102", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        } else {
            C95050a2 a2Var4 = this.f275977d;
            SnsMethodCalculate.markStartTimeMs("access$1200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
            boolean z = a2Var4.f275859J;
            SnsMethodCalculate.markEndTimeMs("access$1200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
            if (z) {
                this.f275977d.mo130232G();
            } else {
                this.f275977d.mo140727E();
                this.f275977d.mo130234M();
            }
            C95050a2 a2Var5 = this.f275977d;
            SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
            a2Var5.mo131552g0();
            SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
            C95050a2 a2Var6 = this.f275977d;
            SnsMethodCalculate.markStartTimeMs("access$1102", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
            a2Var6.f275865Q = 3;
            SnsMethodCalculate.markEndTimeMs("access$1102", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        }
        C95050a2 a2Var7 = this.f275977d;
        SnsMethodCalculate.markStartTimeMs("access$1400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        boolean z2 = a2Var7.f296492v;
        SnsMethodCalculate.markEndTimeMs("access$1400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        if (z2) {
            C95050a2 a2Var8 = this.f275977d;
            SnsMethodCalculate.markStartTimeMs("access$1508", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
            a2Var8.f275875V++;
            SnsMethodCalculate.markEndTimeMs("access$1508", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        }
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent$6");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
