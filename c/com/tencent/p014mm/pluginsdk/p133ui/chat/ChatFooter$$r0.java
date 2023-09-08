package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.content.DialogInterface;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$r0 */
public class ChatFooter$$r0 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ String f212045d;

    /* renamed from: e */
    public final /* synthetic */ ChatFooter f212046e;

    public ChatFooter$$r0(ChatFooter chatFooter, String str) {
        this.f212046e = chatFooter;
        this.f212045d = str;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f212046e.f211780L.mo100660v(this.f212045d);
    }
}
