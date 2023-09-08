package com.tencent.p014mm.chatroom.p015ui;

import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import nj3.C76879j;
import p148ei.C7660a;
import pg3.C35488c;
import pg3.C77084b;

/* renamed from: com.tencent.mm.chatroom.ui.z */
public class C68009z implements C35488c {

    /* renamed from: a */
    public final /* synthetic */ ChatroomInfoUI f195175a;

    public C68009z(ChatroomInfoUI chatroomInfoUI) {
        this.f195175a = chatroomInfoUI;
    }

    /* renamed from: a */
    public void mo10150a(int i, int i2, String str, C77084b bVar) {
        C35488c cVar = (C35488c) bVar;
        C7660a a = C7660a.m7782a(str);
        if (a != null) {
            a.mo8792b(this.f195175a, (DialogInterface.OnClickListener) null, (DialogInterface.OnClickListener) null);
            return;
        }
        if (i2 == -66) {
            ChatroomInfoUI chatroomInfoUI = this.f195175a;
            C76879j.m92748s(chatroomInfoUI, chatroomInfoUI.getString(C0966R.string.bxz), this.f195175a.getString(C0966R.string.a3h));
        } else {
            ChatroomInfoUI chatroomInfoUI2 = this.f195175a;
            C76879j.m92748s(chatroomInfoUI2, Util.nullAs(str, chatroomInfoUI2.getString(C0966R.string.f360332by0)), this.f195175a.getString(C0966R.string.a3h));
        }
        this.f195175a.mo93267c1();
        this.f195175a.mo93251N4();
        Log.m105925i("MicroMsg.ActionCallbackFunc", "[delChatroomMember] onResult errType:%s errCode:%s", Integer.valueOf(i), Integer.valueOf(i2));
    }
}
