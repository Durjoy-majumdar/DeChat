package com.tencent.p014mm.plugin.luckymoney.p073ui;

import com.tencent.p014mm.sdk.platformtools.Log;
import te3.C78023zk3;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.h0 */
public class C69601h0 implements Runnable {

    /* renamed from: d */
    public boolean f200949d = false;

    /* renamed from: e */
    public final /* synthetic */ C78023zk3 f200950e;

    /* renamed from: f */
    public final /* synthetic */ C69607i0 f200951f;

    public C69601h0(C69607i0 i0Var, C78023zk3 zk32) {
        this.f200951f = i0Var;
        this.f200950e = zk32;
    }

    public void run() {
        Log.m105925i("MicroMsg.LuckyMoneyDetailUI", "WalletGetUserInfoEvent callback() hasCallback:%s", Boolean.valueOf(this.f200949d));
        if (!this.f200949d) {
            C69607i0 i0Var = this.f200951f;
            LuckyMoneyDetailUI.m81735M7(i0Var.f200965d, this.f200950e, i0Var.f200963b, i0Var.f200964c);
        }
        this.f200949d = true;
    }
}
