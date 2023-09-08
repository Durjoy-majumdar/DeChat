package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt.WalletLqtSaveFetchUI;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import hp3.C87581a;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.i2 */
public class C71801i2 implements C87581a<Void, Void> {

    /* renamed from: a */
    public final /* synthetic */ List f208332a;

    /* renamed from: b */
    public final /* synthetic */ WalletLqtSaveFetchUI.C7176546 f208333b;

    public C71801i2(WalletLqtSaveFetchUI.C7176546 r1, List list) {
        this.f208333b = r1;
        this.f208332a = list;
    }

    public Object call(Object obj) {
        boolean z;
        Void voidR = (Void) obj;
        WalletLqtSaveFetchUI walletLqtSaveFetchUI = WalletLqtSaveFetchUI.this;
        int i = WalletLqtSaveFetchUI.f208151m1;
        Iterator<Bankcard> it = walletLqtSaveFetchUI.mo98977P7().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Bankcard next = it.next();
            Iterator it4 = this.f208332a.iterator();
            while (true) {
                if (it4.hasNext()) {
                    if (next.field_bindSerial.equals(((Bankcard) it4.next()).field_bindSerial)) {
                        z = true;
                        continue;
                        break;
                    }
                } else {
                    z = false;
                    continue;
                    break;
                }
            }
            if (!z) {
                WalletLqtSaveFetchUI walletLqtSaveFetchUI2 = WalletLqtSaveFetchUI.this;
                walletLqtSaveFetchUI2.f208181X = next.field_bindSerial;
                walletLqtSaveFetchUI2.f208183Y = next;
                break;
            }
        }
        WalletLqtSaveFetchUI.this.mo98979R7(false);
        return null;
    }
}
