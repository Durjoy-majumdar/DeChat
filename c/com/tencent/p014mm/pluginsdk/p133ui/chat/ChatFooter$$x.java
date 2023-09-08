package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.os.Message;
import com.tencent.p014mm.plugin.transvoice.model.C71561b;
import com.tencent.p014mm.plugin.transvoice.model.C71562c;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$x */
public class ChatFooter$$x implements MMHandler.Callback {

    /* renamed from: d */
    public final /* synthetic */ ChatFooter f212068d;

    public ChatFooter$$x(ChatFooter chatFooter) {
        this.f212068d = chatFooter;
    }

    public boolean handleMessage(Message message) {
        if (message.what == 5000) {
            C71562c cVar = this.f212068d.f211750D2;
            cVar.f207379n = 1;
            cVar.f207380o = System.currentTimeMillis();
            ChatFooter chatFooter = this.f212068d;
            chatFooter.f211750D2.f207384s = 0;
            chatFooter.f211961x4.stopTimer();
            C71561b bVar = this.f212068d.f211935s4;
            if (bVar != null) {
                bVar.mo98687a(false, false);
            }
            ChatFooter chatFooter2 = this.f212068d;
            if (!Util.isNullOrNil((String) ((HashMap) chatFooter2.f211925q4).get(Integer.valueOf(chatFooter2.f211738A4)))) {
                this.f212068d.f211797P2.setFocusable(true);
                this.f212068d.f211797P2.setFocusableInTouchMode(true);
                this.f212068d.f211797P2.requestFocus();
            }
            ChatFooter.m85249c(this.f212068d);
            this.f212068d.f211930r4 = false;
        }
        return true;
    }
}
