package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.MultiTalkActionEvent */
public final class MultiTalkActionEvent extends IEvent {

    /* renamed from: d */
    public C40135a f154837d = new C40135a();

    /* renamed from: e */
    public C55145b f154838e = new C55145b();

    /* renamed from: com.tencent.mm.autogen.events.MultiTalkActionEvent$a */
    public static final class C40135a {

        /* renamed from: a */
        public int f107635a;
    }

    /* renamed from: com.tencent.mm.autogen.events.MultiTalkActionEvent$b */
    public static final class C55145b {

        /* renamed from: a */
        public boolean f154839a;
    }

    public MultiTalkActionEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof MultiTalkActionEvent)) {
            return false;
        }
        MultiTalkActionEvent multiTalkActionEvent = (MultiTalkActionEvent) iEvent;
        if (!C46238a.m51546a(Integer.valueOf(this.f154837d.f107635a), Integer.valueOf(multiTalkActionEvent.f154837d.f107635a))) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f154838e.f154839a), Boolean.valueOf(multiTalkActionEvent.f154838e.f154839a));
    }
}
