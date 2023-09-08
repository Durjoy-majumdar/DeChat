package com.tencent.p014mm.autogen.events;

import android.os.Bundle;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.NotifyStartWebViewParamsEvent */
public final class NotifyStartWebViewParamsEvent extends IEvent {

    /* renamed from: d */
    public C67743a f193770d = new C67743a();

    /* renamed from: com.tencent.mm.autogen.events.NotifyStartWebViewParamsEvent$a */
    public static final class C67743a {

        /* renamed from: a */
        public String f193771a;

        /* renamed from: b */
        public Bundle f193772b;
    }

    public NotifyStartWebViewParamsEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof NotifyStartWebViewParamsEvent)) {
            return false;
        }
        C67743a aVar = ((NotifyStartWebViewParamsEvent) iEvent).f193770d;
        return C46238a.m51546a(this.f193770d.f193771a, aVar.f193771a) && C46238a.m51546a(this.f193770d.f193772b, aVar.f193772b);
    }
}
