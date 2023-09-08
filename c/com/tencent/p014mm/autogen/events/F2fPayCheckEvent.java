package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.F2fPayCheckEvent */
public final class F2fPayCheckEvent extends IEvent {

    /* renamed from: d */
    public C67693a f193594d = new C67693a();

    /* renamed from: com.tencent.mm.autogen.events.F2fPayCheckEvent$a */
    public static final class C67693a {

        /* renamed from: a */
        public String f193595a;

        /* renamed from: b */
        public int f193596b;

        /* renamed from: c */
        public String f193597c;

        /* renamed from: d */
        public boolean f193598d = false;

        /* renamed from: e */
        public int f193599e;

        /* renamed from: f */
        public int f193600f;
    }

    public F2fPayCheckEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof F2fPayCheckEvent)) {
            return false;
        }
        C67693a aVar = ((F2fPayCheckEvent) iEvent).f193594d;
        return C46238a.m51546a(this.f193594d.f193595a, aVar.f193595a) && C46238a.m51546a(Integer.valueOf(this.f193594d.f193596b), Integer.valueOf(aVar.f193596b)) && C46238a.m51546a(this.f193594d.f193597c, aVar.f193597c) && C46238a.m51546a(Boolean.valueOf(this.f193594d.f193598d), Boolean.valueOf(aVar.f193598d)) && C46238a.m51546a(Integer.valueOf(this.f193594d.f193599e), Integer.valueOf(aVar.f193599e)) && C46238a.m51546a(Integer.valueOf(this.f193594d.f193600f), Integer.valueOf(aVar.f193600f));
    }
}
