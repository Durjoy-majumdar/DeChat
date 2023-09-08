package com.tencent.p014mm.chatroom.p015ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.plugin.report.service.C115669n;
import ke3.C88144b;

/* renamed from: com.tencent.mm.chatroom.ui.i */
public class C67965i implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ChatroomInfoUI f195090d;

    public C67965i(ChatroomInfoUI chatroomInfoUI) {
        this.f195090d = chatroomInfoUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C115669n.INSTANCE.mo160131h(14553, 3, 4, this.f195090d.f194770B);
        ChatroomInfoUI chatroomInfoUI = this.f195090d;
        chatroomInfoUI.f194783P = true;
        if (!chatroomInfoUI.f194777I) {
            Intent intent = new Intent();
            intent.putExtra("Chat_User", this.f195090d.f194797j.getUsername());
            intent.addFlags(67108864);
            C88144b.m109801s(this.f195090d, ".ui.chatting.ChattingUI", intent, (Bundle) null);
            return;
        }
        chatroomInfoUI.finish();
    }
}
