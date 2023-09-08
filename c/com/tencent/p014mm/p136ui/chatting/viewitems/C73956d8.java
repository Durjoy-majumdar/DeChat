package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.DialogInterface;
import com.tencent.p014mm.autogen.events.ExitTrackRoomEvent;
import com.tencent.p014mm.autogen.events.TalkRoomServerEvent;
import ed0.C75610d;
import t22.C118355y;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.d8 */
public class C73956d8 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C74243t8 f217059d;

    /* renamed from: e */
    public final /* synthetic */ C73989f8 f217060e;

    public C73956d8(C73989f8 f8Var, C74243t8 t8Var) {
        this.f217060e = f8Var;
        this.f217059d = t8Var;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        TalkRoomServerEvent talkRoomServerEvent = new TalkRoomServerEvent();
        talkRoomServerEvent.f154883d.f154886b = true;
        talkRoomServerEvent.publish();
        ExitTrackRoomEvent exitTrackRoomEvent = new ExitTrackRoomEvent();
        exitTrackRoomEvent.f193553d.f193554a = ((C118355y) C75610d.m90860b()).f353752u;
        exitTrackRoomEvent.publish();
        this.f217060e.mo103049b(this.f217059d);
        dialogInterface.dismiss();
    }
}
