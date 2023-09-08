package cr0;

import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowManager;
import br0.C39836d;
import br0.C79774c;
import com.tencent.p014mm.p136ui.C85864g1;
import com.tencent.p014mm.p136ui.C85924r4;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84545i3;
import com.tencent.p014mm.plugin.appbrand.platform.window.WxaWindowLayoutParams;
import com.tencent.p014mm.plugin.appbrand.utils.C84777q1;
import com.tencent.p014mm.plugin.appbrand.widget.C84922c;
import com.tencent.p014mm.plugin.appbrand.widget.C84927e;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.system.AndroidContextUtil;
import java.lang.reflect.Proxy;
import java.util.Objects;
import java.util.WeakHashMap;
import p225rc.C89923l;
import p849e3.C107168a0;
import p849e3.C107207u;

/* renamed from: cr0.t */
public class C86127t implements C79774c {

    /* renamed from: d */
    public Context f250648d = new MutableContextWrapper(MMApplicationContext.getContext());

    /* renamed from: e */
    public C86121p f250649e;

    /* renamed from: f */
    public C86097c f250650f;

    /* renamed from: g */
    public WindowInsets f250651g;

    /* renamed from: h */
    public final SparseArray<Rect> f250652h = new SparseArray<>(4);

    /* renamed from: A */
    public final void mo120546A(Context context) {
        C86121p pVar;
        if (this.f250648d != context) {
            if (mo113139u()) {
                Log.m105925i("Luggage.WXA.WindowAndroidActivityImpl", "resetContext, this:%s, new:%s, old:%s, stack:%s", getClass().getName(), context, this.f250648d, android.util.Log.getStackTraceString(new Throwable()));
            }
            this.f250648d = context;
            Activity w = mo120548w();
            if (w == null) {
                Class<C86121p> cls = C86121p.class;
                pVar = (C86121p) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C86120o());
            } else {
                pVar = Build.VERSION.SDK_INT >= 28 ? new C86122q(w) : new C86125r(w);
            }
            this.f250649e = pVar;
            getOrientationHandler();
            Activity w2 = mo120548w();
            if (w2 != null) {
                this.f250651g = C85924r4.m106237b(w2);
            }
        }
    }

    /* renamed from: Bk */
    public boolean mo109902Bk() {
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        Activity w = mo120548w();
        if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED) {
            Objects.requireNonNull(w);
        }
        return w != null && w.isInMultiWindowMode();
    }

    /* renamed from: D5 */
    public ViewGroup.LayoutParams mo109903D5(AppBrandRuntime appBrandRuntime) {
        C84927e eVar = appBrandRuntime.f238153r;
        return (!(eVar instanceof C84922c) || appBrandRuntime.mo113067m0()) ? appBrandRuntime.f238153r.getLayoutParams() : ((C84922c) eVar).getWxaLayoutParams();
    }

    /* renamed from: Lo */
    public void mo109904Lo(WxaWindowLayoutParams wxaWindowLayoutParams, AppBrandRuntime appBrandRuntime) {
        C84927e eVar = appBrandRuntime.f238153r;
        if (!(eVar instanceof C84922c) || appBrandRuntime.mo113067m0()) {
            appBrandRuntime.f238153r.setLayoutParams(wxaWindowLayoutParams);
            appBrandRuntime.f238153r.setScaleX(wxaWindowLayoutParams.f245452a);
            appBrandRuntime.f238153r.setScaleY(wxaWindowLayoutParams.f245452a);
            return;
        }
        ((C84922c) eVar).setWxaLayoutParams(wxaWindowLayoutParams);
    }

    /* renamed from: TE */
    public void mo109905TE(int i, AppBrandRuntime appBrandRuntime) {
        boolean z = i == 0 || (i >> 24) != 0;
        Activity w = mo120548w();
        if (w != null) {
            w.getWindow().setBackgroundDrawable(z ? new ColorDrawable(0) : new ColorDrawable(i));
        }
    }

    public int compareTo(Object obj) {
        C79774c cVar = (C79774c) obj;
        if (cVar == null) {
            return -1;
        }
        return (this != cVar && (!(cVar instanceof C86127t) || mo120548w() != ((C86127t) cVar).mo120548w())) ? -1 : 0;
    }

    public C39836d createFullscreenHandler(C39836d.C39839b bVar) {
        return new C86095b(this, bVar);
    }

    public boolean forceLightMode() {
        return false;
    }

    public final Context getContext() {
        return this.f250648d;
    }

    public C79774c.C79776b getNavigationBar() {
        int a = C85864g1.m106126a(this.f250648d);
        if (a <= 0) {
            return null;
        }
        C79774c.C79776b bVar = new C79774c.C79776b();
        bVar.f233794a = a;
        return bVar;
    }

    public Rect getSafeAreaInsets() {
        Rect rect;
        long currentTicks = Util.currentTicks();
        try {
            Activity w = mo120548w();
            if (w == null) {
                Log.m105920e("Luggage.WXA.WindowAndroidActivityImpl", "getSafeAreaInsets with NULL activity");
                long currentTicks2 = Util.currentTicks() - currentTicks;
                Object[] objArr = new Object[2];
                objArr[0] = Boolean.valueOf(Looper.getMainLooper() == Looper.myLooper());
                objArr[1] = Long.valueOf(currentTicks2);
                Log.m105925i("Luggage.WXA.WindowAndroidActivityImpl", "getSafeAreaInsets forMainThread:%b, cost:%dms", objArr);
                return null;
            } else if (w.getWindow() == null) {
                Log.m105920e("Luggage.WXA.WindowAndroidActivityImpl", "getSafeAreaInsets will NULL window");
                long currentTicks3 = Util.currentTicks() - currentTicks;
                Object[] objArr2 = new Object[2];
                objArr2[0] = Boolean.valueOf(Looper.getMainLooper() == Looper.myLooper());
                objArr2[1] = Long.valueOf(currentTicks3);
                Log.m105925i("Luggage.WXA.WindowAndroidActivityImpl", "getSafeAreaInsets forMainThread:%b, cost:%dms", objArr2);
                return null;
            } else {
                int rotation = w.getWindowManager().getDefaultDisplay().getRotation();
                synchronized (this.f250652h) {
                    rect = this.f250652h.get(rotation);
                    if (rect == null) {
                        rect = mo120550y(w, rotation);
                        this.f250652h.put(rotation, rect);
                    }
                }
                long currentTicks4 = Util.currentTicks() - currentTicks;
                Object[] objArr3 = new Object[2];
                objArr3[0] = Boolean.valueOf(Looper.getMainLooper() == Looper.myLooper());
                objArr3[1] = Long.valueOf(currentTicks4);
                Log.m105925i("Luggage.WXA.WindowAndroidActivityImpl", "getSafeAreaInsets forMainThread:%b, cost:%dms", objArr3);
                return rect;
            }
        } catch (Throwable th) {
            long currentTicks5 = Util.currentTicks() - currentTicks;
            Object[] objArr4 = new Object[2];
            objArr4[0] = Boolean.valueOf(Looper.getMainLooper() == Looper.myLooper());
            objArr4[1] = Long.valueOf(currentTicks5);
            Log.m105925i("Luggage.WXA.WindowAndroidActivityImpl", "getSafeAreaInsets forMainThread:%b, cost:%dms", objArr4);
            throw th;
        }
    }

    public float getScale() {
        return 1.0f;
    }

    public C79774c.C79777c getStatusBar() {
        WindowInsets windowInsets;
        Activity w = mo120548w();
        if (w != null) {
            windowInsets = C85924r4.m106237b(w);
            this.f250651g = windowInsets;
        } else {
            windowInsets = this.f250651g;
            if (windowInsets == null) {
                windowInsets = null;
            }
        }
        int stableInsetTop = windowInsets != null ? windowInsets.getStableInsetTop() : C89923l.f258408a.mo117497c(this.f250648d);
        C79774c.C79777c cVar = new C79774c.C79777c();
        cVar.f233795a = stableInsetTop;
        if (mo120548w() != null) {
            cVar.f233796b = C84545i3.m104132i(mo120548w()) ? 8 : 0;
        }
        return cVar;
    }

    public DisplayMetrics getVDisplayMetrics() {
        Display defaultDisplay = ((WindowManager) this.f250648d.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return displayMetrics;
    }

    public final boolean isLargeScreenWindow() {
        return C84777q1.m104442b(this.f250648d);
    }

    /* renamed from: l */
    public Context mo113150l() {
        return this.f250648d;
    }

    /* renamed from: s5 */
    public boolean mo109912s5() {
        return false;
    }

    public void setSoftOrientation(String str) {
    }

    public void setWindowDescription(C79774c.C79775a aVar) {
        if (mo120548w() != null && aVar != null) {
            try {
                mo120548w().setTaskDescription(C86126s.m106630a(aVar));
            } catch (Exception e) {
                Log.m105921e("Luggage.WXA.WindowAndroidActivityImpl", "setWindowDescription try1 e=%s", e);
                try {
                    mo120548w().setTaskDescription(C86126s.m106630a(new C79774c.C79775a(aVar.f233791a, aVar.f233792b, -16777216)));
                } catch (Exception e2) {
                    Log.m105921e("Luggage.WXA.WindowAndroidActivityImpl", "setWindowDescription try2 e=%s", e2);
                }
            }
        }
    }

    public boolean shouldInLargeScreenCompatMode() {
        return false;
    }

    /* renamed from: u */
    public boolean mo113139u() {
        return false;
    }

    /* renamed from: w */
    public final Activity mo120548w() {
        return AndroidContextUtil.castActivityOrNull(this.f250648d);
    }

    /* renamed from: x */
    public C86097c getOrientationHandler() {
        C86097c cVar = this.f250650f;
        if (cVar == null || ((cVar instanceof C86098d) && ((C86098d) cVar).f250587c != mo120548w())) {
            C86097c cVar2 = this.f250650f;
            if (cVar2 != null) {
                cVar2.release();
            }
            this.f250650f = new C86098d(this);
        }
        return this.f250650f;
    }

    /* renamed from: y */
    public final Rect mo120550y(Activity activity, int i) {
        int i2;
        int i3;
        WindowInsets windowInsets;
        View decorView = activity.getWindow().getDecorView();
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        if (C107207u.C107211e.m145208c(decorView)) {
            View decorView2 = activity.getWindow().getDecorView();
            i3 = decorView2.getWidth();
            i2 = decorView2.getHeight();
        } else {
            i3 = getVDisplayMetrics().widthPixels;
            i2 = getVDisplayMetrics().heightPixels;
        }
        if (!this.f250649e.mo120543c()) {
            return new Rect(0, 0, i3, i2);
        }
        if (!this.f250649e.mo120543c()) {
            return new Rect(0, 0, i3, i2);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            C86122q qVar = (C86122q) this.f250649e;
            synchronized (qVar.f250638b) {
                windowInsets = qVar.f250641e.get(i);
            }
            if (windowInsets != null) {
                DisplayCutout displayCutout = windowInsets.getDisplayCutout();
                if (displayCutout != null) {
                    return new Rect(displayCutout.getSafeInsetLeft(), displayCutout.getSafeInsetTop(), i3 - displayCutout.getSafeInsetRight(), i2 - displayCutout.getSafeInsetBottom());
                }
                Log.m105920e("Luggage.WXA.WindowAndroidActivityImpl", "getSafeAreaGuarded api28 NULL getDisplayCutout, fallback impl");
            }
        }
        int d = this.f250649e.mo120544d();
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? new Rect(0, 0, i3, i2) : new Rect(0, 0, i3 - d, i2) : new Rect(0, 0, i3, i2 - d) : new Rect(d, 0, i3, i2) : new Rect(0, d, i3, i2);
    }
}
