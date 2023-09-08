package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.widget.LinearLayout;
import p1115h.C107922a;
import p1162x2.C112019a;
import p1164y2.C112383b;
import p849e3.C107170b;

/* renamed from: androidx.appcompat.view.menu.g */
public final class C103452g implements C112383b {

    /* renamed from: A */
    public boolean f305258A = false;

    /* renamed from: B */
    public boolean f305259B = false;

    /* renamed from: C */
    public boolean f305260C = false;

    /* renamed from: D */
    public int f305261D = 16;

    /* renamed from: E */
    public int f305262E;

    /* renamed from: F */
    public View f305263F;

    /* renamed from: G */
    public C107170b f305264G;

    /* renamed from: H */
    public MenuItem.OnActionExpandListener f305265H;

    /* renamed from: I */
    public boolean f305266I = false;

    /* renamed from: d */
    public final int f305267d;

    /* renamed from: e */
    public final int f305268e;

    /* renamed from: f */
    public final int f305269f;

    /* renamed from: g */
    public final int f305270g;

    /* renamed from: h */
    public CharSequence f305271h;

    /* renamed from: i */
    public CharSequence f305272i;

    /* renamed from: j */
    public Intent f305273j;

    /* renamed from: n */
    public char f305274n;

    /* renamed from: o */
    public int f305275o = 4096;

    /* renamed from: p */
    public char f305276p;

    /* renamed from: q */
    public int f305277q = 4096;

    /* renamed from: r */
    public Drawable f305278r;

    /* renamed from: s */
    public int f305279s = 0;

    /* renamed from: t */
    public C103448e f305280t;

    /* renamed from: u */
    public C103463l f305281u;

    /* renamed from: v */
    public MenuItem.OnMenuItemClickListener f305282v;

    /* renamed from: w */
    public CharSequence f305283w;

    /* renamed from: x */
    public CharSequence f305284x;

    /* renamed from: y */
    public ColorStateList f305285y = null;

    /* renamed from: z */
    public PorterDuff.Mode f305286z = null;

    /* renamed from: androidx.appcompat.view.menu.g$a */
    public class C103453a implements C107170b.C107172b {
        public C103453a() {
        }
    }

    public C103452g(C103448e eVar, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f305280t = eVar;
        this.f305267d = i2;
        this.f305268e = i;
        this.f305269f = i3;
        this.f305270g = i4;
        this.f305271h = charSequence;
        this.f305262E = i5;
    }

