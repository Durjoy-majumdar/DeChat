package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import java.util.ArrayList;
import java.util.List;
import k53.C76492a;
import nj3.C11184p0;
import te3.C78017yd3;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.r0 */
public class C71827r0 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ List f208372d;

    /* renamed from: e */
    public final /* synthetic */ WalletLqtPlanAddUI f208373e;

    public C71827r0(WalletLqtPlanAddUI walletLqtPlanAddUI, List list) {
        this.f208373e = walletLqtPlanAddUI;
        this.f208372d = list;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        C76492a aVar = this.f208373e.f208019Z;
        if (aVar != null) {
            aVar.mo106728c();
            if (i < 0 || i >= this.f208372d.size()) {
                WalletLqtPlanAddUI.m84211I7(this.f208373e);
                return;
            }
            Bankcard bankcard = (Bankcard) ((ArrayList) this.f208373e.f208001G).get(i);
            WalletLqtPlanAddUI walletLqtPlanAddUI = this.f208373e;
            C78017yd3 yd32 = walletLqtPlanAddUI.f208003I;
            yd32.f228575h = bankcard.field_bindSerial;
            yd32.f228573f = bankcard.field_bankcardType;
            yd32.f228582r = bankcard.field_bankName;
            yd32.f228574g = bankcard.field_bankcardTail;
            walletLqtPlanAddUI.mo98934P7();
            this.f208373e.mo98936R7();
            WalletLqtPlanAddUI.m84212J7(this.f208373e);
        }
    }
}
