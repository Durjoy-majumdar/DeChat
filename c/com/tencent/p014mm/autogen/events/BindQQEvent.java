package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.BindQQEvent */
public final class BindQQEvent extends IEvent {

    /* renamed from: d */
    public C28711a f78728d = new C28711a();

    /* renamed from: e */
    public C28712b f78729e = new C28712b();

    /* renamed from: com.tencent.mm.autogen.events.BindQQEvent$a */
    public static final class C28711a {
    }

    /* renamed from: com.tencent.mm.autogen.events.BindQQEvent$b */
    public static final class C28712b {
    }

    public BindQQEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof BindQQEvent)) {
            return false;
        }
        BindQQEvent bindQQEvent = (BindQQEvent) iEvent;
        C28711a aVar = bindQQEvent.f78728d;
        this.f78728d.getClass();
        aVar.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        this.f78728d.getClass();
        if (!C46238a.m51546a(0, 0)) {
            return false;
        }
        C28712b bVar = bindQQEvent.f78729e;
        this.f78729e.getClass();
        bVar.getClass();
        return C46238a.m51546a(0, 0);
    }
}
