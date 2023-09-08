package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.UpdateWxaOptionsEvent */
public final class UpdateWxaOptionsEvent extends IEvent {

    /* renamed from: d */
    public C67810a f193994d = new C67810a();

    /* renamed from: e */
    public C67811b f193995e = new C67811b();

    /* renamed from: com.tencent.mm.autogen.events.UpdateWxaOptionsEvent$a */
    public static final class C67810a {

        /* renamed from: a */
        public String f193996a;

        /* renamed from: b */
        public int f193997b;

        /* renamed from: c */
        public int f193998c;
    }

    /* renamed from: com.tencent.mm.autogen.events.UpdateWxaOptionsEvent$b */
    public static final class C67811b {

        /* renamed from: a */
        public boolean f193999a;
    }

    public UpdateWxaOptionsEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof UpdateWxaOptionsEvent)) {
            return false;
        }
        UpdateWxaOptionsEvent updateWxaOptionsEvent = (UpdateWxaOptionsEvent) iEvent;
        C67810a aVar = updateWxaOptionsEvent.f193994d;
        if (!C46238a.m51546a(this.f193994d.f193996a, aVar.f193996a) || !C46238a.m51546a(Integer.valueOf(this.f193994d.f193997b), Integer.valueOf(aVar.f193997b)) || !C46238a.m51546a(Integer.valueOf(this.f193994d.f193998c), Integer.valueOf(aVar.f193998c))) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f193995e.f193999a), Boolean.valueOf(updateWxaOptionsEvent.f193995e.f193999a));
    }
}
