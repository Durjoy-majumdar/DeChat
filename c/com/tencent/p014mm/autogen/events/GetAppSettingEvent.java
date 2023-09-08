package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.GetAppSettingEvent */
public final class GetAppSettingEvent extends IEvent {

    /* renamed from: d */
    public C67706a f193638d = new C67706a();

    /* renamed from: com.tencent.mm.autogen.events.GetAppSettingEvent$a */
    public static final class C67706a {

        /* renamed from: a */
        public String f193639a;
    }

    public GetAppSettingEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof GetAppSettingEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f193638d.f193639a, ((GetAppSettingEvent) iEvent).f193638d.f193639a);
    }
}
