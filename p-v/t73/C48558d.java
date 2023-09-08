package t73;

import android.webkit.ValueCallback;
import androidx.camera.core.FocusMeteringAction;
import c30.C104289g;
import com.tencent.p014mm.app.C114668z;
import com.tencent.p014mm.plugin.appbrand.appcache.C40427l0;
import com.tencent.p014mm.plugin.appbrand.appcache.C81291m0;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40480g;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83148d;
import com.tencent.p014mm.plugin.webview.core.C43520v;
import com.tencent.p014mm.plugin.webview.core.C5857x;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMKVSlotManager;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32228q;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedDeque;
import kotlin.Result;
import lu3.C34379c;
import p248ug.C14184u0;
import q73.C35796c0;
import q73.C35812s;
import r73.C47934j;
import r73.C47937l;
import r73.C47943r;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import s73.C48255c;
import s73.C48273f;
import sx3.C22415w0;
import sx3.C90364q0;
import te3.C51011qt1;
import te3.C51154rt1;
import wx3.C15601d;
import wx3.C66218h;
import xx3.C66447b;
import zt3.C119157j;

/* renamed from: t73.d */
public abstract class C48558d extends C48255c {

    /* renamed from: H */
    public static final C48560b f129896H = new C48560b((C8480h) null);

    /* renamed from: I */
    public static final Set<String> f129897I = C22415w0.m26092a("transfer-encoding");

    /* renamed from: J */
    public static final MMKVSlotManager f129898J;

    /* renamed from: K */
    public static final C13601g<Boolean> f129899K = C36568h.m40985a(C13837c.f38978d);

    /* renamed from: L */
    public static final C13601g<Boolean> f129900L = C36568h.m40985a(C13838d.f38979d);

    /* renamed from: M */
    public static final C48556b f129901M = new C48556b("wcf://WebPrefetchContent/");

    /* renamed from: N */
    public static final C48556b f129902N = new C48556b("wcf://WebPrefetchResource/");

    /* renamed from: P */
    public static final C48556b f129903P = new C48556b("wcf://WebPrefetchManifest/");

    /* renamed from: Q */
    public static final C48556b f129904Q = new C48556b("wcf://WebPrefetchResConfig/");

    /* renamed from: R */
    public static final Map<String, String> f129905R = C90364q0.m113147f(new C13604l("js", "application/javascript"), new C13604l("json", "application/json"));

    /* renamed from: S */
    public static C34379c<?> f129906S;

    /* renamed from: T */
    public static HashMap<String, C40427l0> f129907T = new HashMap<>();

    /* renamed from: B */
    public final String f129908B = "MicroMsg.WebPrefetcherJsEngine";

    /* renamed from: C */
    public final ConcurrentLinkedDeque<C48571o> f129909C = new ConcurrentLinkedDeque<>();

    /* renamed from: D */
    public final C13601g f129910D = C36568h.m40985a(C36975i.f98059d);

    /* renamed from: E */
    public final C48273f f129911E = new C48273f(1477);

    /* renamed from: F */
    public C114668z.C104589a f129912F;

    /* renamed from: G */
    public final HashMap<String, Integer> f129913G;

    /* renamed from: t73.d$c */
    public static final class C13837c extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C13837c f38978d = new C13837c();

        public C13837c() {
            super(0);
        }

