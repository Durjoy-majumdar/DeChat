package b53;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import b63.C67210w;
import c53.C67341a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.WalletPayResultEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet.balance.p119ui.WalletBalanceManagerUI;
import com.tencent.p014mm.plugin.wallet.balance.p119ui.WalletBalanceResultUI;
import com.tencent.p014mm.plugin.wallet.bind.p120ui.WalletResetInfoUI;
import com.tencent.p014mm.plugin.wallet.pay.p121ui.WalletChangeBankcardUI;
import com.tencent.p014mm.plugin.wallet.pay.p121ui.WalletPayUI;
import com.tencent.p014mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.p014mm.plugin.wallet_core.model.Authen;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.p014mm.plugin.wallet_core.model.Orders;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletBankcardIdUI;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletCardElementUI;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletCheckPwdUI;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletOrderInfoUI;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletPwdConfirmUI;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletSelectBankcardUI;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletSetPasswordUI;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletSwitchVerifyPhoneUI;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletVerifyCodeUI;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletVerifyIdCardUI;
import com.tencent.p014mm.plugin.wallet_core.utils.C72517z;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.model.C75133p0;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import com.tencent.xweb.WCWebUpdater;
import cr3.C75282g;
import cr3.C75296i;
import d53.C75326b;
import d53.C75327c;
import di3.C86312j;
import e53.C20511b;
import f40.C86709a0;
import g53.C75852b;
import g53.C75857g;
import h53.C76135a;
import h53.C76136b;
import h53.C76137c;
import h53.C76138d;
import h53.C76139e;
import h53.C76140f;
import h53.C76141g;
import h53.C76142h;
import h53.C76143i;
import h53.C76144j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import nj3.C76879j;
import ob0.C117747y;
import p281yz.C79173v;
import t53.C77864a;
import te3.C77958k9;
import v53.C78342e0;
import v53.C78356x;
import v53.C78358z;
import y43.C79029b0;
import yq3.C79148e;

/* renamed from: b53.b */
public class C67154b extends C77864a {

    /* renamed from: d */
    public List<WeakReference<WalletBaseUI>> f192823d = new ArrayList();

    /* renamed from: e */
    public C75326b f192824e;

    /* renamed from: b53.b$a */
    public class C67155a extends C75282g {
        public C67155a(MMActivity mMActivity, C75296i iVar) {
            super(mMActivity, iVar);
        }

        /* renamed from: d */
        public boolean mo91271d(Object... objArr) {
            Log.m105924i("MicroMsg.PayProcess", "onNext for select bank card");
            C67154b.this.f232423c.putInt("key_err_code", 0);
            Bankcard bankcard = (Bankcard) C67154b.this.f232423c.getParcelable("key_bankcard");
            if (bankcard == null) {
                Log.m105924i("MicroMsg.PayProcess", "directToBindNew()");
                C67154b.this.f232423c.putInt("key_pay_flag", 2);
                C67154b bVar = C67154b.this;
                bVar.mo91264o(this.f221418a, 0, bVar.f232423c);
            } else if (((C79173v) C86312j.m106911c(C79173v.class)).f232472d.mo91345a(bankcard.field_bankcardType) != null) {
                mo91273g();
            } else {
                this.f221419b.mo105625d(new C78358z("", "", (PayInfo) null), true);
            }
            return false;
        }

        /* renamed from: e */
        public boolean mo91272e(int i, int i2, String str, C117747y yVar) {
            if (i == 0 && i2 == 0 && (yVar instanceof C75327c)) {
                Log.m105924i("MicroMsg.PayProcess", "onSceneEnd for select bank card, forward");
                C67154b bVar = C67154b.this;
                bVar.mo91264o(this.f221418a, 0, bVar.f232423c);
                return true;
            }
            if (i == 0 && i2 == 0 && (yVar instanceof C78358z)) {
                Log.m105924i("MicroMsg.PayProcess", "onSceneEnd for select bank card, directToNext");
                mo91273g();
            }
            return false;
        }

        /* renamed from: g */
        public final void mo91273g() {
            Log.m105924i("MicroMsg.PayProcess", "directToNext()");
            boolean z = C67154b.this.f232423c.getBoolean("key_balance_change_phone_need_confirm_phone", false);
            Authen authen = (Authen) C67154b.this.f232423c.getParcelable("key_authen");
            Orders orders = (Orders) C67154b.this.f232423c.getParcelable("key_orders");
            Bankcard bankcard = (Bankcard) C67154b.this.f232423c.getParcelable("key_bankcard");
            ElementQuery a = ((C79173v) C86312j.m106911c(C79173v.class)).f232472d.mo91345a(bankcard.field_bankcardType);
            C67154b.this.f232423c.putParcelable("elemt_query", a);
            if (!z) {
                authen.f209375o = "";
                authen.f209370g = bankcard.field_bankcardType;
                authen.f209371h = bankcard.field_bindSerial;
                C67154b.this.f232423c.putString("key_mobile", bankcard.field_mobile);
                if (a == null || a.f209509i || a.f209510j) {
                    Log.m105924i("MicroMsg.PayProcess", "hy: need rewrite cvv or validThru");
                    C67154b bVar = C67154b.this;
                    bVar.mo91264o(this.f221418a, 0, bVar.f232423c);
                    return;
                }
                this.f221419b.mo95362b(C67341a.m79679b(authen, orders, C67154b.this.f232423c.getBoolean("key_isbalance", false)), true);
                return;
            }
            authen.f209370g = bankcard.field_bankcardType;
            authen.f209371h = bankcard.field_bindSerial;
            C67154b bVar2 = C67154b.this;
            bVar2.mo91264o(this.f221418a, 0, bVar2.f232423c);
        }
    }

