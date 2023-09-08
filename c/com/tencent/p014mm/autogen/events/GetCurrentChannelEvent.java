package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.GetCurrentChannelEvent */
public final class GetCurrentChannelEvent extends IEvent {

    /* renamed from: d */
    public C40120a f107591d = new C40120a();

    /* renamed from: com.tencent.mm.autogen.events.GetCurrentChannelEvent$a */
    public static final class C40120a {

        /* renamed from: a */
        public int f107592a = 0;
    }

    public GetCurrentChannelEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof GetCurrentChannelEvent)) {
            return false;
        }
        return C46238a.m51546a(Integer.valueOf(this.f107591d.f107592a), Integer.valueOf(((GetCurrentChannelEvent) iEvent).f107591d.f107592a));
    }
}
