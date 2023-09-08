package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.TabRedDotChangeEvent */
public final class TabRedDotChangeEvent extends IEvent {

    /* renamed from: d */
    public C28839a f79024d = new C28839a();

    /* renamed from: com.tencent.mm.autogen.events.TabRedDotChangeEvent$a */
    public static final class C28839a {

        /* renamed from: a */
        public int f79025a;

        /* renamed from: b */
        public boolean f79026b;

        /* renamed from: c */
        public int f79027c;

        /* renamed from: d */
        public boolean f79028d;

        /* renamed from: e */
        public int f79029e;
    }

    public TabRedDotChangeEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof TabRedDotChangeEvent)) {
            return false;
        }
        C28839a aVar = ((TabRedDotChangeEvent) iEvent).f79024d;
        return C46238a.m51546a(Integer.valueOf(this.f79024d.f79025a), Integer.valueOf(aVar.f79025a)) && C46238a.m51546a(Boolean.valueOf(this.f79024d.f79026b), Boolean.valueOf(aVar.f79026b)) && C46238a.m51546a(Integer.valueOf(this.f79024d.f79027c), Integer.valueOf(aVar.f79027c)) && C46238a.m51546a(Boolean.valueOf(this.f79024d.f79028d), Boolean.valueOf(aVar.f79028d)) && C46238a.m51546a(Integer.valueOf(this.f79024d.f79029e), Integer.valueOf(aVar.f79029e));
    }
}
