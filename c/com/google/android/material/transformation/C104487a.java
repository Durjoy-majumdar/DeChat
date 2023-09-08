package com.google.android.material.transformation;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: com.google.android.material.transformation.a */
public class C104487a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ View f309654d;

    public C104487a(FabTransformationBehavior fabTransformationBehavior, View view) {
        this.f309654d = view;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f309654d.invalidate();
    }
}
