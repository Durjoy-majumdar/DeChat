package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ExDeviceChattingUIStateEvent */
public final class ExDeviceChattingUIStateEvent extends IEvent {

    /* renamed from: d */
    public C40059a f107431d = new C40059a();

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceChattingUIStateEvent$a */
    public static final class C40059a {

        /* renamed from: a */
        public boolean f107432a;
    }

    public ExDeviceChattingUIStateEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExDeviceChattingUIStateEvent)) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f107431d.f107432a), Boolean.valueOf(((ExDeviceChattingUIStateEvent) iEvent).f107431d.f107432a));
    }
}
