package com.tencent.p014mm.wallet_core.model;

import com.tencent.p014mm.wallet_core.model.JumpRemind;

/* renamed from: com.tencent.mm.wallet_core.model.y */
public class C75156y implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ JumpRemind.C750892 f221137d;

    public C75156y(JumpRemind.C750892 r1) {
        this.f221137d = r1;
    }

    public void run() {
        JumpRemind jumpRemind = JumpRemind.this;
        if (!jumpRemind.f220980i) {
            jumpRemind.f220980i = true;
            jumpRemind.f220979h.onUrlCancel();
        }
    }
}
