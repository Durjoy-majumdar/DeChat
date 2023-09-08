package yl0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82560l0;
import com.tencent.p014mm.plugin.appbrand.jsapi.nfc.C82863k;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Map;
import org.json.JSONObject;
import p224ra.C89909e;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C90364q0;
import zl0.C91774e;
import zl0.C91785k;
import zl0.C91789o;
import zt3.C119157j;

/* renamed from: yl0.l */
public final class C91494l extends C82268c<C82381f> {
    public static final int CTRL_INDEX = 814;
    public static final String NAME = "NFCSetTimeout";

    /* renamed from: yl0.l$a */
    public static final class C91495a extends C87413o implements C32226l<C91789o<C13598b0>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C82381f f262297d;

        /* renamed from: e */
        public final /* synthetic */ int f262298e;

        /* renamed from: f */
        public final /* synthetic */ C91494l f262299f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C91495a(C82381f fVar, int i, C91494l lVar) {
            super(1);
            this.f262297d = fVar;
            this.f262298e = i;
            this.f262299f = lVar;
        }

        public Object invoke(Object obj) {
            C91789o oVar = (C91789o) obj;
            C87412m.m108594g(oVar, "result");
            Log.m105918d("MicroMsg.AppBrand.JsApiNFCSetTimeout", "transceive, result: " + oVar);
            if (oVar instanceof C91789o.C91791b) {
                this.f262297d.mo109647a(this.f262298e, C82863k.m101618a(this.f262299f, 0, "ok", (Map<String, ? extends Object>) null));
            } else if (oVar instanceof C91789o.C91790a) {
                C82381f fVar = this.f262297d;
                int i = this.f262298e;
                C91494l lVar = this.f262299f;
                C91789o.C91790a aVar = (C91789o.C91790a) oVar;
                int i2 = aVar.f262869a;
                fVar.mo109647a(i, C82863k.m101618a(lVar, i2, "fail:" + aVar.f262870b, C90364q0.m113146e(new C13604l("errCode", Integer.valueOf(aVar.f262869a)))));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        if (fVar == null) {
            Log.m105928w("MicroMsg.AppBrand.JsApiNFCSetTimeout", "invoke, env is null");
        } else if (jSONObject == null) {
            Log.m105928w("MicroMsg.AppBrand.JsApiNFCSetTimeout", "invoke, data is null");
            fVar.mo109647a(i, C82863k.m101618a(this, 13011, "fail:invalid parameter", C90364q0.m113146e(new C13604l("errCode", 13011))));
        } else {
            C82560l0 l0Var = (C82560l0) C89909e.m112436a(C82560l0.class);
            if (l0Var == null || l0Var.mo56895eO()) {
                C91774e a = C91774e.f262832c.mo125637a(fVar);
                Log.m105918d("MicroMsg.AppBrand.JsApiNFCSetTimeout", "invoke, appId: " + fVar.getAppId() + ", data: " + jSONObject);
                try {
                    String string = jSONObject.getString("tech");
                    try {
                        int i2 = jSONObject.getInt("timeout");
                        C87412m.m108593f(string, "tech");
                        C91495a aVar = new C91495a(fVar, i, this);
                        Log.m105918d("MicroMsg.AppBrand.NFCReadWriteManager", "setTimeout, techName: " + string + ", timeoutMs: " + i2);
                        ((C119157j) C119157j.f356862d).mo183876g(new C91785k(a, aVar, string, i2), "NFC-IO");
                    } catch (Exception unused) {
                        Log.m105928w("MicroMsg.AppBrand.JsApiNFCSetTimeout", "parse timeout failed");
                        fVar.mo109647a(i, C82863k.m101618a(this, 13011, "fail:invalid parameter", C90364q0.m113146e(new C13604l("errCode", 13011))));
                    }
                } catch (Exception unused2) {
                    Log.m105928w("MicroMsg.AppBrand.JsApiNFCSetTimeout", "parse tech failed");
                    fVar.mo109647a(i, C82863k.m101618a(this, 13011, "fail:invalid parameter", C90364q0.m113146e(new C13604l("errCode", 13011))));
                }
            } else {
                fVar.mo109647a(i, C82863k.m101618a(this, 13019, "fail:user is not authorized", C90364q0.m113146e(new C13604l("errCode", 13019))));
            }
        }
    }
}
