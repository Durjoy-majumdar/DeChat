package com.tencent.p014mm.p136ui.widget.pulldown;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import gy3.C87412m;
import kotlin.Metadata;
import p282z2.C16095a;
import p849e3.C107207u;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo182094d2 = {"Lcom/tencent/mm/ui/widget/pulldown/AppLayoutPullDownBehavior;", "Lcom/google/android/material/appbar/AppBarLayout$ScrollingViewBehavior;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "weui-native-android-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.widget.pulldown.AppLayoutPullDownBehavior */
public final class AppLayoutPullDownBehavior extends AppBarLayout.ScrollingViewBehavior {

    /* renamed from: j */
    public OverScroller f319656j;

    /* renamed from: n */
    public int f319657n;

    /* renamed from: o */
    public int f319658o;

    /* renamed from: p */
    public int f319659p;

    /* renamed from: q */
    public ValueAnimator f319660q;

    /* renamed from: r */
    public final Interpolator f319661r = new DecelerateInterpolator(0.8f);

    /* renamed from: com.tencent.mm.ui.widget.pulldown.AppLayoutPullDownBehavior$a */
    public static final class C75011a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ AppLayoutPullDownBehavior f220712d;

        /* renamed from: e */
        public final /* synthetic */ View f220713e;

        public C75011a(AppLayoutPullDownBehavior appLayoutPullDownBehavior, View view) {
            this.f220712d = appLayoutPullDownBehavior;
            this.f220713e = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) animatedValue).intValue();
            AppLayoutPullDownBehavior appLayoutPullDownBehavior = this.f220712d;
            View view = this.f220713e;
            appLayoutPullDownBehavior.getClass();
            C87412m.m108594g(view, "child");
            view.setTranslationY((float) intValue);
        }
    }

    public AppLayoutPullDownBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: C */
    public final int mo154595C(View view, int i) {
        C87412m.m108594g(view, "child");
        return (i == 2 || i == 8) ? view.getHeight() / 3 : (-view.getHeight()) / 3;
    }

    /* renamed from: D */
    public final int mo154596D(View view) {
        C87412m.m108594g(view, "child");
        return (int) view.getTranslationY();
    }

    /* renamed from: E */
    public final int mo154597E(View view, int i, int i2, int i3) {
        int b;
        int D = mo154596D(view);
        float f = 1.0f;
        boolean z = true;
        float abs = ((float) 1) + (((float) 4) * ((((float) Math.abs(mo154596D(view))) * 1.0f) / ((float) view.getHeight())));
        if (abs != 0.0f) {
            z = false;
        }
        if (!z) {
            f = abs;
        }
        int i4 = D - ((int) ((((float) i) / f) + 0.5f));
        int D2 = mo154596D(view);
        if (D2 < i2 || D2 > i3 || D2 == (b = C16095a.m14980b(i4, i2, i3))) {
            return 0;
        }
        view.setTranslationY((float) b);
        return D2 - b;
    }

    /* renamed from: F */
    public final void mo154598F(View view) {
        C87412m.m108594g(view, "child");
        int D = mo154596D(view);
        if (D != 0) {
            if (this.f319660q == null) {
                ValueAnimator ofInt = ValueAnimator.ofInt(new int[0]);
                this.f319660q = ofInt;
                if (ofInt != null) {
                    ofInt.addUpdateListener(new C75011a(this, view));
                }
            }
            ValueAnimator valueAnimator = this.f319660q;
            if (!(valueAnimator != null && valueAnimator.isStarted())) {
                float abs = ((((float) Math.abs(D)) * 1.0f) / ((float) view.getHeight())) * ((float) 300);
                ValueAnimator valueAnimator2 = this.f319660q;
                if (valueAnimator2 != null) {
                    valueAnimator2.setDuration((long) Math.max((int) abs, 150));
                }
                ValueAnimator valueAnimator3 = this.f319660q;
                if (valueAnimator3 != null) {
                    valueAnimator3.setInterpolator(this.f319661r);
                }
                ValueAnimator valueAnimator4 = this.f319660q;
                if (valueAnimator4 != null) {
                    valueAnimator4.setIntValues(new int[]{D, 0});
                }
                ValueAnimator valueAnimator5 = this.f319660q;
                if (valueAnimator5 != null) {
                    valueAnimator5.start();
                }
            }
        }
    }

    /* renamed from: b */
    public boolean mo842b(CoordinatorLayout coordinatorLayout, View view, View view2) {
        C87412m.m108594g(coordinatorLayout, "parent");
        C87412m.m108594g(view, "child");
        C87412m.m108594g(view2, "dependency");
        return view2 instanceof AppBarLayout;
    }

    /* renamed from: d */
    public boolean mo133275d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        C87412m.m108594g(coordinatorLayout, "parent");
        C87412m.m108594g(view, "child");
        C87412m.m108594g(view2, "dependency");
        super.mo133275d(coordinatorLayout, view, view2);
        return false;
    }

    /* renamed from: f */
    public boolean mo94960f(CoordinatorLayout coordinatorLayout, View view, int i) {
        C87412m.m108594g(coordinatorLayout, "parent");
        C87412m.m108594g(view, "child");
        Integer.TYPE.getName();
        super.mo94960f(coordinatorLayout, view, i);
        return true;
    }

    /* renamed from: h */
    public boolean mo95459h(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2, boolean z) {
        C87412m.m108594g(coordinatorLayout, "coordinatorLayout");
        C87412m.m108594g(view, "child");
        C87412m.m108594g(view2, "target");
        view2.toString();
        return false;
    }

    /* renamed from: i */
    public boolean mo95460i(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2) {
        C87412m.m108594g(coordinatorLayout, "coordinatorLayout");
        C87412m.m108594g(view, "child");
        C87412m.m108594g(view2, "target");
        if (this.f319656j == null) {
            this.f319656j = new OverScroller(coordinatorLayout.getContext());
        }
        OverScroller overScroller = this.f319656j;
        if (overScroller == null) {
            return false;
        }
        overScroller.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return false;
    }

    /* renamed from: k */
    public void mo94961k(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        int i4;
        int i5;
        int b;
        C87412m.m108594g(coordinatorLayout, "coordinatorLayout");
        C87412m.m108594g(view, "child");
        C87412m.m108594g(view2, "target");
        C87412m.m108594g(iArr, "consumed");
        view.getClass().toString();
        view2.getClass().toString();
        int i6 = 0;
        if (i2 != 0) {
            if (i2 < 0) {
                i5 = mo154596D(coordinatorLayout);
                i4 = 0;
            } else {
                i4 = mo154596D(coordinatorLayout);
                i5 = 0;
            }
            if (i5 != i4) {
                int D = mo154596D(coordinatorLayout) - i2;
                int D2 = mo154596D(coordinatorLayout);
                if (D2 >= i5 && D2 <= i4 && D2 != (b = C16095a.m14980b(D, i5, i4))) {
                    coordinatorLayout.setTranslationY((float) b);
                    i6 = D2 - b;
                }
            }
        }
        iArr[1] = i6;
    }

    /* renamed from: m */
    public void mo78308m(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5) {
        C87412m.m108594g(coordinatorLayout, "coordinatorLayout");
        C87412m.m108594g(view, "child");
        C87412m.m108594g(view2, "target");
        if (i2 != 0 || i4 == 0) {
            super.mo78308m(coordinatorLayout, view, view2, i, i2, i3, i4, i5);
        } else if (i4 < 0) {
            if (i5 == 0) {
                mo154597E(coordinatorLayout, i4, 0, coordinatorLayout.getHeight());
                return;
            }
            OverScroller overScroller = this.f319656j;
            if (overScroller != null && overScroller.computeScrollOffset()) {
                float abs = Math.abs(overScroller.getCurrVelocity());
                if (this.f319659p <= 0) {
                    this.f319659p = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledMinimumFlingVelocity() * 15;
                }
                if (abs >= ((float) Math.abs(this.f319659p)) && mo154596D(coordinatorLayout) < mo154595C(coordinatorLayout, this.f319657n)) {
                    mo154597E(coordinatorLayout, i4, mo154596D(coordinatorLayout), mo154595C(coordinatorLayout, this.f319657n));
                    return;
                }
            }
            C107207u.m145171l(view2, 1);
        } else if (i4 <= 0) {
        } else {
            if (i5 == 0) {
                mo154597E(coordinatorLayout, i4, -coordinatorLayout.getHeight(), 0);
                return;
            }
            OverScroller overScroller2 = this.f319656j;
            if (overScroller2 != null && overScroller2.computeScrollOffset()) {
                float abs2 = Math.abs(overScroller2.getCurrVelocity());
                if (this.f319659p <= 0) {
                    this.f319659p = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledMinimumFlingVelocity() * 15;
                }
                if (abs2 >= ((float) Math.abs(this.f319659p)) && mo154596D(coordinatorLayout) > mo154595C(coordinatorLayout, this.f319658o)) {
                    mo154597E(coordinatorLayout, i4, mo154595C(coordinatorLayout, this.f319658o), mo154596D(coordinatorLayout));
                    return;
                }
            }
            C107207u.m145171l(view2, 1);
        }
    }

    /* renamed from: n */
    public void mo144929n(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        OverScroller overScroller;
        ValueAnimator valueAnimator;
        C87412m.m108594g(coordinatorLayout, "coordinatorLayout");
        C87412m.m108594g(view, "child");
        C87412m.m108594g(view2, "directTargetChild");
        C87412m.m108594g(view3, "target");
        view2.toString();
        if (i2 == 0 && (valueAnimator = this.f319660q) != null && valueAnimator.isRunning()) {
            ValueAnimator valueAnimator2 = this.f319660q;
            C87412m.m108591d(valueAnimator2);
            valueAnimator2.cancel();
        }
        if (i2 == 0 && (overScroller = this.f319656j) != null) {
            overScroller.forceFinished(true);
        }
        if ((i & 2) != 0) {
            this.f319657n = 2;
            this.f319658o = 1;
            return;
        }
        this.f319657n = 8;
        this.f319658o = 4;
    }

    /* renamed from: s */
    public boolean mo5059s(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        C87412m.m108594g(coordinatorLayout, "coordinatorLayout");
        C87412m.m108594g(view, "child");
        C87412m.m108594g(view2, "directTargetChild");
        C87412m.m108594g(view3, "target");
        return (i & 2) != 0;
    }

    /* renamed from: u */
    public void mo78309u(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        C87412m.m108594g(coordinatorLayout, "coordinatorLayout");
        C87412m.m108594g(view, "child");
        C87412m.m108594g(view2, "target");
        view.getClass().toString();
        view2.toString();
        if (i == 0) {
            if (mo154596D(coordinatorLayout) != 0) {
                OverScroller overScroller = this.f319656j;
                if (overScroller == null || !overScroller.computeScrollOffset()) {
                    mo154598F(coordinatorLayout);
                }
            }
        } else if (mo154596D(coordinatorLayout) != 0) {
            mo154598F(coordinatorLayout);
        }
    }
}
