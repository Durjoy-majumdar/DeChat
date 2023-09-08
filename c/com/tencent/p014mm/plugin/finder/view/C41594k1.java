package com.tencent.p014mm.plugin.finder.view;

import android.animation.Animator;
import android.view.View;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.finder.view.k1 */
public final class C41594k1 implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ FinderCommentFooter f111962d;

    public C41594k1(FinderCommentFooter finderCommentFooter) {
        this.f111962d = finderCommentFooter;
    }

    public void onAnimationCancel(Animator animator) {
        View replyBtn = this.f111962d.getReplyBtn();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(replyBtn, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderCommentFooter$checkShowReplyBtn$4", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        replyBtn.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(replyBtn, "com/tencent/mm/plugin/finder/view/FinderCommentFooter$checkShowReplyBtn$4", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void onAnimationEnd(Animator animator) {
        View replyBtn = this.f111962d.getReplyBtn();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(replyBtn, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderCommentFooter$checkShowReplyBtn$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        replyBtn.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(replyBtn, "com/tencent/mm/plugin/finder/view/FinderCommentFooter$checkShowReplyBtn$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
        View replyBtn = this.f111962d.getReplyBtn();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(replyBtn, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderCommentFooter$checkShowReplyBtn$4", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        replyBtn.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(replyBtn, "com/tencent/mm/plugin/finder/view/FinderCommentFooter$checkShowReplyBtn$4", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
