package com.tencent.p014mm.autogen.events;

import android.content.Intent;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.JsapiResultEvent */
public final class JsapiResultEvent extends IEvent {

    /* renamed from: d */
    public C67720a f193694d = new C67720a();

    /* renamed from: com.tencent.mm.autogen.events.JsapiResultEvent$a */
    public static final class C67720a {

        /* renamed from: a */
        public int f193695a;

        /* renamed from: b */
        public int f193696b;

        /* renamed from: c */
        public Intent f193697c;
    }

    public JsapiResultEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof JsapiResultEvent)) {
            return false;
        }
        C67720a aVar = ((JsapiResultEvent) iEvent).f193694d;
        return C46238a.m51546a(Integer.valueOf(this.f193694d.f193695a), Integer.valueOf(aVar.f193695a)) && C46238a.m51546a(Integer.valueOf(this.f193694d.f193696b), Integer.valueOf(aVar.f193696b)) && C46238a.m51546a(this.f193694d.f193697c, aVar.f193697c);
    }
}
