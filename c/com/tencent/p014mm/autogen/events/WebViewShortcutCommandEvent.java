package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.WebViewShortcutCommandEvent */
public final class WebViewShortcutCommandEvent extends IEvent {

    /* renamed from: d */
    public C28854a f79066d = new C28854a();

    /* renamed from: com.tencent.mm.autogen.events.WebViewShortcutCommandEvent$a */
    public static final class C28854a {

        /* renamed from: a */
        public String f79067a;
    }

    public WebViewShortcutCommandEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof WebViewShortcutCommandEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f79066d.f79067a, ((WebViewShortcutCommandEvent) iEvent).f79066d.f79067a);
    }
}
