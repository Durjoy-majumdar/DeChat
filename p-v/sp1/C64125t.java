package sp1;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShopHotSellView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8477a0;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kotlin.Result;
import wx3.C15601d;

/* renamed from: sp1.t */
public final class C64125t implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveShopHotSellView f181796d;

    /* renamed from: e */
    public final /* synthetic */ C8477a0 f181797e;

    /* renamed from: f */
    public final /* synthetic */ C15601d<Boolean> f181798f;

    /* renamed from: g */
    public final /* synthetic */ String f181799g;

    public C64125t(FinderLiveShopHotSellView finderLiveShopHotSellView, C8477a0 a0Var, C15601d<? super Boolean> dVar, String str) {
        this.f181796d = finderLiveShopHotSellView;
        this.f181797e = a0Var;
        this.f181798f = dVar;
        this.f181799g = str;
    }

    public void onAnimationCancel(Animator animator) {
        C8477a0 a0Var = this.f181797e;
        if (!a0Var.f27482d) {
            a0Var.f27482d = true;
            C15601d<Boolean> dVar = this.f181798f;
            Result.Companion companion = Result.Companion;
            dVar.resumeWith(Result.m168114constructorimpl(Boolean.FALSE));
            return;
        }
        Log.m105920e("FinderLiveShopHotSellView", this.f181799g + " startSellNumAnim onAnimationCancel again!");
    }

    public void onAnimationEnd(Animator animator) {
        ObjectAnimator f = this.f181796d.getSellNumAlpha1();
        View view = null;
        Object target = f != null ? f.getTarget() : null;
        View view2 = target instanceof View ? (View) target : null;
        if (view2 != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(1.0f));
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShopHotSellView$startSellNumAnim$2$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShopHotSellView$startSellNumAnim$2$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        ObjectAnimator g = this.f181796d.getSellNumScalex1();
        Object target2 = g != null ? g.getTarget() : null;
        View view3 = target2 instanceof View ? (View) target2 : null;
        if (view3 != null) {
            view3.setScaleX(1.0f);
        }
        ObjectAnimator i = this.f181796d.getSellNumScaley1();
        Object target3 = i != null ? i.getTarget() : null;
        if (target3 instanceof View) {
            view = (View) target3;
        }
        if (view != null) {
            view.setScaleY(1.0f);
        }
        C8477a0 a0Var = this.f181797e;
        if (!a0Var.f27482d) {
            a0Var.f27482d = true;
            C15601d<Boolean> dVar = this.f181798f;
            Result.Companion companion = Result.Companion;
            dVar.resumeWith(Result.m168114constructorimpl(Boolean.TRUE));
        } else {
            Log.m105920e("FinderLiveShopHotSellView", this.f181799g + " startSellNumAnim onAnimationEnd again!");
        }
        ObjectAnimator f2 = this.f181796d.getSellNumAlpha1();
        if (f2 != null) {
            f2.removeAllListeners();
        }
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}
