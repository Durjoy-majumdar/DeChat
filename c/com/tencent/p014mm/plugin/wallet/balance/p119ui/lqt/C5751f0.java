package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.f0 */
public class C5751f0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ViewGroup f21803d;

    /* renamed from: e */
    public final /* synthetic */ WalletLqtDetailUI f21804e;

    public C5751f0(WalletLqtDetailUI walletLqtDetailUI, ViewGroup viewGroup) {
        this.f21804e = walletLqtDetailUI;
        this.f21803d = viewGroup;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$44", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C75228t.m90221N(this.f21804e, (String) this.f21803d.getTag(), false);
        C115669n.INSTANCE.mo160131h(17084, 11);
        C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$44", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
