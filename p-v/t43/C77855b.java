package t43;

import android.app.Activity;
import android.os.Bundle;
import b63.C67210w;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.wallet.balance.p119ui.WalletBalanceFetchPwdInputUI;
import com.tencent.p014mm.plugin.wallet.balance.p119ui.WalletBalanceFetchResultUI;
import com.tencent.p014mm.plugin.wallet.balance.p119ui.WalletBalanceFetchUI;
import com.tencent.p014mm.plugin.wallet.balance.p119ui.WalletBalanceManagerUI;
import com.tencent.p014mm.plugin.wallet.balance.p119ui.WalletBalanceResultUI;
import com.tencent.p014mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.p014mm.plugin.wallet_core.model.Authen;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.plugin.wallet_core.model.Orders;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletBankcardIdUI;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletCardElementUI;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletCheckPwdUI;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletConfirmCardIDUI;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletPwdConfirmUI;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletSetPasswordUI;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletVerifyCodeUI;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C75133p0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.tav.coremedia.TimeUtil;
import com.tencent.xweb.WCWebUpdater;
import cr3.C75282g;
import cr3.C75296i;
import d53.C75326b;
import di3.C86312j;
import g53.C75857g;
import h53.C76144j;
import java.text.SimpleDateFormat;
import java.util.Date;
import ob0.C117747y;
import org.json.JSONArray;
import p281yz.C79173v;
import v53.C78338b0;
import y43.C79029b0;
import yq3.C79143a;
import yq3.C79148e;

/* renamed from: t43.b */
public class C77855b extends C79148e {

    /* renamed from: t43.b$a */
    public class C77856a extends C75282g {
        public C77856a(MMActivity mMActivity, C75296i iVar) {
            super(mMActivity, iVar);
        }

        /* renamed from: c */
        public boolean mo91280c(Object... objArr) {
            C77855b.this.f232423c.putParcelable("key_history_bankcard", C79029b0.vx0().wx0().f192954g);
            PayInfo payInfo = (PayInfo) C77855b.this.f232423c.get("key_pay_info");
            this.f221419b.mo95362b(new C78338b0(payInfo == null ? null : payInfo.f212592j, 4), true);
            return false;
        }

        /* renamed from: d */
        public boolean mo91271d(Object... objArr) {
            C77855b bVar = C77855b.this;
            bVar.mo91264o(this.f221418a, 0, bVar.f232423c);
            return true;
        }

        /* renamed from: e */
        public boolean mo91272e(int i, int i2, String str, C117747y yVar) {
            return false;
        }
    }

    /* renamed from: t43.b$b */
    public class C77857b extends C75282g {
        public C77857b(MMActivity mMActivity, C75296i iVar) {
            super(mMActivity, iVar);
        }

        /* renamed from: d */
        public boolean mo91271d(Object... objArr) {
            Bankcard bankcard = (Bankcard) C77855b.this.f232423c.getParcelable("key_bankcard");
            C77855b.this.f232423c.putString("key_pwd1", objArr[0]);
            C77855b.this.f232423c.putString("key_mobile", bankcard.field_mobile);
            Authen authen = new Authen();
            authen.f209367d = 3;
            authen.f209369f = objArr[0];
            authen.f209371h = bankcard.field_bindSerial;
            authen.f209370g = bankcard.field_bankcardType;
            authen.f209382v = (PayInfo) C77855b.this.f232423c.getParcelable("key_pay_info");
            authen.f209381u = bankcard.field_arrive_type;
            this.f221419b.mo105625d(new C75326b(authen, (Orders) C77855b.this.f232423c.getParcelable("key_orders"), false), true);
            return true;
        }

        /* renamed from: e */
        public boolean mo91272e(int i, int i2, String str, C117747y yVar) {
            if (i != 0 || i2 != 0 || !(yVar instanceof C75326b)) {
                return false;
            }
            C75326b bVar = (C75326b) yVar;
            C77855b.this.f232423c.putString("kreq_token", bVar.f221494D);
            C77855b.this.f232423c.putParcelable("key_authen", bVar.f221493C);
            C77855b.this.f232423c.putBoolean("key_need_verify_sms", !bVar.f221491A);
            RealnameGuideHelper realnameGuideHelper = bVar.f222394s;
            if (realnameGuideHelper != null) {
                C77855b.this.f232423c.putParcelable("key_realname_guide_helper", realnameGuideHelper);
            }
            JSONArray jSONArray = bVar.f221500J;
            if (jSONArray != null) {
                C77855b.this.f232423c.putString("key_fetch_result_show_info", jSONArray.toString());
            }
            C79143a.m95765d(this.f221418a, C77855b.this.f232423c);
            this.f221418a.finish();
            return true;
        }
    }

