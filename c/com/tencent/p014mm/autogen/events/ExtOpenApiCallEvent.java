package com.tencent.p014mm.autogen.events;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ExtOpenApiCallEvent */
public final class ExtOpenApiCallEvent extends IEvent {

    /* renamed from: d */
    public C80718a f236197d = new C80718a();

    /* renamed from: e */
    public C80719b f236198e = new C80719b();

    /* renamed from: com.tencent.mm.autogen.events.ExtOpenApiCallEvent$a */
    public static final class C80718a {

        /* renamed from: a */
        public int f236199a = 0;

        /* renamed from: b */
        public Context f236200b;

        /* renamed from: c */
        public String[] f236201c;

        /* renamed from: d */
        public Uri f236202d;

        /* renamed from: e */
        public String[] f236203e;

        /* renamed from: f */
        public String f236204f;
    }

    /* renamed from: com.tencent.mm.autogen.events.ExtOpenApiCallEvent$b */
    public static final class C80719b {

        /* renamed from: a */
        public Cursor f236205a;
    }

    public ExtOpenApiCallEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExtOpenApiCallEvent)) {
            return false;
        }
        ExtOpenApiCallEvent extOpenApiCallEvent = (ExtOpenApiCallEvent) iEvent;
        C80718a aVar = extOpenApiCallEvent.f236197d;
        if (!C46238a.m51546a(Integer.valueOf(this.f236197d.f236199a), Integer.valueOf(aVar.f236199a)) || !C46238a.m51546a(this.f236197d.f236200b, aVar.f236200b) || !C46238a.m51546a(this.f236197d.f236201c, aVar.f236201c) || !C46238a.m51546a(this.f236197d.f236202d, aVar.f236202d) || !C46238a.m51546a(this.f236197d.f236203e, aVar.f236203e) || !C46238a.m51546a(this.f236197d.f236204f, aVar.f236204f)) {
            return false;
        }
        return C46238a.m51546a(this.f236198e.f236205a, extOpenApiCallEvent.f236198e.f236205a);
    }
}
