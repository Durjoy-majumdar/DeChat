package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;
import te3.C49417ff1;

/* renamed from: com.tencent.mm.autogen.events.FinderExposeInfoChangeEvent */
public final class FinderExposeInfoChangeEvent extends IEvent {

    /* renamed from: d */
    public C55124a f154769d = new C55124a();

    /* renamed from: com.tencent.mm.autogen.events.FinderExposeInfoChangeEvent$a */
    public static final class C55124a {

        /* renamed from: a */
        public long f154770a;

        /* renamed from: b */
        public C49417ff1 f154771b;

        /* renamed from: c */
        public int f154772c = -1;
    }

    public FinderExposeInfoChangeEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FinderExposeInfoChangeEvent)) {
            return false;
        }
        C55124a aVar = ((FinderExposeInfoChangeEvent) iEvent).f154769d;
        if (!C46238a.m51546a(Long.valueOf(this.f154769d.f154770a), Long.valueOf(aVar.f154770a)) || !C46238a.m51546a(this.f154769d.f154771b, aVar.f154771b) || !C46238a.m51546a(Integer.valueOf(this.f154769d.f154772c), Integer.valueOf(aVar.f154772c))) {
            return false;
        }
        this.f154769d.getClass();
        if (!C46238a.m51546a(0L, 0L)) {
            return false;
        }
        this.f154769d.getClass();
        if (!C46238a.m51546a(0L, 0L)) {
            return false;
        }
        this.f154769d.getClass();
        if (!C46238a.m51546a(-1, -1)) {
            return false;
        }
        this.f154769d.getClass();
        return C46238a.m51546a(-1, -1);
    }
}
