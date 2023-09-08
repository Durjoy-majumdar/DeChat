package com.tencent.p014mm.chatroom.p015ui;

import com.tencent.p014mm.chatroom.p015ui.ChatroomInfoUI;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.pluginsdk.p133ui.applet.C72741a;
import p609mp.C76803c;

/* renamed from: com.tencent.mm.chatroom.ui.t */
public class C67991t implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ChatroomInfoUI.C678583 f195133d;

    public C67991t(ChatroomInfoUI.C678583 r1) {
        this.f195133d = r1;
    }

    public void run() {
        ChatroomInfoUI chatroomInfoUI = ChatroomInfoUI.this;
        chatroomInfoUI.f194793f = true;
        chatroomInfoUI.mo93263Y7();
        ChatroomInfoUI chatroomInfoUI2 = ChatroomInfoUI.this;
        if (chatroomInfoUI2.f194802r != null) {
            chatroomInfoUI2.f194795h = chatroomInfoUI2.getPreferenceScreen();
            ChatroomInfoUI chatroomInfoUI3 = ChatroomInfoUI.this;
            chatroomInfoUI3.f194795h.mo72526j(chatroomInfoUI3.f194802r);
            C76803c cVar = ChatroomInfoUI.this.f194802r.f211662K;
            if (cVar != null) {
                ((C72741a) cVar).f211675l = true;
                for (Preference j : ((C72741a) cVar).f211667d.values()) {
                    ChatroomInfoUI.this.f194795h.mo72526j(j);
                }
            }
        }
    }
}
