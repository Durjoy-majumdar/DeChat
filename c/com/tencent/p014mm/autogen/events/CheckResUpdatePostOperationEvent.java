package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.CheckResUpdatePostOperationEvent */
public final class CheckResUpdatePostOperationEvent extends IEvent {

    /* renamed from: d */
    public C114670a f343540d = new C114670a();

    /* renamed from: com.tencent.mm.autogen.events.CheckResUpdatePostOperationEvent$a */
    public static final class C114670a {

        /* renamed from: a */
        public int f343541a;

        /* renamed from: b */
        public int f343542b;

        /* renamed from: c */
        public int f343543c = -1;

        /* renamed from: d */
        public boolean f343544d;
    }

    public CheckResUpdatePostOperationEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof CheckResUpdatePostOperationEvent)) {
            return false;
        }
        C114670a aVar = ((CheckResUpdatePostOperationEvent) iEvent).f343540d;
        if (!C46238a.m51546a(Integer.valueOf(this.f343540d.f343541a), Integer.valueOf(aVar.f343541a)) || !C46238a.m51546a(Integer.valueOf(this.f343540d.f343542b), Integer.valueOf(aVar.f343542b)) || !C46238a.m51546a(Integer.valueOf(this.f343540d.f343543c), Integer.valueOf(aVar.f343543c))) {
            return false;
        }
        this.f343540d.getClass();
        Boolean bool = Boolean.FALSE;
        return C46238a.m51546a(bool, bool) && C46238a.m51546a(Boolean.valueOf(this.f343540d.f343544d), Boolean.valueOf(aVar.f343544d));
    }
}
