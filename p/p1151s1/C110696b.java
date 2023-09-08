package p1151s1;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import gy3.C87412m;

/* renamed from: s1.b */
public final class C110696b implements ActionMode.Callback {

    /* renamed from: a */
    public final C110697c f331116a;

    public C110696b(C110697c cVar) {
        C87412m.m108594g(cVar, "callback");
        this.f331116a = cVar;
    }

    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.f331116a.mo162249a(actionMode, menuItem);
    }

    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        this.f331116a.mo162250b(actionMode, menu);
        return true;
    }

    public void onDestroyActionMode(ActionMode actionMode) {
        this.f331116a.getClass();
    }

    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        this.f331116a.getClass();
        return false;
    }
}
