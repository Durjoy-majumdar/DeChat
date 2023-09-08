package com.tencent.p014mm.pluginsdk.p133ui.chat;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.l0 */
public class C72805l0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ChatFooter f212199d;

    public C72805l0(ChatFooter chatFooter) {
        this.f212199d = chatFooter;
    }

    public void run() {
        Log.m105924i("MicroMsg.ChatFooter", "withLastText: ");
        this.f212199d.mo100377T0();
        this.f212199d.mo100501w0(true);
    }
}
