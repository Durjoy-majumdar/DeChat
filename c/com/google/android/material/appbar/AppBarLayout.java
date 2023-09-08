package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.tencent.p014mm.C0966R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import p1114g8.C107764a;
import p1139o8.C109991k;
import p161h8.C108164a;
import p282z2.C16095a;
import p849e3.C107168a0;
import p849e3.C107179f0;
import p849e3.C107204q;
import p849e3.C107207u;

@CoordinatorLayout.C103715c(Behavior.class)
public class AppBarLayout extends LinearLayout {

    /* renamed from: d */
    public int f309043d;

    /* renamed from: e */
    public int f309044e;

    /* renamed from: f */
    public int f309045f;

    /* renamed from: g */
    public boolean f309046g;

    /* renamed from: h */
    public int f309047h;

    /* renamed from: i */
    public C107179f0 f309048i;

    /* renamed from: j */
    public List<C67444b> f309049j;

    /* renamed from: n */
    public boolean f309050n;

    /* renamed from: o */
    public boolean f309051o;

    /* renamed from: p */
    public boolean f309052p;

    /* renamed from: q */
    public int[] f309053q;

    public static class Behavior extends BaseBehavior<AppBarLayout> {

        /* renamed from: com.google.android.material.appbar.AppBarLayout$Behavior$a */
        public static abstract class C67443a extends BaseBehavior.C67442a<AppBarLayout> {
        }

        public Behavior() {
        }

