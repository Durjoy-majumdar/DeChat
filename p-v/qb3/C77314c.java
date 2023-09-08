package qb3;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletCheckPwdUI;
import com.tencent.p014mm.plugin.wxcredit.p132ui.WalletWXCreditDetailUI;
import com.tencent.p014mm.plugin.wxcredit.p132ui.WalletWXCreditErrDetailUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import cr3.C75282g;
import cr3.C75296i;
import ob0.C117747y;
import rb3.C77502d;
import rb3.C77504f;
import v53.C78342e0;
import yq3.C79148e;

/* renamed from: qb3.c */
public class C77314c extends C79148e {

    /* renamed from: qb3.c$a */
    public class C77315a extends C75282g {
        public C77315a(C77314c cVar, MMActivity mMActivity, C75296i iVar) {
            super(mMActivity, iVar);
        }

        /* renamed from: c */
        public boolean mo91280c(Object... objArr) {
            Bankcard bankcard = objArr[0];
            this.f221419b.mo105625d(new C77502d(bankcard.field_bindSerial, true, bankcard.field_bankcardType), true);
            return true;
        }

        /* renamed from: d */
        public boolean mo91271d(Object... objArr) {
            return false;
        }

        /* renamed from: e */
        public boolean mo91272e(int i, int i2, String str, C117747y yVar) {
            return false;
        }
    }

    /* renamed from: qb3.c$b */
    public class C77316b extends C75282g {
        public C77316b(MMActivity mMActivity, C75296i iVar) {
            super(mMActivity, iVar);
        }

        /* renamed from: c */
        public boolean mo91280c(Object... objArr) {
            Bankcard bankcard = objArr[0];
            this.f221419b.mo105625d(new C77502d(bankcard.field_bindSerial, true, bankcard.field_bankcardType), true);
            return true;
        }

        /* renamed from: d */
        public boolean mo91271d(Object... objArr) {
            Bankcard bankcard = (Bankcard) C77314c.this.f232423c.getParcelable("key_bankcard");
            this.f221419b.mo105625d(new C77504f(bankcard.field_bankcardType, bankcard.field_bindSerial, objArr[0]), true);
            return true;
        }

        /* renamed from: e */
        public boolean mo91272e(int i, int i2, String str, C117747y yVar) {
            if (i != 0 || i2 != 0) {
                return false;
            }
            if (yVar instanceof C77504f) {
                this.f221419b.mo95362b(new C78342e0((String) null, 0), true);
            } else if (yVar instanceof C78342e0) {
                C77314c cVar = C77314c.this;
                cVar.mo91259f(this.f221418a, cVar.f232423c);
            }
            return true;
        }
    }

    /* renamed from: A */
    public C79148e mo91260A(Activity activity, Bundle bundle) {
        Log.m105918d("MicroMsg.WXCreditManagerProcess", "start Process : WXCreditManagerProcess");
        mo109103B(activity, WalletWXCreditDetailUI.class, bundle);
        return this;
    }

    /* renamed from: c */
    public void mo91257c(Activity activity, int i) {
        mo96262m(activity);
    }

    /* renamed from: e */
    public String mo91258e() {
        return "WXCreditManagerProcess";
    }

    /* renamed from: f */
    public void mo91259f(Activity activity, Bundle bundle) {
        Log.m105925i("MicroMsg.WXCreditManagerProcess", " walletMallV2 switch is ：%s", Boolean.TRUE);
        mo109112j(activity, "mall", ".ui.MallIndexUIv2");
    }

    /* renamed from: o */
    public void mo91264o(Activity activity, int i, Bundle bundle) {
        Class<WalletCheckPwdUI> cls = WalletCheckPwdUI.class;
        if (i == 1) {
            mo109103B(activity, WalletWXCreditErrDetailUI.class, bundle);
            activity.finish();
        } else if (activity instanceof WalletWXCreditDetailUI) {
            mo109103B(activity, cls, bundle);
        } else if (activity instanceof WalletCheckPwdUI) {
            mo91259f(activity, bundle);
        } else if (activity instanceof WalletWXCreditErrDetailUI) {
            mo109103B(activity, cls, bundle);
        }
    }

    /* renamed from: p */
    public C75282g mo91265p(MMActivity mMActivity, C75296i iVar) {
        if (mMActivity instanceof WalletWXCreditDetailUI) {
            return new C77315a(this, mMActivity, iVar);
        }
        if (mMActivity instanceof WalletCheckPwdUI) {
            return new C77316b(mMActivity, iVar);
        }
        return null;
    }

    /* renamed from: t */
    public boolean mo91267t(Activity activity, Bundle bundle) {
        return false;
    }
}
