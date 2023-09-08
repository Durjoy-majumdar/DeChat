package com.tencent.p014mm.plugin.profile;

import android.content.DialogInterface;
import com.tencent.p014mm.autogen.events.ExitTrackRoomEvent;
import com.tencent.p014mm.autogen.events.TalkRoomServerEvent;
import com.tencent.p014mm.storage.C72996z1;
import ed0.C75610d;
import t22.C118355y;

/* renamed from: com.tencent.mm.plugin.profile.c */
public class C70138c implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C72996z1 f202472d;

    /* renamed from: e */
    public final /* synthetic */ NewContactWidgetNormal f202473e;

    public C70138c(NewContactWidgetNormal newContactWidgetNormal, C72996z1 z1Var) {
        this.f202473e = newContactWidgetNormal;
        this.f202472d = z1Var;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        TalkRoomServerEvent talkRoomServerEvent = new TalkRoomServerEvent();
        talkRoomServerEvent.f154883d.f154886b = true;
        talkRoomServerEvent.publish();
        ExitTrackRoomEvent exitTrackRoomEvent = new ExitTrackRoomEvent();
        exitTrackRoomEvent.f193553d.f193554a = ((C118355y) C75610d.m90860b()).f353752u;
        exitTrackRoomEvent.publish();
        NewContactWidgetNormal newContactWidgetNormal = this.f202473e;
        newContactWidgetNormal.mo96544n(this.f202472d, newContactWidgetNormal.f202419d);
        dialogInterface.dismiss();
    }
}
