package com.tencent.p014mm.autogen.events;

import android.content.Context;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.TVOperationEvent */
public final class TVOperationEvent extends IEvent {

    /* renamed from: d */
    public C92604a f265232d = new C92604a();

    /* renamed from: e */
    public C92605b f265233e = new C92605b();

    /* renamed from: com.tencent.mm.autogen.events.TVOperationEvent$a */
    public static final class C92604a {

        /* renamed from: a */
        public Context f265234a;

        /* renamed from: b */
        public String f265235b;
    }

    /* renamed from: com.tencent.mm.autogen.events.TVOperationEvent$b */
    public static final class C92605b {

        /* renamed from: a */
        public boolean f265236a = false;

        /* renamed from: b */
        public String f265237b;

        /* renamed from: c */
        public String f265238c;
    }

    public TVOperationEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof TVOperationEvent)) {
            return false;
        }
        TVOperationEvent tVOperationEvent = (TVOperationEvent) iEvent;
        C92604a aVar = tVOperationEvent.f265232d;
        this.f265232d.getClass();
        aVar.getClass();
        if (!C46238a.m51546a(0, 0) || !C46238a.m51546a(this.f265232d.f265234a, aVar.f265234a) || !C46238a.m51546a(this.f265232d.f265235b, aVar.f265235b)) {
            return false;
        }
        C92605b bVar = tVOperationEvent.f265233e;
        return C46238a.m51546a(Boolean.valueOf(this.f265233e.f265236a), Boolean.valueOf(bVar.f265236a)) && C46238a.m51546a(this.f265233e.f265237b, bVar.f265237b) && C46238a.m51546a(this.f265233e.f265238c, bVar.f265238c);
    }
}
