package com.tencent.p014mm.plugin.sns.statistics;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import p823sg.C90193h;

/* renamed from: com.tencent.mm.plugin.sns.statistics.o */
public final class C43043o extends C87413o implements C32224a<Object> {

    /* renamed from: d */
    public final /* synthetic */ String f116516d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43043o(String str) {
        super(0);
        this.f116516d = str;
    }

    public final Object invoke() {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion$setMediaSourceSight$1");
        String d = C90193h.m112876d(this.f116516d);
        C87412m.m108593f(d, "getMD5(videoPath)");
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion$setMediaSourceSight$1");
        return d;
    }
}
