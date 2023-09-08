package um0;

import android.os.IInterface;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.trafficcard.ITencentSmartcardOpenService;
import java.util.HashMap;
import org.json.JSONObject;
import p349j9.C21196a;

/* renamed from: um0.g */
public class C22658g extends C90704a {
    public static final int CTRL_INDEX = 898;
    public static final String NAME = "rechargeTrafficCard";

    /* renamed from: w */
    public void mo35773w(C82554k kVar, int i, IInterface iInterface, JSONObject jSONObject) {
        String str;
        C82554k kVar2 = kVar;
        int i2 = i;
        IInterface iInterface2 = iInterface;
        JSONObject jSONObject2 = jSONObject;
        if (jSONObject2 == null) {
            HashMap hashMap = new HashMap();
            C22653b bVar = C22653b.f65159e;
            hashMap.put("errCode", Integer.valueOf(bVar.f65181a));
            kVar2.mo109647a(i2, mo115112m("fail:" + bVar.f65182b, hashMap));
            mo124833x(5, bVar.f65181a, "deviceData is null");
            Log.m105921e("MicroMsg.JsApiRechargeTrafficCard", "deviceData is null, invoke fail: [%s] ! with appId[%s] callbackId[%s]", bVar.f65182b, kVar.getAppId(), Integer.valueOf(i));
            return;
        }
        HashMap hashMap2 = new HashMap();
        String optString = jSONObject2.optString("issuerID");
        String optString2 = jSONObject2.optString("orderNo");
        String optString3 = jSONObject2.optString("cityCode");
        String str2 = "";
        String optString4 = jSONObject2.optString("retry");
        hashMap2.put("issuerID", optString);
        hashMap2.put("orderNo", optString2);
        hashMap2.put("appID", "APP-WECHAT");
        hashMap2.put("operation", "1");
        hashMap2.put("cityCode", optString3);
        hashMap2.put("retry", optString4);
        JSONObject jSONObject3 = null;
        boolean z = iInterface2 instanceof C21196a;
        if (z) {
            try {
                str = ((C21196a) iInterface2).recharge(hashMap2);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.JsApiRechargeTrafficCard", "call remote interface fail: [%s] ! ", e.getMessage());
            }
        } else {
            str = iInterface2 instanceof ITencentSmartcardOpenService ? ((ITencentSmartcardOpenService) iInterface2).recharge(hashMap2) : str2;
        }
        Log.m105925i("MicroMsg.JsApiRechargeTrafficCard", "rechargeCardString: [%s]! params: [%s]", str, new JSONObject(hashMap2).toString());
        if (!TextUtils.isEmpty(str)) {
            jSONObject3 = new JSONObject(str);
        }
        HashMap hashMap3 = new HashMap();
        if (jSONObject3 == null) {
            C22653b bVar2 = C22653b.f65163i;
            hashMap3.put("errCode", Integer.valueOf(bVar2.f65181a));
            kVar2.mo109647a(i2, mo115112m("fail:" + bVar2.f65182b, hashMap3));
            mo124833x(5, bVar2.f65181a, "call remote interface exception");
            Log.m105920e("MicroMsg.JsApiRechargeTrafficCard", "call remote interface exception.");
            return;
        }
        int optInt = jSONObject3.optInt("resultCode");
        C22653b bVar3 = C22653b.f65158d;
        int i3 = bVar3.f65181a;
        if (optInt != i3) {
            C22653b a = z ? C22653b.m26529a(optInt) : C22653b.m26530b(optInt);
            if (a == C22653b.f65156K) {
                a = C22653b.f65151F;
            }
            hashMap3.put("errCode", Integer.valueOf(a.f65181a));
            kVar2.mo109647a(i2, mo115112m("fail:" + a.f65182b, hashMap3));
            mo124833x(5, a.f65181a, a.f65182b);
            Log.m105921e("MicroMsg.JsApiRechargeTrafficCard", "Return code from remote interface! with RetCode rechargeCard[%s] ", Integer.valueOf(optInt));
            return;
        }
        hashMap3.put("errCode", Integer.valueOf(i3));
        kVar2.mo109647a(i2, mo115112m(bVar3.f65182b, hashMap3));
        mo124833x(5, bVar3.f65181a, str2);
    }
}
