package com.tencent.p014mm.plugin.wallet_payu.security_question.p896ui;

import android.os.Bundle;
import android.widget.Button;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wallet_payu.security_question.model.PayUSecurityQuestion;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView;
import nj3.C88989a;
import ob0.C117747y;
import z63.C79314a;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.wallet_payu.security_question.ui.WalletPayUSecurityQuestionAnswerUI */
public class WalletPayUSecurityQuestionAnswerUI extends WalletBaseUI {

    /* renamed from: d */
    public WalletPayUSecurityQuestionView f211177d;

    /* renamed from: e */
    public WalletFormView f211178e;

    /* renamed from: f */
    public Button f211179f;

    /* renamed from: g */
    public PayUSecurityQuestion f211180g;

    /* renamed from: h */
    public C72586a f211181h;

    /* renamed from: com.tencent.mm.plugin.wallet_payu.security_question.ui.WalletPayUSecurityQuestionAnswerUI$a */
    public class C72586a {
        public C72586a() {
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bmh;
    }

    public boolean needConfirmFinish() {
        return true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f211181h = new C72586a();
        this.f211177d = (WalletPayUSecurityQuestionView) findViewById(C0966R.C0970id.htw);
        WalletFormView walletFormView = (WalletFormView) findViewById(C0966R.C0970id.htv);
        this.f211178e = walletFormView;
        if (walletFormView == null) {
            Log.m105920e("MicroMsg.CommonHintViewConfig", "hy: param error");
        } else {
            walletFormView.setIsSecretAnswer(true);
        }
        this.f211179f = (Button) findViewById(C0966R.C0970id.htu);
        this.f211178e.setOnInputValidChangeListener(new C72588a(this));
        this.f211179f.setOnClickListener(new C79314a(this));
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (i != 0 || i2 != 0) {
            return false;
        }
        this.f211180g = (PayUSecurityQuestion) getInput().getParcelable("key_security_question");
        Log.m105918d("MicroMsg.WalletPayUSecurityQuestionAnswerUI", "hy: updating view");
        PayUSecurityQuestion payUSecurityQuestion = this.f211180g;
        if (payUSecurityQuestion != null) {
            this.f211177d.setQuestionText(payUSecurityQuestion.f211176e);
        }
        this.f211178e.mo105071c();
        return false;
    }
}
