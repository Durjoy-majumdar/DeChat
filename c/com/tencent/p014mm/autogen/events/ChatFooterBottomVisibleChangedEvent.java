package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ChatFooterBottomVisibleChangedEvent */
public final class ChatFooterBottomVisibleChangedEvent extends IEvent {

    /* renamed from: d */
    public C0998a f9041d = new C0998a();

    /* renamed from: com.tencent.mm.autogen.events.ChatFooterBottomVisibleChangedEvent$a */
    public static final class C0998a {
    }

    public ChatFooterBottomVisibleChangedEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ChatFooterBottomVisibleChangedEvent)) {
            return false;
        }
        C0998a aVar = ((ChatFooterBottomVisibleChangedEvent) iEvent).f9041d;
        this.f9041d.getClass();
        Boolean bool = Boolean.FALSE;
        aVar.getClass();
        return C46238a.m51546a(bool, bool);
    }
}
