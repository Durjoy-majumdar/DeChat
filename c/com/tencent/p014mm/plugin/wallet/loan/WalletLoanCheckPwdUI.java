package com.tencent.p014mm.plugin.wallet.loan;

import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletCheckPwdUI;
import nj3.C88989a;
import ob0.C117747y;
import v53.C78357y;
import yq3.C79143a;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.wallet.loan.WalletLoanCheckPwdUI */
public class WalletLoanCheckPwdUI extends WalletCheckPwdUI {

    /* renamed from: com.tencent.mm.plugin.wallet.loan.WalletLoanCheckPwdUI$a */
    public class C71894a implements MenuItem.OnMenuItemClickListener {
        public C71894a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            C79143a.m95763b(WalletLoanCheckPwdUI.this, 0);
            return true;
        }
    }

    public int getForceOrientation() {
        return 1;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getProcess() != null) {
            setBackBtn(new C71894a());
        }
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (!(yVar instanceof C78357y) || (i == 0 && i2 == 0)) {
            return super.onSceneEnd(i, i2, str, yVar);
        }
        return false;
    }
}
