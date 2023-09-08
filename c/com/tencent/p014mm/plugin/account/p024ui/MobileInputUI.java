package com.tencent.p014mm.plugin.account.p024ui;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.events.LoginDisasterEvent;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.base.MMFormInputView;
import com.tencent.p014mm.p136ui.base.MMFormVerifyCodeInputView;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.InputPanelLinearLayout;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.secdata.p843ui.MMSecDataActivity;
import com.tencent.p014mm.pluginsdk.model.C44595p1;
import com.tencent.p014mm.protocal.GeneralControlWrapper;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.PhoneFormater;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.sdk.platformtools.WeChatSomeFeatureSwitch;
import di3.C86312j;
import h81.C32735h;
import j20.C117292a;
import java.util.HashSet;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import lg3.C88504k;
import nc0.C76850a;
import nj3.C88989a;
import nj3.C88990b;
import p206nj.C11171e;
import p214om.C11502f;
import qe3.C89625d;
import qn3.C77382c;
import qo3.C77407n;
import qo3.C89779i0;
import s00.C90110f;
import sf0.C90186h0;
import tc2.C118418g;
import wg0.C78595a;
import xb2.C118866a;

@C88989a(1)
/* renamed from: com.tencent.mm.plugin.account.ui.MobileInputUI */
public class MobileInputUI extends MMSecDataActivity {

    /* renamed from: V */
    public static final /* synthetic */ int f344669V = 0;

    /* renamed from: A */
    public Button f344670A;

    /* renamed from: B */
    public View f344671B;

    /* renamed from: C */
    public boolean f344672C = true;

    /* renamed from: D */
    public String f344673D = null;

    /* renamed from: E */
    public String f344674E = null;

    /* renamed from: F */
    public String f344675F = null;

    /* renamed from: G */
    public String f344676G = null;

    /* renamed from: H */
    public String f344677H = null;

    /* renamed from: I */
    public String f344678I = null;

    /* renamed from: J */
    public String f344679J;

    /* renamed from: K */
    public int f344680K = 0;

    /* renamed from: L */
    public int f344681L;

    /* renamed from: M */
    public MobileInputUI$$u f344682M;

    /* renamed from: N */
    public int[] f344683N = new int[5];

    /* renamed from: P */
    public boolean f344684P;

    /* renamed from: Q */
    public boolean f344685Q;

    /* renamed from: R */
    public String f344686R = "";

    /* renamed from: S */
    public String f344687S = "";

