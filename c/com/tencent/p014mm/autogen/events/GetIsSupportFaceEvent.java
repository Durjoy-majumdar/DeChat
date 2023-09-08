package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.GetIsSupportFaceEvent */
public final class GetIsSupportFaceEvent extends IEvent {

    /* renamed from: d */
    public C1079a f9294d = new C1079a();

    /* renamed from: com.tencent.mm.autogen.events.GetIsSupportFaceEvent$a */
    public static final class C1079a {

        /* renamed from: a */
        public boolean f9295a;

        /* renamed from: b */
        public int f9296b;

        /* renamed from: c */
        public String f9297c;

        /* renamed from: d */
        public int f9298d;
    }

    public GetIsSupportFaceEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof GetIsSupportFaceEvent)) {
            return false;
        }
        C1079a aVar = ((GetIsSupportFaceEvent) iEvent).f9294d;
        return C46238a.m51546a(Boolean.valueOf(this.f9294d.f9295a), Boolean.valueOf(aVar.f9295a)) && C46238a.m51546a(Integer.valueOf(this.f9294d.f9296b), Integer.valueOf(aVar.f9296b)) && C46238a.m51546a(this.f9294d.f9297c, aVar.f9297c) && C46238a.m51546a(Integer.valueOf(this.f9294d.f9298d), Integer.valueOf(aVar.f9298d));
    }
}
