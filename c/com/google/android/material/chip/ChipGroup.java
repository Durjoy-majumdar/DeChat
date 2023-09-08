package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.google.android.material.internal.FlowLayout;
import com.tencent.p014mm.C0966R;
import p1114g8.C107764a;
import p1139o8.C109991k;

public class ChipGroup extends FlowLayout {

    /* renamed from: g */
    public int f309282g;

    /* renamed from: h */
    public int f309283h;

    /* renamed from: i */
    public boolean f309284i;

    /* renamed from: j */
    public final C104435b f309285j;

    /* renamed from: n */
    public C104437d f309286n;

    /* renamed from: o */
    public int f309287o;

    /* renamed from: p */
    public boolean f309288p;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$b */
    public class C104435b implements CompoundButton.OnCheckedChangeListener {
        public C104435b(C104434a aVar) {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!ChipGroup.this.f309288p) {
                int id = compoundButton.getId();
                if (z) {
                    ChipGroup chipGroup = ChipGroup.this;
                    int i = chipGroup.f309287o;
                    if (!(i == -1 || i == id || !chipGroup.f309284i)) {
                        chipGroup.mo146586b(i, false);
                    }
                    ChipGroup.this.setCheckedId(id);
                    return;
                }
                ChipGroup chipGroup2 = ChipGroup.this;
                if (chipGroup2.f309287o == id) {
                    chipGroup2.setCheckedId(-1);
                }
            }
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$c */
    public interface C104436c {
        /* renamed from: a */
        void mo146612a(ChipGroup chipGroup, int i);
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$d */
    public class C104437d implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: d */
        public ViewGroup.OnHierarchyChangeListener f309290d;

        public C104437d(C104434a aVar) {
        }

        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(View.generateViewId());
                }
                ((Chip) view2).setOnCheckedChangeListenerInternal(ChipGroup.this.f309285j);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f309290d;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                ((Chip) view2).setOnCheckedChangeListenerInternal((CompoundButton.OnCheckedChangeListener) null);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f309290d;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0966R.attr.f2708es);
    }

    /* access modifiers changed from: private */
    public void setCheckedId(int i) {
        this.f309287o = i;
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int i2 = this.f309287o;
                if (i2 != -1 && this.f309284i) {
                    mo146586b(i2, false);
                }
                setCheckedId(chip.getId());
            }
        }
        super.addView(view, i, layoutParams);
    }

    /* renamed from: b */
    public final void mo146586b(int i, boolean z) {
        View findViewById = findViewById(i);
        if (findViewById instanceof Chip) {
            this.f309288p = true;
            ((Chip) findViewById).setChecked(z);
            this.f309288p = false;
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams);
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        if (this.f309284i) {
            return this.f309287o;
        }
        return -1;
    }

    public int getChipSpacingHorizontal() {
        return this.f309282g;
    }

    public int getChipSpacingVertical() {
        return this.f309283h;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f309287o;
        if (i != -1) {
            mo146586b(i, true);
            setCheckedId(this.f309287o);
        }
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.f309282g != i) {
            this.f309282g = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(int i) {
        if (this.f309283h != i) {
            this.f309283h = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public void setOnCheckedChangeListener(C104436c cVar) {
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f309286n.f309290d = onHierarchyChangeListener;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    public void setSingleSelection(boolean z) {
        if (this.f309284i != z) {
            this.f309284i = z;
            this.f309288p = true;
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (childAt instanceof Chip) {
                    ((Chip) childAt).setChecked(false);
                }
            }
            this.f309288p = false;
            setCheckedId(-1);
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f309285j = new C104435b((C104434a) null);
        this.f309286n = new C104437d((C104434a) null);
        this.f309287o = -1;
        this.f309288p = false;
        TypedArray d = C109991k.m149511d(context, attributeSet, C107764a.f322507g, i, C0966R.style.a4_, new int[0]);
        int dimensionPixelOffset = d.getDimensionPixelOffset(1, 0);
        setChipSpacingHorizontal(d.getDimensionPixelOffset(2, dimensionPixelOffset));
        setChipSpacingVertical(d.getDimensionPixelOffset(3, dimensionPixelOffset));
        setSingleLine(d.getBoolean(4, false));
        setSingleSelection(d.getBoolean(5, false));
        int resourceId = d.getResourceId(0, -1);
        if (resourceId != -1) {
            this.f309287o = resourceId;
        }
        d.recycle();
        super.setOnHierarchyChangeListener(this.f309286n);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
