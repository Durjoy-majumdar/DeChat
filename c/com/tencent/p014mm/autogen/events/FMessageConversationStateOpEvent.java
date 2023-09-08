package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FMessageConversationStateOpEvent */
public final class FMessageConversationStateOpEvent extends IEvent {

    /* renamed from: d */
    public C67694a f193601d = new C67694a();

    /* renamed from: e */
    public C67695b f193602e = new C67695b();

    /* renamed from: com.tencent.mm.autogen.events.FMessageConversationStateOpEvent$a */
    public static final class C67694a {

        /* renamed from: a */
        public int f193603a = -1;

        /* renamed from: b */
        public String f193604b;
    }

    /* renamed from: com.tencent.mm.autogen.events.FMessageConversationStateOpEvent$b */
    public static final class C67695b {

        /* renamed from: a */
        public int f193605a = -1;
    }

    public FMessageConversationStateOpEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FMessageConversationStateOpEvent)) {
            return false;
        }
        FMessageConversationStateOpEvent fMessageConversationStateOpEvent = (FMessageConversationStateOpEvent) iEvent;
        C67694a aVar = fMessageConversationStateOpEvent.f193601d;
        this.f193601d.getClass();
        aVar.getClass();
        if (!C46238a.m51546a(0, 0) || !C46238a.m51546a(Integer.valueOf(this.f193601d.f193603a), Integer.valueOf(aVar.f193603a)) || !C46238a.m51546a(this.f193601d.f193604b, aVar.f193604b)) {
            return false;
        }
        return C46238a.m51546a(Integer.valueOf(this.f193602e.f193605a), Integer.valueOf(fMessageConversationStateOpEvent.f193602e.f193605a));
    }
}
