package com.tencent.p014mm.plugin.profile.p088ui;

import android.animation.Animator;

/* renamed from: com.tencent.mm.plugin.profile.ui.b3 */
public class C70254b3 implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ Runnable f203007d;

    public C70254b3(SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI3, Runnable runnable) {
        this.f203007d = runnable;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        Runnable runnable = this.f203007d;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}
