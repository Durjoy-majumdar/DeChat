package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.JumpTargetEvent */
public final class JumpTargetEvent extends IEvent {

    /* renamed from: d */
    public C40131a f107621d = new C40131a();

    /* renamed from: com.tencent.mm.autogen.events.JumpTargetEvent$a */
    public static final class C40131a {

        /* renamed from: a */
        public boolean f107622a = false;
    }

    public JumpTargetEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof JumpTargetEvent)) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f107621d.f107622a), Boolean.valueOf(((JumpTargetEvent) iEvent).f107621d.f107622a));
    }
}
