package i53;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import b63.C67203r0;
import b63.C67210w;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet.pwd.p122ui.WalletForgotPwdBindNewUI;
import com.tencent.p014mm.plugin.wallet.pwd.p122ui.WalletForgotPwdSelectUI;
import com.tencent.p014mm.plugin.wallet.pwd.p122ui.WalletForgotPwdUI;
import com.tencent.p014mm.plugin.wallet.pwd.p122ui.WalletForgotPwdVerifyIdUI;
import com.tencent.p014mm.plugin.wallet_core.model.Authen;
import com.tencent.p014mm.plugin.wallet_core.model.Orders;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletBankcardIdUI;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletCardElementUI;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletConfirmCardIDUI;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletPwdConfirmUI;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletSetPasswordUI;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletVerifyCodeUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import cr3.C75282g;
import cr3.C75296i;
import di3.C86312j;
import j20.C117292a;
import j53.C33518j;
import j53.C76391n;
import j53.C76392o;
import j53.C76393q;
import j53.C76394s;
import k20.C9556a;
import nj3.C76879j;
import ob0.C117747y;
import p281yz.C79173v;
import t53.C77864a;
import v53.C78342e0;
import y43.C79029b0;
import yq3.C79148e;

/* renamed from: i53.a */
public class C76286a extends C77864a {

    /* renamed from: d */
    public C76293g f223481d;

    /* renamed from: e */
    public C76392o f223482e;

    /* renamed from: i53.a$a */
    public class C76287a extends C75282g {
        public C76287a(C76286a aVar, MMActivity mMActivity, C75296i iVar) {
            super(mMActivity, iVar);
        }

        /* renamed from: d */
        public boolean mo91271d(Object... objArr) {
            return false;
        }

