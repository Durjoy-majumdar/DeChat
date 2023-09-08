package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.C103448e;
import androidx.appcompat.view.menu.C103452g;
import androidx.appcompat.view.menu.C103458j;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionSet;
import com.tencent.p014mm.C0966R;
import java.util.WeakHashMap;
import p1115h.C107922a;
import p1136n3.C109678b;
import p1139o8.C109989j;
import p329d3.C106986f;
import p329d3.C86167d;
import p849e3.C107168a0;
import p849e3.C107207u;

public class BottomNavigationMenuView extends ViewGroup implements C103458j {

    /* renamed from: E */
    public static final int[] f309178E = {16842912};

    /* renamed from: F */
    public static final int[] f309179F = {-16842910};

    /* renamed from: A */
    public int f309180A;

    /* renamed from: B */
    public int[] f309181B;

    /* renamed from: C */
    public BottomNavigationPresenter f309182C;

    /* renamed from: D */
    public C103448e f309183D;

    /* renamed from: d */
    public final TransitionSet f309184d;

    /* renamed from: e */
    public final int f309185e;

    /* renamed from: f */
    public final int f309186f;

    /* renamed from: g */
    public final int f309187g;

    /* renamed from: h */
    public final int f309188h;

    /* renamed from: i */
    public final int f309189i;

    /* renamed from: j */
    public final View.OnClickListener f309190j;

    /* renamed from: n */
    public final C86167d<BottomNavigationItemView> f309191n = new C106986f(5);

    /* renamed from: o */
    public boolean f309192o;

    /* renamed from: p */
    public int f309193p;

    /* renamed from: q */
    public BottomNavigationItemView[] f309194q;

    /* renamed from: r */
    public int f309195r = 0;

    /* renamed from: s */
    public int f309196s = 0;

    /* renamed from: t */
    public ColorStateList f309197t;

    /* renamed from: u */
    public int f309198u;

    /* renamed from: v */
    public ColorStateList f309199v;

    /* renamed from: w */
    public final ColorStateList f309200w;

    /* renamed from: x */
    public int f309201x;

    /* renamed from: y */
    public int f309202y;

    /* renamed from: z */
    public Drawable f309203z;

    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationMenuView$a */
    public class C104417a implements View.OnClickListener {
        public C104417a() {
        }

        public void onClick(View view) {
            C103452g itemData = ((BottomNavigationItemView) view).getItemData();
            BottomNavigationMenuView bottomNavigationMenuView = BottomNavigationMenuView.this;
            if (!bottomNavigationMenuView.f309183D.mo143614q(itemData, bottomNavigationMenuView.f309182C, 0)) {
                itemData.setChecked(true);
            }
        }
    }

