package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SetEntranceMsgExposureEvent */
public final class SetEntranceMsgExposureEvent extends IEvent {

    /* renamed from: d */
    public C40165a f107753d = new C40165a();

    /* renamed from: com.tencent.mm.autogen.events.SetEntranceMsgExposureEvent$a */
    public static final class C40165a {

        /* renamed from: a */
        public long f107754a;

        /* renamed from: b */
        public boolean f107755b;

        /* renamed from: c */
        public int f107756c;

        /* renamed from: d */
        public boolean f107757d;
    }

    public SetEntranceMsgExposureEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SetEntranceMsgExposureEvent)) {
            return false;
        }
        C40165a aVar = ((SetEntranceMsgExposureEvent) iEvent).f107753d;
        return C46238a.m51546a(Long.valueOf(this.f107753d.f107754a), Long.valueOf(aVar.f107754a)) && C46238a.m51546a(Boolean.valueOf(this.f107753d.f107755b), Boolean.valueOf(aVar.f107755b)) && C46238a.m51546a(Integer.valueOf(this.f107753d.f107756c), Integer.valueOf(aVar.f107756c)) && C46238a.m51546a(Boolean.valueOf(this.f107753d.f107757d), Boolean.valueOf(aVar.f107757d));
    }
}
