package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.content.DialogInterface;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$u0 */
public class ChatFooter$$u0 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ String f212062d;

    /* renamed from: e */
    public final /* synthetic */ ChatFooter f212063e;

    public ChatFooter$$u0(ChatFooter chatFooter, String str) {
        this.f212063e = chatFooter;
        this.f212062d = str;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f212063e.f211780L.mo100660v(this.f212062d);
    }
}
