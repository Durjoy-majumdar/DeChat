package qj1;

import android.animation.Animator;
import android.view.View;
import com.tencent.p014mm.plugin.finder.live.plugin.FinderLiveRandomMatchLinkMicStatePlugin;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: qj1.qd */
public final class C12624qd implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveRandomMatchLinkMicStatePlugin f36184d;

    public C12624qd(FinderLiveRandomMatchLinkMicStatePlugin finderLiveRandomMatchLinkMicStatePlugin) {
        this.f36184d = finderLiveRandomMatchLinkMicStatePlugin;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
        View view = this.f36184d.f15150t;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRandomMatchLinkMicStatePlugin$initAnimator$2", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRandomMatchLinkMicStatePlugin$initAnimator$2", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
