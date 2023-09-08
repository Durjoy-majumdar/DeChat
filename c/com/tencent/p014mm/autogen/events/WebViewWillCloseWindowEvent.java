package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.WebViewWillCloseWindowEvent */
public final class WebViewWillCloseWindowEvent extends IEvent {

    /* renamed from: d */
    public C1168a f9613d = new C1168a();

    /* renamed from: com.tencent.mm.autogen.events.WebViewWillCloseWindowEvent$a */
    public static final class C1168a {

        /* renamed from: a */
        public int f9614a = 0;
    }

    public WebViewWillCloseWindowEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof WebViewWillCloseWindowEvent)) {
            return false;
        }
        C1168a aVar = ((WebViewWillCloseWindowEvent) iEvent).f9613d;
        this.f9613d.getClass();
        aVar.getClass();
        return C46238a.m51546a((Object) null, (Object) null) && C46238a.m51546a(Integer.valueOf(this.f9613d.f9614a), Integer.valueOf(aVar.f9614a));
    }
}
