package com.tencent.p014mm.pluginsdk.p133ui.chat;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import d83.C97448g;
import zj3.C79353f1;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$c */
public class ChatFooter$$c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ChatFooter f211982d;

    /* renamed from: com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$c$a */
    public class C72756a implements Runnable {
        public C72756a() {
        }

        public void run() {
            Log.m105918d("MicroMsg.ChatFooter", "onDataChangedListener run() post called");
            ChatFooter chatFooter = ChatFooter$$c.this.f211982d;
            C97448g gVar = ChatFooter.f211728C4;
            if (chatFooter.f211888j.getTag(C0966R.C0970id.b7p) != null) {
                ChatFooter$$c.this.f211982d.setDelaySendAnim(false);
                ChatFooter chatFooter2 = ChatFooter$$c.this.f211982d;
                ChatFooter$$c.this.f211982d.mo100502x(ChatFooter.m85255i(chatFooter2, chatFooter2.f211888j.getText()));
                ChatFooter$$c.this.f211982d.f211888j.getSizeAnimController().resume();
                ChatFooter$$i1 chatFooter$$i1 = ChatFooter$$c.this.f211982d.f211826V1;
                if (chatFooter$$i1 != null && chatFooter$$i1.mo100531a() != null) {
                    ((C79353f1) ChatFooter$$c.this.f211982d.f211826V1.mo100531a().f193278b.mo102812a(C79353f1.class)).getSizeAnimController().resume();
                }
            }
        }
    }

    public ChatFooter$$c(ChatFooter chatFooter) {
        this.f211982d = chatFooter;
    }

    public void run() {
        Log.m105918d("MicroMsg.ChatFooter", "onDataChangedListener run() called");
        this.f211982d.post(new C72756a());
        this.f211982d.f211888j.getSizeAnimController().cancel();
        ChatFooter$$i1 chatFooter$$i1 = this.f211982d.f211826V1;
        if (chatFooter$$i1 != null && chatFooter$$i1.mo100531a() != null) {
            ((C79353f1) this.f211982d.f211826V1.mo100531a().f193278b.mo102812a(C79353f1.class)).getSizeAnimController().cancel();
        }
    }
}
