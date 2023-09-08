package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.BizTimePersonalizedRecommendUpdateEvent */
public final class BizTimePersonalizedRecommendUpdateEvent extends IEvent {

    /* renamed from: d */
    public C40045a f107388d = new C40045a();

    /* renamed from: com.tencent.mm.autogen.events.BizTimePersonalizedRecommendUpdateEvent$a */
    public static final class C40045a {

        /* renamed from: a */
        public boolean f107389a;
    }

    public BizTimePersonalizedRecommendUpdateEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof BizTimePersonalizedRecommendUpdateEvent)) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f107388d.f107389a), Boolean.valueOf(((BizTimePersonalizedRecommendUpdateEvent) iEvent).f107388d.f107389a));
    }
}
