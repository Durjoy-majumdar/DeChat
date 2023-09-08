package com.tencent.p014mm.autogen.events;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.JSApiOpenSpecificViewEvent */
public final class JSApiOpenSpecificViewEvent extends IEvent {

    /* renamed from: d */
    public C40129a f107614d = new C40129a();

    /* renamed from: e */
    public C40130b f107615e = new C40130b();

    /* renamed from: com.tencent.mm.autogen.events.JSApiOpenSpecificViewEvent$a */
    public static final class C40129a {

        /* renamed from: a */
        public Context f107616a;

        /* renamed from: b */
        public String f107617b;
    }

    /* renamed from: com.tencent.mm.autogen.events.JSApiOpenSpecificViewEvent$b */
    public static final class C40130b {

        /* renamed from: a */
        public Intent f107618a;

        /* renamed from: b */
        public boolean f107619b = false;

        /* renamed from: c */
        public boolean f107620c = false;
    }

    public JSApiOpenSpecificViewEvent() {
        this.order = true;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof JSApiOpenSpecificViewEvent)) {
            return false;
        }
        JSApiOpenSpecificViewEvent jSApiOpenSpecificViewEvent = (JSApiOpenSpecificViewEvent) iEvent;
        C40129a aVar = jSApiOpenSpecificViewEvent.f107614d;
        if (!C46238a.m51546a(this.f107614d.f107616a, aVar.f107616a) || !C46238a.m51546a(this.f107614d.f107617b, aVar.f107617b)) {
            return false;
        }
        C40130b bVar = jSApiOpenSpecificViewEvent.f107615e;
        return C46238a.m51546a(this.f107615e.f107618a, bVar.f107618a) && C46238a.m51546a(Boolean.valueOf(this.f107615e.f107619b), Boolean.valueOf(bVar.f107619b)) && C46238a.m51546a(Boolean.valueOf(this.f107615e.f107620c), Boolean.valueOf(bVar.f107620c));
    }
}
