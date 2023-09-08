package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SnsJumpPermissionSettingEvent */
public final class SnsJumpPermissionSettingEvent extends IEvent {

    /* renamed from: d */
    public C92582a f265164d = new C92582a();

    /* renamed from: com.tencent.mm.autogen.events.SnsJumpPermissionSettingEvent$a */
    public static final class C92582a {

        /* renamed from: a */
        public String f265165a;

        /* renamed from: b */
        public long f265166b;
    }

    public SnsJumpPermissionSettingEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SnsJumpPermissionSettingEvent)) {
            return false;
        }
        C92582a aVar = ((SnsJumpPermissionSettingEvent) iEvent).f265164d;
        return C46238a.m51546a(this.f265164d.f265165a, aVar.f265165a) && C46238a.m51546a(Long.valueOf(this.f265164d.f265166b), Long.valueOf(aVar.f265166b));
    }
}
