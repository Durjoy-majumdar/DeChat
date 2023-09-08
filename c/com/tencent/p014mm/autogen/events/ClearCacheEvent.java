package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ClearCacheEvent */
public final class ClearCacheEvent extends IEvent {

    /* renamed from: d */
    public C114671a f343545d = new C114671a();

    /* renamed from: com.tencent.mm.autogen.events.ClearCacheEvent$a */
    public static final class C114671a {

        /* renamed from: a */
        public long f343546a;
    }

    public ClearCacheEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ClearCacheEvent)) {
            return false;
        }
        return C46238a.m51546a(Long.valueOf(this.f343545d.f343546a), Long.valueOf(((ClearCacheEvent) iEvent).f343545d.f343546a));
    }
}
