package com.tencent.p014mm.pluginsdk.p133ui.chat;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.sdk.platformtools.Log;
import d83.C97448g;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$r */
public class ChatFooter$$r implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ChatFooter f212044d;

    public ChatFooter$$r(ChatFooter chatFooter) {
        this.f212044d = chatFooter;
    }

    public void run() {
        ChatFooter chatFooter = this.f212044d;
        C97448g gVar = ChatFooter.f211728C4;
        chatFooter.f211813S3 = chatFooter.getContext().getResources().getDimensionPixelSize(C0966R.dimen.aky);
        chatFooter.f211833W3 = chatFooter.getContext().getResources().getDimensionPixelSize(C0966R.dimen.akx);
        int bottom = chatFooter.f211793O2.getBottom() - C74942w4.m89784a(chatFooter.getContext(), 52);
        chatFooter.f211818T3 = bottom;
        if (bottom <= chatFooter.f211787M3) {
            Log.m105925i("MicroMsg.ChatFooter", "invalid maxHeight, value:%s", Integer.valueOf(bottom));
            chatFooter.f211818T3 = chatFooter.f211787M3 * 2;
        }
        Log.m105925i("MicroMsg.ChatFooter", "transMinHeight:%s, transHeight:%s, normalHeight:%s, maxHeight:%s, cancelWidth:%s, voiceWidth:%s, transWidth:%s", Integer.valueOf(chatFooter.f211787M3), Integer.valueOf(chatFooter.f211813S3), Integer.valueOf(chatFooter.f211833W3), Integer.valueOf(chatFooter.f211818T3), Integer.valueOf(chatFooter.f211794O3), Integer.valueOf(chatFooter.f211837X3), Integer.valueOf(chatFooter.f211791N3));
    }
}
