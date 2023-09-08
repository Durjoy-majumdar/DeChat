package yl0;

import android.nfc.NdefMessage;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82560l0;
import com.tencent.p014mm.plugin.appbrand.jsapi.nfc.C82863k;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p224ra.C89909e;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C90364q0;
import zl0.C91774e;
import zl0.C91787m;
import zl0.C91789o;
import zt3.C119157j;

/* renamed from: yl0.p */
public final class C91502p extends C82268c<C82381f> {
    public static final int CTRL_INDEX = 794;
    public static final String NAME = "stopNFCDiscovery";

    /* renamed from: yl0.p$a */
    public static final class C91503a extends C87413o implements C32226l<C91789o<C13598b0>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C82381f f262311d;

        /* renamed from: e */
        public final /* synthetic */ int f262312e;

        /* renamed from: f */
        public final /* synthetic */ C91502p f262313f;

        /* renamed from: g */
        public final /* synthetic */ C91774e f262314g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C91503a(C82381f fVar, int i, C91502p pVar, C91774e eVar) {
            super(1);
            this.f262311d = fVar;
            this.f262312e = i;
            this.f262313f = pVar;
            this.f262314g = eVar;
        }

        public Object invoke(Object obj) {
            C91789o oVar = (C91789o) obj;
            C87412m.m108594g(oVar, "result");
            Log.m105918d("MicroMsg.AppBrand.JsApiStopNFCDiscovery", "stopNFCDiscovery, result: " + oVar);
            if (oVar instanceof C91789o.C91791b) {
                this.f262311d.mo109647a(this.f262312e, C82863k.m101618a(this.f262313f, 0, "ok", (Map<String, ? extends Object>) null));
                this.f262314g.f262836b.mo115090c((C32228q<? super byte[], ? super List<String>, ? super List<NdefMessage>, C13598b0>) null);
            } else if (oVar instanceof C91789o.C91790a) {
                C82381f fVar = this.f262311d;
                int i = this.f262312e;
                C91502p pVar = this.f262313f;
                C91789o.C91790a aVar = (C91789o.C91790a) oVar;
                int i2 = aVar.f262869a;
                fVar.mo109647a(i, C82863k.m101618a(pVar, i2, "fail:" + aVar.f262870b, C90364q0.m113146e(new C13604l("errCode", Integer.valueOf(aVar.f262869a)))));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        if (fVar != null) {
            C82560l0 l0Var = (C82560l0) C89909e.m112436a(C82560l0.class);
            if (l0Var == null || l0Var.mo56895eO()) {
                C91774e a = C91774e.f262832c.mo125637a(fVar);
                C91503a aVar = new C91503a(fVar, i, this, a);
                Log.m105918d("MicroMsg.AppBrand.NFCReadWriteManager", NAME);
                ((C119157j) C119157j.f356862d).mo183895z(new C91787m(a, aVar));
                return;
            }
            fVar.mo109647a(i, C82863k.m101618a(this, 13019, "fail:user is not authorized", C90364q0.m113146e(new C13604l("errCode", 13019))));
        }
    }
}
