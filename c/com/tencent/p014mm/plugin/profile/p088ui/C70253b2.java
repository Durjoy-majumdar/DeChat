package com.tencent.p014mm.plugin.profile.p088ui;

import android.content.DialogInterface;
import com.tencent.p014mm.autogen.events.ExitTrackRoomEvent;
import com.tencent.p014mm.autogen.events.TalkRoomServerEvent;
import com.tencent.p014mm.plugin.profile.p088ui.NormalUserFooterPreference;
import ed0.C75610d;
import t22.C118355y;

/* renamed from: com.tencent.mm.plugin.profile.ui.b2 */
public class C70253b2 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ NormalUserFooterPreference.C70154c f203006d;

    public C70253b2(NormalUserFooterPreference.C70154c cVar) {
        this.f203006d = cVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        TalkRoomServerEvent talkRoomServerEvent = new TalkRoomServerEvent();
        talkRoomServerEvent.f154883d.f154886b = true;
        talkRoomServerEvent.publish();
        ExitTrackRoomEvent exitTrackRoomEvent = new ExitTrackRoomEvent();
        exitTrackRoomEvent.f193553d.f193554a = ((C118355y) C75610d.m90860b()).f353752u;
        exitTrackRoomEvent.publish();
        this.f203006d.mo96639m();
        dialogInterface.dismiss();
    }
}
