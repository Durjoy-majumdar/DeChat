package com.tencent.p014mm.enjoylife.flux.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.enjoylife.flux.events.FluxActionDispatchEvent */
public final class FluxActionDispatchEvent extends IEvent {

    /* renamed from: d */
    public C55198a f157035d = new C55198a();

    /* renamed from: com.tencent.mm.enjoylife.flux.events.FluxActionDispatchEvent$a */
    public static final class C55198a {
    }

    public FluxActionDispatchEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FluxActionDispatchEvent)) {
            return false;
        }
        C55198a aVar = ((FluxActionDispatchEvent) iEvent).f157035d;
        this.f157035d.getClass();
        aVar.getClass();
        return C46238a.m51546a((Object) null, (Object) null);
    }
}
