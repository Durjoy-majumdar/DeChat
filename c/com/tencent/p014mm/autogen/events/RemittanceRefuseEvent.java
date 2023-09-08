package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.RemittanceRefuseEvent */
public final class RemittanceRefuseEvent extends IEvent {

    /* renamed from: d */
    public C67777a f193895d = new C67777a();

    /* renamed from: com.tencent.mm.autogen.events.RemittanceRefuseEvent$a */
    public static final class C67777a {

        /* renamed from: a */
        public String f193896a;

        /* renamed from: b */
        public String f193897b;

        /* renamed from: c */
        public int f193898c;

        /* renamed from: d */
        public String f193899d;
    }

    public RemittanceRefuseEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof RemittanceRefuseEvent)) {
            return false;
        }
        C67777a aVar = ((RemittanceRefuseEvent) iEvent).f193895d;
        if (!C46238a.m51546a(this.f193895d.f193896a, aVar.f193896a) || !C46238a.m51546a(this.f193895d.f193897b, aVar.f193897b) || !C46238a.m51546a(Integer.valueOf(this.f193895d.f193898c), Integer.valueOf(aVar.f193898c)) || !C46238a.m51546a(this.f193895d.f193899d, aVar.f193899d)) {
            return false;
        }
        this.f193895d.getClass();
        return C46238a.m51546a(0, 0);
    }
}
