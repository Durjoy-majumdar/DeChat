package com.tencent.p014mm.plugin.appbrand;

import ai0.C79557i;
import ai0.C79581v;
import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Printer;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C103766u;
import androidx.lifecycle.C39623j;
import b34.C79664a;
import br0.C79774c;
import bt0.C79811f;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.C80936x;
import com.tencent.p014mm.ipcinvoker.C80937y;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.appcache.C81247g3;
import com.tencent.p014mm.plugin.appbrand.appcache.WxaPkg;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81415h0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81428p0;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.p014mm.plugin.appbrand.config.C81634a;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1727m;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82835n;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.C82074a0;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.C82075b;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.C82076b0;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.C82078d;
import com.tencent.p014mm.plugin.appbrand.jsapi.websocket.C83101e;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84560k4;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84563l4;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84570o4;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84701w0;
import com.tencent.p014mm.plugin.appbrand.page.C83762b1;
import com.tencent.p014mm.plugin.appbrand.page.C83810g4;
import com.tencent.p014mm.plugin.appbrand.page.C83820i0;
import com.tencent.p014mm.plugin.appbrand.page.C83849m0;
import com.tencent.p014mm.plugin.appbrand.page.C83854n;
import com.tencent.p014mm.plugin.appbrand.page.C83958w0;
import com.tencent.p014mm.plugin.appbrand.pip.C84026b;
import com.tencent.p014mm.plugin.appbrand.pip.C84028c;
import com.tencent.p014mm.plugin.appbrand.pip.C84059t;
import com.tencent.p014mm.plugin.appbrand.utils.C2032a1;
import com.tencent.p014mm.plugin.appbrand.utils.C29678o1;
import com.tencent.p014mm.plugin.appbrand.utils.C84726c2;
import com.tencent.p014mm.plugin.appbrand.utils.C84734e0;
import com.tencent.p014mm.plugin.appbrand.utils.C84777q1;
import com.tencent.p014mm.plugin.appbrand.utils.C84800z1;
import com.tencent.p014mm.plugin.appbrand.widget.AppBrandGlobalNativeWidgetContainerView;
import com.tencent.p014mm.plugin.appbrand.widget.AppBrandPipContainerView;
import com.tencent.p014mm.plugin.appbrand.widget.C84922c;
import com.tencent.p014mm.plugin.appbrand.widget.C84927e;
import com.tencent.p014mm.plugin.appbrand.widget.C85008l;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.ScreenShotUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.system.AndroidContextUtil;
import cr0.C86127t;
import gt0.C76063l;
import gt0.C87362k;
import hp0.C87574a;
import hp0.C87575b;
import java.util.Collection;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import jp3.C9486a;
import junit.framework.Assert;
import k40.C88080e;
import k40.C9562a;
import li0.C88508b;
import li0.C88509c;
import li0.C88514d;
import mp3.C88824h;
import op0.C89251a;
import p170ic.C87690d;
import p224ra.C89909e;
import p225rc.C89913b;
import p225rc.C89917h;
import qq0.C89796d;
import qq0.C89797e;
import qq0.C89814s;
import rm0.C90035h;
import sp0.C90283e;
import sp0.C90299j;
import sp0.C90306l;
import sp0.C90318o;
import wi0.C90988l;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntime */
public class AppBrandRuntime implements C2032a1<C9486a> {

    /* renamed from: A */
    public AtomicBoolean f238103A;

    /* renamed from: B */
    public final ConcurrentLinkedDeque<C1727m> f238104B;

    /* renamed from: C */
    public final C84806v3 f238105C;

    /* renamed from: D */
    public final ConcurrentSkipListSet<C29608o3> f238106D;

    /* renamed from: E */
    public final C84888w3 f238107E;

    /* renamed from: F */
    public final ConcurrentSkipListSet<C83705n3> f238108F;

    /* renamed from: G */
    public final ConcurrentSkipListSet<Runnable> f238109G;

    /* renamed from: H */
    public final LinkedHashSet<C82835n> f238110H;

    /* renamed from: I */
    public final C84250s2 f238111I;

    /* renamed from: J */
    public C84734e0 f238112J;

    /* renamed from: K */
    public volatile C88509c f238113K;

    /* renamed from: L */
    public volatile C0125s f238114L;

    /* renamed from: M */
    public C89251a f238115M;

    /* renamed from: N */
    public volatile boolean f238116N;

    /* renamed from: P */
    public volatile boolean f238117P;

    /* renamed from: Q */
    public volatile boolean f238118Q;

    /* renamed from: Q0 */
    public C84059t f238119Q0;

    /* renamed from: R */
    public volatile boolean f238120R;

    /* renamed from: R0 */
    public AppBrandPipContainerView f238121R0;

    /* renamed from: S */
    public boolean f238122S;

    /* renamed from: S0 */
    public AppBrandGlobalNativeWidgetContainerView f238123S0;

    /* renamed from: T */
    public final AtomicBoolean f238124T;

    /* renamed from: T0 */
    public C83854n f238125T0;

    /* renamed from: U */
    public final C89913b f238126U;

    /* renamed from: U0 */
    public boolean f238127U0;

    /* renamed from: V */
    public boolean f238128V;

    /* renamed from: V0 */
    public LinkedList<AppBrandRuntime$$z> f238129V0;

    /* renamed from: W */
    public boolean f238130W;

    /* renamed from: W0 */
    public ConcurrentLinkedQueue<AppBrandRuntime$$z> f238131W0;

    /* renamed from: X */
    public C83607m3 f238132X;

    /* renamed from: X0 */
    public final C80936x f238133X0;

    /* renamed from: Y */
    public boolean f238134Y;

    /* renamed from: Y0 */
    public final C80937y f238135Y0;

    /* renamed from: Z */
    public boolean f238136Z;

    /* renamed from: Z0 */
    public final MTimerHandler f238137Z0;

    /* renamed from: a1 */
    public final Deque<Runnable> f238138a1;

    /* renamed from: b1 */
    public SparseArray<Set<C81974j3>> f238139b1;

    /* renamed from: c1 */
    public C84726c2 f238140c1;

    /* renamed from: d */
    public final Context f238141d;

    /* renamed from: e */
    public C81820e3 f238142e;

    /* renamed from: f */
    public C79774c f238143f;

    /* renamed from: g */
    public final MMHandler f238144g;

    /* renamed from: h */
    public final Printer f238145h;

    /* renamed from: i */
    public final C81975j4 f238146i;

    /* renamed from: j */
    public volatile String f238147j;

