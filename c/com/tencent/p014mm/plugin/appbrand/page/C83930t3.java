package com.tencent.p014mm.plugin.appbrand.page;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ValueCallback;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.tencent.luggage.sdk.launching.C80247h;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.appcache.C81386x1;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.plugin.appbrand.jsapi.C83133y6;
import com.tencent.p014mm.plugin.appbrand.keylogger.C83226n;
import com.tencent.p014mm.plugin.appbrand.page.C83978y3;
import com.tencent.p014mm.plugin.appbrand.performance.AppBrandPerformanceManager;
import com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch;
import com.tencent.p014mm.plugin.appbrand.utils.C84751i1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.xweb.file.XVFSFile;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import mm0.C88784a;
import org.json.JSONException;
import org.json.JSONObject;
import p1044ub.C90630c;
import p1044ub.C90636f;
import p1065yb.C91390a;
import p170ic.C87689c;
import p849e3.C107168a0;
import p849e3.C107207u;
import rq0.C90087f;
import rq0.C90090h;
import u24.C90595a;
import u24.C90599h;
import vq0.C90860a;

/* renamed from: com.tencent.mm.plugin.appbrand.page.t3 */
public class C83930t3<PAGE extends C90630c> extends C83745a<PAGE> implements C90090h {

    /* renamed from: E */
    public static final String[] f245045E = {"custom_event_GenerateFuncReady", "custom_event_tapAnyWhere", "custom_event_vdSync", "onAppRoute", "onAppRouteDone"};

    /* renamed from: A */
    public String f245046A;

    /* renamed from: B */
    public boolean f245047B;

    /* renamed from: C */
    public C83937d f245048C;

    /* renamed from: D */
    public final C83978y3.C83979a f245049D = new C83934c();

    /* renamed from: w */
    public boolean f245050w = false;

    /* renamed from: x */
    public boolean f245051x = false;

    /* renamed from: y */
    public boolean f245052y = false;

    /* renamed from: z */
    public C90087f f245053z = null;

    /* renamed from: com.tencent.mm.plugin.appbrand.page.t3$a */
    public class C83931a implements C90087f {

        /* renamed from: d */
        public final /* synthetic */ C90087f f245054d;

        public C83931a(C90087f fVar) {
            this.f245054d = fVar;
        }

        /* renamed from: V0 */
        public void mo63305V0() {
            this.f245054d.mo63305V0();
            if (!TextUtils.isEmpty(C83930t3.this.f245046A) && C83930t3.this.mo116543B0().mo63309c1()) {
                C83978y3 B0 = C83930t3.this.mo116543B0();
                StringBuilder sb = new StringBuilder();
                sb.append("document.title=\"");
                sb.append(C84751i1.m104412a(C83930t3.this.f245046A + "(PAUSED)"));
                sb.append(FastJsonResponse.QUOTE);
                B0.evaluateJavascript(sb.toString(), (ValueCallback<String>) null);
            }
        }

