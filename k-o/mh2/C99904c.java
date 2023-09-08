package mh2;

import android.view.MenuItem;
import gy3.C8477a0;
import gy3.C87412m;
import nj3.C11184p0;
import qo3.C77407n;
import th2.C110992d;

/* renamed from: mh2.c */
public final class C99904c implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C8477a0 f292749d;

    /* renamed from: e */
    public final /* synthetic */ C99896a f292750e;

    /* renamed from: f */
    public final /* synthetic */ C77407n f292751f;

    public C99904c(C8477a0 a0Var, C99896a aVar, C77407n nVar) {
        this.f292749d = a0Var;
        this.f292750e = aVar;
        this.f292751f = nVar;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        C87412m.m108594g(menuItem, "menuItem");
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            this.f292749d.f27482d = false;
            this.f292750e.mo139242c();
            C110992d.f332425a.mo162674h(1);
            this.f292751f.mo107572p();
        } else if (itemId == 1) {
            this.f292749d.f27482d = false;
            this.f292750e.mo139244f();
            C110992d.f332425a.mo162674h(2);
            this.f292751f.mo107572p();
        } else if (itemId != 2) {
            this.f292751f.mo107572p();
        } else {
            this.f292749d.f27482d = false;
            this.f292750e.mo139243d();
            C110992d.f332425a.mo162674h(4);
            this.f292751f.mo107572p();
        }
    }
}
