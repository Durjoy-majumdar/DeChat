package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.HideAppBrandRecentViewEvent */
public final class HideAppBrandRecentViewEvent extends IEvent {

    /* renamed from: d */
    public C80726a f236223d = new C80726a();

    /* renamed from: com.tencent.mm.autogen.events.HideAppBrandRecentViewEvent$a */
    public static final class C80726a {

        /* renamed from: a */
        public int f236224a;

        /* renamed from: b */
        public int f236225b;
    }

    public HideAppBrandRecentViewEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof HideAppBrandRecentViewEvent)) {
            return false;
        }
        C80726a aVar = ((HideAppBrandRecentViewEvent) iEvent).f236223d;
        return C46238a.m51546a(Integer.valueOf(this.f236223d.f236224a), Integer.valueOf(aVar.f236224a)) && C46238a.m51546a(Integer.valueOf(this.f236223d.f236225b), Integer.valueOf(aVar.f236225b));
    }
}
