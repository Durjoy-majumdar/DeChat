package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.C103456i;
import com.tencent.p014mm.C0966R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p849e3.C107168a0;
import p849e3.C107203p;
import p849e3.C107207u;
import p849e3.C58524o;

public class ActionBarOverlayLayout extends ViewGroup implements C103552n, C58524o {

    /* renamed from: H */
    public static final int[] f305347H = {C0966R.attr.f2625a0, 16842841};

    /* renamed from: A */
    public C103468d f305348A;

    /* renamed from: B */
    public OverScroller f305349B;

    /* renamed from: C */
    public ViewPropertyAnimator f305350C;

    /* renamed from: D */
    public final AnimatorListenerAdapter f305351D = new C103465a();

    /* renamed from: E */
    public final Runnable f305352E = new C103466b();

    /* renamed from: F */
    public final Runnable f305353F = new C103467c();

    /* renamed from: G */
    public final C107203p f305354G;

    /* renamed from: d */
    public int f305355d;

    /* renamed from: e */
    public int f305356e = 0;

    /* renamed from: f */
    public ContentFrameLayout f305357f;

    /* renamed from: g */
    public ActionBarContainer f305358g;

    /* renamed from: h */
    public C103554o f305359h;

    /* renamed from: i */
    public Drawable f305360i;

    /* renamed from: j */
    public boolean f305361j;

    /* renamed from: n */
    public boolean f305362n;

    /* renamed from: o */
    public boolean f305363o;

    /* renamed from: p */
    public boolean f305364p;

    /* renamed from: q */
    public boolean f305365q;

    /* renamed from: r */
    public int f305366r;

    /* renamed from: s */
    public int f305367s;

    /* renamed from: t */
    public final Rect f305368t = new Rect();

    /* renamed from: u */
    public final Rect f305369u = new Rect();

    /* renamed from: v */
    public final Rect f305370v = new Rect();

    /* renamed from: w */
    public final Rect f305371w = new Rect();

    /* renamed from: x */
    public final Rect f305372x = new Rect();

    /* renamed from: y */
    public final Rect f305373y = new Rect();

    /* renamed from: z */
    public final Rect f305374z = new Rect();

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$a */
    public class C103465a extends AnimatorListenerAdapter {
        public C103465a() {
        }

        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f305350C = null;
            actionBarOverlayLayout.f305365q = false;
        }

        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f305350C = null;
            actionBarOverlayLayout.f305365q = false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$b */
    public class C103466b implements Runnable {
        public C103466b() {
        }

        public void run() {
            ActionBarOverlayLayout.this.mo143772o();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f305350C = actionBarOverlayLayout.f305358g.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f305351D);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$c */
    public class C103467c implements Runnable {
        public C103467c() {
        }

