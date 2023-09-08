package ve1;

import android.content.Context;
import android.view.View;
import cm1.C55034v;
import di3.C7335d;
import di3.C86312j;
import dp1.C58417y0;
import gy3.C87412m;
import jq3.C60905o;
import zp3.C23555k;

/* renamed from: ve1.a0 */
public final class C14442a0 extends C23555k.C23562d {

    /* renamed from: a */
    public final /* synthetic */ C60905o f40055a;

    /* renamed from: b */
    public final /* synthetic */ C55034v f40056b;

    public C14442a0(C60905o oVar, C55034v vVar) {
        this.f40055a = oVar;
        this.f40056b = vVar;
    }

    /* renamed from: a */
    public long mo52a(View view) {
        C87412m.m108594g(view, "view");
        return this.f40056b.f154508w.field_id;
    }

    /* renamed from: b */
    public void mo53b(View view, long j, long j2, boolean z) {
        C87412m.m108594g(view, "view");
        if (z) {
            C7335d c = C86312j.m106911c(C58417y0.class);
            C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
            Context context = this.f40055a.f173499A;
            C87412m.m108593f(context, "holder.context");
            C58417y0.Iy0((C58417y0) c, context, false, false, 1, false, 22, (Object) null);
        }
    }
}
