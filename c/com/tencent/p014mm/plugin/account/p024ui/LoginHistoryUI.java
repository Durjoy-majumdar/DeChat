package com.tencent.p014mm.plugin.account.p024ui;

import al3.C0086a;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bc0.C67216a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.events.LoginDisasterEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.FoldingPhoneLoginTypeStruct;
import com.tencent.p014mm.modelsimple.C114735a0;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.applet.SecurityImage;
import com.tencent.p014mm.p136ui.base.MMFormInputView;
import com.tencent.p014mm.p136ui.base.MMFormVerifyCodeInputView;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.InputPanelLinearLayout;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.protocal.GeneralControlWrapper;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.PhoneFormater;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import di3.C86312j;
import eb0.C75576f4;
import eb0.C75593t5;
import eb0.C7624i3;
import f40.C86709a0;
import f40.C86718e;
import h81.C32735h;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import nj3.C76875f0;
import nj3.C76879j;
import nj3.C88989a;
import nj3.C88990b;
import ob0.C11385n;
import ob0.C117747y;
import p148ei.C7660a;
import p196ln.C76708i;
import p206nj.C11171e;
import p206nj.C76861g;
import p214om.C11502f;
import p629ny.C76979h;
import p910lj.C76701a;
import p983ik.C87743a;
import qn3.C77382c;
import qo3.C77389a;
import qo3.C77398g;
import qo3.C77407n;
import sf0.C118276e;
import sf0.C13665i0;
import sf0.C77687b;
import sf0.C77701p0;
import vg0.C14858a;
import xb2.C118866a;

@C88989a(19)
/* renamed from: com.tencent.mm.plugin.account.ui.LoginHistoryUI */
public class LoginHistoryUI extends MMActivity implements C11385n {

    /* renamed from: X */
    public static final /* synthetic */ int f344496X = 0;

    /* renamed from: A */
    public ImageView f344497A;

    /* renamed from: B */
    public String f344498B;

    /* renamed from: C */
    public String f344499C;

    /* renamed from: D */
    public String f344500D;

    /* renamed from: E */
    public SharedPreferences f344501E;

    /* renamed from: F */
    public C77687b f344502F;

    /* renamed from: G */
    public LinearLayout f344503G;

    /* renamed from: H */
    public LinearLayout f344504H;

    /* renamed from: I */
    public LinearLayout f344505I;

    /* renamed from: J */
    public MMFormInputView f344506J;

    /* renamed from: K */
    public MMFormVerifyCodeInputView f344507K;

    /* renamed from: L */
    public Button f344508L;

    /* renamed from: M */
    public String f344509M = "";

    /* renamed from: N */
    public boolean f344510N;

    /* renamed from: P */
    public int f344511P;

    /* renamed from: Q */
    public int f344512Q;

    /* renamed from: R */
    public int f344513R;

    /* renamed from: S */
    public boolean f344514S = false;

    /* renamed from: T */
    public List<C76875f0> f344515T = null;

    /* renamed from: U */
    public int[] f344516U = new int[5];