        public void run() {
            ActionBarOverlayLayout.this.mo143772o();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f305350C = actionBarOverlayLayout.f305358g.animate().translationY((float) (-ActionBarOverlayLayout.this.f305358g.getHeight())).setListener(ActionBarOverlayLayout.this.f305351D);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$d */
    public interface C103468d {
        /* renamed from: a */
        void mo143477a();

        /* renamed from: b */
        void mo143478b(int i);

        /* renamed from: c */
        void mo143479c(boolean z);

        /* renamed from: d */
        void mo143480d();

        /* renamed from: e */
        void mo143481e();

        /* renamed from: f */
        void mo143482f();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo143786p(context);
        this.f305354G = new C107203p(this);
    }

    /* renamed from: a */
    public boolean mo143753a() {
        mo143787q();
        return this.f305359h.mo144351a();
    }

    /* renamed from: b */
    public void mo143754b(Menu menu, C103456i.C103457a aVar) {
        mo143787q();
        this.f305359h.mo144352b(menu, aVar);
    }

    /* renamed from: c */
    public boolean mo143755c() {
        mo143787q();
        return this.f305359h.mo144353c();
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: d */
    public boolean mo143757d() {
        mo143787q();
        return this.f305359h.mo144355d();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f305360i != null && !this.f305361j) {
            int bottom = this.f305358g.getVisibility() == 0 ? (int) (((float) this.f305358g.getBottom()) + this.f305358g.getTranslationY() + 0.5f) : 0;
            this.f305360i.setBounds(0, bottom, getWidth(), this.f305360i.getIntrinsicHeight() + bottom);
            this.f305360i.draw(canvas);
        }
    }

    /* renamed from: e */
    public boolean mo143759e() {
        mo143787q();
        return this.f305359h.mo144356e();
    }

    /* renamed from: f */
    public boolean mo143760f() {
        mo143787q();
        return this.f305359h.mo144357f();
    }

    public boolean fitSystemWindows(Rect rect) {
        mo143787q();
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        C107207u.C107208b.m145179g(this);
        boolean m = mo143771m(this.f305358g, rect, true, true, false, true);
        this.f305371w.set(rect);
        Rect rect2 = this.f305371w;
        Rect rect3 = this.f305368t;
        Method method = C103553n0.f305820a;
        if (method != null) {
            try {
                method.invoke(this, new Object[]{rect2, rect3});
            } catch (Exception unused) {
            }
        }
        if (!this.f305372x.equals(this.f305371w)) {
            this.f305372x.set(this.f305371w);
            m = true;
        }
        if (!this.f305369u.equals(this.f305368t)) {
            this.f305369u.set(this.f305368t);
            m = true;
        }
        if (m) {
            requestLayout();
        }
        return true;
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f305358g;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        C107203p pVar = this.f305354G;
        return pVar.f320806b | pVar.f320805a;
    }

    public CharSequence getTitle() {
        mo143787q();
        return this.f305359h.getTitle();
    }

    /* renamed from: h */
    public void mo143768h() {
        mo143787q();
        this.f305359h.mo144362h();
    }

    /* renamed from: k */
    public void mo143769k(int i) {
        mo143787q();
        if (i == 2) {
            this.f305359h.mo144365k();
        } else if (i == 5) {
            this.f305359h.mo144380u();
        } else if (i == 109) {
            setOverlayMode(true);
        }
    }

    /* renamed from: l */
    public void mo143770l() {
        mo143787q();
        this.f305359h.mo144367m();
    }

    /* renamed from: m */
    public final boolean mo143771m(View view, Rect rect, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        int i;
        int i2;
        int i3;
        int i4;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!z || layoutParams.leftMargin == (i4 = rect.left)) {
            z5 = false;
        } else {
            layoutParams.leftMargin = i4;
            z5 = true;
        }
        if (z2 && layoutParams.topMargin != (i3 = rect.top)) {
            layoutParams.topMargin = i3;
            z5 = true;
        }
        if (z4 && layoutParams.rightMargin != (i2 = rect.right)) {
            layoutParams.rightMargin = i2;
            z5 = true;
        }
        if (!z3 || layoutParams.bottomMargin == (i = rect.bottom)) {
            return z5;
        }
        layoutParams.bottomMargin = i;
        return true;
    }

