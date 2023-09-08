package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.GetDisasterInfoEvent */
public final class GetDisasterInfoEvent extends IEvent {

    /* renamed from: d */
    public C28755a f78820d = new C28755a();

    /* renamed from: com.tencent.mm.autogen.events.GetDisasterInfoEvent$a */
    public static final class C28755a {

        /* renamed from: a */
        public int f78821a = 0;

        /* renamed from: b */
        public boolean f78822b = false;
    }

    public GetDisasterInfoEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof GetDisasterInfoEvent)) {
            return false;
        }
        C28755a aVar = ((GetDisasterInfoEvent) iEvent).f78820d;
        return C46238a.m51546a(Integer.valueOf(this.f78820d.f78821a), Integer.valueOf(aVar.f78821a)) && C46238a.m51546a(Boolean.valueOf(this.f78820d.f78822b), Boolean.valueOf(aVar.f78822b));
    }
}
