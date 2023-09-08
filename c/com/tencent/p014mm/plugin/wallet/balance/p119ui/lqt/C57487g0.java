package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.view.View;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import j20.C117292a;
import java.util.ArrayList;
import te3.C64483k33;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.g0 */
public class C57487g0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WalletLqtDetailUI f164700d;

    public C57487g0(WalletLqtDetailUI walletLqtDetailUI) {
        this.f164700d = walletLqtDetailUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$45", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C64483k33 k332 = this.f164700d.f207962f.f228721Y.f183519e;
        C75228t.m90224Q(k332.f183890i, k332.f183887f, 0, 1061);
        C115669n.INSTANCE.mo160131h(17084, 11);
        C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$45", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
