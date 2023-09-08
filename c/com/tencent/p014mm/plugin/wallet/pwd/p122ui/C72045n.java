package com.tencent.p014mm.plugin.wallet.pwd.p122ui;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C75217h;

/* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.n */
public class C72045n implements C75217h {

    /* renamed from: a */
    public final /* synthetic */ WalletLockCheckPwdUI f208998a;

    /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.n$a */
    public class C72046a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f208999d;

        public C72046a(boolean z) {
            this.f208999d = z;
        }

        public void run() {
            if (this.f208999d) {
                C72045n.this.f208998a.f208856d.fullScroll(130);
            } else {
                C72045n.this.f208998a.f208856d.fullScroll(33);
            }
        }
    }

    public C72045n(WalletLockCheckPwdUI walletLockCheckPwdUI) {
        this.f208998a = walletLockCheckPwdUI;
    }

    public void onVisibleStateChange(boolean z) {
        Log.m105919d("MicroMsg.WalletLockCheckPwdUI", "kb visibility: %s", Boolean.valueOf(z));
        this.f208998a.f208856d.post(new C72046a(z));
    }
}
