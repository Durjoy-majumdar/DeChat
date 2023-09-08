package com.tencent.p014mm.plugin.wallet_index.p127ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.KindaGotoExternAppEvent;
import com.tencent.p014mm.autogen.events.PayLoopInterruptEvent;
import com.tencent.p014mm.autogen.events.WalletPayResultEvent;
import com.tencent.p014mm.opensdk.constants.ConstantsAPI;
import com.tencent.p014mm.opensdk.modelpay.PayReq;
import com.tencent.p014mm.opensdk.modelpay.PayResp;
import com.tencent.p014mm.opensdk.modelpay.WXJointPay;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82872p6;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.IntentUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C75136r0;
import com.tencent.p014mm.wallet_core.model.C75155x0;
import di3.C86312j;
import f40.C86709a0;
import h81.C32735h;
import ie3.C76324c;
import ie3.C76331i;
import ie3.C76332j;
import j20.C117292a;
import k20.C9556a;
import ke3.C88144b;
import n63.C76838h;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C11385n;
import ob0.C117747y;
import pe3.C47465a;
import rt3.C22252b;
import te3.C64625pb3;
import te3.wy4;
import ub3.C78144b;
import yq3.C79144b;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.wallet_index.ui.OrderHandlerUI */
public class OrderHandlerUI extends MMActivity implements C11385n {

    /* renamed from: d */
    public String f210976d = "MicroMsg.OrderHandlerUI";

    /* renamed from: e */
    public String f210977e;

    /* renamed from: f */
    public PayReq f210978f;

    /* renamed from: g */
    public PayResp f210979g;

    /* renamed from: h */
    public PayReq.Options f210980h;

    /* renamed from: i */
    public boolean f210981i = false;

    /* renamed from: j */
    public int f210982j = 0;

    /* renamed from: n */
    public String f210983n = "";

    /* renamed from: o */
    public boolean f210984o = false;

    /* renamed from: p */
    public long f210985p = 0;

    /* renamed from: q */
    public String f210986q;

    /* renamed from: r */
    public boolean f210987r = false;

    /* renamed from: s */
    public boolean f210988s = false;

    /* renamed from: t */
    public boolean f210989t = false;

    /* renamed from: u */
    public boolean f210990u = false;

    /* renamed from: v */
    public boolean f210991v = false;

    /* renamed from: w */
    public IListener f210992w;

    /* renamed from: x */
    public IListener f210993x;

    /* renamed from: com.tencent.mm.plugin.wallet_index.ui.OrderHandlerUI$a */
    public class C72532a implements DialogInterface.OnClickListener {
        public C72532a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            OrderHandlerUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_index.ui.OrderHandlerUI$b */
    public class C72533b implements DialogInterface.OnClickListener {
        public C72533b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            OrderHandlerUI.this.finish();
        }
    }

