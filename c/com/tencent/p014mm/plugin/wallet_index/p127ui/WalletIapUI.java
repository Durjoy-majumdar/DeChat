package com.tencent.p014mm.plugin.wallet_index.p127ui;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.WalletCloseProgressEvent;
import com.tencent.p014mm.autogen.events.WalletPayResultForAppbrandGameEvent;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C1810l;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C75136r0;
import com.tencent.p014mm.wallet_core.p137ui.C75197d0;
import com.tencent.wxmm.v2helper;
import eb0.C75592q0;
import f40.C86709a0;
import m63.C76750e;
import n63.C76835c;
import nj3.C88989a;
import ob0.C11385n;

@C88989a(7)
/* renamed from: com.tencent.mm.plugin.wallet_index.ui.WalletIapUI */
public class WalletIapUI extends MMActivity implements C11385n {

    /* renamed from: s */
    public static final /* synthetic */ int f211029s = 0;

    /* renamed from: d */
    public boolean f211030d = false;

    /* renamed from: e */
    public int f211031e = 0;

    /* renamed from: f */
    public int f211032f = 1003;

    /* renamed from: g */
    public boolean f211033g;

    /* renamed from: h */
    public String f211034h = "0";

    /* renamed from: i */
    public C72559b f211035i;

    /* renamed from: j */
    public C72560c f211036j;

    /* renamed from: n */
    public Dialog f211037n;

    /* renamed from: o */
    public IListener f211038o;

    /* renamed from: p */
    public C72561d f211039p;

    /* renamed from: q */
    public C72561d f211040q;

    /* renamed from: r */
    public IListener f211041r;

    /* renamed from: com.tencent.mm.plugin.wallet_index.ui.WalletIapUI$a */
    public class C72546a implements C72561d {
        public C72546a() {
        }

