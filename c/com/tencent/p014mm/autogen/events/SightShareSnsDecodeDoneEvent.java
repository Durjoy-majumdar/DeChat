package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SightShareSnsDecodeDoneEvent */
public final class SightShareSnsDecodeDoneEvent extends IEvent {

    /* renamed from: d */
    public C28825a f78983d = new C28825a();

    /* renamed from: com.tencent.mm.autogen.events.SightShareSnsDecodeDoneEvent$a */
    public static final class C28825a {
    }

    public SightShareSnsDecodeDoneEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SightShareSnsDecodeDoneEvent)) {
            return false;
        }
        C28825a aVar = ((SightShareSnsDecodeDoneEvent) iEvent).f78983d;
        this.f78983d.getClass();
        aVar.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        this.f78983d.getClass();
        return C46238a.m51546a((Object) null, (Object) null);
    }
}
