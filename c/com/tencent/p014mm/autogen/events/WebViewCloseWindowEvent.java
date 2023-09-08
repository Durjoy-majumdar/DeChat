package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.WebViewCloseWindowEvent */
public final class WebViewCloseWindowEvent extends IEvent {

    /* renamed from: d */
    public C1166a f9608d = new C1166a();

    /* renamed from: com.tencent.mm.autogen.events.WebViewCloseWindowEvent$a */
    public static final class C1166a {

        /* renamed from: a */
        public String f9609a;
    }

    public WebViewCloseWindowEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof WebViewCloseWindowEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f9608d.f9609a, ((WebViewCloseWindowEvent) iEvent).f9608d.f9609a);
    }
}
