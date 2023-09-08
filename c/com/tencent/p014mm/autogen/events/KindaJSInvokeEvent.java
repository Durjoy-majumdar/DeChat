package com.tencent.p014mm.autogen.events;

import android.os.Bundle;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.KindaJSInvokeEvent */
public final class KindaJSInvokeEvent extends IEvent {

    /* renamed from: d */
    public C24257a f69426d = new C24257a();

    /* renamed from: e */
    public C24258b f69427e = new C24258b();

    /* renamed from: com.tencent.mm.autogen.events.KindaJSInvokeEvent$a */
    public static final class C24257a {

        /* renamed from: a */
        public int f69428a = 0;

        /* renamed from: b */
        public Bundle f69429b;

        /* renamed from: c */
        public String f69430c;

        /* renamed from: d */
        public Runnable f69431d;
    }

    /* renamed from: com.tencent.mm.autogen.events.KindaJSInvokeEvent$b */
    public static final class C24258b {

        /* renamed from: a */
        public Bundle f69432a;
    }

    public KindaJSInvokeEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof KindaJSInvokeEvent)) {
            return false;
        }
        KindaJSInvokeEvent kindaJSInvokeEvent = (KindaJSInvokeEvent) iEvent;
        C24257a aVar = kindaJSInvokeEvent.f69426d;
        if (!C46238a.m51546a(Integer.valueOf(this.f69426d.f69428a), Integer.valueOf(aVar.f69428a)) || !C46238a.m51546a(this.f69426d.f69429b, aVar.f69429b) || !C46238a.m51546a(this.f69426d.f69430c, aVar.f69430c) || !C46238a.m51546a(this.f69426d.f69431d, aVar.f69431d)) {
            return false;
        }
        return C46238a.m51546a(this.f69427e.f69432a, kindaJSInvokeEvent.f69427e.f69432a);
    }
}
