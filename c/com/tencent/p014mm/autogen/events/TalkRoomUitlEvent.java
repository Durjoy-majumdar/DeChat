package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.TalkRoomUitlEvent */
public final class TalkRoomUitlEvent extends IEvent {

    /* renamed from: d */
    public C67797a f193954d = new C67797a();

    /* renamed from: com.tencent.mm.autogen.events.TalkRoomUitlEvent$a */
    public static final class C67797a {

        /* renamed from: a */
        public boolean f193955a = false;

        /* renamed from: b */
        public boolean f193956b = false;
    }

    public TalkRoomUitlEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof TalkRoomUitlEvent)) {
            return false;
        }
        C67797a aVar = ((TalkRoomUitlEvent) iEvent).f193954d;
        return C46238a.m51546a(Boolean.valueOf(this.f193954d.f193955a), Boolean.valueOf(aVar.f193955a)) && C46238a.m51546a(Boolean.valueOf(this.f193954d.f193956b), Boolean.valueOf(aVar.f193956b));
    }
}
