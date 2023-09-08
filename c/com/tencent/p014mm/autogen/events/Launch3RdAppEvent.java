package com.tencent.p014mm.autogen.events;

import android.content.Context;
import android.os.Bundle;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.pluginsdk.model.app.C44580q1;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.Launch3RdAppEvent */
public final class Launch3RdAppEvent extends IEvent {

    /* renamed from: d */
    public C1089a f9317d = new C1089a();

    /* renamed from: e */
    public C1090b f9318e = new C1090b();

    /* renamed from: com.tencent.mm.autogen.events.Launch3RdAppEvent$a */
    public static final class C1089a {

        /* renamed from: a */
        public WXMediaMessage f9319a;

        /* renamed from: b */
        public String f9320b;

        /* renamed from: c */
        public int f9321c;

        /* renamed from: d */
        public Context f9322d;

        /* renamed from: e */
        public C44580q1 f9323e;

        /* renamed from: f */
        public Bundle f9324f;
    }

    /* renamed from: com.tencent.mm.autogen.events.Launch3RdAppEvent$b */
    public static final class C1090b {

        /* renamed from: a */
        public boolean f9325a;
    }

    public Launch3RdAppEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof Launch3RdAppEvent)) {
            return false;
        }
        Launch3RdAppEvent launch3RdAppEvent = (Launch3RdAppEvent) iEvent;
        C1089a aVar = launch3RdAppEvent.f9317d;
        if (!C46238a.m51546a(this.f9317d.f9319a, aVar.f9319a) || !C46238a.m51546a(this.f9317d.f9320b, aVar.f9320b) || !C46238a.m51546a(Integer.valueOf(this.f9317d.f9321c), Integer.valueOf(aVar.f9321c)) || !C46238a.m51546a(this.f9317d.f9322d, aVar.f9322d) || !C46238a.m51546a(this.f9317d.f9323e, aVar.f9323e) || !C46238a.m51546a(this.f9317d.f9324f, aVar.f9324f)) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f9318e.f9325a), Boolean.valueOf(launch3RdAppEvent.f9318e.f9325a));
    }
}
