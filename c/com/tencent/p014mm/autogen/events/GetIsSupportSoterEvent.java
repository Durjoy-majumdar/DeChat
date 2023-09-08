package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.GetIsSupportSoterEvent */
public final class GetIsSupportSoterEvent extends IEvent {

    /* renamed from: d */
    public C1080a f9299d = new C1080a();

    /* renamed from: com.tencent.mm.autogen.events.GetIsSupportSoterEvent$a */
    public static final class C1080a {

        /* renamed from: a */
        public int f9300a;
    }

    public GetIsSupportSoterEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof GetIsSupportSoterEvent)) {
            return false;
        }
        return C46238a.m51546a(Integer.valueOf(this.f9299d.f9300a), Integer.valueOf(((GetIsSupportSoterEvent) iEvent).f9299d.f9300a));
    }
}
