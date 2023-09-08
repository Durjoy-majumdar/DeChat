package com.tencent.p014mm.plugin.wallet.pwd.p122ui;

import com.tencent.p014mm.wallet_core.p137ui.formview.EditHintPasswdView;
import j53.C33517e;
import j53.C46433r;
import v53.C78356x;

/* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.m */
public class C72044m implements EditHintPasswdView.C75206c {

    /* renamed from: a */
    public final /* synthetic */ WalletLockCheckPwdUI f208997a;

    public C72044m(WalletLockCheckPwdUI walletLockCheckPwdUI) {
        this.f208997a = walletLockCheckPwdUI;
    }

    public void onInputValidChange(boolean z) {
        String str;
        if (z && (str = this.f208997a.f208862j) != null) {
            if (str.equals("action.close_wallet_lock")) {
                WalletLockCheckPwdUI walletLockCheckPwdUI = this.f208997a;
                walletLockCheckPwdUI.getClass();
                walletLockCheckPwdUI.doSceneForceProgress(new C33517e(walletLockCheckPwdUI.f208857e.getText()));
                return;
            }
            int i = 8;
            if (this.f208997a.f208862j.equals("action.verify_paypwd")) {
                WalletLockCheckPwdUI walletLockCheckPwdUI2 = this.f208997a;
                int i2 = walletLockCheckPwdUI2.f208861i;
                if (i2 == 1) {
                    i = 6;
                } else if (i2 != 2) {
                    i = -1;
                }
                walletLockCheckPwdUI2.f208858f = new C78356x(this.f208997a.f208857e.getText(), i, this.f208997a.getPayReqKey());
                WalletLockCheckPwdUI walletLockCheckPwdUI3 = this.f208997a;
                walletLockCheckPwdUI3.doSceneForceProgress(walletLockCheckPwdUI3.f208858f);
            } else if (this.f208997a.f208862j.equals("action.touchlock_verify_by_paypwd")) {
                this.f208997a.doSceneForceProgress(new C46433r(this.f208997a.f208857e.getText()));
            } else if (this.f208997a.f208862j.equals("action.touchlock_need_verify_paypwd")) {
                WalletLockCheckPwdUI walletLockCheckPwdUI4 = this.f208997a;
                if (walletLockCheckPwdUI4.f208861i != 2) {
                    i = -1;
                }
                walletLockCheckPwdUI4.f208858f = new C78356x(this.f208997a.f208857e.getText(), i, this.f208997a.getPayReqKey());
                WalletLockCheckPwdUI walletLockCheckPwdUI5 = this.f208997a;
                walletLockCheckPwdUI5.doSceneForceProgress(walletLockCheckPwdUI5.f208858f);
            }
        }
    }
}
