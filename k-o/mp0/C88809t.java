package mp0;

import android.content.Context;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.debugger.C81738h0;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import lp0.C88620b;
import p910lj.C76701a;

/* renamed from: mp0.t */
public class C88809t implements C88620b<C83928t1> {
    /* renamed from: a */
    public void mo115970a(Context context, C83780d1 d1Var, String str) {
        C83928t1 t1Var = (C83928t1) d1Var;
        if (C81738h0.m100297c()) {
            C81738h0.m100300f(false);
            C76701a.makeText(context, (CharSequence) "Disable success, please restart WeChat to take effect.", 1).show();
            return;
        }
        C81738h0.m100300f(true);
        C76701a.makeText(context, (CharSequence) "Enable success, please restart WeChat to take effect.", 1).show();
    }

    /* renamed from: b */
    public String mo115971b(Context context, C83780d1 d1Var, String str) {
        C83928t1 t1Var = (C83928t1) d1Var;
        return C81738h0.m100297c() ? "Disable Preload" : "Enable Preload";
    }

    /* renamed from: c */
    public boolean mo115972c(Context context, C83780d1 d1Var, String str) {
        C83928t1 t1Var = (C83928t1) d1Var;
        if (t1Var.getRuntime() instanceof AppBrandRuntimeWC) {
            AppBrandRuntimeWC J1 = t1Var.getRuntime();
            return J1.mo121254q1() && J1.mo113215r1();
        }
    }
}
