package br0;

import android.content.Context;
import br0.C79778e;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C81820e3;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import com.tencent.p014mm.plugin.appbrand.utils.C84722b1;
import com.tencent.p014mm.plugin.appbrand.utils.C84747i;
import com.tencent.p014mm.plugin.appbrand.utils.C84797y1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C8480h;
import gy3.C87412m;
import rx3.C13603j;

/* renamed from: br0.h */
public final class C79783h implements C84722b1 {

    /* renamed from: b */
    public static final C79784a f233808b = new C79784a((C8480h) null);

    /* renamed from: a */
    public final C79778e f233809a;

    /* renamed from: br0.h$a */
    public static final class C79784a implements C84722b1.C84723a {
        public C79784a(C8480h hVar) {
        }

        /* renamed from: a */
        public C84722b1 mo109928a(C82520h hVar) {
            C84747i iVar;
            Context context;
            Context context2;
            C81820e3 e3Var;
            C79774c windowAndroid;
            C79778e orientationHandler;
            if (hVar instanceof C82554k) {
                AppBrandRuntime runtime = ((C82554k) hVar).getRuntime();
                if (runtime != null && (e3Var = runtime.f238142e) != null && (windowAndroid = e3Var.getWindowAndroid()) != null && (orientationHandler = windowAndroid.getOrientationHandler()) != null) {
                    return new C79783h(orientationHandler);
                }
                if (hVar == null || (context2 = hVar.getContext()) == null) {
                    context2 = MMApplicationContext.getContext();
                }
                C87412m.m108593f(context2, "componentView?.context ?…ationContext.getContext()");
                iVar = new C84747i(context2);
                Log.m105928w("MicroMsg.AppBrand.WxaOrientationGetter", "create, something null, use AndroidOrientationGetter as fallback");
            } else {
                Log.m105928w("MicroMsg.AppBrand.WxaOrientationGetter", "create, componentView is not AppBrandComponentWithExtra, use AndroidOrientationGetter as fallback");
                if (hVar == null || (context = hVar.getContext()) == null) {
                    context = MMApplicationContext.getContext();
                }
                C87412m.m108593f(context, "componentView?.context ?…ationContext.getContext()");
                iVar = new C84747i(context);
            }
            return iVar;
        }
    }

    public C79783h(C79778e eVar) {
        C87412m.m108594g(eVar, "orientationHandler");
        this.f233809a = eVar;
    }

    /* renamed from: a */
    public C84797y1 mo109926a() {
        C79778e.C79780b a = this.f233809a.mo109917a();
        C87412m.m108593f(a, "orientationHandler.currentOrientation");
        int ordinal = a.ordinal();
        if (ordinal == 0) {
            return C84797y1.PORTRAIT;
        }
        if (ordinal == 1) {
            return C84797y1.UNSPECIFIED;
        }
        if (ordinal == 2 || ordinal == 3 || ordinal == 4 || ordinal == 5) {
            return C84797y1.LANDSCAPE;
        }
        throw new C13603j();
    }

    public String getName() {
        return "WxaOrientationGetter";
    }
}
