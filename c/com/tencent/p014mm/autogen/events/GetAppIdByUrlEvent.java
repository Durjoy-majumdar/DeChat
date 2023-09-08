package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.GetAppIdByUrlEvent */
public final class GetAppIdByUrlEvent extends IEvent {

    /* renamed from: d */
    public C40115a f107580d = new C40115a();

    /* renamed from: e */
    public C40116b f107581e = new C40116b();

    /* renamed from: com.tencent.mm.autogen.events.GetAppIdByUrlEvent$a */
    public static final class C40115a {

        /* renamed from: a */
        public String f107582a;
    }

    /* renamed from: com.tencent.mm.autogen.events.GetAppIdByUrlEvent$b */
    public static final class C40116b {

        /* renamed from: a */
        public String f107583a;
    }

    public GetAppIdByUrlEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof GetAppIdByUrlEvent)) {
            return false;
        }
        GetAppIdByUrlEvent getAppIdByUrlEvent = (GetAppIdByUrlEvent) iEvent;
        if (!C46238a.m51546a(this.f107580d.f107582a, getAppIdByUrlEvent.f107580d.f107582a)) {
            return false;
        }
        return C46238a.m51546a(this.f107581e.f107583a, getAppIdByUrlEvent.f107581e.f107583a);
    }
}
