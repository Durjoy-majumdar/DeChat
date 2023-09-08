package zo1;

import android.animation.Animator;
import android.view.View;
import gy3.C8477a0;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kotlin.Result;
import rx3.C36570n;
import wx3.C15601d;

/* renamed from: zo1.d0 */
public final class C16353d0 implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ C16344b0 f43716d;

    /* renamed from: e */
    public final /* synthetic */ C8477a0 f43717e;

    /* renamed from: f */
    public final /* synthetic */ C15601d<Boolean> f43718f;

    public C16353d0(C16344b0 b0Var, C8477a0 a0Var, C15601d<? super Boolean> dVar) {
        this.f43716d = b0Var;
        this.f43717e = a0Var;
        this.f43718f = dVar;
    }

    public void onAnimationCancel(Animator animator) {
        C8477a0 a0Var = this.f43717e;
        C15601d<Boolean> dVar = this.f43718f;
        if (!a0Var.f27482d) {
            a0Var.f27482d = true;
            dVar.resumeWith(Result.m168114constructorimpl(Boolean.FALSE));
        }
    }

    public void onAnimationEnd(Animator animator) {
        Object value = ((C36570n) this.f43716d.f43703v).getValue();
        C87412m.m108593f(value, "<get-countDownGroup>(...)");
        View view = (View) value;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/replay/plugin/ReplayTransitionLazyPlugin$countdownToPlayReplay$2$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/replay/plugin/ReplayTransitionLazyPlugin$countdownToPlayReplay$2$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C8477a0 a0Var = this.f43717e;
        C15601d<Boolean> dVar = this.f43718f;
        if (!a0Var.f27482d) {
            a0Var.f27482d = true;
            dVar.resumeWith(Result.m168114constructorimpl(Boolean.TRUE));
        }
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}
