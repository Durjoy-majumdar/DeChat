package com.tencent.p014mm.plugin.game.chatroom.view;

import android.animation.Animator;
import android.widget.LinearLayout;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter$$g */
public class GameChatCommentFooter$$g implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ GameChatCommentFooter f112493d;

    public GameChatCommentFooter$$g(GameChatCommentFooter gameChatCommentFooter) {
        this.f112493d = gameChatCommentFooter;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        this.f112493d.f112478r.setVisibility(8);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f112493d.f112478r.getLayoutParams();
        GameChatCommentFooter gameChatCommentFooter = this.f112493d;
        layoutParams.height = gameChatCommentFooter.f112483w;
        gameChatCommentFooter.f112478r.setLayoutParams(layoutParams);
        this.f112493d.setFooterVisibilityImpl(8);
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
        this.f112493d.f112478r.setVisibility(0);
    }
}
