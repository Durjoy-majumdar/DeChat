package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FlutterIsInitializedEvent */
public final class FlutterIsInitializedEvent extends IEvent {

    /* renamed from: d */
    public C114676a f343560d = new C114676a();

    /* renamed from: com.tencent.mm.autogen.events.FlutterIsInitializedEvent$a */
    public static final class C114676a {

        /* renamed from: a */
        public boolean f343561a = false;
    }

    public FlutterIsInitializedEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FlutterIsInitializedEvent)) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f343560d.f343561a), Boolean.valueOf(((FlutterIsInitializedEvent) iEvent).f343560d.f343561a));
    }
}
