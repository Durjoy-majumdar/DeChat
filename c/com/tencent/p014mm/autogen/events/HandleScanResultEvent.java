package com.tencent.p014mm.autogen.events;

import android.content.Context;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.HandleScanResultEvent */
public final class HandleScanResultEvent extends IEvent {

    /* renamed from: d */
    public C80725a f236219d = new C80725a();

    /* renamed from: com.tencent.mm.autogen.events.HandleScanResultEvent$a */
    public static final class C80725a {

        /* renamed from: a */
        public String[] f236220a;

        /* renamed from: b */
        public String[] f236221b;

        /* renamed from: c */
        public Context f236222c;
    }

    public HandleScanResultEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof HandleScanResultEvent)) {
            return false;
        }
        C80725a aVar = ((HandleScanResultEvent) iEvent).f236219d;
        return C46238a.m51546a(this.f236219d.f236220a, aVar.f236220a) && C46238a.m51546a(this.f236219d.f236221b, aVar.f236221b) && C46238a.m51546a(this.f236219d.f236222c, aVar.f236222c);
    }
}
