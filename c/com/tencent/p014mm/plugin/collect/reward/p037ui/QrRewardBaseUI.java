package com.tencent.p014mm.plugin.collect.reward.p037ui;

import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;

/* renamed from: com.tencent.mm.plugin.collect.reward.ui.QrRewardBaseUI */
public abstract class QrRewardBaseUI extends WalletBaseUI {

    /* renamed from: com.tencent.mm.plugin.collect.reward.ui.QrRewardBaseUI$a */
    public class C40897a implements MenuItem.OnMenuItemClickListener {
        public C40897a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            QrRewardBaseUI.this.hideVKB();
            QrRewardBaseUI.this.hideTenpayKB();
            QrRewardBaseUI.this.finish();
            return false;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        hideActionbarLine();
        setBackBtn(new C40897a(), C0966R.raw.actionbar_icon_dark_back);
    }
}
