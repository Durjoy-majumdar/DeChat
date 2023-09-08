package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import xn2.C102693c;

/* renamed from: com.tencent.mm.plugin.sns.ui.i1 */
public class C95809i1 implements C102693c {

    /* renamed from: d */
    public final /* synthetic */ LongVideoFullScreenView f279565d;

    public C95809i1(LongVideoFullScreenView longVideoFullScreenView) {
        this.f279565d = longVideoFullScreenView;
    }

    /* renamed from: a */
    public void mo4335a(int i) {
        int i2 = i;
        SnsMethodCalculate.markStartTimeMs("onSeekTo", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView$4");
        try {
            Log.m105924i("LongVideoFullScreenView", "onSeek time " + i2);
            LongVideoFullScreenView longVideoFullScreenView = this.f279565d;
            int i3 = LongVideoFullScreenView.f276908R0;
            SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
            int i4 = longVideoFullScreenView.f276950x;
            SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
            if (i2 >= i4) {
                LongVideoFullScreenView longVideoFullScreenView2 = this.f279565d;
                SnsMethodCalculate.markStartTimeMs("access$2108", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                longVideoFullScreenView2.f276926R++;
                SnsMethodCalculate.markEndTimeMs("access$2108", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                Log.m105924i("LongVideoFullScreenView", "onLoopCompletion, onSeekTo time is 0");
                i2 = 0;
            }
            LongVideoFullScreenView longVideoFullScreenView3 = this.f279565d;
            SnsMethodCalculate.markStartTimeMs("access$2202", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
            longVideoFullScreenView3.f276914F = i2;
            SnsMethodCalculate.markEndTimeMs("access$2202", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
            LongVideoFullScreenView longVideoFullScreenView4 = this.f279565d;
            SnsMethodCalculate.markStartTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
            boolean z = longVideoFullScreenView4.f276952y;
            SnsMethodCalculate.markEndTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
            if (z) {
                this.f279565d.mo132197i();
            } else {
                this.f279565d.mo132221t();
            }
            LongVideoFullScreenView.m121524d(this.f279565d).mo79613a((double) i2, true);
            LongVideoFullScreenView longVideoFullScreenView5 = this.f279565d;
            SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
            Runnable runnable = longVideoFullScreenView5.f276925Q0;
            SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
            MMHandlerThread.removeRunnable(runnable);
            LongVideoFullScreenView longVideoFullScreenView6 = this.f279565d;
            SnsMethodCalculate.markStartTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
            View view = longVideoFullScreenView6.f276943q;
            SnsMethodCalculate.markEndTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/LongVideoFullScreenView$4", "onSeekTo", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/LongVideoFullScreenView$4", "onSeekTo", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } catch (Throwable th) {
            Log.m105920e("LongVideoFullScreenView", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("onSeekTo", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView$4");
    }

    /* renamed from: c */
    public void mo4336c(int i) {
        SnsMethodCalculate.markStartTimeMs("onSeeking", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView$4");
        SnsMethodCalculate.markEndTimeMs("onSeeking", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView$4");
    }

    public void onSeekPre() {
        SnsMethodCalculate.markStartTimeMs("onSeekPre", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView$4");
        try {
            LongVideoFullScreenView.m121522a(this.f279565d, true);
        } catch (Throwable th) {
            Log.m105920e("LongVideoFullScreenView", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("onSeekPre", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView$4");
    }
}
