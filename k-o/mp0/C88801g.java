package mp0;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.C84072q1;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.plugin.appbrand.performance.AppBrandPerformanceManager;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import lp0.C88620b;
import p910lj.C76701a;

/* renamed from: mp0.g */
public class C88801g implements C88620b<C83928t1> {
    /* renamed from: a */
    public void mo115970a(Context context, C83780d1 d1Var, String str) {
        C83928t1 t1Var = (C83928t1) d1Var;
        if (!((AppBrandSysConfigWC) t1Var.mo109671p(AppBrandSysConfigWC.class)).f234890x) {
            AppBrandPerformanceManager.m103494c(str);
            C76701a.makeText(context, (int) C0966R.string.f7782rg, 0).show();
        } else {
            AppBrandPerformanceManager.m103492a(str);
            C76701a.makeText(context, (int) C0966R.string.f7775r_, 0).show();
        }
        t1Var.getRuntime().mo113006E();
    }

    /* renamed from: b */
    public String mo115971b(Context context, C83780d1 d1Var, String str) {
        return ((AppBrandSysConfigWC) ((C83928t1) d1Var).mo109671p(AppBrandSysConfigWC.class)).f234890x ? context.getString(C0966R.string.f7774r9) : context.getString(C0966R.string.f7781rf);
    }

    /* renamed from: c */
    public boolean mo115972c(Context context, C83780d1 d1Var, String str) {
        AppBrandSysConfigWC appBrandSysConfigWC = (AppBrandSysConfigWC) ((C83928t1) d1Var).mo109671p(AppBrandSysConfigWC.class);
        return appBrandSysConfigWC.f261072r.f238585d == 1 || appBrandSysConfigWC.f261072r.f238585d == 2 || WeChatEnvironment.hasDebugger() || BuildInfo.IS_FLAVOR_RED || C84072q1.m103586a(str).f245471o;
    }
}
