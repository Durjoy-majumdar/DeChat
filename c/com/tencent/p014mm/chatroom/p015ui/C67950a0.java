package com.tencent.p014mm.chatroom.p015ui;

import android.content.DialogInterface;
import com.tencent.p014mm.roomsdk.model.factory.C72940a;

/* renamed from: com.tencent.mm.chatroom.ui.a0 */
public class C67950a0 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C72940a f195066d;

    public C67950a0(ChatroomInfoUI chatroomInfoUI, C72940a aVar) {
        this.f195066d = aVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f195066d.cancel();
    }
}
