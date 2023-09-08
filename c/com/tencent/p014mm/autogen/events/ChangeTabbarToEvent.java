package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ChangeTabbarToEvent */
public final class ChangeTabbarToEvent extends IEvent {

    /* renamed from: d */
    public C40048a f107395d = new C40048a();

    /* renamed from: com.tencent.mm.autogen.events.ChangeTabbarToEvent$a */
    public static final class C40048a {

        /* renamed from: a */
        public int f107396a;
    }

    public ChangeTabbarToEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ChangeTabbarToEvent)) {
            return false;
        }
        return C46238a.m51546a(Integer.valueOf(this.f107395d.f107396a), Integer.valueOf(((ChangeTabbarToEvent) iEvent).f107395d.f107396a));
    }
}
