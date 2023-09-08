package com.tencent.p014mm.pluginsdk.p133ui.chat;

import com.tencent.p014mm.sdk.platformtools.Log;
import d83.C97448g;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$b */
public final /* synthetic */ class ChatFooter$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ChatFooter f211979d;

    public /* synthetic */ ChatFooter$$b(ChatFooter chatFooter) {
        this.f211979d = chatFooter;
    }

    public final void run() {
        ChatFooter chatFooter = this.f211979d;
        C97448g gVar = ChatFooter.f211728C4;
        chatFooter.getClass();
        Log.m105928w("MicroMsg.ChatFooter", "search panel dismissed");
        chatFooter.f211917p1 = false;
        chatFooter.mo100501w0(true);
        chatFooter.mo100377T0();
        chatFooter.mo100506z();
    }
}
