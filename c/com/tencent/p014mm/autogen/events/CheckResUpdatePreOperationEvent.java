package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.CheckResUpdatePreOperationEvent */
public final class CheckResUpdatePreOperationEvent extends IEvent {

    /* renamed from: d */
    public C28721a f78750d = new C28721a();

    /* renamed from: com.tencent.mm.autogen.events.CheckResUpdatePreOperationEvent$a */
    public static final class C28721a {

        /* renamed from: a */
        public int f78751a;

        /* renamed from: b */
        public int f78752b;

        /* renamed from: c */
        public int f78753c = -1;

        /* renamed from: d */
        public boolean f78754d;
    }

    public CheckResUpdatePreOperationEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof CheckResUpdatePreOperationEvent)) {
            return false;
        }
        C28721a aVar = ((CheckResUpdatePreOperationEvent) iEvent).f78750d;
        return C46238a.m51546a(Integer.valueOf(this.f78750d.f78751a), Integer.valueOf(aVar.f78751a)) && C46238a.m51546a(Integer.valueOf(this.f78750d.f78752b), Integer.valueOf(aVar.f78752b)) && C46238a.m51546a(Integer.valueOf(this.f78750d.f78753c), Integer.valueOf(aVar.f78753c)) && C46238a.m51546a(Boolean.valueOf(this.f78750d.f78754d), Boolean.valueOf(aVar.f78754d));
    }
}
