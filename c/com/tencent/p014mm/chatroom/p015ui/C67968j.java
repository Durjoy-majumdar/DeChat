package com.tencent.p014mm.chatroom.p015ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import com.tencent.p014mm.chatroom.p015ui.ChatroomInfoUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import eb0.C75604z3;
import p203mi.C34572d0;

/* renamed from: com.tencent.mm.chatroom.ui.j */
public class C67968j implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ChatroomInfoUI f195094d;

    public C67968j(ChatroomInfoUI chatroomInfoUI) {
        this.f195094d = chatroomInfoUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C115669n.INSTANCE.mo160131h(14553, 3, 3, this.f195094d.f194770B);
        ProgressDialog progressDialog = this.f195094d.f194791d;
        if (progressDialog != null) {
            progressDialog.show();
        }
        ChatroomInfoUI chatroomInfoUI = this.f195094d;
        chatroomInfoUI.f194783P = false;
        C34572d0.m40394e(chatroomInfoUI.f194770B);
        C75604z3.m90836h(chatroomInfoUI.f194797j.getUsername(), new ChatroomInfoUI.C67872r(chatroomInfoUI, chatroomInfoUI, chatroomInfoUI.f194797j.getUsername()));
    }
}