    public OrderHandlerUI() {
        C40008f fVar = C40008f.f107254d;
        this.f210992w = new IListener<WalletPayResultEvent>(fVar) {
            {
                this.__eventId = 520089918;
            }

            public boolean callback(IEvent iEvent) {
                WalletPayResultEvent walletPayResultEvent = (WalletPayResultEvent) iEvent;
                if (walletPayResultEvent == null) {
                    Log.m105922f(OrderHandlerUI.this.f210976d, "event == null!!!");
                } else {
                    WalletPayResultEvent.C67828a aVar = walletPayResultEvent.f194085d;
                    if (aVar.f194091f) {
                        Log.m105922f(OrderHandlerUI.this.f210976d, "WalletPayResultEvent is from kinda, ScanQRCodePay");
                    } else {
                        OrderHandlerUI orderHandlerUI = OrderHandlerUI.this;
                        orderHandlerUI.f210981i = true;
                        String str = orderHandlerUI.f210976d;
                        WalletPayResultEvent.C67828a aVar2 = walletPayResultEvent.f194085d;
                        Log.m105921e(str, "onPayEnd, isOk = %s notifyPay %s reqKey %s %s, manualresult %s, from %s", Integer.valueOf(aVar.f194088c), Boolean.valueOf(OrderHandlerUI.this.f210984o), OrderHandlerUI.this.f210986q, aVar2.f194089d, Integer.valueOf(aVar2.f194087b), Util.getStack().toString());
                        if (!OrderHandlerUI.this.f210984o) {
                            WalletPayResultEvent.C67828a aVar3 = walletPayResultEvent.f194085d;
                            int i = aVar3.f194087b;
                            if (i == 1000) {
                                if (!Util.isNullOrNil(aVar3.f194089d) && walletPayResultEvent.f194085d.f194089d.equals(OrderHandlerUI.this.f210986q)) {
                                    OrderHandlerUI.this.finish();
                                }
                            } else if (i != 1001) {
                                if (Util.isNullOrNil(aVar3.f194089d) || walletPayResultEvent.f194085d.f194089d.equals(OrderHandlerUI.this.f210986q)) {
                                    WalletPayResultEvent.C67828a aVar4 = walletPayResultEvent.f194085d;
                                    if (aVar4.f194088c == -1) {
                                        OrderHandlerUI orderHandlerUI2 = OrderHandlerUI.this;
                                        PayResp payResp = orderHandlerUI2.f210979g;
                                        payResp.errCode = 0;
                                        if (orderHandlerUI2.f210991v) {
                                            payResp.returnKey = orderHandlerUI2.f210983n;
                                        } else {
                                            Intent intent = aVar4.f194086a;
                                            if (intent != null) {
                                                Bundle extras = intent.getExtras();
                                                String string = extras.getString("intent_pay_app_url");
                                                OrderHandlerUI.this.f210983n = extras.getString("intent_wap_pay_jump_url");
                                                String str2 = OrderHandlerUI.this.f210976d;
                                                Log.m105918d(str2, "onPayEnd, returnUrl = " + string);
                                                OrderHandlerUI.this.f210979g.returnKey = string;
                                            }
                                        }
                                    } else {
                                        OrderHandlerUI.this.f210979g.errCode = -2;
                                    }
                                    OrderHandlerUI orderHandlerUI3 = OrderHandlerUI.this;
                                    if (orderHandlerUI3.f210982j == 1) {
                                        orderHandlerUI3.mo99940L7(orderHandlerUI3, orderHandlerUI3.f210983n);
                                    } else {
                                        C72563f.m84919a(orderHandlerUI3, orderHandlerUI3.f210977e, orderHandlerUI3.f210979g, orderHandlerUI3.f210980h);
                                    }
                                    OrderHandlerUI orderHandlerUI4 = OrderHandlerUI.this;
                                    orderHandlerUI4.f210984o = true;
                                    orderHandlerUI4.finish();
                                } else {
                                    OrderHandlerUI orderHandlerUI5 = OrderHandlerUI.this;
                                    Log.m105921e(orderHandlerUI5.f210976d, "pass notify this req1 %s req2 %s", walletPayResultEvent.f194085d.f194089d, orderHandlerUI5.f210986q);
                                }
                            }
                        }
                    }
                }
                return false;
            }
        };
        this.f210993x = new IListener<KindaGotoExternAppEvent>(fVar) {
            {
                this.__eventId = -1268509959;
            }

            public boolean callback(IEvent iEvent) {
                KindaGotoExternAppEvent kindaGotoExternAppEvent = (KindaGotoExternAppEvent) iEvent;
                String str = OrderHandlerUI.this.f210976d;
                KindaGotoExternAppEvent.C67722a aVar = kindaGotoExternAppEvent.f193709d;
                Log.m105925i(str, "KindaGotoExternAppEventCallback event.data.returnKey:%s, event.data.errcode：%d", aVar.f193712c, Integer.valueOf(aVar.f193711b));
                OrderHandlerUI orderHandlerUI = OrderHandlerUI.this;
                PayResp payResp = orderHandlerUI.f210979g;
                KindaGotoExternAppEvent.C67722a aVar2 = kindaGotoExternAppEvent.f193709d;
                payResp.returnKey = aVar2.f193712c;
                payResp.errCode = aVar2.f193711b;
                C72563f.m84919a(orderHandlerUI, orderHandlerUI.f210977e, payResp, orderHandlerUI.f210980h);
                OrderHandlerUI.this.finish();
                return true;
            }
        };
    }

