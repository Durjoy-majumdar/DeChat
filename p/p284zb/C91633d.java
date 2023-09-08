package p284zb;

import android.content.res.AssetFileDescriptor;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import com.eclipsesource.mmv8.C80135V8;
import com.tencent.mars.cdn.CronetLogic;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.appbrand.p942v8.C80669j;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.C83705n3;
import com.tencent.p014mm.plugin.appbrand.C83716o4;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.p014mm.plugin.appbrand.debugger.C81695a0;
import com.tencent.p014mm.plugin.appbrand.debugger.C81738h0;
import com.tencent.p014mm.plugin.appbrand.debugger.C81740p;
import com.tencent.p014mm.plugin.appbrand.debugger.C81743t;
import com.tencent.p014mm.plugin.appbrand.debugger.C81745v;
import com.tencent.p014mm.plugin.appbrand.debugger.C81750x;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40480g;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83146c;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83172l;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83181q;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83185u;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84574p4;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84710x4;
import com.tencent.p014mm.plugin.appbrand.page.C83773c1;
import com.tencent.p014mm.plugin.appbrand.utils.C84754j1;
import com.tencent.p014mm.plugin.appbrand.utils.C84768n1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.xweb.skia_canvas.external_texture.SkiaCanvasExternalTextureManager;
import fo0.C87017e;
import fo0.C87027l;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import js0.C88016e;
import junit.framework.Assert;
import kj0.C88157a;
import org.json.JSONObject;
import p1058wb.C90916i;
import p1058wb.C90922j;
import p1058wb.C90928k;
import p284zb.C91635f;
import p928ac.C79490b;
import p963fc.C86812g;
import te3.ow4;
import u24.C90595a;
import u24.C90599h;

/* renamed from: zb.d */
public class C91633d<Service extends C91635f> extends C91640i<Service> implements C81740p {

    /* renamed from: h */
    public volatile boolean f262531h = false;

    /* renamed from: i */
    public volatile boolean f262532i = false;

    /* renamed from: j */
    public volatile boolean f262533j = false;

    /* renamed from: n */
    public C90922j f262534n;

    /* renamed from: o */
    public C90916i f262535o;

    /* renamed from: p */
    public C90928k f262536p;

    /* renamed from: q */
    public C79490b f262537q;

    /* renamed from: r */
    public volatile C91659v f262538r;

    /* renamed from: s */
    public C81745v f262539s = null;

    /* renamed from: t */
    public C81743t f262540t = null;

    /* renamed from: u */
    public C91654r f262541u;

    /* renamed from: v */
    public CronetLogic.CronetTaskNetworkStateCallback f262542v = null;

    /* renamed from: w */
    public final C83705n3 f262543w = new d$$b(this);

    /* renamed from: x */
    public final LinkedList<Runnable> f262544x = new LinkedList<>();

    /* renamed from: y */
    public final Map<String, Boolean> f262545y = new HashMap();

    public C91633d(Service service) {
        super(service);
        mo124765a0(C81740p.class, this);
    }

    /* renamed from: J0 */
    public static void m115036J0(C91633d dVar, AppBrandRuntime appBrandRuntime, AppBrandInitConfig appBrandInitConfig) {
        dVar.getClass();
        Log.m105924i("Luggage.AppBrandMiniProgramServiceLogicImp", "onRuntimeInitConfigUpdated");
        if (appBrandRuntime != null && appBrandRuntime.f238122S) {
            dVar.m115037V0();
        }
    }

    /* renamed from: V0 */
    private void m115037V0() {
        C83181q qVar;
        try {
            C83165i jsRuntime = ((C91635f) mo124764Z()).getJsRuntime();
            if (jsRuntime != null && (qVar = (C83181q) jsRuntime.mo63321n0(C83181q.class)) != null) {
                C86812g j0 = mo125523j0();
                int i = j0 == null ? false : j0.mo121250f1() ? -4 : -2;
                Log.m105925i("Luggage.AppBrandMiniProgramServiceLogicImp", "setJSThreadHighPriority, priority: %d", Integer.valueOf(i));
                qVar.mo115428t(i);
            }
        } catch (Throwable th) {
            Log.printErrStackTrace("Luggage.AppBrandMiniProgramServiceLogicImp", th, "[CAPTURED CRASH]", new Object[0]);
        }
    }

