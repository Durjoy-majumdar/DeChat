package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.EnterGroupChattingUIFragmentEvent */
public final class EnterGroupChattingUIFragmentEvent extends IEvent {

    /* renamed from: d */
    public C28735a f78781d = new C28735a();

    /* renamed from: com.tencent.mm.autogen.events.EnterGroupChattingUIFragmentEvent$a */
    public static final class C28735a {
    }

    public EnterGroupChattingUIFragmentEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof EnterGroupChattingUIFragmentEvent)) {
            return false;
        }
        C28735a aVar = ((EnterGroupChattingUIFragmentEvent) iEvent).f78781d;
        this.f78781d.getClass();
        aVar.getClass();
        return C46238a.m51546a((Object) null, (Object) null);
    }
}
