package com.tencent.p014mm.plugin.remittance.p098ui;

import com.tencent.p014mm.sdk.platformtools.Log;
import te3.C78023zk3;

/* renamed from: com.tencent.mm.plugin.remittance.ui.v0 */
public class C70954v0 implements Runnable {

    /* renamed from: d */
    public boolean f205402d = false;

    /* renamed from: e */
    public final /* synthetic */ C78023zk3 f205403e;

    /* renamed from: f */
    public final /* synthetic */ C70957w0 f205404f;

    public C70954v0(C70957w0 w0Var, C78023zk3 zk32) {
        this.f205404f = w0Var;
        this.f205403e = zk32;
    }

    public void run() {
        Log.m105925i("MicroMsg.RemittanceDetailUI", "WalletGetUserInfoEvent callback() hasCallback:%s", Boolean.valueOf(this.f205402d));
        if (!this.f205402d) {
            C70957w0 w0Var = this.f205404f;
            RemittanceDetailUI.m83237I7(w0Var.f205412d, this.f205403e, w0Var.f205410b, w0Var.f205411c);
        }
        this.f205402d = true;
    }
}
