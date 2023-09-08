package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import xn2.C102693c;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.t1 */
public class C95216t1 implements C102693c {

    /* renamed from: d */
    public final /* synthetic */ C95222u1 f276298d;

    public C95216t1(C95222u1 u1Var) {
        this.f276298d = u1Var;
    }

    /* renamed from: a */
    public void mo4335a(int i) {
        SnsMethodCalculate.markStartTimeMs("onSeekTo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$11");
        try {
            Log.m105924i("MicroMsg.Sns.AdLandingPageSightVideoComponent.VideoOptimize", "onSeek time " + i);
            C95222u1 u1Var = this.f276298d;
            if (u1Var.f276333P) {
                u1Var.mo130232G();
            } else {
                u1Var.mo130234M();
            }
            C95222u1.m121194Y(this.f276298d).mo132301s(i * 1000, true);
            C95222u1 u1Var2 = this.f276298d;
            SnsMethodCalculate.markStartTimeMs("access$2402", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            u1Var2.f276334Q = 3;
            SnsMethodCalculate.markEndTimeMs("access$2402", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            C95222u1.m121193X(this.f276298d, true);
            C95222u1 u1Var3 = this.f276298d;
            SnsMethodCalculate.markStartTimeMs("access$2900", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            MMHandler mMHandler = u1Var3.f276320B;
            SnsMethodCalculate.markEndTimeMs("access$2900", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            C95222u1 u1Var4 = this.f276298d;
            SnsMethodCalculate.markStartTimeMs("access$2800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            Runnable runnable = u1Var4.f276341T0;
            SnsMethodCalculate.markEndTimeMs("access$2800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            mMHandler.removeCallbacks(runnable);
            View R = C95222u1.m121189R(this.f276298d);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(R, aVar.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent$11", "onSeekTo", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            R.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(R, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent$11", "onSeekTo", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.Sns.AdLandingPageSightVideoComponent.VideoOptimize", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("onSeekTo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$11");
    }

    /* renamed from: c */
    public void mo4336c(int i) {
        SnsMethodCalculate.markStartTimeMs("onSeeking", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$11");
        SnsMethodCalculate.markEndTimeMs("onSeeking", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$11");
    }

    public void onSeekPre() {
        SnsMethodCalculate.markStartTimeMs("onSeekPre", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$11");
        try {
            C95222u1 u1Var = this.f276298d;
            SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            Runnable runnable = u1Var.f276339S0;
            SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            C95222u1.m121197d0(u1Var, runnable);
            if (C95222u1.m121194Y(this.f276298d) != null) {
                C95222u1.m121194Y(this.f276298d).mo132300r();
            }
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.Sns.AdLandingPageSightVideoComponent.VideoOptimize", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("onSeekPre", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$11");
    }
}
