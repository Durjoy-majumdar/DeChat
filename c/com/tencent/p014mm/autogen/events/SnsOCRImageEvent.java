package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SnsOCRImageEvent */
public final class SnsOCRImageEvent extends IEvent {

    /* renamed from: d */
    public C92586a f265173d = new C92586a();

    /* renamed from: com.tencent.mm.autogen.events.SnsOCRImageEvent$a */
    public static final class C92586a {

        /* renamed from: a */
        public int f265174a;

        /* renamed from: b */
        public String f265175b;

        /* renamed from: c */
        public String f265176c;
    }

    public SnsOCRImageEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SnsOCRImageEvent)) {
            return false;
        }
        C92586a aVar = ((SnsOCRImageEvent) iEvent).f265173d;
        return C46238a.m51546a(Integer.valueOf(this.f265173d.f265174a), Integer.valueOf(aVar.f265174a)) && C46238a.m51546a(this.f265173d.f265175b, aVar.f265175b) && C46238a.m51546a(this.f265173d.f265176c, aVar.f265176c);
    }
}