    /* renamed from: c */
    public static void m137351c(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    /* renamed from: a */
    public C107170b mo143635a() {
        return this.f305264G;
    }

    /* renamed from: b */
    public C112383b mo143636b(C107170b bVar) {
        C107170b bVar2 = this.f305264G;
        if (bVar2 != null) {
            bVar2.f320760c = null;
            bVar2.f320759b = null;
        }
        this.f305263F = null;
        this.f305264G = bVar;
        this.f305280t.mo143611p(true);
        C107170b bVar3 = this.f305264G;
        if (bVar3 != null) {
            bVar3.mo157620h(new C103453a());
        }
        return this;
    }

    public boolean collapseActionView() {
        if ((this.f305262E & 8) == 0) {
            return false;
        }
        if (this.f305263F == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f305265H;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f305280t.mo143595d(this);
        }
        return false;
    }

    /* renamed from: d */
    public final Drawable mo143638d(Drawable drawable) {
        if (drawable != null && this.f305260C && (this.f305258A || this.f305259B)) {
            drawable = C112019a.m152749g(drawable).mutate();
            if (this.f305258A) {
                drawable.setTintList(this.f305285y);
            }
            if (this.f305259B) {
                drawable.setTintMode(this.f305286z);
            }
            this.f305260C = false;
        }
        return drawable;
    }

    /* renamed from: e */
    public boolean mo143639e() {
        C107170b bVar;
        if ((this.f305262E & 8) == 0) {
            return false;
        }
        if (this.f305263F == null && (bVar = this.f305264G) != null) {
            this.f305263F = bVar.mo157616d(this);
        }
        return this.f305263F != null;
    }

    public boolean expandActionView() {
        if (!mo143639e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f305265H;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f305280t.mo143597f(this);
        }
        return false;
    }

    /* renamed from: f */
    public void mo143641f(boolean z) {
        this.f305261D = (z ? 4 : 0) | (this.f305261D & -5);
    }

    /* renamed from: g */
    public void mo143642g(boolean z) {
        if (z) {
            this.f305261D |= 32;
        } else {
            this.f305261D &= -33;
        }
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public View getActionView() {
        View view = this.f305263F;
        if (view != null) {
            return view;
        }
        C107170b bVar = this.f305264G;
        if (bVar == null) {
            return null;
        }
        View d = bVar.mo157616d(this);
        this.f305263F = d;
        return d;
    }

    public int getAlphabeticModifiers() {
        return this.f305277q;
    }

    public char getAlphabeticShortcut() {
        return this.f305276p;
    }

    public CharSequence getContentDescription() {
        return this.f305283w;
    }

    public int getGroupId() {
        return this.f305268e;
    }

    public Drawable getIcon() {
        Drawable drawable = this.f305278r;
        if (drawable != null) {
            return mo143638d(drawable);
        }
        int i = this.f305279s;
        if (i == 0) {
            return null;
        }
        Drawable b = C107922a.m146228b(this.f305280t.f305235d, i);
        this.f305279s = 0;
        this.f305278r = b;
        return mo143638d(b);
    }

    public ColorStateList getIconTintList() {
        return this.f305285y;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f305286z;
    }

    public Intent getIntent() {
        return this.f305273j;
    }

    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f305267d;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public int getNumericModifiers() {
        return this.f305275o;
    }

    public char getNumericShortcut() {
        return this.f305274n;
    }

    public int getOrder() {
        return this.f305269f;
    }

    public SubMenu getSubMenu() {
        return this.f305281u;
    }

    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f305271h;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f305272i;
        return charSequence != null ? charSequence : this.f305271h;
    }

    public CharSequence getTooltipText() {
        return this.f305284x;
    }

    public boolean hasSubMenu() {
        return this.f305281u != null;
    }

    public boolean isActionViewExpanded() {
        return this.f305266I;
    }

    public boolean isCheckable() {
        return (this.f305261D & 1) == 1;
    }

    public boolean isChecked() {
        return (this.f305261D & 2) == 2;
    }

    public boolean isEnabled() {
        return (this.f305261D & 16) != 0;
    }

    public boolean isVisible() {
        C107170b bVar = this.f305264G;
        return (bVar == null || !bVar.mo157619g()) ? (this.f305261D & 8) == 0 : (this.f305261D & 8) == 0 && this.f305264G.mo157614b();
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public MenuItem setActionView(View view) {
        int i;
        this.f305263F = view;
        this.f305264G = null;
        if (view != null && view.getId() == -1 && (i = this.f305267d) > 0) {
            view.setId(i);
        }
        C103448e eVar = this.f305280t;
        eVar.f305245q = true;
        eVar.mo143611p(true);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        if (this.f305276p == c) {
            return this;
        }
        this.f305276p = Character.toLowerCase(c);
        this.f305280t.mo143611p(false);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        int i = this.f305261D;
        boolean z2 = z | (i & true);
        this.f305261D = z2 ? 1 : 0;
        if (i != z2) {
            this.f305280t.mo143611p(false);
        }
        return this;
    }

    public MenuItem setChecked(boolean z) {
        int i = this.f305261D;
        int i2 = 2;
        if ((i & 4) != 0) {
            C103448e eVar = this.f305280t;
            eVar.getClass();
            int i3 = this.f305268e;
            int size = eVar.f305240i.size();
            eVar.mo143631z();
            for (int i4 = 0; i4 < size; i4++) {
                C103452g gVar = eVar.f305240i.get(i4);
                if (gVar.f305268e == i3) {
                    boolean z2 = true;
                    if (((gVar.f305261D & 4) != 0) && gVar.isCheckable()) {
                        if (gVar != this) {
                            z2 = false;
                        }
                        int i5 = gVar.f305261D;
                        int i6 = (z2 ? 2 : 0) | (i5 & -3);
                        gVar.f305261D = i6;
                        if (i5 != i6) {
                            gVar.f305280t.mo143611p(false);
                        }
                    }
                }
            }
            eVar.mo143630y();
        } else {
            int i7 = i & -3;
            if (!z) {
                i2 = 0;
            }
            int i8 = i2 | i7;
            this.f305261D = i8;
            if (i != i8) {
                this.f305280t.mo143611p(false);
            }
        }
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        if (z) {
            this.f305261D |= 16;
        } else {
            this.f305261D &= -17;
        }
        this.f305280t.mo143611p(false);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f305279s = 0;
        this.f305278r = drawable;
        this.f305260C = true;
        this.f305280t.mo143611p(false);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f305285y = colorStateList;
        this.f305258A = true;
        this.f305260C = true;
        this.f305280t.mo143611p(false);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f305286z = mode;
        this.f305259B = true;
        this.f305260C = true;
        this.f305280t.mo143611p(false);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f305273j = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        if (this.f305274n == c) {
            return this;
        }
        this.f305274n = c;
        this.f305280t.mo143611p(false);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f305265H = onActionExpandListener;
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f305282v = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f305274n = c;
        this.f305276p = Character.toLowerCase(c2);
        this.f305280t.mo143611p(false);
        return this;
    }

    public void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            this.f305262E = i;
            C103448e eVar = this.f305280t;
            eVar.f305245q = true;
            eVar.mo143611p(true);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    public MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f305271h = charSequence;
        this.f305280t.mo143611p(false);
        C103463l lVar = this.f305281u;
        if (lVar != null) {
            lVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f305272i = charSequence;
        this.f305280t.mo143611p(false);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        int i = this.f305261D;
        boolean z2 = false;
        int i2 = (z ? 0 : 8) | (i & -9);
        this.f305261D = i2;
        if (i != i2) {
            z2 = true;
        }
        if (z2) {
            C103448e eVar = this.f305280t;
            eVar.f305242n = true;
            eVar.mo143611p(true);
        }
        return this;
    }

    public String toString() {
        CharSequence charSequence = this.f305271h;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public C112383b setContentDescription(CharSequence charSequence) {
        this.f305283w = charSequence;
        this.f305280t.mo143611p(false);
        return this;
    }

    public C112383b setTooltipText(CharSequence charSequence) {
        this.f305284x = charSequence;
        this.f305280t.mo143611p(false);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f305276p == c && this.f305277q == i) {
            return this;
        }
        this.f305276p = Character.toLowerCase(c);
        this.f305277q = KeyEvent.normalizeMetaState(i);
        this.f305280t.mo143611p(false);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        if (this.f305274n == c && this.f305275o == i) {
            return this;
        }
        this.f305274n = c;
        this.f305275o = KeyEvent.normalizeMetaState(i);
        this.f305280t.mo143611p(false);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f305274n = c;
        this.f305275o = KeyEvent.normalizeMetaState(i);
        this.f305276p = Character.toLowerCase(c2);
        this.f305277q = KeyEvent.normalizeMetaState(i2);
        this.f305280t.mo143611p(false);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f305278r = null;
        this.f305279s = i;
        this.f305260C = true;
        this.f305280t.mo143611p(false);
        return this;
    }

    public MenuItem setTitle(int i) {
        setTitle((CharSequence) this.f305280t.f305235d.getString(i));
        return this;
    }

    public MenuItem setActionView(int i) {
        int i2;
        Context context = this.f305280t.f305235d;
        View inflate = LayoutInflater.from(context).inflate(i, new LinearLayout(context), false);
        this.f305263F = inflate;
        this.f305264G = null;
        if (inflate != null && inflate.getId() == -1 && (i2 = this.f305267d) > 0) {
            inflate.setId(i2);
        }
        C103448e eVar = this.f305280t;
        eVar.f305245q = true;
        eVar.mo143611p(true);
        return this;
    }
}
