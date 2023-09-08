package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.CardOfflinePayFinishButtonEvent */
public final class CardOfflinePayFinishButtonEvent extends IEvent {

    /* renamed from: d */
    public C67666a f193511d = new C67666a();

    /* renamed from: com.tencent.mm.autogen.events.CardOfflinePayFinishButtonEvent$a */
    public static final class C67666a {

        /* renamed from: a */
        public boolean f193512a;
    }

    public CardOfflinePayFinishButtonEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof CardOfflinePayFinishButtonEvent)) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f193511d.f193512a), Boolean.valueOf(((CardOfflinePayFinishButtonEvent) iEvent).f193511d.f193512a));
    }
}
