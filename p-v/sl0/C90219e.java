package sl0;

import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import org.json.JSONObject;
import sp0.C90272a;
import sp0.C90309m;

/* renamed from: sl0.e */
public class C90219e extends C82268c {
    public static final int CTRL_INDEX = 615;
    public static final String NAME = "checkNetworkAPIURL";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        boolean z;
        int i2;
        if (jSONObject == null) {
            fVar.mo109647a(i, mo115109j("fail:data nil"));
            Log.m105928w("MicroMsg.JsApiCheckNetworkAPIURL", "data is null");
            return;
        }
        HashMap hashMap = new HashMap();
        String optString = jSONObject.optString(ProviderConstants.API_PATH, "");
        String optString2 = jSONObject.optString("url", "");
        if (Util.isNullOrNil(optString) || Util.isNullOrNil(optString2)) {
            Log.m105929w("MicroMsg.JsApiCheckNetworkAPIURL", "invalid api:%s,url:%s", optString, optString2);
            hashMap.put("isValid", Boolean.FALSE);
            fVar.mo109647a(i, mo115112m("fail:api or url invalid", hashMap));
            return;
        }
        C90272a aVar = (C90272a) fVar.mo109671p(C90272a.class);
        if (optString.equalsIgnoreCase("request")) {
            z = C90309m.m113084s(aVar.f259137q, optString2, false);
        } else if (optString.equalsIgnoreCase("websocket")) {
            z = C90309m.m113084s(aVar.f259138r, optString2, aVar.f259119A);
        } else if (optString.equalsIgnoreCase("downloadFile")) {
            z = C90309m.m113084s(aVar.f259140t, optString2, false);
        } else if (optString.equalsIgnoreCase("uploadFile")) {
            z = C90309m.m113084s(aVar.f259139s, optString2, false);
        } else if (optString.equalsIgnoreCase("udp")) {
            z = C90309m.m113084s(aVar.f259141u, optString2, false);
        } else if (optString.equalsIgnoreCase("tcp")) {
            z = C90309m.m113084s(aVar.f259142v, optString2, false);
        } else {
            Log.m105929w("MicroMsg.JsApiCheckNetworkAPIURL", "hy: unknown api: %s", optString);
            hashMap.put("isValid", Boolean.FALSE);
            fVar.mo109647a(i, mo115112m("fail:unknow api", hashMap));
            return;
        }
        String str = C90309m.m113091z(optString2).get("host");
        if (!Util.isNullOrNil(str)) {
            Log.m105925i("MicroMsg.JsApiCheckNetworkAPIURL", "ipHost:%s", str);
            i2 = C90309m.m113085t(str);
        } else {
            i2 = 0;
        }
        Log.m105925i("MicroMsg.JsApiCheckNetworkAPIURL", "checkRet:%b,ipCheckRet:%d,api:%s,url:%s", Boolean.valueOf(z), Integer.valueOf(i2), optString, optString2);
        if (z) {
            hashMap.put("isInDomainList", Boolean.TRUE);
        } else {
            hashMap.put("isInDomainList", Boolean.FALSE);
        }
        if (i2 == 0) {
            Boolean bool = Boolean.FALSE;
            hashMap.put("isInLAN", bool);
            hashMap.put("isLocalHost", bool);
        } else if (i2 == 1) {
            Boolean bool2 = Boolean.TRUE;
            hashMap.put("isInLAN", bool2);
            hashMap.put("isLocalHost", bool2);
        } else if (i2 == 2) {
            hashMap.put("isInLAN", Boolean.TRUE);
            hashMap.put("isLocalHost", Boolean.FALSE);
        }
        fVar.mo109647a(i, mo115112m("ok", hashMap));
    }
}
