package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import java.util.ArrayList;
import java.util.List;
import k53.C76492a;
import qo3.C101218e0;
import te3.C78017yd3;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.s0 */
public class C71830s0 implements C101218e0.C12907m {

    /* renamed from: a */
    public final /* synthetic */ List f208378a;

    /* renamed from: b */
    public final /* synthetic */ WalletLqtPlanAddUI f208379b;

    public C71830s0(WalletLqtPlanAddUI walletLqtPlanAddUI, List list) {
        this.f208379b = walletLqtPlanAddUI;
        this.f208378a = list;
    }

    /* renamed from: a */
    public void mo2001a() {
        C76492a aVar = this.f208379b.f208019Z;
        if (aVar != null) {
            aVar.mo106728c();
            int i = this.f208379b.f208019Z.f223933m;
            if (i < 0 || i >= this.f208378a.size()) {
                WalletLqtPlanAddUI.m84211I7(this.f208379b);
                return;
            }
            WalletLqtPlanAddUI walletLqtPlanAddUI = this.f208379b;
            Bankcard bankcard = (Bankcard) ((ArrayList) walletLqtPlanAddUI.f208001G).get(walletLqtPlanAddUI.f208019Z.f223933m);
            WalletLqtPlanAddUI walletLqtPlanAddUI2 = this.f208379b;
            C78017yd3 yd32 = walletLqtPlanAddUI2.f208003I;
            yd32.f228575h = bankcard.field_bindSerial;
            yd32.f228573f = bankcard.field_bankcardType;
            yd32.f228582r = bankcard.field_bankName;
            yd32.f228574g = bankcard.field_bankcardTail;
            walletLqtPlanAddUI2.mo98934P7();
            this.f208379b.mo98936R7();
            WalletLqtPlanAddUI.m84212J7(this.f208379b);
        }
    }
}
