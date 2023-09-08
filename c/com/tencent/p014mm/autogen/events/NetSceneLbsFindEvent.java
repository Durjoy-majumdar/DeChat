package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.NetSceneLbsFindEvent */
public final class NetSceneLbsFindEvent extends IEvent {

    /* renamed from: d */
    public C28779a f78871d = new C28779a();

    /* renamed from: e */
    public C28780b f78872e = new C28780b();

    /* renamed from: com.tencent.mm.autogen.events.NetSceneLbsFindEvent$a */
    public static final class C28779a {
    }

    /* renamed from: com.tencent.mm.autogen.events.NetSceneLbsFindEvent$b */
    public static final class C28780b {
    }

    public NetSceneLbsFindEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof NetSceneLbsFindEvent)) {
            return false;
        }
        NetSceneLbsFindEvent netSceneLbsFindEvent = (NetSceneLbsFindEvent) iEvent;
        C28779a aVar = netSceneLbsFindEvent.f78871d;
        this.f78871d.getClass();
        aVar.getClass();
        if (!C46238a.m51546a(0, 0)) {
            return false;
        }
        this.f78871d.getClass();
        if (!C46238a.m51546a(Float.valueOf(0.0f), Float.valueOf(0.0f))) {
            return false;
        }
        this.f78871d.getClass();
        if (!C46238a.m51546a(Float.valueOf(0.0f), Float.valueOf(0.0f))) {
            return false;
        }
        this.f78871d.getClass();
        if (!C46238a.m51546a(0, 0)) {
            return false;
        }
        this.f78871d.getClass();
        if (!C46238a.m51546a(0, 0)) {
            return false;
        }
        this.f78871d.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        this.f78871d.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        this.f78871d.getClass();
        Boolean bool = Boolean.FALSE;
        if (!C46238a.m51546a(bool, bool)) {
            return false;
        }
        C28780b bVar = netSceneLbsFindEvent.f78872e;
        this.f78872e.getClass();
        bVar.getClass();
        if (!C46238a.m51546a(0, 0)) {
            return false;
        }
        this.f78872e.getClass();
        if (!C46238a.m51546a(bool, bool)) {
            return false;
        }
        this.f78872e.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        this.f78872e.getClass();
        return C46238a.m51546a(-1, -1);
    }
}
