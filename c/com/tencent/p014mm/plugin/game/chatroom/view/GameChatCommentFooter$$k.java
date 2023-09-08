package com.tencent.p014mm.plugin.game.chatroom.view;

import android.animation.Animator;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter$$k */
public class GameChatCommentFooter$$k implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ GameChatCommentFooter f112499d;

    public GameChatCommentFooter$$k(GameChatCommentFooter gameChatCommentFooter) {
        this.f112499d = gameChatCommentFooter;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        this.f112499d.f112478r.setVisibility(0);
        GameChatCommentFooter$$o gameChatCommentFooter$$o = this.f112499d.f112458C;
        if (gameChatCommentFooter$$o != null) {
            gameChatCommentFooter$$o.mo65422c();
        }
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
        this.f112499d.f112478r.setVisibility(0);
    }
}
