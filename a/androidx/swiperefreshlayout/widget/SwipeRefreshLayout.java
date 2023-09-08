package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import java.util.WeakHashMap;
import p385u2.C111105a;
import p849e3.C107168a0;
import p849e3.C107199k;
import p849e3.C107200l;
import p849e3.C107203p;
import p849e3.C107207u;
import p849e3.C58524o;
import p967g4.C107724d;
import p967g4.C107726e;
import p967g4.C107727f;
import p967g4.C107728g;
import p967g4.C87132a;

public class SwipeRefreshLayout extends ViewGroup implements C58524o, C107199k {

    /* renamed from: N */
    public static final int[] f306592N = {16842766};

    /* renamed from: A */
    public int f306593A;

    /* renamed from: B */
    public int f306594B;

    /* renamed from: C */
    public int f306595C;

    /* renamed from: D */
    public C107724d f306596D;

    /* renamed from: E */
    public Animation f306597E;

    /* renamed from: F */
    public Animation f306598F;

    /* renamed from: G */
    public Animation f306599G;

    /* renamed from: H */
    public Animation f306600H;

    /* renamed from: I */
    public boolean f306601I;

    /* renamed from: J */
    public int f306602J;

    /* renamed from: K */
    public Animation.AnimationListener f306603K = new C103786a();

    /* renamed from: L */
    public final Animation f306604L = new C103788c();

    /* renamed from: M */
    public final Animation f306605M = new C103789d();

    /* renamed from: d */
    public View f306606d;

    /* renamed from: e */
    public boolean f306607e = false;

    /* renamed from: f */
    public int f306608f;

    /* renamed from: g */
    public float f306609g = -1.0f;

    /* renamed from: h */
    public float f306610h;

    /* renamed from: i */
    public final C107203p f306611i;

    /* renamed from: j */
    public final C107200l f306612j;

    /* renamed from: n */
    public final int[] f306613n = new int[2];

    /* renamed from: o */
    public final int[] f306614o = new int[2];

    /* renamed from: p */
    public boolean f306615p;

    /* renamed from: q */
    public int f306616q;

    /* renamed from: r */
    public int f306617r;

    /* renamed from: s */
    public float f306618s;

    /* renamed from: t */
    public float f306619t;

    /* renamed from: u */
    public boolean f306620u;

    /* renamed from: v */
    public int f306621v = -1;

    /* renamed from: w */
    public final DecelerateInterpolator f306622w;

    /* renamed from: x */
    public C87132a f306623x;

    /* renamed from: y */
    public int f306624y = -1;

    /* renamed from: z */
    public int f306625z;

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$a */
    public class C103786a implements Animation.AnimationListener {
        public C103786a() {
        }

        public void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (swipeRefreshLayout.f306607e) {
                swipeRefreshLayout.f306596D.setAlpha(255);
                SwipeRefreshLayout.this.f306596D.start();
                SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
                if (swipeRefreshLayout2.f306601I) {
                    swipeRefreshLayout2.getClass();
                }
                SwipeRefreshLayout swipeRefreshLayout3 = SwipeRefreshLayout.this;
                swipeRefreshLayout3.f306617r = swipeRefreshLayout3.f306623x.getTop();
                return;
            }
            swipeRefreshLayout.mo145212f();
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$b */
    public class C103787b implements Animation.AnimationListener {
        public C103787b() {
        }

