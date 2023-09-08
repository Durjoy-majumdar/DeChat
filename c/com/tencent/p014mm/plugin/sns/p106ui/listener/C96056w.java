package com.tencent.p014mm.plugin.sns.p106ui.listener;

import com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import kt2.C99209b;
import lt2.C99594b;

/* renamed from: com.tencent.mm.plugin.sns.ui.listener.w */
public class C96056w implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f280467d;

    /* renamed from: e */
    public final /* synthetic */ TimelineClickListener.C960093 f280468e;

    /* renamed from: com.tencent.mm.plugin.sns.ui.listener.w$a */
    public class C96057a implements C99594b.C99595a {
        public C96057a() {
        }

        public void onAnimationEnd() {
            SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$3$2$1");
            Log.m105924i("MicroMsg.TimelineClickListener", "detail click animation end");
            TimelineClickListener timelineClickListener = TimelineClickListener.this;
            SnsMethodCalculate.markStartTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
            timelineClickListener.f280376f = null;
            SnsMethodCalculate.markEndTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
            SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$3$2$1");
        }

        public void onAnimationStart() {
            SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$3$2$1");
            SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$3$2$1");
        }
    }

    public C96056w(TimelineClickListener.C960093 r1, long j) {
        this.f280468e = r1;
        this.f280467d = j;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$3$2");
        TimelineClickListener timelineClickListener = TimelineClickListener.this;
        SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        C99209b bVar = timelineClickListener.f280376f;
        SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        bVar.mo138561a(this.f280467d);
        TimelineClickListener timelineClickListener2 = TimelineClickListener.this;
        SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        C99209b bVar2 = timelineClickListener2.f280376f;
        SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        C96057a aVar = new C96057a();
        bVar2.getClass();
        SnsMethodCalculate.markStartTimeMs("setAnimationListener", "com.tencent.mm.plugin.sns.ui.animation.detail.BaseDetailItemClickAnimation");
        bVar2.f290919b = aVar;
        SnsMethodCalculate.markEndTimeMs("setAnimationListener", "com.tencent.mm.plugin.sns.ui.animation.detail.BaseDetailItemClickAnimation");
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$3$2");
    }
}
