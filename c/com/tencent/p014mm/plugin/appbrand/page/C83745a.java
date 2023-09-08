package com.tencent.p014mm.plugin.appbrand.page;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import bl0.C67288e;
import bl0.C79711a;
import bl0.C79713b;
import br0.C39836d;
import bt0.C79808b;
import bt0.C79811f;
import bt0.b$$l;
import cl0.C80050f;
import cl0.C80055h;
import cl0.C80061k;
import cl0.C80062l;
import cl0.C80063m;
import cl0.C80065o;
import cl0.C80066p;
import cl0.C80068q;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.appcache.C81386x1;
import com.tencent.p014mm.plugin.appbrand.appcache.ModulePkgInfo;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.plugin.appbrand.config.C81634a;
import com.tencent.p014mm.plugin.appbrand.debugger.C81739j;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1766o6;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82212b3;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82270c3;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82368d3;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82839n4;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82872p6;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82912q6;
import com.tencent.p014mm.plugin.appbrand.jsapi.camera.C82274d;
import com.tencent.p014mm.plugin.appbrand.jsapi.coverview.C82353a;
import com.tencent.p014mm.plugin.appbrand.jsapi.coverview.C82359b;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82411b0;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82492w;
import com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator.C82802h;
import com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator.C82804j;
import com.tencent.p014mm.plugin.appbrand.jsapi.picker.C17928i;
import com.tencent.p014mm.plugin.appbrand.jsapi.picker.C17929j;
import com.tencent.p014mm.plugin.appbrand.jsapi.picker.C17942k;
import com.tencent.p014mm.plugin.appbrand.jsapi.picker.C17946m;
import com.tencent.p014mm.plugin.appbrand.jsapi.storage.C83017j;
import com.tencent.p014mm.plugin.appbrand.jsapi.storage.C83018k;
import com.tencent.p014mm.plugin.appbrand.jsapi.storage.C83027v;
import com.tencent.p014mm.plugin.appbrand.jsapi.storage.C83031z;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.jsapi.C17988a;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.jsapi.C17990g;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.jsapi.C83051d;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.jsapi.C83053e;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.jsapi.C83054f;
import com.tencent.p014mm.plugin.appbrand.jsapi.webrtc.C83069c;
import com.tencent.p014mm.plugin.appbrand.jsapi.webrtc.C83077f;
import com.tencent.p014mm.plugin.appbrand.jsapi.webrtc.C83080j;
import com.tencent.p014mm.plugin.appbrand.page.C83763b2;
import com.tencent.p014mm.plugin.appbrand.page.C83873p2;
import com.tencent.p014mm.plugin.appbrand.performance.C84003h;
import com.tencent.p014mm.plugin.appbrand.utils.C84754j1;
import com.tencent.p014mm.plugin.appbrand.widget.input.C84981s1;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import fm0.C8132c;
import fm0.C8134n0;
import fm0.C8135u;
import fm0.C8136w;
import fm0.C86927b;
import fm0.C86934e0;
import fm0.C86937f0;
import fm0.C86939g;
import fm0.C86940g0;
import fm0.C86944h1;
import fm0.C86945i;
import fm0.C86950j1;
import fm0.C86954l;
import fm0.C86973q0;
import fm0.C86974q1;
import fm0.C86979s0;
import fm0.C86980s1;
import fm0.C86981t;
import fm0.C86982t0;
import gk0.C45920c;
import gk0.C45922h0;
import gk0.C45931t0;
import gk0.C45933v0;
import gk0.C87237e;
import gy3.C8480h;
import gy3.C87412m;
import java.lang.reflect.Proxy;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import js0.C88020k;
import ll0.C109391e;
import ll0.C109395k;
import ll0.C109402o;
import ll0.C109404p;
import ll0.C88572c;
import ll0.C88573d;
import ll0.C88576g;
import ll0.C88578i;
import mm0.C88785b;
import ol0.C117836s0;
import p1025qb.C89582a;
import p1031sb.C90154a;
import p1044ub.C90630c;
import p1044ub.C90636f;
import p385u2.C111105a;
import p747xb.C91145a;
import p747xb.C91146b;
import p849e3.C107168a0;
import p849e3.C107207u;
import rq0.C90082a;
import rq0.C90085d;
import rq0.C90086e;
import rq0.C90088g;
import rq0.C90091i;
import tm0.C14016b0;
import tm0.C14039u;
import tm0.C78044d0;
import tm0.C90530a0;
import tm0.C90547n;
import tm0.C90548o;
import tm0.C90550q;
import tm0.C90551r;
import tm0.C90552s;
import tq0.C90569a;
import tq0.C90571c;
import tq0.C90572d;
import vk0.C90821p;
import vk0.C90822q;
import vm0.C90836d;
import vm0.C90837e;
import vm0.C90840g;
import vm0.C90841h;
import wi0.C90973a0;
import xk0.C112159h;
import xk0.C91268g;
import xk0.C91277n;
import xk0.C91279p;

