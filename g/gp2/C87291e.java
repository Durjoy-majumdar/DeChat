package gp2;

import com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import e42.C7594e;
import e42.C7596h;
import gy3.C87412m;
import hp2.C87579c;
import rx3.C13598b0;
import z04.C112551y;

/* renamed from: gp2.e */
public final class C87291e<T extends C7594e> extends C87579c<T> {
    /* renamed from: e */
    public String mo16e() {
        SnsMethodCalculate.markStartTimeMs("getName", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiGetContactState");
        SnsMethodCalculate.markEndTimeMs("getName", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiGetContactState");
        return "getContactState";
    }

    /* renamed from: s */
    public void mo121698s(C7596h hVar) {
        SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiGetContactState");
        C87412m.m108594g(hVar, "data");
        String optString = hVar.optString("userName");
        if (optString == null || C112551y.m153811k(optString)) {
            mo122027r(mo120842g(10000, "the contact user name is empty!!"));
            SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiGetContactState");
            return;
        }
        boolean isBrandAdded = AdLandingPagesProxy.getInstance().isBrandAdded(optString);
        C7596h hVar2 = new C7596h();
        hVar2.put("isContact", isBrandAdded);
        C13598b0 b0Var = C13598b0.f38549a;
        mo120845j(hVar2);
        mo122027r(hVar2);
        SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiGetContactState");
    }
}
