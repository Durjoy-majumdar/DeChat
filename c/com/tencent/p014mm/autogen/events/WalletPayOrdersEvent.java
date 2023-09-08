package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;
import java.util.LinkedList;

/* renamed from: com.tencent.mm.autogen.events.WalletPayOrdersEvent */
public final class WalletPayOrdersEvent extends IEvent {

    /* renamed from: d */
    public C67827a f194083d = new C67827a();

    /* renamed from: com.tencent.mm.autogen.events.WalletPayOrdersEvent$a */
    public static final class C67827a {

        /* renamed from: a */
        public LinkedList<String> f194084a;
    }

    public WalletPayOrdersEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof WalletPayOrdersEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f194083d.f194084a, ((WalletPayOrdersEvent) iEvent).f194083d.f194084a);
    }
}
