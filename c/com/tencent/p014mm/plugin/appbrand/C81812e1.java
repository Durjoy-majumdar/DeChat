package com.tencent.p014mm.plugin.appbrand;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import b34.C79664a;
import br0.C39836d;
import br0.C79774c;
import br0.C79778e;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.p014mm.plugin.appbrand.platform.window.WxaWindowLayoutParams;
import com.tencent.p014mm.plugin.appbrand.utils.C84785t0;
import com.tencent.p014mm.plugin.appbrand.widget.C84927e;
import com.tencent.p014mm.plugin.appbrand.widget.input.C85004y;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.system.AndroidContextUtil;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;

/* renamed from: com.tencent.mm.plugin.appbrand.e1 */
public class C81812e1<RUNTIME extends AppBrandRuntime> extends FrameLayout implements C81820e3, C79774c {

    /* renamed from: d */
    public Context f240042d;

    /* renamed from: e */
    public boolean f240043e = true;

    /* renamed from: f */
    public boolean f240044f;

    /* renamed from: g */
    public final Class<? extends RUNTIME> f240045g;

    /* renamed from: h */
    public final FrameLayout f240046h = this;

    /* renamed from: i */
    public final C85004y f240047i;

    /* renamed from: j */
    public final LinkedList<RUNTIME> f240048j = new LinkedList<>();

    /* renamed from: n */
    public final Map<String, RUNTIME> f240049n = new HashMap();

    /* renamed from: o */
    public final C81974j3 f240050o;

    /* renamed from: p */
    public C79778e f240051p;

    /* renamed from: q */
    public C81812e1<RUNTIME>.e f240052q;

