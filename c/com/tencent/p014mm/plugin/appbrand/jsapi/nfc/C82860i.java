package com.tencent.p014mm.plugin.appbrand.jsapi.nfc;

import android.os.Bundle;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.nfc.JsApiAppBrandNFCBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.nfc.i */
public class C82860i extends JsApiAppBrandNFCBase {
    public static final int CTRL_INDEX = 353;
    public static final String NAME = "stopHCE";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.nfc.i$a */
    public class C82861a implements JsApiAppBrandNFCBase.C82847a {

        /* renamed from: a */
        public final /* synthetic */ C82381f f242298a;

        /* renamed from: b */
        public final /* synthetic */ int f242299b;

        public C82861a(C82381f fVar, int i) {
            this.f242298a = fVar;
            this.f242299b = i;
        }

        /* renamed from: a */
        public void mo115071a(int i, String str) {
            HashMap hashMap = new HashMap();
            hashMap.put("errCode", Integer.valueOf(i));
            if (i == 0) {
                C82860i iVar = C82860i.this;
                C82381f fVar = this.f242298a;
                int i2 = this.f242299b;
                iVar.getClass();
                String appId = fVar.getAppId();
                if (appId != null) {
                    C83231l.m102144e(appId, HCEEventLogic.f242263c);
                } else {
                    String str2 = HCEEventLogic.f242261a;
                }
                HCEEventLogic.m101594a(fVar.getAppId(), 13, (Bundle) null);
                HashMap hashMap2 = new HashMap(2);
                hashMap2.put("errCode", 0);
                String a = C82863k.m101618a(iVar, 0, "ok", hashMap2);
                Log.m105925i("MicroMsg.JsApiNFCStartHCE", "alvinluo stopHCE callback result: %s", a);
                fVar.mo109647a(i2, a);
                return;
            }
            C82860i iVar2 = C82860i.this;
            C82381f fVar2 = this.f242298a;
            int i3 = this.f242299b;
            String a2 = C82863k.m101618a(iVar2, i, "fail: " + str, hashMap);
            Log.m105925i("MicroMsg.JsApiNFCStartHCE", "alvinluo stopHCE callback result: %s", a2);
            if (fVar2 != null) {
                fVar2.mo109647a(i3, a2);
            }
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        mo115068w(new C82861a(fVar, i), false);
    }
}
