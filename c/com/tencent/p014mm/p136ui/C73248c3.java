package com.tencent.p014mm.p136ui;

import android.content.DialogInterface;
import com.tencent.p014mm.autogen.events.ExitTrackRoomEvent;
import com.tencent.p014mm.autogen.events.TalkRoomServerEvent;
import com.tencent.p014mm.p136ui.contact.VoipAddressUI;
import ed0.C75610d;
import t22.C118355y;

/* renamed from: com.tencent.mm.ui.c3 */
public class C73248c3 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C74755f3 f215148d;

    public C73248c3(C74755f3 f3Var) {
        this.f215148d = f3Var;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        TalkRoomServerEvent talkRoomServerEvent = new TalkRoomServerEvent();
        talkRoomServerEvent.f154883d.f154886b = true;
        talkRoomServerEvent.publish();
        ExitTrackRoomEvent exitTrackRoomEvent = new ExitTrackRoomEvent();
        exitTrackRoomEvent.f193553d.f193554a = ((C118355y) C75610d.m90860b()).f353752u;
        exitTrackRoomEvent.publish();
        VoipAddressUI.m89067j8(this.f215148d.f219822t);
        dialogInterface.dismiss();
    }
}
