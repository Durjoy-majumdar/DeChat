package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ANRDetectedEvent */
public final class ANRDetectedEvent extends IEvent {

    /* renamed from: d */
    public C80697a f236113d = new C80697a();

    /* renamed from: com.tencent.mm.autogen.events.ANRDetectedEvent$a */
    public static final class C80697a {

        /* renamed from: a */
        public String f236114a;

        /* renamed from: b */
        public String f236115b;

        /* renamed from: c */
        public boolean f236116c;

        /* renamed from: d */
        public String f236117d;

        /* renamed from: e */
        public String f236118e;

        /* renamed from: f */
        public String f236119f;
    }

    public ANRDetectedEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ANRDetectedEvent)) {
            return false;
        }
        C80697a aVar = ((ANRDetectedEvent) iEvent).f236113d;
        return C46238a.m51546a(this.f236113d.f236114a, aVar.f236114a) && C46238a.m51546a(this.f236113d.f236115b, aVar.f236115b) && C46238a.m51546a(Boolean.valueOf(this.f236113d.f236116c), Boolean.valueOf(aVar.f236116c)) && C46238a.m51546a(this.f236113d.f236117d, aVar.f236117d) && C46238a.m51546a(this.f236113d.f236118e, aVar.f236118e) && C46238a.m51546a(this.f236113d.f236119f, aVar.f236119f);
    }
}
