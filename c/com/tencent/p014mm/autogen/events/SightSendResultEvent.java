package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SightSendResultEvent */
public final class SightSendResultEvent extends IEvent {

    /* renamed from: d */
    public C92563a f265103d = new C92563a();

    /* renamed from: e */
    public C92564b f265104e = new C92564b();

    /* renamed from: com.tencent.mm.autogen.events.SightSendResultEvent$a */
    public static final class C92563a {

        /* renamed from: a */
        public int f265105a;

        /* renamed from: b */
        public boolean f265106b;

        /* renamed from: c */
        public boolean f265107c = false;
    }

    /* renamed from: com.tencent.mm.autogen.events.SightSendResultEvent$b */
    public static final class C92564b {
    }

    public SightSendResultEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SightSendResultEvent)) {
            return false;
        }
        SightSendResultEvent sightSendResultEvent = (SightSendResultEvent) iEvent;
        C92563a aVar = sightSendResultEvent.f265103d;
        if (!C46238a.m51546a(Integer.valueOf(this.f265103d.f265105a), Integer.valueOf(aVar.f265105a)) || !C46238a.m51546a(Boolean.valueOf(this.f265103d.f265106b), Boolean.valueOf(aVar.f265106b))) {
            return false;
        }
        this.f265103d.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        this.f265103d.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null) || !C46238a.m51546a(Boolean.valueOf(this.f265103d.f265107c), Boolean.valueOf(aVar.f265107c))) {
            return false;
        }
        C92564b bVar = sightSendResultEvent.f265104e;
        this.f265104e.getClass();
        bVar.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        this.f265104e.getClass();
        return C46238a.m51546a((Object) null, (Object) null);
    }
}
