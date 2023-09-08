package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.QuitContactChattingUIFragmentEvent */
public final class QuitContactChattingUIFragmentEvent extends IEvent {

    /* renamed from: d */
    public C28788a f78892d = new C28788a();

    /* renamed from: com.tencent.mm.autogen.events.QuitContactChattingUIFragmentEvent$a */
    public static final class C28788a {
    }

    public QuitContactChattingUIFragmentEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof QuitContactChattingUIFragmentEvent)) {
            return false;
        }
        C28788a aVar = ((QuitContactChattingUIFragmentEvent) iEvent).f78892d;
        this.f78892d.getClass();
        aVar.getClass();
        return C46238a.m51546a((Object) null, (Object) null);
    }
}
