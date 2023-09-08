package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.PoiCategoriesUpdateEvent */
public final class PoiCategoriesUpdateEvent extends IEvent {

    /* renamed from: d */
    public C1108a f9399d = new C1108a();

    /* renamed from: com.tencent.mm.autogen.events.PoiCategoriesUpdateEvent$a */
    public static final class C1108a {

        /* renamed from: a */
        public byte[] f9400a;
    }

    public PoiCategoriesUpdateEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof PoiCategoriesUpdateEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f9399d.f9400a, ((PoiCategoriesUpdateEvent) iEvent).f9399d.f9400a);
    }
}
