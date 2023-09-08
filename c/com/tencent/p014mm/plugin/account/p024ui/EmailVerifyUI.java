package com.tencent.p014mm.plugin.account.p024ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.pay.tool.APPluginConstants;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.MMAutoSwitchEditTextView;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.C82102w;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import f40.C86718e;
import hg0.C59883a0;
import hg0.C59887l0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import k20.C9556a;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p214om.C11502f;
import p910lj.C76701a;
import te3.d54;
import te3.vc4;
import wg0.C78595a;

/* renamed from: com.tencent.mm.plugin.account.ui.EmailVerifyUI */
public class EmailVerifyUI extends MMActivity implements C11385n {

    /* renamed from: r */
    public static final /* synthetic */ int f344454r = 0;

    /* renamed from: d */
    public TextView f344455d;

    /* renamed from: e */
    public TextView f344456e;

    /* renamed from: f */
    public MMAutoSwitchEditTextView f344457f;

    /* renamed from: g */
    public Button f344458g;

    /* renamed from: h */
    public ProgressDialog f344459h = null;

    /* renamed from: i */
    public String f344460i;

    /* renamed from: j */
    public String f344461j;

    /* renamed from: n */
    public String f344462n;

    /* renamed from: o */
    public String f344463o;

    /* renamed from: p */
    public String f344464p;

    /* renamed from: q */
    public boolean f344465q = false;

    /* renamed from: com.tencent.mm.plugin.account.ui.EmailVerifyUI$a */
    public class C114916a implements MMAutoSwitchEditTextView.C116056b {
        public C114916a() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.EmailVerifyUI$b */
    public class C114917b implements MMAutoSwitchEditTextView.C116057c {
        public C114917b() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.EmailVerifyUI$c */
    public class C114918c implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.account.ui.EmailVerifyUI$c$a */
        public class C114919a implements DialogInterface.OnClickListener {

            /* renamed from: com.tencent.mm.plugin.account.ui.EmailVerifyUI$c$a$a */
            public class C114920a implements DialogInterface.OnCancelListener {

                /* renamed from: d */
                public final /* synthetic */ C59887l0 f344470d;

                public C114920a(C114919a aVar, C59887l0 l0Var) {
                    this.f344470d = l0Var;
                }

                public void onCancel(DialogInterface dialogInterface) {
                    C86709a0.m107524d().mo123458d(this.f344470d);
                }
            }

            public C114919a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                EmailVerifyUI emailVerifyUI = EmailVerifyUI.this;
                C59887l0 l0Var = new C59887l0(emailVerifyUI.f344460i, emailVerifyUI.f344462n);
                C86709a0.m107524d().mo123460f(l0Var);
                EmailVerifyUI emailVerifyUI2 = EmailVerifyUI.this;
                emailVerifyUI2.f344459h = C76879j.m92723Q(emailVerifyUI2, emailVerifyUI2.getString(C0966R.string.a3h), EmailVerifyUI.this.getString(C0966R.string.hwe), true, true, new C114920a(this, l0Var));
            }
        }

