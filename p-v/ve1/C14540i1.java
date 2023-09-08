package ve1;

import android.animation.Animator;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.convert.FinderFeedFullConvert;
import com.tencent.p014mm.plugin.finder.feed.RoundLinearLayout;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import de1.C7290r;
import fy3.C32224a;
import gy3.C87412m;
import j20.C117292a;
import java.util.List;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;

/* renamed from: ve1.i1 */
public final class C14540i1 extends C7290r {

    /* renamed from: d */
    public final /* synthetic */ FinderFeedFullConvert<BaseFinderFeed> f40293d;

    /* renamed from: e */
    public final /* synthetic */ RoundLinearLayout f40294e;

    /* renamed from: f */
    public final /* synthetic */ List<View> f40295f;

    /* renamed from: g */
    public final /* synthetic */ C60905o f40296g;

    /* renamed from: h */
    public final /* synthetic */ C32224a<C13598b0> f40297h;

    public C14540i1(FinderFeedFullConvert<BaseFinderFeed> finderFeedFullConvert, RoundLinearLayout roundLinearLayout, List<View> list, C60905o oVar, C32224a<C13598b0> aVar) {
        this.f40293d = finderFeedFullConvert;
        this.f40294e = roundLinearLayout;
        this.f40295f = list;
        this.f40296g = oVar;
        this.f40297h = aVar;
    }

    public void onAnimationCancel(Animator animator) {
        this.f40293d.f12558E = null;
        this.f40296g.f44854d.removeCallbacks(new FinderFeedFullConvert.C2389v1(this.f40297h));
        View D = this.f40296g.mo85812D(C0966R.C0970id.iei);
        if (D != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(1.0f));
            C117292a.m165358d(D, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$avatarAnimator$3", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            D.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(D, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$avatarAnimator$3", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        this.f40294e.setVisibility(8);
        View view = this.f40295f.get(0);
        if (view != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(Float.valueOf(1.0f));
            View view2 = view;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$avatarAnimator$3", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$avatarAnimator$3", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
    }

    public void onAnimationEnd(Animator animator) {
        C87412m.m108594g(animator, "animation");
        this.f40293d.f12558E = null;
        this.f40294e.setVisibility(8);
        View view = this.f40295f.get(0);
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(1.0f));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$avatarAnimator$3", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$avatarAnimator$3", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
    }
}
