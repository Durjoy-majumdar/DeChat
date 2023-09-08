package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.plugin.wallet_core.model.BindCardOrder;
import com.tencent.p014mm.sdk.platformtools.Log;
import te3.C78017yd3;
import yq3.C79148e;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.w0 */
public class C71840w0 implements C79148e.C79149a {

    /* renamed from: a */
    public final /* synthetic */ WalletLqtPlanAddUI f208392a;

    public C71840w0(WalletLqtPlanAddUI walletLqtPlanAddUI) {
        this.f208392a = walletLqtPlanAddUI;
    }

    public Intent onProcessEnd(int i, Bundle bundle) {
        Log.m105925i("MicroMsg.WalletLqtPlanAddUI", "bind card finish: %s", Integer.valueOf(i));
        if (i != -1) {
            return null;
        }
        BindCardOrder bindCardOrder = (BindCardOrder) bundle.getParcelable("key_bindcard_value_result");
        if (bindCardOrder != null) {
            Log.m105925i("MicroMsg.WalletLqtPlanAddUI", "bind card serial: %s", bindCardOrder.f209475n);
            WalletLqtPlanAddUI walletLqtPlanAddUI = this.f208392a;
            String str = bindCardOrder.f209475n;
            int i2 = WalletLqtPlanAddUI.f207994y0;
            Bankcard M7 = walletLqtPlanAddUI.mo98931M7(str);
            if (M7 != null) {
                WalletLqtPlanAddUI walletLqtPlanAddUI2 = this.f208392a;
                C78017yd3 yd32 = walletLqtPlanAddUI2.f208003I;
                yd32.f228575h = M7.field_bindSerial;
                yd32.f228573f = M7.field_bankcardType;
                yd32.f228582r = M7.field_bankName;
                yd32.f228574g = M7.field_bankcardTail;
                walletLqtPlanAddUI2.mo98934P7();
            }
        }
        WalletLqtPlanAddUI walletLqtPlanAddUI3 = this.f208392a;
        int i3 = WalletLqtPlanAddUI.f207994y0;
        walletLqtPlanAddUI3.mo98930L7(false);
        return null;
    }
}
