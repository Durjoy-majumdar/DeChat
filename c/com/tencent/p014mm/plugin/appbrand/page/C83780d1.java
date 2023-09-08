package com.tencent.p014mm.plugin.appbrand.page;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import b34.C79664a;
import br0.C39836d;
import br0.C79774c;
import br0.C79778e;
import bt0.C79808b;
import bt0.C79811f;
import bt0.C79815i;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.config.C81634a;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82531i;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82549j;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40482o;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import com.tencent.p014mm.plugin.appbrand.menu.C83699y;
import com.tencent.p014mm.plugin.appbrand.utils.C84726c2;
import com.tencent.p014mm.plugin.appbrand.widget.input.C84963i1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.system.AndroidContextUtil;
import cr0.C86127t;
import gt0.C87362k;
import gt0.C87373m0;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import js0.C88020k;
import js0.C88024r;
import junit.framework.Assert;
import org.json.JSONObject;
import p1042u.C90590d;
import p170ic.C87690d;
import p225rc.C89915f;
import p225rc.C89925n;
import qq0.C89797e;
import rq0.C90083b;
import rq0.C90088g;
import rq0.C90090h;
import to0.C90561a;
import u24.C90595a;
import u24.C90599h;
import wt0.C91110d;

/* renamed from: com.tencent.mm.plugin.appbrand.page.d1 */
public class C83780d1 extends C83812h implements C82520h, C83866o4 {

    /* renamed from: A */
    public volatile AppBrandRuntime f244549A;

    /* renamed from: B */
    public String f244550B;

    /* renamed from: C */
    public String f244551C;

    /* renamed from: D */
    public ViewGroup f244552D;

    /* renamed from: E */
    public C79811f f244553E;

    /* renamed from: F */
    public C79808b f244554F;

    /* renamed from: G */
    public FrameLayout f244555G;

    /* renamed from: H */
    public C83873p2 f244556H;

    /* renamed from: I */
    public C83827i3 f244557I;

    /* renamed from: J */
    public C83797e3 f244558J;

    /* renamed from: K */
    public C90561a f244559K;

    /* renamed from: L */
    public C83799f f244560L;

    /* renamed from: M */
    public volatile boolean f244561M;

    /* renamed from: N */
    public volatile boolean f244562N;

    /* renamed from: P */
    public volatile boolean f244563P;

    /* renamed from: Q */
    public C79815i.C79816a f244564Q;

    /* renamed from: Q0 */
    public final Object f244565Q0;

    /* renamed from: R */
    public C39836d f244566R;

    /* renamed from: R0 */
    public int[] f244567R0;

    /* renamed from: S */
    public List<C83699y> f244568S;

    /* renamed from: S0 */
    public int[] f244569S0;

    /* renamed from: T */
    public final C91110d f244570T;

    /* renamed from: T0 */
    public C83859n4 f244571T0;

    /* renamed from: U */
    public C83820i0 f244572U;

    /* renamed from: U0 */
    public final AtomicBoolean f244573U0;

    /* renamed from: V */
    public C83857n2 f244574V;

    /* renamed from: V0 */
    public boolean f244575V0;

    /* renamed from: W */
    public C83810g4 f244576W;

    /* renamed from: X */
    public C79774c f244577X;

    /* renamed from: Y */
    public boolean f244578Y;

    /* renamed from: Z */
    public final LinkedList<Animator> f244579Z;

    /* renamed from: p0 */
    public final C87373m0 f244580p0;

    /* renamed from: x */
    public final int f244581x;

    /* renamed from: x0 */
    public String f244582x0;

    /* renamed from: y */
    public C83905r1 f244583y;

    /* renamed from: y0 */
    public boolean f244584y0;

    /* renamed from: z */
    public final Class<? extends C83905r1> f244585z;

    public C83780d1(Class<? extends C83905r1> cls) {
        this.f244581x = C0966R.C0970id.f5864qs;
        this.f244561M = false;
        this.f244562N = false;
        this.f244563P = false;
        this.f244564Q = null;
        this.f244570T = new C91110d(this);
        this.f244576W = null;
        this.f244577X = new C86127t();
        this.f244578Y = false;
        this.f244579Z = new LinkedList<>();
        this.f244580p0 = new d1$$k(this);
        this.f244584y0 = false;
        this.f244565Q0 = new byte[0];
        this.f244567R0 = new int[0];
        this.f244569S0 = new int[0];
        this.f244573U0 = new AtomicBoolean(false);
        this.f244575V0 = false;
        this.f244585z = cls;
    }

