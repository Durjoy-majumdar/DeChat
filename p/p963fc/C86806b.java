package p963fc;

import android.app.Activity;
import android.text.TextUtils;
import br0.C79778e;
import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C81820e3;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandUI;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandUI$$b;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.plugin.appbrand.widget.input.C85004y;
import com.tencent.p014mm.sdk.platformtools.Log;
import cr0.C86097c;

/* renamed from: fc.b */
public class C86806b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C86812g f251954d;

    /* renamed from: e */
    public final /* synthetic */ AppBrandInitConfigLU f251955e;

    /* renamed from: f */
    public final /* synthetic */ AppBrandStatObject f251956f;

    /* renamed from: g */
    public final /* synthetic */ C86809e f251957g;

    public C86806b(C86809e eVar, C86812g gVar, AppBrandInitConfigLU appBrandInitConfigLU, AppBrandStatObject appBrandStatObject) {
        this.f251957g = eVar;
        this.f251954d = gVar;
        this.f251955e = appBrandInitConfigLU;
        this.f251956f = appBrandStatObject;
    }

    public void run() {
        Activity w = this.f251957g.mo120548w();
        int i = C85004y.f247715r;
        C85004y yVar = (C85004y) w.findViewById(C0966R.C0970id.f6025v7);
        if (yVar != null) {
            yVar.mo117928c();
        }
        if (this.f251954d == null) {
            this.f251957g.mo113117M(this.f251955e.f239362d);
        }
        C86812g gVar = (C86812g) this.f251957g.mo113118S(this.f251955e.f239362d);
        AppBrandInitConfigLU appBrandInitConfigLU = this.f251955e;
        appBrandInitConfigLU.f234834c1 = this.f251956f;
        AppBrandRuntime appBrandRuntime = null;
        if (gVar == null) {
            gVar = (C86812g) this.f251957g.mo113116J(appBrandInitConfigLU);
            C86809e eVar = this.f251957g;
            eVar.getClass();
            C79778e.C79780b bVar = C79778e.C79780b.PORTRAIT;
            if (!(gVar == null || gVar.mo113036W() == null)) {
                if (gVar.mo113038X()) {
                    AppBrandInitConfigLU l1 = gVar.mo113036W();
                    AppBrandUI appBrandUI = ((AppBrandUI$$b) eVar.f238207o).f246511a;
                    if (appBrandUI != null && !appBrandUI.isFinishing()) {
                        C86097c x = eVar.getOrientationHandler();
                        if (x == null) {
                            Log.m105921e("Luggage.AppBrandRuntimeContainerLU[AppBrandSplashAd]", "tryRequestOrientationWithSplashAd, appId:%s, orientation:%s, NULL orientationHandler", l1.f239362d, l1.f239366h);
                        } else {
                            String str = l1.f239362d;
                            Log.m105925i("Luggage.AppBrandRuntimeContainerLU[AppBrandSplashAd]", "tryRequestOrientationWithSplashAd, appId:%s, config.Orientation:%s", str, l1.f239366h);
                            x.mo109918b(bVar, new C86807c(eVar, str));
                        }
                    }
                } else {
                    AppBrandInitConfigLU l15 = gVar.mo113036W();
                    if (!TextUtils.isEmpty(l15.f239366h) && l15.mo111300k()) {
                        C86097c x2 = eVar.getOrientationHandler();
                        if (x2 == null) {
                            Log.m105921e("Luggage.AppBrandRuntimeContainerLU[AppBrandSplashAd]", "tryRequestOrientationWithoutAd appId[%s] orientation[%s], NULL orientationHandler", l15.f239362d, l15.f239366h);
                        } else {
                            String str2 = l15.f239362d;
                            Log.m105925i("Luggage.AppBrandRuntimeContainerLU[AppBrandSplashAd]", "tryRequestOrientationWithoutAd, appId:%s, config.Orientation:%s", str2, l15.f239366h);
                            C79778e.C79780b b = C79778e.C79780b.m96933b(l15.f239366h);
                            if (b != null) {
                                bVar = b;
                            }
                            x2.mo109918b(bVar, new C86808d(eVar, str2));
                        }
                    }
                }
            }
            this.f251957g.mo113122c0(this.f251954d, gVar, this.f251955e);
        } else {
            C86812g gVar2 = this.f251954d;
            if (gVar2 == gVar) {
                this.f251957g.mo113120b0(null, gVar, appBrandInitConfigLU);
                this.f251957g.mo113123d0();
            } else {
                this.f251957g.mo113120b0(gVar2, gVar, appBrandInitConfigLU);
            }
        }
        if (this.f251957g.mo113124e(gVar)) {
            C81820e3 e3Var = gVar.f238142e;
            if (e3Var != null) {
                appBrandRuntime = e3Var.mo113136o(gVar);
            }
            if (appBrandRuntime != null) {
                gVar.mo113029S0(true);
            } else {
                gVar.mo113029S0(false);
            }
        }
    }
}
