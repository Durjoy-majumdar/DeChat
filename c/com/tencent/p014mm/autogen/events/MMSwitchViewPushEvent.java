package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.MMSwitchViewPushEvent */
public final class MMSwitchViewPushEvent extends IEvent {

    /* renamed from: d */
    public C40133a f107629d = new C40133a();

    /* renamed from: com.tencent.mm.autogen.events.MMSwitchViewPushEvent$a */
    public static final class C40133a {

        /* renamed from: a */
        public String f107630a;

        /* renamed from: b */
        public int f107631b;

        /* renamed from: c */
        public int f107632c = 1;
    }

    public MMSwitchViewPushEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof MMSwitchViewPushEvent)) {
            return false;
        }
        C40133a aVar = ((MMSwitchViewPushEvent) iEvent).f107629d;
        return C46238a.m51546a(this.f107629d.f107630a, aVar.f107630a) && C46238a.m51546a(Integer.valueOf(this.f107629d.f107631b), Integer.valueOf(aVar.f107631b)) && C46238a.m51546a(Integer.valueOf(this.f107629d.f107632c), Integer.valueOf(aVar.f107632c));
    }
}
