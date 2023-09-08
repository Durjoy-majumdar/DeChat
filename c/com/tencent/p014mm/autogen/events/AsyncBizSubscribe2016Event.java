package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.AsyncBizSubscribe2016Event */
public final class AsyncBizSubscribe2016Event extends IEvent {

    /* renamed from: d */
    public C55110a f154737d = new C55110a();

    /* renamed from: e */
    public C55111b f154738e = new C55111b();

    /* renamed from: com.tencent.mm.autogen.events.AsyncBizSubscribe2016Event$a */
    public static final class C55110a {
    }

    /* renamed from: com.tencent.mm.autogen.events.AsyncBizSubscribe2016Event$b */
    public static final class C55111b {
    }

    public AsyncBizSubscribe2016Event() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof AsyncBizSubscribe2016Event)) {
            return false;
        }
        AsyncBizSubscribe2016Event asyncBizSubscribe2016Event = (AsyncBizSubscribe2016Event) iEvent;
        C55110a aVar = asyncBizSubscribe2016Event.f154737d;
        this.f154737d.getClass();
        aVar.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        this.f154737d.getClass();
        if (!C46238a.m51546a(0, 0)) {
            return false;
        }
        this.f154737d.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        C55111b bVar = asyncBizSubscribe2016Event.f154738e;
        this.f154738e.getClass();
        bVar.getClass();
        if (!C46238a.m51546a(0, 0)) {
            return false;
        }
        this.f154738e.getClass();
        Boolean bool = Boolean.FALSE;
        return C46238a.m51546a(bool, bool);
    }
}