    /* renamed from: H7 */
    public final void mo99936H7(int i, String str, boolean z) {
        if (this.f210982j != 1) {
            C72563f.m84919a(this, this.f210977e, this.f210979g, this.f210980h);
            finish();
        } else if (!TextUtils.isEmpty(this.f210983n) || !z) {
            mo99940L7(this, this.f210983n);
            finish();
        } else {
            setContentViewVisibility(0);
            if (TextUtils.isEmpty(str)) {
                str = getString(C0966R.string.l_3);
            }
            C76879j.m92713G(this, str, (String) null, false, new C72562e(this));
        }
    }

    /* renamed from: I7 */
    public final String mo99937I7() {
        String stringExtra = getIntent().getStringExtra("key_app_packagename_safe");
        String stringExtra2 = getIntent().getStringExtra(ConstantsAPI.APP_PACKAGE);
        String str = !Util.isNullOrNil(stringExtra) ? stringExtra : stringExtra2;
        Log.m105925i(this.f210976d, "getAppPayPackageName new：%s，old：%s,final：%s", stringExtra, stringExtra2, str);
        return str;
    }

    /* renamed from: J7 */
    public final void mo99938J7() {
        C76332j jVar;
        if (!((C76324c) C86312j.m106911c(C76324c.class)).canOpenKindaCashier(this)) {
            C76879j.m92754y(this, getString(C0966R.string.kuy), "", getString(C0966R.string.au5), new C72532a());
            return;
        }
        synchronized (C76332j.class) {
            jVar = C76332j.C76334b.f223590a;
        }
        Object obj = Boolean.FALSE;
        if (jVar.f223589a.containsKey("key_pay_offline_is_auth_doing")) {
            obj = jVar.f223589a.get("key_pay_offline_is_auth_doing");
        }
        if (((Boolean) obj).booleanValue()) {
            C76879j.m92754y(this, getString(C0966R.string.kuy), "", getString(C0966R.string.au5), new C72533b());
            return;
        }
        PayLoopInterruptEvent payLoopInterruptEvent = new PayLoopInterruptEvent();
        payLoopInterruptEvent.f193821d.f193822a = 1;
        payLoopInterruptEvent.publish();
    }

    /* renamed from: K7 */
    public final PayReq mo99939K7() {
        PayReq jointPayReq = IntentUtil.getInt(getIntent().getExtras(), "_wxapi_command_type", 0) == 27 ? new WXJointPay.JointPayReq() : new PayReq();
        jointPayReq.fromBundle(IntentUtil.getExtras(getIntent()));
        return jointPayReq;
    }

