package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.GameWatchReportEvent */
public final class GameWatchReportEvent extends IEvent {

    /* renamed from: d */
    public C1078a f9289d = new C1078a();

    /* renamed from: com.tencent.mm.autogen.events.GameWatchReportEvent$a */
    public static final class C1078a {

        /* renamed from: a */
        public String f9290a;

        /* renamed from: b */
        public int f9291b;

        /* renamed from: c */
        public int f9292c;

        /* renamed from: d */
        public String f9293d;
    }

    public GameWatchReportEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof GameWatchReportEvent)) {
            return false;
        }
        C1078a aVar = ((GameWatchReportEvent) iEvent).f9289d;
        if (!C46238a.m51546a(this.f9289d.f9290a, aVar.f9290a) || !C46238a.m51546a(Integer.valueOf(this.f9289d.f9291b), Integer.valueOf(aVar.f9291b)) || !C46238a.m51546a(Integer.valueOf(this.f9289d.f9292c), Integer.valueOf(aVar.f9292c))) {
            return false;
        }
        this.f9289d.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null) || !C46238a.m51546a(this.f9289d.f9293d, aVar.f9293d)) {
            return false;
        }
        this.f9289d.getClass();
        if (!C46238a.m51546a(0, 0)) {
            return false;
        }
        this.f9289d.getClass();
        if (!C46238a.m51546a(0L, 0L)) {
            return false;
        }
        this.f9289d.getClass();
        return C46238a.m51546a((Object) null, (Object) null);
    }
}
