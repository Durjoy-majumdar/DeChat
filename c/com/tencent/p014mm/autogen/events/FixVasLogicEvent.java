package com.tencent.p014mm.autogen.events;

import androidx.fragment.app.Fragment;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FixVasLogicEvent */
public final class FixVasLogicEvent extends IEvent {

    /* renamed from: d */
    public C114675a f343557d = new C114675a();

    /* renamed from: com.tencent.mm.autogen.events.FixVasLogicEvent$a */
    public static final class C114675a {

        /* renamed from: a */
        public Fragment f343558a;

        /* renamed from: b */
        public boolean f343559b = false;
    }

    public FixVasLogicEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FixVasLogicEvent)) {
            return false;
        }
        C114675a aVar = ((FixVasLogicEvent) iEvent).f343557d;
        return C46238a.m51546a(this.f343557d.f343558a, aVar.f343558a) && C46238a.m51546a(Boolean.valueOf(this.f343557d.f343559b), Boolean.valueOf(aVar.f343559b));
    }
}
