package mp0;

import android.content.Context;
import com.tencent.p014mm.plugin.appbrand.C84072q1;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1727m;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83181q;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import gy3.C87412m;
import kr0.C88267e;
import lp0.C88620b;

/* renamed from: mp0.n */
public final class C88806n implements C88620b<C83928t1> {

    /* renamed from: a */
    public static final C88806n f256211a = new C88806n();

    /* renamed from: a */
    public void mo115970a(Context context, C83780d1 d1Var, String str) {
        C83928t1 t1Var = (C83928t1) d1Var;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(t1Var, "pageView");
        C88267e eVar = (C88267e) t1Var.getRuntime().f238150p;
        ((C83181q) eVar.getJsRuntime().mo63321n0(C83181q.class)).post(new C88805m(eVar));
    }

    /* renamed from: b */
    public String mo115971b(Context context, C83780d1 d1Var, String str) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g((C83928t1) d1Var, "pageView");
        C87412m.m108594g(str, "appId");
        return "Request Force GC";
    }

    /* renamed from: c */
    public boolean mo115972c(Context context, C83780d1 d1Var, String str) {
        C83928t1 t1Var = (C83928t1) d1Var;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(t1Var, "pageView");
        C87412m.m108594g(str, "appId");
        if (t1Var.mo116160O0().f262593H.mo125522h0() == null) {
            return false;
        }
        C1727m p = t1Var.mo109671p(AppBrandSysConfigWC.class);
        C87412m.m108593f(p, "pageView.getConfig(AppBr…dSysConfigWC::class.java)");
        AppBrandSysConfigWC appBrandSysConfigWC = (AppBrandSysConfigWC) p;
        return appBrandSysConfigWC.f261072r.f238585d == 1 || appBrandSysConfigWC.f261072r.f238585d == 2 || WeChatEnvironment.hasDebugger() || WeChatEnvironment.isMonkeyEnv() || BuildInfo.IS_FLAVOR_RED || C84072q1.m103586a(str).f245471o;
    }
}
