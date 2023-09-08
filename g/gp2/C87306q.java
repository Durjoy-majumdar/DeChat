package gp2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import e42.C7594e;
import e42.C7596h;
import gy3.C87412m;
import hp2.C87579c;
import vr2.C102260r;
import z04.C112551y;

/* renamed from: gp2.q */
public final class C87306q<T extends C7594e> extends C87579c<T> {
    /* renamed from: e */
    public String mo16e() {
        SnsMethodCalculate.markStartTimeMs("getName", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiReportAdChannel");
        SnsMethodCalculate.markEndTimeMs("getName", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiReportAdChannel");
        return "reportAdChannel";
    }

    /* renamed from: s */
    public void mo121698s(C7596h hVar) {
        SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiReportAdChannel");
        C87412m.m108594g(hVar, "data");
        String optString = hVar.optString("key");
        String optString2 = hVar.optString("content");
        boolean z = false;
        if (!(optString == null || C112551y.m153811k(optString))) {
            if (optString2 == null || C112551y.m153811k(optString2)) {
                z = true;
            }
            if (!z) {
                C102260r.m134858a(optString, optString2);
                mo122027r(mo120844i());
                SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiReportAdChannel");
                return;
            }
        }
        Log.m105928w("SnsAdMb.JsApi", "the key or content is empty, Please check it!!");
        mo122027r(mo120842g(10000, "the key or content is empty, Please check it"));
        SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiReportAdChannel");
    }

    /* renamed from: t */
    public boolean mo121699t() {
        SnsMethodCalculate.markStartTimeMs("shouldNeedActivity", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiReportAdChannel");
        SnsMethodCalculate.markEndTimeMs("shouldNeedActivity", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiReportAdChannel");
        return false;
    }
}
