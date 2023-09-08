package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.os.Message;
import com.tencent.p014mm.sdk.platformtools.MMHandler;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$j0 */
public class ChatFooter$$j0 extends MMHandler {

    /* renamed from: a */
    public final /* synthetic */ ChatFooter f212010a;

    public ChatFooter$$j0(ChatFooter chatFooter) {
        this.f212010a = chatFooter;
    }

    public void handleMessage(Message message) {
        Object obj;
        if (message.what == 1002 && this.f212010a.f211888j != null && (obj = message.obj) != null) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            if (booleanValue) {
                this.f212010a.f211888j.setAlpha(1.0f);
            } else {
                this.f212010a.f211888j.setAlpha(0.5f);
            }
            this.f212010a.mo100501w0(booleanValue);
        }
    }
}
