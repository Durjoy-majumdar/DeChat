package p713uq;

import com.tencent.p014mm.autogen.events.UpdateChatRoomSpamStatusEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import gy3.C87412m;
import o40.C61926c;

/* renamed from: uq.c */
public final class C37560c extends IStaticListener<UpdateChatRoomSpamStatusEvent> {
    public boolean callback(IEvent iEvent) {
        UpdateChatRoomSpamStatusEvent updateChatRoomSpamStatusEvent = (UpdateChatRoomSpamStatusEvent) iEvent;
        C87412m.m108594g(updateChatRoomSpamStatusEvent, "event");
        C61926c.m72668M(new C78272b(updateChatRoomSpamStatusEvent));
        return false;
    }
}
