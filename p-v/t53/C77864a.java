package t53;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletBankcardIdUI;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletCardElementUI;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletConfirmCardIDUI;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletOrderInfoUI;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletPwdConfirmUI;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletSetPasswordUI;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletVerifyCodeUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import nj3.C76879j;
import yq3.C79148e;

/* renamed from: t53.a */
public abstract class C77864a extends C79148e {

    /* renamed from: t53.a$a */
    public class C77865a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ WalletBaseUI f226889d;

        public C77865a(WalletBaseUI walletBaseUI) {
            this.f226889d = walletBaseUI;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C77864a aVar = C77864a.this;
            aVar.mo91259f(this.f226889d, aVar.f232423c);
            if (this.f226889d.isTransparent()) {
                this.f226889d.finish();
            }
            this.f226889d.clearErr();
        }
    }

    /* renamed from: c */
    public void mo91257c(Activity activity, int i) {
        mo109107a("back", activity, Integer.valueOf(i));
        if (activity instanceof WalletPwdConfirmUI) {
            mo109108d(activity, WalletSetPasswordUI.class, (Bundle) null, i);
        } else {
            mo96262m(activity);
        }
    }

    /* renamed from: o */
    public void mo91264o(Activity activity, int i, Bundle bundle) {
        mo109107a("forward", activity, Integer.valueOf(i), bundle);
        if ((activity instanceof WalletBankcardIdUI) || (activity instanceof WalletConfirmCardIDUI)) {
            mo109103B(activity, WalletCardElementUI.class, bundle);
        } else if (activity instanceof WalletVerifyCodeUI) {
            mo109103B(activity, WalletSetPasswordUI.class, bundle);
        } else if (activity instanceof WalletSetPasswordUI) {
            mo109103B(activity, WalletPwdConfirmUI.class, bundle);
        } else if (activity instanceof WalletOrderInfoUI) {
            mo91259f(activity, bundle);
        }
    }

    /* renamed from: q */
    public int mo91266q(MMActivity mMActivity, int i) {
        return C0966R.string.kun;
    }

    /* renamed from: w */
    public boolean mo91268w(WalletBaseUI walletBaseUI, int i, String str) {
        if (i != 404) {
            return false;
        }
        Log.m105924i("MicroMsg.ProcessManager", "404 bind error, cancel bind!");
        C76879j.m92711E(walletBaseUI, str, (String) null, walletBaseUI.getString(C0966R.string.kno), false, new C77865a(walletBaseUI));
        return true;
    }
}
