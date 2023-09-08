package com.tencent.p014mm.plugin.wallet_core.id_verify;

import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView;

/* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.v */
public class C72166v implements C0120a0<String> {

    /* renamed from: d */
    public final /* synthetic */ WcPayRealnameVerifyIdInputUI f209342d;

    public C72166v(WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI) {
        this.f209342d = wcPayRealnameVerifyIdInputUI;
    }

    public void onChanged(Object obj) {
        String str = (String) obj;
        WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI = this.f209342d;
        if (wcPayRealnameVerifyIdInputUI.f209200z) {
            WalletFormView walletFormView = wcPayRealnameVerifyIdInputUI.f209185h;
            walletFormView.setText(this.f209342d.f209159A.f209239o.getValue() + this.f209342d.f209159A.f209240p.getValue());
        }
    }
}
