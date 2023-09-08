package com.tencent.p014mm.plugin.account.p024ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import bc0.C67216a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.events.LoginDisasterEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.FoldingPhoneLoginTypeStruct;
import com.tencent.p014mm.modelsimple.C114735a0;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.applet.SecurityImage;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.PhoneFormater;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C75576f4;
import f40.C86709a0;
import f40.C86718e;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import kg3.C76577a;
import lg3.C88504k;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p148ei.C7660a;
import p206nj.C76861g;
import p214om.C11502f;
import p910lj.C76701a;
import qe3.C89625d;
import qo3.C89779i0;
import sf0.C118276e;
import sf0.C13665i0;
import wg0.C78595a;

/* renamed from: com.tencent.mm.plugin.account.ui.LoginIndepPass */
public class LoginIndepPass extends MMActivity implements C11385n {

    /* renamed from: t */
    public static final /* synthetic */ int f344551t = 0;

    /* renamed from: d */
    public EditText f344552d;

    /* renamed from: e */
    public ProgressDialog f344553e = null;

    /* renamed from: f */
    public SecurityImage f344554f = null;

    /* renamed from: g */
    public C115135m0 f344555g = new C115135m0();

    /* renamed from: h */
    public String f344556h;

    /* renamed from: i */
    public String f344557i;

    /* renamed from: j */
    public Button f344558j;

    /* renamed from: n */
    public C89779i0 f344559n;

    /* renamed from: o */
    public String f344560o;

    /* renamed from: p */
    public String f344561p;

    /* renamed from: q */
    public String f344562q;

    /* renamed from: r */
    public String f344563r;

