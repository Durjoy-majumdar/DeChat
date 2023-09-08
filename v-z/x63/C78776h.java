package x63;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.wallet_payu.pwd.p894ui.WalletPayUCheckPwdUI;
import com.tencent.p014mm.plugin.wallet_payu.pwd.p894ui.WalletPayUPwdConfirmUI;
import com.tencent.p014mm.plugin.wallet_payu.pwd.p894ui.WalletPayUSetPasswordUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import cr3.C75282g;
import cr3.C75296i;
import ob0.C117747y;
import yq3.C79143a;
import yq3.C79148e;

/* renamed from: x63.h */
public class C78776h extends C78774f {

    /* renamed from: x63.h$a */
    public class C78777a extends C78771a {
        public C78777a(C78776h hVar, MMActivity mMActivity, C75296i iVar, Bundle bundle) {
            super(mMActivity, iVar, bundle);
        }

        /* renamed from: a */
        public CharSequence mo91282a(int i) {
            if (i == 0) {
                return this.f221418a.getString(C0966R.string.f361553kr1);
            }
            return null;
        }
    }

    /* renamed from: x63.h$b */
    public class C78778b extends C75282g {
        public C78778b(MMActivity mMActivity, C75296i iVar) {
            super(mMActivity, iVar);
        }

        /* renamed from: d */
        public boolean mo91271d(Object... objArr) {
            this.f221419b.mo95362b(new C53292b(C78776h.this.f232423c.getString("key_pwd1"), objArr[0].f192984b), true);
            return true;
        }

        /* renamed from: e */
        public boolean mo91272e(int i, int i2, String str, C117747y yVar) {
            if (yVar instanceof C53292b) {
                Log.m105918d("MicroMsg.PayUModifyPasswordProcess", "hy: change pwd user success");
                if (i == 0 && i2 == 0) {
                    C78776h.this.f232423c.putInt("key_errcode_payu", 0);
                    C79143a.m95764c(this.f221418a, C78776h.this.f232423c, 0);
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: A */
    public C79148e mo91260A(Activity activity, Bundle bundle) {
        mo109103B(activity, WalletPayUCheckPwdUI.class, bundle);
        return this;
    }

    /* renamed from: e */
    public String mo91258e() {
        return "PayUModifyPasswordProcess";
    }

    /* renamed from: o */
    public void mo91264o(Activity activity, int i, Bundle bundle) {
        if (activity instanceof WalletPayUCheckPwdUI) {
            mo109103B(activity, WalletPayUSetPasswordUI.class, bundle);
        } else if (activity instanceof WalletPayUSetPasswordUI) {
            mo109103B(activity, WalletPayUPwdConfirmUI.class, bundle);
        }
    }

    /* renamed from: p */
    public C75282g mo91265p(MMActivity mMActivity, C75296i iVar) {
        if (mMActivity instanceof WalletPayUCheckPwdUI) {
            return new C78777a(this, mMActivity, iVar, this.f232423c);
        }
        boolean z = mMActivity instanceof WalletPayUPwdConfirmUI;
        if (z) {
            return new C78778b(mMActivity, iVar);
        }
        if (z) {
            return new C78773e(this, mMActivity, iVar);
        }
        return null;
    }
}
