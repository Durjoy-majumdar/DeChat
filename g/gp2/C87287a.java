package gp2;

import android.os.Bundle;
import com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp.C94601a;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.IntentUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import e42.C7594e;
import gy3.C87412m;
import hp2.C87577a;
import hp2.C87578b;
import ip2.C87788c;
import np2.C100150a;
import op2.C100371a;
import org.json.JSONObject;
import pp2.C62489a;
import qp2.C101232a;
import z04.C112551y;

/* renamed from: gp2.a */
public final class C87287a<T extends C7594e> extends C87578b<T> implements C100371a {
    /* renamed from: b */
    public void mo86295b(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("onCallbackFromServer", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiDrawCoupon");
        if (IntentUtil.getInt(bundle, "call_ipc_result_key", 0) == 0) {
            int i = IntentUtil.getInt(bundle, "ret", -1);
            String string = IntentUtil.getString(bundle, "msg");
            Log.m105924i("SnsAdMb.JsApi", "responseTo the msg is " + string + ", the ret is " + i);
            if (i == 0) {
                mo122027r(mo120844i());
            } else {
                if (string == null) {
                    string = "draw failed!";
                }
                mo122027r(mo120842g(10000, string));
            }
        } else {
            mo122027r(mo120842g(10000, "net scene request failed!"));
        }
        SnsMethodCalculate.markEndTimeMs("onCallbackFromServer", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiDrawCoupon");
    }

    /* renamed from: e */
    public String mo16e() {
        SnsMethodCalculate.markStartTimeMs("getName", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiDrawCoupon");
        SnsMethodCalculate.markEndTimeMs("getName", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiDrawCoupon");
        return "drawCoupon";
    }

    /* renamed from: u */
    public void mo121696u(C87577a aVar, JSONObject jSONObject) {
        SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiDrawCoupon");
        C87412m.m108594g(aVar, "env");
        C87412m.m108594g(jSONObject, "data");
        String optString = jSONObject.optString("couponAppId", "");
        String optString2 = jSONObject.optString("couponStockId", "");
        String optString3 = jSONObject.optString("compId", "");
        String a = C87788c.m109226a(aVar.mo122023b());
        boolean z = false;
        if (!(optString == null || C112551y.m153811k(optString))) {
            if (!(optString2 == null || C112551y.m153811k(optString2))) {
                if (optString3 == null || C112551y.m153811k(optString3)) {
                    z = true;
                }
                if (!z) {
                    C100150a aVar2 = new C100150a();
                    aVar2.mo139441d(new C94601a.C43025c());
                    aVar2.mo139440c(this);
                    C62489a a2 = aVar2.mo139438a();
                    if (a2 != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("COUPON_APP_ID", optString);
                        bundle.putString("COUPON_STOCK_ID", optString2);
                        bundle.putString("COMP_ID", optString3);
                        bundle.putString("UX_INFO", a);
                        ((C101232a) a2).mo140693c(bundle);
                    } else {
                        Log.m105920e("SnsAdMB", "the ipc request object is null, please check the log to find the reason!");
                        mo122027r(mo120842g(10000, "the ipc request object is null!"));
                    }
                    SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiDrawCoupon");
                    return;
                }
            }
        }
        Log.m105920e("SnsAdMb.JsApi", "the input param is invalid!");
        mo122027r(mo120842g(10000, "the input param is invalid!"));
        SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiDrawCoupon");
    }
}
