package p1130l;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p1162x2.C112019a;
import p1164y2.C112383b;
import p385u2.C111105a;
import p849e3.C107170b;

/* renamed from: l.a */
public class C109056a implements C112383b {

    /* renamed from: d */
    public CharSequence f326605d;

    /* renamed from: e */
    public CharSequence f326606e;

    /* renamed from: f */
    public Intent f326607f;

    /* renamed from: g */
    public char f326608g;

    /* renamed from: h */
    public int f326609h = 4096;

    /* renamed from: i */
    public char f326610i;

    /* renamed from: j */
    public int f326611j = 4096;

    /* renamed from: n */
    public Drawable f326612n;

    /* renamed from: o */
    public Context f326613o;

    /* renamed from: p */
    public CharSequence f326614p;

    /* renamed from: q */
    public CharSequence f326615q;

    /* renamed from: r */
    public ColorStateList f326616r = null;

    /* renamed from: s */
    public PorterDuff.Mode f326617s = null;

    /* renamed from: t */
    public boolean f326618t = false;

    /* renamed from: u */
    public boolean f326619u = false;

    /* renamed from: v */
    public int f326620v = 16;

    public C109056a(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.f326613o = context;
        this.f326605d = charSequence;
    }

    /* renamed from: a */
    public C107170b mo143635a() {
        return null;
    }

    /* renamed from: b */
    public C112383b mo143636b(C107170b bVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public final void mo160186c() {
        Drawable drawable = this.f326612n;
        if (drawable == null) {
            return;
        }
        if (this.f326618t || this.f326619u) {
            Drawable g = C112019a.m152749g(drawable);
            this.f326612n = g;
            Drawable mutate = g.mutate();
            this.f326612n = mutate;
            if (this.f326618t) {
                mutate.setTintList(this.f326616r);
            }
            if (this.f326619u) {
                this.f326612n.setTintMode(this.f326617s);
            }
        }
    }

    public boolean collapseActionView() {
        return false;
    }

    public boolean expandActionView() {
        return false;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public View getActionView() {
        return null;
    }

    public int getAlphabeticModifiers() {
        return this.f326611j;
    }

    public char getAlphabeticShortcut() {
        return this.f326610i;
    }

    public CharSequence getContentDescription() {
        return this.f326614p;
    }

    public int getGroupId() {
        return 0;
    }

    public Drawable getIcon() {
        return this.f326612n;
    }

    public ColorStateList getIconTintList() {
        return this.f326616r;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f326617s;
    }

    public Intent getIntent() {
        return this.f326607f;
    }

    public int getItemId() {
        return 16908332;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public int getNumericModifiers() {
        return this.f326609h;
    }

    public char getNumericShortcut() {
        return this.f326608g;
    }

    public int getOrder() {
        return 0;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.f326605d;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f326606e;
        return charSequence != null ? charSequence : this.f326605d;
    }

    public CharSequence getTooltipText() {
        return this.f326615q;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isActionViewExpanded() {
        return false;
    }

    public boolean isCheckable() {
        return (this.f326620v & 1) != 0;
    }

    public boolean isChecked() {
        return (this.f326620v & 2) != 0;
    }

    public boolean isEnabled() {
        return (this.f326620v & 16) != 0;
    }

    public boolean isVisible() {
        return (this.f326620v & 8) == 0;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.f326610i = Character.toLowerCase(c);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f326620v = z | (this.f326620v & true) ? 1 : 0;
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.f326620v = (z ? 2 : 0) | (this.f326620v & -3);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f326614p = charSequence;
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f326620v = (z ? 16 : 0) | (this.f326620v & -17);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f326612n = drawable;
        mo160186c();
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f326616r = colorStateList;
        this.f326618t = true;
        mo160186c();
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f326617s = mode;
        this.f326619u = true;
        mo160186c();
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f326607f = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.f326608g = c;
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f326608g = c;
        this.f326610i = Character.toLowerCase(c2);
        return this;
    }

    public void setShowAsAction(int i) {
    }

    public MenuItem setShowAsActionFlags(int i) {
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f326605d = charSequence;
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f326606e = charSequence;
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f326615q = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean z) {
        int i = 8;
        int i2 = this.f326620v & 8;
        if (z) {
            i = 0;
        }
        this.f326620v = i2 | i;
        return this;
    }

    public MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f326610i = Character.toLowerCase(c);
        this.f326611j = KeyEvent.normalizeMetaState(i);
        return this;
    }

    /* renamed from: setContentDescription  reason: collision with other method in class */
    public C112383b m168899setContentDescription(CharSequence charSequence) {
        this.f326614p = charSequence;
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        this.f326608g = c;
        this.f326609h = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public MenuItem setTitle(int i) {
        this.f326605d = this.f326613o.getResources().getString(i);
        return this;
    }

    /* renamed from: setTooltipText  reason: collision with other method in class */
    public C112383b m168900setTooltipText(CharSequence charSequence) {
        this.f326615q = charSequence;
        return this;
    }

    public MenuItem setIcon(int i) {
        Context context = this.f326613o;
        Object obj = C111105a.f332697a;
        this.f326612n = C111105a.C111110c.m151511b(context, i);
        mo160186c();
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f326608g = c;
        this.f326609h = KeyEvent.normalizeMetaState(i);
        this.f326610i = Character.toLowerCase(c2);
        this.f326611j = KeyEvent.normalizeMetaState(i2);
        return this;
    }
}
