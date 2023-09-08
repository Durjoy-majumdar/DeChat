package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.TalkRoomReportMgrEvent */
public final class TalkRoomReportMgrEvent extends IEvent {

    /* renamed from: d */
    public C28840a f79030d = new C28840a();

    /* renamed from: com.tencent.mm.autogen.events.TalkRoomReportMgrEvent$a */
    public static final class C28840a {

        /* renamed from: a */
        public boolean f79031a = false;
    }

    public TalkRoomReportMgrEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof TalkRoomReportMgrEvent)) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f79030d.f79031a), Boolean.valueOf(((TalkRoomReportMgrEvent) iEvent).f79030d.f79031a));
    }
}
