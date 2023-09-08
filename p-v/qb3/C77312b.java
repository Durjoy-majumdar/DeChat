package qb3;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletCheckPwdUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import cr3.C75282g;
import cr3.C75296i;
import ob0.C117747y;
import v53.C78356x;
import yq3.C79148e;

/* renamed from: qb3.b */
public class C77312b extends C79148e {

    /* renamed from: qb3.b$a */
    public class C77313a extends C75282g {
        public C77313a(MMActivity mMActivity, C75296i iVar) {
            super(mMActivity, iVar);
        }

        /* renamed from: d */
        public boolean mo91271d(Object... objArr) {
            C77312b.this.f232423c.putString("key_pwd1", objArr[0]);
            this.f221419b.mo105625d(new C78356x(objArr[0], 5, ""), true);
            return true;
        }

        /* renamed from: e */
        public boolean mo91272e(int i, int i2, String str, C117747y yVar) {
            if (i != 0 || i2 != 0) {
                return false;
            }
            C77312b bVar = C77312b.this;
            bVar.mo91264o(this.f221418a, 0, bVar.f232423c);
            this.f221418a.finish();
            return true;
        }
    }

    /* renamed from: A */
    public C79148e mo91260A(Activity activity, Bundle bundle) {
        Log.m105918d("MicroMsg.WXCreditChangeAmountProcess", "start Process : WXCreditCheckPwdProcess");
        mo109103B(activity, WalletCheckPwdUI.class, bundle);
        return this;
    }

    /* renamed from: c */
    public void mo91257c(Activity activity, int i) {
        mo96262m(activity);
    }

    /* renamed from: e */
    public String mo91258e() {
        return "WXCreditCheckPwdProcess";
    }

    /* renamed from: f */
    public void mo91259f(Activity activity, Bundle bundle) {
        Log.m105925i("MicroMsg.WXCreditChangeAmountProcess", " walletMallV2 switch is ：%s", Boolean.TRUE);
        mo109112j(activity, "mall", ".ui.MallIndexUIv2");
    }

    /* renamed from: o */
    public void mo91264o(Activity activity, int i, Bundle bundle) {
        if (activity instanceof WalletCheckPwdUI) {
            C75228t.m90219L(activity, bundle.getString("key_url"), false);
        } else {
            mo91259f(activity, bundle);
        }
    }

    /* renamed from: p */
    public C75282g mo91265p(MMActivity mMActivity, C75296i iVar) {
        if (mMActivity instanceof WalletCheckPwdUI) {
            return new C77313a(mMActivity, iVar);
        }
        return null;
    }

    /* renamed from: t */
    public boolean mo91267t(Activity activity, Bundle bundle) {
        return false;
    }
}
