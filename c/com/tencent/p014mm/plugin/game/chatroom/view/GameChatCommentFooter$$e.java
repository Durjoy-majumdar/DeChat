package com.tencent.p014mm.plugin.game.chatroom.view;

import android.animation.Animator;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter$$e */
public class GameChatCommentFooter$$e implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ GameChatCommentFooter f112491d;

    public GameChatCommentFooter$$e(GameChatCommentFooter gameChatCommentFooter) {
        this.f112491d = gameChatCommentFooter;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        this.f112491d.f112478r.setVisibility(0);
        this.f112491d.setFooterVisibilityImpl(0);
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
        this.f112491d.f112478r.setVisibility(0);
        this.f112491d.setFooterVisibilityImpl(0);
    }
}