    /* renamed from: b53.b$b */
    public class C67156b extends C67173s {
        public C67156b(C67154b bVar, WalletBaseUI walletBaseUI, C75296i iVar) {
            super(bVar, walletBaseUI, iVar);
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

    /* renamed from: b53.b$c */
    public class C67157c extends C67173s {
        public C67157c(WalletBaseUI walletBaseUI, C75296i iVar) {
            super(C67154b.this, walletBaseUI, iVar);
        }

        /* renamed from: d */
        public boolean mo91271d(Object... objArr) {
            Log.m105924i("MicroMsg.PayProcess", "start do authen");
            C77958k9 k9Var = objArr[0];
            Authen authen = (Authen) C67154b.this.f232423c.getParcelable("key_authen");
            Bankcard bankcard = new Bankcard();
            String str = k9Var.f227737g;
            bankcard.field_bindSerial = str;
            bankcard.field_mobile = k9Var.f227735e;
            bankcard.field_desc = k9Var.f227738h;
            String str2 = authen.f209370g;
            bankcard.field_bankcardType = str2;
            Log.m105919d("MicroMsg.PayProcess", "tft: bank_type: %s, bank_serial: %s, authen.serial: %s", str2, str, authen.f209371h);
            C67154b.this.f232423c.putString("key_mobile", bankcard.field_mobile);
            C67154b.this.f232423c.putParcelable("key_bankcard", bankcard);
            authen.f209356I = k9Var.f227734d;
            authen.f209357J = k9Var.f227737g;
            authen.f209358K = k9Var.f227736f;
            authen.f209359L = "1";
            C75326b a = C67341a.m79678a(authen, (Orders) C67154b.this.f232423c.getParcelable("key_orders"), false);
            if (a != null) {
                this.f221419b.mo105625d(a, true);
            }
            return false;
        }

        /* renamed from: e */
        public boolean mo91272e(int i, int i2, String str, C117747y yVar) {
            if (!(yVar instanceof C75326b)) {
                return false;
            }
            Log.m105924i("MicroMsg.PayProcess", "finish auth");
            C75326b bVar = (C75326b) yVar;
            Authen authen = bVar.f221493C;
            Orders orders = bVar.f221492B;
            C67154b.this.f232423c.putParcelable("key_authen", authen);
            C67154b.this.f232423c.putParcelable("key_orders", orders);
            C67154b.this.f232423c.putString("kreq_token", bVar.f221494D);
            C67154b.this.f232423c.putBoolean("key_is_return_from_switch_phone", true);
            C67154b.this.f232423c.putInt("key_err_code", 0);
            Bankcard bankcard = (Bankcard) C67154b.this.f232423c.getParcelable("key_bankcard");
            bankcard.field_bankcardType = authen.f209370g;
            bankcard.field_bindSerial = authen.f209371h;
            C67154b.this.mo96262m(this.f221418a);
            return true;
        }
    }

    /* renamed from: b53.b$d */
    public class C67158d extends C67173s {
        public C67158d(WalletBaseUI walletBaseUI, C75296i iVar) {
            super(C67154b.this, walletBaseUI, iVar);
        }

        /* renamed from: d */
        public boolean mo91271d(Object... objArr) {
            if (objArr.length > 0) {
                this.f221419b.mo105625d(C67341a.m79681d(objArr[0], (Orders) C67154b.this.f232423c.getParcelable("key_orders")), true);
            }
            return false;
        }

        /* renamed from: e */
        public boolean mo91272e(int i, int i2, String str, C117747y yVar) {
            if (yVar instanceof C75857g) {
                C75857g gVar = (C75857g) yVar;
                if (i == 0 && i2 == 0) {
                    if (gVar.isPaySuccess) {
                        C67154b.this.f232423c.putParcelable("key_orders", gVar.f222501x);
                    }
                    RealnameGuideHelper realnameGuideHelper = gVar.f222394s;
                    if (realnameGuideHelper != null) {
                        C67154b.this.f232423c.putParcelable("key_realname_guide_helper", realnameGuideHelper);
                    }
                    C67154b bVar = C67154b.this;
                    bVar.mo91264o(this.f221418a, 0, bVar.f232423c);
                    this.f221418a.finish();
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: b53.b$e */
    public class C67159e implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ int f192828d;

        /* renamed from: e */
        public final /* synthetic */ WalletBaseUI f192829e;

        public C67159e(int i, WalletBaseUI walletBaseUI) {
            this.f192828d = i;
            this.f192829e = walletBaseUI;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C67154b.this.f232423c.putInt("key_pay_flag", 3);
            C67154b.this.f232423c.putInt("key_err_code", this.f192828d);
            C67154b bVar = C67154b.this;
            bVar.mo91264o(this.f192829e, 0, bVar.f232423c);
            if (this.f192829e.isTransparent()) {
                this.f192829e.finish();
            }
        }
    }

    /* renamed from: b53.b$f */
    public class C67160f implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ WalletBaseUI f192831d;

        public C67160f(WalletBaseUI walletBaseUI) {
            this.f192831d = walletBaseUI;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C67154b.this.f232423c.putInt("key_err_code", -1003);
            C67154b bVar = C67154b.this;
            bVar.mo91264o(this.f192831d, 0, bVar.f232423c);
            if (this.f192831d.isTransparent()) {
                this.f192831d.finish();
            }
        }
    }

    /* renamed from: b53.b$g */
    public class C67161g implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ WalletBaseUI f192833d;

        public C67161g(WalletBaseUI walletBaseUI) {
            this.f192833d = walletBaseUI;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C67154b bVar = C67154b.this;
            bVar.mo91259f(this.f192833d, bVar.f232423c);
            if (this.f192833d.isTransparent()) {
                this.f192833d.finish();
            }
        }
    }

    /* renamed from: b53.b$h */
    public class C67162h implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ WalletBaseUI f192835d;

        public C67162h(WalletBaseUI walletBaseUI) {
            this.f192835d = walletBaseUI;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Bankcard bankcard = (Bankcard) C67154b.this.f232423c.getParcelable("key_bankcard");
            PayInfo payInfo = (PayInfo) C67154b.this.f232423c.getParcelable("key_pay_info");
            if (!(bankcard == null || payInfo == null)) {
                bankcard.f209414i2 = payInfo.f212592j;
            }
            C67154b.this.f232423c.putInt("key_err_code", -1004);
            C67154b bVar = C67154b.this;
            bVar.mo91264o(this.f192835d, 0, bVar.f232423c);
            if (this.f192835d.isTransparent()) {
                this.f192835d.finish();
            }
        }
    }

    /* renamed from: b53.b$i */
    public class C67163i implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ WalletBaseUI f192837d;

        public C67163i(WalletBaseUI walletBaseUI) {
            this.f192837d = walletBaseUI;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C67154b bVar = C67154b.this;
            bVar.mo91259f(this.f192837d, bVar.f232423c);
            if (this.f192837d.isTransparent()) {
                this.f192837d.finish();
            }
        }
    }