/* renamed from: com.tencent.mm.plugin.appbrand.page.a */
public abstract class C83745a<PAGE extends C90630c> extends C91145a<PAGE> implements C90636f, C90085d {

    /* renamed from: f */
    public ViewGroup f244453f;

    /* renamed from: g */
    public C83797e3 f244454g;

    /* renamed from: h */
    public boolean f244455h = false;

    /* renamed from: i */
    public boolean f244456i = false;

    /* renamed from: j */
    public String f244457j;

    /* renamed from: n */
    public C83763b2 f244458n;

    /* renamed from: o */
    public C83827i3 f244459o;

    /* renamed from: p */
    public C83873p2 f244460p;

    /* renamed from: q */
    public C83971x3 f244461q;

    /* renamed from: r */
    public boolean f244462r;

    /* renamed from: s */
    public C83745a<PAGE>.h f244463s;

    /* renamed from: t */
    public C83816h3 f244464t;

    /* renamed from: u */
    public C83750e f244465u;

    /* renamed from: v */
    public C29613m3 f244466v;

    /* renamed from: com.tencent.mm.plugin.appbrand.page.a$a */
    public class C83746a implements View.OnAttachStateChangeListener {
        public C83746a() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            C83873p2 p2Var = C83745a.this.f244460p;
            p2Var.getClass();
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            obtain.setSource(4098);
            Iterator it = ((ConcurrentLinkedDeque) p2Var.f244869c).iterator();
            while (it.hasNext()) {
                View view2 = ((C83873p2.C83880g) it.next()).f244907a.get();
                if (view2 != null) {
                    view2.dispatchTouchEvent(obtain);
                }
            }
            obtain.recycle();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.a$b */
    public class C83747b implements C83763b2.C83765b {
        public C83747b() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.a$c */
    public class C83748c implements C84003h {
        public C83748c(C83745a aVar) {
        }

