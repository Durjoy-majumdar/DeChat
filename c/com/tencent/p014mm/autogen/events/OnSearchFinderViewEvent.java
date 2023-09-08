package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.OnSearchFinderViewEvent */
public final class OnSearchFinderViewEvent extends IEvent {

    /* renamed from: d */
    public C1102a f9366d = new C1102a();

    /* renamed from: com.tencent.mm.autogen.events.OnSearchFinderViewEvent$a */
    public static final class C1102a {

        /* renamed from: a */
        public String f9367a;

        /* renamed from: b */
        public String f9368b;
    }

    public OnSearchFinderViewEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof OnSearchFinderViewEvent)) {
            return false;
        }
        C1102a aVar = ((OnSearchFinderViewEvent) iEvent).f9366d;
        return C46238a.m51546a(this.f9366d.f9367a, aVar.f9367a) && C46238a.m51546a(this.f9366d.f9368b, aVar.f9368b);
    }
}
