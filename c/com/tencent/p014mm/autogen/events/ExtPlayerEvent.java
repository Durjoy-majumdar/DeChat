package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;
import ob0.C76996p;

/* renamed from: com.tencent.mm.autogen.events.ExtPlayerEvent */
public final class ExtPlayerEvent extends IEvent {

    /* renamed from: d */
    public C92500a f264779d = new C92500a();

    /* renamed from: e */
    public C92501b f264780e = new C92501b();

    /* renamed from: com.tencent.mm.autogen.events.ExtPlayerEvent$a */
    public static final class C92500a {

        /* renamed from: a */
        public int f264781a;

        /* renamed from: b */
        public String f264782b;

        /* renamed from: c */
        public boolean f264783c = false;

        /* renamed from: d */
        public boolean f264784d;

        /* renamed from: e */
        public C76996p.C77000a f264785e;

        /* renamed from: f */
        public C76996p.C77001b f264786f;
    }

    /* renamed from: com.tencent.mm.autogen.events.ExtPlayerEvent$b */
    public static final class C92501b {

        /* renamed from: a */
        public boolean f264787a = false;
    }

    public ExtPlayerEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExtPlayerEvent)) {
            return false;
        }
        ExtPlayerEvent extPlayerEvent = (ExtPlayerEvent) iEvent;
        C92500a aVar = extPlayerEvent.f264779d;
        if (!C46238a.m51546a(Integer.valueOf(this.f264779d.f264781a), Integer.valueOf(aVar.f264781a)) || !C46238a.m51546a(this.f264779d.f264782b, aVar.f264782b) || !C46238a.m51546a(Boolean.valueOf(this.f264779d.f264783c), Boolean.valueOf(aVar.f264783c)) || !C46238a.m51546a(Boolean.valueOf(this.f264779d.f264784d), Boolean.valueOf(aVar.f264784d)) || !C46238a.m51546a(this.f264779d.f264785e, aVar.f264785e) || !C46238a.m51546a(this.f264779d.f264786f, aVar.f264786f)) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f264780e.f264787a), Boolean.valueOf(extPlayerEvent.f264780e.f264787a));
    }
}
