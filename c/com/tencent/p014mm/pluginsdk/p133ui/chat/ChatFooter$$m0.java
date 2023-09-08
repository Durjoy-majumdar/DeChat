package com.tencent.p014mm.pluginsdk.p133ui.chat;

import zj3.C79362h1;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$m0 */
public class ChatFooter$$m0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ChatFooter f212021d;

    public ChatFooter$$m0(ChatFooter chatFooter) {
        this.f212021d = chatFooter;
    }

    public void run() {
        ChatFooter$$i1 chatFooter$$i1 = this.f212021d.f211826V1;
        if (chatFooter$$i1 != null && chatFooter$$i1.mo100531a() != null) {
            C79362h1 h1Var = (C79362h1) this.f212021d.f211826V1.mo100531a().f193278b.mo102812a(C79362h1.class);
            if (h1Var != null) {
                h1Var.mo102327W2();
            }
        }
    }
}
