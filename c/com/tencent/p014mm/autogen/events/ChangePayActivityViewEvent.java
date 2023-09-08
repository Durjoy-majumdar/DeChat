package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ChangePayActivityViewEvent */
public final class ChangePayActivityViewEvent extends IEvent {

    /* renamed from: d */
    public C0996a f9034d = new C0996a();

    /* renamed from: e */
    public C0997b f9035e = new C0997b();

    /* renamed from: com.tencent.mm.autogen.events.ChangePayActivityViewEvent$a */
    public static final class C0996a {

        /* renamed from: a */
        public String f9036a;

        /* renamed from: b */
        public boolean f9037b;

        /* renamed from: c */
        public boolean f9038c;

        /* renamed from: d */
        public boolean f9039d;
    }

    /* renamed from: com.tencent.mm.autogen.events.ChangePayActivityViewEvent$b */
    public static final class C0997b {

        /* renamed from: a */
        public boolean f9040a;
    }

    public ChangePayActivityViewEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ChangePayActivityViewEvent)) {
            return false;
        }
        ChangePayActivityViewEvent changePayActivityViewEvent = (ChangePayActivityViewEvent) iEvent;
        C0996a aVar = changePayActivityViewEvent.f9034d;
        if (!C46238a.m51546a(this.f9034d.f9036a, aVar.f9036a) || !C46238a.m51546a(Boolean.valueOf(this.f9034d.f9037b), Boolean.valueOf(aVar.f9037b)) || !C46238a.m51546a(Boolean.valueOf(this.f9034d.f9038c), Boolean.valueOf(aVar.f9038c)) || !C46238a.m51546a(Boolean.valueOf(this.f9034d.f9039d), Boolean.valueOf(aVar.f9039d))) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f9035e.f9040a), Boolean.valueOf(changePayActivityViewEvent.f9035e.f9040a));
    }
}
