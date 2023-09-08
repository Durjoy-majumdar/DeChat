package um0;

import android.os.IInterface;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.trafficcard.ITencentSmartcardOpenService;
import java.util.HashMap;
import org.json.JSONObject;
import p349j9.C21196a;

/* renamed from: um0.f */
public class C22657f extends C90704a {
    public static final int CTRL_INDEX = 896;
    public static final String NAME = "queryTrafficCardInfo";

    /* renamed from: w */
    public void mo35773w(C82554k kVar, int i, IInterface iInterface, JSONObject jSONObject) {
        String str;
        if (jSONObject == null) {
            HashMap hashMap = new HashMap();
            C22653b bVar = C22653b.f65159e;
            hashMap.put("errCode", Integer.valueOf(bVar.f65181a));
            kVar.mo109647a(i, mo115112m("fail:" + bVar.f65182b, hashMap));
            mo124833x(4, bVar.f65181a, "deviceData is null");
            Log.m105921e("MicroMsg.JsApiQueryTrafficCardInfo", "deviceData is null, invoke fail: [%s] ! with appId[%s] callbackId[%s]", bVar.f65182b, kVar.getAppId(), Integer.valueOf(i));
            return;
        }
        String optString = jSONObject.optString("issuerID");
        int optInt = jSONObject.optInt("dataType");
        JSONObject jSONObject2 = null;
        boolean z = iInterface instanceof C21196a;
        if (z) {
            try {
                str = ((C21196a) iInterface).queryTrafficCardInfo(optString, optInt);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.JsApiQueryTrafficCardInfo", "call huawei remote interface fail: [%s] ! ", e.getMessage());
            }
        } else {
            str = iInterface instanceof ITencentSmartcardOpenService ? ((ITencentSmartcardOpenService) iInterface).queryTrafficCardInfo(optString, optInt) : "";
        }
        if (!TextUtils.isEmpty(str)) {
            jSONObject2 = new JSONObject(str);
        }
        HashMap hashMap2 = new HashMap();
        if (jSONObject2 == null) {
            C22653b bVar2 = C22653b.f65163i;
            hashMap2.put("errCode", Integer.valueOf(bVar2.f65181a));
            kVar.mo109647a(i, mo115112m("fail:" + bVar2.f65182b, hashMap2));
            mo124833x(4, bVar2.f65181a, "call remote interface exception");
            Log.m105920e("MicroMsg.JsApiQueryTrafficCardInfo", "call remote interface exception.");
            return;
        }
        int optInt2 = jSONObject2.optInt("resultCode");
        C22653b bVar3 = C22653b.f65158d;
        int i2 = bVar3.f65181a;
        if (optInt2 != i2) {
            C22653b a = z ? C22653b.m26529a(optInt2) : C22653b.m26530b(optInt2);
            if (a == C22653b.f65156K) {
                a = C22653b.f65178x;
            }
            hashMap2.put("errCode", Integer.valueOf(a.f65181a));
            kVar.mo109647a(i, mo115112m("fail:" + a.f65182b, hashMap2));
            mo124833x(4, a.f65181a, a.f65182b);
            Log.m105921e("MicroMsg.JsApiQueryTrafficCardInfo", "Return code from huawei remote interface! with RetCode rechargeCard[%s] ", Integer.valueOf(optInt2));
            return;
        }
        hashMap2.put("errCode", Integer.valueOf(i2));
        hashMap2.put("data", jSONObject2.optJSONObject("data"));
        kVar.mo109647a(i, mo115112m(bVar3.f65182b, hashMap2));
        mo124833x(4, bVar3.f65181a, "");
    }
}
