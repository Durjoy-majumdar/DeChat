package com.tencent.p014mm.plugin.appbrand.p025ad.jsapi;

import com.tencent.p014mm.advertise.util.MagicAdPushMsg;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82510g;
import com.tencent.p014mm.plugin.appbrand.p025ad.jsapi.JsApiGetAdPushMsg;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONArray;
import org.json.JSONObject;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.ad.jsapi.i */
public final class C1503i<T> implements C1256g {

    /* renamed from: d */
    public final /* synthetic */ C82510g f10856d;

    /* renamed from: e */
    public final /* synthetic */ int f10857e;

    /* renamed from: f */
    public final /* synthetic */ JsApiGetAdPushMsg f10858f;

    public C1503i(C82510g gVar, int i, JsApiGetAdPushMsg jsApiGetAdPushMsg) {
        this.f10856d = gVar;
        this.f10857e = i;
        this.f10858f = jsApiGetAdPushMsg;
    }

    /* renamed from: a */
    public void mo894a(Object obj) {
        JsApiGetAdPushMsg.AdPushMsgListWrapper adPushMsgListWrapper = (JsApiGetAdPushMsg.AdPushMsgListWrapper) obj;
        JSONArray jSONArray = new JSONArray();
        if (adPushMsgListWrapper.f10852e) {
            for (MagicAdPushMsg magicAdPushMsg : adPushMsgListWrapper.f10851d) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("opcode", magicAdPushMsg.f9008d);
                jSONObject.put("aid", magicAdPushMsg.f9009e);
                jSONObject.put("slotid", magicAdPushMsg.f9010f);
                jSONObject.put("op_time", magicAdPushMsg.f9011g);
                jSONObject.put("traceid", magicAdPushMsg.f9012h);
                jSONArray.put(jSONObject);
            }
            C82510g gVar = this.f10856d;
            if (gVar != null) {
                int i = this.f10857e;
                JsApiGetAdPushMsg jsApiGetAdPushMsg = this.f10858f;
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("msgData", jSONArray);
                C13598b0 b0Var = C13598b0.f38549a;
                jsApiGetAdPushMsg.getClass();
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
                }
                try {
                    jSONObject2.put("errno", 0);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
                }
                gVar.mo109647a(i, jsApiGetAdPushMsg.mo115115p("ok", jSONObject2));
                return;
            }
            return;
        }
        C82510g gVar2 = this.f10856d;
        if (gVar2 != null) {
            int i2 = this.f10857e;
            JsApiGetAdPushMsg jsApiGetAdPushMsg2 = this.f10858f;
            jsApiGetAdPushMsg2.getClass();
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 4, "get msg error");
            }
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("errno", 4);
            } catch (Exception e2) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e2);
            }
            gVar2.mo109647a(i2, jsApiGetAdPushMsg2.mo115115p("get msg error", jSONObject3));
        }
    }
}