        public void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout.this.getClass();
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            swipeRefreshLayout.getClass();
            C107727f fVar = new C107727f(swipeRefreshLayout);
            swipeRefreshLayout.f306598F = fVar;
            fVar.setDuration(150);
            C87132a aVar = swipeRefreshLayout.f306623x;
            aVar.f252724d = null;
            aVar.clearAnimation();
            swipeRefreshLayout.f306623x.startAnimation(swipeRefreshLayout.f306598F);
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$c */
    public class C103788c extends Animation {
        public C103788c() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.getClass();
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            int abs = swipeRefreshLayout.f306594B - Math.abs(swipeRefreshLayout.f306593A);
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            int i = swipeRefreshLayout2.f306625z;
            SwipeRefreshLayout.this.setTargetOffsetTopAndBottom((i + ((int) (((float) (abs - i)) * f))) - swipeRefreshLayout2.f306623x.getTop());
            C107724d dVar = SwipeRefreshLayout.this.f306596D;
            float f2 = 1.0f - f;
            C107724d.C107725a aVar = dVar.f322323d;
            if (f2 != aVar.f322344p) {
                aVar.f322344p = f2;
            }
            dVar.invalidateSelf();
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$d */
    public class C103789d extends Animation {
        public C103789d() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.mo145211e(f);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$e */
    public interface C103790e {
        /* renamed from: a */
        boolean mo145261a(SwipeRefreshLayout swipeRefreshLayout, View view);
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$f */
    public interface C103791f {
        void onRefresh();
    }

