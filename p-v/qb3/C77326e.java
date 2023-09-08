package qb3;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletCheckPwdUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import cr3.C75282g;
import cr3.C75296i;
import ob0.C117747y;
import rb3.C77504f;
import yq3.C79148e;

/* renamed from: qb3.e */
public class C77326e extends C79148e {

    /* renamed from: qb3.e$a */
    public class C77327a extends C75282g {
        public C77327a(MMActivity mMActivity, C75296i iVar) {
            super(mMActivity, iVar);
        }

        /* renamed from: d */
        public boolean mo91271d(Object... objArr) {
            if (C77326e.this.f232423c.getBoolean("key_is_show_detail", true)) {
                return false;
            }
            Bankcard bankcard = (Bankcard) C77326e.this.f232423c.getParcelable("key_bankcard");
            this.f221419b.mo105625d(new C77504f(bankcard.field_bankcardType, bankcard.field_bindSerial, C77326e.this.f232423c.getString("key_pwd1")), true);
            return true;
        }

        /* renamed from: e */
        public boolean mo91272e(int i, int i2, String str, C117747y yVar) {
            if (i != 0 || i2 != 0 || !(yVar instanceof C77504f)) {
                return false;
            }
            C77326e eVar = C77326e.this;
            eVar.mo91264o(this.f221418a, 0, eVar.f232423c);
            return true;
        }
    }

    /* renamed from: A */
    public C79148e mo91260A(Activity activity, Bundle bundle) {
        Log.m105918d("MicroMsg.ProcessManager", "start Process : UnbindProcess");
        if (bundle.getBoolean("key_is_show_detail", true)) {
            mo109105D(activity, "wallet", ".bind.ui.WalletBankcardDetailUI", bundle);
        } else {
            mo109103B(activity, WalletCheckPwdUI.class, bundle);
        }
        return this;
    }

    /* renamed from: c */
    public void mo91257c(Activity activity, int i) {
        mo96262m(activity);
    }

    /* renamed from: e */
    public String mo91258e() {
        return "WXCreditUnbindProcess";
    }

    /* renamed from: f */
    public void mo91259f(Activity activity, Bundle bundle) {
        Log.m105925i("MicroMsg.ProcessManager", " walletMallV2 switch is ：%s", Boolean.TRUE);
        mo109112j(activity, "mall", ".ui.MallIndexUIv2");
    }

    /* renamed from: o */
    public void mo91264o(Activity activity, int i, Bundle bundle) {
        if (activity.getClass().getSimpleName().equalsIgnoreCase("WalletBankcardDetailUI")) {
            mo109103B(activity, WalletCheckPwdUI.class, bundle);
        } else if (activity instanceof WalletCheckPwdUI) {
            mo91259f(activity, bundle);
        }
    }

    /* renamed from: p */
    public C75282g mo91265p(MMActivity mMActivity, C75296i iVar) {
        if (mMActivity instanceof WalletCheckPwdUI) {
            return new C77327a(mMActivity, iVar);
        }
        return null;
    }

    /* renamed from: t */
    public boolean mo91267t(Activity activity, Bundle bundle) {
        return false;
    }
}
