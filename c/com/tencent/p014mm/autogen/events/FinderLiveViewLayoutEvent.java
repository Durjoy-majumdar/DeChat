package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FinderLiveViewLayoutEvent */
public final class FinderLiveViewLayoutEvent extends IEvent {

    /* renamed from: d */
    public C55131a f154794d = new C55131a();

    /* renamed from: com.tencent.mm.autogen.events.FinderLiveViewLayoutEvent$a */
    public static final class C55131a {

        /* renamed from: a */
        public long f154795a;

        /* renamed from: b */
        public Object f154796b;

        /* renamed from: c */
        public int f154797c;

        /* renamed from: d */
        public int f154798d;

        /* renamed from: e */
        public float f154799e;

        /* renamed from: f */
        public Object f154800f;
    }

    public FinderLiveViewLayoutEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FinderLiveViewLayoutEvent)) {
            return false;
        }
        C55131a aVar = ((FinderLiveViewLayoutEvent) iEvent).f154794d;
        return C46238a.m51546a(Long.valueOf(this.f154794d.f154795a), Long.valueOf(aVar.f154795a)) && C46238a.m51546a(this.f154794d.f154796b, aVar.f154796b) && C46238a.m51546a(Integer.valueOf(this.f154794d.f154797c), Integer.valueOf(aVar.f154797c)) && C46238a.m51546a(Integer.valueOf(this.f154794d.f154798d), Integer.valueOf(aVar.f154798d)) && C46238a.m51546a(Float.valueOf(this.f154794d.f154799e), Float.valueOf(aVar.f154799e)) && C46238a.m51546a(this.f154794d.f154800f, aVar.f154800f);
    }
}
