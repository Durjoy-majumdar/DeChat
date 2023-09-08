package com.tencent.p014mm.chatroom.p015ui;

import android.content.DialogInterface;
import com.tencent.p014mm.roomsdk.model.factory.C72940a;
import p530fx.C75818e;

/* renamed from: com.tencent.mm.chatroom.ui.m0 */
public class C67977m0 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C75818e f195109d;

    /* renamed from: e */
    public final /* synthetic */ DelChatroomMemberUI f195110e;

    public C67977m0(DelChatroomMemberUI delChatroomMemberUI, C75818e eVar) {
        this.f195110e = delChatroomMemberUI;
        this.f195109d = eVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C75818e eVar = this.f195109d;
        if (eVar != null) {
            eVar.cancel();
        }
        C72940a aVar = this.f195110e.f194842q;
        if (aVar != null) {
            aVar.cancel();
        }
    }
}
