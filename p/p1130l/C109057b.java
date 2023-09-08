package p1130l;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Map;
import p1042u.C111055b;
import p1164y2.C112383b;
import p1164y2.C112384c;

/* renamed from: l.b */
public abstract class C109057b<T> extends C109058c<T> {

    /* renamed from: e */
    public final Context f326621e;

    /* renamed from: f */
    public Map<C112383b, MenuItem> f326622f;

    /* renamed from: g */
    public Map<C112384c, SubMenu> f326623g;

    public C109057b(Context context, T t) {
        super(t);
        this.f326621e = context;
    }

    /* renamed from: c */
    public final MenuItem mo160220c(MenuItem menuItem) {
        if (!(menuItem instanceof C112383b)) {
            return menuItem;
        }
        C112383b bVar = (C112383b) menuItem;
        if (this.f326622f == null) {
            this.f326622f = new C111055b();
        }
        MenuItem menuItem2 = this.f326622f.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        C109064e eVar = new C109064e(this.f326621e, bVar);
        this.f326622f.put(bVar, eVar);
        return eVar;
    }

    /* renamed from: d */
    public final SubMenu mo160221d(SubMenu subMenu) {
        if (!(subMenu instanceof C112384c)) {
            return subMenu;
        }
        C112384c cVar = (C112384c) subMenu;
        if (this.f326623g == null) {
            this.f326623g = new C111055b();
        }
        SubMenu subMenu2 = this.f326623g.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        C109069i iVar = new C109069i(this.f326621e, cVar);
        this.f326623g.put(cVar, iVar);
        return iVar;
    }
}
