package com.tencent.p014mm.plugin.account.bind.p021ui;

import androidx.lifecycle.C0125s;
import com.tencent.p014mm.autogen.events.NeedVerifyQQEvent;
import com.tencent.p014mm.plugin.account.bind.p021ui.C114893g;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;

/* renamed from: com.tencent.mm.plugin.account.bind.ui.NeedVerifyQQEventListener */
public class NeedVerifyQQEventListener extends IListener<NeedVerifyQQEvent> implements C114893g.C114896c {

    /* renamed from: d */
    public NeedVerifyQQEvent f344390d;

    public NeedVerifyQQEventListener(C0125s sVar) {
        super(sVar);
        this.__eventId = -1913553765;
    }

    public boolean callback(IEvent iEvent) {
        NeedVerifyQQEvent needVerifyQQEvent = (NeedVerifyQQEvent) iEvent;
        this.f344390d = needVerifyQQEvent;
        new C114893g(needVerifyQQEvent.f236243d.f236245a, this).mo174579a();
        return false;
    }
}
