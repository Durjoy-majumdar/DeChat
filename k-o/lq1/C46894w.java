package lq1;

import android.animation.Animator;
import android.view.View;
import com.tencent.p014mm.plugin.finder.uniComments.UniCommentFooter;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: lq1.w */
public final class C46894w implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ UniCommentFooter f126100d;

    public C46894w(UniCommentFooter uniCommentFooter) {
        this.f126100d = uniCommentFooter;
    }

    public void onAnimationCancel(Animator animator) {
        View replyBtn = this.f126100d.getReplyBtn();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(replyBtn, aVar.mo10232b(), "com/tencent/mm/plugin/finder/uniComments/UniCommentFooter$checkShowReplyBtn$4", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        replyBtn.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(replyBtn, "com/tencent/mm/plugin/finder/uniComments/UniCommentFooter$checkShowReplyBtn$4", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void onAnimationEnd(Animator animator) {
        View replyBtn = this.f126100d.getReplyBtn();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(replyBtn, aVar.mo10232b(), "com/tencent/mm/plugin/finder/uniComments/UniCommentFooter$checkShowReplyBtn$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        replyBtn.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(replyBtn, "com/tencent/mm/plugin/finder/uniComments/UniCommentFooter$checkShowReplyBtn$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
        View replyBtn = this.f126100d.getReplyBtn();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(replyBtn, aVar.mo10232b(), "com/tencent/mm/plugin/finder/uniComments/UniCommentFooter$checkShowReplyBtn$4", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        replyBtn.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(replyBtn, "com/tencent/mm/plugin/finder/uniComments/UniCommentFooter$checkShowReplyBtn$4", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
