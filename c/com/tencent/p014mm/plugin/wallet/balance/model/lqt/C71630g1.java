package com.tencent.p014mm.plugin.wallet.balance.model.lqt;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.kinda.gen.ITransmitKvData;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import di3.C86312j;
import hp3.C87581a;
import ie3.C76324c;
import ie3.C76331i;
import java.util.HashMap;
import lp3.C46888b;
import lp3.C88643g;
import te3.C77964lj3;

/* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.g1 */
public class C71630g1 implements C87581a<Void, C77964lj3> {

    /* renamed from: a */
    public final /* synthetic */ Bankcard f207622a;

    /* renamed from: b */
    public final /* synthetic */ C71624d1 f207623b;

    public C71630g1(C71624d1 d1Var, Bankcard bankcard) {
        this.f207623b = d1Var;
        this.f207622a = bankcard;
    }

    public Object call(Object obj) {
        C77964lj3 lj32 = (C77964lj3) obj;
        Log.m105925i("MicroMsg.LqtSaveFetchLogic", "doSaveLqt, prepayid: %s, cashierType: %d", lj32.f227816f, Integer.valueOf(lj32.f227819i));
        C71624d1 d1Var = this.f207623b;
        ((HashMap) d1Var.f207614m).put(lj32.f227816f, d1Var.f207604c);
        C71624d1 d1Var2 = this.f207623b;
        Bankcard bankcard = this.f207622a;
        d1Var2.getClass();
        Class cls = C76324c.class;
        int i = lj32.f227819i;
        if (i == 2) {
            String str = lj32.f227816f;
            int i2 = lj32.f227818h;
            if (bankcard == null) {
                bankcard = d1Var2.f207610i;
            }
            C46888b b = C88643g.m110544b();
            d1Var2.f207613l = b;
            b.mo72092b();
            if (i2 <= 0) {
                i2 = d1Var2.f207609h == 0 ? 45 : 52;
            }
            String str2 = bankcard != null ? bankcard.field_bindSerial : "";
            String str3 = bankcard != null ? bankcard.field_bankcardType : "";
            Log.m105925i("MicroMsg.LqtSaveFetchLogic", "doKindaSaveLqt, startInWxAppPayUseCase reqKey:%s bindSerial:%s bankType:%s", str, str2, str3);
            Bundle bundle = new Bundle();
            bundle.putString("prepayId", str);
            bundle.putString("bindSerial", str2);
            bundle.putString("bankType", str3);
            bundle.putInt("payScene", i2);
            bundle.putInt("payChannel", 0);
            if (d1Var2.f207612k == 14) {
                bundle.putInt("enableDuplicate", 1);
            } else {
                bundle.putInt("enableDuplicate", 0);
            }
            ((C76324c) C86312j.m106911c(cls)).startInWxAppPayUseCase(d1Var2.f207603b, bundle);
            return null;
        } else if (i != 3) {
            String str4 = lj32.f227816f;
            int i3 = lj32.f227818h;
            if (bankcard == null) {
                bankcard = d1Var2.f207610i;
            }
            C46888b b2 = C88643g.m110544b();
            d1Var2.f207613l = b2;
            b2.mo72092b();
            int i4 = i3 <= 0 ? d1Var2.f207609h == 0 ? 45 : 52 : i3;
            WalletBaseUI walletBaseUI = d1Var2.f207603b;
            String str5 = bankcard != null ? bankcard.field_bindSerial : "";
            if (Util.isNullOrNil(str4)) {
                return null;
            }
            C76331i.m91762f(walletBaseUI, true, str5, C76331i.m91757a(str4, "", (String) null, (String) null, i4, 0), (String) null, new Intent(), 123);
            return null;
        } else {
            ITransmitKvData create = ITransmitKvData.create();
            create.putInt("payScene", 45);
            if (!TextUtils.isEmpty(lj32.f227816f)) {
                create.putString("prepay_id", lj32.f227816f);
            }
            create.putString("bankType", bankcard.field_bankcardType);
            create.putString("bindSerial", bankcard.field_bindSerial);
            if (d1Var2.f207612k == 14) {
                create.putBool("enableDuplicate", true);
            }
            C46888b b3 = C88643g.m110544b();
            d1Var2.f207613l = b3;
            b3.mo72092b();
            ((C76324c) C86312j.m106911c(cls)).startUseCase("jointPay", create, new C71636i1(d1Var2, lj32, bankcard));
            return null;
        }
    }
}
