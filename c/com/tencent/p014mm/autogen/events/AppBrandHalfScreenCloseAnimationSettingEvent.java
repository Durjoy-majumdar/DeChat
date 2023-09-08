package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.AppBrandHalfScreenCloseAnimationSettingEvent */
public final class AppBrandHalfScreenCloseAnimationSettingEvent extends IEvent {

    /* renamed from: d */
    public C80701a f236130d = new C80701a();

    /* renamed from: com.tencent.mm.autogen.events.AppBrandHalfScreenCloseAnimationSettingEvent$a */
    public static final class C80701a {

        /* renamed from: a */
        public int f236131a;

        /* renamed from: b */
        public int f236132b;
    }

    public AppBrandHalfScreenCloseAnimationSettingEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof AppBrandHalfScreenCloseAnimationSettingEvent)) {
            return false;
        }
        C80701a aVar = ((AppBrandHalfScreenCloseAnimationSettingEvent) iEvent).f236130d;
        if (!C46238a.m51546a(Integer.valueOf(this.f236130d.f236131a), Integer.valueOf(aVar.f236131a)) || !C46238a.m51546a(Integer.valueOf(this.f236130d.f236132b), Integer.valueOf(aVar.f236132b))) {
            return false;
        }
        this.f236130d.getClass();
        return C46238a.m51546a(0, 0);
    }
}
