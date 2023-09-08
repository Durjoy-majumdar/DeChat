package yl0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82560l0;
import com.tencent.p014mm.plugin.appbrand.jsapi.nfc.C82863k;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Map;
import org.json.JSONObject;
import p224ra.C89909e;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C90364q0;
import zl0.C91774e;
import zl0.C91789o;

/* renamed from: yl0.a */
public abstract class C91476a extends C82268c<C82381f> {

    /* renamed from: g */
    public final C32228q<C91774e, String, C32226l<? super C91789o<C13598b0>, C13598b0>, C13598b0> f262276g;

    /* renamed from: yl0.a$a */
    public static final class C91477a extends C87413o implements C32226l<C91789o<C13598b0>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C82381f f262277d;

        /* renamed from: e */
        public final /* synthetic */ int f262278e;

        /* renamed from: f */
        public final /* synthetic */ C91476a f262279f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C91477a(C82381f fVar, int i, C91476a aVar) {
            super(1);
            this.f262277d = fVar;
            this.f262278e = i;
            this.f262279f = aVar;
        }

        public Object invoke(Object obj) {
            C91789o oVar = (C91789o) obj;
            C87412m.m108594g(oVar, "result");
            Log.m105918d("MicroMsg.AppBrand.AbsJsApiNFCConnectClose", "transceive, result: " + oVar);
            if (oVar instanceof C91789o.C91791b) {
                this.f262277d.mo109647a(this.f262278e, C82863k.m101618a(this.f262279f, 0, "ok", (Map<String, ? extends Object>) null));
            } else if (oVar instanceof C91789o.C91790a) {
                C82381f fVar = this.f262277d;
                int i = this.f262278e;
                C91476a aVar = this.f262279f;
                C91789o.C91790a aVar2 = (C91789o.C91790a) oVar;
                int i2 = aVar2.f262869a;
                fVar.mo109647a(i, C82863k.m101618a(aVar, i2, "fail:" + aVar2.f262870b, C90364q0.m113146e(new C13604l("errCode", Integer.valueOf(aVar2.f262869a)))));
            }
            return C13598b0.f38549a;
        }
    }

    public C91476a(C32228q<? super C91774e, ? super String, ? super C32226l<? super C91789o<C13598b0>, C13598b0>, C13598b0> qVar) {
        C87412m.m108594g(qVar, "function");
        this.f262276g = qVar;
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        if (fVar == null) {
            Log.m105928w("MicroMsg.AppBrand.AbsJsApiNFCConnectClose", "invoke, env is null");
        } else if (jSONObject == null) {
            Log.m105928w("MicroMsg.AppBrand.AbsJsApiNFCConnectClose", "invoke, data is null");
            fVar.mo109647a(i, C82863k.m101618a(this, 13011, "fail:invalid parameter", C90364q0.m113146e(new C13604l("errCode", 13011))));
        } else {
            C82560l0 l0Var = (C82560l0) C89909e.m112436a(C82560l0.class);
            if (l0Var == null || l0Var.mo56895eO()) {
                C91774e a = C91774e.f262832c.mo125637a(fVar);
                Log.m105918d("MicroMsg.AppBrand.AbsJsApiNFCConnectClose", "invoke, appId: " + fVar.getAppId() + ", data: " + jSONObject);
                try {
                    String string = jSONObject.getString("tech");
                    C32228q<C91774e, String, C32226l<? super C91789o<C13598b0>, C13598b0>, C13598b0> qVar = this.f262276g;
                    C87412m.m108593f(string, "tech");
                    qVar.invoke(a, string, new C91477a(fVar, i, this));
                } catch (Exception unused) {
                    Log.m105928w("MicroMsg.AppBrand.AbsJsApiNFCConnectClose", "parse tech failed");
                    fVar.mo109647a(i, C82863k.m101618a(this, 13011, "fail:invalid parameter", C90364q0.m113146e(new C13604l("errCode", 13011))));
                }
            } else {
                fVar.mo109647a(i, C82863k.m101618a(this, 13019, "fail:user is not authorized", C90364q0.m113146e(new C13604l("errCode", 13019))));
            }
        }
    }
}
