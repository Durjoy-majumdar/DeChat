package com.tencent.p014mm.plugin.wallet_payu.pwd.p894ui;

import android.os.Bundle;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletCheckPwdUI;
import com.tencent.p014mm.wallet_core.p137ui.formview.EditHintPasswdView;
import nj3.C88989a;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.wallet_payu.pwd.ui.WalletPayUCheckPwdUI */
public class WalletPayUCheckPwdUI extends WalletCheckPwdUI {
    public boolean needConfirmFinish() {
        return true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EditHintPasswdView editHintPasswdView = this.f210019d;
        if (editHintPasswdView != null) {
            editHintPasswdView.setEncrType(-10);
        }
    }
}