        /* renamed from: a */
        public void mo99950a(C76835c cVar, C76750e eVar) {
            Log.m105924i("MicroMsg.WalletIapUI", "Pay Purchase finished: " + cVar + ", purchase: " + eVar);
            if (WalletIapUI.this.f211035i instanceof C72556a) {
                Log.m105924i("MicroMsg.WalletIapUI", "Pay Purchase finished mWallet is  GoogleWallet");
                if (eVar != null) {
                    C75136r0.m90121c(eVar.f224520b, eVar.f224521c, eVar.f224527i, cVar.f224657a, cVar.f224658b);
                } else {
                    C72556a aVar = (C72556a) WalletIapUI.this.f211035i;
                    C75136r0.m90121c(aVar.f211082j, aVar.f211081i, aVar.f211079g, cVar.f224657a, cVar.f224658b);
                }
            }
            if (cVar.mo107104c()) {
                Log.m105924i("MicroMsg.WalletIapUI", "back to preview UI, reason: purchase finish , errCode: " + cVar.f224657a + " , errMsg: " + cVar.f224658b);
                if (cVar.f224657a == 1) {
                    WalletIapUI.this.f211032f = 1001;
                } else {
                    WalletIapUI.this.f211032f = 1002;
                }
                Intent intent = new Intent();
                intent.putExtra("key_err_code", cVar.f224657a);
                intent.putExtra("key_err_msg", cVar.f224658b);
                intent.putExtra("key_launch_ts", C72556a.f211072m);
                intent.putExtra("key_gw_error_code", 0);
                WalletIapUI.this.setResult(-1, intent);
                WalletIapUI.this.finish();
                return;
            }
            int i = cVar.f224657a;
            if (i == 104 || i == 100000002) {
                WalletIapUI.this.f211031e = 3;
                Log.m105924i("MicroMsg.WalletIapUI", "start to restore the purchase!");
                WalletIapUI walletIapUI = WalletIapUI.this;
                walletIapUI.f211035i.mo99965e(walletIapUI, false);
            } else if (eVar != null) {
                Log.m105924i("MicroMsg.WalletIapUI", "verify purchase! productId:" + eVar.f224521c + ",billNo:" + eVar.f224522d);
                C86709a0.m107528h();
                C86709a0.m107529k().f251779b.mo123460f(WalletIapUI.this.f211036j.mo99970a(eVar, false));
                WalletIapUI walletIapUI2 = WalletIapUI.this;
                walletIapUI2.f211031e = 2;
                Log.m105924i("MicroMsg.WalletIapUI", "showLoadingDialog!");
                walletIapUI2.f211037n = C75197d0.m90162c(walletIapUI2, walletIapUI2.getString(C0966R.string.a4d), true, new C72564h(walletIapUI2));
            } else {
                WalletIapUI.this.f211032f = 1002;
                Intent intent2 = new Intent();
                C76835c a = C76835c.m92624a(6);
                intent2.putExtra("key_err_code", a.f224657a);
                intent2.putExtra("key_err_msg", a.f224658b);
                intent2.putExtra("key_launch_ts", C72556a.f211072m);
                intent2.putExtra("key_gw_error_code", 0);
                WalletIapUI.this.setResult(-1, intent2);
                WalletIapUI.this.finish();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_index.ui.WalletIapUI$b */
    public class C72547b implements C72561d {
        public C72547b() {
        }

        /* renamed from: a */
        public void mo99950a(C76835c cVar, C76750e eVar) {
            Log.m105924i("MicroMsg.WalletIapUI", "Consume finished: " + cVar + ", purchase: " + eVar);
            if (cVar.mo107104c()) {
                WalletIapUI.this.f211032f = 1002;
                Log.m105924i("MicroMsg.WalletIapUI", "back to preview UI, reason: consume Fail ! ");
            } else {
                WalletIapUI.this.f211032f = 1000;
                Log.m105924i("MicroMsg.WalletIapUI", "back to preview UI, reason: consume Success ! ");
            }
            Intent intent = new Intent();
            intent.putExtra("key_err_code", cVar.f224657a);
            intent.putExtra("key_err_msg", cVar.f224658b);
            intent.putStringArrayListExtra("key_response_product_ids", WalletIapUI.this.f211036j.f211087a);
            intent.putStringArrayListExtra("key_response_series_ids", WalletIapUI.this.f211036j.f211088b);
            intent.putExtra("key_launch_ts", C72556a.f211072m);
            WalletIapUI.this.setResult(-1, intent);
            WalletIapUI.this.finish();
        }
    }

    public WalletIapUI() {
        C40008f fVar = C40008f.f107254d;
        this.f211038o = new IListener<WalletPayResultForAppbrandGameEvent>(fVar) {
            {
                this.__eventId = -1513748107;
            }

            public boolean callback(IEvent iEvent) {
                WalletPayResultForAppbrandGameEvent walletPayResultForAppbrandGameEvent = (WalletPayResultForAppbrandGameEvent) iEvent;
                WalletPayResultForAppbrandGameEvent.C67829a aVar = walletPayResultForAppbrandGameEvent.f194093d;
                Log.m105925i("MicroMsg.WalletIapUI", "walletPayResultListener onPayEnd payResult:%s, reqKey:%s,  comeFrom:%s,requestCode:%d", Integer.valueOf(walletPayResultForAppbrandGameEvent.f194093d.f194095b), aVar.f194096c, Integer.valueOf(aVar.f194097d), Integer.valueOf(walletPayResultForAppbrandGameEvent.f194093d.f194098e));
                WalletPayResultForAppbrandGameEvent.C67829a aVar2 = walletPayResultForAppbrandGameEvent.f194093d;
                if (aVar2 != null && !Util.isNullOrNil(aVar2.f194096c) && walletPayResultForAppbrandGameEvent.f194093d.f194096c.equalsIgnoreCase("key_from_scene_appbrandgame")) {
                    WalletPayResultForAppbrandGameEvent.C67829a aVar3 = walletPayResultForAppbrandGameEvent.f194093d;
                    if (aVar3.f194097d == 1) {
                        Intent intent = aVar3.f194094a;
                        if (intent == null || intent.getExtras() == null || walletPayResultForAppbrandGameEvent.f194093d.f194094a.getExtras().get("key_total_fee") == null) {
                            Log.m105924i("MicroMsg.WalletIapUI", "no payAmount");
                        } else {
                            WalletIapUI.this.f211034h = walletPayResultForAppbrandGameEvent.f194093d.f194094a.getExtras().get("key_total_fee").toString();
                            Log.m105925i("MicroMsg.WalletIapUI", "has payAmount:%s", WalletIapUI.this.f211034h);
                        }
                        WalletIapUI walletIapUI = WalletIapUI.this;
                        C72559b bVar = walletIapUI.f211035i;
                        if (bVar != null) {
                            WalletPayResultForAppbrandGameEvent.C67829a aVar4 = walletPayResultForAppbrandGameEvent.f194093d;
                            if (bVar.mo99963c(walletIapUI, aVar4.f194098e, aVar4.f194095b, aVar4.f194094a)) {
                                Log.m105918d("MicroMsg.WalletIapUI", "walletPayResultListener handled by mWalletPay.");
                                return true;
                            }
                        }
                        Log.m105920e("MicroMsg.WalletIapUI", "havn't handle user action");
                        Intent intent2 = new Intent();
                        C76835c a = C76835c.m92624a(6);
                        intent2.putExtra("key_err_code", a.f224657a);
                        intent2.putExtra("key_err_msg", a.f224658b);
                        intent2.putExtra("key_launch_ts", C72556a.f211072m);
                        WalletIapUI.this.setResult(-1, intent2);
                        WalletIapUI.this.finish();
                        return true;
                    }
                }
                Log.m105925i("MicroMsg.WalletIapUI", "FuncId %s,is not current request key || comeFrom:%s is not FINISH", "key_from_scene_appbrandgame", Integer.valueOf(walletPayResultForAppbrandGameEvent.f194093d.f194097d));
                return true;
            }
        };
        this.f211039p = new C72546a();
        this.f211040q = new C72547b();
        this.f211041r = new IListener<WalletCloseProgressEvent>(fVar) {
            {
                this.__eventId = -917791906;
            }

            public boolean callback(IEvent iEvent) {
                Log.m105924i("MicroMsg.WalletIapUI", "payListener callback to close progress");
                if (((WalletCloseProgressEvent) iEvent) instanceof WalletCloseProgressEvent) {
                    WalletIapUI walletIapUI = WalletIapUI.this;
                    int i = WalletIapUI.f211029s;
                    walletIapUI.mo99949H7();
                    return true;
                }
                Log.m105922f("MicroMsg.WalletIapUI", "mismatched event");
                return false;
            }
        };
    }

    /* renamed from: H7 */
    public final void mo99949H7() {
        Log.m105924i("MicroMsg.WalletIapUI", "hideLoadingDialog!");
        Dialog dialog = this.f211037n;
        if (dialog != null && dialog.isShowing()) {
            this.f211037n.dismiss();
            this.f211037n = null;
        }
    }

    public void finish() {
        Log.m105924i("MicroMsg.WalletIapUI", "finish");
        mo99949H7();
        super.finish();
    }

    public int getLayoutId() {
        return -1;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Log.m105924i("MicroMsg.WalletIapUI", "onActivityResult resultCode : " + i2);
        if (intent == null || intent.getExtras() == null || intent.getExtras().get("key_total_fee") == null) {
            Log.m105924i("MicroMsg.WalletIapUI", "no payAmount");
        } else {
            String obj = intent.getExtras().get("key_total_fee").toString();
            this.f211034h = obj;
            Log.m105925i("MicroMsg.WalletIapUI", "has payAmount:%s", obj);
        }
        C72559b bVar = this.f211035i;
        if (bVar == null || !bVar.mo99963c(this, i, i2, intent)) {
            Log.m105920e("MicroMsg.WalletIapUI", "havn't handle user action");
            Intent intent2 = new Intent();
            C76835c a = C76835c.m92624a(6);
            intent2.putExtra("key_err_code", a.f224657a);
            intent2.putExtra("key_err_msg", a.f224658b);
            intent2.putExtra("key_launch_ts", C72556a.f211072m);
            setResult(-1, intent2);
            finish();
            return;
        }
        Log.m105918d("MicroMsg.WalletIapUI", "onActivityResult handled by mWalletPay.");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.m105924i("MicroMsg.WalletIapUI", "onCreate");
        Rect rect = C85875k4.f250155a;
        C85875k4.m106177d0(getWindow());
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(v2helper.EMethodOutputVolumeGainEnable, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(414, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(C1810l.CTRL_INDEX, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(1306, this);
        if (getIntent().getIntExtra("key_action_type", 200001) == 200001) {
            Log.m105924i("MicroMsg.WalletIapUI", "showLoadingDialog!");
            this.f211037n = C75197d0.m90162c(this, getString(C0966R.string.a4d), true, new C72564h(this));
        }
        this.f211033g = getIntent().getBooleanExtra("key_is_mini_program", false);
        if (getIntent().getBooleanExtra("key_request_fullscreen", false)) {
            getWindow().addFlags(1024);
        }
        C72560c cVar = new C72560c();
        this.f211036j = cVar;
        cVar.f211100n = this.f211033g;
        if (getIntent().getBooleanExtra("key_force_google", false) || C75592q0.m90796z()) {
            Log.m105918d("MicroMsg.WalletIapUI", "Pay use Google Wallet!");
            this.f211035i = new C72556a(this, this.f211036j, this.f211040q);
        } else {
            Log.m105918d("MicroMsg.WalletIapUI", "Pay use WeiXin Wallet!");
            this.f211035i = new C72573q(this.f211036j, this.f211041r);
        }
        this.f211036j.f211099m = this.f211035i.mo99961a();
        this.f211038o.alive();
    }

    public void onDestroy() {
        Log.m105924i("MicroMsg.WalletIapUI", "onDestroy");
        mo99949H7();
        if (this.f211032f == 1003) {
            this.f211032f = 1001;
        }
        String stringExtra = getIntent() != null ? getIntent().getStringExtra("key_appid") : "";
        boolean z = !(this.f211035i instanceof C72573q);
        long j = (long) (Util.getDouble(this.f211034h, 0.0d) * 100.0d);
        Log.m105925i("MicroMsg.WalletIapUI", "reportPaymentState report(%s), isMiniProgram : %b, appid %s, walletType %s, currentScene %s, currentState %s, payAmount %s, payamount %s", 15751, Boolean.valueOf(this.f211033g), stringExtra, Integer.valueOf(z ? 1 : 0), Integer.valueOf(this.f211031e), Integer.valueOf(this.f211032f), this.f211034h, Long.valueOf(j));
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo160131h(15751, Integer.valueOf(this.f211033g ^ true ? 1 : 0), stringExtra, Integer.valueOf(z), Integer.valueOf(this.f211031e), Integer.valueOf(this.f211032f), this.f211034h, Long.valueOf(j));
        nVar.idkeyStat(1044, (long) (this.f211032f - 1000), 1, false);
        int i = this.f211032f;
        if (i == 1001) {
            nVar.idkeyStat(1044, (long) (this.f211031e + 4), 1, false);
        } else if (i == 1002) {
            nVar.idkeyStat(1044, (long) (this.f211031e + 8), 1, false);
        }
        C72559b bVar = this.f211035i;
        if (bVar != null) {
            bVar.mo99962b(this);
        }
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(v2helper.EMethodOutputVolumeGainEnable, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(414, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(C1810l.CTRL_INDEX, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(1306, this);
        this.f211038o.dead();
        super.onDestroy();
    }

    public void onNewIntent(Intent intent) {
        Log.m105924i("MicroMsg.WalletIapUI", "onNewIntent");
        super.onNewIntent(intent);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v24, resolved type: n63.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: n63.g} */
    /* JADX WARNING: type inference failed for: r0v22 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
            r25 = this;
            r1 = r25
            java.lang.String r2 = "MicroMsg.WalletIapUI"
            java.lang.String r0 = "onResume"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            super.onResume()
            java.lang.String r0 = "Handler jump"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            boolean r0 = r1.f211030d
            if (r0 == 0) goto L_0x0017
            goto L_0x0163
        L_0x0017:
            r0 = 1
            r1.f211030d = r0
            android.content.Intent r3 = r25.getIntent()
            r4 = 200001(0x30d41, float:2.80261E-40)
            java.lang.String r5 = "key_action_type"
            int r4 = r3.getIntExtra(r5, r4)
            r5 = 200002(0x30d42, float:2.80262E-40)
            if (r4 != r5) goto L_0x003c
            java.lang.String r3 = "start to restore the purchase!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            r2 = 3
            r1.f211031e = r2
            com.tencent.mm.plugin.wallet_index.ui.b r2 = r1.f211035i
            r2.mo99965e(r1, r0)
            goto L_0x0163
        L_0x003c:
            java.lang.String r4 = "start to doScene!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            com.tencent.mm.plugin.wallet_index.ui.c r4 = r1.f211036j
            java.lang.String r5 = "key_product_id"
            java.lang.String r5 = r3.getStringExtra(r5)
            r4.f211098l = r5
            java.util.List<java.lang.String> r4 = r4.f211097k
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            r4.add(r5)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "prepare pay product: "
            r4.append(r6)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "MicroMsg.IapData"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r4)
            com.tencent.mm.plugin.wallet_index.ui.c r4 = r1.f211036j
            java.lang.String r6 = "key_price"
            java.lang.String r6 = r3.getStringExtra(r6)
            r4.f211094h = r6
            com.tencent.mm.plugin.wallet_index.ui.c r4 = r1.f211036j
            java.lang.String r6 = "key_currency_type"
            java.lang.String r6 = r3.getStringExtra(r6)
            r4.f211095i = r6
            java.lang.String r4 = "key_ext_info"
            java.lang.String r12 = r3.getStringExtra(r4)
            com.tencent.mm.plugin.wallet_index.ui.c r4 = r1.f211036j
            java.lang.String r6 = "key_count"
            int r0 = r3.getIntExtra(r6, r0)
            r4.f211091e = r0
            java.lang.String r0 = "key_appid"
            java.lang.String r15 = r3.getStringExtra(r0)
            java.lang.String r0 = "key_desc"
            java.lang.String r17 = r3.getStringExtra(r0)
            java.lang.String r0 = "key_busiid"
            java.lang.String r21 = r3.getStringExtra(r0)
            com.tencent.mm.plugin.wallet_index.ui.c r0 = r1.f211036j
            java.lang.String r4 = "key_virtual_pay_sign"
            java.lang.String r4 = r3.getStringExtra(r4)
            r0.f211101o = r4
            com.tencent.mm.plugin.wallet_index.ui.c r0 = r1.f211036j
            java.lang.String r4 = "key_attach"
            java.lang.String r4 = r3.getStringExtra(r4)
            r0.f211102p = r4
            com.tencent.mm.plugin.wallet_index.ui.c r0 = r1.f211036j
            java.lang.String r4 = "key_extInfo"
            java.lang.String r4 = r3.getStringExtra(r4)
            r0.f211103q = r4
            com.tencent.mm.plugin.wallet_index.ui.c r0 = r1.f211036j
            java.lang.String r4 = "key_wxAppScene"
            r11 = -1
            int r4 = r3.getIntExtra(r4, r11)
            r0.f211104r = r4
            com.tencent.mm.plugin.wallet_index.ui.c r0 = r1.f211036j
            java.lang.String r4 = "key_wxAppRawScene"
            int r3 = r3.getIntExtra(r4, r11)
            r0.f211105s = r3
            com.tencent.mm.plugin.wallet_index.ui.c r3 = r1.f211036j
            com.tencent.mm.plugin.wallet_index.ui.b r0 = r1.f211035i
            int r14 = r0.mo99961a()
            boolean r0 = r3.f211100n
            if (r0 == 0) goto L_0x011c
            n63.g r0 = new n63.g     // Catch:{ NumberFormatException -> 0x00ff }
            java.lang.String r4 = r3.f211094h     // Catch:{ NumberFormatException -> 0x00ff }
            int r6 = r3.f211091e     // Catch:{ NumberFormatException -> 0x00ff }
            java.lang.String r7 = r3.f211095i     // Catch:{ NumberFormatException -> 0x00ff }
            r20 = 13
            java.lang.String r8 = r3.f211101o     // Catch:{ NumberFormatException -> 0x00ff }
            java.lang.String r9 = r3.f211102p     // Catch:{ NumberFormatException -> 0x00ff }
            java.lang.String r10 = r3.f211103q     // Catch:{ NumberFormatException -> 0x00ff }
            r13 = r0
            r16 = r4
            r18 = r6
            r19 = r7
            r22 = r8
            r23 = r9
            r24 = r10
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ NumberFormatException -> 0x00ff }
            goto L_0x011a
        L_0x00ff:
            r0 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "NetSceneGetAndroidIapPackage Error priceLevel:"
            r4.append(r6)
            java.lang.String r3 = r3.f211094h
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r3, r4)
            r0 = 0
        L_0x011a:
            r3 = -1
            goto L_0x012c
        L_0x011c:
            com.tencent.mm.wallet_core.model.i0 r0 = new com.tencent.mm.wallet_core.model.i0
            java.lang.String r7 = r3.f211098l
            java.lang.String r8 = r3.f211094h
            java.lang.String r9 = r3.f211095i
            int r10 = r3.f211091e
            r6 = r0
            r3 = -1
            r11 = r14
            r6.<init>(r7, r8, r9, r10, r11, r12)
        L_0x012c:
            if (r0 == 0) goto L_0x013b
            f40.C86709a0.m107528h()
            f40.g r2 = f40.C86709a0.m107529k()
            ob0.b0 r2 = r2.f251779b
            r2.mo123460f(r0)
            goto L_0x0163
        L_0x013b:
            java.lang.String r0 = "getPrepareNetScene error netScene is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            r0 = 1002(0x3ea, float:1.404E-42)
            r1.f211032f = r0
            r0 = 8
            n63.c r0 = n63.C76835c.m92624a(r0)
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            int r4 = r0.f224657a
            java.lang.String r5 = "key_err_code"
            r2.putExtra(r5, r4)
            java.lang.String r0 = r0.f224658b
            java.lang.String r4 = "key_err_msg"
            r2.putExtra(r4, r0)
            r1.setResult(r3, r2)
            r25.finish()
        L_0x0163:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wallet_index.p127ui.WalletIapUI.onResume():void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: te3.qh2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: te3.rh2} */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: type inference failed for: r3v18 */
    /* JADX WARNING: type inference failed for: r3v19 */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01a7, code lost:
        if (r1.f165799i == 0) goto L_0x01b4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0261  */
    /* JADX WARNING: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r17, int r18, java.lang.String r19, ob0.C117747y r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = r20
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "onSceneEnd type:"
            r2.append(r3)
            int r3 = r20.getType()
            r2.append(r3)
            java.lang.String r3 = " errCode:"
            r2.append(r3)
            r3 = r18
            r2.append(r3)
            java.lang.String r4 = ",errMsg:"
            r2.append(r4)
            r4 = r19
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.String r5 = "MicroMsg.WalletIapUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
            n63.c r2 = n63.C76835c.m92625b(r18, r19)
            int r3 = r2.f224657a
            java.lang.String r2 = r2.f224658b
            int r4 = r20.getType()
            r7 = 1
            r8 = 414(0x19e, float:5.8E-43)
            r9 = -1
            java.lang.String r10 = "key_response_position"
            java.lang.String r11 = "key_err_msg"
            java.lang.String r12 = "key_err_code"
            java.lang.String r13 = " , errMsg: "
            r14 = 1002(0x3ea, float:1.404E-42)
            java.lang.String r15 = "MicroMsg.IapData"
            if (r4 == r8) goto L_0x018e
            r8 = 422(0x1a6, float:5.91E-43)
            if (r4 == r8) goto L_0x0072
            r8 = 1130(0x46a, float:1.583E-42)
            if (r4 == r8) goto L_0x0072
            r8 = 1306(0x51a, float:1.83E-42)
            if (r4 == r8) goto L_0x018e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "get a wrong sceneType : "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r1)
            goto L_0x02d5
        L_0x0072:
            com.tencent.mm.plugin.wallet_index.ui.c r4 = r0.f211036j
            r4.getClass()
            n63.c r2 = n63.C76835c.m92625b(r3, r2)
            int r3 = r2.f224657a
            boolean r8 = r1 instanceof com.tencent.p014mm.wallet_core.model.C57930i0
            r6 = 2
            if (r8 == 0) goto L_0x010e
            com.tencent.mm.wallet_core.model.i0 r1 = (com.tencent.p014mm.wallet_core.model.C57930i0) r1
            if (r3 != 0) goto L_0x0140
            int r3 = r4.f211099m
            if (r3 != r6) goto L_0x008c
            r6 = 1
            goto L_0x008d
        L_0x008c:
            r6 = 0
        L_0x008d:
            r3 = 0
            java.lang.String r8 = "MicroMsg.NetScenePreparePurchase"
            if (r6 == 0) goto L_0x00d0
            ob0.c r1 = r1.f165789d
            ob0.c$d r1 = r1.f127056b
            pe3.a r1 = r1.f127083a
            te3.dh3 r1 = (te3.C49147dh3) r1
            if (r1 == 0) goto L_0x00c7
            te3.rh2 r3 = new te3.rh2
            r3.<init>()
            java.lang.String r6 = r1.f132329e
            r3.f228165f = r6
            java.lang.String r6 = r1.f132330f
            r3.f228166g = r6
            r6 = 5
            r3.f228163d = r6
            java.lang.String r6 = r1.f132331g
            r3.f228167h = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r15 = "get Sign4TenPay is "
            r6.append(r15)
            java.lang.String r1 = r1.f132331g
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r1)
            goto L_0x00cc
        L_0x00c7:
            java.lang.String r1 = "getIapWxPayData fail."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r1)
        L_0x00cc:
            r4.f211089c = r3
            goto L_0x0140
        L_0x00d0:
            ob0.c r6 = r1.f165789d
            ob0.c$d r6 = r6.f127056b
            pe3.a r6 = r6.f127083a
            te3.dh3 r6 = (te3.C49147dh3) r6
            if (r6 == 0) goto L_0x0106
            te3.qh2 r3 = new te3.qh2
            r3.<init>()
            java.lang.String r15 = r1.f165792g
            r3.f228128f = r15
            java.lang.String r15 = r1.f165791f
            r3.f228126d = r15
            java.lang.String r1 = r1.f165793h
            r3.f228127e = r1
            java.lang.String r1 = r6.f132328d
            r3.f228129g = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r15 = "getIapGoogleData is "
            r1.append(r15)
            java.lang.String r6 = r6.f132328d
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r1)
            goto L_0x010b
        L_0x0106:
            java.lang.String r1 = "getIapGoogleData fail."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r1)
        L_0x010b:
            r4.f211090d = r3
            goto L_0x0140
        L_0x010e:
            boolean r8 = r1 instanceof n63.C47165g
            if (r8 == 0) goto L_0x0140
            n63.g r1 = (n63.C47165g) r1
            if (r3 != 0) goto L_0x0140
            te3.rh2 r3 = r1.f126707g
            r4.f211089c = r3
            te3.qh2 r1 = r1.f126706f
            r4.f211090d = r1
            int r8 = r4.f211099m
            if (r8 != r6) goto L_0x0124
            r6 = 1
            goto L_0x0125
        L_0x0124:
            r6 = 0
        L_0x0125:
            if (r6 == 0) goto L_0x0134
            if (r3 == 0) goto L_0x012e
            java.lang.String r1 = r3.f228164e
            r4.f211096j = r1
            goto L_0x0140
        L_0x012e:
            java.lang.String r1 = "iapWxPayData is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r1)
            goto L_0x0140
        L_0x0134:
            if (r1 == 0) goto L_0x013b
            java.lang.String r1 = r1.f228129g
            r4.f211096j = r1
            goto L_0x0140
        L_0x013b:
            java.lang.String r1 = "iapGoogleData is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r1)
        L_0x0140:
            int r1 = r2.f224657a
            if (r1 != 0) goto L_0x0154
            java.lang.String r1 = "Wallet.launchPay"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)
            com.tencent.mm.plugin.wallet_index.ui.b r1 = r0.f211035i
            com.tencent.mm.plugin.wallet_index.ui.d r2 = r0.f211039p
            r1.mo99966f(r0, r2)
            r0.f211031e = r7
            goto L_0x02d5
        L_0x0154:
            r0.f211032f = r14
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "back to preview UI, reason: PreparePurchase fail , errCode: "
            r1.append(r3)
            int r3 = r2.f224657a
            r1.append(r3)
            r1.append(r13)
            java.lang.String r3 = r2.f224658b
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            int r3 = r2.f224657a
            r1.putExtra(r12, r3)
            java.lang.String r2 = r2.f224658b
            r1.putExtra(r11, r2)
            r1.putExtra(r10, r7)
            r0.setResult(r9, r1)
            r16.finish()
            goto L_0x02d5
        L_0x018e:
            com.tencent.mm.plugin.wallet_index.ui.c r4 = r0.f211036j
            r4.getClass()
            boolean r6 = r1 instanceof com.tencent.p014mm.wallet_core.model.C57931j0
            if (r6 == 0) goto L_0x01aa
            com.tencent.mm.wallet_core.model.j0 r1 = (com.tencent.p014mm.wallet_core.model.C57931j0) r1
            java.lang.String r6 = r1.f165796f
            r4.f211098l = r6
            java.lang.String r6 = r1.f165798h
            r4.f211092f = r6
            int r6 = r1.f165797g
            r4.f211093g = r6
            int r1 = r1.f165799i
            if (r1 != 0) goto L_0x01b6
            goto L_0x01b4
        L_0x01aa:
            boolean r6 = r1 instanceof n63.C47166n
            if (r6 == 0) goto L_0x01b6
            n63.n r1 = (n63.C47166n) r1
            java.lang.String r1 = r1.f126710f
            r4.f211098l = r1
        L_0x01b4:
            r1 = 1
            goto L_0x01b7
        L_0x01b6:
            r1 = 0
        L_0x01b7:
            java.util.List<java.lang.String> r6 = r4.f211097k
            java.lang.String r8 = r4.f211098l
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            r6.remove(r8)
            java.lang.String r6 = "Verify "
            if (r1 == 0) goto L_0x01ec
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            java.lang.String r6 = r4.f211098l
            r1.append(r6)
            java.lang.String r6 = " OK"
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r1)
            java.util.ArrayList<java.lang.String> r1 = r4.f211087a
            java.lang.String r6 = r4.f211098l
            r1.add(r6)
            java.util.ArrayList<java.lang.String> r1 = r4.f211088b
            java.lang.String r4 = r4.f211092f
            r1.add(r4)
            goto L_0x0254
        L_0x01ec:
            java.lang.String r1 = r4.f211098l
            java.lang.String r8 = "com.tencent.xin.wco"
            boolean r1 = r1.startsWith(r8)
            java.lang.String r8 = " fail"
            if (r1 == 0) goto L_0x023d
            int r1 = r4.f211093g
            if (r1 <= 0) goto L_0x0225
            java.util.ArrayList<java.lang.String> r1 = r4.f211087a
            java.lang.String r8 = r4.f211098l
            r1.add(r8)
            java.util.ArrayList<java.lang.String> r1 = r4.f211088b
            java.lang.String r8 = r4.f211092f
            r1.add(r8)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            java.lang.String r4 = r4.f211098l
            r1.append(r4)
            java.lang.String r4 = " fail and cosume"
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r1)
            r6 = 1
            goto L_0x0255
        L_0x0225:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            java.lang.String r4 = r4.f211098l
            r1.append(r4)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r1)
            goto L_0x0254
        L_0x023d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            java.lang.String r4 = r4.f211098l
            r1.append(r4)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r1)
        L_0x0254:
            r6 = 0
        L_0x0255:
            com.tencent.mm.plugin.wallet_index.ui.c r1 = r0.f211036j
            java.util.List<java.lang.String> r1 = r1.f211097k
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x02d5
            java.lang.String r1 = "Verify All End... "
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r1)
            com.tencent.mm.plugin.wallet_index.ui.c r1 = r0.f211036j
            java.util.ArrayList<java.lang.String> r1 = r1.f211087a
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x029d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "mResultProductIds size: "
            r1.append(r2)
            com.tencent.mm.plugin.wallet_index.ui.c r2 = r0.f211036j
            java.util.ArrayList<java.lang.String> r2 = r2.f211087a
            int r2 = r2.size()
            r1.append(r2)
            java.lang.String r2 = ", Consume ..."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)
            com.tencent.mm.plugin.wallet_index.ui.b r1 = r0.f211035i
            com.tencent.mm.plugin.wallet_index.ui.c r2 = r0.f211036j
            java.util.ArrayList<java.lang.String> r2 = r2.f211087a
            com.tencent.mm.plugin.wallet_index.ui.d r3 = r0.f211040q
            r1.mo99964d(r0, r2, r3, r6)
            goto L_0x02d5
        L_0x029d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "back to preview UI, reason: VerifyPurchase fail , errCode: "
            r1.append(r4)
            r1.append(r3)
            r1.append(r13)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)
            r0.f211032f = r14
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            r1.putExtra(r12, r3)
            r1.putExtra(r11, r2)
            r2 = 3
            r1.putExtra(r10, r2)
            long r2 = com.tencent.p014mm.plugin.wallet_index.p127ui.C72556a.f211072m
            java.lang.String r4 = "key_launch_ts"
            r1.putExtra(r4, r2)
            r0.setResult(r9, r1)
            r16.finish()
        L_0x02d5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wallet_index.p127ui.WalletIapUI.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }
}
