package com.tencent.p014mm.plugin.wallet_payu.pwd.p894ui;

import android.os.Bundle;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletSetPasswordUI;
import com.tencent.p014mm.wallet_core.p137ui.formview.EditHintPasswdView;

/* renamed from: com.tencent.mm.plugin.wallet_payu.pwd.ui.WalletPayUSetPasswordUI */
public class WalletPayUSetPasswordUI extends WalletSetPasswordUI {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EditHintPasswdView editHintPasswdView = this.f210285d;
        if (editHintPasswdView != null) {
            editHintPasswdView.setEncrType(20);
        }
    }
}
