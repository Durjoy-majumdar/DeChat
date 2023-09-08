package com.tencent.p014mm.plugin.sns.p106ui.listener;

import com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import kt2.C99208a;
import lt2.C99594b;

/* renamed from: com.tencent.mm.plugin.sns.ui.listener.h0 */
public class C96031h0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f280438d;

    /* renamed from: e */
    public final /* synthetic */ TimelineClickListener.C960104 f280439e;

    /* renamed from: com.tencent.mm.plugin.sns.ui.listener.h0$a */
    public class C96032a implements C99594b.C99595a {
        public C96032a() {
        }

        public void onAnimationEnd() {
            SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$4$2$1");
            Log.m105924i("MicroMsg.TimelineClickListener", "detail back animation end");
            TimelineClickListener timelineClickListener = TimelineClickListener.this;
            SnsMethodCalculate.markStartTimeMs("access$702", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
            timelineClickListener.f280377g = null;
            SnsMethodCalculate.markEndTimeMs("access$702", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
            SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$4$2$1");
        }

        public void onAnimationStart() {
            SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$4$2$1");
            SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$4$2$1");
        }
    }

    public C96031h0(TimelineClickListener.C960104 r1, long j) {
        this.f280439e = r1;
        this.f280438d = j;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$4$2");
        TimelineClickListener timelineClickListener = TimelineClickListener.this;
        SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        C99208a aVar = timelineClickListener.f280377g;
        SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        aVar.mo138560a(this.f280438d);
        TimelineClickListener timelineClickListener2 = TimelineClickListener.this;
        SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        C99208a aVar2 = timelineClickListener2.f280377g;
        SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        C96032a aVar3 = new C96032a();
        aVar2.getClass();
        SnsMethodCalculate.markStartTimeMs("setAnimationListener", "com.tencent.mm.plugin.sns.ui.animation.detail.BaseDetailItemBackAnimation");
        aVar2.f290917b = aVar3;
        SnsMethodCalculate.markEndTimeMs("setAnimationListener", "com.tencent.mm.plugin.sns.ui.animation.detail.BaseDetailItemBackAnimation");
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$4$2");
    }
}