        public Object invoke() {
            C43520v.C43521b bVar = C43520v.f117665a;
            boolean z = true;
            int i = C5857x.m5577a().getInt("prefetchUsePkg", C14184u0.m13519a() ? 1 : -1);
            if (i == 0) {
                return Boolean.FALSE;
            }
            if (i == 1) {
                return Boolean.TRUE;
            }
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_open_prefetcher_use_pkg, 0) != 1) {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            boolean booleanValue = valueOf.booleanValue();
            C48560b bVar2 = C48558d.f129896H;
            Log.m105924i("MicroMsg.WebPrefetcherJsEngine", "prefetchUsePkgOpen open " + booleanValue);
            return valueOf;
        }
    }

    /* renamed from: t73.d$d */
    public static final class C13838d extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C13838d f38979d = new C13838d();

        public C13838d() {
            super(0);
        }

        public Object invoke() {
            boolean z = true;
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_webview_prefetcher_enable_jscore_recycle_background_new, 1) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: t73.d$e */
    public static final class C36973e extends C87413o implements C32228q<Integer, Integer, C40427l0, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ String f98056d;

        /* renamed from: e */
        public final /* synthetic */ C48558d f98057e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36973e(String str, C48558d dVar) {
            super(3);
            this.f98056d = str;
            this.f98057e = dVar;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            int intValue = ((Number) obj).intValue();
            int intValue2 = ((Number) obj2).intValue();
            C40427l0 l0Var = (C40427l0) obj3;
            C87412m.m108594g(l0Var, "resPkg");
            return Boolean.valueOf(intValue2 > intValue && C35812s.f95615a.mo60423d(this.f98056d, l0Var, this.f98057e.mo72996G1()));
        }
    }

    /* renamed from: t73.d$h */
    public static final class C36974h extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C15601d<String> f98058d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36974h(C15601d<? super String> dVar) {
            super(1);
            this.f98058d = dVar;
        }

        public Object invoke(Object obj) {
            this.f98058d.resumeWith(Result.m168114constructorimpl((String) obj));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: t73.d$i */
    public static final class C36975i extends C87413o implements C32224a<C40427l0> {

        /* renamed from: d */
        public static final C36975i f98059d = new C36975i();

        public C36975i() {
            super(0);
        }

        public Object invoke() {
            C48255c.C36632b bVar = C48255c.f129277x;
            C35812s sVar = C35812s.f95615a;
            boolean z = true;
            if (sVar.mo60422c() != 1) {
                z = false;
            }
            return C48255c.C36632b.m41016b(bVar, bVar.mo60770a("prefetcher.wspkg", z, sVar.mo60421b("wx97b7aebac2183fd2"), "wx97b7aebac2183fd2"), C36977n.f98061d, (C32228q) null, false, 12, (Object) null);
        }
    }

    /* renamed from: t73.d$a */
    public static final class C48559a extends C114668z.C104589a {

        /* renamed from: d */
        public C34379c<?> f129914d;

        /* renamed from: e */
        public transient boolean f129915e;

        /* renamed from: f */
        public final /* synthetic */ C48558d f129916f;

        public C48559a(C48558d dVar) {
            this.f129916f = dVar;
        }

        public void onAppBackground(String str) {
            C87412m.m108594g(str, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            String str2 = this.f129916f.f129908B;
            Log.m105924i(str2, "onAppBackground delay pause hashCode: " + hashCode());
            this.f129915e = true;
            C34379c<?> cVar = this.f129914d;
            if (cVar != null) {
                cVar.cancel(false);
            }
            this.f129914d = null;
            this.f129914d = ((C119157j) C119157j.f356862d).mo183878i(new C48557c(this.f129916f, this), 30000);
        }

        public void onAppForeground(String str) {
            C87412m.m108594g(str, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            Log.m105924i(this.f129916f.f129908B, "jsEngine resume");
            this.f129915e = false;
            C34379c<?> cVar = this.f129914d;
            if (cVar != null) {
                cVar.cancel(false);
            }
            this.f129914d = null;
            C48558d dVar = this.f129916f;
            if (!dVar.f129285v) {
                dVar.resume();
            }
        }
    }

    /* renamed from: t73.d$b */
    public static final class C48560b {

        /* renamed from: t73.d$b$a */
        public static final class C48561a extends C87413o implements C32228q<Integer, Integer, C40427l0, Boolean> {

            /* renamed from: d */
            public static final C48561a f129917d = new C48561a();

            public C48561a() {
                super(3);
            }

            public Object invoke(Object obj, Object obj2, Object obj3) {
                ((Number) obj).intValue();
                ((Number) obj2).intValue();
                C87412m.m108594g((C40427l0) obj3, "<anonymous parameter 2>");
                return Boolean.TRUE;
            }
        }

        public C48560b(C8480h hVar) {
        }

        /* renamed from: a */
        public final int mo73179a(String str) {
            try {
                MMKVSlotManager mMKVSlotManager = C48558d.f129898J;
                return mMKVSlotManager.decodeInt(str + "-MinBizPkgVersion", 0);
            } catch (Exception e) {
                C48560b bVar = C48558d.f129896H;
                Log.printErrStackTrace("MicroMsg.WebPrefetcherJsEngine", e, "getMinPkgVersion:" + str, new Object[0]);
                return 0;
            }
        }

        /* renamed from: b */
        public final C40427l0 mo73180b(String str, C32224a<? extends C40427l0> aVar) {
            C40427l0 l0Var;
            C40427l0 l0Var2 = null;
            if (str == null) {
                return null;
            }
            synchronized (C48558d.f129907T) {
                l0Var = C48558d.f129907T.get(str);
                if (l0Var == null) {
                    C40427l0 l0Var3 = (C40427l0) aVar.invoke();
                    if (l0Var3 != null) {
                        C48558d.f129907T.put(str, l0Var3);
                        C48560b bVar = C48558d.f129896H;
                        C34379c<?> cVar = C48558d.f129906S;
                        if (cVar != null) {
                            cVar.cancel(false);
                        }
                        C48558d.f129906S = null;
                        C48558d.f129906S = ((C119157j) C119157j.f356862d).mo183878i(C48564g.f129928d, FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
                        l0Var2 = l0Var3;
                    }
                    l0Var = l0Var2;
                }
            }
            return l0Var;
        }

        /* renamed from: c */
        public final C48555a mo73181c(String str) {
            String str2 = str;
            if (!BuildInfo.DEBUG && !BuildInfo.IS_FLAVOR_RED && !WeChatEnvironment.hasDebugger()) {
                return null;
            }
            C48255c.C36632b bVar = C48255c.f129277x;
            C48255c.C36632b.C36633a a = bVar.mo60770a("prefetcher/" + str2 + ".wspkg", true, "", "matchDebugManifest");
            if (C86013q1.m106450k(a.f97384c)) {
                C48560b bVar2 = C48558d.f129896H;
                Log.m105924i("MicroMsg.WebPrefetcherJsEngine", "matchDebugManifest " + str2 + " path=" + a.f97384c);
                try {
                    C104289g gVar = new C104289g(C81291m0.m99666b(C48255c.C36632b.m41016b(bVar, a, C48561a.f129917d, (C32228q) null, false, 4, (Object) null), "/config.json"));
                    C51011qt1 qt12 = new C51011qt1();
                    qt12.f140537d = gVar.optString("domain");
                    C51154rt1 rt12 = new C51154rt1();
                    rt12.f141126d = gVar.optString("path");
                    rt12.f141131i = str2;
                    rt12.f141127e = gVar.optString("manifest");
                    return new C48555a(qt12, rt12, (String) null, 0, 0, true, (String) null, 92, (C8480h) null);
                } catch (Exception e) {
                    C48560b bVar3 = C48558d.f129896H;
                    Log.printErrStackTrace("MicroMsg.WebPrefetcherJsEngine", e, "matchDebugManifest", new Object[0]);
                }
            }
            return null;
        }
    }

    /* renamed from: t73.d$f */
    public static final class C48562f<T> implements ValueCallback {

        /* renamed from: a */
        public final /* synthetic */ C48558d f129918a;

        /* renamed from: b */
        public final /* synthetic */ String f129919b;

        /* renamed from: c */
        public final /* synthetic */ C40480g f129920c;

        /* renamed from: d */
        public final /* synthetic */ String f129921d;

        /* renamed from: e */
        public final /* synthetic */ C32226l<C40480g, C13598b0> f129922e;

        public C48562f(C48558d dVar, String str, C40480g gVar, String str2, String str3, C32226l<? super C40480g, C13598b0> lVar) {
            this.f129918a = dVar;
            this.f129919b = str;
            this.f129920c = gVar;
            this.f129921d = str2;
            this.f129922e = lVar;
        }

        public void onReceiveValue(Object obj) {
            String str = (String) obj;
            this.f129918a.f129913G.put(this.f129919b, Integer.valueOf(this.f129920c.getContextId()));
            String str2 = this.f129918a.f129908B;
            Log.m105924i(str2, "createPrefetcherJsContext end prefetcherId: " + this.f129919b + ", " + this.f129921d + ", " + "/prefetcher.js" + ", contextId: " + this.f129920c.getContextId() + ", " + this.f129920c.hashCode());
            C32226l<C40480g, C13598b0> lVar = this.f129922e;
            if (lVar != null) {
                C40480g gVar = this.f129920c;
                C87412m.m108593f(gVar, "this");
                lVar.invoke(gVar);
            }
        }
    }

    /* renamed from: t73.d$g */
    public static final class C48563g extends C87413o implements C32226l<C40480g, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C48558d f129923d;

        /* renamed from: e */
        public final /* synthetic */ String f129924e;

        /* renamed from: f */
        public final /* synthetic */ String f129925f;

        /* renamed from: g */
        public final /* synthetic */ List<Object> f129926g;

        /* renamed from: h */
        public final /* synthetic */ C32226l<String, C13598b0> f129927h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48563g(C48558d dVar, String str, String str2, List<? extends Object> list, C32226l<? super String, C13598b0> lVar) {
            super(1);
            this.f129923d = dVar;
            this.f129924e = str;
            this.f129925f = str2;
            this.f129926g = list;
            this.f129927h = lVar;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C40480g) obj, "cxt");
            this.f129923d.mo72997H1(this.f129924e, this.f129925f, this.f129926g, this.f129927h);
            return C13598b0.f38549a;
        }
    }

    static {
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("__WebPrefetchLocalData__");
        C87412m.m108593f(mmkv, "getMMKV(\"__WebPrefetchLocalData__\")");
        f129898J = new MMKVSlotManager(mmkv, 15552000);
    }

    public C48558d() {
        C47934j jVar = new C47934j(this);
        C40480g z = mo115383z();
        C87412m.m108593f(z, "mainJsContext");
        jVar.mo72687a(z);
        mo73003x1((C32226l<? super String, C13598b0>) null);
        C48559a aVar = new C48559a(this);
        if (!((Boolean) ((C36570n) f129900L).getValue()).booleanValue()) {
            aVar.alive();
        }
        this.f129912F = aVar;
        this.f129913G = new HashMap<>();
    }

    /* renamed from: B1 */
    public C104289g mo72991B1(String str) {
        C87412m.m108594g(str, "type");
        C104289g k = mo72995F1().getJSONObject("client").getJSONObject(str);
        C87412m.m108593f(k, "vmConfig.getJSONObject(\"…ent\").getJSONObject(type)");
        return k;
    }

    /* renamed from: C1 */
    public C48255c.C36631a mo72992C1(String str) {
        C87412m.m108594g(str, "type");
        return new C48255c.C36631a("wx97b7aebac2183fd2", mo72991B1(str).getLong("idKey"));
    }

    /* renamed from: D1 */
    public String mo72993D1() {
        return "WebPrefetcherJsEngine";
    }

    /* renamed from: E1 */
    public C48273f mo72994E1() {
        return this.f129911E;
    }

    /* renamed from: G1 */
    public C40427l0 mo72996G1() {
        return (C40427l0) this.f129910D.getValue();
    }

    /* renamed from: K1 */
    public void mo73000K1(String str, String str2) {
        C87412m.m108594g(str, StateEvent.Name.MESSAGE);
        C87412m.m108594g(str2, "targetOrigin");
    }

    /* renamed from: N1 */
    public final void mo73174N1(C48571o oVar) {
        C87412m.m108594g(oVar, "interceptor");
        oVar.f129943a = this;
        HashMap<String, Integer> hashMap = this.f129913G;
        C87412m.m108594g(hashMap, "<set-?>");
        oVar.f129944b = hashMap;
        this.f129909C.add(oVar);
    }

    /* renamed from: O1 */
    public final C40427l0 mo73175O1(String str, boolean z) {
        C48255c.C36632b bVar = C48255c.f129277x;
        String str2 = "prefetcher/" + str + ".wspkg";
        boolean z2 = true;
        if (C35796c0.f95588a.mo60408j() != 1) {
            z2 = false;
        }
        return C48255c.C36632b.m41016b(bVar, bVar.mo60770a(str2, z2, C35796c0.m40831h(str), str), new C36973e(str, this), (C32228q) null, z, 4, (Object) null);
    }

    /* renamed from: P1 */
    public abstract void mo63600P1(String str);

    /* renamed from: Q1 */
    public final void mo73176Q1(C40427l0 l0Var, String str, C32226l<? super C40480g, C13598b0> lVar) {
        String str2 = str;
        C32226l<? super C40480g, C13598b0> lVar2 = lVar;
        boolean z = true;
        if (!(str2 == null || str.length() == 0)) {
            C87412m.m108594g(str2, "appId");
            String str3 = "_prefetcher_" + str2;
            if (this.f129913G.containsKey(str3)) {
                Integer num = this.f129913G.get(str3);
                C87412m.m108591d(num);
                C40480g F0 = mo115375F0(num.intValue());
                if (F0 != null) {
                    if (lVar2 != null) {
                        lVar2.invoke(F0);
                        return;
                    }
                    return;
                }
            }
            String f = C81291m0.m99670f(l0Var, "/prefetcher.js");
            if (f.length() <= 0) {
                z = false;
            }
            if (z) {
                C40480g X = mo115378X();
                new C47943r(new C48565h(str3, str2, this)).mo72687a(X);
                new C47937l(new C48569m(this, str2)).mo72687a(X);
                C48255c.m53593z1(this, X, "WebPrefetcher#" + str2, "prefetcher", (C32226l) null, new C48255c.C36631a(str2, mo72991B1("prefetcher").getLong("idKey")), 8, (Object) null);
                ((C83148d) X).evaluateJavascript(f, new C48562f(this, str3, X, str, "/prefetcher.js", lVar));
                return;
            }
            Log.m105928w(this.f129908B, "createPrefetcherJsContext prefetcherJs is empty, appId: " + str2);
        }
    }

    /* renamed from: R1 */
    public final Object mo73177R1(C48555a aVar, String str, List<? extends Object> list, C15601d<? super String> dVar) {
        C66218h hVar = new C66218h(C66447b.m78392b(dVar));
        mo73178S1(aVar, str, list, new C36974h(hVar));
        return hVar.mo90314b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x010c A[Catch:{ Exception -> 0x01f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0118 A[Catch:{ Exception -> 0x01f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x011d A[Catch:{ Exception -> 0x01f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x012b A[Catch:{ Exception -> 0x01f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0174 A[Catch:{ Exception -> 0x01f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0192 A[Catch:{ Exception -> 0x01f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01ab A[Catch:{ Exception -> 0x01f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01cd A[Catch:{ Exception -> 0x01f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01e5 A[Catch:{ Exception -> 0x01f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* renamed from: S1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo73178S1(t73.C48555a r24, java.lang.String r25, java.util.List<? extends java.lang.Object> r26, fy3.C32226l<? super java.lang.String, rx3.C13598b0> r27) {
        /*
            r23 = this;
            r9 = r23
            r10 = r24
            r0 = r25
            r6 = r27
            java.lang.String r7 = "manifest"
            gy3.C87412m.m108594g(r10, r7)
            java.lang.String r1 = "func"
            gy3.C87412m.m108594g(r0, r1)
            java.lang.String r1 = "callback"
            gy3.C87412m.m108594g(r6, r1)
            java.lang.String r1 = r10.f129893g
            if (r1 != 0) goto L_0x003b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = t73.C48572p.m53971b(r24)
            r1.append(r2)
            r2 = 45
            r1.append(r2)
            te3.rt1 r2 = r10.f129888b
            java.lang.String r2 = r2.f141127e
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = t73.C48572p.m53970a(r1)
        L_0x003b:
            r11 = r1
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = r9.f129913G
            boolean r1 = r1.containsKey(r11)
            if (r1 != 0) goto L_0x020d
            t73.d$g r12 = new t73.d$g
            r1 = r12
            r2 = r23
            r3 = r11
            r4 = r25
            r5 = r26
            r6 = r27
            r1.<init>(r2, r3, r4, r5, r6)
            te3.qt1 r0 = r10.f129887a
            java.lang.String r13 = r0.f140537d
            te3.rt1 r0 = r10.f129888b
            java.lang.String r0 = r0.f141127e
            r1 = 1
            r14 = 0
            if (r0 == 0) goto L_0x0068
            boolean r0 = z04.C112551y.m153811k(r0)
            if (r0 == 0) goto L_0x0066
            goto L_0x0068
        L_0x0066:
            r0 = 0
            goto L_0x0069
        L_0x0068:
            r0 = 1
        L_0x0069:
            java.lang.String r15 = ""
            r8 = 0
            if (r0 == 0) goto L_0x0070
            r6 = r15
            goto L_0x0090
        L_0x0070:
            t73.b r0 = f129903P
            te3.rt1 r2 = r10.f129888b
            java.lang.String r2 = r2.f141127e
            java.lang.String r3 = "manifest.manifest.ManifestUrl"
            gy3.C87412m.m108593f(r2, r3)
            java.lang.String r2 = t73.C48572p.m53970a(r2)
            com.tencent.mm.vfs.m1 r0 = r0.mo73172B(r2)
            boolean r2 = r0.mo119967g()
            if (r2 == 0) goto L_0x008e
            java.lang.String r0 = com.tencent.p014mm.vfs.C45112n1.m49954a(r0, r8, r1, r8)
            goto L_0x008f
        L_0x008e:
            r0 = r15
        L_0x008f:
            r6 = r0
        L_0x0090:
            java.lang.String r5 = t73.C48572p.m53971b(r24)
            java.lang.String r0 = r9.f129908B
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "create domain:"
            r2.append(r3)
            r2.append(r13)
            r4 = 35
            r2.append(r4)
            r2.append(r11)
            java.lang.String r3 = ", appId: "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            int r0 = r5.length()     // Catch:{ Exception -> 0x01f2 }
            if (r0 <= 0) goto L_0x00c2
            r0 = 1
            goto L_0x00c3
        L_0x00c2:
            r0 = 0
        L_0x00c3:
            if (r0 == 0) goto L_0x00f4
            com.tencent.mm.plugin.appbrand.appcache.l0 r0 = r9.mo73175O1(r5, r14)     // Catch:{ Exception -> 0x00ca }
            goto L_0x00f5
        L_0x00ca:
            r0 = move-exception
            r2 = r0
            java.lang.String r0 = r9.f129908B     // Catch:{ Exception -> 0x01f2 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01f2 }
            r3.<init>()     // Catch:{ Exception -> 0x01f2 }
            java.lang.String r1 = "create bizPkg ex:"
            r3.append(r1)     // Catch:{ Exception -> 0x01f2 }
            r3.append(r5)     // Catch:{ Exception -> 0x01f2 }
            r3.append(r4)     // Catch:{ Exception -> 0x01f2 }
            r3.append(r11)     // Catch:{ Exception -> 0x01f2 }
            r1 = 32
            r3.append(r1)     // Catch:{ Exception -> 0x01f2 }
            java.lang.String r1 = r2.getMessage()     // Catch:{ Exception -> 0x01f2 }
            r3.append(r1)     // Catch:{ Exception -> 0x01f2 }
            java.lang.String r1 = r3.toString()     // Catch:{ Exception -> 0x01f2 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)     // Catch:{ Exception -> 0x01f2 }
        L_0x00f4:
            r0 = r8
        L_0x00f5:
            com.tencent.mm.plugin.appbrand.jsruntime.g r3 = r23.mo115378X()     // Catch:{ Exception -> 0x01f2 }
            r73.r r1 = new r73.r     // Catch:{ Exception -> 0x01f2 }
            t73.h r2 = new t73.h     // Catch:{ Exception -> 0x01f2 }
            r2.<init>(r11, r5, r9)     // Catch:{ Exception -> 0x01f2 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x01f2 }
            r1.mo72687a(r3)     // Catch:{ Exception -> 0x01f2 }
            te3.rt1 r1 = r10.f129888b     // Catch:{ Exception -> 0x01f2 }
            java.lang.String r1 = r1.f141131i     // Catch:{ Exception -> 0x01f2 }
            if (r1 == 0) goto L_0x0115
            int r1 = r1.length()     // Catch:{ Exception -> 0x01f2 }
            if (r1 != 0) goto L_0x0113
            goto L_0x0115
        L_0x0113:
            r1 = 0
            goto L_0x0116
        L_0x0115:
            r1 = 1
        L_0x0116:
            if (r1 != 0) goto L_0x011d
            te3.rt1 r1 = r10.f129888b     // Catch:{ Exception -> 0x01f2 }
            java.lang.String r7 = r1.f141131i     // Catch:{ Exception -> 0x01f2 }
            goto L_0x012c
        L_0x011d:
            if (r13 == 0) goto L_0x0128
            boolean r1 = z04.C112551y.m153811k(r13)     // Catch:{ Exception -> 0x01f2 }
            if (r1 == 0) goto L_0x0126
            goto L_0x0128
        L_0x0126:
            r1 = 0
            goto L_0x0129
        L_0x0128:
            r1 = 1
        L_0x0129:
            if (r1 != 0) goto L_0x012c
            r7 = r13
        L_0x012c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01f2 }
            r1.<init>()     // Catch:{ Exception -> 0x01f2 }
            java.lang.String r2 = "WebPrefetcherManifest#"
            r1.append(r2)     // Catch:{ Exception -> 0x01f2 }
            r1.append(r11)     // Catch:{ Exception -> 0x01f2 }
            java.lang.String r16 = r1.toString()     // Catch:{ Exception -> 0x01f2 }
            java.lang.String r17 = "manifest"
            r18 = 0
            s73.c$a r2 = new s73.c$a     // Catch:{ Exception -> 0x01f2 }
            java.lang.String r1 = "reportId"
            gy3.C87412m.m108593f(r7, r1)     // Catch:{ Exception -> 0x01f2 }
            r25 = r5
            r4 = 1630(0x65e, double:8.053E-321)
            r2.<init>(r7, r4)     // Catch:{ Exception -> 0x01f2 }
            r7 = 8
            r19 = 0
            r1 = r23
            r20 = r2
            r2 = r3
            r21 = r3
            r3 = r16
            r5 = 35
            r4 = r17
            r14 = r25
            r5 = r18
            r22 = r6
            r6 = r20
            r25 = r15
            r15 = r8
            r8 = r19
            s73.C48255c.m53593z1(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x01f2 }
            boolean r1 = r10.f129892f     // Catch:{ Exception -> 0x01f2 }
            if (r1 == 0) goto L_0x0192
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01f2 }
            r1.<init>()     // Catch:{ Exception -> 0x01f2 }
            r2 = r22
            r1.append(r2)     // Catch:{ Exception -> 0x01f2 }
            if (r0 == 0) goto L_0x0187
            java.lang.String r2 = "/manifest.js"
            java.lang.String r2 = com.tencent.p014mm.plugin.appbrand.appcache.C81291m0.m99670f(r0, r2)     // Catch:{ Exception -> 0x01f2 }
            goto L_0x0189
        L_0x0187:
            r2 = r25
        L_0x0189:
            r1.append(r2)     // Catch:{ Exception -> 0x01f2 }
            java.lang.String r6 = r1.toString()     // Catch:{ Exception -> 0x01f2 }
            r7 = r6
            goto L_0x0195
        L_0x0192:
            r2 = r22
            r7 = r2
        L_0x0195:
            t73.i r8 = new t73.i     // Catch:{ Exception -> 0x01f2 }
            r1 = r8
            r2 = r23
            r3 = r11
            r4 = r21
            r5 = r13
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x01f2 }
            r3 = r21
            com.tencent.mm.plugin.appbrand.jsruntime.d r3 = (com.tencent.p014mm.plugin.appbrand.jsruntime.C83148d) r3     // Catch:{ Exception -> 0x01f2 }
            r3.evaluateJavascript(r7, r8)     // Catch:{ Exception -> 0x01f2 }
            if (r0 == 0) goto L_0x01cd
            java.lang.String r1 = r9.f129908B     // Catch:{ Exception -> 0x01f2 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01f2 }
            r2.<init>()     // Catch:{ Exception -> 0x01f2 }
            java.lang.String r3 = "createPrefetcherJsContext :"
            r2.append(r3)     // Catch:{ Exception -> 0x01f2 }
            r2.append(r14)     // Catch:{ Exception -> 0x01f2 }
            r3 = 35
            r2.append(r3)     // Catch:{ Exception -> 0x01f2 }
            r2.append(r11)     // Catch:{ Exception -> 0x01f2 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x01f2 }
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r1, r2)     // Catch:{ Exception -> 0x01f2 }
            r9.mo73176Q1(r0, r14, r15)     // Catch:{ Exception -> 0x01f2 }
            goto L_0x01e3
        L_0x01cd:
            java.lang.String r1 = r9.f129908B     // Catch:{ Exception -> 0x01f2 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01f2 }
            r2.<init>()     // Catch:{ Exception -> 0x01f2 }
            java.lang.String r3 = "createPrefetcherJsContext pkg is null and ignore appId: "
            r2.append(r3)     // Catch:{ Exception -> 0x01f2 }
            r2.append(r14)     // Catch:{ Exception -> 0x01f2 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x01f2 }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r2)     // Catch:{ Exception -> 0x01f2 }
        L_0x01e3:
            if (r0 == 0) goto L_0x0212
            boolean r1 = r0 instanceof java.io.Closeable     // Catch:{ Exception -> 0x01f2 }
            if (r1 == 0) goto L_0x01ed
            r8 = r0
            java.io.Closeable r8 = (java.io.Closeable) r8     // Catch:{ Exception -> 0x01f2 }
            goto L_0x01ee
        L_0x01ed:
            r8 = r15
        L_0x01ee:
            com.tencent.mapsdk.rastercore.tools.C40004IO.safeClose(r8)     // Catch:{ Exception -> 0x01f2 }
            goto L_0x0212
        L_0x01f2:
            r0 = move-exception
            java.lang.String r1 = r9.f129908B
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "create id="
            r2.append(r3)
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r2, r3)
            goto L_0x0212
        L_0x020d:
            r1 = r26
            r9.mo72997H1(r11, r0, r1, r6)
        L_0x0212:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t73.C48558d.mo73178S1(t73.a, java.lang.String, java.util.List, fy3.l):void");
    }
}
