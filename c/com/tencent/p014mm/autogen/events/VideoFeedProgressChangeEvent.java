package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.VideoFeedProgressChangeEvent */
public final class VideoFeedProgressChangeEvent extends IEvent {

    /* renamed from: d */
    public C55175a f154897d = new C55175a();

    /* renamed from: com.tencent.mm.autogen.events.VideoFeedProgressChangeEvent$a */
    public static final class C55175a {

        /* renamed from: a */
        public String f154898a;

        /* renamed from: b */
        public long f154899b;

        /* renamed from: c */
        public long f154900c;

        /* renamed from: d */
        public long f154901d;

        /* renamed from: e */
        public int f154902e;
    }

    public VideoFeedProgressChangeEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof VideoFeedProgressChangeEvent)) {
            return false;
        }
        C55175a aVar = ((VideoFeedProgressChangeEvent) iEvent).f154897d;
        return C46238a.m51546a(this.f154897d.f154898a, aVar.f154898a) && C46238a.m51546a(Long.valueOf(this.f154897d.f154899b), Long.valueOf(aVar.f154899b)) && C46238a.m51546a(Long.valueOf(this.f154897d.f154900c), Long.valueOf(aVar.f154900c)) && C46238a.m51546a(Long.valueOf(this.f154897d.f154901d), Long.valueOf(aVar.f154901d)) && C46238a.m51546a(Integer.valueOf(this.f154897d.f154902e), Integer.valueOf(aVar.f154902e));
    }
}
