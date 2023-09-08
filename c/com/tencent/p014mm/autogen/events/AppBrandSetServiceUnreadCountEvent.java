package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.AppBrandSetServiceUnreadCountEvent */
public final class AppBrandSetServiceUnreadCountEvent extends IEvent {

    /* renamed from: d */
    public C28705a f78716d = new C28705a();

    /* renamed from: com.tencent.mm.autogen.events.AppBrandSetServiceUnreadCountEvent$a */
    public static final class C28705a {

        /* renamed from: a */
        public String f78717a;
    }

    public AppBrandSetServiceUnreadCountEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof AppBrandSetServiceUnreadCountEvent)) {
            return false;
        }
        if (!C46238a.m51546a(this.f78716d.f78717a, ((AppBrandSetServiceUnreadCountEvent) iEvent).f78716d.f78717a)) {
            return false;
        }
        this.f78716d.getClass();
        return C46238a.m51546a(0, 0);
    }
}
