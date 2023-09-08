package yl0;

import am0.C79588a;
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
import zl0.C91782h;
import zl0.C91789o;
import zt3.C119157j;

/* renamed from: yl0.c */
public abstract class C91478c extends C82268c<C82381f> {

    /* renamed from: g */
    public final String f262280g;

    /* renamed from: h */
    public final String f262281h;

    /* renamed from: i */
    public final String f262282i;

    /* renamed from: j */
    public final C32226l<Object, Object> f262283j;

    /* renamed from: yl0.c$a */
    public static final class C91479a extends C87413o implements C32226l<C91789o<Object>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C82381f f262284d;

        /* renamed from: e */
        public final /* synthetic */ int f262285e;

        /* renamed from: f */
        public final /* synthetic */ C91478c f262286f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C91479a(C82381f fVar, int i, C91478c cVar) {
            super(1);
            this.f262284d = fVar;
            this.f262285e = i;
            this.f262286f = cVar;
        }

        public Object invoke(Object obj) {
            C91789o oVar = (C91789o) obj;
            C87412m.m108594g(oVar, "result");
            Log.m105918d("MicroMsg.AppBrand.AbsJsApiNFCTechGetAsync", "invoke, result: " + oVar);
            if (oVar instanceof C91789o.C91791b) {
                C82381f fVar = this.f262284d;
                int i = this.f262285e;
                C91478c cVar = this.f262286f;
                fVar.mo109647a(i, C82863k.m101618a(cVar, 0, "ok", C90364q0.m113146e(new C13604l(cVar.f262282i, cVar.f262283j.invoke(((C91789o.C91791b) oVar).f262871a)))));
            } else if (oVar instanceof C91789o.C91790a) {
                C82381f fVar2 = this.f262284d;
                int i2 = this.f262285e;
                C91478c cVar2 = this.f262286f;
                C91789o.C91790a aVar = (C91789o.C91790a) oVar;
                int i3 = aVar.f262869a;
                fVar2.mo109647a(i2, C82863k.m101618a(cVar2, i3, "fail:" + aVar.f262870b, C90364q0.m113146e(new C13604l("errCode", Integer.valueOf(aVar.f262869a)))));
            }
            return C13598b0.f38549a;
        }
    }

    public C91478c(String str, String str2, String str3, C32226l<Object, ? extends Object> lVar) {
        C87412m.m108594g(str, "techName");
        C87412m.m108594g(str2, "function");
        C87412m.m108594g(str3, "resultKey");
        C87412m.m108594g(lVar, "retConverter");
        this.f262280g = str;
        this.f262281h = str2;
        this.f262282i = str3;
        this.f262283j = lVar;
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        if (fVar == null) {
            Log.m105928w("MicroMsg.AppBrand.AbsJsApiNFCTechGetAsync", "invoke, env is null");
            return;
        }
        C82560l0 l0Var = (C82560l0) C89909e.m112436a(C82560l0.class);
        if (l0Var == null || l0Var.mo56895eO()) {
            C91774e a = C91774e.f262832c.mo125637a(fVar);
            Log.m105924i("MicroMsg.AppBrand.AbsJsApiNFCTechGetAsync", "invoke, appId: " + fVar.getAppId());
            String str = this.f262280g;
            String str2 = this.f262281h;
            C91479a aVar = new C91479a(fVar, i, this);
            C87412m.m108594g(str, "techName");
            C87412m.m108594g(str2, "function");
            Log.m105918d("MicroMsg.AppBrand.NFCReadWriteManager", "execTechLogicAsync, techName: " + str + ", function: " + str2 + ", params: " + null);
            ((C119157j) C119157j.f356862d).mo183876g(new C91782h(a, aVar, str, str2, (C79588a) null), "NFC-IO");
            return;
        }
        fVar.mo109647a(i, C82863k.m101618a(this, 13019, "fail:user is not authorized", C90364q0.m113146e(new C13604l("errCode", 13019))));
    }
}
