package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* renamed from: e */
    public AnimatorSet f309645e;

    /* renamed from: com.google.android.material.transformation.ExpandableTransformationBehavior$a */
    public class C104485a extends AnimatorListenerAdapter {
        public C104485a() {
        }

        public void onAnimationEnd(Animator animator) {
            ExpandableTransformationBehavior.this.f309645e = null;
        }
    }

    public ExpandableTransformationBehavior() {
    }

    /* renamed from: w */
    public boolean mo147065w(View view, View view2, boolean z, boolean z2) {
        AnimatorSet animatorSet = this.f309645e;
        boolean z3 = animatorSet != null;
        if (z3) {
            animatorSet.cancel();
        }
        AnimatorSet x = mo844x(view, view2, z, z3);
        this.f309645e = x;
        x.addListener(new C104485a());
        this.f309645e.start();
        if (!z2) {
            this.f309645e.end();
        }
        return true;
    }

    /* renamed from: x */
    public abstract AnimatorSet mo844x(View view, View view2, boolean z, boolean z2);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
