package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FinderVideoCtrlEvent */
public final class FinderVideoCtrlEvent extends IEvent {

    /* renamed from: d */
    public C55136a f154814d = new C55136a();

    /* renamed from: com.tencent.mm.autogen.events.FinderVideoCtrlEvent$a */
    public static final class C55136a {

        /* renamed from: a */
        public boolean f154815a;
    }

    public FinderVideoCtrlEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FinderVideoCtrlEvent)) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f154814d.f154815a), Boolean.valueOf(((FinderVideoCtrlEvent) iEvent).f154814d.f154815a));
    }
}
