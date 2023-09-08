package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.animation.Animator;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$w0 */
public class ChatFooter$$w0 implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ ChatFooter f212067d;

    public ChatFooter$$w0(ChatFooter chatFooter) {
        this.f212067d = chatFooter;
    }

    public void onAnimationCancel(Animator animator) {
        this.f212067d.f211905n.setVisibility(8);
    }

    public void onAnimationEnd(Animator animator) {
        Log.m105918d("MicroMsg.ChatFooter", "onAnimationEnd()");
        ChatFooter chatFooter = this.f212067d;
        boolean z = chatFooter.f211839Y1;
        if (!z) {
            chatFooter.f211905n.setVisibility(8);
            return;
        }
        Log.m105925i("MicroMsg.ChatFooter", "animHideSendBtn onAnimationEnd!! cansend change:%s", Boolean.valueOf(z));
        this.f212067d.mo100447r();
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
        Log.m105918d("MicroMsg.ChatFooter", "onAnimationStart: ");
        this.f212067d.f211905n.setVisibility(0);
    }
}
