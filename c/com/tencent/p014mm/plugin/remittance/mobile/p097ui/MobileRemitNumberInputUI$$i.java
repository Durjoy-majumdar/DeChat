package com.tencent.p014mm.plugin.remittance.mobile.p097ui;

import com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView;
import java.lang.ref.WeakReference;

/* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitNumberInputUI$$i */
public class MobileRemitNumberInputUI$$i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WeakReference f203902d;

    /* renamed from: e */
    public final /* synthetic */ MobileRemitNumberInputUI f203903e;

    public MobileRemitNumberInputUI$$i(MobileRemitNumberInputUI mobileRemitNumberInputUI, WeakReference weakReference) {
        this.f203903e = mobileRemitNumberInputUI;
        this.f203902d = weakReference;
    }

    public void run() {
        WalletFormView walletFormView = (WalletFormView) this.f203902d.get();
        if (walletFormView != null) {
            walletFormView.getContentEt().requestFocus();
            this.f203903e.showVKB();
        }
    }
}
