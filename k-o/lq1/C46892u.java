package lq1;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.plugin.finder.uniComments.UniCommentFooter;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: lq1.u */
public final class C46892u implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ UniCommentFooter f126098d;

    public C46892u(UniCommentFooter uniCommentFooter) {
        this.f126098d = uniCommentFooter;
    }

    public void onAnimationCancel(Animator animator) {
        ViewGroup.LayoutParams layoutParams = this.f126098d.getReplyBtn().getLayoutParams();
        layoutParams.width = this.f126098d.getReplyBtnWidth();
        this.f126098d.getReplyBtn().setLayoutParams(layoutParams);
        View replyBtn = this.f126098d.getReplyBtn();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(1.0f));
        C117292a.m165358d(replyBtn, aVar.mo10232b(), "com/tencent/mm/plugin/finder/uniComments/UniCommentFooter$checkShowReplyBtn$2", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        replyBtn.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(replyBtn, "com/tencent/mm/plugin/finder/uniComments/UniCommentFooter$checkShowReplyBtn$2", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    public void onAnimationEnd(Animator animator) {
        ViewGroup.LayoutParams layoutParams = this.f126098d.getReplyBtn().getLayoutParams();
        layoutParams.width = this.f126098d.getReplyBtnWidth();
        this.f126098d.getReplyBtn().setLayoutParams(layoutParams);
        View replyBtn = this.f126098d.getReplyBtn();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(1.0f));
        C117292a.m165358d(replyBtn, aVar.mo10232b(), "com/tencent/mm/plugin/finder/uniComments/UniCommentFooter$checkShowReplyBtn$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        replyBtn.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(replyBtn, "com/tencent/mm/plugin/finder/uniComments/UniCommentFooter$checkShowReplyBtn$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
        View replyBtn = this.f126098d.getReplyBtn();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(replyBtn, aVar.mo10232b(), "com/tencent/mm/plugin/finder/uniComments/UniCommentFooter$checkShowReplyBtn$2", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        replyBtn.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(replyBtn, "com/tencent/mm/plugin/finder/uniComments/UniCommentFooter$checkShowReplyBtn$2", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
