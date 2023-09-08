package com.tencent.p014mm.plugin.account.p024ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.events.LoginDisasterEvent;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.applet.SecurityImage;
import com.tencent.p014mm.p136ui.base.MMClearEditText;
import com.tencent.p014mm.p136ui.base.MMFormInputView;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.InputPanelLinearLayout;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.secdata.p843ui.MMSecDataActivity;
import com.tencent.p014mm.pluginsdk.model.C44595p1;
import com.tencent.p014mm.pluginsdk.model.app.C85606b2;
import com.tencent.p014mm.protocal.GeneralControlWrapper;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import di3.C86312j;
import eb0.C7624i3;
import f40.C86709a0;
import f40.C86718e;
import h81.C32735h;
import j20.C117292a;
import java.util.HashSet;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import lg3.C88504k;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C11385n;
import p206nj.C11171e;
import p214om.C11502f;
import qe3.C89625d;
import qn3.C77382c;
import qo3.C77407n;
import s00.C90110f;
import sf0.C77687b;
import sf0.C90186h0;
import tc2.C118418g;
import wg0.C78595a;
import xb2.C118866a;

@C88989a(1)
/* renamed from: com.tencent.mm.plugin.account.ui.LoginUI */
public class LoginUI extends MMSecDataActivity implements C11385n {

    /* renamed from: K */
    public static final /* synthetic */ int f344598K = 0;

    /* renamed from: A */
    public C77687b f344599A;

    /* renamed from: B */
    public String f344600B;

    /* renamed from: C */
    public boolean f344601C;

    /* renamed from: D */
    public Boolean f344602D = Boolean.FALSE;

    /* renamed from: E */
    public TextWatcher f344603E = new LoginUI$$l(this);

    /* renamed from: F */
    public boolean f344604F = false;

