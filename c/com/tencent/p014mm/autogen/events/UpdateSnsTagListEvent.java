package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;
import java.util.List;
import ob0.C117747y;

/* renamed from: com.tencent.mm.autogen.events.UpdateSnsTagListEvent */
public final class UpdateSnsTagListEvent extends IEvent {

    /* renamed from: d */
    public C40177a f107791d = new C40177a();

    /* renamed from: e */
    public C40178b f107792e = new C40178b();

    /* renamed from: com.tencent.mm.autogen.events.UpdateSnsTagListEvent$a */
    public static final class C40177a {

        /* renamed from: a */
        public C117747y f107793a;
    }

    /* renamed from: com.tencent.mm.autogen.events.UpdateSnsTagListEvent$b */
    public static final class C40178b {

        /* renamed from: a */
        public int f107794a = 0;

        /* renamed from: b */
        public List f107795b;
    }

    public UpdateSnsTagListEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof UpdateSnsTagListEvent)) {
            return false;
        }
        UpdateSnsTagListEvent updateSnsTagListEvent = (UpdateSnsTagListEvent) iEvent;
        if (!C46238a.m51546a(this.f107791d.f107793a, updateSnsTagListEvent.f107791d.f107793a)) {
            return false;
        }
        C40178b bVar = updateSnsTagListEvent.f107792e;
        return C46238a.m51546a(Integer.valueOf(this.f107792e.f107794a), Integer.valueOf(bVar.f107794a)) && C46238a.m51546a(this.f107792e.f107795b, bVar.f107795b);
    }
}
