package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.customview.view.AbsSavedState;
import com.tencent.p014mm.C0966R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import p1141p2.C110105a;
import p1143q2.C110349a;
import p1143q2.C110350b;
import p1162x2.C112019a;
import p329d3.C106986f;
import p329d3.C86167d;
import p385u2.C111105a;
import p849e3.C107168a0;
import p849e3.C107179f0;
import p849e3.C107201m;
import p849e3.C107203p;
import p849e3.C107204q;
import p849e3.C107207u;

public class CoordinatorLayout extends ViewGroup implements C107201m {

    /* renamed from: A */
    public static final ThreadLocal<Map<String, Constructor<Behavior>>> f306302A = new ThreadLocal<>();

    /* renamed from: B */
    public static final Comparator<View> f306303B = new C103719g();

    /* renamed from: C */
    public static final C86167d<Rect> f306304C = new C106986f(12);

    /* renamed from: y */
    public static final String f306305y;

    /* renamed from: z */
    public static final Class<?>[] f306306z = {Context.class, AttributeSet.class};

    /* renamed from: d */
    public final List<View> f306307d;

    /* renamed from: e */
    public final C110349a<View> f306308e;

    /* renamed from: f */
    public final List<View> f306309f;

    /* renamed from: g */
    public final List<View> f306310g;

    /* renamed from: h */
    public final int[] f306311h;

    /* renamed from: i */
    public boolean f306312i;

    /* renamed from: j */
    public boolean f306313j;

    /* renamed from: n */
    public int[] f306314n;

    /* renamed from: o */
    public View f306315o;

    /* renamed from: p */
    public View f306316p;

    /* renamed from: q */
    public C103718f f306317q;

    /* renamed from: r */
    public boolean f306318r;

    /* renamed from: s */
    public C107179f0 f306319s;

    /* renamed from: t */
    public boolean f306320t;

    /* renamed from: u */
    public Drawable f306321u;

    /* renamed from: v */
    public ViewGroup.OnHierarchyChangeListener f306322v;

    /* renamed from: w */
    public C107204q f306323w;

    /* renamed from: x */
    public final C107203p f306324x;

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$b */
    public interface C54199b {
        Behavior getBehavior();
    }

    public static abstract class Behavior<V extends View> {
        public Behavior() {
        }