    /* renamed from: L7 */
    public final void mo99940L7(Context context, String str) {
        if (context == null) {
            Log.m105920e(this.f210976d, "startOuterApp context == null");
        } else if (TextUtils.isEmpty(str)) {
            Log.m105920e(this.f210976d, "startOuterApp callbackUrl is empty");
        } else {
            String str2 = this.f210976d;
            Log.m105924i(str2, "startOuterApp callbackUrl is " + str);
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            if (Util.isIntentAvailable(context, intent, true)) {
                try {
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent);
                    C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI", "startOuterApp", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(context, "com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI", "startOuterApp", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } catch (Exception e) {
                    Log.printErrStackTrace(this.f210976d, e, "", new Object[0]);
                }
            }
        }
    }

    public void finish() {
        Log.m105925i(this.f210976d, "finish hasFinish %s %s", Boolean.valueOf(this.f210990u), Util.getStack().toString());
        if (!this.f210990u) {
            this.f210990u = true;
            super.finish();
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bm4;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Log.m105925i(this.f210976d, "onActivityResult resp %s, onPayEndCalled %s", this.f210979g, Boolean.valueOf(this.f210981i));
        if (intent != null) {
            int intExtra = intent.getIntExtra("key_pay_reslut_type", 0);
            if (intExtra == 1000) {
                Log.m105925i(this.f210976d, "onActivityResult resp %s, onPayEndCalled %s payResultType %s", this.f210979g, Boolean.valueOf(this.f210981i), Integer.valueOf(intExtra));
                finish();
                return;
            } else if (intExtra == 1001) {
                return;
            }
        }
        if (this.f210979g != null && !this.f210981i) {
            Log.m105920e(this.f210976d, "onActivityResult, onPayEnd not called");
            this.f210979g.errCode = -2;
            mo99936H7(0, "", false);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Log.m105924i(this.f210976d, "onConfigurationChanged");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f210976d = "MicroMsg.OrderHandlerUI@" + hashCode();
        this.f210985p = getIntent().getLongExtra("wallet_pay_key_check_time", -1);
        setContentViewVisibility(8);
        C75136r0.f221075a = System.currentTimeMillis();
        getController().mo177105z0(0);
        this.f210992w.alive();
        this.f210993x.alive();
        C79144b.m95773a().getClass();
        this.f210987r = true;
        this.f210988s = true;
        this.f210989t = C79144b.m95773a().mo109088c(C32735h.C32737c.clicfg_kinda_sns_app_pay_open_android, false);
        ((C78144b) C86312j.m106911c(C78144b.class)).mo107985v6();
        C22252b.m25805b();
    }

    public void onDestroy() {
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(397, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(2655, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(C82872p6.CTRL_INDEX, this);
        this.f210992w.dead();
        this.f210993x.dead();
        super.onDestroy();
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [ob0.y] */
    /* JADX WARNING: type inference failed for: r1v58, types: [n63.h] */
    /* JADX WARNING: type inference failed for: r1v59, types: [n63.h] */
    /* JADX WARNING: type inference failed for: r1v60, types: [n63.j] */
    /* JADX WARNING: type inference failed for: r1v61, types: [n63.m] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0161  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
            r15 = this;
            java.lang.Class<ie3.c> r0 = ie3.C76324c.class
            super.onResume()
            com.tencent.mm.opensdk.modelpay.PayReq r7 = r15.mo99939K7()
            com.tencent.mm.opensdk.modelpay.PayReq r1 = r15.f210978f
            if (r1 == 0) goto L_0x0019
            java.lang.String r2 = r7.prepayId
            if (r2 == 0) goto L_0x0209
            java.lang.String r1 = r1.prepayId
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x0209
        L_0x0019:
            r15.f210978f = r7
            android.content.Intent r1 = r15.getIntent()
            java.lang.String r2 = "key_scene"
            r3 = 0
            int r1 = r1.getIntExtra(r2, r3)
            r15.f210982j = r1
            java.lang.String r1 = r15.f210976d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "onCreate() mScene is "
            r2.append(r4)
            int r4 = r15.f210982j
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            int r1 = r15.f210982j
            if (r1 != 0) goto L_0x005d
            java.lang.String r1 = r15.mo99937I7()
            r15.f210977e = r1
            if (r1 == 0) goto L_0x0052
            int r1 = r1.length()
            if (r1 != 0) goto L_0x005d
        L_0x0052:
            java.lang.String r0 = r15.f210976d
            java.lang.String r1 = "callerPkgName is null, dealOrder fail, can not callback"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            r15.finish()
            return
        L_0x005d:
            com.tencent.mm.opensdk.modelpay.PayReq$Options r1 = new com.tencent.mm.opensdk.modelpay.PayReq$Options
            r1.<init>()
            r15.f210980h = r1
            android.content.Intent r2 = r15.getIntent()
            android.os.Bundle r2 = r2.getExtras()
            r1.fromBundle(r2)
            android.content.Intent r1 = r15.getIntent()
            android.os.Bundle r1 = r1.getExtras()
            java.lang.String r2 = "_wxapi_command_type"
            int r1 = com.tencent.p014mm.sdk.platformtools.IntentUtil.getInt(r1, r2, r3)
            r2 = 27
            if (r1 != r2) goto L_0x0087
            com.tencent.mm.opensdk.modelpay.WXJointPay$JointPayResp r1 = new com.tencent.mm.opensdk.modelpay.WXJointPay$JointPayResp
            r1.<init>()
            goto L_0x008c
        L_0x0087:
            com.tencent.mm.opensdk.modelpay.PayResp r1 = new com.tencent.mm.opensdk.modelpay.PayResp
            r1.<init>()
        L_0x008c:
            r15.f210979g = r1
            java.lang.String r2 = r7.prepayId
            r1.prepayId = r2
            java.lang.String r2 = r7.extData
            r1.extData = r2
            int r1 = r15.f210982j
            r2 = 1
            java.lang.String r4 = ""
            if (r1 != 0) goto L_0x00e7
            boolean r1 = r7.checkArgs()
            r5 = -1
            if (r1 != 0) goto L_0x00c5
            java.lang.String r0 = r15.f210976d
            java.lang.String r1 = "onCreate, PayReq checkArgs fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            com.tencent.mm.opensdk.modelpay.PayResp r0 = r15.f210979g
            r0.errCode = r5
            r1 = 2131833903(0x7f11342f, float:1.9300901E38)
            java.lang.String r1 = r15.getString(r1)
            r0.errStr = r1
            java.lang.String r0 = r15.f210977e
            com.tencent.mm.opensdk.modelpay.PayResp r1 = r15.f210979g
            com.tencent.mm.opensdk.modelpay.PayReq$Options r2 = r15.f210980h
            com.tencent.p014mm.plugin.wallet_index.p127ui.C72563f.m84919a(r15, r0, r1, r2)
            r15.finish()
            return
        L_0x00c5:
            android.content.Intent r1 = r15.getIntent()
            java.lang.String r6 = "orderhandlerui_checkapp_result"
            boolean r1 = r1.getBooleanExtra(r6, r3)
            if (r1 != 0) goto L_0x00ed
            java.lang.String r0 = r15.f210976d
            java.lang.String r1 = "onCreate, checkAppResult fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            com.tencent.mm.opensdk.modelpay.PayResp r0 = r15.f210979g
            r0.errCode = r5
            java.lang.String r1 = r15.f210977e
            com.tencent.mm.opensdk.modelpay.PayReq$Options r2 = r15.f210980h
            com.tencent.p014mm.plugin.wallet_index.p127ui.C72563f.m84919a(r15, r1, r0, r2)
            r15.finish()
            return
        L_0x00e7:
            if (r1 != r2) goto L_0x00ed
            java.lang.String r1 = "WAP"
            r11 = r1
            goto L_0x00ee
        L_0x00ed:
            r11 = r4
        L_0x00ee:
            java.lang.String r12 = r15.mo99937I7()
            android.content.pm.PackageManager r1 = r15.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0114 }
            r1.getPackageInfo(r12, r3)     // Catch:{ NameNotFoundException -> 0x0114 }
            android.content.pm.PackageManager r1 = r15.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0114 }
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r12, r3)     // Catch:{ NameNotFoundException -> 0x0114 }
            android.content.pm.ApplicationInfo r1 = r1.applicationInfo     // Catch:{ NameNotFoundException -> 0x0114 }
            android.content.pm.PackageManager r5 = r15.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0114 }
            java.lang.CharSequence r1 = r1.loadLabel(r5)     // Catch:{ NameNotFoundException -> 0x0114 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ NameNotFoundException -> 0x0114 }
            java.lang.String r4 = com.tencent.p014mm.pluginsdk.model.app.C72688j0.m85018d(r15, r12)     // Catch:{ NameNotFoundException -> 0x0112 }
            goto L_0x011d
        L_0x0112:
            r5 = move-exception
            goto L_0x0116
        L_0x0114:
            r5 = move-exception
            r1 = r4
        L_0x0116:
            java.lang.String r6 = r15.f210976d
            java.lang.Object[] r8 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r5, r4, r8)
        L_0x011d:
            r13 = r1
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r1 == 0) goto L_0x0130
            android.content.Intent r1 = r15.getIntent()
            java.lang.String r4 = "key_app_signature"
            java.lang.String r1 = r1.getStringExtra(r4)
            r14 = r1
            goto L_0x0131
        L_0x0130:
            r14 = r4
        L_0x0131:
            com.tencent.mm.opensdk.modelpay.PayReq r1 = r15.mo99939K7()
            android.content.Intent r4 = r15.getIntent()
            android.os.Bundle r4 = r4.getExtras()
            r1.fromBundle(r4)
            java.lang.String r1 = r1.prepayId
            int r4 = r15.f210982j
            if (r4 != r2) goto L_0x0161
            boolean r5 = r15.f210988s
            if (r5 == 0) goto L_0x0161
            r15.mo99938J7()
            di3.d r0 = di3.C86312j.m106911c(r0)
            r8 = r0
            ie3.c r8 = (ie3.C76324c) r8
            android.content.Intent r0 = r15.getIntent()
            android.os.Bundle r10 = r0.getExtras()
            r9 = r15
            r8.startWxpayH5Pay(r9, r10, r11, r12, r13, r14)
            return
        L_0x0161:
            java.lang.String r8 = "sns_"
            if (r4 != 0) goto L_0x0195
            boolean r4 = r1.startsWith(r8)
            if (r4 == 0) goto L_0x0171
            boolean r4 = r15.f210989t
            if (r4 == 0) goto L_0x0171
        L_0x016f:
            r3 = 1
            goto L_0x017c
        L_0x0171:
            boolean r1 = r1.startsWith(r8)
            if (r1 != 0) goto L_0x017c
            boolean r1 = r15.f210987r
            if (r1 == 0) goto L_0x017c
            goto L_0x016f
        L_0x017c:
            if (r3 == 0) goto L_0x0195
            r15.mo99938J7()
            di3.d r0 = di3.C86312j.m106911c(r0)
            r8 = r0
            ie3.c r8 = (ie3.C76324c) r8
            android.content.Intent r0 = r15.getIntent()
            android.os.Bundle r10 = r0.getExtras()
            r9 = r15
            r8.startWxpayAppPay(r9, r10, r11, r12, r13, r14)
            return
        L_0x0195:
            f40.C86709a0.m107528h()
            f40.g r0 = f40.C86709a0.m107529k()
            ob0.b0 r0 = r0.f251779b
            r1 = 397(0x18d, float:5.56E-43)
            r0.mo123455a(r1, r15)
            f40.C86709a0.m107528h()
            f40.g r0 = f40.C86709a0.m107529k()
            ob0.b0 r0 = r0.f251779b
            r1 = 2655(0xa5f, float:3.72E-42)
            r0.mo123455a(r1, r15)
            f40.C86709a0.m107528h()
            f40.g r0 = f40.C86709a0.m107529k()
            ob0.b0 r0 = r0.f251779b
            r1 = 283(0x11b, float:3.97E-43)
            r0.mo123455a(r1, r15)
            n63.h r0 = new n63.h
            r1 = r0
            r2 = r7
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r1.<init>(r2, r3, r4, r5, r6)
            java.lang.String r1 = r7.prepayId
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x01d3
            goto L_0x01fd
        L_0x01d3:
            java.lang.String r1 = r7.prepayId
            java.lang.String r2 = "up_"
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto L_0x01ea
            n63.m r0 = new n63.m
            r1 = r0
            r2 = r7
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x01fd
        L_0x01ea:
            java.lang.String r1 = r7.prepayId
            boolean r1 = r1.startsWith(r8)
            if (r1 == 0) goto L_0x01fd
            n63.j r0 = new n63.j
            r1 = r0
            r2 = r7
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r1.<init>(r2, r3, r4, r5, r6)
        L_0x01fd:
            f40.C86709a0.m107528h()
            f40.g r1 = f40.C86709a0.m107529k()
            ob0.b0 r1 = r1.f251779b
            r1.mo123460f(r0)
        L_0x0209:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wallet_index.p127ui.OrderHandlerUI.onResume():void");
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        int i3 = i;
        int i4 = i2;
        String str2 = str;
        if (yVar.getType() == 397 || yVar.getType() == 2655 || yVar.getType() == 283) {
            PayInfo payInfo = new PayInfo();
            if (this.f210982j == 1) {
                payInfo.f212587e = 36;
            } else {
                payInfo.f212587e = 2;
            }
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123470p(yVar.getType(), this);
            String str3 = this.f210976d;
            Log.m105924i(str3, "onSceneEnd, errType = " + i3 + ", errCode = " + i4);
            C47465a aVar = ((C76838h) yVar).f224666e.f127056b.f127083a;
            C64625pb3 pb32 = (C64625pb3) aVar;
            wy4 wy4 = null;
            this.f210983n = pb32 == null ? null : pb32.f184806h;
            String str4 = "";
            if (i3 == 4 && i4 == -5) {
                Log.m105920e(this.f210976d, "onSceneEnd, auth access denied");
                this.f210979g.errCode = -1;
                mo99936H7(i4, str2, true);
                int i5 = payInfo.f212587e;
                PayReq payReq = this.f210978f;
                if (payReq != null) {
                    str4 = payReq.prepayId;
                }
                C75155x0.m90137c(i5, str4, i4);
            } else if (i3 == 0 && i4 == 0) {
                C64625pb3 pb33 = (C64625pb3) aVar;
                int i6 = pb33 == null ? -1 : pb33.f184803e;
                C64625pb3 pb34 = (C64625pb3) aVar;
                String str5 = pb34 == null ? null : pb34.f184804f;
                C64625pb3 pb35 = (C64625pb3) aVar;
                String str6 = pb35 == null ? null : pb35.f184805g;
                C64625pb3 pb36 = (C64625pb3) aVar;
                String str7 = pb36 == null ? null : pb36.f184802d;
                C64625pb3 pb37 = (C64625pb3) aVar;
                if (pb37 != null) {
                    wy4 = pb37.f184807i;
                }
                Log.m105925i(this.f210976d, "onSceneEnd, respErrCode = %d, respErrMsg = %s, respPrepayId = %s, respAppSource = %s", Integer.valueOf(i6), str5, str6, str7);
                if (Util.isNullOrNil(str6)) {
                    Log.m105920e(this.f210976d, "onSceneEnd, respPrepayId is null");
                    this.f210979g.errCode = -1;
                    mo99936H7(i4, str2, true);
                    return;
                }
                C75155x0.m90137c(payInfo.f212587e, str6, i4);
                if (wy4 == null || Util.isNullOrNil(wy4.f186241d)) {
                    PayReq payReq2 = this.f210978f;
                    payInfo.f212594o = payReq2.appId;
                    payInfo.f212592j = str6;
                    payInfo.f212596q = payReq2.partnerId;
                    payInfo.f212595p = str7;
                    payInfo.f212599t = str5;
                    if (this.f210985p > 0) {
                        C115669n nVar = C115669n.INSTANCE;
                        nVar.idkeyStat(641, 1, 1, true);
                        nVar.idkeyStat(641, 2, Util.milliSecondsToNow(this.f210985p), true);
                        if (payInfo.f212600u == null) {
                            payInfo.f212600u = new Bundle();
                        }
                        payInfo.f212600u.putLong("wallet_pay_key_check_time", this.f210985p);
                    }
                    C76331i.m91761e(this, payInfo, 123);
                } else {
                    this.f210991v = true;
                    Intent intent = new Intent();
                    intent.putExtra("prepayId", str6);
                    intent.putExtra("is_jsapi_offline_pay", false);
                    intent.putExtra("pay_gate_url", wy4.f186241d);
                    intent.putExtra("need_dialog", wy4.f186243f);
                    intent.putExtra("dialog_text", wy4.f186244g);
                    intent.putExtra("max_count", wy4.f186242e.f184861e);
                    intent.putExtra("inteval_time", wy4.f186242e.f184860d);
                    intent.putExtra("default_wording", wy4.f186242e.f184862f);
                    C88144b.m109792j(this, "wallet_core", ".ui.WalletMixOrderInfoUI", intent, true);
                }
                this.f210986q = str6;
                this.f210981i = false;
            } else {
                Log.m105920e(this.f210976d, "onSceneEnd,  PayAuthApp is failed!");
                this.f210979g.errCode = -1;
                mo99936H7(i4, str2, true);
                int i7 = payInfo.f212587e;
                PayReq payReq3 = this.f210978f;
                if (payReq3 != null) {
                    str4 = payReq3.prepayId;
                }
                C75155x0.m90137c(i7, str4, i4);
            }
        }
    }
}
