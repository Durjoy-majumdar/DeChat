package x43;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.plugin.wallet.loan.WalletLoanCheckPwdUI;
import com.tencent.p014mm.plugin.wallet.pay.p121ui.WalletLoanRepaymentUI;
import di3.C86312j;
import p281yz.C79173v;
import t53.C77866b;
import yq3.C79148e;

/* renamed from: x43.a */
public class C78769a extends C77866b {
    /* renamed from: A */
    public C79148e mo91260A(Activity activity, Bundle bundle) {
        if (((C79173v) C86312j.m106911c(C79173v.class)).Ex0().mo91341w()) {
            mo109103B(activity, WalletLoanCheckPwdUI.class, bundle);
        } else {
            super.mo91260A(activity, bundle);
        }
        return this;
    }

    /* renamed from: c */
    public void mo91257c(Activity activity, int i) {
        mo91259f(activity, this.f232423c);
    }

    /* renamed from: f */
    public void mo91259f(Activity activity, Bundle bundle) {
        mo109110h(activity, WalletLoanRepaymentUI.class, bundle.getBoolean("intent_bind_end", false) ? -1 : 0, (Intent) null, true);
    }
}
