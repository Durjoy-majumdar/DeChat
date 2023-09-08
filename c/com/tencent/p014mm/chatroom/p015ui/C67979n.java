package com.tencent.p014mm.chatroom.p015ui;

import android.view.MenuItem;
import com.tencent.p014mm.autogen.events.TalkRoomServerEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44661m1;
import nj3.C11184p0;

/* renamed from: com.tencent.mm.chatroom.ui.n */
public class C67979n implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ ChatroomInfoUI f195116d;

    public C67979n(ChatroomInfoUI chatroomInfoUI) {
        this.f195116d = chatroomInfoUI;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        C44661m1 m1Var;
        if (i != 0) {
            this.f195116d.mo93262X7(4);
            return;
        }
        this.f195116d.mo93262X7(3);
        ChatroomInfoUI.m80220I7(this.f195116d, false);
        ChatroomInfoUI chatroomInfoUI = this.f195116d;
        chatroomInfoUI.getClass();
        Log.m105918d("MicroMsg.ChatroomInfoUI", " quit " + chatroomInfoUI.f194770B);
        TalkRoomServerEvent talkRoomServerEvent = new TalkRoomServerEvent();
        boolean z = true;
        talkRoomServerEvent.f154883d.f154885a = true;
        talkRoomServerEvent.publish();
        if (Util.isNullOrNil(chatroomInfoUI.f194770B) || !chatroomInfoUI.f194770B.equals(talkRoomServerEvent.f154884e.f154887a)) {
            z = false;
        }
        if (z) {
            Log.m105918d("MicroMsg.ChatroomInfoUI", " quit talkroom" + chatroomInfoUI.f194770B);
        } else if (chatroomInfoUI.f194771C && (m1Var = chatroomInfoUI.f194775G) != null && m1Var.mo69790r2().size() > 2) {
            chatroomInfoUI.mo93259U7(0, "");
            return;
        }
        chatroomInfoUI.mo93258T7(z, "");
    }
}