    static {
        Class<SwipeRefreshLayout> cls = SwipeRefreshLayout.class;
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f306608f = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f306616q = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.f306622w = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f306602J = (int) (displayMetrics.density * 40.0f);
        this.f306623x = new C87132a(getContext(), -328966);
        C107724d dVar = new C107724d(getContext());
        this.f306596D = dVar;
        dVar.mo158133c(1);
        this.f306623x.setImageDrawable(this.f306596D);
        this.f306623x.setVisibility(8);
        addView(this.f306623x);
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.f306594B = i;
        this.f306609g = (float) i;
        this.f306611i = new C107203p(this);
        this.f306612j = new C107200l(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.f306602J;
        this.f306617r = i2;
        this.f306593A = i2;
        mo145211e(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f306592N);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    private void setColorViewAlpha(int i) {
        this.f306623x.getBackground().setAlpha(i);
        this.f306596D.setAlpha(i);
    }

    /* renamed from: a */
    public boolean mo145203a() {
        View view = this.f306606d;
        return view instanceof ListView ? ((ListView) view).canScrollList(-1) : view.canScrollVertically(-1);
    }

    /* renamed from: b */
    public final void mo145204b() {
        if (this.f306606d == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.f306623x)) {
                    this.f306606d = childAt;
                    return;
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo145205c(float f) {
        if (f > this.f306609g) {
            mo145218h(true, true);
            return;
        }
        this.f306607e = false;
        C107724d dVar = this.f306596D;
        C107724d.C107725a aVar = dVar.f322323d;
        aVar.f322333e = 0.0f;
        aVar.f322334f = 0.0f;
        dVar.invalidateSelf();
        C103787b bVar = new C103787b();
        this.f306625z = this.f306617r;
        this.f306605M.reset();
        this.f306605M.setDuration(200);
        this.f306605M.setInterpolator(this.f306622w);
        C87132a aVar2 = this.f306623x;
        aVar2.f252724d = bVar;
        aVar2.clearAnimation();
        this.f306623x.startAnimation(this.f306605M);
        C107724d dVar2 = this.f306596D;
        C107724d.C107725a aVar3 = dVar2.f322323d;
        if (aVar3.f322342n) {
            aVar3.f322342n = false;
        }
        dVar2.invalidateSelf();
    }

    /* renamed from: d */
    public final void mo145206d(float f) {
        C107724d dVar = this.f306596D;
        C107724d.C107725a aVar = dVar.f322323d;
        boolean z = true;
        if (!aVar.f322342n) {
            aVar.f322342n = true;
        }
        dVar.invalidateSelf();
        float min = Math.min(1.0f, Math.abs(f / this.f306609g));
        float max = (((float) Math.max(((double) min) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f) - this.f306609g;
        int i = this.f306595C;
        if (i <= 0) {
            i = this.f306594B;
        }
        float f2 = (float) i;
        double max2 = (double) (Math.max(0.0f, Math.min(abs, f2 * 2.0f) / f2) / 4.0f);
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i2 = this.f306593A + ((int) ((f2 * min) + (f2 * pow * 2.0f)));
        if (this.f306623x.getVisibility() != 0) {
            this.f306623x.setVisibility(0);
        }
        this.f306623x.setScaleX(1.0f);
        this.f306623x.setScaleY(1.0f);
        if (f < this.f306609g) {
            if (this.f306596D.f322323d.f322348t > 76) {
                Animation animation = this.f306599G;
                if (animation == null || !animation.hasStarted() || animation.hasEnded()) {
                    z = false;
                }
                if (!z) {
                    C107728g gVar = new C107728g(this, this.f306596D.f322323d.f322348t, 76);
                    gVar.setDuration(300);
                    C87132a aVar2 = this.f306623x;
                    aVar2.f252724d = null;
                    aVar2.clearAnimation();
                    this.f306623x.startAnimation(gVar);
                    this.f306599G = gVar;
                }
            }
        } else if (this.f306596D.f322323d.f322348t < 255) {
            Animation animation2 = this.f306600H;
            if (animation2 == null || !animation2.hasStarted() || animation2.hasEnded()) {
                z = false;
            }
            if (!z) {
                C107728g gVar2 = new C107728g(this, this.f306596D.f322323d.f322348t, 255);
                gVar2.setDuration(300);
                C87132a aVar3 = this.f306623x;
                aVar3.f252724d = null;
                aVar3.clearAnimation();
                this.f306623x.startAnimation(gVar2);
                this.f306600H = gVar2;
            }
        }
        C107724d dVar2 = this.f306596D;
        float min2 = Math.min(0.8f, max * 0.8f);
        C107724d.C107725a aVar4 = dVar2.f322323d;
        aVar4.f322333e = 0.0f;
        aVar4.f322334f = min2;
        dVar2.invalidateSelf();
        C107724d dVar3 = this.f306596D;
        float min3 = Math.min(1.0f, max);
        C107724d.C107725a aVar5 = dVar3.f322323d;
        if (min3 != aVar5.f322344p) {
            aVar5.f322344p = min3;
        }
        dVar3.invalidateSelf();
        C107724d dVar4 = this.f306596D;
        dVar4.f322323d.f322335g = (((max * 0.4f) - 16.0f) + (pow * 2.0f)) * 0.5f;
        dVar4.invalidateSelf();
        setTargetOffsetTopAndBottom(i2 - this.f306617r);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f306612j.mo157664a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f306612j.mo157665b(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f306612j.mo157666c(i, i2, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f306612j.mo157668e(i, i2, i3, i4, iArr);
    }

    /* renamed from: e */
    public void mo145211e(float f) {
        int i = this.f306625z;
        setTargetOffsetTopAndBottom((i + ((int) (((float) (this.f306593A - i)) * f))) - this.f306623x.getTop());
    }

    /* renamed from: f */
    public void mo145212f() {
        this.f306623x.clearAnimation();
        this.f306596D.stop();
        this.f306623x.setVisibility(8);
        setColorViewAlpha(255);
        setTargetOffsetTopAndBottom(this.f306593A - this.f306617r);
        this.f306617r = this.f306623x.getTop();
    }

    public int getChildDrawingOrder(int i, int i2) {
        int i3 = this.f306624y;
        return i3 < 0 ? i2 : i2 == i + -1 ? i3 : i2 >= i3 ? i2 + 1 : i2;
    }

    public int getNestedScrollAxes() {
        C107203p pVar = this.f306611i;
        return pVar.f320806b | pVar.f320805a;
    }

    public int getProgressCircleDiameter() {
        return this.f306602J;
    }

    public int getProgressViewEndOffset() {
        return this.f306594B;
    }

    public int getProgressViewStartOffset() {
        return this.f306593A;
    }

    /* renamed from: h */
    public final void mo145218h(boolean z, boolean z2) {
        if (this.f306607e != z) {
            this.f306601I = z2;
            mo145204b();
            this.f306607e = z;
            if (z) {
                int i = this.f306617r;
                Animation.AnimationListener animationListener = this.f306603K;
                this.f306625z = i;
                this.f306604L.reset();
                this.f306604L.setDuration(200);
                this.f306604L.setInterpolator(this.f306622w);
                if (animationListener != null) {
                    this.f306623x.f252724d = animationListener;
                }
                this.f306623x.clearAnimation();
                this.f306623x.startAnimation(this.f306604L);
                return;
            }
            Animation.AnimationListener animationListener2 = this.f306603K;
            C107727f fVar = new C107727f(this);
            this.f306598F = fVar;
            fVar.setDuration(150);
            C87132a aVar = this.f306623x;
            aVar.f252724d = animationListener2;
            aVar.clearAnimation();
            this.f306623x.startAnimation(this.f306598F);
        }
    }

    public boolean hasNestedScrollingParent() {
        return this.f306612j.mo157671h(0);
    }

    public boolean isNestedScrollingEnabled() {
        return this.f306612j.f320803d;
    }

    /* renamed from: k */
    public final void mo145221k(float f) {
        float f2 = this.f306619t;
        int i = this.f306608f;
        if (f - f2 > ((float) i) && !this.f306620u) {
            this.f306618s = f2 + ((float) i);
            this.f306620u = true;
            this.f306596D.setAlpha(76);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo145212f();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int findPointerIndex;
        mo145204b();
        int actionMasked = motionEvent.getActionMasked();
        int i = 0;
        if (!isEnabled() || mo145203a() || this.f306607e || this.f306615p) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i2 = this.f306621v;
                    if (i2 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i2)) < 0) {
                        return false;
                    }
                    mo145221k(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (motionEvent.getPointerId(actionIndex) == this.f306621v) {
                            if (actionIndex == 0) {
                                i = 1;
                            }
                            this.f306621v = motionEvent.getPointerId(i);
                        }
                    }
                }
            }
            this.f306620u = false;
            this.f306621v = -1;
        } else {
            setTargetOffsetTopAndBottom(this.f306593A - this.f306623x.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f306621v = pointerId;
            this.f306620u = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.f306619t = motionEvent.getY(findPointerIndex2);
        }
        return this.f306620u;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.f306606d == null) {
                mo145204b();
            }
            View view = this.f306606d;
            if (view != null) {
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
                int measuredWidth2 = this.f306623x.getMeasuredWidth();
                int measuredHeight2 = this.f306623x.getMeasuredHeight();
                int i5 = measuredWidth / 2;
                int i6 = measuredWidth2 / 2;
                int i7 = this.f306617r;
                this.f306623x.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
            }
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f306606d == null) {
            mo145204b();
        }
        View view = this.f306606d;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            this.f306623x.measure(View.MeasureSpec.makeMeasureSpec(this.f306602J, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f306602J, 1073741824));
            this.f306624y = -1;
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                if (getChildAt(i3) == this.f306623x) {
                    this.f306624y = i3;
                    return;
                }
            }
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.f306610h;
            if (f > 0.0f) {
                float f2 = (float) i2;
                if (f2 > f) {
                    iArr[1] = i2 - ((int) f);
                    this.f306610h = 0.0f;
                } else {
                    this.f306610h = f - f2;
                    iArr[1] = i2;
                }
                mo145206d(this.f306610h);
            }
        }
        int[] iArr2 = this.f306613n;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, (int[]) null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        dispatchNestedScroll(i, i2, i3, i4, this.f306614o);
        int i5 = i4 + this.f306614o[1];
        if (i5 < 0 && !mo145203a()) {
            float abs = this.f306610h + ((float) Math.abs(i5));
            this.f306610h = abs;
            mo145206d(abs);
        }
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f306611i.mo157675a(view, view2, i, 0);
        startNestedScroll(i & 2);
        this.f306610h = 0.0f;
        this.f306615p = true;
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return isEnabled() && !this.f306607e && (i & 2) != 0;
    }

