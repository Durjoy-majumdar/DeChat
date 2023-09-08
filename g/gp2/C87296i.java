package gp2;

import android.app.Activity;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.util.WXWebReporter;
import e42.C7594e;
import gy3.C87412m;
import hp2.C87577a;
import hp2.C87578b;
import or2.C100381a;
import org.json.JSONObject;
import qs2.C101271i0;
import qs2.C89839x;
import rx3.C13598b0;
import z04.C112551y;

/* renamed from: gp2.i */
public final class C87296i<T extends C7594e> extends C87578b<T> {
    /* renamed from: e */
    public String mo16e() {
        SnsMethodCalculate.markStartTimeMs("getName", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiOpenContactHalfScreenDialog");
        SnsMethodCalculate.markEndTimeMs("getName", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiOpenContactHalfScreenDialog");
        return "openBrandHalfScreenDialog";
    }

    /* renamed from: u */
    public void mo121696u(C87577a aVar, JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiOpenContactHalfScreenDialog");
        C87412m.m108594g(aVar, "env");
        C87412m.m108594g(jSONObject2, "data");
        String optString = jSONObject2.optString("brandUsername");
        String optString2 = jSONObject2.optString("brandHead");
        String optString3 = jSONObject2.optString("brandName");
        String optString4 = jSONObject2.optString("brandDesc");
        String optString5 = jSONObject2.optString("btnTitleAfterAddBrand");
        String optString6 = jSONObject2.optString("compatibleJumpUrl");
        boolean optBoolean = jSONObject2.optBoolean("isContact");
        int optInt = jSONObject2.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, WXWebReporter.WXWEB_IDKEY_PLUGIN_CONFIG_DOWNLOAD_SUCCESS);
        boolean z = true;
        if (!(optString == null || C112551y.m153811k(optString))) {
            if (!(optString2 == null || C112551y.m153811k(optString2))) {
                if (optString3 != null && !C112551y.m153811k(optString3)) {
                    z = false;
                }
                if (!z) {
                    C100381a aVar2 = new C100381a();
                    Activity a = aVar.mo122022a();
                    C89839x xVar = new C89839x();
                    xVar.f258259Z = optString;
                    xVar.f258260a0 = optString2;
                    xVar.f258261b0 = optString3;
                    xVar.f258262c0 = optString4;
                    xVar.f258263d0 = optString5;
                    xVar.f258264e0 = optString6;
                    C13598b0 b0Var = C13598b0.f38549a;
                    C101271i0 b = aVar.mo122023b();
                    SnsMethodCalculate.markStartTimeMs("showHalfScreenBrandView", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
                    aVar2.mo139668h(a, xVar, b, optInt, optBoolean);
                    aVar2.mo139666e();
                    SnsMethodCalculate.markEndTimeMs("showHalfScreenBrandView", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
                    mo122027r(mo120844i());
                    SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiOpenContactHalfScreenDialog");
                    return;
                }
            }
        }
        Log.m105920e("SnsAdMb.JsApi", "the props of brand are invalid!!!");
        mo122027r(mo120842g(10000, "the props of brand are invalid!!!"));
        SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiOpenContactHalfScreenDialog");
    }
}
