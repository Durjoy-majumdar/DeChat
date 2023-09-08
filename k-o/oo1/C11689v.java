package oo1;

import android.view.View;
import bl3.C39818r;
import di3.C7335d;
import di3.C86312j;
import dp1.C58417y0;
import fe1.C58969q;
import gy3.C87412m;
import rs1.C13442s8;
import te3.C64284cg;
import zp3.C23555k;

/* renamed from: oo1.v */
public final class C11689v extends C23555k.C23562d {

    /* renamed from: a */
    public final /* synthetic */ C58969q f34239a;

    /* renamed from: b */
    public final /* synthetic */ C64284cg f34240b;

    /* renamed from: c */
    public final /* synthetic */ C11684u f34241c;

    public C11689v(C58969q qVar, C64284cg cgVar, C11684u uVar) {
        this.f34239a = qVar;
        this.f34240b = cgVar;
        this.f34241c = uVar;
    }

    /* renamed from: b */
    public void mo53b(View view, long j, long j2, boolean z) {
        C87412m.m108594g(view, "view");
        if (z) {
            C7335d c = C86312j.m106911c(C58417y0.class);
            C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
            C58417y0 y0Var = (C58417y0) c;
            C58969q qVar = this.f34239a;
            String username = qVar != null ? qVar.getUsername() : "";
            String str = this.f34240b.f182468d;
            y0Var.xy0(3, username, str == null ? "" : str, "", ((C13442s8) C39818r.f106831a.mo62444c(this.f34241c.f34231a).mo75002a(C13442s8.class)).mo12861q3());
        }
    }
}
