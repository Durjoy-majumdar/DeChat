package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.storage.C72963f4;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.RevokeMsgEvent */
public final class RevokeMsgEvent extends IEvent {

    /* renamed from: d */
    public C28810a f78943d = new C28810a();

    /* renamed from: com.tencent.mm.autogen.events.RevokeMsgEvent$a */
    public static final class C28810a {

        /* renamed from: a */
        public long f78944a = 0;

        /* renamed from: b */
        public String f78945b;

        /* renamed from: c */
        public C72963f4 f78946c;

        /* renamed from: d */
        public C72963f4 f78947d;

        /* renamed from: e */
        public long f78948e = 0;

        /* renamed from: f */
        public String f78949f;
    }

    public RevokeMsgEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof RevokeMsgEvent)) {
            return false;
        }
        C28810a aVar = ((RevokeMsgEvent) iEvent).f78943d;
        return C46238a.m51546a(Long.valueOf(this.f78943d.f78944a), Long.valueOf(aVar.f78944a)) && C46238a.m51546a(this.f78943d.f78945b, aVar.f78945b) && C46238a.m51546a(this.f78943d.f78946c, aVar.f78946c) && C46238a.m51546a(this.f78943d.f78947d, aVar.f78947d) && C46238a.m51546a(Long.valueOf(this.f78943d.f78948e), Long.valueOf(aVar.f78948e)) && C46238a.m51546a(this.f78943d.f78949f, aVar.f78949f);
    }
}
