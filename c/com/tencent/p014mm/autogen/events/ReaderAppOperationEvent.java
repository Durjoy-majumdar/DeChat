package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ReaderAppOperationEvent */
public final class ReaderAppOperationEvent extends IEvent {

    /* renamed from: d */
    public C67767a f193863d = new C67767a();

    /* renamed from: e */
    public C67768b f193864e = new C67768b();

    /* renamed from: com.tencent.mm.autogen.events.ReaderAppOperationEvent$a */
    public static final class C67767a {

        /* renamed from: a */
        public int f193865a = 1;

        /* renamed from: b */
        public DoFavoriteEvent f193866b;

        /* renamed from: c */
        public int f193867c = -1;

        /* renamed from: d */
        public String f193868d;

        /* renamed from: e */
        public int f193869e = 0;
    }

    /* renamed from: com.tencent.mm.autogen.events.ReaderAppOperationEvent$b */
    public static final class C67768b {

        /* renamed from: a */
        public boolean f193870a;
    }

    public ReaderAppOperationEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ReaderAppOperationEvent)) {
            return false;
        }
        ReaderAppOperationEvent readerAppOperationEvent = (ReaderAppOperationEvent) iEvent;
        C67767a aVar = readerAppOperationEvent.f193863d;
        if (!C46238a.m51546a(Integer.valueOf(this.f193863d.f193865a), Integer.valueOf(aVar.f193865a)) || !C46238a.m51546a(this.f193863d.f193866b, aVar.f193866b) || !C46238a.m51546a(Integer.valueOf(this.f193863d.f193867c), Integer.valueOf(aVar.f193867c)) || !C46238a.m51546a(this.f193863d.f193868d, aVar.f193868d) || !C46238a.m51546a(Integer.valueOf(this.f193863d.f193869e), Integer.valueOf(aVar.f193869e))) {
            return false;
        }
        if (!C46238a.m51546a(Boolean.valueOf(this.f193864e.f193870a), Boolean.valueOf(readerAppOperationEvent.f193864e.f193870a))) {
            return false;
        }
        this.f193864e.getClass();
        return C46238a.m51546a((Object) null, (Object) null);
    }
}
