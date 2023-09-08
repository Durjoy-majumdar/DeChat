package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.EnterContactChattingUIFragmentEvent */
public final class EnterContactChattingUIFragmentEvent extends IEvent {

    /* renamed from: d */
    public C28734a f78780d = new C28734a();

    /* renamed from: com.tencent.mm.autogen.events.EnterContactChattingUIFragmentEvent$a */
    public static final class C28734a {
    }

    public EnterContactChattingUIFragmentEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof EnterContactChattingUIFragmentEvent)) {
            return false;
        }
        C28734a aVar = ((EnterContactChattingUIFragmentEvent) iEvent).f78780d;
        this.f78780d.getClass();
        aVar.getClass();
        return C46238a.m51546a((Object) null, (Object) null);
    }
}
