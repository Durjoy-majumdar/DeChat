package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.PatSuccessEvent */
public final class PatSuccessEvent extends IEvent {

    /* renamed from: d */
    public C67751a f193803d = new C67751a();

    /* renamed from: com.tencent.mm.autogen.events.PatSuccessEvent$a */
    public static final class C67751a {

        /* renamed from: a */
        public String f193804a;

        /* renamed from: b */
        public String f193805b;

        /* renamed from: c */
        public int f193806c;
    }

    public PatSuccessEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof PatSuccessEvent)) {
            return false;
        }
        C67751a aVar = ((PatSuccessEvent) iEvent).f193803d;
        return C46238a.m51546a(this.f193803d.f193804a, aVar.f193804a) && C46238a.m51546a(this.f193803d.f193805b, aVar.f193805b) && C46238a.m51546a(Integer.valueOf(this.f193803d.f193806c), Integer.valueOf(aVar.f193806c));
    }
}
