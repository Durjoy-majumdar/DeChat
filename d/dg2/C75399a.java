package dg2;

import ad3.C67027a;
import ag2.C39565a0;
import ag2.C39575e0;
import ag2.C39577f;
import ag2.C39603y;
import ag2.C39604z;
import ag2.C79545v;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import bg2.C28313b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiSetAudioState;
import com.tencent.p014mm.plugin.qqmail.p090ui.ComposeUI;
import com.tencent.p014mm.plugin.qqmail.p090ui.PrepareBindXMailUI;
import com.tencent.p014mm.pluginsdk.p133ui.preference.HelperHeaderPreference;
import com.tencent.p014mm.protocal.GeneralControlWrapper;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import g62.C32330n;
import j20.C117292a;
import junit.framework.Assert;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p214om.C11502f;
import p823sg.C77710q;
import p910lj.C76701a;
import pj3.C47511g;
import qo3.C47883u;
import qo3.C77426q;
import tc0.C77884m;
import tc0.C77885p;
import te3.C64266br1;
import xf2.C38507e;

/* renamed from: dg2.a */
public class C75399a implements C67027a, C11385n {

    /* renamed from: d */
    public Context f221664d;

    /* renamed from: e */
    public C72996z1 f221665e;

    /* renamed from: f */
    public boolean f221666f;

    /* renamed from: g */
    public boolean f221667g;

    /* renamed from: h */
    public boolean f221668h;

    /* renamed from: i */
    public C47511g f221669i;

    /* renamed from: j */
    public ProgressDialog f221670j;

    /* renamed from: n */
    public long f221671n;

    /* renamed from: o */
    public C79545v f221672o;

