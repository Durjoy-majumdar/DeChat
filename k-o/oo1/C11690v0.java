package oo1;

import android.view.MenuItem;
import nj3.C11184p0;
import oo1.C11614d0;
import qo3.C77407n;

/* renamed from: oo1.v0 */
public final class C11690v0 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C11614d0 f34242d;

    public C11690v0(C11614d0 d0Var) {
        this.f34242d = d0Var;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        if (menuItem.getItemId() == 0) {
            C11614d0.m11397c(this.f34242d, (C11614d0.C11618c) null, 4);
            this.f34242d.mo11525f();
            C11614d0.C11619d dVar = this.f34242d.f34046k;
            if (dVar != null) {
                dVar.notifyDataSetChanged();
            }
            C77407n nVar = this.f34242d.f34050o;
            if (nVar != null) {
                nVar.mo107572p();
            }
        }
    }
}
