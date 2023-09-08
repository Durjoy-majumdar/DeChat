package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.AppBrandGetServiceUnreadCountEvent */
public final class AppBrandGetServiceUnreadCountEvent extends IEvent {

    /* renamed from: d */
    public C28703a f78712d = new C28703a();

    /* renamed from: e */
    public C28704b f78713e = new C28704b();

    /* renamed from: com.tencent.mm.autogen.events.AppBrandGetServiceUnreadCountEvent$a */
    public static final class C28703a {

        /* renamed from: a */
        public String f78714a;
    }

    /* renamed from: com.tencent.mm.autogen.events.AppBrandGetServiceUnreadCountEvent$b */
    public static final class C28704b {

        /* renamed from: a */
        public int f78715a;
    }

    public AppBrandGetServiceUnreadCountEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof AppBrandGetServiceUnreadCountEvent)) {
            return false;
        }
        AppBrandGetServiceUnreadCountEvent appBrandGetServiceUnreadCountEvent = (AppBrandGetServiceUnreadCountEvent) iEvent;
        if (!C46238a.m51546a(this.f78712d.f78714a, appBrandGetServiceUnreadCountEvent.f78712d.f78714a)) {
            return false;
        }
        return C46238a.m51546a(Integer.valueOf(this.f78713e.f78715a), Integer.valueOf(appBrandGetServiceUnreadCountEvent.f78713e.f78715a));
    }
}
