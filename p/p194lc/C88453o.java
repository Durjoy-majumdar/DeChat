package p194lc;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import br0.C79774c;
import com.tencent.luggage.skyline.SkylineView;
import com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl;
import com.tencent.p014mm.plugin.appbrand.page.C29613m3;
import com.tencent.p014mm.plugin.appbrand.page.C83745a;
import com.tencent.p014mm.plugin.appbrand.page.C83797e3;
import com.tencent.p014mm.plugin.appbrand.page.C83817h4;
import com.tencent.p014mm.plugin.appbrand.page.C83930t3;
import com.tencent.p014mm.plugin.appbrand.page.C83978y3;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.skyline.IRouteBackCallback;
import com.tencent.skyline.PageConfig;
import com.tencent.skyline.SkylineRuntime;
import gy3.C87412m;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;
import p1044ub.C90630c;
import p176jc.C87929h;
import p176jc.C87933j;
import p176jc.C87943x;
import p225rc.C89925n;
import rq0.C90083b;

/* renamed from: lc.o */
public class C88453o<PAGE extends C90630c> extends C83930t3<PAGE> implements C90083b {

    /* renamed from: F */
    public C87943x f255479F;

    /* renamed from: G */
    public final IRouteBackCallback f255480G = new o$$e(this);

    public C88453o(PAGE page) {
        super(page);
    }

    /* renamed from: C0 */
    public SkylineRuntime mo122846C0() {
        if (mo124764Z() == null) {
            Log.m105924i("Luggage.MPPageRendererSkylineImpl", "getSkylineRuntime fail, component is null");
            return null;
        } else if (((C90630c) mo124764Z()).mo116160O0() == null) {
            Log.m105924i("Luggage.MPPageRendererSkylineImpl", "getService fail, component is null");
            return null;
        } else {
            AppServiceSkylineExtensionImpl appServiceSkylineExtensionImpl = (AppServiceSkylineExtensionImpl) ((C90630c) mo124764Z()).mo116160O0().mo125517G0(AppServiceSkylineExtensionImpl.class);
            if (appServiceSkylineExtensionImpl != null) {
                return appServiceSkylineExtensionImpl.f235027d;
            }
            Log.m105924i("Luggage.MPPageRendererSkylineImpl", "getService fail, extension is null");
            return null;
        }
    }

    /* renamed from: D0 */
    public final void mo122847D0() {
        boolean f = mo116498d0().mo113008F().mo113987f();
        boolean z = false;
        int i = 1;
        if ((mo116061h0().getContext().getResources().getConfiguration().uiMode & 48) == 32) {
            i = 2;
        }
        mo122846C0().updatePlatformBrightnessConfig(i, f);
        AccessibilityManager accessibilityManager = (AccessibilityManager) mo125216c0().getSystemService("accessibility");
        if (accessibilityManager != null) {
            z = accessibilityManager.isEnabled();
        }
        mo122846C0().updateAccessibilityEnable(z);
    }

    /* renamed from: E0 */
    public final C88470y mo116543B0() {
        return (C88470y) ((C83978y3) this.f244454g);
    }

    /* renamed from: J */
    public boolean mo111243J(String str, C83817h4 h4Var) {
        IRouteBackCallback iRouteBackCallback;
        IRouteBackCallback iRouteBackCallback2;
        C87933j jVar = C87933j.Legacy;
        try {
            mo122847D0();
            boolean J = super.mo111243J(str, h4Var);
            SkylineView skylineView = mo116543B0().f255554h;
            C87412m.m108591d(skylineView);
            boolean z = ((C90630c) mo124764Z()).f244578Y;
            C87929h hVar = skylineView.f235007g;
            if (hVar != null) {
                if (hVar.getMode() != jVar) {
                    skylineView.mo111445l(!z);
                    skylineView.resume();
                }
                C87943x a = C87943x.m109443a(mo122846C0());
                this.f255479F = a;
                if (!(a == null || (iRouteBackCallback2 = this.f255480G) == null)) {
                    if (!a.f254514c.getAndSet(true)) {
                        a.f254512a.waitForBack(a.f254513b);
                    }
                    a.f254515d.add(iRouteBackCallback2);
                }
                return J;
            }
            C87412m.m108603p("mFlutterViewWrapper");
            throw null;
        } catch (Throwable th) {
            SkylineView skylineView2 = mo116543B0().f255554h;
            C87412m.m108591d(skylineView2);
            boolean z2 = ((C90630c) mo124764Z()).f244578Y;
            C87929h hVar2 = skylineView2.f235007g;
            if (hVar2 != null) {
                if (hVar2.getMode() != jVar) {
                    skylineView2.mo111445l(!z2);
                    skylineView2.resume();
                }
                C87943x a2 = C87943x.m109443a(mo122846C0());
                this.f255479F = a2;
                if (!(a2 == null || (iRouteBackCallback = this.f255480G) == null)) {
                    if (!a2.f254514c.getAndSet(true)) {
                        a2.f254512a.waitForBack(a2.f254513b);
                    }
                    a2.f254515d.add(iRouteBackCallback);
                }
                throw th;
            }
            C87412m.m108603p("mFlutterViewWrapper");
            throw null;
        }
    }

    /* renamed from: M */
    public boolean mo122849M() {
        return true;
    }

