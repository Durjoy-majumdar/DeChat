package com.tencent.p014mm.plugin.p019aa.p020ui;

import android.animation.Animator;

/* renamed from: com.tencent.mm.plugin.aa.ui.b */
public class C92890b implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ AAImagPreviewUI f267580d;

    public C92890b(AAImagPreviewUI aAImagPreviewUI) {
        this.f267580d = aAImagPreviewUI;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        this.f267580d.f267567n = false;
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
        this.f267580d.f267569p.setVisibility(0);
    }
}
