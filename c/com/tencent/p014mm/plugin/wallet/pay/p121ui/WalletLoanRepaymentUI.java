package com.tencent.p014mm.plugin.wallet.pay.p121ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import b63.C67198p0;
import c53.C67343c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.KindaBindCardEvent;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.plugin.wallet_core.model.FavorPayInfo;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72377f0;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72379f1;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C75133p0;
import com.tencent.p014mm.wallet_core.model.C75136r0;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import di3.C86312j;
import h81.C32735h;
import ie3.C76324c;
import ie3.C8883h;
import java.util.HashMap;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C117747y;
import p281yz.C79173v;
import te3.C64592nu;
import v53.C78339d;
import v53.C78357y;
import x43.C78769a;
import yq3.C79143a;
import yq3.C79144b;
import yq3.C79148e;

@C88989a(7)
/* renamed from: com.tencent.mm.plugin.wallet.pay.ui.WalletLoanRepaymentUI */
public class WalletLoanRepaymentUI extends WalletBaseUI {

    /* renamed from: w */
    public static final /* synthetic */ int f208561w = 0;

    /* renamed from: d */
    public String f208562d;

    /* renamed from: e */
    public String f208563e;

    /* renamed from: f */
    public String f208564f;

    /* renamed from: g */
    public String f208565g;

    /* renamed from: h */
    public String f208566h;

    /* renamed from: i */
    public String f208567i;

    /* renamed from: j */
    public String f208568j;

    /* renamed from: n */
    public C72379f1 f208569n;

    /* renamed from: o */
    public String f208570o;

    /* renamed from: p */
    public double f208571p;

    /* renamed from: q */
    public String f208572q = "CNY";

    /* renamed from: r */
    public String f208573r;

    /* renamed from: s */
    public String f208574s;

    /* renamed from: t */
    public String f208575t;

    /* renamed from: u */
    public int f208576u;

    /* renamed from: v */
    public IListener<KindaBindCardEvent> f208577v = new IListener<KindaBindCardEvent>(C40008f.f107254d) {
        {
            this.__eventId = 572563856;
        }

        public boolean callback(IEvent iEvent) {
            KindaBindCardEvent kindaBindCardEvent = (KindaBindCardEvent) iEvent;
            Log.m105924i("MicroMsg.WalletLoanRepaymentUI", "KindaBindCardEvent callback");
            if (kindaBindCardEvent == null) {
                return false;
            }
            C75133p0.m90117a();
            KindaBindCardEvent.C67721a aVar = kindaBindCardEvent.f193698d;
            if (aVar != null) {
                if (aVar.f193699a) {
                    Log.m105924i("MicroMsg.WalletLoanRepaymentUI", "KindaBindCardEvent bindCard Succ");
                    WalletLoanRepaymentUI walletLoanRepaymentUI = WalletLoanRepaymentUI.this;
                    walletLoanRepaymentUI.doSceneProgress(new C67343c(walletLoanRepaymentUI.f208573r), true);
                } else {
                    Log.m105924i("MicroMsg.WalletLoanRepaymentUI", "KindaBindCardEvent bindCard Cancel");
                    C67198p0 Cx0 = ((C79173v) C86312j.m106911c(C79173v.class)).Cx0();
                    if (Cx0.mo91300c()) {
                        Bankcard b = Cx0.mo91299b();
                        if (b == null || !Util.isNullOrNil(b.field_forbidWord)) {
                            WalletLoanRepaymentUI walletLoanRepaymentUI2 = WalletLoanRepaymentUI.this;
                            int i = WalletLoanRepaymentUI.f208561w;
                            walletLoanRepaymentUI2.mo99103I7();
                        } else {
                            WalletLoanRepaymentUI walletLoanRepaymentUI3 = WalletLoanRepaymentUI.this;
                            walletLoanRepaymentUI3.mo99104J7(b, walletLoanRepaymentUI3.f208571p, walletLoanRepaymentUI3.f208572q);
                        }
                    } else {
                        WalletLoanRepaymentUI.this.setResult(0, (Intent) null);
                    }
                }
            }
            WalletLoanRepaymentUI.this.f208577v.dead();
            return true;
        }
    };

    /* renamed from: com.tencent.mm.plugin.wallet.pay.ui.WalletLoanRepaymentUI$a */
    public class C71904a implements C76324c.C76327d {
        public C71904a() {
        }

