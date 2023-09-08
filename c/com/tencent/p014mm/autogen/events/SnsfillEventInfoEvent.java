package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SnsfillEventInfoEvent */
public final class SnsfillEventInfoEvent extends IEvent {

    /* renamed from: d */
    public C92600a f265220d = new C92600a();

    /* renamed from: e */
    public C92601b f265221e = new C92601b();

    /* renamed from: com.tencent.mm.autogen.events.SnsfillEventInfoEvent$a */
    public static final class C92600a {

        /* renamed from: a */
        public String f265222a;

        /* renamed from: b */
        public boolean f265223b;

        /* renamed from: c */
        public String f265224c;

        /* renamed from: d */
        public DoFavoriteEvent f265225d;
    }

    /* renamed from: com.tencent.mm.autogen.events.SnsfillEventInfoEvent$b */
    public static final class C92601b {

        /* renamed from: a */
        public boolean f265226a = false;
    }

    public SnsfillEventInfoEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SnsfillEventInfoEvent)) {
            return false;
        }
        SnsfillEventInfoEvent snsfillEventInfoEvent = (SnsfillEventInfoEvent) iEvent;
        C92600a aVar = snsfillEventInfoEvent.f265220d;
        if (!C46238a.m51546a(this.f265220d.f265222a, aVar.f265222a) || !C46238a.m51546a(Boolean.valueOf(this.f265220d.f265223b), Boolean.valueOf(aVar.f265223b)) || !C46238a.m51546a(this.f265220d.f265224c, aVar.f265224c) || !C46238a.m51546a(this.f265220d.f265225d, aVar.f265225d)) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f265221e.f265226a), Boolean.valueOf(snsfillEventInfoEvent.f265221e.f265226a));
    }
}
