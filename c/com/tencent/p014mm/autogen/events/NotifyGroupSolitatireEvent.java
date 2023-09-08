package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.NotifyGroupSolitatireEvent */
public final class NotifyGroupSolitatireEvent extends IEvent {

    /* renamed from: d */
    public C67738a f193754d = new C67738a();

    /* renamed from: e */
    public C67739b f193755e = new C67739b();

    /* renamed from: com.tencent.mm.autogen.events.NotifyGroupSolitatireEvent$a */
    public static final class C67738a {

        /* renamed from: a */
        public int f193756a = 0;

        /* renamed from: b */
        public String f193757b;

        /* renamed from: c */
        public String f193758c;

        /* renamed from: d */
        public boolean f193759d = false;
    }

    /* renamed from: com.tencent.mm.autogen.events.NotifyGroupSolitatireEvent$b */
    public static final class C67739b {

        /* renamed from: a */
        public long f193760a;

        /* renamed from: b */
        public long f193761b;
    }

    public NotifyGroupSolitatireEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof NotifyGroupSolitatireEvent)) {
            return false;
        }
        NotifyGroupSolitatireEvent notifyGroupSolitatireEvent = (NotifyGroupSolitatireEvent) iEvent;
        C67738a aVar = notifyGroupSolitatireEvent.f193754d;
        if (!C46238a.m51546a(Integer.valueOf(this.f193754d.f193756a), Integer.valueOf(aVar.f193756a)) || !C46238a.m51546a(this.f193754d.f193757b, aVar.f193757b) || !C46238a.m51546a(this.f193754d.f193758c, aVar.f193758c) || !C46238a.m51546a(Boolean.valueOf(this.f193754d.f193759d), Boolean.valueOf(aVar.f193759d))) {
            return false;
        }
        C67739b bVar = notifyGroupSolitatireEvent.f193755e;
        return C46238a.m51546a(Long.valueOf(this.f193755e.f193760a), Long.valueOf(bVar.f193760a)) && C46238a.m51546a(Long.valueOf(this.f193755e.f193761b), Long.valueOf(bVar.f193761b));
    }
}
