package il1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Color;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: il1.e5 */
public final class C60391e5 extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ C60357c5 f172196d;

    public C60391e5(C60357c5 c5Var) {
        this.f172196d = c5Var;
    }

    public void onAnimationCancel(Animator animator) {
        View view = this.f172196d.f172074e;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(1.0f));
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveLoadingTipWidget$hideLoadingLayer$1$2", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveLoadingTipWidget$hideLoadingLayer$1$2", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.f172196d.f172076g.setAlpha(1.0f);
        C60357c5 c5Var = this.f172196d;
        c5Var.f172073d.setElevation((float) c5Var.f172070a.getContext().getResources().getDimensionPixelSize(C0966R.dimen.ad7));
        View view2 = this.f172196d.f172074e;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveLoadingTipWidget$hideLoadingLayer$1$2", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveLoadingTipWidget$hideLoadingLayer$1$2", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f172196d.f172075f.setVisibility(8);
        this.f172196d.f172076g.setVisibility(8);
        this.f172196d.f172078i.setVisibility(8);
        this.f172196d.f172079j.setVisibility(8);
        TextView textView = this.f172196d.f172080k;
        if (textView != null) {
            textView.setVisibility(8);
        }
        C60357c5.m70622d(this.f172196d, false, 1, (Object) null);
        this.f172196d.f172083n.setVisibility(8);
        this.f172196d.f172083n.setBackgroundColor(Color.parseColor("#99000000"));
        this.f172196d.f172083n.setClickable(false);
    }

    public void onAnimationEnd(Animator animator) {
        View view = this.f172196d.f172074e;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(1.0f));
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveLoadingTipWidget$hideLoadingLayer$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveLoadingTipWidget$hideLoadingLayer$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.f172196d.f172076g.setAlpha(1.0f);
        C60357c5 c5Var = this.f172196d;
        c5Var.f172073d.setElevation((float) c5Var.f172070a.getContext().getResources().getDimensionPixelSize(C0966R.dimen.ad7));
        View view2 = this.f172196d.f172074e;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveLoadingTipWidget$hideLoadingLayer$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveLoadingTipWidget$hideLoadingLayer$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f172196d.f172075f.setVisibility(8);
        this.f172196d.f172076g.setVisibility(8);
        this.f172196d.f172078i.setVisibility(8);
        this.f172196d.f172079j.setVisibility(8);
        TextView textView = this.f172196d.f172080k;
        if (textView != null) {
            textView.setVisibility(8);
        }
        C60357c5.m70622d(this.f172196d, false, 1, (Object) null);
        this.f172196d.f172083n.setVisibility(8);
        this.f172196d.f172083n.setBackgroundColor(Color.parseColor("#99000000"));
        this.f172196d.f172083n.setClickable(false);
    }
}