    /* renamed from: n */
    public AppBrandRuntime f238148n;

    /* renamed from: o */
    public volatile AppBrandInitConfig f238149o;

    /* renamed from: p */
    public volatile C81925i2 f238150p;

    /* renamed from: p0 */
    public boolean f238151p0;

    /* renamed from: q */
    public volatile C83849m0 f238152q;

    /* renamed from: r */
    public C84927e f238153r;

    /* renamed from: s */
    public C84560k4 f238154s;

    /* renamed from: t */
    public boolean f238155t;

    /* renamed from: u */
    public C87362k f238156u;

    /* renamed from: v */
    public C87362k f238157v;

    /* renamed from: w */
    public C79557i f238158w;

    /* renamed from: x */
    public C89797e f238159x;

    /* renamed from: x0 */
    public long f238160x0;

    /* renamed from: y */
    public volatile Boolean f238161y;

    /* renamed from: y0 */
    public long f238162y0;

    /* renamed from: z */
    public volatile C81415h0 f238163z;

    private AppBrandRuntime(Context context) {
        this.f238145h = new AppBrandRuntime$$a();
        this.f238161y = null;
        this.f238163z = null;
        this.f238103A = new AtomicBoolean(false);
        this.f238104B = new AppBrandRuntime$$h(this);
        this.f238105C = new C84806v3();
        this.f238106D = new ConcurrentSkipListSet<>(new AppBrandRuntime$$q(this));
        this.f238107E = new C84888w3();
        this.f238108F = new ConcurrentSkipListSet<>(new AppBrandRuntime$$r(this));
        this.f238109G = new ConcurrentSkipListSet<>(new AppBrandRuntime$$s(this));
        this.f238110H = new LinkedHashSet<>();
        this.f238111I = new C84250s2();
        this.f238122S = false;
        this.f238124T = new AtomicBoolean(false);
        this.f238134Y = false;
        this.f238136Z = true;
        this.f238160x0 = 0;
        this.f238162y0 = 0;
        this.f238127U0 = false;
        this.f238129V0 = new LinkedList<>();
        this.f238131W0 = null;
        this.f238133X0 = new AppBrandRuntime$$k(this);
        this.f238135Y0 = new AppBrandRuntime$$l(this);
        this.f238137Z0 = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new AppBrandRuntime$$m(this), false);
        this.f238138a1 = new LinkedBlockingDeque();
        this.f238139b1 = new SparseArray<>();
        this.f238140c1 = null;
        this.f238141d = context;
        MMHandler mMHandler = new MMHandler(Looper.getMainLooper());
        this.f238144g = mMHandler;
        this.f238146i = new C81975j4();
        this.f238126U = new C89913b(mMHandler, new AppBrandRuntime$$b(this));
        C84927e s = mo113078s(context);
        this.f238153r = s;
        s.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f238156u = new C87362k(context, (C76063l) null);
        this.f238157v = new C87362k(context, this.f238156u.getShareContext());
        this.f238112J = new C84734e0();
        this.f238151p0 = false;
    }

    /* renamed from: f */
    public static void m99065f(AppBrandRuntime appBrandRuntime, Configuration configuration) {
        C83820i0 currentPage;
        if (appBrandRuntime.f238152q != null && (currentPage = appBrandRuntime.f238152q.getCurrentPage()) != null) {
            C79811f fVar = currentPage.getCurrentPageView().f244553E;
            if (appBrandRuntime.f238121R0 != null && fVar != null) {
                int height = fVar.getHeight();
                Log.m105918d("MicroMsg.AppBrandRuntime", "adjustPipContainerViewPositionRange, actionBarContainerHeight: " + height);
                appBrandRuntime.f238121R0.mo117672n(height, configuration);
            }
        }
    }

    /* renamed from: g0 */
    private void m99066g0(C39623j.C39625b bVar) {
        ((C103766u) ((AppBrandRuntime$$u) this.f238114L).f238198d).mo145135c(bVar);
    }

    /* renamed from: A */
    public final void mo113000A() {
        C89913b bVar = this.f238126U;
        bVar.f258371a.removeCallbacks(bVar.f258372b);
        if (this.f238116N) {
            mo113052e("onResume", new Object[0]);
            if (mo113064k0() || this.f238128V) {
                this.f238122S = true;
                mo113015J0((AppBrandInitConfig) null, "");
                return;
            }
            this.f238122S = true;
            C83231l.m102146g(this.f238147j, C83231l.C83235e.HIDE);
            String str = this.f238147j;
            if (!TextUtils.isEmpty(str)) {
                Iterator<C83231l.C83234d> c = C83231l.m102142c(str);
                while (c.hasNext()) {
                    c.next().mo109498f();
                }
            }
            C83231l.m102145f(this.f238147j, C83231l.C83233c.ON_RESUME);
            m99066g0(C39623j.C39625b.ON_START);
            m99066g0(C39623j.C39625b.ON_RESUME);
            boolean z = this.f238130W;
            this.f238152q.mo110174E();
            this.f238113K.f255667a.mo122987s(C88514d.C88522g.TO_FOREGROUND, "onRuntimeResume");
            this.f238150p.mo114325A0(z);
            mo113007E0();
            if (z) {
                C83849m0 m0Var = this.f238152q;
                String T = mo113030T();
                m0Var.getClass();
                m0Var.mo116338c0(new C83958w0(m0Var, T, true));
            }
            C84734e0 e0Var = this.f238112J;
            e0Var.getClass();
            Log.m105924i("MicroMsg.AppBrandUserCaptureScreenMonitor", "onResume");
            try {
                ScreenShotUtil.setScreenShotCallback(MMApplicationContext.getContext(), e0Var.f247133a);
            } catch (SecurityException e) {
                Log.printErrStackTrace("MicroMsg.AppBrandUserCaptureScreenMonitor", e, "[NOT CRASH] resume set callback", new Object[0]);
            }
            mo113019M0();
            this.f238128V = false;
            this.f238130W = false;
            C81925i2 i2Var = this.f238150p;
            if (C82078d.f240691a) {
                C82078d.f240691a = false;
                C82076b0 b0Var = new C82076b0();
                b0Var.mo115161k(i2Var);
                b0Var.mo115158h();
                Log.m105924i("MicroMsg.Audio.AudioInterruptionEventDispatcher", "dispatchInterruptionEnd");
            }
        }
    }

    /* renamed from: A0 */
    public void mo113001A0() {
        this.f238150p.getJsRuntime().evaluateJavascript("if (typeof ntrans !== 'undefined') { ntrans.log('xxx ntrans ntrans_init_service start'); }\n", (ValueCallback<String>) null);
        this.f238150p.getJsRuntime().evaluateJavascript("if (typeof ntrans !== 'undefined') { ntrans.serviceId = ntrans.id; }\n", (ValueCallback<String>) null);
    }

    /* renamed from: B0 */
    public void mo113002B0(AppBrandInitConfig appBrandInitConfig, Object obj) {
    }

    /* renamed from: B7 */
    public void mo1963B7(C9486a aVar) {
        this.f238146i.mo1963B7(aVar);
    }

    /* renamed from: C0 */
    public <T extends C9562a> T mo113003C0(Class<T> cls) {
        return null;
    }

    /* renamed from: D */
    public void mo113004D(Object obj) {
    }

    /* renamed from: D0 */
    public void mo113005D0() {
        this.f238107E.mo117040c();
    }

    /* renamed from: E */
    public void mo113006E() {
        if (mo113064k0()) {
            Log.m105929w("MicroMsg.AppBrandRuntime", "finish but destroyed, appId[%s]", this.f238147j);
            return;
        }
        this.f238117P = true;
        mo113024P0(new AppBrandRuntime$$i(this));
    }

    /* renamed from: E0 */
    public void mo113007E0() {
    }

    /* renamed from: F */
    public C81634a mo113008F() {
        return (C81634a) mo113021O(C81634a.class, false);
    }

    /* renamed from: F0 */
    public void mo113009F0() {
    }

    /* renamed from: G */
    public final Context mo113010G() {
        return this.f238141d;
    }

    /* renamed from: G0 */
    public void mo113011G0() {
    }

    /* renamed from: H */
    public String mo113012H() {
        return this.f238147j;
    }

    /* renamed from: H0 */
    public final void mo113013H0(AppBrandRuntime$$z appBrandRuntime$$z) {
        this.f238129V0.add(appBrandRuntime$$z);
    }

    /* renamed from: I0 */
    public final <T extends C9562a, N extends T> void mo113014I0(Class<T> cls, N n) {
        C84250s2 s2Var = this.f238111I;
        s2Var.getClass();
        s2Var.mo122504a(cls, new C88080e(n));
    }

    /* renamed from: J0 */
    public void mo113015J0(AppBrandInitConfig appBrandInitConfig, String str) {
        if (!this.f238122S) {
            Log.m105925i("MicroMsg.AppBrandRuntime", "reload but !isResumed, destroy and update config, appId:%s, reason:%s", this.f238147j, str);
            mo113082u();
            if (appBrandInitConfig != null) {
                this.f238149o = appBrandInitConfig;
                return;
            }
            return;
        }
        Log.m105925i("MicroMsg.AppBrandRuntime", "reload --START-- appId:%s, reason:%s stacktrace=%s", this.f238147j, str, android.util.Log.getStackTraceString(new Throwable()));
        C81820e3 e3Var = this.f238142e;
        mo113086w();
        mo113082u();
        mo113033U0(e3Var);
        if (appBrandInitConfig == null) {
            appBrandInitConfig = mo113036W();
        }
        mo113060i0(appBrandInitConfig);
        mo113073p0();
        Log.m105925i("MicroMsg.AppBrandRuntime", "reload --END-- appId:%s", this.f238147j);
    }

    /* renamed from: K0 */
    public void mo113016K0(C81974j3 j3Var) {
        mo113024P0(new AppBrandRuntime$$p(this, j3Var));
    }

    /* renamed from: L0 */
    public void mo113017L0(boolean z, String str, WxaPkg wxaPkg) {
    }

    /* renamed from: M */
    public <T extends C1727m> T mo113018M(Class<T> cls) {
        return mo113021O(cls, !this.f238127U0);
    }

    /* renamed from: M0 */
    public void mo113019M0() {
        mo113022O0(new AppBrandRuntime$$n(this));
    }

    /* renamed from: N0 */
    public void mo113020N0(Runnable runnable) {
        if (this.f238117P || mo113064k0()) {
            Log.m105929w("MicroMsg.AppBrandRuntime", "runOnRuntimeInitialized runtime[%s] finishing, stack %s", this.f238147j, android.util.Log.getStackTraceString(new Throwable()));
        } else if (this.f238116N) {
            mo113024P0(runnable);
        } else {
            ((LinkedBlockingDeque) this.f238138a1).offerLast(runnable);
        }
    }

    /* renamed from: O */
    public <T extends C1727m> T mo113021O(Class<T> cls, boolean z) {
        T t;
        Iterator<C1727m> descendingIterator = this.f238104B.descendingIterator();
        while (true) {
            if (!descendingIterator.hasNext()) {
                t = null;
                break;
            }
            t = (C1727m) descendingIterator.next();
            if (cls.isInstance(t)) {
                break;
            }
        }
        if (t != null || !z) {
            return t;
        }
        try {
            T t2 = (C1727m) new C79664a(cls, cls).mo109790c().f233575b;
            if (t2 != null) {
                try {
                    ((AppBrandRuntime$$h) this.f238104B).add(t2);
                } catch (Exception unused) {
                    t = t2;
                }
            }
            return t2;
        } catch (Exception unused2) {
            Log.m105921e("MicroMsg.AppBrandRuntime", "Make sure %s has default constructor", cls.getName());
            return t;
        }
    }

    /* renamed from: O0 */
    public final void mo113022O0(Runnable runnable) {
        if (runnable != null && !mo113064k0()) {
            C29678o1 a = C29678o1.m38854a(this.f238146i, runnable);
            keep(a);
            ((C119157j) C119157j.f356862d).mo183878i(a, 0);
        }
    }

    /* renamed from: P */
    public final Collection<C1727m> mo113023P() {
        return this.f238104B;
    }

    /* renamed from: P0 */
    public final void mo113024P0(Runnable runnable) {
        mo113025Q0(runnable, 0);
    }

    /* renamed from: Q0 */
    public final void mo113025Q0(Runnable runnable, long j) {
        if (runnable != null) {
            if (mo113064k0()) {
                Log.m105929w("MicroMsg.AppBrandRuntime", "scheduleToUiThreadDelayed() but finished, stackTrace = %s", android.util.Log.getStackTraceString(new Throwable()));
                return;
            }
            if (j < 0) {
                j = 0;
            }
            if (!MMHandlerThread.isMainThread() || 0 != j) {
                this.f238144g.postDelayed(runnable, j);
            } else {
                runnable.run();
            }
        }
    }

    /* renamed from: R */
    public final Activity mo113026R() {
        return AndroidContextUtil.castActivityOrNull(this.f238141d);
    }

    /* renamed from: R0 */
    public final <T extends C9562a> T mo113027R0(Class<T> cls) {
        T b = this.f238111I.mo122505b(cls);
        return b != null ? (C9562a) cls.cast(b) : cls == C85008l.class ? (C9562a) cls.cast(C85008l.f247734n0) : mo113003C0(cls);
    }

    /* renamed from: S */
    public C83810g4 mo113028S() {
        return null;
    }

    /* renamed from: S0 */
    public final void mo113029S0(boolean z) {
        this.f238134Y = z;
        C83820i0 currentPage = mo113042Z() == null ? null : mo113042Z().getCurrentPage();
        if (currentPage != null) {
            currentPage.mo116285I();
        }
    }

    /* renamed from: T */
    public String mo113030T() {
        return this.f238149o == null ? "" : Util.isNullOrNil(this.f238149o.f239367i) ? mo113008F() == null ? "" : mo113008F().mo113983b() : this.f238149o.f239367i;
    }

    /* renamed from: T0 */
    public final void mo113031T0(boolean z) {
        this.f238127U0 = z;
    }

    /* renamed from: U */
    public <T extends C82835n> T mo113032U(Class<T> cls) {
        if (cls == null) {
            return null;
        }
        synchronized (this.f238110H) {
            Iterator<C82835n> it = this.f238110H.iterator();
            while (it.hasNext()) {
                T t = (C82835n) it.next();
                if (cls.isInstance(t)) {
                    return t;
                }
            }
            return null;
        }
    }

    /* renamed from: U0 */
    public void mo113033U0(C81820e3 e3Var) {
        this.f238142e = e3Var;
        if (e3Var != null) {
            this.f238105C.mo114252a(e3Var);
        } else {
            this.f238105C.mo114253b();
        }
    }

    /* renamed from: V */
    public C81415h0 mo113034V() {
        return this.f238163z;
    }

    /* renamed from: V0 */
    public final void mo113035V0() {
        this.f238128V = true;
        Log.m105918d("MicroMsg.AppBrandRuntime", "setWillRestart");
    }

    /* renamed from: W */
    public AppBrandInitConfig mo113036W() {
        return this.f238149o;
    }

    /* renamed from: W0 */
    public boolean mo113037W0() {
        return true;
    }

    /* renamed from: X */
    public boolean mo113038X() {
        if (this.f238161y == null) {
            this.f238161y = Boolean.valueOf(((C79581v) C89909e.m112436a(C79581v.class)).t20(this));
        }
        return this.f238161y.booleanValue();
    }

    /* renamed from: X0 */
    public boolean mo113039X0() {
        return true;
    }

    /* renamed from: Y */
    public C89251a mo113040Y() {
        return this.f238115M;
    }

    /* renamed from: Y0 */
    public boolean mo113041Y0(Runnable runnable) {
        return false;
    }

    /* renamed from: Z */
    public C83849m0 mo113042Z() {
        return this.f238152q;
    }

    /* renamed from: Z0 */
    public void mo113043Z0() {
        C84560k4 k4Var = this.f238154s;
        if (k4Var != null) {
            C84701w0.m104351b(k4Var);
            this.f238154s = null;
        }
        C84560k4 p = mo113072p();
        if (p != null) {
            p.mo1912q(mo113036W().f239364f, mo113036W().f239363e);
            View view = p.getView();
            view.sendAccessibilityEvent(32768);
            for (int i = 0; i < this.f238153r.getChildCount(); i++) {
                View childAt = this.f238153r.getChildAt(i);
                if (p.getView() != childAt) {
                    childAt.setImportantForAccessibility(4);
                }
            }
            C81932i4.LoadingSplash.mo114355a(this, view);
            this.f238155t = true;
            C84927e eVar = this.f238153r;
            eVar.f247549g = true;
            eVar.f247550h = view;
            this.f238154s = p;
            Object[] objArr = new Object[2];
            objArr[0] = this.f238147j;
            C84560k4 k4Var2 = this.f238154s;
            objArr[1] = k4Var2 == null ? "null" : k4Var2.getClass().getSimpleName();
            Log.m105925i("MicroMsg.AppBrandRuntime", "showSplash[AppBrandSplashAd], appId:%s, splash:%s", objArr);
            this.f238153r.setOnHierarchyChangeListener(new AppBrandRuntime$$e(this, view.hashCode()));
        }
    }

    /* renamed from: a */
    public final boolean mo113044a() {
        return this.f238127U0;
    }

    /* renamed from: a0 */
    public final C84888w3 mo113045a0() {
        return this.f238107E;
    }

    /* renamed from: a1 */
    public void mo113046a1(AppBrandInitConfig appBrandInitConfig) {
        this.f238149o = appBrandInitConfig;
    }

    /* renamed from: b0 */
    public C81925i2 mo113047b0() {
        return this.f238150p;
    }

    /* renamed from: b1 */
    public final boolean mo113048b1() {
        return this.f238130W;
    }

    /* renamed from: c0 */
    public C84560k4 mo113049c0() {
        return this.f238154s;
    }

    /* renamed from: c1 */
    public final boolean mo113050c1() {
        return this.f238128V;
    }

    /* renamed from: d0 */
    public C90988l mo113051d0() {
        return (C90988l) mo113018M(C90988l.class);
    }

    /* renamed from: e */
    public final void mo113052e(String str, Object... objArr) {
        AppBrandInitConfig appBrandInitConfig = this.f238149o;
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.ENGLISH, str, objArr);
        }
        Object[] objArr2 = new Object[5];
        objArr2[0] = Integer.valueOf(hashCode());
        String str2 = "";
        objArr2[1] = appBrandInitConfig == null ? str2 : appBrandInitConfig.f239363e;
        if (appBrandInitConfig != null) {
            str2 = appBrandInitConfig.f239362d;
        }
        objArr2[2] = str2;
        objArr2[3] = Integer.valueOf(appBrandInitConfig == null ? -1 : appBrandInitConfig.f239365g);
        objArr2[4] = str;
        Log.m105925i("MicroMsg.AppBrandRuntime", "AppBrandRuntimeProfile|%d|%s|%s|%d| %s", objArr2);
    }

    /* renamed from: e0 */
    public int mo113053e0() {
        return this.f238149o.f239365g;
    }

    /* renamed from: f0 */
    public C79774c mo113054f0() {
        C81820e3 e3Var = this.f238142e;
        if (e3Var != null) {
            return e3Var.getWindowAndroid();
        }
        Object[] objArr = new Object[2];
        objArr[0] = this.f238147j;
        C79774c cVar = this.f238143f;
        objArr[1] = cVar == null ? null : cVar.getClass().getName();
        Log.m105921e("MicroMsg.AppBrandRuntime", "getWindowAndroid getRuntimeContainer is NULL appId[%s], return default %s", objArr);
        C79774c cVar2 = this.f238143f;
        if (cVar2 != null) {
            return cVar2;
        }
        C86127t tVar = new C86127t();
        this.f238143f = tVar;
        return tVar;
    }

    public void finalize() {
        super.finalize();
        this.f238144g.removeCallbacksAndMessages((Object) null);
    }

    /* renamed from: g */
    public final void mo113056g(View view, FrameLayout.LayoutParams layoutParams) {
        View view2;
        if (view != null) {
            C84927e eVar = this.f238153r;
            int i = 0;
            while (true) {
                if (i >= eVar.getChildCount()) {
                    view2 = null;
                    break;
                }
                view2 = eVar.getChildAt(i);
                Integer num = (Integer) view2.getTag(C0966R.C0970id.f6009ur);
                Objects.requireNonNull(num);
                if (num.intValue() == 2) {
                    break;
                }
                i++;
            }
            FrameLayout frameLayout = (FrameLayout) view2;
            if (frameLayout == null) {
                frameLayout = new FrameLayout(this.f238141d);
                C81932i4.InspectorView.mo114355a(this, frameLayout);
            }
            frameLayout.addView(view, layoutParams);
        }
    }

    /* renamed from: h */
    public void mo113057h(int i, int i2, C81974j3 j3Var) {
        Log.m105924i("MicroMsg.AppBrandRuntime", "addKeyEventObserver");
        mo113024P0(new AppBrandRuntime$$o(this, j3Var, i2, i));
    }

    /* renamed from: h0 */
    public void mo113058h0() {
        String str = null;
        if (mo113064k0()) {
            C84560k4 k4Var = this.f238154s;
            if (k4Var != null) {
                C84701w0.m104351b(k4Var);
            }
            this.f238154s = null;
        } else if (this.f238154s != null) {
            C84701w0 w0Var = C84701w0.f247084a;
            w0Var.getClass();
            if (!((Boolean) C84701w0.f247086c.mo124238b(w0Var, C84701w0.f247085b[0])).booleanValue()) {
                Object[] objArr = new Object[3];
                objArr[0] = this.f238147j;
                C84560k4 k4Var2 = this.f238154s;
                if (k4Var2 != null) {
                    str = k4Var2.getClass().getName();
                }
                objArr[1] = str;
                objArr[2] = android.util.Log.getStackTraceString(new Throwable());
                Log.m105925i("MicroMsg.AppBrandRuntime", "hideSplash[AppBrandSplashAd], appId:%s, splash:%s, stack:%s", objArr);
                AppBrandRuntime$$f appBrandRuntime$$f = new AppBrandRuntime$$f(this);
                if (this.f238154s instanceof C84570o4) {
                    Log.m105925i("MicroMsg.AppBrandRuntime", "[weishi] hideSplash, hideLoadingSplashFromRuntime, appId:%s", this.f238147j);
                    ((C84570o4) this.f238154s).mo117197e(appBrandRuntime$$f);
                    return;
                }
                Log.m105925i("MicroMsg.AppBrandRuntime", "hideSplash, animateHide, appId:%s", this.f238147j);
                this.f238154s.mo1911D(appBrandRuntime$$f);
            }
        }
    }

    /* renamed from: i */
    public boolean mo113059i(C82835n nVar) {
        if (nVar == null) {
            return false;
        }
        synchronized (this.f238110H) {
            this.f238110H.add(nVar);
        }
        return true;
    }

    /* renamed from: i0 */
    public final void mo113060i0(AppBrandInitConfig appBrandInitConfig) {
        if (appBrandInitConfig == null) {
            Log.m105924i("MicroMsg.AppBrandRuntime", "null current config, ignored");
            return;
        }
        mo113052e("init start", new Object[0]);
        Log.m105925i("MicroMsg.AppBrandRuntime", "AppBrandRuntimeProfile| init start config:%s", appBrandInitConfig);
        this.f238149o = appBrandInitConfig;
        this.f238147j = appBrandInitConfig.f239362d;
        this.f238113K = new C88509c(this);
        this.f238113K.f255667a.start();
        this.f238113K.mo122978a(new AppBrandRuntime$$t(this));
        this.f238114L = new AppBrandRuntime$$u(this);
        ((LinkedBlockingDeque) this.f238138a1).clear();
        this.f238116N = false;
        this.f238118Q = false;
        this.f238124T.set(false);
        this.f238117P = false;
        this.f238128V = false;
        this.f238130W = false;
        mo113052e("init end", new Object[0]);
    }

    /* renamed from: j */
    public final boolean mo113061j() {
        if (!this.f238136Z) {
            return false;
        }
        Activity R = mo113026R();
        return (R == null || !R.isFinishing()) && this.f238152q != null && this.f238152q.getCurrentPage() != null && !this.f238152q.getCurrentPage().f244683H;
    }

    /* renamed from: j0 */
    public final void mo113062j0(boolean z) {
        if (this.f238163z == null || z) {
            this.f238163z = mo113070o();
        }
    }

    /* renamed from: k */
    public void mo113063k() {
        mo113066m((Object) null, (Runnable) null);
    }

    /* renamed from: k0 */
    public final boolean mo113064k0() {
        return this.f238124T.get();
    }

    public void keep(C9486a aVar) {
        this.f238146i.keep(aVar);
    }

    /* renamed from: l0 */
    public final boolean mo113065l0() {
        return this.f238117P;
    }

    /* renamed from: m */
    public final void mo113066m(Object obj, Runnable runnable) {
        mo113024P0(new AppBrandRuntime$$j(this, runnable, obj));
    }

    /* renamed from: m0 */
    public boolean mo113067m0() {
        return false;
    }

    /* renamed from: n */
    public C89797e mo113068n() {
        return new C89797e(this);
    }

    /* renamed from: n0 */
    public boolean mo113069n0() {
        C81820e3 e3Var = this.f238142e;
        return e3Var != null && e3Var.mo113124e(this);
    }

    /* renamed from: o */
    public C81415h0 mo113070o() {
        return new C81428p0((LinkedList<C81415h0>) new LinkedList());
    }

    /* renamed from: o0 */
    public boolean mo113071o0() {
        C84560k4 k4Var = this.f238154s;
        boolean A = k4Var instanceof C84563l4 ? ((C84563l4) k4Var).mo117193A() : false;
        Object[] objArr = new Object[3];
        objArr[0] = Boolean.valueOf(A);
        objArr[1] = this.f238147j;
        C84560k4 k4Var2 = this.f238154s;
        objArr[2] = k4Var2 == null ? "null" : k4Var2.getClass().getSimpleName();
        Log.m105925i("MicroMsg.AppBrandRuntime", "isShowingSplashAd[AppBrandSplashAd]:%s, appId:%s, splash:%s", objArr);
        return A;
    }

    /* renamed from: p */
    public C84560k4 mo113072p() {
        return null;
    }

    /* renamed from: p0 */
    public final void mo113073p0() {
        String str;
        synchronized (this) {
            if (!this.f238120R) {
                this.f238120R = true;
                this.f238122S = true;
                this.f238155t = false;
                this.f238109G.clear();
                this.f238115M = null;
            } else {
                throw new RuntimeException("Already invoked launch()");
            }
        }
        long currentTicks = Util.currentTicks();
        this.f238160x0 = currentTicks;
        try {
            mo113052e("launch start", new Object[0]);
            mo113087w0();
            if (!mo113064k0()) {
                if (!this.f238117P) {
                    C87690d.m109091b("AppBrandRuntimeProfile| onCreatePrivate" + this.f238147j, new AppBrandRuntime$$v(this));
                    C87690d.m109091b("AppBrandRuntimeProfile| prepare(AllDoneInitNotify)" + this.f238147j, new AppBrandRuntime$$w(this));
                    C87690d.m109091b("AppBrandRuntimeProfile| showSplash " + this.f238147j, new AppBrandRuntime$$x(this));
                    this.f238137Z0.startTimer(10000);
                    mo113052e("launch end, cost:%dms", Long.valueOf(Util.currentTicks() - currentTicks));
                    return;
                }
            }
            Log.m105921e("MicroMsg.AppBrandRuntime", "AppBrandRuntimeProfile| finish() called during onLaunch, appId:%s", this.f238147j);
        } finally {
            str = "launch end, cost:%dms";
            mo113052e(str, Long.valueOf(Util.currentTicks() - currentTicks));
        }
    }

    /* renamed from: q */
    public C89251a mo113074q() {
        return new C89251a.C89254c();
    }

    /* renamed from: q0 */
    public void mo113075q0() {
        Object[] objArr = new Object[3];
        boolean z = false;
        objArr[0] = this.f238147j;
        objArr[1] = Boolean.valueOf(this.f238118Q);
        if (this.f238154s != null) {
            z = true;
        }
        objArr[2] = Boolean.valueOf(z);
        Log.m105925i("MicroMsg.AppBrandRuntime", "AppBrandRuntimeProfile|onBackPressed, appId:%s, mInitReady:%b, mSplash?:%b", objArr);
        if (this.f238154s != null && !this.f238118Q) {
            C83231l.m102146g(this.f238147j, C83231l.C83235e.BACK);
            mo113006E();
        } else if (!this.f238157v.mo121782e() && !this.f238156u.mo121782e() && this.f238152q != null) {
            this.f238152q.mo116023B();
        }
    }

    /* renamed from: r */
    public C83849m0 mo113076r() {
        return new C83849m0(this.f238141d, this);
    }

    /* renamed from: r0 */
    public void mo113077r0(Configuration configuration) {
        Looper.myQueue().addIdleHandler(new AppBrandRuntime$$g(this, configuration));
        C84059t tVar = this.f238119Q0;
        if (tVar != null) {
            String str = tVar.f245415a;
            Log.m105924i(str, "onConfigurationChanged: newConfig: " + configuration);
            C84028c cVar = tVar.f245424j;
            if (cVar != null) {
                Log.m105924i(cVar.f245331a, "onConfigurationChanged");
                if (!cVar.f245338h) {
                    Log.m105918d(cVar.f245331a, "onConfigurationChanged, false == mHandleStarted");
                } else {
                    cVar.f245335e.mo110202n(cVar.f245332b, new C84026b(cVar));
                }
            }
        }
        C90035h a = C90035h.m112630a(this.f238147j, true);
        Objects.requireNonNull(a);
        int i = configuration.orientation;
        if (i == 2) {
            C84800z1.C84801a aVar = a.f258639e;
            C84800z1.C84801a aVar2 = C84800z1.C84801a.REVERSE_LANDSCAPE;
            if (aVar == aVar2) {
                a.f258640f = aVar2;
            } else {
                a.f258640f = C84800z1.C84801a.LANDSCAPE;
            }
        } else if (i == 1) {
            a.f258640f = C84800z1.C84801a.PORTRAIT;
        } else {
            a.f258640f = C84800z1.C84801a.NONE;
        }
        Log.m105925i("MicroMsg.OrientationConfigListenerHelper", "onConfigurationChanged mAppId:%s, mEnable:%b, mOrientation:%s, mConfiguration:%s", a.f258636b, Boolean.valueOf(a.f258635a), a.f258639e, a.f258640f);
        if (a.f258635a) {
            a.mo124343c(a.f258640f);
        }
    }

    /* renamed from: s */
    public C84927e mo113078s(Context context) {
        return C84777q1.m104442b(context) ? new C84922c(context) : new C84927e(context);
    }

    /* renamed from: s0 */
    public void mo113079s0() {
    }

    /* renamed from: t */
    public C81925i2 mo113080t() {
        return new C81925i2();
    }

    /* renamed from: t0 */
    public void mo113081t0() {
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final void mo113082u() {
        C81247g3 g3Var;
        C83101e remove;
        boolean andSet = this.f238124T.getAndSet(true);
        mo113052e("dispatchDestroy, destroyed?[%b] initialized?[%b] initReady?[%b]", Boolean.valueOf(andSet), Boolean.valueOf(this.f238116N), Boolean.valueOf(this.f238118Q));
        if (!andSet) {
            synchronized (this) {
                this.f238120R = false;
            }
            if (this.f238122S) {
                mo113088x(true);
            }
            ConcurrentLinkedQueue<AppBrandRuntime$$z> concurrentLinkedQueue = this.f238131W0;
            this.f238131W0 = null;
            if (concurrentLinkedQueue == null || concurrentLinkedQueue.isEmpty()) {
                Log.m105925i("MicroMsg.AppBrandRuntime", "cancelAllPrepareProcesses empty list appId[%s]", this.f238147j);
            } else {
                Log.m105925i("MicroMsg.AppBrandRuntime", "cancelAllPrepareProcesses size[%d] appId[%s]", Integer.valueOf(concurrentLinkedQueue.size()), this.f238147j);
                while (!concurrentLinkedQueue.isEmpty()) {
                    concurrentLinkedQueue.poll().mo113113a();
                }
            }
            mo113081t0();
            C81975j4 j4Var = this.f238146i;
            Iterator it = ((CopyOnWriteArraySet) j4Var.f240379d).iterator();
            while (it.hasNext()) {
                ((C9486a) it.next()).dead();
            }
            ((CopyOnWriteArraySet) j4Var.f240379d).clear();
            this.f238144g.removeCallbacksAndMessages((Object) null);
            C88509c cVar = this.f238113K;
            C88514d dVar = cVar.f255667a;
            if (!dVar.f255686t.get()) {
                Log.printErrStackTrace(dVar.f255684r, new Throwable(), "Illegal internal state, stop() called before start()", new Object[0]);
            } else {
                dVar.f255687u.set(true);
                Handler handler = dVar.getHandler();
                if (handler == null ? false : handler.hasMessages(-2)) {
                    Log.m105920e(dVar.f255684r, "stop() called, but still isInConstruction");
                    dVar.quit();
                } else {
                    dVar.quitNow();
                }
                dVar.mo122985y(C88508b.DESTROYED);
            }
            synchronized (cVar.f255669c) {
                cVar.f255669c.clear();
            }
            String str = this.f238147j;
            Iterator<C83231l.C83234d> it4 = C83231l.f243081a;
            if (!TextUtils.isEmpty(str)) {
                Iterator<C83231l.C83234d> c = C83231l.m102142c(str);
                while (c.hasNext()) {
                    c.next().mo109497c();
                }
            }
            C83231l.m102145f(this.f238147j, C83231l.C83233c.ON_DESTROY);
            m99066g0(C39623j.C39625b.ON_DESTROY);
            try {
                if (this.f238163z != null) {
                    this.f238163z.release();
                }
                this.f238163z = null;
                String str2 = this.f238147j;
                Map<String, C87575b> map = C87574a.f253658a;
                Log.m105924i("MicroMsg.Audio.AppBrandAudioClientService", "onDestroy");
                MMHandler mMHandler = C82075b.f240684a;
                Log.m105925i("MicroMsg.Audio.AudioApiTaskExecutor", "onDestroy:%s", str2);
                if (C82075b.f240687d.decrementAndGet() == 0) {
                    synchronized (C82075b.f240686c) {
                        if (C82075b.f240685b != null) {
                            if (C82075b.f240685b != null) {
                                ((ConcurrentHashMap) C88824h.f256226a).remove("app_brand_audio_player".toUpperCase(Locale.ENGLISH));
                                C82075b.f240685b.quit();
                                C82075b.f240685b = null;
                                C82075b.f240684a = null;
                            }
                        }
                    }
                }
                ((ConcurrentHashMap) C87574a.f253658a).clear();
                Iterator<String> it5 = C87574a.f253660c.iterator();
                while (it5.hasNext()) {
                    IListener iListener = (IListener) ((HashMap) C87574a.f253659b).remove(it5.next());
                    if (iListener != null) {
                        iListener.dead();
                    }
                }
                ((HashMap) C87574a.f253659b).clear();
                C87574a.f253660c.clear();
                ((ConcurrentHashMap) C87574a.f253661d).remove(str2);
                String mainProcessName = MMApplicationContext.getMainProcessName();
                C80907o.m98787j(mainProcessName, this.f238133X0);
                C80907o.m98788k(mainProcessName, this.f238135Y0);
                C89917h.m112458a(mo113026R());
                this.f238132X = null;
                this.f238115M = null;
                AtomicInteger atomicInteger = C90299j.f259242b;
                C90299j.C90301b.f259244a.mo124534b(this.f238147j);
                AtomicInteger atomicInteger2 = C90283e.f259174b;
                C90283e.C90285b.f259176a.mo124503b(this.f238147j);
                AtomicInteger atomicInteger3 = C90306l.f259255b;
                C90306l.C90308b.f259257a.mo124543b(this.f238147j);
                AtomicInteger atomicInteger4 = C90318o.f259278b;
                C90318o oVar = C90318o.C90320b.f259280a;
                String str3 = this.f238147j;
                if (oVar.f259279a.containsKey(str3) && (remove = oVar.f259279a.remove(str3)) != null) {
                    remove.release();
                }
                String str4 = this.f238147j;
                if (!TextUtils.isEmpty(str4)) {
                    C83231l.f243084d.mo122466g(str4);
                    C83231l.f243085e.mo122466g(str4);
                }
                this.f238153r.setOnHierarchyChangeListener((ViewGroup.OnHierarchyChangeListener) null);
                this.f238153r.removeAllViewsInLayout();
                this.f238156u.mo121783f();
                this.f238157v.mo121783f();
                C89797e eVar = this.f238159x;
                if (eVar != null) {
                    C89796d dVar2 = eVar.f258188c;
                    if (dVar2 != null) {
                        dVar2.removeAllViews();
                    }
                    C89814s sVar = eVar.f258191f;
                    if (sVar != null) {
                        Animator animator = sVar.f258218e;
                        if (animator != null) {
                            animator.cancel();
                        }
                        ImageView buttonImage = sVar.f258217d.getButtonImage();
                        if (buttonImage != null) {
                            buttonImage.clearAnimation();
                        }
                    }
                }
                this.f238161y = null;
                C79557i iVar = this.f238158w;
                if (iVar != null) {
                    iVar.removeAllViews();
                    this.f238158w = null;
                }
                if (this.f238150p != null) {
                    this.f238150p.mo114329F();
                    this.f238150p = null;
                }
                if (this.f238152q != null) {
                    this.f238152q.mo116353h();
                    this.f238152q = null;
                }
                try {
                    AppBrandGlobalNativeWidgetContainerView appBrandGlobalNativeWidgetContainerView = this.f238123S0;
                    if (appBrandGlobalNativeWidgetContainerView != null) {
                        appBrandGlobalNativeWidgetContainerView.removeAllViewsInLayout();
                    }
                    this.f238123S0 = null;
                    this.f238125T0 = null;
                    this.f238104B.clear();
                    synchronized (this.f238110H) {
                        this.f238110H.clear();
                    }
                    Map<AppBrandRuntime, C81247g3> map2 = C81247g3.f238648f;
                    synchronized (map2) {
                        g3Var = (C81247g3) ((HashMap) map2).remove(this);
                    }
                    if (g3Var != null) {
                        g3Var.close();
                    }
                    C84250s2 s2Var = this.f238111I;
                    s2Var.getClass();
                    HashSet hashSet = new HashSet(s2Var.f246089c);
                    s2Var.f246089c.clear();
                    Iterator it6 = hashSet.iterator();
                    while (it6.hasNext()) {
                        s2Var.mo122506c((Class) it6.next());
                    }
                    ((LinkedBlockingDeque) this.f238138a1).clear();
                    this.f238116N = false;
                    this.f238144g.removeCallbacksAndMessages((Object) null);
                    this.f238137Z0.stopTimer();
                    this.f238139b1.clear();
                    this.f238155t = false;
                    C83762b1.m102897a(this);
                    C90035h.m112631b(this.f238147j);
                    this.f238106D.clear();
                    C84888w3 w3Var = this.f238107E;
                    w3Var.f247412a.clear();
                    w3Var.f247413b.set(false);
                    this.f238108F.clear();
                    this.f238142e = null;
                    Iterator it7 = new LinkedList(this.f238109G).iterator();
                    while (it7.hasNext()) {
                        ((Runnable) it7.next()).run();
                    }
                    this.f238109G.clear();
                    mo113052e("dispatchDestroy, completed", new Object[0]);
                } catch (Throwable th) {
                    this.f238123S0 = null;
                    this.f238125T0 = null;
                    throw th;
                }
            } catch (Throwable th4) {
                this.f238163z = null;
                throw th4;
            }
        }
    }

    /* renamed from: u0 */
    public void mo113083u0() {
        mo113052e("onDetachFromStack", new Object[0]);
        this.f238113K.f255667a.mo122987s(C88514d.C88522g.ON_DETACH_FROM_STACK, (Object) null);
        String str = this.f238147j;
        Iterator<C83231l.C83234d> it = C83231l.f243081a;
        if (!TextUtils.isEmpty(str)) {
            Iterator<C83231l.C83234d> c = C83231l.m102142c(str);
            while (c.hasNext()) {
                c.next().mo74048d();
            }
        }
    }

    /* renamed from: v */
    public final void mo113084v(AppBrandInitConfig appBrandInitConfig) {
        boolean z = true;
        if (this.f238116N) {
            Log.m105925i("MicroMsg.AppBrandRuntime", "dispatchNewConfig, appId[%s] config[%s]", this.f238147j, appBrandInitConfig);
            if (appBrandInitConfig == null || appBrandInitConfig.f239365g == this.f238149o.f239365g) {
                z = false;
            }
            if (z) {
                mo113035V0();
            }
            mo113046a1(appBrandInitConfig);
            if (!this.f238128V && !mo113064k0()) {
                Iterator it = new LinkedList(this.f238108F).iterator();
                while (it.hasNext()) {
                    ((C83705n3) it.next()).mo114593e(this, mo113036W());
                }
            }
        } else if (mo113064k0() || this.f238117P) {
            Log.m105921e("MicroMsg.AppBrandRuntime", "dispatchNewConfig FATAL!! appId[%s] config[%s]", this.f238147j, appBrandInitConfig);
        } else {
            Log.m105921e("MicroMsg.AppBrandRuntime", "dispatchNewConfig appId[%s] config[%s] !mInitialized !mFinished !mFinishing, try reload", this.f238147j, appBrandInitConfig);
            mo113015J0(appBrandInitConfig, "dispatchNewConfigBeforeInitialized");
        }
    }

    /* renamed from: v0 */
    public void mo113085v0() {
    }

    /* renamed from: w */
    public final void mo113086w() {
        mo113020N0(new AppBrandRuntime$$d(this));
        if (this.f238122S) {
            this.f238126U.mo124221a(TimeUnit.MINUTES.toMillis(30));
        }
    }

    /* renamed from: w0 */
    public void mo113087w0() {
    }

    /* renamed from: x */
    public final void mo113088x(boolean z) {
        if (this.f238116N) {
            if (z || !mo113064k0()) {
                mo113052e("onPause", new Object[0]);
                this.f238122S = false;
                mo113089x0();
                this.f238113K.f255667a.mo122987s(C88514d.C88522g.TO_BACKGROUND, (Object) null);
                this.f238150p.mo114353y0();
                this.f238152q.mo110172C();
                String str = this.f238147j;
                Iterator<C83231l.C83234d> it = C83231l.f243081a;
                if (!TextUtils.isEmpty(str)) {
                    Iterator<C83231l.C83234d> c = C83231l.m102142c(str);
                    while (c.hasNext()) {
                        c.next().mo74049e(C83231l.m102143d(str));
                    }
                }
                C83231l.m102145f(this.f238147j, C83231l.C83233c.ON_PAUSE);
                m99066g0(C39623j.C39625b.ON_PAUSE);
                m99066g0(C39623j.C39625b.ON_STOP);
                this.f238112J.getClass();
                Log.m105924i("MicroMsg.AppBrandUserCaptureScreenMonitor", "onPause");
                try {
                    ScreenShotUtil.setScreenShotCallback(MMApplicationContext.getContext(), (ScreenShotUtil.ScreenShotCallback) null);
                } catch (SecurityException e) {
                    Log.printErrStackTrace("MicroMsg.AppBrandUserCaptureScreenMonitor", e, "[NOT CRASH] pause set null callback", new Object[0]);
                }
                C81925i2 i2Var = this.f238150p;
                C82074a0 a0Var = new C82074a0();
                a0Var.mo115161k(i2Var);
                a0Var.mo115158h();
                Log.m105924i("MicroMsg.Audio.AudioInterruptionEventDispatcher", "dispatchInterruptionBegin");
                C82078d.f240691a = true;
            }
        }
    }

    /* renamed from: x0 */
    public void mo113089x0() {
    }

    /* renamed from: y */
    public final void mo113090y() {
        Assert.assertNotNull(this.f238113K);
        this.f238113K.mo122981d();
    }

    /* renamed from: y0 */
    public void mo113091y0() {
        mo113052e("StayPausedAndWaitForInitializationTimeout", new Object[0]);
        mo113006E();
    }

    /* renamed from: z0 */
    public void mo113092z0() {
    }

    public AppBrandRuntime(C79774c cVar) {
        this(cVar.getContext());
        this.f238142e = null;
        this.f238143f = cVar;
    }

    public AppBrandRuntime(C81820e3 e3Var) {
        this(e3Var.mo113150l());
        this.f238142e = e3Var;
        this.f238143f = null;
    }
}
