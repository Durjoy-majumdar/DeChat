package com.tencent.p014mm.plugin.appbrand.jsapi.nfc;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.nfc.JsApiAppBrandNFCBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.nfc.c */
public class C82852c extends JsApiAppBrandNFCBase {
    public static final int CTRL_INDEX = 358;
    public static final String NAME = "getHCEState";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.nfc.c$a */
    public class C82853a implements JsApiAppBrandNFCBase.C82847a {

        /* renamed from: a */
        public final /* synthetic */ C82381f f242288a;

        /* renamed from: b */
        public final /* synthetic */ int f242289b;

        public C82853a(C82381f fVar, int i) {
            this.f242288a = fVar;
            this.f242289b = i;
        }

        /* renamed from: a */
        public void mo115071a(int i, String str) {
            Log.m105925i("MicroMsg.JsApiGetHCEState", "alvinluo checkIsSupport onResult errCode: %d, errMsg: %s", Integer.valueOf(i), str);
            HashMap hashMap = new HashMap();
            hashMap.put("errCode", Integer.valueOf(i));
            if (i == 0) {
                this.f242288a.mo109647a(this.f242289b, C82863k.m101618a(C82852c.this, i, "ok", hashMap));
                return;
            }
            C82381f fVar = this.f242288a;
            int i2 = this.f242289b;
            C82852c cVar = C82852c.this;
            fVar.mo109647a(i2, C82863k.m101618a(cVar, i, "fail " + str, hashMap));
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        mo115068w(new C82853a(fVar, i), true);
    }
}
