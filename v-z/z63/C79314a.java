package z63;

import android.view.View;
import com.tencent.p014mm.plugin.wallet_payu.security_question.p896ui.WalletPayUSecurityQuestionAnswerUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: z63.a */
public class C79314a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WalletPayUSecurityQuestionAnswerUI f232857d;

    public C79314a(WalletPayUSecurityQuestionAnswerUI walletPayUSecurityQuestionAnswerUI) {
        this.f232857d = walletPayUSecurityQuestionAnswerUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet_payu/security_question/ui/WalletPayUSecurityQuestionAnswerUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f232857d.f211178e.mo105094l()) {
            this.f232857d.getInput().putString("key_question_answer", this.f232857d.f211178e.getText());
            this.f232857d.getNetController().mo91271d(new Object[0]);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_payu/security_question/ui/WalletPayUSecurityQuestionAnswerUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
