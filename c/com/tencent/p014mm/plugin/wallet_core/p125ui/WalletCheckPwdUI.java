package com.tencent.p014mm.plugin.wallet_core.p125ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.OpenFingerPrintAuthEvent;
import com.tencent.p014mm.autogen.events.ReleaseFingerPrintAuthEvent;
import com.tencent.p014mm.autogen.events.WalletEndResultEvent;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.id_verify.RealNameVerifyProcess;
import com.tencent.p014mm.plugin.wallet_core.utils.C5811n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75217h;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import com.tencent.p014mm.wallet_core.p137ui.formview.EditHintPasswdView;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import cr3.C75282g;
import di3.C86312j;
import f40.C86709a0;
import gr3.C76024a;
import h81.C32735h;
import ie3.C8883h;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import k20.C60958c;
import k20.C9556a;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C117747y;
import org.json.JSONObject;
import pe3.C89349b;
import pv2.C77290d;
import st1.C77761h0;
import t53.C77866b;
import te3.C64501kv;
import te3.C64592nu;
import te3.C64607oc3;
import te3.ci4;
import v53.C78339d;
import v53.C78341e;
import v53.C78342e0;
import v53.C78356x;
import v53.C78357y;
import vt1.C78473a;
import yq3.C79143a;
import yq3.C79148e;
import zi3.C79335b;

@C88989a(1)
/* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI */
public class WalletCheckPwdUI extends WalletBaseUI {

    /* renamed from: B */
    public static final /* synthetic */ int f210017B = 0;

    /* renamed from: A */
    public int f210018A;

    /* renamed from: d */
    public EditHintPasswdView f210019d;

    /* renamed from: e */
    public LinearLayout f210020e;

    /* renamed from: f */
    public TextView f210021f;

    /* renamed from: g */
    public TextView f210022g;

    /* renamed from: h */
    public TextView f210023h;

    /* renamed from: i */
    public TextView f210024i;

    /* renamed from: j */
    public ScrollView f210025j;

    /* renamed from: n */
    public boolean f210026n = false;

    /* renamed from: o */
    public boolean f210027o = false;

    /* renamed from: p */
    public String f210028p;

    /* renamed from: q */
    public String f210029q;

    /* renamed from: r */
    public int f210030r = 0;

    /* renamed from: s */
    public int f210031s = 0;

    /* renamed from: t */
    public int f210032t;

    /* renamed from: u */
    public boolean f210033u;

    /* renamed from: v */
    public String f210034v;

    /* renamed from: w */
    public String f210035w;

    /* renamed from: x */
    public String f210036x;

    /* renamed from: y */
    public Animation f210037y;

    /* renamed from: z */
    public C79148e.C79149a f210038z;

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI$a */
    public class C72259a implements MenuItem.OnMenuItemClickListener {
        public C72259a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            WalletCheckPwdUI walletCheckPwdUI = WalletCheckPwdUI.this;
            int i = WalletCheckPwdUI.f210017B;
            C79148e process = walletCheckPwdUI.getProcess();
            Log.m105924i("Micromsg.WalletCheckPwdUI", "onbackbtn click");
            if (process == null) {
                walletCheckPwdUI.mo99570J7(0);
            } else if (process instanceof RealNameVerifyProcess) {
                process.mo91257c(walletCheckPwdUI, 0);
            } else if (walletCheckPwdUI.f210027o) {
                process.f232423c.putInt("key_process_result_code", 0);
                process.mo91259f(walletCheckPwdUI, process.f232423c);
            } else if (process.mo91258e().equals("OpenECardProcess")) {
                walletCheckPwdUI.getInput().putInt("key_process_result_code", 0);
                walletCheckPwdUI.setResult(-1);
                process.mo91259f(walletCheckPwdUI, walletCheckPwdUI.getInput());
            } else if (process.mo91258e().equals("PayProcess")) {
                walletCheckPwdUI.getInput().putInt("key_process_result_code", 0);
                walletCheckPwdUI.setResult(-1);
                process.mo91259f(walletCheckPwdUI.getContext(), walletCheckPwdUI.getInput());
            } else if (process.mo91258e().equals("BindCardProcess")) {
                walletCheckPwdUI.getInput().putInt("key_process_result_code", 0);
                walletCheckPwdUI.setResult(-1);
                process.mo91259f(walletCheckPwdUI.getContext(), walletCheckPwdUI.getInput());
            } else if (process.mo91258e().equals("OfflineProcess")) {
                walletCheckPwdUI.getInput().putInt("key_process_result_code", 0);
                walletCheckPwdUI.setResult(-1);
                process.mo109109g(walletCheckPwdUI);
            }
            walletCheckPwdUI.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI$b */
    public class C72260b implements EditHintPasswdView.C75206c {
        public C72260b() {
        }