    /* renamed from: A0 */
    public void mo120895A0() {
        super.mo120895A0();
        C81745v vVar = this.f262539s;
        if (vVar != null) {
            vVar.f239914h.mo114050f();
            C81695a0 a0Var = vVar.f239914h;
            a0Var.getClass();
            Log.m105924i("MicroMsg.RemoteDebugMsgMrg", "onClose");
            Future<?> future = a0Var.f239786j;
            if (future != null) {
                future.cancel(false);
            }
        }
    }

    /* renamed from: B0 */
    public void mo120896B0() {
        C91631b R0;
        super.mo120896B0();
        C83165i jsRuntime = ((C91635f) mo124764Z()).getJsRuntime();
        C83185u uVar = (C83185u) jsRuntime.mo63321n0(C83185u.class);
        if (uVar == null || (R0 = mo122611R0(jsRuntime, uVar)) == null) {
            this.f262531h = false;
        } else {
            jsRuntime.addJavascriptInterface(R0, "WeixinJSContext");
            jsRuntime.evaluateJavascript("(function(global) {\n    let loadJsFilesWithOptions = global.WeixinJSContext.loadJsFilesWithOptions\n    global.WeixinJSContext.loadJsFiles = function(contextId, paths, options) {\n        if (!options) {\n            options = '{}'\n        } else if (typeof options !== 'string') {\n            options = JSON.stringify(options)\n        }\n        loadJsFilesWithOptions(contextId, paths, options)\n    }\n})(this);", (ValueCallback<String>) null);
            R0.mo120936v();
            this.f262531h = true;
        }
        if (mo125523j0() != null && mo125523j0().mo113215r1()) {
            Log.m105924i("Luggage.AppBrandMiniProgramServiceLogicImp", "run in debug mode, add MPRemoteDebugJSContextInterface");
            C91654r rVar = new C91654r((C91635f) mo124764Z());
            this.f262541u = rVar;
            jsRuntime.addJavascriptInterface(rVar, "DebuggerConnection");
            C81745v vVar = this.f262539s;
            if (vVar != null) {
                this.f262541u.f262633a = vVar;
            }
        }
        jsRuntime.setJsExceptionHandler(new d$$h(this, jsRuntime));
        if (!mo122617Y0()) {
            C90922j jVar = new C90922j();
            this.f262534n = jVar;
            jVar.mo125003a(jsRuntime, mo124764Z());
        }
        if (!mo122616X0()) {
            C90916i iVar = new C90916i();
            this.f262535o = iVar;
            iVar.mo124998a(jsRuntime, mo124764Z());
        }
        if (!mo122619a1()) {
            C90928k kVar = new C90928k();
            this.f262536p = kVar;
            kVar.mo125008a(((C91635f) mo124764Z()).getJsRuntime(), mo124764Z(), 0);
        }
        if (!mo122618Z0()) {
            C79490b bVar = new C79490b();
            this.f262537q = bVar;
            bVar.mo109489a(jsRuntime, mo124764Z());
        }
        if (!mo122615W0()) {
            this.f262538r = new C91659v(false);
            this.f262538r.mo125543a(jsRuntime, (C81925i2) mo124764Z());
        }
    }

    /* renamed from: C0 */
    public void mo120897C0(JSONObject jSONObject) {
        Objects.requireNonNull((C91635f) mo124764Z());
        Objects.requireNonNull(((C91635f) mo124764Z()).getRuntime());
        ((C91635f) mo124764Z()).mo114881c0(jSONObject, "isLazyLoad", Boolean.valueOf(((C83773c1) ((C91635f) mo124764Z()).getRuntime().mo113018M(C83773c1.class)).mo116114a()));
    }

