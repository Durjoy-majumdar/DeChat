package yl0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82560l0;
import com.tencent.p014mm.plugin.appbrand.jsapi.nfc.C82863k;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import org.json.JSONObject;
import p224ra.C89909e;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C90364q0;
import zl0.C91774e;
import zl0.C91783i;
import zl0.C91789o;
import zt3.C119157j;

/* renamed from: yl0.j */
public final class C91491j extends C82268c<C82381f> {
    public static final int CTRL_INDEX = 791;
    public static final String NAME = "NFCGetMaxTransceiveLength";

    /* renamed from: yl0.j$a */
    public static final class C91492a extends C87413o implements C32226l<C91789o<Integer>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C82381f f262294d;

        /* renamed from: e */
        public final /* synthetic */ int f262295e;

        /* renamed from: f */
        public final /* synthetic */ C91491j f262296f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C91492a(C82381f fVar, int i, C91491j jVar) {
            super(1);
            this.f262294d = fVar;
            this.f262295e = i;
            this.f262296f = jVar;
        }

        public Object invoke(Object obj) {
            C91789o oVar = (C91789o) obj;
            C87412m.m108594g(oVar, "result");
            Log.m105918d("MicroMsg.AppBrand.JsApiNFCGetMaxTransceiveLength", "getMaxTransceiveLength, result: " + oVar);
            if (oVar instanceof C91789o.C91791b) {
                this.f262294d.mo109647a(this.f262295e, C82863k.m101618a(this.f262296f, 0, "ok", C90364q0.m113146e(new C13604l("length", ((C91789o.C91791b) oVar).f262871a))));
            } else if (oVar instanceof C91789o.C91790a) {
                C82381f fVar = this.f262294d;
                int i = this.f262295e;
                C91491j jVar = this.f262296f;
                C91789o.C91790a aVar = (C91789o.C91790a) oVar;
                int i2 = aVar.f262869a;
                fVar.mo109647a(i, C82863k.m101618a(jVar, i2, "fail:" + aVar.f262870b, C90364q0.m113146e(new C13604l("errCode", Integer.valueOf(aVar.f262869a)))));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        if (fVar == null) {
            Log.m105928w("MicroMsg.AppBrand.JsApiNFCGetMaxTransceiveLength", "invoke, env is null");
        } else if (jSONObject == null) {
            Log.m105928w("MicroMsg.AppBrand.JsApiNFCGetMaxTransceiveLength", "invoke, data is null");
            fVar.mo109647a(i, C82863k.m101618a(this, 13011, "fail:invalid parameter", C90364q0.m113146e(new C13604l("errCode", 13011))));
        } else {
            C82560l0 l0Var = (C82560l0) C89909e.m112436a(C82560l0.class);
            if (l0Var == null || l0Var.mo56895eO()) {
                C91774e a = C91774e.f262832c.mo125637a(fVar);
                Log.m105924i("MicroMsg.AppBrand.JsApiNFCGetMaxTransceiveLength", "invoke, appId: " + fVar.getAppId() + ", data: " + jSONObject);
                try {
                    String string = jSONObject.getString("tech");
                    C87412m.m108593f(string, "tech");
                    C91492a aVar = new C91492a(fVar, i, this);
                    Log.m105918d("MicroMsg.AppBrand.NFCReadWriteManager", "getMaxTransceiveLength, techName: " + string);
                    ((C119157j) C119157j.f356862d).mo183876g(new C91783i(a, aVar, string), "NFC-IO");
                } catch (Exception unused) {
                    Log.m105928w("MicroMsg.AppBrand.JsApiNFCGetMaxTransceiveLength", "parse tech failed");
                    fVar.mo109647a(i, C82863k.m101618a(this, 13011, "fail:invalid parameter", C90364q0.m113146e(new C13604l("errCode", 13011))));
                }
            } else {
                fVar.mo109647a(i, C82863k.m101618a(this, 13019, "fail:user is not authorized", C90364q0.m113146e(new C13604l("errCode", 13019))));
            }
        }
    }
}
