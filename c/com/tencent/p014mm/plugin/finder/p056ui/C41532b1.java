package com.tencent.p014mm.plugin.finder.p056ui;

import android.animation.Animator;
import android.view.View;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.finder.ui.b1 */
public final class C41532b1 implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ FinderImagePreviewUI f111838d;

    public C41532b1(FinderImagePreviewUI finderImagePreviewUI) {
        this.f111838d = finderImagePreviewUI;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        this.f111838d.f270643u = false;
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
        View view = this.f111838d.f270640r;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/ui/FinderImagePreviewUI$runEnterAnimation$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/ui/FinderImagePreviewUI$runEnterAnimation$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        C87412m.m108603p("galleryBg");
        throw null;
    }
}
