package com.tencent.p014mm.pluginsdk.p133ui.chat;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$g0 */
public class ChatFooter$$g0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Runnable f211996d;

    /* renamed from: e */
    public final /* synthetic */ ChatFooter f211997e;

    public ChatFooter$$g0(ChatFooter chatFooter, Runnable runnable) {
        this.f211997e = chatFooter;
        this.f211996d = runnable;
    }

    public void run() {
        this.f211997e.setAppPanelVisible(4);
        Runnable runnable = this.f211996d;
        if (runnable != null) {
            runnable.run();
        }
    }
}
