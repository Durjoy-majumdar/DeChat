package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;
import te3.jh4;

/* renamed from: com.tencent.mm.autogen.events.TopStoryEvent */
public final class TopStoryEvent extends IEvent {

    /* renamed from: d */
    public C104596a f310012d = new C104596a();

    /* renamed from: e */
    public C104597b f310013e = new C104597b();

    /* renamed from: com.tencent.mm.autogen.events.TopStoryEvent$a */
    public static final class C104596a {

        /* renamed from: a */
        public int f310014a;
    }

    /* renamed from: com.tencent.mm.autogen.events.TopStoryEvent$b */
    public static final class C104597b {

        /* renamed from: a */
        public boolean f310015a;

        /* renamed from: b */
        public jh4 f310016b;
    }

    public TopStoryEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof TopStoryEvent)) {
            return false;
        }
        TopStoryEvent topStoryEvent = (TopStoryEvent) iEvent;
        if (!C46238a.m51546a(Integer.valueOf(this.f310012d.f310014a), Integer.valueOf(topStoryEvent.f310012d.f310014a))) {
            return false;
        }
        C104597b bVar = topStoryEvent.f310013e;
        return C46238a.m51546a(Boolean.valueOf(this.f310013e.f310015a), Boolean.valueOf(bVar.f310015a)) && C46238a.m51546a(this.f310013e.f310016b, bVar.f310016b);
    }
}
