package com.tencent.p014mm.plugin.wallet.balance.model.lqt;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.kinda.gen.ITransmitKvData;
import com.tencent.kinda.gen.UseCaseCallback;
import com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt.WalletLqtSaveFetchUI;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import java.util.HashMap;
import te3.C77964lj3;

/* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.i1 */
public class C71636i1 implements UseCaseCallback {

    /* renamed from: a */
    public final /* synthetic */ C77964lj3 f207627a;

    /* renamed from: b */
    public final /* synthetic */ Bankcard f207628b;

    /* renamed from: c */
    public final /* synthetic */ C71624d1 f207629c;

    public C71636i1(C71624d1 d1Var, C77964lj3 lj32, Bankcard bankcard) {
        this.f207629c = d1Var;
        this.f207627a = lj32;
        this.f207628b = bankcard;
    }

    public void call(ITransmitKvData iTransmitKvData) {
        if (iTransmitKvData != null && iTransmitKvData.getString("result").equals("ok")) {
            boolean bool = iTransmitKvData.getBool("use_joint_channel");
            this.f207629c.f207605d = iTransmitKvData.getString(FirebaseAnalytics.C113379b.TRANSACTION_ID);
            String str = (String) ((HashMap) this.f207629c.f207614m).get(this.f207627a.f227816f);
            if (!Util.isNullOrNil(str)) {
                this.f207629c.f207604c = str;
            }
            WalletBaseUI walletBaseUI = this.f207629c.f207603b;
            if (walletBaseUI instanceof WalletLqtSaveFetchUI) {
                ((WalletLqtSaveFetchUI) walletBaseUI).f208172S0 = true;
                ((WalletLqtSaveFetchUI) walletBaseUI).mo98981T7();
            }
            this.f207629c.mo98810b(this.f207628b.field_bindSerial, bool ? 1 : 0);
        }
    }
}
