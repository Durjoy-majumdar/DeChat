package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.content.Context;
import android.content.DialogInterface;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.LinkedList;
import nj3.C76879j;
import qo3.C77407n;
import te3.C64842xx2;
import te3.C78017yd3;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.j1 */
public class C71802j1 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ C78017yd3 f208334d;

    /* renamed from: e */
    public final /* synthetic */ WalletLqtPlanDetailUI f208335e;

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.j1$a */
    public class C71803a implements DialogInterface.OnClickListener {
        public C71803a(C71802j1 j1Var) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    public C71802j1(WalletLqtPlanDetailUI walletLqtPlanDetailUI, C78017yd3 yd32) {
        this.f208335e = walletLqtPlanDetailUI;
        this.f208334d = yd32;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        C64842xx2 xx22 = this.f208334d.f228579o;
        if (xx22 != null) {
            if (!xx22.f186414d || Util.isNullOrNil(xx22.f186415e)) {
                WalletLqtPlanDetailUI walletLqtPlanDetailUI = this.f208335e;
                C78017yd3 yd32 = this.f208334d;
                LinkedList<Integer> linkedList = yd32.f228579o.f186416f;
                int i = WalletLqtPlanDetailUI.f208058D;
                walletLqtPlanDetailUI.getClass();
                Log.m105925i("MicroMsg.WalletLqtPlanDetailUI", "show operation menu: %s", linkedList);
                if (linkedList != null && !linkedList.isEmpty()) {
                    C77407n nVar = new C77407n((Context) walletLqtPlanDetailUI.getContext(), 1, false);
                    nVar.f225771i = new C5752k1(walletLqtPlanDetailUI, linkedList);
                    nVar.f225782p = new C71806l1(walletLqtPlanDetailUI, yd32);
                    nVar.mo107573q();
                }
            } else {
                C76879j.m92754y(this.f208335e.getContext(), this.f208334d.f228579o.f186415e, "", this.f208335e.getString(C0966R.string.f8029zr), new C71803a(this));
            }
        }
        return false;
    }
}
