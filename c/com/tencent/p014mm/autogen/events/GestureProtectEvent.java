package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.GestureProtectEvent */
public final class GestureProtectEvent extends IEvent {

    /* renamed from: d */
    public C24252a f69418d = new C24252a();

    /* renamed from: e */
    public C24253b f69419e = new C24253b();

    /* renamed from: com.tencent.mm.autogen.events.GestureProtectEvent$a */
    public static final class C24252a {
    }

    /* renamed from: com.tencent.mm.autogen.events.GestureProtectEvent$b */
    public static final class C24253b {

        /* renamed from: a */
        public Object f69420a = 0;
    }

    public GestureProtectEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof GestureProtectEvent)) {
            return false;
        }
        GestureProtectEvent gestureProtectEvent = (GestureProtectEvent) iEvent;
        C24252a aVar = gestureProtectEvent.f69418d;
        this.f69418d.getClass();
        aVar.getClass();
        if (!C46238a.m51546a(0, 0)) {
            return false;
        }
        this.f69418d.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        return C46238a.m51546a(this.f69419e.f69420a, gestureProtectEvent.f69419e.f69420a);
    }
}
