package com.tencent.p014mm.plugin.wallet_index.p127ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.kinda.gen.VoidBoolStringI32StringCallback;
import com.tencent.kinda.gen.VoidCallback;
import com.tencent.midas.api.APMidasPayAPI;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.WalletCloseProgressEvent;
import com.tencent.p014mm.autogen.events.WalletPayResultEvent;
import com.tencent.p014mm.autogen.events.WalletPayResultForAppbrandGameEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.pluginsdk.wallet.WalletJsapiData;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C75136r0;
import com.tencent.p014mm.wallet_core.model.C75155x0;
import com.tencent.p014mm.wallet_core.p137ui.C75197d0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import ie3.C76324c;
import ie3.C76328d;
import ie3.C76331i;
import ke3.C88144b;
import n63.C34743a;
import n63.C47164e;
import n63.C76837f;
import nj3.C76879j;
import nj3.C88989a;
import o63.C47330a;
import ob0.C11385n;
import ob0.C117747y;
import p63.C47435a;
import qo3.C77398g;
import rt3.C22252b;
import te3.wy4;
import ub3.C78144b;
import yq3.C79144b;
import zt3.C119157j;

@C88989a(7)
/* renamed from: com.tencent.mm.plugin.wallet_index.ui.WalletBrandUI */
public class WalletBrandUI extends MMActivity implements C11385n {

    /* renamed from: d */
    public boolean f210998d = false;

    /* renamed from: e */
    public Dialog f210999e = null;

    /* renamed from: f */
    public C72537b f211000f;

    /* renamed from: g */
    public C117747y f211001g = null;

    /* renamed from: h */
    public WalletJsapiData f211002h;

    /* renamed from: i */
    public final int f211003i = (hashCode() & 65535);

    /* renamed from: j */
    public int f211004j;

    /* renamed from: n */
    public String f211005n = "";

    /* renamed from: o */
    public int f211006o;

    /* renamed from: p */
    public VoidBoolStringI32StringCallback f211007p = null;

    /* renamed from: q */
    public VoidCallback f211008q = null;

    /* renamed from: r */
    public boolean f211009r = false;

    /* renamed from: s */
    public IListener f211010s;

    /* renamed from: t */
    public IListener f211011t;

    /* renamed from: com.tencent.mm.plugin.wallet_index.ui.WalletBrandUI$c */
    public class C5814c implements C72537b {

        /* renamed from: com.tencent.mm.plugin.wallet_index.ui.WalletBrandUI$c$a */
        public class C5815a implements MMActivity.C6739d {

            /* renamed from: d */
            public Intent f21961d = new Intent();

            /* renamed from: com.tencent.mm.plugin.wallet_index.ui.WalletBrandUI$c$a$a */
            public class C5816a implements Runnable {
                public C5816a(C5815a aVar) {
                }

                public void run() {
                    String topActivityName2 = Util.getTopActivityName2(MMApplicationContext.getContext());
                    Log.m105925i("MicroMsg.WalletBrandUI", "current top activity: %s", topActivityName2);
                    if (topActivityName2 != null && topActivityName2.equals("WebViewUI")) {
                        Log.m105928w("MicroMsg.WalletBrandUI", "may be not close success");
                        C115669n.INSTANCE.mo175911u(1589, 9);
                    }
                }
            }

            public C5815a() {
            }

            /* renamed from: a */
            public final void mo6867a(int i, Intent intent) {
                Log.m105925i("MicroMsg.WalletBrandUI", "KindaBrand.kindaEndWithResult resultCode: %d, data: %s", Integer.valueOf(i), intent.toString());
                WalletBrandUI.this.setResult(i, intent);
            }

            public void mmOnActivityResult(int i, int i2, Intent intent) {
                if (i == WalletBrandUI.this.f211003i) {
                    if (intent == null) {
                        Log.m105920e("MicroMsg.WalletBrandUI", Util.stackTraceToString(new Throwable("KindaBrand Intent data null!")));
                    } else if (i2 != -1) {
                        mo6867a(i2, intent);
                    } else if (intent.hasExtra("key_jsapi_close_page_after_pay")) {
                        int intExtra = intent.getIntExtra("key_jsapi_close_page_after_pay", 0);
                        Log.m105925i("MicroMsg.WalletBrandUI", "KindaBrand.mmOnActivityResult resultCode:%s ClosePage:%s src requestCode:%s", Integer.valueOf(i2), Integer.valueOf(intExtra), Integer.valueOf(WalletBrandUI.this.getIntent().getIntExtra("requestCode", -1)));
                        this.f21961d.putExtra("key_jsapi_close_page_after_pay", intExtra);
                        WalletBrandUI.this.setResult(i2, this.f21961d);
                        if (intExtra == 1 && WalletBrandUI.this.getIntent().getIntExtra("requestCode", -1) == 214) {
                            Log.m105925i("MicroMsg.WalletBrandUI", "store pay need close:%b, url:%s", Boolean.valueOf(MultiProcessMMKV.getSingleDefault().encode("key_jsapi_pay_need_close", WalletBrandUI.this.f211002h.f24071N)), WalletBrandUI.this.f211002h.f24071N);
                            ((C119157j) C119157j.f356862d).mo183878i(new C5816a(this), 1000);
                            C115669n.INSTANCE.mo160131h(24610, "7", "1", "1", "");
                        }
                    } else {
                        this.f21961d.putExtras(intent);
                        mo6867a(i2, this.f21961d);
                    }
                }
            }
        }

