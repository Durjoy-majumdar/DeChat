package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.material.bottomappbar.d */
public class C104414d extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ BottomAppBar f309158d;

    public C104414d(BottomAppBar bottomAppBar) {
        this.f309158d = bottomAppBar;
    }

    public void onAnimationEnd(Animator animator) {
        this.f309158d.f309145y0 = null;
    }
}
