package com.tencent.luggage.skyline.wxa;

import android.util.SparseArray;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40481j;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83174m;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83181q;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83187w;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.skyline.IRouteBackCallback;
import com.tencent.skyline.SkylineRuntime;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import p176jc.C87919d;
import p176jc.C87943x;
import p194lc.C88434b;
import p194lc.C88440c;
import p194lc.C88441d;
import p194lc.C88443e;
import p194lc.C88445f;
import p194lc.C88446g;
import p194lc.C88447h;
import p194lc.C88452m;
import p194lc.C88461r;
import p194lc.C88466v;
import p284zb.C91635f;
import p284zb.C91639h;
import p963fc.C86812g;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/luggage/skyline/wxa/AppServiceSkylineExtensionImpl;", "Lzb/h;", "luggage-skyline-ext_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
public final class AppServiceSkylineExtensionImpl implements C91639h {

    /* renamed from: a */
    public final C91635f f235024a;

    /* renamed from: b */
    public final LinkedList<Runnable> f235025b = new LinkedList<>();

    /* renamed from: c */
    public boolean f235026c;

    /* renamed from: d */
    public SkylineRuntime f235027d;

    /* renamed from: e */
    public volatile boolean f235028e;

    /* renamed from: f */
    public volatile boolean f235029f;

    /* renamed from: g */
    public volatile boolean f235030g;

    /* renamed from: h */
    public final LinkedList<Runnable> f235031h = new LinkedList<>();

    /* renamed from: i */
    public boolean f235032i;

    /* renamed from: j */
    public boolean f235033j;

    /* renamed from: k */
    public boolean f235034k;

    /* renamed from: l */
    public boolean f235035l;

    /* renamed from: m */
    public final ArrayList<Integer> f235036m = new ArrayList<>();

    /* renamed from: n */
    public final Object f235037n = new Object();

    /* renamed from: com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl$a */
    public static final class C80285a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C91635f f235038d;

        public C80285a(C91635f fVar) {
            this.f235038d = fVar;
        }

