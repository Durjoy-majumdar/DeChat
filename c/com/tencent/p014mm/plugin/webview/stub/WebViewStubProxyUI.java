package com.tencent.p014mm.plugin.webview.stub;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.text.TextUtils;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.events.ShowPhoneMenuEvent;
import com.tencent.p014mm.autogen.events.UpdateWeChatEvent;
import com.tencent.p014mm.p136ui.C85861e4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.C85927s;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.plugin.webview.model.C6039j;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewStubCallbackWrapper;
import com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.C44040v3;
import com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.MsgHandler;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44665r4;
import com.tencent.p014mm.storage.C44667s4;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import j83.C9286a;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C117747y;
import org.json.JSONException;
import org.json.JSONObject;
import p154fy.C87121j;
import p206nj.C11171e;
import p910lj.C76701a;
import qo3.C77398g;
import qo3.C89779i0;
import t83.C13841a;
import t83.C13851h1;
import wc3.C15132d0;

@C88989a(7)
@C85927s.C85929b
/* renamed from: com.tencent.mm.plugin.webview.stub.WebViewStubProxyUI */
public class WebViewStubProxyUI extends MMActivity {

    /* renamed from: s */
    public static final /* synthetic */ int f22424s = 0;

    /* renamed from: d */
    public boolean f22425d = false;

    /* renamed from: e */
    public C6107m f22426e = null;

    /* renamed from: f */
    public boolean f22427f = false;

    /* renamed from: g */
    public int f22428g;

    /* renamed from: h */
    public String f22429h = "";

    /* renamed from: i */
    public boolean f22430i = false;

    /* renamed from: j */
    public boolean f22431j = false;

    /* renamed from: n */
    public final C6107m f22432n = new C6093e();

    /* renamed from: o */
    public DialogInterface.OnDismissListener f22433o = new C6095f();

    /* renamed from: p */
    public int f22434p = 0;

    /* renamed from: q */
    public MTimerHandler f22435q = new MTimerHandler(new C6096g(), true);

    /* renamed from: r */
    public MTimerHandler f22436r = new MTimerHandler(new C6097h(), true);

    /* renamed from: com.tencent.mm.plugin.webview.stub.WebViewStubProxyUI$a */
    public class C6088a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ UpdateWeChatEvent f22437d;

        public C6088a(UpdateWeChatEvent updateWeChatEvent) {
            this.f22437d = updateWeChatEvent;
        }

