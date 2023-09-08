package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ShakeAcceptCouponCardEvent */
public final class ShakeAcceptCouponCardEvent extends IEvent {

    /* renamed from: d */
    public C17691a f48126d = new C17691a();

    /* renamed from: e */
    public C17692b f48127e = new C17692b();

    /* renamed from: com.tencent.mm.autogen.events.ShakeAcceptCouponCardEvent$a */
    public static final class C17691a {

        /* renamed from: a */
        public String f48128a;

        /* renamed from: b */
        public String f48129b;

        /* renamed from: c */
        public int f48130c = 0;
    }

    /* renamed from: com.tencent.mm.autogen.events.ShakeAcceptCouponCardEvent$b */
    public static final class C17692b {

        /* renamed from: a */
        public String f48131a;

        /* renamed from: b */
        public boolean f48132b = false;
    }

    public ShakeAcceptCouponCardEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ShakeAcceptCouponCardEvent)) {
            return false;
        }
        ShakeAcceptCouponCardEvent shakeAcceptCouponCardEvent = (ShakeAcceptCouponCardEvent) iEvent;
        C17691a aVar = shakeAcceptCouponCardEvent.f48126d;
        if (!C46238a.m51546a(this.f48126d.f48128a, aVar.f48128a) || !C46238a.m51546a(this.f48126d.f48129b, aVar.f48129b) || !C46238a.m51546a(Integer.valueOf(this.f48126d.f48130c), Integer.valueOf(aVar.f48130c))) {
            return false;
        }
        C17692b bVar = shakeAcceptCouponCardEvent.f48127e;
        return C46238a.m51546a(this.f48127e.f48131a, bVar.f48131a) && C46238a.m51546a(Boolean.valueOf(this.f48127e.f48132b), Boolean.valueOf(bVar.f48132b));
    }
}
