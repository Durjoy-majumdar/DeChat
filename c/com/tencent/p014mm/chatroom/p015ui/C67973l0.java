package com.tencent.p014mm.chatroom.p015ui;

import android.content.DialogInterface;
import com.tencent.p014mm.roomsdk.model.factory.C72940a;

/* renamed from: com.tencent.mm.chatroom.ui.l0 */
public class C67973l0 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C72940a f195102d;

    public C67973l0(DelChatroomMemberUI delChatroomMemberUI, C72940a aVar) {
        this.f195102d = aVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f195102d.cancel();
    }
}