    /* renamed from: s */
    public IListener f344564s = new IListener<LoginDisasterEvent>(this, C40008f.f107254d) {
        {
            this.__eventId = -1399051904;
        }

        public boolean callback(IEvent iEvent) {
            LoginDisasterEvent.C114679a aVar;
            LoginDisasterEvent loginDisasterEvent = (LoginDisasterEvent) iEvent;
            if (loginDisasterEvent == null || (aVar = loginDisasterEvent.f343570d) == null) {
                return false;
            }
            Log.m105925i("MicroMsg.LoginIndepPass", "summerdiz loginDisasterListener callback content[%s], url[%s]", aVar.f343571a, aVar.f343572b);
            Intent intent = new Intent();
            intent.putExtra("key_disaster_content", loginDisasterEvent.f343570d.f343571a);
            intent.putExtra("key_disaster_url", loginDisasterEvent.f343570d.f343572b);
            intent.setClass(MMApplicationContext.getContext(), DisasterUI.class).addFlags(268435456);
            Context context = MMApplicationContext.getContext();
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(intent);
            Context context2 = context;
            C117292a.m165358d(context2, aVar2.mo10232b(), "com/tencent/mm/plugin/account/ui/LoginIndepPass$1", "callback", "(Lcom/tencent/mm/autogen/events/LoginDisasterEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/plugin/account/ui/LoginIndepPass$1", "callback", "(Lcom/tencent/mm/autogen/events/LoginDisasterEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
    };

    /* renamed from: com.tencent.mm.plugin.account.ui.LoginIndepPass$d */
    public class C1433d implements Runnable {
        public C1433d() {
        }

        public void run() {
            Log.m105918d("MicroMsg.LoginIndepPass", "onSceneEnd, in runnable");
            Intent b = ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93169b(LoginIndepPass.this);
            b.addFlags(67108864);
            LoginIndepPass loginIndepPass = LoginIndepPass.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(b);
            LoginIndepPass loginIndepPass2 = loginIndepPass;
            C117292a.m165358d(loginIndepPass2, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/LoginIndepPass$14", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            loginIndepPass.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(loginIndepPass2, "com/tencent/mm/plugin/account/ui/LoginIndepPass$14", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            LoginIndepPass.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.LoginIndepPass$a */
    public class C114929a implements C75576f4.C75578b {
        public C114929a(LoginIndepPass loginIndepPass) {
        }

        /* renamed from: a */
        public void mo57753a(C114770g gVar) {
            if (gVar != null) {
                gVar.mo55443A3().mo55422X0(new byte[0], new byte[0], new byte[0], C86709a0.m107523b().mo121110g());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.LoginIndepPass$b */
    public class C114930b implements DialogInterface.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.account.ui.LoginIndepPass$b$a */
        public class C114931a implements DialogInterface.OnCancelListener {

            /* renamed from: d */
            public final /* synthetic */ C114735a0 f344566d;

            public C114931a(C114735a0 a0Var) {
                this.f344566d = a0Var;
            }

            public void onCancel(DialogInterface dialogInterface) {
                C86709a0.m107524d().mo123458d(this.f344566d);
                C86709a0.m107524d().mo123470p(701, LoginIndepPass.this);
                C86709a0.m107524d().mo123470p(252, LoginIndepPass.this);
            }
        }

        public C114930b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105918d("MicroMsg.LoginIndepPass", "imgSid:" + LoginIndepPass.this.f344555g.f345165e + " img len" + LoginIndepPass.this.f344555g.f345167g.length + " " + C76861g.m92660c());
            LoginIndepPass loginIndepPass = LoginIndepPass.this;
            C115135m0 m0Var = loginIndepPass.f344555g;
            C114735a0 a0Var = new C114735a0(m0Var.f345162b, m0Var.f345163c, m0Var.f345168h, loginIndepPass.f344554f.getSecImgCode(), LoginIndepPass.this.f344554f.getSecImgSid(), LoginIndepPass.this.f344554f.getSecImgEncryptKey(), 1, "", false, false);
            C86709a0.m107524d().mo123460f(a0Var);
            LoginIndepPass loginIndepPass2 = LoginIndepPass.this;
            loginIndepPass2.f344553e = C76879j.m92723Q(loginIndepPass2, loginIndepPass2.getString(C0966R.string.a3h), LoginIndepPass.this.getString(C0966R.string.gda), true, true, new C114931a(a0Var));
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.LoginIndepPass$c */
    public class C114932c implements DialogInterface.OnDismissListener {
        public C114932c() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            LoginIndepPass.this.f344554f = null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.LoginIndepPass$e */
    public class C114933e implements DialogInterface.OnClickListener {
        public C114933e(LoginIndepPass loginIndepPass) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.LoginIndepPass$f */
    public class C114934f implements DialogInterface.OnCancelListener {
        public C114934f(LoginIndepPass loginIndepPass) {
        }

        public void onCancel(DialogInterface dialogInterface) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.LoginIndepPass$g */
    public class C114935g implements MenuItem.OnMenuItemClickListener {
        public C114935g() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            LoginIndepPass loginIndepPass = LoginIndepPass.this;
            int i = LoginIndepPass.f344551t;
            loginIndepPass.mo174634H7();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.LoginIndepPass$h */
    public class C114936h implements TextWatcher {
        public C114936h() {
        }

        public void afterTextChanged(Editable editable) {
            LoginIndepPass loginIndepPass = LoginIndepPass.this;
            if (!Util.isNullOrNil(loginIndepPass.f344552d.getText().toString().trim())) {
                loginIndepPass.enableOptionMenu(true);
            } else {
                loginIndepPass.enableOptionMenu(false);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.LoginIndepPass$i */
    public class C114937i implements TextView.OnEditorActionListener {
        public C114937i() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 6 && i != 5) {
                return false;
            }
            LoginIndepPass loginIndepPass = LoginIndepPass.this;
            int i2 = LoginIndepPass.f344551t;
            loginIndepPass.mo174634H7();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.LoginIndepPass$j */
    public class C114938j implements View.OnKeyListener {
        public C114938j() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(keyEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/ui/LoginIndepPass$5", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", this, array);
            if (66 == i && keyEvent.getAction() == 0) {
                LoginIndepPass loginIndepPass = LoginIndepPass.this;
                int i2 = LoginIndepPass.f344551t;
                loginIndepPass.mo174634H7();
                C117292a.m165362h(true, this, "com/tencent/mm/plugin/account/ui/LoginIndepPass$5", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
                return true;
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/account/ui/LoginIndepPass$5", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.LoginIndepPass$k */
    public class C114939k implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.account.ui.LoginIndepPass$k$a */
        public class C114940a implements DialogInterface.OnClickListener {

            /* renamed from: com.tencent.mm.plugin.account.ui.LoginIndepPass$k$a$a */
            public class C114941a implements DialogInterface.OnCancelListener {

                /* renamed from: d */
                public final /* synthetic */ C67216a f344575d;

                public C114941a(C67216a aVar) {
                    this.f344575d = aVar;
                }

                public void onCancel(DialogInterface dialogInterface) {
                    C86709a0.m107524d().mo123458d(this.f344575d);
                    C86709a0.m107524d().mo123470p(701, LoginIndepPass.this);
                    C86709a0.m107524d().mo123470p(252, LoginIndepPass.this);
                }
            }

            public C114940a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C86709a0.m107524d().mo123455a(145, LoginIndepPass.this);
                C67216a aVar = new C67216a(LoginIndepPass.this.f344556h, 16, "", 0, "");
                C86709a0.m107524d().mo123460f(aVar);
                LoginIndepPass loginIndepPass = LoginIndepPass.this;
                loginIndepPass.f344559n = C76879j.m92723Q(loginIndepPass, loginIndepPass.getString(C0966R.string.a3h), LoginIndepPass.this.getString(C0966R.string.f360085a04), true, true, new C114941a(aVar));
            }
        }

        /* renamed from: com.tencent.mm.plugin.account.ui.LoginIndepPass$k$b */
        public class C114942b implements DialogInterface.OnClickListener {
            public C114942b(C114939k kVar) {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }

        public C114939k() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/ui/LoginIndepPass$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            LoginIndepPass loginIndepPass = LoginIndepPass.this;
            C76879j.m92750u(loginIndepPass, LoginIndepPass.this.getString(C0966R.string.hy4) + LoginIndepPass.this.f344557i, LoginIndepPass.this.getString(C0966R.string.hy5), new C114940a(), new C114942b(this));
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/LoginIndepPass$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.LoginIndepPass$l */
    public class C114943l implements MenuItem.OnMenuItemClickListener {
        public C114943l() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            C78595a.m94985e("L200_100");
            Intent intent = new Intent(LoginIndepPass.this, MobileInputUI.class);
            intent.putExtra("mobile_input_purpose", 1);
            intent.addFlags(67108864);
            LoginIndepPass loginIndepPass = LoginIndepPass.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            LoginIndepPass loginIndepPass2 = loginIndepPass;
            C117292a.m165358d(loginIndepPass2, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/LoginIndepPass$7", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            loginIndepPass.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(loginIndepPass2, "com/tencent/mm/plugin/account/ui/LoginIndepPass$7", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            LoginIndepPass.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.LoginIndepPass$m */
    public class C114944m implements Runnable {
        public C114944m() {
        }

        public void run() {
            LoginIndepPass loginIndepPass = LoginIndepPass.this;
            String c = C115135m0.m161943c();
            String d = C115135m0.m161944d();
            int i = LoginIndepPass.f344551t;
            loginIndepPass.getClass();
            if (Util.isNullOrNil(c)) {
                C76879j.m92738i(loginIndepPass, C0966R.string.k_7, C0966R.string.gcw);
            } else if (Util.isNullOrNil(d)) {
                C76879j.m92738i(loginIndepPass, C0966R.string.k9z, C0966R.string.gcw);
            } else {
                loginIndepPass.f344552d.setText(d);
                loginIndepPass.hideVKB();
                C86709a0.m107524d().mo123455a(701, loginIndepPass);
                C86709a0.m107524d().mo123455a(252, loginIndepPass);
                C114735a0 a0Var = new C114735a0(c, d, (String) null, 1);
                C86709a0.m107524d().mo123460f(a0Var);
                loginIndepPass.f344553e = C76879j.m92723Q(loginIndepPass, loginIndepPass.getString(C0966R.string.a3h), loginIndepPass.getString(C0966R.string.gda), true, true, new C115131k0(loginIndepPass, a0Var));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.LoginIndepPass$n */
    public class C114945n implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C114735a0 f344579d;

        public C114945n(LoginIndepPass loginIndepPass, C114735a0 a0Var) {
            this.f344579d = a0Var;
        }

        public void onCancel(DialogInterface dialogInterface) {
            C86709a0.m107524d().mo123458d(this.f344579d);
        }
    }

    /* renamed from: H7 */
    public final void mo174634H7() {
        String obj = this.f344552d.getText().toString();
        if (Util.isNullOrNil(this.f344556h)) {
            C76879j.m92738i(this, C0966R.string.k_7, C0966R.string.gcw);
        } else if (obj.equals("")) {
            C76879j.m92738i(this, C0966R.string.k9z, C0966R.string.gcw);
        } else {
            hideVKB();
            C86709a0.m107524d().mo123455a(701, this);
            C86709a0.m107524d().mo123455a(252, this);
            C114735a0 a0Var = new C114735a0(this.f344556h, obj, (String) null, 1);
            C86709a0.m107524d().mo123460f(a0Var);
            this.f344553e = C76879j.m92723Q(this, getString(C0966R.string.a3h), getString(C0966R.string.gda), true, true, new C114945n(this, a0Var));
        }
    }

    /* renamed from: I7 */
    public boolean mo174635I7(int i, int i2, String str) {
        String str2;
        if (((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93163uP(getContext(), i, i2, str)) {
            return true;
        }
        if (i == 4) {
            if (i2 != -2023) {
                if (i2 == -140) {
                    if (!Util.isNullOrNil(this.f344563r)) {
                        C13665i0.m12972e(getContext(), str, this.f344563r);
                    }
                    return true;
                } else if (i2 != -100) {
                    if (i2 == -9) {
                        C76879j.m92738i(this, C0966R.string.gcv, C0966R.string.gcw);
                        return true;
                    } else if (i2 != -1) {
                        if (i2 == -4 || i2 == -3) {
                            C76879j.m92738i(this, C0966R.string.cbm, C0966R.string.gcw);
                            return true;
                        }
                    } else if (C86709a0.m107524d().mo123467m() != 5) {
                        return false;
                    } else {
                        C76879j.m92738i(this, C0966R.string.h7_, C0966R.string.h79);
                        return true;
                    }
                }
            }
            C86718e.m107550n();
            AppCompatActivity context = getContext();
            C86709a0.m107523b();
            if (TextUtils.isEmpty(C86718e.f251747w)) {
                str2 = C76577a.m92166q(getContext(), C0966R.string.gmc);
            } else {
                C86709a0.m107523b();
                str2 = C86718e.f251747w;
            }
            C76879j.m92719M(context, str2, getContext().getString(C0966R.string.a3h), new C114933e(this), new C114934f(this));
            return true;
        }
        return false;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b8f;
    }

    public void initView() {
        this.f344552d = (EditText) findViewById(C0966R.C0970id.f6h);
        this.f344558j = (Button) findViewById(C0966R.C0970id.g6g);
        enableOptionMenu(false);
        addTextOptionMenu(0, getString(C0966R.string.gd4), new C114935g());
        this.f344552d.addTextChangedListener(new C114936h());
        this.f344552d.setOnEditorActionListener(new C114937i());
        this.f344552d.setOnKeyListener(new C114938j());
        this.f344558j.setText(getString(C0966R.string.gd8));
        this.f344558j.setOnClickListener(new C114939k());
        setBackBtn(new C114943l());
        String stringExtra = getIntent().getStringExtra("auth_ticket");
        this.f344560o = stringExtra;
        if (!Util.isNullOrNil(stringExtra)) {
            new MMHandler().postDelayed(new C114944m(), 500);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Object[] objArr = new Object[3];
        int i3 = 0;
        objArr[0] = Integer.valueOf(i);
        objArr[1] = Integer.valueOf(i2);
        objArr[2] = Boolean.valueOf(intent == null);
        Log.m105919d("MicroMsg.LoginIndepPass", "onActivityResult, requestCode:%d, resultCode:%d, data==null:%b", objArr);
        if (i2 == -1 && i == 1024 && intent != null) {
            String stringExtra = intent.getStringExtra("VoiceLoginAuthPwd");
            int intExtra = intent.getIntExtra("KVoiceHelpCode", 0);
            Object[] objArr2 = new Object[3];
            objArr2[0] = Boolean.valueOf(Util.isNullOrNil(stringExtra));
            if (!Util.isNullOrNil(stringExtra)) {
                i3 = stringExtra.length();
            }
            objArr2[1] = Integer.valueOf(i3);
            objArr2[2] = Integer.valueOf(intExtra);
            Log.m105919d("MicroMsg.LoginIndepPass", "onActivityResult, do voiceprint auth, authPwd is null:%b, authPwd.len:%d, lastErrCode:%d", objArr2);
            if (intExtra == -217) {
                mo174634H7();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String string = getString(C0966R.string.f360972gd2);
        if (C89625d.f257845k || BuildInfo.IS_FLAVOR_BLUE) {
            string = getString(C0966R.string.a0u) + C88504k.m110376b(this);
        }
        setMMTitle(string);
        String stringExtra = getIntent().getStringExtra("bindmcontact_mobile");
        this.f344557i = stringExtra;
        if (stringExtra != null) {
            this.f344556h = PhoneFormater.pureNumber(stringExtra);
        }
        ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93150TO();
        C78595a.m94981a();
        initView();
    }

    public void onDestroy() {
        C86709a0.m107524d().mo123470p(701, this);
        C86709a0.m107524d().mo123470p(252, this);
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
        this.f344564s.dead();
        StringBuilder sb = new StringBuilder();
        C86709a0.m107523b();
        sb.append(C86718e.m107547e());
        sb.append(",");
        sb.append(getClass().getName());
        sb.append(",");
        sb.append("L200_200");
        sb.append(",");
        C86709a0.m107523b();
        sb.append(C86718e.m107548f("L200_200"));
        sb.append(",");
        sb.append(2);
        C78595a.m94983c(10645, false, sb.toString());
    }

    public void onResume() {
        this.f344564s.alive();
        super.onResume();
        StringBuilder sb = new StringBuilder();
        C86709a0.m107523b();
        sb.append(C86718e.m107547e());
        sb.append(",");
        sb.append(getClass().getName());
        sb.append(",");
        sb.append("L200_200");
        sb.append(",");
        C86709a0.m107523b();
        sb.append(C86718e.m107548f("L200_200"));
        sb.append(",");
        sb.append(1);
        C78595a.m94983c(10645, true, sb.toString());
        C78595a.m94984d("L200_200");
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        boolean z;
        C7660a a;
        int i3 = i;
        int i4 = i2;
        String str2 = str;
        Log.m105924i("MicroMsg.LoginIndepPass", "onSceneEnd: errType = " + i3 + " errCode = " + i4 + " errMsg = " + str2);
        ProgressDialog progressDialog = this.f344553e;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f344553e = null;
        }
        C89779i0 i0Var = this.f344559n;
        if (i0Var != null) {
            i0Var.dismiss();
            this.f344559n = null;
        }
        if (yVar.getType() == 252 || yVar.getType() == 701) {
            C114735a0 a0Var = (C114735a0) yVar;
            this.f344563r = a0Var.mo174354j1();
            C86709a0.m107524d().mo123470p(701, this);
            C86709a0.m107524d().mo123470p(252, this);
            this.f344555g.f345165e = a0Var.mo174359o1();
            this.f344555g.f345167g = a0Var.mo174357m1();
            this.f344555g.f345166f = a0Var.mo174358n1();
            this.f344555g.f345168h = a0Var.mo174360p1();
            C115135m0 m0Var = this.f344555g;
            m0Var.f345162b = this.f344556h;
            m0Var.f345163c = this.f344552d.getText().toString();
            if (i4 == -75) {
                C13665i0.m12971d(getContext());
            } else if (i4 == -106) {
                C13665i0.m12970c(this, str2, 0);
            } else if (i4 == -217) {
                C13665i0.m12973f(this, C118276e.m166845a(a0Var), i4);
            } else if (i4 == -205) {
                this.f344560o = a0Var.mo174355k1();
                this.f344561p = a0Var.mo174364t1();
                this.f344562q = a0Var.mo174356l1();
                Log.m105925i("MicroMsg.LoginIndepPass", "summerphone MM_ERR_QQ_OK_NEED_MOBILE authTicket[%s], closeShowStyle[%s]", Util.secPrint(this.f344560o), this.f344562q);
                C115135m0.f345161i = this.f344555g;
                Intent intent = new Intent();
                intent.putExtra("auth_ticket", this.f344560o);
                intent.putExtra("binded_mobile", this.f344561p);
                intent.putExtra("close_safe_device_style", this.f344562q);
                intent.putExtra("from_source", 5);
                ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93189v(this, intent);
            } else if (i4 != -140) {
                if (i3 == 4 && (i4 == -16 || i4 == -17)) {
                    C86709a0.m107524d().mo123460f(new C75576f4(new C114929a(this), (String) null));
                    z = true;
                } else {
                    z = false;
                }
                if (i4 == -6 || i4 == -311 || i4 == -310) {
                    C86709a0.m107524d().mo123455a(701, this);
                    C86709a0.m107524d().mo123455a(252, this);
                    if (this.f344554f == null) {
                        AppCompatActivity context = getContext();
                        C115135m0 m0Var2 = this.f344555g;
                        this.f344554f = SecurityImage.C116047a.m163296a(context, C0966R.string.hyo, m0Var2.f345168h, m0Var2.f345167g, m0Var2.f345165e, m0Var2.f345166f, new C114930b(), (DialogInterface.OnCancelListener) null, new C114932c(), m0Var2);
                        return;
                    }
                    Log.m105918d("MicroMsg.LoginIndepPass", "imgSid:" + this.f344555g.f345165e + " img len" + this.f344555g.f345167g.length + " " + C76861g.m92660c());
                    SecurityImage securityImage = this.f344554f;
                    C115135m0 m0Var3 = this.f344555g;
                    securityImage.mo177230b(m0Var3.f345168h, m0Var3.f345167g, m0Var3.f345165e, m0Var3.f345166f);
                } else if (z || (i3 == 0 && i4 == 0)) {
                    C86718e.m107546E();
                    C13665i0.m12968a(this, this.f344555g.f345162b);
                    C13665i0.m12969b(this, new C1433d(), false, 2);
                    if (C85875k4.m106157N() || C85875k4.m106210y()) {
                        FoldingPhoneLoginTypeStruct foldingPhoneLoginTypeStruct = new FoldingPhoneLoginTypeStruct();
                        foldingPhoneLoginTypeStruct.f107894d = 2;
                        foldingPhoneLoginTypeStruct.mo86054n();
                    }
                } else if (!mo174635I7(i, i2, str)) {
                    if ((yVar.getType() != 252 && yVar.getType() != 701) || (a = C7660a.m7782a(str)) == null || !a.mo8792b(this, (DialogInterface.OnClickListener) null, (DialogInterface.OnClickListener) null)) {
                        C76701a.makeText((Context) this, (CharSequence) getString(C0966R.string.ey_, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}), 0).show();
                    }
                }
            } else if (!Util.isNullOrNil(this.f344563r)) {
                C13665i0.m12972e(this, str2, this.f344563r);
            }
        } else if (yVar.getType() == 145) {
            C86709a0.m107524d().mo123470p(145, this);
            C67216a aVar = (C67216a) yVar;
            String K0 = aVar.mo91363K0();
            if (i4 == -41) {
                C76879j.m92738i(this, C0966R.string.hx6, C0966R.string.hx7);
            } else if (i4 == -75) {
                C76879j.m92748s(this, getString(C0966R.string.f7560jn), "");
            } else {
                C78595a.m94985e("L3");
                StringBuilder sb = new StringBuilder();
                C86709a0.m107523b();
                sb.append(C86718e.m107547e());
                sb.append(",");
                sb.append(getClass().getName());
                sb.append(",");
                sb.append("L3");
                sb.append(",");
                C86709a0.m107523b();
                sb.append(C86718e.m107548f("L3"));
                sb.append(",");
                sb.append(1);
                C78595a.m94983c(10645, true, sb.toString());
                Intent intent2 = new Intent();
                intent2.putExtra("bindmcontact_mobile", this.f344557i);
                intent2.putExtra("bindmcontact_shortmobile", K0);
                intent2.putExtra("mobile_verify_purpose", 1);
                intent2.putExtra("mobileverify_countdownsec", aVar.mo91373k1());
                intent2.putExtra("mobileverify_countdownstyle", aVar.mo91374l1());
                intent2.putExtra("mobileverify_fb", aVar.mo91375m1());
                startActivity(MobileVerifyUI.class, intent2);
            }
        } else if (!mo174635I7(i, i2, str)) {
            if (i3 != 0 || i4 != 0) {
                C76701a.makeText((Context) this, (CharSequence) getString(C0966R.string.ey_, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}), 0).show();
            }
        }
    }
}