    public BottomNavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = getResources();
        this.f309185e = resources.getDimensionPixelSize(C0966R.dimen.a0e);
        this.f309186f = resources.getDimensionPixelSize(C0966R.dimen.a0f);
        this.f309187g = resources.getDimensionPixelSize(C0966R.dimen.a09);
        this.f309188h = resources.getDimensionPixelSize(C0966R.dimen.a0_);
        this.f309189i = resources.getDimensionPixelSize(C0966R.dimen.a0c);
        this.f309200w = mo146324b(16842808);
        AutoTransition autoTransition = new AutoTransition();
        this.f309184d = autoTransition;
        autoTransition.mo145351X(0);
        autoTransition.mo145349V(115);
        autoTransition.mo145350W(new C109678b());
        autoTransition.mo145348U(new C109989j());
        this.f309190j = new C104417a();
        this.f309181B = new int[5];
    }

    private BottomNavigationItemView getNewItem() {
        BottomNavigationItemView bottomNavigationItemView = (BottomNavigationItemView) ((C106986f) this.f309191n).mo157419a();
        return bottomNavigationItemView == null ? new BottomNavigationItemView(getContext(), (AttributeSet) null) : bottomNavigationItemView;
    }

    /* renamed from: a */
    public void mo146323a() {
        removeAllViews();
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.f309194q;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                if (bottomNavigationItemView != null) {
                    ((C106986f) this.f309191n).mo157420b(bottomNavigationItemView);
                }
            }
        }
        if (this.f309183D.size() == 0) {
            this.f309195r = 0;
            this.f309196s = 0;
            this.f309194q = null;
            return;
        }
        this.f309194q = new BottomNavigationItemView[this.f309183D.size()];
        int i = this.f309193p;
        boolean z = i != -1 ? i == 0 : this.f309183D.mo143607l().size() > 3;
        for (int i2 = 0; i2 < this.f309183D.size(); i2++) {
            this.f309182C.f309206e = true;
            this.f309183D.getItem(i2).setCheckable(true);
            this.f309182C.f309206e = false;
            BottomNavigationItemView newItem = getNewItem();
            this.f309194q[i2] = newItem;
            newItem.setIconTintList(this.f309197t);
            newItem.setIconSize(this.f309198u);
            newItem.setTextColor(this.f309200w);
            newItem.setTextAppearanceInactive(this.f309201x);
            newItem.setTextAppearanceActive(this.f309202y);
            newItem.setTextColor(this.f309199v);
            Drawable drawable = this.f309203z;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.f309180A);
            }
            newItem.setShifting(z);
            newItem.setLabelVisibilityMode(this.f309193p);
            newItem.mo143501d((C103452g) this.f309183D.getItem(i2), 0);
            newItem.setItemPosition(i2);
            newItem.setOnClickListener(this.f309190j);
            addView(newItem);
        }
        int min = Math.min(this.f309183D.size() - 1, this.f309196s);
        this.f309196s = min;
        this.f309183D.getItem(min).setChecked(true);
    }

    /* renamed from: b */
    public ColorStateList mo146324b(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList a = C107922a.m146227a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(C0966R.attr.f2735gf, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = a.getDefaultColor();
        int[] iArr = f309179F;
        return new ColorStateList(new int[][]{iArr, f309178E, ViewGroup.EMPTY_STATE_SET}, new int[]{a.getColorForState(iArr, defaultColor), i2, defaultColor});
    }

    /* renamed from: f */
    public void mo143520f(C103448e eVar) {
        this.f309183D = eVar;
    }

    public ColorStateList getIconTintList() {
        return this.f309197t;
    }

    public Drawable getItemBackground() {
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.f309194q;
        return (bottomNavigationItemViewArr == null || bottomNavigationItemViewArr.length <= 0) ? this.f309203z : bottomNavigationItemViewArr[0].getBackground();
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.f309180A;
    }

    public int getItemIconSize() {
        return this.f309198u;
    }

    public int getItemTextAppearanceActive() {
        return this.f309202y;
    }

    public int getItemTextAppearanceInactive() {
        return this.f309201x;
    }

    public ColorStateList getItemTextColor() {
        return this.f309199v;
    }

    public int getLabelVisibilityMode() {
        return this.f309193p;
    }

    public int getSelectedItemId() {
        return this.f309195r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                if (C107207u.C107209c.m145195d(this) == 1) {
                    int i9 = i5 - i7;
                    childAt.layout(i9 - childAt.getMeasuredWidth(), 0, i9, i6);
                } else {
                    childAt.layout(i7, 0, childAt.getMeasuredWidth() + i7, i6);
                }
                i7 += childAt.getMeasuredWidth();
            }
        }
    }

    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.f309183D.mo143607l().size();
        int childCount = getChildCount();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f309189i, 1073741824);
        int i3 = this.f309193p;
        int i4 = 1;
        if (!(i3 != -1 ? i3 == 0 : size2 > 3) || !this.f309192o) {
            if (size2 != 0) {
                i4 = size2;
            }
            int min = Math.min(size / i4, this.f309187g);
            int i5 = size - (size2 * min);
            for (int i6 = 0; i6 < childCount; i6++) {
                if (getChildAt(i6).getVisibility() != 8) {
                    int[] iArr = this.f309181B;
                    iArr[i6] = min;
                    if (i5 > 0) {
                        iArr[i6] = min + 1;
                        i5--;
                    }
                } else {
                    this.f309181B[i6] = 0;
                }
            }
        } else {
            View childAt = getChildAt(this.f309196s);
            int i7 = this.f309188h;
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(this.f309187g, Integer.MIN_VALUE), makeMeasureSpec);
                i7 = Math.max(i7, childAt.getMeasuredWidth());
            }
            int i8 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
            int min2 = Math.min(size - (this.f309186f * i8), Math.min(i7, this.f309187g));
            int i9 = size - min2;
            if (i8 != 0) {
                i4 = i8;
            }
            int min3 = Math.min(i9 / i4, this.f309185e);
            int i15 = i9 - (i8 * min3);
            int i16 = 0;
            while (i16 < childCount) {
                if (getChildAt(i16).getVisibility() != 8) {
                    int[] iArr2 = this.f309181B;
                    int i17 = i16 == this.f309196s ? min2 : min3;
                    iArr2[i16] = i17;
                    if (i15 > 0) {
                        iArr2[i16] = i17 + 1;
                        i15--;
                    }
                } else {
                    this.f309181B[i16] = 0;
                }
                i16++;
            }
        }
        int i18 = 0;
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt2 = getChildAt(i19);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(this.f309181B[i19], 1073741824), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i18 += childAt2.getMeasuredWidth();
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i18, View.MeasureSpec.makeMeasureSpec(i18, 1073741824), 0), View.resolveSizeAndState(this.f309189i, makeMeasureSpec, 0));
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f309197t = colorStateList;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.f309194q;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView iconTintList : bottomNavigationItemViewArr) {
                iconTintList.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.f309203z = drawable;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.f309194q;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView itemBackground : bottomNavigationItemViewArr) {
                itemBackground.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i) {
        this.f309180A = i;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.f309194q;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView itemBackground : bottomNavigationItemViewArr) {
                itemBackground.setItemBackground(i);
            }
        }
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        this.f309192o = z;
    }

    public void setItemIconSize(int i) {
        this.f309198u = i;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.f309194q;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView iconSize : bottomNavigationItemViewArr) {
                iconSize.setIconSize(i);
            }
        }
    }

    public void setItemTextAppearanceActive(int i) {
        this.f309202y = i;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.f309194q;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                bottomNavigationItemView.setTextAppearanceActive(i);
                ColorStateList colorStateList = this.f309199v;
                if (colorStateList != null) {
                    bottomNavigationItemView.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(int i) {
        this.f309201x = i;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.f309194q;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                bottomNavigationItemView.setTextAppearanceInactive(i);
                ColorStateList colorStateList = this.f309199v;
                if (colorStateList != null) {
                    bottomNavigationItemView.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f309199v = colorStateList;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.f309194q;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView textColor : bottomNavigationItemViewArr) {
                textColor.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i) {
        this.f309193p = i;
    }

    public void setPresenter(BottomNavigationPresenter bottomNavigationPresenter) {
        this.f309182C = bottomNavigationPresenter;
    }
}
