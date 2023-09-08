package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FinderLiveRecommendSwitchEvent */
public final class FinderLiveRecommendSwitchEvent extends IEvent {

    /* renamed from: d */
    public C40099a f107529d = new C40099a();

    /* renamed from: com.tencent.mm.autogen.events.FinderLiveRecommendSwitchEvent$a */
    public static final class C40099a {

        /* renamed from: a */
        public int f107530a;

        /* renamed from: b */
        public int f107531b;

        /* renamed from: c */
        public int f107532c;
    }

    public FinderLiveRecommendSwitchEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FinderLiveRecommendSwitchEvent)) {
            return false;
        }
        C40099a aVar = ((FinderLiveRecommendSwitchEvent) iEvent).f107529d;
        return C46238a.m51546a(Integer.valueOf(this.f107529d.f107530a), Integer.valueOf(aVar.f107530a)) && C46238a.m51546a(Integer.valueOf(this.f107529d.f107531b), Integer.valueOf(aVar.f107531b)) && C46238a.m51546a(Integer.valueOf(this.f107529d.f107532c), Integer.valueOf(aVar.f107532c));
    }
}
