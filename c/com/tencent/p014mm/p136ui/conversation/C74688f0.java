package com.tencent.p014mm.p136ui.conversation;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.p136ui.conversation.C74720p;
import com.tencent.p014mm.storage.C72976h2;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.ui.conversation.f0 */
public final class C74688f0 implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ C72976h2 f219579d;

    /* renamed from: e */
    public final /* synthetic */ FolderHelper f219580e;

    /* renamed from: f */
    public final /* synthetic */ C74720p.C74733m f219581f;

    /* renamed from: g */
    public final /* synthetic */ ViewGroup.LayoutParams f219582g;

    public C74688f0(C72976h2 h2Var, FolderHelper folderHelper, C74720p.C74733m mVar, ViewGroup.LayoutParams layoutParams) {
        this.f219579d = h2Var;
        this.f219580e = folderHelper;
        this.f219581f = mVar;
        this.f219582g = layoutParams;
    }

    public void onAnimationCancel(Animator animator) {
        C72976h2 h2Var = this.f219579d;
        if (h2Var != null) {
            h2Var.f212787o1 = 2;
        }
        FolderHelper folderHelper = this.f219580e;
        int i = folderHelper.f219424z;
        if (i > 0) {
            folderHelper.f219424z = i - 1;
        }
        ConversationListView conversationListView = folderHelper.f219407f;
        if (conversationListView != null) {
            conversationListView.mo103716f(false);
        }
    }

    public void onAnimationEnd(Animator animator) {
        C72976h2 h2Var = this.f219579d;
        if (h2Var != null) {
            h2Var.f212787o1 = 2;
        }
        C72976h2 l = this.f219580e.mo103789l(h2Var != null ? h2Var.getUsername() : null);
        if (l != null) {
            l.f212787o1 = 2;
        }
        View view = this.f219581f.f219763r;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(1.0f));
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/conversation/FolderHelper$getExpandAnimators$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "com/tencent/mm/ui/conversation/FolderHelper$getExpandAnimators$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.f219581f.f219762q.setLayoutParams(this.f219582g);
        C74720p.C74733m mVar = this.f219581f;
        mVar.f219760o = this.f219580e.f219412n;
        mVar.f219762q.requestLayout();
        FolderHelper folderHelper = this.f219580e;
        int i = folderHelper.f219424z;
        if (i > 0) {
            folderHelper.f219424z = i - 1;
        }
        ConversationListView conversationListView = folderHelper.f219407f;
        if (conversationListView != null) {
            conversationListView.mo103716f(false);
        }
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
        C72976h2 h2Var = this.f219579d;
        if (h2Var != null) {
            h2Var.f212787o1 = 66;
        }
        View view = this.f219581f.f219763r;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(0.0f));
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/conversation/FolderHelper$getExpandAnimators$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "com/tencent/mm/ui/conversation/FolderHelper$getExpandAnimators$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        View view2 = this.f219581f.f219762q;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(0);
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/ui/conversation/FolderHelper$getExpandAnimators$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/ui/conversation/FolderHelper$getExpandAnimators$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
