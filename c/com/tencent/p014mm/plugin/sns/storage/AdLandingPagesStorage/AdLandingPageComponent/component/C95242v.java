package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import fy3.C32227p;
import java.util.Map;
import qs2.C101271i0;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v */
public class C95242v implements C32227p<Boolean, Map<String, ? extends Object>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C101271i0 f276400d;

    /* renamed from: e */
    public final /* synthetic */ String f276401e;

    /* renamed from: f */
    public final /* synthetic */ C95283y f276402f;

    public C95242v(C95283y yVar, C101271i0 i0Var, String str) {
        this.f276402f = yVar;
        this.f276400d = i0Var;
        this.f276401e = str;
    }

    public Object invoke(Object obj, Object obj2) {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp$1");
        Map map = (Map) obj2;
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp$1");
        if (((Boolean) obj).booleanValue()) {
            C95283y yVar = this.f276402f;
            String l = this.f276400d.mo140745l();
            long j = this.f276402f.f276542B.f300101Z.f264476a;
            String str = this.f276401e;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
            yVar.mo131828i0(l, j, 0, str);
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
        }
        C13598b0 b0Var = C13598b0.f38549a;
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp$1");
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp$1");
        return b0Var;
    }
}
