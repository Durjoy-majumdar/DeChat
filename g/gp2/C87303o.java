package gp2;

import com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import e42.C7594e;
import e42.C7596h;
import gy3.C87412m;
import hp2.C87579c;
import rx3.C13598b0;

/* renamed from: gp2.o */
public final class C87303o<T extends C7594e> extends C87579c<T> {

    /* renamed from: gp2.o$a */
    public final class C87304a implements AdLandingPagesProxy.C94830p {

        /* renamed from: a */
        public final String f253034a;

        /* renamed from: b */
        public final /* synthetic */ C87303o<T> f253035b;

        public C87304a(C87303o oVar, String str) {
            C87412m.m108594g(str, "hbCoverId");
            this.f253035b = oVar;
            this.f253034a = str;
        }

        /* renamed from: a */
        public void mo10855a(Object obj) {
            SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiQueryHBCoverState$LandingProxyCallback");
            SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiQueryHBCoverState$LandingProxyCallback");
        }

        /* renamed from: b */
        public void mo10856b(int i, int i2, Object obj) {
            SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiQueryHBCoverState$LandingProxyCallback");
            if (i == 0 && i2 == 0) {
                try {
                    C87412m.m108592e(obj, "null cannot be cast to non-null type kotlin.Int");
                    int intValue = ((Integer) obj).intValue();
                    C87303o<T> oVar = this.f253035b;
                    C7596h hVar = new C7596h();
                    hVar.put("redEnvelopesSkinId", this.f253034a);
                    hVar.put("state", intValue);
                    C13598b0 b0Var = C13598b0.f38549a;
                    oVar.mo120845j(hVar);
                    SnsMethodCalculate.markStartTimeMs("access$backToJs", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiQueryHBCoverState");
                    oVar.mo122027r(hVar);
                    SnsMethodCalculate.markEndTimeMs("access$backToJs", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiQueryHBCoverState");
                    Log.m105924i("SnsAdMb.JsApi", "the hb cover state is " + intValue);
                } catch (Exception e) {
                    Log.m105920e("SnsAdMb.JsApi", "there is an exception " + e.getMessage());
                    C87303o<T> oVar2 = this.f253035b;
                    C7596h g = oVar2.mo120842g(10000, "in hb cover, there is an exception " + e.getMessage());
                    SnsMethodCalculate.markStartTimeMs("access$backToJs", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiQueryHBCoverState");
                    oVar2.mo122027r(g);
                    SnsMethodCalculate.markEndTimeMs("access$backToJs", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiQueryHBCoverState");
                }
            } else {
                Log.m105920e("SnsAdMb.JsApi", "get hb cover state failed ");
                C87303o<T> oVar3 = this.f253035b;
                C7596h g2 = oVar3.mo120842g(10000, "get hb cover state failed");
                SnsMethodCalculate.markStartTimeMs("access$backToJs", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiQueryHBCoverState");
                oVar3.mo122027r(g2);
                SnsMethodCalculate.markEndTimeMs("access$backToJs", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiQueryHBCoverState");
            }
            SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiQueryHBCoverState$LandingProxyCallback");
        }
    }

    /* renamed from: e */
    public String mo16e() {
        SnsMethodCalculate.markStartTimeMs("getName", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiQueryHBCoverState");
        SnsMethodCalculate.markEndTimeMs("getName", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiQueryHBCoverState");
        return "queryHbCoverState";
    }

    /* renamed from: s */
    public void mo121698s(C7596h hVar) {
        SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiQueryHBCoverState");
        C87412m.m108594g(hVar, "data");
        String optString = hVar.optString("redEnvelopesSkinId");
        AdLandingPagesProxy instance = AdLandingPagesProxy.getInstance();
        C87412m.m108593f(optString, "hbCoverId");
        instance.doGetHbCoverState(optString, new C87304a(this, optString));
        SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiQueryHBCoverState");
    }

    /* renamed from: t */
    public boolean mo121699t() {
        SnsMethodCalculate.markStartTimeMs("shouldNeedActivity", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiQueryHBCoverState");
        SnsMethodCalculate.markEndTimeMs("shouldNeedActivity", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiQueryHBCoverState");
        return false;
    }
}
