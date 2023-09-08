package com.tencent.p014mm.plugin.offline;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.plugin.offline.p085ui.WalletOfflineCoinPurseUI;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletVerifyCodeUI;
import j20.C117292a;
import k20.C9556a;
import yq3.C79148e;

/* renamed from: com.tencent.mm.plugin.offline.o */
public class C69964o extends C79148e {
    /* renamed from: A */
    public C79148e mo91260A(Activity activity, Bundle bundle) {
        mo109103B(activity, WalletVerifyCodeUI.class, bundle);
        return this;
    }

    /* renamed from: c */
    public void mo91257c(Activity activity, int i) {
    }

    /* renamed from: e */
    public String mo91258e() {
        return "VerifyProcess";
    }

    /* renamed from: f */
    public void mo91259f(Activity activity, Bundle bundle) {
        Intent intent = new Intent(activity, WalletOfflineCoinPurseUI.class);
        intent.addFlags(67108864);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(activity, aVar.mo10232b(), "com/tencent/mm/plugin/offline/VerifyProcess", "end", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(activity, "com/tencent/mm/plugin/offline/VerifyProcess", "end", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: o */
    public void mo91264o(Activity activity, int i, Bundle bundle) {
        if (activity instanceof WalletVerifyCodeUI) {
            mo91259f(activity, bundle);
        }
    }

    /* renamed from: t */
    public boolean mo91267t(Activity activity, Bundle bundle) {
        return false;
    }
}
