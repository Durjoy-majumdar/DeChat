package com.tencent.p014mm.plugin.sns.p106ui.listener;

import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI;
import com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import ft2.C97979c;
import lt2.C99593a;
import lt2.C99594b;
import lt2.C99619h;

/* renamed from: com.tencent.mm.plugin.sns.ui.listener.g0 */
public class C96028g0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f280434d;

    /* renamed from: e */
    public final /* synthetic */ TimelineClickListener.C960104 f280435e;

    /* renamed from: com.tencent.mm.plugin.sns.ui.listener.g0$a */
    public class C96029a implements C99594b.C99595a {
        public C96029a() {
        }

        public void onAnimationEnd() {
            SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$4$1$1");
            Log.m105924i("MicroMsg.TimelineClickListener", "timeline back animation end");
            boolean z = TimelineClickListener.m122987i(TimelineClickListener.this) instanceof C99619h;
            TimelineClickListener timelineClickListener = TimelineClickListener.this;
            SnsMethodCalculate.markStartTimeMs("access$502", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
            timelineClickListener.f280375e = null;
            SnsMethodCalculate.markEndTimeMs("access$502", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
            if (TimelineClickListener.m122988j(TimelineClickListener.this) instanceof SnsTimeLineUI) {
                if (z) {
                    SnsTimeLineUI snsTimeLineUI = (SnsTimeLineUI) TimelineClickListener.m122988j(TimelineClickListener.this);
                    snsTimeLineUI.getClass();
                    SnsMethodCalculate.markStartTimeMs("setPlayAnimationWithoutNotify", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
                    if (snsTimeLineUI.f278699y != null) {
                        Log.m105925i("MicroMsg.SnsTimeLineUI", "set play animation %s without notify", Boolean.FALSE);
                        C97979c cVar = snsTimeLineUI.f278699y;
                        cVar.getClass();
                        SnsMethodCalculate.markStartTimeMs("setPlayAnimationWithoutNotify", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
                        cVar.f287351g = false;
                        SnsMethodCalculate.markEndTimeMs("setPlayAnimationWithoutNotify", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
                    }
                    SnsMethodCalculate.markEndTimeMs("setPlayAnimationWithoutNotify", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
                } else {
                    ((SnsTimeLineUI) TimelineClickListener.m122988j(TimelineClickListener.this)).mo132947E8(false);
                }
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$4$1$1");
        }

        public void onAnimationStart() {
            SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$4$1$1");
            SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$4$1$1");
        }
    }

    public C96028g0(TimelineClickListener.C960104 r1, long j) {
        this.f280435e = r1;
        this.f280434d = j;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$4$1");
        if (TimelineClickListener.m122988j(TimelineClickListener.this) instanceof SnsTimeLineUI) {
            ((SnsTimeLineUI) TimelineClickListener.m122988j(TimelineClickListener.this)).mo132947E8(true);
        }
        TimelineClickListener.m122987i(TimelineClickListener.this).mo138969a(this.f280434d);
        C99593a i = TimelineClickListener.m122987i(TimelineClickListener.this);
        C96029a aVar = new C96029a();
        i.getClass();
        SnsMethodCalculate.markStartTimeMs("setAnimationListener", "com.tencent.mm.plugin.sns.ui.animation.timeline.BaseTimelineBackAnimation");
        i.f291959b = aVar;
        SnsMethodCalculate.markEndTimeMs("setAnimationListener", "com.tencent.mm.plugin.sns.ui.animation.timeline.BaseTimelineBackAnimation");
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$4$1");
    }
}
