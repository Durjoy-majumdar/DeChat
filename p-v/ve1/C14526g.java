package ve1;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import com.tencent.p014mm.C0966R;
import fj3.C20713c;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import rx3.C13601g;
import rx3.C36570n;

/* renamed from: ve1.g */
public final class C14526g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ View f40269d;

    /* renamed from: ve1.g$a */
    public static final class C14527a implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ View f40270d;

        public C14527a(View view) {
            this.f40270d = view;
        }

        public void onAnimationCancel(Animator animator) {
            View view = this.f40270d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(1.0f));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderCollectionFilterConvert$startAnimator$1$1", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/convert/FinderCollectionFilterConvert$startAnimator$1$1", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }

        public void onAnimationEnd(Animator animator) {
            View view = this.f40270d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(1.0f));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderCollectionFilterConvert$startAnimator$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/convert/FinderCollectionFilterConvert$startAnimator$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            View view = this.f40270d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderCollectionFilterConvert$startAnimator$1$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/convert/FinderCollectionFilterConvert$startAnimator$1$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view2 = this.f40270d;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(Float.valueOf(0.0f));
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderCollectionFilterConvert$startAnimator$1$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/convert/FinderCollectionFilterConvert$startAnimator$1$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
    }

    public C14526g(View view) {
        this.f40269d = view;
    }

    public final void run() {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f40269d, "translationX", new float[]{-((float) C76577a.m92155f(this.f40269d.getContext(), C0966R.dimen.f3749d0)), 0.0f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f40269d, View.ALPHA, new float[]{0.0f, 1.0f});
        animatorSet.setDuration(350);
        C20713c cVar = C20713c.f58572a;
        C13601g gVar = C20713c.f58574c;
        ofFloat2.setInterpolator((Interpolator) ((C36570n) gVar).getValue());
        ofFloat.setInterpolator((Interpolator) ((C36570n) gVar).getValue());
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.addListener(new C14527a(this.f40269d));
        animatorSet.start();
    }
}
