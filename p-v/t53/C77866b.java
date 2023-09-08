package t53;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import b63.C67209v;
import b63.C67210w;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.wallet_core.id_verify.model.Profession;
import com.tencent.p014mm.plugin.wallet_core.id_verify.model.RealNameBundle;
import com.tencent.p014mm.plugin.wallet_core.model.Authen;
import com.tencent.p014mm.plugin.wallet_core.model.BindCardOrder;
import com.tencent.p014mm.plugin.wallet_core.model.Orders;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletBankcardIdUI;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletBindCardResultUI;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletCardElementUI;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletCardImportUI;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletCheckPwdUI;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletPwdConfirmUI;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletSetPasswordUI;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletVerifyCodeUI;
import com.tencent.p014mm.plugin.wallet_core.utils.C72517z;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C75133p0;
import com.tencent.p014mm.wallet_core.model.C75136r0;
import com.tencent.xweb.IXWebBroadcastListener;
import cr3.C75282g;
import cr3.C75296i;
import di3.C86312j;
import nj3.C76879j;
import ob0.C117747y;
import p281yz.C79173v;
import u53.C78130a;
import u53.C78131b;
import v53.C78342e0;
import v53.C78355w;
import yq3.C79148e;
import z53.C79313l;

/* renamed from: t53.b */
public class C77866b extends C77864a {

    /* renamed from: d */
    public C77873e f226891d;

    /* renamed from: t53.b$a */
    public class C77867a extends C75282g {
        public C77867a(C77866b bVar, MMActivity mMActivity, C75296i iVar) {
            super(mMActivity, iVar);
        }

