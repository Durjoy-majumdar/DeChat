package com.tencent.p014mm.autogen.events;

import android.content.Context;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.StartWebViewEvent */
public final class StartWebViewEvent extends IEvent {

    /* renamed from: d */
    public C28835a f79011d = new C28835a();

    /* renamed from: com.tencent.mm.autogen.events.StartWebViewEvent$a */
    public static final class C28835a {

        /* renamed from: a */
        public String f79012a;

        /* renamed from: b */
        public Context f79013b;
    }

    public StartWebViewEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof StartWebViewEvent)) {
            return false;
        }
        C28835a aVar = ((StartWebViewEvent) iEvent).f79011d;
        return C46238a.m51546a(this.f79011d.f79012a, aVar.f79012a) && C46238a.m51546a(this.f79011d.f79013b, aVar.f79013b);
    }
}
