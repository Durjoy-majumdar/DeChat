package com.tencent.p014mm.plugin.scanner.p101ui;

import android.animation.Animator;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.MultiTouchImageView;

/* renamed from: com.tencent.mm.plugin.scanner.ui.u */
public class C94526u implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ TranslationResultUI f273346d;

    public C94526u(TranslationResultUI translationResultUI) {
        this.f273346d = translationResultUI;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        this.f273346d.finish();
        this.f273346d.overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2333y);
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
        MultiTouchImageView multiTouchImageView = this.f273346d.f273291p;
        if (multiTouchImageView != null) {
            if (multiTouchImageView.getScale() > 1.0f) {
                this.f273346d.f273291p.mo26059d();
            }
            TranslationResultUI translationResultUI = this.f273346d;
            translationResultUI.f273299x = translationResultUI.f273291p.getTranslationX();
            TranslationResultUI translationResultUI2 = this.f273346d;
            translationResultUI2.f273300y = translationResultUI2.f273291p.getTranslationY();
            TranslationResultUI translationResultUI3 = this.f273346d;
            translationResultUI3.f273297v = translationResultUI3.f273291p.getScaleX();
            TranslationResultUI translationResultUI4 = this.f273346d;
            translationResultUI4.f273298w = translationResultUI4.f273291p.getScaleY();
        }
    }
}
