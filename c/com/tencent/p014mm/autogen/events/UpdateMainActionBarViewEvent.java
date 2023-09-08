package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.UpdateMainActionBarViewEvent */
public final class UpdateMainActionBarViewEvent extends IEvent {

    /* renamed from: d */
    public C67809a f193990d = new C67809a();

    /* renamed from: com.tencent.mm.autogen.events.UpdateMainActionBarViewEvent$a */
    public static final class C67809a {

        /* renamed from: a */
        public int f193991a;

        /* renamed from: b */
        public String f193992b;

        /* renamed from: c */
        public boolean f193993c = false;
    }

    public UpdateMainActionBarViewEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof UpdateMainActionBarViewEvent)) {
            return false;
        }
        C67809a aVar = ((UpdateMainActionBarViewEvent) iEvent).f193990d;
        if (!C46238a.m51546a(Integer.valueOf(this.f193990d.f193991a), Integer.valueOf(aVar.f193991a)) || !C46238a.m51546a(this.f193990d.f193992b, aVar.f193992b) || !C46238a.m51546a(Boolean.valueOf(this.f193990d.f193993c), Boolean.valueOf(aVar.f193993c))) {
            return false;
        }
        this.f193990d.getClass();
        Boolean bool = Boolean.FALSE;
        return C46238a.m51546a(bool, bool);
    }
}
