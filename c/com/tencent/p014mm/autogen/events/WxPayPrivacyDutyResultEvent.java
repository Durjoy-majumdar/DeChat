package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.WxPayPrivacyDutyResultEvent */
public final class WxPayPrivacyDutyResultEvent extends IEvent {

    /* renamed from: d */
    public C40189a f107846d = new C40189a();

    /* renamed from: com.tencent.mm.autogen.events.WxPayPrivacyDutyResultEvent$a */
    public static final class C40189a {

        /* renamed from: a */
        public boolean f107847a = false;

        /* renamed from: b */
        public boolean f107848b = false;
    }

    public WxPayPrivacyDutyResultEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof WxPayPrivacyDutyResultEvent)) {
            return false;
        }
        C40189a aVar = ((WxPayPrivacyDutyResultEvent) iEvent).f107846d;
        return C46238a.m51546a(Boolean.valueOf(this.f107846d.f107847a), Boolean.valueOf(aVar.f107847a)) && C46238a.m51546a(Boolean.valueOf(this.f107846d.f107848b), Boolean.valueOf(aVar.f107848b));
    }
}
