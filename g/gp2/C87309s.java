package gp2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import e42.C7594e;
import e42.C7596h;
import gy3.C87412m;
import hp2.C87579c;
import rx3.C13598b0;

/* renamed from: gp2.s */
public final class C87309s<T extends C7594e> extends C87579c<T> {
    /* renamed from: e */
    public String mo16e() {
        SnsMethodCalculate.markStartTimeMs("getName", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiZTestAsync");
        SnsMethodCalculate.markEndTimeMs("getName", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiZTestAsync");
        return "testAsyncJsApi";
    }

    /* renamed from: s */
    public void mo121698s(C7596h hVar) {
        SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiZTestAsync");
        C87412m.m108594g(hVar, "data");
        if (hVar.optInt("param") == 0) {
            mo122027r(mo120842g(10000, "the input test is 0"));
        } else {
            C7596h hVar2 = new C7596h();
            hVar2.put("result", 100);
            C13598b0 b0Var = C13598b0.f38549a;
            mo120845j(hVar2);
            mo122027r(hVar2);
        }
        SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiZTestAsync");
    }
}
