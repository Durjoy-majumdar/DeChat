package com.tencent.p014mm.plugin.luckymoney.flux;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.enjoylife.flux.events.FluxActionDispatchEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import t32.C64202a;

/* renamed from: com.tencent.mm.plugin.luckymoney.flux.BaseStore */
public abstract class BaseStore extends IListener<FluxActionDispatchEvent> {
    public BaseStore() {
        super(C40008f.f107254d);
        C64202a.f181927b.f181928a.getAndIncrement();
        this.__eventId = 775538386;
    }

    public boolean callback(IEvent iEvent) {
        FluxActionDispatchEvent fluxActionDispatchEvent = (FluxActionDispatchEvent) iEvent;
        if (!(fluxActionDispatchEvent instanceof FluxActionDispatchEvent)) {
            return false;
        }
        fluxActionDispatchEvent.f157035d.getClass();
        return false;
    }
}
