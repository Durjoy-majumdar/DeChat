package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.AppBrandFileCleanEvent */
public final class AppBrandFileCleanEvent extends IEvent {

    /* renamed from: d */
    public C80700a f236127d = new C80700a();

    /* renamed from: com.tencent.mm.autogen.events.AppBrandFileCleanEvent$a */
    public static final class C80700a {

        /* renamed from: a */
        public String f236128a;

        /* renamed from: b */
        public boolean f236129b;
    }

    public AppBrandFileCleanEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof AppBrandFileCleanEvent)) {
            return false;
        }
        C80700a aVar = ((AppBrandFileCleanEvent) iEvent).f236127d;
        return C46238a.m51546a(this.f236127d.f236128a, aVar.f236128a) && C46238a.m51546a(Boolean.valueOf(this.f236127d.f236129b), Boolean.valueOf(aVar.f236129b));
    }
}