        /* renamed from: e */
        public boolean mo91272e(int i, int i2, String str, C117747y yVar) {
            Class cls = C79173v.class;
            if (i == 0 && i2 == 0 && (yVar instanceof C78342e0)) {
                C67203r0 jo = ((C79173v) C86312j.m106911c(cls)).Dx0().mo105873jo();
                Log.m105925i("MicroMsg.ProcessManager", "hy: reset_pwd_flag: %s, find_pwd_url: %s", jo.field_reset_passwd_flag, jo.field_find_passwd_url);
                C67203r0 r0Var = ((C79173v) C86312j.m106911c(cls)).Ex0().f192953f;
                String str2 = r0Var != null ? r0Var.field_forget_passwd_url : "";
                if (!Util.isNullOrNil(str2)) {
                    Log.m105925i("MicroMsg.ProcessManager", "jump to forget url: %s", str2);
                    C75228t.m90219L(this.f221418a, str2, false);
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: i53.a$b */
    public class C76288b extends C75282g {
        public C76288b(C76286a aVar, MMActivity mMActivity, C75296i iVar) {
            super(mMActivity, iVar);
        }

        /* renamed from: d */
        public boolean mo91271d(Object... objArr) {
            if (objArr != null && objArr.length == 3) {
                this.f221419b.mo95362b(new C76394s(objArr[0].toString(), objArr[1].intValue(), objArr[2], 1), true);
            }
            return true;
        }

        /* renamed from: e */
        public boolean mo91272e(int i, int i2, String str, C117747y yVar) {
            return false;
        }
    }

    /* renamed from: i53.a$c */
    public class C76289c extends C75282g {
        public C76289c(MMActivity mMActivity, C75296i iVar) {
            super(mMActivity, iVar);
        }

        /* renamed from: d */
        public boolean mo91271d(Object... objArr) {
            Authen authen = objArr[0];
            Orders orders = objArr[1];
            if (!C76286a.this.mo109116r()) {
                authen.f209367d = 1;
            } else {
                authen.f209367d = 4;
            }
            this.f221419b.mo105625d(new C76392o(authen, C76286a.this.f232423c.getBoolean("key_is_reset_with_new_card", false), C76286a.this.f232423c.getBoolean("key_is_paymanager") ? 1 : 0), true);
            return true;
        }

        /* renamed from: e */
        public boolean mo91272e(int i, int i2, String str, C117747y yVar) {
            if (i != 0 || i2 != 0 || !(yVar instanceof C76392o)) {
                return false;
            }
            C76392o oVar = (C76392o) yVar;
            C76286a.this.f232423c.putString("kreq_token", oVar.f223691e);
            C76286a aVar = C76286a.this;
            aVar.f223482e = oVar;
            if (oVar.f223692f) {
                return true;
            }
            aVar.mo91264o(this.f221418a, 0, aVar.f232423c);
            return true;
        }
    }

    /* renamed from: i53.a$d */
    public class C76290d extends C75282g {
        public C76290d(MMActivity mMActivity, C75296i iVar) {
            super(mMActivity, iVar);
        }

        /* renamed from: a */
        public CharSequence mo91282a(int i) {
            return this.f221418a.getString(C0966R.string.l_c);
        }

        /* renamed from: d */
        public boolean mo91271d(Object... objArr) {
            C67210w wVar = objArr[1];
            wVar.f192983a = "3";
            this.f221419b.mo105625d(new C76393q(wVar), true);
            return true;
        }

        /* renamed from: e */
        public boolean mo91272e(int i, int i2, String str, C117747y yVar) {
            if (i != 0 || i2 != 0 || !(yVar instanceof C76392o)) {
                return false;
            }
            C76286a.this.f232423c.putString("kreq_token", ((C76392o) yVar).f223691e);
            return true;
        }

        /* renamed from: f */
        public boolean mo91281f(Object... objArr) {
            C76392o oVar = C76286a.this.f223482e;
            if (oVar == null) {
                return true;
            }
            oVar.resend();
            this.f221419b.mo95362b(C76286a.this.f223482e, false);
            return true;
        }
    }

    /* renamed from: i53.a$e */
    public class C76291e extends C75282g {
        public C76291e(MMActivity mMActivity, C75296i iVar) {
            super(mMActivity, iVar);
        }

        /* renamed from: d */
        public boolean mo91271d(Object... objArr) {
            C67210w wVar = objArr[0];
            if (C76286a.this.f232423c.getBoolean("key_is_set_pwd_after_face_action")) {
                Log.m105924i("MicroMsg.ProcessManager", "WalletPwdConfirmUI controller onNext, after face verify, reset pwd by face");
                this.f221419b.mo105625d(new C33518j(C76286a.this.f232423c.getString("key_face_action_result_token"), wVar.f192984b), true);
            } else {
                Log.m105924i("MicroMsg.ProcessManager", "WalletPwdConfirmUI controller onNext, not after face verify, reset pwd normal");
                this.f221419b.mo105625d(new C76391n(wVar), true);
            }
            return true;
        }

        /* renamed from: e */
        public boolean mo91272e(int i, int i2, String str, C117747y yVar) {
            if (i != 0 || i2 != 0 || (!(yVar instanceof C76391n) && !(yVar instanceof C33518j))) {
                return false;
            }
            C76286a aVar = C76286a.this;
            aVar.mo91264o(this.f221418a, 0, aVar.f232423c);
            return true;
        }
    }

    /* renamed from: i53.a$f */
    public class C76292f implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ WalletBaseUI f223486d;

        public C76292f(WalletBaseUI walletBaseUI) {
            this.f223486d = walletBaseUI;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C76286a aVar = C76286a.this;
            aVar.mo91259f(this.f223486d, aVar.f232423c);
            if (this.f223486d.isTransparent()) {
                this.f223486d.finish();
            }
            this.f223486d.clearErr();
        }
    }

    /* renamed from: i53.a$g */
    public interface C76293g {
        void run(int i);
    }

    /* renamed from: A */
    public C79148e mo91260A(Activity activity, Bundle bundle) {
        Log.m105918d("MicroMsg.ProcessManager", "start Process : ForgotPwdProcess");
        this.f232423c.putBoolean("key_is_oversea", !C79029b0.vx0().wx0().mo91338t());
        this.f232423c.putInt("key_support_bankcard", C79029b0.vx0().wx0().mo91338t() ? 1 : 2);
        this.f232423c.putBoolean("key_is_forgot_process", true);
        boolean z = bundle.getBoolean("isFromKinda");
        boolean z2 = bundle.getBoolean("isDomesticUser");
        if (C79029b0.vx0().wx0().mo91338t() || (z && z2)) {
            mo109103B(activity, WalletForgotPwdVerifyIdUI.class, bundle);
        } else {
            mo109103B(activity, WalletForgotPwdUI.class, bundle);
        }
        return this;
    }

    /* renamed from: e */
    public String mo91258e() {
        return "ForgotPwdProcess";
    }

    /* renamed from: f */
    public void mo91259f(Activity activity, Bundle bundle) {
        if (C79029b0.vx0().wx0().mo91338t()) {
            mo109111i(activity, WalletForgotPwdVerifyIdUI.class, -1, false);
            C76293g gVar = this.f223481d;
            if (gVar != null) {
                gVar.run(0);
                return;
            }
            return;
        }
        mo109111i(activity, WalletForgotPwdUI.class, -1, false);
        C76293g gVar2 = this.f223481d;
        if (gVar2 != null) {
            gVar2.run(-1);
        }
    }

    /* renamed from: o */
    public void mo91264o(Activity activity, int i, Bundle bundle) {
        Activity activity2 = activity;
        Bundle bundle2 = bundle;
        Class<WalletForgotPwdUI> cls = WalletForgotPwdUI.class;
        Class<WalletSetPasswordUI> cls2 = WalletSetPasswordUI.class;
        if (activity2 instanceof WalletForgotPwdUI) {
            if (!bundle2.containsKey("key_is_force_bind") || !bundle2.getBoolean("key_is_force_bind")) {
                mo109103B(activity2, WalletCardElementUI.class, bundle2);
            } else {
                mo109103B(activity2, WalletForgotPwdBindNewUI.class, bundle2);
            }
        } else if (activity2 instanceof WalletCardElementUI) {
            if (!mo109116r()) {
                mo109103B(activity2, WalletVerifyCodeUI.class, bundle2);
            } else {
                mo109103B(activity2, cls2, bundle2);
            }
        } else if (activity2 instanceof WalletVerifyCodeUI) {
            mo109103B(activity2, cls2, bundle2);
        } else if (activity2 instanceof WalletSetPasswordUI) {
            mo109103B(activity2, WalletPwdConfirmUI.class, bundle2);
        } else if (activity2 instanceof WalletPwdConfirmUI) {
            mo91259f(activity2, bundle2);
        } else if ((activity2 instanceof WalletBankcardIdUI) || (activity2 instanceof WalletConfirmCardIDUI)) {
            Class<WalletCardElementUI> cls3 = WalletCardElementUI.class;
            mo109107a("startActivity2", activity2, cls3, bundle2, "flag: 67108864");
            Intent intent = new Intent(activity2, cls3);
            intent.putExtra("process_id", C76286a.class.hashCode());
            intent.addFlags(67108864);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(activity, aVar.mo10232b(), "com/tencent/mm/wallet_core/WalletProcess", "startActivity", "(Landroid/app/Activity;Ljava/lang/Class;ILandroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity2.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(activity, "com/tencent/mm/wallet_core/WalletProcess", "startActivity", "(Landroid/app/Activity;Ljava/lang/Class;ILandroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            if (bundle2 != null) {
                this.f232423c.putAll(bundle2);
            }
            Log.m105918d("MicroMsg.ProcessManager", "bankcard tag :" + this.f232423c.getInt("key_support_bankcard", 1));
        } else if (activity2 instanceof WalletForgotPwdVerifyIdUI) {
            if (!bundle2.containsKey("key_is_support_face") || bundle2.getInt("key_is_support_face") != 1) {
                Log.m105924i("MicroMsg.ProcessManager", "forward not support face");
                mo109103B(activity2, cls, bundle2);
                return;
            }
            Log.m105924i("MicroMsg.ProcessManager", "forward support face");
            C115669n.INSTANCE.mo160131h(15774, Integer.valueOf(this.f232423c.getInt("key_forgot_scene", 1)), 1);
            mo109103B(activity2, WalletForgotPwdSelectUI.class, bundle2);
        } else if (!(activity2 instanceof WalletForgotPwdSelectUI)) {
        } else {
            if (!bundle2.containsKey("key_select_bank_card") || !bundle2.getBoolean("key_select_bank_card")) {
                Log.m105924i("MicroMsg.ProcessManager", "forward after face check");
                mo109103B(activity2, cls2, bundle2);
                return;
            }
            Log.m105924i("MicroMsg.ProcessManager", "forward select bankcard");
            mo109103B(activity2, cls, bundle2);
        }
    }

    /* renamed from: p */
    public C75282g mo91265p(MMActivity mMActivity, C75296i iVar) {
        if (mMActivity instanceof WalletForgotPwdUI) {
            return new C76287a(this, mMActivity, iVar);
        }
        if (mMActivity instanceof WalletForgotPwdVerifyIdUI) {
            return new C76288b(this, mMActivity, iVar);
        }
        if (mMActivity instanceof WalletCardElementUI) {
            return new C76289c(mMActivity, iVar);
        }
        if (mMActivity instanceof WalletVerifyCodeUI) {
            return new C76290d(mMActivity, iVar);
        }
        if (mMActivity instanceof WalletPwdConfirmUI) {
            return new C76291e(mMActivity, iVar);
        }
        return null;
    }

    /* renamed from: q */
    public int mo91266q(MMActivity mMActivity, int i) {
        return C0966R.string.kta;
    }

    /* renamed from: t */
    public boolean mo91267t(Activity activity, Bundle bundle) {
        return activity instanceof WalletPwdConfirmUI;
    }

    /* renamed from: w */
    public boolean mo91268w(WalletBaseUI walletBaseUI, int i, String str) {
        if (i != 404) {
            return false;
        }
        C76879j.m92711E(walletBaseUI, str, (String) null, walletBaseUI.getString(C0966R.string.kta), false, new C76292f(walletBaseUI));
        return true;
    }
}
