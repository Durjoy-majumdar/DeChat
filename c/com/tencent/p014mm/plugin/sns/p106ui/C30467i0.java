package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.model.C94945s2;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ny3.C25237g;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.sns.ui.i0 */
public final class C30467i0 extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C25237g<C94945s2> f82124d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C30467i0(C25237g<? extends C94945s2> gVar) {
        super(1);
        this.f82124d = gVar;
    }

    public Object invoke(Object obj) {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.Festival2021Widget$safeGet$2");
        String str = (String) obj;
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.Festival2021Widget$safeGet$2");
        C87412m.m108594g(str, LocaleUtil.ITALIAN);
        ((C32226l) this.f82124d).invoke(str);
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.Festival2021Widget$safeGet$2");
        C13598b0 b0Var = C13598b0.f38549a;
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.Festival2021Widget$safeGet$2");
        return b0Var;
    }
}
