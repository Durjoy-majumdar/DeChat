package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.DestroyPreloadedWebViewEvent */
public final class DestroyPreloadedWebViewEvent extends IEvent {

    /* renamed from: d */
    public C28728a f78769d = new C28728a();

    /* renamed from: com.tencent.mm.autogen.events.DestroyPreloadedWebViewEvent$a */
    public static final class C28728a {

        /* renamed from: a */
        public long f78770a = 0;

        /* renamed from: b */
        public boolean f78771b = false;
    }

    public DestroyPreloadedWebViewEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof DestroyPreloadedWebViewEvent)) {
            return false;
        }
        C28728a aVar = ((DestroyPreloadedWebViewEvent) iEvent).f78769d;
        return C46238a.m51546a(Long.valueOf(this.f78769d.f78770a), Long.valueOf(aVar.f78770a)) && C46238a.m51546a(Boolean.valueOf(this.f78769d.f78771b), Boolean.valueOf(aVar.f78771b));
    }
}
