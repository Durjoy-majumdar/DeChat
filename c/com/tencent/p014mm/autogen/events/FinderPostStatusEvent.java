package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;
import te3.C64682rk1;

/* renamed from: com.tencent.mm.autogen.events.FinderPostStatusEvent */
public final class FinderPostStatusEvent extends IEvent {

    /* renamed from: d */
    public C28746a f78800d = new C28746a();

    /* renamed from: com.tencent.mm.autogen.events.FinderPostStatusEvent$a */
    public static final class C28746a {

        /* renamed from: a */
        public long f78801a;

        /* renamed from: b */
        public boolean f78802b;

        /* renamed from: c */
        public C64682rk1 f78803c;
    }

    public FinderPostStatusEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FinderPostStatusEvent)) {
            return false;
        }
        C28746a aVar = ((FinderPostStatusEvent) iEvent).f78800d;
        return C46238a.m51546a(Long.valueOf(this.f78800d.f78801a), Long.valueOf(aVar.f78801a)) && C46238a.m51546a(Boolean.valueOf(this.f78800d.f78802b), Boolean.valueOf(aVar.f78802b)) && C46238a.m51546a(this.f78800d.f78803c, aVar.f78803c);
    }
}
