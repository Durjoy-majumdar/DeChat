package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.BypNotifyActionEvent */
public final class BypNotifyActionEvent extends IEvent {

    /* renamed from: d */
    public C28713a f78730d = new C28713a();

    /* renamed from: com.tencent.mm.autogen.events.BypNotifyActionEvent$a */
    public static final class C28713a {

        /* renamed from: a */
        public long f78731a;

        /* renamed from: b */
        public byte[] f78732b;
    }

    public BypNotifyActionEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof BypNotifyActionEvent)) {
            return false;
        }
        C28713a aVar = ((BypNotifyActionEvent) iEvent).f78730d;
        return C46238a.m51546a(Long.valueOf(this.f78730d.f78731a), Long.valueOf(aVar.f78731a)) && C46238a.m51546a(this.f78730d.f78732b, aVar.f78732b);
    }
}
