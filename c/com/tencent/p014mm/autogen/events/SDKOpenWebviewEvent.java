package com.tencent.p014mm.autogen.events;

import android.content.Context;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SDKOpenWebviewEvent */
public final class SDKOpenWebviewEvent extends IEvent {

    /* renamed from: d */
    public C80739a f236281d = new C80739a();

    /* renamed from: com.tencent.mm.autogen.events.SDKOpenWebviewEvent$a */
    public static final class C80739a {

        /* renamed from: a */
        public String[] f236282a;

        /* renamed from: b */
        public String[] f236283b;

        /* renamed from: c */
        public Context f236284c;

        /* renamed from: d */
        public boolean f236285d = false;
    }

    public SDKOpenWebviewEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SDKOpenWebviewEvent)) {
            return false;
        }
        C80739a aVar = ((SDKOpenWebviewEvent) iEvent).f236281d;
        return C46238a.m51546a(this.f236281d.f236282a, aVar.f236282a) && C46238a.m51546a(this.f236281d.f236283b, aVar.f236283b) && C46238a.m51546a(this.f236281d.f236284c, aVar.f236284c) && C46238a.m51546a(Boolean.valueOf(this.f236281d.f236285d), Boolean.valueOf(aVar.f236285d));
    }
}
