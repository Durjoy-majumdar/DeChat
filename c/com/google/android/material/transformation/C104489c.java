package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.circularreveal.C104444c;

/* renamed from: com.google.android.material.transformation.c */
public class C104489c extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ C104444c f309657d;

    public C104489c(FabTransformationBehavior fabTransformationBehavior, C104444c cVar) {
        this.f309657d = cVar;
    }

    public void onAnimationEnd(Animator animator) {
        C104444c.C104448d revealInfo = this.f309657d.getRevealInfo();
        revealInfo.f309367c = Float.MAX_VALUE;
        this.f309657d.setRevealInfo(revealInfo);
    }
}
