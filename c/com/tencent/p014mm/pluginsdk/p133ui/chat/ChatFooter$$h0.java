package com.tencent.p014mm.pluginsdk.p133ui.chat;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$h0 */
public class ChatFooter$$h0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Runnable f212000d;

    /* renamed from: e */
    public final /* synthetic */ ChatFooter f212001e;

    public ChatFooter$$h0(ChatFooter chatFooter, Runnable runnable) {
        this.f212001e = chatFooter;
        this.f212000d = runnable;
    }

    public void run() {
        this.f212001e.f211868f.setVisibility(4);
        Runnable runnable = this.f212000d;
        if (runnable != null) {
            runnable.run();
        }
    }
}
