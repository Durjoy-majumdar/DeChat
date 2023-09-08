package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SnsAdQRBtnDownloadEvent */
public final class SnsAdQRBtnDownloadEvent extends IEvent {

    /* renamed from: d */
    public C92572a f265127d = new C92572a();

    /* renamed from: com.tencent.mm.autogen.events.SnsAdQRBtnDownloadEvent$a */
    public static final class C92572a {

        /* renamed from: a */
        public String f265128a;

        /* renamed from: b */
        public String f265129b;

        /* renamed from: c */
        public String f265130c;

        /* renamed from: d */
        public int f265131d = 0;
    }

    public SnsAdQRBtnDownloadEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SnsAdQRBtnDownloadEvent)) {
            return false;
        }
        C92572a aVar = ((SnsAdQRBtnDownloadEvent) iEvent).f265127d;
        return C46238a.m51546a(this.f265127d.f265128a, aVar.f265128a) && C46238a.m51546a(this.f265127d.f265129b, aVar.f265129b) && C46238a.m51546a(this.f265127d.f265130c, aVar.f265130c) && C46238a.m51546a(Integer.valueOf(this.f265127d.f265131d), Integer.valueOf(aVar.f265131d));
    }
}
