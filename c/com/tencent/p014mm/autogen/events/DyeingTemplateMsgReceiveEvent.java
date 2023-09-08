package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.DyeingTemplateMsgReceiveEvent */
public final class DyeingTemplateMsgReceiveEvent extends IEvent {

    /* renamed from: d */
    public C55116a f154743d = new C55116a();

    /* renamed from: com.tencent.mm.autogen.events.DyeingTemplateMsgReceiveEvent$a */
    public static final class C55116a {

        /* renamed from: a */
        public String f154744a;

        /* renamed from: b */
        public int f154745b;

        /* renamed from: c */
        public String f154746c;
    }

    public DyeingTemplateMsgReceiveEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof DyeingTemplateMsgReceiveEvent)) {
            return false;
        }
        C55116a aVar = ((DyeingTemplateMsgReceiveEvent) iEvent).f154743d;
        if (!C46238a.m51546a(this.f154743d.f154744a, aVar.f154744a)) {
            return false;
        }
        this.f154743d.getClass();
        return C46238a.m51546a((Object) null, (Object) null) && C46238a.m51546a(Integer.valueOf(this.f154743d.f154745b), Integer.valueOf(aVar.f154745b)) && C46238a.m51546a(this.f154743d.f154746c, aVar.f154746c);
    }
}