    /* renamed from: l0 */
    public static /* synthetic */ Boolean m102930l0(C83780d1 d1Var, C83817h4 h4Var, String str, long j) {
        Boolean bool;
        int i;
        synchronized (d1Var.f244565Q0) {
            d1Var.mo116206y0(h4Var);
            C83817h4 h4Var2 = C83817h4.SWITCH_TAB;
            if (h4Var2 != h4Var || !((C83783d4) d1Var.f244571T0).mo116238k(str)) {
                if (((C83787e) d1Var.f244571T0).isEmpty()) {
                    i = d1Var.getComponentId();
                } else {
                    i = Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), Long.valueOf(System.currentTimeMillis())});
                }
                if (h4Var2 == h4Var) {
                    ((C83783d4) d1Var.f244571T0).mo116239l(str, i, j);
                    bool = Boolean.TRUE;
                } else {
                    int ordinal = h4Var.ordinal();
                    if (ordinal == 3) {
                        ((C83787e) d1Var.f244571T0).mo116250i();
                    } else if (ordinal == 5 || ordinal == 6) {
                        ((C83787e) d1Var.f244571T0).clear();
                    }
                    int ordinal2 = h4Var.ordinal();
                    if (ordinal2 == 2 || ordinal2 == 4 || ordinal2 == 8 || ordinal2 == 9) {
                        throw new UnsupportedOperationException("Unsupported openType:" + h4Var.name());
                    }
                    d1Var.f244571T0.mo116237j(new C83853m4(str, i, j));
                    bool = Boolean.TRUE;
                }
            } else {
                bool = Boolean.TRUE;
            }
        }
        return bool;
    }

    /* renamed from: m0 */
    public static /* synthetic */ boolean m102931m0(C83780d1 d1Var, String str, C40482o oVar) {
        if (oVar == null) {
            d1Var.getClass();
        } else if (oVar != d1Var.getJsRuntime() && (d1Var.mo116160O0() == null || oVar != d1Var.mo116160O0().getJsRuntime())) {
            String format = String.format(Locale.ENGLISH, "checkIsActivatedForEval, weired with worker(%s), appId:%s, api:%s", new Object[]{oVar, d1Var.getAppId(), str});
            if (d1Var.mo114851u()) {
                Assert.fail(format);
            } else {
                Log.m105928w("MicroMsg.AppBrandPageView", format);
            }
        }
        return true;
    }

    /* renamed from: A0 */
    public final Activity mo116146A0() {
        C79774c cVar = this.f244577X;
        return cVar instanceof C86127t ? ((C86127t) cVar).mo120548w() : AndroidContextUtil.castActivityOrNull(getContext());
    }

    /* renamed from: B0 */
    public final int mo116147B0() {
        int i;
        synchronized (this.f244565Q0) {
            Objects.requireNonNull(this.f244571T0);
            C83853m4 f = ((C83787e) this.f244571T0).mo116248f();
            Objects.requireNonNull(f);
            i = f.f244833c;
        }
        return i;
    }

    /* renamed from: C */
    public String mo114327C() {
        return "AppBrandPageView";
    }

    /* renamed from: C0 */
    public final int mo116148C0() {
        int size;
        synchronized (this.f244565Q0) {
            C83859n4 n4Var = this.f244571T0;
            size = n4Var == null ? 0 : n4Var.size();
        }
        return size;
    }

    /* renamed from: D0 */
    public final long mo116149D0() {
        long j;
        synchronized (this.f244565Q0) {
            Objects.requireNonNull(this.f244571T0);
            C83853m4 f = ((C83787e) this.f244571T0).mo116248f();
            Objects.requireNonNull(f);
            j = f.f244834d;
        }
        return j;
    }

    /* renamed from: E */
    public final void mo114838E(int i, String str, C40482o oVar) {
        if (oVar == getJsRuntime() || oVar == null) {
            mo109647a(i, str);
        } else {
            super.mo114838E(i, str, oVar);
        }
    }

    /* renamed from: E0 */
    public final <T> T mo116150E0(Class<T> cls) {
        if (mo116158M0() != null) {
            return mo116158M0().mo116072t(cls);
        }
        return null;
    }

    /* renamed from: F */
    public final void mo114329F() {
        super.mo114329F();
        mo115902j1();
        C82549j jVar = this.f244657w;
        jVar.f241645d.clear();
        jVar.f241648g.clear();
        jVar.f241646e.clear();
        jVar.f241647f.clear();
        jVar.f241649h.clear();
        jVar.f241650i.clear();
        jVar.f241652n.clear();
        jVar.f241651j.clear();
        mo116188p0();
        AppBrandRuntime appBrandRuntime = this.f244549A;
        if (appBrandRuntime != null) {
            if (appBrandRuntime.mo113042Z() != null) {
                C83970x2 x2Var = appBrandRuntime.mo113042Z().f244753x;
                long D0 = mo116149D0();
                x2Var.f245153c.remove(D0);
                x2Var.f245151a.remove(D0);
                x2Var.f245152b.remove(D0);
            }
            appBrandRuntime.f238113K.mo122978a(new d1$$b(this));
        }
    }

    /* renamed from: F0 */
    public final C39836d mo116151F0() {
        C39836d dVar = this.f244566R;
        if (dVar != null) {
            return dVar;
        }
        C79774c cVar = this.f244577X;
        if (cVar == null) {
            Log.m105929w("MicroMsg.AppBrandPageView", "getFullscreenImpl NULL windowAndroid, appId[%s] url[%s]", getAppId(), mo116162Q0());
            return null;
        }
        C39836d createFullscreenHandler = cVar.createFullscreenHandler(new d1$$e(this));
        this.f244566R = createFullscreenHandler;
        createFullscreenHandler.mo62473a(new d1$$f(this));
        return this.f244566R;
    }

    /* renamed from: G0 */
    public final ViewGroup mo116152G0() {
        return this.f244557I.getContainer();
    }

    /* renamed from: H */
    public final Map<String, C82870p> mo114330H() {
        if (mo116158M0() != null) {
            return mo116158M0().mo111268p();
        }
        return null;
    }

    /* renamed from: H0 */
    public C84963i1 mo116153H0() {
        if (getContext() instanceof C84963i1) {
            return (C84963i1) getContext();
        }
        return null;
    }

    /* renamed from: I0 */
    public final List<C83699y> mo116154I0() {
        if (this.f244568S == null) {
            this.f244568S = mo116194s0();
        }
        return this.f244568S;
    }

    /* renamed from: J */
    public C83165i mo114092J() {
        C83797e3 e3Var;
        Context context = getContext();
        if (mo116158M0() != null) {
            e3Var = mo116158M0().mo111240F(context);
        } else {
            if (this.f244574V == null) {
                this.f244574V = new C83857n2(this);
            }
            e3Var = new DefaultWebViewImpl(context, this.f244574V);
        }
        this.f244558J = e3Var;
        return e3Var;
    }

    /* renamed from: J0 */
    public C83699y mo116155J0(int i) {
        for (C83699y next : mo116154I0()) {
            if (next != null && next.f244317a == i) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: K0 */
    public String mo116156K0() {
        C79808b bVar = this.f244554F;
        CharSequence mainTitle = bVar == null ? null : bVar.getMainTitle();
        return mainTitle != null ? mainTitle.toString() : "";
    }

    /* renamed from: L0 */
    public final C81634a.C81639e mo116157L0() {
        if (!isRunning()) {
            return null;
        }
        return getRuntime().mo113008F().mo113984c(mo116162Q0());
    }

    /* renamed from: M0 */
    public final C83905r1 mo116158M0() {
        Class<? extends C83905r1> cls = this.f244585z;
        if (cls == null) {
            return null;
        }
        C83905r1 r1Var = this.f244583y;
        if (r1Var != null) {
            return r1Var;
        }
        C83905r1 r1Var2 = (C83905r1) new C79664a(cls, cls).mo109791d(this).f233575b;
        this.f244583y = r1Var2;
        return r1Var2;
    }

    /* renamed from: N0 */
    public Bitmap mo116159N0() {
        C83797e3 e3Var = this.f244558J;
        if (e3Var == null) {
            return null;
        }
        Bitmap b = C83907r4.m103302b(e3Var.getWrapperView());
        if (b != null) {
            ViewGroup G0 = mo116152G0();
            C83907r4.m103301a(G0, G0, new Canvas(b));
        }
        return b;
    }

    /* renamed from: O0 */
    public C81925i2 mo116160O0() {
        if (getRuntime() == null) {
            return null;
        }
        return getRuntime().mo113047b0();
    }

    /* renamed from: P0 */
    public C90561a mo116161P0() {
        if (this.f244559K != null) {
            Log.m105918d("MicroMsg.AppBrandPageView", "return keyBoardComponentView(AppBrandKeyBoardComponentView)");
            return this.f244559K;
        }
        this.f244559K = new C90561a(getRuntime() == null ? getContext() : getRuntime().f238141d, this);
        Log.m105918d("MicroMsg.AppBrandPageView", "make new keyBoardComponentView(AppBrandKeyBoardComponentView)");
        return this.f244559K;
    }

    /* renamed from: Q0 */
    public final String mo116162Q0() {
        synchronized (this.f244565Q0) {
            if (mo116148C0() < 1) {
                return this.f244550B;
            }
            C83853m4 f = ((C83787e) this.f244571T0).mo116248f();
            Objects.requireNonNull(f);
            String str = f.f244832b;
            return str;
        }
    }

    /* renamed from: R0 */
    public final String mo116163R0() {
        synchronized (this.f244565Q0) {
            if (mo116148C0() < 1) {
                return this.f244551C;
            }
            C83853m4 f = ((C83787e) this.f244571T0).mo116248f();
            Objects.requireNonNull(f);
            String str = f.f244831a;
            return str;
        }
    }

    /* renamed from: S0 */
    public final C83797e3 mo116164S0() {
        return this.f244558J;
    }

    /* renamed from: T0 */
    public void mo116165T0() {
        C83799f fVar = this.f244560L;
        if (fVar != null) {
            if (fVar.f244650c) {
                this.f244554F.setNavHidden(true);
            }
            C83799f fVar2 = this.f244560L;
            if (fVar2 != null) {
                fVar2.f244649b = true;
            }
        }
    }

    /* renamed from: U0 */
    public void mo116166U0(Context context, AppBrandRuntime appBrandRuntime) {
        this.f244549A = appBrandRuntime;
        this.f244561M = true;
        this.f244560L = mo116192r0();
        mo116203w1(appBrandRuntime.mo113054f0());
        this.f241590o.addAll(appBrandRuntime.f238104B);
        mo114842M();
        mo114841L();
        this.f241595t = new d1$$d(this);
        if (mo116158M0() != null) {
            Context context2 = getRuntime().f238141d;
            View view = (View) C87690d.m109090a("AppBrandPageViewProfile| onCreateView", new C83832j1(this, context2));
            C87690d.m109091b("AppBrandPageViewProfile| onViewCreated", new C83841k1(this, context2, view));
            C87690d.m109091b("AppBrandPageViewProfile| initActionBar", new C83848l1(this));
            this.f244555G = (FrameLayout) view;
            this.f244557I = mo116158M0().mo111262j();
            this.f244556H = mo116158M0().getCustomViewContainer();
        }
        C89797e eVar = appBrandRuntime.f238159x;
        eVar.getClass();
        C89797e.C89800b bVar = eVar.f258193h;
        C89797e.C89798a aVar = new C89797e.C89798a(eVar, this);
        bVar.getClass();
        bVar.f258203a.put(hashCode(), aVar);
        Log.m105924i("MicroMsg.AppBrandPageView", "AppBrandPageViewProfile| dispatchStart");
        if (mo116158M0() != null) {
            mo116158M0().mo111246T();
        }
    }

    /* renamed from: V0 */
    public boolean mo116167V0() {
        return false;
    }

    /* renamed from: W0 */
    public boolean mo116168W0() {
        if (mo116158M0() != null) {
            return mo116158M0().mo116490d();
        }
        return false;
    }

    /* renamed from: X0 */
    public boolean mo116169X0(long j, String str, C83817h4 h4Var) {
        boolean z;
        synchronized (this.f244565Q0) {
            mo116206y0(h4Var);
            Objects.requireNonNull(this.f244571T0);
            if (this.f244582x0 == null) {
                this.f244582x0 = Util.nullAsNil(str);
                Iterator<C83853m4> it = ((C83787e) this.f244571T0).iterator();
                z = true;
                while (it.hasNext()) {
                    C83853m4 next = it.next();
                    if (C90599h.m113509b(next.mo116406b(), str) && next.mo116405a() == getComponentId()) {
                        z = false;
                    }
                }
                if (z) {
                    Assert.assertTrue(((C83787e) this.f244571T0).isEmpty());
                }
            } else {
                ((C83787e) this.f244571T0).clear();
                z = true;
            }
            if (z) {
                if (mo116205x1()) {
                    mo116198u0(j, str, h4Var, (JSONObject) null, false);
                } else {
                    this.f244571T0.mo116237j(new C83853m4(str, getComponentId(), j));
                }
            }
        }
        this.f244550B = C89925n.m112488a(str);
        this.f244551C = str;
        this.f244558J.setXWebKeyboardImpl(new d1$$g(this));
        if (mo116158M0() != null) {
            return mo116158M0().mo111243J(str, h4Var);
        }
        mo115903o0(h4Var);
        if (mo114270e0().mo113501d(this.f244550B)) {
            return true;
        }
        mo116180h1(str);
        mo116176e1("onPageScriptNotFound");
        return false;
    }

    /* renamed from: Y0 */
    public boolean mo116170Y0() {
        if (this.f244566R.mo62476d()) {
            return true;
        }
        if (mo116158M0() != null && mo116158M0().mo111271w()) {
            return true;
        }
        boolean z = false;
        for (C82531i.C82532a onBackPressed : this.f244657w.f241649h) {
            if (onBackPressed.onBackPressed()) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: Z0 */
    public final void mo116171Z0() {
        this.f244563P = false;
        if (mo116158M0() != null) {
            mo116158M0().mo111244K();
        }
        mo116182k1();
        C82549j jVar = this.f244657w;
        for (C82531i.C82533b b : jVar.f241646e) {
            b.mo22089b();
        }
        jVar.mo114876g(false);
    }

    /* renamed from: a */
    public final void mo109647a(int i, String str) {
        if (mo116158M0() == null || !mo116158M0().mo111249a(i, str)) {
            super.mo114838E(i, str, (C40482o) null);
        }
    }

    /* renamed from: a0 */
    public final boolean mo114334a0() {
        if (mo116158M0() == null) {
            return this.f244562N;
        }
        C90090h hVar = (C90090h) mo116158M0().mo116072t(C90090h.class);
        return hVar != null && hVar.mo116545o();
    }

    /* renamed from: a1 */
    public View mo116172a1() {
        return null;
    }

    /* renamed from: b0 */
    public final boolean mo114335b0() {
        if (mo116158M0() == null) {
            return getRuntime() == null;
        }
        C90090h hVar = (C90090h) mo116158M0().mo116072t(C90090h.class);
        return hVar != null && hVar.mo116544n();
    }

    /* renamed from: b1 */
    public View mo116173b1(Context context) {
        return null;
    }

    /* renamed from: c */
    public C82520h.C82521a mo109649c(boolean z) {
        return z ? getRuntime().f238125T0 : this.f244556H;
    }

    /* renamed from: c1 */
    public final void mo116174c1() {
        mo116183l1();
        if (mo116158M0() != null) {
            mo116158M0().mo111250b();
        }
        for (C82531i.C82534c onDestroy : this.f244657w.f241648g) {
            onDestroy.onDestroy();
        }
    }

    /* renamed from: d1 */
    public final void mo116175d1() {
        C84726c2 c2Var;
        mo116203w1(getRuntime().mo113054f0());
        this.f244563P = true;
        if (mo116158M0() != null) {
            mo116158M0().mo111264k();
        }
        mo116184m1();
        C82549j jVar = this.f244657w;
        for (C82531i.C82535d c : jVar.f241647f) {
            c.mo22090c();
        }
        jVar.mo114876g(true);
        AppBrandRuntime runtime = getRuntime();
        if (runtime == null) {
            Log.m105928w("MicroMsg.AppBrand.SafeScreenShotRecordSwitcher", "get, runtime is null");
            c2Var = null;
        } else {
            c2Var = runtime.f238140c1;
        }
        if (c2Var != null) {
            C81634a.C81639e L0 = mo116157L0();
            Objects.requireNonNull(L0);
            boolean equals = "hidden".equals(L0.f239666p);
            boolean z = c2Var.f247124c;
            String str = c2Var.f247123b;
            Log.m105924i(str, "setHiddenInBackgroundSwitch, runtimeSwitch: " + z + ", pageSwitch: " + equals);
            if (z) {
                c2Var.mo117453b();
            } else if (equals) {
                c2Var.mo117453b();
            } else {
                c2Var.mo117452a();
            }
        }
    }

    /* renamed from: e */
    public void mo109651e(String str, String str2, int[] iArr) {
        if (this.f244549A == null || this.f244549A.mo113047b0() == null) {
            Log.m105921e("MicroMsg.AppBrandPageView", "publish runtime destroyed, event %s", str);
        } else if (mo116158M0() == null || !mo116158M0().mo111252e(str, str2, iArr)) {
            this.f244549A.mo113047b0().mo109652f(str, str2, getComponentId());
        }
    }

    /* renamed from: e1 */
    public final void mo116176e1(String str) {
        C83820i0 i0Var = this.f244572U;
        C83849m0 pageContainer = i0Var != null ? i0Var.getPageContainer() : getRuntime() != null ? getRuntime().mo113042Z() : null;
        if (pageContainer != null) {
            C83970x2 x2Var = pageContainer.f244753x;
            long D0 = mo116149D0();
            x2Var.getClass();
            x2Var.mo116604a(D0, "routeInitReadyTime", Long.valueOf(Util.nowMilliSecond()), false);
        }
        boolean andSet = this.f244573U0.getAndSet(true);
        Log.m105925i("MicroMsg.AppBrandPageView", "onInitReady appId:%s, url:%s, reason:%s, called:%b", getAppId(), mo116162Q0(), str, Boolean.valueOf(andSet));
        if (!andSet) {
            mo109673t(new d1$$h(this));
        }
    }

    /* renamed from: f */
    public final void mo109652f(String str, String str2, int i) {
        if (mo116158M0() == null) {
            super.mo109652f(str, str2, i);
        } else if (!mo116158M0().mo111254f(str, str2, i)) {
            super.mo109652f(str, str2, i);
        }
    }

    /* renamed from: f0 */
    public C79774c mo114271f0() {
        return this.f244577X;
    }

    /* renamed from: f1 */
    public boolean mo116177f1(View view, Runnable runnable) {
        return false;
    }

    public void finalize() {
        super.finalize();
        this.f244549A = null;
    }

    /* renamed from: g1 */
    public boolean mo116179g1(View view, Runnable runnable, long j) {
        return false;
    }

    public final int getComponentId() {
        int i;
        synchronized (this.f244565Q0) {
            int[] iArr = this.f244569S0;
            if (iArr == null || iArr.length <= 0) {
                int hash = Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), Long.valueOf(System.currentTimeMillis())});
                this.f244569S0 = new int[]{hash};
                int[] iArr2 = this.f244567R0;
                if (iArr2 == null || iArr2.length <= 0) {
                    this.f244567R0 = new int[]{hash};
                }
            }
            i = this.f244569S0[0];
        }
        return i;
    }

    public final View getContentView() {
        return this.f244552D;
    }

    public C82520h.C82521a getCustomViewContainer() {
        return this.f244556H;
    }

    public AppBrandRuntime getRuntime() {
        return this.f244549A;
    }

    /* renamed from: h1 */
    public void mo116180h1(String str) {
    }

    /* renamed from: i1 */
    public void mo116181i1(List<C83699y> list, Runnable runnable, Runnable runnable2) {
        new d1$$q(this, this, new LinkedList(list), false, runnable, runnable2).mo116324n();
    }

    public boolean isRunning() {
        return this.f244561M && super.isRunning();
    }

    /* renamed from: j1 */
    public void mo115902j1() {
        this.f244558J.destroy();
        C83873p2 p2Var = this.f244556H;
        if (p2Var != null) {
            p2Var.getClass();
            C83886q2 q2Var = new C83886q2(p2Var, 1000, Boolean.FALSE);
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                q2Var.exec((MMHandler) null);
            }
            q2Var.exec(p2Var.f244868b);
        }
        C79808b bVar = this.f244554F;
        if (bVar != null) {
            bVar.mo109942k();
        }
        ViewGroup viewGroup = this.f244552D;
        if (viewGroup != null) {
            viewGroup.removeAllViewsInLayout();
        }
        C79811f fVar = this.f244553E;
        if (fVar != null) {
            fVar.setActuallyVisible(false);
            this.f244553E.removeAllViewsInLayout();
        }
        FrameLayout frameLayout = this.f244555G;
        if (frameLayout != null) {
            frameLayout.removeAllViewsInLayout();
        }
        this.f244570T.mo125168b(true);
        if (getRuntime() != null) {
            C87362k kVar = getRuntime().f238156u;
            ((C90590d) kVar.f253206q).remove(this.f244580p0);
        }
        this.f244558J = null;
        C83873p2 p2Var2 = this.f244556H;
        if (p2Var2 != null) {
            p2Var2.mo116431i();
        }
        this.f244556H = null;
        this.f244552D = null;
        this.f244553E = null;
        this.f244555G = null;
        this.f244554F = null;
        this.f244560L = null;
        C90561a aVar = this.f244559K;
        if (aVar != null) {
            Log.m105924i("MicroMsg.AppBrandKeyBoardComponentView", "destroy view containers");
            Log.m105924i("MicroMsg.AppBrandKeyBoardComponentView", "clear views");
            C88024r.m109572b(aVar.f260189f);
            aVar.f260190g = null;
            aVar.f260188e = null;
            this.f244559K = null;
        }
    }

    /* renamed from: k1 */
    public void mo116182k1() {
    }

    /* renamed from: l1 */
    public void mo116183l1() {
        this.f244561M = false;
    }

    /* renamed from: m1 */
    public void mo116184m1() {
    }

    /* renamed from: n0 */
    public void mo116185n0() {
        C83799f fVar = this.f244560L;
        if (fVar != null) {
            this.f244554F.setNavResetStyleListener(fVar);
            this.f244554F.setNavHidden(false);
            if (this.f244560L.f244649b) {
                mo116165T0();
            }
        }
    }

    /* renamed from: n1 */
    public void mo116186n1() {
    }

    /* renamed from: o0 */
    public void mo115903o0(C83817h4 h4Var) {
        int i;
        C90088g gVar;
        C90088g gVar2;
        Class cls = C90088g.class;
        C81634a.C81639e L0 = mo116157L0();
        Objects.requireNonNull(L0);
        mo116199u1(L0.f239651a);
        mo109673t(new C83807g1(this, 1.0d));
        try {
            i = C88020k.m109562m(L0.f239654d);
        } catch (Exception unused) {
            try {
                i = C88020k.m109562m(L0.f239657g);
            } catch (Exception unused2) {
                i = -1;
            }
        }
        mo116191q1(i);
        mo109673t(new C83814h1(this, L0.f239652b));
        mo116208z0("custom".equalsIgnoreCase(L0.f239653c));
        boolean z = L0.f239660j;
        if (!(mo116158M0() == null || (gVar2 = (C90088g) mo116158M0().mo116072t(cls)) == null)) {
            gVar2.mo116505d(z);
        }
        String str = L0.f239662l;
        String str2 = L0.f239657g;
        if (!(mo116158M0() == null || (gVar = (C90088g) mo116158M0().mo116072t(cls)) == null)) {
            gVar.mo116111a(str, str2);
        }
        mo116193r1(!L0.f239656f);
        if (this.f244578Y) {
            this.f244554F.setNavHidden(true);
        }
    }

    /* renamed from: o1 */
    public void mo116187o1() {
        mo116275j0(new d1$$o(this));
    }

    /* renamed from: p0 */
    public void mo116188p0() {
        if (this.f244579Z.size() > 0) {
            Iterator it = new LinkedList(this.f244579Z).iterator();
            while (it.hasNext()) {
                ((Animator) it.next()).cancel();
            }
        }
    }

    /* renamed from: p1 */
    public void mo116189p1(boolean z) {
    }

    /* renamed from: q0 */
    public final boolean mo116190q0(int i) {
        synchronized (this.f244565Q0) {
            C83859n4 n4Var = this.f244571T0;
            if (n4Var == null) {
                return false;
            }
            Iterator<C83853m4> it = ((C83787e) n4Var).iterator();
            while (((C89915f) it).hasNext()) {
                if (i == ((C83853m4) ((e$$b) it).next()).f244833c) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: q1 */
    public void mo116191q1(int i) {
        mo109673t(new d1$$i(this, i));
    }

    /* renamed from: r0 */
    public C83799f mo116192r0() {
        Assert.assertTrue(MMHandlerThread.isMainThread());
        return new C83799f(this);
    }

    /* renamed from: r1 */
    public void mo116193r1(boolean z) {
        mo109673t(new d1$$n(this, z));
    }

    /* renamed from: s0 */
    public List<C83699y> mo116194s0() {
        return Collections.emptyList();
    }

    /* renamed from: s1 */
    public void mo116195s1(int i) {
        mo109673t(new d1$$l(this, i));
    }

    /* renamed from: t0 */
    public View mo116196t0(ViewGroup viewGroup) {
        return null;
    }

    /* renamed from: t1 */
    public void mo116197t1(boolean z) {
        mo109673t(new d1$$m(this, z));
    }

    /* renamed from: u0 */
    public final boolean mo116198u0(long j, String str, C83817h4 h4Var, JSONObject jSONObject, boolean z) {
        boolean z2;
        Assert.assertTrue(mo116205x1());
        try {
            z2 = ((Boolean) new d1$$c(this, h4Var, str, j).call()).booleanValue();
        } catch (Exception unused) {
            z2 = false;
        }
        return z2 && ((C90083b) mo116158M0().mo116072t(C90083b.class)).mo122850P(j, str, h4Var, jSONObject, z);
    }

    /* renamed from: u1 */
    public void mo116199u1(String str) {
        mo109673t(new d1$$j(this, str));
    }

    /* renamed from: v0 */
    public final int mo116200v0(long j, int i, boolean z) {
        int i2;
        Assert.assertTrue(mo116205x1());
        try {
            i2 = ((Integer) new d1$$a(this, i).call()).intValue();
        } catch (Exception unused) {
            i2 = 0;
        }
        if (i2 > 0) {
            ((C90083b) mo116158M0().mo116072t(C90083b.class)).mo122852u(j, i2, z);
        }
        return i2;
    }

    /* renamed from: v1 */
    public void mo116201v1(String str) {
        mo116275j0(new d1$$p(this, str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006d, code lost:
        if (r6 == false) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006f, code lost:
        r7.f244572U.getContainer().mo116379y(r7.f244572U, "scene_swipe_back");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007e, code lost:
        r7.f244572U.mo116228N(mo116162Q0(), r7);
        r7.f244572U.mo116299o(r8, r3, (com.tencent.p014mm.plugin.appbrand.page.m0$$c0) null, (org.json.JSONObject) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008f, code lost:
        return r10;
     */
    /* renamed from: w0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo116202w0(long r8, int r10) {
        /*
            r7 = this;
            com.tencent.mm.plugin.appbrand.page.h4 r3 = com.tencent.p014mm.plugin.appbrand.page.C83817h4.NAVIGATE_BACK
            boolean r0 = r7.mo116205x1()
            junit.framework.Assert.assertTrue(r0)
            r6 = 0
            java.lang.Object r0 = r7.f244565Q0     // Catch:{ all -> 0x0093 }
            monitor-enter(r0)     // Catch:{ all -> 0x0093 }
            com.tencent.mm.plugin.appbrand.page.n4 r1 = r7.f244571T0     // Catch:{ all -> 0x0090 }
            if (r1 != 0) goto L_0x0024
            monitor-exit(r0)     // Catch:{ all -> 0x0090 }
            com.tencent.mm.plugin.appbrand.page.i0 r10 = r7.f244572U
            java.lang.String r0 = r7.mo116162Q0()
            r10.mo116228N(r0, r7)
            com.tencent.mm.plugin.appbrand.page.i0 r0 = r7.f244572U
            r4 = 0
            r5 = 0
            r1 = r8
            r0.mo116299o(r1, r3, r4, r5)
            return r6
        L_0x0024:
            com.tencent.mm.plugin.appbrand.page.e r1 = (com.tencent.p014mm.plugin.appbrand.page.C83787e) r1     // Catch:{ all -> 0x0090 }
            boolean r1 = r1.mo116249h(r10)     // Catch:{ all -> 0x0090 }
            if (r1 != 0) goto L_0x003f
            monitor-exit(r0)     // Catch:{ all -> 0x0090 }
            com.tencent.mm.plugin.appbrand.page.i0 r10 = r7.f244572U
            java.lang.String r0 = r7.mo116162Q0()
            r10.mo116228N(r0, r7)
            com.tencent.mm.plugin.appbrand.page.i0 r0 = r7.f244572U
            r4 = 0
            r5 = 0
            r1 = r8
            r0.mo116299o(r1, r3, r4, r5)
            return r6
        L_0x003f:
            r1 = 0
        L_0x0040:
            com.tencent.mm.plugin.appbrand.page.n4 r2 = r7.f244571T0     // Catch:{ all -> 0x0090 }
            com.tencent.mm.plugin.appbrand.page.e r2 = (com.tencent.p014mm.plugin.appbrand.page.C83787e) r2     // Catch:{ all -> 0x0090 }
            com.tencent.mm.plugin.appbrand.page.m4 r2 = r2.mo116248f()     // Catch:{ all -> 0x0090 }
            if (r2 != 0) goto L_0x004c
        L_0x004a:
            r10 = r1
            goto L_0x006c
        L_0x004c:
            com.tencent.mm.plugin.appbrand.page.n4 r4 = r7.f244571T0     // Catch:{ all -> 0x0090 }
            com.tencent.mm.plugin.appbrand.page.e r4 = (com.tencent.p014mm.plugin.appbrand.page.C83787e) r4     // Catch:{ all -> 0x0090 }
            r4.mo116250i()     // Catch:{ all -> 0x0090 }
            int r1 = r1 + 1
            int r4 = r2.mo116405a()     // Catch:{ all -> 0x0090 }
            if (r10 != r4) goto L_0x0040
            com.tencent.mm.plugin.appbrand.page.n4 r10 = r7.f244571T0     // Catch:{ all -> 0x0090 }
            com.tencent.mm.plugin.appbrand.page.e r10 = (com.tencent.p014mm.plugin.appbrand.page.C83787e) r10     // Catch:{ all -> 0x0090 }
            boolean r10 = r10.isEmpty()     // Catch:{ all -> 0x0090 }
            if (r10 == 0) goto L_0x004a
            com.tencent.mm.plugin.appbrand.page.n4 r10 = r7.f244571T0     // Catch:{ all -> 0x0090 }
            r10.mo116237j(r2)     // Catch:{ all -> 0x0090 }
            r6 = 1
            goto L_0x004a
        L_0x006c:
            monitor-exit(r0)     // Catch:{ all -> 0x0090 }
            if (r6 == 0) goto L_0x007e
            com.tencent.mm.plugin.appbrand.page.i0 r8 = r7.f244572U
            com.tencent.mm.plugin.appbrand.page.m0 r8 = r8.getContainer()
            com.tencent.mm.plugin.appbrand.page.i0 r9 = r7.f244572U
            java.lang.String r0 = "scene_swipe_back"
            r8.mo116379y(r9, r0)
            goto L_0x008f
        L_0x007e:
            com.tencent.mm.plugin.appbrand.page.i0 r0 = r7.f244572U
            java.lang.String r1 = r7.mo116162Q0()
            r0.mo116228N(r1, r7)
            com.tencent.mm.plugin.appbrand.page.i0 r0 = r7.f244572U
            r4 = 0
            r5 = 0
            r1 = r8
            r0.mo116299o(r1, r3, r4, r5)
        L_0x008f:
            return r10
        L_0x0090:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0090 }
            throw r10     // Catch:{ all -> 0x0093 }
        L_0x0093:
            r10 = move-exception
            if (r6 == 0) goto L_0x00a5
            com.tencent.mm.plugin.appbrand.page.i0 r8 = r7.f244572U
            com.tencent.mm.plugin.appbrand.page.m0 r8 = r8.getContainer()
            com.tencent.mm.plugin.appbrand.page.i0 r9 = r7.f244572U
            java.lang.String r0 = "scene_swipe_back"
            r8.mo116379y(r9, r0)
            goto L_0x00b6
        L_0x00a5:
            com.tencent.mm.plugin.appbrand.page.i0 r0 = r7.f244572U
            java.lang.String r1 = r7.mo116162Q0()
            r0.mo116228N(r1, r7)
            com.tencent.mm.plugin.appbrand.page.i0 r0 = r7.f244572U
            r4 = 0
            r5 = 0
            r1 = r8
            r0.mo116299o(r1, r3, r4, r5)
        L_0x00b6:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.page.C83780d1.mo116202w0(long, int):int");
    }

    /* renamed from: w1 */
    public void mo116203w1(C79774c cVar) {
        this.f244577X = cVar;
        if (cVar != null) {
            if (mo116158M0() != null) {
                mo116158M0().mo116487O(cVar);
            }
            C39836d dVar = this.f244566R;
            if (dVar != null) {
                dVar.mo62476d();
                this.f244566R = null;
                mo116151F0();
            }
        }
    }

    /* renamed from: x */
    public boolean mo109677x() {
        return C90595a.m113498b(new C79778e.C79780b[]{C79778e.C79780b.LANDSCAPE_SENSOR, C79778e.C79780b.LANDSCAPE_LOCKED, C79778e.C79780b.LANDSCAPE_LEFT, C79778e.C79780b.LANDSCAPE_RIGHT}, this.f244577X.getOrientationHandler().mo109917a());
    }

    /* renamed from: x0 */
    public void mo116204x0(int i, boolean z) {
        for (C83699y next : mo116154I0()) {
            if (next != null && next.f244317a == i) {
                next.f244319c = z;
                return;
            }
        }
    }

    /* renamed from: x1 */
    public final boolean mo116205x1() {
        C90083b bVar = (C90083b) mo116158M0().mo116072t(C90083b.class);
        return bVar != null && bVar.mo122849M();
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0033  */
    /* renamed from: y0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo116206y0(com.tencent.p014mm.plugin.appbrand.page.C83817h4 r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f244565Q0
            monitor-enter(r0)
            com.tencent.mm.plugin.appbrand.page.h4 r1 = com.tencent.p014mm.plugin.appbrand.page.C83817h4.SWITCH_TAB     // Catch:{ all -> 0x0055 }
            r2 = 0
            r3 = 1
            if (r1 == r7) goto L_0x001e
            com.tencent.mm.plugin.appbrand.page.h4 r1 = com.tencent.p014mm.plugin.appbrand.page.C83817h4.APP_LAUNCH     // Catch:{ all -> 0x0055 }
            if (r1 == r7) goto L_0x0015
            com.tencent.mm.plugin.appbrand.page.h4 r1 = com.tencent.p014mm.plugin.appbrand.page.C83817h4.RE_LAUNCH     // Catch:{ all -> 0x0055 }
            if (r1 == r7) goto L_0x0015
            com.tencent.mm.plugin.appbrand.page.h4 r1 = com.tencent.p014mm.plugin.appbrand.page.C83817h4.AUTO_RE_LAUNCH     // Catch:{ all -> 0x0055 }
            if (r1 != r7) goto L_0x001c
        L_0x0015:
            com.tencent.mm.plugin.appbrand.page.i0 r1 = r6.f244572U     // Catch:{ all -> 0x0055 }
            boolean r1 = r1 instanceof com.tencent.p014mm.plugin.appbrand.page.C83966x     // Catch:{ all -> 0x0055 }
            if (r1 == 0) goto L_0x001c
            goto L_0x001e
        L_0x001c:
            r1 = 0
            goto L_0x001f
        L_0x001e:
            r1 = 1
        L_0x001f:
            com.tencent.mm.plugin.appbrand.page.n4 r4 = r6.f244571T0     // Catch:{ all -> 0x0055 }
            if (r4 != 0) goto L_0x0033
            if (r1 == 0) goto L_0x002b
            com.tencent.mm.plugin.appbrand.page.d4 r7 = new com.tencent.mm.plugin.appbrand.page.d4     // Catch:{ all -> 0x0055 }
            r7.<init>(r6)     // Catch:{ all -> 0x0055 }
            goto L_0x0030
        L_0x002b:
            com.tencent.mm.plugin.appbrand.page.s4 r7 = new com.tencent.mm.plugin.appbrand.page.s4     // Catch:{ all -> 0x0055 }
            r7.<init>(r6)     // Catch:{ all -> 0x0055 }
        L_0x0030:
            r6.f244571T0 = r7     // Catch:{ all -> 0x0055 }
            goto L_0x0053
        L_0x0033:
            com.tencent.mm.plugin.appbrand.page.h4 r5 = com.tencent.p014mm.plugin.appbrand.page.C83817h4.REWRITE_ROUTE     // Catch:{ all -> 0x0055 }
            if (r5 == r7) goto L_0x004f
            if (r1 == 0) goto L_0x003d
            boolean r7 = r4 instanceof com.tencent.p014mm.plugin.appbrand.page.C83783d4     // Catch:{ all -> 0x0055 }
            if (r7 != 0) goto L_0x004f
        L_0x003d:
            if (r1 != 0) goto L_0x0043
            boolean r7 = r4 instanceof com.tencent.p014mm.plugin.appbrand.page.C83925s4     // Catch:{ all -> 0x0055 }
            if (r7 != 0) goto L_0x004f
        L_0x0043:
            if (r1 != 0) goto L_0x0050
            boolean r7 = r4 instanceof com.tencent.p014mm.plugin.appbrand.page.C83783d4     // Catch:{ all -> 0x0055 }
            if (r7 == 0) goto L_0x0050
            int r7 = r4.size()     // Catch:{ all -> 0x0055 }
            if (r7 < r3) goto L_0x0050
        L_0x004f:
            r2 = 1
        L_0x0050:
            junit.framework.Assert.assertTrue(r2)     // Catch:{ all -> 0x0055 }
        L_0x0053:
            monitor-exit(r0)     // Catch:{ all -> 0x0055 }
            return
        L_0x0055:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0055 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.page.C83780d1.mo116206y0(com.tencent.mm.plugin.appbrand.page.h4):void");
    }

    /* renamed from: y1 */
    public final boolean mo116207y1(String str) {
        C90083b bVar = (C90083b) mo116158M0().mo116072t(C90083b.class);
        return bVar != null && bVar.mo122851m(str);
    }

    /* renamed from: z0 */
    public void mo116208z0(boolean z) {
        this.f244575V0 = z;
        ViewGroup.LayoutParams layoutParams = this.f244553E.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = this.f244555G.getLayoutParams();
        if ((layoutParams instanceof RelativeLayout.LayoutParams) && (layoutParams2 instanceof RelativeLayout.LayoutParams)) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(10);
            if (z) {
                ((RelativeLayout.LayoutParams) layoutParams2).removeRule(3);
            } else {
                ((RelativeLayout.LayoutParams) layoutParams2).addRule(3, C0966R.C0970id.f5865qt);
            }
            this.f244552D.requestLayout();
            this.f244554F.setFullscreenMode(this.f244575V0);
        } else if (this.f241593r) {
            throw new IllegalStateException("ActionBarContainer and Renderer's PageArea should be in RelativeLayout");
        }
    }

    public C83780d1() {
        this((Class<? extends C83905r1>) null);
    }
}
