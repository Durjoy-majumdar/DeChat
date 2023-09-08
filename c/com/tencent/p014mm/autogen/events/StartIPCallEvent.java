package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.StartIPCallEvent */
public final class StartIPCallEvent extends IEvent {

    /* renamed from: d */
    public C28834a f79006d = new C28834a();

    /* renamed from: com.tencent.mm.autogen.events.StartIPCallEvent$a */
    public static final class C28834a {

        /* renamed from: a */
        public String f79007a;

        /* renamed from: b */
        public int f79008b;

        /* renamed from: c */
        public String f79009c;

        /* renamed from: d */
        public String f79010d;
    }

    public StartIPCallEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof StartIPCallEvent)) {
            return false;
        }
        C28834a aVar = ((StartIPCallEvent) iEvent).f79006d;
        return C46238a.m51546a(this.f79006d.f79007a, aVar.f79007a) && C46238a.m51546a(Integer.valueOf(this.f79006d.f79008b), Integer.valueOf(aVar.f79008b)) && C46238a.m51546a(this.f79006d.f79009c, aVar.f79009c) && C46238a.m51546a(this.f79006d.f79010d, aVar.f79010d);
    }
}