        public void run() {
            this.f22437d.f9573e.getClass();
            WebViewStubProxyUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.stub.WebViewStubProxyUI$b */
    public class C6089b implements DialogInterface.OnClickListener {
        public C6089b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ((C67654r1) C9286a.f29044a).mo93172e(new Intent(), WebViewStubProxyUI.this);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.stub.WebViewStubProxyUI$c */
    public class C6090c implements DialogInterface.OnCancelListener {
        public C6090c() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            Log.m105924i("MicroMsg.WebViewStubProxyUI", "addshortcut, user cancel");
            WebViewStubProxyUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.stub.WebViewStubProxyUI$d */
    public class C6091d implements C6039j.C6043d {

        /* renamed from: a */
        public final /* synthetic */ C89779i0 f22441a;

        /* renamed from: com.tencent.mm.plugin.webview.stub.WebViewStubProxyUI$d$a */
        public class C6092a implements DialogInterface.OnClickListener {
            public C6092a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                WebViewStubProxyUI.this.finish();
            }
        }

        public C6091d(C89779i0 i0Var) {
            this.f22441a = i0Var;
        }

        /* renamed from: a */
        public void mo7002a(String str, boolean z) {
            C89779i0 i0Var = this.f22441a;
            if (i0Var != null) {
                i0Var.dismiss();
            }
            if (z) {
                if (WebViewStubProxyUI.this.f22426e != null) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("add_shortcut_status", true);
                    try {
                        WebViewStubProxyUI.this.f22426e.mo7031V5(54, bundle);
                    } catch (Exception e) {
                        Log.m105920e("MicroMsg.WebViewStubProxyUI", "notify add shortcut status failed: " + e.getMessage());
                    }
                }
                C76879j.m92744o(WebViewStubProxyUI.this, C0966R.string.llb, C0966R.string.a3h, false, new C6092a());
                return;
            }
            C76701a.makeText((Context) WebViewStubProxyUI.this.getContext(), (CharSequence) WebViewStubProxyUI.this.getContext().getString(C0966R.string.lla), 0).show();
            if (WebViewStubProxyUI.this.f22426e != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("add_shortcut_status", false);
                try {
                    WebViewStubProxyUI.this.f22426e.mo7031V5(54, bundle2);
                } catch (Exception e2) {
                    Log.m105920e("MicroMsg.WebViewStubProxyUI", "notify add shortcut status failed: " + e2.getMessage());
                }
            }
            WebViewStubProxyUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.stub.WebViewStubProxyUI$e */
    public class C6093e implements C6107m {

        /* renamed from: com.tencent.mm.plugin.webview.stub.WebViewStubProxyUI$e$a */
        public class C6094a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f22445d;

            /* renamed from: e */
            public final /* synthetic */ String f22446e;

            /* renamed from: f */
            public final /* synthetic */ Bundle f22447f;

            /* renamed from: g */
            public final /* synthetic */ boolean f22448g;

            public C6094a(String str, String str2, Bundle bundle, boolean z) {
                this.f22445d = str;
                this.f22446e = str2;
                this.f22447f = bundle;
                this.f22448g = z;
            }

            public void run() {
                C44040v3.m48330a(WebViewStubProxyUI.this.f22428g).mo7177S6((Context) null, (C6107m) null, (C6107m) null);
                WebViewStubProxyUI.this.finish();
                try {
                    WebViewStubProxyUI.this.f22426e.Zu0(this.f22445d, this.f22446e, this.f22447f, this.f22448g);
                } catch (Exception e) {
                    Log.m105928w("MicroMsg.callbackerWrapper", "wrapper onHandleEnd, ex = " + e.getMessage());
                }
            }
        }

        public C6093e() {
        }

        /* renamed from: B7 */
        public void mo7025B7(String str) {
            WebViewStubProxyUI.this.f22426e.mo7025B7(str);
        }

        public void Ef0() {
            WebViewStubProxyUI.this.f22426e.Ef0();
        }

        /* renamed from: F7 */
        public int mo7027F7() {
            return WebViewStubProxyUI.this.f22426e.mo7027F7();
        }

        /* renamed from: Gb */
        public void mo7028Gb(String str, String str2) {
            WebViewStubProxyUI.this.f22426e.mo7028Gb(str, str2);
        }

        /* renamed from: Ni */
        public String mo7029Ni() {
            return WebViewStubProxyUI.this.f22426e.mo7029Ni();
        }

        /* renamed from: US */
        public void mo7030US(String str, String str2, int i, int i2) {
        }

        /* renamed from: V5 */
        public Bundle mo7031V5(int i, Bundle bundle) {
            C6107m mVar = WebViewStubProxyUI.this.f22426e;
            if (mVar != null) {
                return mVar.mo7031V5(i, bundle);
            }
            Log.m105928w("MicroMsg.callbackerWrapper", "invokeAsResult callbacker is null");
            return new Bundle();
        }

        /* renamed from: XB */
        public void mo7032XB(int i, Bundle bundle) {
            WebViewStubProxyUI.this.f22426e.mo7032XB(i, bundle);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0024, code lost:
            if (r3[0].equals("startMonitoringBeacons") != false) goto L_0x0028;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean Zu0(java.lang.String r10, java.lang.String r11, android.os.Bundle r12, boolean r13) {
            /*
                r9 = this;
                java.lang.String r0 = "MicroMsg.callbackerWrapper"
                java.lang.String r1 = "onHandleEnd in callbackerWrapper"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
                com.tencent.mm.plugin.webview.stub.WebViewStubProxyUI r0 = com.tencent.p014mm.plugin.webview.stub.WebViewStubProxyUI.this
                r1 = 1
                r0.f22430i = r1
                r0.getClass()
                r2 = 0
                if (r11 == 0) goto L_0x0027
                java.lang.String r3 = ":"
                java.lang.String[] r3 = r11.split(r3)
                int r4 = r3.length
                if (r4 <= 0) goto L_0x0027
                r3 = r3[r2]
                java.lang.String r4 = "startMonitoringBeacons"
                boolean r3 = r3.equals(r4)
                if (r3 == 0) goto L_0x0027
                goto L_0x0028
            L_0x0027:
                r1 = 0
            L_0x0028:
                r0.f22425d = r1
                com.tencent.mm.plugin.webview.stub.WebViewStubProxyUI r0 = com.tencent.p014mm.plugin.webview.stub.WebViewStubProxyUI.this
                com.tencent.mm.plugin.webview.stub.WebViewStubProxyUI$e$a r1 = new com.tencent.mm.plugin.webview.stub.WebViewStubProxyUI$e$a
                r3 = r1
                r4 = r9
                r5 = r10
                r6 = r11
                r7 = r12
                r8 = r13
                r3.<init>(r5, r6, r7, r8)
                r0.runOnUiThread(r1)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.stub.WebViewStubProxyUI.C6093e.Zu0(java.lang.String, java.lang.String, android.os.Bundle, boolean):boolean");
        }

        public IBinder asBinder() {
            return null;
        }

        public boolean callback(int i, Bundle bundle) {
            WebViewStubProxyUI.this.f22426e.callback(i, bundle);
            return false;
        }

        /* renamed from: d */
        public void mo7036d(Bundle bundle) {
            WebViewStubProxyUI.this.f22426e.mo7036d(bundle);
        }

        /* renamed from: e3 */
        public String mo7037e3() {
            return WebViewStubProxyUI.this.f22426e.mo7037e3();
        }

        public boolean fq0(C43787d dVar) {
            WebViewStubProxyUI.this.f22426e.fq0(dVar);
            return false;
        }

        public String getCurrentUrl() {
            return WebViewStubProxyUI.this.f22426e.getCurrentUrl();
        }

        /* renamed from: hb */
        public boolean mo7040hb(int i) {
            WebViewStubProxyUI.this.f22426e.mo7040hb(i);
            return false;
        }

        /* renamed from: mC */
        public void mo7041mC(Bundle bundle) {
            WebViewStubProxyUI.this.f22426e.mo7041mC(bundle);
        }

        public Bundle q10(String str, String str2) {
            return WebViewStubProxyUI.this.f22426e.q10(str, str2);
        }

        /* renamed from: uP */
        public void mo7043uP() {
            C6107m mVar = WebViewStubProxyUI.this.f22426e;
            if (mVar != null) {
                mVar.mo7043uP();
            }
        }

        /* renamed from: xf */
        public void mo7044xf(boolean z) {
            WebViewStubProxyUI.this.f22426e.mo7044xf(z);
        }

        /* renamed from: xx */
        public void mo7045xx(String str, String str2) {
            WebViewStubProxyUI.this.f22426e.mo7045xx(str, str2);
        }

        public String ya0() {
            return WebViewStubProxyUI.this.f22426e.ya0();
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.stub.WebViewStubProxyUI$f */
    public class C6095f implements DialogInterface.OnDismissListener {
        public C6095f() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            if (!WebViewStubProxyUI.this.isFinishing()) {
                WebViewStubProxyUI.this.finish();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.stub.WebViewStubProxyUI$g */
    public class C6096g implements MTimerHandler.CallBack {
        public C6096g() {
        }

        public boolean onTimerExpired() {
            if (WebViewStubProxyUI.this.getWindow() == null || WebViewStubProxyUI.this.getWindow().getDecorView() == null || WebViewStubProxyUI.this.getWindow().getDecorView().getWindowToken() == null) {
                WebViewStubProxyUI webViewStubProxyUI = WebViewStubProxyUI.this;
                int i = webViewStubProxyUI.f22434p;
                if (i < 10) {
                    webViewStubProxyUI.f22434p = i + 1;
                    return true;
                }
                Log.m105920e("MicroMsg.WebViewStubProxyUI", "timer reach max retry time, finish ProxyUI");
                WebViewStubProxyUI.this.finish();
                return false;
            }
            WebViewStubProxyUI webViewStubProxyUI2 = WebViewStubProxyUI.this;
            int i2 = WebViewStubProxyUI.f22424s;
            Intent intent = webViewStubProxyUI2.getIntent();
            int intExtra = intent.getIntExtra("proxyui_action_code_key", 0);
            Log.m105924i("MicroMsg.WebViewStubProxyUI", "onCreate, dealAfterWindowTokenInited = " + intExtra);
            if (intExtra == 1) {
                C13851h1 h1Var = new C13851h1();
                h1Var.f38989b = intent.getStringExtra("proxyui_type_key");
                h1Var.f38996i = intent.getStringExtra("proxyui_function_key");
                h1Var.f38990c = intent.getStringExtra("proxyui_callback_key");
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    Log.m105920e("MicroMsg.WebViewStubProxyUI", "getExtras from intent, returned NULL");
                    extras = Bundle.EMPTY;
                }
                h1Var.f38983a = C13841a.m13131a(extras.getBundle("compatParams"));
                h1Var.f38992e = extras.getBundle("jsEngine");
                try {
                    String string = extras.getString("rawParams");
                    if (!TextUtils.isEmpty(string)) {
                        h1Var.f38991d = new JSONObject(string);
                    }
                } catch (JSONException e) {
                    Log.m105921e("MicroMsg.WebViewStubProxyUI", "get rawParams, e = %s", e);
                }
                JsapiPermissionWrapper jsapiPermissionWrapper = (JsapiPermissionWrapper) intent.getExtras().getParcelable("proxyui_perm_key");
                if (jsapiPermissionWrapper == null) {
                    jsapiPermissionWrapper = new JsapiPermissionWrapper(2);
                }
                MsgHandler a = C44040v3.m48330a(webViewStubProxyUI2.f22428g);
                a.mo7152F6(false);
                a.mo7177S6(webViewStubProxyUI2, webViewStubProxyUI2.f22432n, webViewStubProxyUI2.f22426e);
                if (!a.mo7240z6(h1Var, jsapiPermissionWrapper)) {
                    try {
                        ((C6093e) webViewStubProxyUI2.f22432n).Zu0((String) null, (String) null, (Bundle) null, true);
                    } catch (Exception e2) {
                        Log.m105928w("MicroMsg.WebViewStubProxyUI", "onHandleEnd, ex = " + e2.getMessage());
                    }
                }
            } else if (intExtra != 4) {
                Log.m105920e("MicroMsg.WebViewStubProxyUI", "dealAfterWindowTokenInited unknown actionCode = " + intExtra);
                webViewStubProxyUI2.finish();
            } else {
                JsapiPermissionWrapper jsapiPermissionWrapper2 = (JsapiPermissionWrapper) intent.getExtras().getParcelable("proxyui_perm_key");
                if (jsapiPermissionWrapper2 == null) {
                    jsapiPermissionWrapper2 = new JsapiPermissionWrapper(2);
                }
                C44040v3.m48330a(webViewStubProxyUI2.f22428g).mo7175R6(webViewStubProxyUI2, webViewStubProxyUI2.f22432n);
                if (!C44040v3.m48330a(webViewStubProxyUI2.f22428g).mo7170P5(intent.getStringExtra("proxyui_username_key"), jsapiPermissionWrapper2)) {
                    Log.m105928w("MicroMsg.WebViewStubProxyUI", "doProfile fail, finish");
                    webViewStubProxyUI2.finish();
                }
            }
            WebViewStubProxyUI.this.f22427f = true;
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.stub.WebViewStubProxyUI$h */
    public class C6097h implements MTimerHandler.CallBack {
        public C6097h() {
        }

        public boolean onTimerExpired() {
            if (WebViewStubProxyUI.this.isFinishing()) {
                return false;
            }
            WebViewStubProxyUI.this.finish();
            return false;
        }
    }

    public int getForceOrientation() {
        return getIntent().getIntExtra("screen_orientation", -1);
    }

    public int getLayoutId() {
        return -1;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (C11171e.m11046c(21)) {
            getWindow().setStatusBarColor(0);
        }
        setNavigationbarColor(getResources().getColor(C0966R.color.ahf));
        if (getIntent().getIntExtra("proxyui_darkmode_key", 0) == 1) {
            updataStatusBarIcon(true);
        }
        WebViewStubCallbackWrapper webViewStubCallbackWrapper = (WebViewStubCallbackWrapper) getIntent().getParcelableExtra("webview_stub_callbacker_key");
        if (webViewStubCallbackWrapper != null) {
            this.f22426e = webViewStubCallbackWrapper.f118438d;
        }
        Intent intent = getIntent();
        int intExtra = intent.getIntExtra("proxyui_action_code_key", 0);
        this.f22428g = intent.getIntExtra("webview_binder_id", 0);
        this.f22429h = intent.getStringExtra("proxyui_function_key");
        Log.m105925i("MicroMsg.WebViewStubProxyUI", "onCreate, actionCode = %d, binderID = %d, functionName=%s", Integer.valueOf(intExtra), Integer.valueOf(this.f22428g), this.f22429h);
        if ("startMonitoringBeacons".equals(this.f22429h)) {
            this.f22425d = true;
        }
        switch (intExtra) {
            case 1:
                if (C85875k4.m106199o0()) {
                    this.f22431j = true;
                    C85861e4.m106118e("com.tencent.mm.ui.transmit.SelectConversationUI", 0);
                    C85861e4.m106118e("com.tencent.mm.ui.chatting.ChattingUI", 0);
                }
                if (!this.f22427f) {
                    this.f22435q.startTimer(100);
                }
                if (this.f22425d) {
                    this.f22436r.startTimer(FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
                    return;
                }
                return;
            case 2:
                UpdateWeChatEvent updateWeChatEvent = new UpdateWeChatEvent();
                updateWeChatEvent.callback = new C6088a(updateWeChatEvent);
                UpdateWeChatEvent.C1155a aVar = updateWeChatEvent.f9572d;
                aVar.f9574a = this;
                aVar.f9575b = intent.getIntExtra("update_type_key", 0);
                if (updateWeChatEvent.f9572d.f9575b <= 0) {
                    Log.m105920e("MicroMsg.WebViewStubProxyUI", "doUpdate fail, invalid type = " + updateWeChatEvent.f9572d.f9575b);
                    finish();
                    return;
                }
                updateWeChatEvent.asyncPublish(Looper.myLooper());
                return;
            case 3:
                C44665r4 jo = ((C44667s4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).V50()).mo69821jo("@t.qq.com");
                C77398g gVar = null;
                if (!C75592q0.m90790t()) {
                    gVar = C76879j.m92743n(this, C0966R.string.f360298bo2, C0966R.string.a3h, new C6089b(), (DialogInterface.OnClickListener) null);
                } else if (jo == null || Util.isNullOrNil(jo.f121095b)) {
                    gVar = C76879j.m92738i(this, C0966R.string.j16, C0966R.string.a3h);
                } else {
                    String nullAsNil = Util.nullAsNil(getIntent().getStringExtra("shortUrl"));
                    C86709a0.m107524d().mo123460f((C117747y) ((C87121j) C86312j.m106911c(C87121j.class)).J20(getIntent().getIntExtra("type", 0), nullAsNil));
                    try {
                        this.f22426e.mo7040hb(0);
                    } catch (Exception e) {
                        Log.m105928w("MicroMsg.WebViewStubProxyUI", "setTitlePbVisibility, ex = " + e.getMessage());
                    }
                }
                if (gVar == null) {
                    finish();
                    return;
                } else {
                    gVar.setOnDismissListener(this.f22433o);
                    return;
                }
            case 4:
                this.f22435q.startTimer(100);
                return;
            case 5:
                ((C15132d0) C86312j.m106911c(C15132d0.class)).mo14083hX(this, intent.getStringExtra("proxyui_handle_event_url"), this.f22433o);
                return;
            case 6:
                int intExtra2 = getIntent().getIntExtra("proxyui_expired_errtype", 0);
                int intExtra3 = getIntent().getIntExtra("proxyui_expired_errcode", 0);
                if (intExtra2 == 0 && intExtra3 == 0) {
                    Log.m105920e("MicroMsg.WebViewStubProxyUI", "PROXY_AC_VALUE_ACCOUNT_EXPIRED, errType & errCode should not both be 0");
                    return;
                }
                return;
            case 8:
                String stringExtra = getIntent().getStringExtra("proxyui_phone");
                if (Util.isNullOrNil(stringExtra)) {
                    Log.m105920e("MicroMsg.WebViewStubProxyUI", "show phone span dialog, phone is empty");
                    finish();
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putInt("fromScene", 3);
                ShowPhoneMenuEvent showPhoneMenuEvent = new ShowPhoneMenuEvent();
                ShowPhoneMenuEvent.C1136a aVar2 = showPhoneMenuEvent.f9506d;
                aVar2.f9507a = this;
                aVar2.f9508b = stringExtra;
                aVar2.f9509c = this.f22433o;
                aVar2.f9510d = bundle2;
                showPhoneMenuEvent.publish();
                return;
            case 9:
                Intent intent2 = (Intent) getIntent().getExtras().getParcelable("proxyui_next_intent_key");
                intent2.setFlags(603979776);
                Intent intent3 = new Intent();
                intent3.setClassName(this, "com.tencent.mm.plugin.account.ui.SimpleLoginUI");
                MMWizardActivity.m7018M7(this, intent3, intent2);
                finish();
                return;
            case 10:
                String stringExtra2 = getIntent().getStringExtra("KAppId");
                String stringExtra3 = getIntent().getStringExtra("shortcut_user_name");
                if (!Util.isNullOrNil(stringExtra2) && !Util.isNullOrNil(stringExtra3)) {
                    C89779i0 Q = C76879j.m92723Q(this, getString(C0966R.string.a3h), getString(C0966R.string.a4d), true, true, new C6090c());
                    Q.show();
                    C6039j.m5919a(MMApplicationContext.getContext(), stringExtra3, stringExtra2, new C6091d(Q));
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void onDestroy() {
        super.onDestroy();
        if (C85875k4.m106199o0() && this.f22431j) {
            C85861e4.m106123j("com.tencent.mm.ui.transmit.SelectConversationUI", 0);
            C85861e4.m106123j("com.tencent.mm.ui.chatting.ChattingUI", 0);
        }
        if (!this.f22430i) {
            MsgHandler a = C44040v3.m48330a(this.f22428g);
            Context context = MMApplicationContext.getContext();
            C6107m mVar = this.f22426e;
            a.mo7177S6(context, mVar, mVar);
        }
        C44040v3.m48330a(this.f22428g).mo7202f6();
        if (!this.f22425d) {
            this.f22426e = null;
        }
        MsgHandler a2 = C44040v3.m48330a(this.f22428g);
        ProgressDialog progressDialog = a2.f22700g;
        if (progressDialog != null) {
            progressDialog.dismiss();
            a2.f22700g = null;
        }
        if (!this.f22430i && Util.isEqual(C44040v3.m48330a(this.f22428g).f22713v, this.f22429h)) {
            C44040v3.m48330a(this.f22428g).mo7179T6(false, this.f22429h);
            Log.m105928w("MicroMsg.WebViewStubProxyUI", "onDestroy setIsBusy false");
        }
        Log.m105924i("MicroMsg.WebViewStubProxyUI", "onDestroy proxyui");
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (!(i == 72 || i == 113)) {
            switch (i) {
                case 115:
                case 116:
                case 117:
                case 118:
                case 119:
                case 120:
                    break;
                default:
                    switch (i) {
                        case 149:
                        case 150:
                        case 151:
                        case 152:
                            break;
                        default:
                            return;
                    }
            }
        }
        if (iArr.length <= 0 || iArr[0] != 0) {
            C44040v3.m48330a(this.f22428g).mmOnActivityResult(i, 0, (Intent) null);
        } else {
            C44040v3.m48330a(this.f22428g).mmOnActivityResult(i, -1, (Intent) null);
        }
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        Log.m105925i("MicroMsg.WebViewStubProxyUI", "onRestoreInstanceState binderID = %d", Integer.valueOf(this.f22428g));
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Log.m105925i("MicroMsg.WebViewStubProxyUI", "onSaveInstanceState binderID = %d", Integer.valueOf(this.f22428g));
    }
}