    /* renamed from: o */
    public void mo143772o() {
        removeCallbacks(this.f305352E);
        removeCallbacks(this.f305353F);
        ViewPropertyAnimator viewPropertyAnimator = this.f305350C;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        mo143786p(getContext());
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        C107207u.C107212f.m145215c(this);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo143772o();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = layoutParams.leftMargin + paddingLeft;
                int i7 = layoutParams.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        mo143787q();
        measureChildWithMargins(this.f305358g, i, 0, i2, 0);
        LayoutParams layoutParams = (LayoutParams) this.f305358g.getLayoutParams();
        int max = Math.max(0, this.f305358g.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
        int max2 = Math.max(0, this.f305358g.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f305358g.getMeasuredState());
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        boolean z = (C107207u.C107208b.m145179g(this) & 256) != 0;
        if (z) {
            i3 = this.f305355d;
            if (this.f305363o && this.f305358g.getTabContainer() != null) {
                i3 += this.f305355d;
            }
        } else {
            i3 = this.f305358g.getVisibility() != 8 ? this.f305358g.getMeasuredHeight() : 0;
        }
        this.f305370v.set(this.f305368t);
        this.f305373y.set(this.f305371w);
        if (this.f305362n || z) {
            Rect rect = this.f305373y;
            rect.top += i3;
            rect.bottom += 0;
        } else {
            Rect rect2 = this.f305370v;
            rect2.top += i3;
            rect2.bottom += 0;
        }
        mo143771m(this.f305357f, this.f305370v, true, true, true, true);
        if (!this.f305374z.equals(this.f305373y)) {
            this.f305374z.set(this.f305373y);
            this.f305357f.mo144049a(this.f305373y);
        }
        measureChildWithMargins(this.f305357f, i, 0, i2, 0);
        LayoutParams layoutParams2 = (LayoutParams) this.f305357f.getLayoutParams();
        int max3 = Math.max(max, this.f305357f.getMeasuredWidth() + layoutParams2.leftMargin + layoutParams2.rightMargin);
        int max4 = Math.max(max2, this.f305357f.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f305357f.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        boolean z2 = false;
        if (!this.f305364p || !z) {
            return false;
        }
        this.f305349B.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f305349B.getFinalY() > this.f305358g.getHeight()) {
            z2 = true;
        }
        if (z2) {
            mo143772o();
            ((C103467c) this.f305353F).run();
        } else {
            mo143772o();
            ((C103466b) this.f305352E).run();
        }
        this.f305365q = true;
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f305366r + i2;
        this.f305366r = i5;
        setActionBarHideOffset(i5);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f305354G.mo157675a(view, view2, i, 0);
        this.f305366r = getActionBarHideOffset();
        mo143772o();
        C103468d dVar = this.f305348A;
        if (dVar != null) {
            dVar.mo143477a();
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f305358g.getVisibility() != 0) {
            return false;
        }
        return this.f305364p;
    }

    public void onStopNestedScroll(View view) {
        if (this.f305364p && !this.f305365q) {
            if (this.f305366r <= this.f305358g.getHeight()) {
                mo143772o();
                postDelayed(this.f305352E, 600);
            } else {
                mo143772o();
                postDelayed(this.f305353F, 600);
            }
        }
        C103468d dVar = this.f305348A;
        if (dVar != null) {
            dVar.mo143481e();
        }
    }

    public void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        mo143787q();
        int i2 = this.f305367s ^ i;
        this.f305367s = i;
        boolean z = false;
        boolean z2 = (i & 4) == 0;
        if ((i & 256) != 0) {
            z = true;
        }
        C103468d dVar = this.f305348A;
        if (dVar != null) {
            dVar.mo143479c(!z);
            if (z2 || !z) {
                this.f305348A.mo143480d();
            } else {
                this.f305348A.mo143482f();
            }
        }
        if ((i2 & 256) != 0 && this.f305348A != null) {
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            C107207u.C107212f.m145215c(this);
        }
    }

    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f305356e = i;
        C103468d dVar = this.f305348A;
        if (dVar != null) {
            dVar.mo143478b(i);
        }
    }

    /* renamed from: p */
    public final void mo143786p(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f305347H);
        boolean z = false;
        this.f305355d = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f305360i = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z = true;
        }
        this.f305361j = z;
        this.f305349B = new OverScroller(context);
    }

    /* renamed from: q */
    public void mo143787q() {
        C103554o oVar;
        if (this.f305357f == null) {
            this.f305357f = (ContentFrameLayout) findViewById(C0966R.C0970id.f5381dm);
            this.f305358g = (ActionBarContainer) findViewById(C0966R.C0970id.f5383do);
            View findViewById = findViewById(C0966R.C0970id.f5380dl);
            if (findViewById instanceof C103554o) {
                oVar = (C103554o) findViewById;
            } else if (findViewById instanceof Toolbar) {
                oVar = ((Toolbar) findViewById).getWrapper();
            } else {
                throw new IllegalStateException("Can't make a decor toolbar out of " + findViewById.getClass().getSimpleName());
            }
            this.f305359h = oVar;
        }
    }

    public void setActionBarHideOffset(int i) {
        mo143772o();
        this.f305358g.setTranslationY((float) (-Math.max(0, Math.min(i, this.f305358g.getHeight()))));
    }

    public void setActionBarVisibilityCallback(C103468d dVar) {
        this.f305348A = dVar;
        if (getWindowToken() != null) {
            this.f305348A.mo143478b(this.f305356e);
            int i = this.f305367s;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                C107207u.C107212f.m145215c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f305363o = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f305364p) {
            this.f305364p = z;
            if (!z) {
                mo143772o();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i) {
        mo143787q();
        this.f305359h.setIcon(i);
    }

    public void setLogo(int i) {
        mo143787q();
        this.f305359h.mo144382w(i);
    }

    public void setOverlayMode(boolean z) {
        this.f305362n = z;
        this.f305361j = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public void setWindowCallback(Window.Callback callback) {
        mo143787q();
        this.f305359h.setWindowCallback(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        mo143787q();
        this.f305359h.setWindowTitle(charSequence);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        mo143787q();
        this.f305359h.setIcon(drawable);
    }
}
