package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FinderEnhanceActionEvent */
public final class FinderEnhanceActionEvent extends IEvent {

    /* renamed from: d */
    public C1045a f9193d = new C1045a();

    /* renamed from: com.tencent.mm.autogen.events.FinderEnhanceActionEvent$a */
    public static final class C1045a {

        /* renamed from: a */
        public long f9194a;

        /* renamed from: b */
        public int f9195b;

        /* renamed from: c */
        public long f9196c;

        /* renamed from: d */
        public long f9197d;

        /* renamed from: e */
        public long f9198e;

        /* renamed from: f */
        public int f9199f;
    }

    public FinderEnhanceActionEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FinderEnhanceActionEvent)) {
            return false;
        }
        C1045a aVar = ((FinderEnhanceActionEvent) iEvent).f9193d;
        if (!C46238a.m51546a(Long.valueOf(this.f9193d.f9194a), Long.valueOf(aVar.f9194a)) || !C46238a.m51546a(Integer.valueOf(this.f9193d.f9195b), Integer.valueOf(aVar.f9195b))) {
            return false;
        }
        this.f9193d.getClass();
        return C46238a.m51546a(0, 0) && C46238a.m51546a(Long.valueOf(this.f9193d.f9196c), Long.valueOf(aVar.f9196c)) && C46238a.m51546a(Long.valueOf(this.f9193d.f9197d), Long.valueOf(aVar.f9197d)) && C46238a.m51546a(Long.valueOf(this.f9193d.f9198e), Long.valueOf(aVar.f9198e)) && C46238a.m51546a(Integer.valueOf(this.f9193d.f9199f), Integer.valueOf(aVar.f9199f));
    }
}
