package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.UpdateFailedMsgIdEvent */
public final class UpdateFailedMsgIdEvent extends IEvent {

    /* renamed from: d */
    public C67806a f193982d = new C67806a();

    /* renamed from: com.tencent.mm.autogen.events.UpdateFailedMsgIdEvent$a */
    public static final class C67806a {

        /* renamed from: a */
        public long f193983a = -1;

        /* renamed from: b */
        public long f193984b = -1;
    }

    public UpdateFailedMsgIdEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof UpdateFailedMsgIdEvent)) {
            return false;
        }
        C67806a aVar = ((UpdateFailedMsgIdEvent) iEvent).f193982d;
        return C46238a.m51546a(Long.valueOf(this.f193982d.f193983a), Long.valueOf(aVar.f193983a)) && C46238a.m51546a(Long.valueOf(this.f193982d.f193984b), Long.valueOf(aVar.f193984b));
    }
}