    /* renamed from: t43.b$c */
    public class C77858c extends C75282g {
        public C77858c(MMActivity mMActivity, C75296i iVar) {
            super(mMActivity, iVar);
        }

        /* renamed from: d */
        public boolean mo91271d(Object... objArr) {
            Authen authen = objArr[0];
            Orders orders = objArr[1];
            int i = C77855b.this.f232423c.getInt("key_pay_flag", 0);
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return false;
                    }
                    if (!C77855b.this.mo109116r()) {
                        authen.f209367d = 3;
                    } else {
                        authen.f209367d = 6;
                    }
                } else if (!C77855b.this.mo109116r()) {
                    authen.f209367d = 2;
                } else {
                    authen.f209367d = 5;
                }
            } else if (!C77855b.this.mo109116r()) {
                authen.f209367d = 1;
            } else {
                authen.f209367d = 4;
            }
            C77855b.this.f232423c.putParcelable("key_authen", authen);
            this.f221419b.mo105625d(new C75326b(authen, orders, false), true);
            return true;
        }

        /* renamed from: e */
        public boolean mo91272e(int i, int i2, String str, C117747y yVar) {
            if (i != 0 || i2 != 0) {
                return false;
            }
            if (yVar instanceof C75326b) {
                C75326b bVar = (C75326b) yVar;
                C77855b.this.f232423c.putString("kreq_token", bVar.f221494D);
                if (bVar.isPaySuccess) {
                    C77855b.this.f232423c.putParcelable("key_orders", bVar.f221492B);
                }
            }
            C77855b.this.getClass();
            C77855b bVar2 = C77855b.this;
            bVar2.mo91264o(this.f221418a, 0, bVar2.f232423c);
            return true;
        }
    }

    /* renamed from: t43.b$d */
    public class C77859d extends C75282g {
        public C77859d(MMActivity mMActivity, C75296i iVar) {
            super(mMActivity, iVar);
        }

        /* renamed from: d */
        public boolean mo91271d(Object... objArr) {
            PayInfo payInfo;
            C67210w wVar = objArr[1];
            if (!(wVar == null || (payInfo = wVar.f192996n) == null)) {
                payInfo.f212587e = 21;
            }
            Orders orders = (Orders) C77855b.this.f232423c.getParcelable("key_orders");
            int i = C77855b.this.f232423c.getInt("key_pay_flag", 0);
            if (i == 1) {
                wVar.f192983a = "1";
            } else if (i != 2) {
                if (i != 3) {
                    return false;
                }
                if (!C77855b.this.mo109116r()) {
                    wVar.f192983a = "3";
                } else {
                    wVar.f192983a = WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_NOTIFY_ONLY_INSTALL_EMBED_PLUGIN;
                }
            } else if (!C77855b.this.mo109116r()) {
                wVar.f192983a = "2";
            } else {
                wVar.f192983a = WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY;
            }
            this.f221419b.mo105625d(new C75857g(wVar, orders), true);
            return true;
        }

        /* renamed from: e */
        public boolean mo91272e(int i, int i2, String str, C117747y yVar) {
            if (i != 0 || i2 != 0) {
                return false;
            }
            if (yVar instanceof C75857g) {
                C75857g gVar = (C75857g) yVar;
                if (gVar.isPaySuccess) {
                    C77855b.this.f232423c.putParcelable("key_orders", gVar.f222501x);
                }
                C79143a.m95765d(this.f221418a, C77855b.this.f232423c);
                return true;
            } else if (!(yVar instanceof C75326b)) {
                return false;
            } else {
                C75326b bVar = (C75326b) yVar;
                RealnameGuideHelper realnameGuideHelper = bVar.f222394s;
                if (realnameGuideHelper != null) {
                    C77855b.this.f232423c.putParcelable("key_realname_guide_helper", realnameGuideHelper);
                }
                C77855b.this.f232423c.putString("kreq_token", bVar.f221494D);
                return true;
            }
        }

        /* renamed from: f */
        public boolean mo91281f(Object... objArr) {
            this.f221419b.mo105625d(new C75326b((Authen) C77855b.this.f232423c.getParcelable("key_authen"), (Orders) C77855b.this.f232423c.getParcelable("key_orders"), false), true);
            return true;
        }
    }

    /* renamed from: t43.b$e */
    public class C77860e extends C75282g {
        public C77860e(MMActivity mMActivity, C75296i iVar) {
            super(mMActivity, iVar);
        }

        /* renamed from: a */
        public CharSequence mo91282a(int i) {
            Orders orders;
            if (i == 0) {
                return this.f221418a.getString(C0966R.string.klz);
            }
            if (i == 1) {
                Orders orders2 = (Orders) C77855b.this.f232423c.getParcelable("key_orders");
                return (orders2 == null || Util.isNullOrNil(orders2.f209535F)) ? this.f221418a.getString(C0966R.string.klw) : orders2.f209535F;
            } else if (i == 2 && (orders = (Orders) C77855b.this.f232423c.getParcelable("key_orders")) != null && orders.f209534E > 0) {
                return new SimpleDateFormat(TimeUtil.YYYY2MM2DD_HH1MM1SS).format(new Date(orders.f209534E));
            } else {
                return null;
            }
        }

        /* renamed from: c */
        public boolean mo91280c(Object... objArr) {
            ((C79173v) C86312j.m106911c(C79173v.class)).Ex0().f192955h.f209415j2 -= ((Orders) C77855b.this.f232423c.getParcelable("key_orders")).f209566h;
            C77855b.this.f232423c.putInt("key_balance_result_logo", C0966R.raw.remittance_wait);
            return false;
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

    /* renamed from: t43.b$f */
    public class C77861f extends C75282g {
        public C77861f(MMActivity mMActivity, C75296i iVar) {
            super(mMActivity, iVar);
        }

        /* renamed from: a */
        public CharSequence mo91282a(int i) {
            return this.f221418a.getString(C0966R.string.l9c);
        }

        /* renamed from: d */
        public boolean mo91271d(Object... objArr) {
            this.f221419b.mo105625d(new C76144j(objArr[0], (Orders) C77855b.this.f232423c.getParcelable("key_orders")), true);
            return true;
        }

        /* renamed from: e */
        public boolean mo91272e(int i, int i2, String str, C117747y yVar) {
            if (i != 0 || i2 != 0 || !(yVar instanceof C76144j)) {
                return false;
            }
            C76144j jVar = (C76144j) yVar;
            if (jVar.isPaySuccess) {
                C77855b.this.f232423c.putParcelable("key_orders", jVar.f223049x);
            }
            C77855b bVar = C77855b.this;
            bVar.mo91264o(this.f221418a, 0, bVar.f232423c);
            return true;
        }
    }

    /* renamed from: A */
    public C79148e mo91260A(Activity activity, Bundle bundle) {
        C75133p0.m90118b(14);
        if (!(activity instanceof WalletBalanceFetchUI)) {
            mo109103B(activity, WalletBalanceFetchUI.class, bundle);
        } else if (!C79029b0.vx0().wx0().mo91341w()) {
            this.f232423c.putInt("key_pay_flag", 1);
            mo109103B(activity, WalletBankcardIdUI.class, bundle);
        } else if (((Bankcard) this.f232423c.getParcelable("key_bankcard")) != null) {
            this.f232423c.putInt("key_pay_flag", 3);
            this.f232423c.putString("key_pwd_cash_title", activity.getString(C0966R.string.kl9));
            Orders orders = (Orders) this.f232423c.getParcelable("key_orders");
            if (orders != null) {
                this.f232423c.putString("key_pwd_cash_money", C75228t.m90256l(orders.f209566h));
            }
            mo109103B(activity, WalletBalanceFetchPwdInputUI.class, bundle);
        } else {
            this.f232423c.putInt("key_pay_flag", 2);
            mo109103B(activity, WalletCheckPwdUI.class, bundle);
        }
        return this;
    }

    /* renamed from: c */
    public void mo91257c(Activity activity, int i) {
        if (activity instanceof WalletPwdConfirmUI) {
            mo109108d(activity, WalletSetPasswordUI.class, (Bundle) null, i);
        } else if (activity instanceof WalletBalanceResultUI) {
            C75133p0.m90117a();
            mo91259f(activity, this.f232423c);
        } else {
            C75133p0.m90117a();
            mo96262m(activity);
        }
    }

    /* renamed from: e */
    public String mo91258e() {
        return "BalanceFetchProcess";
    }

    /* renamed from: f */
    public void mo91259f(Activity activity, Bundle bundle) {
        if (this.f232423c.getInt("key_balance_fetch_scene", 0) == 0) {
            mo109111i(activity, WalletBalanceManagerUI.class, -1, true);
        } else {
            mo109111i(activity, WalletBalanceFetchUI.class, -1, false);
        }
    }

    /* renamed from: o */
    public void mo91264o(Activity activity, int i, Bundle bundle) {
        Class<WalletVerifyCodeUI> cls = WalletVerifyCodeUI.class;
        Class<WalletBankcardIdUI> cls2 = WalletBankcardIdUI.class;
        Class<WalletBalanceFetchResultUI> cls3 = WalletBalanceFetchResultUI.class;
        if (activity instanceof WalletBalanceFetchUI) {
            if (!C79029b0.vx0().wx0().mo91341w()) {
                this.f232423c.putInt("key_pay_flag", 1);
                mo109103B(activity, cls2, bundle);
            } else if (((Bankcard) this.f232423c.getParcelable("key_bankcard")) != null) {
                this.f232423c.putInt("key_pay_flag", 3);
                this.f232423c.putString("key_pwd_cash_title", activity.getString(C0966R.string.kl9));
                Orders orders = (Orders) this.f232423c.getParcelable("key_orders");
                if (orders != null) {
                    this.f232423c.putString("key_pwd_cash_money", C75228t.m90256l(orders.f209566h));
                }
                mo109103B(activity, WalletBalanceFetchPwdInputUI.class, bundle);
            } else {
                this.f232423c.putInt("key_pay_flag", 2);
                mo109103B(activity, WalletCheckPwdUI.class, bundle);
            }
        } else if (activity instanceof WalletBalanceFetchPwdInputUI) {
            if (bundle.getBoolean("key_need_verify_sms", false)) {
                mo109103B(activity, cls, bundle);
            } else {
                mo109103B(activity, cls3, bundle);
            }
        } else if (activity instanceof WalletCheckPwdUI) {
            mo109103B(activity, cls2, bundle);
        } else if ((activity instanceof WalletBankcardIdUI) || (activity instanceof WalletConfirmCardIDUI)) {
            mo109103B(activity, WalletCardElementUI.class, bundle);
        } else if (activity instanceof WalletCardElementUI) {
            mo109103B(activity, cls, bundle);
        } else if (activity instanceof WalletVerifyCodeUI) {
            if (C79029b0.vx0().wx0().mo91341w()) {
                mo109103B(activity, cls3, bundle);
            } else {
                mo109103B(activity, WalletSetPasswordUI.class, bundle);
            }
        } else if (activity instanceof WalletSetPasswordUI) {
            mo109103B(activity, WalletPwdConfirmUI.class, bundle);
        } else if (activity instanceof WalletPwdConfirmUI) {
            mo109103B(activity, cls3, bundle);
        } else if (activity instanceof WalletBalanceFetchResultUI) {
            mo91259f(activity, bundle);
        }
    }

    /* renamed from: p */
    public C75282g mo91265p(MMActivity mMActivity, C75296i iVar) {
        if (mMActivity instanceof WalletBalanceFetchUI) {
            return new C77856a(mMActivity, iVar);
        }
        if (mMActivity instanceof WalletBalanceFetchPwdInputUI) {
            return new C77857b(mMActivity, iVar);
        }
        if (mMActivity instanceof WalletCardElementUI) {
            return new C77858c(mMActivity, iVar);
        }
        if (mMActivity instanceof WalletVerifyCodeUI) {
            return new C77859d(mMActivity, iVar);
        }
        if (mMActivity instanceof WalletBalanceFetchResultUI) {
            return new C77860e(mMActivity, iVar);
        }
        if (mMActivity instanceof WalletPwdConfirmUI) {
            return new C77861f(mMActivity, iVar);
        }
        return null;
    }

    /* renamed from: q */
    public int mo91266q(MMActivity mMActivity, int i) {
        return C0966R.string.kl4;
    }

    /* renamed from: t */
    public boolean mo91267t(Activity activity, Bundle bundle) {
        return false;
    }
}
