package com.tencent.p014mm.pluginsdk.p133ui.chat;

import com.tencent.p014mm.sdk.platformtools.Log;
import d83.C97448g;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$i0 */
public class ChatFooter$$i0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ChatFooter f212008d;

    public ChatFooter$$i0(ChatFooter chatFooter) {
        this.f212008d = chatFooter;
    }

    public void run() {
        ChatFooter chatFooter = this.f212008d;
        C97448g gVar = ChatFooter.f211728C4;
        chatFooter.mo100501w0(true);
        this.f212008d.setToSendTextColor(true);
        ChatFooter chatFooter2 = this.f212008d;
        boolean showSoftInput = chatFooter2.f211834X0.showSoftInput(chatFooter2.f211888j.view(), 0);
        this.f212008d.f211942u1++;
        Log.m105925i("MicroMsg.ChatFooter", "showSoftInput %b, %s", Boolean.valueOf(showSoftInput), Integer.valueOf(this.f212008d.f211942u1));
        if (!showSoftInput) {
            ChatFooter chatFooter3 = this.f212008d;
            if (chatFooter3.f211942u1 < 10) {
                chatFooter3.postDelayed(this, 100);
            }
        }
    }
}