        /* renamed from: a */
        public void mo99105a(String str, String str2) {
            if (str == null || str2 == null) {
                Intent intent = new Intent();
                intent.putExtra("is_new_cashier", true);
                WalletLoanRepaymentUI.this.setResult(0, intent);
                WalletLoanRepaymentUI.this.finish();
                return;
            }
            Intent intent2 = new Intent();
            intent2.putExtra(XWalkReaderBasePlugin.PARAM_KEY_TOKEN, str);
            intent2.putExtra("bind_serial", str2);
            intent2.putExtra("is_new_cashier", true);
            WalletLoanRepaymentUI.this.setResult(-1, intent2);
            WalletLoanRepaymentUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pay.ui.WalletLoanRepaymentUI$b */
    public class C71905b implements C72379f1.C72388f {
        public C71905b() {
        }

        /* renamed from: a */
        public void mo96337a(String str, FavorPayInfo favorPayInfo, boolean z) {
            WalletLoanRepaymentUI walletLoanRepaymentUI = WalletLoanRepaymentUI.this;
            walletLoanRepaymentUI.f208574s = str;
            WalletLoanRepaymentUI walletLoanRepaymentUI2 = WalletLoanRepaymentUI.this;
            walletLoanRepaymentUI.doSceneProgress(new C78357y(walletLoanRepaymentUI2.f208574s, walletLoanRepaymentUI2.f208573r));
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pay.ui.WalletLoanRepaymentUI$c */
    public class C71906c extends C7089c0 {

        /* renamed from: g */
        public final /* synthetic */ Bankcard f208581g;

        public C71906c(Bankcard bankcard) {
            this.f208581g = bankcard;
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            WalletLoanRepaymentUI walletLoanRepaymentUI = WalletLoanRepaymentUI.this;
            String str = this.f208581g.field_bindSerial;
            int i = WalletLoanRepaymentUI.f208561w;
            walletLoanRepaymentUI.getClass();
            Log.m105924i("MicroMsg.WalletLoanRepaymentUI", "to change a bankcard " + str);
            Intent intent = new Intent(walletLoanRepaymentUI, WalletChangeLoanRepayBankcardUI.class);
            intent.putExtra("bindSerial", str);
            walletLoanRepaymentUI.startActivityForResult(intent, 1);
            C72379f1 f1Var = WalletLoanRepaymentUI.this.f208569n;
            if (f1Var != null) {
                f1Var.dismiss();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pay.ui.WalletLoanRepaymentUI$d */
    public class C71907d implements DialogInterface.OnCancelListener {
        public C71907d() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            C72379f1 f1Var = WalletLoanRepaymentUI.this.f208569n;
            if (f1Var != null) {
                f1Var.cancel();
                WalletLoanRepaymentUI.this.setResult(0);
                WalletLoanRepaymentUI.this.finish();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pay.ui.WalletLoanRepaymentUI$e */
    public class C71908e implements C79148e.C79149a {
        public C71908e() {
        }

        public Intent onProcessEnd(int i, Bundle bundle) {
            if (i == -1) {
                WalletLoanRepaymentUI walletLoanRepaymentUI = WalletLoanRepaymentUI.this;
                walletLoanRepaymentUI.doSceneProgress(new C67343c(walletLoanRepaymentUI.f208573r), true);
            } else {
                C67198p0 Cx0 = ((C79173v) C86312j.m106911c(C79173v.class)).Cx0();
                if (Cx0.mo91300c()) {
                    Bankcard b = Cx0.mo91299b();
                    if (b == null || !Util.isNullOrNil(b.field_forbidWord)) {
                        WalletLoanRepaymentUI walletLoanRepaymentUI2 = WalletLoanRepaymentUI.this;
                        int i2 = WalletLoanRepaymentUI.f208561w;
                        walletLoanRepaymentUI2.mo99103I7();
                    } else {
                        WalletLoanRepaymentUI walletLoanRepaymentUI3 = WalletLoanRepaymentUI.this;
                        walletLoanRepaymentUI3.mo99104J7(b, walletLoanRepaymentUI3.f208571p, walletLoanRepaymentUI3.f208572q);
                    }
                } else {
                    WalletLoanRepaymentUI.this.setResult(0, (Intent) null);
                }
            }
            return null;
        }
    }

    /* renamed from: H7 */
    public void mo99102H7() {
        Bundle bundle = new Bundle();
        bundle.putInt("key_bind_scene", 8);
        boolean z = true;
        bundle.putBoolean("key_need_bind_response", true);
        bundle.putString("kreq_token", this.f208573r);
        if (C79144b.m95773a().mo109087b()) {
            this.f208577v.alive();
            Log.m105918d("MicroMsg.WalletLoanRepaymentUI", "startKindaBindCard:true");
            C75136r0.m90122d(6, bundle.getInt("key_bind_scene"));
            C75133p0.m90118b(bundle.getInt("key_bind_scene"));
            ((C76324c) C86312j.m106911c(C76324c.class)).startBindCardUseCase(this, bundle);
        } else {
            Log.m105918d("MicroMsg.WalletLoanRepaymentUI", "startKindaBindCard:false");
            z = false;
        }
        if (!z) {
            C79143a.m95771j(this, C78769a.class, bundle, new C71908e());
        }
    }

    /* renamed from: I7 */
    public final void mo99103I7() {
        Log.m105924i("MicroMsg.WalletLoanRepaymentUI", "to change a bankcard");
        startActivityForResult(new Intent(this, WalletChangeLoanRepayBankcardUI.class), 1);
    }

    /* renamed from: J7 */
    public final void mo99104J7(Bankcard bankcard, double d, String str) {
        C72379f1 f1Var;
        C71905b bVar = new C71905b();
        C71906c cVar = new C71906c(bankcard);
        C71907d dVar = new C71907d();
        this.f208575t = bankcard.field_bindSerial;
        String str2 = this.f208570o;
        HashMap<String, Boolean> hashMap = C72379f1.f210536Q0;
        if (isFinishing()) {
            f1Var = null;
        } else {
            C72379f1 f1Var2 = new C72379f1(this, C0966R.style.a6_);
            f1Var2.mo99751s(dVar);
            f1Var2.setOnCancelListener(dVar);
            f1Var2.setCancelable(true);
            f1Var2.f210566h.setText(str2);
            f1Var2.mo99750q(C75228t.m90258m(d, str), d);
            f1Var2.f210546J = true;
            String str3 = bankcard.field_desc;
            f1Var2.mo99744i(bankcard);
            f1Var2.mo99754v(!TextUtils.isEmpty(str3));
            f1Var2.mo99745l(str3, cVar, false);
            f1Var2.f210577u = bVar;
            f1Var2.show();
            C76879j.m92730a(this, f1Var2);
            f1Var = f1Var2;
        }
        this.f208569n = f1Var;
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return -1;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Class cls = C79173v.class;
        if (i != 1) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            int intExtra = intent.getIntExtra("ret", -1000);
            if (intExtra == -1003) {
                Log.m105924i("MicroMsg.WalletLoanRepaymentUI", "to bind a new card");
                mo99102H7();
            } else if (intExtra == 0) {
                Log.m105924i("MicroMsg.WalletLoanRepaymentUI", "change card ok");
                Bankcard a = ((C79173v) C86312j.m106911c(cls)).Cx0().mo91298a(intent.getStringExtra("bindSerial"));
                if (a == null) {
                    Log.m105920e("MicroMsg.WalletLoanRepaymentUI", "bankcard is null by getBankcardBySerialNo");
                    finish();
                    return;
                }
                mo99104J7(a, this.f208571p, this.f208572q);
            } else {
                Log.m105920e("MicroMsg.WalletLoanRepaymentUI", "activity return unknow error");
            }
        } else {
            C67198p0 Cx0 = ((C79173v) C86312j.m106911c(cls)).Cx0();
            if (Cx0.mo91300c()) {
                Bankcard b = Cx0.mo91299b();
                if (b == null || !Util.isNullOrNil(b.field_forbidWord)) {
                    finish();
                } else {
                    mo99104J7(b, this.f208571p, this.f208572q);
                }
            } else {
                Log.m105920e("MicroMsg.WalletLoanRepaymentUI", "onActivityResult hasRepaymentBankcard is false");
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        this.f208567i = intent.getStringExtra("appId");
        this.f208562d = intent.getStringExtra("timeStamp");
        this.f208563e = intent.getStringExtra("nonceStr");
        this.f208564f = intent.getStringExtra("packageExt");
        this.f208565g = intent.getStringExtra("signtype");
        this.f208566h = intent.getStringExtra("paySignature");
        this.f208568j = intent.getStringExtra("url");
        this.f208576u = intent.getIntExtra("pay_channel", 0);
        addSceneEndListener(580);
        doSceneForceProgress(new C78339d(this.f208567i, this.f208562d, this.f208563e, this.f208564f, this.f208565g, this.f208566h, this.f208568j, 7, "getWebPayCheckoutCounterRequst", this.f208576u));
    }

    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(580);
    }

    public void onNewIntent(Intent intent) {
        Bundle extras = intent.getExtras();
        Log.m105924i("MicroMsg.WalletLoanRepaymentUI", "onNewIntent");
        if (extras.containsKey("intent_bind_end")) {
            Log.m105924i("MicroMsg.WalletLoanRepaymentUI", "back from bind card");
            doSceneProgress(new C67343c(this.f208573r), true);
        } else if (extras.containsKey("jsapi_verifycode_process_end")) {
            Log.m105924i("MicroMsg.WalletLoanRepaymentUI", "back from verify code");
            Intent intent2 = new Intent();
            intent2.putExtra(XWalkReaderBasePlugin.PARAM_KEY_TOKEN, intent.getStringExtra(XWalkReaderBasePlugin.PARAM_KEY_TOKEN));
            intent2.putExtra("bind_serial", this.f208575t);
            setResult(-1, intent2);
            finish();
        } else {
            Log.m105924i("MicroMsg.WalletLoanRepaymentUI", "need to deal with,finish");
            finish();
        }
    }

    public void onResume() {
        super.onResume();
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        boolean z = false;
        if (i == 0 && i2 == 0) {
            if (yVar instanceof C78339d) {
                C78339d dVar = (C78339d) yVar;
                C8883h.f28150a = dVar.mo108331j1();
                this.f208573r = ((C64592nu) dVar.f229547e.f127056b.f127083a).f184559f;
                if (C79144b.m95773a().mo109088c(C32735h.C32737c.clicfg_webank_cashier_kinda_switch_android, false)) {
                    ((C76324c) C86312j.m106911c(C76324c.class)).startWeBankLoanPay(this, this.f208573r, dVar.mo108331j1(), new C71904a());
                } else {
                    doSceneProgress(new C67343c(this.f208573r), true);
                }
                return true;
            } else if (yVar instanceof C67343c) {
                C67343c cVar = (C67343c) yVar;
                this.f208572q = cVar.f193191e;
                this.f208571p = cVar.f193190d;
                this.f208570o = cVar.f193192f;
                C67198p0 Cx0 = ((C79173v) C86312j.m106911c(C79173v.class)).Cx0();
                if (Cx0.mo91300c()) {
                    Bankcard b = Cx0.mo91299b();
                    if (b == null || !Util.isNullOrNil(b.field_forbidWord)) {
                        mo99103I7();
                    } else {
                        mo99104J7(b, this.f208571p, this.f208572q);
                    }
                } else {
                    C76879j.m92707A(this, getResources().getString(C0966R.string.f361565kv2), "", getString(C0966R.string.l3j), getString(C0966R.string.f7926wf), new C71956e(this), new C71957f(this));
                }
                return true;
            } else if (yVar instanceof C78357y) {
                C78357y yVar2 = (C78357y) yVar;
                if (yVar2.f229618e == 0) {
                    z = true;
                }
                if (z) {
                    Log.m105924i("MicroMsg.WalletLoanRepaymentUI", "need free sms");
                    Bundle bundle = new Bundle();
                    bundle.putString("key_pwd1", this.f208574s);
                    bundle.putString("key_jsapi_token", this.f208573r);
                    bundle.putString("key_relation_key", yVar2.f229620g);
                    bundle.putInt("key_verify_scene", 8);
                    bundle.putString("key_mobile", yVar2.f229619f);
                    C79143a.m95771j(this, C72377f0.class, bundle, (C79148e.C79149a) null);
                } else {
                    Intent intent = new Intent();
                    intent.putExtra(XWalkReaderBasePlugin.PARAM_KEY_TOKEN, yVar2.f229617d);
                    intent.putExtra("bind_serial", this.f208575t);
                    setResult(-1, intent);
                    finish();
                }
                return true;
            }
        }
        return false;
    }
}