    /* renamed from: D0 */
    public void mo120898D0(AppBrandRuntime appBrandRuntime) {
        C83705n3 n3Var;
        super.mo120898D0(appBrandRuntime);
        Objects.requireNonNull((C91635f) mo124764Z());
        C90928k kVar = this.f262536p;
        if (kVar != null) {
            kVar.mo125010c(((C91635f) mo124764Z()).getJsRuntime(), (C82554k) mo124764Z());
        }
        m115037V0();
        C86812g j0 = mo125523j0();
        if (!(j0 == null || (n3Var = this.f262543w) == null)) {
            j0.f238108F.add(n3Var);
        }
        appBrandRuntime.mo113014I0(C84574p4.class, new C84710x4(appBrandRuntime));
        if (this.f262538r != null) {
            this.f262538r.mo125544b(appBrandRuntime, mo125506P0(), (C81925i2) mo124764Z());
        } else if (mo122615W0()) {
            appBrandRuntime.mo113014I0(C87017e.class, new d$$d(this));
        }
        Log.m105924i("MicroMsg.AppBrand.VideoCanvas.XWebVideoCanvasLogic", APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        if (C88157a.f254942b == null) {
            synchronized (C88157a.class) {
                if (C88157a.f254942b == null) {
                    C88157a.f254942b = new C88157a();
                }
            }
        }
        SkiaCanvasExternalTextureManager.getInstance().registerPlugin(C88157a.f254942b);
        C79490b bVar = this.f262537q;
        if (bVar != null) {
            bVar.mo109491c(mo124764Z());
        }
        d$$i d__i = new d$$i(this);
        this.f262542v = d__i;
        CronetLogic.addCronetTaskNetworkStateCallback(d__i);
    }

    /* renamed from: I */
    public void mo114091I(String str) {
        Log.m105919d("Luggage.AppBrandMiniProgramServiceLogicImp", "RemoteDebugInfo %s", str);
        ow4 ow4 = new ow4();
        ow4.f184718e = ((C91635f) mo124764Z()).mo114341l0().getComponentId();
        ow4.f184717d = str;
        C81750x d = C81738h0.m100298d(ow4, this.f262540t, "domEvent");
        C81745v vVar = this.f262539s;
        if (vVar != null) {
            vVar.f239914h.mo114052h(d);
        }
    }

    /* renamed from: K0 */
    public final void mo125504K0() {
        if (!this.f262531h && !this.f262533j) {
            String str = ((C91635f) mo124764Z()).getRuntime().mo113051d0().f261072r.pkgPath;
            if (!TextUtils.isEmpty(str)) {
                C84768n1.m104434j(((C91635f) mo124764Z()).getRuntime(), ((C91635f) mo124764Z()).getJsRuntime(), str, "app-service.js", "", "", C84768n1.C84773e.USR, new d$$p("app-service.js", (C91635f) mo124764Z(), (d$$h) null));
                this.f262533j = true;
            }
        }
    }

    /* renamed from: L0 */
    public final void mo125505L0(boolean z) {
        String str;
        boolean z2;
        String str2;
        C84768n1.C84773e eVar = C84768n1.C84773e.LIB;
        if (!this.f262532i) {
            C83716o4.m102757b((C81879g) mo124764Z(), ((C91635f) mo124764Z()).getJsRuntime());
            C84754j1.m104418b(((C91635f) mo124764Z()).getJsRuntime(), (URL) null, mo122609N0(), new d$$j(this, System.currentTimeMillis(), z));
            d$$n M0 = mo122608M0();
            String str3 = M0.f262570a;
            AssetFileDescriptor assetFileDescriptor = M0.f262571b;
            String str4 = (!M0.f262573d && TextUtils.isEmpty((CharSequence) null)) ? str3 : null;
            if (!M0.f262573d && TextUtils.isEmpty((CharSequence) null)) {
                str = "v" + ((C91635f) mo124764Z()).mo114272k().mo113371a();
            } else {
                str = null;
            }
            d$$e d__e = new d$$e(this, M0, str3, str4, str, z);
            if (((C91635f) mo124764Z()).getRuntime() != null && ((C91635f) mo124764Z()).getRuntime().mo113215r1()) {
                String b = assetFileDescriptor == null ? ((C91635f) mo124764Z()).mo114272k().mo113372b(str3) : C88016e.m109549f(assetFileDescriptor);
                String b2 = ((C91635f) mo124764Z()).mo114272k().mo113372b("WAServiceRemoteDebug.js");
                if (!TextUtils.isEmpty(b2)) {
                    str2 = b2 + ";";
                } else {
                    str2 = "";
                }
                C84768n1.m104432h((C81925i2) mo124764Z(), ((C91635f) mo124764Z()).getJsRuntime(), str3, str2 + b, eVar, new d$$o(str3, b, (C91635f) mo124764Z(), this, z, (d$$h) null));
            } else if (assetFileDescriptor == null) {
                Log.m105921e("Luggage.AppBrandMiniProgramServiceLogicImp", "execInternalInitScript, bootstrap fd is null for name:%s", str3);
                d__e.run();
            } else {
                z2 = true;
                C84768n1.m104433i((C81925i2) mo124764Z(), ((C91635f) mo124764Z()).getJsRuntime(), str3, str4, str, mo122610O0(), assetFileDescriptor, eVar, new d$$k(this, str3, assetFileDescriptor, (C91635f) mo124764Z(), this, z, d__e));
                this.f262532i = z2;
                mo125526u0(new d$$f());
            }
            z2 = true;
            this.f262532i = z2;
            mo125526u0(new d$$f());
        }
    }

    /* renamed from: M0 */
    public d$$n mo122608M0() {
        String[] strArr = this.f262531h ? new String[]{"WAServiceMainContext.js", "WAService.js"} : new String[]{"WAService.js"};
        for (String str : strArr) {
            AssetFileDescriptor g = mo122614U0() ? ((C91635f) mo124764Z()).mo114272k().mo113382g(str) : null;
            if (g != null) {
                d$$n d__n = new d$$n();
                d__n.f262570a = str;
                d__n.f262571b = g;
                return d__n;
            }
            String b = ((C91635f) mo124764Z()).mo114272k().mo113372b(str);
            if (!TextUtils.isEmpty(b)) {
                d$$n d__n2 = new d$$n();
                d__n2.f262570a = str;
                d__n2.f262572c = b;
                return d__n2;
            }
        }
        throw new IllegalStateException(String.format(Locale.US, "boostrap(%s) scripts not found", new Object[]{C90595a.m113499c(strArr, "{}")}));
    }

    /* renamed from: N0 */
    public String mo122609N0() {
        String str = ((("" + C88016e.m109548e("wxa_library/android.js")) + "\n;(function(global){ delete global.NativeGlobal.invokeHandler; })(this);\n") + C88016e.m109548e("wxa_library/shared_buffer.js")) + C88016e.m109548e("wxa_library/lazy_load.js");
        LinkedList<String> linkedList = new LinkedList<>();
        if (mo122618Z0()) {
            linkedList.add("WXAUDIO");
        }
        if (mo122616X0()) {
            linkedList.add("TCP");
        }
        if (mo122617Y0()) {
            linkedList.add("UDP");
        }
        if (mo122619a1()) {
            linkedList.add("WSS");
        }
        if (!linkedList.isEmpty()) {
            for (String replaceFirst : linkedList) {
                str = str + C88016e.m109548e("wxa_library/wx_global_ctor_module_lazy_load.js").replaceFirst(Pattern.quote("${__module__}"), replaceFirst);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        boolean z = C87027l.f252546a;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(C88016e.m109548e("wxa_library/js_binding_skia.js"));
        sb.append(stringBuffer.toString());
        return sb.toString();
    }

    /* renamed from: O0 */
    public int mo122610O0() {
        return 0;
    }

    /* renamed from: P0 */
    public final C83165i mo125506P0() {
        return ((C91635f) mo124764Z()).getJsRuntime();
    }

    /* renamed from: Q */
    public String mo114093Q() {
        JSONObject k0 = ((C91635f) mo124764Z()).mo114340k0();
        return String.format("var __wxConfig = %s;\nvar __wxIndexPage = \"%s\"", new Object[]{k0.toString(), ((C91635f) mo124764Z()).getRuntime().mo113008F().f239599G});
    }

    /* renamed from: Q0 */
    public final boolean mo125507Q0(String str) {
        Boolean bool = (Boolean) ((HashMap) this.f262545y).get(str);
        if (bool == null || !bool.booleanValue()) {
            ((HashMap) this.f262545y).put(str, Boolean.TRUE);
            Log.m105925i("Luggage.AppBrandMiniProgramServiceLogicImp", "guardedCheckLoadModule appId:%s, name:%s, before injection", mo125521g0(), str);
            d$$l d__l = new d$$l(this, str);
            if (mo124764Z() == null) {
                Log.m105928w("Luggage.AppBrandMiniProgramServiceLogicImp", "runOnServiceReady getComponent()==NULL");
            } else if (((C91635f) mo124764Z()).isRunning()) {
                d__l.run();
            } else {
                synchronized (this.f262544x) {
                    this.f262544x.add(d__l);
                }
            }
            return true;
        }
        Log.m105925i("Luggage.AppBrandMiniProgramServiceLogicImp", "guardedCheckLoadModule appId:%s, name:%s, module already injected", mo125521g0(), str);
        return false;
    }

    /* renamed from: R0 */
    public C91631b mo122611R0(C83165i iVar, C83185u uVar) {
        return new C91653q((C91635f) mo124764Z(), uVar);
    }

    /* renamed from: S0 */
    public void mo122612S0(boolean z, String str, C80669j.C80676g gVar) {
    }

    /* renamed from: T0 */
    public void mo122613T0(String str, String str2) {
    }

    /* renamed from: U0 */
    public boolean mo122614U0() {
        return true;
    }

    /* renamed from: W0 */
    public boolean mo122615W0() {
        return true;
    }

    /* renamed from: X0 */
    public boolean mo122616X0() {
        return true;
    }

    /* renamed from: Y0 */
    public boolean mo122617Y0() {
        return true;
    }

    /* renamed from: Z0 */
    public boolean mo122618Z0() {
        return true;
    }

    /* renamed from: a1 */
    public boolean mo122619a1() {
        return true;
    }

    /* renamed from: d0 */
    public void mo120918d0() {
        C83705n3 n3Var;
        super.mo120918d0();
        C86812g j0 = mo125523j0();
        if (!(j0 == null || (n3Var = this.f262543w) == null)) {
            j0.f238108F.remove(n3Var);
        }
        C90922j jVar = this.f262534n;
        if (jVar != null) {
            jVar.mo125004b(((C91635f) mo124764Z()).getJsRuntime());
        }
        C90916i iVar = this.f262535o;
        if (iVar != null) {
            iVar.mo124999b(((C91635f) mo124764Z()).getJsRuntime());
        }
        C90928k kVar = this.f262536p;
        if (kVar != null) {
            kVar.mo125009b(((C91635f) mo124764Z()).getJsRuntime());
        }
        C79490b bVar = this.f262537q;
        if (bVar != null) {
            bVar.mo109490b(((C91635f) mo124764Z()).getJsRuntime());
        }
        CronetLogic.CronetTaskNetworkStateCallback cronetTaskNetworkStateCallback = this.f262542v;
        if (cronetTaskNetworkStateCallback != null) {
            CronetLogic.removeCronetTaskNetworkStateCallback(cronetTaskNetworkStateCallback);
        }
        if (mo125523j0() != null && mo125523j0().mo113203h1()) {
            C83165i jsRuntime = ((C91635f) mo124764Z()).getJsRuntime();
            C83181q qVar = (C83181q) jsRuntime.mo63321n0(C83181q.class);
            C81879g gVar = (C81879g) mo124764Z();
            List<? extends C40480g> C = ((C83185u) jsRuntime.mo63321n0(C83185u.class)).mo115373C(true);
            Log.m105925i("Luggage.AppBrandMiniProgramServiceLogicImp", "post report coverage task for appId:%s, contexts.size:%d", mo125521g0(), Integer.valueOf(C.size()));
            CountDownLatch countDownLatch = new CountDownLatch(C.size());
            for (C40480g gVar2 : C) {
                gVar2.evaluateJavascript("\n        ;(function() {\n            let data = (globalThis || {}).__coverage__;\n            if (typeof data === 'string' || typeof data === 'undefined') {\n                return data;\n            } else {\n                return JSON.stringify(data);\n            }\n        })();\n    ", new d$$c(gVar, gVar2, countDownLatch));
            }
            try {
                countDownLatch.await(3, TimeUnit.SECONDS);
            } catch (Exception e) {
                Log.m105921e("Luggage.AppBrandMiniProgramServiceLogicImp", "post report coverage task for appId:%s latch await failed:%s", mo125521g0(), e);
            } finally {
                Log.m105925i("Luggage.AppBrandMiniProgramServiceLogicImp", "post report coverage task for appId:%s latch await end", mo125521g0());
            }
        }
    }

    /* renamed from: e0 */
    public C83165i mo120919e0() {
        return new C83146c((String) null, (byte[]) null);
    }

    /* renamed from: g */
    public final boolean mo114094g(String str) {
        boolean Q0;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        synchronized (this.f262545y) {
            Q0 = mo125507Q0(str);
        }
        return Q0;
    }

    /* renamed from: i0 */
    public String mo123166i0(String str) {
        return "";
    }

    /* renamed from: m0 */
    public void mo120920m0() {
        if (((C91635f) mo124764Z()).getRuntime() != null && ((C91635f) mo124764Z()).getRuntime().mo113215r1()) {
            boolean z = true;
            if (C81738h0.m100299e(((C91635f) mo124764Z()).getRuntime().mo113036W().f234797A).f239909g != 1) {
                z = false;
            }
            if (z) {
                Log.m105924i("Luggage.AppBrandMiniProgramServiceLogicImp", "initRemoteDebug");
                MMHandlerThread.postToMainThread(new C91634e(this));
                C80135V8.setBreakOnStart(Boolean.FALSE);
                C83172l lVar = (C83172l) ((C91635f) mo124764Z()).getJsRuntime().mo63321n0(C83172l.class);
                if (lVar != null) {
                    lVar.mo115426s1("xdebug");
                }
                if (((C91635f) mo124764Z()).f240291y) {
                    C83165i jsRuntime = ((C91635f) mo124764Z()).getJsRuntime();
                    ((C91635f) mo124764Z()).getClass();
                    C84768n1.m104429e(jsRuntime, "https://usr/");
                }
            }
        }
    }

    /* renamed from: r0 */
    public boolean mo120921r0() {
        return this.f262531h;
    }

    /* renamed from: s0 */
    public boolean mo120922s0(String str, JSONObject jSONObject) {
        if (C90599h.m113510c("WXAUDIO", str)) {
            if (!mo122618Z0()) {
                Log.m105921e("Luggage.AppBrandMiniProgramServiceLogicImp", "WXAUDIO LazyLoad is not supported! appId:%s", mo125521g0());
                return false;
            }
            C79490b bVar = new C79490b();
            this.f262537q = bVar;
            bVar.mo109489a(mo125506P0(), mo124764Z());
            if (mo125523j0() != null) {
                this.f262537q.mo109491c(mo124764Z());
            }
            return true;
        } else if (C90599h.m113510c("TCP", str)) {
            if (!mo122616X0()) {
                Log.m105921e("Luggage.AppBrandMiniProgramServiceLogicImp", "TCP LazyLoad is not supported! appId:%s", mo125521g0());
                return false;
            }
            C90916i iVar = new C90916i();
            this.f262535o = iVar;
            iVar.mo124998a(mo125506P0(), mo124764Z());
            return true;
        } else if (C90599h.m113510c("UDP", str)) {
            if (!mo122617Y0()) {
                Log.m105921e("Luggage.AppBrandMiniProgramServiceLogicImp", "UDP LazyLoad is not supported! appId:%s", mo125521g0());
                return false;
            }
            C90922j jVar = new C90922j();
            this.f262534n = jVar;
            jVar.mo125003a(mo125506P0(), mo124764Z());
            return true;
        } else if (C90599h.m113510c("WSS", str)) {
            if (!mo122619a1()) {
                Log.m105921e("Luggage.AppBrandMiniProgramServiceLogicImp", "WSS LazyLoad is not supported! appId:%s", mo125521g0());
                return false;
            }
            C90928k kVar = new C90928k();
            this.f262536p = kVar;
            kVar.mo125008a(((C91635f) mo124764Z()).getJsRuntime(), mo124764Z(), 0);
            if (mo125523j0() != null) {
                this.f262536p.mo125010c(mo125506P0(), (C82554k) mo124764Z());
            }
            return true;
        } else if (!C90599h.m113510c("SkiaCanvas", str)) {
            return super.mo120922s0(str, jSONObject);
        } else {
            if (!mo122615W0()) {
                Log.m105921e("Luggage.AppBrandMiniProgramServiceLogicImp", "SkiaCanvas LazyLoad is not supported! appId:%s", mo125521g0());
                return false;
            }
            Assert.assertNull("mXWebCanvasInstallHelper should be null", this.f262538r);
            this.f262538r = new C91659v(true);
            this.f262538r.mo125543a(mo125506P0(), (C81925i2) mo124764Z());
            if (mo125523j0() != null) {
                this.f262538r.mo125544b(mo125523j0(), mo125506P0(), (C81925i2) mo124764Z());
            }
            Log.m105925i("Luggage.AppBrandMiniProgramServiceLogicImp", "lazyInitModule SkiaCanvas done, appId:%s", mo125521g0());
            return true;
        }
    }

    /* renamed from: v0 */
    public void mo120923v0() {
        if (!this.f262532i) {
            ((C91635f) mo124764Z()).getJsRuntime().evaluateJavascript(C88016e.m109548e("wxa_library/android.js"), (ValueCallback<String>) null);
        }
        ((C91635f) mo124764Z()).mo114349t0();
        mo125505L0(false);
        mo125504K0();
        LinkedList linkedList = new LinkedList();
        synchronized (this.f262544x) {
            linkedList.addAll(this.f262544x);
        }
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        ((C91635f) mo124764Z()).mo114336g0();
    }

    /* renamed from: x0 */
    public void mo120924x0() {
        ((C91635f) mo124764Z()).mo114841L();
        mo125505L0(true);
        mo125526u0(new d$$a());
    }

    /* renamed from: y0 */
    public void mo120925y0() {
        super.mo120925y0();
        try {
            C83165i jsRuntime = ((C91635f) mo124764Z()).getJsRuntime();
            if (jsRuntime != null) {
                C83181q qVar = (C83181q) jsRuntime.mo63321n0(C83181q.class);
                if (qVar != null) {
                    qVar.mo115428t(10);
                }
            }
        } catch (Throwable th) {
            Log.printErrStackTrace("Luggage.AppBrandMiniProgramServiceLogicImp", th, "[CAPTURED CRASH]", new Object[0]);
        }
    }

    /* renamed from: z0 */
    public void mo120926z0() {
        super.mo120926z0();
        m115037V0();
        C81745v vVar = this.f262539s;
        if (vVar != null) {
            vVar.f239916j.bringToFront();
        }
    }
}