        /* renamed from: a */
        public CharSequence mo91282a(int i) {
            if (i == 0) {
                return this.f221418a.getString(C0966R.string.f361555kr3);
            }
            if (i != 1) {
                return null;
            }
            return this.f221418a.getString(C0966R.string.f361561ku0);
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

    /* renamed from: t53.b$b */
    public class C77868b extends C75282g {

        /* renamed from: c */
        public Authen f226892c;

        /* renamed from: t53.b$b$a */
        public class C77869a implements DialogInterface.OnClickListener {
            public C77869a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                Log.m105924i("MicroMsg.BindCardProcess", "NetSceneTenpayBindBankcard dialog lOk");
                C77868b.this.f221419b.mo105625d(new C78130a(C77868b.this.f226892c, "1", ""), true);
                C67209v.m79539a(1);
            }
        }

        /* renamed from: t53.b$b$b */
        public class C77870b implements DialogInterface.OnClickListener {
            public C77870b(C77868b bVar) {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                Log.m105924i("MicroMsg.BindCardProcess", "NetSceneTenpayBindBankcard dialog lCancel");
                C67209v.m79539a(0);
            }
        }

        public C77868b(MMActivity mMActivity, C75296i iVar) {
            super(mMActivity, iVar);
        }

        /* renamed from: d */
        public boolean mo91271d(Object... objArr) {
            C77866b.this.mo109107a("onNext", objArr);
            Log.m105924i("MicroMsg.BindCardProcess", "onNext, do bind bank card!");
            Authen authen = objArr[0];
            this.f226892c = authen;
            Orders orders = objArr[1];
            authen.f209367d = C77866b.this.mo107970G();
            this.f221419b.mo105625d(new C78130a(this.f226892c, "", ""), true);
            return true;
        }

        /* renamed from: e */
        public boolean mo91272e(int i, int i2, String str, C117747y yVar) {
            if (i == 0 && i2 == 0) {
                if (yVar instanceof C78130a) {
                    C78130a aVar = (C78130a) yVar;
                    if (aVar.f228969h == null) {
                        C77866b.this.f232423c.putString("kreq_token", aVar.f228968g);
                        C77866b bVar = C77866b.this;
                        if (bVar.mo91267t(this.f221418a, bVar.f232423c)) {
                            Log.m105924i("MicroMsg.BindCardProcess", "need update bankcardlist");
                            this.f221419b.mo95362b(new C78342e0((String) null, 12), false);
                        } else {
                            Log.m105924i("MicroMsg.BindCardProcess", "not need update bankcardlist");
                            C77866b bVar2 = C77866b.this;
                            bVar2.mo91264o(this.f221418a, 0, bVar2.f232423c);
                        }
                    } else {
                        Log.m105924i("MicroMsg.BindCardProcess", "NetSceneTenpayBindBankcard show juveniles dialog");
                        MMActivity mMActivity = this.f221418a;
                        C67209v vVar = aVar.f228969h;
                        C76879j.m92707A(mMActivity, vVar.f192980a, "", vVar.f192982c, vVar.f192981b, new C77869a(), new C77870b(this));
                    }
                    return true;
                } else if (yVar instanceof C78342e0) {
                    Log.m105924i("MicroMsg.BindCardProcess", "update bankcardlist success!");
                    C77866b bVar3 = C77866b.this;
                    bVar3.mo91264o(this.f221418a, 0, bVar3.f232423c);
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: t53.b$c */
    public class C77871c extends C75282g {
        public C77871c(MMActivity mMActivity, C75296i iVar) {
            super(mMActivity, iVar);
        }

        /* renamed from: a */
        public CharSequence mo91282a(int i) {
            return this.f221418a.getString(C0966R.string.l_5);
        }

        /* renamed from: d */
        public boolean mo91271d(Object... objArr) {
            C77866b.this.mo109107a("WalletVerifyCodeUI onNext", objArr);
            Log.m105924i("MicroMsg.BindCardProcess", "onNext, do bind verify!");
            C67210w wVar = objArr[1];
            if (((C79173v) C86312j.m106911c(C79173v.class)).Ex0().mo91341w()) {
                wVar.f192983a = "2";
            } else {
                wVar.f192983a = "1";
            }
            if ("realname_verify_process".equals(C77866b.this.mo91258e())) {
                this.f221419b.mo105625d(new C78355w(wVar, C77866b.this.f232423c.getInt("entry_scene", -1), C77866b.this.f232423c.getString("key_realname_sessionid")), true);
            } else {
                this.f221419b.mo105625d(new C78355w(wVar), true);
            }
            return true;
        }

        /* renamed from: e */
        public boolean mo91272e(int i, int i2, String str, C117747y yVar) {
            if (i != 0 || i2 != 0) {
                return false;
            }
            if (yVar instanceof C78130a) {
                Log.m105924i("MicroMsg.BindCardProcess", "verify code success!");
                C77866b.this.f232423c.putString("kreq_token", ((C78130a) yVar).f228968g);
                return true;
            } else if (!(yVar instanceof C78355w)) {
                return yVar instanceof C79313l;
            } else {
                C77866b.this.mo107969F(this.f221419b);
                BindCardOrder bindCardOrder = ((C78355w) yVar).f229612d;
                if (bindCardOrder == null) {
                    return false;
                }
                C77866b.this.f232423c.putParcelable("key_bindcard_value_result", bindCardOrder);
                return false;
            }
        }
    }

    /* renamed from: t53.b$d */
    public class C77872d extends C75282g {
        public C77872d(MMActivity mMActivity, C75296i iVar) {
            super(mMActivity, iVar);
        }

        /* renamed from: d */
        public boolean mo91271d(Object... objArr) {
            C67210w wVar = objArr[0];
            C77866b.this.f232423c.getString("verify_card_flag", "0");
            if ("realname_verify_process".equals(C77866b.this.mo91258e())) {
                this.f221419b.mo95362b(new C78131b(wVar, C77866b.this.f232423c.getInt("entry_scene", -1), C77866b.this.f232423c.getString("key_realname_sessionid"), (RealNameBundle) C77866b.this.f232423c.getParcelable("realname_verify_process_bundle")), true);
            } else {
                this.f221419b.mo95362b(new C78131b(wVar), true);
            }
            return false;
        }

        /* renamed from: e */
        public boolean mo91272e(int i, int i2, String str, C117747y yVar) {
            if (!(yVar instanceof C78131b)) {
                return yVar instanceof C79313l;
            }
            C77866b.this.mo107969F(this.f221419b);
            BindCardOrder bindCardOrder = ((C78131b) yVar).f228970d;
            if (bindCardOrder == null) {
                return false;
            }
            C77866b.this.f232423c.putParcelable("key_bindcard_value_result", bindCardOrder);
            return false;
        }
    }

    /* renamed from: t53.b$e */
    public interface C77873e {
        void run(int i);
    }

    /* renamed from: A */
    public C79148e mo91260A(Activity activity, Bundle bundle) {
        Class<WalletBankcardIdUI> cls = WalletBankcardIdUI.class;
        mo109107a(IXWebBroadcastListener.STAGE_START, activity, bundle);
        Log.m105918d("MicroMsg.BindCardProcess", "start Process : BindCardProcess");
        if (bundle != null) {
            C75136r0.m90122d(6, bundle.getInt("key_bind_scene"));
            C75133p0.m90118b(bundle.getInt("key_bind_scene"));
        } else {
            C75136r0.m90122d(6, 0);
            C75133p0.m90118b(0);
        }
        if (((C79173v) C86312j.m106911c(C79173v.class)).Ex0().mo91341w()) {
            boolean z = bundle.getBoolean("key_bind_card_can_pass_pwd", false);
            String string = bundle.getString("key_bind_card_user_token", (String) null);
            if (!z || Util.isNullOrNil(string)) {
                mo109103B(activity, WalletCheckPwdUI.class, bundle);
            } else {
                mo109103B(activity, cls, bundle);
            }
            return this;
        }
        if (bundle != null) {
            C72517z.m84854b(activity, bundle.getInt("key_bind_scene", 0), 1);
        }
        if (bundle == null || !bundle.getBoolean("key_is_import_bind", false)) {
            mo109107a(IXWebBroadcastListener.STAGE_START, activity, bundle);
            if (bundle != null) {
                bundle.putBoolean("key_is_bind_reg_process", true);
            }
            mo109103B(activity, cls, bundle);
            return this;
        }
        mo109103B(activity, WalletCardImportUI.class, bundle);
        return this;
    }

    /* renamed from: F */
    public void mo107969F(C75296i iVar) {
        Log.m105918d("MicroMsg.BindCardProcess", "do set user exinfo");
        iVar.mo105625d(new C79313l(this.f232423c.getString("key_country_code", ""), this.f232423c.getString("key_province_code", ""), this.f232423c.getString("key_city_code", ""), (Profession) this.f232423c.getParcelable("key_profession"), this.f232423c.getString("key_country_iso")), false);
    }

    /* renamed from: G */
    public int mo107970G() {
        Class cls = C79173v.class;
        return !mo109116r() ? ((C79173v) C86312j.m106911c(cls)).Ex0().mo91341w() ? 2 : 1 : ((C79173v) C86312j.m106911c(cls)).Ex0().mo91341w() ? 5 : 4;
    }

    /* renamed from: e */
    public String mo91258e() {
        return "BindCardProcess";
    }

    /* renamed from: f */
    public void mo91259f(Activity activity, Bundle bundle) {
        Class<?> cls;
        int i = 0;
        mo109107a("end", activity, bundle);
        Log.m105924i("MicroMsg.BindCardProcess", "end Process : BindCardProcess");
        C75133p0.m90117a();
        mo109115n();
        boolean z = bundle.getBoolean("intent_bind_end", false);
        Bundle bundle2 = this.f232423c;
        if (bundle2 != null && bundle2.getBoolean("is_from_new_cashier", false)) {
            try {
                cls = Class.forName(bundle2.getString("start_activity_class", ""));
            } catch (Exception unused) {
                cls = null;
            }
            Class<?> cls2 = cls;
            if (cls2 != null) {
                mo109110h(activity, cls2, -1, (Intent) null, true);
                C77873e eVar = this.f226891d;
                if (eVar != null) {
                    if (z) {
                        i = -1;
                    }
                    eVar.run(i);
                    return;
                }
                return;
            }
        }
        if (bundle.getBoolean("key_need_bind_response", false)) {
            Intent intent = new Intent();
            intent.putExtras(bundle);
            mo109113k(activity, "wallet", ".bind.ui.WalletBindUI", -1, intent, false);
            return;
        }
        mo109112j(activity, "wallet", ".bind.ui.WalletBankcardManageUI");
    }

    /* renamed from: o */
    public void mo91264o(Activity activity, int i, Bundle bundle) {
        Activity activity2 = activity;
        Bundle bundle2 = bundle;
        Class<WalletBindCardResultUI> cls = WalletBindCardResultUI.class;
        Class cls2 = C79173v.class;
        mo109107a("forward", activity2, Integer.valueOf(i), bundle2);
        Log.m105924i("MicroMsg.BindCardProcess", "forward Process : BindCardProcess");
        if (activity2 instanceof WalletCheckPwdUI) {
            if (bundle2.getBoolean("key_is_import_bind", false)) {
                mo109103B(activity2, WalletCardImportUI.class, bundle2);
            } else {
                mo109103B(activity2, WalletBankcardIdUI.class, bundle2);
            }
        } else if ((activity2 instanceof WalletCardElementUI) || (activity2 instanceof WalletCardImportUI)) {
            if (!mo109116r()) {
                Log.m105924i("MicroMsg.BindCardProcess", "is domestic bankcard! need verify code!");
                mo109103B(activity2, WalletVerifyCodeUI.class, bundle2);
            } else if (!((C79173v) C86312j.m106911c(cls2)).Ex0().mo91341w()) {
                Log.m105924i("MicroMsg.BindCardProcess", "wallet is not register, start WalletSetPasswordUI!");
                mo109103B(activity2, WalletSetPasswordUI.class, bundle2);
            } else {
                Log.m105924i("MicroMsg.BindCardProcess", "bind bank card success!!");
                bundle2.putBoolean("intent_bind_end", true);
                C76879j.m92726T(activity2, activity2.getString(C0966R.string.kmi));
                mo91259f(activity2, bundle2);
            }
        } else if ((activity2 instanceof WalletVerifyCodeUI) && ((C79173v) C86312j.m106911c(cls2)).Ex0().mo91341w()) {
            Log.m105924i("MicroMsg.BindCardProcess", "end process after verify!");
            int i2 = this.f232423c.getInt("key_bind_scene", -1);
            BindCardOrder bindCardOrder = (BindCardOrder) this.f232423c.getParcelable("key_bindcard_value_result");
            if (bindCardOrder == null || i2 != 15) {
                bundle2.putBoolean("intent_bind_end", true);
                C76879j.m92726T(activity2, activity2.getString(C0966R.string.kmi));
                mo91259f(activity2, bundle2);
                return;
            }
            String string = this.f232423c.getString("key_bind_card_type");
            String string2 = this.f232423c.getString("key_bind_card_show1");
            String string3 = this.f232423c.getString("key_bind_card_show2");
            int i3 = this.f232423c.getInt("key_bind_scene");
            int i4 = this.f232423c.getInt("realname_scene");
            Log.m105925i("MicroMsg.BindCardProcess", "order ok bank_type %s  bank_type_show %s scene %s realnameScene %s", string, string2, Integer.valueOf(i3), Integer.valueOf(i4));
            bindCardOrder.f209472h = string;
            bindCardOrder.f209473i = string2;
            bindCardOrder.f209474j = string3;
            bindCardOrder.f209476o = i3;
            bindCardOrder.f209477p = i4;
            mo109103B(activity2, cls, bundle2);
        } else if (activity2 instanceof WalletPwdConfirmUI) {
            Log.m105924i("MicroMsg.BindCardProcess", "end process after confirm pwd!");
            C72517z.m84854b(activity2, this.f232423c.getInt("key_bind_scene", 0), 7);
            bundle2.putBoolean("intent_bind_end", true);
            C76879j.m92726T(activity2, activity2.getString(C0966R.string.kmi));
            BindCardOrder bindCardOrder2 = (BindCardOrder) this.f232423c.getParcelable("key_bindcard_value_result");
            int i5 = this.f232423c.getInt("key_bind_scene", -1);
            if (bindCardOrder2 == null || i5 != 15) {
                mo91259f(activity2, bundle2);
                return;
            }
            String string4 = this.f232423c.getString("key_bind_card_type");
            String string5 = this.f232423c.getString("key_bind_card_show1");
            String string6 = this.f232423c.getString("key_bind_card_show2");
            int i6 = this.f232423c.getInt("key_bind_scene");
            int i7 = this.f232423c.getInt("realname_scene");
            Log.m105925i("MicroMsg.BindCardProcess", "order ok bank_type %s  bank_type_show %s scene %s realnameScene %s", string4, string5, Integer.valueOf(i6), Integer.valueOf(i7));
            bindCardOrder2.f209472h = string4;
            bindCardOrder2.f209473i = string5;
            bindCardOrder2.f209474j = string6;
            bindCardOrder2.f209476o = i6;
            bindCardOrder2.f209477p = i7;
            mo109103B(activity2, cls, bundle2);
        } else if (activity2 instanceof WalletBindCardResultUI) {
            mo91259f(activity2, bundle2);
        } else {
            Log.m105924i("MicroMsg.BindCardProcess", "super forward!");
            super.mo91264o(activity2, 0, bundle2);
        }
    }

    /* renamed from: p */
    public C75282g mo91265p(MMActivity mMActivity, C75296i iVar) {
        if (mMActivity instanceof WalletCheckPwdUI) {
            return new C77867a(this, mMActivity, iVar);
        }
        if ((mMActivity instanceof WalletCardElementUI) || (mMActivity instanceof WalletCardImportUI)) {
            return new C77868b(mMActivity, iVar);
        }
        if (mMActivity instanceof WalletVerifyCodeUI) {
            return new C77871c(mMActivity, iVar);
        }
        if (mMActivity instanceof WalletPwdConfirmUI) {
            return new C77872d(mMActivity, iVar);
        }
        return null;
    }

    /* renamed from: t */
    public boolean mo91267t(Activity activity, Bundle bundle) {
        return ((C79173v) C86312j.m106911c(C79173v.class)).Ex0().mo91341w() ? ((activity instanceof WalletCardElementUI) && mo109116r()) || (activity instanceof WalletVerifyCodeUI) : activity instanceof WalletPwdConfirmUI;
    }
}
