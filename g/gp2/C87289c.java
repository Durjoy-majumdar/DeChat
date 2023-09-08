package gp2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import e42.C7594e;
import e42.C7596h;
import gy3.C87412m;
import hp2.C87579c;
import p763ym.C79138l;
import rx3.C13598b0;
import z04.C112551y;

/* renamed from: gp2.c */
public final class C87289c<T extends C7594e> extends C87579c<T> {
    /* renamed from: e */
    public String mo16e() {
        SnsMethodCalculate.markStartTimeMs("getName", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiGetAppBaseInfo");
        SnsMethodCalculate.markEndTimeMs("getName", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiGetAppBaseInfo");
        return "getAppBaseInfo";
    }

    /* renamed from: s */
    public void mo121698s(C7596h hVar) {
        C13598b0 b0Var;
        SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiGetAppBaseInfo");
        C87412m.m108594g(hVar, "data");
        String optString = hVar.optString("appId");
        if (optString == null || C112551y.m153811k(optString)) {
            mo122027r(mo120842g(10000, "the app id is empty"));
            SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiGetAppBaseInfo");
            return;
        }
        try {
            C44561j appInfo = ((C79138l) C86312j.m106911c(C79138l.class)).getAppInfo(optString);
            if (appInfo != null) {
                C7596h hVar2 = new C7596h();
                hVar2.put("pkg", appInfo.field_packageName);
                hVar2.put("appId", optString);
                C13598b0 b0Var2 = C13598b0.f38549a;
                mo120845j(hVar2);
                mo122027r(hVar2);
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                Log.m105928w("SnsAdMb.JsApi", "there is no base info of app id " + optString);
                mo122027r(mo120842g(10000, "there is no base info of app id " + optString + ' '));
            }
        } catch (Exception e) {
            Log.m105928w("SnsAdMb.JsApi", "there is exception " + e.getMessage());
            mo122027r(mo120842g(10000, "there is exception " + e.getMessage()));
        }
        SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiGetAppBaseInfo");
    }
}
