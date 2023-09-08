package com.tencent.p014mm.autogen.events;

import android.content.Context;
import android.os.Bundle;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.GetA8KeyRedirectEvent */
public final class GetA8KeyRedirectEvent extends IEvent {

    /* renamed from: d */
    public C40113a f107573d = new C40113a();

    /* renamed from: e */
    public C40114b f107574e = new C40114b();

    /* renamed from: com.tencent.mm.autogen.events.GetA8KeyRedirectEvent$a */
    public static final class C40113a {

        /* renamed from: a */
        public int f107575a;

        /* renamed from: b */
        public String f107576b;

        /* renamed from: c */
        public Context f107577c;

        /* renamed from: d */
        public Bundle f107578d;
    }

    /* renamed from: com.tencent.mm.autogen.events.GetA8KeyRedirectEvent$b */
    public static final class C40114b {

        /* renamed from: a */
        public int f107579a = 0;
    }

    public GetA8KeyRedirectEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof GetA8KeyRedirectEvent)) {
            return false;
        }
        GetA8KeyRedirectEvent getA8KeyRedirectEvent = (GetA8KeyRedirectEvent) iEvent;
        C40113a aVar = getA8KeyRedirectEvent.f107573d;
        if (!C46238a.m51546a(Integer.valueOf(this.f107573d.f107575a), Integer.valueOf(aVar.f107575a))) {
            return false;
        }
        this.f107573d.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null) || !C46238a.m51546a(this.f107573d.f107576b, aVar.f107576b) || !C46238a.m51546a(this.f107573d.f107577c, aVar.f107577c) || !C46238a.m51546a(this.f107573d.f107578d, aVar.f107578d)) {
            return false;
        }
        return C46238a.m51546a(Integer.valueOf(this.f107574e.f107579a), Integer.valueOf(getA8KeyRedirectEvent.f107574e.f107579a));
    }
}
