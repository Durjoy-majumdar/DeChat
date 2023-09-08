package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.os.Message;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import nj3.C76901s0;
import nj3.C76912y0;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$k */
public class ChatFooter$$k extends MMHandler {

    /* renamed from: a */
    public final /* synthetic */ ChatFooter f212011a;

    public ChatFooter$$k(ChatFooter chatFooter) {
        this.f212011a = chatFooter;
    }

    public void handleMessage(Message message) {
        super.handleMessage(message);
        Log.m105918d("MicroMsg.ChatFooter", "pennqin, dismiss window by too short.");
        this.f212011a.f211915p.setBackgroundResource(C0966R.C0969drawable.a_z);
        this.f212011a.f211915p.setEnabled(true);
        ChatFooter chatFooter = this.f212011a;
        if (chatFooter.f211774J2) {
            ChatFooter.m85258l(chatFooter);
            C76912y0.m92769h(this.f212011a.getContext(), this.f212011a.getContext().getResources().getString(C0966R.string.b5u), C0966R.raw.voice_to_short);
            return;
        }
        C76901s0 s0Var = chatFooter.f211957x0;
        if (s0Var != null) {
            s0Var.dismiss();
        }
    }
}