        /* renamed from: a */
        public boolean mo144925a(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        /* renamed from: b */
        public boolean mo842b(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* renamed from: c */
        public void mo144926c(C103717e eVar) {
        }

        /* renamed from: d */
        public boolean mo133275d(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* renamed from: e */
        public boolean mo143313e(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: f */
        public boolean mo94960f(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        /* renamed from: g */
        public boolean mo144927g(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        /* renamed from: h */
        public boolean mo95459h(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2, boolean z) {
            return false;
        }

        /* renamed from: i */
        public boolean mo95460i(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
            return false;
        }

        @Deprecated
        /* renamed from: j */
        public void mo143314j(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        }

        /* renamed from: k */
        public void mo94961k(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
            if (i3 == 0) {
                mo143314j(coordinatorLayout, v, view, i, i2, iArr);
            }
        }

        @Deprecated
        /* renamed from: l */
        public void mo144928l(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        }

        /* renamed from: m */
        public void mo78308m(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                mo144928l(coordinatorLayout, v, view, i, i2, i3, i4);
            }
        }

        /* renamed from: n */
        public void mo144929n(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        }

        /* renamed from: o */
        public boolean mo144930o(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        /* renamed from: p */
        public void mo143315p(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        /* renamed from: q */
        public Parcelable mo143316q(CoordinatorLayout coordinatorLayout, V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        /* renamed from: r */
        public boolean mo143317r(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
            return false;
        }

        /* renamed from: s */
        public boolean mo5059s(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                return mo143317r(coordinatorLayout, v, view, view2, i);
            }
            return false;
        }

        @Deprecated
        /* renamed from: t */
        public void mo143318t(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        /* renamed from: u */
        public void mo78309u(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
            if (i == 0) {
                mo143318t(coordinatorLayout, v, view);
            }
        }

        /* renamed from: v */
        public boolean mo843v(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$a */
    public class C103714a implements C107204q {
        public C103714a() {
        }

        /* renamed from: a */
        public C107179f0 mo12075a(View view, C107179f0 f0Var) {
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            if (!Objects.equals(coordinatorLayout.f306319s, f0Var)) {
                coordinatorLayout.f306319s = f0Var;
                boolean z = true;
                boolean z2 = f0Var != null && f0Var.mo157632d() > 0;
                coordinatorLayout.f306320t = z2;
                if (z2 || coordinatorLayout.getBackground() != null) {
                    z = false;
                }
                coordinatorLayout.setWillNotDraw(z);
                if (!f0Var.f320766a.mo157656m()) {
                    int childCount = coordinatorLayout.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = coordinatorLayout.getChildAt(i);
                        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                        if (C107207u.C107208b.m145174b(childAt) && ((C103717e) childAt.getLayoutParams()).f306328a != null && f0Var.f320766a.mo157656m()) {
                            break;
                        }
                    }
                }
                coordinatorLayout.requestLayout();
            }
            return f0Var;
        }
    }

    @Deprecated
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$c */
    public @interface C103715c {
        Class<? extends Behavior> value();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$d */
    public class C103716d implements ViewGroup.OnHierarchyChangeListener {
        public C103716d() {
        }

        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f306322v;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.mo144910r(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f306322v;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$f */
    public class C103718f implements ViewTreeObserver.OnPreDrawListener {
        public C103718f() {
        }

        public boolean onPreDraw() {
            CoordinatorLayout.this.mo144910r(0);
            return true;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$g */
    public static class C103719g implements Comparator<View> {
        public int compare(Object obj, Object obj2) {
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            float m = C107207u.C107213g.m145228m((View) obj);
            float m2 = C107207u.C107213g.m145228m((View) obj2);
            if (m > m2) {
                return -1;
            }
            return m < m2 ? 1 : 0;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<androidx.coordinatorlayout.widget.CoordinatorLayout> r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.class
            java.lang.Package r0 = r0.getPackage()
            if (r0 == 0) goto L_0x000d
            java.lang.String r0 = r0.getName()
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            f306305y = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$g
            r0.<init>()
            f306303B = r0
            r0 = 2
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            r1 = 1
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r0[r1] = r2
            f306306z = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            f306302A = r0
            d3.f r0 = new d3.f
            r1 = 12
            r0.<init>(r1)
            f306304C = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.<clinit>():void");
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0966R.attr.f2773ii);
    }

    /* renamed from: e */
    public static Rect m138003e() {
        Rect rect = (Rect) ((C106986f) f306304C).mo157419a();
        return rect == null ? new Rect() : rect;
    }

    /* renamed from: y */
    public static void m138004y(Rect rect) {
        rect.setEmpty();
        ((C106986f) f306304C).mo157420b(rect);
    }

    /* renamed from: A */
    public final void mo144871A(View view, int i) {
        C103717e eVar = (C103717e) view.getLayoutParams();
        int i2 = eVar.f306336i;
        if (i2 != i) {
            C107207u.m145165f(view, i - i2);
            eVar.f306336i = i;
        }
    }

    /* renamed from: B */
    public final void mo144872B(View view, int i) {
        C103717e eVar = (C103717e) view.getLayoutParams();
        int i2 = eVar.f306337j;
        if (i2 != i) {
            C107207u.m145166g(view, i - i2);
            eVar.f306337j = i;
        }
    }

    /* renamed from: C */
    public final void mo144873C() {
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        if (C107207u.C107208b.m145174b(this)) {
            if (this.f306323w == null) {
                this.f306323w = new C103714a();
            }
            C107207u.C107213g.m145236u(this, this.f306323w);
            setSystemUiVisibility(1280);
            return;
        }
        C107207u.C107213g.m145236u(this, (C107204q) null);
    }

    /* renamed from: Z */
    public boolean mo77716Z(View view, View view2, int i, int i2) {
        int i3 = i2;
        int childCount = getChildCount();
        boolean z = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C103717e eVar = (C103717e) childAt.getLayoutParams();
                Behavior behavior = eVar.f306328a;
                if (behavior != null) {
                    boolean s = behavior.mo5059s(this, childAt, view, view2, i, i2);
                    z |= s;
                    if (i3 == 0) {
                        eVar.f306341n = s;
                    } else if (i3 == 1) {
                        eVar.f306342o = s;
                    }
                } else if (i3 == 0) {
                    eVar.f306341n = false;
                } else if (i3 == 1) {
                    eVar.f306342o = false;
                }
            }
        }
        return z;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C103717e) && super.checkLayoutParams(layoutParams);
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        Behavior behavior = ((C103717e) view.getLayoutParams()).f306328a;
        if (behavior != null) {
            behavior.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f306321u;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* renamed from: f */
    public final void mo144877f(C103717e eVar, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + eVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - eVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + eVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - eVar.bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    /* renamed from: g */
    public void mo77725g(View view, View view2, int i, int i2) {
        Behavior behavior;
        this.f306324x.mo157675a(view, view2, i, i2);
        this.f306316p = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            C103717e eVar = (C103717e) childAt.getLayoutParams();
            if (eVar.mo144937a(i2) && (behavior = eVar.f306328a) != null) {
                behavior.mo144929n(this, childAt, view, view2, i, i2);
            }
        }
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C103717e(-2, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C103717e(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        mo144923x();
        return Collections.unmodifiableList(this.f306307d);
    }

    public final C107179f0 getLastWindowInsets() {
        return this.f306319s;
    }

    public int getNestedScrollAxes() {
        C107203p pVar = this.f306324x;
        return pVar.f320806b | pVar.f320805a;
    }

    public Drawable getStatusBarBackground() {
        return this.f306321u;
    }

    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    /* renamed from: h */
    public void mo144887h(View view) {
        List orDefault = this.f306308e.f330088b.getOrDefault(view, null);
        if (orDefault != null && !orDefault.isEmpty()) {
            for (int i = 0; i < orDefault.size(); i++) {
                View view2 = (View) orDefault.get(i);
                Behavior behavior = ((C103717e) view2.getLayoutParams()).f306328a;
                if (behavior != null) {
                    behavior.mo133275d(this, view2, view);
                }
            }
        }
    }

    /* renamed from: i */
    public void mo77718i(View view, int i) {
        this.f306324x.mo157676b(view, i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C103717e eVar = (C103717e) childAt.getLayoutParams();
            if (eVar.mo144937a(i)) {
                Behavior behavior = eVar.f306328a;
                if (behavior != null) {
                    behavior.mo78309u(this, childAt, view, i);
                }
                if (i == 0) {
                    eVar.f306341n = false;
                } else if (i == 1) {
                    eVar.f306342o = false;
                }
                eVar.f306343p = false;
            }
        }
        this.f306316p = null;
    }

    /* renamed from: j */
    public void mo77727j(View view, int i, int i2, int i3, int i4, int i5) {
        Behavior behavior;
        int childCount = getChildCount();
        boolean z = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() == 8) {
                int i7 = i5;
            } else {
                C103717e eVar = (C103717e) childAt.getLayoutParams();
                if (eVar.mo144937a(i5) && (behavior = eVar.f306328a) != null) {
                    behavior.mo78308m(this, childAt, view, i, i2, i3, i4, i5);
                    z = true;
                }
            }
        }
        if (z) {
            mo144910r(1);
        }
    }

    /* renamed from: k */
    public void mo144888k(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            mo144890m(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: l */
    public List<View> mo144889l(View view) {
        C110349a<View> aVar = this.f306308e;
        int i = aVar.f330088b.f332583f;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList l = aVar.f330088b.mo162791l(i2);
            if (l != null && l.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(aVar.f330088b.mo162789j(i2));
            }
        }
        ((ArrayList) this.f306310g).clear();
        if (arrayList != null) {
            ((ArrayList) this.f306310g).addAll(arrayList);
        }
        return this.f306310g;
    }

    /* renamed from: m */
    public void mo144890m(View view, Rect rect) {
        ThreadLocal<Matrix> threadLocal = C110350b.f330091a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal<Matrix> threadLocal2 = C110350b.f330091a;
        Matrix matrix = threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        C110350b.m150170a(this, view, matrix);
        ThreadLocal<RectF> threadLocal3 = C110350b.f330092b;
        RectF rectF = threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    /* renamed from: n */
    public void mo77719n(View view, int i, int i2, int[] iArr, int i3) {
        Behavior behavior;
        int childCount = getChildCount();
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() == 8) {
                int i7 = i3;
            } else {
                C103717e eVar = (C103717e) childAt.getLayoutParams();
                if (eVar.mo144937a(i3) && (behavior = eVar.f306328a) != null) {
                    int[] iArr2 = this.f306311h;
                    iArr2[1] = 0;
                    iArr2[0] = 0;
                    behavior.mo94961k(this, childAt, view, i, i2, iArr2, i3);
                    int[] iArr3 = this.f306311h;
                    i4 = i > 0 ? Math.max(i4, iArr3[0]) : Math.min(i4, iArr3[0]);
                    int[] iArr4 = this.f306311h;
                    i5 = i2 > 0 ? Math.max(i5, iArr4[1]) : Math.min(i5, iArr4[1]);
                    z = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z) {
            mo144910r(1);
        }
    }

    /* renamed from: o */
    public final void mo144891o(View view, int i, Rect rect, Rect rect2, C103717e eVar, int i2, int i3) {
        int i4 = eVar.f306330c;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = eVar.f306331d;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & 112) == 0) {
            i5 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        int width = i8 != 1 ? i8 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i9 != 16 ? i9 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i6 == 1) {
            width -= i2 / 2;
        } else if (i6 != 5) {
            width -= i2;
        }
        if (i7 == 16) {
            height -= i3 / 2;
        } else if (i7 != 80) {
            height -= i3;
        }
        rect2.set(width, height, i2 + width, i3 + height);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo144924z(false);
        if (this.f306318r) {
            if (this.f306317q == null) {
                this.f306317q = new C103718f();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f306317q);
        }
        if (this.f306319s == null) {
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            if (C107207u.C107208b.m145174b(this)) {
                C107207u.C107212f.m145215c(this);
            }
        }
        this.f306313j = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo144924z(false);
        if (this.f306318r && this.f306317q != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f306317q);
        }
        View view = this.f306316p;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f306313j = false;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f306320t && this.f306321u != null) {
            C107179f0 f0Var = this.f306319s;
            int d = f0Var != null ? f0Var.mo157632d() : 0;
            if (d > 0) {
                this.f306321u.setBounds(0, 0, getWidth(), d);
                this.f306321u.draw(canvas);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            mo144924z(true);
        }
        boolean w = mo144922w(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            mo144924z(true);
        }
        return w;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Behavior behavior;
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        int d = C107207u.C107209c.m145195d(this);
        int size = ((ArrayList) this.f306307d).size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) ((ArrayList) this.f306307d).get(i5);
            if (view.getVisibility() != 8 && ((behavior = ((C103717e) view.getLayoutParams()).f306328a) == null || !behavior.mo94960f(this, view, d))) {
                mo144913s(view, d);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0198, code lost:
        if (r0.mo144927g(r30, r20, r8, r21, r23, 0) == false) goto L_0x01a8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x019b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r31, int r32) {
        /*
            r30 = this;
            r7 = r30
            r30.mo144923x()
            int r0 = r30.getChildCount()
            r8 = 0
            r1 = 0
        L_0x000b:
            r2 = 1
            if (r1 >= r0) goto L_0x0038
            android.view.View r3 = r7.getChildAt(r1)
            q2.a<android.view.View> r4 = r7.f306308e
            u.i<T, java.util.ArrayList<T>> r5 = r4.f330088b
            int r5 = r5.f332583f
            r6 = 0
        L_0x0019:
            if (r6 >= r5) goto L_0x0030
            u.i<T, java.util.ArrayList<T>> r9 = r4.f330088b
            java.lang.Object r9 = r9.mo162791l(r6)
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            if (r9 == 0) goto L_0x002d
            boolean r9 = r9.contains(r3)
            if (r9 == 0) goto L_0x002d
            r3 = 1
            goto L_0x0031
        L_0x002d:
            int r6 = r6 + 1
            goto L_0x0019
        L_0x0030:
            r3 = 0
        L_0x0031:
            if (r3 == 0) goto L_0x0035
            r0 = 1
            goto L_0x0039
        L_0x0035:
            int r1 = r1 + 1
            goto L_0x000b
        L_0x0038:
            r0 = 0
        L_0x0039:
            boolean r1 = r7.f306318r
            if (r0 == r1) goto L_0x006d
            if (r0 == 0) goto L_0x005a
            boolean r0 = r7.f306313j
            if (r0 == 0) goto L_0x0057
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r0 = r7.f306317q
            if (r0 != 0) goto L_0x004e
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$f
            r0.<init>()
            r7.f306317q = r0
        L_0x004e:
            android.view.ViewTreeObserver r0 = r30.getViewTreeObserver()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r1 = r7.f306317q
            r0.addOnPreDrawListener(r1)
        L_0x0057:
            r7.f306318r = r2
            goto L_0x006d
        L_0x005a:
            boolean r0 = r7.f306313j
            if (r0 == 0) goto L_0x006b
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r0 = r7.f306317q
            if (r0 == 0) goto L_0x006b
            android.view.ViewTreeObserver r0 = r30.getViewTreeObserver()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r1 = r7.f306317q
            r0.removeOnPreDrawListener(r1)
        L_0x006b:
            r7.f306318r = r8
        L_0x006d:
            int r9 = r30.getPaddingLeft()
            int r0 = r30.getPaddingTop()
            int r10 = r30.getPaddingRight()
            int r1 = r30.getPaddingBottom()
            java.util.WeakHashMap<android.view.View, e3.a0> r3 = p849e3.C107207u.f320808a
            int r11 = p849e3.C107207u.C107209c.m145195d(r30)
            if (r11 != r2) goto L_0x0087
            r12 = 1
            goto L_0x0088
        L_0x0087:
            r12 = 0
        L_0x0088:
            int r13 = android.view.View.MeasureSpec.getMode(r31)
            int r14 = android.view.View.MeasureSpec.getSize(r31)
            int r15 = android.view.View.MeasureSpec.getMode(r32)
            int r16 = android.view.View.MeasureSpec.getSize(r32)
            int r17 = r9 + r10
            int r18 = r0 + r1
            int r0 = r30.getSuggestedMinimumWidth()
            int r1 = r30.getSuggestedMinimumHeight()
            e3.f0 r3 = r7.f306319s
            if (r3 == 0) goto L_0x00b1
            boolean r3 = p849e3.C107207u.C107208b.m145174b(r30)
            if (r3 == 0) goto L_0x00b1
            r19 = 1
            goto L_0x00b3
        L_0x00b1:
            r19 = 0
        L_0x00b3:
            java.util.List<android.view.View> r2 = r7.f306307d
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r6 = r2.size()
            r5 = r0
            r4 = r1
            r2 = 0
            r3 = 0
        L_0x00bf:
            if (r3 >= r6) goto L_0x01ee
            java.util.List<android.view.View> r0 = r7.f306307d
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r0 = r0.get(r3)
            r20 = r0
            android.view.View r20 = (android.view.View) r20
            int r0 = r20.getVisibility()
            r1 = 8
            if (r0 != r1) goto L_0x00dd
            r22 = r3
            r29 = r6
            r28 = r9
            goto L_0x01e5
        L_0x00dd:
            android.view.ViewGroup$LayoutParams r0 = r20.getLayoutParams()
            r1 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$e r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C103717e) r1
            int r0 = r1.f306332e
            if (r0 < 0) goto L_0x013b
            if (r13 == 0) goto L_0x013b
            int[] r8 = r7.f306314n
            if (r8 != 0) goto L_0x00f5
            r30.toString()
            r22 = r2
        L_0x00f3:
            r0 = 0
            goto L_0x0104
        L_0x00f5:
            r22 = r2
            if (r0 < 0) goto L_0x0100
            int r2 = r8.length
            if (r0 < r2) goto L_0x00fd
            goto L_0x0100
        L_0x00fd:
            r0 = r8[r0]
            goto L_0x0104
        L_0x0100:
            r30.toString()
            goto L_0x00f3
        L_0x0104:
            int r2 = r1.f306330c
            if (r2 != 0) goto L_0x010b
            r2 = 8388661(0x800035, float:1.1755018E-38)
        L_0x010b:
            int r2 = android.view.Gravity.getAbsoluteGravity(r2, r11)
            r2 = r2 & 7
            r8 = 3
            if (r2 != r8) goto L_0x0116
            if (r12 == 0) goto L_0x011b
        L_0x0116:
            r8 = 5
            if (r2 != r8) goto L_0x0127
            if (r12 == 0) goto L_0x0127
        L_0x011b:
            int r2 = r14 - r10
            int r2 = r2 - r0
            r0 = 0
            int r2 = java.lang.Math.max(r0, r2)
            r21 = r2
            r8 = 0
            goto L_0x013f
        L_0x0127:
            if (r2 != r8) goto L_0x012b
            if (r12 == 0) goto L_0x0130
        L_0x012b:
            r8 = 3
            if (r2 != r8) goto L_0x0139
            if (r12 == 0) goto L_0x0139
        L_0x0130:
            int r0 = r0 - r9
            r8 = 0
            int r0 = java.lang.Math.max(r8, r0)
            r21 = r0
            goto L_0x013f
        L_0x0139:
            r8 = 0
            goto L_0x013d
        L_0x013b:
            r22 = r2
        L_0x013d:
            r21 = 0
        L_0x013f:
            if (r19 == 0) goto L_0x0171
            boolean r0 = p849e3.C107207u.C107208b.m145174b(r20)
            if (r0 != 0) goto L_0x0171
            e3.f0 r0 = r7.f306319s
            int r0 = r0.mo157630b()
            e3.f0 r2 = r7.f306319s
            int r2 = r2.mo157631c()
            int r0 = r0 + r2
            e3.f0 r2 = r7.f306319s
            int r2 = r2.mo157632d()
            e3.f0 r8 = r7.f306319s
            int r8 = r8.mo157629a()
            int r2 = r2 + r8
            int r0 = r14 - r0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r13)
            int r2 = r16 - r2
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r15)
            r8 = r0
            r23 = r2
            goto L_0x0175
        L_0x0171:
            r8 = r31
            r23 = r32
        L_0x0175:
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r0 = r1.f306328a
            if (r0 == 0) goto L_0x019b
            r24 = 0
            r2 = r1
            r1 = r30
            r26 = r2
            r25 = r22
            r2 = r20
            r22 = r3
            r3 = r8
            r27 = r4
            r4 = r21
            r28 = r9
            r9 = r5
            r5 = r23
            r29 = r6
            r6 = r24
            boolean r0 = r0.mo144927g(r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L_0x01b5
            goto L_0x01a8
        L_0x019b:
            r26 = r1
            r27 = r4
            r29 = r6
            r28 = r9
            r25 = r22
            r22 = r3
            r9 = r5
        L_0x01a8:
            r5 = 0
            r0 = r30
            r1 = r20
            r2 = r8
            r3 = r21
            r4 = r23
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
        L_0x01b5:
            int r0 = r20.getMeasuredWidth()
            int r0 = r17 + r0
            r1 = r26
            int r2 = r1.leftMargin
            int r0 = r0 + r2
            int r2 = r1.rightMargin
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r9, r0)
            int r2 = r20.getMeasuredHeight()
            int r2 = r18 + r2
            int r3 = r1.topMargin
            int r2 = r2 + r3
            int r1 = r1.bottomMargin
            int r2 = r2 + r1
            r1 = r27
            int r1 = java.lang.Math.max(r1, r2)
            int r2 = r20.getMeasuredState()
            r8 = r25
            int r2 = android.view.View.combineMeasuredStates(r8, r2)
            r5 = r0
            r4 = r1
        L_0x01e5:
            int r3 = r22 + 1
            r9 = r28
            r6 = r29
            r8 = 0
            goto L_0x00bf
        L_0x01ee:
            r8 = r2
            r1 = r4
            r9 = r5
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r8
            r2 = r31
            int r0 = android.view.View.resolveSizeAndState(r9, r2, r0)
            int r2 = r8 << 16
            r3 = r32
            int r1 = android.view.View.resolveSizeAndState(r1, r3, r2)
            r7.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        Behavior behavior;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C103717e eVar = (C103717e) childAt.getLayoutParams();
                if (eVar.mo144937a(0) && (behavior = eVar.f306328a) != null) {
                    z2 |= behavior.mo95459h(this, childAt, view, f, f2, z);
                }
            }
        }
        if (z2) {
            mo144910r(1);
        }
        return z2;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        Behavior behavior;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C103717e eVar = (C103717e) childAt.getLayoutParams();
                if (eVar.mo144937a(0) && (behavior = eVar.f306328a) != null) {
                    z |= behavior.mo95460i(this, childAt, view, f, f2);
                }
            }
        }
        return z;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo77719n(view, i, i2, iArr, 0);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo77727j(view, i, i2, i3, i4, 0);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo77725g(view, view2, i, 0);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f306434d);
        SparseArray<Parcelable> sparseArray = savedState.f306325f;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            Behavior behavior = mo144908p(childAt).f306328a;
            if (!(id == -1 || behavior == null || (parcelable2 = sparseArray.get(id)) == null)) {
                behavior.mo143315p(this, childAt, parcelable2);
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        Parcelable q;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            Behavior behavior = ((C103717e) childAt.getLayoutParams()).f306328a;
            if (!(id == -1 || behavior == null || (q = behavior.mo143316q(this, childAt)) == null)) {
                sparseArray.append(id, q);
            }
        }
        savedState.f306325f = sparseArray;
        return savedState;
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo77716Z(view, view2, i, 0);
    }

    public void onStopNestedScroll(View view) {
        mo77718i(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r3 != false) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f306315o
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0015
            boolean r3 = r0.mo144922w(r1, r4)
            if (r3 == 0) goto L_0x0029
            goto L_0x0016
        L_0x0015:
            r3 = 0
        L_0x0016:
            android.view.View r6 = r0.f306315o
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$e r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C103717e) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r6 = r6.f306328a
            if (r6 == 0) goto L_0x0029
            android.view.View r7 = r0.f306315o
            boolean r6 = r6.mo843v(r0, r7, r1)
            goto L_0x002a
        L_0x0029:
            r6 = 0
        L_0x002a:
            android.view.View r7 = r0.f306315o
            r8 = 0
            if (r7 != 0) goto L_0x0035
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L_0x0048
        L_0x0035:
            if (r3 == 0) goto L_0x0048
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L_0x0048:
            if (r8 == 0) goto L_0x004d
            r8.recycle()
        L_0x004d:
            if (r2 == r4) goto L_0x0052
            r1 = 3
            if (r2 != r1) goto L_0x0055
        L_0x0052:
            r0.mo144924z(r5)
        L_0x0055:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public C103717e mo144908p(View view) {
        C103717e eVar = (C103717e) view.getLayoutParams();
        if (!eVar.f306329b) {
            if (view instanceof C54199b) {
                eVar.mo144938b(((C54199b) view).getBehavior());
                eVar.f306329b = true;
            } else {
                C103715c cVar = null;
                for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    cVar = (C103715c) cls.getAnnotation(C103715c.class);
                    if (cVar != null) {
                        break;
                    }
                }
                if (cVar != null) {
                    try {
                        eVar.mo144938b((Behavior) cVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception unused) {
                        cVar.value().getName();
                    }
                }
                eVar.f306329b = true;
            }
        }
        return eVar;
    }

    /* renamed from: q */
    public boolean mo144909q(View view, int i, int i2) {
        Rect e = m138003e();
        mo144890m(view, e);
        try {
            return e.contains(i, i2);
        } finally {
            m138004y(e);
        }
    }

    /* renamed from: r */
    public final void mo144910r(int i) {
        int i2;
        int i3;
        Rect rect;
        int i4;
        boolean z;
        boolean z2;
        int width;
        int i5;
        int i6;
        int i7;
        int height;
        int i8;
        int i9;
        int i15;
        int i16;
        C103717e eVar;
        int i17;
        Rect rect2;
        int i18;
        View view;
        boolean z3;
        int i19;
        C103717e eVar2;
        Behavior behavior;
        int i25 = i;
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        int d = C107207u.C107209c.m145195d(this);
        int size = ((ArrayList) this.f306307d).size();
        Rect e = m138003e();
        Rect e2 = m138003e();
        Rect e3 = m138003e();
        int i26 = 0;
        while (i26 < size) {
            View view2 = (View) ((ArrayList) this.f306307d).get(i26);
            C103717e eVar3 = (C103717e) view2.getLayoutParams();
            if (i25 == 0 && view2.getVisibility() == 8) {
                i2 = i26;
                i3 = i25;
                i4 = size;
                rect = e3;
            } else {
                int i27 = 0;
                while (i27 < i26) {
                    if (eVar3.f306339l == ((View) ((ArrayList) this.f306307d).get(i27))) {
                        C103717e eVar4 = (C103717e) view2.getLayoutParams();
                        if (eVar4.f306338k != null) {
                            Rect e4 = m138003e();
                            Rect e5 = m138003e();
                            Rect e6 = m138003e();
                            mo144890m(eVar4.f306338k, e4);
                            mo144888k(view2, false, e5);
                            int measuredWidth = view2.getMeasuredWidth();
                            i18 = size;
                            int measuredHeight = view2.getMeasuredHeight();
                            rect2 = e3;
                            Rect rect3 = e5;
                            Rect rect4 = e4;
                            C103717e eVar5 = eVar4;
                            int i28 = measuredWidth;
                            i17 = i27;
                            eVar = eVar3;
                            view = view2;
                            i16 = i26;
                            mo144891o(view2, d, rect4, e6, eVar5, i28, measuredHeight);
                            if (e6.left == rect3.left && e6.top == rect3.top) {
                                i19 = i28;
                                eVar2 = eVar5;
                                z3 = false;
                            } else {
                                i19 = i28;
                                eVar2 = eVar5;
                                z3 = true;
                            }
                            mo144877f(eVar2, e6, i19, measuredHeight);
                            int i29 = e6.left - rect3.left;
                            int i35 = e6.top - rect3.top;
                            if (i29 != 0) {
                                C107207u.m145165f(view, i29);
                            }
                            if (i35 != 0) {
                                C107207u.m145166g(view, i35);
                            }
                            if (z3 && (behavior = eVar2.f306328a) != null) {
                                behavior.mo133275d(this, view, eVar2.f306338k);
                            }
                            m138004y(rect4);
                            m138004y(rect3);
                            m138004y(e6);
                            i27 = i17 + 1;
                            view2 = view;
                            size = i18;
                            e3 = rect2;
                            eVar3 = eVar;
                            i26 = i16;
                            int i36 = i;
                        }
                    }
                    i17 = i27;
                    eVar = eVar3;
                    view = view2;
                    i16 = i26;
                    i18 = size;
                    rect2 = e3;
                    i27 = i17 + 1;
                    view2 = view;
                    size = i18;
                    e3 = rect2;
                    eVar3 = eVar;
                    i26 = i16;
                    int i362 = i;
                }
                View view3 = view2;
                i2 = i26;
                int i37 = size;
                Rect rect5 = e3;
                mo144888k(view3, true, e2);
                C103717e eVar6 = eVar3;
                if (eVar6.f306334g != 0 && !e2.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(eVar6.f306334g, d);
                    int i38 = absoluteGravity & 112;
                    if (i38 == 48) {
                        e.top = Math.max(e.top, e2.bottom);
                    } else if (i38 == 80) {
                        e.bottom = Math.max(e.bottom, getHeight() - e2.top);
                    }
                    int i39 = absoluteGravity & 7;
                    if (i39 == 3) {
                        e.left = Math.max(e.left, e2.right);
                    } else if (i39 == 5) {
                        e.right = Math.max(e.right, getWidth() - e2.left);
                    }
                }
                if (eVar6.f306335h != 0 && view3.getVisibility() == 0) {
                    WeakHashMap<View, C107168a0> weakHashMap2 = C107207u.f320808a;
                    if (C107207u.C107211e.m145208c(view3) && view3.getWidth() > 0 && view3.getHeight() > 0) {
                        C103717e eVar7 = (C103717e) view3.getLayoutParams();
                        Behavior behavior2 = eVar7.f306328a;
                        Rect e7 = m138003e();
                        Rect e8 = m138003e();
                        e8.set(view3.getLeft(), view3.getTop(), view3.getRight(), view3.getBottom());
                        if (behavior2 == null || !behavior2.mo144925a(this, view3, e7)) {
                            e7.set(e8);
                        } else if (!e8.contains(e7)) {
                            throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + e7.toShortString() + " | Bounds:" + e8.toShortString());
                        }
                        m138004y(e8);
                        if (e7.isEmpty()) {
                            m138004y(e7);
                        } else {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(eVar7.f306335h, d);
                            if ((absoluteGravity2 & 48) != 48 || (i9 = (e7.top - eVar7.topMargin) - eVar7.f306337j) >= (i15 = e.top)) {
                                z = false;
                            } else {
                                mo144872B(view3, i15 - i9);
                                z = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - e7.bottom) - eVar7.bottomMargin) + eVar7.f306337j) < (i8 = e.bottom)) {
                                mo144872B(view3, height - i8);
                                z = true;
                            }
                            if (!z) {
                                mo144872B(view3, 0);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i6 = (e7.left - eVar7.leftMargin) - eVar7.f306336i) >= (i7 = e.left)) {
                                z2 = false;
                            } else {
                                mo144871A(view3, i7 - i6);
                                z2 = true;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - e7.right) - eVar7.rightMargin) + eVar7.f306336i) < (i5 = e.right)) {
                                mo144871A(view3, width - i5);
                                z2 = true;
                            }
                            if (!z2) {
                                mo144871A(view3, 0);
                            }
                            m138004y(e7);
                        }
                    }
                }
                i3 = i;
                if (i3 != 2) {
                    rect = rect5;
                    rect.set(((C103717e) view3.getLayoutParams()).f306344q);
                    if (rect.equals(e2)) {
                        i4 = i37;
                    } else {
                        ((C103717e) view3.getLayoutParams()).f306344q.set(e2);
                    }
                } else {
                    rect = rect5;
                }
                i4 = i37;
                for (int i44 = i2 + 1; i44 < i4; i44++) {
                    View view4 = (View) ((ArrayList) this.f306307d).get(i44);
                    C103717e eVar8 = (C103717e) view4.getLayoutParams();
                    Behavior behavior3 = eVar8.f306328a;
                    if (behavior3 != null && behavior3.mo842b(this, view4, view3)) {
                        if (i3 != 0 || !eVar8.f306343p) {
                            boolean d2 = i3 != 2 ? behavior3.mo133275d(this, view4, view3) : true;
                            if (i3 == 1) {
                                eVar8.f306343p = d2;
                            }
                        } else {
                            eVar8.f306343p = false;
                        }
                    }
                }
            }
            i26 = i2 + 1;
            i25 = i3;
            size = i4;
            e3 = rect;
        }
        m138004y(e);
        m138004y(e2);
        m138004y(e3);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        Behavior behavior = ((C103717e) view.getLayoutParams()).f306328a;
        if (behavior == null || !behavior.mo144930o(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.f306312i) {
            mo144924z(false);
            this.f306312i = true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b5  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo144913s(android.view.View r14, int r15) {
        /*
            r13 = this;
            android.view.ViewGroup$LayoutParams r0 = r14.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$e r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C103717e) r0
            android.view.View r1 = r0.f306338k
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0013
            int r4 = r0.f306333f
            r5 = -1
            if (r4 == r5) goto L_0x0013
            r4 = 1
            goto L_0x0014
        L_0x0013:
            r4 = 0
        L_0x0014:
            if (r4 != 0) goto L_0x0195
            if (r1 == 0) goto L_0x005a
            android.graphics.Rect r0 = m138003e()
            android.graphics.Rect r2 = m138003e()
            r13.mo144890m(r1, r0)     // Catch:{ all -> 0x0052 }
            android.view.ViewGroup$LayoutParams r1 = r14.getLayoutParams()     // Catch:{ all -> 0x0052 }
            androidx.coordinatorlayout.widget.CoordinatorLayout$e r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C103717e) r1     // Catch:{ all -> 0x0052 }
            int r3 = r14.getMeasuredWidth()     // Catch:{ all -> 0x0052 }
            int r4 = r14.getMeasuredHeight()     // Catch:{ all -> 0x0052 }
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r0
            r9 = r2
            r10 = r1
            r11 = r3
            r12 = r4
            r5.mo144891o(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0052 }
            r13.mo144877f(r1, r2, r3, r4)     // Catch:{ all -> 0x0052 }
            int r15 = r2.left     // Catch:{ all -> 0x0052 }
            int r1 = r2.top     // Catch:{ all -> 0x0052 }
            int r3 = r2.right     // Catch:{ all -> 0x0052 }
            int r4 = r2.bottom     // Catch:{ all -> 0x0052 }
            r14.layout(r15, r1, r3, r4)     // Catch:{ all -> 0x0052 }
            m138004y(r0)
            m138004y(r2)
            goto L_0x0194
        L_0x0052:
            r14 = move-exception
            m138004y(r0)
            m138004y(r2)
            throw r14
        L_0x005a:
            int r0 = r0.f306332e
            if (r0 < 0) goto L_0x00ef
            android.view.ViewGroup$LayoutParams r1 = r14.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$e r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C103717e) r1
            int r4 = r1.f306330c
            if (r4 != 0) goto L_0x006b
            r4 = 8388661(0x800035, float:1.1755018E-38)
        L_0x006b:
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r15)
            r5 = r4 & 7
            r4 = r4 & 112(0x70, float:1.57E-43)
            int r6 = r13.getWidth()
            int r7 = r13.getHeight()
            int r8 = r14.getMeasuredWidth()
            int r9 = r14.getMeasuredHeight()
            if (r15 != r2) goto L_0x0087
            int r0 = r6 - r0
        L_0x0087:
            int[] r15 = r13.f306314n
            if (r15 != 0) goto L_0x0090
            r13.toString()
        L_0x008e:
            r15 = 0
            goto L_0x009d
        L_0x0090:
            if (r0 < 0) goto L_0x0099
            int r10 = r15.length
            if (r0 < r10) goto L_0x0096
            goto L_0x0099
        L_0x0096:
            r15 = r15[r0]
            goto L_0x009d
        L_0x0099:
            r13.toString()
            goto L_0x008e
        L_0x009d:
            int r15 = r15 - r8
            if (r5 == r2) goto L_0x00a6
            r0 = 5
            if (r5 == r0) goto L_0x00a4
            goto L_0x00a9
        L_0x00a4:
            int r15 = r15 + r8
            goto L_0x00a9
        L_0x00a6:
            int r0 = r8 / 2
            int r15 = r15 + r0
        L_0x00a9:
            r0 = 16
            if (r4 == r0) goto L_0x00b5
            r0 = 80
            if (r4 == r0) goto L_0x00b2
            goto L_0x00b8
        L_0x00b2:
            int r3 = r9 + 0
            goto L_0x00b8
        L_0x00b5:
            int r0 = r9 / 2
            int r3 = r3 + r0
        L_0x00b8:
            int r0 = r13.getPaddingLeft()
            int r2 = r1.leftMargin
            int r0 = r0 + r2
            int r2 = r13.getPaddingRight()
            int r6 = r6 - r2
            int r6 = r6 - r8
            int r2 = r1.rightMargin
            int r6 = r6 - r2
            int r15 = java.lang.Math.min(r15, r6)
            int r15 = java.lang.Math.max(r0, r15)
            int r0 = r13.getPaddingTop()
            int r2 = r1.topMargin
            int r0 = r0 + r2
            int r2 = r13.getPaddingBottom()
            int r7 = r7 - r2
            int r7 = r7 - r9
            int r1 = r1.bottomMargin
            int r7 = r7 - r1
            int r1 = java.lang.Math.min(r3, r7)
            int r0 = java.lang.Math.max(r0, r1)
            int r8 = r8 + r15
            int r9 = r9 + r0
            r14.layout(r15, r0, r8, r9)
            goto L_0x0194
        L_0x00ef:
            android.view.ViewGroup$LayoutParams r0 = r14.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$e r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C103717e) r0
            android.graphics.Rect r7 = m138003e()
            int r1 = r13.getPaddingLeft()
            int r2 = r0.leftMargin
            int r1 = r1 + r2
            int r2 = r13.getPaddingTop()
            int r3 = r0.topMargin
            int r2 = r2 + r3
            int r3 = r13.getWidth()
            int r4 = r13.getPaddingRight()
            int r3 = r3 - r4
            int r4 = r0.rightMargin
            int r3 = r3 - r4
            int r4 = r13.getHeight()
            int r5 = r13.getPaddingBottom()
            int r4 = r4 - r5
            int r5 = r0.bottomMargin
            int r4 = r4 - r5
            r7.set(r1, r2, r3, r4)
            e3.f0 r1 = r13.f306319s
            if (r1 == 0) goto L_0x0160
            java.util.WeakHashMap<android.view.View, e3.a0> r1 = p849e3.C107207u.f320808a
            boolean r1 = p849e3.C107207u.C107208b.m145174b(r13)
            if (r1 == 0) goto L_0x0160
            boolean r1 = p849e3.C107207u.C107208b.m145174b(r14)
            if (r1 != 0) goto L_0x0160
            int r1 = r7.left
            e3.f0 r2 = r13.f306319s
            int r2 = r2.mo157630b()
            int r1 = r1 + r2
            r7.left = r1
            int r1 = r7.top
            e3.f0 r2 = r13.f306319s
            int r2 = r2.mo157632d()
            int r1 = r1 + r2
            r7.top = r1
            int r1 = r7.right
            e3.f0 r2 = r13.f306319s
            int r2 = r2.mo157631c()
            int r1 = r1 - r2
            r7.right = r1
            int r1 = r7.bottom
            e3.f0 r2 = r13.f306319s
            int r2 = r2.mo157629a()
            int r1 = r1 - r2
            r7.bottom = r1
        L_0x0160:
            android.graphics.Rect r8 = m138003e()
            int r0 = r0.f306330c
            r1 = r0 & 7
            if (r1 != 0) goto L_0x016e
            r1 = 8388611(0x800003, float:1.1754948E-38)
            r0 = r0 | r1
        L_0x016e:
            r1 = r0 & 112(0x70, float:1.57E-43)
            if (r1 != 0) goto L_0x0174
            r0 = r0 | 48
        L_0x0174:
            r1 = r0
            int r2 = r14.getMeasuredWidth()
            int r3 = r14.getMeasuredHeight()
            r4 = r7
            r5 = r8
            r6 = r15
            android.view.Gravity.apply(r1, r2, r3, r4, r5, r6)
            int r15 = r8.left
            int r0 = r8.top
            int r1 = r8.right
            int r2 = r8.bottom
            r14.layout(r15, r0, r1, r2)
            m138004y(r7)
            m138004y(r8)
        L_0x0194:
            return
        L_0x0195:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete."
            r14.<init>(r15)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.mo144913s(android.view.View, int):void");
    }

    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        mo144873C();
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f306322v = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f306321u;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f306321u = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f306321u.setState(getDrawableState());
                }
                Drawable drawable4 = this.f306321u;
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                C112019a.m152745c(drawable4, C107207u.C107209c.m145195d(this));
                this.f306321u.setVisible(getVisibility() == 0, false);
                this.f306321u.setCallback(this);
            }
            WeakHashMap<View, C107168a0> weakHashMap2 = C107207u.f320808a;
            C107207u.C107208b.m145183k(this);
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        Drawable drawable;
        if (i != 0) {
            Context context = getContext();
            Object obj = C111105a.f332697a;
            drawable = C111105a.C111110c.m151511b(context, i);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f306321u;
        if (drawable != null && drawable.isVisible() != z) {
            this.f306321u.setVisible(z, false);
        }
    }

    /* renamed from: t */
    public void mo144920t(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f306321u;
    }

    /* renamed from: w */
    public final boolean mo144922w(MotionEvent motionEvent, int i) {
        boolean z;
        MotionEvent motionEvent2 = motionEvent;
        int i2 = i;
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = (ArrayList) this.f306309f;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            arrayList.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i3) : i3));
        }
        Comparator<View> comparator = f306303B;
        if (comparator != null) {
            Collections.sort(arrayList, comparator);
        }
        int size = arrayList.size();
        MotionEvent motionEvent3 = null;
        boolean z2 = false;
        boolean z3 = false;
        for (int i4 = 0; i4 < size; i4++) {
            View view = (View) arrayList.get(i4);
            C103717e eVar = (C103717e) view.getLayoutParams();
            Behavior behavior = eVar.f306328a;
            if ((!z2 && !z3) || actionMasked == 0) {
                if (!z2 && behavior != null) {
                    if (i2 == 0) {
                        z2 = behavior.mo143313e(this, view, motionEvent2);
                    } else if (i2 == 1) {
                        z2 = behavior.mo843v(this, view, motionEvent2);
                    }
                    if (z2) {
                        this.f306315o = view;
                    }
                }
                if (eVar.f306328a == null) {
                    eVar.f306340m = false;
                }
                boolean z4 = eVar.f306340m;
                if (z4) {
                    z = true;
                } else {
                    z = z4 | false;
                    eVar.f306340m = z;
                }
                z3 = z && !z4;
                if (z && !z3) {
                    break;
                }
            } else if (behavior != null) {
                if (motionEvent3 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i2 == 0) {
                    behavior.mo143313e(this, view, motionEvent3);
                } else if (i2 == 1) {
                    behavior.mo843v(this, view, motionEvent3);
                }
            }
        }
        arrayList.clear();
        return z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0078, code lost:
        if (r5 != false) goto L_0x00cf;
     */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0176 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x011f  */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo144923x() {
        /*
            r12 = this;
            java.util.List<android.view.View> r0 = r12.f306307d
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.clear()
            q2.a<android.view.View> r0 = r12.f306308e
            u.i<T, java.util.ArrayList<T>> r1 = r0.f330088b
            int r1 = r1.f332583f
            r2 = 0
            r3 = 0
        L_0x000f:
            if (r3 >= r1) goto L_0x0028
            u.i<T, java.util.ArrayList<T>> r4 = r0.f330088b
            java.lang.Object r4 = r4.mo162791l(r3)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            if (r4 == 0) goto L_0x0025
            r4.clear()
            d3.d<java.util.ArrayList<T>> r5 = r0.f330087a
            d3.e r5 = (p329d3.C106985e) r5
            r5.mo157420b(r4)
        L_0x0025:
            int r3 = r3 + 1
            goto L_0x000f
        L_0x0028:
            u.i<T, java.util.ArrayList<T>> r0 = r0.f330088b
            r0.clear()
            int r0 = r12.getChildCount()
            r1 = 0
        L_0x0032:
            if (r1 >= r0) goto L_0x01a7
            android.view.View r3 = r12.getChildAt(r1)
            androidx.coordinatorlayout.widget.CoordinatorLayout$e r4 = r12.mo144908p(r3)
            int r5 = r4.f306333f
            r6 = -1
            r7 = 0
            r8 = 1
            if (r5 != r6) goto L_0x0049
            r4.f306339l = r7
            r4.f306338k = r7
            goto L_0x00cf
        L_0x0049:
            android.view.View r5 = r4.f306338k
            if (r5 == 0) goto L_0x007a
            int r5 = r5.getId()
            int r6 = r4.f306333f
            if (r5 == r6) goto L_0x0056
            goto L_0x0073
        L_0x0056:
            android.view.View r5 = r4.f306338k
            android.view.ViewParent r6 = r5.getParent()
        L_0x005c:
            if (r6 == r12) goto L_0x0075
            if (r6 == 0) goto L_0x006f
            if (r6 != r3) goto L_0x0063
            goto L_0x006f
        L_0x0063:
            boolean r9 = r6 instanceof android.view.View
            if (r9 == 0) goto L_0x006a
            r5 = r6
            android.view.View r5 = (android.view.View) r5
        L_0x006a:
            android.view.ViewParent r6 = r6.getParent()
            goto L_0x005c
        L_0x006f:
            r4.f306339l = r7
            r4.f306338k = r7
        L_0x0073:
            r5 = 0
            goto L_0x0078
        L_0x0075:
            r4.f306339l = r5
            r5 = 1
        L_0x0078:
            if (r5 != 0) goto L_0x00cf
        L_0x007a:
            int r5 = r4.f306333f
            android.view.View r5 = r12.findViewById(r5)
            r4.f306338k = r5
            if (r5 == 0) goto L_0x00c5
            if (r5 != r12) goto L_0x0099
            boolean r5 = r12.isInEditMode()
            if (r5 == 0) goto L_0x0091
            r4.f306339l = r7
            r4.f306338k = r7
            goto L_0x00cf
        L_0x0091:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "View can not be anchored to the the parent CoordinatorLayout"
            r0.<init>(r1)
            throw r0
        L_0x0099:
            android.view.ViewParent r6 = r5.getParent()
        L_0x009d:
            if (r6 == r12) goto L_0x00c2
            if (r6 == 0) goto L_0x00c2
            if (r6 != r3) goto L_0x00b6
            boolean r5 = r12.isInEditMode()
            if (r5 == 0) goto L_0x00ae
            r4.f306339l = r7
            r4.f306338k = r7
            goto L_0x00cf
        L_0x00ae:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Anchor must not be a descendant of the anchored view"
            r0.<init>(r1)
            throw r0
        L_0x00b6:
            boolean r9 = r6 instanceof android.view.View
            if (r9 == 0) goto L_0x00bd
            r5 = r6
            android.view.View r5 = (android.view.View) r5
        L_0x00bd:
            android.view.ViewParent r6 = r6.getParent()
            goto L_0x009d
        L_0x00c2:
            r4.f306339l = r5
            goto L_0x00cf
        L_0x00c5:
            boolean r5 = r12.isInEditMode()
            if (r5 == 0) goto L_0x017e
            r4.f306339l = r7
            r4.f306338k = r7
        L_0x00cf:
            q2.a<android.view.View> r5 = r12.f306308e
            u.i<T, java.util.ArrayList<T>> r6 = r5.f330088b
            boolean r6 = r6.containsKey(r3)
            if (r6 != 0) goto L_0x00de
            u.i<T, java.util.ArrayList<T>> r5 = r5.f330088b
            r5.put(r3, r7)
        L_0x00de:
            r5 = 0
        L_0x00df:
            if (r5 >= r0) goto L_0x017a
            if (r5 != r1) goto L_0x00e5
            goto L_0x0176
        L_0x00e5:
            android.view.View r6 = r12.getChildAt(r5)
            android.view.View r9 = r4.f306339l
            if (r6 == r9) goto L_0x011c
            java.util.WeakHashMap<android.view.View, e3.a0> r9 = p849e3.C107207u.f320808a
            int r9 = p849e3.C107207u.C107209c.m145195d(r12)
            android.view.ViewGroup$LayoutParams r10 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$e r10 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C103717e) r10
            int r10 = r10.f306334g
            int r10 = android.view.Gravity.getAbsoluteGravity(r10, r9)
            if (r10 == 0) goto L_0x010c
            int r11 = r4.f306335h
            int r9 = android.view.Gravity.getAbsoluteGravity(r11, r9)
            r9 = r9 & r10
            if (r9 != r10) goto L_0x010c
            r9 = 1
            goto L_0x010d
        L_0x010c:
            r9 = 0
        L_0x010d:
            if (r9 != 0) goto L_0x011c
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r9 = r4.f306328a
            if (r9 == 0) goto L_0x011a
            boolean r9 = r9.mo842b(r12, r3, r6)
            if (r9 == 0) goto L_0x011a
            goto L_0x011c
        L_0x011a:
            r9 = 0
            goto L_0x011d
        L_0x011c:
            r9 = 1
        L_0x011d:
            if (r9 == 0) goto L_0x0176
            q2.a<android.view.View> r9 = r12.f306308e
            u.i<T, java.util.ArrayList<T>> r9 = r9.f330088b
            boolean r9 = r9.containsKey(r6)
            if (r9 != 0) goto L_0x0138
            q2.a<android.view.View> r9 = r12.f306308e
            u.i<T, java.util.ArrayList<T>> r10 = r9.f330088b
            boolean r10 = r10.containsKey(r6)
            if (r10 != 0) goto L_0x0138
            u.i<T, java.util.ArrayList<T>> r9 = r9.f330088b
            r9.put(r6, r7)
        L_0x0138:
            q2.a<android.view.View> r9 = r12.f306308e
            u.i<T, java.util.ArrayList<T>> r10 = r9.f330088b
            boolean r10 = r10.containsKey(r6)
            if (r10 == 0) goto L_0x016e
            u.i<T, java.util.ArrayList<T>> r10 = r9.f330088b
            boolean r10 = r10.containsKey(r3)
            if (r10 == 0) goto L_0x016e
            u.i<T, java.util.ArrayList<T>> r10 = r9.f330088b
            java.lang.Object r10 = r10.getOrDefault(r6, r7)
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            if (r10 != 0) goto L_0x016a
            d3.d<java.util.ArrayList<T>> r10 = r9.f330087a
            d3.e r10 = (p329d3.C106985e) r10
            java.lang.Object r10 = r10.mo157419a()
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            if (r10 != 0) goto L_0x0165
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
        L_0x0165:
            u.i<T, java.util.ArrayList<T>> r9 = r9.f330088b
            r9.put(r6, r10)
        L_0x016a:
            r10.add(r3)
            goto L_0x0176
        L_0x016e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "All nodes must be present in the graph before being added as an edge"
            r0.<init>(r1)
            throw r0
        L_0x0176:
            int r5 = r5 + 1
            goto L_0x00df
        L_0x017a:
            int r1 = r1 + 1
            goto L_0x0032
        L_0x017e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Could not find CoordinatorLayout descendant view with id "
            r1.append(r2)
            android.content.res.Resources r2 = r12.getResources()
            int r4 = r4.f306333f
            java.lang.String r2 = r2.getResourceName(r4)
            r1.append(r2)
            java.lang.String r2 = " to anchor view "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x01a7:
            java.util.List<android.view.View> r0 = r12.f306307d
            q2.a<android.view.View> r1 = r12.f306308e
            java.util.ArrayList<T> r3 = r1.f330089c
            r3.clear()
            java.util.HashSet<T> r3 = r1.f330090d
            r3.clear()
            u.i<T, java.util.ArrayList<T>> r3 = r1.f330088b
            int r3 = r3.f332583f
        L_0x01b9:
            if (r2 >= r3) goto L_0x01cb
            u.i<T, java.util.ArrayList<T>> r4 = r1.f330088b
            java.lang.Object r4 = r4.mo162789j(r2)
            java.util.ArrayList<T> r5 = r1.f330089c
            java.util.HashSet<T> r6 = r1.f330090d
            r1.mo161842a(r4, r5, r6)
            int r2 = r2 + 1
            goto L_0x01b9
        L_0x01cb:
            java.util.ArrayList<T> r1 = r1.f330089c
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.addAll(r1)
            java.util.List<android.view.View> r0 = r12.f306307d
            java.util.Collections.reverse(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.mo144923x():void");
    }

    /* renamed from: z */
    public final void mo144924z(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            Behavior behavior = ((C103717e) childAt.getLayoutParams()).f306328a;
            if (behavior != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    behavior.mo143313e(this, childAt, obtain);
                } else {
                    behavior.mo843v(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C103717e) getChildAt(i2).getLayoutParams()).f306340m = false;
        }
        this.f306315o = null;
        this.f306312i = false;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArray;
        this.f306307d = new ArrayList();
        this.f306308e = new C110349a<>();
        this.f306309f = new ArrayList();
        this.f306310g = new ArrayList();
        this.f306311h = new int[2];
        this.f306324x = new C107203p(this);
        if (i == 0) {
            typedArray = context.obtainStyledAttributes(attributeSet, C110105a.f329415a, 0, C0966R.style.a4q);
        } else {
            typedArray = context.obtainStyledAttributes(attributeSet, C110105a.f329415a, i, 0);
        }
        int resourceId = typedArray.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f306314n = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.f306314n.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr = this.f306314n;
                iArr[i2] = (int) (((float) iArr[i2]) * f);
            }
        }
        this.f306321u = typedArray.getDrawable(1);
        typedArray.recycle();
        mo144873C();
        super.setOnHierarchyChangeListener(new C103716d());
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C103717e) {
            return new C103717e((C103717e) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C103717e((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C103717e(layoutParams);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C103713a();

        /* renamed from: f */
        public SparseArray<Parcelable> f306325f;

        /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$SavedState$a */
        public static class C103713a implements Parcelable.ClassLoaderCreator<SavedState> {
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
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f306325f = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.f306325f.append(iArr[i], readParcelableArray[i]);
            }
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f306434d, i);
            SparseArray<Parcelable> sparseArray = this.f306325f;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.f306325f.keyAt(i2);
                parcelableArr[i2] = this.f306325f.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$e */
    public static class C103717e extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public Behavior f306328a;

        /* renamed from: b */
        public boolean f306329b = false;

        /* renamed from: c */
        public int f306330c = 0;

        /* renamed from: d */
        public int f306331d = 0;

        /* renamed from: e */
        public int f306332e = -1;

        /* renamed from: f */
        public int f306333f = -1;

        /* renamed from: g */
        public int f306334g = 0;

        /* renamed from: h */
        public int f306335h = 0;

        /* renamed from: i */
        public int f306336i;

        /* renamed from: j */
        public int f306337j;

        /* renamed from: k */
        public View f306338k;

        /* renamed from: l */
        public View f306339l;

        /* renamed from: m */
        public boolean f306340m;

        /* renamed from: n */
        public boolean f306341n;

        /* renamed from: o */
        public boolean f306342o;

        /* renamed from: p */
        public boolean f306343p;

        /* renamed from: q */
        public final Rect f306344q = new Rect();

        public C103717e(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: a */
        public boolean mo144937a(int i) {
            if (i == 0) {
                return this.f306341n;
            }
            if (i != 1) {
                return false;
            }
            return this.f306342o;
        }

        /* renamed from: b */
        public void mo144938b(Behavior behavior) {
            Behavior behavior2 = this.f306328a;
            if (behavior2 != behavior) {
                if (behavior2 != null) {
                    behavior2.getClass();
                }
                this.f306328a = behavior;
                this.f306329b = true;
                if (behavior != null) {
                    behavior.mo144926c(this);
                }
            }
        }

        public C103717e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            Behavior behavior;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C110105a.f329416b);
            this.f306330c = obtainStyledAttributes.getInteger(0, 0);
            this.f306333f = obtainStyledAttributes.getResourceId(1, -1);
            this.f306331d = obtainStyledAttributes.getInteger(2, 0);
            this.f306332e = obtainStyledAttributes.getInteger(6, -1);
            this.f306334g = obtainStyledAttributes.getInt(5, 0);
            this.f306335h = obtainStyledAttributes.getInt(4, 0);
            boolean hasValue = obtainStyledAttributes.hasValue(3);
            this.f306329b = hasValue;
            if (hasValue) {
                String string = obtainStyledAttributes.getString(3);
                String str = CoordinatorLayout.f306305y;
                if (TextUtils.isEmpty(string)) {
                    behavior = null;
                } else {
                    if (string.startsWith(".")) {
                        string = context.getPackageName() + string;
                    } else if (string.indexOf(46) < 0) {
                        String str2 = CoordinatorLayout.f306305y;
                        if (!TextUtils.isEmpty(str2)) {
                            string = str2 + '.' + string;
                        }
                    }
                    try {
                        ThreadLocal<Map<String, Constructor<Behavior>>> threadLocal = CoordinatorLayout.f306302A;
                        Map map = threadLocal.get();
                        if (map == null) {
                            map = new HashMap();
                            threadLocal.set(map);
                        }
                        Constructor<?> constructor = (Constructor) map.get(string);
                        if (constructor == null) {
                            constructor = context.getClassLoader().loadClass(string).getConstructor(CoordinatorLayout.f306306z);
                            constructor.setAccessible(true);
                            map.put(string, constructor);
                        }
                        behavior = (Behavior) constructor.newInstance(new Object[]{context, attributeSet});
                    } catch (Exception e) {
                        throw new RuntimeException("Could not inflate Behavior subclass " + string, e);
                    }
                }
                this.f306328a = behavior;
            }
            obtainStyledAttributes.recycle();
            Behavior behavior2 = this.f306328a;
            if (behavior2 != null) {
                behavior2.mo144926c(this);
            }
        }

        public C103717e(C103717e eVar) {
            super(eVar);
        }

        public C103717e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C103717e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
