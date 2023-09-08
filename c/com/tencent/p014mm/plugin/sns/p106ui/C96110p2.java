package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.autogen.events.VideoBackgroundRemuxResultEventEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.SnsVideoPublishLogStruct;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.C95005x;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import hf3.C98449c;
import if3.C98670a;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.sns.ui.p2 */
public final class C96110p2 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ VideoBackgroundRemuxResultEventEvent f280714d;

    /* renamed from: e */
    public final /* synthetic */ SightWidgetBackgroundVideoHandler f280715e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C96110p2(VideoBackgroundRemuxResultEventEvent videoBackgroundRemuxResultEventEvent, SightWidgetBackgroundVideoHandler sightWidgetBackgroundVideoHandler) {
        super(0);
        this.f280714d = videoBackgroundRemuxResultEventEvent;
        this.f280715e = sightWidgetBackgroundVideoHandler;
    }

    public Object invoke() {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler$remuxEventListener$1$callback$1");
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler$remuxEventListener$1$callback$1");
        VideoBackgroundRemuxResultEventEvent.C92609a aVar = this.f280714d.f265253d;
        int i = aVar.f265254a;
        String str = aVar.f265255b;
        Log.m105924i("MicroMsg.SightWidgetBackgroundVideoHandler", "remux event return >> code: " + i + ", workTagId: " + str);
        if (i == 4007) {
            Log.m105924i("MicroMsg.SightWidgetBackgroundVideoHandler", "background remux done, " + str);
            C87412m.m108593f(str, "workTagId");
            ((C98449c) C86312j.m106911c(C98449c.class)).mo136674PD(str, new C96097o2(str, this.f280715e));
        } else {
            Log.m105920e("MicroMsg.SightWidgetBackgroundVideoHandler", "background remux is error, " + i + ", " + str);
            SightWidgetBackgroundVideoHandler sightWidgetBackgroundVideoHandler = this.f280715e;
            SnsMethodCalculate.markStartTimeMs("access$getSightWidgetCallback$p", "com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler");
            C96168q2 q2Var = sightWidgetBackgroundVideoHandler.f277481b;
            SnsMethodCalculate.markEndTimeMs("access$getSightWidgetCallback$p", "com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler");
            if (q2Var != null) {
                C87412m.m108593f(str, "workTagId");
                q2Var.mo132267a(3, (C98670a) null, str);
            }
        }
        C95005x xVar = C95005x.f275632a;
        long j = (long) this.f280714d.f265253d.f265256c;
        SnsMethodCalculate.markStartTimeMs("updateVideoMuxTime", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
        SnsVideoPublishLogStruct snsVideoPublishLogStruct = C95005x.f275634c;
        long j2 = snsVideoPublishLogStruct.f266244k;
        snsVideoPublishLogStruct.f266244k = j;
        Log.m105924i("MicroMsg.SnsVideoPublishReporter", "updateVideoMuxTime >> sessionId: " + C95005x.f275634c.f266237d + ", time: " + j + ", lastMuxTime: " + j2 + ", currentMuxTime: " + C95005x.f275634c.f266244k);
        SnsMethodCalculate.markEndTimeMs("updateVideoMuxTime", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler$remuxEventListener$1$callback$1");
        C13598b0 b0Var = C13598b0.f38549a;
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler$remuxEventListener$1$callback$1");
        return b0Var;
    }
}
