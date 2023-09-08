package qb3;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import b63.C67209v;
import b63.C67210w;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.wallet_core.model.Authen;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletCheckPwdUI;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletPwdConfirmUI;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletSetPasswordUI;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletVerifyCodeUI;
import com.tencent.p014mm.plugin.wallet_core.utils.C72517z;
import com.tencent.p014mm.plugin.wxcredit.p132ui.WalletBindDepositUI;
import com.tencent.p014mm.plugin.wxcredit.p132ui.WalletCheckIdentityUI;
import com.tencent.p014mm.plugin.wxcredit.p132ui.WalletWXCreditOpenResultUI;
import com.tencent.p014mm.plugin.wxcredit.p132ui.WalletWXCreditOpenUI;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import cr3.C75282g;
import cr3.C75296i;
import di3.C86312j;
import nj3.C76879j;
import ob0.C117747y;
import p281yz.C79173v;
import rb3.C77499a;
import rb3.C77500b;
import rb3.C77505g;
import rb3.C77506h;
import u53.C78130a;
import u53.C78131b;
import v53.C78342e0;
import v53.C78355w;
import v53.C78358z;
import yq3.C79148e;

/* renamed from: qb3.d */
public class C77317d extends C79148e {

    /* renamed from: qb3.d$a */
    public class C77318a extends C75282g {
        public C77318a(MMActivity mMActivity, C75296i iVar) {
            super(mMActivity, iVar);
        }

        /* renamed from: d */
        public boolean mo91271d(Object... objArr) {
            int i = 0;
            C77317d.this.f232423c.putString("key_pwd1", objArr[0]);
            C75296i iVar = this.f221419b;
            String str = objArr[0];
            String str2 = objArr[1];
            if (str2 != null) {
                i = Util.safeParseInt(str2);
            }
            iVar.mo105625d(new C77500b(str, i, C77317d.this.f232423c.getString("key_bank_type")), true);
            return true;
        }

        /* renamed from: e */
        public boolean mo91272e(int i, int i2, String str, C117747y yVar) {
            if (i != 0 || i2 != 0) {
                return false;
            }
            if (yVar instanceof C77500b) {
                C77500b bVar = (C77500b) yVar;
                C77317d.this.f232423c.putString("KEY_SESSION_KEY", bVar.f225980d);
                C77317d.this.f232423c.putString("key_pre_name", bVar.f225981e);
                C77317d.this.f232423c.putString("key_pre_indentity", bVar.f225982f);
                C77317d.this.f232423c.putBoolean("key_has_indentity_info", bVar.f225983g);
            }
            C77317d dVar = C77317d.this;
            dVar.mo91264o(this.f221418a, 0, dVar.f232423c);
            return true;
        }
    }

    /* renamed from: qb3.d$b */
    public class C77319b extends C75282g {
        public C77319b(MMActivity mMActivity, C75296i iVar) {
            super(mMActivity, iVar);
        }

        /* renamed from: d */
        public boolean mo91271d(Object... objArr) {
            String str = objArr[0];
            String str2 = objArr[1];
            C77317d.this.f232423c.putString("key_name", str);
            C77317d.this.f232423c.putString("key_indentity", str2);
            this.f221419b.mo105625d(new C77499a(str, str2, C77317d.this.f232423c.getString("KEY_SESSION_KEY"), C77317d.this.f232423c.getString("key_bank_type")), true);
            return true;
        }

        /* renamed from: e */
        public boolean mo91272e(int i, int i2, String str, C117747y yVar) {
            if (i != 0 || i2 != 0) {
                return false;
            }
            if (yVar instanceof C77499a) {
                C77499a aVar = (C77499a) yVar;
                C77317d.this.f232423c.putString("KEY_SESSION_KEY", aVar.f225976e);
                C77317d.this.f232423c.putString("key_mobile", aVar.f225979h);
                C77317d.this.f232423c.putBoolean("key_need_bind_deposit", aVar.f225977f);
                C77317d.this.f232423c.putBoolean("key_is_bank_user", aVar.f225978g);
            }
            C77317d dVar = C77317d.this;
            dVar.mo91264o(this.f221418a, 0, dVar.f232423c);
            return true;
        }
    }

    /* renamed from: qb3.d$c */
    public class C77320c extends C75282g {
        public C77320c(MMActivity mMActivity, C75296i iVar) {
            super(mMActivity, iVar);
        }

