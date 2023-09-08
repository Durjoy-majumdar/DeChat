package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.material.bottomappbar.a */
public class C104411a extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ BottomAppBar f309151d;

    public C104411a(BottomAppBar bottomAppBar) {
        this.f309151d = bottomAppBar;
    }

    public void onAnimationEnd(Animator animator) {
        this.f309151d.f309136Q0 = null;
    }
}
