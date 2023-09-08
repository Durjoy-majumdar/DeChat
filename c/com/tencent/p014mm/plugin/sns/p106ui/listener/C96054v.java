package com.tencent.p014mm.plugin.sns.p106ui.listener;

import com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import lt2.C99594b;

/* renamed from: com.tencent.mm.plugin.sns.ui.listener.v */
public class C96054v implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f280464d;

    /* renamed from: e */
    public final /* synthetic */ TimelineClickListener.C960093 f280465e;

    /* renamed from: com.tencent.mm.plugin.sns.ui.listener.v$a */
    public class C96055a implements C99594b.C99595a {
        public C96055a() {
        }

        public void onAnimationEnd() {
            SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$3$1$1");
            Log.m105924i("MicroMsg.TimelineClickListener", "timeline click animation end");
            TimelineClickListener timelineClickListener = TimelineClickListener.this;
            SnsMethodCalculate.markStartTimeMs("access$302", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
            timelineClickListener.f280374d = null;
            SnsMethodCalculate.markEndTimeMs("access$302", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
            SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$3$1$1");
        }

        public void onAnimationStart() {
            SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$3$1$1");
            SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$3$1$1");
        }
    }

    public C96054v(TimelineClickListener.C960093 r1, long j) {
        this.f280465e = r1;
        this.f280464d = j;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$3$1");
        TimelineClickListener timelineClickListener = TimelineClickListener.this;
        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        C99594b bVar = timelineClickListener.f280374d;
        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        bVar.mo138970a(this.f280464d);
        TimelineClickListener timelineClickListener2 = TimelineClickListener.this;
        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        C99594b bVar2 = timelineClickListener2.f280374d;
        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        C96055a aVar = new C96055a();
        bVar2.getClass();
        SnsMethodCalculate.markStartTimeMs("setAnimationListener", "com.tencent.mm.plugin.sns.ui.animation.timeline.BaseTimelineClickAnimation");
        bVar2.f291961b = aVar;
        SnsMethodCalculate.markEndTimeMs("setAnimationListener", "com.tencent.mm.plugin.sns.ui.animation.timeline.BaseTimelineClickAnimation");
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$3$1");
    }
}
