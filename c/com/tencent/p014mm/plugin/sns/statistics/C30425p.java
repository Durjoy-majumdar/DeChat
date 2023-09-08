package com.tencent.p014mm.plugin.sns.statistics;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: com.tencent.mm.plugin.sns.statistics.p */
public final class C30425p extends C87413o implements C32224a<Object> {

    /* renamed from: d */
    public static final C30425p f82060d = new C30425p();

    public C30425p() {
        super(0);
    }

    public final Object invoke() {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion$testStaticKvStat$1");
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion$testStaticKvStat$1");
        return "aaa";
    }
}
