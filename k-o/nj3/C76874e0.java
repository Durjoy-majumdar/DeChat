package nj3;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: nj3.e0 */
public class C76874e0 implements ContextMenu {

    /* renamed from: d */
    public List<MenuItem> f224704d = new ArrayList();

    /* renamed from: e */
    public CharSequence f224705e;

    /* renamed from: f */
    public Context f224706f;

    public C76874e0(Context context) {
        this.f224706f = context;
    }

    /* renamed from: a */
    public MenuItem mo107125a(int i, int i2) {
        C76875f0 f0Var = new C76875f0(this.f224706f, i, 0);
        f0Var.f224723r = i2;
        ((ArrayList) this.f224704d).add(f0Var);
        return f0Var;
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        C76875f0 f0Var = new C76875f0(this.f224706f, i2, i);
        f0Var.f224723r = i4;
        ((ArrayList) this.f224704d).add(f0Var);
        return f0Var;
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        return 0;
    }

    public SubMenu addSubMenu(int i) {
        return null;
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return null;
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return null;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return null;
    }

    /* renamed from: b */
    public MenuItem mo107135b(int i, int i2, int i3) {
        C76875f0 f0Var = new C76875f0(this.f224706f, i, 0);
        f0Var.f224723r = i2;
        f0Var.setIcon(i3);
        ((ArrayList) this.f224704d).add(f0Var);
        return f0Var;
    }

    /* renamed from: c */
    public MenuItem mo107136c(int i, int i2, int i3, CharSequence charSequence, int i4) {
        C76875f0 f0Var = new C76875f0(this.f224706f, i2, i);
        f0Var.f224717i = charSequence;
        f0Var.setIcon(i4);
        ((ArrayList) this.f224704d).add(f0Var);
        return f0Var;
    }

    public void clear() {
        Iterator it = ((ArrayList) this.f224704d).iterator();
        while (it.hasNext()) {
            C76875f0 f0Var = (C76875f0) ((MenuItem) it.next());
            f0Var.f224728w = null;
            f0Var.f224729x = null;
        }
        ((ArrayList) this.f224704d).clear();
        this.f224705e = null;
    }

    public void clearHeader() {
    }

    public void close() {
    }