    /* renamed from: G */
    public IListener f344605G = new IListener<LoginDisasterEvent>(this, C40008f.f107254d) {
        {
            this.__eventId = -1399051904;
        }

        public boolean callback(IEvent iEvent) {
            LoginDisasterEvent.C114679a aVar;
            LoginDisasterEvent loginDisasterEvent = (LoginDisasterEvent) iEvent;
            if (loginDisasterEvent == null || (aVar = loginDisasterEvent.f343570d) == null) {
                return false;
            }
            Log.m105925i("MicroMsg.LoginUI", "summerdiz loginDisasterListener callback content[%s], url[%s]", aVar.f343571a, aVar.f343572b);
            Intent intent = new Intent();
            intent.putExtra("key_disaster_content", loginDisasterEvent.f343570d.f343571a);
            intent.putExtra("key_disaster_url", loginDisasterEvent.f343570d.f343572b);
            intent.setClass(MMApplicationContext.getContext(), DisasterUI.class).addFlags(268435456);
            Context context = MMApplicationContext.getContext();
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(intent);
            Context context2 = context;
            C117292a.m165358d(context2, aVar2.mo10232b(), "com/tencent/mm/plugin/account/ui/LoginUI$2", "callback", "(Lcom/tencent/mm/autogen/events/LoginDisasterEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/plugin/account/ui/LoginUI$2", "callback", "(Lcom/tencent/mm/autogen/events/LoginDisasterEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
    };

    /* renamed from: H */
    public final boolean[] f344606H = {true};

    /* renamed from: I */
    public String f344607I = "";

    /* renamed from: J */
    public C90186h0 f344608J = new C90186h0();

    /* renamed from: d */
    public MMClearEditText f344609d;

    /* renamed from: e */
    public MMClearEditText f344610e;

    /* renamed from: f */
    public MMFormInputView f344611f;

    /* renamed from: g */
    public MMFormInputView f344612g;

    /* renamed from: h */
    public ProgressDialog f344613h = null;

    /* renamed from: i */
    public String f344614i;

    /* renamed from: j */
    public String f344615j;

    /* renamed from: n */
    public String f344616n;

    /* renamed from: o */
    public SecurityImage f344617o = null;

    /* renamed from: p */
    public C115135m0 f344618p = new C115135m0();

    /* renamed from: q */
    public String f344619q = "";

    /* renamed from: r */
    public int f344620r = 0;

    /* renamed from: s */
    public String f344621s;

    /* renamed from: t */
    public Button f344622t;

    /* renamed from: u */
    public Button f344623u;

    /* renamed from: v */
    public Button f344624v;

    /* renamed from: w */
    public Button f344625w;

    /* renamed from: x */
    public Button f344626x;

    /* renamed from: y */
    public View f344627y;

    /* renamed from: z */
    public Button f344628z;

    /* renamed from: H7 */
    public static void m161846H7(LoginUI loginUI) {
        loginUI.getClass();
        C86709a0.m107528h().mo121099j("");
        Intent intent = new Intent();
        intent.putExtra("Intro_Switch", true).addFlags(67108864);
        loginUI.finish();
        ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93183p(intent, loginUI);
    }

    /* renamed from: I7 */
    public static void m161847I7(LoginUI loginUI) {
        String string = loginUI.getString(C0966R.string.lit);
        m161848L7(loginUI, string + LocaleUtil.getApplicationLanguage());
    }

    /* renamed from: L7 */
    public static void m161848L7(Context context, String str) {
        Intent intent = new Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", false);
        intent.putExtra("show_bottom", false);
        intent.putExtra("needRedirect", false);
        intent.putExtra("neverGetA8Key", true);
        intent.putExtra("hardcode_jspermission", JsapiPermissionWrapper.f121047h);
        intent.putExtra("hardcode_general_ctrl", GeneralControlWrapper.f121044e);
        C88144b.m109791i(context, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, (Bundle) null);
    }

    /* renamed from: J7 */
    public final void mo174670J7() {
        this.f344618p.f345162b = this.f344609d.getText().toString().trim();
        this.f344618p.f345163c = this.f344610e.getText().toString();
        if (this.f344618p.f345162b.equals("")) {
            C76879j.m92738i(this, C0966R.string.k_7, C0966R.string.gcw);
        } else if (this.f344618p.f345163c.equals("")) {
            C76879j.m92738i(this, C0966R.string.k9z, C0966R.string.gcw);
        } else {
            hideVKB();
            this.f344608J.mo124429a(this, new LoginUI$$p(this));
        }
    }

    /* renamed from: K7 */
    public final void mo174671K7() {
        Intent intent = new Intent(this, MobileInputUI.class);
        int[] iArr = new int[5];
        iArr[0] = 2;
        intent.putExtra("mobile_input_purpose", 1);
        intent.putExtra("kv_report_login_method_data", iArr);
        intent.putExtra("from_switch_account", this.f344601C);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/LoginUI", "jumpToMobileInputUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(this, "com/tencent/mm/plugin/account/ui/LoginUI", "jumpToMobileInputUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        finish();
    }

    public void finish() {
        super.finish();
        overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2333y);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b89;
    }

    public void initView() {
        this.f344611f = (MMFormInputView) findViewById(C0966R.C0970id.g5g);
        TextView textView = (TextView) findViewById(C0966R.C0970id.g6h);
        if (WeChatBrands.AppInfo.current().isMainland()) {
            this.f344611f.setHint((int) C0966R.string.gbt);
            textView.setText(C0966R.string.gce);
        } else {
            this.f344611f.setHint((int) C0966R.string.gbu);
            textView.setText(C0966R.string.gcf);
        }
        this.f344612g = (MMFormInputView) findViewById(C0966R.C0970id.g6b);
        InputPanelLinearLayout inputPanelLinearLayout = (InputPanelLinearLayout) findViewById(C0966R.C0970id.fft);
        if (inputPanelLinearLayout != null) {
            inputPanelLinearLayout.mo104200a(new LoginUI$$a(this));
        }
        this.f344609d = (MMClearEditText) this.f344611f.getContentEditText();
        MMClearEditText mMClearEditText = (MMClearEditText) this.f344612g.getContentEditText();
        this.f344610e = mMClearEditText;
        C77382c b = C77382c.m93286b(mMClearEditText);
        b.f225611e = 0;
        b.f225610d = 16;
        b.mo107499d((C77382c.C77383a) null);
        this.f344609d.addTextChangedListener(new LoginUI$$q(this));
        this.f344609d.setOnFocusChangeListener(new LoginUI$$r(this));
        this.f344610e.setOnFocusChangeListener(new LoginUI$$s(this));
        Button button = (Button) findViewById(C0966R.C0970id.g5o);
        this.f344622t = button;
        button.setEnabled(false);
        this.f344623u = (Button) findViewById(C0966R.C0970id.g5x);
        this.f344624v = (Button) findViewById(C0966R.C0970id.g5j);
        this.f344625w = (Button) findViewById(C0966R.C0970id.g65);
        this.f344627y = findViewById(C0966R.C0970id.eex);
        this.f344626x = (Button) findViewById(C0966R.C0970id.g66);
        this.f344628z = (Button) findViewById(C0966R.C0970id.g6a);
        this.f344625w.setOnClickListener(new LoginUI$$t(this));
        this.f344626x.setOnClickListener(new LoginUI$$u(this));
        C77407n nVar = new C77407n((Context) this, 1, false);
        nVar.f225771i = new LoginUI$$v(this);
        nVar.f225761d = new LoginUI$$w(this);
        nVar.f225782p = new LoginUI$$b(this);
        if (LocaleUtil.isSimplifiedChineseAppLang()) {
            this.f344628z.setOnClickListener(new LoginUI$$c(this));
        } else {
            View view = this.f344627y;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/LoginUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/account/ui/LoginUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f344628z.setText(C0966R.string.gca);
            this.f344628z.setOnClickListener(new LoginUI$$d(this, nVar));
        }
        setMMTitle("");
        setBackBtn(new LoginUI$$e(this), C0966R.raw.actionbar_icon_close_black);
        boolean[] zArr = {false};
        this.f344622t.setOnClickListener(new LoginUI$$f(this, zArr));
        this.f344622t.setOnTouchListener(new LoginUI$$g(this, zArr));
        this.f344623u.setOnClickListener(new LoginUI$$h(this));
        String stringExtra = getIntent().getStringExtra("auth_ticket");
        this.f344614i = stringExtra;
        if (!Util.isNullOrNil(stringExtra)) {
            this.f344609d.setText(Util.nullAsNil(C115135m0.m161943c()));
            this.f344610e.setText(Util.nullAsNil(C115135m0.m161944d()));
            new MMHandler().postDelayed(new LoginUI$$i(this), 500);
        }
        this.f344609d.addTextChangedListener(this.f344603E);
        this.f344610e.addTextChangedListener(this.f344603E);
        this.f344610e.setOnEditorActionListener(new LoginUI$$j(this));
        this.f344610e.setOnKeyListener(new LoginUI$$k(this));
        if (ChannelUtil.shouldShowGprsAlert) {
            ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93143Kn(this);
        }
        String stringExtra2 = getIntent().getStringExtra("login_username");
        this.f344604F = getIntent().getBooleanExtra("from_deep_link", false);
        if (!Util.isNullOrNil(stringExtra2)) {
            this.f344609d.setText(stringExtra2);
        }
        if (BuildInfo.EX_DEVICE_LOGIN || C85875k4.m106210y() || C85875k4.m106157N()) {
            this.f344624v.setVisibility(0);
            if (C85875k4.m106210y() && !C85875k4.m106157N()) {
                this.f344624v.setText(getResources().getString(C0966R.string.f360971gd1));
            } else if (C85875k4.m106157N()) {
                this.f344624v.setText(getResources().getString(C0966R.string.f0x));
            } else {
                this.f344624v.setText(getResources().getString(C0966R.string.gby));
            }
            this.f344624v.setOnClickListener(new LoginUI$$m(this));
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Bundle bundleExtra;
        super.onActivityResult(i, i2, intent);
        Object[] objArr = new Object[3];
        int i3 = 0;
        objArr[0] = Integer.valueOf(i);
        objArr[1] = Integer.valueOf(i2);
        objArr[2] = Boolean.valueOf(intent == null);
        Log.m105919d("MicroMsg.LoginUI", "onActivityResult, requestCode:%d, resultCode:%d, data==null:%b", objArr);
        if (i2 != -1) {
            return;
        }
        if (i == 1024 && intent != null) {
            String stringExtra = intent.getStringExtra("VoiceLoginAuthPwd");
            int intExtra = intent.getIntExtra("KVoiceHelpCode", 0);
            Object[] objArr2 = new Object[3];
            objArr2[0] = Boolean.valueOf(Util.isNullOrNil(stringExtra));
            if (!Util.isNullOrNil(stringExtra)) {
                i3 = stringExtra.length();
            }
            objArr2[1] = Integer.valueOf(i3);
            objArr2[2] = Integer.valueOf(intExtra);
            Log.m105919d("MicroMsg.LoginUI", "onActivityResult, do voiceprint auth, authPwd is null:%b, authPwd.len:%d, lastErrCode:%d", objArr2);
            if (intExtra == -217) {
                this.f344618p.f345163c = stringExtra;
                mo174670J7();
            }
        } else if (i == 32644 && intent != null && (bundleExtra = intent.getBundleExtra("result_data")) != null && bundleExtra.getString("go_next", "").equals("auth_again")) {
            mo174670J7();
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        if (C11171e.m11046c(31) && ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_fix_login_ui_and, 1) == 1) {
            getWindow().setSoftInputMode(2);
            Log.m105925i("MicroMsg.LoginUI", "onCreate: %s", Integer.valueOf(Build.VERSION.SDK_INT));
        }
        getWindow().getDecorView().setBackgroundColor(getContext().getResources().getColor(C0966R.color.a7a));
        if (C89625d.f257845k || BuildInfo.IS_FLAVOR_BLUE) {
            str = getString(C0966R.string.a0u) + C88504k.m110376b(this);
        } else {
            str = "";
        }
        this.f344620r = getIntent().getIntExtra("login_type", 0);
        setMMTitle(str);
        setActionbarColor(getResources().getColor(C0966R.color.a7_));
        hideActionbarLine();
        ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93150TO();
        this.f344621s = C78595a.m94981a();
        initView();
        this.f344599A = new C77687b();
        this.f344601C = getIntent().getBooleanExtra("from_switch_account", false);
        this.f344600B = C7624i3.f25910c.mo19a("login_weixin_username", "");
        int[] intArrayExtra = getIntent().getIntArrayExtra("kv_report_login_method_data");
        if (intArrayExtra != null) {
            C115669n.INSTANCE.mo160131h(14262, Integer.valueOf(intArrayExtra[0]), Integer.valueOf(intArrayExtra[1]), Integer.valueOf(intArrayExtra[2]), Integer.valueOf(intArrayExtra[3]), Integer.valueOf(intArrayExtra[4]));
        }
        ((C90110f) C86312j.m106911c(C90110f.class)).mo124152cj();
        C44595p1.m49048a(this, 6);
    }

    public void onDestroy() {
        C77687b bVar = this.f344599A;
        if (bVar != null) {
            bVar.mo107840a();
        }
        C86709a0.m107524d().mo123470p(701, this);
        C86709a0.m107524d().mo123470p(252, this);
        C118418g.INSTANCE.mo175826kl("ie_login_id");
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        hideVKB();
        C78595a.m94985e(this.f344621s);
        C85606b2.f249526h = null;
        C85606b2.f249527i = -1;
        finish();
        return true;
    }

    public void onPause() {
        super.onPause();
        hideVKB();
        this.f344605G.dead();
        int i = this.f344620r;
        if (i == 0) {
            StringBuilder sb = new StringBuilder();
            C86709a0.m107523b();
            sb.append(C86718e.m107547e());
            sb.append(",");
            sb.append(getClass().getName());
            sb.append(",");
            sb.append("L100_100_logout");
            sb.append(",");
            C86709a0.m107523b();
            sb.append(C86718e.m107548f("L100_100_logout"));
            sb.append(",");
            sb.append(2);
            C78595a.m94983c(10645, false, sb.toString());
        } else if (i == 1) {
            StringBuilder sb4 = new StringBuilder();
            C86709a0.m107523b();
            sb4.append(C86718e.m107547e());
            sb4.append(",");
            sb4.append(getClass().getName());
            sb4.append(",");
            sb4.append("L400_100_login");
            sb4.append(",");
            C86709a0.m107523b();
            sb4.append(C86718e.m107548f("L400_100_login"));
            sb4.append(",");
            sb4.append(2);
            C78595a.m94983c(10645, false, sb4.toString());
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f344608J.mo124431c(this, i, strArr, iArr);
    }

    public void onResume() {
        this.f344605G.alive();
        super.onResume();
        int i = this.f344620r;
        if (i == 0) {
            StringBuilder sb = new StringBuilder();
            C86709a0.m107523b();
            sb.append(C86718e.m107547e());
            sb.append(",");
            sb.append(getClass().getName());
            sb.append(",");
            sb.append("L100_100_logout");
            sb.append(",");
            C86709a0.m107523b();
            sb.append(C86718e.m107548f("L100_100_logout"));
            sb.append(",");
            sb.append(1);
            C78595a.m94983c(10645, true, sb.toString());
            C78595a.m94984d("L100_100_logout");
        } else if (i == 1) {
            StringBuilder sb4 = new StringBuilder();
            C86709a0.m107523b();
            sb4.append(C86718e.m107547e());
            sb4.append(",");
            sb4.append(getClass().getName());
            sb4.append(",");
            sb4.append("L400_100_login");
            sb4.append(",");
            C86709a0.m107523b();
            sb4.append(C86718e.m107548f("L400_100_login"));
            sb4.append(",");
            sb4.append(1);
            C78595a.m94983c(10645, true, sb4.toString());
            C78595a.m94984d("L400_100_login");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x012c, code lost:
        if (r12 != -310) goto L_0x02a7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0280  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x02b9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x02ba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r19, int r20, java.lang.String r21, ob0.C117747y r22) {
        /*
            r18 = this;
            r10 = r18
            r11 = r19
            r12 = r20
            r13 = r21
            r0 = r22
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "onSceneEnd: errType = "
            r1.append(r2)
            r1.append(r11)
            java.lang.String r2 = " errCode = "
            r1.append(r2)
            r1.append(r12)
            java.lang.String r2 = " errMsg = "
            r1.append(r2)
            r1.append(r13)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MicroMsg.LoginUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            android.app.ProgressDialog r1 = r10.f344613h
            r14 = 0
            if (r1 == 0) goto L_0x003a
            r1.dismiss()
            r10.f344613h = r14
        L_0x003a:
            int r1 = r22.getType()
            r3 = 701(0x2bd, float:9.82E-43)
            r4 = 252(0xfc, float:3.53E-43)
            if (r1 == r4) goto L_0x004b
            int r1 = r22.getType()
            if (r1 == r3) goto L_0x004b
            return
        L_0x004b:
            ob0.b0 r1 = f40.C86709a0.m107524d()
            r1.mo123470p(r4, r10)
            ob0.b0 r1 = f40.C86709a0.m107524d()
            r1.mo123470p(r3, r10)
            r1 = r0
            com.tencent.mm.modelsimple.a0 r1 = (com.tencent.p014mm.modelsimple.C114735a0) r1
            java.lang.String r5 = r1.mo174354j1()
            r10.f344619q = r5
            com.tencent.mm.plugin.account.ui.m0 r5 = r10.f344618p
            java.lang.String r6 = r1.mo174359o1()
            r5.f345165e = r6
            com.tencent.mm.plugin.account.ui.m0 r5 = r10.f344618p
            byte[] r6 = r1.mo174357m1()
            r5.f345167g = r6
            com.tencent.mm.plugin.account.ui.m0 r5 = r10.f344618p
            java.lang.String r6 = r1.mo174358n1()
            r5.f345166f = r6
            com.tencent.mm.plugin.account.ui.m0 r5 = r10.f344618p
            int r6 = r1.mo174360p1()
            r5.f345168h = r6
            com.tencent.mm.plugin.account.ui.m0 r5 = r10.f344618p
            java.lang.String r6 = r1.f343983h
            r5.f345162b = r6
            r5 = -205(0xffffffffffffff33, float:NaN)
            if (r12 != r5) goto L_0x009e
            java.lang.String r6 = r1.mo174355k1()
            r10.f344614i = r6
            java.lang.String r6 = r1.mo174364t1()
            r10.f344615j = r6
            java.lang.String r6 = r1.mo174356l1()
            r10.f344616n = r6
        L_0x009e:
            r6 = 4
            if (r11 != r6) goto L_0x00bc
            r7 = -16
            if (r12 == r7) goto L_0x00a9
            r7 = -17
            if (r12 != r7) goto L_0x00bc
        L_0x00a9:
            ob0.b0 r7 = f40.C86709a0.m107524d()
            eb0.f4 r8 = new eb0.f4
            com.tencent.mm.plugin.account.ui.LoginUI$$n r9 = new com.tencent.mm.plugin.account.ui.LoginUI$$n
            r9.<init>(r10)
            r8.<init>(r9, r14)
            r7.mo123460f(r8)
            r7 = 1
            goto L_0x00bd
        L_0x00bc:
            r7 = 0
        L_0x00bd:
            r8 = 5
            r9 = 2
            if (r7 != 0) goto L_0x030e
            if (r11 != 0) goto L_0x00c7
            if (r12 != 0) goto L_0x00c7
            goto L_0x030e
        L_0x00c7:
            r0 = -106(0xffffffffffffff96, float:NaN)
            if (r12 != r0) goto L_0x00d1
            r0 = 32644(0x7f84, float:4.5744E-41)
            sf0.C13665i0.m12970c(r10, r13, r0)
            return
        L_0x00d1:
            r0 = -217(0xffffffffffffff27, float:NaN)
            if (r12 != r0) goto L_0x00dd
            com.tencent.mm.modelsimple.a0$c r0 = sf0.C118276e.m166845a(r1)
            sf0.C13665i0.m12973f(r10, r0, r12)
            return
        L_0x00dd:
            java.lang.Class<om.f> r0 = p214om.C11502f.class
            di3.d r1 = di3.C86312j.m106911c(r0)
            om.f r1 = (p214om.C11502f) r1
            wc3.y r1 = r1.mo11461Sr()
            androidx.appcompat.app.AppCompatActivity r7 = r18.getContext()
            boolean r1 = r1.mo93163uP(r7, r11, r12, r13)
            r7 = 2131832276(0x7f112dd4, float:1.9297601E38)
            if (r1 == 0) goto L_0x00fe
        L_0x00f6:
            r4 = 0
            r9 = 1
        L_0x00f8:
            r14 = 2131832276(0x7f112dd4, float:1.9297601E38)
            r15 = 2
            goto L_0x02b7
        L_0x00fe:
            if (r11 != r6) goto L_0x02a7
            r1 = -2023(0xfffffffffffff819, float:NaN)
            r6 = 2131821704(0x7f110488, float:1.9276159E38)
            if (r12 == r1) goto L_0x0269
            if (r12 == r5) goto L_0x0215
            r0 = -140(0xffffffffffffff74, float:NaN)
            if (r12 == r0) goto L_0x0202
            r0 = -100
            if (r12 == r0) goto L_0x01fc
            r0 = -75
            if (r12 == r0) goto L_0x01f0
            r0 = -72
            if (r12 == r0) goto L_0x01e1
            r0 = -9
            if (r12 == r0) goto L_0x01d6
            r0 = -6
            if (r12 == r0) goto L_0x014e
            r0 = -3
            if (r12 == r0) goto L_0x0147
            r0 = -1
            if (r12 == r0) goto L_0x0130
            r0 = -311(0xfffffffffffffec9, float:NaN)
            if (r12 == r0) goto L_0x014e
            r0 = -310(0xfffffffffffffeca, float:NaN)
            if (r12 == r0) goto L_0x014e
            goto L_0x02a7
        L_0x0130:
            ob0.b0 r0 = f40.C86709a0.m107524d()
            int r0 = r0.mo123467m()
            if (r0 != r8) goto L_0x0144
            r0 = 2131833496(0x7f113298, float:1.9300076E38)
            r1 = 2131833495(0x7f113297, float:1.9300074E38)
            nj3.C76879j.m92738i(r10, r0, r1)
            goto L_0x00f6
        L_0x0144:
            r4 = 0
            r9 = 0
            goto L_0x00f8
        L_0x0147:
            r0 = 2131825174(0x7f111216, float:1.9283197E38)
            nj3.C76879j.m92738i(r10, r0, r7)
            goto L_0x00f6
        L_0x014e:
            ob0.b0 r0 = f40.C86709a0.m107524d()
            r0.mo123455a(r3, r10)
            ob0.b0 r0 = f40.C86709a0.m107524d()
            r0.mo123455a(r4, r10)
            com.tencent.mm.ui.applet.SecurityImage r0 = r10.f344617o
            if (r0 != 0) goto L_0x0191
            r1 = 2131834632(0x7f113708, float:1.930238E38)
            com.tencent.mm.plugin.account.ui.m0 r8 = r10.f344618p
            int r2 = r8.f345168h
            byte[] r3 = r8.f345167g
            java.lang.String r4 = r8.f345165e
            java.lang.String r5 = r8.f345166f
            com.tencent.mm.plugin.account.ui.p0 r6 = new com.tencent.mm.plugin.account.ui.p0
            r6.<init>(r10)
            r16 = 0
            com.tencent.mm.plugin.account.ui.q0 r0 = new com.tencent.mm.plugin.account.ui.q0
            r0.<init>(r10)
            r17 = r0
            r0 = r18
            r14 = 2131832276(0x7f112dd4, float:1.9297601E38)
            r7 = r16
            r16 = r8
            r8 = r17
            r15 = 2
            r9 = r16
            com.tencent.mm.ui.applet.SecurityImage r0 = com.tencent.p014mm.p136ui.applet.SecurityImage.C116047a.m163296a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.f344617o = r0
            goto L_0x0213
        L_0x0191:
            r14 = 2131832276(0x7f112dd4, float:1.9297601E38)
            r15 = 2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "imgSid:"
            r0.append(r1)
            com.tencent.mm.plugin.account.ui.m0 r1 = r10.f344618p
            java.lang.String r1 = r1.f345165e
            r0.append(r1)
            java.lang.String r1 = " img len"
            r0.append(r1)
            com.tencent.mm.plugin.account.ui.m0 r1 = r10.f344618p
            byte[] r1 = r1.f345167g
            int r1 = r1.length
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            java.lang.String r1 = p206nj.C76861g.m92660c()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r0)
            com.tencent.mm.ui.applet.SecurityImage r0 = r10.f344617o
            com.tencent.mm.plugin.account.ui.m0 r1 = r10.f344618p
            int r2 = r1.f345168h
            byte[] r3 = r1.f345167g
            java.lang.String r4 = r1.f345165e
            java.lang.String r1 = r1.f345166f
            r0.mo177230b(r2, r3, r4, r1)
            goto L_0x0213
        L_0x01d6:
            r14 = 2131832276(0x7f112dd4, float:1.9297601E38)
            r15 = 2
            r0 = 2131832275(0x7f112dd3, float:1.92976E38)
            nj3.C76879j.m92738i(r10, r0, r14)
            goto L_0x0213
        L_0x01e1:
            r14 = 2131832276(0x7f112dd4, float:1.9297601E38)
            r15 = 2
            androidx.appcompat.app.AppCompatActivity r0 = r18.getContext()
            r1 = 2131834619(0x7f1136fb, float:1.9302353E38)
            nj3.C76879j.m92738i(r0, r1, r6)
            goto L_0x0213
        L_0x01f0:
            r14 = 2131832276(0x7f112dd4, float:1.9297601E38)
            r15 = 2
            androidx.appcompat.app.AppCompatActivity r0 = r18.getContext()
            sf0.C13665i0.m12971d(r0)
            goto L_0x0213
        L_0x01fc:
            r14 = 2131832276(0x7f112dd4, float:1.9297601E38)
            r15 = 2
            r4 = 0
            goto L_0x026e
        L_0x0202:
            r14 = 2131832276(0x7f112dd4, float:1.9297601E38)
            r15 = 2
            java.lang.String r0 = r10.f344619q
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0213
            java.lang.String r0 = r10.f344619q
            sf0.C13665i0.m12972e(r10, r13, r0)
        L_0x0213:
            r4 = 0
            goto L_0x0267
        L_0x0215:
            r14 = 2131832276(0x7f112dd4, float:1.9297601E38)
            r15 = 2
            java.lang.Object[] r1 = new java.lang.Object[r15]
            java.lang.String r3 = r10.f344614i
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.secPrint(r3)
            r4 = 0
            r1[r4] = r3
            java.lang.String r3 = r10.f344616n
            r5 = 1
            r1[r5] = r3
            java.lang.String r3 = "summerphone MM_ERR_QQ_OK_NEED_MOBILE authTicket[%s], closeShowStyle[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r1)
            com.tencent.mm.plugin.account.ui.m0 r1 = r10.f344618p
            com.tencent.p014mm.plugin.account.p024ui.C115135m0.f345161i = r1
            java.lang.String r1 = "L600_100"
            wg0.C78595a.m94985e(r1)
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r2 = r10.f344614i
            java.lang.String r3 = "auth_ticket"
            r1.putExtra(r3, r2)
            java.lang.String r2 = r10.f344615j
            java.lang.String r3 = "binded_mobile"
            r1.putExtra(r3, r2)
            java.lang.String r2 = r10.f344616n
            java.lang.String r3 = "close_safe_device_style"
            r1.putExtra(r3, r2)
            java.lang.String r2 = "from_source"
            r3 = 1
            r1.putExtra(r2, r3)
            di3.d r0 = di3.C86312j.m106911c(r0)
            om.f r0 = (p214om.C11502f) r0
            wc3.z r0 = r0.mo11462yM()
            com.tencent.mm.app.r1 r0 = (com.tencent.p014mm.app.C67654r1) r0
            r0.mo93189v(r10, r1)
        L_0x0267:
            r9 = 1
            goto L_0x02b7
        L_0x0269:
            r4 = 0
            r14 = 2131832276(0x7f112dd4, float:1.9297601E38)
            r15 = 2
        L_0x026e:
            f40.C86718e.m107550n()
            androidx.appcompat.app.AppCompatActivity r0 = r18.getContext()
            f40.C86709a0.m107523b()
            java.lang.String r1 = f40.C86718e.f251747w
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x028c
            androidx.appcompat.app.AppCompatActivity r1 = r18.getContext()
            r2 = 2131832656(0x7f112f50, float:1.9298372E38)
            java.lang.String r1 = kg3.C76577a.m92166q(r1, r2)
            goto L_0x0291
        L_0x028c:
            f40.C86709a0.m107523b()
            java.lang.String r1 = f40.C86718e.f251747w
        L_0x0291:
            androidx.appcompat.app.AppCompatActivity r2 = r18.getContext()
            java.lang.String r2 = r2.getString(r6)
            com.tencent.mm.plugin.account.ui.r0 r3 = new com.tencent.mm.plugin.account.ui.r0
            r3.<init>(r10)
            com.tencent.mm.plugin.account.ui.s0 r5 = new com.tencent.mm.plugin.account.ui.s0
            r5.<init>(r10)
            nj3.C76879j.m92719M(r0, r1, r2, r3, r5)
            goto L_0x0267
        L_0x02a7:
            r4 = 0
            r14 = 2131832276(0x7f112dd4, float:1.9297601E38)
            r15 = 2
            sf0.p0 r0 = new sf0.p0
            r0.<init>(r11, r12, r13)
            sf0.b r1 = r10.f344599A
            boolean r9 = r1.mo107842c(r10, r0)
        L_0x02b7:
            if (r9 == 0) goto L_0x02ba
            return
        L_0x02ba:
            r0 = -5
            if (r12 != r0) goto L_0x02e2
            com.tencent.mm.sdk.platformtools.WeChatBrands$AppInfo$WhichApp r0 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.AppInfo.current()
            boolean r0 = r0.isMainland()
            if (r0 == 0) goto L_0x02d6
            r0 = 2131832304(0x7f112df0, float:1.9297658E38)
            java.lang.String r0 = r10.getString(r0)
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r10, (java.lang.CharSequence) r0, (int) r4)
            r0.show()
            goto L_0x02e1
        L_0x02d6:
            java.lang.String r0 = r10.getString(r14)
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r10, (java.lang.CharSequence) r0, (int) r4)
            r0.show()
        L_0x02e1:
            return
        L_0x02e2:
            ei.a r0 = p148ei.C7660a.m7782a(r21)
            if (r0 == 0) goto L_0x02f0
            r1 = 0
            boolean r0 = r0.mo8792b(r10, r1, r1)
            if (r0 == 0) goto L_0x02f0
            return
        L_0x02f0:
            r0 = 2131830303(0x7f11261f, float:1.92936E38)
            java.lang.Object[] r1 = new java.lang.Object[r15]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r19)
            r1[r4] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r20)
            r3 = 1
            r1[r3] = r2
            java.lang.String r0 = r10.getString(r0, r1)
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r10, (java.lang.CharSequence) r0, (int) r4)
            r0.show()
            return
        L_0x030e:
            r4 = 0
            r15 = 2
            f40.C86718e.m107546E()
            com.tencent.mm.plugin.account.ui.m0 r1 = r10.f344618p
            java.lang.String r1 = r1.f345162b
            sf0.C13665i0.m12968a(r10, r1)
            eb0.i3 r1 = eb0.C7624i3.f25910c
            java.lang.String r2 = "login_weixin_username"
            java.lang.String r3 = ""
            java.lang.String r1 = r1.mo19a(r2, r3)
            boolean r2 = r10.f344601C
            if (r2 == 0) goto L_0x036b
            eb0.t5 r2 = eb0.C75593t5.f222075c
            java.lang.String r5 = r10.f344600B
            r2.mo105939b(r5, r1)
            eb0.t5 r1 = eb0.C75593t5.f222075c
            java.lang.String r2 = eb0.C75592q0.m90789s()
            java.util.Map r5 = eb0.C75592q0.m90788r()
            r1.mo105945h(r2, r5)
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 14978(0x3a82, float:2.0989E-41)
            java.lang.Object[] r5 = new java.lang.Object[r8]
            r7 = 1
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r5[r4] = r8
            r8 = 9
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r5[r7] = r8
            eb0.t5 r7 = eb0.C75593t5.f222075c
            java.lang.String r7 = r7.mo105944g()
            r5[r15] = r7
            r7 = 3
            eb0.t5 r8 = eb0.C75593t5.f222075c
            java.lang.String r8 = r8.mo105943f()
            r5[r7] = r8
            java.lang.String r7 = p156gj.C87203t.m108273i()
            r5[r6] = r7
            r1.mo160131h(r2, r5)
        L_0x036b:
            com.tencent.mm.plugin.account.ui.LoginUI$$o r1 = new com.tencent.mm.plugin.account.ui.LoginUI$$o
            r1.<init>(r10, r0)
            sf0.C13665i0.m12969b(r10, r1, r4, r15)
            r0 = 10645(0x2995, float:1.4917E-41)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            f40.C86709a0.m107523b()
            java.lang.String r2 = f40.C86718e.m107547e()
            r1.append(r2)
            java.lang.String r2 = ","
            r1.append(r2)
            java.lang.Class r5 = r18.getClass()
            java.lang.String r5 = r5.getName()
            r1.append(r5)
            r1.append(r2)
            java.lang.String r5 = "R200_900_phone"
            r1.append(r5)
            r1.append(r2)
            f40.C86709a0.m107523b()
            int r5 = f40.C86718e.m107548f(r5)
            r1.append(r5)
            r1.append(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            wg0.C78595a.m94982b(r0, r1)
            boolean r0 = com.tencent.p014mm.p136ui.C85875k4.m106157N()
            if (r0 != 0) goto L_0x03c2
            boolean r0 = com.tencent.p014mm.p136ui.C85875k4.m106210y()
            if (r0 == 0) goto L_0x03ce
        L_0x03c2:
            r0 = 2
            com.tencent.mm.autogen.mmdata.rpt.FoldingPhoneLoginTypeStruct r2 = new com.tencent.mm.autogen.mmdata.rpt.FoldingPhoneLoginTypeStruct
            r2.<init>()
            r2.f107894d = r0
            r2.mo86054n()
        L_0x03ce:
            boolean r0 = r10.f344604F
            if (r0 == 0) goto L_0x03f4
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r1 = "randomid_prefs"
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r6)
            java.lang.String r1 = "randomID"
            java.lang.String r0 = r0.getString(r1, r3)
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 11930(0x2e9a, float:1.6717E-41)
            java.lang.Object[] r3 = new java.lang.Object[r15]
            r3[r4] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r4 = 1
            r3[r4] = r0
            r1.mo160131h(r2, r3)
        L_0x03f4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.account.p024ui.LoginUI.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C118866a.class);
    }
}
