package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.animation.Animator;
import android.view.ViewGroup;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$y0 */
public class ChatFooter$$y0 implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ ChatFooter f212071d;

    /* renamed from: com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$y0$a */
    public class C72757a implements Runnable {
        public C72757a() {
        }

        public void run() {
            if (!ChatFooter$$y0.this.f212071d.mo100444p0()) {
                ChatFooter$$y0.this.f212071d.f211888j.getSizeAnimController().mo91525a(true);
            }
        }
    }

    public ChatFooter$$y0(ChatFooter chatFooter) {
        this.f212071d = chatFooter;
    }

    public void onAnimationCancel(Animator animator) {
        this.f212071d.f211905n.setVisibility(0);
        this.f212071d.f211946v.setVisibility(8);
        this.f212071d.mo100363M0(false);
    }

    public void onAnimationEnd(Animator animator) {
        ViewGroup.LayoutParams layoutParams = this.f212071d.f211905n.getLayoutParams();
        layoutParams.width = -2;
        this.f212071d.f211905n.setLayoutParams(layoutParams);
        this.f212071d.f211946v.setVisibility(8);
        this.f212071d.mo100363M0(false);
        boolean z = this.f212071d.f211839Y1;
        if (!z) {
            Log.m105925i("MicroMsg.ChatFooter", "animShowSendBtn onAnimationEnd!! cansend change:%s", Boolean.valueOf(z));
            this.f212071d.f211946v.setVisibility(0);
            this.f212071d.mo100363M0(true);
            this.f212071d.mo100445q();
        }
        this.f212071d.f211888j.mo104241c();
        this.f212071d.post(new C72757a());
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
        this.f212071d.f211905n.setVisibility(0);
        this.f212071d.f211888j.getSizeAnimController().mo91525a(false);
    }
}
