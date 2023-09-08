package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ConsumedCardByOfflinePayEvent */
public final class ConsumedCardByOfflinePayEvent extends IEvent {

    /* renamed from: d */
    public C67675a f193542d = new C67675a();

    /* renamed from: com.tencent.mm.autogen.events.ConsumedCardByOfflinePayEvent$a */
    public static final class C67675a {
    }

    public ConsumedCardByOfflinePayEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ConsumedCardByOfflinePayEvent)) {
            return false;
        }
        C67675a aVar = ((ConsumedCardByOfflinePayEvent) iEvent).f193542d;
        this.f193542d.getClass();
        aVar.getClass();
        return C46238a.m51546a(0, 0);
    }
}
