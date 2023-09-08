package com.tencent.p014mm.autogen.events;

import android.content.Context;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ExDeviceOpInChattingUIEvent */
public final class ExDeviceOpInChattingUIEvent extends IEvent {

    /* renamed from: d */
    public C40076a f107475d = new C40076a();

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceOpInChattingUIEvent$a */
    public static final class C40076a {

        /* renamed from: a */
        public int f107476a = 0;

        /* renamed from: b */
        public String f107477b;

        /* renamed from: c */
        public Context f107478c;
    }

    public ExDeviceOpInChattingUIEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExDeviceOpInChattingUIEvent)) {
            return false;
        }
        C40076a aVar = ((ExDeviceOpInChattingUIEvent) iEvent).f107475d;
        return C46238a.m51546a(Integer.valueOf(this.f107475d.f107476a), Integer.valueOf(aVar.f107476a)) && C46238a.m51546a(this.f107475d.f107477b, aVar.f107477b) && C46238a.m51546a(this.f107475d.f107478c, aVar.f107478c);
    }
}
