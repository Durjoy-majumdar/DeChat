package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SnsFinishBlockUserEvent */
public final class SnsFinishBlockUserEvent extends IEvent {

    /* renamed from: d */
    public C40167a f107763d = new C40167a();

    /* renamed from: com.tencent.mm.autogen.events.SnsFinishBlockUserEvent$a */
    public static final class C40167a {

        /* renamed from: a */
        public boolean f107764a = false;

        /* renamed from: b */
        public long f107765b = 0;
    }

    public SnsFinishBlockUserEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SnsFinishBlockUserEvent)) {
            return false;
        }
        C40167a aVar = ((SnsFinishBlockUserEvent) iEvent).f107763d;
        return C46238a.m51546a(Boolean.valueOf(this.f107763d.f107764a), Boolean.valueOf(aVar.f107764a)) && C46238a.m51546a(Long.valueOf(this.f107763d.f107765b), Long.valueOf(aVar.f107765b));
    }
}
