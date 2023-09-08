package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.C103452g;
import androidx.appcompat.view.menu.C103458j;
import androidx.appcompat.widget.C103542j0;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.C103733h;
import com.tencent.p014mm.C0966R;
import java.util.WeakHashMap;
import p1050v2.C111325g;
import p1108f3.C107453d;
import p1162x2.C112019a;
import p849e3.C107166a;
import p849e3.C107168a0;
import p849e3.C107207u;

public class NavigationMenuItemView extends ForegroundLinearLayout implements C103458j.C103459a {

    /* renamed from: L */
    public static final int[] f309446L = {16842912};

    /* renamed from: B */
    public final int f309447B;

    /* renamed from: C */
    public boolean f309448C;

    /* renamed from: D */
    public boolean f309449D;

    /* renamed from: E */
    public final CheckedTextView f309450E;

    /* renamed from: F */
    public FrameLayout f309451F;

    /* renamed from: G */
    public C103452g f309452G;

    /* renamed from: H */
    public ColorStateList f309453H;

    /* renamed from: I */
    public boolean f309454I;

    /* renamed from: J */
    public Drawable f309455J;

    /* renamed from: K */
    public final C107166a f309456K;

    /* renamed from: com.google.android.material.internal.NavigationMenuItemView$a */
    public class C104461a extends C107166a {
        public C104461a() {
        }

        public void onInitializeAccessibilityNodeInfo(View view, C107453d dVar) {
            super.onInitializeAccessibilityNodeInfo(view, dVar);
            dVar.mo157851k(NavigationMenuItemView.this.f309449D);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f309451F == null) {
                this.f309451F = (FrameLayout) ((ViewStub) findViewById(C0966R.C0970id.c2o)).inflate();
            }
            this.f309451F.removeAllViews();
            this.f309451F.addView(view);
        }
    }

    /* renamed from: d */
    public void mo143501d(C103452g gVar, int i) {
        StateListDrawable stateListDrawable;
        this.f309452G = gVar;
        setVisibility(gVar.isVisible() ? 0 : 8);
        boolean z = true;
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(C0966R.attr.f2732g7, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f309446L, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            C107207u.C107208b.m145189q(this, stateListDrawable);
        }
        setCheckable(gVar.isCheckable());
        setChecked(gVar.isChecked());
        setEnabled(gVar.isEnabled());
        setTitle(gVar.f305271h);
        setIcon(gVar.getIcon());
        setActionView(gVar.getActionView());
        setContentDescription(gVar.f305283w);
        C103542j0.m137612a(this, gVar.f305284x);
        C103452g gVar2 = this.f309452G;
        if (!(gVar2.f305271h == null && gVar2.getIcon() == null && this.f309452G.getActionView() != null)) {
            z = false;
        }
        if (z) {
            this.f309450E.setVisibility(8);
            FrameLayout frameLayout = this.f309451F;
            if (frameLayout != null) {
                LinearLayoutCompat.LayoutParams layoutParams = (LinearLayoutCompat.LayoutParams) frameLayout.getLayoutParams();
                layoutParams.width = -1;
                this.f309451F.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        this.f309450E.setVisibility(0);
        FrameLayout frameLayout2 = this.f309451F;
        if (frameLayout2 != null) {
            LinearLayoutCompat.LayoutParams layoutParams2 = (LinearLayoutCompat.LayoutParams) frameLayout2.getLayoutParams();
            layoutParams2.width = -2;
            this.f309451F.setLayoutParams(layoutParams2);
        }
    }

    public C103452g getItemData() {
        return this.f309452G;
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C103452g gVar = this.f309452G;
        if (gVar != null && gVar.isCheckable() && this.f309452G.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f309446L);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f309449D != z) {
            this.f309449D = z;
            this.f309456K.sendAccessibilityEvent(this.f309450E, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.f309450E.setChecked(z);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, 0, i, 0);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f309454I) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C112019a.m152749g(drawable).mutate();
                drawable.setTintList(this.f309453H);
            }
            int i = this.f309447B;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f309448C) {
            if (this.f309455J == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal<TypedValue> threadLocal = C111325g.f333301a;
                Drawable drawable2 = resources.getDrawable(C0966R.C0969drawable.ak6, theme);
                this.f309455J = drawable2;
                if (drawable2 != null) {
                    int i2 = this.f309447B;
                    drawable2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f309455J;
        }
        this.f309450E.setCompoundDrawablesRelative(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setIconPadding(int i) {
        this.f309450E.setCompoundDrawablePadding(i);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f309453H = colorStateList;
        this.f309454I = colorStateList != null;
        C103452g gVar = this.f309452G;
        if (gVar != null) {
            setIcon(gVar.getIcon());
        }
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f309448C = z;
    }

    public void setTextAppearance(int i) {
        C103733h.m138110g(this.f309450E, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f309450E.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f309450E.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C104461a aVar = new C104461a();
        this.f309456K = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(C0966R.C0971layout.f7134zb, this, true);
        this.f309447B = context.getResources().getDimensionPixelSize(C0966R.dimen.a0u);
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(C0966R.C0970id.c2p);
        this.f309450E = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        C107207u.m145168i(checkedTextView, aVar);
    }
}
