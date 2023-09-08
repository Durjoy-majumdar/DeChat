package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.app.C103425o;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C103448e;
import androidx.appcompat.view.menu.C103452g;
import androidx.appcompat.view.menu.C103456i;
import androidx.appcompat.view.menu.C103458j;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.Toolbar;
import p990k.C108791h;

public class ActionMenuView extends LinearLayoutCompat implements C103448e.C103450b, C103458j {

    /* renamed from: A */
    public C103456i.C103457a f305404A;

    /* renamed from: B */
    public C103448e.C103449a f305405B;

    /* renamed from: C */
    public boolean f305406C;

    /* renamed from: D */
    public int f305407D;

    /* renamed from: E */
    public int f305408E;

    /* renamed from: F */
    public int f305409F;

    /* renamed from: G */
    public C103480d f305410G;

    /* renamed from: v */
    public C103448e f305411v;

    /* renamed from: w */
    public Context f305412w;

    /* renamed from: x */
    public int f305413x = 0;

    /* renamed from: y */
    public boolean f305414y;

    /* renamed from: z */
    public ActionMenuPresenter f305415z;

    public static class LayoutParams extends LinearLayoutCompat.LayoutParams {
        @ViewDebug.ExportedProperty

        /* renamed from: c */
        public boolean f305416c;
        @ViewDebug.ExportedProperty

        /* renamed from: d */
        public int f305417d;
        @ViewDebug.ExportedProperty

        /* renamed from: e */
        public int f305418e;
        @ViewDebug.ExportedProperty

        /* renamed from: f */
        public boolean f305419f;
        @ViewDebug.ExportedProperty

        /* renamed from: g */
        public boolean f305420g;

        /* renamed from: h */
        public boolean f305421h;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.f305416c = layoutParams.f305416c;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f305416c = false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$a */
    public interface C103477a {
        /* renamed from: c */
        boolean mo143500c();

        /* renamed from: k */
        boolean mo143504k();
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$b */
    public static class C103478b implements C103456i.C103457a {
        /* renamed from: a */
        public void mo143414a(C103448e eVar, boolean z) {
        }

