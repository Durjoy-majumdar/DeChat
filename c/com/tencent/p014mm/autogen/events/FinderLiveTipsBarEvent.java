package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;
import te3.C64623p81;

/* renamed from: com.tencent.mm.autogen.events.FinderLiveTipsBarEvent */
public final class FinderLiveTipsBarEvent extends IEvent {

    /* renamed from: d */
    public C28745a f78795d = new C28745a();

    /* renamed from: com.tencent.mm.autogen.events.FinderLiveTipsBarEvent$a */
    public static final class C28745a {

        /* renamed from: a */
        public int f78796a;

        /* renamed from: b */
        public String f78797b;

        /* renamed from: c */
        public C64623p81 f78798c;

        /* renamed from: d */
        public String f78799d;
    }

    public FinderLiveTipsBarEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FinderLiveTipsBarEvent)) {
            return false;
        }
        C28745a aVar = ((FinderLiveTipsBarEvent) iEvent).f78795d;
        return C46238a.m51546a(Integer.valueOf(this.f78795d.f78796a), Integer.valueOf(aVar.f78796a)) && C46238a.m51546a(this.f78795d.f78797b, aVar.f78797b) && C46238a.m51546a(this.f78795d.f78798c, aVar.f78798c) && C46238a.m51546a(this.f78795d.f78799d, aVar.f78799d);
    }
}
