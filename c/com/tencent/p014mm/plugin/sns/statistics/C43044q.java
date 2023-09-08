package com.tencent.p014mm.plugin.sns.statistics;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: com.tencent.mm.plugin.sns.statistics.q */
public final class C43044q extends C87413o implements C32224a<Object> {

    /* renamed from: d */
    public static final C43044q f116517d = new C43044q();

    public C43044q() {
        super(0);
    }

    public final Object invoke() {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion$testStaticKvStat$2");
        Thread.sleep(1000);
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion$testStaticKvStat$2");
        return "sleep_1000";
    }
}