        public C5814c() {
        }

        /* renamed from: a */
        public String mo6863a() {
            return "";
        }

        /* renamed from: b */
        public int mo6864b() {
            return 0;
        }

        /* renamed from: c */
        public C117747y mo6865c() {
            C5815a aVar = new C5815a();
            AppCompatActivity context = WalletBrandUI.this.getContext();
            WalletBrandUI walletBrandUI = WalletBrandUI.this;
            ((C76324c) C86312j.m106911c(C76324c.class)).startWxpayJsApiPay(context, walletBrandUI.f211002h, aVar, walletBrandUI.f211003i);
            return null;
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_index.ui.WalletBrandUI$a */
    public class C72536a implements C72537b {

        /* renamed from: a */
        public int f211014a = 0;

        /* renamed from: b */
        public String f211015b = "";

        public C72536a() {
        }

        /* renamed from: a */
        public String mo6863a() {
            return this.f211015b;
        }

        /* renamed from: b */
        public int mo6864b() {
            return 1563;
        }

        /* renamed from: c */
        public C117747y mo6865c() {
            WalletJsapiData walletJsapiData = WalletBrandUI.this.f211002h;
            this.f211014a = walletJsapiData.f24060C;
            C47330a aVar = new C47330a(walletJsapiData.f24075d, walletJsapiData.f24078g, walletJsapiData.f24079h, walletJsapiData.f24080i, walletJsapiData.f24084p, walletJsapiData.f24077f, walletJsapiData.f24086r, walletJsapiData.f24087s, walletJsapiData.f24090v, (String) null);
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123460f(aVar);
            return aVar;
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            if (i == 0 && i2 == 0 && (yVar instanceof C47330a)) {
                C47330a aVar = (C47330a) yVar;
                String str2 = aVar.f127016f;
                Log.m105925i("MicroMsg.WalletBrandUI", "hy: gen prepay success! url is: %s", str2);
                this.f211015b = str2;
                String si = ((C76328d) C86312j.m106911c(C76328d.class)).mo106562si(str2);
                if (!Util.isNullOrNil(si)) {
                    Log.m105924i("MicroMsg.WalletBrandUI", "start hk native cashier");
                    ((C76324c) C86312j.m106911c(C76324c.class)).handleHKNativeCashier(WalletBrandUI.this.getContext(), si, new WalletBrandUI$a$$a(this));
                    return;
                }
                String str3 = aVar.f127017g;
                if (this.f211014a == 1) {
                    Intent intent = new Intent();
                    intent.putExtra("url", str2);
                    intent.putExtra("jsInjectCode", str3);
                    WalletBrandUI.this.setResult(-1, intent);
                } else {
                    Intent intent2 = new Intent();
                    intent2.putExtra("rawUrl", str2);
                    intent2.putExtra("showShare", true);
                    if (!Util.isNullOrNil(str3)) {
                        intent2.putExtra("shouldForceViewPort", true);
                        intent2.putExtra("view_port_code", str3);
                    }
                    C75228t.m90217J(WalletBrandUI.this.getContext(), intent2);
                    WalletBrandUI.this.setResult(-1);
                }
                WalletBrandUI.this.finish();
                return;
            }
            Log.m105925i("MicroMsg.WalletBrandUI", "hy: gen prepay failed! errType: %d, errCode: %d, errmsg: %s", Integer.valueOf(i), Integer.valueOf(i2), str);
            C76879j.m92750u(WalletBrandUI.this, str, "", new WalletBrandUI$a$$b(this), new WalletBrandUI$a$$c(this));
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_index.ui.WalletBrandUI$b */
    public interface C72537b {
        /* renamed from: a */
        String mo6863a();

        /* renamed from: b */
        int mo6864b();

        /* renamed from: c */
        C117747y mo6865c();

        void onSceneEnd(int i, int i2, String str, C117747y yVar);
    }

    /* renamed from: com.tencent.mm.plugin.wallet_index.ui.WalletBrandUI$d */
    public class C72538d extends C5814c {

        /* renamed from: com.tencent.mm.plugin.wallet_index.ui.WalletBrandUI$d$a */
        public class C72539a implements MMActivity.C6739d {
            public C72539a() {
            }

            public void mmOnActivityResult(int i, int i2, Intent intent) {
                WalletBrandUI walletBrandUI = WalletBrandUI.this;
                if (i == walletBrandUI.f211003i) {
                    walletBrandUI.setResult(i2, intent);
                    WalletBrandUI.this.finish();
                }
            }
        }

        public C72538d() {
            super();
        }

        /* renamed from: c */
        public C117747y mo6865c() {
            AppCompatActivity context = WalletBrandUI.this.getContext();
            WalletBrandUI walletBrandUI = WalletBrandUI.this;
            ((C76324c) C86312j.m106911c(C76324c.class)).startJsApiComponentUseCase(context, walletBrandUI.f211002h, new C72539a(), walletBrandUI.f211003i);
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_index.ui.WalletBrandUI$e */
    public class C72540e implements C72537b {

        /* renamed from: a */
        public String f211019a = "";

        public C72540e() {
        }

        /* renamed from: a */
        public String mo6863a() {
            return this.f211019a;
        }

        /* renamed from: b */
        public int mo6864b() {
            return 1521;
        }

        /* renamed from: c */
        public C117747y mo6865c() {
            WalletJsapiData walletJsapiData = WalletBrandUI.this.f211002h;
            C47435a aVar = new C47435a(walletJsapiData.f24075d, walletJsapiData.f24077f, walletJsapiData.f24078g, walletJsapiData.f24080i, walletJsapiData.f24084p, walletJsapiData.f24079h, walletJsapiData.f24086r, walletJsapiData.f24087s, walletJsapiData.f24090v);
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123460f(aVar);
            return aVar;
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            C47435a aVar = (C47435a) yVar;
            String str2 = aVar.f127250f;
            Log.m105918d("MicroMsg.WalletBrandUI", "req_key = " + str2);
            this.f211019a = str2;
            PayInfo payInfo = new PayInfo();
            payInfo.f212592j = str2;
            WalletBrandUI walletBrandUI = WalletBrandUI.this;
            WalletJsapiData walletJsapiData = walletBrandUI.f211002h;
            payInfo.f212594o = walletJsapiData.f24075d;
            payInfo.f212595p = aVar.f127251g;
            payInfo.f212587e = walletJsapiData.f24088t;
            payInfo.f212599t = str;
            payInfo.f212589g = walletJsapiData.f24090v;
            C76331i.m91761e(walletBrandUI, payInfo, 1);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_index.ui.WalletBrandUI$f */
    public class C72541f implements C72537b {

        /* renamed from: a */
        public String f211021a = "";

        /* renamed from: com.tencent.mm.plugin.wallet_index.ui.WalletBrandUI$f$a */
        public class C72542a implements DialogInterface.OnClickListener {
            public C72542a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                WalletBrandUI.this.finish();
            }
        }

        public C72541f() {
        }

        /* renamed from: a */
        public String mo6863a() {
            return this.f211021a;
        }

        /* renamed from: b */
        public int mo6864b() {
            Log.m105925i("MicroMsg.WalletBrandUI", "TenpayWalletBrand getGenPrepayFuncId packageExt:%s", WalletBrandUI.this.f211002h.f24080i);
            if (C34743a.m40456a(WalletBrandUI.this.f211002h.f24080i, "up_")) {
                return 2519;
            }
            if (C34743a.m40456a(WalletBrandUI.this.f211002h.f24080i, "tax_")) {
                return 2923;
            }
            return C34743a.m40456a(WalletBrandUI.this.f211002h.f24080i, "dc_") ? 2798 : 398;
        }

        /* JADX WARNING: type inference failed for: r0v4, types: [ob0.y, com.tencent.mm.wallet_core.model.k0] */
        /* JADX WARNING: type inference failed for: r1v11, types: [n63.f] */
        /* JADX WARNING: type inference failed for: r1v12, types: [n63.d] */
        /* JADX WARNING: type inference failed for: r1v13, types: [n63.k] */
        /* JADX WARNING: type inference failed for: r1v14, types: [n63.l] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public ob0.C117747y mo6865c() {
            /*
                r14 = this;
                com.tencent.mm.plugin.wallet_index.ui.WalletBrandUI r0 = com.tencent.p014mm.plugin.wallet_index.p127ui.WalletBrandUI.this
                com.tencent.mm.pluginsdk.wallet.WalletJsapiData r0 = r0.f211002h
                java.lang.String r2 = r0.f24075d
                java.lang.String r3 = r0.f24077f
                java.lang.String r4 = r0.f24078g
                java.lang.String r5 = r0.f24080i
                java.lang.String r6 = r0.f24084p
                java.lang.String r7 = r0.f24079h
                java.lang.String r8 = r0.f24086r
                java.lang.String r9 = r0.f24087s
                int r10 = r0.f24090v
                int r11 = r0.f24088t
                int r12 = r0.f24092x
                java.lang.String r13 = r0.f24085q
                java.lang.String r0 = "up_"
                boolean r0 = n63.C34743a.m40456a(r5, r0)
                if (r0 == 0) goto L_0x002c
                n63.l r0 = new n63.l
                r1 = r0
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                goto L_0x0051
            L_0x002c:
                java.lang.String r0 = "tax_"
                boolean r0 = n63.C34743a.m40456a(r5, r0)
                if (r0 == 0) goto L_0x003c
                n63.k r0 = new n63.k
                r1 = r0
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                goto L_0x0051
            L_0x003c:
                java.lang.String r0 = "dc_"
                boolean r0 = n63.C34743a.m40456a(r5, r0)
                if (r0 == 0) goto L_0x004b
                n63.d r0 = new n63.d
                r1 = r0
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                goto L_0x0051
            L_0x004b:
                n63.f r0 = new n63.f
                r1 = r0
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            L_0x0051:
                long r1 = java.lang.System.currentTimeMillis()
                r0.setProcessSessionId(r1)
                java.lang.String r1 = "PayProcess"
                r0.setProcessName(r1)
                com.tencent.mm.plugin.wallet_index.ui.WalletBrandUI r1 = com.tencent.p014mm.plugin.wallet_index.p127ui.WalletBrandUI.this
                com.tencent.mm.pluginsdk.wallet.WalletJsapiData r1 = r1.f211002h
                int r1 = r1.f24088t
                r0.setScene(r1)
                f40.C86709a0.m107528h()
                f40.g r1 = f40.C86709a0.m107529k()
                ob0.b0 r1 = r1.f251779b
                r1.mo123460f(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wallet_index.p127ui.WalletBrandUI.C72541f.mo6865c():ob0.y");
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            if (i == 0 && i2 == 0) {
                C76837f fVar = (C76837f) yVar;
                String str2 = fVar.f224661f;
                Log.m105918d("MicroMsg.WalletBrandUI", "req_key = " + str2);
                this.f211021a = str2;
                new WalletCloseProgressEvent().publish();
                wy4 wy4 = fVar.f224663h;
                if (wy4 == null || Util.isNullOrNil(wy4.f186241d)) {
                    Log.m105924i("MicroMsg.WalletBrandUI", "TenpayWalletBrand startPay");
                    PayInfo payInfo = new PayInfo();
                    payInfo.f212592j = str2;
                    WalletJsapiData walletJsapiData = WalletBrandUI.this.f211002h;
                    payInfo.f212594o = walletJsapiData.f24075d;
                    payInfo.f212595p = fVar.f224662g;
                    payInfo.f212587e = walletJsapiData.f24088t;
                    payInfo.f212599t = str;
                    payInfo.f212589g = walletJsapiData.f24090v;
                    payInfo.f212575F = fVar.sessionId;
                    if (payInfo.f212600u == null) {
                        payInfo.f212600u = new Bundle();
                    }
                    payInfo.f212600u.putString("extinfo_key_20", fVar.f224664i);
                    payInfo.f212600u.putString("extinfo_key_21", WalletBrandUI.this.f211002h.f24061D);
                    payInfo.f212600u.putString("extinfo_key_22", WalletBrandUI.this.f211002h.f24062E);
                    C75155x0.m90137c(payInfo.f212587e, str2, i2);
                    C76331i.m91761e(WalletBrandUI.this, payInfo, 1);
                    return;
                }
                Log.m105924i("MicroMsg.WalletBrandUI", "TenpayWalletBrand start WalletMixOrderInfoUI");
                Intent intent = new Intent();
                intent.putExtra("prepayId", str2);
                intent.putExtra("is_jsapi_offline_pay", false);
                intent.putExtra("pay_gate_url", wy4.f186241d);
                intent.putExtra("need_dialog", wy4.f186243f);
                intent.putExtra("dialog_text", wy4.f186244g);
                intent.putExtra("max_count", wy4.f186242e.f184861e);
                intent.putExtra("inteval_time", wy4.f186242e.f184860d);
                intent.putExtra("default_wording", wy4.f186242e.f184862f);
                C88144b.m109792j(WalletBrandUI.this, "wallet_core", ".ui.WalletMixOrderInfoUI", intent, true);
                return;
            }
            Log.m105924i("MicroMsg.WalletBrandUI", "TenpayWalletBrand dialog");
            C75155x0.m90137c(WalletBrandUI.this.f211002h.f24088t, "", i2);
            WalletBrandUI walletBrandUI = WalletBrandUI.this;
            if (walletBrandUI.f211002h.f24088t == 3) {
                if (Util.isNullOrNil(str)) {
                    str = WalletBrandUI.this.getString(C0966R.string.kzk);
                }
                C77398g E = C76879j.m92711E(walletBrandUI, str, "", WalletBrandUI.this.getString(C0966R.string.kse), false, new C72542a());
                if (E != null) {
                    E.setCancelable(false);
                }
                Dialog dialog = WalletBrandUI.this.f210999e;
                if (dialog != null) {
                    dialog.dismiss();
                    WalletBrandUI.this.f210999e = null;
                    return;
                }
                return;
            }
            Log.m105924i("MicroMsg.WalletBrandUI", "TenpayWalletBrand setResult ResultPayFailed");
            Intent intent2 = new Intent();
            if (i != 0) {
                i2 = -1;
            }
            intent2.putExtra("key_jsapi_pay_onActivityResult", "jsapi_pay_onActivityResult");
            intent2.putExtra("key_jsapi_pay_err_code", i2);
            if (Util.isNullOrNil(str)) {
                str = WalletBrandUI.this.getString(C0966R.string.kzk);
            }
            intent2.putExtra("key_jsapi_pay_err_msg", str);
            intent2.putExtra("key_jsapi_pay_err_dialog_confirm", WalletBrandUI.this.getString(C0966R.string.kse));
            WalletBrandUI.this.setResult(5, intent2);
            WalletBrandUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_index.ui.WalletBrandUI$g */
    public class C72543g implements C72537b {

        /* renamed from: a */
        public String f211024a = "";

        public C72543g() {
        }

        /* renamed from: a */
        public String mo6863a() {
            return this.f211024a;
        }

        /* renamed from: b */
        public int mo6864b() {
            return 2755;
        }

        /* renamed from: c */
        public C117747y mo6865c() {
            WalletJsapiData walletJsapiData = WalletBrandUI.this.f211002h;
            C47164e eVar = new C47164e(walletJsapiData.f24075d, walletJsapiData.f24077f, walletJsapiData.f24078g, walletJsapiData.f24080i, walletJsapiData.f24084p, walletJsapiData.f24079h, walletJsapiData.f24086r, walletJsapiData.f24087s, walletJsapiData.f24090v, walletJsapiData.f24088t, walletJsapiData.f24093y);
            eVar.setProcessSessionId(System.currentTimeMillis());
            eVar.setProcessName("PayProcess");
            eVar.setScene(WalletBrandUI.this.f211002h.f24088t);
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123460f(eVar);
            return eVar;
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            if (i == 0 && i2 == 0) {
                C47164e eVar = (C47164e) yVar;
                String str2 = eVar.f126702f;
                this.f211024a = str2;
                Log.m105918d("MicroMsg.WalletBrandUI", "req_key = " + str2);
                PayInfo payInfo = new PayInfo();
                payInfo.f212592j = str2;
                WalletJsapiData walletJsapiData = WalletBrandUI.this.f211002h;
                payInfo.f212594o = walletJsapiData.f24075d;
                payInfo.f212595p = eVar.f126703g;
                int i3 = walletJsapiData.f24088t;
                payInfo.f212587e = i3;
                payInfo.f212599t = str;
                payInfo.f212589g = walletJsapiData.f24090v;
                payInfo.f212575F = eVar.sessionId;
                C75155x0.m90137c(i3, str2, i2);
                C76331i.m91761e(WalletBrandUI.this, payInfo, 1);
                return;
            }
            WalletBrandUI.this.finish();
        }
    }

    public WalletBrandUI() {
        C40008f fVar = C40008f.f107254d;
        this.f211010s = new IListener<WalletPayResultEvent>(fVar) {
            {
                this.__eventId = 520089918;
            }

            public boolean callback(IEvent iEvent) {
                WalletPayResultEvent walletPayResultEvent = (WalletPayResultEvent) iEvent;
                WalletPayResultEvent.C67828a aVar = walletPayResultEvent.f194085d;
                if (aVar.f194091f) {
                    Log.m105928w("MicroMsg.WalletBrandUI", "WalletPayResultEvent is from kinda, ScanQRCodePay");
                    return false;
                }
                Intent intent = aVar.f194086a;
                if (intent == null || intent.getIntExtra("payScene", 0) != 8) {
                    if (walletPayResultEvent.f194085d.f194092g == 2) {
                        Log.m105924i("MicroMsg.WalletBrandUI", "comeFrom walletmix, finish");
                        WalletBrandUI walletBrandUI = WalletBrandUI.this;
                        WalletPayResultEvent.C67828a aVar2 = walletPayResultEvent.f194085d;
                        walletBrandUI.setResult(aVar2.f194088c, aVar2.f194086a);
                        WalletBrandUI.this.finish();
                    }
                    WalletPayResultEvent.C67828a aVar3 = walletPayResultEvent.f194085d;
                    Log.m105925i("MicroMsg.WalletBrandUI", "onPayEnd payResult:%s, reqKey:%s,  comeFrom:%s", Integer.valueOf(walletPayResultEvent.f194085d.f194088c), aVar3.f194089d, Integer.valueOf(aVar3.f194092g));
                    C72537b bVar = WalletBrandUI.this.f211000f;
                    if (bVar != null) {
                        Log.m105925i("MicroMsg.WalletBrandUI", "onPayEnd getGenPrepayFuncId:%d, getGenPrepayReqKey:%s,appbrandScene:%s", Integer.valueOf(bVar.mo6864b()), WalletBrandUI.this.f211000f.mo6863a(), WalletBrandUI.this.f211005n);
                    }
                    if (WalletBrandUI.this.f211000f.mo6864b() == 398) {
                        WalletPayResultEvent.C67828a aVar4 = walletPayResultEvent.f194085d;
                        if (aVar4 == null || Util.isNullOrNil(aVar4.f194089d) || !walletPayResultEvent.f194085d.f194089d.equalsIgnoreCase(WalletBrandUI.this.f211000f.mo6863a()) || walletPayResultEvent.f194085d.f194092g != 1) {
                            Log.m105925i("MicroMsg.WalletBrandUI", "FuncId %d,is not current request key || comeFrom:%s is not FINISH", Integer.valueOf(WalletBrandUI.this.f211000f.mo6864b()), Integer.valueOf(walletPayResultEvent.f194085d.f194092g));
                            WalletPayResultEvent.C67828a aVar5 = walletPayResultEvent.f194085d;
                            if (aVar5 != null && !Util.isNullOrNil(aVar5.f194089d) && walletPayResultEvent.f194085d.f194089d.equalsIgnoreCase(WalletBrandUI.this.f211000f.mo6863a()) && walletPayResultEvent.f194085d.f194088c == 0) {
                                WalletBrandUI.this.finish();
                            }
                        } else if (Util.isNullOrNil(WalletBrandUI.this.f211005n) || !WalletBrandUI.this.f211005n.equalsIgnoreCase("key_from_scene_appbrandgame")) {
                            WalletBrandUI walletBrandUI2 = WalletBrandUI.this;
                            WalletPayResultEvent.C67828a aVar6 = walletPayResultEvent.f194085d;
                            walletBrandUI2.setResult(aVar6.f194088c, aVar6.f194086a);
                            WalletBrandUI walletBrandUI3 = WalletBrandUI.this;
                            WalletPayResultEvent.C67828a aVar7 = walletPayResultEvent.f194085d;
                            walletBrandUI3.mo99945J7(aVar7.f194088c, aVar7.f194086a);
                            WalletBrandUI.this.finish();
                        } else {
                            WalletBrandUI walletBrandUI4 = WalletBrandUI.this;
                            WalletPayResultEvent.C67828a aVar8 = walletPayResultEvent.f194085d;
                            walletBrandUI4.mo99944I7(aVar8.f194088c, aVar8.f194086a);
                        }
                    } else {
                        WalletBrandUI walletBrandUI5 = WalletBrandUI.this;
                        WalletPayResultEvent.C67828a aVar9 = walletPayResultEvent.f194085d;
                        walletBrandUI5.setResult(aVar9.f194088c, aVar9.f194086a);
                        WalletBrandUI walletBrandUI6 = WalletBrandUI.this;
                        WalletPayResultEvent.C67828a aVar10 = walletPayResultEvent.f194085d;
                        walletBrandUI6.mo99945J7(aVar10.f194088c, aVar10.f194086a);
                        WalletBrandUI.this.finish();
                    }
                    return true;
                }
                Log.m105928w("MicroMsg.WalletBrandUI", "WalletPayResultEvent is from kinda offline pay");
                return false;
            }
        };
        this.f211011t = new IListener<WalletCloseProgressEvent>(fVar) {
            {
                this.__eventId = -917791906;
            }

            public boolean callback(IEvent iEvent) {
                WalletCloseProgressEvent walletCloseProgressEvent = (WalletCloseProgressEvent) iEvent;
                Dialog dialog = WalletBrandUI.this.f210999e;
                if (dialog == null) {
                    return true;
                }
                dialog.dismiss();
                WalletBrandUI.this.f210999e = null;
                return true;
            }
        };
    }

    /* renamed from: H7 */
    public final boolean mo99943H7() {
        String substring;
        C79144b.m95773a().getClass();
        String str = this.f211002h.f24080i;
        if (str == null) {
            return false;
        }
        int indexOf = str.indexOf("prepay_id=");
        String str2 = null;
        if (!(indexOf == -1 || (substring = str.substring(indexOf + 10)) == null)) {
            int indexOf2 = substring.indexOf("&");
            str2 = indexOf2 == -1 ? substring : substring.substring(0, indexOf2);
        }
        if (str2 == null) {
            return true;
        }
        Log.m105925i("MicroMsg.WalletBrandUI", "isPrefixDisableKinda: %s", str2);
        if (str2.startsWith("tax_")) {
            Log.m105924i("MicroMsg.WalletBrandUI", "prepay_id starts With tax_");
            C79144b.m95773a().getClass();
            Log.m105924i("MicroMsg.WalletBrandUI", "open KindaTaxPaySwitch");
        }
        Log.m105925i("MicroMsg.WalletBrandUI", "isPrefixDisableKinda :%s", Boolean.FALSE);
        int i = this.f211002h.f24088t;
        return i == 3 || i == 46;
    }

    /* renamed from: I7 */
    public final void mo99944I7(int i, Intent intent) {
        Log.m105925i("MicroMsg.WalletBrandUI", "sendMiniAppPayResult result:%d", Integer.valueOf(i));
        WalletPayResultForAppbrandGameEvent walletPayResultForAppbrandGameEvent = new WalletPayResultForAppbrandGameEvent();
        WalletPayResultForAppbrandGameEvent.C67829a aVar = walletPayResultForAppbrandGameEvent.f194093d;
        aVar.f194094a = intent;
        aVar.f194097d = 1;
        aVar.f194096c = "key_from_scene_appbrandgame";
        aVar.f194095b = i;
        aVar.f194098e = this.f211006o;
        walletPayResultForAppbrandGameEvent.publish();
    }

    /* renamed from: J7 */
    public void mo99945J7(int i, Intent intent) {
        Log.m105925i("MicroMsg.WalletBrandUI", "sendPaySuccessAheadCallbackResult result:%d", Integer.valueOf(i));
        WalletJsapiData walletJsapiData = this.f211002h;
        if (walletJsapiData != null && walletJsapiData.f24074R != null) {
            if (intent == null) {
                intent = new Intent();
            }
            if (intent.getExtras() == null) {
                intent.putExtras(new Bundle());
            }
            this.f211002h.f24074R.mo164633b(i, intent.getExtras());
        }
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return -1;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Log.m105924i("MicroMsg.WalletBrandUI", "onActivityResultresultCode : " + i2 + " requestCode: " + i);
        if (i2 == -1 && i == 1) {
            Log.m105924i("MicroMsg.WalletBrandUI", "get result to callback? " + intent.getStringExtra(APMidasPayAPI.ENV_TEST));
        }
        if (!this.f211009r || i != 4 || intent == null) {
            finish();
            return;
        }
        Log.m105924i("MicroMsg.WalletBrandUI", "onActivityResult For Face Action,resultCode : " + i2);
        int intExtra = intent.getIntExtra("err_code", 0);
        int intExtra2 = intent.getIntExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        int intExtra3 = intent.getIntExtra("countFace", 0);
        long longExtra = intent.getLongExtra("totalTime", 0);
        int intExtra4 = intent.getIntExtra("err_type", 6);
        Log.m105924i("MicroMsg.WalletBrandUI", "errCode： " + intExtra);
        Log.m105924i("MicroMsg.WalletBrandUI", "scene： " + intExtra2);
        Log.m105924i("MicroMsg.WalletBrandUI", "countFace： " + intExtra3);
        Log.m105924i("MicroMsg.WalletBrandUI", "totalTime： " + longExtra);
        Log.m105924i("MicroMsg.WalletBrandUI", "errorType： " + intExtra4);
        if (i2 != -1) {
            if (!(this.f211007p == null || intent.getExtras() == null)) {
                String string = intent.getExtras().getString("click_other_verify_btn");
                boolean z = !Util.isNullOrNil(string) && string.equalsIgnoreCase("yes");
                Log.m105925i("MicroMsg.WalletBrandUI", "isClickOtherVerify: %s", string);
                if (z) {
                    Log.m105924i("MicroMsg.WalletBrandUI", "check face failed, click other verify");
                    this.f211007p.call(true, "", intExtra, "");
                    this.f211007p = null;
                }
            }
            if (i2 == 0) {
                Log.m105924i("MicroMsg.WalletBrandUI", "resultCode：RESULT_CANCELED");
                VoidCallback voidCallback = this.f211008q;
                if (voidCallback != null) {
                    voidCallback.call();
                    this.f211008q = null;
                }
                finish();
            }
        } else if (this.f211007p != null && intent.getExtras() != null) {
            this.f211007p.call(false, intent.getExtras().getString(XWalkReaderBasePlugin.PARAM_KEY_TOKEN), intExtra, "");
            this.f211007p = null;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f211002h = (WalletJsapiData) getIntent().getParcelableExtra("WalletJsapiData");
        if (getWindow() != null) {
            getWindow().addFlags(Integer.MIN_VALUE);
            getWindow().setStatusBarColor(0);
        }
        if (this.f211002h == null) {
            Log.m105928w("MicroMsg.WalletBrandUI", "no jsapi data");
            finish();
            return;
        }
        ((C78144b) C86312j.m106911c(C78144b.class)).mo107985v6();
        C22252b.m25805b();
        WalletJsapiData walletJsapiData = this.f211002h;
        String str = walletJsapiData.f24063F;
        if (str != null) {
            this.f211005n = str;
        }
        this.f211004j = walletJsapiData.f24088t;
        if (this.f211005n.equalsIgnoreCase("key_from_scene_appbrandgame")) {
            WalletJsapiData walletJsapiData2 = this.f211002h;
            this.f211006o = walletJsapiData2.f24089u;
            walletJsapiData2.f24089u = 0;
        }
        C75136r0.f221075a = System.currentTimeMillis();
        int i = this.f211002h.f24058A;
        Log.m105925i("MicroMsg.WalletBrandUI", "onCreate appbrandScene:%s,payScene:%d,requestCode:%d", this.f211005n, Integer.valueOf(this.f211004j), Integer.valueOf(this.f211006o));
        if (C75592q0.m90763K()) {
            Log.m105924i("MicroMsg.WalletBrandUI", "hy: do pay with payu");
            this.f211000f = new C72540e();
        } else if (i == 2) {
            Log.m105924i("MicroMsg.WalletBrandUI", "hy: do pay with h5");
            this.f211000f = new C72536a();
        } else if (i == 3) {
            Log.m105924i("MicroMsg.WalletBrandUI", "do pay with mall");
            this.f211000f = new C72543g();
        } else if (i == 4) {
            Log.m105924i("MicroMsg.WalletBrandUI", "do pay with component");
            this.f211000f = new C72538d();
        } else if (mo99943H7()) {
            Log.m105924i("MicroMsg.WalletBrandUI", "do pay with kinda");
            this.f211000f = new C5814c();
        } else {
            Log.m105924i("MicroMsg.WalletBrandUI", "hy: do pay with tenpay");
            this.f211000f = new C72541f();
        }
        this.f211010s.alive();
        this.f211011t.alive();
        if (this.f211000f instanceof C5814c) {
            Log.m105924i("MicroMsg.WalletBrandUI", "onCreate: do pay with kinda");
        } else {
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123455a(this.f211000f.mo6864b(), this);
        }
        Log.m105924i("MicroMsg.WalletBrandUI", "onCreate " + hashCode());
    }

    public void onDestroy() {
        Log.m105924i("MicroMsg.WalletBrandUI", "onDestroy");
        super.onDestroy();
        if (this.f211000f instanceof C5814c) {
            Log.m105924i("MicroMsg.WalletBrandUI", "onDestroy: do pay with kinda");
        } else {
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123470p(this.f211000f.mo6864b(), this);
        }
        this.f211010s.dead();
        this.f211011t.dead();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        finish();
        return true;
    }

    public void onNewIntent(Intent intent) {
        Log.m105924i("MicroMsg.WalletBrandUI", "onNewIntent");
        super.onNewIntent(intent);
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        Log.m105924i("MicroMsg.WalletBrandUI", "onRestoreInstanceState " + hashCode());
    }

    public void onResume() {
        Log.m105924i("MicroMsg.WalletBrandUI", "onResume");
        super.onResume();
        Log.m105925i("MicroMsg.WalletBrandUI", "Handler jump intercept = %b,taskid = %d,parentName = %s", Boolean.valueOf(this.f210998d), Integer.valueOf(getTaskId()), getCallingActivity());
        if (!this.f210998d) {
            this.f210998d = true;
            this.f211001g = this.f211000f.mo6865c();
            Dialog dialog = this.f210999e;
            if (dialog != null) {
                dialog.dismiss();
                this.f210999e = null;
            }
            if (!mo99943H7() && this.f211002h.f24058A != 4) {
                this.f210999e = C75197d0.m90165f(this, true, false, new C5817g(this));
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Log.m105924i("MicroMsg.WalletBrandUI", "onSaveInstanceState " + hashCode());
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.WalletBrandUI", "hy: brandui on scene end. errType: %d, errCode: %d, errMsg:%s scene %s _scene %s", Integer.valueOf(i), Integer.valueOf(i2), str, yVar, this.f211001g);
        if (yVar.getType() == this.f211000f.mo6864b() && yVar == this.f211001g) {
            this.f211000f.onSceneEnd(i, i2, str, yVar);
        }
    }

    public void onStop() {
        super.onStop();
        Dialog dialog = this.f210999e;
        if (dialog != null) {
            dialog.dismiss();
            this.f210999e = null;
        }
    }
}
