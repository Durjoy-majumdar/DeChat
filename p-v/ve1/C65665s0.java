package ve1;

import android.content.Context;
import android.view.View;
import cm1.C55033u;
import di3.C7335d;
import di3.C86312j;
import dp1.C58417y0;
import gy3.C8477a0;
import gy3.C8478d0;
import gy3.C87412m;
import jq3.C60905o;
import zp3.C23555k;

/* renamed from: ve1.s0 */
public final class C65665s0 extends C23555k.C23562d {

    /* renamed from: a */
    public final /* synthetic */ C60905o f188945a;

    /* renamed from: b */
    public final /* synthetic */ C8477a0 f188946b;

    /* renamed from: c */
    public final /* synthetic */ C8478d0 f188947c;

    /* renamed from: d */
    public final /* synthetic */ C55033u f188948d;

    public C65665s0(C60905o oVar, C8477a0 a0Var, C8478d0 d0Var, C55033u uVar) {
        this.f188945a = oVar;
        this.f188946b = a0Var;
        this.f188947c = d0Var;
        this.f188948d = uVar;
    }

    /* renamed from: a */
    public long mo52a(View view) {
        C87412m.m108594g(view, "view");
        return this.f188948d.getItemId();
    }

    /* renamed from: b */
    public void mo53b(View view, long j, long j2, boolean z) {
        C87412m.m108594g(view, "view");
        if (z) {
            C7335d c = C86312j.m106911c(C58417y0.class);
            C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
            Context context = this.f188945a.f173499A;
            C87412m.m108593f(context, "holder.context");
            C58417y0.Iy0((C58417y0) c, context, false, this.f188946b.f27482d, this.f188947c.f27483d, false, 18, (Object) null);
        }
    }
}
