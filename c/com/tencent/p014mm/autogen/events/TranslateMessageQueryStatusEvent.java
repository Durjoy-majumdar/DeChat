package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.TranslateMessageQueryStatusEvent */
public final class TranslateMessageQueryStatusEvent extends IEvent {

    /* renamed from: d */
    public C67801a f193967d = new C67801a();

    /* renamed from: e */
    public C67802b f193968e = new C67802b();

    /* renamed from: com.tencent.mm.autogen.events.TranslateMessageQueryStatusEvent$a */
    public static final class C67801a {

        /* renamed from: a */
        public String f193969a;
    }

    /* renamed from: com.tencent.mm.autogen.events.TranslateMessageQueryStatusEvent$b */
    public static final class C67802b {

        /* renamed from: a */
        public boolean f193970a;
    }

    public TranslateMessageQueryStatusEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof TranslateMessageQueryStatusEvent)) {
            return false;
        }
        TranslateMessageQueryStatusEvent translateMessageQueryStatusEvent = (TranslateMessageQueryStatusEvent) iEvent;
        if (!C46238a.m51546a(this.f193967d.f193969a, translateMessageQueryStatusEvent.f193967d.f193969a)) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f193968e.f193970a), Boolean.valueOf(translateMessageQueryStatusEvent.f193968e.f193970a));
    }
}