        public final void run() {
            this.f235038d.mo114339j0("requireRenderContext", "");
        }
    }

    public AppServiceSkylineExtensionImpl(C91635f fVar) {
        C87412m.m108594g(fVar, "appService");
        this.f235024a = fVar;
    }

    /* renamed from: g */
    public static final void m97721g(AppServiceSkylineExtensionImpl appServiceSkylineExtensionImpl, SkylineRuntime skylineRuntime) {
        C87943x xVar;
        CopyOnWriteArraySet<IRouteBackCallback> copyOnWriteArraySet;
        appServiceSkylineExtensionImpl.getClass();
        skylineRuntime.clearJSBindings();
        skylineRuntime.release();
        SparseArray<C87943x> sparseArray = C87943x.f254511e;
        int hashCode = skylineRuntime.hashCode();
        SparseArray<C87943x> sparseArray2 = C87943x.f254511e;
        synchronized (sparseArray2) {
            int indexOfKey = sparseArray2.indexOfKey(hashCode);
            if (indexOfKey >= 0) {
                C87943x valueAt = sparseArray2.valueAt(indexOfKey);
                C87943x xVar2 = valueAt;
                sparseArray2.removeAt(indexOfKey);
                xVar = valueAt;
            } else {
                xVar = null;
            }
        }
        if (xVar != null && (copyOnWriteArraySet = xVar.f254515d) != null) {
            copyOnWriteArraySet.clear();
        }
    }

    /* renamed from: a */
    public void mo111452a() {
        StringBuilder sb = new StringBuilder();
        sb.append("onPreload preloadRenderContext:");
        C87919d dVar = C87919d.f254457a;
        dVar.getClass();
        sb.append(C87919d.f254462f);
        Log.m105924i("AppServiceSkylineExtensionImpl", sb.toString());
        dVar.getClass();
        if (C87919d.f254462f) {
            mo111458h(this.f235024a, false);
        }
    }

    /* renamed from: b */
    public void mo111453b() {
        Log.m105924i("AppServiceSkylineExtensionImpl", "dispatchDestroy " + hashCode());
        this.f235030g = true;
    }

    /* renamed from: c */
    public void mo111454c() {
        this.f235028e = true;
        synchronized (this.f235031h) {
            while (!this.f235031h.isEmpty()) {
                Runnable pollFirst = this.f235031h.pollFirst();
                if (pollFirst != null) {
                    pollFirst.run();
                }
            }
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    /* renamed from: d */
    public /* synthetic */ void mo111455d(C86812g gVar, C91635f fVar) {
    }

    /* renamed from: e */
    public void mo111456e(C91635f fVar) {
        C87412m.m108594g(fVar, "service");
        ICommLibReader k = fVar.mo114272k();
        C87412m.m108591d(k);
        if (Boolean.parseBoolean(k.Yk0("skyline"))) {
            fVar.getJsRuntime().addJavascriptInterface(new C88452m(), "SkylineGlobal");
        }
    }

    /* renamed from: f */
    public void mo111457f() {
    }

    /* renamed from: h */
    public final void mo111458h(C91635f fVar, boolean z) {
        if (z && !this.f235033j) {
            synchronized (this) {
                if (!this.f235033j) {
                    int hashCode = hashCode();
                    Log.m105924i("AppServiceSkylineExtensionImpl", "injectSkylineBindings " + hashCode + " stack:" + android.util.Log.getStackTraceString(new Throwable()));
                    if (fVar.mo114272k() != null) {
                        ICommLibReader k = fVar.mo114272k();
                        C87412m.m108591d(k);
                        if (Boolean.parseBoolean(k.Yk0("skyline"))) {
                            HashMap hashMap = new HashMap();
                            hashMap.putAll(C88461r.f255534a.mo122634a());
                            ((ConcurrentHashMap) fVar.f241586h).putAll(hashMap);
                            C83165i jsRuntime = fVar.getJsRuntime();
                            if (jsRuntime != null) {
                                C83187w wVar = (C83187w) jsRuntime.mo63321n0(C83187w.class);
                                C83181q qVar = (C83181q) jsRuntime.mo63321n0(C83181q.class);
                                if (!(wVar == null || qVar == null)) {
                                    this.f235032i = true;
                                    SkylineRuntime skylineRuntime = this.f235027d;
                                    if (skylineRuntime == null) {
                                        skylineRuntime = new SkylineRuntime();
                                        this.f235027d = skylineRuntime;
                                        skylineRuntime.init();
                                    }
                                    SkylineRuntime skylineRuntime2 = skylineRuntime;
                                    skylineRuntime2.initResourceLoader(new C88466v(fVar));
                                    skylineRuntime2.initNativeHandler(new C88434b(qVar));
                                    skylineRuntime2.waitForWindowReady(new C88440c(hashCode, this, fVar));
                                    skylineRuntime2.waitForWindowDestroy(new C88441d(hashCode, this, skylineRuntime2));
                                    skylineRuntime2.waitForBootstrap(new C88443e(this, fVar, hashCode, qVar, skylineRuntime2));
                                    skylineRuntime2.waitForBootstrap(new C88445f(this));
                                    qVar.post(new C88446g(hashCode, jsRuntime, skylineRuntime2, wVar));
                                    C40481j n0 = jsRuntime.mo63321n0(C83174m.class);
                                    C87412m.m108593f(n0, "jsRuntime.getAddon(\n    …ss.java\n                )");
                                    ((C83174m) n0).mo115384z0(new C88447h(hashCode, this, skylineRuntime2));
                                    this.f235033j = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!this.f235034k) {
            mo111459i(new C80285a(fVar));
            this.f235034k = true;
        }
    }

    /* renamed from: i */
    public final void mo111459i(Runnable runnable) {
        if (runnable != null) {
            if (this.f235028e) {
                runnable.run();
                return;
            }
            synchronized (this.f235031h) {
                this.f235031h.addLast(runnable);
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
    }
}
