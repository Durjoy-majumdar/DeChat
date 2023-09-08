package p1130l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p1164y2.C112384c;

/* renamed from: l.i */
public class C109069i extends C109067g implements SubMenu {
    public C109069i(Context context, C112384c cVar) {
        super(context, cVar);
    }

    public void clearHeader() {
        ((C112384c) this.f326624d).clearHeader();
    }

    public MenuItem getItem() {
        return mo160220c(((C112384c) this.f326624d).getItem());
    }

    public SubMenu setHeaderIcon(int i) {
        ((C112384c) this.f326624d).setHeaderIcon(i);
        return this;
    }

    public SubMenu setHeaderTitle(int i) {
        ((C112384c) this.f326624d).setHeaderTitle(i);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        ((C112384c) this.f326624d).setHeaderView(view);
        return this;
    }

    public SubMenu setIcon(int i) {
        ((C112384c) this.f326624d).setIcon(i);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        ((C112384c) this.f326624d).setHeaderIcon(drawable);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        ((C112384c) this.f326624d).setHeaderTitle(charSequence);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        ((C112384c) this.f326624d).setIcon(drawable);
        return this;
    }
}
