package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SnsAdInteractionEvent */
public final class SnsAdInteractionEvent extends IEvent {

    /* renamed from: d */
    public C92568a f265118d = new C92568a();

    /* renamed from: com.tencent.mm.autogen.events.SnsAdInteractionEvent$a */
    public static final class C92568a {

        /* renamed from: a */
        public int f265119a;

        /* renamed from: b */
        public long f265120b;
    }

    public SnsAdInteractionEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SnsAdInteractionEvent)) {
            return false;
        }
        C92568a aVar = ((SnsAdInteractionEvent) iEvent).f265118d;
        if (!C46238a.m51546a(Integer.valueOf(this.f265118d.f265119a), Integer.valueOf(aVar.f265119a)) || !C46238a.m51546a(Long.valueOf(this.f265118d.f265120b), Long.valueOf(aVar.f265120b))) {
            return false;
        }
        this.f265118d.getClass();
        return C46238a.m51546a((Object) null, (Object) null);
    }
}
