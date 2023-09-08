package com.tencent.p014mm.autogen.events;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.NotifyGameWebviewOperationEvent */
public final class NotifyGameWebviewOperationEvent extends IEvent {

    /* renamed from: d */
    public C1100a f9355d = new C1100a();

    /* renamed from: com.tencent.mm.autogen.events.NotifyGameWebviewOperationEvent$a */
    public static final class C1100a {

        /* renamed from: a */
        public int f9356a = 0;

        /* renamed from: b */
        public Context f9357b;

        /* renamed from: c */
        public Intent f9358c;

        /* renamed from: d */
        public String f9359d;
    }

    public NotifyGameWebviewOperationEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof NotifyGameWebviewOperationEvent)) {
            return false;
        }
        C1100a aVar = ((NotifyGameWebviewOperationEvent) iEvent).f9355d;
        return C46238a.m51546a(Integer.valueOf(this.f9355d.f9356a), Integer.valueOf(aVar.f9356a)) && C46238a.m51546a(this.f9355d.f9357b, aVar.f9357b) && C46238a.m51546a(this.f9355d.f9358c, aVar.f9358c) && C46238a.m51546a(this.f9355d.f9359d, aVar.f9359d);
    }
}
