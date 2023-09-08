package com.tencent.p014mm.plugin.appbrand.jsapi.nfc;

import android.os.Bundle;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.nfc.JsApiAppBrandNFCBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.nfc.e */
public class C82855e extends JsApiAppBrandNFCBase {
    public static final int CTRL_INDEX = 354;
    public static final String NAME = "sendHCEMessage";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.nfc.e$a */
    public class C82856a implements JsApiAppBrandNFCBase.C82847a {

        /* renamed from: a */
        public final /* synthetic */ C82381f f242291a;

        /* renamed from: b */
        public final /* synthetic */ int f242292b;

        /* renamed from: c */
        public final /* synthetic */ JSONObject f242293c;

        public C82856a(C82381f fVar, int i, JSONObject jSONObject) {
            this.f242291a = fVar;
            this.f242292b = i;
            this.f242293c = jSONObject;
        }

        /* renamed from: a */
        public void mo115071a(int i, String str) {
            HashMap hashMap = new HashMap();
            hashMap.put("errCode", Integer.valueOf(i));
            if (i == 0) {
                C82855e eVar = C82855e.this;
                C82381f fVar = this.f242291a;
                int i2 = this.f242292b;
                JSONObject jSONObject = this.f242293c;
                eVar.getClass();
                HashMap hashMap2 = new HashMap();
                String optString = jSONObject.optString("data");
                if (Util.isNullOrNil(optString)) {
                    hashMap2.put("errCode", 13005);
                    String a = C82863k.m101618a(eVar, 13005, "fail", hashMap2);
                    Log.m105925i("MicroMsg.JsApiNFCSendHCEResponseCommand", "alvinluo sendHCEMessage callback json: %s", a);
                    if (fVar != null) {
                        fVar.mo109647a(i2, a);
                        return;
                    }
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putString("key_apdu_command", optString);
                HCEEventLogic.m101594a(fVar.getAppId(), 32, bundle);
                hashMap2.put("errCode", 0);
                fVar.mo109647a(i2, C82863k.m101618a(eVar, 0, "ok", hashMap2));
                return;
            }
            C82855e eVar2 = C82855e.this;
            C82381f fVar2 = this.f242291a;
            int i3 = this.f242292b;
            String a2 = C82863k.m101618a(eVar2, i, "fail: " + str, hashMap);
            Log.m105925i("MicroMsg.JsApiNFCSendHCEResponseCommand", "alvinluo sendHCEMessage callback json: %s", a2);
            if (fVar2 != null) {
                fVar2.mo109647a(i3, a2);
            }
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        mo115068w(new C82856a(fVar, i, jSONObject), false);
    }
}
