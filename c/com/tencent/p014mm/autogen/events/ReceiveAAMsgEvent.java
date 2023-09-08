package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ReceiveAAMsgEvent */
public final class ReceiveAAMsgEvent extends IEvent {

    /* renamed from: d */
    public C28793a f78899d = new C28793a();

    /* renamed from: com.tencent.mm.autogen.events.ReceiveAAMsgEvent$a */
    public static final class C28793a {

        /* renamed from: a */
        public long f78900a;

        /* renamed from: b */
        public String f78901b;
    }

    public ReceiveAAMsgEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ReceiveAAMsgEvent)) {
            return false;
        }
        C28793a aVar = ((ReceiveAAMsgEvent) iEvent).f78899d;
        return C46238a.m51546a(Long.valueOf(this.f78899d.f78900a), Long.valueOf(aVar.f78900a)) && C46238a.m51546a(this.f78899d.f78901b, aVar.f78901b);
    }
}
