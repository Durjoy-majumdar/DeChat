package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SnsPostFailEvent */
public final class SnsPostFailEvent extends IEvent {

    /* renamed from: d */
    public C28829a f78997d = new C28829a();

    /* renamed from: com.tencent.mm.autogen.events.SnsPostFailEvent$a */
    public static final class C28829a {

        /* renamed from: a */
        public long f78998a = -1;
    }

    public SnsPostFailEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SnsPostFailEvent)) {
            return false;
        }
        return C46238a.m51546a(Long.valueOf(this.f78997d.f78998a), Long.valueOf(((SnsPostFailEvent) iEvent).f78997d.f78998a));
    }
}
