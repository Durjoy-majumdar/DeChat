package com.tencent.p014mm.plugin.appbrand.page;

import android.text.TextUtils;
import android.webkit.ValueCallback;
import com.tencent.p014mm.plugin.appbrand.keylogger.C83226n;
import com.tencent.p014mm.plugin.appbrand.page.C83930t3;
import com.tencent.p014mm.plugin.appbrand.page.C83978y3;
import com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.net.URL;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import js0.C88024r;
import p1044ub.C90630c;
import p1044ub.C90636f;
import p170ic.C87690d;
import p963fc.C86812g;
import rq0.C90087f;

/* renamed from: com.tencent.mm.plugin.appbrand.page.z3 */
public final class C83984z3 extends C83955v2 implements C83978y3 {

    /* renamed from: e */
    public C83780d1 f245172e;

    /* renamed from: f */
    public C83978y3.C83979a f245173f;

    /* renamed from: g */
    public final C83857n2 f245174g;

    /* renamed from: h */
    public volatile boolean f245175h = false;

    /* renamed from: i */
    public boolean f245176i = false;

    /* renamed from: j */
    public final LinkedList<Runnable> f245177j = new LinkedList<>();

    /* renamed from: n */
    public boolean f245178n = false;

    /* renamed from: o */
    public boolean f245179o = false;

    /* renamed from: p */
    public final AtomicBoolean f245180p = new AtomicBoolean(false);

    /* renamed from: q */
    public String f245181q = null;

    /* renamed from: r */
    public long f245182r = 0;

    public C83984z3(C83797e3 e3Var) {
        super(e3Var);
        z3$$c z3__c = new z3$$c(this, (C83780d1) null);
        this.f245174g = z3__c;
        ((C40501f3) e3Var).setAppBrandWebViewClient(z3__c);
        if (this.f245101d.mo63321n0(C90087f.class) == null) {
            this.f245101d.setOnTrimListener(new C83759a4(this));
        }
    }

    /* renamed from: D0 */
    public void mo116615D0() {
        this.f245178n = false;
        C83857n2 n2Var = this.f245174g;
        String a = ((C83930t3.C83934c) this.f245173f).mo116550a();
        this.f245181q = a;
        n2Var.f244841c = a;
        if (this.f245101d.mo63321n0(C90087f.class) == null) {
            this.f245101d.setOnTrimListener(new C83759a4(this));
        }
        Log.m105925i("Luggage.MPWebViewRenderEngineLegacyImpl", "dispatchInit %s, mPageFrameReady %b, mPageFrameLoaded %b", this.f245181q, Boolean.valueOf(this.f245175h), Boolean.valueOf(this.f245176i));
        mo116618u(false);
        z3$$h z3__h = new z3$$h(this);
        if (this.f245175h) {
            mo116619v();
            z3__h.run();
            return;
        }
        this.f245177j.addLast(z3__h);
    }

    /* renamed from: M0 */
    public void mo72054M0(Runnable runnable) {
        if (this.f245175h) {
            mo116619v();
            runnable.run();
            return;
        }
        this.f245177j.addLast(runnable);
    }

    /* renamed from: R0 */
    public final void mo63304R0(URL url, String str, ValueCallback<String> valueCallback) {
        if (!TextUtils.isEmpty(str) && !this.f245180p.get()) {
            C88024r.m109572b(new z3$$e(this, url, str, valueCallback));
        } else if (valueCallback != null) {
            valueCallback.onReceiveValue("FATAL");
        }
    }

    /* renamed from: Z0 */
    public void mo72055Z0(String str, ValueCallback<String> valueCallback) {
        if (this.f245175h) {
            this.f245101d.evaluateJavascript(str, valueCallback);
        } else {
            this.f245177j.addLast(new z3$$f(this, str, valueCallback));
        }
    }

    /* renamed from: b */
    public void mo63307b() {
        super.mo63307b();
    }

    /* renamed from: c */
    public void mo63308c() {
        super.mo63308c();
    }

    public void destroy() {
        if (this.f245180p.getAndSet(true)) {
            return;
        }
        if (!(this.f245172e.getRuntime() instanceof C86812g) || !((C86812g) this.f245172e.getRuntime()).mo113203h1()) {
            super.destroy();
            this.f245177j.clear();
            return;
        }
        this.f245177j.clear();
        this.f245101d.evaluateJavascript("\n        ;(function() {\n            let data = (globalThis || {}).__coverage__;\n            if (typeof data === 'string' || typeof data === 'undefined') {\n                return data;\n            } else {\n                return JSON.stringify(data);\n            }\n        })();\n    ", new z3$$a(this));
    }

    public final void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        mo63304R0((URL) null, str, valueCallback);
    }

    /* renamed from: i */
    public boolean mo72056i() {
        return false;
    }

    /* renamed from: n */
    public boolean mo72057n() {
        return this.f245178n;
    }

    /* renamed from: o */
    public boolean mo72058o() {
        return this.f245179o;
    }

    /* renamed from: s */
    public void mo72059s() {
        Log.m105924i("Luggage.MPWebViewRenderEngineLegacyImpl", "dispatchPreload");
        mo116618u(true);
        z3$$g z3__g = new z3$$g(this);
        if (this.f245175h) {
            mo116619v();
            z3__g.run();
            return;
        }
        this.f245177j.addLast(z3__g);
    }

    public void setAppBrandInfo(Map<String, String> map) {
        this.f245101d.setAppBrandInfo(map);
    }

    public void setOnTrimListener(C40520s2 s2Var) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: u */
    public final void mo116618u(boolean z) {
        String str;
        if (!this.f245176i) {
            this.f245182r = Util.currentTicks();
            C83930t3.C83934c cVar = (C83930t3.C83934c) this.f245173f;
            if (z) {
                cVar.getClass();
                str = C90636f.f260394G0 + "preload/" + "page-frame.html";
            } else {
                str = cVar.mo116550a() + "page-frame.html";
            }
            String b = ((C90630c) C83930t3.this.mo124764Z()).mo114272k().mo113372b("WAPageFrame.html");
            Log.m105925i("Luggage.MPPageViewRenderer", "loadPageFrame url[%s] preload[%b]", str, Boolean.valueOf(z));
            if (!z) {
                C83226n.m102130g(C83930t3.this.mo125215b0(), KSProcessWeAppLaunch.stepInjectWAPageFrameHtml);
                C83930t3.this.mo116543B0().mo72054M0(new C83956v3(cVar));
            }
            C83930t3.this.mo116543B0().mo63314g1(str, b);
            this.f245176i = true;
            if (z) {
                this.f245178n = true;
            }
        }
    }

    /* renamed from: v */
    public final void mo116619v() {
        LinkedList linkedList = new LinkedList(this.f245177j);
        this.f245177j.clear();
        Log.m105925i("Luggage.MPWebViewRenderEngineLegacyImpl", "executeDeferredEvaluations %s size %d, hash[%d]", this.f245181q, Integer.valueOf(linkedList.size()), Integer.valueOf(hashCode()));
        C87690d.m109091b("executeDeferredEvaluations", new z3$$d(this, linkedList));
    }

    /* renamed from: y0 */
    public boolean mo72060y0() {
        return this.f245175h;
    }
}