        /* renamed from: d */
        public boolean mo143415d(C103448e eVar) {
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$c */
    public class C103479c implements C103448e.C103449a {
        public C103479c() {
        }

        /* renamed from: b */
        public boolean mo143384b(C103448e eVar, MenuItem menuItem) {
            C103480d dVar = ActionMenuView.this.f305410G;
            if (dVar == null) {
                return false;
            }
            Toolbar.C103515d dVar2 = Toolbar.this.f305647M;
            return dVar2 != null ? ((C108791h) C103425o.this.f305092c).onMenuItemSelected(0, menuItem) : false;
        }

        /* renamed from: c */
        public void mo143385c(C103448e eVar) {
            C103448e.C103449a aVar = ActionMenuView.this.f305405B;
            if (aVar != null) {
                aVar.mo143385c(eVar);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$d */
    public interface C103480d {
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f305408E = (int) (56.0f * f);
        this.f305409F = (int) (f * 4.0f);
        this.f305412w = context;
    }

    /* renamed from: c */
    public boolean mo143519c(C103452g gVar) {
        return this.f305411v.mo143614q(gVar, (C103456i) null, 0);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams != null && (layoutParams instanceof LayoutParams);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    /* renamed from: f */
    public void mo143520f(C103448e eVar) {
        this.f305411v = eVar;
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.f305506b = 16;
        return layoutParams;
    }

    public Menu getMenu() {
        if (this.f305411v == null) {
            Context context = getContext();
            C103448e eVar = new C103448e(context);
            this.f305411v = eVar;
            eVar.f305239h = new C103479c();
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.f305415z = actionMenuPresenter;
            actionMenuPresenter.f305387s = true;
            actionMenuPresenter.f305388t = true;
            C103456i.C103457a aVar = this.f305404A;
            if (aVar == null) {
                aVar = new C103478b();
            }
            actionMenuPresenter.f305175h = aVar;
            this.f305411v.mo143590b(actionMenuPresenter, this.f305412w);
            ActionMenuPresenter actionMenuPresenter2 = this.f305415z;
            actionMenuPresenter2.f305178n = this;
            this.f305411v = actionMenuPresenter2.f305173f;
        }
        return this.f305411v;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        ActionMenuPresenter actionMenuPresenter = this.f305415z;
        ActionMenuPresenter.C103473d dVar = actionMenuPresenter.f305384p;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (actionMenuPresenter.f305386r) {
            return actionMenuPresenter.f305385q;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f305413x;
    }

    public int getWindowAnimations() {
        return 0;
    }

    /* renamed from: h */
    public LinearLayoutCompat.LayoutParams mo143827h() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.f305506b = 16;
        return layoutParams;
    }

    /* renamed from: i */
    public LinearLayoutCompat.LayoutParams mo143828i(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* renamed from: l */
    public LayoutParams mo143829j(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            LayoutParams layoutParams2 = layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : new LayoutParams(layoutParams);
            if (layoutParams2.f305506b <= 0) {
                layoutParams2.f305506b = 16;
            }
            return layoutParams2;
        }
        LayoutParams layoutParams3 = new LayoutParams(-2, -2);
        layoutParams3.f305506b = 16;
        return layoutParams3;
    }

    /* renamed from: m */
    public boolean mo143831m(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof C103477a)) {
            z = false | ((C103477a) childAt).mo143504k();
        }
        return (i <= 0 || !(childAt2 instanceof C103477a)) ? z : z | ((C103477a) childAt2).mo143500c();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.f305415z;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo143539c(false);
            if (this.f305415z.mo143807m()) {
                this.f305415z.mo143806l();
                this.f305415z.mo143809o();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.f305415z;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo143806l();
            ActionMenuPresenter.C103470a aVar = actionMenuPresenter.f305379B;
            if (aVar != null && aVar.mo143697b()) {
                aVar.f305297j.dismiss();
            }
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (!this.f305406C) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i7 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i8 = i3 - i;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        boolean a = C103553n0.m137647a(this);
        int i9 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f305416c) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (mo143831m(i16)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a) {
                        i5 = getPaddingLeft() + layoutParams.leftMargin;
                        i6 = i5 + measuredWidth;
                    } else {
                        i6 = (getWidth() - getPaddingRight()) - layoutParams.rightMargin;
                        i5 = i6 - measuredWidth;
                    }
                    int i17 = i7 - (measuredHeight / 2);
                    childAt.layout(i5, i17, i6, measuredHeight + i17);
                    paddingRight -= measuredWidth;
                    i9 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + layoutParams.leftMargin) + layoutParams.rightMargin;
                    mo143831m(i16);
                    i15++;
                }
            }
        }
        if (childCount == 1 && i9 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i18 = (i8 / 2) - (measuredWidth2 / 2);
            int i19 = i7 - (measuredHeight2 / 2);
            childAt2.layout(i18, i19, measuredWidth2 + i18, measuredHeight2 + i19);
            return;
        }
        int i25 = i15 - (i9 ^ 1);
        int max = Math.max(0, i25 > 0 ? paddingRight / i25 : 0);
        if (a) {
            int width = getWidth() - getPaddingRight();
            for (int i26 = 0; i26 < childCount; i26++) {
                View childAt3 = getChildAt(i26);
                LayoutParams layoutParams2 = (LayoutParams) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !layoutParams2.f305416c) {
                    int i27 = width - layoutParams2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i28 = i7 - (measuredHeight3 / 2);
                    childAt3.layout(i27 - measuredWidth3, i28, i27, measuredHeight3 + i28);
                    width = i27 - ((measuredWidth3 + layoutParams2.leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i29 = 0; i29 < childCount; i29++) {
            View childAt4 = getChildAt(i29);
            LayoutParams layoutParams3 = (LayoutParams) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !layoutParams3.f305416c) {
                int i35 = paddingLeft + layoutParams3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i36 = i7 - (measuredHeight4 / 2);
                childAt4.layout(i35, i36, i35 + measuredWidth4, measuredHeight4 + i36);
                paddingLeft = i35 + measuredWidth4 + layoutParams3.rightMargin + max;
            }
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        int i8;
        C103448e eVar;
        boolean z2 = this.f305406C;
        boolean z3 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f305406C = z3;
        if (z2 != z3) {
            this.f305407D = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (!(!this.f305406C || (eVar = this.f305411v) == null || size == this.f305407D)) {
            this.f305407D = size;
            eVar.mo143611p(true);
        }
        int childCount = getChildCount();
        if (!this.f305406C || childCount <= 0) {
            int i9 = i2;
            for (int i15 = 0; i15 < childCount; i15++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i15).getLayoutParams();
                layoutParams.rightMargin = 0;
                layoutParams.leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingTop, -2);
        int i16 = size2 - paddingLeft;
        int i17 = this.f305408E;
        int i18 = i16 / i17;
        int i19 = i16 % i17;
        if (i18 == 0) {
            setMeasuredDimension(i16, 0);
            return;
        }
        int i25 = i17 + (i19 / i18);
        int childCount2 = getChildCount();
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        boolean z4 = false;
        long j = 0;
        int i35 = 0;
        while (i29 < childCount2) {
            View childAt = getChildAt(i29);
            int i36 = size3;
            if (childAt.getVisibility() == 8) {
                i4 = mode;
                i5 = i16;
                i6 = paddingTop;
            } else {
                boolean z5 = childAt instanceof ActionMenuItemView;
                int i37 = i27 + 1;
                if (z5) {
                    int i38 = this.f305409F;
                    i7 = i37;
                    z = false;
                    childAt.setPadding(i38, 0, i38, 0);
                } else {
                    i7 = i37;
                    z = false;
                }
                LayoutParams layoutParams2 = (LayoutParams) childAt.getLayoutParams();
                layoutParams2.f305421h = z;
                layoutParams2.f305418e = z ? 1 : 0;
                layoutParams2.f305417d = z;
                layoutParams2.f305419f = z;
                layoutParams2.leftMargin = z;
                layoutParams2.rightMargin = z;
                layoutParams2.f305420g = z5 && ((ActionMenuItemView) childAt).mo143498a();
                int i39 = layoutParams2.f305416c ? 1 : i18;
                i5 = i16;
                LayoutParams layoutParams3 = (LayoutParams) childAt.getLayoutParams();
                i4 = mode;
                i6 = paddingTop;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingTop, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z5 ? (ActionMenuItemView) childAt : null;
                boolean z6 = actionMenuItemView != null && actionMenuItemView.mo143498a();
                if (i39 <= 0 || (z6 && i39 < 2)) {
                    i8 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i39 * i25, Integer.MIN_VALUE), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i8 = measuredWidth / i25;
                    if (measuredWidth % i25 != 0) {
                        i8++;
                    }
                    if (z6 && i8 < 2) {
                        i8 = 2;
                    }
                }
                layoutParams3.f305419f = !layoutParams3.f305416c && z6;
                layoutParams3.f305417d = i8;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i25 * i8, 1073741824), makeMeasureSpec);
                i28 = Math.max(i28, i8);
                if (layoutParams2.f305419f) {
                    i35++;
                }
                if (layoutParams2.f305416c) {
                    z4 = true;
                }
                i18 -= i8;
                i26 = Math.max(i26, childAt.getMeasuredHeight());
                if (i8 == 1) {
                    j |= (long) (1 << i29);
                }
                i27 = i7;
            }
            i29++;
            size3 = i36;
            paddingTop = i6;
            i16 = i5;
            mode = i4;
        }
        int i44 = mode;
        int i45 = i16;
        int i46 = size3;
        boolean z7 = z4 && i27 == 2;
        boolean z8 = false;
        while (i35 > 0 && i18 > 0) {
            int i47 = Integer.MAX_VALUE;
            int i48 = 0;
            long j2 = 0;
            for (int i49 = 0; i49 < childCount2; i49++) {
                LayoutParams layoutParams4 = (LayoutParams) getChildAt(i49).getLayoutParams();
                if (layoutParams4.f305419f) {
                    int i54 = layoutParams4.f305417d;
                    if (i54 < i47) {
                        j2 = 1 << i49;
                        i47 = i54;
                        i48 = 1;
                    } else if (i54 == i47) {
                        i48++;
                        j2 |= 1 << i49;
                    }
                }
            }
            j |= j2;
            if (i48 > i18) {
                break;
            }
            int i55 = i47 + 1;
            int i56 = 0;
            while (i56 < childCount2) {
                View childAt2 = getChildAt(i56);
                LayoutParams layoutParams5 = (LayoutParams) childAt2.getLayoutParams();
                int i57 = childMeasureSpec;
                long j3 = (long) (1 << i56);
                if ((j2 & j3) != 0) {
                    if (z7 && layoutParams5.f305420g && i18 == 1) {
                        int i58 = this.f305409F;
                        childAt2.setPadding(i58 + i25, 0, i58, 0);
                    }
                    layoutParams5.f305417d++;
                    layoutParams5.f305421h = true;
                    i18--;
                } else if (layoutParams5.f305417d == i55) {
                    j |= j3;
                }
                i56++;
                childMeasureSpec = i57;
            }
            z8 = true;
        }
        int i59 = childMeasureSpec;
        boolean z9 = !z4 && i27 == 1;
        if (i18 > 0 && j != 0 && (i18 < i27 - 1 || z9 || i28 > 1)) {
            float bitCount = (float) Long.bitCount(j);
            if (!z9) {
                if ((j & 1) != 0 && !((LayoutParams) getChildAt(0).getLayoutParams()).f305420g) {
                    bitCount -= 0.5f;
                }
                int i64 = childCount2 - 1;
                if ((j & ((long) (1 << i64))) != 0 && !((LayoutParams) getChildAt(i64).getLayoutParams()).f305420g) {
                    bitCount -= 0.5f;
                }
            }
            int i65 = bitCount > 0.0f ? (int) (((float) (i18 * i25)) / bitCount) : 0;
            boolean z15 = z8;
            for (int i66 = 0; i66 < childCount2; i66++) {
                if ((j & ((long) (1 << i66))) != 0) {
                    View childAt3 = getChildAt(i66);
                    LayoutParams layoutParams6 = (LayoutParams) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        layoutParams6.f305418e = i65;
                        layoutParams6.f305421h = true;
                        if (i66 == 0 && !layoutParams6.f305420g) {
                            layoutParams6.leftMargin = (-i65) / 2;
                        }
                    } else if (layoutParams6.f305416c) {
                        layoutParams6.f305418e = i65;
                        layoutParams6.f305421h = true;
                        layoutParams6.rightMargin = (-i65) / 2;
                    } else {
                        if (i66 != 0) {
                            layoutParams6.leftMargin = i65 / 2;
                        }
                        if (i66 != childCount2 - 1) {
                            layoutParams6.rightMargin = i65 / 2;
                        }
                    }
                    z15 = true;
                }
            }
            z8 = z15;
        }
        if (z8) {
            int i67 = 0;
            while (i67 < childCount2) {
                View childAt4 = getChildAt(i67);
                LayoutParams layoutParams7 = (LayoutParams) childAt4.getLayoutParams();
                if (!layoutParams7.f305421h) {
                    i3 = i59;
                } else {
                    i3 = i59;
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((layoutParams7.f305417d * i25) + layoutParams7.f305418e, 1073741824), i3);
                }
                i67++;
                i59 = i3;
            }
        }
        setMeasuredDimension(i45, i44 != 1073741824 ? i26 : i46);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f305415z.f305392x = z;
    }

    public void setOnMenuItemClickListener(C103480d dVar) {
        this.f305410G = dVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        ActionMenuPresenter actionMenuPresenter = this.f305415z;
        ActionMenuPresenter.C103473d dVar = actionMenuPresenter.f305384p;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        actionMenuPresenter.f305386r = true;
        actionMenuPresenter.f305385q = drawable;
    }

    public void setOverflowReserved(boolean z) {
        this.f305414y = z;
    }

    public void setPopupTheme(int i) {
        if (this.f305413x != i) {
            this.f305413x = i;
            if (i == 0) {
                this.f305412w = getContext();
            } else {
                this.f305412w = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.f305415z = actionMenuPresenter;
        actionMenuPresenter.f305178n = this;
        this.f305411v = actionMenuPresenter.f305173f;
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }
}
