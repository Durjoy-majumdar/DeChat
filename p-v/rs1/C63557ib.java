package rs1;

import android.view.MenuItem;

/* renamed from: rs1.ib */
public final class C63557ib implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ C63560jb f180248d;

    public C63557ib(C63560jb jbVar) {
        this.f180248d = jbVar;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        this.f180248d.getActivity().finish();
        return true;
    }
}
