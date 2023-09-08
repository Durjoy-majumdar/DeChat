package com.tencent.p014mm.autogen.events;

import android.content.Context;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ExtCallBizEvent */
public final class ExtCallBizEvent extends IEvent {

    /* renamed from: d */
    public C80715a f236183d = new C80715a();

    /* renamed from: com.tencent.mm.autogen.events.ExtCallBizEvent$a */
    public static final class C80715a {

        /* renamed from: a */
        public int f236184a = 0;

        /* renamed from: b */
        public int f236185b = -1;

        /* renamed from: c */
        public Context f236186c;

        /* renamed from: d */
        public String[] f236187d;

        /* renamed from: e */
        public String[] f236188e;
    }

    public ExtCallBizEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExtCallBizEvent)) {
            return false;
        }
        C80715a aVar = ((ExtCallBizEvent) iEvent).f236183d;
        if (!C46238a.m51546a(Integer.valueOf(this.f236183d.f236184a), Integer.valueOf(aVar.f236184a)) || !C46238a.m51546a(Integer.valueOf(this.f236183d.f236185b), Integer.valueOf(aVar.f236185b)) || !C46238a.m51546a(this.f236183d.f236186c, aVar.f236186c) || !C46238a.m51546a(this.f236183d.f236187d, aVar.f236187d)) {
            return false;
        }
        this.f236183d.getClass();
        return C46238a.m51546a((Object) null, (Object) null) && C46238a.m51546a(this.f236183d.f236188e, aVar.f236188e);
    }
}
