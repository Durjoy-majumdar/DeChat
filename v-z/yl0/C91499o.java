package yl0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82560l0;
import com.tencent.p014mm.plugin.appbrand.jsapi.nfc.C82863k;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Map;
import org.json.JSONObject;
import p224ra.C89909e;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import sx3.C90364q0;
import xl0.C91283d;
import zl0.C91774e;
import zl0.C91786l;
import zl0.C91789o;
import zt3.C119157j;

/* renamed from: yl0.o */
public final class C91499o extends C82268c<C82381f> {
    public static final int CTRL_INDEX = 789;
    public static final String NAME = "startNFCDiscovery";

    /* renamed from: g */
    public final C13601g f262305g = C36568h.m40985a(C91501b.f262310d);

    /* renamed from: yl0.o$a */
    public static final class C91500a extends C87413o implements C32226l<C91789o<C13598b0>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C82381f f262306d;

        /* renamed from: e */
        public final /* synthetic */ int f262307e;

        /* renamed from: f */
        public final /* synthetic */ C91499o f262308f;

        /* renamed from: g */
        public final /* synthetic */ C91774e f262309g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C91500a(C82381f fVar, int i, C91499o oVar, C91774e eVar) {
            super(1);
            this.f262306d = fVar;
            this.f262307e = i;
            this.f262308f = oVar;
            this.f262309g = eVar;
        }

        public Object invoke(Object obj) {
            C91789o oVar = (C91789o) obj;
            C87412m.m108594g(oVar, "result");
            Log.m105918d("MicroMsg.AppBrand.JsApiStartNFCDiscovery", "invoke, result: " + oVar);
            if (oVar instanceof C91789o.C91791b) {
                this.f262306d.mo109647a(this.f262307e, C82863k.m101618a(this.f262308f, 0, "ok", (Map<String, ? extends Object>) null));
                C91774e eVar = this.f262309g;
                eVar.f262836b.mo115090c(new C91498n(this.f262306d, this.f262308f));
            } else if (oVar instanceof C91789o.C91790a) {
                C82381f fVar = this.f262306d;
                int i = this.f262307e;
                C91499o oVar2 = this.f262308f;
                C91789o.C91790a aVar = (C91789o.C91790a) oVar;
                int i2 = aVar.f262869a;
                fVar.mo109647a(i, C82863k.m101618a(oVar2, i2, "fail:" + aVar.f262870b, C90364q0.m113146e(new C13604l("errCode", Integer.valueOf(aVar.f262869a)))));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: yl0.o$b */
    public static final class C91501b extends C87413o implements C32224a<C91480d> {

        /* renamed from: d */
        public static final C91501b f262310d = new C91501b();

        public C91501b() {
            super(0);
        }

        public Object invoke() {
            return new C91480d();
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        if (fVar != null) {
            if (!C91283d.m114512b()) {
                fVar.mo109647a(i, C82863k.m101618a(this, 13001, "fail:system NFC switch not opened", C90364q0.m113146e(new C13604l("errCode", 13001))));
                return;
            }
            C82560l0 l0Var = (C82560l0) C89909e.m112436a(C82560l0.class);
            if (l0Var == null || l0Var.mo56895eO()) {
                C91774e a = C91774e.f262832c.mo125637a(fVar);
                if (jSONObject != null) {
                    try {
                        a.f262836b.mo115093f(jSONObject.getBoolean("requireForegroundDispatch"));
                    } catch (Exception unused) {
                        Log.m105918d("MicroMsg.AppBrand.JsApiStartNFCDiscovery", "parse requireForegroundDispatch failed");
                    }
                }
                C91500a aVar = new C91500a(fVar, i, this, a);
                Log.m105918d("MicroMsg.AppBrand.NFCReadWriteManager", NAME);
                ((C119157j) C119157j.f356862d).mo183895z(new C91786l(a, aVar));
                return;
            }
            fVar.mo109647a(i, C82863k.m101618a(this, 13019, "fail:user is not authorized", C90364q0.m113146e(new C13604l("errCode", 13019))));
        }
    }
}
