package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.BizAdReplaceEvent */
public final class BizAdReplaceEvent extends IEvent {

    /* renamed from: d */
    public C17675a f48082d = new C17675a();

    /* renamed from: com.tencent.mm.autogen.events.BizAdReplaceEvent$a */
    public static final class C17675a {

        /* renamed from: a */
        public int f48083a;
    }

    public BizAdReplaceEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof BizAdReplaceEvent)) {
            return false;
        }
        return C46238a.m51546a(Integer.valueOf(this.f48082d.f48083a), Integer.valueOf(((BizAdReplaceEvent) iEvent).f48082d.f48083a));
    }
}
