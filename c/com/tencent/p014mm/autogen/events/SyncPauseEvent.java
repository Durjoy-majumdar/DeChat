package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SyncPauseEvent */
public final class SyncPauseEvent extends IEvent {

    /* renamed from: d */
    public C114696a f343624d = new C114696a();

    /* renamed from: com.tencent.mm.autogen.events.SyncPauseEvent$a */
    public static final class C114696a {

        /* renamed from: a */
        public int f343625a = 0;
    }

    public SyncPauseEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SyncPauseEvent)) {
            return false;
        }
        return C46238a.m51546a(Integer.valueOf(this.f343624d.f343625a), Integer.valueOf(((SyncPauseEvent) iEvent).f343624d.f343625a));
    }
}