        public void notifyLongTask(long j) {
            Log.m105919d("Luggage.AbstractMPPageViewRenderer", "notifyLongTask :%d", Long.valueOf(j));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.a$d */
    public class C83749d implements C84754j1.C84756b {

        /* renamed from: a */
        public final /* synthetic */ C90636f.C90637a f244469a;

        /* renamed from: b */
        public final /* synthetic */ long f244470b;

        public C83749d(C90636f.C90637a aVar, long j) {
            this.f244469a = aVar;
            this.f244470b = j;
        }

        /* renamed from: b */
        public void mo114825b(String str) {
            C83745a.this.mo116075v0(this.f244469a, false, this.f244470b, System.currentTimeMillis(), (Object) null);
        }

        public void onSuccess(String str) {
            C83745a.this.mo116075v0(this.f244469a, true, this.f244470b, System.currentTimeMillis(), (Object) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.a$e */
    public interface C83750e {
        /* renamed from: a */
        void mo59499a(String str);

        /* renamed from: b */
        boolean mo59500b(String str);

        /* renamed from: c */
        void mo59501c();

        /* renamed from: d */
        void mo59502d(String str);

        String name();
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.a$f */
    public final class C83751f implements C83750e {
        public C83751f(C83746a aVar) {
        }

        /* renamed from: a */
        public void mo59499a(String str) {
            if (C83745a.this.mo116498d0().f238115M.mo123571d()) {
                String c = C83745a.this.mo116498d0().f238115M.mo123570c(str);
                if (!ModulePkgInfo.MAIN_MODULE_NAME.equals(c)) {
                    C83745a.this.f244466v.mo56848a(c, true);
                    StringBuilder sb = new StringBuilder();
                    sb.append(c);
                    String str2 = "/";
                    if (c.endsWith(str2)) {
                        str2 = "";
                    }
                    sb.append(str2);
                    String sb4 = sb.toString();
                    mo116080e(sb4 + "common.app.js");
                    mo116080e(sb4 + "webview.app.js");
                }
            }
        }

        /* renamed from: b */
        public boolean mo59500b(String str) {
            return "webview.app.js".equals(str);
        }

        /* renamed from: c */
        public void mo59501c() {
            C83745a.this.f244466v.mo56848a(ModulePkgInfo.MAIN_MODULE_NAME, true);
            mo116080e("common.app.js");
            mo116080e("webview.app.js");
        }

        /* renamed from: d */
        public void mo59502d(String str) {
        }

        /* renamed from: e */
        public final void mo116080e(String str) {
            String a = C83745a.this.mo116065l0().mo116116a(str);
            if (!TextUtils.isEmpty(a)) {
                C83745a.this.mo116066m0(str, a);
                return;
            }
            throw new C81386x1(str);
        }

        public String name() {
            return "LazyCodeLoading";
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.a$g */
    public final class C83752g implements C83750e {
        public C83752g(C83746a aVar) {
        }

        /* renamed from: a */
        public void mo59499a(String str) {
            if (C83745a.this.mo116498d0().f238115M.mo123571d()) {
                String c = C83745a.this.mo116498d0().f238115M.mo123570c(str);
                StringBuilder sb = new StringBuilder();
                sb.append(c);
                String str2 = "/";
                if (c.endsWith(str2)) {
                    str2 = "";
                }
                sb.append(str2);
                sb.append("page-frame.js");
                String sb4 = sb.toString();
                String a = C83745a.this.mo116065l0().mo116116a(sb4);
                if (!TextUtils.isEmpty(a)) {
                    C83745a.this.f244466v.mo56848a(c, false);
                    C83745a.this.mo116066m0(sb4, a);
                    return;
                }
                throw new C81386x1(sb4);
            }
        }

        /* renamed from: b */
        public boolean mo59500b(String str) {
            return "app-wxss.js".equals(str) || "page-frame.html".equals(str);
        }

        /* renamed from: c */
        public void mo59501c() {
            C83745a.this.f244466v.mo56848a(ModulePkgInfo.MAIN_MODULE_NAME, false);
            if (C83745a.this.mo116498d0().f238115M.mo123571d()) {
                String a = C83745a.this.mo116065l0().mo116116a("app-wxss.js");
                if (!TextUtils.isEmpty(a)) {
                    C83745a.this.mo116066m0("app-wxss.js", a);
                    return;
                }
                throw new C81386x1("app-wxss.js");
            }
            C83745a.this.mo116066m0("page-frame.html", C83745a.this.mo116065l0().mo116116a("page-frame.html"));
        }

        /* renamed from: d */
        public void mo59502d(String str) {
            C83745a.this.mo116066m0(str, C83745a.this.mo116065l0().mo116116a(str));
        }

        public String name() {
            return "Legacy";
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.a$h */
    public final class C83753h extends C83767b3 {
        public C83753h(Context context) {
            super(context);
        }

        @JavascriptInterface
        public float getWidth() {
            try {
                float ceil = (float) Math.ceil((double) (((float) C83745a.this.mo116498d0().mo113054f0().getVDisplayMetrics().widthPixels) / getPixelRatio()));
                float ceil2 = (float) Math.ceil((double) (((float) C83745a.this.f244453f.getWidth()) / super.getPixelRatio()));
                if (ceil2 > 0.0f && ceil2 != ceil) {
                    Log.m105929w("Luggage.AbstractMPPageViewRenderer", "__deviceInfo.getWidth(), resources[%f] != view[%f], may in pad env", Float.valueOf(ceil), Float.valueOf(ceil2));
                }
                return ceil;
            } catch (Throwable th) {
                Log.printErrStackTrace("Luggage.AbstractMPPageViewRenderer", th, "__DeviceInfo.getWidth()", new Object[0]);
                throw th;
            }
        }
    }

    public C83745a(PAGE page) {
        super(page);
    }

    /* renamed from: e0 */
    public static int m102838e0(C81634a.C81639e eVar, boolean z, C90973a0 a0Var, boolean z2) {
        C90973a0 a0Var2 = C90973a0.TRANSPARENT;
        int i = 0;
        int b = a0Var == a0Var2 ? 0 : z ? C111105a.m151500b(MMApplicationContext.getContext(), C0966R.color.f2947a4) : -1;
        try {
            b = C88020k.m109562m(eVar.f239658h);
        } catch (Exception unused) {
        }
        if (a0Var != a0Var2 && !z2) {
            i = -16777216;
        }
        return i | b;
    }

    /* renamed from: C */
    public void mo111238C() {
        Log.m105925i("Luggage.AbstractMPPageViewRenderer", "dispatchPageReady appId:%s, url:%s", mo125215b0(), this.f244457j);
        this.f244456i = true;
        C83971x3 x3Var = this.f244461q;
        if (x3Var != null) {
            x3Var.setVisibility(8);
            C83971x3 x3Var2 = this.f244461q;
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            if (C107207u.C107211e.m145207b(x3Var2)) {
                ((C90630c) mo124764Z()).f244554F.setNavLoadingIconVisibilityResetListener((b$$l) null);
                ((C90630c) mo124764Z()).f244554F.setLoadingIconVisibility(this.f244461q.f245157g);
                ((ViewGroup) this.f244461q.getParent()).removeView(this.f244461q);
                Log.m105925i("Luggage.AbstractMPPageViewRenderer", "dismissWaitingReadyCover appId:%s, url:%s", mo125215b0(), this.f244457j);
            }
            C83971x3 x3Var3 = this.f244461q;
            x3Var3.removeAllViews();
            C79808b bVar = x3Var3.f245156f;
            if (bVar != null) {
                bVar.mo109942k();
            }
            this.f244461q = null;
        }
    }

    /* renamed from: F */
    public final C83797e3 mo111240F(Context context) {
        if (context == null) {
            context = mo125216c0();
        }
        this.f244454g = mo114318p0(context);
        if (System.currentTimeMillis() % 1000 == 1 || WeChatEnvironment.hasDebugger() || BuildInfo.IS_FLAVOR_RED) {
            Log.m105924i("Luggage.AbstractMPPageViewRenderer", "do observeLongTask");
            this.f244454g.addJavascriptInterface(mo116059f0(), "PageLongTaskReporter");
            this.f244462r = true;
        }
        C83797e3 e3Var = this.f244454g;
        C83745a<PAGE>.h hVar = new C83753h(context);
        this.f244463s = hVar;
        e3Var.addJavascriptInterface(hVar, "__deviceInfo");
        return this.f244454g;
    }

    /* renamed from: G */
    public View mo111241G(LayoutInflater layoutInflater) {
        return new FrameLayout(layoutInflater.getContext().getApplicationContext());
    }

    /* renamed from: J */
    public boolean mo111243J(String str, C83817h4 h4Var) {
        this.f244457j = ((C90630c) mo124764Z()).mo116162Q0();
        ((C90630c) mo124764Z()).mo116163R0();
        mo124765a0(C90088g.class, new C83770c(this, (C83780d1) mo124764Z(), this.f244458n));
        this.f244460p.mo116445w(new C83760b(this));
        ((C90630c) mo124764Z()).mo115903o0(h4Var);
        if (mo116067n0()) {
            Objects.requireNonNull((C90630c) mo124764Z());
            Objects.requireNonNull(((C90630c) mo124764Z()).mo116157L0());
            Objects.requireNonNull(((C90630c) mo124764Z()).getRuntime());
            this.f244454g.setBackgroundColor(m102838e0(((C90630c) mo124764Z()).mo116157L0(), ((C90630c) mo124764Z()).getRuntime().mo113008F().mo113988g(), ((C90630c) mo124764Z()).getRuntime().mo113036W().mo111304q(), false));
        }
        C83887q3 q3Var = (C83887q3) mo116072t(C83887q3.class);
        String k0 = mo116064k0();
        q3Var.f244930b.f261391f = false;
        q3Var.f244931c = k0;
        if (!((C90630c) mo124764Z()).mo114270e0().mo113499c(this.f244457j, true)) {
            Log.m105921e("Luggage.AbstractMPPageViewRenderer", "Empty page content, appId[%s] url[%s], abort inject", mo125215b0(), str);
            mo116071s0(str);
            return false;
        }
        if (mo116076w0(h4Var)) {
            this.f244461q = new C83971x3(mo116498d0().f238141d, (C83780d1) mo124764Z());
        }
        mo116073t0();
        if (!this.f244455h) {
            try {
                mo116063j0("injectAppSharedPageFrameScript").mo59501c();
                this.f244455h = true;
            } catch (C81386x1 unused) {
            }
        }
        String str2 = this.f244457j;
        try {
            mo116063j0(String.format(Locale.ENGLISH, "injectModuleSharedPageFrameScript(%s)", new Object[]{str2})).mo59499a(str2);
        } catch (C81386x1 unused2) {
            Log.m105921e("Luggage.AbstractMPPageViewRenderer", "injectModuleSharedPageFrameScript appId[%s] path[%s] ScriptNotFoundException", mo125215b0(), str2);
        }
        String str3 = this.f244457j;
        try {
            mo116063j0(String.format(Locale.ENGLISH, "injectPageScript(%s)", new Object[]{str3})).mo59502d(str3);
        } catch (C81386x1 unused3) {
            Log.m105921e("Luggage.AbstractMPPageViewRenderer", "injectPageScript appId[%s] url[%s] ScriptNotFoundException", mo125215b0(), str3);
        }
        return true;
    }

    /* renamed from: K */
    public void mo111244K() {
        super.mo111244K();
        this.f244454g.mo63307b();
    }

    /* renamed from: T */
    public void mo111246T() {
        C90572d dVar;
        Class<C90088g> cls = C90088g.class;
        mo124765a0(C90086e.class, new C83887q3((C83780d1) mo124764Z()));
        Class<C90091i> cls2 = C90091i.class;
        C83780d1 d1Var = (C83780d1) mo124764Z();
        C87412m.m108594g(d1Var, "page");
        if (d1Var.f244577X.getStatusBar() == null) {
            Class<C90572d> cls3 = C90572d.class;
            C90571c cVar = new C90571c();
            dVar = (C90572d) Proxy.newProxyInstance(cls3.getClassLoader(), new Class[]{cls3}, cVar);
        } else {
            ((C90154a) d1Var.mo109671p(C90154a.class)).getClass();
            dVar = new C90569a(d1Var);
        }
        C87412m.m108593f(dVar, "createHelper(page)");
        mo124765a0(cls2, new C83961w3(d1Var, dVar));
        C83778d dVar2 = new C83778d();
        mo124765a0(cls, (C90088g) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, dVar2));
        C83780d1 d1Var2 = (C83780d1) mo124764Z();
        C87412m.m108594g(d1Var2, "pv");
        C91146b bVar = new C91146b(d1Var2, (C8480h) null);
        d1Var2.mo114868y(bVar);
        d1Var2.mo114864j(bVar);
        d1Var2.mo114865m(bVar);
    }

    /* renamed from: W */
    public void mo111247W(View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        this.f244453f = frameLayout;
        frameLayout.addOnAttachStateChangeListener(new C83746a());
        this.f244459o = new C84981s1((C83780d1) mo124764Z());
        if (this.f244454g == null) {
            ((C90630c) mo124764Z()).mo114842M();
        }
        this.f244454g.mo63312f(mo125216c0());
        this.f244454g.setFullscreenImpl(((C90630c) mo124764Z()).mo116151F0());
        this.f244454g.setOnScrollChangedListener(this.f244459o);
        this.f244454g.setWebViewLayoutListener(this.f244459o);
        ((C84981s1) this.f244459o).mo117861a(this.f244454g);
        C83763b2 b2Var = new C83763b2(mo116498d0() != null ? mo116498d0().f238141d : mo125216c0(), this.f244454g);
        this.f244458n = b2Var;
        b2Var.addView(((C84981s1) this.f244459o).f247661e);
        this.f244458n.setOnPullDownOffsetListener(this.f244459o);
        this.f244458n.setOnPullDownListener(new C83747b());
        this.f244453f.addView(this.f244458n);
        C83873p2 p2Var = new C83873p2(((C84981s1) this.f244459o).f247661e);
        this.f244460p = p2Var;
        C39836d F0 = ((C90630c) mo124764Z()).mo116151F0();
        p2Var.f244874h = F0;
        F0.mo62473a(new C83863o2(p2Var));
    }

    /* renamed from: a */
    public boolean mo111249a(int i, String str) {
        return false;
    }

    /* renamed from: b */
    public void mo111250b() {
        super.mo111250b();
        this.f244459o.mo111233i(this.f244454g);
        this.f244454g.destroy();
        this.f244454g = null;
        this.f244453f.removeAllViewsInLayout();
        this.f244458n.removeAllViewsInLayout();
        this.f244458n = null;
        this.f244459o = null;
    }

    /* renamed from: e */
    public boolean mo111252e(String str, String str2, int[] iArr) {
        return false;
    }

    /* renamed from: f */
    public boolean mo111254f(String str, String str2, int i) {
        return false;
    }

    /* renamed from: f0 */
    public C84003h mo116059f0() {
        return new C83748c(this);
    }

    /* renamed from: g0 */
    public final int mo116060g0() {
        return ((C90630c) mo124764Z()).getComponentId();
    }

    public final C83873p2 getCustomViewContainer() {
        return this.f244460p;
    }

    /* renamed from: h0 */
    public final C83820i0 mo116061h0() {
        return ((C90630c) mo124764Z()).f244572U;
    }

    /* renamed from: i0 */
    public final int mo116062i0() {
        return ((C90630c) mo124764Z()).mo116147B0();
    }

    /* renamed from: j */
    public final C83827i3 mo111262j() {
        return this.f244459o;
    }

    /* renamed from: j0 */
    public final C83750e mo116063j0(String str) {
        if (this.f244465u == null) {
            this.f244465u = mo116069q0();
            this.f244466v = mo116070r0();
            Log.m105925i("Luggage.AbstractMPPageViewRenderer", "getInjectionMode created mode name = %s, appId = %s, reason = %s", this.f244465u.name(), mo125215b0(), str);
        }
        return this.f244465u;
    }

    /* renamed from: k */
    public void mo111264k() {
        C83971x3 x3Var;
        Log.m105925i("Luggage.AbstractMPPageViewRenderer", "dispatchForeground appId:%s, url:%s, mIsPageReady:%b", mo125215b0(), this.f244457j, Boolean.valueOf(this.f244456i));
        super.mo111264k();
        this.f244454g.mo63308c();
        ((C90630c) mo124764Z()).mo115898G1();
        if (!this.f244456i && (x3Var = this.f244461q) != null) {
            FrameLayout frameLayout = (FrameLayout) this.f244453f;
            if (x3Var.getParent() != frameLayout) {
                boolean z = ((C90630c) mo124764Z()).f244554F.f233897p.getVisibility() == 0;
                ((C90630c) mo124764Z()).f244554F.setLoadingIconVisibility(true);
                ((C90630c) mo124764Z()).f244554F.setNavLoadingIconVisibilityResetListener(this.f244461q);
                C83971x3 x3Var2 = this.f244461q;
                x3Var2.f245157g = z;
                if (x3Var2.getParent() instanceof ViewGroup) {
                    ((ViewGroup) this.f244461q.getParent()).removeView(this.f244461q);
                }
                frameLayout.addView(this.f244461q, new FrameLayout.LayoutParams(-1, -1));
            }
            C83971x3 x3Var3 = this.f244461q;
            Context c0 = mo125216c0();
            C79811f fVar = x3Var3.f245155e;
            if (fVar != null) {
                fVar.mo109972S(c0);
            }
            this.f244461q.mo116606b();
            this.f244461q.bringToFront();
            Log.m105925i("Luggage.AbstractMPPageViewRenderer", "revealWaitingReadyCover appId:%s, url:%s", mo125215b0(), this.f244457j);
        }
    }

    /* renamed from: k0 */
    public String mo116064k0() {
        return ((C90630c) mo124764Z()).mo116157L0().f239663m;
    }

    /* renamed from: l0 */
    public final C83816h3 mo116065l0() {
        if (this.f244464t == null) {
            C83816h3 o0 = mo116068o0();
            this.f244464t = o0;
            if (o0 == null) {
                this.f244464t = new C83858n3(this);
            }
        }
        return this.f244464t;
    }

    /* renamed from: m0 */
    public final void mo116066m0(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            Log.m105921e("Luggage.AbstractMPPageViewRenderer", "[!]injectScript appId[%s] name[%s] url[%s] hash[%d] source EMPTY", mo125215b0(), str, this.f244457j, Integer.valueOf(hashCode()));
            return;
        }
        C90636f.C90637a aVar = new C90636f.C90637a();
        aVar.f260398i = str;
        aVar.f260399j = str2;
        aVar.f260400k = (long) str2.length();
        long currentTimeMillis = System.currentTimeMillis();
        Log.m105925i("Luggage.AbstractMPPageViewRenderer", "injectScript start, appId[%s] name[%s] url[%s] hash[%d]", mo125215b0(), str, this.f244457j, Integer.valueOf(hashCode()));
        URL url = null;
        try {
            if (TextUtils.isEmpty(str)) {
                Log.m105929w("Luggage.AbstractMPPageViewRenderer", "[!] injectScript, valid name is required, appId:%s, url:%s", mo125215b0(), this.f244457j);
            } else {
                url = new URL(C113600ck.f339986i, WeChatHosts.domainString(C0966R.string.fme), str);
            }
        } catch (Exception unused) {
        }
        C84754j1.m104418b(((C90630c) mo124764Z()).getJsRuntime(), url, str2, new C83749d(aVar, currentTimeMillis));
    }

    /* renamed from: n0 */
    public final boolean mo116067n0() {
        C90630c cVar = (C90630c) mo124764Z();
        return cVar != null && cVar.isRunning();
    }

    /* renamed from: o0 */
    public C83816h3 mo116068o0() {
        return null;
    }

    /* renamed from: p */
    public Map<String, C82870p> mo111268p() {
        C89582a aVar = new C89582a();
        aVar.mo123892a(new C82839n4());
        aVar.mo123892a(new C109395k());
        aVar.mo123892a(new C88573d());
        aVar.mo123892a(new C88572c());
        aVar.mo123892a(new C109402o());
        aVar.mo123892a(new C109391e());
        aVar.mo123892a(new C109404p());
        aVar.mo123892a(new C88576g());
        aVar.mo123892a(new C88578i());
        aVar.mo123892a(new C90551r());
        aVar.mo123892a(new C90552s());
        aVar.mo123892a(new C90550q());
        aVar.mo123892a(new C90547n());
        aVar.mo123892a(new C86954l());
        aVar.mo123892a(new C8135u());
        aVar.mo123892a(new C86981t());
        aVar.mo123892a(new C1766o6());
        aVar.mo123892a(new C17928i());
        aVar.mo123892a(new C17942k());
        aVar.mo123892a(new C8132c());
        aVar.mo123892a(new C82368d3());
        aVar.mo123892a(new C17988a());
        aVar.mo123892a(new C17990g());
        aVar.mo123892a(new C83054f());
        aVar.mo123892a(new C83053e());
        aVar.mo123892a(new C83051d());
        aVar.mo123892a(new C91268g());
        aVar.mo123892a(new C112159h());
        aVar.mo123892a(new C91277n());
        aVar.mo123892a(new C91279p());
        aVar.mo123892a(new C86927b());
        aVar.mo123892a(new C45922h0());
        aVar.mo123892a(new C45933v0());
        aVar.mo123892a(new C45920c());
        aVar.mo123892a(new C45931t0());
        aVar.mo123892a(new C82912q6());
        aVar.mo123892a(new C78044d0());
        aVar.mo123892a(new C79711a());
        aVar.mo123892a(new C67288e());
        aVar.mo123892a(new C79713b());
        aVar.mo123892a(new C87237e());
        aVar.mo123892a(new C17929j());
        aVar.mo123892a(new C17946m());
        aVar.mo123892a(new C82872p6());
        aVar.mo123892a(new C82359b());
        aVar.mo123892a(new C80068q());
        aVar.mo123892a(new C80063m());
        aVar.mo123892a(new C82353a());
        aVar.mo123892a(new C80065o());
        aVar.mo123892a(new C80061k());
        aVar.mo123892a(new C82274d());
        aVar.mo123892a(new C90822q());
        aVar.mo123892a(new C90821p());
        aVar.mo123892a(new C81739j());
        aVar.mo123892a(new C80050f());
        aVar.mo123892a(new C86934e0());
        aVar.mo123892a(new C80055h());
        aVar.mo123892a(new C80066p());
        aVar.mo123892a(new C80062l());
        aVar.mo123892a(new C86979s0());
        aVar.mo123892a(new C8134n0());
        aVar.mo123892a(new C86950j1());
        aVar.mo123892a(new C86945i());
        aVar.mo123892a(new C86940g0());
        aVar.mo123892a(new C86937f0());
        ArrayList arrayList = (ArrayList) C117836s0.m166248a();
        if (arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                aVar.mo123892a((C82870p) it.next());
            }
        }
        aVar.mo123892a(new C90840g());
        aVar.mo123892a(new C90836d());
        aVar.mo123892a(new C86944h1());
        aVar.mo123892a(new C86939g());
        aVar.mo123892a(new C90841h());
        aVar.mo123892a(new C90837e());
        aVar.mo123892a(new C82804j());
        aVar.mo123892a(new C82802h());
        aVar.mo123892a(new C86973q0());
        aVar.mo123892a(new C83017j());
        aVar.mo123892a(new C83027v());
        aVar.mo123892a(new C83031z());
        aVar.mo123892a(new C83018k());
        aVar.mo123892a(new C90548o());
        aVar.mo123892a(new C90530a0());
        aVar.mo123892a(new C14039u());
        aVar.mo123892a(new C14016b0());
        aVar.mo123892a(new C86974q1());
        aVar.mo123892a(new C88785b());
        aVar.mo123892a(new C82492w());
        aVar.mo123892a(new C86980s1());
        aVar.mo123892a(new C86982t0());
        aVar.mo123892a(new C8136w());
        aVar.mo123892a(new C82212b3());
        aVar.mo123892a(new C82270c3());
        aVar.mo123892a(new C83069c());
        aVar.mo123892a(new C83080j());
        aVar.mo123892a(new C83077f());
        aVar.mo123892a(new C82411b0());
        return aVar.f257782a;
    }

    /* renamed from: p0 */
    public abstract C83797e3 mo114318p0(Context context);

    /* renamed from: q0 */
    public C83750e mo116069q0() {
        return ((C83773c1) ((C90630c) mo124764Z()).mo109671p(C83773c1.class)).mo116114a() ? new C83751f((C83746a) null) : new C83752g((C83746a) null);
    }

    /* renamed from: r */
    public RelativeLayout.LayoutParams mo111269r(View view, View view2) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        if (view2 != null) {
            if (view2.getId() == -1) {
                view2.setId(C0966R.C0970id.f5954t9);
            }
            layoutParams.addRule(2, view2.getId());
        }
        return layoutParams;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0015, code lost:
        r1 = r0.f238590i;
     */
    /* renamed from: r0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.p014mm.plugin.appbrand.page.C29613m3 mo116070r0() {
        /*
            r2 = this;
            com.tencent.mm.plugin.appbrand.jsapi.f r0 = r2.mo124764Z()
            gy3.C87412m.m108591d(r0)
            ub.c r0 = (p1044ub.C90630c) r0
            java.lang.Class<com.tencent.luggage.sdk.config.AppBrandSysConfigLU> r1 = com.tencent.luggage.sdk.config.AppBrandSysConfigLU.class
            com.tencent.mm.plugin.appbrand.jsapi.m r0 = r0.mo109671p(r1)
            com.tencent.luggage.sdk.config.AppBrandSysConfigLU r0 = (com.tencent.luggage.sdk.config.AppBrandSysConfigLU) r0
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r0 = r0.f261072r
            if (r0 == 0) goto L_0x0020
            com.tencent.mm.plugin.appbrand.appcache.WxaRuntimeModulePluginListMap r1 = r0.f238590i
            if (r1 == 0) goto L_0x0020
            android.util.ArrayMap<com.tencent.mm.plugin.appbrand.appcache.r3, java.util.List<com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo>> r1 = r1.f238594d
            int r1 = r1.size()
            goto L_0x0021
        L_0x0020:
            r1 = 0
        L_0x0021:
            if (r1 <= 0) goto L_0x002e
            com.tencent.mm.plugin.appbrand.page.k3 r1 = new com.tencent.mm.plugin.appbrand.page.k3
            com.tencent.mm.plugin.appbrand.appcache.WxaRuntimeModulePluginListMap r0 = r0.f238590i
            gy3.C87412m.m108591d(r0)
            r1.<init>(r2, r0)
            goto L_0x0033
        L_0x002e:
            com.tencent.mm.plugin.appbrand.page.l3 r1 = new com.tencent.mm.plugin.appbrand.page.l3
            r1.<init>()
        L_0x0033:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.page.C83745a.mo116070r0():com.tencent.mm.plugin.appbrand.page.m3");
    }

    /* renamed from: s0 */
    public void mo116071s0(String str) {
        ((C90630c) mo124764Z()).mo116180h1(str);
    }

    /* renamed from: t */
    public <T> T mo116072t(Class<T> cls) {
        return ICommLibReader.class.equals(cls) ? cls.cast(((C90630c) mo124764Z()).mo114272k()) : cls.isInstance(this) ? cls.cast(this) : super.mo116072t(cls);
    }

    /* renamed from: t0 */
    public void mo116073t0() {
    }

    /* renamed from: u0 */
    public final void mo116074u0(d1$$r d1__r) {
        C90630c cVar = (C90630c) mo124764Z();
        if (cVar.isRunning() && cVar.getRuntime() != null) {
            C83849m0 Z = cVar.getRuntime().mo113042Z();
            synchronized (Z.f244744o) {
                Z.f244747r.push(d1__r);
            }
        }
    }

    /* renamed from: v0 */
    public void mo116075v0(C90636f.C90637a aVar, boolean z, long j, long j2, Object obj) {
    }

    /* renamed from: w */
    public boolean mo111271w() {
        return false;
    }

    /* renamed from: w0 */
    public boolean mo116076w0(C83817h4 h4Var) {
        return (mo124764Z() == null || !((C90630c) mo124764Z()).f244578Y) && ((C90630c) mo124764Z()).getRuntime().mo113036W().mo111304q() != C90973a0.TRANSPARENT && C83817h4.AUTO_RE_LAUNCH == h4Var;
    }

    /* renamed from: x */
    public void mo111272x(C79808b bVar) {
        mo124765a0(C90082a.class, new C83881p3((C83780d1) mo124764Z()));
        super.mo111272x(bVar);
    }
}
