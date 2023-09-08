package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import xn2.C102693c;

/* renamed from: com.tencent.mm.plugin.sns.ui.l2 */
public class C96005l2 implements C102693c {

    /* renamed from: d */
    public final /* synthetic */ SightVideoFullScreenView f280332d;

    public C96005l2(SightVideoFullScreenView sightVideoFullScreenView) {
        this.f280332d = sightVideoFullScreenView;
    }

    /* renamed from: a */
    public void mo4335a(int i) {
        SnsMethodCalculate.markStartTimeMs("onSeekTo", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$7");
        try {
            Log.m105924i("SightVideoFullScreenView", "onSeek time " + i);
            SightVideoFullScreenView sightVideoFullScreenView = this.f280332d;
            int i2 = SightVideoFullScreenView.f277411x0;
            SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
            boolean z = sightVideoFullScreenView.f277418G;
            SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
            if (z) {
                this.f280332d.mo132456l();
            } else {
                this.f280332d.mo132480x();
            }
            SightVideoFullScreenView.m121754b(this.f280332d).mo132301s(i * 1000, true);
            SightVideoFullScreenView.m121756d(this.f280332d, true);
            SightVideoFullScreenView sightVideoFullScreenView2 = this.f280332d;
            SnsMethodCalculate.markStartTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
            Runnable runnable = sightVideoFullScreenView2.f277444p0;
            SnsMethodCalculate.markEndTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
            MMHandlerThread.removeRunnable(runnable);
            View e = SightVideoFullScreenView.m121757e(this.f280332d);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(e, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SightVideoFullScreenView$7", "onSeekTo", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            e.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(e, "com/tencent/mm/plugin/sns/ui/SightVideoFullScreenView$7", "onSeekTo", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } catch (Throwable th) {
            Log.m105920e("SightVideoFullScreenView", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("onSeekTo", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$7");
    }

    /* renamed from: c */
    public void mo4336c(int i) {
        SnsMethodCalculate.markStartTimeMs("onSeeking", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$7");
        SnsMethodCalculate.markEndTimeMs("onSeeking", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$7");
    }

    public void onSeekPre() {
        SnsMethodCalculate.markStartTimeMs("onSeekPre", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$7");
        try {
            if (SightVideoFullScreenView.m121754b(this.f280332d) != null) {
                SightVideoFullScreenView.m121754b(this.f280332d).mo132300r();
            }
            SightVideoFullScreenView.m121758f(this.f280332d, true);
        } catch (Throwable th) {
            Log.m105920e("SightVideoFullScreenView", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("onSeekPre", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$7");
    }
}
