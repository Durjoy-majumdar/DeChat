package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.AppBrandNotifyMessageStatusChangedEvent */
public final class AppBrandNotifyMessageStatusChangedEvent extends IEvent {

    /* renamed from: d */
    public C67657a f193472d = new C67657a();

    /* renamed from: com.tencent.mm.autogen.events.AppBrandNotifyMessageStatusChangedEvent$a */
    public static final class C67657a {

        /* renamed from: a */
        public String f193473a;

        /* renamed from: b */
        public boolean f193474b;
    }

    public AppBrandNotifyMessageStatusChangedEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof AppBrandNotifyMessageStatusChangedEvent)) {
            return false;
        }
        C67657a aVar = ((AppBrandNotifyMessageStatusChangedEvent) iEvent).f193472d;
        return C46238a.m51546a(this.f193472d.f193473a, aVar.f193473a) && C46238a.m51546a(Boolean.valueOf(this.f193472d.f193474b), Boolean.valueOf(aVar.f193474b));
    }
}
