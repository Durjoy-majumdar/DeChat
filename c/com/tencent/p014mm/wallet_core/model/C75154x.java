package com.tencent.p014mm.wallet_core.model;

import com.tencent.p014mm.autogen.events.WxPayGdprResultEvent;
import com.tencent.p014mm.wallet_core.model.JumpRemind;

/* renamed from: com.tencent.mm.wallet_core.model.x */
public class C75154x implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WxPayGdprResultEvent f221135d;

    /* renamed from: e */
    public final /* synthetic */ JumpRemind.C750881 f221136e;

    public C75154x(JumpRemind.C750881 r1, WxPayGdprResultEvent wxPayGdprResultEvent) {
        this.f221136e = r1;
        this.f221135d = wxPayGdprResultEvent;
    }

    public void run() {
        if (this.f221135d.f9615d.f9616a == "agree_privacy") {
            JumpRemind.this.f220979h.onUrlOk();
        } else {
            JumpRemind.this.f220979h.onUrlCancel();
        }
    }
}
