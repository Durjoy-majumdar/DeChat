package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.QuitGroupChattingUIFragmentEvent */
public final class QuitGroupChattingUIFragmentEvent extends IEvent {

    /* renamed from: d */
    public C28789a f78893d = new C28789a();

    /* renamed from: com.tencent.mm.autogen.events.QuitGroupChattingUIFragmentEvent$a */
    public static final class C28789a {
    }

    public QuitGroupChattingUIFragmentEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof QuitGroupChattingUIFragmentEvent)) {
            return false;
        }
        C28789a aVar = ((QuitGroupChattingUIFragmentEvent) iEvent).f78893d;
        this.f78893d.getClass();
        aVar.getClass();
        return C46238a.m51546a((Object) null, (Object) null);
    }
}
