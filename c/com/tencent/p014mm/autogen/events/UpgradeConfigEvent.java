package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.UpgradeConfigEvent */
public final class UpgradeConfigEvent extends IEvent {

    /* renamed from: d */
    public C80743a f236294d = new C80743a();

    /* renamed from: com.tencent.mm.autogen.events.UpgradeConfigEvent$a */
    public static final class C80743a {

        /* renamed from: a */
        public String f236295a;

        /* renamed from: b */
        public int f236296b;

        /* renamed from: c */
        public int f236297c;
    }

    public UpgradeConfigEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof UpgradeConfigEvent)) {
            return false;
        }
        C80743a aVar = ((UpgradeConfigEvent) iEvent).f236294d;
        return C46238a.m51546a(this.f236294d.f236295a, aVar.f236295a) && C46238a.m51546a(Integer.valueOf(this.f236294d.f236296b), Integer.valueOf(aVar.f236296b)) && C46238a.m51546a(Integer.valueOf(this.f236294d.f236297c), Integer.valueOf(aVar.f236297c));
    }
}
