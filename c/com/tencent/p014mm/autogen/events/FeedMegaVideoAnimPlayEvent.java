package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FeedMegaVideoAnimPlayEvent */
public final class FeedMegaVideoAnimPlayEvent extends IEvent {

    /* renamed from: d */
    public C1038a f9160d = new C1038a();

    /* renamed from: com.tencent.mm.autogen.events.FeedMegaVideoAnimPlayEvent$a */
    public static final class C1038a {

        /* renamed from: a */
        public long f9161a;

        /* renamed from: b */
        public boolean f9162b;

        /* renamed from: c */
        public boolean f9163c;

        /* renamed from: d */
        public boolean f9164d;

        /* renamed from: e */
        public int f9165e;

        /* renamed from: f */
        public boolean f9166f;
    }

    public FeedMegaVideoAnimPlayEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FeedMegaVideoAnimPlayEvent)) {
            return false;
        }
        C1038a aVar = ((FeedMegaVideoAnimPlayEvent) iEvent).f9160d;
        return C46238a.m51546a(Long.valueOf(this.f9160d.f9161a), Long.valueOf(aVar.f9161a)) && C46238a.m51546a(Boolean.valueOf(this.f9160d.f9162b), Boolean.valueOf(aVar.f9162b)) && C46238a.m51546a(Boolean.valueOf(this.f9160d.f9163c), Boolean.valueOf(aVar.f9163c)) && C46238a.m51546a(Boolean.valueOf(this.f9160d.f9164d), Boolean.valueOf(aVar.f9164d)) && C46238a.m51546a(Integer.valueOf(this.f9160d.f9165e), Integer.valueOf(aVar.f9165e)) && C46238a.m51546a(Boolean.valueOf(this.f9160d.f9166f), Boolean.valueOf(aVar.f9166f));
    }
}
