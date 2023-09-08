package kn3;

import android.content.DialogInterface;
import com.tencent.p014mm.autogen.events.TalkRoomServerEvent;
import gy3.C87412m;

/* renamed from: kn3.h */
public final class C76612h implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C76613j f224229d;

    public C76612h(C76613j jVar) {
        this.f224229d = jVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        TalkRoomServerEvent talkRoomServerEvent = new TalkRoomServerEvent();
        talkRoomServerEvent.f154883d.f154886b = true;
        talkRoomServerEvent.publish();
        C76613j jVar = this.f224229d;
        String r = jVar.f224230e.mo91577r();
        C87412m.m108593f(r, "mChattingContext.getTalkerUserName()");
        jVar.mo106859l(r);
    }
}
