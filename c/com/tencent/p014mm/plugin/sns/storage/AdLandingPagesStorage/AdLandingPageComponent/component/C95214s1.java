package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.s1 */
public class C95214s1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C95222u1 f276295d;

    public C95214s1(C95222u1 u1Var) {
        this.f276295d = u1Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$10");
        try {
            Log.m105925i("MicroMsg.Sns.AdLandingPageSightVideoComponent.VideoOptimize", "play btn onclick isPlaying[%b]", Boolean.valueOf(this.f276295d.mo130233K()));
            C95222u1 u1Var = this.f276295d;
            SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            Runnable runnable = u1Var.f276339S0;
            SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            C95222u1.m121197d0(u1Var, runnable);
            if (this.f276295d.mo130233K()) {
                C95222u1 u1Var2 = this.f276295d;
                SnsMethodCalculate.markStartTimeMs("access$2300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
                u1Var2.mo131731k0(true);
                SnsMethodCalculate.markEndTimeMs("access$2300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
                C95222u1 u1Var3 = this.f276295d;
                SnsMethodCalculate.markStartTimeMs("access$2402", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
                u1Var3.f276334Q = 4;
                SnsMethodCalculate.markEndTimeMs("access$2402", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            } else {
                C95222u1 u1Var4 = this.f276295d;
                if (u1Var4.f276333P) {
                    u1Var4.mo130232G();
                } else {
                    u1Var4.mo140727E();
                    this.f276295d.mo130234M();
                }
                C95222u1 u1Var5 = this.f276295d;
                SnsMethodCalculate.markStartTimeMs("access$2500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
                u1Var5.mo131745p0();
                SnsMethodCalculate.markEndTimeMs("access$2500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
                C95222u1 u1Var6 = this.f276295d;
                SnsMethodCalculate.markStartTimeMs("access$2402", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
                u1Var6.f276334Q = 3;
                SnsMethodCalculate.markEndTimeMs("access$2402", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            }
            C95222u1 u1Var7 = this.f276295d;
            SnsMethodCalculate.markStartTimeMs("access$2600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            boolean z = u1Var7.f296492v;
            SnsMethodCalculate.markEndTimeMs("access$2600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            if (z) {
                C95222u1 u1Var8 = this.f276295d;
                SnsMethodCalculate.markStartTimeMs("access$2708", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
                u1Var8.f276349X0++;
                SnsMethodCalculate.markEndTimeMs("access$2708", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            }
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.Sns.AdLandingPageSightVideoComponent.VideoOptimize", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$10");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
