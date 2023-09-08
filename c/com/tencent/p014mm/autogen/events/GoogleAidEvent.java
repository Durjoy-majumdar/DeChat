package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.GoogleAidEvent */
public final class GoogleAidEvent extends IEvent {

    /* renamed from: d */
    public C17681a f48100d = new C17681a();

    /* renamed from: e */
    public C17682b f48101e = new C17682b();

    /* renamed from: com.tencent.mm.autogen.events.GoogleAidEvent$a */
    public static final class C17681a {
    }

    /* renamed from: com.tencent.mm.autogen.events.GoogleAidEvent$b */
    public static final class C17682b {
    }

    public GoogleAidEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof GoogleAidEvent)) {
            return false;
        }
        GoogleAidEvent googleAidEvent = (GoogleAidEvent) iEvent;
        C17681a aVar = googleAidEvent.f48100d;
        this.f48100d.getClass();
        aVar.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        C17682b bVar = googleAidEvent.f48101e;
        this.f48101e.getClass();
        bVar.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        this.f48101e.getClass();
        Boolean bool = Boolean.FALSE;
        return C46238a.m51546a(bool, bool);
    }
}
