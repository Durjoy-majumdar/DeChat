package com.tencent.p014mm.plugin.qqmail.p090ui;

import ag2.C39577f;
import ag2.C79545v;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.C82088k;
import com.tencent.p014mm.protocal.GeneralControlWrapper;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C75592q0;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C11385n;
import ob0.C117747y;
import p910lj.C76701a;
import tl3.C78039a;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.qqmail.ui.PrepareBindXMailUI */
public class PrepareBindXMailUI extends MMActivity implements C11385n {

    /* renamed from: p */
    public static final /* synthetic */ int f203219p = 0;

    /* renamed from: d */
    public ImageView f203220d;

    /* renamed from: e */
    public TextView f203221e;

    /* renamed from: f */
    public Button f203222f;

    /* renamed from: g */
    public TextView f203223g;

    /* renamed from: h */
    public TextView f203224h;

    /* renamed from: i */
    public ProgressDialog f203225i;

    /* renamed from: j */
    public String f203226j;

    /* renamed from: n */
    public String f203227n;

    /* renamed from: o */
    public String f203228o;

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.PrepareBindXMailUI$b */
    public class C42797b implements View.OnClickListener {
        public C42797b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/qqmail/ui/PrepareBindXMailUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            PrepareBindXMailUI.this.onBackPressed();
            C117292a.m165361g(this, "com/tencent/mm/plugin/qqmail/ui/PrepareBindXMailUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.PrepareBindXMailUI$c */
    public class C42798c implements View.OnClickListener {
        public C42798c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/qqmail/ui/PrepareBindXMailUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent();
            intent.putExtra("rawUrl", PrepareBindXMailUI.this.f203228o);
            intent.putExtra("hardcode_jspermission", JsapiPermissionWrapper.f121047h);
            intent.putExtra("hardcode_general_ctrl", GeneralControlWrapper.f121044e);
            C88144b.m109795m(PrepareBindXMailUI.this, "webview", ".ui.tools.WebViewUI", intent, C82088k.CTRL_INDEX);
            C117292a.m165361g(this, "com/tencent/mm/plugin/qqmail/ui/PrepareBindXMailUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.PrepareBindXMailUI$a */
    public class C70356a implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.qqmail.ui.PrepareBindXMailUI$a$a */
        public class C70357a implements DialogInterface.OnClickListener {
            public C70357a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                PrepareBindXMailUI.m82891H7(PrepareBindXMailUI.this);
            }
        }

        public C70356a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/qqmail/ui/PrepareBindXMailUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (!Util.isNullOrNil(PrepareBindXMailUI.this.f203227n)) {
                PrepareBindXMailUI prepareBindXMailUI = PrepareBindXMailUI.this;
                if (!prepareBindXMailUI.f203227n.equals(prepareBindXMailUI.f203226j)) {
                    PrepareBindXMailUI prepareBindXMailUI2 = PrepareBindXMailUI.this;
                    C76879j.m92750u(prepareBindXMailUI2, prepareBindXMailUI2.getString(C0966R.string.bpg), "", new C70357a(), (DialogInterface.OnClickListener) null);
                    C117292a.m165361g(this, "com/tencent/mm/plugin/qqmail/ui/PrepareBindXMailUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            }
            PrepareBindXMailUI.m82891H7(PrepareBindXMailUI.this);
            C117292a.m165361g(this, "com/tencent/mm/plugin/qqmail/ui/PrepareBindXMailUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.PrepareBindXMailUI$d */
    public class C70358d implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ EditText f203231d;

        /* renamed from: e */
        public final /* synthetic */ String f203232e;

        /* renamed from: f */
        public final /* synthetic */ String f203233f;

        /* renamed from: g */
        public final /* synthetic */ String f203234g;

        public C70358d(EditText editText, String str, String str2, String str3) {
            this.f203231d = editText;
            this.f203232e = str;
            this.f203233f = str2;
            this.f203234g = str3;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (this.f203231d.getText() != null && !Util.isNullOrNil((CharSequence) this.f203231d.getText())) {
                PrepareBindXMailUI prepareBindXMailUI = PrepareBindXMailUI.this;
                String str = this.f203232e;
                String str2 = this.f203233f;
                String str3 = this.f203234g;
                String obj = this.f203231d.getText().toString();
                int i2 = PrepareBindXMailUI.f203219p;
                prepareBindXMailUI.mo96882I7(str, str2, str3, obj);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.PrepareBindXMailUI$e */
    public class C70359e implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f203236d;

        /* renamed from: e */
        public final /* synthetic */ String f203237e;

        /* renamed from: f */
        public final /* synthetic */ String f203238f;

        public C70359e(String str, String str2, String str3) {
            this.f203236d = str;
            this.f203237e = str2;
            this.f203238f = str3;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            PrepareBindXMailUI prepareBindXMailUI = PrepareBindXMailUI.this;
            String str = this.f203236d;
            String str2 = this.f203237e;
            String str3 = this.f203238f;
            int i2 = PrepareBindXMailUI.f203219p;
            prepareBindXMailUI.mo96883J7(str, str2, str3);
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.PrepareBindXMailUI$f */
    public class C70360f implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f203240d;

        /* renamed from: e */
        public final /* synthetic */ String f203241e;

        public C70360f(String str, String str2) {
            this.f203240d = str;
            this.f203241e = str2;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            PrepareBindXMailUI prepareBindXMailUI = PrepareBindXMailUI.this;
            String str = this.f203240d;
            String str2 = this.f203241e;
            int i2 = PrepareBindXMailUI.f203219p;
            prepareBindXMailUI.mo96882I7(str, str2, "", "");
        }
    }

    /* renamed from: H7 */
    public static void m82891H7(PrepareBindXMailUI prepareBindXMailUI) {
        C86709a0.m107524d().mo123460f(new C79545v(2, prepareBindXMailUI.f203226j, "", "", ""));
        prepareBindXMailUI.f203225i = C76879j.m92723Q(prepareBindXMailUI, "", prepareBindXMailUI.getString(C0966R.string.a4d), false, false, (DialogInterface.OnCancelListener) null);
    }

    /* renamed from: I7 */
    public final void mo96882I7(String str, String str2, String str3, String str4) {
        C86709a0.m107524d().mo123460f(new C79545v(3, str, str2, str3, str4));
        this.f203225i = C76879j.m92723Q(this, "", getString(C0966R.string.a4d), false, false, (DialogInterface.OnCancelListener) null);
    }

    /* renamed from: J7 */
    public final void mo96883J7(String str, String str2, String str3) {
        View inflate = View.inflate(this, C0966R.C0971layout.bvk, (ViewGroup) null);
        C76879j.m92746q(this, getString(C0966R.string.bpi), inflate, new C70358d((EditText) inflate.findViewById(C0966R.C0970id.j7o), str, str2, str3));
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bnk;
    }

    public void initView() {
        setMMTitle("");
        showMMLogo();
        getSupportActionBar().mo91104o();
        getController().mo177059O0(this, getContext().getResources().getColor(C0966R.color.al6));
        this.f203220d = (ImageView) findViewById(C0966R.C0970id.a27);
        this.f203221e = (TextView) findViewById(C0966R.C0970id.lu6);
        this.f203222f = (Button) findViewById(C0966R.C0970id.a_b);
        this.f203223g = (TextView) findViewById(C0966R.C0970id.apy);
        this.f203224h = (TextView) findViewById(C0966R.C0970id.a_3);
        if (Util.isNullOrNil(this.f203226j)) {
            this.f203222f.setEnabled(false);
        } else {
            this.f203221e.setText(this.f203226j);
        }
        this.f203222f.setOnClickListener(new C70356a());
        this.f203223g.setOnClickListener(new C42797b());
        this.f203224h.setOnClickListener(new C42798c());
        C78039a.m94189a(this.f203220d, C75592q0.m90789s());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 293) {
            Bundle bundleExtra = intent != null ? intent.getBundleExtra("result_data") : null;
            if (bundleExtra != null) {
                String string = bundleExtra.getString("key_qq_mail");
                String string2 = bundleExtra.getString("key_bind_ticket");
                boolean z = bundleExtra.getBoolean("key_need_second_pwd", false);
                String string3 = bundleExtra.getString("key_second_pwd_key");
                Log.m105925i("MicroMsg.PrepareBindXMailUI", "mail %s, ticket %s, needSecondPwd %s, secPwdKey %s", string, string2, Boolean.valueOf(z), string3);
                if (Util.isNullOrNil(string, string2)) {
                    return;
                }
                if (z) {
                    if (Util.isNullOrNil(string3)) {
                        C76701a.makeText((Context) this, (CharSequence) getString(C0966R.string.ite), 1).show();
                    } else if (Util.isNullOrNil(this.f203227n) || this.f203227n.equals(string)) {
                        mo96883J7(string, string2, string3);
                    } else {
                        C76879j.m92750u(this, getString(C0966R.string.bpg), "", new C70359e(string, string2, string3), (DialogInterface.OnClickListener) null);
                    }
                } else if (Util.isNullOrNil(this.f203227n) || this.f203227n.equals(string)) {
                    mo96882I7(string, string2, "", "");
                } else {
                    C76879j.m92750u(this, getString(C0966R.string.bpg), "", new C70360f(string, string2), (DialogInterface.OnClickListener) null);
                }
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f203226j = getIntent().getStringExtra("Key_WeXin_Mail");
        this.f203228o = getIntent().getStringExtra("Key_QQMail_Login_Url");
        String stringExtra = getIntent().getStringExtra("Key_Last_Bind_Mail");
        this.f203227n = stringExtra;
        Log.m105925i("MicroMsg.PrepareBindXMailUI", "wxMail %s, loginQQ %s, lastBindMail %s", this.f203226j, this.f203228o, stringExtra);
        initView();
        C86709a0.m107524d().mo123455a(586, this);
    }

    public void onDestroy() {
        super.onDestroy();
        C86709a0.m107524d().mo123470p(586, this);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.PrepareBindXMailUI", "errType %d, errCode %d, errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        ProgressDialog progressDialog = this.f203225i;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        C79545v vVar = (C79545v) yVar;
        int i3 = ((C39577f) vVar.f233223d.f127056b.f127083a).f106241e;
        if (i == 0 && i2 == 0 && i3 == 0) {
            C76701a.makeText((Context) this, (CharSequence) getString(C0966R.string.itf), 0).show();
            Intent intent = new Intent();
            intent.putExtra("Key_Bind_XMail", vVar.f233225f);
            setResult(-1, intent);
            finish();
        } else if (i3 == -39006) {
            if (Util.isNullOrNil(str)) {
                str = getString(C0966R.string.hp7);
            }
            C76701a.makeText((Context) this, (CharSequence) str, 0).show();
            mo96883J7(vVar.f233225f, vVar.f233226g, vVar.f233227h);
        } else {
            if (Util.isNullOrNil(str)) {
                str = getString(C0966R.string.ite);
            }
            C76701a.makeText((Context) this, (CharSequence) str, 1).show();
        }
    }
}
