package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.AddDownloadTaskEvent */
public final class AddDownloadTaskEvent extends IEvent {

    /* renamed from: d */
    public C0994a f9026d = new C0994a();

    /* renamed from: com.tencent.mm.autogen.events.AddDownloadTaskEvent$a */
    public static final class C0994a {

        /* renamed from: a */
        public int f9027a;

        /* renamed from: b */
        public boolean f9028b = false;

        /* renamed from: c */
        public long f9029c;

        /* renamed from: d */
        public String f9030d;
    }

    public AddDownloadTaskEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof AddDownloadTaskEvent)) {
            return false;
        }
        C0994a aVar = ((AddDownloadTaskEvent) iEvent).f9026d;
        return C46238a.m51546a(Integer.valueOf(this.f9026d.f9027a), Integer.valueOf(aVar.f9027a)) && C46238a.m51546a(Boolean.valueOf(this.f9026d.f9028b), Boolean.valueOf(aVar.f9028b)) && C46238a.m51546a(Long.valueOf(this.f9026d.f9029c), Long.valueOf(aVar.f9029c)) && C46238a.m51546a(this.f9026d.f9030d, aVar.f9030d);
    }
}
