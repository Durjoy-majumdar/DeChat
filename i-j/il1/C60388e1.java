package il1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: il1.e1 */
public final class C60388e1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C60352c1 f172193d;

    /* renamed from: il1.e1$a */
    public static final class C60389a extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ C60352c1 f172194d;

        public C60389a(C60352c1 c1Var) {
            this.f172194d = c1Var;
        }

        public void onAnimationCancel(Animator animator) {
            View view = this.f172194d.f172053r;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattleBarWidget$postStartUserHideAnimation$1$1", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattleBarWidget$postStartUserHideAnimation$1$1", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }

        public void onAnimationEnd(Animator animator) {
            View view = this.f172194d.f172053r;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattleBarWidget$postStartUserHideAnimation$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattleBarWidget$postStartUserHideAnimation$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public C60388e1(C60352c1 c1Var) {
        this.f172193d = c1Var;
    }

    public final void run() {
        this.f172193d.f172053r.animate().alpha(0.0f).setDuration(500).setListener(new C60389a(this.f172193d)).start();
    }
}
