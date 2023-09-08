package com.tencent.p014mm.plugin.wallet_core.p125ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.WalletGetPaidOrderDetailEvent;
import com.tencent.p014mm.autogen.events.WalletPayResultEvent;
import com.tencent.p014mm.autogen.events.WebViewCloseWindowEvent;
import com.tencent.p014mm.autogen.events.WebViewWillCloseWindowEvent;
import com.tencent.p014mm.plugin.wallet_core.model.Orders;
import com.tencent.p014mm.protocal.GeneralControlWrapper;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import di3.C86312j;
import ie3.C76324c;
import j20.C117292a;
import k20.C9556a;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C117747y;
import qo3.C77398g;
import te3.C64630pm;
import y53.C79056a;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletMixOrderInfoUI */
public class WalletMixOrderInfoUI extends WalletBaseUI {

    /* renamed from: v */
    public static final /* synthetic */ int f210059v = 0;

    /* renamed from: d */
    public boolean f210060d;

    /* renamed from: e */
    public boolean f210061e;

    /* renamed from: f */
    public C64630pm f210062f;

    /* renamed from: g */
    public int f210063g;

    /* renamed from: h */
    public String f210064h = null;

    /* renamed from: i */
    public String f210065i = null;

    /* renamed from: j */
    public String f210066j = null;

    /* renamed from: n */
    public String f210067n = null;

    /* renamed from: o */
    public String f210068o = null;

    /* renamed from: p */
    public String f210069p = null;

    /* renamed from: q */
    public int f210070q;

    /* renamed from: r */
    public String f210071r = null;

    /* renamed from: s */
    public String f210072s = null;

    /* renamed from: t */
    public IListener f210073t;

    /* renamed from: u */
    public IListener f210074u;

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletMixOrderInfoUI$a */
    public class C72271a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f210076d;

