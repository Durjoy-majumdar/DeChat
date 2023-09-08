package com.tencent.p014mm.pluginsdk.p133ui.chat;

import com.tencent.p014mm.C0966R;
import nj3.C76879j;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$c1 */
public class ChatFooter$$c1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f82600d;

    /* renamed from: e */
    public final /* synthetic */ ChatFooter f82601e;

    public ChatFooter$$c1(ChatFooter chatFooter, boolean z) {
        this.f82601e = chatFooter;
        this.f82600d = z;
    }

    public void run() {
        if (!this.f82600d) {
            C76879j.m92748s(this.f82601e.getContext(), this.f82601e.getContext().getString(C0966R.string.gwm), "");
        }
        this.f82601e.mo100340A0();
    }
}