    /* renamed from: dg2.a$a */
    public class C75400a implements DialogInterface.OnClickListener {
        public C75400a(C75399a aVar) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C28313b.m38164d();
        }
    }

    /* renamed from: dg2.a$b */
    public class C75401b implements DialogInterface.OnClickListener {
        public C75401b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (!Util.isNullOrNil(C75399a.this.mo105756d())) {
                C75399a aVar = C75399a.this;
                Context context = aVar.f221664d;
                aVar.f221670j = C76879j.m92723Q(context, "", context.getString(C0966R.string.a4d), false, false, (DialogInterface.OnCancelListener) null);
                C86709a0.m107524d().mo123460f(new C39565a0());
                return;
            }
            C75399a.this.mo105757e(false, (String) null);
            C75399a.this.mo105758f();
        }
    }

    /* renamed from: dg2.a$c */
    public class C75402c implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f221674d;

        /* renamed from: e */
        public final /* synthetic */ String f221675e;

        /* renamed from: f */
        public final /* synthetic */ String f221676f;

        public C75402c(String str, String str2, String str3) {
            this.f221674d = str;
            this.f221675e = str2;
            this.f221676f = str3;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C75399a.this.mo105754b(this.f221674d, this.f221675e, this.f221676f);
        }
    }

    /* renamed from: dg2.a$d */
    public class C75403d implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f221678d;

        /* renamed from: e */
        public final /* synthetic */ String f221679e;

        public C75403d(String str, String str2) {
            this.f221678d = str;
            this.f221679e = str2;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C75399a.m90433a(C75399a.this, this.f221678d, this.f221679e, "", "");
        }
    }

    /* renamed from: dg2.a$e */
    public class C75404e implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ EditText f221681d;

        /* renamed from: e */
        public final /* synthetic */ String f221682e;

        /* renamed from: f */
        public final /* synthetic */ String f221683f;

        /* renamed from: g */
        public final /* synthetic */ String f221684g;

        public C75404e(EditText editText, String str, String str2, String str3) {
            this.f221681d = editText;
            this.f221682e = str;
            this.f221683f = str2;
            this.f221684g = str3;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (this.f221681d.getText() != null && !Util.isNullOrNil((CharSequence) this.f221681d.getText())) {
                C75399a.m90433a(C75399a.this, this.f221682e, this.f221683f, this.f221684g, this.f221681d.getText().toString());
            }
        }
    }

    /* renamed from: dg2.a$f */
    public class C75405f implements C47883u {
        public C75405f() {
        }

        /* renamed from: a */
        public void mo353a(boolean z, String str) {
            if (z) {
                String mD5String = MD5Util.getMD5String(str);
                C75399a.this.getClass();
                C86709a0.m107529k().f251779b.mo123460f(new C39604z(true, mD5String));
            }
        }
    }

    public C75399a(Context context) {
        Assert.assertTrue(context != null);
        this.f221664d = context;
    }

    /* renamed from: a */
    public static void m90433a(C75399a aVar, String str, String str2, String str3, String str4) {
        aVar.getClass();
        aVar.f221672o = new C79545v(3, str, str2, str3, str4);
        C86709a0.m107524d().mo123460f(aVar.f221672o);
        Context context = aVar.f221664d;
        aVar.f221670j = C76879j.m92723Q(context, "", context.getString(C0966R.string.a4d), false, false, (DialogInterface.OnCancelListener) null);
    }

    /* renamed from: b */
    public final void mo105754b(String str, String str2, String str3) {
        View inflate = View.inflate(this.f221664d, C0966R.C0971layout.bvk, (ViewGroup) null);
        Context context = this.f221664d;
        C76879j.m92746q(context, context.getString(C0966R.string.bpi), inflate, new C75404e((EditText) inflate.findViewById(C0966R.C0970id.j7o), str, str2, str3));
    }

    /* renamed from: c */
    public final void mo105755c() {
        Context context = this.f221664d;
        this.f221670j = C76879j.m92723Q(context, "", context.getString(C0966R.string.a4d), false, false, (DialogInterface.OnCancelListener) null);
        C86709a0.m107524d().mo123460f(new C39603y(mo105756d()));
    }

    /* renamed from: d */
    public final String mo105756d() {
        String str = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_EXT_BIND_XMAIL_STRING_SYNC, (Object) null);
        Log.m105925i("MicroMsg.ContactWidgetQQMail", "last bind xmail %s", str);
        return str;
    }

    /* renamed from: e */
    public final void mo105757e(boolean z, String str) {
        int i;
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_EXT_USER_STATUS_INT_SYNC;
        C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_EXT_BIND_XMAIL_STRING_SYNC;
        int o = C75592q0.m90785o();
        if (z) {
            i = o & -2;
            C86709a0.m107535s().mo121142i().mo119677K(aVar2, str);
            C86709a0.m107535s().mo121142i().mo119677K(aVar, Integer.valueOf(C86709a0.m107535s().mo121142i().mo119689j(aVar, 0) | 2));
            C86709a0.m107529k().f251779b.mo123460f(new C39604z(true, ""));
        } else {
            i = o | 1;
            C86709a0.m107535s().mo121142i().mo119677K(aVar2, "");
            C86709a0.m107535s().mo121142i().mo119677K(aVar, Integer.valueOf(C86709a0.m107535s().mo121142i().mo119689j(aVar, 0) & -3));
            C28313b.m38164d();
        }
        int i2 = i;
        C86709a0.m107535s().mo121142i().mo119676J(34, Integer.valueOf(i2));
        ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(new C77884m(2048, "", "", 0, "", "", "", 0, 0, 0, "", "", "", i2, "", 0, "", 0));
        ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93136Bk();
    }

    /* renamed from: f */
    public final void mo105758f() {
        this.f221667g = (C75592q0.m90785o() & 1) == 0;
        this.f221668h = Util.nullAsNil((Integer) C86709a0.m107535s().mo121142i().mo119684e(17, (Object) null)) == 1;
        HelperHeaderPreference helperHeaderPreference = (HelperHeaderPreference) this.f221669i.mo72519a("contact_info_header_helper");
        helperHeaderPreference.mo7600I(this.f221665e.getUsername(), this.f221665e.mo62898f(), this.f221664d.getString(C0966R.string.bpk));
        helperHeaderPreference.mo7601J(this.f221667g ? 1 : 0);
        this.f221669i.mo72529n("contact_info_qqmailhelper_install", this.f221667g);
        this.f221669i.mo72529n("contact_info_qqmailhelper_view", !this.f221667g);
        this.f221669i.mo72529n("contact_info_qqmailhelper_compose", !this.f221667g);
        CheckBoxPreference checkBoxPreference = (CheckBoxPreference) this.f221669i.mo72519a("contact_info_qqmailhelper_recv_remind");
        if (checkBoxPreference != null) {
            checkBoxPreference.mo6805K(this.f221668h);
        }
        this.f221669i.mo72529n("contact_info_qqmailhelper_recv_remind", !this.f221667g);
        this.f221669i.mo72529n("contact_info_qqmailhelper_download_mgr_view", true);
        this.f221669i.mo72529n("contact_info_qqmailhelper_clear_data", !this.f221667g);
        this.f221669i.mo72529n("contact_info_qqmailhelper_uninstall", !this.f221667g);
        this.f221669i.mo72529n("contact_info_qqmailhelper_account", !this.f221667g);
        this.f221669i.mo72529n("contact_info_qqmailhelper_top", !this.f221667g);
        this.f221669i.mo72529n("contact_info_qqmailhelper_mute", !this.f221667g);
        this.f221669i.mo72529n("contact_info_qqmailhelper_remind_footer", !this.f221667g);
        Preference a = this.f221669i.mo72519a("contact_info_qqmailhelper_account");
        if (this.f221667g) {
            a.mo69921C(8);
            a.mo69932y(false);
            String d = mo105756d();
            int intValue = ((Integer) C86709a0.m107535s().mo121142i().mo119684e(9, 0)).intValue();
            int j = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_EXT_USER_STATUS_INT_SYNC, 0);
            Log.m105925i("MicroMsg.ContactWidgetQQMail", "bindXMail %s, bindQQ %d, extUserStatus %d", d, Integer.valueOf(intValue), Integer.valueOf(j));
            if (!Util.isNullOrNil(d)) {
                if ((j & 2) != 0) {
                    a.mo7741E(d);
                } else {
                    a.mo7741E(this.f221664d.getString(C0966R.string.bpf));
                    a.mo69921C(0);
                    a.mo69932y(true);
                }
            } else if (intValue != 0) {
                a.mo7741E(C77710q.m93738a(intValue) + "@qq.com");
            } else {
                a.mo7741E(this.f221664d.getString(C0966R.string.bpf));
                a.mo69921C(0);
                a.mo69932y(true);
            }
        }
        ((CheckBoxPreference) this.f221669i.mo72519a("contact_info_qqmailhelper_top")).mo6805K(this.f221665e.mo62940x3());
        ((CheckBoxPreference) this.f221669i.mo72519a("contact_info_qqmailhelper_mute")).mo6805K(C45628s0.m50746K(this.f221665e));
        this.f221669i.notifyDataSetChanged();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 291) {
            if (i2 == -1 && intent != null) {
                mo105757e(true, intent.getStringExtra("Key_Bind_XMail"));
                mo105758f();
            }
        } else if (i == 292) {
            Bundle bundle = null;
            if (intent != null) {
                bundle = intent.getBundleExtra("result_data");
            }
            if (bundle != null) {
                String string = bundle.getString("key_qq_mail");
                String string2 = bundle.getString("key_bind_ticket");
                boolean z = bundle.getBoolean("key_need_second_pwd", false);
                String string3 = bundle.getString("key_second_pwd_key");
                Log.m105925i("MicroMsg.ContactWidgetQQMail", "mail %s, ticket %s, needSecondPwd %s, secPwdKey %s", string, string2, Boolean.valueOf(z), string3);
                if (Util.isNullOrNil(string, string2)) {
                    return;
                }
                if (!z) {
                    Context context = this.f221664d;
                    C76879j.m92749t(context, context.getString(C0966R.string.bpg), "", new C75403d(string, string2));
                } else if (!Util.isNullOrNil(string3)) {
                    Context context2 = this.f221664d;
                    C76879j.m92749t(context2, context2.getString(C0966R.string.bpg), "", new C75402c(string, string2, string3));
                } else {
                    Context context3 = this.f221664d;
                    C76701a.makeText(context3, (CharSequence) context3.getString(C0966R.string.ite), 1).show();
                }
            }
        }
    }

    public boolean onDetach() {
        C86709a0.m107529k().f251779b.mo123470p(3848, this);
        C86709a0.m107529k().f251779b.mo123470p(3889, this);
        C86709a0.m107524d().mo123470p(586, this);
        C86709a0.m107529k().f251779b.mo123470p(129, this);
        ProgressDialog progressDialog = this.f221670j;
        if (progressDialog == null) {
            return true;
        }
        progressDialog.dismiss();
        this.f221670j = null;
        return true;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.ContactWidgetQQMail", "errType %d, errCode %d, errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        ProgressDialog progressDialog = this.f221670j;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f221670j = null;
        }
        if (yVar.getType() == 3848) {
            if (i == 0 && i2 == 0) {
                C39575e0 e0Var = (C39575e0) ((C39603y) yVar).f106325d.f127056b.f127083a;
                String str2 = e0Var.f106236e;
                String str3 = e0Var.f106237f;
                String str4 = e0Var.f106235d;
                Log.m105925i("MicroMsg.ContactWidgetQQMail", "wxMail %s, wxLoginUrl %s, qqLoginUrl %s", str2, str3, str4);
                if (Util.isNullOrNil(str2)) {
                    Intent intent = new Intent();
                    intent.putExtra("rawUrl", str3);
                    intent.putExtra("hardcode_jspermission", JsapiPermissionWrapper.f121047h);
                    intent.putExtra("hardcode_general_ctrl", GeneralControlWrapper.f121044e);
                    C88144b.m109795m(this.f221664d, "webview", ".ui.tools.WebViewUI", intent, JsApiSetAudioState.CTRL_INDEX);
                    return;
                }
                Intent intent2 = new Intent();
                intent2.setClass(this.f221664d, PrepareBindXMailUI.class);
                intent2.putExtra("Key_WeXin_Mail", str2);
                intent2.putExtra("Key_QQMail_Login_Url", str4);
                intent2.putExtra("Key_Last_Bind_Mail", mo105756d());
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(291);
                aVar.mo10233c(intent2);
                C117292a.m165364j((Activity) this.f221664d, aVar.mo10232b(), "com/tencent/mm/plugin/qqmail/ui/ContactWidgetQQMail", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                return;
            }
            if (Util.isNullOrNil(str)) {
                str = this.f221664d.getString(C0966R.string.ite);
            }
            C76701a.makeText(this.f221664d, (CharSequence) str, 0).show();
        } else if (yVar.getType() == 3889) {
            if (i == 0 && i2 == 0) {
                mo105757e(false, (String) null);
                mo105758f();
                return;
            }
            if (Util.isNullOrNil(str)) {
                str = this.f221664d.getString(C0966R.string.itg);
            }
            C76701a.makeText(this.f221664d, (CharSequence) str, 0).show();
        } else if (yVar.getType() == 586) {
            if (yVar != this.f221672o) {
                Log.m105924i("MicroMsg.ContactWidgetQQMail", "not my scene, ignore");
                return;
            }
            C79545v vVar = (C79545v) yVar;
            int i3 = ((C39577f) vVar.f233223d.f127056b.f127083a).f106241e;
            if (i == 0 && i2 == 0 && i3 == 0) {
                Context context = this.f221664d;
                C76701a.makeText(context, (CharSequence) context.getString(C0966R.string.itf), 0).show();
                mo105757e(true, vVar.f233225f);
                mo105758f();
                ((C38507e) C86312j.m106911c(C38507e.class)).mo55677fI().mo109597f();
            } else if (i3 == -39006) {
                if (Util.isNullOrNil(str)) {
                    str = this.f221664d.getString(C0966R.string.hp7);
                }
                C76701a.makeText(this.f221664d, (CharSequence) str, 0).show();
                mo105754b(vVar.f233225f, vVar.f233226g, vVar.f233227h);
            } else {
                if (Util.isNullOrNil(str)) {
                    str = this.f221664d.getString(C0966R.string.ite);
                }
                C76701a.makeText(this.f221664d, (CharSequence) str, 1).show();
            }
        } else if (yVar.getType() == 129) {
            if (!(i == 0 && i2 == 0)) {
                if (i2 == -31) {
                    C77426q qVar = new C77426q(this.f221664d);
                    qVar.mo107606r(this.f221664d.getString(C0966R.string.bpi));
                    qVar.mo107594f(Boolean.TRUE);
                    qVar.mo107590b(new C75405f());
                    qVar.mo107603o();
                } else {
                    if (Util.isNullOrNil(str)) {
                        str = this.f221664d.getString(C0966R.string.a0f);
                    }
                    C76701a.makeText(this.f221664d, (CharSequence) str, 0).show();
                }
            }
            mo105758f();
        }
    }

    /* renamed from: x */
    public boolean mo5961x(C47511g gVar, C72996z1 z1Var, boolean z, int i) {
        Assert.assertTrue(gVar != null);
        Assert.assertTrue(z1Var != null);
        Assert.assertTrue(C72996z1.m85849t5(z1Var.getUsername()));
        C86709a0.m107529k().mo121127b().mo123455a(3848, this);
        C86709a0.m107529k().mo121127b().mo123455a(3889, this);
        C86709a0.m107524d().mo123455a(586, this);
        C86709a0.m107529k().mo121127b().mo123455a(129, this);
        this.f221666f = z;
        this.f221665e = z1Var;
        this.f221669i = gVar;
        this.f221671n = C75592q0.m90780j();
        gVar.mo72520b(C0966R.xml.f8875a4);
        mo105758f();
        if (((Activity) this.f221664d).getIntent().getBooleanExtra("key_need_rebind_xmail", false)) {
            mo105755c();
        }
        return true;
    }

    /* renamed from: y */
    public boolean mo5962y(String str) {
        String str2 = str;
        Class cls = C75700k0.class;
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_EXT_STATUS2_LONG_SYNC;
        Log.m105918d("MicroMsg.ContactWidgetQQMail", "handleEvent : key = " + str2);
        if (Util.nullAsNil(str).length() <= 0) {
            return false;
        }
        if (str2.equals("contact_info_qqmailhelper_view")) {
            Intent intent = new Intent();
            if (this.f221666f) {
                intent.putExtra("Chat_User", this.f221665e.getUsername());
                intent.putExtra("Chat_Mode", 1);
                intent.addFlags(67108864);
                ((Activity) this.f221664d).setResult(-1, intent);
            } else {
                intent.putExtra("Chat_User", this.f221665e.getUsername());
                intent.putExtra("Chat_Mode", 1);
                intent.addFlags(67108864);
                ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93173f(intent, this.f221664d);
            }
            ((Activity) this.f221664d).finish();
            return true;
        } else if (str2.equals("contact_info_qqmailhelper_compose")) {
            Intent intent2 = new Intent(this.f221664d, ComposeUI.class);
            if (this.f221666f) {
                intent2.putExtra("Chat_User", this.f221665e.getUsername());
                intent2.addFlags(67108864);
                ((Activity) this.f221664d).setResult(-1, intent2);
            } else {
                intent2.putExtra("Chat_User", this.f221665e.getUsername());
                intent2.addFlags(67108864);
                Context context = this.f221664d;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(intent2);
                Context context2 = context;
                C117292a.m165358d(context2, aVar2.mo10232b(), "com/tencent/mm/plugin/qqmail/ui/ContactWidgetQQMail", "composeMail", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar2.mo10231a(0));
                C117292a.m165359e(context2, "com/tencent/mm/plugin/qqmail/ui/ContactWidgetQQMail", "composeMail", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
            ((Activity) this.f221664d).finish();
            return true;
        } else {
            int i = 2;
            if (str2.equals("contact_info_qqmailhelper_top")) {
                boolean J = ((CheckBoxPreference) this.f221669i.mo72519a(str2)).mo6804J();
                if (J) {
                    C45628s0.m50787m0("qqmail", true, true);
                } else {
                    C45628s0.m50803u0("qqmail", true);
                }
                if (J) {
                    this.f221671n |= 262144;
                } else {
                    this.f221671n &= -262145;
                }
                C86709a0.m107535s().mo121142i().mo119677K(aVar, Long.valueOf(this.f221671n));
                if (J) {
                    i = 1;
                }
                C64266br1 br12 = new C64266br1();
                br12.f182324d = 84;
                br12.f182325e = i;
                ((C77885p) ((C75700k0) C86709a0.m107533q(cls)).mo96100XW()).mo107993q(new C32330n(23, br12));
                Log.m105924i("MicroMsg.ContactWidgetQQMail", "switch ext change : isTop open = " + J + " item value = " + br12.f182325e + " functionId = " + br12.f182324d);
                return true;
            } else if (str2.equals("contact_info_qqmailhelper_mute")) {
                boolean J2 = ((CheckBoxPreference) this.f221669i.mo72519a(str2)).mo6804J();
                if (J2) {
                    C45628s0.m50779i0(this.f221665e, true);
                } else {
                    C45628s0.m50797r0(this.f221665e, true);
                }
                if (J2) {
                    this.f221671n |= 131072;
                } else {
                    this.f221671n &= -131073;
                }
                C86709a0.m107535s().mo121142i().mo119677K(aVar, Long.valueOf(this.f221671n));
                if (J2) {
                    i = 1;
                }
                C64266br1 br13 = new C64266br1();
                br13.f182324d = 83;
                br13.f182325e = i;
                ((C77885p) ((C75700k0) C86709a0.m107533q(cls)).mo96100XW()).mo107993q(new C32330n(23, br13));
                Log.m105924i("MicroMsg.ContactWidgetQQMail", "switch ext change : isMute open = " + J2 + " item value = " + br13.f182325e + " functionId = " + br13.f182324d);
                return true;
            } else if (str2.equals("contact_info_qqmailhelper_recv_remind")) {
                C86709a0.m107529k().f251779b.mo123460f(new C39604z(((CheckBoxPreference) this.f221669i.mo72519a(str2)).mo6804J(), ""));
                return true;
            } else if (str2.equals("contact_info_qqmailhelper_clear_data")) {
                Context context3 = this.f221664d;
                C76879j.m92750u(context3, context3.getString(C0966R.string.blh), "", new C75400a(this), (DialogInterface.OnClickListener) null);
                return true;
            } else if (str2.equals("contact_info_qqmailhelper_install")) {
                mo105755c();
                return true;
            } else if (str2.equals("contact_info_qqmailhelper_uninstall")) {
                Context context4 = this.f221664d;
                C76879j.m92707A(context4, context4.getString(C0966R.string.iwz), "", this.f221664d.getString(C0966R.string.f7930wk), this.f221664d.getString(C0966R.string.f7926wf), new C75401b(), (DialogInterface.OnClickListener) null);
                return true;
            } else if (str2.equals("contact_info_qqmailhelper_account")) {
                mo105755c();
                return true;
            } else {
                Log.m105920e("MicroMsg.ContactWidgetQQMail", "handleEvent : unExpected key = " + str2);
                return false;
            }
        }
    }
}