        public C72271a(String str) {
            this.f210076d = str;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            WalletMixOrderInfoUI walletMixOrderInfoUI = WalletMixOrderInfoUI.this;
            String str = this.f210076d;
            int i2 = WalletMixOrderInfoUI.f210059v;
            walletMixOrderInfoUI.mo99586I7(str);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletMixOrderInfoUI$b */
    public class C72272b implements DialogInterface.OnClickListener {
        public C72272b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            WalletPayResultEvent walletPayResultEvent = new WalletPayResultEvent();
            WalletPayResultEvent.C67828a aVar = walletPayResultEvent.f194085d;
            aVar.f194089d = WalletMixOrderInfoUI.this.f210064h;
            aVar.f194088c = 0;
            walletPayResultEvent.publish();
            WalletMixOrderInfoUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletMixOrderInfoUI$c */
    public class C72273c implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ int f210079d;

        public C72273c(int i) {
            this.f210079d = i;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            if (WalletMixOrderInfoUI.this.f210060d) {
                WebViewWillCloseWindowEvent webViewWillCloseWindowEvent = new WebViewWillCloseWindowEvent();
                webViewWillCloseWindowEvent.f9613d.f9614a = this.f210079d;
                webViewWillCloseWindowEvent.publish();
            }
            WalletPayResultEvent walletPayResultEvent = new WalletPayResultEvent();
            WalletPayResultEvent.C67828a aVar = walletPayResultEvent.f194085d;
            aVar.f194089d = WalletMixOrderInfoUI.this.f210064h;
            aVar.f194088c = this.f210079d;
            walletPayResultEvent.publish();
            WalletMixOrderInfoUI.this.setResult(this.f210079d);
            WalletMixOrderInfoUI.this.finish();
        }
    }

    public WalletMixOrderInfoUI() {
        C40008f fVar = C40008f.f107254d;
        this.f210073t = new IListener<WebViewCloseWindowEvent>(fVar) {
            {
                this.__eventId = -704562821;
            }

            public boolean callback(IEvent iEvent) {
                WebViewCloseWindowEvent webViewCloseWindowEvent = (WebViewCloseWindowEvent) iEvent;
                Log.m105924i("MicroMsg.WalletMixOrderInfoUI", "WebViewCloseWindowEvent mean canceled by user");
                if (WalletMixOrderInfoUI.this.f210061e) {
                    WalletPayResultEvent walletPayResultEvent = new WalletPayResultEvent();
                    WalletPayResultEvent.C67828a aVar = walletPayResultEvent.f194085d;
                    aVar.f194089d = WalletMixOrderInfoUI.this.f210064h;
                    aVar.f194088c = 0;
                    walletPayResultEvent.publish();
                    WalletMixOrderInfoUI.this.finish();
                }
                return false;
            }
        };
        this.f210074u = new IListener<WalletGetPaidOrderDetailEvent>(fVar) {
            {
                this.__eventId = -1345618028;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:12:0x007b, code lost:
                if (r13.f210069p.equals(r13.f210064h) != false) goto L_0x007d;
             */
            /* JADX WARNING: Removed duplicated region for block: B:16:0x009f  */
            /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean callback(com.tencent.p014mm.sdk.event.IEvent r13) {
                /*
                    r12 = this;
                    com.tencent.mm.autogen.events.WalletGetPaidOrderDetailEvent r13 = (com.tencent.p014mm.autogen.events.WalletGetPaidOrderDetailEvent) r13
                    boolean r0 = r13 instanceof com.tencent.p014mm.autogen.events.WalletGetPaidOrderDetailEvent
                    r1 = 1
                    r2 = 0
                    if (r0 == 0) goto L_0x00ae
                    r12.dead()
                    com.tencent.mm.plugin.wallet_core.ui.WalletMixOrderInfoUI r0 = com.tencent.p014mm.plugin.wallet_core.p125ui.WalletMixOrderInfoUI.this
                    com.tencent.mm.autogen.events.WalletGetPaidOrderDetailEvent$a r13 = r13.f9593d
                    java.lang.String r3 = r13.f9594a
                    r0.f210065i = r3
                    java.lang.String r3 = r13.f9595b
                    r0.f210066j = r3
                    java.lang.String r3 = r13.f9596c
                    r0.f210067n = r3
                    java.lang.String r3 = r13.f9597d
                    r0.f210068o = r3
                    java.lang.String r3 = r13.f9598e
                    r0.f210069p = r3
                    int r3 = r13.f9599f
                    r0.f210070q = r3
                    java.lang.String r4 = r13.f9600g
                    r0.f210071r = r4
                    java.lang.String r13 = r13.f9601h
                    r0.f210072s = r13
                    r13 = 3
                    java.lang.Object[] r13 = new java.lang.Object[r13]
                    java.lang.String r0 = r0.f210064h
                    r13[r2] = r0
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
                    r13[r1] = r0
                    r0 = 2
                    com.tencent.mm.plugin.wallet_core.ui.WalletMixOrderInfoUI r3 = com.tencent.p014mm.plugin.wallet_core.p125ui.WalletMixOrderInfoUI.this
                    java.lang.String r3 = r3.f210069p
                    r13[r0] = r3
                    java.lang.String r0 = "MicroMsg.WalletMixOrderInfoUI"
                    java.lang.String r3 = "WalletGetPaidOrderDetailEvent callback：prepayId:%s, payScene：%s, reqKey:%s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r3, r13)
                    com.tencent.mm.plugin.wallet_core.ui.WalletMixOrderInfoUI r13 = com.tencent.p014mm.plugin.wallet_core.p125ui.WalletMixOrderInfoUI.this
                    boolean r13 = r13.mo99587J7(r1)
                    if (r13 == 0) goto L_0x0059
                    java.lang.String r13 = "startOverseaWalletSuccPageUseCase is true, go kinda"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r13)
                    goto L_0x00af
                L_0x0059:
                    com.tencent.mm.plugin.wallet_core.ui.WalletMixOrderInfoUI r13 = com.tencent.p014mm.plugin.wallet_core.p125ui.WalletMixOrderInfoUI.this
                    int r0 = r13.f210070q
                    if (r0 != r1) goto L_0x009c
                    java.lang.String r13 = r13.f210064h
                    boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
                    if (r13 != 0) goto L_0x009c
                    com.tencent.mm.plugin.wallet_core.ui.WalletMixOrderInfoUI r13 = com.tencent.p014mm.plugin.wallet_core.p125ui.WalletMixOrderInfoUI.this
                    java.lang.String r13 = r13.f210069p
                    boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
                    if (r13 != 0) goto L_0x007d
                    com.tencent.mm.plugin.wallet_core.ui.WalletMixOrderInfoUI r13 = com.tencent.p014mm.plugin.wallet_core.p125ui.WalletMixOrderInfoUI.this
                    java.lang.String r0 = r13.f210069p
                    java.lang.String r13 = r13.f210064h
                    boolean r13 = r0.equals(r13)
                    if (r13 == 0) goto L_0x009c
                L_0x007d:
                    com.tencent.mm.plugin.wallet_core.ui.WalletMixOrderInfoUI r13 = com.tencent.p014mm.plugin.wallet_core.p125ui.WalletMixOrderInfoUI.this
                    y53.a r0 = new y53.a
                    com.tencent.mm.plugin.wallet_core.ui.WalletMixOrderInfoUI r3 = com.tencent.p014mm.plugin.wallet_core.p125ui.WalletMixOrderInfoUI.this
                    java.lang.String r4 = r3.f210065i
                    java.lang.String r5 = r3.f210066j
                    java.lang.String r6 = r3.f210067n
                    java.lang.String r7 = r3.f210068o
                    java.lang.String r8 = r3.f210069p
                    int r9 = r3.f210070q
                    java.lang.String r10 = r3.f210071r
                    java.lang.String r11 = r3.f210072s
                    r3 = r0
                    r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
                    r13.doSceneForceProgress(r0)
                    r13 = 0
                    goto L_0x009d
                L_0x009c:
                    r13 = 1
                L_0x009d:
                    if (r13 == 0) goto L_0x00af
                    com.tencent.mm.plugin.wallet_core.ui.WalletMixOrderInfoUI r13 = com.tencent.p014mm.plugin.wallet_core.p125ui.WalletMixOrderInfoUI.this
                    r13.f210061e = r2
                    r0 = 2131839415(0x7f1149b7, float:1.931208E38)
                    java.lang.String r0 = r13.getString(r0)
                    r13.mo99585H7(r13, r0, r2)
                    goto L_0x00af
                L_0x00ae:
                    r1 = 0
                L_0x00af:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wallet_core.p125ui.WalletMixOrderInfoUI.C57794.callback(com.tencent.mm.sdk.event.IEvent):boolean");
            }
        };
    }

    /* renamed from: H7 */
    public final void mo99585H7(Context context, String str, int i) {
        Log.m105924i("MicroMsg.WalletMixOrderInfoUI", "showErrorAlert");
        if (!this.f210060d) {
            WebViewWillCloseWindowEvent webViewWillCloseWindowEvent = new WebViewWillCloseWindowEvent();
            webViewWillCloseWindowEvent.f9613d.f9614a = i;
            webViewWillCloseWindowEvent.publish();
        }
        C77398g G = C76879j.m92713G(context, str, "", false, new C72273c(i));
        if (G != null) {
            G.setCancelable(false);
        }
    }

    /* renamed from: I7 */
    public final void mo99586I7(String str) {
        if (!Util.isNullOrNil(str)) {
            Log.m105919d("MicroMsg.WalletMixOrderInfoUI", "H5 wallet url: %s", str);
            Intent intent = new Intent();
            intent.putExtra("rawUrl", str);
            intent.putExtra("showShare", false);
            intent.putExtra("show_bottom", false);
            intent.putExtra("needRedirect", false);
            intent.putExtra("hardcode_jspermission", JsapiPermissionWrapper.f121047h);
            intent.putExtra("hardcode_general_ctrl", GeneralControlWrapper.f121044e);
            C75228t.m90218K(getContext(), intent, 1);
            this.f210073t.alive();
        }
    }

    /* renamed from: J7 */
    public final boolean mo99587J7(int i) {
        Bundle bundle = new Bundle();
        bundle.putString("appid", this.f210065i);
        bundle.putString(AppMeasurement.Param.TIMESTAMP, this.f210066j);
        bundle.putString("nonce_str", this.f210067n);
        bundle.putString("package", this.f210068o);
        bundle.putInt("input_pay_scene", this.f210070q);
        bundle.putString("sign_type", this.f210071r);
        bundle.putString("pay_sign", this.f210072s);
        bundle.putString("req_key", this.f210069p);
        bundle.putInt("origin_pay_scene", i);
        bundle.putString("order_id", this.f210064h);
        bundle.putInt("retry_max_count", this.f210062f.f184861e);
        bundle.putInt("retry_interval_seconds", this.f210062f.f184860d);
        bundle.putString("retry_default_wording", this.f210062f.f184862f);
        return ((C76324c) C86312j.m106911c(C76324c.class)).startOverseaWalletSuccPageUseCase(this, bundle);
    }

    public void finish() {
        super.finish();
        Log.m105924i("MicroMsg.WalletMixOrderInfoUI", "finish");
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cat;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1 && i2 == 0) {
            Log.m105919d("MicroMsg.WalletMixOrderInfoUI", "requestCode: %d, resultCode: %d", Integer.valueOf(i), Integer.valueOf(i2));
            if (this.f210061e) {
                Log.m105924i("MicroMsg.WalletMixOrderInfoUI", "onActivityResult, mIsPending is true");
                this.f210074u.dead();
                WalletPayResultEvent walletPayResultEvent = new WalletPayResultEvent();
                WalletPayResultEvent.C67828a aVar = walletPayResultEvent.f194085d;
                aVar.f194089d = this.f210064h;
                aVar.f194088c = 0;
                walletPayResultEvent.publish();
                finish();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        C64630pm pmVar = new C64630pm();
        this.f210062f = pmVar;
        pmVar.f184861e = intent.getIntExtra("max_count", 3);
        this.f210062f.f184860d = intent.getIntExtra("inteval_time", 4);
        this.f210062f.f184862f = intent.getStringExtra("default_wording");
        if (Util.isNullOrNil(this.f210062f.f184862f)) {
            this.f210062f.f184862f = getString(C0966R.string.krp);
        }
        this.f210063g = this.f210062f.f184861e;
        boolean booleanExtra = intent.getBooleanExtra("is_jsapi_offline_pay", false);
        this.f210060d = booleanExtra;
        this.f210061e = true;
        if (!booleanExtra) {
            String stringExtra = intent.getStringExtra("pay_gate_url");
            boolean booleanExtra2 = intent.getBooleanExtra("need_dialog", false);
            String stringExtra2 = intent.getStringExtra("dialog_text");
            String stringExtra3 = intent.getStringExtra("prepayId");
            this.f210064h = stringExtra3;
            Log.m105925i("MicroMsg.WalletMixOrderInfoUI", " prepayId:%s ，need_dialog:%s", stringExtra3, Boolean.valueOf(booleanExtra2));
            if (booleanExtra2) {
                C76879j.m92750u(this, stringExtra2, "", new C72271a(stringExtra), new C72272b()).setCancelable(false);
            } else {
                mo99586I7(stringExtra);
            }
            this.f210074u.alive();
            return;
        }
        this.f210065i = getIntent().getStringExtra("appId");
        this.f210066j = getIntent().getStringExtra("timeStamp");
        this.f210067n = getIntent().getStringExtra("nonceStr");
        this.f210068o = getIntent().getStringExtra("packageExt");
        this.f210069p = getIntent().getStringExtra("reqKey");
        this.f210070q = getIntent().getIntExtra("payScene", -1);
        this.f210071r = getIntent().getStringExtra("signtype");
        this.f210072s = getIntent().getStringExtra("paySignature");
        Log.m105925i("MicroMsg.WalletMixOrderInfoUI", "start query offline walletmix succ page, prepayId:%s, payScene：%s, reqKey:%s", this.f210064h, Integer.valueOf(this.f210070q), this.f210069p);
        if (mo99587J7(2)) {
            Log.m105924i("MicroMsg.WalletMixOrderInfoUI", "startOverseaWalletSuccPageUseCase is true, go kinda");
        } else if (this.f210070q != 2 || !Util.isNullOrNil(this.f210064h)) {
            mo99585H7(this, getString(C0966R.string.l1h), 0);
        } else {
            doSceneForceProgress(new C79056a(this.f210065i, this.f210066j, this.f210067n, this.f210068o, this.f210069p, this.f210070q, this.f210071r, this.f210072s));
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f210074u.dead();
        this.f210073t.dead();
    }

    public void onResume() {
        super.onResume();
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C117747y yVar2 = yVar;
        if (!(yVar2 instanceof C79056a)) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            this.f210061e = false;
            WebViewWillCloseWindowEvent webViewWillCloseWindowEvent = new WebViewWillCloseWindowEvent();
            webViewWillCloseWindowEvent.f9613d.f9614a = -1;
            webViewWillCloseWindowEvent.publish();
            Orders orders = ((C79056a) yVar2).f232154e;
            Log.m105924i("MicroMsg.WalletMixOrderInfoUI", " go to WalletMixOrderInfoProxyUI");
            Intent intent = new Intent(this, WalletMixOrderInfoProxyUI.class);
            intent.putExtra("key_orders", orders);
            intent.putExtra("prepayId", this.f210064h);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/wallet_core/ui/WalletMixOrderInfoUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/wallet_core/ui/WalletMixOrderInfoUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            setResult(-1);
            finish();
        } else {
            if (this.f210063g != 0) {
                Log.m105918d("MicroMsg.WalletMixOrderInfoUI", "retryGetPaidOrderDetailAgain again");
                Log.m105919d("MicroMsg.WalletMixOrderInfoUI", "retryGetPaidOrderDetailAgain：m_currentRetryCount: %d", Integer.valueOf(this.f210063g));
                this.f210063g--;
                doSceneForceProgress(new C79056a(this.f210065i, this.f210066j, this.f210067n, this.f210068o, this.f210064h, this.f210070q, this.f210071r, this.f210072s), this.f210062f.f184860d);
            } else {
                this.f210061e = false;
                mo99585H7(this, str.isEmpty() ? this.f210062f.f184862f : str, 0);
            }
        }
        return true;
    }
}
