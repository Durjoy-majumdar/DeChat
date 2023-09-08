package mp0;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.performance.AppBrandPerformanceManager;
import js0.C88024r;
import lp0.C88620b;
import p1044ub.C90630c;
import p910lj.C76701a;

/* renamed from: mp0.e */
public class C88798e implements C88620b<C90630c> {
    /* renamed from: a */
    public void mo115970a(Context context, C83780d1 d1Var, String str) {
        C76701a.makeText(context, (int) C0966R.string.f7779rd, 0).show();
        C88024r.m109571a().postToWorker(new C88796d(this, (C90630c) d1Var, context));
    }

    /* renamed from: b */
    public String mo115971b(Context context, C83780d1 d1Var, String str) {
        C90630c cVar = (C90630c) d1Var;
        return context.getString(C0966R.string.f7777rb);
    }

    /* renamed from: c */
    public boolean mo115972c(Context context, C83780d1 d1Var, String str) {
        return AppBrandPerformanceManager.m103497f(((C90630c) d1Var).getRuntime());
    }
}