    /* renamed from: V */
    public IListener f344517V = new IListener<LoginDisasterEvent>(this, C40008f.f107254d) {
        {
            this.__eventId = -1399051904;
        }

        public boolean callback(IEvent iEvent) {
            LoginDisasterEvent.C114679a aVar;
            LoginDisasterEvent loginDisasterEvent = (LoginDisasterEvent) iEvent;
            if (loginDisasterEvent == null || (aVar = loginDisasterEvent.f343570d) == null) {
                return false;
            }
            Log.m105925i("MicroMsg.LoginHistoryUI", "summerdiz loginDisasterListener callback content[%s], url[%s]", aVar.f343571a, aVar.f343572b);
            Intent intent = new Intent();
            intent.putExtra("key_disaster_content", loginDisasterEvent.f343570d.f343571a);
            intent.putExtra("key_disaster_url", loginDisasterEvent.f343570d.f343572b);
            intent.setClass(MMApplicationContext.getContext(), DisasterUI.class).addFlags(268435456);
            Context context = MMApplicationContext.getContext();
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(intent);
            Context context2 = context;
            C117292a.m165358d(context2, aVar2.mo10232b(), "com/tencent/mm/plugin/account/ui/LoginHistoryUI$1", "callback", "(Lcom/tencent/mm/autogen/events/LoginDisasterEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/plugin/account/ui/LoginHistoryUI$1", "callback", "(Lcom/tencent/mm/autogen/events/LoginDisasterEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
    };

    /* renamed from: W */
    public int f344518W = 0;

    /* renamed from: d */
    public TextView f344519d;

    /* renamed from: e */
    public EditText f344520e;

    /* renamed from: f */
    public Button f344521f;

    /* renamed from: g */
    public Button f344522g;

    /* renamed from: h */
    public View f344523h;

    /* renamed from: i */
    public View f344524i;

    /* renamed from: j */
    public View f344525j;

    /* renamed from: n */
    public Button f344526n;

    /* renamed from: o */
    public Button f344527o;

    /* renamed from: p */
    public View f344528p;

    /* renamed from: q */
    public Button f344529q;

    /* renamed from: r */
    public ProgressDialog f344530r = null;

    /* renamed from: s */
    public SecurityImage f344531s = null;

    /* renamed from: t */
    public C115135m0 f344532t = new C115135m0();

    /* renamed from: u */
    public String f344533u = "";

    /* renamed from: v */
    public String f344534v;

    /* renamed from: w */
    public String f344535w;

    /* renamed from: x */
    public String f344536x;

    /* renamed from: y */
    public String f344537y;

    /* renamed from: z */
    public String f344538z;

    /* renamed from: H7 */
    public static void m161828H7(LoginHistoryUI loginHistoryUI) {
        String string = loginHistoryUI.getString(C0966R.string.lit);
        m161830R7(loginHistoryUI.getContext(), string + LocaleUtil.getApplicationLanguage());
    }

    /* renamed from: I7 */
    public static void m161829I7(LoginHistoryUI loginHistoryUI) {
        loginHistoryUI.getClass();
        Intent intent = new Intent(loginHistoryUI, LoginByMobileSendSmsUI.class);
        intent.putExtra("from_mobile", loginHistoryUI.f344536x);
        intent.putExtra("switch_login_wx_id", loginHistoryUI.f344538z);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(loginHistoryUI, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/LoginHistoryUI", "jumpToLoginSmsUp", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        loginHistoryUI.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(loginHistoryUI, "com/tencent/mm/plugin/account/ui/LoginHistoryUI", "jumpToLoginSmsUp", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: R7 */
    public static void m161830R7(Context context, String str) {
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
    public void mo174614J7() {
        C86709a0.m107524d().mo123455a(701, this);
        C86709a0.m107524d().mo123455a(252, this);
    }

    /* renamed from: K7 */
    public void mo1399K7() {
        this.f344532t.f345162b = this.f344498B.trim();
    }

    /* renamed from: L7 */
    public String mo174615L7(String str) {
        String str2;
        PhoneFormater phoneFormater = new PhoneFormater();
        if (this.f344498B.startsWith("+")) {
            str = str.replace("+", "");
            str2 = PhoneFormater.extractCountryCode(str);
            if (str2 != null) {
                str = str.substring(str2.length());
            }
        } else {
            str2 = "86";
        }
        return phoneFormater.formatNumber(str2, str);
    }

    /* renamed from: M7 */
    public final void mo174616M7() {
        Intent b = ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93169b(this);
        b.addFlags(67108864);
        if (Util.isNullOrNil(this.f344538z)) {
            b.putExtra("can_finish", true);
        }
        C9556a aVar = new C9556a();
        aVar.mo10233c(b);
        C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/LoginHistoryUI", "goBack", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(this, "com/tencent/mm/plugin/account/ui/LoginHistoryUI", "goBack", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        finish();
        C88990b.m111200i(this);
    }

    /* renamed from: N7 */
    public final void mo174617N7(int i) {
        Intent intent;
        this.f344516U[3] = 1;
        if (i != 7001) {
            switch (i) {
                case 7006:
                    intent = new Intent(this, LoginFaceUI.class);
                    break;
                case 7007:
                    intent = new Intent(this, LoginPasswordUI.class);
                    break;
                case 7008:
                    intent = new Intent(this, LoginSmsUI.class);
                    break;
                default:
                    intent = null;
                    break;
            }
        } else {
            intent = new Intent(this, LoginVoiceUI.class);
        }
        if (intent != null) {
            intent.putExtra("switch_login_wx_id", this.f344538z);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/LoginHistoryUI", "jumpToOtherLogin", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/account/ui/LoginHistoryUI", "jumpToOtherLogin", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            MMHandlerThread.postToMainThreadDelayed(new LoginHistoryUI$$t(this), 300);
            C88990b.m111197f(this);
        }
    }

    /* renamed from: O7 */
    public boolean mo174618O7(int i, int i2, String str) {
        C77398g gVar;
        String str2;
        Class cls = C11502f.class;
        if (i == 4) {
            if (i2 != -2023) {
                if (i2 == -205) {
                    Log.m105925i("MicroMsg.LoginHistoryUI", "summerphone MM_ERR_QQ_OK_NEED_MOBILE authTicket[%s], closeShowStyle[%s]", Util.secPrint(this.f344534v), this.f344537y);
                    C115135m0.f345161i = this.f344532t;
                    Intent intent = new Intent();
                    intent.putExtra("auth_ticket", this.f344534v);
                    intent.putExtra("binded_mobile", this.f344536x);
                    intent.putExtra("close_safe_device_style", this.f344537y);
                    intent.putExtra("from_source", 2);
                    ((C67654r1) ((C11502f) C86312j.m106911c(cls)).mo11462yM()).mo93189v(this, intent);
                    return true;
                } else if (i2 == -140) {
                    if (!Util.isNullOrNil(this.f344533u)) {
                        C13665i0.m12972e(this, str, this.f344533u);
                    }
                    return true;
                } else if (i2 != -100) {
                    if (i2 == -75) {
                        C13665i0.m12971d(this);
                        return true;
                    } else if (i2 != -72) {
                        if (i2 != -9) {
                            if (i2 != -6) {
                                if (i2 == -3) {
                                    if (this.f344518W < 1) {
                                        C76879j.m92738i(this, C0966R.string.cbm, C0966R.string.gcw);
                                        this.f344518W++;
                                    } else {
                                        C76879j.m92707A(this, getString(C0966R.string.cbn), getString(C0966R.string.gcw), getString(C0966R.string.cbo), getString(C0966R.string.f7926wf), new LoginHistoryUI$$l(this), new LoginHistoryUI$$m(this));
                                    }
                                    return true;
                                } else if (i2 != -1) {
                                    if (!(i2 == -311 || i2 == -310)) {
                                        if (i2 == -33) {
                                            C76879j.m92742m(this, C0966R.string.al9, C0966R.string.ale, new LoginHistoryUI$$o(this));
                                            return true;
                                        } else if (i2 == -32) {
                                            C76879j.m92749t(this, getString(C0966R.string.ala), "", new LoginHistoryUI$$n(this));
                                            return true;
                                        }
                                    }
                                } else if (C86709a0.m107524d().mo123467m() == 5) {
                                    C76879j.m92738i(this, C0966R.string.h7_, C0966R.string.h79);
                                    return true;
                                }
                            }
                            C86709a0.m107524d().mo123455a(701, this);
                            C86709a0.m107524d().mo123455a(252, this);
                            if (this.f344531s == null) {
                                C115135m0 m0Var = this.f344532t;
                                this.f344531s = SecurityImage.C116047a.m163296a(this, C0966R.string.hyo, m0Var.f345168h, m0Var.f345167g, m0Var.f345165e, m0Var.f345166f, new LoginHistoryUI$$p(this, i), (DialogInterface.OnCancelListener) null, new LoginHistoryUI$$q(this), m0Var);
                            } else {
                                Log.m105918d("MicroMsg.LoginHistoryUI", "imgSid:" + this.f344532t.f345165e + " img len" + this.f344532t.f345167g.length + " " + C76861g.m92660c());
                                SecurityImage securityImage = this.f344531s;
                                C115135m0 m0Var2 = this.f344532t;
                                securityImage.mo177230b(m0Var2.f345168h, m0Var2.f345167g, m0Var2.f345165e, m0Var2.f345166f);
                            }
                            return true;
                        }
                        C76879j.m92738i(this, C0966R.string.gcv, C0966R.string.gcw);
                        return true;
                    } else {
                        C76879j.m92738i(this, C0966R.string.hyb, C0966R.string.a3h);
                        return true;
                    }
                }
            }
            C86718e.m107550n();
            C86709a0.m107523b();
            if (TextUtils.isEmpty(C86718e.f251747w)) {
                str2 = C76577a.m92166q(this, C0966R.string.gmc);
            } else {
                C86709a0.m107523b();
                str2 = C86718e.f251747w;
            }
            C76879j.m92719M(this, str2, getString(C0966R.string.a3h), new LoginHistoryUI$$r(this), new LoginHistoryUI$$s(this));
            return true;
        }
        if (((C11502f) C86312j.m106911c(cls)).mo11461Sr().mo93163uP(this, i, i2, str)) {
            SecurityImage securityImage2 = this.f344531s;
            if (!(securityImage2 == null || (gVar = securityImage2.f348170n) == null)) {
                gVar.dismiss();
                securityImage2.f348170n = null;
            }
            return true;
        }
        return this.f344502F.mo107842c(this, new C77701p0(i, i2, str));
    }

    /* renamed from: P7 */
    public final void mo174619P7(String str) {
        Log.m105925i("MicroMsg.LoginHistoryUI", "requestSms %s", str);
        if (!Util.isNullOrNil(str)) {
            C67216a aVar = new C67216a(str, 16, "", 0, "");
            C86709a0.m107524d().mo123460f(aVar);
            this.f344530r = C76879j.m92723Q(this, getString(C0966R.string.a3h), getString(C0966R.string.a4d), true, true, new LoginHistoryUI$$f(this, aVar));
        }
    }

    /* renamed from: Q7 */
    public final void mo174620Q7(C114735a0 a0Var) {
        Log.m105925i("MicroMsg.LoginHistoryUI", "checktask LoginHistoryUI startLauncher 0x%x, stack: %s", Integer.valueOf(hashCode()), Util.getStack());
        Intent b = ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93169b(this);
        b.addFlags(67108864);
        if (a0Var != null) {
            b.putExtra("kstyle_show_bind_mobile_afterauth", a0Var.mo174361q1());
            b.putExtra("kstyle_bind_recommend_show", a0Var.mo174362r1());
            b.putExtra("kstyle_bind_wording", a0Var.mo174363s1());
        }
        C9556a aVar = new C9556a();
        aVar.mo10233c(b);
        C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/LoginHistoryUI", "startLauncher", "(Lcom/tencent/mm/modelsimple/NetSceneManualAuth;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(this, "com/tencent/mm/plugin/account/ui/LoginHistoryUI", "startLauncher", "(Lcom/tencent/mm/modelsimple/NetSceneManualAuth;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        finish();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b8e;
    }

    public void hideVKB() {
        View currentFocus;
        IBinder windowToken;
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService("input_method");
        if (inputMethodManager != null && (currentFocus = getCurrentFocus()) != null && (windowToken = currentFocus.getWindowToken()) != null) {
            inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
        }
    }

    public void initView() {
        this.f344503G = (LinearLayout) findViewById(C0966R.C0970id.laz);
        this.f344505I = (LinearLayout) findViewById(C0966R.C0970id.cqj);
        this.f344504H = (LinearLayout) findViewById(C0966R.C0970id.e9b);
        this.f344506J = (MMFormInputView) findViewById(C0966R.C0970id.g6c);
        this.f344507K = (MMFormVerifyCodeInputView) findViewById(C0966R.C0970id.jnx);
        String stringExtra = getIntent().getStringExtra("switch_login_wx_id");
        this.f344538z = stringExtra;
        if (!Util.isNullOrNil(stringExtra)) {
            this.f344498B = C75593t5.f222075c.mo105941d(this.f344538z, "login_user_name");
            this.f344500D = C75593t5.f222075c.mo105941d(this.f344538z, "last_avatar_path");
            int safeParseInt = Util.safeParseInt(C75593t5.f222075c.mo105941d(this.f344538z, "last_bind_info"));
            this.f344512Q = safeParseInt;
            if ((safeParseInt & 1) != 0) {
                this.f344535w = C75593t5.f222075c.mo105941d(this.f344538z, "last_login_bind_qq");
            }
            if ((this.f344512Q & 4) != 0) {
                this.f344536x = C75593t5.f222075c.mo105941d(this.f344538z, "last_login_bind_mobile");
            }
            this.f344511P = Util.safeParseInt(C75593t5.f222075c.mo105941d(this.f344538z, "last_login_use_voice"));
            setBackBtn(new LoginHistoryUI$$u(this), C0966R.raw.actionbar_icon_close_black);
        } else {
            this.f344498B = C7624i3.f25910c.mo19a("login_user_name", "");
            this.f344499C = C7624i3.f25910c.mo19a("last_login_nick_name", "");
            this.f344500D = C7624i3.f25910c.mo19a("last_avatar_path", "");
            int safeParseInt2 = Util.safeParseInt(C7624i3.f25910c.mo19a("last_bind_info", ""));
            this.f344512Q = safeParseInt2;
            if ((safeParseInt2 & 1) != 0) {
                this.f344535w = C7624i3.f25910c.mo19a("last_login_bind_qq", "");
            }
            if ((this.f344512Q & 4) != 0) {
                this.f344536x = C7624i3.f25910c.mo19a("last_login_bind_mobile", "");
            }
            this.f344511P = Util.safeParseInt(C7624i3.f25910c.mo19a("last_login_use_voice", ""));
        }
        String stringExtra2 = getIntent().getStringExtra("email_address");
        if (!Util.isNullOrNil(stringExtra2) && !stringExtra2.equalsIgnoreCase(this.f344498B)) {
            this.f344498B = stringExtra2;
        }
        this.f344497A = (ImageView) findViewById(C0966R.C0970id.fhr);
        if (!Util.isNullOrNil(this.f344500D)) {
            try {
                Bitmap Wd0 = ((C76708i) C86312j.m106911c(C76708i.class)).Wd0(this.f344500D, (String) null);
                if (Wd0 != null && Wd0.getWidth() > 10) {
                    this.f344497A.setImageBitmap(Bitmap.createBitmap(Wd0, 5, 5, Wd0.getWidth() - 10, Wd0.getHeight() - 10, (Matrix) null, false));
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.LoginHistoryUI", e, "get avatar error", new Object[0]);
            }
        }
        this.f344519d = (TextView) findViewById(C0966R.C0970id.g5g);
        this.f344520e = this.f344506J.getContentEditText();
        this.f344521f = (Button) findViewById(C0966R.C0970id.g5o);
        this.f344523h = findViewById(C0966R.C0970id.g6i);
        this.f344524i = findViewById(C0966R.C0970id.g64);
        this.f344525j = (Button) findViewById(C0966R.C0970id.jkj);
        this.f344522g = (Button) findViewById(C0966R.C0970id.g5z);
        this.f344508L = (Button) findViewById(C0966R.C0970id.g5j);
        this.f344526n = (Button) findViewById(C0966R.C0970id.g65);
        this.f344527o = (Button) findViewById(C0966R.C0970id.g66);
        this.f344528p = findViewById(C0966R.C0970id.eex);
        this.f344529q = (Button) findViewById(C0966R.C0970id.g6a);
        InputPanelLinearLayout inputPanelLinearLayout = (InputPanelLinearLayout) findViewById(C0966R.C0970id.fft);
        if (inputPanelLinearLayout != null) {
            inputPanelLinearLayout.mo104200a(new LoginHistoryUI$$a(this));
        }
        this.f344526n.setOnClickListener(new LoginHistoryUI$$v(this));
        this.f344527o.setOnClickListener(new LoginHistoryUI$$w(this));
        if (!LocaleUtil.isSimplifiedChineseAppLang()) {
            View view = this.f344528p;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/LoginHistoryUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/account/ui/LoginHistoryUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f344506J.setVisibility(8);
        this.f344503G.setVisibility(8);
        this.f344505I.setVisibility(8);
        this.f344504H.setVisibility(8);
        this.f344521f.setVisibility(8);
        View view3 = this.f344523h;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(8);
        View view4 = view3;
        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/account/ui/LoginHistoryUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/account/ui/LoginHistoryUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view5 = this.f344524i;
        C9556a aVar3 = new C9556a();
        aVar3.mo10233c(8);
        View view6 = view5;
        C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/account/ui/LoginHistoryUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view6, "com/tencent/mm/plugin/account/ui/LoginHistoryUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view7 = this.f344525j;
        C9556a aVar4 = new C9556a();
        aVar4.mo10233c(8);
        View view8 = view7;
        C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/account/ui/LoginHistoryUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
        C117292a.m165359e(view8, "com/tencent/mm/plugin/account/ui/LoginHistoryUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f344522g.setVisibility(8);
        C77382c b = C77382c.m93286b(this.f344520e);
        b.f225611e = 4;
        b.f225610d = 16;
        b.mo107499d((C77382c.C77383a) null);
        if (!Util.isPhoneNumber(this.f344498B).booleanValue() || this.f344498B.equals(this.f344535w)) {
            this.f344516U[2] = 2;
            if (!Util.isNullOrNil(this.f344499C)) {
                this.f344519d.setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(getContext(), this.f344499C));
            } else {
                this.f344519d.setText(this.f344498B);
            }
        } else {
            this.f344516U[2] = 1;
            this.f344519d.setText(mo174615L7(this.f344498B));
        }
        C77407n nVar = new C77407n((Context) this, 1, false);
        nVar.f225771i = new LoginHistoryUI$$x(this);
        nVar.f225782p = new LoginHistoryUI$$y(this);
        nVar.f225761d = new LoginHistoryUI$$z(this);
        if (Util.isNullOrNil(this.f344538z)) {
            this.f344529q.setOnClickListener(new LoginHistoryUI$$b(this, nVar));
        } else if (!LocaleUtil.isSimplifiedChineseAppLang()) {
            this.f344529q.setText(C0966R.string.lip);
            this.f344529q.setOnClickListener(new LoginHistoryUI$$c(this));
        } else {
            this.f344529q.setText(C0966R.string.lis);
            this.f344529q.setOnClickListener(new LoginHistoryUI$$d(this));
        }
        setMMTitle("");
        setActionbarColor(getResources().getColor(C0966R.color.a7_));
        hideActionbarLine();
        setBackBtnVisible(false);
        if (ChannelUtil.shouldShowGprsAlert) {
            ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93143Kn(this);
        }
        if (BuildInfo.EX_DEVICE_LOGIN || C85875k4.m106210y() || C85875k4.m106157N()) {
            this.f344508L.setVisibility(0);
            if (C85875k4.m106210y() && !C85875k4.m106157N()) {
                this.f344508L.setText(getResources().getString(C0966R.string.f360971gd1));
            } else if (C85875k4.m106157N()) {
                this.f344508L.setText(getResources().getString(C0966R.string.f0x));
            } else {
                this.f344508L.setText(getResources().getString(C0966R.string.gby));
            }
            this.f344508L.setOnClickListener(new LoginHistoryUI$$e(this));
        }
        if (WeChatBrands.Business.Entries.LoginPasswordReset.banned()) {
            this.f344526n.setVisibility(8);
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
        Log.m105919d("MicroMsg.LoginHistoryUI", "onActivityResult, requestCode:%d, resultCode:%d, data==null:%b", objArr);
        if (i != 1024 || intent == null) {
            if (i != 1025 || intent == null) {
                if (i == 31685 && intent != null && i2 == -1 && (bundleExtra = intent.getBundleExtra("result_data")) != null && bundleExtra.getString("go_next", "").equals("auth_again")) {
                    mo1399K7();
                }
            } else if (i2 == 2) {
                String stringExtra = intent.getStringExtra("KFaceLoginAuthPwd");
                Object[] objArr2 = new Object[2];
                objArr2[0] = Boolean.valueOf(Util.isNullOrNil(stringExtra));
                if (!Util.isNullOrNil(stringExtra)) {
                    i3 = stringExtra.length();
                }
                objArr2[1] = Integer.valueOf(i3);
                Log.m105925i("MicroMsg.LoginHistoryUI", "hy: onActivityResult, do faceprint auth, authPwd is null:%b, authPwd.len:%d", objArr2);
                this.f344509M = stringExtra;
                mo1399K7();
            }
        } else if (i2 == -1) {
            String stringExtra2 = intent.getStringExtra("VoiceLoginAuthPwd");
            int intExtra = intent.getIntExtra("KVoiceHelpCode", 0);
            Object[] objArr3 = new Object[3];
            objArr3[0] = Boolean.valueOf(Util.isNullOrNil(stringExtra2));
            if (!Util.isNullOrNil(stringExtra2)) {
                i3 = stringExtra2.length();
            }
            objArr3[1] = Integer.valueOf(i3);
            objArr3[2] = Integer.valueOf(intExtra);
            Log.m105919d("MicroMsg.LoginHistoryUI", "onActivityResult, do voiceprint auth, authPwd is null:%b, authPwd.len:%d, lastErrCode:%d", objArr3);
            this.f344509M = stringExtra2;
            mo1399K7();
        }
    }

    public void onCreate(Bundle bundle) {
        Class cls = C11502f.class;
        super.onCreate(bundle);
        if (C11171e.m11046c(31) && ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_fix_login_ui_and, 1) == 1) {
            getWindow().setSoftInputMode(2);
            Log.m105925i("MicroMsg.LoginHistoryUI", "onCreate: %s", Integer.valueOf(Build.VERSION.SDK_INT));
        }
        Log.m105925i("MicroMsg.LoginHistoryUI", "AccountSyncApplication.modelCallback %s", ((C11502f) C86312j.m106911c(cls)).mo11461Sr());
        ((C11502f) C86312j.m106911c(cls)).mo11461Sr().mo93150TO();
        this.f344501E = MMApplicationContext.getContext().getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0);
        Intent intent = getIntent();
        if (intent != null && intent.getBooleanExtra("login_success_need_bind_fingerprint", false)) {
            intent.getStringExtra("bind_login_fingerprint_info");
        }
        initView();
        this.f344502F = new C77687b();
    }

    public void onDestroy() {
        Log.m105924i("MicroMsg.LoginHistoryUI", "onDestroy");
        C86709a0.m107524d().mo123470p(701, this);
        C86709a0.m107524d().mo123470p(252, this);
        C77687b bVar = this.f344502F;
        if (bVar != null) {
            bVar.mo107840a();
        }
        C115669n.INSTANCE.mo160131h(14262, Integer.valueOf(this.f344516U[0]), Integer.valueOf(this.f344516U[1]), Integer.valueOf(this.f344516U[2]), Integer.valueOf(this.f344516U[3]), Integer.valueOf(this.f344516U[4]));
        ProgressDialog progressDialog = this.f344530r;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f344530r = null;
        }
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 0) {
            mo174616M7();
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void onPause() {
        super.onPause();
        this.f344517V.dead();
        hideVKB();
    }

    public void onResume() {
        super.onResume();
        this.f344515T = new ArrayList();
        if (!(!(!WeChatBrands.Business.Entries.MeSetSecurityVoicePrint.banned()) || this.f344513R == 1 || (this.f344511P & 131072) == 0)) {
            C76875f0 f0Var = new C76875f0(this, 7001, 0);
            f0Var.f224723r = C0966R.string.gd9;
            ((ArrayList) this.f344515T).add(f0Var);
        }
        if (!(this.f344513R == 5 || (this.f344511P & 262144) == 0)) {
            C76875f0 f0Var2 = new C76875f0(this, 7005, 0);
            f0Var2.f224723r = C0966R.string.gd6;
            ((ArrayList) this.f344515T).add(f0Var2);
        }
        if (!Util.isNullOrNil(this.f344498B)) {
            if (this.f344513R != 2) {
                C76875f0 f0Var3 = new C76875f0(this, 7007, 0);
                f0Var3.f224717i = getString(C0966R.string.gd7);
                ((ArrayList) this.f344515T).add(f0Var3);
            }
            if (!Util.isNullOrNil(this.f344536x) && this.f344513R != 3) {
                C76875f0 f0Var4 = new C76875f0(this, 7008, 0);
                f0Var4.f224717i = getString(C0966R.string.gd8);
                ((ArrayList) this.f344515T).add(f0Var4);
            }
            if (this.f344498B.equalsIgnoreCase(this.f344535w)) {
                this.f344520e.setHint(getString(C0966R.string.hyh));
            }
        }
        if (((ArrayList) this.f344515T).size() > 1) {
            C77407n nVar = new C77407n((Context) this, 1, false);
            nVar.f225771i = new C104716e0(this);
            nVar.f225782p = new C104717f0(this);
            nVar.f225761d = new C115122g0(this);
            this.f344522g.setVisibility(0);
            this.f344522g.setText(C0966R.string.gcg);
            this.f344522g.setOnClickListener(new C1477h0(this, nVar));
        } else if (((ArrayList) this.f344515T).size() > 0) {
            this.f344522g.setVisibility(0);
            this.f344522g.setText(((C76875f0) ((ArrayList) this.f344515T).get(0)).getTitle());
            this.f344522g.setOnClickListener(new C104719i0(this));
        } else {
            this.f344522g.setVisibility(8);
        }
        this.f344517V.alive();
        C86709a0.m107523b();
        C86718e.m107553z();
        if (C86709a0.m107522a() && C86709a0.m107523b().f251765p && !this.f344498B.equals("")) {
            ProgressDialog progressDialog = this.f344530r;
            if (progressDialog == null || !progressDialog.isShowing()) {
                mo174620Q7((C114735a0) null);
            }
        } else if (C87743a.m109162a() == 2) {
            C77389a aVar = new C77389a();
            aVar.f225644a = C0086a.m38a(this).getString(C0966R.string.bcy);
            aVar.f225660q = getString(C0966R.string.bcx);
            aVar.f225668y = false;
            aVar.f225663t = C0086a.m38a(this).getString(C0966R.string.bcv);
            aVar.f225620C = new C68501j0(this);
            C77398g gVar = new C77398g(this, C0966R.style.a66);
            gVar.mo107525e(aVar);
            gVar.show();
            PreferenceManager.getDefaultSharedPreferences(this).edit().putLong("db_check_tip_time", System.currentTimeMillis()).commit();
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        boolean z;
        Log.m105924i("MicroMsg.LoginHistoryUI", "onSceneEnd: errType = " + i + " errCode = " + i2 + " errMsg = " + str);
        StringBuilder sb = new StringBuilder();
        sb.append("Scene Type ");
        sb.append(yVar.getType());
        Log.m105924i("MicroMsg.LoginHistoryUI", sb.toString());
        if (yVar.getType() == 145) {
            ProgressDialog progressDialog = this.f344530r;
            if (progressDialog != null && progressDialog.isShowing()) {
                this.f344530r.dismiss();
                this.f344530r = null;
            }
            C67216a aVar = (C67216a) yVar;
            int f = aVar.mo91368f();
            if (f == 13) {
                if (i2 == -36) {
                    C7660a a = C7660a.m7782a(str);
                    if (aVar.mo91372j1() == 1) {
                        Log.m105924i("MicroMsg.LoginHistoryUI", "login check state, sms up");
                        if (a != null) {
                            a.mo8792b(this, new LoginHistoryUI$$g(this), (DialogInterface.OnClickListener) null);
                            return;
                        }
                        C76879j.m92750u(this, getString(C0966R.string.gcl), "", new LoginHistoryUI$$h(this), (DialogInterface.OnClickListener) null);
                    } else if (a != null) {
                        a.mo8792b(this, new LoginHistoryUI$$i(this), (DialogInterface.OnClickListener) null);
                        return;
                    } else {
                        this.f344507K.mo101693b();
                        mo174619P7(this.f344536x);
                    }
                }
            } else if (f == 16) {
                if (i2 == -41) {
                    C76879j.m92738i(this, C0966R.string.hx6, C0966R.string.hx7);
                    this.f344507K.mo101694c();
                    return;
                } else if (i2 == -75) {
                    C76879j.m92748s(this, getString(C0966R.string.f7560jn), "");
                    this.f344507K.mo101694c();
                    return;
                } else if (i2 == -106) {
                    C13665i0.m12970c(this, str, 32045);
                    this.f344507K.mo101694c();
                    return;
                }
            } else if (f == 17) {
                if (i == 0 && i2 == 0) {
                    new C115203z0(new LoginHistoryUI$$j(this), aVar.getUsername(), aVar.mo91380q1(), this.f344536x).mo174958b(this);
                    return;
                } else if (!mo174618O7(i, i2, str)) {
                    C7660a a2 = C7660a.m7782a(str);
                    if (a2 != null) {
                        a2.mo8792b(this, (DialogInterface.OnClickListener) null, (DialogInterface.OnClickListener) null);
                    }
                } else {
                    return;
                }
            }
        } else if (yVar.getType() == 252 || yVar.getType() == 701) {
            C114735a0 a0Var = (C114735a0) yVar;
            this.f344533u = a0Var.mo174354j1();
            Log.m105920e("MicroMsg.LoginHistoryUI", "url " + this.f344533u);
            C86709a0.m107524d().mo123470p(701, this);
            C86709a0.m107524d().mo123470p(252, this);
            this.f344532t.f345168h = a0Var.mo174360p1();
            this.f344532t.f345165e = a0Var.mo174359o1();
            this.f344532t.f345167g = a0Var.mo174357m1();
            this.f344532t.f345166f = a0Var.mo174358n1();
            if (i2 == -205) {
                this.f344534v = a0Var.mo174355k1();
                this.f344536x = a0Var.mo174364t1();
                this.f344537y = a0Var.mo174356l1();
            }
            if (i == 4 && (i2 == -16 || i2 == -17)) {
                C86709a0.m107524d().mo123460f(new C75576f4(new LoginHistoryUI$$k(this), (String) null));
                z = true;
            } else {
                z = false;
            }
            if (z || (i == 0 && i2 == 0)) {
                C86718e.m107546E();
                C13665i0.m12968a(this, this.f344532t.f345162b);
                ProgressDialog progressDialog2 = this.f344530r;
                if (progressDialog2 != null && progressDialog2.isShowing()) {
                    this.f344530r.setMessage(getString(C0966R.string.f360085a04));
                }
                mo174620Q7(a0Var);
                if (this.f344513R == 3) {
                    this.f344510N = a0Var.mo174368x1();
                    if (a0Var.mo174365u1()) {
                        boolean z2 = this.f344510N;
                        Intent intent = new Intent(this, RegByMobileSetPwdUI.class);
                        intent.putExtra("kintent_hint", getString(C0966R.string.iul));
                        intent.putExtra("kintent_cancelable", z2);
                        C9556a aVar2 = new C9556a();
                        aVar2.mo10233c(intent);
                        C117292a.m165358d(this, aVar2.mo10232b(), "com/tencent/mm/plugin/account/ui/LoginHistoryUI", "goToSetIndepPwd", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        startActivity((Intent) aVar2.mo10231a(0));
                        C117292a.m165359e(this, "com/tencent/mm/plugin/account/ui/LoginHistoryUI", "goToSetIndepPwd", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    }
                }
                if (C85875k4.m106157N() || C85875k4.m106210y()) {
                    FoldingPhoneLoginTypeStruct foldingPhoneLoginTypeStruct = new FoldingPhoneLoginTypeStruct();
                    foldingPhoneLoginTypeStruct.f107894d = 2;
                    foldingPhoneLoginTypeStruct.mo86054n();
                    return;
                }
                return;
            }
            ProgressDialog progressDialog3 = this.f344530r;
            if (progressDialog3 != null && progressDialog3.isShowing()) {
                this.f344530r.dismiss();
                this.f344530r = null;
            }
            if (i2 == -106) {
                C13665i0.m12970c(this, str, 31685);
                return;
            } else if (i2 == -217) {
                C13665i0.m12973f(this, C118276e.m166845a(a0Var), i2);
                return;
            } else if (!mo174618O7(i, i2, str)) {
                C7660a a3 = C7660a.m7782a(str);
                if (a3 == null || !a3.mo8792b(this, (DialogInterface.OnClickListener) null, (DialogInterface.OnClickListener) null)) {
                    C76701a.makeText((Context) this, (CharSequence) getString(C0966R.string.ey_, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}), 0).show();
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        mo174618O7(i, i2, str);
    }

    public void setRequestedOrientation(int i) {
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C118866a.class);
        hashSet.add(C14858a.class);
    }
}
