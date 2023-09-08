package com.tencent.p014mm.plugin.wallet_payu.security_question.p896ui;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.wallet_payu.security_question.model.PayUSecurityQuestion;
import com.tencent.p014mm.plugin.wallet_payu.security_question.p896ui.WalletPayUSecurityQuestionSettingUI;
import nj3.C11184p0;

/* renamed from: com.tencent.mm.plugin.wallet_payu.security_question.ui.b */
public class C72589b implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ WalletPayUSecurityQuestionSettingUI f211196d;

    public C72589b(WalletPayUSecurityQuestionSettingUI walletPayUSecurityQuestionSettingUI) {
        this.f211196d = walletPayUSecurityQuestionSettingUI;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        WalletPayUSecurityQuestionSettingUI walletPayUSecurityQuestionSettingUI = this.f211196d;
        walletPayUSecurityQuestionSettingUI.f211184d.setQuestionText(((PayUSecurityQuestion) walletPayUSecurityQuestionSettingUI.getInput().getParcelableArrayList("key_security_question_list").get(i)).f211176e);
        WalletPayUSecurityQuestionSettingUI walletPayUSecurityQuestionSettingUI2 = this.f211196d;
        walletPayUSecurityQuestionSettingUI2.f211188h = ((PayUSecurityQuestion) walletPayUSecurityQuestionSettingUI2.getInput().getParcelableArrayList("key_security_question_list").get(i)).f211175d;
        this.f211196d.f211185e.mo105071c();
        WalletPayUSecurityQuestionSettingUI.C72587a.m84958a(this.f211196d.f211189i);
    }
}
