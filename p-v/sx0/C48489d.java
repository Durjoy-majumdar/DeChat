package sx0;

import android.webkit.ValueCallback;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40480g;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40714i;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40717k0;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMSlotKt;
import ea3.C45590f;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import iy0.C46353a;
import kj2.C117407d;
import org.json.JSONArray;
import org.json.JSONObject;
import p822sa.C48307d;
import p822sa.C48309f;
import p822sa.C48319p;
import rx3.C13598b0;
import s73.C48262e;
import s73.C48273f;
import t73.C48555a;
import t73.C48556b;
import t73.C48558d;
import t73.C48571o;
import ux0.C52633e;
import ux0.C52634f;
import z04.C112551y;
import zt3.C119157j;

/* renamed from: sx0.d */
public final class C48489d extends C48571o {

    /* renamed from: i */
    public static final /* synthetic */ int f129685i = 0;

    /* renamed from: c */
    public C40480g f129686c;

    /* renamed from: d */
    public boolean f129687d;

    /* renamed from: e */
    public final C48273f f129688e = new C48273f(1477);

    /* renamed from: f */
    public final C48262e f129689f = new C48262e(1696, C48262e.C48272j.Client);

    /* renamed from: g */
    public String f129690g = "__Game_Prefetcher_FakeAppId";

    /* renamed from: h */
    public final String f129691h = "GameWebPrefetcher";

    /* renamed from: sx0.d$a */
    public static final class C36892a {
        public C36892a(C8480h hVar) {
        }
    }

    /* renamed from: sx0.d$b */
    public static final class C36893b implements C48488b {
        /* renamed from: I0 */
        public void mo60865I0(String str, String str2, ValueCallback<String> valueCallback) {
            C87412m.m108594g(str, "eventType");
            C87412m.m108594g(str2, "event");
        }

        public void error(String str) {
            if (str != null) {
                Log.m105921e("MicroMsg.GameWebPrefetcherJsEngineInterceptor", "[game-web-prefetch] js console error: %s", str);
            }
        }

        /* renamed from: u */
        public void mo60867u(String str) {
            if (str != null && Log.getLogLevel() <= 1) {
                Log.m105919d("MicroMsg.GameWebPrefetcherJsEngineInterceptor", "[game-web-prefetch] js console log: %s", str);
            }
        }

        /* renamed from: v */
        public void mo60868v(String str) {
            Log.m105925i("MicroMsg.GameWebPrefetcherJsEngineInterceptor", "[game-web-prefetch] postMessage ignore msg: %s", str);
        }
    }

    /* renamed from: sx0.d$c */
    public static final class C48490c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C48489d f129692d;

        /* renamed from: e */
        public final /* synthetic */ String f129693e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48490c(C48489d dVar, String str) {
            super(0);
            this.f129692d = dVar;
            this.f129693e = str;
        }

