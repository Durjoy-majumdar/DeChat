package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ExtRecordEvent */
public final class ExtRecordEvent extends IEvent {

    /* renamed from: d */
    public C67682a f193555d = new C67682a();

    /* renamed from: e */
    public C67683b f193556e = new C67683b();

    /* renamed from: com.tencent.mm.autogen.events.ExtRecordEvent$a */
    public static final class C67682a {

        /* renamed from: a */
        public int f193557a;

        /* renamed from: b */
        public String f193558b;
    }

    /* renamed from: com.tencent.mm.autogen.events.ExtRecordEvent$b */
    public static final class C67683b {

        /* renamed from: a */
        public boolean f193559a = false;

        /* renamed from: b */
        public String f193560b;
    }

    public ExtRecordEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExtRecordEvent)) {
            return false;
        }
        ExtRecordEvent extRecordEvent = (ExtRecordEvent) iEvent;
        C67682a aVar = extRecordEvent.f193555d;
        if (!C46238a.m51546a(Integer.valueOf(this.f193555d.f193557a), Integer.valueOf(aVar.f193557a)) || !C46238a.m51546a(this.f193555d.f193558b, aVar.f193558b)) {
            return false;
        }
        C67683b bVar = extRecordEvent.f193556e;
        return C46238a.m51546a(Boolean.valueOf(this.f193556e.f193559a), Boolean.valueOf(bVar.f193559a)) && C46238a.m51546a(this.f193556e.f193560b, bVar.f193560b);
    }
}
