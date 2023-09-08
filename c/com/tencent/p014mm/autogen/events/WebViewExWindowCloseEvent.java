package com.tencent.p014mm.autogen.events;

import android.os.Bundle;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.WebViewExWindowCloseEvent */
public final class WebViewExWindowCloseEvent extends IEvent {

    /* renamed from: d */
    public C1167a f9610d = new C1167a();

    /* renamed from: com.tencent.mm.autogen.events.WebViewExWindowCloseEvent$a */
    public static final class C1167a {

        /* renamed from: a */
        public String f9611a;

        /* renamed from: b */
        public Bundle f9612b;
    }

    public WebViewExWindowCloseEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof WebViewExWindowCloseEvent)) {
            return false;
        }
        C1167a aVar = ((WebViewExWindowCloseEvent) iEvent).f9610d;
        return C46238a.m51546a(this.f9610d.f9611a, aVar.f9611a) && C46238a.m51546a(this.f9610d.f9612b, aVar.f9612b);
    }
}
