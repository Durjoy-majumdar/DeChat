package tr1;

import android.animation.Animator;
import android.view.View;
import de1.C7290r;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: tr1.e */
public final class C14067e extends C7290r {

    /* renamed from: d */
    public final /* synthetic */ View f39460d;

    public C14067e(View view) {
        this.f39460d = view;
    }

    public void onAnimationEnd(Animator animator) {
        View view = this.f39460d;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(1.0f));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/animation/LikeIconAnimationHelper$startAvatarAnimator$3$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/view/animation/LikeIconAnimationHelper$startAvatarAnimator$3$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
    }
}
