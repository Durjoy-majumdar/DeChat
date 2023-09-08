package nj3;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import com.tencent.p014mm.C0966R;
import qo3.C77425p;

/* renamed from: nj3.f0 */
public class C76875f0 implements MenuItem {

    /* renamed from: A */
    public Context f224707A;

    /* renamed from: B */
    public boolean f224708B = false;

    /* renamed from: C */
    public C76889k0 f224709C = null;

    /* renamed from: D */
    public C76900r0 f224710D = null;

    /* renamed from: E */
    public C76898q0 f224711E = null;

    /* renamed from: d */
    public boolean f224712d;

    /* renamed from: e */
    public boolean f224713e;

    /* renamed from: f */
    public boolean f224714f = false;

    /* renamed from: g */
    public int f224715g;

    /* renamed from: h */
    public int f224716h;

    /* renamed from: i */
    public CharSequence f224717i;

    /* renamed from: j */
    public int f224718j;

    /* renamed from: n */
    public CharSequence f224719n;

    /* renamed from: o */
    public TextUtils.TruncateAt f224720o;

    /* renamed from: p */
    public CharSequence f224721p = null;

    /* renamed from: q */
    public boolean f224722q = false;

    /* renamed from: r */
    public int f224723r;

    /* renamed from: s */
    public int f224724s;

    /* renamed from: t */
    public int f224725t;

    /* renamed from: u */
    public Drawable f224726u;

    /* renamed from: v */
    public boolean f224727v = true;

    /* renamed from: w */
    public ContextMenu.ContextMenuInfo f224728w;

    /* renamed from: x */
    public MenuItem.OnMenuItemClickListener f224729x;

    /* renamed from: y */
    public String f224730y;

    /* renamed from: z */
    public Intent f224731z;

    public C76875f0(Context context, int i, int i2) {
        this.f224707A = context;
        this.f224715g = i;
        this.f224716h = i2;
        this.f224725t = context.getResources().getColor(C0966R.color.FG_0);
    }

    /* renamed from: c */
    public boolean mo107177c() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f224729x;
        if (onMenuItemClickListener != null) {
            return onMenuItemClickListener.onMenuItemClick(this);
        }
        return false;
    }

    public boolean collapseActionView() {
        return false;
    }

    /* renamed from: d */
    public MenuItem mo107179d(int i, int i2) {
        this.f224724s = i;
        this.f224725t = i2;
        C76889k0 k0Var = this.f224709C;
        if (k0Var != null) {
            ((C77425p) k0Var).mo107588a(this);
        }
        return this;
    }

    /* renamed from: e */
    public MenuItem mo107180e(Drawable drawable, int i) {
        this.f224726u = drawable;
        this.f224725t = i;
        C76889k0 k0Var = this.f224709C;
        if (k0Var != null) {
            ((C77425p) k0Var).mo107588a(this);
        }
        return this;
    }

    public boolean expandActionView() {
        return false;
    }

    public ActionProvider getActionProvider() {
        return null;
    }

    public View getActionView() {
        return null;
    }

    public char getAlphabeticShortcut() {
        return 0;
    }

    public int getGroupId() {
        return this.f224716h;
    }

    public Drawable getIcon() {
        Context context;
        Drawable drawable = this.f224726u;
        if (drawable != null) {
            return drawable;
        }
        if (this.f224724s == 0 || (context = this.f224707A) == null) {
            return null;
        }
        return context.getResources().getDrawable(this.f224724s);
    }

    public Intent getIntent() {
        return this.f224731z;
    }

    public int getItemId() {
        return this.f224715g;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f224728w;
    }

    public char getNumericShortcut() {
        return 0;
    }

    public int getOrder() {
        return 0;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        Context context;
        CharSequence charSequence = this.f224717i;
        if (charSequence != null) {
            return charSequence;
        }
        int i = this.f224723r;
        if (i == 0 || (context = this.f224707A) == null) {
            return null;
        }
        return context.getString(i);
    }

    public CharSequence getTitleCondensed() {
        return null;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isActionViewExpanded() {
        return false;
    }

    public boolean isCheckable() {
        return false;
    }

    public boolean isChecked() {
        return false;
    }

    public boolean isEnabled() {
        return true;
    }

    public boolean isVisible() {
        return true;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        return null;
    }

    public MenuItem setActionView(int i) {
        return null;
    }

    public MenuItem setActionView(View view) {
        return null;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        return this;
    }

    public MenuItem setChecked(boolean z) {
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f224726u = drawable;
        C76889k0 k0Var = this.f224709C;
        if (k0Var != null) {
            ((C77425p) k0Var).mo107588a(this);
        }
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f224731z = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        return null;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f224729x = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        return this;
    }

    public void setShowAsAction(int i) {
    }

    public MenuItem setShowAsActionFlags(int i) {
        return null;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f224717i = charSequence;
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        return this;
    }

    public MenuItem setVisible(boolean z) {
        return this;
    }

    public MenuItem setTitle(int i) {
        this.f224723r = i;
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f224724s = i;
        C76889k0 k0Var = this.f224709C;
        if (k0Var != null) {
            ((C77425p) k0Var).mo107588a(this);
        }
        return this;
    }
}
