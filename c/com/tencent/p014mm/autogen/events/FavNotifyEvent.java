package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FavNotifyEvent */
public final class FavNotifyEvent extends IEvent {

    /* renamed from: d */
    public C92512a f264824d = new C92512a();

    /* renamed from: com.tencent.mm.autogen.events.FavNotifyEvent$a */
    public static final class C92512a {

        /* renamed from: a */
        public byte[] f264825a;
    }

    public FavNotifyEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FavNotifyEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f264824d.f264825a, ((FavNotifyEvent) iEvent).f264824d.f264825a);
    }
}