    /* renamed from: O */
    public void mo116487O(C79774c cVar) {
        if (mo116543B0() != null) {
            mo116543B0().mo122882u(cVar);
        }
    }

    /* renamed from: P */
    public boolean mo122850P(long j, String str, C83817h4 h4Var, JSONObject jSONObject, boolean z) {
        PageConfig pageConfig = new PageConfig(C83745a.m102838e0(mo116498d0().mo113008F().mo113984c(C89925n.m112488a(str)), mo116498d0().mo113008F().mo113988g(), mo116498d0().mo113036W().mo111304q(), z));
        int ordinal = h4Var.ordinal();
        if (ordinal == 0) {
            mo122846C0().appLaunch(mo116060g0(), mo116062i0(), pageConfig);
        } else if (ordinal == 1) {
            mo122846C0().navigateTo(mo116060g0(), mo116062i0(), pageConfig, new o$$h(this, new o$$f(this, z, j, h4Var, jSONObject)));
        } else if (ordinal == 3) {
            boolean z2 = mo116060g0() == mo116062i0();
            o$$h o__h = new o$$h(this, new o$$g(this, z, j, h4Var, jSONObject));
            if (z2) {
                mo122846C0().navigateTo(mo116060g0(), mo116062i0(), pageConfig, o__h);
            } else {
                mo122846C0().redirectTo(mo116060g0(), mo116062i0(), pageConfig, o__h);
            }
        } else if (ordinal == 5) {
            mo122846C0().reLaunch(mo116060g0(), mo116062i0(), pageConfig);
            C90630c cVar = (C90630c) mo124764Z();
            Objects.requireNonNull(cVar);
            cVar.mo116274i0(new o$$b(this, z, j, h4Var, jSONObject));
        } else if (ordinal == 6) {
            mo122846C0().autoReLaunch(mo116060g0(), mo116062i0(), pageConfig);
            C90630c cVar2 = (C90630c) mo124764Z();
            Objects.requireNonNull(cVar2);
            cVar2.mo116274i0(new o$$c(this, z, j, h4Var, jSONObject));
        } else if (ordinal == 7) {
            Log.m105924i("Luggage.MPPageRendererSkylineImpl", "[perf] SkylineLogic.INSTANCE.switchTab");
            mo122846C0().switchTab(mo116060g0(), mo116062i0(), pageConfig);
        } else {
            throw new UnsupportedOperationException();
        }
        return true;
    }

    /* renamed from: S */
    public void mo116489S(Map<String, Object> map, C83817h4 h4Var) {
        super.mo116489S(map, h4Var);
        map.put("renderer", "skyline");
    }

    /* renamed from: W */
    public void mo111247W(View view) {
        super.mo111247W(view);
        view.addOnAttachStateChangeListener(new o$$d(this, view));
    }

    /* renamed from: a */
    public boolean mo111249a(int i, String str) {
        if (mo124764Z() == null || !((C90630c) mo124764Z()).isRunning()) {
            return true;
        }
        ((C90630c) mo124764Z()).mo116160O0().mo109647a(i, str);
        return true;
    }

    /* renamed from: b */
    public void mo111250b() {
        IRouteBackCallback iRouteBackCallback;
        try {
            super.mo111250b();
            C87943x xVar = this.f255479F;
            if (xVar != null && (iRouteBackCallback = this.f255480G) != null) {
                xVar.f254515d.remove(iRouteBackCallback);
            }
        } catch (Throwable th) {
            if (this.f255479F != null) {
                C87943x xVar2 = this.f255479F;
                IRouteBackCallback iRouteBackCallback2 = this.f255480G;
                if (iRouteBackCallback2 == null) {
                    xVar2.getClass();
                } else {
                    xVar2.f254515d.remove(iRouteBackCallback2);
                }
            }
            throw th;
        }
    }

    /* renamed from: e */
    public boolean mo111252e(String str, String str2, int[] iArr) {
        if (mo124764Z() == null || !((C90630c) mo124764Z()).isRunning()) {
            return true;
        }
        ((C90630c) mo124764Z()).mo116160O0().mo109652f(str, str2, mo116062i0());
        return true;
    }

    /* renamed from: f */
    public boolean mo111254f(String str, String str2, int i) {
        if (mo124764Z() == null || ((C90630c) mo124764Z()).mo116160O0() == null || !((C90630c) mo124764Z()).mo116160O0().isRunning()) {
            return true;
        }
        ((C90630c) mo124764Z()).mo116160O0().mo109652f(str, str2, i);
        return true;
    }

    /* renamed from: m */
    public boolean mo122851m(String str) {
        return C88468w.m110319a(mo116498d0(), str);
    }

    /* renamed from: p0 */
    public C83797e3 mo114318p0(Context context) {
        return new C88470y(this, context);
    }

    /* renamed from: q0 */
    public C83745a.C83750e mo116069q0() {
        return new C34220t();
    }

    /* renamed from: r0 */
    public C29613m3 mo116070r0() {
        return new C34221u();
    }

    /* renamed from: u */
    public int mo122852u(long j, int i, boolean z) {
        mo122846C0().navigateBack(mo116060g0(), mo116062i0(), i, z, new o$$h(this, new o$$a(this, z, j)));
        return i;
    }

    /* renamed from: x0 */
    public C83978y3 mo116547x0(Context context) {
        return new C88470y(this, context);
    }
}
