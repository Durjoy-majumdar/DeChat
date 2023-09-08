package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.HardCoderSystemEvent */
public final class HardCoderSystemEvent extends IEvent {

    /* renamed from: d */
    public C92528a f264901d = new C92528a();

    /* renamed from: com.tencent.mm.autogen.events.HardCoderSystemEvent$a */
    public static final class C92528a {

        /* renamed from: a */
        public int f264902a = -1;
    }

    public HardCoderSystemEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof HardCoderSystemEvent)) {
            return false;
        }
        if (!C46238a.m51546a(Integer.valueOf(this.f264901d.f264902a), Integer.valueOf(((HardCoderSystemEvent) iEvent).f264901d.f264902a))) {
            return false;
        }
        this.f264901d.getClass();
        return C46238a.m51546a((Object) null, (Object) null);
    }
}
