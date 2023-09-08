package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;
import te3.C51270sn1;

/* renamed from: com.tencent.mm.autogen.events.FinderTagClickEvent */
public final class FinderTagClickEvent extends IEvent {

    /* renamed from: d */
    public C1064a f9253d = new C1064a();

    /* renamed from: com.tencent.mm.autogen.events.FinderTagClickEvent$a */
    public static final class C1064a {

        /* renamed from: a */
        public C51270sn1 f9254a;
    }

    public FinderTagClickEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FinderTagClickEvent)) {
            return false;
        }
        if (!C46238a.m51546a(this.f9253d.f9254a, ((FinderTagClickEvent) iEvent).f9253d.f9254a)) {
            return false;
        }
        this.f9253d.getClass();
        return C46238a.m51546a(0, 0);
    }
}