        /* renamed from: f0 */
        public void mo63313f0() {
            this.f245054d.mo63313f0();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.t3$b */
    public class C83932b implements Runnable {

        /* renamed from: com.tencent.mm.plugin.appbrand.page.t3$b$a */
        public class C83933a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ View f245057d;

            public C83933a(View view) {
                this.f245057d = view;
            }

            public void run() {
                View view = this.f245057d;
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                if (C107207u.C107211e.m145207b(view) && !C107207u.C107211e.m145208c(this.f245057d)) {
                    Log.m105919d("Luggage.MPPageViewRenderer", "loadURL[page], PageView(%s) not laid out, forceLayout", C83930t3.this.f244457j);
                    this.f245057d.forceLayout();
                    ViewParent parent = this.f245057d.getParent();
                    do {
                        ((View) parent).forceLayout();
                        parent = parent.getParent();
                    } while (parent instanceof View);
                    if (parent != null) {
                        parent.requestLayout();
                    }
                }
            }
        }

        public C83932b() {
        }

        public void run() {
            ViewGroup viewGroup = C83930t3.this.f244453f;
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            if (C107207u.C107211e.m145207b(viewGroup)) {
                ((C90630c) C83930t3.this.mo124764Z()).mo116274i0(new C83933a(viewGroup));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.t3$c */
    public class C83934c implements C83978y3.C83979a {

        /* renamed from: a */
        public boolean f245059a = false;

        /* renamed from: b */
        public boolean f245060b = false;

        /* renamed from: c */
        public boolean f245061c = false;

        /* renamed from: com.tencent.mm.plugin.appbrand.page.t3$c$a */
        public class C83935a implements ValueCallback<String> {
            public C83935a() {
            }

            public void onReceiveValue(Object obj) {
                String str = (String) obj;
                Log.m105925i("Luggage.MPPageViewRenderer", "injectEnvFields, evaluate assignWxConfig end, hash=%d", Integer.valueOf(C83930t3.this.hashCode()));
                C83930t3.this.f245048C.f245068c = System.currentTimeMillis();
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.page.t3$c$b */
        public class C83936b implements ValueCallback<String> {

            /* renamed from: a */
            public final /* synthetic */ long f245064a;

            public C83936b(long j) {
                this.f245064a = j;
            }

            public void onReceiveValue(Object obj) {
                boolean parseBoolean = Boolean.parseBoolean((String) obj);
                if (parseBoolean) {
                    C83937d dVar = C83930t3.this.f245048C;
                    dVar.f245067b = this.f245064a;
                    dVar.f245068c = System.currentTimeMillis();
                }
                C83937d dVar2 = C83930t3.this.f245048C;
                Log.m105925i("Luggage.MPPageViewRenderer", "injectEnvFields, evaluate onWxConfigReady end, applied=%b, hash=%d, reportWxConfigInjectEnd cost=%dms", Boolean.valueOf(parseBoolean), Integer.valueOf(C83930t3.this.hashCode()), Long.valueOf(dVar2.f245068c - dVar2.f245067b));
                C83930t3 t3Var = C83930t3.this;
                C83937d dVar3 = t3Var.f245048C;
                t3Var.mo116500z0(dVar3.f245066a, dVar3.f245067b, dVar3.f245068c);
            }
        }

        public C83934c() {
        }

        /* renamed from: a */
        public final String mo116550a() {
            return C90636f.f260394G0 + String.format(Locale.US, "%s/%d/", new Object[]{C83930t3.this.mo125215b0(), Integer.valueOf(C83930t3.this.mo116498d0().mo113051d0().f261072r.pkgVersion)});
        }

        /* renamed from: b */
        public void mo116551b(boolean z) {
            URL url;
            Log.m105925i("Luggage.MPPageViewRenderer", "injectEnvFields preload=%b, hash=%d, viewEngine.hash=%d", Boolean.valueOf(z), Integer.valueOf(C83930t3.this.hashCode()), Integer.valueOf(C83930t3.this.mo116543B0().hashCode()));
            if (z) {
                ((C90630c) C83930t3.this.mo124764Z()).mo114880Z(((C90630c) C83930t3.this.mo124764Z()).mo114333Y());
                mo116552c();
                return;
            }
            C83930t3 t3Var = C83930t3.this;
            t3Var.getClass();
            URL url2 = null;
            if (!TextUtils.isEmpty("(function (global) {\n        if (!Object.assign) {\n            Object.defineProperty(Object, \"assign\", {\n                enumerable: false,\n                configurable: true,\n                writable: true,\n                value: function (target, firstSource) {\n                    \"use strict\";\n                    if (target === undefined || target === null)\n                        throw new TypeError(\"Cannot convert first argument to object\");\n                    var to = Object(target);\n                    for (var i = 1; i < arguments.length; i++) {\n                        var nextSource = arguments[i];\n                        if (nextSource === undefined || nextSource === null) continue;\n                        var keysArray = Object.keys(Object(nextSource));\n                        for (var nextIndex = 0, len = keysArray.length; nextIndex < len; nextIndex++) {\n                            var nextKey = keysArray[nextIndex];\n                            var desc = Object.getOwnPropertyDescriptor(nextSource, nextKey);\n                            if (desc !== undefined && desc.enumerable) to[nextKey] = nextSource[nextKey];\n                        }\n                    }\n                    return to;\n                }\n            });\n        }\n})(this);")) {
                ((C90630c) t3Var.mo124764Z()).getJsRuntime().evaluateJavascript("(function (global) {\n        if (!Object.assign) {\n            Object.defineProperty(Object, \"assign\", {\n                enumerable: false,\n                configurable: true,\n                writable: true,\n                value: function (target, firstSource) {\n                    \"use strict\";\n                    if (target === undefined || target === null)\n                        throw new TypeError(\"Cannot convert first argument to object\");\n                    var to = Object(target);\n                    for (var i = 1; i < arguments.length; i++) {\n                        var nextSource = arguments[i];\n                        if (nextSource === undefined || nextSource === null) continue;\n                        var keysArray = Object.keys(Object(nextSource));\n                        for (var nextIndex = 0, len = keysArray.length; nextIndex < len; nextIndex++) {\n                            var nextKey = keysArray[nextIndex];\n                            var desc = Object.getOwnPropertyDescriptor(nextSource, nextKey);\n                            if (desc !== undefined && desc.enumerable) to[nextKey] = nextSource[nextKey];\n                        }\n                    }\n                    return to;\n                }\n            });\n        }\n})(this);", (ValueCallback<String>) null);
            } else if (((C90630c) t3Var.mo124764Z()).f241593r) {
                throw new IllegalAccessError("Cannot find object_polyfill.js");
            }
            C83930t3.this.mo116543B0().evaluateJavascript(String.format(Locale.US, "history.pushState({},\"\",\"%s\");", new Object[]{mo116550a() + "page-frame.html"}), (ValueCallback<String>) null);
            C83930t3.this.mo116543B0().mo72055Z0(";(function(){return window.devicePixelRatio})();", new C83941u3(this));
            C83930t3 t3Var2 = C83930t3.this;
            JSONObject a = C87689c.m109088a(t3Var2.mo116498d0().mo113047b0().mo114340k0());
            try {
                a.put("isFirstPage", ((C90630c) t3Var2.mo124764Z()).f244578Y);
            } catch (JSONException e) {
                Log.m105921e("Luggage.AbstractMPPageViewRenderer", "generateWxConfig appId[%s] put isFirstPage e=%s", t3Var2.mo125215b0(), e);
            }
            try {
                a.put("prerender", t3Var2.mo116498d0().mo113036W().f234829Y0 == C80247h.PRE_RENDER);
            } catch (JSONException e2) {
                Log.m105921e("Luggage.AbstractMPPageViewRenderer", "generateWxConfig appId[%s] put prerender e=%s", t3Var2.mo125215b0(), e2);
            }
            a.remove("permission");
            a.remove("subpackages");
            a.remove("pages");
            String jSONObject = a.toString();
            Locale locale = Locale.US;
            String format = String.format(locale, ";if(typeof __wxConfig==='undefined'){var __wxConfig={};};Object.assign(__wxConfig, %s);", new Object[]{jSONObject});
            long currentTimeMillis = System.currentTimeMillis();
            C83930t3 t3Var3 = C83930t3.this;
            C83937d dVar = new C83937d((C83931a) null);
            t3Var3.f245048C = dVar;
            dVar.f245066a = jSONObject;
            dVar.f245067b = currentTimeMillis;
            Log.m105925i("Luggage.MPPageViewRenderer", "injectEnvFields, evaluate assignWxConfig start, hash=%d", Integer.valueOf(t3Var3.hashCode()));
            C83978y3 B0 = C83930t3.this.mo116543B0();
            try {
                url = new URL(C113600ck.f339986i, WeChatHosts.domainString(C0966R.string.fme), "assignWxConfig");
            } catch (MalformedURLException unused) {
                url = null;
            }
            B0.mo63304R0(url, format, new C83935a());
            mo116552c();
            if (C83930t3.this.mo116498d0().mo113051d0().f234889w && !C83930t3.this.mo116498d0().mo113215r1()) {
                C83930t3 t3Var4 = C83930t3.this;
                t3Var4.mo116066m0("WAVConsole.js", ((ICommLibReader) ((C90630c) t3Var4.mo124764Z()).mo109668l(ICommLibReader.class)).mo113372b("WAVConsole.js"));
            }
            if (AppBrandPerformanceManager.m103497f(C83930t3.this.mo116498d0())) {
                C83930t3 t3Var5 = C83930t3.this;
                t3Var5.mo116066m0("WAPerf.js", ((ICommLibReader) ((C90630c) t3Var5.mo124764Z()).mo109668l(ICommLibReader.class)).mo113372b("WAPerf.js"));
            }
            if (C83930t3.this.mo116498d0().mo113215r1()) {
                C83930t3 t3Var6 = C83930t3.this;
                t3Var6.mo116066m0("WARemoteDebug.js", ((ICommLibReader) ((C90630c) t3Var6.mo124764Z()).mo109668l(ICommLibReader.class)).mo113372b("WARemoteDebug.js"));
            }
            String format2 = String.format(locale, ";(function(){ if(__wxConfig.preload) { %s; return true; } else { return false; }})();", new Object[]{C83133y6.m101970c("onWxConfigReady", "", 0)});
            Log.m105925i("Luggage.MPPageViewRenderer", "injectEnvFields, evaluate onWxConfigReady start, hash=%d", Integer.valueOf(C83930t3.this.hashCode()));
            long currentTimeMillis2 = System.currentTimeMillis();
            C83978y3 B02 = C83930t3.this.mo116543B0();
            try {
                url2 = new URL(C113600ck.f339986i, WeChatHosts.domainString(C0966R.string.fme), "onWxConfigReady");
            } catch (MalformedURLException unused2) {
            }
            B02.mo63304R0(url2, format2, new C83936b(currentTimeMillis2));
            C83930t3 t3Var7 = C83930t3.this;
            t3Var7.f245052y = false;
            if (!t3Var7.f244455h) {
                try {
                    t3Var7.mo116063j0("injectAppSharedPageFrameScript").mo59501c();
                    t3Var7.f244455h = true;
                } catch (C81386x1 unused3) {
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0077, code lost:
            if (p849e3.C107207u.C107211e.m145207b(r1) == false) goto L_0x0079;
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo116552c() {
            /*
                r8 = this;
                com.tencent.mm.plugin.appbrand.page.t3 r0 = com.tencent.p014mm.plugin.appbrand.page.C83930t3.this
                r0.getClass()
                org.json.JSONObject r1 = new org.json.JSONObject
                r1.<init>()
                com.tencent.mm.plugin.appbrand.jsapi.f r2 = r0.mo124764Z()
                ub.c r2 = (p1044ub.C90630c) r2
                br0.c r2 = r2.f244577X
                android.util.DisplayMetrics r2 = r2.getVDisplayMetrics()
                int r3 = r2.widthPixels
                int r4 = r2.heightPixels
                float r5 = (float) r3
                float r6 = r2.density
                float r5 = r5 / r6
                double r5 = (double) r5
                double r5 = java.lang.Math.ceil(r5)
                int r5 = (int) r5
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                com.tencent.mm.plugin.appbrand.jsapi.f r6 = r0.mo124764Z()
                ub.c r6 = (p1044ub.C90630c) r6
                java.lang.String r7 = "width"
                r6.mo114881c0(r1, r7, r5)
                float r2 = r2.density
                java.lang.Float r2 = java.lang.Float.valueOf(r2)
                com.tencent.mm.plugin.appbrand.jsapi.f r5 = r0.mo124764Z()
                ub.c r5 = (p1044ub.C90630c) r5
                java.lang.String r6 = "pixelRatio"
                r5.mo114881c0(r1, r6, r2)
                java.util.Locale r2 = java.util.Locale.US
                r5 = 2
                java.lang.Object[] r5 = new java.lang.Object[r5]
                r6 = 0
                java.lang.String r7 = r1.toString()
                r5[r6] = r7
                java.lang.String r1 = r1.toString()
                r6 = 1
                r5[r6] = r1
                java.lang.String r1 = ";if(typeof __deviceInfo__ ==='undefined'){ var __deviceInfo__ = %s; } else {Object.assign(__deviceInfo__, %s)};"
                java.lang.String r1 = java.lang.String.format(r2, r1, r5)
                com.tencent.mm.plugin.appbrand.jsapi.f r2 = r0.mo124764Z()
                ub.c r2 = (p1044ub.C90630c) r2
                com.tencent.mm.plugin.appbrand.jsruntime.i r2 = r2.getJsRuntime()
                r5 = 0
                r2.evaluateJavascript(r1, r5)
                android.view.ViewGroup r1 = r0.f244453f
                if (r1 == 0) goto L_0x0079
                java.util.WeakHashMap<android.view.View, e3.a0> r2 = p849e3.C107207u.f320808a
                boolean r1 = p849e3.C107207u.C107211e.m145207b(r1)
                if (r1 != 0) goto L_0x007e
            L_0x0079:
                com.tencent.mm.plugin.appbrand.page.e3 r0 = r0.f244454g
                r0.mo63310e0(r3, r4)
            L_0x007e:
                boolean r0 = r8.f245061c
                if (r0 != 0) goto L_0x0094
                com.tencent.mm.plugin.appbrand.page.t3 r0 = com.tencent.p014mm.plugin.appbrand.page.C83930t3.this
                boolean r1 = r0.f244462r
                if (r1 == 0) goto L_0x0092
                java.lang.String r1 = "wxa_library/webview_pf.js"
                java.lang.String r2 = js0.C88016e.m109548e(r1)
                r0.mo116066m0(r1, r2)
            L_0x0092:
                r8.f245061c = r6
            L_0x0094:
                boolean r0 = r8.f245059a
                if (r0 != 0) goto L_0x00a6
                com.tencent.mm.plugin.appbrand.page.t3 r0 = com.tencent.p014mm.plugin.appbrand.page.C83930t3.this
                java.lang.String r1 = "wxa_library/android-webview.js"
                java.lang.String r2 = js0.C88016e.m109548e(r1)
                r0.mo116066m0(r1, r2)
                r8.f245059a = r6
            L_0x00a6:
                boolean r0 = r8.f245060b
                if (r0 != 0) goto L_0x00bb
                com.tencent.mm.plugin.appbrand.page.t3 r0 = com.tencent.p014mm.plugin.appbrand.page.C83930t3.this
                com.tencent.mm.plugin.appbrand.page.h3 r1 = r0.mo116065l0()
                java.lang.String r2 = "WAWebview.js"
                java.lang.String r1 = r1.mo116116a(r2)
                r0.mo116066m0(r2, r1)
                r8.f245060b = r6
            L_0x00bb:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.page.C83930t3.C83934c.mo116552c():void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.t3$d */
    public static class C83937d {

        /* renamed from: a */
        public String f245066a;

        /* renamed from: b */
        public long f245067b;

        /* renamed from: c */
        public long f245068c;

        public C83937d(C83931a aVar) {
        }
    }

    public C83930t3(PAGE page) {
        super(page);
    }

    /* renamed from: A0 */
    public final void mo116542A0(String str, String str2, String str3) {
        String h = C90599h.m113515h(new String[]{str, str2, str3}, XVFSFile.PATH_SEPARATOR);
        if (!TextUtils.isEmpty(h)) {
            this.f245046A = h;
            HashMap hashMap = new HashMap();
            hashMap.put("appId", str);
            hashMap.put("appUrl", str2);
            hashMap.put("appStatus", str3);
            mo116543B0().setAppBrandInfo(hashMap);
            if (mo116543B0().mo63309c1()) {
                C83978y3 B0 = mo116543B0();
                B0.evaluateJavascript("document.title=\"" + C84751i1.m104412a(h) + FastJsonResponse.QUOTE, (ValueCallback<String>) null);
            }
        }
    }

    /* renamed from: B0 */
    public C83978y3 mo116543B0() {
        return (C83978y3) this.f244454g;
    }

    /* renamed from: C */
    public void mo111238C() {
        Log.m105925i("Luggage.MPPageViewRenderer", "dispatchPageReady url[%s]", this.f244457j);
        this.f245047B = true;
        super.mo111238C();
        this.f244453f.invalidate();
        if (((C90630c) mo124764Z()).f244578Y) {
            C83226n.m102128e(mo125215b0(), KSProcessWeAppLaunch.stepPageReady);
            C83226n.m102128e(mo125215b0(), KSProcessWeAppLaunch.stepPageInit);
        }
    }

    /* renamed from: J */
    public boolean mo111243J(String str, C83817h4 h4Var) {
        this.f245047B = false;
        this.f245050w = false;
        this.f245051x = false;
        mo116543B0().mo72054M0(new C83932b());
        boolean J = super.mo111243J(str, h4Var);
        mo116542A0(mo125215b0(), this.f244457j, "INITIAL");
        return J;
    }

    /* renamed from: K */
    public void mo111244K() {
        super.mo111244K();
        mo116542A0(mo125215b0(), this.f244457j, "INVISIBLE");
    }

    /* renamed from: S */
    public void mo116489S(Map<String, Object> map, C83817h4 h4Var) {
        C90860a aVar;
        Objects.requireNonNull((C90630c) mo124764Z());
        if (!(C83817h4.NAVIGATE_BACK == h4Var || (aVar = (C90860a) ((C90630c) mo124764Z()).mo109668l(C90860a.class)) == null)) {
            String Kj = aVar.mo124957Kj(this.f244457j);
            if (!TextUtils.isEmpty(Kj)) {
                try {
                    map.put("initialRenderingCacheData", new JSONObject(Kj));
                } catch (Exception e) {
                    Log.printErrStackTrace("Luggage.MPPageViewRenderer", e, "onFillRouteInEventData when parsing initialRenderingCacheData", new Object[0]);
                }
            }
        }
        Map map2 = (Map) map.get("qualityData");
        if (map2 == null) {
            map2 = new HashMap();
            map.put("qualityData", map2);
        }
        map2.put("navId", String.format(Locale.ENGLISH, "%d_%d", new Object[]{Integer.valueOf(((C90630c) mo124764Z()).getComponentId()), Long.valueOf(Util.nowMilliSecond())}));
        map2.put("isWebviewPreload", Boolean.valueOf(mo116543B0().mo72060y0()));
        map2.put("isPreloadPageFrame", Boolean.valueOf(this.f245052y));
        map.put("prerender", Boolean.valueOf(mo116498d0().mo121251g1()));
    }

    /* renamed from: T */
    public void mo111246T() {
        super.mo111246T();
        mo116543B0().mo116615D0();
    }

    /* renamed from: e */
    public boolean mo111252e(String str, String str2, int[] iArr) {
        if (C90595a.m113498b(f245045E, str)) {
            Log.m105925i("Luggage.MPPageViewRenderer", "publish critical appId[%s] url[%s] event[%s]", mo125215b0(), this.f244457j, str);
            if (mo124764Z() != null && ((C90630c) mo124764Z()).f244578Y && "custom_event_GenerateFuncReady".equals(str)) {
                this.f245051x = true;
                C83226n.m102130g(mo125215b0(), KSProcessWeAppLaunch.stepGenerateFuncReadyRespond);
                if (this.f245050w) {
                    C83226n.m102128e(mo125215b0(), KSProcessWeAppLaunch.stepGenerateFuncReadyRespond);
                    this.f245051x = false;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo111254f(String str, String str2, int i) {
        if (!this.f245047B && str.startsWith("custom_event_")) {
            if (str.startsWith("custom_event_vdSync") || str.startsWith("custom_event_vdSyncBatch")) {
                if (((C90630c) mo124764Z()).f244578Y) {
                    if (!this.f245050w) {
                        C83226n.m102128e(mo125215b0(), KSProcessWeAppLaunch.stepVdSync);
                        this.f245050w = true;
                    }
                    if (this.f245051x) {
                        C83226n.m102128e(mo125215b0(), KSProcessWeAppLaunch.stepGenerateFuncReadyRespond);
                        this.f245051x = false;
                    }
                }
                Log.m105925i("Luggage.MPPageViewRenderer", "dispatch critical vdSync appId[%s] url[%s] event[%s] content[%s] src[%d]", mo125215b0(), this.f244457j, str, C90599h.m113522o(str2, 0, 20), Integer.valueOf(i));
            } else {
                Log.m105925i("Luggage.MPPageViewRenderer", "dispatch critical appId[%s] url[%s] event[%s] size[%d] src[%d]", mo125215b0(), this.f244457j, str, Integer.valueOf(Util.nullAsNil(str2).length()), Integer.valueOf(i));
            }
        }
        return false;
    }

    /* renamed from: k */
    public void mo111264k() {
        Log.m105925i("Luggage.MPPageViewRenderer", "dispatchForeground appId[%s] url[%s]", mo125215b0(), this.f244457j);
        super.mo111264k();
        mo116542A0(mo125215b0(), this.f244457j, "VISIBLE");
    }

    /* renamed from: n */
    public boolean mo116544n() {
        return mo116543B0() != null && mo116543B0().mo72057n();
    }

    /* renamed from: o */
    public boolean mo116545o() {
        return mo116543B0() != null && mo116543B0().mo72058o();
    }

    /* renamed from: o0 */
    public C83816h3 mo116068o0() {
        return null;
    }

    /* renamed from: s */
    public void mo116546s() {
        ((C90630c) mo124764Z()).mo114842M();
        mo116543B0().mo72059s();
        ((C90630c) mo124764Z()).mo114841L();
    }

    /* renamed from: t */
    public <T> T mo116072t(Class<T> cls) {
        C90087f fVar;
        Class cls2 = C90087f.class;
        if (cls2 != cls) {
            return super.mo116072t(cls);
        }
        if (this.f245053z != null || (fVar = (C90087f) this.f244454g.mo63321n0(cls2)) == null) {
            return cls.cast(this.f245053z);
        }
        C83931a aVar = new C83931a(fVar);
        this.f245053z = aVar;
        return cls.cast(aVar);
    }

    /* renamed from: t0 */
    public void mo116073t0() {
        C90860a aVar = (C90860a) ((C90630c) mo124764Z()).mo109668l(C90860a.class);
        if (aVar != null) {
            String Jg = aVar.mo124956Jg(this.f244457j);
            String a9 = aVar.mo124959a9(this.f244457j);
            if (!TextUtils.isEmpty(Jg)) {
                boolean z = false;
                Log.m105925i("Luggage.MPPageViewRenderer", "onPageScriptWillExecute get RenderingCache by url[%s], content.size[%d], webviewData.size[%d]", this.f244457j, Integer.valueOf(Util.nullAsNil(Jg).length()), Integer.valueOf(Util.nullAsNil(a9).length()));
                C83780d1 d1Var = (C83780d1) mo124764Z();
                if (Jg != null && d1Var != null) {
                    if (a9 == null || a9.length() == 0) {
                        z = true;
                    }
                    JSONObject jSONObject = null;
                    if (!z) {
                        try {
                            jSONObject = new JSONObject(a9);
                        } catch (Exception unused) {
                        }
                    }
                    C88784a aVar2 = new C88784a();
                    aVar2.mo115194p(d1Var);
                    HashMap hashMap = new HashMap();
                    hashMap.put("content", Jg);
                    hashMap.put("webviewData", jSONObject);
                    hashMap.put("path", d1Var.mo116162Q0());
                    aVar2.mo115165o(hashMap);
                    aVar2.mo115158h();
                }
            }
        }
    }

    /* renamed from: v0 */
    public void mo116075v0(C90636f.C90637a aVar, boolean z, long j, long j2, Object obj) {
        if ("WAPageFrame.html".equals(aVar.f260398i) && !TextUtils.isEmpty(mo125215b0())) {
            C83226n.m102129f(mo125215b0(), KSProcessWeAppLaunch.stepInjectJSWAWebview, "", j, j2);
        }
        if (!this.f245052y && mo124764Z() != null && ((C90630c) mo124764Z()).getRuntime() != null && mo116063j0("checkIsAppSharedPageFrameExecutionFinished").mo59500b(aVar.f260398i)) {
            this.f245052y = true;
        }
    }

    /* renamed from: x0 */
    public C83978y3 mo114318p0(Context context) {
        C83984z3 z3Var = new C83984z3(mo116499y0(context));
        C83978y3.C83979a aVar = this.f245049D;
        C83780d1 d1Var = (C83780d1) C83930t3.this.mo124764Z();
        z3Var.f245172e = d1Var;
        z3Var.f245173f = aVar;
        z3Var.f245174g.f244839a = d1Var;
        z3Var.f245177j.clear();
        mo124765a0(C91390a.class, z3Var);
        return z3Var;
    }

    /* renamed from: y0 */
    public C40501f3 mo116499y0(Context context) {
        return new DefaultWebViewImpl(context, (C83857n2) null);
    }

    /* renamed from: z0 */
    public void mo116500z0(String str, long j, long j2) {
    }
}
