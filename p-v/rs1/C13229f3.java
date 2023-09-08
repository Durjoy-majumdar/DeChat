package rs1;

import android.animation.Animator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import de1.C7290r;
import j20.C117292a;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;

/* renamed from: rs1.f3 */
public final class C13229f3 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ View f37573d;

    /* renamed from: e */
    public final /* synthetic */ boolean f37574e;

    /* renamed from: f */
    public final /* synthetic */ C13181d3 f37575f;

    /* renamed from: g */
    public final /* synthetic */ C60905o f37576g;

    /* renamed from: rs1.f3$a */
    public static final class C13230a extends C7290r {

        /* renamed from: d */
        public final /* synthetic */ View f37577d;

        /* renamed from: e */
        public final /* synthetic */ C13181d3 f37578e;

        /* renamed from: f */
        public final /* synthetic */ C60905o f37579f;

        public C13230a(View view, C13181d3 d3Var, C60905o oVar) {
            this.f37577d = view;
            this.f37578e = d3Var;
            this.f37579f = oVar;
        }

        public void onAnimationEnd(Animator animator) {
            View view = this.f37577d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(1.0f));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedWordingUIC$animateWordingShow$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedWordingUIC$animateWordingShow$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            this.f37578e.mo12755f3(this.f37579f);
        }
    }

    public C13229f3(View view, boolean z, C13181d3 d3Var, C60905o oVar) {
        this.f37573d = view;
        this.f37574e = z;
        this.f37575f = d3Var;
        this.f37576g = oVar;
    }

    public final void run() {
        ViewPropertyAnimator alpha = this.f37573d.animate().alpha(1.0f);
        if (this.f37574e) {
            View view = this.f37573d;
            view.setPivotX(((float) view.getWidth()) / 2.0f);
            View view2 = this.f37573d;
            view2.setPivotY(((float) view2.getHeight()) * 1.0f);
            this.f37573d.setScaleX(0.0f);
            this.f37573d.setScaleY(0.0f);
            alpha.scaleX(1.0f).scaleY(1.0f);
        }
        alpha.setDuration(250).setListener(new C13230a(this.f37573d, this.f37575f, this.f37576g)).start();
    }
}
