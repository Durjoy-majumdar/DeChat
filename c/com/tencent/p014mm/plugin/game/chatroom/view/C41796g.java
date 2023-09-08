package com.tencent.p014mm.plugin.game.chatroom.view;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.LinearLayout;
import com.tencent.p014mm.plugin.game.chatroom.view.ChatMemberListView;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.g */
public class C41796g implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ View f112647d;

    public C41796g(ChatMemberListView.C41737c cVar, View view) {
        this.f112647d = view;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f112647d.getLayoutParams();
        layoutParams.width = intValue;
        this.f112647d.setLayoutParams(layoutParams);
    }
}
