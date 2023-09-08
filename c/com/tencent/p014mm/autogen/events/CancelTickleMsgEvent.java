package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.CancelTickleMsgEvent */
public final class CancelTickleMsgEvent extends IEvent {

    /* renamed from: d */
    public C40047a f107393d = new C40047a();

    /* renamed from: com.tencent.mm.autogen.events.CancelTickleMsgEvent$a */
    public static final class C40047a {

        /* renamed from: a */
        public long f107394a = 0;
    }

    public CancelTickleMsgEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof CancelTickleMsgEvent)) {
            return false;
        }
        return C46238a.m51546a(Long.valueOf(this.f107393d.f107394a), Long.valueOf(((CancelTickleMsgEvent) iEvent).f107393d.f107394a));
    }
}
