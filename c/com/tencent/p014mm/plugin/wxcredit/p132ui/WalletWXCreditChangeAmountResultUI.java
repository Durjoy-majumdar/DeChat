package com.tencent.p014mm.plugin.wxcredit.p132ui;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import ob0.C117747y;

/* renamed from: com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditChangeAmountResultUI */
public class WalletWXCreditChangeAmountResultUI extends WalletBaseUI {

    /* renamed from: com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditChangeAmountResultUI$a */
    public class C72650a implements MenuItem.OnMenuItemClickListener {
        public C72650a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            WalletWXCreditChangeAmountResultUI.this.getProcess().mo91264o(WalletWXCreditChangeAmountResultUI.this.getContext(), 0, WalletWXCreditChangeAmountResultUI.this.getInput());
            return true;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cgt;
    }

    public void initView() {
        ((TextView) findViewById(C0966R.C0970id.ljw)).setText(C75228t.m90256l(getInput().getDouble("key_credit_amount")));
        showHomeBtn(false);
        enableBackMenu(false);
        addTextOptionMenu(0, getString(C0966R.string.f8014z_), new C72650a());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        return false;
    }
}