    public void onStopNestedScroll(View view) {
        this.f306611i.mo157676b(view, 0);
        this.f306615p = false;
        float f = this.f306610h;
        if (f > 0.0f) {
            mo145205c(f);
            this.f306610h = 0.0f;
        }
        stopNestedScroll();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int i = 0;
        if (!isEnabled() || mo145203a() || this.f306607e || this.f306615p) {
            return false;
        }
        if (actionMasked == 0) {
            this.f306621v = motionEvent.getPointerId(0);
            this.f306620u = false;
        } else if (actionMasked == 1) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f306621v);
            if (findPointerIndex < 0) {
                return false;
            }
            if (this.f306620u) {
                this.f306620u = false;
                mo145205c((motionEvent.getY(findPointerIndex) - this.f306618s) * 0.5f);
            }
            this.f306621v = -1;
            return false;
        } else if (actionMasked == 2) {
            int findPointerIndex2 = motionEvent.findPointerIndex(this.f306621v);
            if (findPointerIndex2 < 0) {
                return false;
            }
            float y = motionEvent.getY(findPointerIndex2);
            mo145221k(y);
            if (this.f306620u) {
                float f = (y - this.f306618s) * 0.5f;
                if (f <= 0.0f) {
                    return false;
                }
                mo145206d(f);
            }
        } else if (actionMasked == 3) {
            return false;
        } else {
            if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                if (actionIndex < 0) {
                    return false;
                }
                this.f306621v = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                int actionIndex2 = motionEvent.getActionIndex();
                if (motionEvent.getPointerId(actionIndex2) == this.f306621v) {
                    if (actionIndex2 == 0) {
                        i = 1;
                    }
                    this.f306621v = motionEvent.getPointerId(i);
                }
            }
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        View view = this.f306606d;
        if (view != null) {
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            if (!C107207u.C107213g.m145231p(view)) {
                return;
            }
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void setAnimationProgress(float f) {
        this.f306623x.setScaleX(f);
        this.f306623x.setScaleY(f);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        mo145204b();
        C107724d dVar = this.f306596D;
        C107724d.C107725a aVar = dVar.f322323d;
        aVar.f322337i = iArr;
        aVar.mo158143a(0);
        dVar.f322323d.mo158143a(0);
        dVar.invalidateSelf();
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = C111105a.m151500b(context, iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i) {
        this.f306609g = (float) i;
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z) {
            mo145212f();
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f306612j.mo157672i(z);
    }

    public void setOnChildScrollUpCallback(C103790e eVar) {
    }

    public void setOnRefreshListener(C103791f fVar) {
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.f306623x.setBackgroundColor(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(C111105a.m151500b(getContext(), i));
    }

    public void setRefreshing(boolean z) {
        if (!z || this.f306607e == z) {
            mo145218h(z, false);
            return;
        }
        this.f306607e = z;
        setTargetOffsetTopAndBottom((this.f306594B + this.f306593A) - this.f306617r);
        this.f306601I = false;
        Animation.AnimationListener animationListener = this.f306603K;
        this.f306623x.setVisibility(0);
        this.f306596D.setAlpha(255);
        C107726e eVar = new C107726e(this);
        this.f306597E = eVar;
        eVar.setDuration((long) this.f306616q);
        if (animationListener != null) {
            this.f306623x.f252724d = animationListener;
        }
        this.f306623x.clearAnimation();
        this.f306623x.startAnimation(this.f306597E);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                this.f306602J = (int) (displayMetrics.density * 56.0f);
            } else {
                this.f306602J = (int) (displayMetrics.density * 40.0f);
            }
            this.f306623x.setImageDrawable((Drawable) null);
            this.f306596D.mo158133c(i);
            this.f306623x.setImageDrawable(this.f306596D);
        }
    }

    public void setSlingshotDistance(int i) {
        this.f306595C = i;
    }

    public void setTargetOffsetTopAndBottom(int i) {
        this.f306623x.bringToFront();
        C107207u.m145166g(this.f306623x, i);
        this.f306617r = this.f306623x.getTop();
    }

    public boolean startNestedScroll(int i) {
        return this.f306612j.mo157673j(i, 0);
    }

    public void stopNestedScroll() {
        this.f306612j.mo157674k(0);
    }
}
