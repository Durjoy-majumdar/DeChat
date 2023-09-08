package p1130l;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;
import p1164y2.C112383b;
import p849e3.C107170b;
import p990k.C108783b;

/* renamed from: l.d */
public class C109059d extends C109057b<C112383b> implements MenuItem {

    /* renamed from: h */
    public Method f326625h;

    /* renamed from: l.d$a */
    public class C109060a extends C107170b {

        /* renamed from: d */
        public final ActionProvider f326626d;

        public C109060a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f326626d = actionProvider;
        }

        /* renamed from: a */
        public boolean mo157613a() {
            return this.f326626d.hasSubMenu();
        }

        /* renamed from: c */
        public View mo157615c() {
            return this.f326626d.onCreateActionView();
        }

        /* renamed from: e */
        public boolean mo157617e() {
            return this.f326626d.onPerformDefaultAction();
        }

        /* renamed from: f */
        public void mo157618f(SubMenu subMenu) {
            this.f326626d.onPrepareSubMenu(C109059d.this.mo160221d(subMenu));
        }
    }

    /* renamed from: l.d$b */
    public static class C109061b extends FrameLayout implements C108783b {

        /* renamed from: d */
        public final CollapsibleActionView f326628d;

        public C109061b(View view) {
            super(view.getContext());
            this.f326628d = (CollapsibleActionView) view;
            addView(view);
        }

        /* renamed from: a */
        public void mo144099a() {
            this.f326628d.onActionViewCollapsed();
        }

        /* renamed from: b */
        public void mo144100b() {
            this.f326628d.onActionViewExpanded();
        }
    }

    /* renamed from: l.d$c */
    public class C109062c extends C109058c<MenuItem.OnActionExpandListener> implements MenuItem.OnActionExpandListener {
        public C109062c(MenuItem.OnActionExpandListener onActionExpandListener) {
            super(onActionExpandListener);
        }

        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return ((MenuItem.OnActionExpandListener) this.f326624d).onMenuItemActionCollapse(C109059d.this.mo160220c(menuItem));
        }

        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return ((MenuItem.OnActionExpandListener) this.f326624d).onMenuItemActionExpand(C109059d.this.mo160220c(menuItem));
        }
    }

    /* renamed from: l.d$d */
    public class C109063d extends C109058c<MenuItem.OnMenuItemClickListener> implements MenuItem.OnMenuItemClickListener {
        public C109063d(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            super(onMenuItemClickListener);
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return ((MenuItem.OnMenuItemClickListener) this.f326624d).onMenuItemClick(C109059d.this.mo160220c(menuItem));
        }
    }

    public C109059d(Context context, C112383b bVar) {
        super(context, bVar);
    }

    public boolean collapseActionView() {
        return ((C112383b) this.f326624d).collapseActionView();
    }

    /* renamed from: e */
    public C109060a mo160223e(ActionProvider actionProvider) {
        return new C109060a(this.f326621e, actionProvider);
    }

    public boolean expandActionView() {
        return ((C112383b) this.f326624d).expandActionView();
    }

    public ActionProvider getActionProvider() {
        C107170b a = ((C112383b) this.f326624d).mo143635a();
        if (a instanceof C109060a) {
            return ((C109060a) a).f326626d;
        }
        return null;
    }

    public View getActionView() {
        View actionView = ((C112383b) this.f326624d).getActionView();
        return actionView instanceof C109061b ? (View) ((C109061b) actionView).f326628d : actionView;
    }

    public int getAlphabeticModifiers() {
        return ((C112383b) this.f326624d).getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return ((C112383b) this.f326624d).getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return ((C112383b) this.f326624d).getContentDescription();
    }

    public int getGroupId() {
        return ((C112383b) this.f326624d).getGroupId();
    }

    public Drawable getIcon() {
        return ((C112383b) this.f326624d).getIcon();
    }

    public ColorStateList getIconTintList() {
        return ((C112383b) this.f326624d).getIconTintList();
    }

    public PorterDuff.Mode getIconTintMode() {
        return ((C112383b) this.f326624d).getIconTintMode();
    }

    public Intent getIntent() {
        return ((C112383b) this.f326624d).getIntent();
    }

    public int getItemId() {
        return ((C112383b) this.f326624d).getItemId();
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return ((C112383b) this.f326624d).getMenuInfo();
    }

    public int getNumericModifiers() {
        return ((C112383b) this.f326624d).getNumericModifiers();
    }

    public char getNumericShortcut() {
        return ((C112383b) this.f326624d).getNumericShortcut();
    }

    public int getOrder() {
        return ((C112383b) this.f326624d).getOrder();
    }

    public SubMenu getSubMenu() {
        return mo160221d(((C112383b) this.f326624d).getSubMenu());
    }

    public CharSequence getTitle() {
        return ((C112383b) this.f326624d).getTitle();
    }

    public CharSequence getTitleCondensed() {
        return ((C112383b) this.f326624d).getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return ((C112383b) this.f326624d).getTooltipText();
    }

    public boolean hasSubMenu() {
        return ((C112383b) this.f326624d).hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return ((C112383b) this.f326624d).isActionViewExpanded();
    }

    public boolean isCheckable() {
        return ((C112383b) this.f326624d).isCheckable();
    }

    public boolean isChecked() {
        return ((C112383b) this.f326624d).isChecked();
    }

    public boolean isEnabled() {
        return ((C112383b) this.f326624d).isEnabled();
    }

    public boolean isVisible() {
        return ((C112383b) this.f326624d).isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        ((C112383b) this.f326624d).mo143636b(actionProvider != null ? mo160223e(actionProvider) : null);
        return this;
    }

    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C109061b(view);
        }
        ((C112383b) this.f326624d).setActionView(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        ((C112383b) this.f326624d).setAlphabeticShortcut(c);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        ((C112383b) this.f326624d).setCheckable(z);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        ((C112383b) this.f326624d).setChecked(z);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        ((C112383b) this.f326624d).setContentDescription(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        ((C112383b) this.f326624d).setEnabled(z);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        ((C112383b) this.f326624d).setIcon(drawable);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        ((C112383b) this.f326624d).setIconTintList(colorStateList);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        ((C112383b) this.f326624d).setIconTintMode(mode);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        ((C112383b) this.f326624d).setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        ((C112383b) this.f326624d).setNumericShortcut(c);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        ((C112383b) this.f326624d).setOnActionExpandListener(onActionExpandListener != null ? new C109062c(onActionExpandListener) : null);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        ((C112383b) this.f326624d).setOnMenuItemClickListener(onMenuItemClickListener != null ? new C109063d(onMenuItemClickListener) : null);
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        ((C112383b) this.f326624d).setShortcut(c, c2);
        return this;
    }

    public void setShowAsAction(int i) {
        ((C112383b) this.f326624d).setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i) {
        ((C112383b) this.f326624d).setShowAsActionFlags(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        ((C112383b) this.f326624d).setTitle(charSequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        ((C112383b) this.f326624d).setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        ((C112383b) this.f326624d).setTooltipText(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        return ((C112383b) this.f326624d).setVisible(z);
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        ((C112383b) this.f326624d).setAlphabeticShortcut(c, i);
        return this;
    }

    public MenuItem setIcon(int i) {
        ((C112383b) this.f326624d).setIcon(i);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        ((C112383b) this.f326624d).setNumericShortcut(c, i);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        ((C112383b) this.f326624d).setShortcut(c, c2, i, i2);
        return this;
    }

    public MenuItem setTitle(int i) {
        ((C112383b) this.f326624d).setTitle(i);
        return this;
    }

    public MenuItem setActionView(int i) {
        ((C112383b) this.f326624d).setActionView(i);
        View actionView = ((C112383b) this.f326624d).getActionView();
        if (actionView instanceof CollapsibleActionView) {
            ((C112383b) this.f326624d).setActionView((View) new C109061b(actionView));
        }
        return this;
    }
}
