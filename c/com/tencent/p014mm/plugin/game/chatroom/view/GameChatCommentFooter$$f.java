package com.tencent.p014mm.plugin.game.chatroom.view;

import android.animation.ValueAnimator;
import android.widget.LinearLayout;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter$$f */
public class GameChatCommentFooter$$f implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ GameChatCommentFooter f112492d;

    public GameChatCommentFooter$$f(GameChatCommentFooter gameChatCommentFooter) {
        this.f112492d = gameChatCommentFooter;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        Log.m105919d("GameChatRoom.GameChatCommentFooter", "hideSmileyAnim value:%d", Integer.valueOf(intValue));
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f112492d.f112478r.getLayoutParams();
        layoutParams.height = intValue;
        this.f112492d.f112478r.setLayoutParams(layoutParams);
    }
}
