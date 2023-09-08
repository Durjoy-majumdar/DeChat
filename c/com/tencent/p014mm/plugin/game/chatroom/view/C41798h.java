package com.tencent.p014mm.plugin.game.chatroom.view;

import android.animation.Animator;
import android.view.View;
import com.tencent.p014mm.plugin.game.chatroom.view.ChatMemberListView;
import j20.C117292a;
import java.util.HashMap;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.h */
public class C41798h implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ View f112649d;

    /* renamed from: e */
    public final /* synthetic */ String f112650e;

    /* renamed from: f */
    public final /* synthetic */ ChatMemberListView.C41737c f112651f;

    public C41798h(ChatMemberListView.C41737c cVar, View view, String str) {
        this.f112651f = cVar;
        this.f112649d = view;
        this.f112650e = str;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        View view = this.f112649d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/game/chatroom/view/ChatMemberListView$ChatMemberAdapter$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/game/chatroom/view/ChatMemberListView$ChatMemberAdapter$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ChatMemberListView.C41740d dVar = (ChatMemberListView.C41740d) ((HashMap) ChatMemberListView.this.f112332I1).get(this.f112650e);
        if (dVar != null) {
            dVar.f112356a = 2;
            ((HashMap) ChatMemberListView.this.f112332I1).put(this.f112650e, dVar);
        }
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
        View view = this.f112649d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/game/chatroom/view/ChatMemberListView$ChatMemberAdapter$2", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/game/chatroom/view/ChatMemberListView$ChatMemberAdapter$2", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
