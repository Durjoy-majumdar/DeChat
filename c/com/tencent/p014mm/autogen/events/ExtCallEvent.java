package com.tencent.p014mm.autogen.events;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ExtCallEvent */
public final class ExtCallEvent extends IEvent {

    /* renamed from: d */
    public C80716a f236189d = new C80716a();

    /* renamed from: e */
    public C80717b f236190e = new C80717b();

    /* renamed from: com.tencent.mm.autogen.events.ExtCallEvent$a */
    public static final class C80716a {

        /* renamed from: a */
        public int f236191a = 0;

        /* renamed from: b */
        public Context f236192b;

        /* renamed from: c */
        public String[] f236193c;

        /* renamed from: d */
        public Uri f236194d;

        /* renamed from: e */
        public String[] f236195e;
    }

    /* renamed from: com.tencent.mm.autogen.events.ExtCallEvent$b */
    public static final class C80717b {

        /* renamed from: a */
        public Cursor f236196a;
    }

    public ExtCallEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExtCallEvent)) {
            return false;
        }
        ExtCallEvent extCallEvent = (ExtCallEvent) iEvent;
        C80716a aVar = extCallEvent.f236189d;
        if (!C46238a.m51546a(Integer.valueOf(this.f236189d.f236191a), Integer.valueOf(aVar.f236191a)) || !C46238a.m51546a(this.f236189d.f236192b, aVar.f236192b) || !C46238a.m51546a(this.f236189d.f236193c, aVar.f236193c) || !C46238a.m51546a(this.f236189d.f236194d, aVar.f236194d) || !C46238a.m51546a(this.f236189d.f236195e, aVar.f236195e)) {
            return false;
        }
        return C46238a.m51546a(this.f236190e.f236196a, extCallEvent.f236190e.f236196a);
    }
}
