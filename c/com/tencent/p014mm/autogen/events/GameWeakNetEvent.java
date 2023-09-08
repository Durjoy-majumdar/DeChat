package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.GameWeakNetEvent */
public final class GameWeakNetEvent extends IEvent {

    /* renamed from: d */
    public C40112a f107570d = new C40112a();

    /* renamed from: com.tencent.mm.autogen.events.GameWeakNetEvent$a */
    public static final class C40112a {

        /* renamed from: a */
        public boolean f107571a;

        /* renamed from: b */
        public int f107572b;
    }

    public GameWeakNetEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof GameWeakNetEvent)) {
            return false;
        }
        C40112a aVar = ((GameWeakNetEvent) iEvent).f107570d;
        return C46238a.m51546a(Boolean.valueOf(this.f107570d.f107571a), Boolean.valueOf(aVar.f107571a)) && C46238a.m51546a(Integer.valueOf(this.f107570d.f107572b), Integer.valueOf(aVar.f107572b));
    }
}
