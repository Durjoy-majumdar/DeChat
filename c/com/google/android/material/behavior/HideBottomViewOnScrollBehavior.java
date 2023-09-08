package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p161h8.C108164a;

public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: d */
    public int f309118d = 0;

    /* renamed from: e */
    public int f309119e = 2;

    /* renamed from: f */
    public ViewPropertyAnimator f309120f;

    /* renamed from: com.google.android.material.behavior.HideBottomViewOnScrollBehavior$a */
    public class C104405a extends AnimatorListenerAdapter {
        public C104405a() {
        }

        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f309120f = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
    }

    /* renamed from: f */
    public boolean mo94960f(CoordinatorLayout coordinatorLayout, V v, int i) {
        this.f309118d = v.getMeasuredHeight();
        return false;
    }

    /* renamed from: l */
    public void mo144928l(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        int i5 = this.f309119e;
        if (i5 != 1 && i2 > 0) {
            mo146266x(v);
        } else if (i5 != 2 && i2 < 0) {
            mo146267y(v);
        }
    }

    /* renamed from: r */
    public boolean mo143317r(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        return i == 2;
    }

    /* renamed from: w */
    public final void mo146265w(V v, int i, long j, TimeInterpolator timeInterpolator) {
        this.f309120f = v.animate().translationY((float) i).setInterpolator(timeInterpolator).setDuration(j).setListener(new C104405a());
    }

    /* renamed from: x */
    public void mo146266x(V v) {
        ViewPropertyAnimator viewPropertyAnimator = this.f309120f;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        this.f309119e = 1;
        mo146265w(v, this.f309118d, 175, C108164a.f323892c);
    }

    /* renamed from: y */
    public void mo146267y(V v) {
        ViewPropertyAnimator viewPropertyAnimator = this.f309120f;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        this.f309119e = 2;
        mo146265w(v, 0, 225, C108164a.f323893d);
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