        public void onInputValidChange(boolean z) {
            if (z) {
                WalletCheckPwdUI walletCheckPwdUI = WalletCheckPwdUI.this;
                walletCheckPwdUI.f210029q = walletCheckPwdUI.f210019d.getText();
                C79148e g = C79143a.m95768g(WalletCheckPwdUI.this);
                String str = null;
                if (g != null) {
                    str = g.mo91258e();
                }
                if (!WalletCheckPwdUI.this.f210026n || "UnbindProcess".equals(str)) {
                    C75282g netController = WalletCheckPwdUI.this.getNetController();
                    WalletCheckPwdUI walletCheckPwdUI2 = WalletCheckPwdUI.this;
                    if (!netController.mo91271d(walletCheckPwdUI2.f210029q, walletCheckPwdUI2.getPayReqKey())) {
                        WalletCheckPwdUI walletCheckPwdUI3 = WalletCheckPwdUI.this;
                        WalletCheckPwdUI walletCheckPwdUI4 = WalletCheckPwdUI.this;
                        walletCheckPwdUI3.doSceneProgress(new C78356x(walletCheckPwdUI4.f210029q, 1, walletCheckPwdUI4.getPayReqKey()));
                        return;
                    }
                    return;
                }
                WalletCheckPwdUI walletCheckPwdUI5 = WalletCheckPwdUI.this;
                WalletCheckPwdUI walletCheckPwdUI6 = WalletCheckPwdUI.this;
                walletCheckPwdUI5.doSceneProgress(new C78357y(walletCheckPwdUI6.f210029q, walletCheckPwdUI6.f210028p));
                C115669n.INSTANCE.mo160131h(15021, 1);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI$c */
    public class C72261c implements View.OnClickListener {
        public C72261c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/WalletCheckPwdUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WalletCheckPwdUI walletCheckPwdUI = WalletCheckPwdUI.this;
            int i = WalletCheckPwdUI.f210017B;
            walletCheckPwdUI.mo99568H7();
            WalletCheckPwdUI walletCheckPwdUI2 = WalletCheckPwdUI.this;
            if (walletCheckPwdUI2.f210030r == 0) {
                walletCheckPwdUI2.f210030r = 1;
                walletCheckPwdUI2.mo99569I7();
            } else {
                walletCheckPwdUI2.f210030r = 0;
            }
            WalletCheckPwdUI.this.mo99573M7();
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/WalletCheckPwdUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI$d */
    public class C72262d implements C75217h {

        /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI$d$a */
        public class C72263a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ boolean f210043d;

            public C72263a(boolean z) {
                this.f210043d = z;
            }

            public void run() {
                if (this.f210043d) {
                    WalletCheckPwdUI.this.f210025j.fullScroll(130);
                } else {
                    WalletCheckPwdUI.this.f210025j.fullScroll(33);
                }
            }
        }

        public C72262d() {
        }

        public void onVisibleStateChange(boolean z) {
            Log.m105919d("Micromsg.WalletCheckPwdUI", "kb visibility: %s", Boolean.valueOf(z));
            WalletCheckPwdUI.this.f210025j.post(new C72263a(z));
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI$e */
    public class C72264e implements Runnable {
        public C72264e() {
        }

        public void run() {
            WalletCheckPwdUI.this.hideTenpayKB();
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI$f */
    public class C72265f implements C79148e.C79149a {
        public C72265f() {
        }

        public Intent onProcessEnd(int i, Bundle bundle) {
            Log.m105925i("Micromsg.WalletCheckPwdUI", "verify code end: %s", Integer.valueOf(i));
            Intent intent = new Intent();
            intent.putExtra(XWalkReaderBasePlugin.PARAM_KEY_TOKEN, bundle.getString("key_jsapi_token"));
            intent.putExtra("key_process_result_code", i);
            intent.setClass(WalletCheckPwdUI.this.getContext(), WalletCheckPwdUI.class);
            intent.addFlags(536870912);
            intent.putExtra("key_process_is_stay", false);
            return intent;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI$g */
    public class C72266g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ OpenFingerPrintAuthEvent f210047d;

        public C72266g(OpenFingerPrintAuthEvent openFingerPrintAuthEvent) {
            this.f210047d = openFingerPrintAuthEvent;
        }

        public void run() {
            Log.m105924i("Micromsg.WalletCheckPwdUI", "hy: FingerPrintAuthEvent callback");
            OpenFingerPrintAuthEvent.C67749b bVar = this.f210047d.f193785e;
            if (bVar == null) {
                Log.m105924i("Micromsg.WalletCheckPwdUI", "hy: FingerPrintAuthEvent callback, result == null");
                return;
            }
            int i = bVar.f193789a;
            Log.m105927v("Micromsg.WalletCheckPwdUI", "alvinluo errCode: %d, errMsg: %s", Integer.valueOf(i), bVar.f193790b);
            if (i == 0) {
                Log.m105925i("Micromsg.WalletCheckPwdUI", "hy: payInfo soterAuthReq: %s", bVar.f193794f);
                WalletCheckPwdUI.this.f210021f.setVisibility(8);
                WalletCheckPwdUI walletCheckPwdUI = WalletCheckPwdUI.this;
                String str = bVar.f193794f;
                walletCheckPwdUI.getClass();
                Log.m105924i("Micromsg.WalletCheckPwdUI", "do check pwd by fp");
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    jSONObject.put("soter_type", "1");
                    str = jSONObject.toString();
                } catch (Exception e) {
                    Log.printErrStackTrace("Micromsg.WalletCheckPwdUI", e, "", new Object[0]);
                }
                walletCheckPwdUI.doSceneProgress(new C78357y(walletCheckPwdUI.f210028p, 1, str), true);
                C115669n.INSTANCE.mo160131h(15021, 2);
                C77290d.m93108f(0);
                return;
            }
            Log.m105924i("Micromsg.WalletCheckPwdUI", "hy: FingerPrintAuthEvent callback, encrypted_pay_info & encrypted_rsa_sign is empty, idetify fail!");
            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            WalletCheckPwdUI walletCheckPwdUI2 = WalletCheckPwdUI.this;
            int i2 = currentTimeMillis - walletCheckPwdUI2.f210032t;
            if (i2 > 1) {
                walletCheckPwdUI2.f210032t = currentTimeMillis;
                walletCheckPwdUI2.f210031s++;
            }
            boolean z = i == 2 || i == 10308;
            boolean z2 = bVar.f193795g == 2;
            Log.m105927v("Micromsg.WalletCheckPwdUI", "alvinluo shouldDirectlyFail: %b, mIdentifyFail: %d, errCode: %d, isSoter: %b", Boolean.valueOf(z), Integer.valueOf(WalletCheckPwdUI.this.f210031s), Integer.valueOf(i), Boolean.valueOf(z2));
            if ((z2 || (WalletCheckPwdUI.this.f210031s < 3 && i2 > 1)) && !z) {
                Log.m105926v("Micromsg.WalletCheckPwdUI", "alvinluo fingerprint pay");
                WalletCheckPwdUI walletCheckPwdUI3 = WalletCheckPwdUI.this;
                if (walletCheckPwdUI3.f210037y == null) {
                    walletCheckPwdUI3.f210037y = C79335b.m96035a(walletCheckPwdUI3.getContext());
                }
                WalletCheckPwdUI.this.f210021f.setVisibility(0);
                WalletCheckPwdUI walletCheckPwdUI4 = WalletCheckPwdUI.this;
                walletCheckPwdUI4.f210021f.startAnimation(walletCheckPwdUI4.f210037y);
                WalletCheckPwdUI.this.f210037y.setFillAfter(true);
                C77290d.m93108f(1);
            } else if (WalletCheckPwdUI.this.f210031s >= 3 || z) {
                Log.m105926v("Micromsg.WalletCheckPwdUI", "alvinluo change to pwd pay");
                WalletCheckPwdUI.this.mo99568H7();
                WalletCheckPwdUI walletCheckPwdUI5 = WalletCheckPwdUI.this;
                walletCheckPwdUI5.f210030r = 0;
                walletCheckPwdUI5.mo99573M7();
                WalletCheckPwdUI.this.f210024i.setVisibility(8);
                C77290d.m93108f(2);
            }
        }
    }

    /* renamed from: H7 */
    public final void mo99568H7() {
        Log.m105924i("Micromsg.WalletCheckPwdUI", "hy: send release FPManager");
        new ReleaseFingerPrintAuthEvent().publish();
    }

    /* renamed from: I7 */
    public final void mo99569I7() {
        this.f210033u = true;
        C77290d.m93104b();
        OpenFingerPrintAuthEvent openFingerPrintAuthEvent = new OpenFingerPrintAuthEvent();
        OpenFingerPrintAuthEvent.C67748a aVar = openFingerPrintAuthEvent.f193784d;
        aVar.f193786a = this.f210034v;
        aVar.f193787b = 1;
        aVar.f193788c = new C72266g(openFingerPrintAuthEvent);
        openFingerPrintAuthEvent.asyncPublish(Looper.getMainLooper());
    }

    /* renamed from: J7 */
    public final void mo99570J7(int i) {
        if (getIntent().getBooleanExtra("from_kinda", false)) {
            WalletEndResultEvent walletEndResultEvent = new WalletEndResultEvent();
            walletEndResultEvent.f194034d.f194035a = i;
            walletEndResultEvent.publish();
        }
    }

    /* renamed from: K7 */
    public final void mo99571K7() {
        C79148e process = getProcess();
        if (process != null) {
            this.f210035w = getString(C0966R.string.f361555kr3);
            if ("UnbindProcess".equals(process.mo91258e())) {
                String string = process.f232423c.getString("key_check_pwd_title");
                if (!Util.isNullOrNil(string)) {
                    this.f210022g.setText(string);
                } else {
                    this.f210022g.setText(C0966R.string.kui);
                }
                this.f210023h.setText(this.f210035w);
            } else if (process instanceof C77866b) {
                this.f210022g.setText(C0966R.string.f361561ku0);
                this.f210023h.setText(this.f210035w);
            } else if ("ModifyPwdProcess".equals(process.mo91258e())) {
                this.f210022g.setText(C0966R.string.kzj);
                this.f210023h.setText(this.f210035w);
            } else if ("OfflineProcess".equals(process.mo91258e())) {
                this.f210022g.setText(C0966R.string.f361554kr2);
                this.f210023h.setText(this.f210035w);
            }
        }
    }

    /* renamed from: L7 */
    public final void mo99572L7(C64607oc3 oc32) {
        if (oc32 != null && !Util.isNullOrNil(oc32.f184658d)) {
            this.f210022g.setText(oc32.f184658d);
        }
        if (oc32 != null && !Util.isNullOrNil(oc32.f184659e)) {
            this.f210023h.setText(oc32.f184659e);
        }
        mo99571K7();
    }

    /* renamed from: M7 */
    public final void mo99573M7() {
        Log.m105925i("Micromsg.WalletCheckPwdUI", "change mode: %s", Integer.valueOf(this.f210030r));
        if (this.f210030r == 1) {
            this.f210020e.setVisibility(0);
            this.f210019d.setVisibility(8);
            this.f210024i.setText(C0966R.string.kqu);
            this.f210020e.postDelayed(new C72264e(), 300);
            if (!Util.isNullOrNil(this.f210036x)) {
                this.f210023h.setText(this.f210036x);
            } else {
                this.f210023h.setText(C0966R.string.kqy);
            }
        } else {
            this.f210020e.setVisibility(8);
            this.f210019d.mo105043a();
            this.f210019d.setVisibility(0);
            this.f210024i.setText(C0966R.string.kqt);
            showTenpayKB();
            if (!Util.isNullOrNil(this.f210035w)) {
                this.f210023h.setText(this.f210035w);
            } else {
                this.f210023h.setText(C0966R.string.f361555kr3);
            }
        }
    }

    public void cleanUiData(int i) {
        EditHintPasswdView editHintPasswdView = this.f210019d;
        if (editHintPasswdView != null) {
            editHintPasswdView.mo105043a();
        }
    }

    public void finish() {
        super.finish();
        if (this.f210018A == 0) {
            overridePendingTransition(0, C0966R.C0968anim.f2493eh);
        }
    }

    public void forceCancel() {
        Log.m105918d("Micromsg.WalletCheckPwdUI", "check pwd ");
        cleanScenes();
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cec;
    }

    public void initView() {
        EditHintPasswdView editHintPasswdView = (EditHintPasswdView) findViewById(C0966R.C0970id.f7k);
        this.f210019d = editHintPasswdView;
        C76024a.m91321b(editHintPasswdView);
        this.f210019d.setOnInputValidListener(new C72260b());
        this.f210025j = (ScrollView) findViewById(C0966R.C0970id.ll_);
        this.f210020e = (LinearLayout) findViewById(C0966R.C0970id.e9a);
        ImageView imageView = (ImageView) findViewById(C0966R.C0970id.e9_);
        this.f210022g = (TextView) findViewById(C0966R.C0970id.lja);
        this.f210023h = (TextView) findViewById(C0966R.C0970id.lj6);
        this.f210021f = (TextView) findViewById(C0966R.C0970id.e9d);
        TextView textView = (TextView) findViewById(C0966R.C0970id.ll7);
        this.f210024i = textView;
        textView.setOnClickListener(new C72261c());
        C75228t.m90240d(this.f210022g);
        setTenpayKBStateListener(new C72262d());
        hideKeyboardPushDownBtn();
        setEditFocusListener(this.f210019d, 0, false);
        showTenpayKB();
    }

    public boolean isTransparent() {
        return false;
    }

    public boolean needConfirmFinish() {
        return getInput().getInt("key_pay_flag", 0) != 0;
    }

    /* JADX WARNING: type inference failed for: r15v10, types: [ob0.y] */
    /* JADX WARNING: type inference failed for: r3v6, types: [v53.e] */
    /* JADX WARNING: type inference failed for: r3v7, types: [v53.d] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r15) {
        /*
            r14 = this;
            super.onCreate(r15)
            androidx.appcompat.app.AppCompatActivity r15 = r14.getContext()
            android.content.res.Resources r15 = r15.getResources()
            r0 = 2131101833(0x7f060889, float:1.7816087E38)
            int r15 = r15.getColor(r0)
            r14.setActionbarColor(r15)
            r14.hideActionbarLine()
            java.lang.String r15 = ""
            r14.setMMTitle((java.lang.String) r15)
            android.content.Intent r15 = r14.getIntent()
            java.lang.String r0 = "key_anim_type"
            r1 = 0
            int r0 = r15.getIntExtra(r0, r1)
            r14.f210018A = r0
            if (r0 != 0) goto L_0x0033
            r0 = 2130772171(0x7f0100cb, float:1.7147453E38)
            r14.overridePendingTransition(r0, r1)
            goto L_0x0039
        L_0x0033:
            r0 = 2130772182(0x7f0100d6, float:1.7147475E38)
            r14.overridePendingTransition(r0, r1)
        L_0x0039:
            android.content.Intent r0 = r14.getIntent()
            java.lang.String r2 = "scene"
            boolean r0 = r0.hasExtra(r2)
            r3 = -1
            r4 = 1
            if (r0 == 0) goto L_0x004c
            int r3 = r15.getIntExtra(r2, r3)
            goto L_0x006b
        L_0x004c:
            yq3.e r15 = yq3.C79143a.m95768g(r14)
            if (r15 == 0) goto L_0x006b
            android.os.Bundle r0 = r15.f232423c
            int r3 = r0.getInt(r2, r3)
            if (r3 != r4) goto L_0x0068
            java.lang.String r15 = r15.mo91258e()
            java.lang.String r0 = "UnbindProcess"
            boolean r15 = r0.equals(r15)
            if (r15 == 0) goto L_0x0068
            r15 = 1
            goto L_0x0069
        L_0x0068:
            r15 = 0
        L_0x0069:
            r14.f210027o = r15
        L_0x006b:
            if (r3 != r4) goto L_0x011f
            r14.f210026n = r4
            java.lang.String r15 = "Micromsg.WalletCheckPwdUI"
            java.lang.String r0 = "check pwd jsapi"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r15, r0)
            r0 = 4
            r14.setContentViewVisibility(r0)
            boolean r0 = r14.f210027o
            if (r0 == 0) goto L_0x009a
            yq3.e r0 = yq3.C79143a.m95768g(r14)
            if (r0 == 0) goto L_0x0087
            android.os.Bundle r0 = r0.f232423c
            goto L_0x0088
        L_0x0087:
            r0 = 0
        L_0x0088:
            if (r0 != 0) goto L_0x00b7
            java.lang.String r0 = "func[doCheckPayNetscene] process.getContextData null"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r15, r0)
            r14.setResult(r4)
            r14.mo99570J7(r4)
            r14.finish()
            goto L_0x0122
        L_0x009a:
            android.content.Intent r0 = r14.getIntent()
            if (r0 != 0) goto L_0x00af
            java.lang.String r0 = "func[doCheckPayNetscene] intent null"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r15, r0)
            r14.setResult(r1)
            r14.mo99570J7(r1)
            r14.finish()
            goto L_0x0122
        L_0x00af:
            android.content.Intent r0 = r14.getIntent()
            android.os.Bundle r0 = r0.getExtras()
        L_0x00b7:
            java.lang.String r2 = "appId"
            java.lang.String r4 = r0.getString(r2)
            java.lang.String r2 = "timeStamp"
            java.lang.String r5 = r0.getString(r2)
            java.lang.String r2 = "nonceStr"
            java.lang.String r6 = r0.getString(r2)
            java.lang.String r2 = "packageExt"
            java.lang.String r7 = r0.getString(r2)
            java.lang.String r2 = "signtype"
            java.lang.String r8 = r0.getString(r2)
            java.lang.String r2 = "paySignature"
            java.lang.String r9 = r0.getString(r2)
            java.lang.String r2 = "url"
            java.lang.String r10 = r0.getString(r2)
            java.lang.String r2 = "pay_channel"
            int r13 = r0.getInt(r2, r1)
            boolean r0 = r14.f210027o
            if (r0 == 0) goto L_0x0111
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "appId is null? "
            r0.append(r1)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r0)
            v53.d r15 = new v53.d
            r11 = 10
            java.lang.String r12 = "verifyWCPayPassword"
            r3 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x011b
        L_0x0111:
            v53.e r15 = new v53.e
            r11 = 5
            java.lang.String r12 = "verifyWCPayPassword"
            r3 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
        L_0x011b:
            r14.doSceneForceProgress(r15)
            goto L_0x0122
        L_0x011f:
            r14.setContentViewVisibility(r1)
        L_0x0122:
            r14.initView()
            r14.mo99571K7()
            com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI$a r15 = new com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI$a
            r15.<init>()
            r0 = 2131755021(0x7f10000d, float:1.914091E38)
            r14.setBackBtn(r15, r0)
            boolean r15 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90212E()
            if (r15 == 0) goto L_0x0142
            android.view.Window r15 = r14.getWindow()
            r0 = 8192(0x2000, float:1.14794E-41)
            r15.addFlags(r0)
        L_0x0142:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wallet_core.p125ui.WalletCheckPwdUI.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f210033u) {
            mo99568H7();
        }
        removeSceneEndListener(580);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        View view = this.mKBLayout;
        if (view == null || !view.isShown()) {
            return super.onKeyUp(i, keyEvent);
        }
        View view2 = this.mKBLayout;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view3 = view2;
        C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/wallet_core/ui/WalletCheckPwdUI", "onKeyUp", "(ILandroid/view/KeyEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/wallet_core/ui/WalletCheckPwdUI", "onKeyUp", "(ILandroid/view/KeyEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return true;
    }

    public void onPause() {
        super.onPause();
        this.f210030r = 0;
        mo99573M7();
        mo99568H7();
        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_android_checkpwd_remove_listener_on_destroy, 1) != 0) {
            removeSceneEndListener(580);
        }
    }

    public void onResume() {
        EditHintPasswdView editHintPasswdView = this.f210019d;
        if (editHintPasswdView != null) {
            editHintPasswdView.mo105043a();
        }
        super.onResume();
        addSceneEndListener(580);
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C77761h0 h0Var = C77761h0.IML;
        Log.m105918d("Micromsg.WalletCheckPwdUI", " errCode: " + i2 + " errMsg :" + str);
        boolean z = false;
        if (i == 0 && i2 == 0) {
            if (yVar instanceof C78356x) {
                Bundle input = getInput();
                input.putString("key_pwd1", this.f210019d.getText());
                input.putString("key_bind_card_user_token", ((C78356x) yVar).f229615e);
                C79143a.m95765d(this, input);
                EditHintPasswdView editHintPasswdView = this.f210019d;
                if (editHintPasswdView != null) {
                    editHintPasswdView.mo105043a();
                }
                finish();
            } else if (yVar instanceof C78342e0) {
                C76879j.m92726T(this, getString(C0966R.string.kra));
                C79148e g = C79143a.m95768g(this);
                if (g != null) {
                    g.f232423c.putInt("key_process_result_code", -1);
                }
                C79143a.m95765d(this, g.f232423c);
                EditHintPasswdView editHintPasswdView2 = this.f210019d;
                if (editHintPasswdView2 != null) {
                    editHintPasswdView2.mo105043a();
                }
                finish();
            } else if (yVar instanceof C78339d) {
                C78339d dVar = (C78339d) yVar;
                C8883h.f28150a = dVar.mo108331j1();
                this.f210028p = ((C64592nu) dVar.f229547e.f127056b.f127083a).f184559f;
                setResult(-1);
                mo99572L7(((C64592nu) dVar.f229547e.f127056b.f127083a).f184560g);
                setContentViewVisibility(0);
            } else if (yVar instanceof C78341e) {
                C78341e eVar = (C78341e) yVar;
                C64501kv kvVar = eVar.f229552f;
                this.f210028p = kvVar.f183985f;
                String str2 = kvVar.f183987h;
                this.f210034v = str2;
                C8883h.f28150a = str2;
                C64607oc3 oc32 = kvVar.f183986g;
                if (oc32 != null) {
                    this.f210035w = oc32.f184659e;
                    this.f210036x = oc32.f184660f;
                }
                setResult(-1);
                mo99572L7(eVar.f229552f.f183986g);
                ci4 ci4 = eVar.f229552f.f183988i;
                if (!(ci4 == null || ci4.f182520e == null)) {
                    C78473a aVar = (C78473a) C86709a0.m107533q(C78473a.class);
                    if (ci4.f182519d == 1 && ci4.f182522g == 1 && aVar.iw0() && aVar.mo107921ys() && !aVar.mo107884d6()) {
                        Log.m105924i("Micromsg.WalletCheckPwdUI", "can use touch pay");
                        this.f210030r = 1;
                        C89349b bVar = ci4.f182520e;
                        if (bVar != null) {
                            h0Var.f226590d = bVar.mo123705h();
                        }
                        h0Var.f226592f = ci4.f182521f == 1;
                        mo99569I7();
                        this.f210024i.setVisibility(0);
                    }
                }
                mo99573M7();
                setContentViewVisibility(0);
                ((TextView) ((C5811n) component(C5811n.class)).getContext().findViewById(C0966R.C0970id.lj6)).sendAccessibilityEvent(128);
            } else if (yVar instanceof C78357y) {
                C78357y yVar2 = (C78357y) yVar;
                if (yVar2.f229618e == 0) {
                    z = true;
                }
                if (z) {
                    Log.m105924i("Micromsg.WalletCheckPwdUI", "need free sms");
                    Bundle bundle = new Bundle();
                    bundle.putString("key_pwd1", this.f210029q);
                    bundle.putString("key_jsapi_token", this.f210028p);
                    bundle.putString("key_relation_key", yVar2.f229620g);
                    bundle.putString("key_mobile", yVar2.f229619f);
                    C72265f fVar = new C72265f();
                    this.f210038z = fVar;
                    C79143a.m95771j(this, C72377f0.class, bundle, fVar);
                } else {
                    Intent intent = new Intent();
                    intent.putExtra(XWalkReaderBasePlugin.PARAM_KEY_TOKEN, yVar2.f229617d);
                    setResult(-1, intent);
                    mo99570J7(-1);
                    finish();
                }
            }
            return true;
        }
        EditHintPasswdView editHintPasswdView3 = this.f210019d;
        if (editHintPasswdView3 != null) {
            editHintPasswdView3.mo105043a();
        }
        if (!(yVar instanceof C78339d) && !(yVar instanceof C78341e)) {
            return false;
        }
        Log.m105924i("Micromsg.WalletCheckPwdUI", "check jsapi fail");
        C79148e g2 = C79143a.m95768g(this);
        if (g2 == null || !g2.mo91258e().equals("UnbindProcess")) {
            setResult(0);
            mo99570J7(0);
            finish();
        } else {
            setResult(1);
            g2.f232423c.putInt("key_process_result_code", 1);
            C79143a.m95765d(this, g2.f232423c);
        }
        return true;
    }

    public void setContentViewVisibility(int i) {
        View contentView = getContentView();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        View view = contentView;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/wallet_core/ui/WalletCheckPwdUI", "setContentViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        contentView.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/wallet_core/ui/WalletCheckPwdUI", "setContentViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C5811n.class);
    }
}