        public C114918c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/ui/EmailVerifyUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            StringBuilder sb = new StringBuilder();
            C86709a0.m107523b();
            sb.append(C86718e.m107547e());
            sb.append(",");
            sb.append(C114918c.class.getName());
            sb.append(",");
            sb.append("R500_250");
            sb.append(",");
            C86709a0.m107523b();
            sb.append(C86718e.m107548f("R500_250"));
            sb.append(",");
            sb.append(3);
            C78595a.m94982b(10645, sb.toString());
            C76879j.m92739j(EmailVerifyUI.this, C0966R.string.hw7, C0966R.string.hvx, C0966R.string.a18, C0966R.string.f7926wf, new C114919a(), (DialogInterface.OnClickListener) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/EmailVerifyUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.EmailVerifyUI$d */
    public class C114921d implements View.OnClickListener {
        public C114921d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/ui/EmailVerifyUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            EmailVerifyUI emailVerifyUI = EmailVerifyUI.this;
            Util.jump(emailVerifyUI, emailVerifyUI.f344461j);
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/EmailVerifyUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.EmailVerifyUI$e */
    public class C114922e implements MenuItem.OnMenuItemClickListener {
        public C114922e() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            EmailVerifyUI emailVerifyUI = EmailVerifyUI.this;
            int i = EmailVerifyUI.f344454r;
            C78595a.m94985e(emailVerifyUI.f344464p);
            emailVerifyUI.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.EmailVerifyUI$f */
    public class C114923f implements MenuItem.OnMenuItemClickListener {
        public C114923f() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            EmailVerifyUI emailVerifyUI = EmailVerifyUI.this;
            emailVerifyUI.f344463o = emailVerifyUI.f344457f.getText();
            if (Util.isNullOrNil(EmailVerifyUI.this.f344463o) || EmailVerifyUI.this.f344463o.length() != 12) {
                EmailVerifyUI.this.enableOptionMenu(false);
                return true;
            }
            EmailVerifyUI emailVerifyUI2 = EmailVerifyUI.this;
            EmailVerifyUI.m161824H7(emailVerifyUI2, emailVerifyUI2.f344463o);
            return true;
        }
    }

    /* renamed from: H7 */
    public static void m161824H7(EmailVerifyUI emailVerifyUI, String str) {
        if (emailVerifyUI.f344465q) {
            Log.m105924i("MicroMsg.EmailVerifyUI", "is verifying, wait a minute");
            return;
        }
        emailVerifyUI.f344465q = true;
        C59887l0 l0Var = new C59887l0(2, emailVerifyUI.f344460i, emailVerifyUI.f344462n, str);
        C86709a0.m107524d().mo123460f(l0Var);
        emailVerifyUI.f344459h = C76879j.m92723Q(emailVerifyUI, emailVerifyUI.getString(C0966R.string.a3h), emailVerifyUI.getString(C0966R.string.hwd), true, true, new C115138n(emailVerifyUI, l0Var));
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cb_;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.hwf);
        this.f344455d = (TextView) findViewById(C0966R.C0970id.f359482l41);
        this.f344455d.setText(Html.fromHtml(getString(C0966R.string.hvz)));
        this.f344456e = (TextView) findViewById(C0966R.C0970id.f357912ce2);
        String stringExtra = getIntent().getStringExtra("email_address");
        this.f344460i = stringExtra;
        if (!Util.isNullOrNil(stringExtra)) {
            this.f344456e.setText(this.f344460i);
        } else {
            Log.m105928w("MicroMsg.EmailVerifyUI", "email add is null or nill");
        }
        this.f344462n = getIntent().getStringExtra("password");
        String stringExtra2 = getIntent().getStringExtra("email_login_page");
        this.f344461j = stringExtra2;
        Log.m105925i("MicroMsg.EmailVerifyUI", "user register:email add:[%s], password not allowed to printf, login page:[%s]", this.f344460i, stringExtra2);
        MMAutoSwitchEditTextView mMAutoSwitchEditTextView = (MMAutoSwitchEditTextView) findViewById(C0966R.C0970id.a1l);
        this.f344457f = mMAutoSwitchEditTextView;
        mMAutoSwitchEditTextView.setOnInputFinished(new C114916a());
        this.f344457f.setOnTextChanged(new C114917b());
        ((Button) findViewById(C0966R.C0970id.ida)).setOnClickListener(new C114918c());
        this.f344458g = (Button) findViewById(C0966R.C0970id.hm_);
        if (Util.isNullOrNil(this.f344461j) || Util.isNullOrNil(this.f344460i)) {
            this.f344458g.setVisibility(8);
        } else {
            this.f344458g.setVisibility(0);
            this.f344458g.setOnClickListener(new C114921d());
        }
        setBackBtn(new C114922e());
        addTextOptionMenu(0, getString(C0966R.string.f360089a13), new C114923f());
        enableOptionMenu(false);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
        this.f344464p = C78595a.m94981a();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i, keyEvent);
        }
        C78595a.m94985e(this.f344464p);
        finish();
        return true;
    }

    public void onPause() {
        super.onPause();
        C86709a0.m107524d().mo123470p(C82102w.CTRL_INDEX, this);
        StringBuilder sb = new StringBuilder();
        C86709a0.m107523b();
        sb.append(C86718e.m107547e());
        sb.append(",");
        sb.append(getClass().getName());
        sb.append(",");
        sb.append("R500_200");
        sb.append(",");
        C86709a0.m107523b();
        sb.append(C86718e.m107548f("R500_200"));
        sb.append(",");
        sb.append(2);
        C78595a.m94983c(10645, false, sb.toString());
    }

