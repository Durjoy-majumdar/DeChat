package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.f2 */
public class C95089f2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C95050a2 f275988d;

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.f2$a */
    public class C95090a implements Runnable {
        public C95090a() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent$8$1");
            C95050a2 a2Var = C95089f2.this.f275988d;
            SnsMethodCalculate.markStartTimeMs("access$2000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
            boolean z = a2Var.f275858I;
            SnsMethodCalculate.markEndTimeMs("access$2000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
            if (z) {
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent$8$1");
                return;
            }
            C95050a2.m120817Q(C95089f2.this.f275988d, false);
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent$8$1");
        }
    }

    public C95089f2(C95050a2 a2Var) {
        this.f275988d = a2Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent$8");
        C95050a2 a2Var = this.f275988d;
        SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        a2Var.mo131552g0();
        SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        C95050a2 a2Var2 = this.f275988d;
        SnsMethodCalculate.markStartTimeMs("access$1802", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        a2Var2.f275860K = false;
        SnsMethodCalculate.markEndTimeMs("access$1802", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        C95050a2 a2Var3 = this.f275988d;
        SnsMethodCalculate.markStartTimeMs("access$1902", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        a2Var3.getClass();
        SnsMethodCalculate.markEndTimeMs("access$1902", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        C95050a2 a2Var4 = this.f275988d;
        SnsMethodCalculate.markStartTimeMs("access$1102", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        a2Var4.f275865Q = 3;
        SnsMethodCalculate.markEndTimeMs("access$1102", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        this.f275988d.mo130234M();
        C95050a2.m120817Q(this.f275988d, true);
        MMHandlerThread.postToMainThreadDelayed(new C95090a(), 10000);
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent$8");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
