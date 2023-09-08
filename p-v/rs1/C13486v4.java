package rs1;

import android.content.Intent;
import android.view.MenuItem;
import di3.C86312j;
import er1.C58684b;
import nj3.C11184p0;

/* renamed from: rs1.v4 */
public final class C13486v4 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C13392r4 f38215d;

    public C13486v4(C13392r4 r4Var) {
        this.f38215d = r4Var;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        Intent intent = new Intent();
        intent.putExtra("key_create_scene", 1);
        ((C58684b) C86312j.m106911c(C58684b.class)).mo13297zc(this.f38215d.getActivity(), intent);
    }
}
