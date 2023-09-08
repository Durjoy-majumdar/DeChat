package p1151s1;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import p1166z0.C112541g;
import rx3.C13598b0;

/* renamed from: s1.c */
public final class C110697c {

    /* renamed from: a */
    public C112541g f331117a;

    /* renamed from: b */
    public C32224a<C13598b0> f331118b;

    /* renamed from: c */
    public C32224a<C13598b0> f331119c;

    /* renamed from: d */
    public C32224a<C13598b0> f331120d;

    /* renamed from: e */
    public C32224a<C13598b0> f331121e;

    public C110697c(C112541g gVar, C32224a<C13598b0> aVar, C32224a<C13598b0> aVar2, C32224a<C13598b0> aVar3, C32224a<C13598b0> aVar4, int i, C8480h hVar) {
        gVar = (i & 1) != 0 ? C112541g.f336960e : gVar;
        aVar = (i & 2) != 0 ? null : aVar;
        aVar2 = (i & 4) != 0 ? null : aVar2;
        aVar3 = (i & 8) != 0 ? null : aVar3;
        aVar4 = (i & 16) != 0 ? null : aVar4;
        C87412m.m108594g(gVar, "rect");
        this.f331117a = gVar;
        this.f331118b = aVar;
        this.f331119c = aVar2;
        this.f331120d = aVar3;
        this.f331121e = aVar4;
    }

    /* renamed from: a */
    public final boolean mo162249a(ActionMode actionMode, MenuItem menuItem) {
        C87412m.m108591d(menuItem);
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            C32224a<C13598b0> aVar = this.f331118b;
            if (aVar != null) {
                aVar.invoke();
            }
        } else if (itemId == 1) {
            C32224a<C13598b0> aVar2 = this.f331119c;
            if (aVar2 != null) {
                aVar2.invoke();
            }
        } else if (itemId == 2) {
            C32224a<C13598b0> aVar3 = this.f331120d;
            if (aVar3 != null) {
                aVar3.invoke();
            }
        } else if (itemId != 3) {
            return false;
        } else {
            C32224a<C13598b0> aVar4 = this.f331121e;
            if (aVar4 != null) {
                aVar4.invoke();
            }
        }
        if (actionMode != null) {
            actionMode.finish();
        }
        return true;
    }

    /* renamed from: b */
    public final boolean mo162250b(ActionMode actionMode, Menu menu) {
        if (menu == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        } else if (actionMode != null) {
            if (this.f331118b != null) {
                menu.add(0, 0, 0, 17039361).setShowAsAction(1);
            }
            if (this.f331119c != null) {
                menu.add(0, 1, 1, 17039371).setShowAsAction(1);
            }
            if (this.f331120d != null) {
                menu.add(0, 2, 2, 17039363).setShowAsAction(1);
            }
            if (this.f331121e != null) {
                menu.add(0, 3, 3, 17039373).setShowAsAction(1);
            }
            return true;
        } else {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }
}