        public Object invoke() {
            C48489d dVar = this.f129692d;
            String str = this.f129693e;
            dVar.getClass();
            if (str != null) {
                String i = C40714i.m43960i(str, false);
                C48556b bVar = C48558d.f129901M;
                C40717k0.f109363a.getClass();
                String str2 = str;
                C46353a aVar = new C46353a(str, i, bVar, C40717k0.f109365c, (String) null, (String) null, (Boolean) null, (C48555a) null, false, (String) null, (String) null, 2032, (C8480h) null);
                Log.m105926v("MicroMsg.GameWebPrefetcherJsEngineInterceptor", "[game-web-prefetch] onUrlExposed bizId: " + aVar.mo71762d() + ", webId: " + aVar.f124920b + ", cacheTime: " + aVar.mo71764f() + ", maxCache: " + aVar.mo71772n() + ", url: " + str2);
                if (MMSlotKt.isExpire(aVar.mo71764f(), aVar.mo71772n())) {
                    Log.m105924i("MicroMsg.GameWebPrefetcherJsEngineInterceptor", "[game-web-prefetch] onUrlExposed cache expired");
                    C115669n.INSTANCE.mo160131h(21075, 500, str2, "", 3, 0);
                    JSONObject jSONObject = new JSONObject();
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(str2);
                    C13598b0 b0Var = C13598b0.f38549a;
                    jSONObject.put("pageUrlList", jSONArray);
                    C48319p pVar = C52633e.f146961f;
                    if (pVar != null) {
                        C48307d dVar2 = new C48307d("urlExposed", jSONObject);
                        C48309f fVar = pVar.f129379c;
                        synchronized (fVar) {
                            if (fVar.f129362c) {
                                fVar.f129360a.evaluateJavascript(String.format("if(typeof luggageBridge !== 'undefined') luggageBridge._processMessageFromJava(%s);", new Object[]{dVar2.toString()}), (ValueCallback<String>) null);
                            } else {
                                fVar.f129361b.add(dVar2);
                            }
                        }
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    static {
        new C36892a((C8480h) null);
        Log.m105924i("MicroMsg.GameWebPrefetcherJsEngineInterceptor", "initGameWebPrefetcherJsEngineInterceptor open: true");
    }

    /* renamed from: a */
    public boolean mo73123a(int i, String str, C32226l<? super Boolean, C13598b0> lVar) {
        C32226l<? super Boolean, C13598b0> lVar2 = lVar;
        C87412m.m108594g(lVar2, "onCompleted");
        if (i != 2) {
            return false;
        }
        if (this.f129686c == null) {
            this.f129686c = mo73188e().mo115378X();
            Log.m105924i("MicroMsg.GameWebPrefetcherJsEngineInterceptor", "initJsContext for game");
            C40480g gVar = this.f129686c;
            if (gVar == null) {
                Log.m105920e("MicroMsg.GameWebPrefetcherJsEngineInterceptor", "initJsContext not created");
                lVar2.invoke(Boolean.FALSE);
            } else {
                String str2 = null;
                try {
                    C48487a aVar = new C48487a(new C36893b());
                    C40480g gVar2 = this.f129686c;
                    C87412m.m108591d(gVar2);
                    aVar.mo72687a(gVar2);
                    this.f129688e.mo73006a(new C48273f.C48276c());
                    this.f129689f.mo73005a(new C48262e.C48269g());
                    try {
                        gVar.setJsExceptionHandler(new C48491e(gVar, this));
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.GameWebPrefetcherJsEngineInterceptor", e, "setJsExceptionHandler", new Object[0]);
                        this.f129689f.mo73005a(new C48262e.C48265c());
                        String str3 = this.f129690g;
                        String str4 = this.f129691h;
                        String message = e.getMessage();
                        C117407d.INSTANCE.mo160131h(20821, str3, str4, message != null ? C112551y.m153815o(message, ',', '.', false, 4, (Object) null) : null);
                        lVar2.invoke(Boolean.FALSE);
                    }
                    String str5 = this.f129690g;
                    String str6 = this.f129691h;
                    C52634f fVar = C52634f.f146964f;
                    C87412m.m108594g(str5, "appId");
                    C87412m.m108594g(str6, "contextName");
                    C52633e.f146962g = str5;
                    C52633e.f146963h = str6;
                    C40480g gVar3 = this.f129686c;
                    C87412m.m108591d(gVar3);
                    C52634f.m58974f(gVar3, str, new C36895g(this, lVar2), this.f129689f);
                    this.f129688e.mo73006a(new C48273f.C48277d());
                    this.f129689f.mo73005a(new C48262e.C48270h());
                } catch (Exception e2) {
                    this.f129688e.mo73006a(new C48273f.C48274a());
                    this.f129689f.mo73005a(new C48262e.C48264b());
                    String str7 = this.f129690g;
                    String str8 = this.f129691h;
                    String message2 = e2.getMessage();
                    if (message2 != null) {
                        str2 = C112551y.m153815o(message2, ',', '.', false, 4, (Object) null);
                    }
                    C117407d.INSTANCE.mo160131h(20821, str7, str8, str2);
                    lVar2.invoke(Boolean.FALSE);
                }
            }
        } else {
            lVar2.invoke(Boolean.TRUE);
        }
        return true;
    }

    /* renamed from: b */
    public boolean mo63601b(String str, String str2, String str3, String str4) {
        C87412m.m108594g(str3, "event");
        if (!(str == null || str.length() == 0)) {
            return false;
        }
        if (str2 != null && !C45590f.m50648h(str2)) {
            return false;
        }
        if (!this.f129687d) {
            Log.m105920e("MicroMsg.GameWebPrefetcherJsEngineInterceptor", "dispatchEvent jsContext not init url: " + str2 + ", event: " + str3);
            return false;
        }
        Log.m105927v("MicroMsg.GameWebPrefetcherJsEngineInterceptor", "[game-web-prefetch] dispatchEvent event: %s, data: %s", str3, str4);
        if (C87412m.m108589b(str3, "urlExposed")) {
            ((C119157j) C119157j.f356862d).mo183876g(new C36891c(new C48490c(this, str2)), "MicroMsg.GameWebPrefetcherJsEngineInterceptor");
            return true;
        }
        if (str4 == null) {
            str4 = "";
        }
        JSONObject jSONObject = new JSONObject(str4);
        C48319p pVar = C52633e.f146961f;
        if (pVar != null) {
            C48307d dVar = new C48307d(str3, jSONObject);
            C48309f fVar = pVar.f129379c;
            synchronized (fVar) {
                if (fVar.f129362c) {
                    fVar.f129360a.evaluateJavascript(String.format("if(typeof luggageBridge !== 'undefined') luggageBridge._processMessageFromJava(%s);", new Object[]{dVar.toString()}), (ValueCallback<String>) null);
                } else {
                    fVar.f129361b.add(dVar);
                }
            }
        }
        return true;
    }
}
