package x63;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.wallet_payu.pwd.p894ui.WalletPayUPwdConfirmUI;
import com.tencent.p014mm.plugin.wallet_payu.pwd.p894ui.WalletPayUSetPasswordUI;
import com.tencent.p014mm.plugin.wallet_payu.security_question.p896ui.WalletPayUSecurityQuestionAnswerUI;
import cr3.C75282g;
import cr3.C75296i;
import y63.C79057a;
import yq3.C79148e;

/* renamed from: x63.g */
public class C78775g extends C78774f {
    /* renamed from: A */
    public C79148e mo91260A(Activity activity, Bundle bundle) {
        mo109103B(activity, WalletPayUSecurityQuestionAnswerUI.class, bundle);
        return this;
    }

    /* renamed from: e */
    public String mo91258e() {
        return "PayUForgotPwdProcess";
    }

    /* renamed from: o */
    public void mo91264o(Activity activity, int i, Bundle bundle) {
        if (activity instanceof WalletPayUSecurityQuestionAnswerUI) {
            mo109103B(activity, WalletPayUSetPasswordUI.class, bundle);
        } else if (activity instanceof WalletPayUSetPasswordUI) {
            mo109103B(activity, WalletPayUPwdConfirmUI.class, bundle);
        }
    }

    /* renamed from: p */
    public C75282g mo91265p(MMActivity mMActivity, C75296i iVar) {
        if (mMActivity instanceof WalletPayUSecurityQuestionAnswerUI) {
            return new C79057a(mMActivity, iVar, this.f232423c);
        }
        if (mMActivity instanceof WalletPayUPwdConfirmUI) {
            return new C78773e(this, mMActivity, iVar);
        }
        return null;
    }
}