    /* renamed from: com.tencent.mm.plugin.appbrand.e1$e */
    public class C68611e {
        public C68611e(C81812e1 e1Var, int i, int i2, int i3, int i4) {
            Log.m105927v("MicroMsg.WindowCompatInfo", "WindowCompatInfo: l = [%d], r = [%d], t = [%d], b = [%d]", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.e1$a */
    public class C81813a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ AppBrandRuntime f240053d;

        /* renamed from: e */
        public final /* synthetic */ AppBrandInitConfig f240054e;

        public C81813a(AppBrandRuntime appBrandRuntime, AppBrandInitConfig appBrandInitConfig) {
            this.f240053d = appBrandRuntime;
            this.f240054e = appBrandInitConfig;
        }

        public void run() {
            AppBrandRuntime appBrandRuntime;
            C81812e1.this.f240047i.mo117928c();
            if (this.f240053d == null) {
                C81812e1.this.mo114202y();
            }
            C81812e1 e1Var = C81812e1.this;
            String str = this.f240054e.f239362d;
            Iterator<RUNTIME> it = e1Var.f240048j.iterator();
            while (true) {
                if (!it.hasNext()) {
                    appBrandRuntime = (AppBrandRuntime) ((HashMap) e1Var.f240049n).get(str);
                    break;
                }
                appBrandRuntime = (AppBrandRuntime) it.next();
                if (appBrandRuntime.f238147j.equals(str)) {
                    break;
                }
            }
            if (appBrandRuntime == null) {
                C81812e1.this.mo114191S(this.f240053d, C81812e1.this.mo114201x(this.f240054e), this.f240054e);
                return;
            }
            C81812e1.this.mo114190J(this.f240053d, appBrandRuntime, this.f240054e);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.e1$b */
    public class C81814b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ AppBrandRuntime f240056d;

        /* renamed from: com.tencent.mm.plugin.appbrand.e1$b$a */
        public class C81815a implements Runnable {
            public C81815a() {
            }

            public void run() {
                Log.m105925i("Luggage.WXA.AppBrandRuntimeContainerViewImpl", "removeImpl, cleanupOut.run(), appId[%s]", C81814b.this.f240056d.f238147j);
                AppBrandRuntime appBrandRuntime = C81814b.this.f240056d;
                if (appBrandRuntime.f238122S) {
                    appBrandRuntime.mo113086w();
                }
                C81814b.this.f240056d.mo113082u();
                C81814b bVar = C81814b.this;
                C81812e1.this.f240046h.removeView(bVar.f240056d.f238153r);
                C81814b bVar2 = C81814b.this;
                ((HashMap) C81812e1.this.f240049n).remove(bVar2.f240056d.f238147j);
                C81814b bVar3 = C81814b.this;
                C81812e1.this.f240048j.remove(bVar3.f240056d);
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.e1$b$b */
        public class C81816b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ AppBrandRuntime f240059d;

            /* renamed from: e */
            public final /* synthetic */ Runnable f240060e;

            public C81816b(AppBrandRuntime appBrandRuntime, Runnable runnable) {
                this.f240059d = appBrandRuntime;
                this.f240060e = runnable;
            }

            public void run() {
                AppBrandRuntime appBrandRuntime;
                C81814b bVar = C81814b.this;
                boolean z = C81812e1.this.f240048j.peekFirst() == bVar.f240056d;
                AppBrandRuntime appBrandRuntime2 = this.f240059d;
                if (appBrandRuntime2 != null) {
                    appBrandRuntime2.mo113002B0(C81814b.this.f240056d.mo113036W(), (Object) null);
                } else {
                    C81814b.this.f240056d.mo113004D((Object) null);
                }
                this.f240060e.run();
                if (z && (appBrandRuntime = this.f240059d) != null) {
                    appBrandRuntime.mo113090y();
                    if (C81812e1.this.f240043e) {
                        this.f240059d.mo113000A();
                    }
                }
                Object[] objArr = new Object[3];
                objArr[0] = Boolean.valueOf(z);
                AppBrandRuntime appBrandRuntime3 = this.f240059d;
                objArr[1] = appBrandRuntime3 == null ? "null" : appBrandRuntime3.f238147j;
                objArr[2] = Boolean.valueOf(C81812e1.this.f240043e);
                Log.m105925i("Luggage.WXA.AppBrandRuntimeContainerViewImpl", "removeImpl closeTask.run(), outIsTopOfStackBefore[%b], below.appId[%s], mIsActivityResumed[%b]", objArr);
            }
        }

        public C81814b(AppBrandRuntime appBrandRuntime) {
            this.f240056d = appBrandRuntime;
        }

        public void run() {
            Log.m105925i("Luggage.WXA.AppBrandRuntimeContainerViewImpl", "removeImpl entered appId[%s]", this.f240056d.f238147j);
            C81815a aVar = new C81815a();
            if (!C81812e1.this.mo113124e(this.f240056d)) {
                Log.m105925i("Luggage.WXA.AppBrandRuntimeContainerViewImpl", "removeImpl appId[%s], not in runtime stack, just cleanup", this.f240056d.f238147j);
                aVar.run();
                return;
            }
            AppBrandRuntime o = C81812e1.this.mo113136o(this.f240056d);
            C81812e1.this.mo114192b0(o, this.f240056d, new C81816b(o, aVar));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.e1$c */
    public class C81817c implements Runnable {
        public C81817c() {
        }

        public void run() {
            C81812e1.this.mo114197f0();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.e1$d */
    public class C81818d extends C81974j3 {
        public C81818d() {
        }

        /* renamed from: a */
        public boolean mo107509a(KeyEvent keyEvent) {
            C85004y yVar = C81812e1.this.f240047i;
            if (yVar != null) {
                return yVar.mo117930f(keyEvent);
            }
            return false;
        }
    }

    public C81812e1(Context context, Class<? extends RUNTIME> cls) {
        super(context);
        C85004y yVar = new C85004y(getContext(), this);
        this.f240047i = yVar;
        addView(yVar);
        this.f240050o = new C81818d();
        this.f240052q = new C68611e(this, 0, 0, 0, 0);
        this.f240042d = context;
        this.f240045g = cls;
    }

    /* renamed from: A */
    public void mo114188A() {
        Log.m105925i("Luggage.WXA.AppBrandRuntimeContainerViewImpl", "dispatchPause tid[%d], mResumed[%b]", Long.valueOf(Thread.currentThread().getId()), Boolean.valueOf(this.f240043e));
        if (this.f240043e) {
            this.f240043e = false;
            mo114196e0(new C81881g1(this));
        }
    }

    /* renamed from: Bk */
    public boolean mo109902Bk() {
        return false;
    }

    /* renamed from: C */
    public void mo114189C() {
        Log.m105925i("Luggage.WXA.AppBrandRuntimeContainerViewImpl", "dispatchResume tid[%d], mResumed[%b]", Long.valueOf(Thread.currentThread().getId()), Boolean.valueOf(this.f240043e));
        if (!this.f240043e) {
            this.f240043e = true;
            mo114196e0(new C81830f1(this));
        }
    }

    /* renamed from: D5 */
    public ViewGroup.LayoutParams mo109903D5(AppBrandRuntime appBrandRuntime) {
        return null;
    }

    /* renamed from: J */
    public void mo114190J(RUNTIME runtime, RUNTIME runtime2, AppBrandInitConfig appBrandInitConfig) {
        if (!this.f240048j.contains(runtime2)) {
            this.f240048j.push(runtime2);
            if (this.f240046h.indexOfChild(runtime2.f238153r) == -1) {
                mo114200w(runtime2.f238153r);
            }
            ((HashMap) this.f240049n).remove(runtime2.f238147j);
        }
        this.f240048j.remove(runtime2);
        this.f240048j.push(runtime2);
        boolean z = false;
        runtime2.f238153r.setVisibility(0);
        C84927e eVar = runtime2.f238153r;
        if (this.f240046h.indexOfChild(eVar) == -1) {
            Log.m105928w("Luggage.WXA.AppBrandRuntimeContainerViewImpl", "bringRtViewToTop: such runtime view does not exist");
        } else {
            this.f240046h.bringChildToFront(eVar);
            C85004y yVar = this.f240047i;
            if (yVar != null) {
                z = true;
            }
            if (z) {
                this.f240046h.bringChildToFront(yVar);
            }
            mo114197f0();
            this.f240046h.setBackgroundColor(getResources().getColor(C0966R.color.f2930d));
        }
        runtime2.mo113090y();
        runtime2.f238148n = runtime;
        runtime2.mo113084v(appBrandInitConfig);
        if (runtime != null) {
            runtime.mo113086w();
            runtime2.mo113000A();
        }
    }

    /* renamed from: Lo */
    public void mo109904Lo(WxaWindowLayoutParams wxaWindowLayoutParams, AppBrandRuntime appBrandRuntime) {
    }

    /* renamed from: S */
    public void mo114191S(RUNTIME runtime, RUNTIME runtime2, AppBrandInitConfig appBrandInitConfig) {
        runtime2.f238148n = runtime;
        runtime2.mo113060i0(appBrandInitConfig);
        this.f240048j.push(runtime2);
        mo114200w(runtime2.f238153r);
        if (runtime != null) {
            runtime.mo113086w();
        }
        runtime2.mo113073p0();
    }

    /* renamed from: TE */
    public void mo109905TE(int i, AppBrandRuntime appBrandRuntime) {
    }

    /* renamed from: b0 */
    public void mo114192b0(AppBrandRuntime appBrandRuntime, AppBrandRuntime appBrandRuntime2, Runnable runnable) {
    }

    /* renamed from: c */
    public void mo113121c(AppBrandRuntime appBrandRuntime, AppBrandInitConfig appBrandInitConfig) {
        if (appBrandInitConfig != null) {
            mo114196e0(new C81813a(appBrandRuntime, appBrandInitConfig));
        }
    }

    /* renamed from: c0 */
    public final void mo114193c0(RUNTIME runtime) {
        if (runtime != null) {
            runtime.mo113016K0(this.f240050o);
            this.f240048j.remove(runtime);
            if (Build.VERSION.SDK_INT >= 24) {
                ((HashMap) this.f240049n).remove(runtime.f238147j, runtime);
                return;
            }
            ((HashMap) this.f240049n).remove(runtime.f238147j);
        }
    }

    public int compareTo(Object obj) {
        return this == ((C79774c) obj) ? 0 : -1;
    }

    public C39836d createFullscreenHandler(C39836d.C39839b bVar) {
        return (C39836d) C84785t0.m104465a("Luggage.WXA.WindowFullscreenHandler.Dummy", C39836d.class);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        AppBrandRuntime activeRuntime;
        if (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 4 || (activeRuntime = getActiveRuntime()) == null || activeRuntime.mo113064k0()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        activeRuntime.mo113075q0();
        return true;
    }

    /* renamed from: e */
    public boolean mo113124e(AppBrandRuntime appBrandRuntime) {
        return this.f240048j.contains(appBrandRuntime);
    }

    /* renamed from: e0 */
    public final void mo114196e0(Runnable runnable) {
        if (MMHandlerThread.isMainThread()) {
            runnable.run();
        } else {
            post(runnable);
        }
    }

    /* renamed from: f0 */
    public final void mo114197f0() {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            MMHandlerThread.postToMainThread(new C81817c());
            return;
        }
        C81812e1<RUNTIME>.e eVar = this.f240052q;
        FrameLayout frameLayout = this.f240046h;
        eVar.getClass();
        frameLayout.setPadding(0, 0, 0, 0);
    }

    public boolean forceLightMode() {
        return false;
    }

    public AppBrandRuntime getActiveRuntime() {
        return (AppBrandRuntime) this.f240048j.peek();
    }

    public final Activity getActivity() {
        return AndroidContextUtil.castActivityOrNull(this.f240042d);
    }

    public C79774c.C79776b getNavigationBar() {
        return null;
    }

    public C79778e getOrientationHandler() {
        if (this.f240051p == null) {
            this.f240051p = new C84887w2(this);
        }
        return this.f240051p;
    }

    public Rect getSafeAreaInsets() {
        return null;
    }

    public float getScale() {
        return 1.0f;
    }

    public int getStackSize() {
        return this.f240048j.size();
    }

    public C79774c.C79777c getStatusBar() {
        return null;
    }

    public DisplayMetrics getVDisplayMetrics() {
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        displayMetrics2.setTo(displayMetrics);
        C81812e1<RUNTIME>.e windowCompatInfo = getWindowCompatInfo();
        int width = getWidth();
        windowCompatInfo.getClass();
        displayMetrics2.widthPixels = width + 0 + 0;
        displayMetrics2.heightPixels = getHeight() + 0 + 0;
        return displayMetrics2;
    }

    public C79774c getWindowAndroid() {
        return this;
    }

    public C81812e1<RUNTIME>.e getWindowCompatInfo() {
        return this.f240052q;
    }

    public boolean isLargeScreenWindow() {
        return false;
    }

    /* renamed from: k */
    public void mo113134k(AppBrandRuntime appBrandRuntime) {
        if (appBrandRuntime != null) {
            mo114196e0(new C81814b(appBrandRuntime));
        }
    }

    /* renamed from: l */
    public Context mo113150l() {
        return this.f240042d;
    }

    /* renamed from: o */
    public RUNTIME mo113136o(AppBrandRuntime appBrandRuntime) {
        if (appBrandRuntime != null) {
            ListIterator<RUNTIME> listIterator = this.f240048j.listIterator();
            boolean z = false;
            while (listIterator.hasNext()) {
                RUNTIME runtime = (AppBrandRuntime) listIterator.next();
                if (runtime == appBrandRuntime) {
                    z = true;
                } else if (z) {
                    return runtime;
                }
            }
            if (z) {
                return null;
            }
            throw new IllegalAccessError(String.format("Runtime not in stack %s", new Object[]{appBrandRuntime.f238147j}));
        }
        throw new NullPointerException("Null runtime");
    }

    /* renamed from: q */
    public void mo113137q(AppBrandRuntime appBrandRuntime) {
        if (appBrandRuntime != null) {
            this.f240048j.remove(appBrandRuntime);
        }
    }

    /* renamed from: s */
    public void mo113138s(AppBrandRuntime appBrandRuntime, Object obj, Runnable runnable) {
    }

    /* renamed from: s5 */
    public boolean mo109912s5() {
        return false;
    }

    public void setSoftOrientation(String str) {
    }

    public void setWindowDescription(C79774c.C79775a aVar) {
    }

    public boolean shouldInLargeScreenCompatMode() {
        return false;
    }

    /* renamed from: w */
    public final void mo114200w(C84927e eVar) {
        int i;
        int childCount = this.f240046h.getChildCount();
        if (this.f240047i != null) {
            int childCount2 = this.f240046h.getChildCount();
            if (childCount2 > 1 || (childCount2 == 1 && this.f240047i != null)) {
                i = childCount - 1;
                Log.m105925i("Luggage.WXA.AppBrandRuntimeContainerViewImpl", "loadNewRtContentView: name = [%s], index = [%d]", eVar.getTag(), Integer.valueOf(i));
                this.f240046h.addView(eVar, i);
                this.f240046h.setBackgroundColor(getResources().getColor(C0966R.color.f2930d));
                mo114197f0();
                getActiveRuntime().mo113057h(4, 1, this.f240050o);
            }
        }
        i = 0;
        Log.m105925i("Luggage.WXA.AppBrandRuntimeContainerViewImpl", "loadNewRtContentView: name = [%s], index = [%d]", eVar.getTag(), Integer.valueOf(i));
        this.f240046h.addView(eVar, i);
        this.f240046h.setBackgroundColor(getResources().getColor(C0966R.color.f2930d));
        mo114197f0();
        getActiveRuntime().mo113057h(4, 1, this.f240050o);
    }

    /* renamed from: x */
    public RUNTIME mo114201x(AppBrandInitConfig appBrandInitConfig) {
        Class<? extends RUNTIME> cls = this.f240045g;
        return (AppBrandRuntime) new C79664a(cls, cls).mo109791d(this).f233575b;
    }

    /* renamed from: y */
    public final void mo114202y() {
        Iterator<RUNTIME> it = this.f240048j.iterator();
        while (it.hasNext()) {
            AppBrandRuntime appBrandRuntime = (AppBrandRuntime) it.next();
            appBrandRuntime.f238153r.setVisibility(8);
            ((HashMap) this.f240049n).put(appBrandRuntime.f238147j, appBrandRuntime);
            appBrandRuntime.mo113083u0();
        }
        this.f240048j.clear();
    }
}
