package com.tencent.p014mm.plugin.fav.p047ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.tencent.mm.plugin.fav.ui.e2 */
public class C93591e2 extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ PhotoTransControl f270265d;

    public C93591e2(PhotoTransControl photoTransControl) {
        this.f270265d = photoTransControl;
    }

    public void onAnimationEnd(Animator animator) {
        this.f270265d.f269951g.setAlpha(0.0f);
    }

    public void onAnimationStart(Animator animator) {
        this.f270265d.f269951g.setAlpha(0.0f);
    }
}
