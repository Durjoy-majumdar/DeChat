package com.tencent.p014mm.plugin.wallet_payu.security_question.p896ui;

import android.view.View;
import com.tencent.p014mm.plugin.wallet_payu.security_question.p896ui.WalletPayUSecurityQuestionSettingUI;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import yq3.C79143a;

/* renamed from: com.tencent.mm.plugin.wallet_payu.security_question.ui.d */
public class C72591d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WalletPayUSecurityQuestionSettingUI f211198d;

    public C72591d(WalletPayUSecurityQuestionSettingUI walletPayUSecurityQuestionSettingUI) {
        this.f211198d = walletPayUSecurityQuestionSettingUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet_payu/security_question/ui/WalletPayUSecurityQuestionSettingUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        WalletPayUSecurityQuestionSettingUI.C72587a aVar = this.f211198d.f211189i;
        boolean z = true;
        if (!(!Util.isNullOrNil(WalletPayUSecurityQuestionSettingUI.this.f211184d.f211194g)) || !WalletPayUSecurityQuestionSettingUI.this.f211185e.mo105094l()) {
            z = false;
        }
        if (z) {
            this.f211198d.getInput().putString("key_question_id", this.f211198d.f211188h);
            this.f211198d.getInput().putString("key_question_answer", this.f211198d.f211185e.getText());
            WalletPayUSecurityQuestionSettingUI walletPayUSecurityQuestionSettingUI = this.f211198d;
            C79143a.m95765d(walletPayUSecurityQuestionSettingUI, walletPayUSecurityQuestionSettingUI.getInput());
        } else {
            WalletPayUSecurityQuestionSettingUI.C72587a.m84958a(this.f211198d.f211189i);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_payu/security_question/ui/WalletPayUSecurityQuestionSettingUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
