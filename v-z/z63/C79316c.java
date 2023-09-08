package z63;

import android.view.View;
import com.tencent.p014mm.plugin.wallet_payu.security_question.p896ui.WalletPayUSecurityQuestionSettingUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: z63.c */
public class C79316c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WalletPayUSecurityQuestionSettingUI f232859d;

    public C79316c(WalletPayUSecurityQuestionSettingUI walletPayUSecurityQuestionSettingUI) {
        this.f232859d = walletPayUSecurityQuestionSettingUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet_payu/security_question/ui/WalletPayUSecurityQuestionSettingUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f232859d.f211187g.mo103923d();
        C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_payu/security_question/ui/WalletPayUSecurityQuestionSettingUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
