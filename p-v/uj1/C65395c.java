package uj1;

import android.view.MenuItem;
import gy3.C87412m;
import nj3.C11184p0;
import rp1.C63486a;
import te3.C51059r51;

/* renamed from: uj1.c */
public final class C65395c implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C65374a f188200d;

    /* renamed from: e */
    public final /* synthetic */ C51059r51 f188201e;

    public C65395c(C65374a aVar, C51059r51 r512) {
        this.f188200d = aVar;
        this.f188201e = r512;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        int itemId = menuItem.getItemId();
        C65374a aVar = this.f188200d;
        if (itemId == aVar.f188175t) {
            C63486a aVar2 = aVar.f188163e;
            if (aVar2 != null) {
                aVar2.mo87861t2(this.f188201e);
            } else {
                C87412m.m108603p("presenter");
                throw null;
            }
        }
    }
}