    /* renamed from: b53.b$j */
    public class C67164j implements Runnable {
        public C67164j() {
        }

        public void run() {
            Iterator it = ((ArrayList) C67154b.this.f192823d).iterator();
            while (it.hasNext()) {
                WalletBaseUI walletBaseUI = (WalletBaseUI) ((WeakReference) it.next()).get();
                if (walletBaseUI != null && !walletBaseUI.hasFinish()) {
                    Log.m105925i("MicroMsg.PayProcess", "do finish activity: %s", walletBaseUI);
                    walletBaseUI.finish();
                }
            }
            ((ArrayList) C67154b.this.f192823d).clear();
        }
    }

    /* renamed from: b53.b$k */
    public class C67165k extends C67173s {
        public C67165k(C67154b bVar, WalletBaseUI walletBaseUI, C75296i iVar) {
            super(bVar, walletBaseUI, iVar);
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

    /* renamed from: b53.b$l */
    public class C67166l extends C67173s {
        public C67166l(C67154b bVar, WalletBaseUI walletBaseUI, C75296i iVar) {
            super(bVar, walletBaseUI, iVar);
        }

        /* renamed from: d */
        public boolean mo91271d(Object... objArr) {
            this.f221419b.mo105625d(new C78356x(objArr[0], 4, objArr[1]), true);
            return true;
        }

        /* renamed from: e */
        public boolean mo91272e(int i, int i2, String str, C117747y yVar) {
            return false;
        }
    }

    /* renamed from: b53.b$m */
    public class C67167m extends C67173s {
        public C67167m(WalletBaseUI walletBaseUI, C75296i iVar) {
            super(C67154b.this, walletBaseUI, iVar);
        }

        /* renamed from: c */
        public boolean mo91280c(Object... objArr) {
            if (C67154b.this.f232423c.getInt("key_pay_scene", 0) == 11) {
                C67154b.this.f232423c.putParcelable("key_history_bankcard", C79029b0.vx0().wx0().f192954g);
            }
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

    /* renamed from: b53.b$n */
    public class C67168n extends C67173s {
        public C67168n(WalletBaseUI walletBaseUI, C75296i iVar) {
            super(C67154b.this, walletBaseUI, iVar);
        }

        /* renamed from: d */
        public boolean mo91271d(Object... objArr) {
            Authen authen = objArr[0];
            Orders orders = objArr[1];
            Log.m105924i("MicroMsg.PayProcess", "WalletCardElementUI onNext pay_flag : " + C67154b.this.f232423c.getInt("key_pay_flag", 0));
            int i = C67154b.this.f232423c.getInt("key_pay_flag", 0);
            if (i == 1) {
                if (!C67154b.this.mo109116r()) {
                    authen.f209367d = 1;
                } else {
                    authen.f209367d = 4;
                }
                this.f221419b.mo105625d(new C75326b(authen, orders, false), true);
                return true;
            } else if (i == 2) {
                if (!C67154b.this.mo109116r()) {
                    authen.f209367d = 2;
                } else {
                    authen.f209367d = 5;
                }
                if (C67154b.this.f232423c.getBoolean("key_is_changing_balance_phone_num", false)) {
                    this.f221419b.mo105625d(C67341a.m79679b(authen, orders, C67154b.this.f232423c.getBoolean("key_isbalance", false)), true);
                } else {
                    this.f221419b.mo105625d(new C75326b(authen, orders, false), true);
                }
                return true;
            } else if (i != 3) {
                return false;
            } else {
                if (!C67154b.this.mo109116r()) {
                    authen.f209367d = 3;
                } else {
                    authen.f209367d = 6;
                }
                this.f221419b.mo105625d(new C75326b(authen, orders, false), true);
                return true;
            }
        }

        /* renamed from: e */
        public boolean mo91272e(int i, int i2, String str, C117747y yVar) {
            PayInfo payInfo;
            if (i != 0 || i2 != 0) {
                return false;
            }
            boolean z = yVar instanceof C75326b;
            if (z) {
                C75326b bVar = (C75326b) yVar;
                C67154b bVar2 = C67154b.this;
                bVar2.f192824e = bVar;
                bVar2.f232423c.putString("kreq_token", bVar.f221494D);
                if (bVar.isPaySuccess) {
                    C67154b.this.f232423c.putParcelable("key_orders", bVar.f221492B);
                }
                RealnameGuideHelper realnameGuideHelper = bVar.f222394s;
                if (realnameGuideHelper != null) {
                    C67154b.this.f232423c.putParcelable("key_realname_guide_helper", realnameGuideHelper);
                }
            } else if (yVar instanceof C75327c) {
                C75327c cVar = (C75327c) yVar;
                C67154b bVar3 = C67154b.this;
                bVar3.f192824e = cVar;
                bVar3.f232423c.putString("kreq_token", cVar.f221494D);
                if (cVar.isPaySuccess) {
                    C67154b.this.f232423c.putParcelable("key_orders", cVar.f221492B);
                }
            }
            if (C67154b.this.mo91267t(this.f221418a, (Bundle) null)) {
                C75296i iVar = this.f221419b;
                Bundle bundle = C67154b.this.f232423c;
                String str2 = "";
                if (!(bundle == null || (payInfo = (PayInfo) bundle.getParcelable("key_pay_info")) == null)) {
                    str2 = payInfo.f212592j;
                }
                iVar.mo105625d(new C78342e0(str2, 13), true);
                return true;
            }
            if (!z || !((C75326b) yVar).f221501x) {
                C67154b bVar4 = C67154b.this;
                bVar4.mo91264o(this.f221418a, 0, bVar4.f232423c);
            }
            return true;
        }
    }

    /* renamed from: b53.b$o */
    public class C67169o extends C67173s {
        public C67169o(WalletBaseUI walletBaseUI, C75296i iVar) {
            super(C67154b.this, walletBaseUI, iVar);
        }

        /* renamed from: d */
        public boolean mo91271d(Object... objArr) {
            C67210w wVar = objArr[1];
            Orders orders = (Orders) C67154b.this.f232423c.getParcelable("key_orders");
            Log.m105924i("MicroMsg.PayProcess", "WalletVerifyCodeUI onNext pay_flag : " + C67154b.this.f232423c.getInt("key_pay_flag", 0));
            boolean z = C67154b.this.f232423c.getBoolean("key_is_changing_balance_phone_num");
            int i = C67154b.this.f232423c.getInt("key_pay_flag", 0);
            if (i == 1) {
                wVar.f192983a = "1";
                if (z) {
                    this.f221419b.mo105625d(C67341a.m79680c(wVar, orders), true);
                } else {
                    C75857g d = C67341a.m79681d(wVar, orders);
                    if (d != null) {
                        this.f221419b.mo105625d(d, true);
                    }
                }
                return true;
            } else if (i == 2) {
                if (!C67154b.this.mo109116r()) {
                    wVar.f192983a = "2";
                } else {
                    wVar.f192983a = WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY;
                }
                if (z) {
                    this.f221419b.mo105625d(C67341a.m79680c(wVar, orders), true);
                } else {
                    C75857g d2 = C67341a.m79681d(wVar, orders);
                    if (d2 != null) {
                        this.f221419b.mo105625d(d2, true);
                    }
                }
                return true;
            } else if (i != 3) {
                return false;
            } else {
                if (!C67154b.this.mo109116r()) {
                    wVar.f192983a = "3";
                } else {
                    wVar.f192983a = WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_NOTIFY_ONLY_INSTALL_EMBED_PLUGIN;
                }
                if (z) {
                    this.f221419b.mo105625d(C67341a.m79680c(wVar, orders), true);
                } else {
                    C75857g d3 = C67341a.m79681d(wVar, orders);
                    if (d3 != null) {
                        this.f221419b.mo105625d(d3, true);
                    }
                }
                return true;
            }
        }

        /* renamed from: e */
        public boolean mo91272e(int i, int i2, String str, C117747y yVar) {
            if (i == 0 && i2 == 0) {
                if ((yVar instanceof C75857g) || (yVar instanceof C75852b)) {
                    C75857g gVar = (C75857g) yVar;
                    if (gVar.isPaySuccess) {
                        C67154b.this.f232423c.putParcelable("key_orders", gVar.f222501x);
                    }
                    RealnameGuideHelper realnameGuideHelper = gVar.f222394s;
                    if (realnameGuideHelper != null) {
                        C67154b.this.f232423c.putParcelable("key_realname_guide_helper", realnameGuideHelper);
                    }
                    C115669n.INSTANCE.mo160131h(10707, 1, Integer.valueOf((int) ((System.currentTimeMillis() - C72517z.f210938a) / 1000)));
                } else if (yVar instanceof C75326b) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: f */
        public boolean mo91281f(Object... objArr) {
            C75326b bVar = C67154b.this.f192824e;
            if (bVar == null) {
                return false;
            }
            bVar.resend();
            this.f221419b.mo95362b(C67154b.this.f192824e, false);
            return true;
        }
    }

    /* renamed from: b53.b$p */
    public class C67170p extends C67173s {
        public C67170p(C67154b bVar, WalletBaseUI walletBaseUI, C75296i iVar) {
            super(bVar, walletBaseUI, iVar);
        }

        /* renamed from: a */
        public CharSequence mo91282a(int i) {
            if (i == 0) {
                return this.f221418a.getString(C0966R.string.f361535km2);
            }
            if (i != 1) {
                return null;
            }
            return this.f221418a.getString(C0966R.string.f361534km1);
        }

        /* renamed from: d */
        public boolean mo91271d(Object... objArr) {
            Orders orders = objArr[0];
            Bankcard bankcard = C79029b0.vx0().wx0().f192955h;
            if (bankcard == null) {
                Log.m105924i("MicroMsg.PayProcess", "balance == null");
                return false;
            }
            bankcard.f209415j2 += orders.f209566h;
            return false;
        }

        /* renamed from: e */
        public boolean mo91272e(int i, int i2, String str, C117747y yVar) {
            return false;
        }
    }

    /* renamed from: b53.b$q */
    public class C67171q extends C67173s {
        public C67171q(WalletBaseUI walletBaseUI, C75296i iVar) {
            super(C67154b.this, walletBaseUI, iVar);
        }

        /* renamed from: a */
        public CharSequence mo91282a(int i) {
            return this.f221418a.getString(C0966R.string.l9c);
        }

        /* renamed from: d */
        public boolean mo91271d(Object... objArr) {
            C117747y yVar;
            String str;
            C67210w wVar = objArr[0];
            Orders orders = (Orders) C67154b.this.f232423c.getParcelable("key_orders");
            if (wVar == null || orders == null) {
                Log.m105920e("MicroMsg.CgiManager", "empty verify or orders");
                yVar = null;
            } else {
                PayInfo payInfo = wVar.f192996n;
                if (payInfo != null) {
                    Log.m105924i("MicroMsg.CgiManager", "get reqKey from payInfo");
                    str = payInfo.f212592j;
                } else {
                    str = "";
                }
                if (Util.isNullOrNil(str)) {
                    Log.m105924i("MicroMsg.CgiManager", "get reqKey from orders");
                    str = orders.f209563e;
                }
                if (Util.isNullOrNil(str)) {
                    Log.m105924i("MicroMsg.CgiManager", "empty reqKey!");
                    yVar = new C76144j(wVar, orders);
                } else {
                    if (payInfo != null) {
                        Log.m105919d("MicroMsg.CgiManager", "reqKey: %s, %s", payInfo.f212592j, orders.f209563e);
                    }
                    Log.m105925i("MicroMsg.CgiManager", "verifyreg reqKey: %s", str);
                    Log.m105924i("MicroMsg.CgiManager", "verifyreg go new split cgi");
                    yVar = str.startsWith("sns_aa_") ? new C76135a(wVar, orders) : str.startsWith("sns_tf_") ? new C76142h(wVar, orders) : str.startsWith("sns_ff_") ? new C76137c(wVar, orders) : str.startsWith("ts_") ? new C76138d(wVar, orders) : str.startsWith("sns_") ? new C76140f(wVar, orders) : str.startsWith("up_") ? new C76143i(wVar, orders) : str.startsWith("seb_ff_") ? new C76139e(wVar, orders) : str.startsWith("tax_") ? new C76141g(wVar, orders) : str.startsWith("dc_") ? new C76136b(wVar, orders) : new C76144j(wVar, orders);
                }
            }
            if (yVar != null) {
                this.f221419b.mo105625d(yVar, true);
            }
            return true;
        }

        /* renamed from: e */
        public boolean mo91272e(int i, int i2, String str, C117747y yVar) {
            if (!(yVar instanceof C76144j) || i != 0 || i2 != 0) {
                return false;
            }
            C76144j jVar = (C76144j) yVar;
            if (jVar.isPaySuccess) {
                C67154b.this.f232423c.putParcelable("key_orders", jVar.f223049x);
            }
            RealnameGuideHelper realnameGuideHelper = jVar.f222394s;
            if (realnameGuideHelper != null) {
                C67154b.this.f232423c.putParcelable("key_realname_guide_helper", realnameGuideHelper);
            }
            C67154b bVar = C67154b.this;
            bVar.mo91264o(this.f221418a, 0, bVar.f232423c);
            return true;
        }
    }

    /* renamed from: b53.b$r */
    public class C67172r extends C67174c {
        public C67172r(C67154b bVar, WalletBaseUI walletBaseUI, C75296i iVar) {
            super(walletBaseUI, iVar);
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

    /* renamed from: b53.b$s */
    public abstract class C67173s extends C67174c {
        public C67173s(C67154b bVar, WalletBaseUI walletBaseUI, C75296i iVar) {
            super(walletBaseUI, iVar);
        }
    }

    /* renamed from: A */
    public C79148e mo91260A(Activity activity, Bundle bundle) {
        PayInfo payInfo = (PayInfo) bundle.getParcelable("key_pay_info");
        bundle.putInt("key_pay_scene", payInfo.f212587e);
        bundle.putInt("key_pay_channel", payInfo.f212589g);
        if (mo91261F(activity, bundle)) {
            Log.m105928w("MicroMsg.PayProcess", "hy: has err. return");
            return this;
        }
        int i = bundle.getInt("key_pay_flag", 0);
        if ((i == 2 || i == 1) && payInfo.f212587e == 11) {
            C75133p0.m90118b(13);
        }
        Log.m105924i("MicroMsg.PayProcess", "start pay_flag : " + bundle.getInt("key_pay_flag", 0));
        int i2 = bundle.getInt("key_pay_flag", 0);
        if (i2 == 1) {
            Log.m105924i("MicroMsg.PayProcess", "start Process : PayRegBindProcess");
            mo109103B(activity, WalletBankcardIdUI.class, bundle);
        } else if (i2 == 2) {
            Log.m105924i("MicroMsg.PayProcess", "start Process : PayBindProcess");
            mo109103B(activity, WalletCheckPwdUI.class, bundle);
        } else if (i2 == 3) {
            if (!bundle.getBoolean("key_need_verify_sms", false) || mo109116r()) {
                Log.m105924i("MicroMsg.PayProcess", "jump to result ui!");
                mo91262G(activity, bundle);
            } else {
                Log.m105924i("MicroMsg.PayProcess", "domestic and verify sms!");
                mo109103B(activity, WalletVerifyCodeUI.class, bundle);
            }
        }
        return this;
    }

    /* renamed from: F */
    public final boolean mo91261F(Activity activity, Bundle bundle) {
        Class<WalletBankcardIdUI> cls = WalletBankcardIdUI.class;
        Class<WalletResetInfoUI> cls2 = WalletResetInfoUI.class;
        Class cls3 = C79173v.class;
        int i = bundle.getInt("key_err_code", 0);
        Log.m105925i("MicroMsg.PayProcess", "dealwithErr(), errCode %d", Integer.valueOf(i));
        if (i == -1004) {
            this.f232423c.putInt("key_pay_flag", 3);
            this.f232423c.putInt("key_err_code", 0);
            int intValue = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_FORCE_USE_NEW_CASHIER_INT_SYNC, 0)).intValue();
            if (CrashReportFactory.hasDebuger() || BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE) {
                intValue = 1;
            }
            Orders orders = (Orders) this.f232423c.getParcelable("key_orders");
            if (intValue == 1 || (orders != null && orders.f209556V0 == 1)) {
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("direc_change_bankcard", true);
                bundle2.putBoolean("send_cancel_event", false);
                mo109108d(activity, WalletPayUI.class, bundle2, 0);
            } else {
                mo109103B(activity, WalletChangeBankcardUI.class, bundle);
            }
            return true;
        } else if (i == -1003) {
            if (C79029b0.vx0().wx0().mo91341w()) {
                bundle.putInt("key_pay_flag", 2);
                bundle.putInt("key_err_code", 0);
                mo109103B(activity, WalletCheckPwdUI.class, bundle);
            } else {
                bundle.putInt("key_pay_flag", 1);
                bundle.putInt("key_err_code", 0);
                mo109103B(activity, cls, bundle);
            }
            return true;
        } else if (i == 402 || i == 403 || i == 408) {
            Bankcard bankcard = (Bankcard) this.f232423c.get("key_bankcard");
            if (bankcard == null || !bankcard.mo99388n2()) {
                mo109103B(activity, cls2, bundle);
            } else if (((C79173v) C86312j.m106911c(cls3)).Ex0().mo91326h() == null || ((C79173v) C86312j.m106911c(cls3)).Ex0().mo91326h().size() <= 0) {
                mo109103B(activity, cls, bundle);
            } else {
                Log.m105924i("MicroMsg.PayProcess", "hy: go to select bankcard ui");
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("key_is_show_new_bankcard", true);
                bundle3.putInt("key_scene", 0);
                bundle3.putParcelableArrayList("key_showing_bankcards", ((C79173v) C86312j.m106911c(cls3)).Ex0().mo91326h());
                bundle3.putString("key_top_tips", activity.getString(C0966R.string.l8m));
                mo109103B(activity, WalletSelectBankcardUI.class, bundle3);
            }
            return true;
        } else if (i == 417) {
            bundle.putInt("key_err_code", 0);
            mo109103B(activity, WalletSwitchVerifyPhoneUI.class, bundle);
            return true;
        } else if (i != 418) {
            return false;
        } else {
            bundle.putInt("key_err_code", 0);
            mo109103B(activity, cls2, bundle);
            return true;
        }
    }

    /* renamed from: G */
    public final void mo91262G(Activity activity, Bundle bundle) {
        Bundle bundle2 = this.f232423c;
        if (bundle2 != null && bundle2.containsKey("key_realname_guide_helper")) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putParcelable("key_realname_guide_helper", this.f232423c.getParcelable("key_realname_guide_helper"));
        }
        int i = bundle.getInt("key_pay_scene", 6);
        Log.m105925i("MicroMsg.PayProcess", "jumpToResultUI() payScene:%d", Integer.valueOf(i));
        if (i == 11 || i == 21) {
            mo109103B(activity, WalletBalanceResultUI.class, bundle);
        } else if (i == 5 || i == 31 || i == 32 || i == 33 || i == 48) {
            PayInfo payInfo = (PayInfo) bundle.getParcelable("key_pay_info");
            if (payInfo == null || payInfo.f212581L != 1) {
                mo109105D(activity, "remittance", ".ui.RemittanceResultUI", bundle);
                return;
            }
            Log.m105924i("MicroMsg.PayProcess", "is busi f2f");
            mo91259f(activity, bundle);
        } else if (i == 37 || i == 39 || i == 42 || i == 45 || i == 52 || i == 49) {
            mo91259f(activity, bundle);
        } else if (i == 56) {
            mo109105D(activity, "remittance", ".mobile.ui.MobileRemitResultUI", bundle);
        } else {
            mo109103B(activity, WalletOrderInfoUI.class, bundle);
        }
    }

    /* renamed from: b */
    public void mo91263b(WalletBaseUI walletBaseUI) {
        ((ArrayList) this.f192823d).add(new WeakReference(walletBaseUI));
    }

    /* renamed from: c */
    public void mo91257c(Activity activity, int i) {
        Log.m105924i("MicroMsg.PayProcess", "back pay_flag : " + this.f232423c.getInt("key_pay_flag", 0));
        if (activity instanceof WalletPwdConfirmUI) {
            mo109108d(activity, WalletSetPasswordUI.class, (Bundle) null, i);
            return;
        }
        C75133p0.m90117a();
        mo96262m(activity);
    }

    /* renamed from: e */
    public String mo91258e() {
        return "PayProcess";
    }

    /* renamed from: f */
    public void mo91259f(Activity activity, Bundle bundle) {
        PayInfo payInfo;
        PayInfo payInfo2;
        StringBuilder sb = new StringBuilder();
        sb.append("end pay_flag : ");
        int i = 0;
        sb.append(this.f232423c.getInt("key_pay_flag", 0));
        Log.m105924i("MicroMsg.PayProcess", sb.toString());
        C75133p0.m90117a();
        int i2 = this.f232423c.getBoolean("intent_pay_end", false) ? -1 : 0;
        Intent intent = new Intent();
        if (bundle != null) {
            PayInfo payInfo3 = (PayInfo) this.f232423c.getParcelable("key_pay_info");
            Bundle bundle2 = new Bundle();
            bundle2.putInt("intent_pay_end_errcode", this.f232423c.getInt("intent_pay_end_errcode"));
            bundle2.putString("intent_pay_app_url", this.f232423c.getString("intent_pay_app_url"));
            bundle2.putBoolean("intent_pay_end", this.f232423c.getBoolean("intent_pay_end"));
            bundle2.putString("intent_wap_pay_jump_url", this.f232423c.getString("intent_wap_pay_jump_url"));
            bundle2.putParcelable("key_realname_guide_helper", this.f232423c.getParcelable("key_realname_guide_helper"));
            if (payInfo3 != null) {
                bundle2.putInt("pay_channel", payInfo3.f212589g);
            }
            intent.putExtras(bundle2);
        }
        intent.putExtra("key_orders", (Orders) this.f232423c.getParcelable("key_orders"));
        intent.putExtra("key_is_clear_failure", this.f232423c.getInt("key_is_clear_failure", -1));
        WalletPayResultEvent walletPayResultEvent = new WalletPayResultEvent();
        WalletPayResultEvent.C67828a aVar = walletPayResultEvent.f194085d;
        aVar.f194086a = intent;
        Bundle bundle3 = this.f232423c;
        String str = "";
        if (!(bundle3 == null || (payInfo2 = (PayInfo) bundle3.getParcelable("key_pay_info")) == null)) {
            str = payInfo2.f212592j;
        }
        aVar.f194089d = str;
        WalletPayResultEvent.C67828a aVar2 = walletPayResultEvent.f194085d;
        if (this.f232423c.getBoolean("intent_pay_end", false)) {
            i = -1;
        }
        aVar2.f194088c = i;
        if (!(walletPayResultEvent.f194085d.f194088c != 0 || bundle == null || (payInfo = (PayInfo) bundle.getParcelable("key_pay_info")) == null)) {
            C20511b.m22216a(payInfo.f212592j, payInfo.f212587e, payInfo.f212589g);
        }
        walletPayResultEvent.publish();
        mo109113k(activity, "wallet", ".pay.ui.WalletPayUI", i2, intent, false);
    }

    /* renamed from: o */
    public void mo91264o(Activity activity, int i, Bundle bundle) {
        Class<WalletVerifyCodeUI> cls = WalletVerifyCodeUI.class;
        if (mo91261F(activity, bundle)) {
            Log.m105924i("MicroMsg.PayProcess", "deal with the err!");
            return;
        }
        boolean z = activity instanceof WalletSwitchVerifyPhoneUI;
        if (z) {
            if (this.f232423c.getBoolean("key_forward_to_id_verify", false)) {
                Log.m105924i("MicroMsg.PayProcess", "go to verify id tail");
                mo109103B(activity, WalletVerifyIdCardUI.class, this.f232423c);
                return;
            }
        } else if (activity instanceof WalletVerifyIdCardUI) {
            mo91262G(activity, bundle);
        }
        int i2 = bundle.containsKey("key_pay_flag") ? bundle.getInt("key_pay_flag", 0) : this.f232423c.getInt("key_pay_flag", 0);
        Log.m105924i("MicroMsg.PayProcess", "forward pay_flag : " + i2);
        if (i2 == 1) {
            Log.m105924i("MicroMsg.PayProcess", "forwardUnreg()");
            if (activity instanceof WalletSetPasswordUI) {
                mo109103B(activity, WalletPwdConfirmUI.class, bundle);
            } else if (activity instanceof WalletPwdConfirmUI) {
                mo91262G(activity, bundle);
            } else if (activity instanceof WalletCardElementUI) {
                if (!mo109116r()) {
                    Log.m105924i("MicroMsg.PayProcess", "domestic, verify code");
                    mo109103B(activity, cls, bundle);
                    return;
                }
                Log.m105924i("MicroMsg.PayProcess", "oversea, set pwd");
                mo109103B(activity, WalletSetPasswordUI.class, bundle);
            } else if (activity instanceof WalletBalanceResultUI) {
                mo109110h(activity, WalletBalanceManagerUI.class, -1, (Intent) null, true);
            } else {
                super.mo91264o(activity, 0, bundle);
            }
        } else if (i2 == 2) {
            Log.m105924i("MicroMsg.PayProcess", "forwardBind()");
            if ((activity instanceof WalletCheckPwdUI) || (activity instanceof WalletSelectBankcardUI) || z) {
                mo109103B(activity, WalletBankcardIdUI.class, bundle);
            } else if (activity instanceof WalletVerifyCodeUI) {
                mo91262G(activity, bundle);
            } else if (activity instanceof WalletCardElementUI) {
                if (!mo109116r()) {
                    Log.m105924i("MicroMsg.PayProcess", "domestic, verify code!");
                    mo109103B(activity, cls, bundle);
                    return;
                }
                Log.m105924i("MicroMsg.PayProcess", "oversea, jump to result ui!");
                mo91262G(activity, bundle);
            } else if (activity instanceof WalletBalanceResultUI) {
                mo109110h(activity, WalletBalanceManagerUI.class, -1, (Intent) null, true);
            } else {
                super.mo91264o(activity, 0, bundle);
            }
        } else if (i2 == 3) {
            Log.m105924i("MicroMsg.PayProcess", "forwardBound()");
            if (activity instanceof WalletVerifyCodeUI) {
                mo91262G(activity, bundle);
            } else if ((activity instanceof WalletResetInfoUI) || (activity instanceof WalletChangeBankcardUI)) {
                if ((!bundle.getBoolean("key_need_verify_sms", false) || mo109116r()) && !bundle.getBoolean("key_is_changing_balance_phone_num")) {
                    Log.m105924i("MicroMsg.PayProcess", "jump to result ui!");
                    mo91262G(activity, bundle);
                    return;
                }
                Log.m105924i("MicroMsg.PayProcess", "need verify code after reset info or change bank card info!");
                mo109103B(activity, cls, bundle);
            } else if (activity instanceof WalletBalanceResultUI) {
                mo109110h(activity, WalletBalanceManagerUI.class, -1, (Intent) null, true);
            } else if ((activity instanceof WalletSelectBankcardUI) || z) {
                Log.m105924i("MicroMsg.PayProcess", "need verify code after select bank card!");
                mo109103B(activity, cls, bundle);
            } else {
                super.mo91264o(activity, 0, bundle);
            }
        }
    }

    /* renamed from: p */
    public C75282g mo91265p(MMActivity mMActivity, C75296i iVar) {
        if (mMActivity instanceof WalletPayUI) {
            return new C67165k(this, (WalletBaseUI) mMActivity, iVar);
        }
        if (mMActivity instanceof WalletCheckPwdUI) {
            return new C67166l(this, (WalletBaseUI) mMActivity, iVar);
        }
        if (mMActivity instanceof WalletBankcardIdUI) {
            return new C67167m((WalletBaseUI) mMActivity, iVar);
        }
        if (mMActivity instanceof WalletCardElementUI) {
            return new C67168n((WalletBaseUI) mMActivity, iVar);
        }
        if (mMActivity instanceof WalletVerifyCodeUI) {
            return new C67169o((WalletBaseUI) mMActivity, iVar);
        }
        if (mMActivity instanceof WalletBalanceResultUI) {
            return new C67170p(this, (WalletBaseUI) mMActivity, iVar);
        }
        if (mMActivity instanceof WalletPwdConfirmUI) {
            return new C67171q((WalletBaseUI) mMActivity, iVar);
        }
        if (mMActivity instanceof WalletChangeBankcardUI) {
            return new C67172r(this, (WalletBaseUI) mMActivity, iVar);
        }
        if (mMActivity instanceof WalletSelectBankcardUI) {
            return new C67155a(mMActivity, iVar);
        }
        if (mMActivity instanceof WalletResetInfoUI) {
            return new C67156b(this, (WalletBaseUI) mMActivity, iVar);
        }
        if (mMActivity instanceof WalletSwitchVerifyPhoneUI) {
            return new C67157c((WalletBaseUI) mMActivity, iVar);
        }
        if (mMActivity instanceof WalletVerifyIdCardUI) {
            return new C67158d((WalletBaseUI) mMActivity, iVar);
        }
        return null;
    }

    /* renamed from: q */
    public int mo91266q(MMActivity mMActivity, int i) {
        return C0966R.string.l4c;
    }

    /* renamed from: t */
    public boolean mo91267t(Activity activity, Bundle bundle) {
        Log.m105918d("MicroMsg.PayProcess", "pay_flag : " + this.f232423c.getInt("key_pay_flag", 0));
        int i = this.f232423c.getInt("key_pay_flag", 0);
        if (i == 1) {
            return activity instanceof WalletOrderInfoUI;
        }
        if (i != 2) {
            return false;
        }
        return activity instanceof WalletOrderInfoUI;
    }

    /* renamed from: w */
    public boolean mo91268w(WalletBaseUI walletBaseUI, int i, String str) {
        Log.m105925i("MicroMsg.PayProcess", "onReceiveErr(), errCode %d", Integer.valueOf(i));
        if (i != 408) {
            switch (i) {
                case 402:
                case 403:
                    break;
                case 404:
                    Log.m105924i("MicroMsg.PayProcess", "404 pay error, cancel pay or change!");
                    ArrayList<Bankcard> h = C79029b0.vx0().wx0().mo91326h();
                    if (h == null || h.isEmpty()) {
                        C76879j.m92707A(walletBaseUI, str, "", walletBaseUI.getString(C0966R.string.l3j), walletBaseUI.getString(C0966R.string.knp), new C67160f(walletBaseUI), new C67161g(walletBaseUI));
                    } else {
                        C76879j.m92707A(walletBaseUI, str, "", walletBaseUI.getString(C0966R.string.f361599l42), walletBaseUI.getString(C0966R.string.knp), new C67162h(walletBaseUI), new C67163i(walletBaseUI));
                    }
                    return true;
            }
        }
        if ((this.f232423c.getInt("key_pay_flag", 0) == 3) && this.f232423c.getParcelable("key_bankcard") != null) {
            Bankcard bankcard = (Bankcard) this.f232423c.getParcelable("key_bankcard");
            if (Util.isNullOrNil(str)) {
                str = walletBaseUI.getString(C0966R.string.l4r, new Object[]{bankcard.field_desc, bankcard.field_mobile});
            }
            C76879j.m92707A(walletBaseUI, str, "", walletBaseUI.getString(C0966R.string.l4q), walletBaseUI.getString(C0966R.string.f7926wf), new C67159e(i, walletBaseUI), (DialogInterface.OnClickListener) null);
            return true;
        }
        return false;
    }

    /* renamed from: x */
    public void mo91269x() {
        MMHandlerThread.postToMainThreadDelayed(new C67164j(), 200);
    }

    /* renamed from: y */
    public void mo91270y(WalletBaseUI walletBaseUI) {
        Iterator it = ((ArrayList) this.f192823d).iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == walletBaseUI) {
                ((ArrayList) this.f192823d).remove(weakReference);
                return;
            }
        }
    }
}
