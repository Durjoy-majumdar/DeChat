package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;
import te3.C64888zo1;

/* renamed from: com.tencent.mm.autogen.events.OnExitFinderFullscreenEvent */
public final class OnExitFinderFullscreenEvent extends IEvent {

    /* renamed from: d */
    public C1101a f9360d = new C1101a();

    /* renamed from: com.tencent.mm.autogen.events.OnExitFinderFullscreenEvent$a */
    public static final class C1101a {

        /* renamed from: a */
        public String f9361a;

        /* renamed from: b */
        public float f9362b;

        /* renamed from: c */
        public boolean f9363c;

        /* renamed from: d */
        public float f9364d;

        /* renamed from: e */
        public C64888zo1 f9365e;
    }

    public OnExitFinderFullscreenEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof OnExitFinderFullscreenEvent)) {
            return false;
        }
        C1101a aVar = ((OnExitFinderFullscreenEvent) iEvent).f9360d;
        if (!C46238a.m51546a(this.f9360d.f9361a, aVar.f9361a) || !C46238a.m51546a(Float.valueOf(this.f9360d.f9362b), Float.valueOf(aVar.f9362b)) || !C46238a.m51546a(Boolean.valueOf(this.f9360d.f9363c), Boolean.valueOf(aVar.f9363c)) || !C46238a.m51546a(Float.valueOf(this.f9360d.f9364d), Float.valueOf(aVar.f9364d))) {
            return false;
        }
        this.f9360d.getClass();
        Boolean bool = Boolean.FALSE;
        return C46238a.m51546a(bool, bool) && C46238a.m51546a(this.f9360d.f9365e, aVar.f9365e);
    }
}
