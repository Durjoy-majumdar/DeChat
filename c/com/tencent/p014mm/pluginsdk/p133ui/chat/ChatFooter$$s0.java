package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.content.DialogInterface;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$s0 */
public class ChatFooter$$s0 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ String f212052d;

    /* renamed from: e */
    public final /* synthetic */ long f212053e;

    /* renamed from: f */
    public final /* synthetic */ ChatFooter f212054f;

    public ChatFooter$$s0(ChatFooter chatFooter, String str, long j) {
        this.f212054f = chatFooter;
        this.f212052d = str;
        this.f212053e = j;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f212054f.f211780L.mo100651F(this.f212052d, (int) this.f212053e);
    }
}
