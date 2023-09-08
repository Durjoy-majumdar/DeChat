package com.tencent.p014mm.plugin.sns.statistics;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.C57354l;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import i21.C60242i;
import k21.C60960c;
import ms2.C61577h;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.sns.statistics.m */
public final class C57358m extends C87413o implements C32226l<C61577h, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ int f164339d;

    /* renamed from: e */
    public final /* synthetic */ int f164340e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C57358m(int i, int i2) {
        super(1);
        this.f164339d = i;
        this.f164340e = i2;
    }

    public Object invoke(Object obj) {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion$reportNetPost$1");
        C61577h hVar = (C61577h) obj;
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion$reportNetPost$1");
        C87412m.m108594g(hVar, "snsPostCgiReportObj");
        hVar.f175145f = Util.append(hVar.f175145f, String.valueOf(this.f164339d), "#");
        hVar.f175144e++;
        C57354l.C57355a aVar = C57354l.f164333a;
        aVar.mo80977n(hVar);
        C60960c.f173618a.mo85927k("SnsPublishProcess", "opresult_", 6, C60242i.DEFAULT);
        aVar.mo80966c(this.f164340e + "");
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion$reportNetPost$1");
        C13598b0 b0Var = C13598b0.f38549a;
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion$reportNetPost$1");
        return b0Var;
    }
}
