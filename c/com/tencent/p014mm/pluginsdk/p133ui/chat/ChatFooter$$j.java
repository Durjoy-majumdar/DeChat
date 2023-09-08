package com.tencent.p014mm.pluginsdk.p133ui.chat;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$j */
public class ChatFooter$$j implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ChatFooter f212009d;

    public ChatFooter$$j(ChatFooter chatFooter) {
        this.f212009d = chatFooter;
    }

    public void run() {
        VoiceInputPanel voiceInputPanel = this.f212009d.f211873g;
        if (voiceInputPanel != null) {
            voiceInputPanel.mo25276f();
            this.f212009d.f211873g.setVisibility(8);
        }
    }
}
