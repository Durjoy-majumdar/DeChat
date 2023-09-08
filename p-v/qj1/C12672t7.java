package qj1;

import android.view.View;
import android.view.ViewPropertyAnimator;
import fy3.C32224a;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;

/* renamed from: qj1.t7 */
public final class C12672t7 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C12611q7 f36303d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12672t7(C12611q7 q7Var) {
        super(0);
        this.f36303d = q7Var;
    }

    public Object invoke() {
        if (this.f36303d.f36152q.getVisibility() == 0 && this.f36303d.f36152q.isPlaying() && this.f36303d.f36153r.getVisibility() != 0) {
            View view = this.f36303d.f36153r;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPlayPlugin$tryShowHideTip$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPlayPlugin$tryShowHideTip$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view2 = this.f36303d.f36153r;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(Float.valueOf(0.0f));
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPlayPlugin$tryShowHideTip$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPlayPlugin$tryShowHideTip$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            C12611q7 q7Var = this.f36303d;
            q7Var.f36154s = q7Var.f36153r.animate().alpha(1.0f).setDuration(200);
            ViewPropertyAnimator viewPropertyAnimator = this.f36303d.f36154s;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.start();
            }
        }
        return C13598b0.f38549a;
    }
}
