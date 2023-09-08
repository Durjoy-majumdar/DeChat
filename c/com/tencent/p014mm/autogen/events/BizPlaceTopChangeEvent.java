package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.BizPlaceTopChangeEvent */
public final class BizPlaceTopChangeEvent extends IEvent {

    /* renamed from: d */
    public C40041a f107373d = new C40041a();

    /* renamed from: com.tencent.mm.autogen.events.BizPlaceTopChangeEvent$a */
    public static final class C40041a {

        /* renamed from: a */
        public String f107374a;
    }

    public BizPlaceTopChangeEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof BizPlaceTopChangeEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f107373d.f107374a, ((BizPlaceTopChangeEvent) iEvent).f107373d.f107374a);
    }
}
