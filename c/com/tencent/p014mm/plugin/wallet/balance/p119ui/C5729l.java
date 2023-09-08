package com.tencent.p014mm.plugin.wallet.balance.p119ui;

import android.app.Dialog;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.l */
public class C5729l implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Dialog f21755d;

    public C5729l(WalletBalanceFetchUI walletBalanceFetchUI, Dialog dialog) {
        this.f21755d = dialog;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceFetchUI$30", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.WalletBalanceFetchUI", "showIdentifyInfoCompleteDialog closeIcon click");
        Dialog dialog = this.f21755d;
        if (dialog != null && dialog.isShowing()) {
            this.f21755d.dismiss();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceFetchUI$30", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
