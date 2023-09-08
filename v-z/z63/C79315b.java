package z63;

import com.tencent.p014mm.plugin.wallet_payu.security_question.model.PayUSecurityQuestion;
import com.tencent.p014mm.plugin.wallet_payu.security_question.p896ui.WalletPayUSecurityQuestionSettingUI;
import java.util.ArrayList;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: z63.b */
public class C79315b implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ WalletPayUSecurityQuestionSettingUI f232858d;

    public C79315b(WalletPayUSecurityQuestionSettingUI walletPayUSecurityQuestionSettingUI) {
        this.f232858d = walletPayUSecurityQuestionSettingUI;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        e0Var.clear();
        WalletPayUSecurityQuestionSettingUI walletPayUSecurityQuestionSettingUI = this.f232858d;
        int i = WalletPayUSecurityQuestionSettingUI.f211183j;
        ArrayList parcelableArrayList = walletPayUSecurityQuestionSettingUI.getInput().getParcelableArrayList("key_security_question_list");
        if (parcelableArrayList != null) {
            for (int i2 = 0; i2 < parcelableArrayList.size(); i2++) {
                e0Var.add((CharSequence) ((PayUSecurityQuestion) parcelableArrayList.get(i2)).f211176e);
            }
        }
    }
}
