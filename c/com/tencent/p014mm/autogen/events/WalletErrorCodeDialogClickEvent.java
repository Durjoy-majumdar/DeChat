package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.WalletErrorCodeDialogClickEvent */
public final class WalletErrorCodeDialogClickEvent extends IEvent {

    /* renamed from: d */
    public C67823a f194036d = new C67823a();

    /* renamed from: com.tencent.mm.autogen.events.WalletErrorCodeDialogClickEvent$a */
    public static final class C67823a {

        /* renamed from: a */
        public String f194037a;
    }

    public WalletErrorCodeDialogClickEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof WalletErrorCodeDialogClickEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f194036d.f194037a, ((WalletErrorCodeDialogClickEvent) iEvent).f194036d.f194037a);
    }
}
