package qb3;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletCheckPwdUI;
import com.tencent.p014mm.plugin.wxcredit.p132ui.WalletWXCreditChangeAmountResultUI;
import com.tencent.p014mm.plugin.wxcredit.p132ui.WalletWXCreditChangeAmountUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import cr3.C75282g;
import cr3.C75296i;
import ob0.C117747y;
import rb3.C77501c;
import rb3.C77503e;
import v53.C78356x;
import yq3.C79148e;

/* renamed from: qb3.a */
public class C77309a extends C79148e {

    /* renamed from: qb3.a$a */
    public class C77310a extends C75282g {
        public C77310a(MMActivity mMActivity, C75296i iVar) {
            super(mMActivity, iVar);
        }

        /* renamed from: d */
        public boolean mo91271d(Object... objArr) {
            this.f221419b.mo105625d(new C77503e(((Bankcard) C77309a.this.f232423c.getParcelable("key_bankcard")).field_bindSerial), true);
            return true;
        }

        /* renamed from: e */
        public boolean mo91272e(int i, int i2, String str, C117747y yVar) {
            if (i == 0 && i2 == 0) {
                if (yVar instanceof C77503e) {
                    C77309a.this.f232423c.putString("kreq_token", ((C77503e) yVar).f225987e);
                    return false;
                } else if (yVar instanceof C77501c) {
                    C77309a.this.f232423c.putDouble("key_credit_amount", ((C77501c) yVar).f225984d);
                    C77309a aVar = C77309a.this;
                    aVar.mo91264o(this.f221418a, 0, aVar.f232423c);
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: qb3.a$b */
    public class C77311b extends C75282g {
        public C77311b(MMActivity mMActivity, C75296i iVar) {
            super(mMActivity, iVar);
        }

        /* renamed from: d */
        public boolean mo91271d(Object... objArr) {
            C77309a.this.f232423c.putString("key_pwd1", objArr[0]);
            this.f221419b.mo105625d(new C78356x(objArr[0], 5, ""), true);
            return true;
        }

        /* renamed from: e */
        public boolean mo91272e(int i, int i2, String str, C117747y yVar) {
            if (i != 0 || i2 != 0) {
                return false;
            }
            C77309a aVar = C77309a.this;
            aVar.mo91264o(this.f221418a, 0, aVar.f232423c);
            this.f221418a.finish();
            return true;
        }
    }

    /* renamed from: A */
    public C79148e mo91260A(Activity activity, Bundle bundle) {
        Log.m105918d("MicroMsg.WXCreditChangeAmountProcess", "start Process : WXCreditChangeAmountProcess");
        mo109103B(activity, WalletCheckPwdUI.class, bundle);
        return this;
    }

    /* renamed from: c */
    public void mo91257c(Activity activity, int i) {
        mo96262m(activity);
    }

    /* renamed from: e */
    public String mo91258e() {
        return "WXCreditChangeAmountProcess";
    }

    /* renamed from: f */
    public void mo91259f(Activity activity, Bundle bundle) {
        mo109112j(activity, "wallet", ".bind.ui.WalletBankcardManageUI");
    }

    /* renamed from: o */
    public void mo91264o(Activity activity, int i, Bundle bundle) {
        if (activity instanceof WalletCheckPwdUI) {
            mo109103B(activity, WalletWXCreditChangeAmountUI.class, bundle);
        } else if (activity instanceof WalletWXCreditChangeAmountUI) {
            mo109103B(activity, WalletWXCreditChangeAmountResultUI.class, bundle);
        } else if (activity instanceof WalletWXCreditChangeAmountResultUI) {
            mo91259f(activity, bundle);
        }
    }

    /* renamed from: p */
    public C75282g mo91265p(MMActivity mMActivity, C75296i iVar) {
        if (mMActivity instanceof WalletWXCreditChangeAmountUI) {
            return new C77310a(mMActivity, iVar);
        }
        if (mMActivity instanceof WalletCheckPwdUI) {
            return new C77311b(mMActivity, iVar);
        }
        return null;
    }

    /* renamed from: t */
    public boolean mo91267t(Activity activity, Bundle bundle) {
        return false;
    }
}
