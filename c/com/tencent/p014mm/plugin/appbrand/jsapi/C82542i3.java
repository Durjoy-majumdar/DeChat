package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.view.View;
import android.view.animation.AlphaAnimation;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.appcache.C81243g;
import com.tencent.p014mm.plugin.appbrand.page.C83790e2;
import com.tencent.p014mm.plugin.appbrand.page.C83826i2;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import org.json.JSONObject;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.i3 */
public final class C82542i3 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C83928t1 f241633d;

    /* renamed from: e */
    public final /* synthetic */ JSONObject f241634e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C82542i3(C83928t1 t1Var, JSONObject jSONObject, String str) {
        super(0);
        this.f241633d = t1Var;
        this.f241634e = jSONObject;
    }

    public Object invoke() {
        AppBrandRuntimeWC J1 = this.f241633d.getRuntime();
        if (this.f241634e.optBoolean("shouldHighlight")) {
            C83790e2 e2Var = this.f241633d.f245024h1;
            String str = J1.mo113210l1().f239364f;
            C87412m.m108593f(str, "runtime.getInitConfig().iconUrl");
            String str2 = J1.mo113210l1().f239363e;
            C87412m.m108593f(str2, "runtime.getInitConfig().brandName");
            String a = C81243g.m99551a(J1.mo113213o1().f261072r.f238585d);
            C87412m.m108593f(a, "getTipNameByDebugType(ru…sConfig().appDebugType())");
            boolean k = J1.mo113210l1().mo111300k();
            boolean z = J1.mo113210l1().f239368j == 1;
            e2Var.getClass();
            if (e2Var.f244639e.f233373e.getVisibility() == 0) {
                View view = e2Var.f244639e.f233375g;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/page/AppBrandSinglePageModeFooter", "doFlicker", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/appbrand/page/AppBrandSinglePageModeFooter", "doFlicker", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view3 = e2Var.f244639e.f233375g;
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.2f);
                alphaAnimation.setRepeatCount(1);
                alphaAnimation.setDuration(300);
                alphaAnimation.setRepeatMode(2);
                alphaAnimation.setAnimationListener(new C83826i2(e2Var));
                view3.startAnimation(alphaAnimation);
            } else {
                e2Var.mo116259b(false, str, str2, a, k, z);
            }
        } else {
            AppBrandRuntimeWC J12 = this.f241633d.getRuntime();
            C83790e2 e2Var2 = this.f241633d.f245024h1;
            String str3 = J12.mo113210l1().f239364f;
            C87412m.m108593f(str3, "runtime.getInitConfig().iconUrl");
            String str4 = J12.mo113210l1().f239363e;
            C87412m.m108593f(str4, "runtime.getInitConfig().brandName");
            String a2 = C81243g.m99551a(J12.mo113213o1().f261072r.f238585d);
            C87412m.m108593f(a2, "getTipNameByDebugType(ru…sConfig().appDebugType())");
            boolean k2 = J12.mo113210l1().mo111300k();
            boolean z2 = J12.mo113210l1().f239368j == 1;
            e2Var2.getClass();
            e2Var2.mo116259b(true, str3, str4, a2, k2, z2);
        }
        return C13598b0.f38549a;
    }
}
