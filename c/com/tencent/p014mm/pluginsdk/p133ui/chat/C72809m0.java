package com.tencent.p014mm.pluginsdk.p133ui.chat;

import d83.C97448g;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.m0 */
public class C72809m0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f212201d;

    /* renamed from: e */
    public final /* synthetic */ ChatFooter f212202e;

    public C72809m0(ChatFooter chatFooter, boolean z) {
        this.f212202e = chatFooter;
        this.f212201d = z;
    }

    public void run() {
        ChatFooter chatFooter = this.f212202e;
        boolean z = this.f212201d;
        C97448g gVar = ChatFooter.f211728C4;
        chatFooter.mo100380V0(z);
    }
}
