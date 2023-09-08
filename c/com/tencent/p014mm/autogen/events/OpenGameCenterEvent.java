package com.tencent.p014mm.autogen.events;

import android.content.Context;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.autogen.events.OpenGameCenterEvent */
public final class OpenGameCenterEvent extends IEvent {

    /* renamed from: d */
    public C1106a f9383d = new C1106a();

    /* renamed from: com.tencent.mm.autogen.events.OpenGameCenterEvent$a */
    public static final class C1106a {

        /* renamed from: a */
        public JSONObject f9384a;

        /* renamed from: b */
        public Context f9385b;
    }

    public OpenGameCenterEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof OpenGameCenterEvent)) {
            return false;
        }
        C1106a aVar = ((OpenGameCenterEvent) iEvent).f9383d;
        return C46238a.m51546a(this.f9383d.f9384a, aVar.f9384a) && C46238a.m51546a(this.f9383d.f9385b, aVar.f9385b);
    }
}