    /* renamed from: d */
    public MenuItem mo107140d(int i, int i2, CharSequence charSequence) {
        C76875f0 f0Var = new C76875f0(this.f224706f, i, 0);
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new ForegroundColorSpan(i2), 0, spannableString.length(), 0);
        f0Var.f224717i = spannableString;
        ((ArrayList) this.f224704d).add(f0Var);
        return f0Var;
    }

    /* renamed from: e */
    public MenuItem mo107141e(int i, int i2, CharSequence charSequence, int i3, int i4, boolean z) {
        C76875f0 f0Var = new C76875f0(this.f224706f, i, 0);
        f0Var.f224717i = charSequence;
        f0Var.mo107179d(i3, i4);
        f0Var.f224722q = z;
        ((ArrayList) this.f224704d).add(i2, f0Var);
        return f0Var;
    }

    /* renamed from: f */
    public MenuItem mo107142f(int i, CharSequence charSequence) {
        C76875f0 f0Var = new C76875f0(this.f224706f, i, 0);
        f0Var.f224717i = charSequence;
        ((ArrayList) this.f224704d).add(f0Var);
        return f0Var;
    }

    public MenuItem findItem(int i) {
        Iterator it = ((ArrayList) this.f224704d).iterator();
        while (it.hasNext()) {
            MenuItem menuItem = (MenuItem) it.next();
            if (menuItem.getItemId() == i) {
                return menuItem;
            }
        }
        return null;
    }

    /* renamed from: g */
    public MenuItem mo107144g(int i, CharSequence charSequence, int i2) {
        C76875f0 f0Var = new C76875f0(this.f224706f, i, 0);
        f0Var.f224717i = charSequence;
        f0Var.setIcon(i2);
        ((ArrayList) this.f224704d).add(f0Var);
        return f0Var;
    }

    public MenuItem getItem(int i) {
        return (MenuItem) ((ArrayList) this.f224704d).get(i);
    }

    /* renamed from: h */
    public MenuItem mo107146h(int i, CharSequence charSequence, int i2, int i3) {
        C76875f0 f0Var = new C76875f0(this.f224706f, i, 0);
        f0Var.f224717i = charSequence;
        f0Var.mo107179d(i2, i3);
        ((ArrayList) this.f224704d).add(f0Var);
        return f0Var;
    }

    public boolean hasVisibleItems() {
        return false;
    }

    /* renamed from: i */
    public MenuItem mo107148i(int i, CharSequence charSequence, int i2, int i3, int i4) {
        C76875f0 f0Var = new C76875f0(this.f224706f, i, 0);
        f0Var.f224717i = charSequence;
        f0Var.f224718j = i2;
        f0Var.mo107179d(i3, i4);
        ((ArrayList) this.f224704d).add(f0Var);
        return f0Var;
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: j */
    public MenuItem mo107150j(int i, CharSequence charSequence, int i2, int i3, boolean z) {
        C76875f0 f0Var = new C76875f0(this.f224706f, i, 0);
        f0Var.f224717i = charSequence;
        f0Var.mo107179d(i2, i3);
        f0Var.f224722q = z;
        ((ArrayList) this.f224704d).add(f0Var);
        return f0Var;
    }

    /* renamed from: k */
    public MenuItem mo107151k(int i, CharSequence charSequence, int i2, boolean z) {
        C76875f0 f0Var = new C76875f0(this.f224706f, i, 0);
        f0Var.f224717i = charSequence;
        f0Var.setIcon(i2);
        f0Var.f224722q = z;
        ((ArrayList) this.f224704d).add(f0Var);
        return f0Var;
    }

    /* renamed from: l */
    public MenuItem mo107152l(int i, CharSequence charSequence, Drawable drawable) {
        C76875f0 f0Var = new C76875f0(this.f224706f, i, 0);
        f0Var.f224717i = charSequence;
        f0Var.setIcon(drawable);
        ((ArrayList) this.f224704d).add(f0Var);
        return f0Var;
    }

    /* renamed from: m */
    public MenuItem mo107153m(int i, CharSequence charSequence, Drawable drawable, int i2) {
        C76875f0 f0Var = new C76875f0(this.f224706f, i, 0);
        f0Var.f224717i = charSequence;
        f0Var.setIcon(drawable);
        f0Var.mo107180e(drawable, i2);
        ((ArrayList) this.f224704d).add(f0Var);
        return f0Var;
    }

    /* renamed from: n */
    public MenuItem mo107154n(int i, CharSequence charSequence, CharSequence charSequence2, int i2) {
        C76875f0 f0Var = new C76875f0(this.f224706f, i, 0);
        f0Var.f224717i = charSequence;
        f0Var.f224721p = charSequence2;
        f0Var.setIcon(i2);
        ((ArrayList) this.f224704d).add(f0Var);
        return f0Var;
    }

    /* renamed from: o */
    public MenuItem mo107155o(int i, CharSequence charSequence, CharSequence charSequence2, int i2, int i3) {
        C76875f0 f0Var = new C76875f0(this.f224706f, i, 0);
        f0Var.f224717i = charSequence;
        f0Var.f224721p = charSequence2;
        f0Var.mo107179d(i2, i3);
        ((ArrayList) this.f224704d).add(f0Var);
        return f0Var;
    }

    /* renamed from: p */
    public MenuItem mo107156p(int i, CharSequence charSequence, CharSequence charSequence2, Drawable drawable, int i2, boolean z) {
        C76875f0 f0Var = new C76875f0(this.f224706f, i, 0);
        f0Var.f224717i = charSequence;
        f0Var.f224721p = charSequence2;
        f0Var.mo107180e(drawable, i2);
        f0Var.f224722q = z;
        ((ArrayList) this.f224704d).add(f0Var);
        return f0Var;
    }

    public boolean performIdentifierAction(int i, int i2) {
        return false;
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return false;
    }

    /* renamed from: q */
    public MenuItem mo107159q(int i, CharSequence charSequence, CharSequence charSequence2, Drawable drawable, boolean z) {
        C76875f0 f0Var = new C76875f0(this.f224706f, i, 0);
        f0Var.f224717i = charSequence;
        f0Var.f224721p = charSequence2;
        f0Var.setIcon(drawable);
        f0Var.f224722q = z;
        ((ArrayList) this.f224704d).add(f0Var);
        return f0Var;
    }

    /* renamed from: r */
    public MenuItem mo107160r(int i, CharSequence charSequence, boolean z) {
        C76875f0 f0Var = new C76875f0(this.f224706f, i, 0);
        f0Var.f224717i = charSequence;
        f0Var.f224722q = z;
        ((ArrayList) this.f224704d).add(f0Var);
        return f0Var;
    }

    public void removeGroup(int i) {
    }

    public void removeItem(int i) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) this.f224704d).iterator();
        while (it.hasNext()) {
            MenuItem menuItem = (MenuItem) it.next();
            if (menuItem.getItemId() == i) {
                arrayList.add(menuItem);
            }
        }
        ((ArrayList) this.f224704d).removeAll(arrayList);
    }

    /* renamed from: s */
    public MenuItem mo107163s(int i, CharSequence charSequence, boolean z, boolean z2) {
        C76875f0 f0Var = new C76875f0(this.f224706f, i, 0);
        f0Var.f224712d = z;
        f0Var.f224713e = z2;
        f0Var.f224717i = charSequence;
        ((ArrayList) this.f224704d).add(f0Var);
        return f0Var;
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
    }

    public void setGroupEnabled(int i, boolean z) {
    }

    public void setGroupVisible(int i, boolean z) {
    }

    public ContextMenu setHeaderIcon(int i) {
        return this;
    }

    public ContextMenu setHeaderIcon(Drawable drawable) {
        return this;
    }

    public ContextMenu setHeaderTitle(int i) {
        String string;
        if (i > 0 && (string = this.f224706f.getString(i)) != null) {
            this.f224705e = string;
        }
        return this;
    }

    public ContextMenu setHeaderView(View view) {
        return this;
    }

    public void setQwertyMode(boolean z) {
    }

    public int size() {
        List<MenuItem> list = this.f224704d;
        if (list == null) {
            return 0;
        }
        return ((ArrayList) list).size();
    }

    /* renamed from: t */
    public MenuItem mo107174t(MenuItem menuItem) {
        if (menuItem == null) {
            return null;
        }
        ((ArrayList) this.f224704d).add(menuItem);
        return null;
    }

    /* renamed from: u */
    public int mo107175u(int i) {
        Iterator it = ((ArrayList) this.f224704d).iterator();
        int i2 = -1;
        while (it.hasNext()) {
            i2++;
            if (((MenuItem) it.next()).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: v */
    public boolean mo107176v() {
        return ((ArrayList) this.f224704d).size() == 0;
    }

    public ContextMenu setHeaderTitle(CharSequence charSequence) {
        if (charSequence == null) {
            return this;
        }
        this.f224705e = charSequence;
        return this;
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        C76875f0 f0Var = new C76875f0(this.f224706f, i2, i);
        f0Var.f224717i = charSequence;
        ((ArrayList) this.f224704d).add(f0Var);
        return f0Var;
    }

    public MenuItem add(int i) {
        C76875f0 f0Var = new C76875f0(this.f224706f, 0, 0);
        f0Var.f224723r = i;
        ((ArrayList) this.f224704d).add(f0Var);
        return f0Var;
    }

    public MenuItem add(CharSequence charSequence) {
        C76875f0 f0Var = new C76875f0(this.f224706f, 0, 0);
        f0Var.f224717i = charSequence;
        ((ArrayList) this.f224704d).add(f0Var);
        return f0Var;
    }
}