    public void onResume() {
        super.onResume();
        C86709a0.m107524d().mo123455a(C82102w.CTRL_INDEX, this);
        StringBuilder sb = new StringBuilder();
        C86709a0.m107523b();
        sb.append(C86718e.m107547e());
        sb.append(",");
        sb.append(getClass().getName());
        sb.append(",");
        sb.append("R500_200");
        sb.append(",");
        C86709a0.m107523b();
        sb.append(C86718e.m107548f("R500_200"));
        sb.append(",");
        sb.append(1);
        C78595a.m94983c(10645, true, sb.toString());
        C78595a.m94984d("R500_200");
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        boolean z;
        int i3;
        LinkedList<vc4> linkedList;
        Log.m105924i("MicroMsg.EmailVerifyUI", "onSceneEnd: errType = " + i + " errCode = " + i2 + " errMsg = " + str);
        this.f344465q = false;
        ProgressDialog progressDialog = this.f344459h;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f344459h.dismiss();
            this.f344459h = null;
        }
        if (yVar.getType() != 481) {
            Log.m105921e("MicroMsg.EmailVerifyUI", "error cgi type callback:[%d]", Integer.valueOf(yVar.getType()));
            return;
        }
        C59887l0 l0Var = (C59887l0) yVar;
        int i4 = ((C59883a0) l0Var.f170958d.getReqObj()).f170954a.f183416e;
        if (i != 0 || i2 != 0) {
            if (!((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93163uP(this, i, i2, str)) {
                switch (i2) {
                    case APPluginConstants.ERROR_IO_ObjectStreamException_InvalidObjectException:
                        C76701a.makeText((Context) this, (int) C0966R.string.hvv, 0).show();
                        break;
                    case APPluginConstants.ERROR_IO_ObjectStreamException_InvalidClassException:
                        C76879j.m92742m(this, C0966R.string.hvw, C0966R.string.hvx, (DialogInterface.OnClickListener) null);
                        break;
                    case APPluginConstants.ERROR_IO_NoHttpResponseException:
                        C76879j.m92742m(this, C0966R.string.hvy, C0966R.string.hvx, (DialogInterface.OnClickListener) null);
                        StringBuilder sb = new StringBuilder();
                        C86709a0.m107523b();
                        sb.append(C86718e.m107547e());
                        sb.append(",");
                        sb.append(getClass().getName());
                        sb.append(",");
                        sb.append("R500_260");
                        sb.append(",");
                        C86709a0.m107523b();
                        sb.append(C86718e.m107548f("R500_260"));
                        sb.append(",");
                        sb.append(3);
                        C78595a.m94982b(10645, sb.toString());
                        break;
                    default:
                        z = false;
                        break;
                }
            }
            z = true;
            if (!z) {
                if (i4 == 2) {
                    C76701a.makeText((Context) this, (CharSequence) getString(C0966R.string.hwg, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}), 0).show();
                } else if (i4 == 1) {
                    C76701a.makeText((Context) this, (CharSequence) getString(C0966R.string.hw8, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}), 0).show();
                }
            }
        } else if (i4 == 2) {
            C78595a.m94985e("R200_900_email");
            Intent intent = new Intent(this, RegSetInfoUI.class);
            intent.putExtra("regsetinfo_ticket", ((C59887l0.C59888a) l0Var.f170958d).f170962b.f170955a.f183629d);
            intent.putExtra("regsetinfo_user", this.f344460i);
            intent.putExtra("regsetinfo_ismobile", 3);
            d54 d54 = ((C59887l0.C59888a) l0Var.f170958d).f170962b.f170955a.f183632g;
            if (d54 != null && (linkedList = d54.f182633e) != null && linkedList.size() > 0) {
                Iterator<vc4> it = d54.f182633e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    vc4 next = it.next();
                    if (next.f185871d == 1) {
                        i3 = Util.getInt(next.f185872e, 0);
                        break;
                    }
                }
            }
            i3 = 0;
            intent.putExtra("regsetinfo_NextStyle", i3);
            intent.putExtra("regsetinfo_pwd", this.f344462n);
            intent.putExtra("regsetinfo_bind_email", this.f344460i);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/EmailVerifyUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/account/ui/EmailVerifyUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (i4 == 1) {
            StringBuilder sb4 = new StringBuilder();
            C86709a0.m107523b();
            sb4.append(C86718e.m107547e());
            sb4.append(",");
            sb4.append(getClass().getName());
            sb4.append(",");
            sb4.append("R22_resend_email_code_alert");
            sb4.append(",");
            C86709a0.m107523b();
            sb4.append(C86718e.m107548f("R22_resend_email_code_alert"));
            sb4.append(",");
            sb4.append(3);
            C78595a.m94982b(10645, sb4.toString());
            C76879j.m92726T(this, getString(C0966R.string.hw9));
        } else {
            Log.m105920e("MicroMsg.EmailVerifyUI", "err opcode");
        }
    }
}
