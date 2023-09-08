package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import com.google.android.material.circularreveal.C104444c;

/* renamed from: com.google.android.material.transformation.b */
public class C104488b extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ C104444c f309655d;

    /* renamed from: e */
    public final /* synthetic */ Drawable f309656e;

    public C104488b(FabTransformationBehavior fabTransformationBehavior, C104444c cVar, Drawable drawable) {
        this.f309655d = cVar;
        this.f309656e = drawable;
    }

    public void onAnimationEnd(Animator animator) {
        this.f309655d.setCircularRevealOverlayDrawable((Drawable) null);
    }

    public void onAnimationStart(Animator animator) {
        this.f309655d.setCircularRevealOverlayDrawable(this.f309656e);
    }
}
