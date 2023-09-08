package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.animation.Animator;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.y0 */
public class C5755y0 implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ Boolean f21809d;

    /* renamed from: e */
    public final /* synthetic */ WalletLqtPlanAddUI f21810e;

    public C5755y0(WalletLqtPlanAddUI walletLqtPlanAddUI, Boolean bool) {
        this.f21810e = walletLqtPlanAddUI;
        this.f21809d = bool;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        if (!this.f21809d.booleanValue()) {
            this.f21810e.f208013T.setVisibility(8);
        }
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}
