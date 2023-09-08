package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.NetworkDiagnoseResultEvent */
public final class NetworkDiagnoseResultEvent extends IEvent {

    /* renamed from: d */
    public C114680a f343573d = new C114680a();

    /* renamed from: com.tencent.mm.autogen.events.NetworkDiagnoseResultEvent$a */
    public static final class C114680a {

        /* renamed from: a */
        public int f343574a = 0;

        /* renamed from: b */
        public int f343575b = 0;

        /* renamed from: c */
        public boolean f343576c = false;

        /* renamed from: d */
        public String f343577d;
    }

    public NetworkDiagnoseResultEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof NetworkDiagnoseResultEvent)) {
            return false;
        }
        C114680a aVar = ((NetworkDiagnoseResultEvent) iEvent).f343573d;
        return C46238a.m51546a(Integer.valueOf(this.f343573d.f343574a), Integer.valueOf(aVar.f343574a)) && C46238a.m51546a(Integer.valueOf(this.f343573d.f343575b), Integer.valueOf(aVar.f343575b)) && C46238a.m51546a(Boolean.valueOf(this.f343573d.f343576c), Boolean.valueOf(aVar.f343576c)) && C46238a.m51546a(this.f343573d.f343577d, aVar.f343577d);
    }
}
