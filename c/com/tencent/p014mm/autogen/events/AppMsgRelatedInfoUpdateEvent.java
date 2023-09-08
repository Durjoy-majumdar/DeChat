package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.AppMsgRelatedInfoUpdateEvent */
public final class AppMsgRelatedInfoUpdateEvent extends IEvent {

    /* renamed from: d */
    public C40038a f107364d = new C40038a();

    /* renamed from: com.tencent.mm.autogen.events.AppMsgRelatedInfoUpdateEvent$a */
    public static final class C40038a {

        /* renamed from: a */
        public int f107365a;

        /* renamed from: b */
        public boolean f107366b = false;
    }

    public AppMsgRelatedInfoUpdateEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof AppMsgRelatedInfoUpdateEvent)) {
            return false;
        }
        C40038a aVar = ((AppMsgRelatedInfoUpdateEvent) iEvent).f107364d;
        return C46238a.m51546a(Integer.valueOf(this.f107364d.f107365a), Integer.valueOf(aVar.f107365a)) && C46238a.m51546a(Boolean.valueOf(this.f107364d.f107366b), Boolean.valueOf(aVar.f107366b));
    }
}