        /* renamed from: a */
        public CharSequence mo91282a(int i) {
            if (C77317d.this.f232423c.getBoolean("key_is_bank_user", false)) {
                MMActivity mMActivity = this.f221418a;
                String str = ((Bankcard) C77317d.this.f232423c.getParcelable("key_bankcard")).field_bankName;
                return mMActivity.getString(C0966R.string.l_o, new Object[]{str, str, C77317d.this.f232423c.getString("key_mobile")});
            }
            return this.f221418a.getString(C0966R.string.l_p, new Object[]{C77317d.this.f232423c.getString("key_mobile")});
        }

        /* renamed from: d */
        public boolean mo91271d(Object... objArr) {
            String str = objArr[0];
            C77317d.this.f232423c.putString("key_verify_code", str);
            if (((C79173v) C86312j.m106911c(C79173v.class)).Ex0().mo91341w()) {
                if (!C77317d.this.f232423c.getBoolean("key_need_bind_deposit", true) || C77317d.this.f232423c.getBoolean("key_is_bank_user")) {
                    this.f221419b.mo105625d(new C77505g(str, C77317d.this.f232423c.getString("KEY_SESSION_KEY"), C77317d.this.f232423c.getString("key_pwd1"), C77317d.this.f232423c.getString("key_bind_serial"), C77317d.this.f232423c.getString("key_bank_type")), true);
                } else {
                    C67210w wVar = objArr[1];
                    wVar.f192983a = "2";
                    this.f221419b.mo105625d(new C78355w(wVar), true);
                }
            } else if (C77317d.this.f232423c.getBoolean("key_is_bank_user", false)) {
                C77317d.this.f232423c.putString("key_verify_code", str);
                this.f221419b.mo105625d(new C77506h(str, C77317d.this.f232423c.getString("KEY_SESSION_KEY"), C77317d.this.f232423c.getString("key_pwd1"), C77317d.this.f232423c.getString("key_bind_serial"), C77317d.this.f232423c.getString("key_bank_type")), true);
            } else {
                C67210w wVar2 = objArr[1];
                wVar2.f192983a = "1";
                this.f221419b.mo105625d(new C78355w(wVar2), true);
            }
            return true;
        }

