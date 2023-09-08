package com.tencent.p014mm.chatroom.p015ui;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import pg3.C77084b;
import pg3.C77086f;
import zt3.C119157j;

/* renamed from: com.tencent.mm.chatroom.ui.v */
public class C68005v extends C77086f {

    /* renamed from: d */
    public final /* synthetic */ ChatroomInfoUI f195171d;

    public C68005v(ChatroomInfoUI chatroomInfoUI) {
        this.f195171d = chatroomInfoUI;
    }

    /* renamed from: a */
    public void mo10150a(int i, int i2, String str, C77084b bVar) {
        C77086f fVar = (C77086f) bVar;
        Object[] objArr = new Object[4];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = Integer.valueOf(i2);
        objArr[2] = Util.nullAs(str, "");
        objArr[3] = fVar != null ? Integer.valueOf(fVar.f225171a) : "null";
        Log.m105925i("MicroMsg.ChatroomInfoUI", "quitChatroom errType:%s errCode:%s errMsg:%s ret:%s", objArr);
        if (!C72996z1.m85807K5(this.f195171d.f194770B)) {
            this.f195171d.mo93260V7();
            if (this.f225171a == 0) {
                ChatroomInfoUI.m80221J7(this.f195171d);
            } else {
                ChatroomInfoUI.m80222K7(this.f195171d, fVar);
            }
        } else if (this.f225171a == 0) {
            ((C119157j) C119157j.f356862d).mo183875f(new C67993u(this));
        } else {
            this.f195171d.mo93260V7();
            ChatroomInfoUI.m80222K7(this.f195171d, fVar);
        }
    }
}
