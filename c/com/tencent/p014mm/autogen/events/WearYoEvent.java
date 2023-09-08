package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.WearYoEvent */
public final class WearYoEvent extends IEvent {

    /* renamed from: d */
    public C104600a f310022d = new C104600a();

    /* renamed from: e */
    public C104601b f310023e = new C104601b();

    /* renamed from: com.tencent.mm.autogen.events.WearYoEvent$a */
    public static final class C104600a {

        /* renamed from: a */
        public int f310024a;

        /* renamed from: b */
        public String f310025b;
    }

    /* renamed from: com.tencent.mm.autogen.events.WearYoEvent$b */
    public static final class C104601b {

        /* renamed from: a */
        public int f310026a;
    }

    public WearYoEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof WearYoEvent)) {
            return false;
        }
        WearYoEvent wearYoEvent = (WearYoEvent) iEvent;
        C104600a aVar = wearYoEvent.f310022d;
        if (!C46238a.m51546a(Integer.valueOf(this.f310022d.f310024a), Integer.valueOf(aVar.f310024a)) || !C46238a.m51546a(this.f310022d.f310025b, aVar.f310025b)) {
            return false;
        }
        return C46238a.m51546a(Integer.valueOf(this.f310023e.f310026a), Integer.valueOf(wearYoEvent.f310023e.f310026a));
    }
}
