package com.tencent.p014mm.plugin.wallet_payu.security_question.p896ui;

import com.tencent.p014mm.plugin.wallet_payu.security_question.p896ui.WalletPayUSecurityQuestionAnswerUI;
import com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView;

/* renamed from: com.tencent.mm.plugin.wallet_payu.security_question.ui.a */
public class C72588a implements WalletFormView.C75209c {

    /* renamed from: d */
    public final /* synthetic */ WalletPayUSecurityQuestionAnswerUI f211195d;

    public C72588a(WalletPayUSecurityQuestionAnswerUI walletPayUSecurityQuestionAnswerUI) {
        this.f211195d = walletPayUSecurityQuestionAnswerUI;
    }

    public void onInputValidChange(boolean z) {
        WalletPayUSecurityQuestionAnswerUI.C72586a aVar = this.f211195d.f211181h;
        if (WalletPayUSecurityQuestionAnswerUI.this.f211178e.mo105094l()) {
            WalletPayUSecurityQuestionAnswerUI.this.f211179f.setEnabled(true);
        } else {
            WalletPayUSecurityQuestionAnswerUI.this.f211179f.setEnabled(false);
        }
    }
}