    /* renamed from: T */
    public IListener f344688T = new IListener<LoginDisasterEvent>(this, C40008f.f107254d) {
        {
            this.__eventId = -1399051904;
        }

        public boolean callback(IEvent iEvent) {
            LoginDisasterEvent.C114679a aVar;
            LoginDisasterEvent loginDisasterEvent = (LoginDisasterEvent) iEvent;
            if (loginDisasterEvent == null || (aVar = loginDisasterEvent.f343570d) == null) {
                return false;
            }
            Log.m105925i("MicroMsg.MobileInputUI", "summerdiz loginDisasterListener callback content[%s], url[%s]", aVar.f343571a, aVar.f343572b);
            Intent intent = new Intent();
            intent.putExtra("key_disaster_content", loginDisasterEvent.f343570d.f343571a);
            intent.putExtra("key_disaster_url", loginDisasterEvent.f343570d.f343572b);
            intent.setClass(MMApplicationContext.getContext(), DisasterUI.class).addFlags(268435456);
            Context context = MMApplicationContext.getContext();
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(intent);
            Context context2 = context;
            C117292a.m165358d(context2, aVar2.mo10232b(), "com/tencent/mm/plugin/account/ui/MobileInputUI$1", "callback", "(Lcom/tencent/mm/autogen/events/LoginDisasterEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/plugin/account/ui/MobileInputUI$1", "callback", "(Lcom/tencent/mm/autogen/events/LoginDisasterEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
    };

    /* renamed from: U */
    public C90186h0 f344689U = new C90186h0();

    /* renamed from: d */
    public EditText f344690d;

    /* renamed from: e */
    public MMFormInputView f344691e;

    /* renamed from: f */
    public EditText f344692f;

    /* renamed from: g */
    public MMFormInputView f344693g;

    /* renamed from: h */
    public MMFormVerifyCodeInputView f344694h;

    /* renamed from: i */
    public LinearLayout f344695i;

    /* renamed from: j */
    public TextView f344696j;

    /* renamed from: n */
    public C89779i0 f344697n;

    /* renamed from: o */
    public View f344698o;

    /* renamed from: p */
    public CheckBox f344699p;

    /* renamed from: q */
    public TextView f344700q;

    /* renamed from: r */
    public Button f344701r;

    /* renamed from: s */
    public TextView f344702s;

    /* renamed from: t */
    public TextView f344703t;

    /* renamed from: u */
    public TextView f344704u;

    /* renamed from: v */
    public Button f344705v;

    /* renamed from: w */
    public Button f344706w;

    /* renamed from: x */
    public Button f344707x;

    /* renamed from: y */
    public View f344708y;

    /* renamed from: z */
    public Button f344709z;

    /* renamed from: H7 */
    public static void m161864H7(MobileInputUI mobileInputUI) {
        String string = mobileInputUI.getString(C0966R.string.lit);
        m161865M7(mobileInputUI, string + LocaleUtil.getApplicationLanguage());
    }

    /* renamed from: M7 */
    public static void m161865M7(Context context, String str) {
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

    /* renamed from: I7 */
    public boolean mo174700I7() {
        if (this.f344692f.getText() == null || Util.isNullOrNil(this.f344692f.getText().toString()) || !this.f344672C) {
            return false;
        }
        return this.f344680K != 2 || (this.f344690d.getText() != null && !Util.isNullOrNil(this.f344690d.getText().toString()));
    }

    /* renamed from: J7 */
    public final void mo174701J7() {
        if (this.f344684P) {
            hideVKB();
            Intent b = ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93169b(this);
            b.addFlags(67108864);
            b.putExtra("can_finish", true);
            C9556a aVar = new C9556a();
            aVar.mo10233c(b);
            C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/MobileInputUI", "goBack", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/account/ui/MobileInputUI", "goBack", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            finish();
            C88990b.m111200i(this);
            return;
        }
        this.f344682M.mo174715a(MobileInputUI$$t.GoBack);
        C78595a.m94985e(this.f344679J);
        hideVKB();
        finish();
    }

    /* renamed from: K7 */
    public final boolean mo174702K7() {
        int i = this.f344681L;
        return i == 7 || i == 6;
    }

    /* renamed from: L7 */
    public final boolean mo174703L7() {
        return this.f344680K == 2;
    }

    /* renamed from: N7 */
    public final void mo174704N7() {
        if (Util.isNullOrNil(this.f344676G) || Util.isNullOrNil(this.f344677H)) {
            this.f344696j.setText(getString(C0966R.string.gtc));
        } else {
            this.f344696j.setText(PhoneFormater.countryNameWithCode(this.f344676G, this.f344677H));
        }
    }

    public void finish() {
        super.finish();
        overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2333y);
        C115669n.INSTANCE.mo160131h(14262, Integer.valueOf(this.f344683N[0]), Integer.valueOf(this.f344683N[1]), Integer.valueOf(this.f344683N[2]), Integer.valueOf(this.f344683N[3]), Integer.valueOf(this.f344683N[4]));
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359897bg3;
    }

    public void initView() {
        String str;
        MMFormInputView mMFormInputView = (MMFormInputView) findViewById(C0966R.C0970id.f359168jd1);
        this.f344693g = mMFormInputView;
        EditText contentEditText = mMFormInputView.getContentEditText();
        this.f344690d = contentEditText;
        C77382c b = C77382c.m93286b(contentEditText);
        b.f225611e = 0;
        b.f225610d = 16;
        b.mo107499d((C77382c.C77383a) null);
        MMFormInputView mMFormInputView2 = (MMFormInputView) findViewById(C0966R.C0970id.gw_);
        this.f344691e = mMFormInputView2;
        mMFormInputView2.setInputType(3);
        this.f344692f = this.f344691e.getContentEditText();
        MMFormVerifyCodeInputView mMFormVerifyCodeInputView = (MMFormVerifyCodeInputView) findViewById(C0966R.C0970id.jnx);
        this.f344694h = mMFormVerifyCodeInputView;
        mMFormVerifyCodeInputView.setInputType(3);
        this.f344695i = (LinearLayout) findViewById(C0966R.C0970id.bua);
        this.f344696j = (TextView) findViewById(C0966R.C0970id.buc);
        this.f344698o = findViewById(C0966R.C0970id.ijy);
        this.f344699p = (CheckBox) findViewById(C0966R.C0970id.ik5);
        this.f344700q = (TextView) findViewById(C0966R.C0970id.ik4);
        this.f344701r = (Button) findViewById(C0966R.C0970id.hfe);
        this.f344702s = (TextView) findViewById(C0966R.C0970id.f5659l4);
        this.f344703t = (TextView) findViewById(C0966R.C0970id.ikl);
        this.f344704u = (TextView) findViewById(C0966R.C0970id.g6h);
        TextView textView = (TextView) findViewById(C0966R.C0970id.gw7);
        ((InputPanelLinearLayout) findViewById(C0966R.C0970id.fft)).mo104200a(new MobileInputUI$$a(this));
        this.f344705v = (Button) findViewById(C0966R.C0970id.g5x);
        this.f344670A = (Button) findViewById(C0966R.C0970id.g5j);
        this.f344706w = (Button) findViewById(C0966R.C0970id.g65);
        this.f344707x = (Button) findViewById(C0966R.C0970id.g66);
        this.f344708y = findViewById(C0966R.C0970id.eex);
        this.f344709z = (Button) findViewById(C0966R.C0970id.g6a);
        this.f344671B = findViewById(C0966R.C0970id.agf);
        this.f344695i.setVisibility(8);
        this.f344693g.setVisibility(8);
        this.f344694h.setVisibility(8);
        this.f344691e.setVisibility(8);
        this.f344703t.setVisibility(8);
        this.f344704u.setVisibility(8);
        this.f344701r.setVisibility(8);
        View view = this.f344698o;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/MobileInputUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/account/ui/MobileInputUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f344705v.setVisibility(8);
        this.f344706w.setOnClickListener(new MobileInputUI$$n(this));
        this.f344707x.setOnClickListener(new MobileInputUI$$o(this));
        boolean z = true;
        C77407n nVar = new C77407n((Context) this, 1, false);
        nVar.f225771i = new MobileInputUI$$p(this);
        nVar.f225782p = new MobileInputUI$$q(this);
        nVar.f225761d = new MobileInputUI$$r(this);
        if (LocaleUtil.isSimplifiedChineseAppLang()) {
            this.f344709z.setOnClickListener(new MobileInputUI$$s(this));
        } else {
            View view2 = this.f344708y;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/account/ui/MobileInputUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/account/ui/MobileInputUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f344709z.setText(C0966R.string.gca);
            this.f344709z.setOnClickListener(new MobileInputUI$$b(this, nVar));
        }
        boolean[] zArr = {true};
        this.f344692f.setOnFocusChangeListener(new MobileInputUI$$c(this, zArr));
        this.f344692f.addTextChangedListener(new MobileInputUI$$d(this, zArr));
        this.f344690d.addTextChangedListener(new MobileInputUI$$e(this));
        this.f344692f.setOnEditorActionListener(new MobileInputUI$$f(this));
        this.f344692f.setOnKeyListener(new MobileInputUI$$g(this));
        boolean[] zArr2 = {false};
        this.f344701r.setEnabled(true);
        this.f344701r.setOnTouchListener(new MobileInputUI$$h(this, zArr2));
        this.f344701r.setOnClickListener(new MobileInputUI$$i(this, zArr2));
        if (WeChatSomeFeatureSwitch.onlyUSMobile()) {
            this.f344677H = "1";
            this.f344676G = C76850a.m92631c(this, "1", getString(C0966R.string.bvs));
        }
        if (Util.isNullOrNil(this.f344677H)) {
            this.f344676G = getString(C0966R.string.bvu);
            this.f344677H = PhoneFormater.pureCountryCode(getString(C0966R.string.bvt));
        } else {
            this.f344676G = C76850a.m92631c(this, this.f344677H, getString(C0966R.string.bvs));
        }
        if (Util.isNullOrNil(this.f344676G) || Util.isNullOrNil(this.f344677H)) {
            this.f344678I = ((TelephonyManager) getSystemService("phone")).getSimCountryIso();
            Log.m105918d("MicroMsg.MobileInputUI", "tm.getSimCountryIso()" + this.f344678I);
            if (Util.isNullOrNil(this.f344678I)) {
                Log.m105920e("MicroMsg.MobileInputUI", "getDefaultCountryInfo error");
            } else {
                C76850a.C76851a a = C76850a.m92629a(this, this.f344678I, getString(C0966R.string.bvs));
                if (a == null) {
                    Log.m105920e("MicroMsg.MobileInputUI", "getDefaultCountryInfo error");
                } else {
                    this.f344677H = PhoneFormater.pureCountryCode(a.f224676b);
                    this.f344676G = a.f224677c;
                }
            }
        }
        mo174704N7();
        if (Util.isNullOrNil(this.f344675F)) {
            this.f344692f.setText(this.f344675F);
        }
        this.f344695i.setOnClickListener(new MobileInputUI$$j(this));
        if (C89625d.f257845k || BuildInfo.IS_FLAVOR_BLUE) {
            str = getString(C0966R.string.a0u) + C88504k.m110376b(this);
        } else {
            str = "";
        }
        setMMTitle(str);
        setActionbarColor(getResources().getColor(C0966R.color.a7_));
        hideActionbarLine();
        if (WeChatBrands.Business.Entries.LoginPasswordReset.banned()) {
            this.f344706w.setVisibility(8);
        }
        if (!BuildInfo.DEBUG) {
            if (!(BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.IS_FLAVOR_RED || BuildInfo.CLIENT_VERSION_INT == 788529167) && !WeChatEnvironment.hasDebugger()) {
                z = false;
            }
        }
        if (z) {
            addIconOptionMenu(0, getString(C0966R.string.a2g), (int) C0966R.raw.icons_outlined_setting, (MenuItem.OnMenuItemClickListener) new MobileInputUI$$k(this));
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = i;
        int i4 = i2;
        Intent intent2 = intent;
        MobileInputUI$$t mobileInputUI$$t = MobileInputUI$$t.GoNext;
        super.onActivityResult(i, i2, intent);
        Bundle bundle = null;
        int i5 = 0;
        if (i3 == 32047) {
            if (intent2 != null) {
                bundle = intent2.getBundleExtra("result_data");
            }
            if (bundle == null || !bundle.getString("go_next", "").equals("agree_privacy")) {
                C115669n.INSTANCE.idkeyStat(712, 1, 1, false);
                MobileInputUI$$u mobileInputUI$$u = this.f344682M;
                if (mobileInputUI$$u instanceof C115140n1) {
                    ((C115140n1) mobileInputUI$$u).f345181i = 1;
                    return;
                }
                return;
            }
            C115669n.INSTANCE.idkeyStat(712, 2, 1, false);
            MobileInputUI$$u mobileInputUI$$u2 = this.f344682M;
            if (mobileInputUI$$u2 instanceof C115140n1) {
                ((C115140n1) mobileInputUI$$u2).f345181i = 0;
            }
            mobileInputUI$$u2.mo174715a(mobileInputUI$$t);
        } else if (i3 == 32046) {
            if (intent2 != null) {
                bundle = intent2.getBundleExtra("result_data");
            }
            if (i4 == -1 && bundle != null && bundle.getString("go_next", "").equals("get_reg_verify_code")) {
                MobileInputUI$$u mobileInputUI$$u3 = this.f344682M;
                if (mobileInputUI$$u3 instanceof C115140n1) {
                    ((C115140n1) mobileInputUI$$u3).f345181i = 2;
                }
                mobileInputUI$$u3.mo174715a(mobileInputUI$$t);
            }
        } else if (i3 == 32045) {
            if (intent2 != null) {
                bundle = intent2.getBundleExtra("result_data");
            }
            if (i4 == -1 && bundle != null && bundle.getString("go_next", "").equals("auth_again")) {
                MobileInputUI$$u mobileInputUI$$u4 = this.f344682M;
                if (mobileInputUI$$u4 instanceof C115152p1) {
                    mobileInputUI$$u4.mo174715a(mobileInputUI$$t);
                }
            }
        } else if (i4 != -1) {
            if (i4 == 100) {
                this.f344676G = Util.nullAs(intent2.getStringExtra("country_name"), "");
                this.f344677H = Util.nullAs(intent2.getStringExtra("couttry_code"), "");
                this.f344678I = Util.nullAs(intent2.getStringExtra("iso_code"), "");
                if (this.f344680K != 2 || C76850a.m92638j(this.f344677H)) {
                    mo174704N7();
                    return;
                }
                Intent intent3 = new Intent(this, RegByMobileRegAIOUI.class);
                intent3.putExtra("couttry_code", this.f344677H);
                intent3.putExtra("country_name", this.f344676G);
                intent3.putExtra("iso_code", this.f344678I);
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent3);
                C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/MobileInputUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(this, "com/tencent/mm/plugin/account/ui/MobileInputUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                finish();
            }
        } else if (i3 == 1024 && intent2 != null) {
            String stringExtra = intent2.getStringExtra("VoiceLoginAuthPwd");
            int intExtra = intent2.getIntExtra("KVoiceHelpCode", 0);
            Object[] objArr = new Object[3];
            objArr[0] = Boolean.valueOf(Util.isNullOrNil(stringExtra));
            if (!Util.isNullOrNil(stringExtra)) {
                i5 = stringExtra.length();
            }
            objArr[1] = Integer.valueOf(i5);
            objArr[2] = Integer.valueOf(intExtra);
            Log.m105919d("MicroMsg.MobileInputUI", "onActivityResult, do voiceprint auth, authPwd is null:%b, authPwd.len:%d, lastErrCode:%d", objArr);
            if (intExtra == -217) {
                hideVKB();
                this.f344689U.mo124429a(this, new C115181s1(this));
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        super.setRequestedOrientation(1);
        if (C11171e.m11046c(31) && ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_fix_login_ui_and, 1) == 1) {
            getWindow().setSoftInputMode(2);
            Log.m105925i("MicroMsg.MobileInputUI", "onCreate: %s", Integer.valueOf(Build.VERSION.SDK_INT));
        }
        getWindow().getDecorView().setBackgroundColor(getContext().getResources().getColor(C0966R.color.a7a));
        this.f344680K = getIntent().getIntExtra("mobile_input_purpose", 0);
        this.f344681L = getIntent().getIntExtra("mobile_auth_type", 0);
        this.f344684P = getIntent().getBooleanExtra("can_finish", false);
        setBackBtn(new MobileInputUI$$l(this), C0966R.raw.actionbar_icon_close_black);
        setActionbarColor(getContext().getResources().getColor(C0966R.color.a7_));
        hideActionbarLine();
        int i = this.f344680K;
        if (i == -1) {
            this.f344682M = new C115152p1();
        } else if (i != 1) {
            if (i == 2) {
                this.f344682M = new C115140n1();
            } else if (i == 3) {
                this.f344682M = new C115098d1();
            } else if (i != 4) {
                Log.m105921e("MicroMsg.MobileInputUI", "wrong purpose %s", Integer.valueOf(i));
                finish();
                return;
            } else {
                this.f344682M = new C115136m1();
            }
        } else if (!Util.isNullOrNil(getIntent().getStringExtra("auth_ticket"))) {
            this.f344682M = new C115152p1();
        } else {
            int[] intArrayExtra = getIntent().getIntArrayExtra("kv_report_login_method_data");
            if (intArrayExtra != null) {
                this.f344683N = intArrayExtra;
            }
            this.f344682M = new C115132k1();
        }
        this.f344677H = PhoneFormater.pureCountryCode(Util.nullAs(getIntent().getStringExtra("couttry_code"), ""));
        this.f344676G = Util.nullAs(getIntent().getStringExtra("country_name"), "");
        this.f344678I = Util.nullAsNil(getIntent().getStringExtra("iso_code"));
        this.f344675F = Util.nullAs(getIntent().getStringExtra("bindmcontact_shortmobile"), "");
        this.f344673D = PhoneFormater.countryCodeWithPlus(this.f344677H);
        this.f344674E = Util.nullAs(getIntent().getStringExtra("input_mobile_number"), "");
        this.f344679J = C78595a.m94981a();
        initView();
        if (getIntent().getBooleanExtra("from_deep_link", false) && !Util.isNullOrNil(this.f344673D) && !Util.isNullOrNil(this.f344674E)) {
            this.f344691e.setText(this.f344674E);
        }
        this.f344682M.mo174716b(this);
        if (BuildInfo.EX_DEVICE_LOGIN || C85875k4.m106210y() || C85875k4.m106157N()) {
            this.f344670A.setVisibility(0);
            if (C85875k4.m106210y() && !C85875k4.m106157N()) {
                this.f344670A.setText(getResources().getString(C0966R.string.f360971gd1));
            } else if (C85875k4.m106157N()) {
                this.f344670A.setText(getResources().getString(C0966R.string.f0x));
            } else {
                this.f344670A.setText(getResources().getString(C0966R.string.gby));
            }
            this.f344670A.setOnClickListener(new MobileInputUI$$m(this));
        }
        this.f344685Q = getIntent().getBooleanExtra("from_switch_account", false);
        ((C90110f) C86312j.m106911c(C90110f.class)).mo124152cj();
        C44595p1.m49048a(this, 6);
    }

    public void onDestroy() {
        C118418g gVar = C118418g.INSTANCE;
        if (mo174703L7()) {
            gVar.mo175826kl("ie_reg_eu");
        }
        if (mo174702K7()) {
            gVar.mo175826kl("ie_login");
        }
        MMFormVerifyCodeInputView mMFormVerifyCodeInputView = this.f344694h;
        if (mMFormVerifyCodeInputView != null) {
            mMFormVerifyCodeInputView.mo101694c();
        }
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i, keyEvent);
        }
        mo174701J7();
        return true;
    }

    public void onPause() {
        super.onPause();
        this.f344688T.dead();
        this.f344682M.stop();
        hideVKB();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f344689U.mo124431c(this, i, strArr, iArr);
    }

    public void onResume() {
        this.f344688T.alive();
        super.onResume();
        this.f344682M.start();
    }

    public void setRequestedOrientation(int i) {
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C118866a.class);
    }
}
