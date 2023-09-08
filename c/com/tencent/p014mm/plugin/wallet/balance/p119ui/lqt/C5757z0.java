package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.animation.Animator;
import android.view.View;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.z0 */
public class C5757z0 implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ Boolean f21812d;

    /* renamed from: e */
    public final /* synthetic */ WalletLqtPlanAddUI f21813e;

    public C5757z0(WalletLqtPlanAddUI walletLqtPlanAddUI, Boolean bool) {
        this.f21813e = walletLqtPlanAddUI;
        this.f21812d = bool;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        if (this.f21812d.booleanValue()) {
            View view = this.f21813e.f208040z;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanAddUI$29", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanAddUI$29", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        View view3 = this.f21813e.f208040z;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(0);
        View view4 = view3;
        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanAddUI$29", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanAddUI$29", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}
