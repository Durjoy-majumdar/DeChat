package p1151s1;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import gy3.C87412m;
import p1166z0.C112541g;

/* renamed from: s1.a */
public final class C110695a extends ActionMode.Callback2 {

    /* renamed from: a */
    public final C110697c f331115a;

    public C110695a(C110697c cVar) {
        C87412m.m108594g(cVar, "callback");
        this.f331115a = cVar;
    }

    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.f331115a.mo162249a(actionMode, menuItem);
    }

    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        this.f331115a.mo162250b(actionMode, menu);
        return true;
    }

    public void onDestroyActionMode(ActionMode actionMode) {
        this.f331115a.getClass();
    }

    public void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        C112541g gVar = this.f331115a.f331117a;
        if (rect != null) {
            rect.set((int) gVar.f336961a, (int) gVar.f336962b, (int) gVar.f336963c, (int) gVar.f336964d);
        }
    }

    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        this.f331115a.getClass();
        return false;
    }
}
