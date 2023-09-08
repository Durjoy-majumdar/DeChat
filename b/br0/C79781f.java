package br0;

import android.content.Context;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import br0.C39836d;
import br0.C79774c;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.platform.window.WxaWindowLayoutParams;
import com.tencent.p014mm.plugin.lite.LiteAppCenter;
import gy3.C87412m;

/* renamed from: br0.f */
public final class C79781f implements C79774c {

    /* renamed from: d */
    public final C79774c f233806d;

    /* renamed from: e */
    public final C79782g f233807e;

    public C79781f(C79774c cVar, C79782g gVar) {
        C87412m.m108594g(cVar, LiteAppCenter.FRAMEWORK_TYPE_BASE);
        C87412m.m108594g(gVar, "windowViewImplScope");
        this.f233806d = cVar;
        this.f233807e = gVar;
    }

    /* renamed from: Bk */
    public boolean mo109902Bk() {
        return this.f233806d.mo109902Bk();
    }

    /* renamed from: D5 */
    public ViewGroup.LayoutParams mo109903D5(AppBrandRuntime appBrandRuntime) {
        ViewGroup.LayoutParams D5 = this.f233806d.mo109903D5(appBrandRuntime);
        C87412m.m108593f(D5, "base.getWindowLayoutParams(rt)");
        return D5;
    }

    /* renamed from: Lo */
    public void mo109904Lo(WxaWindowLayoutParams wxaWindowLayoutParams, AppBrandRuntime appBrandRuntime) {
        C87412m.m108594g(wxaWindowLayoutParams, "params");
        C87412m.m108594g(appBrandRuntime, "runtime");
        this.f233806d.mo109904Lo(wxaWindowLayoutParams, appBrandRuntime);
    }

    /* renamed from: TE */
    public void mo109905TE(int i, AppBrandRuntime appBrandRuntime) {
        C87412m.m108594g(appBrandRuntime, "runtime");
        this.f233806d.mo109905TE(i, appBrandRuntime);
    }

    public int compareTo(Object obj) {
        C79774c cVar = (C79774c) obj;
        C87412m.m108594g(cVar, "other");
        if (!(cVar instanceof C79781f)) {
            return -1;
        }
        C79781f fVar = (C79781f) cVar;
        if (!C87412m.m108589b(fVar.f233807e, this.f233807e)) {
            return -1;
        }
        return this.f233806d.compareTo(fVar.f233806d);
    }

    public C39836d createFullscreenHandler(C39836d.C39839b bVar) {
        C39836d createFullscreenHandler = this.f233807e.createFullscreenHandler(bVar);
        if (createFullscreenHandler != null) {
            return createFullscreenHandler;
        }
        C39836d createFullscreenHandler2 = this.f233806d.createFullscreenHandler(bVar);
        C87412m.m108593f(createFullscreenHandler2, "base.createFullscreenHandler(provider)");
        return createFullscreenHandler2;
    }

    public boolean forceLightMode() {
        return this.f233807e.forceLightMode();
    }

    public Context getContext() {
        Context context = this.f233806d.getContext();
        C87412m.m108593f(context, "base.context");
        return context;
    }

    public C79774c.C79776b getNavigationBar() {
        return this.f233806d.getNavigationBar();
    }

    public C79778e getOrientationHandler() {
        C79778e orientationHandler = this.f233807e.getOrientationHandler();
        if (orientationHandler != null) {
            return orientationHandler;
        }
        C79778e orientationHandler2 = this.f233806d.getOrientationHandler();
        C87412m.m108593f(orientationHandler2, "base.orientationHandler");
        return orientationHandler2;
    }

    public Rect getSafeAreaInsets() {
        return this.f233806d.getSafeAreaInsets();
    }

    public float getScale() {
        return this.f233807e.getScale();
    }

    public C79774c.C79777c getStatusBar() {
        return this.f233807e.getStatusBar();
    }

    public DisplayMetrics getVDisplayMetrics() {
        DisplayMetrics vDisplayMetrics = this.f233807e.getVDisplayMetrics();
        C87412m.m108593f(vDisplayMetrics, "windowViewImplScope.vDisplayMetrics");
        return vDisplayMetrics;
    }

    public boolean isLargeScreenWindow() {
        return this.f233807e.isLargeScreenWindow();
    }

    /* renamed from: s5 */
    public boolean mo109912s5() {
        return this.f233806d.mo109912s5();
    }

    public void setSoftOrientation(String str) {
        C87412m.m108594g(str, "name");
        this.f233807e.setSoftOrientation(str);
    }

    public void setWindowDescription(C79774c.C79775a aVar) {
        C87412m.m108594g(aVar, "description");
        this.f233806d.setWindowDescription(aVar);
    }

    public boolean shouldInLargeScreenCompatMode() {
        return this.f233807e.shouldInLargeScreenCompatMode();
    }
}
