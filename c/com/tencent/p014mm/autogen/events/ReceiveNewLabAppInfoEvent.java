package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;
import java.util.List;

/* renamed from: com.tencent.mm.autogen.events.ReceiveNewLabAppInfoEvent */
public final class ReceiveNewLabAppInfoEvent extends IEvent {

    /* renamed from: d */
    public C114687a f343592d = new C114687a();

    /* renamed from: com.tencent.mm.autogen.events.ReceiveNewLabAppInfoEvent$a */
    public static final class C114687a {

        /* renamed from: a */
        public List f343593a;
    }

    public ReceiveNewLabAppInfoEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ReceiveNewLabAppInfoEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f343592d.f343593a, ((ReceiveNewLabAppInfoEvent) iEvent).f343592d.f343593a);
    }
}
