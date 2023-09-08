package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.StatusNotifyFunctionEvent */
public final class StatusNotifyFunctionEvent extends IEvent {

    /* renamed from: d */
    public C28836a f79014d = new C28836a();

    /* renamed from: com.tencent.mm.autogen.events.StatusNotifyFunctionEvent$a */
    public static final class C28836a {

        /* renamed from: a */
        public int f79015a;

        /* renamed from: b */
        public String f79016b;

        /* renamed from: c */
        public long f79017c;

        /* renamed from: d */
        public String f79018d;
    }

    public StatusNotifyFunctionEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof StatusNotifyFunctionEvent)) {
            return false;
        }
        C28836a aVar = ((StatusNotifyFunctionEvent) iEvent).f79014d;
        return C46238a.m51546a(Integer.valueOf(this.f79014d.f79015a), Integer.valueOf(aVar.f79015a)) && C46238a.m51546a(this.f79014d.f79016b, aVar.f79016b) && C46238a.m51546a(Long.valueOf(this.f79014d.f79017c), Long.valueOf(aVar.f79017c)) && C46238a.m51546a(this.f79014d.f79018d, aVar.f79018d);
    }
}
