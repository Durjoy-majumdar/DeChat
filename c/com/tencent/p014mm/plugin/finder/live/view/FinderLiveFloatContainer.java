package com.tencent.p014mm.plugin.finder.live.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.RelativeLayout;
import com.tencent.p014mm.accessibility.uitl.AccUtil;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.sdk.platformtools.Log;
import eg1.C58591p0;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010*\u001a\u00020)\u0012\b\u0010,\u001a\u0004\u0018\u00010+\u0012\u0006\u0010-\u001a\u00020\u001c¢\u0006\u0004\b.\u0010/B\u001b\b\u0016\u0012\u0006\u0010*\u001a\u00020)\u0012\b\u0010,\u001a\u0004\u0018\u00010+¢\u0006\u0004\b.\u00100R2\u0010\u000b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR*\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R0\u0010(\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0006\u001a\u0004\b&\u0010\b\"\u0004\b'\u0010\n¨\u00061"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveFloatContainer;", "Landroid/widget/RelativeLayout;", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "Lrx3/b0;", "z", "Lfy3/l;", "getOnTouchCallback", "()Lfy3/l;", "setOnTouchCallback", "(Lfy3/l;)V", "onTouchCallback", "Lkotlin/Function0;", "A", "Lfy3/a;", "getOnAnimCallback", "()Lfy3/a;", "setOnAnimCallback", "(Lfy3/a;)V", "onAnimCallback", "", "B", "Z", "getNeedInterceptTouchEvent", "()Z", "setNeedInterceptTouchEvent", "(Z)V", "needInterceptTouchEvent", "", "C", "I", "getDefaultTranslationY", "()I", "setDefaultTranslationY", "(I)V", "defaultTranslationY", "Landroid/view/View;", "F", "getOnClick", "setOnClick", "onClick", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "style", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveFloatContainer */
public final class FinderLiveFloatContainer extends RelativeLayout {

    /* renamed from: G */
    public static final /* synthetic */ int f159731G = 0;

    /* renamed from: A */
    public C32224a<C13598b0> f159732A;

    /* renamed from: B */
    public boolean f159733B;

    /* renamed from: C */
    public int f159734C;

    /* renamed from: D */
    public final C56017a f159735D;

    /* renamed from: E */
    public final ValueAnimator.AnimatorUpdateListener f159736E;

    /* renamed from: F */
    public C32226l<? super View, C13598b0> f159737F;

    /* renamed from: d */
    public final String f159738d;

    /* renamed from: e */
    public final int f159739e;

    /* renamed from: f */
    public final int f159740f;

    /* renamed from: g */
    public int f159741g;

    /* renamed from: h */
    public int f159742h;

    /* renamed from: i */
    public int f159743i;

    /* renamed from: j */
    public int f159744j;

    /* renamed from: n */
    public float f159745n;

    /* renamed from: o */
    public float f159746o;

    /* renamed from: p */
    public int f159747p;

    /* renamed from: q */
    public int f159748q;

    /* renamed from: r */
    public long f159749r;

    /* renamed from: s */
    public int f159750s;

    /* renamed from: t */
    public int f159751t;

    /* renamed from: u */
    public int f159752u;

    /* renamed from: v */
    public int f159753v;

    /* renamed from: w */
    public Drawable f159754w;

    /* renamed from: x */
    public Drawable f159755x;

    /* renamed from: y */
    public Drawable f159756y;

    /* renamed from: z */
    public C32226l<? super MotionEvent, C13598b0> f159757z;

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveFloatContainer$e */
    public static final class C3192e extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveFloatContainer f15231d;

        /* renamed from: e */
        public final /* synthetic */ C32224a<C13598b0> f15232e;

        public C3192e(FinderLiveFloatContainer finderLiveFloatContainer, C32224a<C13598b0> aVar) {
            this.f15231d = finderLiveFloatContainer;
            this.f15232e = aVar;
        }

        public void onAnimationCancel(Animator animator) {
            this.f15231d.bringToFront();
            C32224a<C13598b0> aVar = this.f15232e;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public void onAnimationEnd(Animator animator) {
            this.f15231d.bringToFront();
            C32224a<C13598b0> aVar = this.f15232e;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveFloatContainer$a */
    public static final class C56017a extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveFloatContainer f159758d;

        public C56017a(FinderLiveFloatContainer finderLiveFloatContainer) {
            this.f159758d = finderLiveFloatContainer;
        }

        public void onAnimationCancel(Animator animator) {
            FinderLiveFloatContainer finderLiveFloatContainer = this.f159758d;
            int i = finderLiveFloatContainer.f159747p;
            finderLiveFloatContainer.getClass();
            if (i == 0) {
                FinderLiveFloatContainer finderLiveFloatContainer2 = this.f159758d;
                finderLiveFloatContainer2.setTranslationX((float) finderLiveFloatContainer2.f159742h);
                Drawable drawable = this.f159758d.f159756y;
            } else {
                FinderLiveFloatContainer finderLiveFloatContainer3 = this.f159758d;
                finderLiveFloatContainer3.setTranslationX((float) finderLiveFloatContainer3.f159741g);
                Drawable drawable2 = this.f159758d.f159756y;
            }
            C32224a<C13598b0> onAnimCallback = this.f159758d.getOnAnimCallback();
            if (onAnimCallback != null) {
                onAnimCallback.invoke();
            }
        }

        public void onAnimationEnd(Animator animator) {
            FinderLiveFloatContainer finderLiveFloatContainer = this.f159758d;
            int i = finderLiveFloatContainer.f159747p;
            finderLiveFloatContainer.getClass();
            finderLiveFloatContainer.setBackground(i == 0 ? this.f159758d.f159756y : this.f159758d.f159755x);
            C32224a<C13598b0> onAnimCallback = this.f159758d.getOnAnimCallback();
            if (onAnimCallback != null) {
                onAnimCallback.invoke();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveFloatContainer$b */
    public static final class C56018b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveFloatContainer f159759d;

        public C56018b(FinderLiveFloatContainer finderLiveFloatContainer) {
            this.f159759d = finderLiveFloatContainer;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup.LayoutParams layoutParams = this.f159759d.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            ((ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(((Integer) animatedValue).intValue());
            C32224a<C13598b0> onAnimCallback = this.f159759d.getOnAnimCallback();
            if (onAnimCallback != null) {
                onAnimCallback.invoke();
            }
            this.f159759d.requestLayout();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveFloatContainer$c */
    public static final class C56019c extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ C32224a<C13598b0> f159760d;

        /* renamed from: e */
        public final /* synthetic */ FinderLiveFloatContainer f159761e;

        public C56019c(C32224a<C13598b0> aVar, FinderLiveFloatContainer finderLiveFloatContainer) {
            this.f159760d = aVar;
            this.f159761e = finderLiveFloatContainer;
        }

        public void onAnimationCancel(Animator animator) {
            C32224a<C13598b0> aVar = this.f159760d;
            if (aVar != null) {
                aVar.invoke();
            }
            ViewGroup.LayoutParams layoutParams = this.f159761e.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = this.f159761e.getDefaultTranslationY();
            FinderLiveFloatContainer finderLiveFloatContainer = this.f159761e;
            finderLiveFloatContainer.getClass();
            finderLiveFloatContainer.f159747p = 0;
        }

        public void onAnimationEnd(Animator animator) {
            C32224a<C13598b0> aVar = this.f159760d;
            if (aVar != null) {
                aVar.invoke();
            }
            ViewGroup.LayoutParams layoutParams = this.f159761e.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = this.f159761e.getDefaultTranslationY();
            FinderLiveFloatContainer finderLiveFloatContainer = this.f159761e;
            finderLiveFloatContainer.getClass();
            finderLiveFloatContainer.f159747p = 0;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveFloatContainer$d */
    public static final class C56020d extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveFloatContainer f159762d;

        public C56020d(FinderLiveFloatContainer finderLiveFloatContainer) {
            this.f159762d = finderLiveFloatContainer;
        }

        public void onAnimationCancel(Animator animator) {
            this.f159762d.setVisibility(8);
            ViewGroup.LayoutParams layoutParams = this.f159762d.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = this.f159762d.getDefaultTranslationY();
            ViewGroup.LayoutParams layoutParams2 = this.f159762d.getLayoutParams();
            C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams2).setMarginEnd(0);
            FinderLiveFloatContainer finderLiveFloatContainer = this.f159762d;
            finderLiveFloatContainer.setTranslationX(((float) C75044y4.m89990b(finderLiveFloatContainer.getContext()).x) / ((float) 2));
            FinderLiveFloatContainer finderLiveFloatContainer2 = this.f159762d;
            finderLiveFloatContainer2.setBackground(finderLiveFloatContainer2.f159756y);
            FinderLiveFloatContainer finderLiveFloatContainer3 = this.f159762d;
            finderLiveFloatContainer3.getClass();
            finderLiveFloatContainer3.f159747p = 0;
        }

        public void onAnimationEnd(Animator animator) {
            this.f159762d.setVisibility(8);
            ViewGroup.LayoutParams layoutParams = this.f159762d.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = this.f159762d.getDefaultTranslationY();
            ViewGroup.LayoutParams layoutParams2 = this.f159762d.getLayoutParams();
            C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams2).setMarginEnd(0);
            FinderLiveFloatContainer finderLiveFloatContainer = this.f159762d;
            finderLiveFloatContainer.setTranslationX(((float) C75044y4.m89990b(finderLiveFloatContainer.getContext()).x) / ((float) 2));
            FinderLiveFloatContainer finderLiveFloatContainer2 = this.f159762d;
            finderLiveFloatContainer2.setBackground(finderLiveFloatContainer2.f159756y);
            FinderLiveFloatContainer finderLiveFloatContainer3 = this.f159762d;
            finderLiveFloatContainer3.getClass();
            finderLiveFloatContainer3.f159747p = 0;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveFloatContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        float f;
        C87412m.m108594g(context, "context");
        this.f159738d = "Finder.FinderLiveLinkMicStateContainer";
        this.f159739e = C75044y4.m89990b(context).x;
        this.f159740f = 1;
        this.f159747p = 0;
        this.f159734C = C74942w4.m89784a(context, 116);
        this.f159735D = new C56017a(this);
        this.f159736E = new C56018b(this);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C58591p0.f167750b);
            C87412m.m108593f(obtainStyledAttributes, "context.obtainStyledAttr…FinderLiveFloatContainer)");
            this.f159754w = obtainStyledAttributes.getDrawable(0);
            this.f159755x = obtainStyledAttributes.getDrawable(1);
            this.f159756y = obtainStyledAttributes.getDrawable(2);
            obtainStyledAttributes.recycle();
        }
        setNestedScrollingEnabled(true);
        setActivated(true);
        setClickable(true);
        if (this.f159747p == 0) {
            f = ((float) C75044y4.m89990b(context).x) / ((float) 2);
        } else {
            f = -(((float) C75044y4.m89990b(context).x) / ((float) 2));
        }
        setTranslationX(f);
    }

    /* renamed from: a */
    public final void mo77917a() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        int marginEnd = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginEnd();
        if (this.f159747p == 0) {
            ValueAnimator duration = ValueAnimator.ofInt(new int[]{marginEnd, this.f159741g}).setDuration(100);
            duration.addListener(this.f159735D);
            duration.addUpdateListener(this.f159736E);
            duration.start();
            return;
        }
        ValueAnimator duration2 = ValueAnimator.ofInt(new int[]{marginEnd, this.f159742h}).setDuration(100);
        duration2.addListener(this.f159735D);
        duration2.addUpdateListener(this.f159736E);
        duration2.start();
    }

    /* renamed from: b */
    public final void mo77918b(C32224a<C13598b0> aVar) {
        if (this.f159747p == 0) {
            animate().translationX((float) getMeasuredWidth()).setDuration(500).setListener(new C56019c(aVar, this)).start();
        } else {
            animate().translationX(((float) this.f159741g) - ((float) getMeasuredWidth())).setDuration(500).setListener(new C56020d(this)).start();
        }
    }

    /* renamed from: c */
    public final void mo77919c(C32224a<C13598b0> aVar) {
        animate().translationX(0.0f).setListener(new C3192e(this, aVar)).setDuration(500).start();
    }

    public final int getDefaultTranslationY() {
        return this.f159734C;
    }

    public final boolean getNeedInterceptTouchEvent() {
        return this.f159733B;
    }

    public final C32224a<C13598b0> getOnAnimCallback() {
        return this.f159732A;
    }

    public final C32226l<View, C13598b0> getOnClick() {
        return this.f159737F;
    }

    public final C32226l<MotionEvent, C13598b0> getOnTouchCallback() {
        return this.f159757z;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C32226l<? super View, C13598b0> lVar;
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        boolean z = false;
        if (accessibilityEvent != null && (accessibilityEvent.getEventType() & 1) == 1) {
            z = true;
        }
        if (z && AccUtil.INSTANCE.isAccessibilityEnabled() && (lVar = this.f159737F) != null) {
            lVar.invoke(this);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f159733B) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C32226l<? super View, C13598b0> lVar;
        Integer valueOf = motionEvent != null ? Integer.valueOf(motionEvent.getActionMasked()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            this.f159745n = motionEvent.getRawX() - ((float) getLeft());
            this.f159746o = motionEvent.getRawY() - ((float) getTop());
            this.f159743i = this.f159750s;
            this.f159744j = (C75044y4.m89990b(getContext()).y - getMeasuredHeight()) - this.f159751t;
            this.f159741g = this.f159752u;
            this.f159742h = (C75044y4.m89990b(getContext()).x - getMeasuredWidth()) - this.f159753v;
            this.f159748q = C75044y4.m89990b(getContext()).x / 2;
            this.f159749r = System.currentTimeMillis();
            setBackground(this.f159754w);
            startNestedScroll(2);
        } else if (valueOf != null && valueOf.intValue() == 2) {
            String str = this.f159738d;
            Log.m105924i(str, "x:" + motionEvent.getX() + " y:" + motionEvent.getY() + " rawx:" + motionEvent.getRawX() + " rawy:" + motionEvent.getRawY());
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            float f = (float) 0;
            float f2 = (float) this.f159739e;
            float left = ((float) getLeft()) + (((float) getMeasuredWidth()) / 2.0f);
            if (f2 > left) {
                f2 = left;
            }
            if (f < f2) {
                f = f2;
            }
            if (f > ((float) this.f159748q)) {
                this.f159747p = 0;
            } else {
                this.f159747p = this.f159740f;
            }
            float f3 = (float) this.f159741g;
            float f4 = (float) this.f159742h;
            float f5 = (((float) C75044y4.m89990b(getContext()).x) - rawX) - this.f159745n;
            if (f4 > f5) {
                f4 = f5;
            }
            if (f3 < f4) {
                f3 = f4;
            }
            float f6 = (float) this.f159743i;
            float f7 = (float) this.f159744j;
            float f8 = rawY - this.f159746o;
            if (f7 > f8) {
                f7 = f8;
            }
            if (f6 < f7) {
                f6 = f7;
            }
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd((int) f3);
            ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
            C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = (int) f6;
            requestLayout();
        } else if (valueOf != null && valueOf.intValue() == 3) {
            mo77917a();
            this.f159749r = 0;
            this.f159748q = 0;
            stopNestedScroll();
        } else if (valueOf != null && valueOf.intValue() == 1) {
            if (System.currentTimeMillis() - this.f159749r < ((long) ViewConfiguration.getTapTimeout()) && (lVar = this.f159737F) != null) {
                lVar.invoke(this);
            }
            mo77917a();
            this.f159749r = 0;
            this.f159748q = 0;
            stopNestedScroll();
        }
        C32226l<? super MotionEvent, C13598b0> lVar2 = this.f159757z;
        if (lVar2 != null) {
            lVar2.invoke(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setDefaultTranslationY(int i) {
        this.f159734C = i;
    }

    public final void setNeedInterceptTouchEvent(boolean z) {
        this.f159733B = z;
    }

    public final void setOnAnimCallback(C32224a<C13598b0> aVar) {
        this.f159732A = aVar;
    }

    public final void setOnClick(C32226l<? super View, C13598b0> lVar) {
        this.f159737F = lVar;
    }

    public final void setOnTouchCallback(C32226l<? super MotionEvent, C13598b0> lVar) {
        this.f159757z = lVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FinderLiveFloatContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }
}
