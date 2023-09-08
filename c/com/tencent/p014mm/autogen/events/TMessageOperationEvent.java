package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.TMessageOperationEvent */
public final class TMessageOperationEvent extends IEvent {

    /* renamed from: d */
    public C67795a f193948d = new C67795a();

    /* renamed from: e */
    public C67796b f193949e = new C67796b();

    /* renamed from: com.tencent.mm.autogen.events.TMessageOperationEvent$a */
    public static final class C67795a {

        /* renamed from: a */
        public int f193950a = 0;

        /* renamed from: b */
        public String f193951b;

        /* renamed from: c */
        public int f193952c = 0;

        /* renamed from: d */
        public int f193953d = 0;
    }

    /* renamed from: com.tencent.mm.autogen.events.TMessageOperationEvent$b */
    public static final class C67796b {
    }

    public TMessageOperationEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof TMessageOperationEvent)) {
            return false;
        }
        TMessageOperationEvent tMessageOperationEvent = (TMessageOperationEvent) iEvent;
        C67795a aVar = tMessageOperationEvent.f193948d;
        if (!C46238a.m51546a(Integer.valueOf(this.f193948d.f193950a), Integer.valueOf(aVar.f193950a)) || !C46238a.m51546a(this.f193948d.f193951b, aVar.f193951b) || !C46238a.m51546a(Integer.valueOf(this.f193948d.f193952c), Integer.valueOf(aVar.f193952c)) || !C46238a.m51546a(Integer.valueOf(this.f193948d.f193953d), Integer.valueOf(aVar.f193953d))) {
            return false;
        }
        C67796b bVar = tMessageOperationEvent.f193949e;
        this.f193949e.getClass();
        Boolean bool = Boolean.FALSE;
        bVar.getClass();
        return C46238a.m51546a(bool, bool);
    }
}
