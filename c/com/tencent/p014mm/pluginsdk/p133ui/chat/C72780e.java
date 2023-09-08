package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.content.DialogInterface;
import com.tencent.p014mm.autogen.events.TalkRoomServerEvent;
import com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.e */
public class C72780e implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ AppPanel.C72749d f212141d;

    public C72780e(AppPanel.C72749d dVar) {
        this.f212141d = dVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        TalkRoomServerEvent talkRoomServerEvent = new TalkRoomServerEvent();
        talkRoomServerEvent.f154883d.f154886b = true;
        talkRoomServerEvent.publish();
        AppPanel.this.f211708h.mo96057q();
        dialogInterface.dismiss();
    }
}