        /* renamed from: e */
        public boolean mo91272e(int i, int i2, String str, C117747y yVar) {
            Class cls = C79173v.class;
            if (i == 0 && i2 == 0) {
                if (yVar instanceof C77505g) {
                    String str2 = ((C77505g) yVar).f225989d;
                    if (!Util.isNullOrNil(str2)) {
                        C77317d.this.f232423c.putString("key_bank_username", str2);
                    }
                    C77317d dVar = C77317d.this;
                    dVar.mo91264o(this.f221418a, 0, dVar.f232423c);
                    return true;
                } else if (yVar instanceof C77506h) {
                    C77317d dVar2 = C77317d.this;
                    dVar2.mo91264o(this.f221418a, 0, dVar2.f232423c);
                    return true;
                } else if (yVar instanceof C78355w) {
                    if (((C79173v) C86312j.m106911c(cls)).Ex0().mo91341w()) {
                        this.f221419b.mo105625d(new C78342e0((String) null, 0), true);
                        return true;
                    }
                    C77317d dVar3 = C77317d.this;
                    dVar3.mo91264o(this.f221418a, 0, dVar3.f232423c);
                    return true;
                } else if (yVar instanceof C78342e0) {
                    this.f221419b.mo105625d(new C77505g(C77317d.this.f232423c.getString("key_verify_code"), C77317d.this.f232423c.getString("KEY_SESSION_KEY"), C77317d.this.f232423c.getString("key_pwd1"), ((C79173v) C86312j.m106911c(cls)).Ex0().mo91322d(), C77317d.this.f232423c.getString("key_bank_type")), true);
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: qb3.d$d */
    public class C77321d extends C75282g {

        /* renamed from: c */
        public Authen f225446c;

        /* renamed from: qb3.d$d$a */
        public class C77322a implements DialogInterface.OnClickListener {
            public C77322a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                Log.m105924i("MicroMsg.OpenWXCreditProcess", "NetSceneTenpayBindBankcard dialog lOk");
                C77321d.this.f221419b.mo105625d(new C78130a(C77321d.this.f225446c, "1", ""), true);
                C67209v.m79539a(1);
            }
        }

        /* renamed from: qb3.d$d$b */
        public class C77323b implements DialogInterface.OnClickListener {
            public C77323b(C77321d dVar) {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                Log.m105924i("MicroMsg.OpenWXCreditProcess", "NetSceneTenpayBindBankcard dialog lCancel");
                C67209v.m79539a(0);
            }
        }

        public C77321d(MMActivity mMActivity, C75296i iVar) {
            super(mMActivity, iVar);
        }

        /* renamed from: d */
        public boolean mo91271d(Object... objArr) {
            C72517z.m84857e();
            Authen authen = new Authen();
            this.f225446c = authen;
            authen.f209376p = objArr[0];
            authen.f209370g = objArr[1];
            int i = 2;
            authen.f209375o = objArr[2];
            C77317d.this.f232423c.putString("key_bank_phone", objArr[3]);
            Authen authen2 = this.f225446c;
            if (!((C79173v) C86312j.m106911c(C79173v.class)).Ex0().mo91341w()) {
                i = 1;
            }
            authen2.f209367d = i;
            Authen authen3 = this.f225446c;
            authen3.f209374n = 1;
            authen3.f209382v = (PayInfo) C77317d.this.f232423c.getParcelable("key_pay_info");
            this.f225446c.f209369f = C77317d.this.f232423c.getString("key_pwd1");
            if (!C77317d.this.f232423c.getBoolean("key_has_indentity_info", false)) {
                this.f225446c.f209372i = C77317d.this.f232423c.getString("key_name");
                this.f225446c.f209373j = C77317d.this.f232423c.getString("key_indentity");
            }
            C77317d.this.f232423c.putString("key_mobile", C75228t.m90227T(this.f225446c.f209375o));
            C77317d.this.f232423c.putBoolean("key_is_oversea", false);
            this.f221419b.mo105625d(new C78130a(this.f225446c, "", ""), true);
            return true;
        }

        /* renamed from: e */
        public boolean mo91272e(int i, int i2, String str, C117747y yVar) {
            if (i != 0 || i2 != 0 || !(yVar instanceof C78130a)) {
                return false;
            }
            C78130a aVar = (C78130a) yVar;
            if (aVar.f228969h == null) {
                Log.m105918d("MicroMsg.OpenWXCreditProcess", "reqKey  " + aVar.f228967f);
                C77317d.this.f232423c.putString("kreq_token", aVar.f228968g);
                C77317d dVar = C77317d.this;
                dVar.mo91264o(this.f221418a, 0, dVar.f232423c);
                return true;
            }
            Log.m105924i("MicroMsg.OpenWXCreditProcess", "NetSceneTenpayBindBankcard show juveniles dialog");
            MMActivity mMActivity = this.f221418a;
            C67209v vVar = aVar.f228969h;
            C76879j.m92707A(mMActivity, vVar.f192980a, "", vVar.f192982c, vVar.f192981b, new C77322a(), new C77323b(this));
            return true;
        }

        /* renamed from: f */
        public boolean mo91281f(Object... objArr) {
            this.f221419b.mo105625d(new C78358z("", objArr[0], (PayInfo) C77317d.this.f232423c.getParcelable("key_pay_info")), true);
            return true;
        }
    }

    /* renamed from: qb3.d$e */
    public class C77324e extends C75282g {
        public C77324e(MMActivity mMActivity, C75296i iVar) {
            super(mMActivity, iVar);
        }

        /* renamed from: d */
        public boolean mo91271d(Object... objArr) {
            if (!C77317d.this.f232423c.getBoolean("key_is_bank_user", false)) {
                this.f221419b.mo105625d(new C78131b(objArr[0]), true);
            } else {
                this.f221419b.mo105625d(new C77505g(C77317d.this.f232423c.getString("key_verify_code"), C77317d.this.f232423c.getString("KEY_SESSION_KEY"), C77317d.this.f232423c.getString("key_pwd1"), ((C79173v) C86312j.m106911c(C79173v.class)).Ex0().mo91322d(), C77317d.this.f232423c.getString("key_bank_type")), true);
            }
            return true;
        }

        /* renamed from: e */
        public boolean mo91272e(int i, int i2, String str, C117747y yVar) {
            if (i == 0 && i2 == 0) {
                if (yVar instanceof C78131b) {
                    this.f221419b.mo105625d(new C78342e0((String) null, 0), true);
                    return true;
                } else if (yVar instanceof C78342e0) {
                    this.f221419b.mo105625d(new C77505g(C77317d.this.f232423c.getString("key_verify_code"), C77317d.this.f232423c.getString("KEY_SESSION_KEY"), C77317d.this.f232423c.getString("key_pwd1"), ((C79173v) C86312j.m106911c(C79173v.class)).Ex0().mo91322d(), C77317d.this.f232423c.getString("key_bank_type")), true);
                    return true;
                } else if (yVar instanceof C77505g) {
                    String str2 = ((C77505g) yVar).f225989d;
                    if (!Util.isNullOrNil(str2)) {
                        C77317d.this.f232423c.putString("key_bank_username", str2);
                    }
                    C77317d dVar = C77317d.this;
                    dVar.mo91264o(this.f221418a, 0, dVar.f232423c);
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: qb3.d$f */
    public class C77325f extends C75282g {
        public C77325f(MMActivity mMActivity, C75296i iVar) {
            super(mMActivity, iVar);
        }

        /* renamed from: d */
        public boolean mo91271d(Object... objArr) {
            C77317d.this.f232423c.putBoolean("key_is_follow_bank_username", objArr[0].booleanValue());
            C77317d.this.mo109115n();
            this.f221419b.mo105625d(new C78342e0((String) null, 0), true);
            return true;
        }

        /* renamed from: e */
        public boolean mo91272e(int i, int i2, String str, C117747y yVar) {
            if (i != 0 || i2 != 0) {
                return false;
            }
            C77317d dVar = C77317d.this;
            dVar.mo91264o(this.f221418a, 0, dVar.f232423c);
            return true;
        }
    }

    /* renamed from: A */
    public C79148e mo91260A(Activity activity, Bundle bundle) {
        Class cls = C79173v.class;
        if (((C79173v) C86312j.m106911c(cls)).Ex0().mo91337s()) {
            Log.m105920e("MicroMsg.OpenWXCreditProcess", "unknow wallet reg status!");
        } else if (((C79173v) C86312j.m106911c(cls)).Ex0().mo91341w()) {
            mo109103B(activity, WalletCheckPwdUI.class, bundle);
        } else {
            mo109103B(activity, WalletWXCreditOpenUI.class, bundle);
        }
        return this;
    }

    /* renamed from: c */
    public void mo91257c(Activity activity, int i) {
        mo96262m(activity);
    }

    /* renamed from: e */
    public String mo91258e() {
        return "WXCreditOpenProcess";
    }

    /* renamed from: f */
    public void mo91259f(Activity activity, Bundle bundle) {
        mo109112j(activity, "wallet", ".bind.ui.WalletBankcardManageUI");
    }

    /* renamed from: o */
    public void mo91264o(Activity activity, int i, Bundle bundle) {
        Class<WalletWXCreditOpenResultUI> cls = WalletWXCreditOpenResultUI.class;
        Class<WalletVerifyCodeUI> cls2 = WalletVerifyCodeUI.class;
        Class<WalletCheckIdentityUI> cls3 = WalletCheckIdentityUI.class;
        boolean z = activity instanceof WalletWXCreditOpenUI;
        if (z) {
            mo109103B(activity, cls3, bundle);
        } else if (activity instanceof WalletCheckPwdUI) {
            mo96262m(activity);
            mo109103B(activity, WalletWXCreditOpenUI.class, bundle);
        } else if (z) {
            mo109103B(activity, cls3, bundle);
        } else if (activity instanceof WalletCheckIdentityUI) {
            if (bundle.getBoolean("key_need_bind_deposit", true)) {
                mo109103B(activity, WalletBindDepositUI.class, bundle);
            } else {
                mo109103B(activity, cls2, bundle);
            }
        } else if (activity instanceof WalletBindDepositUI) {
            mo109103B(activity, cls2, bundle);
        } else if (activity instanceof WalletVerifyCodeUI) {
            if (((C79173v) C86312j.m106911c(C79173v.class)).Ex0().mo91341w()) {
                mo109103B(activity, cls, bundle);
            } else {
                mo109103B(activity, WalletSetPasswordUI.class, bundle);
            }
        } else if (activity instanceof WalletSetPasswordUI) {
            mo109103B(activity, WalletPwdConfirmUI.class, bundle);
        } else if (activity instanceof WalletPwdConfirmUI) {
            mo109103B(activity, cls, bundle);
        } else if (activity instanceof WalletWXCreditOpenResultUI) {
            mo91259f(activity, bundle);
        }
    }

    /* renamed from: p */
    public C75282g mo91265p(MMActivity mMActivity, C75296i iVar) {
        if (mMActivity instanceof WalletCheckPwdUI) {
            return new C77318a(mMActivity, iVar);
        }
        if (mMActivity instanceof WalletCheckIdentityUI) {
            return new C77319b(mMActivity, iVar);
        }
        if (mMActivity instanceof WalletVerifyCodeUI) {
            return new C77320c(mMActivity, iVar);
        }
        if (mMActivity instanceof WalletBindDepositUI) {
            return new C77321d(mMActivity, iVar);
        }
        if (mMActivity instanceof WalletPwdConfirmUI) {
            return new C77324e(mMActivity, iVar);
        }
        if (mMActivity instanceof WalletWXCreditOpenResultUI) {
            return new C77325f(mMActivity, iVar);
        }
        return null;
    }

    /* renamed from: t */
    public boolean mo91267t(Activity activity, Bundle bundle) {
        return false;
    }
}
