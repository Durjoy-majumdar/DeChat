package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FinderMentionUpdateEvent */
public final class FinderMentionUpdateEvent extends IEvent {

    /* renamed from: d */
    public C40100a f107533d = new C40100a();

    /* renamed from: com.tencent.mm.autogen.events.FinderMentionUpdateEvent$a */
    public static final class C40100a {

        /* renamed from: a */
        public long f107534a;
    }

    public FinderMentionUpdateEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FinderMentionUpdateEvent)) {
            return false;
        }
        return C46238a.m51546a(Long.valueOf(this.f107533d.f107534a), Long.valueOf(((FinderMentionUpdateEvent) iEvent).f107533d.f107534a));
    }
}
