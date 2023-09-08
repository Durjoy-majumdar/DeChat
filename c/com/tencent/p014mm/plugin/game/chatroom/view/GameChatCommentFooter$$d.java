package com.tencent.p014mm.plugin.game.chatroom.view;

import android.animation.ValueAnimator;
import android.widget.LinearLayout;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter$$d */
public class GameChatCommentFooter$$d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ GameChatCommentFooter f112490d;

    public GameChatCommentFooter$$d(GameChatCommentFooter gameChatCommentFooter) {
        this.f112490d = gameChatCommentFooter;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        Log.m105919d("GameChatRoom.GameChatCommentFooter", "showSmileyAnim value:%d", Integer.valueOf(intValue));
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f112490d.f112478r.getLayoutParams();
        layoutParams.height = intValue;
        this.f112490d.f112478r.setLayoutParams(layoutParams);
    }
}
