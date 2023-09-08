package tr1;

import android.animation.Animator;
import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.protocal.protobuf.FinderCommentInfo;
import gy3.C8479f0;
import gy3.C87412m;
import j20.C117292a;
import java.util.LinkedList;
import java.util.List;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import sx3.C110818d0;
import vq1.C65866w;

/* renamed from: tr1.d */
public final class C14066d implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ C60905o f39457d;

    /* renamed from: e */
    public final /* synthetic */ List<View> f39458e;

    /* renamed from: f */
    public final /* synthetic */ C8479f0<View> f39459f;

    public C14066d(C60905o oVar, List<View> list, C8479f0<View> f0Var) {
        this.f39457d = oVar;
        this.f39458e = list;
        this.f39459f = f0Var;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        C65866w.C14968a aVar = C65866w.f189406g;
        LinkedList<FinderCommentInfo> e = C65866w.f189407h.mo89906e(((BaseFinderFeed) this.f39457d.f173503E).mo3513o().getFeedObject());
        for (View view : this.f39458e) {
            if (view != null) {
                view.setTranslationX(0.0f);
            }
            if (view != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(Float.valueOf(1.0f));
                View view2 = view;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/view/animation/LikeIconAnimationHelper$startAvatarAnimator$11", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/view/animation/LikeIconAnimationHelper$startAvatarAnimator$11", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
        }
        View view3 = (View) this.f39459f.f27484d;
        C9556a aVar3 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar3.mo10233c(8);
        View view4 = view3;
        C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/view/animation/LikeIconAnimationHelper$startAvatarAnimator$11", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/view/animation/LikeIconAnimationHelper$startAvatarAnimator$11", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((View) this.f39459f.f27484d).setTranslationX(0.0f);
        View view5 = (View) this.f39459f.f27484d;
        C9556a aVar4 = new C9556a();
        aVar4.mo10233c(Float.valueOf(1.0f));
        View view6 = view5;
        C117292a.m165358d(view6, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/view/animation/LikeIconAnimationHelper$startAvatarAnimator$11", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view5.setAlpha(((Float) aVar4.mo10231a(0)).floatValue());
        C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/view/animation/LikeIconAnimationHelper$startAvatarAnimator$11", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        FinderCommentInfo finderCommentInfo = (FinderCommentInfo) C110818d0.m150917O(e, 0);
        if (finderCommentInfo != null) {
            List<View> list = this.f39458e;
            C14063b bVar = C14063b.f39453a;
            View view7 = list.get(2);
            C87412m.m108591d(view7);
            View findViewById = view7.findViewById(C0966R.C0970id.ef4);
            C87412m.m108593f(findViewById, "avatarLayoutList[2]!!.fi…yId(R.id.friend_avatar_3)");
            bVar.mo13461b(finderCommentInfo, (ImageView) findViewById);
        }
        FinderCommentInfo finderCommentInfo2 = (FinderCommentInfo) C110818d0.m150917O(e, 1);
        if (finderCommentInfo2 != null) {
            List<View> list2 = this.f39458e;
            C14063b bVar2 = C14063b.f39453a;
            View view8 = list2.get(1);
            C87412m.m108591d(view8);
            View findViewById2 = view8.findViewById(C0966R.C0970id.f358323ef2);
            C87412m.m108593f(findViewById2, "avatarLayoutList[1]!!.fi…yId(R.id.friend_avatar_2)");
            bVar2.mo13461b(finderCommentInfo2, (ImageView) findViewById2);
        }
        FinderCommentInfo finderCommentInfo3 = (FinderCommentInfo) C110818d0.m150917O(e, 2);
        if (finderCommentInfo3 != null) {
            List<View> list3 = this.f39458e;
            C14063b bVar3 = C14063b.f39453a;
            View view9 = list3.get(0);
            C87412m.m108591d(view9);
            View findViewById3 = view9.findViewById(C0966R.C0970id.f358321ef0);
            C87412m.m108593f(findViewById3, "avatarLayoutList[0]!!.fi…yId(R.id.friend_avatar_1)");
            bVar3.mo13461b(finderCommentInfo3, (ImageView) findViewById3);
        }
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}