        /* renamed from: m */
        public /* bridge */ /* synthetic */ void mo78308m(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5) {
            mo78308m(coordinatorLayout, (AppBarLayout) view, view2, i, i2, i3, i4, i5);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$b */
    public interface C67444b<T extends AppBarLayout> {
        /* renamed from: a */
        void mo3128a(T t, int i);
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$c */
    public interface C67445c extends C67444b<AppBarLayout> {
        /* renamed from: a */
        void mo3128a(AppBarLayout appBarLayout, int i);
    }

    public static class ScrollingViewBehavior extends HeaderScrollingViewBehavior {
        public ScrollingViewBehavior() {
        }

        /* renamed from: A */
        public float mo146194A(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.C103717e) appBarLayout.getLayoutParams()).f306328a;
                int C = behavior instanceof BaseBehavior ? ((BaseBehavior) behavior).mo146184C() : 0;
                if ((downNestedPreScrollRange == 0 || totalScrollRange + C > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (((float) C) / ((float) i)) + 1.0f;
                }
            }
            return 0.0f;
        }

        /* renamed from: B */
        public int mo146195B(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : view.getMeasuredHeight();
        }

        /* renamed from: b */
        public boolean mo842b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        /* renamed from: d */
        public boolean mo133275d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            int i;
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.C103717e) view2.getLayoutParams()).f306328a;
            if (behavior instanceof BaseBehavior) {
                int bottom = (view2.getBottom() - view.getTop()) + ((BaseBehavior) behavior).f309054p + this.f309105h;
                if (this.f309106i == 0) {
                    i = 0;
                } else {
                    float A = mo146194A(view2);
                    int i2 = this.f309106i;
                    i = C16095a.m14980b((int) (A * ((float) i2)), 0, i2);
                }
                C107207u.m145166g(view, bottom - i);
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.f309052p) {
                    boolean z = view.getScrollY() > 0;
                    if (appBarLayout.f309051o != z) {
                        appBarLayout.f309051o = z;
                        appBarLayout.refreshDrawableState();
                    }
                }
            }
            return false;
        }

        /* renamed from: o */
        public boolean mo144930o(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout appBarLayout;
            ArrayList arrayList = (ArrayList) coordinatorLayout.mo144889l(view);
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    appBarLayout = null;
                    break;
                }
                View view2 = (View) arrayList.get(i);
                if (view2 instanceof AppBarLayout) {
                    appBarLayout = (AppBarLayout) view2;
                    break;
                }
                i++;
            }
            if (appBarLayout != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f309103f;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    appBarLayout.mo146163d(false, !z, true);
                    return true;
                }
            }
            return false;
        }

        /* renamed from: z */
        public View mo146196z(List list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = (View) list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C107764a.f322518r);
            this.f309106i = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$a */
    public class C104397a implements C107204q {
        public C104397a() {
        }

        /* renamed from: a */
        public C107179f0 mo12075a(View view, C107179f0 f0Var) {
            AppBarLayout appBarLayout = AppBarLayout.this;
            appBarLayout.getClass();
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            C107179f0 f0Var2 = C107207u.C107208b.m145174b(appBarLayout) ? f0Var : null;
            if (!Objects.equals(appBarLayout.f309048i, f0Var2)) {
                appBarLayout.f309048i = f0Var2;
                appBarLayout.f309043d = -1;
                appBarLayout.f309044e = -1;
                appBarLayout.f309045f = -1;
            }
            return f0Var;
        }
    }

    public AppBarLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public void mo146159a(C67444b bVar) {
        if (this.f309049j == null) {
            this.f309049j = new ArrayList();
        }
        if (bVar != null && !this.f309049j.contains(bVar)) {
            this.f309049j.add(bVar);
        }
    }

    /* renamed from: b */
    public void mo146160b(int i) {
        List<C67444b> list = this.f309049j;
        if (list != null) {
            int size = ((ArrayList) list).size();
            for (int i2 = 0; i2 < size; i2++) {
                C67444b bVar = (C67444b) ((ArrayList) this.f309049j).get(i2);
                if (bVar != null) {
                    bVar.mo3128a(this, i);
                }
            }
        }
    }

    /* renamed from: c */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new LayoutParams((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: d */
    public final void mo146163d(boolean z, boolean z2, boolean z3) {
        int i = 0;
        int i2 = (z ? 1 : 2) | (z2 ? 4 : 0);
        if (z3) {
            i = 8;
        }
        this.f309047h = i2 | i;
        requestLayout();
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -2);
    }

    public int getDownNestedPreScrollRange() {
        int i;
        int i2 = this.f309044e;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = layoutParams.f193396a;
            if ((i4 & 5) == 5) {
                int i5 = i3 + layoutParams.topMargin + layoutParams.bottomMargin;
                if ((i4 & 8) != 0) {
                    WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                    i3 = i5 + C107207u.C107208b.m145176d(childAt);
                } else {
                    if ((i4 & 2) != 0) {
                        WeakHashMap<View, C107168a0> weakHashMap2 = C107207u.f320808a;
                        i = C107207u.C107208b.m145176d(childAt);
                    } else {
                        i = getTopInset();
                    }
                    i3 = i5 + (measuredHeight - i);
                }
            } else if (i3 > 0) {
                break;
            }
        }
        int max = Math.max(0, i3);
        this.f309044e = max;
        return max;
    }

    public int getDownNestedScrollRange() {
        int i = this.f309045f;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int i4 = layoutParams.f193396a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight;
            if ((i4 & 2) != 0) {
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                i3 -= C107207u.C107208b.m145176d(childAt) + getTopInset();
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f309045f = max;
        return max;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        int d = C107207u.C107208b.m145176d(this);
        if (d == 0) {
            int childCount = getChildCount();
            d = childCount >= 1 ? C107207u.C107208b.m145176d(getChildAt(childCount - 1)) : 0;
            if (d == 0) {
                return getHeight() / 3;
            }
        }
        return (d * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f309047h;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        C107179f0 f0Var = this.f309048i;
        if (f0Var != null) {
            return f0Var.mo157632d();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.f309043d;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = layoutParams.f193396a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight + layoutParams.topMargin + layoutParams.bottomMargin;
            if ((i4 & 2) != 0) {
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                i3 -= C107207u.C107208b.m145176d(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3 - getTopInset());
        this.f309043d = max;
        return max;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    public int[] onCreateDrawableState(int i) {
        if (this.f309053q == null) {
            this.f309053q = new int[4];
        }
        int[] iArr = this.f309053q;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.f309050n;
        iArr[0] = z ? C0966R.attr.a26 : -2130969691;
        iArr[1] = (!z || !this.f309051o) ? -2130969692 : C0966R.attr.a27;
        iArr[2] = z ? C0966R.attr.a25 : -2130969690;
        iArr[3] = (!z || !this.f309051o) ? -2130969689 : C0966R.attr.f356913a24;
        return View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0053, code lost:
        if (r3 != false) goto L_0x0055;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r2, int r3, int r4, int r5, int r6) {
        /*
            r1 = this;
            super.onLayout(r2, r3, r4, r5, r6)
            r2 = -1
            r1.f309043d = r2
            r1.f309044e = r2
            r1.f309045f = r2
            r2 = 0
            r1.f309046g = r2
            int r3 = r1.getChildCount()
            r4 = 0
        L_0x0012:
            r5 = 1
            if (r4 >= r3) goto L_0x0029
            android.view.View r6 = r1.getChildAt(r4)
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            com.google.android.material.appbar.AppBarLayout$LayoutParams r6 = (com.google.android.material.appbar.AppBarLayout.LayoutParams) r6
            android.view.animation.Interpolator r6 = r6.f193397b
            if (r6 == 0) goto L_0x0026
            r1.f309046g = r5
            goto L_0x0029
        L_0x0026:
            int r4 = r4 + 1
            goto L_0x0012
        L_0x0029:
            boolean r3 = r1.f309052p
            if (r3 != 0) goto L_0x0055
            int r3 = r1.getChildCount()
            r4 = 0
        L_0x0032:
            if (r4 >= r3) goto L_0x0052
            android.view.View r6 = r1.getChildAt(r4)
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            com.google.android.material.appbar.AppBarLayout$LayoutParams r6 = (com.google.android.material.appbar.AppBarLayout.LayoutParams) r6
            int r6 = r6.f193396a
            r0 = r6 & 1
            if (r0 != r5) goto L_0x004a
            r6 = r6 & 10
            if (r6 == 0) goto L_0x004a
            r6 = 1
            goto L_0x004b
        L_0x004a:
            r6 = 0
        L_0x004b:
            if (r6 == 0) goto L_0x004f
            r3 = 1
            goto L_0x0053
        L_0x004f:
            int r4 = r4 + 1
            goto L_0x0032
        L_0x0052:
            r3 = 0
        L_0x0053:
            if (r3 == 0) goto L_0x0056
        L_0x0055:
            r2 = 1
        L_0x0056:
            boolean r3 = r1.f309050n
            if (r3 == r2) goto L_0x005f
            r1.f309050n = r2
            r1.refreshDrawableState()
        L_0x005f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.onLayout(boolean, int, int, int, int):void");
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f309043d = -1;
        this.f309044e = -1;
        this.f309045f = -1;
    }

    public void setExpanded(boolean z) {
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        mo146163d(z, C107207u.C107211e.m145208c(this), true);
    }

    public void setLiftOnScroll(boolean z) {
        this.f309052p = z;
    }

    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    @Deprecated
    public void setTargetElevation(float f) {
        C104404d.m139474a(this, f);
    }

    public static class BaseBehavior<T extends AppBarLayout> extends HeaderBehavior<T> {

        /* renamed from: p */
        public int f309054p;

        /* renamed from: q */
        public int f309055q;

        /* renamed from: r */
        public ValueAnimator f309056r;

        /* renamed from: s */
        public int f309057s = -1;

        /* renamed from: t */
        public boolean f309058t;

        /* renamed from: u */
        public float f309059u;

        /* renamed from: v */
        public WeakReference<View> f309060v;

        /* renamed from: w */
        public C67442a f309061w;

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a */
        public static abstract class C67442a<T extends AppBarLayout> {
            /* renamed from: a */
            public abstract boolean mo14405a(T t);
        }

        public BaseBehavior() {
        }

        /* renamed from: A */
        public int mo146182A(View view) {
            return -((AppBarLayout) view).getDownNestedScrollRange();
        }

        /* renamed from: B */
        public int mo146183B(View view) {
            return ((AppBarLayout) view).getTotalScrollRange();
        }

        /* renamed from: C */
        public int mo146184C() {
            return super.mo146259w() + this.f309054p;
        }

        /* renamed from: D */
        public void mo146185D(CoordinatorLayout coordinatorLayout, View view) {
            mo146188L(coordinatorLayout, (AppBarLayout) view);
        }

        /* JADX WARNING: Removed duplicated region for block: B:34:0x00a6  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00a9  */
        /* renamed from: F */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo146186F(androidx.coordinatorlayout.widget.CoordinatorLayout r8, android.view.View r9, int r10, int r11, int r12) {
            /*
                r7 = this;
                r2 = r9
                com.google.android.material.appbar.AppBarLayout r2 = (com.google.android.material.appbar.AppBarLayout) r2
                int r9 = r7.mo146184C()
                r0 = 0
                if (r11 == 0) goto L_0x00b3
                if (r9 < r11) goto L_0x00b3
                if (r9 > r12) goto L_0x00b3
                int r3 = p282z2.C16095a.m14980b(r10, r11, r12)
                if (r9 == r3) goto L_0x00b5
                boolean r10 = r2.f309046g
                if (r10 == 0) goto L_0x0089
                int r10 = java.lang.Math.abs(r3)
                int r11 = r2.getChildCount()
                r12 = 0
            L_0x0021:
                if (r12 >= r11) goto L_0x0089
                android.view.View r1 = r2.getChildAt(r12)
                android.view.ViewGroup$LayoutParams r4 = r1.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$LayoutParams r4 = (com.google.android.material.appbar.AppBarLayout.LayoutParams) r4
                android.view.animation.Interpolator r5 = r4.f193397b
                int r6 = r1.getTop()
                if (r10 < r6) goto L_0x0086
                int r6 = r1.getBottom()
                if (r10 > r6) goto L_0x0086
                if (r5 == 0) goto L_0x0089
                int r11 = r4.f193396a
                r12 = r11 & 1
                if (r12 == 0) goto L_0x0059
                int r12 = r1.getHeight()
                int r6 = r4.topMargin
                int r12 = r12 + r6
                int r4 = r4.bottomMargin
                int r12 = r12 + r4
                int r0 = r0 + r12
                r11 = r11 & 2
                if (r11 == 0) goto L_0x0059
                java.util.WeakHashMap<android.view.View, e3.a0> r11 = p849e3.C107207u.f320808a
                int r11 = p849e3.C107207u.C107208b.m145176d(r1)
                int r0 = r0 - r11
            L_0x0059:
                java.util.WeakHashMap<android.view.View, e3.a0> r11 = p849e3.C107207u.f320808a
                boolean r11 = p849e3.C107207u.C107208b.m145174b(r1)
                if (r11 == 0) goto L_0x0066
                int r11 = r2.getTopInset()
                int r0 = r0 - r11
            L_0x0066:
                if (r0 <= 0) goto L_0x0089
                int r11 = r1.getTop()
                int r10 = r10 - r11
                float r11 = (float) r0
                float r10 = (float) r10
                float r10 = r10 / r11
                float r10 = r5.getInterpolation(r10)
                float r11 = r11 * r10
                int r10 = java.lang.Math.round(r11)
                int r11 = java.lang.Integer.signum(r3)
                int r12 = r1.getTop()
                int r12 = r12 + r10
                int r11 = r11 * r12
                goto L_0x008a
            L_0x0086:
                int r12 = r12 + 1
                goto L_0x0021
            L_0x0089:
                r11 = r3
            L_0x008a:
                boolean r10 = super.mo146260y(r11)
                int r12 = r9 - r3
                int r11 = r3 - r11
                r7.f309054p = r11
                if (r10 != 0) goto L_0x009d
                boolean r10 = r2.f309046g
                if (r10 == 0) goto L_0x009d
                r8.mo144887h(r2)
            L_0x009d:
                int r10 = super.mo146259w()
                r2.mo146160b(r10)
                if (r3 >= r9) goto L_0x00a9
                r9 = -1
                r4 = -1
                goto L_0x00ab
            L_0x00a9:
                r9 = 1
                r4 = 1
            L_0x00ab:
                r5 = 0
                r0 = r7
                r1 = r8
                r0.mo146189M(r1, r2, r3, r4, r5)
                r0 = r12
                goto L_0x00b5
            L_0x00b3:
                r7.f309054p = r0
            L_0x00b5:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.mo146186F(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int, int, int):int");
        }

        /* renamed from: G */
        public final void mo146187G(CoordinatorLayout coordinatorLayout, T t, int i, float f) {
            int abs = Math.abs(mo146184C() - i);
            float abs2 = Math.abs(f);
            int round = abs2 > 0.0f ? Math.round((((float) abs) / abs2) * 1000.0f) * 3 : (int) (((((float) abs) / ((float) t.getHeight())) + 1.0f) * 150.0f);
            int C = mo146184C();
            if (C == i) {
                ValueAnimator valueAnimator = this.f309056r;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f309056r.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f309056r;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f309056r = valueAnimator3;
                valueAnimator3.setInterpolator(C108164a.f323894e);
                this.f309056r.addUpdateListener(new C104401a(this, coordinatorLayout, t));
            } else {
                valueAnimator2.cancel();
            }
            this.f309056r.setDuration((long) Math.min(round, 600));
            this.f309056r.setIntValues(new int[]{C, i});
            this.f309056r.start();
        }

        /* renamed from: H */
        public boolean mo94960f(CoordinatorLayout coordinatorLayout, T t, int i) {
            super.mo94960f(coordinatorLayout, t, i);
            int pendingAction = t.getPendingAction();
            int i2 = this.f309057s;
            if (i2 >= 0 && (pendingAction & 8) == 0) {
                View childAt = t.getChildAt(i2);
                mo146254E(coordinatorLayout, t, (-childAt.getBottom()) + (this.f309058t ? C107207u.C107208b.m145176d(childAt) + t.getTopInset() : Math.round(((float) childAt.getHeight()) * this.f309059u)));
            } else if (pendingAction != 0) {
                boolean z = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i3 = -t.getUpNestedPreScrollRange();
                    if (z) {
                        mo146187G(coordinatorLayout, t, i3, 0.0f);
                    } else {
                        mo146254E(coordinatorLayout, t, i3);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        mo146187G(coordinatorLayout, t, 0, 0.0f);
                    } else {
                        mo146254E(coordinatorLayout, t, 0);
                    }
                }
            }
            t.f309047h = 0;
            this.f309057s = -1;
            super.mo146260y(C16095a.m14980b(super.mo146259w(), -t.getTotalScrollRange(), 0));
            mo146189M(coordinatorLayout, t, super.mo146259w(), 0, true);
            t.mo146160b(super.mo146259w());
            return true;
        }

        /* renamed from: I */
        public void mo94961k(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            int i5;
            if (i2 != 0) {
                if (i2 < 0) {
                    int i6 = -t.getTotalScrollRange();
                    i5 = i6;
                    i4 = t.getDownNestedPreScrollRange() + i6;
                } else {
                    i5 = -t.getUpNestedPreScrollRange();
                    i4 = 0;
                }
                if (i5 != i4) {
                    iArr[1] = mo146186F(coordinatorLayout, t, mo146184C() - i2, i5, i4);
                    if (i3 == 1) {
                        int C = mo146184C();
                        if ((i2 < 0 && C == 0) || (i2 > 0 && C == (-t.getDownNestedScrollRange()))) {
                            C107207u.m145171l(view, 1);
                        }
                    }
                }
            }
        }

        /* renamed from: J */
        public void mo78308m(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int i3, int i4, int i5) {
            boolean z = true;
            if (i4 < 0) {
                CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
                T t2 = t;
                mo146186F(coordinatorLayout2, t2, mo146184C() - i4, -t.getDownNestedScrollRange(), 0);
                if (i5 == 1) {
                    int C = mo146184C();
                    if ((i4 < 0 && C == 0) || (i4 > 0 && C == (-t.getDownNestedScrollRange()))) {
                        C107207u.m145171l(view, 1);
                    }
                }
            }
            if (t.f309052p) {
                if (view.getScrollY() <= 0) {
                    z = false;
                }
                if (t.f309051o != z) {
                    t.f309051o = z;
                    t.refreshDrawableState();
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
            if (((r3.getTotalScrollRange() != 0) && r2.getHeight() - r4.getHeight() <= r3.getHeight()) != false) goto L_0x002b;
         */
        /* renamed from: K */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo5059s(androidx.coordinatorlayout.widget.CoordinatorLayout r2, T r3, android.view.View r4, android.view.View r5, int r6, int r7) {
            /*
                r1 = this;
                r5 = r6 & 2
                r6 = 1
                r0 = 0
                if (r5 == 0) goto L_0x002a
                boolean r5 = r3.f309052p
                if (r5 != 0) goto L_0x002b
                int r5 = r3.getTotalScrollRange()
                if (r5 == 0) goto L_0x0012
                r5 = 1
                goto L_0x0013
            L_0x0012:
                r5 = 0
            L_0x0013:
                if (r5 == 0) goto L_0x0026
                int r2 = r2.getHeight()
                int r4 = r4.getHeight()
                int r2 = r2 - r4
                int r3 = r3.getHeight()
                if (r2 > r3) goto L_0x0026
                r2 = 1
                goto L_0x0027
            L_0x0026:
                r2 = 0
            L_0x0027:
                if (r2 == 0) goto L_0x002a
                goto L_0x002b
            L_0x002a:
                r6 = 0
            L_0x002b:
                if (r6 == 0) goto L_0x0034
                android.animation.ValueAnimator r2 = r1.f309056r
                if (r2 == 0) goto L_0x0034
                r2.cancel()
            L_0x0034:
                r2 = 0
                r1.f309060v = r2
                r1.f309055q = r7
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.mo5059s(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, android.view.View, android.view.View, int, int):boolean");
        }

        /* renamed from: L */
        public final void mo146188L(CoordinatorLayout coordinatorLayout, T t) {
            boolean z;
            int C = mo146184C();
            int childCount = t.getChildCount();
            int i = 0;
            while (true) {
                z = true;
                if (i >= childCount) {
                    i = -1;
                    break;
                }
                View childAt = t.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if ((layoutParams.f193396a & 32) == 32) {
                    top -= layoutParams.topMargin;
                    bottom += layoutParams.bottomMargin;
                }
                int i2 = -C;
                if (top <= i2 && bottom >= i2) {
                    break;
                }
                i++;
            }
            if (i >= 0) {
                View childAt2 = t.getChildAt(i);
                LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                int i3 = layoutParams2.f193396a;
                if ((i3 & 17) == 17) {
                    int i4 = -childAt2.getTop();
                    int i5 = -childAt2.getBottom();
                    if (i == t.getChildCount() - 1) {
                        i5 += t.getTopInset();
                    }
                    if ((i3 & 2) == 2) {
                        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                        i5 += C107207u.C107208b.m145176d(childAt2);
                    } else {
                        if ((i3 & 5) == 5) {
                            WeakHashMap<View, C107168a0> weakHashMap2 = C107207u.f320808a;
                            int d = C107207u.C107208b.m145176d(childAt2) + i5;
                            if (C < d) {
                                i4 = d;
                            } else {
                                i5 = d;
                            }
                        }
                    }
                    if ((i3 & 32) != 32) {
                        z = false;
                    }
                    if (z) {
                        i4 += layoutParams2.topMargin;
                        i5 -= layoutParams2.bottomMargin;
                    }
                    if (C < (i5 + i4) / 2) {
                        i4 = i5;
                    }
                    mo146187G(coordinatorLayout, t, C16095a.m14980b(i4, -t.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:26:0x0063  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x0086  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x008d  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x0090  */
        /* renamed from: M */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo146189M(androidx.coordinatorlayout.widget.CoordinatorLayout r8, T r9, int r10, int r11, boolean r12) {
            /*
                r7 = this;
                int r0 = java.lang.Math.abs(r10)
                int r1 = r9.getChildCount()
                r2 = 0
                r3 = 0
            L_0x000a:
                r4 = 0
                if (r3 >= r1) goto L_0x0021
                android.view.View r5 = r9.getChildAt(r3)
                int r6 = r5.getTop()
                if (r0 < r6) goto L_0x001e
                int r6 = r5.getBottom()
                if (r0 > r6) goto L_0x001e
                goto L_0x0022
            L_0x001e:
                int r3 = r3 + 1
                goto L_0x000a
            L_0x0021:
                r5 = r4
            L_0x0022:
                if (r5 == 0) goto L_0x00d9
                android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$LayoutParams r0 = (com.google.android.material.appbar.AppBarLayout.LayoutParams) r0
                int r0 = r0.f193396a
                r1 = r0 & 1
                r3 = 1
                if (r1 == 0) goto L_0x005e
                java.util.WeakHashMap<android.view.View, e3.a0> r1 = p849e3.C107207u.f320808a
                int r1 = p849e3.C107207u.C107208b.m145176d(r5)
                if (r11 <= 0) goto L_0x004b
                r11 = r0 & 12
                if (r11 == 0) goto L_0x004b
                int r10 = -r10
                int r11 = r5.getBottom()
                int r11 = r11 - r1
                int r0 = r9.getTopInset()
                int r11 = r11 - r0
                if (r10 < r11) goto L_0x005e
                goto L_0x005c
            L_0x004b:
                r11 = r0 & 2
                if (r11 == 0) goto L_0x005e
                int r10 = -r10
                int r11 = r5.getBottom()
                int r11 = r11 - r1
                int r0 = r9.getTopInset()
                int r11 = r11 - r0
                if (r10 < r11) goto L_0x005e
            L_0x005c:
                r10 = 1
                goto L_0x005f
            L_0x005e:
                r10 = 0
            L_0x005f:
                boolean r11 = r9.f309052p
                if (r11 == 0) goto L_0x0082
                int r11 = r8.getChildCount()
                r0 = 0
            L_0x0068:
                if (r0 >= r11) goto L_0x0076
                android.view.View r1 = r8.getChildAt(r0)
                boolean r5 = r1 instanceof p849e3.C107199k
                if (r5 == 0) goto L_0x0073
                goto L_0x0077
            L_0x0073:
                int r0 = r0 + 1
                goto L_0x0068
            L_0x0076:
                r1 = r4
            L_0x0077:
                if (r1 == 0) goto L_0x0082
                int r10 = r1.getScrollY()
                if (r10 <= 0) goto L_0x0081
                r10 = 1
                goto L_0x0082
            L_0x0081:
                r10 = 0
            L_0x0082:
                boolean r11 = r9.f309051o
                if (r11 == r10) goto L_0x008d
                r9.f309051o = r10
                r9.refreshDrawableState()
                r10 = 1
                goto L_0x008e
            L_0x008d:
                r10 = 0
            L_0x008e:
                if (r12 != 0) goto L_0x00d6
                if (r10 == 0) goto L_0x00d9
                q2.a<android.view.View> r10 = r8.f306308e
                u.i<T, java.util.ArrayList<T>> r10 = r10.f330088b
                java.lang.Object r10 = r10.getOrDefault(r9, r4)
                java.util.List r10 = (java.util.List) r10
                java.util.List<android.view.View> r11 = r8.f306310g
                java.util.ArrayList r11 = (java.util.ArrayList) r11
                r11.clear()
                if (r10 == 0) goto L_0x00ac
                java.util.List<android.view.View> r11 = r8.f306310g
                java.util.ArrayList r11 = (java.util.ArrayList) r11
                r11.addAll(r10)
            L_0x00ac:
                java.util.List<android.view.View> r8 = r8.f306310g
                java.util.ArrayList r8 = (java.util.ArrayList) r8
                int r10 = r8.size()
                r11 = 0
            L_0x00b5:
                if (r11 >= r10) goto L_0x00d4
                java.lang.Object r12 = r8.get(r11)
                android.view.View r12 = (android.view.View) r12
                android.view.ViewGroup$LayoutParams r12 = r12.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$e r12 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C103717e) r12
                androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r12 = r12.f306328a
                boolean r0 = r12 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r0 == 0) goto L_0x00d1
                com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r12 = (com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) r12
                int r8 = r12.f309106i
                if (r8 == 0) goto L_0x00d4
                r2 = 1
                goto L_0x00d4
            L_0x00d1:
                int r11 = r11 + 1
                goto L_0x00b5
            L_0x00d4:
                if (r2 == 0) goto L_0x00d9
            L_0x00d6:
                r9.jumpDrawablesToCurrentState()
            L_0x00d9:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.mo146189M(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        /* renamed from: g */
        public boolean mo144927g(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((CoordinatorLayout.C103717e) appBarLayout.getLayoutParams()).height != -2) {
                return false;
            }
            coordinatorLayout.mo144920t(appBarLayout, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        /* renamed from: p */
        public void mo143315p(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (parcelable instanceof SavedState) {
                SavedState savedState = (SavedState) parcelable;
                Parcelable parcelable2 = savedState.f306434d;
                this.f309057s = savedState.f309062f;
                this.f309059u = savedState.f309063g;
                this.f309058t = savedState.f309064h;
                return;
            }
            this.f309057s = -1;
        }

        /* renamed from: q */
        public Parcelable mo143316q(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            int w = super.mo146259w();
            int childCount = appBarLayout.getChildCount();
            boolean z = false;
            int i = 0;
            while (i < childCount) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + w;
                if (childAt.getTop() + w > 0 || bottom < 0) {
                    i++;
                } else {
                    SavedState savedState = new SavedState(absSavedState);
                    savedState.f309062f = i;
                    WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                    if (bottom == C107207u.C107208b.m145176d(childAt) + appBarLayout.getTopInset()) {
                        z = true;
                    }
                    savedState.f309064h = z;
                    savedState.f309063g = ((float) bottom) / ((float) childAt.getHeight());
                    return savedState;
                }
            }
            return absSavedState;
        }

        /* renamed from: u */
        public void mo78309u(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.f309055q == 0 || i == 1) {
                mo146188L(coordinatorLayout, appBarLayout);
            }
            this.f309060v = new WeakReference<>(view2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
            r3 = r3.get();
         */
        /* renamed from: z */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo146190z(android.view.View r3) {
            /*
                r2 = this;
                com.google.android.material.appbar.AppBarLayout r3 = (com.google.android.material.appbar.AppBarLayout) r3
                com.google.android.material.appbar.AppBarLayout$BaseBehavior$a r0 = r2.f309061w
                if (r0 == 0) goto L_0x000b
                boolean r3 = r0.mo14405a(r3)
                goto L_0x0029
            L_0x000b:
                java.lang.ref.WeakReference<android.view.View> r3 = r2.f309060v
                r0 = 1
                if (r3 == 0) goto L_0x0028
                java.lang.Object r3 = r3.get()
                android.view.View r3 = (android.view.View) r3
                if (r3 == 0) goto L_0x0026
                boolean r1 = r3.isShown()
                if (r1 == 0) goto L_0x0026
                r1 = -1
                boolean r3 = r3.canScrollVertically(r1)
                if (r3 != 0) goto L_0x0026
                goto L_0x0028
            L_0x0026:
                r3 = 0
                goto L_0x0029
            L_0x0028:
                r3 = 1
            L_0x0029:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.mo146190z(android.view.View):boolean");
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public static class SavedState extends androidx.customview.view.AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new C104396a();

            /* renamed from: f */
            public int f309062f;

            /* renamed from: g */
            public float f309063g;

            /* renamed from: h */
            public boolean f309064h;

            /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$SavedState$a */
            public static class C104396a implements Parcelable.ClassLoaderCreator<SavedState> {
                public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new SavedState(parcel, classLoader);
                }

                public Object[] newArray(int i) {
                    return new SavedState[i];
                }

                public Object createFromParcel(Parcel parcel) {
                    return new SavedState(parcel, (ClassLoader) null);
                }
            }

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f309062f = parcel.readInt();
                this.f309063g = parcel.readFloat();
                this.f309064h = parcel.readByte() != 0;
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.f306434d, i);
                parcel.writeInt(this.f309062f);
                parcel.writeFloat(this.f309063g);
                parcel.writeByte(this.f309064h ? (byte) 1 : 0);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public AppBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f309043d = -1;
        this.f309044e = -1;
        this.f309045f = -1;
        this.f309047h = 0;
        setOrientation(1);
        int i = Build.VERSION.SDK_INT;
        setOutlineProvider(ViewOutlineProvider.BOUNDS);
        Context context2 = getContext();
        TypedArray d = C109991k.m149511d(context2, attributeSet, C104404d.f309117a, 0, C0966R.style.a3g, new int[0]);
        try {
            if (d.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context2, d.getResourceId(0, 0)));
            }
            d.recycle();
            TypedArray d2 = C109991k.m149511d(context, attributeSet, C107764a.f322501a, 0, C0966R.style.a3g, new int[0]);
            Drawable drawable = d2.getDrawable(0);
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            C107207u.C107208b.m145189q(this, drawable);
            if (d2.hasValue(4)) {
                mo146163d(d2.getBoolean(4, false), false, false);
            }
            if (d2.hasValue(3)) {
                C104404d.m139474a(this, (float) d2.getDimensionPixelSize(3, 0));
            }
            if (i >= 26) {
                if (d2.hasValue(2)) {
                    setKeyboardNavigationCluster(d2.getBoolean(2, false));
                }
                if (d2.hasValue(1)) {
                    setTouchscreenBlocksFocus(d2.getBoolean(1, false));
                }
            }
            this.f309052p = d2.getBoolean(5, false);
            d2.recycle();
            C107207u.C107213g.m145236u(this, new C104397a());
        } catch (Throwable th) {
            d.recycle();
            throw th;
        }
    }

    /* renamed from: generateDefaultLayoutParams  reason: collision with other method in class */
    public LinearLayout.LayoutParams m168892generateDefaultLayoutParams() {
        return new LayoutParams(-1, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* renamed from: generateLayoutParams  reason: collision with other method in class */
    public LinearLayout.LayoutParams m168893generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public static class LayoutParams extends LinearLayout.LayoutParams {

        /* renamed from: a */
        public int f193396a = 1;

        /* renamed from: b */
        public Interpolator f193397b;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C107764a.f322502b);
            this.f193396a = obtainStyledAttributes.getInt(0, 0);
            if (obtainStyledAttributes.hasValue(1)) {
                this.f193397b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(1, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
