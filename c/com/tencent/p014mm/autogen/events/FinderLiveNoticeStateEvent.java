package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FinderLiveNoticeStateEvent */
public final class FinderLiveNoticeStateEvent extends IEvent {

    /* renamed from: d */
    public C28744a f78792d = new C28744a();

    /* renamed from: com.tencent.mm.autogen.events.FinderLiveNoticeStateEvent$a */
    public static final class C28744a {

        /* renamed from: a */
        public String f78793a;

        /* renamed from: b */
        public boolean f78794b;
    }

    public FinderLiveNoticeStateEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FinderLiveNoticeStateEvent)) {
            return false;
        }
        C28744a aVar = ((FinderLiveNoticeStateEvent) iEvent).f78792d;
        return C46238a.m51546a(this.f78792d.f78793a, aVar.f78793a) && C46238a.m51546a(Boolean.valueOf(this.f78792d.f78794b), Boolean.valueOf(aVar.f78794b));
    }
}
