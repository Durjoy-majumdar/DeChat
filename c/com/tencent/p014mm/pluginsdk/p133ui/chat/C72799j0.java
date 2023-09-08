package com.tencent.p014mm.pluginsdk.p133ui.chat;

import com.tencent.p014mm.p136ui.chatting.component.VoiceComponent;
import com.tencent.p014mm.pluginsdk.p133ui.chat.VoiceInputPanel;
import com.tencent.p014mm.sdk.platformtools.Log;
import d83.C97448g;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.j0 */
public class C72799j0 implements VoiceInputPanel.C19488c {

    /* renamed from: a */
    public final /* synthetic */ ChatFooter f212192a;

    public C72799j0(ChatFooter chatFooter) {
        this.f212192a = chatFooter;
    }

    /* renamed from: a */
    public void mo25290a() {
        ChatFooter chatFooter = this.f212192a;
        C97448g gVar = ChatFooter.f211728C4;
        chatFooter.mo100430i0();
    }

    /* renamed from: b */
    public void mo25291b(String str) {
        C72825s0 s0Var = this.f212192a.f211780L;
        if (s0Var != null) {
            s0Var.mo100658t(str);
        } else {
            Log.m105920e("MicroMsg.ChatFooter", "onSendMsg listener is null !!!");
        }
        this.f212192a.f211873g.mo25282l();
    }

    /* renamed from: c */
    public void mo25292c(boolean z) {
        if (z) {
            if (this.f212192a.f211792O1 != null) {
                Log.m105918d("MicroMsg.ChatFooter", "onVoiceStart start");
                ((VoiceComponent.C73408c) this.f212192a.f211792O1).mo102342a(Boolean.TRUE);
            }
        } else if (this.f212192a.f211792O1 != null) {
            Log.m105918d("MicroMsg.ChatFooter", "onVoiceStart end");
            ((VoiceComponent.C73408c) this.f212192a.f211792O1).mo102342a(Boolean.FALSE);
        }
    }
}
