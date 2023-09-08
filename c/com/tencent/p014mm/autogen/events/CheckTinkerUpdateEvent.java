package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.CheckTinkerUpdateEvent */
public final class CheckTinkerUpdateEvent extends IEvent {

    /* renamed from: d */
    public C28722a f78755d = new C28722a();

    /* renamed from: com.tencent.mm.autogen.events.CheckTinkerUpdateEvent$a */
    public static final class C28722a {

        /* renamed from: a */
        public Boolean f78756a;

        /* renamed from: b */
        public Boolean f78757b;

        public C28722a() {
            Boolean bool = Boolean.FALSE;
            this.f78756a = bool;
            this.f78757b = bool;
        }
    }

    public CheckTinkerUpdateEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof CheckTinkerUpdateEvent)) {
            return false;
        }
        C28722a aVar = ((CheckTinkerUpdateEvent) iEvent).f78755d;
        this.f78755d.getClass();
        aVar.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        this.f78755d.getClass();
        if (!C46238a.m51546a(0, 0)) {
            return false;
        }
        this.f78755d.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        this.f78755d.getClass();
        return C46238a.m51546a((Object) null, (Object) null) && C46238a.m51546a(this.f78755d.f78756a, aVar.f78756a) && C46238a.m51546a(this.f78755d.f78757b, aVar.f78757b);
    }
}
