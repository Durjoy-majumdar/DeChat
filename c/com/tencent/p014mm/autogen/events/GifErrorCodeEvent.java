package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.GifErrorCodeEvent */
public final class GifErrorCodeEvent extends IEvent {

    /* renamed from: d */
    public C28761a f78829d = new C28761a();

    /* renamed from: com.tencent.mm.autogen.events.GifErrorCodeEvent$a */
    public static final class C28761a {

        /* renamed from: a */
        public int f78830a;
    }

    public GifErrorCodeEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof GifErrorCodeEvent)) {
            return false;
        }
        return C46238a.m51546a(Integer.valueOf(this.f78829d.f78830a), Integer.valueOf(((GifErrorCodeEvent) iEvent).f78829d.f78830a));
    }
}
