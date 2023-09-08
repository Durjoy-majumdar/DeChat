package com.tencent.p014mm.chatroom.p015ui;

import com.tencent.p014mm.chatroom.p015ui.ChatroomInfoUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import pg3.C77084b;
import pg3.C77086f;

/* renamed from: com.tencent.mm.chatroom.ui.x */
public class C68007x extends C77086f {

    /* renamed from: d */
    public final /* synthetic */ ChatroomInfoUI.C67869j f195173d;

    public C68007x(ChatroomInfoUI.C67869j jVar) {
        this.f195173d = jVar;
    }

    /* renamed from: a */
    public void mo10150a(int i, int i2, String str, C77084b bVar) {
        C77086f fVar = (C77086f) bVar;
        Object[] objArr = new Object[4];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = Integer.valueOf(i2);
        objArr[2] = Util.nullAs(str, "");
        objArr[3] = fVar != null ? Integer.valueOf(fVar.f225171a) : "null";
        Log.m105925i("MicroMsg.ChatroomInfoUI", "deleteChatroomImp2 errType:%s errCode:%s errMsg:%s ret:%s", objArr);
        ChatroomInfoUI chatroomInfoUI = ChatroomInfoUI.this;
        boolean z = ChatroomInfoUI.f194768X;
        chatroomInfoUI.mo93260V7();
        if (this.f225171a == 0) {
            ChatroomInfoUI.C67869j jVar = this.f195173d;
            ChatroomInfoUI.m80223L7(ChatroomInfoUI.this, jVar.f194824e);
            return;
        }
        ChatroomInfoUI.m80222K7(ChatroomInfoUI.this, fVar);
    }
}
