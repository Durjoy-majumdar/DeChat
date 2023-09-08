package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FinderTopicEvent */
public final class FinderTopicEvent extends IEvent {

    /* renamed from: d */
    public C1067a f9258d = new C1067a();

    /* renamed from: com.tencent.mm.autogen.events.FinderTopicEvent$a */
    public static final class C1067a {

        /* renamed from: a */
        public int f9259a;

        /* renamed from: b */
        public int f9260b;

        /* renamed from: c */
        public String f9261c;
    }

    public FinderTopicEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FinderTopicEvent)) {
            return false;
        }
        C1067a aVar = ((FinderTopicEvent) iEvent).f9258d;
        if (!C46238a.m51546a(Integer.valueOf(this.f9258d.f9259a), Integer.valueOf(aVar.f9259a)) || !C46238a.m51546a(Integer.valueOf(this.f9258d.f9260b), Integer.valueOf(aVar.f9260b)) || !C46238a.m51546a(this.f9258d.f9261c, aVar.f9261c)) {
            return false;
        }
        this.f9258d.getClass();
        return C46238a.m51546a((Object) null, (Object) null);
    }
}
