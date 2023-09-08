package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;
import te3.C101804kv2;

/* renamed from: com.tencent.mm.autogen.events.RecentlySnsMediaObjEvent */
public final class RecentlySnsMediaObjEvent extends IEvent {

    /* renamed from: d */
    public C92548a f265008d = new C92548a();

    /* renamed from: e */
    public C92549b f265009e = new C92549b();

    /* renamed from: com.tencent.mm.autogen.events.RecentlySnsMediaObjEvent$a */
    public static final class C92548a {

        /* renamed from: a */
        public String f265010a;
    }

    /* renamed from: com.tencent.mm.autogen.events.RecentlySnsMediaObjEvent$b */
    public static final class C92549b {

        /* renamed from: a */
        public C101804kv2 f265011a;

        /* renamed from: b */
        public C101804kv2 f265012b;

        /* renamed from: c */
        public C101804kv2 f265013c;

        /* renamed from: d */
        public C101804kv2 f265014d;
    }

    public RecentlySnsMediaObjEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof RecentlySnsMediaObjEvent)) {
            return false;
        }
        RecentlySnsMediaObjEvent recentlySnsMediaObjEvent = (RecentlySnsMediaObjEvent) iEvent;
        if (!C46238a.m51546a(this.f265008d.f265010a, recentlySnsMediaObjEvent.f265008d.f265010a)) {
            return false;
        }
        C92549b bVar = recentlySnsMediaObjEvent.f265009e;
        return C46238a.m51546a(this.f265009e.f265011a, bVar.f265011a) && C46238a.m51546a(this.f265009e.f265012b, bVar.f265012b) && C46238a.m51546a(this.f265009e.f265013c, bVar.f265013c) && C46238a.m51546a(this.f265009e.f265014d, bVar.f265014d);
    }
}
