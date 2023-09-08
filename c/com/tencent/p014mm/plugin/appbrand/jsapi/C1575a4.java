package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.os.Bundle;
import com.tencent.p014mm.autogen.events.JsApiOfflineUserBindQueryResultCallBackEvent;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.a4 */
public class C1575a4 extends C82268c<C81879g> {
    public static final int CTRL_INDEX = 925;
    public static final String NAME = "requestOfflineUserBindQuery";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.a4$a */
    public static class C1576a implements C80883e<Bundle, Bundle> {
        private C1576a() {
        }

        public void invoke(Object obj, C1256g gVar) {
            JSONObject optJSONObject;
            Bundle bundle = (Bundle) obj;
            Bundle bundle2 = new Bundle();
            if (bundle != null) {
                Log.m105924i("MicroMsg.IPCLoadPayOfflineUserBindQuery", "data != null");
                JsApiOfflineUserBindQueryResultCallBackEvent jsApiOfflineUserBindQueryResultCallBackEvent = new JsApiOfflineUserBindQueryResultCallBackEvent();
                jsApiOfflineUserBindQueryResultCallBackEvent.f193679d.f193681a = bundle.getString("appId", "");
                jsApiOfflineUserBindQueryResultCallBackEvent.f193679d.f193682b = bundle.getString("appName", "");
                jsApiOfflineUserBindQueryResultCallBackEvent.f193679d.f193683c = bundle.getString("appPath", "");
                jsApiOfflineUserBindQueryResultCallBackEvent.f193679d.f193684d = bundle.getString("nonceStr");
                jsApiOfflineUserBindQueryResultCallBackEvent.f193679d.f193685e = bundle.getString("timeStamp");
                jsApiOfflineUserBindQueryResultCallBackEvent.f193679d.f193687g = bundle.getString("paySign");
                jsApiOfflineUserBindQueryResultCallBackEvent.f193679d.f193688h = bundle.getString("signType");
                jsApiOfflineUserBindQueryResultCallBackEvent.f193679d.f193686f = bundle.getString("packageInfo");
                String string = bundle.getString("packageInfo");
                if (Util.isNullOrNil(string)) {
                    Log.m105920e("MicroMsg.IPCLoadPayOfflineUserBindQuery", "fail:packageInfo is null");
                    if (gVar != null) {
                        bundle2.putString("errMsg", "fail:packageInfo is null");
                        gVar.mo894a(bundle2);
                        return;
                    }
                    return;
                }
                String[] split = string.split("=");
                if (!Util.isNullOrNil(split[1])) {
                    try {
                        JSONArray optJSONArray = new JSONObject(split[1]).optJSONArray("busi_data");
                        if (optJSONArray != null) {
                            for (int i = 0; i < optJSONArray.length(); i++) {
                                JSONObject jSONObject = optJSONArray.getJSONObject(i);
                                if (!(jSONObject == null || (optJSONObject = jSONObject.optJSONObject("new_card_info")) == null)) {
                                    jsApiOfflineUserBindQueryResultCallBackEvent.f193679d.f193689i = optJSONObject.optString("bank_type");
                                    jsApiOfflineUserBindQueryResultCallBackEvent.f193679d.f193690j = optJSONObject.optString("bind_serial");
                                    jsApiOfflineUserBindQueryResultCallBackEvent.f193679d.f193691k = optJSONObject.optString("open_success");
                                }
                            }
                        }
                    } catch (JSONException e) {
                        Log.m105921e("MicroMsg.IPCLoadPayOfflineUserBindQuery", "parseTextViewData Exception:%s", e.getMessage());
                    }
                }
                jsApiOfflineUserBindQueryResultCallBackEvent.f193679d.f193692l = new C68622z3(this, jsApiOfflineUserBindQueryResultCallBackEvent, bundle2, gVar);
                jsApiOfflineUserBindQueryResultCallBackEvent.publish();
                return;
            }
            Log.m105924i("MicroMsg.IPCLoadPayOfflineUserBindQuery", "data is null");
            if (gVar != null) {
                bundle2.putString("errMsg", "fail:IPCLoadPayOfflineUserBindQuery data is null");
                gVar.mo894a(bundle2);
            }
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        JSONObject jSONObject2 = jSONObject;
        int i2 = i;
        C81879g gVar = (C81879g) fVar;
        Log.m105925i("MicroMsg.JsApiOfflineUserBindQuery", "invoke JsApiOfflineUserBindQuery! data is ：%s", jSONObject.toString());
        if (gVar == null) {
            Log.m105920e("MicroMsg.JsApiOfflineUserBindQuery", "fail:component is null");
        } else if (gVar.getContext() == null) {
            Log.m105920e("MicroMsg.JsApiOfflineUserBindQuery", "fail:context is null");
            gVar.mo109647a(i2, mo115109j("fail:context is null"));
        } else {
            AppBrandInitConfig W = gVar.getRuntime().mo113036W();
            String str = W.f239362d;
            String str2 = W.f239363e;
            String currentUrl = gVar.getRuntime().mo113042Z().getCurrentUrl();
            String optString = jSONObject2.optString("nonceStr");
            String optString2 = jSONObject2.optString("timeStamp");
            String optString3 = jSONObject2.optString("paySign");
            String optString4 = jSONObject2.optString("signType");
            String optString5 = jSONObject2.optString("package");
            Bundle bundle = new Bundle();
            bundle.putString("appId", str);
            bundle.putString("appName", str2);
            bundle.putString("appPath", currentUrl);
            bundle.putString("nonceStr", optString);
            bundle.putString("timeStamp", optString2);
            bundle.putString("paySign", optString3);
            bundle.putString("signType", optString4);
            bundle.putString("packageInfo", optString5);
            C80907o.m98781d(WeChatProcess.PROCESS_MAIN, bundle, C1576a.class, new C1910y3(this, gVar, i2));
            return;
        }
    }
}
