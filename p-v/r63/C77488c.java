package r63;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.wallet.bind.p120ui.WalletBankcardDetailUI;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.plugin.wallet_payu.bind.p892ui.WalletPayUBankcardDetailUI;
import com.tencent.p014mm.plugin.wallet_payu.pwd.p894ui.WalletPayUCheckPwdUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import cr3.C75282g;
import cr3.C75296i;
import nj3.C76912y0;
import ob0.C117747y;
import v43.C78334a;
import x63.C78772c;

/* renamed from: r63.c */
public class C77488c extends C78334a {

    /* renamed from: r63.c$a */
    public class C77489a extends C75282g {
        public C77489a(MMActivity mMActivity, C75296i iVar) {
            super(mMActivity, iVar);
        }

        /* renamed from: a */
        public CharSequence mo91282a(int i) {
            if (i == 0) {
                return this.f221418a.getString(C0966R.string.kr_);
            }
            return null;
        }

        /* renamed from: d */
        public boolean mo91271d(Object... objArr) {
            C77488c.this.f232423c.putString("key_pwd1", objArr[0]);
            this.f221419b.mo95362b(new C78772c(C77488c.this.f232423c.getString("key_pwd1")), true);
            return true;
        }

        /* renamed from: e */
        public boolean mo91272e(int i, int i2, String str, C117747y yVar) {
            if (yVar instanceof C78772c) {
                if (i2 == 0 && i == 0) {
                    C78772c cVar = (C78772c) yVar;
                    C77488c.this.f232423c.putString("payu_reference", cVar.f230509d);
                    if (!Util.isNullOrNil(cVar.f230509d)) {
                        Log.m105918d("MicroMsg.PayUUnbindProcess", "hy: check pwd pass");
                        Bankcard bankcard = (Bankcard) C77488c.this.f232423c.getParcelable("key_bankcard");
                        if (bankcard != null) {
                            this.f221419b.mo95362b(new C47927b(bankcard.field_bindSerial, C77488c.this.f232423c.getString("payu_reference")), true);
                        }
                    } else {
                        Log.m105928w("MicroMsg.PayUUnbindProcess", "hy: check pwd failed");
                    }
                }
            } else if ((yVar instanceof C47927b) && i == 0 && i2 == 0) {
                C77488c.this.f232423c.putInt("key_errcode_payu", 0);
                C77488c cVar2 = C77488c.this;
                cVar2.mo91259f(this.f221418a, cVar2.f232423c);
            }
            return false;
        }
    }

    /* renamed from: F */
    public void mo107655F(Activity activity, Bundle bundle) {
        mo109103B(activity, WalletPayUBankcardDetailUI.class, bundle);
    }

    /* renamed from: f */
    public void mo91259f(Activity activity, Bundle bundle) {
        if (this.f232423c.getInt("key_errcode_payu", -1) == 0) {
            C76912y0.makeText((Context) activity, (int) C0966R.string.l0y, 0).show();
        } else {
            C76912y0.makeText((Context) activity, (int) C0966R.string.kso, 0).show();
        }
        Log.m105925i("MicroMsg.PayUUnbindProcess", " walletMallV2 switch is ：%s", Boolean.TRUE);
        mo109112j(activity, "mall", ".ui.MallIndexUIv2");
    }

    /* renamed from: o */
    public void mo91264o(Activity activity, int i, Bundle bundle) {
        if (activity instanceof WalletBankcardDetailUI) {
            mo109103B(activity, WalletPayUCheckPwdUI.class, bundle);
        } else if (activity instanceof WalletPayUCheckPwdUI) {
            mo91259f(activity, bundle);
        }
    }

    /* renamed from: p */
    public C75282g mo91265p(MMActivity mMActivity, C75296i iVar) {
        return mMActivity instanceof WalletPayUCheckPwdUI ? new C77489a(mMActivity, iVar) : super.mo91265p(mMActivity, iVar);
    }

    /* renamed from: t */
    public boolean mo91267t(Activity activity, Bundle bundle) {
        return false;
    }
}
