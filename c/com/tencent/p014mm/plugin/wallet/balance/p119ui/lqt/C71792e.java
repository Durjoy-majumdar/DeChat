package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.view.View;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt.LqtSaveKeyboardToolBarLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import j20.C117292a;
import java.util.ArrayList;
import te3.C49175do3;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.e */
public final class C71792e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ LqtSaveKeyboardToolBarLayout f208320d;

    /* renamed from: e */
    public final /* synthetic */ C49175do3 f208321e;

    public C71792e(LqtSaveKeyboardToolBarLayout lqtSaveKeyboardToolBarLayout, C49175do3 do32) {
        this.f208320d = lqtSaveKeyboardToolBarLayout;
        this.f208321e = do32;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet/balance/ui/lqt/LqtSaveKeyboardToolBarLayout$getAmountTextView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        LqtSaveKeyboardToolBarLayout.C71714a onSelectAmount = this.f208320d.getOnSelectAmount();
        if (onSelectAmount != null) {
            int i = this.f208321e.f132457d;
            WalletLqtSaveFetchUI walletLqtSaveFetchUI = ((WalletLqtSaveFetchUI$$a) onSelectAmount).f208223a;
            int i2 = WalletLqtSaveFetchUI.f208151m1;
            walletLqtSaveFetchUI.getClass();
            C115669n.INSTANCE.mo160131h(17084, 34, Integer.valueOf(i));
            Log.m105925i("MicroMsg.WalletLqtSaveFetchUI", "keyboard toolbar select amount: %d", Integer.valueOf(i));
            if (i % 100 == 0) {
                walletLqtSaveFetchUI.f208199i.setText(String.valueOf(i / 100));
            } else {
                walletLqtSaveFetchUI.f208199i.setText(C75228t.m90260n(((double) i) / 100.0d));
            }
            walletLqtSaveFetchUI.f208199i.getContentEt().requestFocus();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/LqtSaveKeyboardToolBarLayout$getAmountTextView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
