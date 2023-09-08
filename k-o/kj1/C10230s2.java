package kj1;

import android.view.MenuItem;
import nj3.C11184p0;

/* renamed from: kj1.s2 */
public final class C10230s2 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C10234t2 f31242d;

    /* renamed from: e */
    public final /* synthetic */ C10125e1 f31243e;

    public C10230s2(C10234t2 t2Var, C10125e1 e1Var) {
        this.f31242d = t2Var;
        this.f31243e = e1Var;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            this.f31242d.mo10571w(this.f31243e);
        } else if (itemId == 2) {
            this.f31242d.mo10570v(this.f31243e);
        }
    }
}
