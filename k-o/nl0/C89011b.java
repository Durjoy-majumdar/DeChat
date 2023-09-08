package nl0;

import android.app.Activity;
import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82910q;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import j32.C33506c;
import java.util.HashMap;
import kr0.C88267e;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: nl0.b */
public class C89011b extends C82268c<C88267e> {
    private static final int CTRL_INDEX = 423;
    private static final String NAME = "sendRedPacket";

    /* renamed from: nl0.b$a */
    public static class C89012a extends C82910q {
        public C89012a(C82870p pVar, C81925i2 i2Var, C83780d1 d1Var, JSONObject jSONObject, int i) {
            super(pVar, i2Var, d1Var, jSONObject, i);
        }

        /* renamed from: a */
        public boolean mo115152a(Activity activity, JSONObject jSONObject, int i) {
            int i2;
            String optString = jSONObject.optString("defaultWishingWord", (String) null);
            JSONArray optJSONArray = jSONObject.optJSONArray("scope");
            if (optJSONArray != null) {
                boolean contains = optJSONArray.toString().contains("friend");
                int contains2 = optJSONArray.toString().contains("public");
                if (contains2 != 0 && contains) {
                    contains2 = 2;
                }
                i2 = contains2;
            } else {
                Log.m105924i("MicroMsg.JsApiSendRedPacket", "launch scope is nil");
                i2 = 0;
            }
            ((C33506c) C86312j.m106911c(C33506c.class)).mo59177Ty(activity, this.f242395a.getAppId(), i2, optString, i);
            return true;
        }

        /* renamed from: b */
        public void mo115153b(int i, String str) {
            Log.m105925i("MicroMsg.JsApiSendRedPacket", "onError errCode: %d,errMsg: %s", Integer.valueOf(i), str);
            HashMap hashMap = new HashMap();
            hashMap.put("errCode", Integer.valueOf(i));
            this.f242395a.mo109647a(this.f242398d, this.f242399e.mo115112m(str, hashMap));
        }

        /* renamed from: c */
        public void mo115154c(int i, Intent intent) {
            Log.m105924i("MicroMsg.JsApiSendRedPacket", "PrepareLuckyMoneyRequest.onResult ");
            if (intent == null || intent.getStringExtra("sendId") == null) {
                Log.m105921e("MicroMsg.JsApiSendRedPacket", "onResult data = [%s]", intent);
                mo115153b(-1, "fail:system error {{result data error or sendId is null}}");
                return;
            }
            String stringExtra = intent.getStringExtra("sendId");
            Log.m105925i("MicroMsg.JsApiSendRedPacket", "PrepareLuckyMoneyRequest.onResult sendId = %s,share = %b", stringExtra, Boolean.valueOf(intent.getBooleanExtra("result_share_msg", false)));
            Log.m105924i("MicroMsg.JsApiSendRedPacket", "GetLuckMoneyRequest.onResult");
            HashMap hashMap = new HashMap();
            hashMap.put("errCode", 0);
            hashMap.put("redPacketId", stringExtra);
            this.f242395a.mo109647a(this.f242398d, this.f242399e.mo115112m("ok", hashMap));
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C88267e eVar = (C88267e) fVar;
        if (jSONObject == null) {
            Log.m105924i("MicroMsg.JsApiSendRedPacket", "data is null");
            HashMap hashMap = new HashMap();
            hashMap.put("errCode", -1);
            eVar.mo109647a(i, mo115112m("fail:system error {{data is null}}", hashMap));
            return;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("scope");
        if (optJSONArray == null || optJSONArray.length() == 0) {
            Log.m105924i("MicroMsg.JsApiSendRedPacket", "scope is nil");
            HashMap hashMap2 = new HashMap();
            hashMap2.put("errCode", -1);
            eVar.mo109647a(i, mo115112m("fail:system error {{scope is nil}}", hashMap2));
            return;
        }
        new C89012a(this, eVar, eVar.mo114342m0(C83928t1.class), jSONObject, i).mo115155d();
    }
}
