package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SilenceNotifyEvent */
public final class SilenceNotifyEvent extends IEvent {

    /* renamed from: d */
    public C67790a f193936d = new C67790a();

    /* renamed from: com.tencent.mm.autogen.events.SilenceNotifyEvent$a */
    public static final class C67790a {

        /* renamed from: a */
        public byte[] f193937a;
    }

    public SilenceNotifyEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SilenceNotifyEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f193936d.f193937a, ((SilenceNotifyEvent) iEvent).f193936d.f193937a);
    }
}
