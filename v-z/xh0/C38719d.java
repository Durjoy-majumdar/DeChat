package xh0;

import com.tencent.p014mm.autogen.events.DeleteMsgEvent;
import com.tencent.p014mm.plugin.announcement.C68571h;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import di3.C86312j;

/* renamed from: xh0.d */
public class C38719d extends IStaticListener<DeleteMsgEvent> {
    public boolean callback(IEvent iEvent) {
        DeleteMsgEvent deleteMsgEvent = (DeleteMsgEvent) iEvent;
        if (deleteMsgEvent.f78765d.f78768c != 1107296305) {
            return false;
        }
        C68571h hVar = (C68571h) C86312j.m106911c(C68571h.class);
        C68571h.vx0(deleteMsgEvent.f78765d.f78766a);
        return false;
    }
}
