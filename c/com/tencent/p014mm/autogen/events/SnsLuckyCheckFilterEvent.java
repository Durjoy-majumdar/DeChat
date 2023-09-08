package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SnsLuckyCheckFilterEvent */
public final class SnsLuckyCheckFilterEvent extends IEvent {

    /* renamed from: d */
    public C92585a f265172d = new C92585a();

    /* renamed from: com.tencent.mm.autogen.events.SnsLuckyCheckFilterEvent$a */
    public static final class C92585a {
    }

    public SnsLuckyCheckFilterEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SnsLuckyCheckFilterEvent)) {
            return false;
        }
        C92585a aVar = ((SnsLuckyCheckFilterEvent) iEvent).f265172d;
        this.f265172d.getClass();
        Boolean bool = Boolean.FALSE;
        aVar.getClass();
        return C46238a.m51546a(bool, bool);
    }
}
