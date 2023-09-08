package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.content.DialogInterface;
import com.tencent.p014mm.autogen.events.TalkRoomServerEvent;
import com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.c */
public class C72771c implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ AppPanel.C72749d f212117d;

    public C72771c(AppPanel.C72749d dVar) {
        this.f212117d = dVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        TalkRoomServerEvent talkRoomServerEvent = new TalkRoomServerEvent();
        talkRoomServerEvent.f154883d.f154886b = true;
        talkRoomServerEvent.publish();
        AppPanel.this.f211708h.mo96042b();
        dialogInterface.dismiss();
    }
}
