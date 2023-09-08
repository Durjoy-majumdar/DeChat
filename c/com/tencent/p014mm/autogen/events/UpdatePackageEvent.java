package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;
import java.util.List;
import te3.C52089y93;

/* renamed from: com.tencent.mm.autogen.events.UpdatePackageEvent */
public final class UpdatePackageEvent extends IEvent {

    /* renamed from: d */
    public C28845a f79038d = new C28845a();

    /* renamed from: com.tencent.mm.autogen.events.UpdatePackageEvent$a */
    public static final class C28845a {

        /* renamed from: a */
        public int f79039a = -1;

        /* renamed from: b */
        public List<C52089y93> f79040b;
    }

    public UpdatePackageEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof UpdatePackageEvent)) {
            return false;
        }
        C28845a aVar = ((UpdatePackageEvent) iEvent).f79038d;
        return C46238a.m51546a(Integer.valueOf(this.f79038d.f79039a), Integer.valueOf(aVar.f79039a)) && C46238a.m51546a(this.f79038d.f79040b, aVar.f79040b);
    }
}
