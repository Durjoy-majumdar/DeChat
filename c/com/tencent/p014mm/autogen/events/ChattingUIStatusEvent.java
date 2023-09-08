package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ChattingUIStatusEvent */
public final class ChattingUIStatusEvent extends IEvent {

    /* renamed from: d */
    public C28715a f78735d = new C28715a();

    /* renamed from: com.tencent.mm.autogen.events.ChattingUIStatusEvent$a */
    public static final class C28715a {

        /* renamed from: a */
        public boolean f78736a;
    }

    public ChattingUIStatusEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ChattingUIStatusEvent)) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f78735d.f78736a), Boolean.valueOf(((ChattingUIStatusEvent) iEvent).f78735d.f78736a));
    }
}
