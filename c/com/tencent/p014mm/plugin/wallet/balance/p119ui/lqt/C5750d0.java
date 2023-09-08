package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.view.View;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import te3.C64483k33;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.d0 */
public class C5750d0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WalletLqtDetailUI f21802d;

    public C5750d0(WalletLqtDetailUI walletLqtDetailUI) {
        this.f21802d = walletLqtDetailUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$42", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105925i("MicroMsg.WalletLqtDetailUI", "click security entry, url type is : %d", Integer.valueOf(this.f21802d.f207962f.f228722Z.f183889h));
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo160131h(17084, 21);
        C64483k33 k332 = this.f21802d.f207962f.f228722Z;
        int i = k332.f183889h;
        if (i == 2) {
            String str = k332.f183887f;
            Log.m105925i("MicroMsg.WalletLqtDetailUI", "jump to h5 with url : %s", str);
            C75228t.m90221N(this.f21802d, str, false);
        } else if (i == 3) {
            String str2 = k332.f183890i;
            String str3 = k332.f183887f;
            Log.m105925i("MicroMsg.WalletLqtDetailUI", "jump to tinyapp with username : %s, path : %s", str2, str3);
            C75228t.m90224Q(str2, str3, 0, 1061);
        }
        if (this.f21802d.f207940R0.getVisibility() == 0) {
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_PAY_LQT_SECURITY_REDDOT_TIME_INT_SYNC, -1);
            Log.m105924i("MicroMsg.WalletLqtDetailUI", "report click security reddot");
            nVar.mo160131h(17084, 23);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$42", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
