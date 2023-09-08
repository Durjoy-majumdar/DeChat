package qj1;

import android.view.View;
import android.view.animation.Animation;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: qj1.n5 */
public final class C12542n5 implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ C12322e5 f36031a;

    public C12542n5(C12322e5 e5Var) {
        this.f36031a = e5Var;
    }

    public void onAnimationEnd(Animation animation) {
        View view = this.f36031a.f35529t;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin$unDoDescSticky$1$1", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin$unDoDescSticky$1$1", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
