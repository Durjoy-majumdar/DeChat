package i53;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import b63.C67210w;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.wallet.pwd.p122ui.WalletResetPwdAdapterUI;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletCheckPwdUI;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletPwdConfirmUI;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletSetPasswordUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import cr3.C75282g;
import cr3.C75296i;
import j53.C46432p;
import nj3.C76879j;
import ob0.C117747y;
import v53.C78356x;
import yq3.C79148e;

/* renamed from: i53.b */
public class C76294b extends C79148e {

    /* renamed from: i53.b$a */
    public class C76295a extends C75282g {
        public C76295a(C76294b bVar, MMActivity mMActivity, C75296i iVar) {
            super(mMActivity, iVar);
        }

        /* renamed from: a */
        public CharSequence mo91282a(int i) {
            if (i == 0) {
                return this.f221418a.getString(C0966R.string.f361552kr0);
            }
            if (i != 1) {
                return null;
            }
            return this.f221418a.getString(C0966R.string.f361595l33);
        }

        /* renamed from: d */
        public boolean mo91271d(Object... objArr) {
            this.f221419b.mo105625d(new C78356x(objArr[0], 3, objArr[1]), true);
            return true;
        }

        /* renamed from: e */
        public boolean mo91272e(int i, int i2, String str, C117747y yVar) {
            return false;
        }
    }

    /* renamed from: i53.b$b */
    public class C76296b extends C75282g {

        /* renamed from: i53.b$b$a */
        public class C76297a implements DialogInterface.OnClickListener {
            public C76297a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C76294b.this.f232423c.putInt("RESET_PWD_USER_ACTION", 2);
                C76296b bVar = C76296b.this;
                C76294b bVar2 = C76294b.this;
                bVar2.mo91264o(bVar.f221418a, 0, bVar2.f232423c);
            }
        }

        public C76296b(MMActivity mMActivity, C75296i iVar) {
            super(mMActivity, iVar);
        }

        /* renamed from: d */
        public boolean mo91271d(Object... objArr) {
            C67210w wVar = objArr[0];
            C76294b.this.f232423c.getString("key_pwd1");
            this.f221419b.mo105625d(new C46432p(wVar.f192984b, wVar.f192986d), true);
            return true;
        }

        /* renamed from: e */
        public boolean mo91272e(int i, int i2, String str, C117747y yVar) {
            if (i == 0 && i2 == 0) {
                if (yVar instanceof C46432p) {
                    C76294b.this.f232423c.putInt("RESET_PWD_USER_ACTION", 1);
                    C76294b bVar = C76294b.this;
                    bVar.mo91264o(this.f221418a, 0, bVar.f232423c);
                    MMActivity mMActivity = this.f221418a;
                    C76879j.m92726T(mMActivity, mMActivity.getString(C0966R.string.l2l));
                }
                return true;
            } else if (!(yVar instanceof C46432p)) {
                return false;
            } else {
                C76879j.m92713G(this.f221418a, str, "", false, new C76297a());
                return true;
            }
        }
    }

    /* renamed from: i53.b$c */
    public class C76298c implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ WalletBaseUI f223490d;

        public C76298c(WalletBaseUI walletBaseUI) {
            this.f223490d = walletBaseUI;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C76294b bVar = C76294b.this;
            bVar.mo91259f(this.f223490d, bVar.f232423c);
            if (this.f223490d.isTransparent()) {
                this.f223490d.finish();
            }
            this.f223490d.clearErr();
        }
    }

    /* renamed from: A */
    public C79148e mo91260A(Activity activity, Bundle bundle) {
        Log.m105918d("MicroMsg.ResetPwdProcessByToken", "start Process : ResetPwdProcessByToken");
        mo109103B(activity, WalletSetPasswordUI.class, bundle);
        return this;
    }

    /* renamed from: c */
    public void mo91257c(Activity activity, int i) {
        if (activity instanceof WalletPwdConfirmUI) {
            mo109108d(activity, WalletSetPasswordUI.class, (Bundle) null, i);
        }
    }

    /* renamed from: e */
    public String mo91258e() {
        return "ResetPwdProcessByToken";
    }

    /* renamed from: f */
    public void mo91259f(Activity activity, Bundle bundle) {
        Intent intent = new Intent(activity, WalletResetPwdAdapterUI.class);
        intent.putExtra("RESET_PWD_USER_ACTION", bundle.getInt("RESET_PWD_USER_ACTION", 0));
        mo109110h(activity, WalletResetPwdAdapterUI.class, -1, intent, false);
    }

    /* renamed from: o */
    public void mo91264o(Activity activity, int i, Bundle bundle) {
        if (activity instanceof WalletSetPasswordUI) {
            mo109103B(activity, WalletPwdConfirmUI.class, bundle);
        } else if (activity instanceof WalletPwdConfirmUI) {
            mo91259f(activity, bundle);
        }
    }

    /* renamed from: p */
    public C75282g mo91265p(MMActivity mMActivity, C75296i iVar) {
        if (mMActivity instanceof WalletCheckPwdUI) {
            return new C76295a(this, mMActivity, iVar);
        }
        if (mMActivity instanceof WalletPwdConfirmUI) {
            return new C76296b(mMActivity, iVar);
        }
        return null;
    }

    /* renamed from: q */
    public int mo91266q(MMActivity mMActivity, int i) {
        return C0966R.string.l95;
    }

    /* renamed from: t */
    public boolean mo91267t(Activity activity, Bundle bundle) {
        return false;
    }

    /* renamed from: w */
    public boolean mo91268w(WalletBaseUI walletBaseUI, int i, String str) {
        if (i != 404) {
            return false;
        }
        C76879j.m92711E(walletBaseUI, str, (String) null, walletBaseUI.getString(C0966R.string.l95), false, new C76298c(walletBaseUI));
        return true;
    }
}
