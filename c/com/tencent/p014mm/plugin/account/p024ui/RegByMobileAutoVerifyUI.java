package com.tencent.p014mm.plugin.account.p024ui;

import a70.C112760b;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;
import bc0.C67216a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.mmdata.rpt.mobile_network_registerStruct;
import com.tencent.p014mm.modelavatar.C1295s;
import com.tencent.p014mm.modelsimple.C114739c0;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.applet.SecurityImage;
import com.tencent.p014mm.plugin.report.service.C5139t;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.view.CheckBoxLicenseView;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C75593t5;
import eb0.C7624i3;
import f40.C86709a0;
import f40.C86718e;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p148ei.C7660a;
import p156gj.C87203t;
import p196ln.C117475p;
import p214om.C11502f;
import p72.C35412b;
import p910lj.C76701a;
import qe3.C101131z;
import te3.C64305d33;
import wg0.C78595a;

/* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileAutoVerifyUI */
public class RegByMobileAutoVerifyUI extends MMActivity implements C11385n, C35412b.C35413a {

    /* renamed from: d */
    public String f344822d;

    /* renamed from: e */
    public String f344823e;

    /* renamed from: f */
    public String f344824f;

    /* renamed from: g */
    public String f344825g;

    /* renamed from: h */
    public String f344826h;

    /* renamed from: i */
    public String f344827i;

    /* renamed from: j */
    public String f344828j;

    /* renamed from: n */
    public String f344829n;

    /* renamed from: o */
    public String f344830o;

    /* renamed from: p */
    public boolean f344831p;

    /* renamed from: q */
    public int f344832q;

    /* renamed from: r */
    public String f344833r;

    /* renamed from: s */
    public int f344834s = 2;

    /* renamed from: t */
    public ProgressDialog f344835t;

    /* renamed from: u */
    public SecurityImage f344836u;

    /* renamed from: v */
    public mobile_network_registerStruct f344837v = new mobile_network_registerStruct();

    /* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileAutoVerifyUI$a */
    public class C115003a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C67216a f344838d;

        public C115003a(C67216a aVar) {
            this.f344838d = aVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C86709a0.m107524d().mo123455a(701, RegByMobileAutoVerifyUI.this);
            C86709a0.m107524d().mo123455a(252, RegByMobileAutoVerifyUI.this);
            RegByMobileAutoVerifyUI.m161885I7(RegByMobileAutoVerifyUI.this, this.f344838d.getUsername(), this.f344838d.mo91380q1());
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileAutoVerifyUI$b */
    public class C115004b implements DialogInterface.OnClickListener {
        public C115004b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            RegByMobileAutoVerifyUI.m161884H7(RegByMobileAutoVerifyUI.this);
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileAutoVerifyUI$c */
    public class C115005c implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C114739c0 f344841d;

        /* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileAutoVerifyUI$c$a */
        public class C115006a implements DialogInterface.OnCancelListener {

            /* renamed from: d */
            public final /* synthetic */ C114739c0 f344843d;

            public C115006a(C115005c cVar, C114739c0 c0Var) {
                this.f344843d = c0Var;
            }

            public void onCancel(DialogInterface dialogInterface) {
                C86709a0.m107524d().mo123458d(this.f344843d);
            }
        }

        public C115005c(C114739c0 c0Var) {
            this.f344841d = c0Var;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            RegByMobileAutoVerifyUI regByMobileAutoVerifyUI = RegByMobileAutoVerifyUI.this;
            C114739c0 c0Var = r1;
            C114739c0 c0Var2 = new C114739c0("", regByMobileAutoVerifyUI.f344830o, regByMobileAutoVerifyUI.f344829n, 0, "", regByMobileAutoVerifyUI.f344824f, "", "", regByMobileAutoVerifyUI.f344833r, 1, "", this.f344841d.mo174372k1(), RegByMobileAutoVerifyUI.this.f344836u.getSecImgCode(), true, RegByMobileAutoVerifyUI.this.f344831p);
            C114739c0 c0Var3 = c0Var;
            c0Var3.mo174378q1(RegByMobileAutoVerifyUI.this.f344827i);
            c0Var3.mo174377p1(RegByMobileAutoVerifyUI.this.f344834s);
            C86709a0.m107524d().mo123460f(c0Var3);
            RegByMobileAutoVerifyUI regByMobileAutoVerifyUI2 = RegByMobileAutoVerifyUI.this;
            regByMobileAutoVerifyUI2.f344835t = C76879j.m92723Q(regByMobileAutoVerifyUI2.getContext(), RegByMobileAutoVerifyUI.this.getString(C0966R.string.a3h), RegByMobileAutoVerifyUI.this.getString(C0966R.string.hym), true, true, new C115006a(this, c0Var3));
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileAutoVerifyUI$d */
    public class C115007d implements DialogInterface.OnDismissListener {
        public C115007d() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            RegByMobileAutoVerifyUI.this.f344836u = null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileAutoVerifyUI$e */
    public class C115008e extends SecurityImage.C116049b {

        /* renamed from: b */
        public final /* synthetic */ C114739c0 f344845b;

        public C115008e(C114739c0 c0Var) {
            this.f344845b = c0Var;
        }

        /* renamed from: a */
        public void mo93941a() {
            RegByMobileAutoVerifyUI.this.hideVKB();
            RegByMobileAutoVerifyUI regByMobileAutoVerifyUI = RegByMobileAutoVerifyUI.this;
            C114739c0 c0Var = new C114739c0("", regByMobileAutoVerifyUI.f344830o, regByMobileAutoVerifyUI.f344829n, 0, "", regByMobileAutoVerifyUI.f344824f, "", "", regByMobileAutoVerifyUI.f344833r, 1, "", this.f344845b.mo174372k1(), RegByMobileAutoVerifyUI.this.f344836u.getSecImgCode(), true, RegByMobileAutoVerifyUI.this.f344831p);
            c0Var.mo174378q1(RegByMobileAutoVerifyUI.this.f344827i);
            c0Var.mo174377p1(RegByMobileAutoVerifyUI.this.f344834s);
            C86709a0.m107524d().mo123460f(c0Var);
        }

        /* renamed from: b */
        public void mo93942b() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileAutoVerifyUI$f */
    public class C115009f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C114739c0 f344847d;

        /* renamed from: e */
        public final /* synthetic */ String f344848e;

        public C115009f(C114739c0 c0Var, String str) {
            this.f344847d = c0Var;
            this.f344848e = str;
        }

        public void run() {
            RegByMobileAutoVerifyUI.this.f344833r = this.f344847d.mo174376o1();
            C7624i3.f25910c.mo8756d("login_user_name", this.f344848e);
            C86013q1.m106447h(C112760b.m154235i() + "temp.avatar");
            Intent b = ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93169b(RegByMobileAutoVerifyUI.this);
            b.addFlags(67108864);
            RegByMobileAutoVerifyUI regByMobileAutoVerifyUI = RegByMobileAutoVerifyUI.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(b);
            RegByMobileAutoVerifyUI regByMobileAutoVerifyUI2 = regByMobileAutoVerifyUI;
            C117292a.m165358d(regByMobileAutoVerifyUI2, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/RegByMobileAutoVerifyUI$15", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            regByMobileAutoVerifyUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(regByMobileAutoVerifyUI2, "com/tencent/mm/plugin/account/ui/RegByMobileAutoVerifyUI$15", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            StringBuilder sb = new StringBuilder();
            C86709a0.m107523b();
            sb.append(C86718e.m107547e());
            sb.append(",");
            sb.append(C115009f.class.getName());
            sb.append(",");
            sb.append("R200_600");
            sb.append(",");
            C86709a0.m107523b();
            sb.append(C86718e.m107548f("R200_600"));
            sb.append(",");
            sb.append(4);
            C78595a.m94982b(10645, sb.toString());
            RegByMobileAutoVerifyUI.this.mo174750J7();
            RegByMobileAutoVerifyUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileAutoVerifyUI$g */
    public class C115010g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C114739c0 f344850d;

        /* renamed from: e */
        public final /* synthetic */ String f344851e;

        public C115010g(C114739c0 c0Var, String str) {
            this.f344850d = c0Var;
            this.f344851e = str;
        }

        public void run() {
            RegByMobileAutoVerifyUI.this.f344833r = this.f344850d.mo174376o1();
            C7624i3.f25910c.mo8756d("login_user_name", this.f344851e);
            Intent b = ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93169b(RegByMobileAutoVerifyUI.this);
            b.addFlags(67108864);
            RegByMobileAutoVerifyUI regByMobileAutoVerifyUI = RegByMobileAutoVerifyUI.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(b);
            RegByMobileAutoVerifyUI regByMobileAutoVerifyUI2 = regByMobileAutoVerifyUI;
            C117292a.m165358d(regByMobileAutoVerifyUI2, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/RegByMobileAutoVerifyUI$16", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            regByMobileAutoVerifyUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(regByMobileAutoVerifyUI2, "com/tencent/mm/plugin/account/ui/RegByMobileAutoVerifyUI$16", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            StringBuilder sb = new StringBuilder();
            C86709a0.m107523b();
            sb.append(C86718e.m107547e());
            sb.append(",");
            sb.append(C115010g.class.getName());
            sb.append(",");
            sb.append("R200_600");
            sb.append(",");
            C86709a0.m107523b();
            sb.append(C86718e.m107548f("R200_600"));
            sb.append(",");
            sb.append(4);
            C78595a.m94982b(10645, sb.toString());
            RegByMobileAutoVerifyUI.this.mo174750J7();
            RegByMobileAutoVerifyUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileAutoVerifyUI$h */
    public class C115011h implements MenuItem.OnMenuItemClickListener {
        public C115011h() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            RegByMobileAutoVerifyUI.this.onBackPressed();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileAutoVerifyUI$i */
    public class C115012i implements View.OnClickListener {
        public C115012i() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/ui/RegByMobileAutoVerifyUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            RegByMobileAutoVerifyUI regByMobileAutoVerifyUI = RegByMobileAutoVerifyUI.this;
            if (regByMobileAutoVerifyUI.f344834s != 2) {
                regByMobileAutoVerifyUI.f344835t = C76879j.m92723Q(regByMobileAutoVerifyUI, regByMobileAutoVerifyUI.getString(C0966R.string.a3h), regByMobileAutoVerifyUI.getString(C0966R.string.a4d), true, false, (DialogInterface.OnCancelListener) null);
                C67216a aVar = new C67216a(regByMobileAutoVerifyUI.f344824f, 14, "", 0, "", 2);
                aVar.mo91367W(regByMobileAutoVerifyUI.f344827i);
                C86709a0.m107524d().mo123460f(aVar);
            } else {
                regByMobileAutoVerifyUI.mo174751K7();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/RegByMobileAutoVerifyUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileAutoVerifyUI$j */
    public class C115013j implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        public final /* synthetic */ Button f344855a;

        public C115013j(Button button) {
            this.f344855a = button;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                mobile_network_registerStruct mobile_network_registerstruct = RegByMobileAutoVerifyUI.this.f344837v;
                mobile_network_registerstruct.f343880g = 1;
                mobile_network_registerstruct.mo86054n();
            }
            this.f344855a.setEnabled(z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileAutoVerifyUI$k */
    public class C115014k implements View.OnClickListener {
        public C115014k() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/ui/RegByMobileAutoVerifyUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            mobile_network_registerStruct mobile_network_registerstruct = RegByMobileAutoVerifyUI.this.f344837v;
            mobile_network_registerstruct.f343880g = 2;
            mobile_network_registerstruct.mo86054n();
            RegByMobileAutoVerifyUI.m161884H7(RegByMobileAutoVerifyUI.this);
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/RegByMobileAutoVerifyUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileAutoVerifyUI$l */
    public class C115015l implements DialogInterface.OnCancelListener {
        public C115015l() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            ((C35412b) C86312j.m106911c(C35412b.class)).h90(RegByMobileAutoVerifyUI.this.f344828j);
            RegByMobileAutoVerifyUI.this.f344835t.dismiss();
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileAutoVerifyUI$m */
    public class C115016m implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Bundle f344859d;

        /* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileAutoVerifyUI$m$a */
        public class C115017a implements DialogInterface.OnClickListener {
            public C115017a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                RegByMobileAutoVerifyUI.m161884H7(RegByMobileAutoVerifyUI.this);
            }
        }

        public C115016m(Bundle bundle) {
            this.f344859d = bundle;
        }

        public void run() {
            String string = this.f344859d.getString("session", "");
            if (!Util.isNullOrNil(string) && string.equals(RegByMobileAutoVerifyUI.this.f344828j)) {
                String string2 = this.f344859d.getString(XWalkReaderBasePlugin.PARAM_KEY_TOKEN, "");
                Log.m105925i("MicroMsg.RegByMobileAutoVerifyUI", "reg, get mobile token %s", string2);
                if (!Util.isNullOrNil(string2)) {
                    RegByMobileAutoVerifyUI regByMobileAutoVerifyUI = RegByMobileAutoVerifyUI.this;
                    if (regByMobileAutoVerifyUI.f344834s == 2) {
                        C67216a aVar = new C67216a(regByMobileAutoVerifyUI.f344824f, 15, "", 0, "");
                        aVar.mo91367W(regByMobileAutoVerifyUI.f344827i);
                        ((C101131z) aVar.f193010d.getReqObj()).f296026a.f227376v = 2;
                        C64305d33 d332 = new C64305d33();
                        d332.f182629d = regByMobileAutoVerifyUI.f344825g;
                        d332.f182631f = string2;
                        ((C101131z) aVar.f193010d.getReqObj()).f296026a.f227356B = d332;
                        C86709a0.m107524d().mo123460f(aVar);
                        return;
                    }
                    return;
                }
                mobile_network_registerStruct mobile_network_registerstruct = RegByMobileAutoVerifyUI.this.f344837v;
                mobile_network_registerstruct.f343880g = 3;
                mobile_network_registerstruct.f343881h = 2;
                mobile_network_registerstruct.mo86054n();
                ProgressDialog progressDialog = RegByMobileAutoVerifyUI.this.f344835t;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                }
                RegByMobileAutoVerifyUI regByMobileAutoVerifyUI2 = RegByMobileAutoVerifyUI.this;
                C76879j.m92711E(regByMobileAutoVerifyUI2, regByMobileAutoVerifyUI2.getString(C0966R.string.hwy), "", RegByMobileAutoVerifyUI.this.getString(C0966R.string.f8028zq), false, new C115017a());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileAutoVerifyUI$n */
    public class C115018n implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C114739c0 f344862d;

        public C115018n(C114739c0 c0Var) {
            this.f344862d = c0Var;
        }

        public void onCancel(DialogInterface dialogInterface) {
            C86709a0.m107524d().mo123458d(this.f344862d);
            C86709a0.m107524d().mo123470p(126, RegByMobileAutoVerifyUI.this);
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileAutoVerifyUI$o */
    public class C115019o implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C67216a f344864d;

        public C115019o(C67216a aVar) {
            this.f344864d = aVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C86709a0.m107524d().mo123455a(701, RegByMobileAutoVerifyUI.this);
            C86709a0.m107524d().mo123455a(252, RegByMobileAutoVerifyUI.this);
            RegByMobileAutoVerifyUI.m161885I7(RegByMobileAutoVerifyUI.this, this.f344864d.getUsername(), this.f344864d.mo91380q1());
        }
    }

    /* renamed from: H7 */
    public static void m161884H7(RegByMobileAutoVerifyUI regByMobileAutoVerifyUI) {
        regByMobileAutoVerifyUI.f344835t = C76879j.m92723Q(regByMobileAutoVerifyUI, regByMobileAutoVerifyUI.getString(C0966R.string.a3h), regByMobileAutoVerifyUI.getString(C0966R.string.a4d), true, false, (DialogInterface.OnCancelListener) null);
        C67216a aVar = new C67216a(regByMobileAutoVerifyUI.f344824f, 14, "", 0, "", 1);
        aVar.mo91367W(regByMobileAutoVerifyUI.f344827i);
        C86709a0.m107524d().mo123460f(aVar);
    }

    /* renamed from: I7 */
    public static void m161885I7(RegByMobileAutoVerifyUI regByMobileAutoVerifyUI, String str, String str2) {
        regByMobileAutoVerifyUI.getClass();
        C86709a0.m107524d().mo123455a(701, regByMobileAutoVerifyUI);
        C86709a0.m107524d().mo123455a(252, regByMobileAutoVerifyUI);
        new C115203z0(new C115187t2(regByMobileAutoVerifyUI), str, str2, regByMobileAutoVerifyUI.f344824f).mo174958b(regByMobileAutoVerifyUI);
    }

    /* renamed from: J7 */
    public final void mo174750J7() {
        if (C75593t5.f222076d) {
            C75593t5.f222075c.mo105938a(C75592q0.m90789s());
            C75593t5.f222075c.mo105945h(C75592q0.m90789s(), C75592q0.m90788r());
            C75593t5.f222076d = false;
        }
    }

    /* renamed from: K1 */
    public void mo60247K1(Bundle bundle) {
        MMHandlerThread.postToMainThread(new C115016m(bundle));
    }

    /* renamed from: K7 */
    public final void mo174751K7() {
        ((C35412b) C86312j.m106911c(C35412b.class)).mo59876Su(this.f344828j, this.f344826h, this);
        this.f344835t = C76879j.m92723Q(this, "", getString(C0966R.string.al4), true, true, new C115015l());
    }

    public int getLayoutId() {
        return C0966R.C0971layout.br4;
    }

    public void initView() {
        Button button = (Button) findViewById(C0966R.C0970id.hfe);
        button.setOnClickListener(new C115012i());
        CheckBoxLicenseView checkBoxLicenseView = (CheckBoxLicenseView) findViewById(C0966R.C0970id.iju);
        checkBoxLicenseView.setTermTip(getString(C0966R.string.f361180hx3));
        checkBoxLicenseView.setCheckStateChangeListener(new C115013j(button));
        ((TextView) findViewById(C0966R.C0970id.ijv)).setText(getString(C0966R.string.f361177hx0, new Object[]{this.f344824f}));
        ((TextView) findViewById(C0966R.C0970id.f359049ik2)).setOnClickListener(new C115014k());
    }

    public void onBackPressed() {
        mobile_network_registerStruct mobile_network_registerstruct = this.f344837v;
        mobile_network_registerstruct.f343880g = 4;
        mobile_network_registerstruct.mo86054n();
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("");
        setActionbarColor(getResources().getColor(C0966R.color.al6));
        hideActionbarLine();
        this.f344822d = getIntent().getStringExtra("Key_Mobile");
        this.f344823e = getIntent().getStringExtra("Key_CountryCode");
        this.f344824f = this.f344823e + this.f344822d;
        this.f344825g = getIntent().getStringExtra("Key_Seq");
        this.f344826h = getIntent().getStringExtra("Key_Url");
        this.f344827i = getIntent().getStringExtra("Key_reg_sessionId");
        this.f344828j = System.currentTimeMillis() + "_" + this.f344825g;
        this.f344829n = getIntent().getStringExtra("kintent_nickname");
        this.f344830o = getIntent().getStringExtra("kintent_password");
        this.f344832q = getIntent().getIntExtra("key_reg_style", 1);
        boolean booleanExtra = getIntent().getBooleanExtra("kintent_hasavatar", false);
        this.f344831p = booleanExtra;
        Log.m105925i("MicroMsg.RegByMobileAutoVerifyUI", "mobile (%s,%s), seq %s, verifyUrl %s, regNickname %s, hasSetAvatar %s", this.f344823e, this.f344822d, this.f344825g, this.f344826h, this.f344829n, Boolean.valueOf(booleanExtra));
        initView();
        setBackBtn(new C115011h());
        this.f344837v.f343877d = System.currentTimeMillis();
        mobile_network_registerStruct mobile_network_registerstruct = this.f344837v;
        mobile_network_registerstruct.f343879f = mobile_network_registerstruct.mo86045b("DeviceID", C87203t.m108278n(), true);
        mobile_network_registerStruct mobile_network_registerstruct2 = this.f344837v;
        mobile_network_registerstruct2.f343878e = mobile_network_registerstruct2.mo86045b("RegisterMobile", this.f344824f, true);
        C86709a0.m107524d().mo123455a(126, this);
        C86709a0.m107524d().mo123455a(145, this);
    }

    public void onDestroy() {
        super.onDestroy();
        ((C35412b) C86312j.m106911c(C35412b.class)).h90(this.f344828j);
        C86709a0.m107524d().mo123470p(126, this);
        C86709a0.m107524d().mo123470p(145, this);
        C86709a0.m107524d().mo123470p(701, this);
        C86709a0.m107524d().mo123470p(252, this);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        int i3 = i;
        int i4 = i2;
        String str2 = str;
        Class cls = C11502f.class;
        Log.m105925i("MicroMsg.RegByMobileAutoVerifyUI", "scene %s, onSceneEnd: errType %d, errCode %d, errMsg %s", yVar, Integer.valueOf(i), Integer.valueOf(i2), str2);
        ProgressDialog progressDialog = this.f344835t;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f344835t = null;
        }
        if (yVar.getType() == 145) {
            C67216a aVar = (C67216a) yVar;
            int f = aVar.mo91368f();
            Log.m105925i("MicroMsg.RegByMobileAutoVerifyUI", "BindMobileForReg OpCode %d", Integer.valueOf(f));
            if (f == 14) {
                if (i4 == 0) {
                    int j1 = aVar.mo91372j1();
                    this.f344834s = j1;
                    Log.m105925i("MicroMsg.RegByMobileAutoVerifyUI", "mobile check type %d", Integer.valueOf(j1));
                    int i5 = this.f344834s;
                    if (i5 == 2) {
                        C64305d33 d332 = ((C67216a.C67220c) aVar.f193010d).f193017b.f353291a.f227438C;
                        this.f344825g = d332.f182629d;
                        this.f344826h = d332.f182630e;
                        this.f344828j = System.currentTimeMillis() + "_" + this.f344825g;
                        mo174751K7();
                    } else if (i5 == 1) {
                        mobile_network_registerStruct mobile_network_registerstruct = this.f344837v;
                        mobile_network_registerstruct.f343880g = 3;
                        mobile_network_registerstruct.f343881h = 2;
                        mobile_network_registerstruct.mo86054n();
                        C114799u uVar = aVar.f193010d;
                        String str3 = ((C67216a.C67220c) uVar).f193017b.f353291a.f227459y;
                        String str4 = ((C67216a.C67220c) uVar).f193017b.f353291a.f227458x;
                        Intent intent = new Intent(this, RegByMobileSendSmsUI.class);
                        intent.putExtra("regsession_id", this.f344827i);
                        intent.putExtra("key_reg_style", 1);
                        intent.putExtra("from_mobile", this.f344824f);
                        intent.putExtra("to_mobile", str3);
                        intent.putExtra("verify_code", str4);
                        intent.putExtra("kintent_nickname", this.f344829n);
                        intent.putExtra("kintent_password", this.f344830o);
                        intent.putExtra("kintent_hasavatar", this.f344831p);
                        C9556a aVar2 = new C9556a();
                        aVar2.mo10233c(intent);
                        C117292a.m165358d(this, aVar2.mo10232b(), "com/tencent/mm/plugin/account/ui/RegByMobileAutoVerifyUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        startActivity((Intent) aVar2.mo10231a(0));
                        C117292a.m165359e(this, "com/tencent/mm/plugin/account/ui/RegByMobileAutoVerifyUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    } else {
                        mobile_network_registerStruct mobile_network_registerstruct2 = this.f344837v;
                        mobile_network_registerstruct2.f343880g = 3;
                        mobile_network_registerstruct2.f343881h = 2;
                        mobile_network_registerstruct2.mo86054n();
                        int k1 = aVar.mo91373k1();
                        int l1 = aVar.mo91374l1();
                        Intent intent2 = new Intent();
                        intent2.putExtra("bindmcontact_mobile", this.f344824f);
                        intent2.putExtra("bindmcontact_shortmobile", this.f344822d);
                        intent2.putExtra("couttry_code", this.f344823e);
                        intent2.putExtra("mobileverify_countdownsec", k1);
                        intent2.putExtra("mobileverify_countdownstyle", l1);
                        intent2.putExtra("kintent_hasavatar", this.f344831p);
                        intent2.putExtra("kintent_nickname", this.f344829n);
                        intent2.putExtra("kintent_password", this.f344830o);
                        intent2.putExtra("key_reg_style", this.f344832q);
                        intent2.putExtra("regsession_id", this.f344827i);
                        intent2.putExtra("mobile_verify_purpose", 2);
                        startActivity(MobileVerifyUI.class, intent2);
                        finish();
                    }
                } else if (i4 == -41) {
                    C76879j.m92738i(this, C0966R.string.hx6, C0966R.string.hx7);
                    return;
                } else if (i4 == -34) {
                    C76879j.m92748s(this, getString(C0966R.string.ajx), "");
                    return;
                }
            } else if (f == 15) {
                this.f344833r = aVar.mo91381r1();
                if (i4 == 0) {
                    mobile_network_registerStruct mobile_network_registerstruct3 = this.f344837v;
                    mobile_network_registerstruct3.f343880g = 3;
                    mobile_network_registerstruct3.f343881h = 1;
                    mobile_network_registerstruct3.mo86054n();
                    if (this.f344832q == 1) {
                        C86709a0.m107524d().mo123455a(126, this);
                        C114739c0 c0Var = new C114739c0("", this.f344830o, this.f344829n, 0, "", this.f344824f, "", "", this.f344833r, 1, "", "", "", true, this.f344831p);
                        c0Var.mo174378q1(this.f344827i);
                        c0Var.mo174377p1(this.f344834s);
                        C86709a0.m107524d().mo123460f(c0Var);
                        this.f344835t = C76879j.m92723Q(this, getString(C0966R.string.a3h), getString(C0966R.string.hym), true, true, new C115018n(c0Var));
                    } else {
                        Intent intent3 = new Intent();
                        intent3.putExtra("regsetinfo_ticket", this.f344833r);
                        intent3.putExtra("regsetinfo_user", this.f344824f);
                        intent3.putExtra("regsession_id", this.f344827i);
                        intent3.putExtra("mobile_check_type", 1);
                        intent3.putExtra("regsetinfo_ismobile", 4);
                        intent3.putExtra("regsetinfo_NextControl", aVar.mo91377o1());
                        intent3.putExtra("key_reg_style", this.f344832q);
                        intent3.setClass(this, RegSetInfoUI.class);
                        C9556a aVar3 = new C9556a();
                        aVar3.mo10233c(intent3);
                        C117292a.m165358d(this, aVar3.mo10232b(), "com/tencent/mm/plugin/account/ui/RegByMobileAutoVerifyUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        startActivity((Intent) aVar3.mo10231a(0));
                        C117292a.m165359e(this, "com/tencent/mm/plugin/account/ui/RegByMobileAutoVerifyUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    }
                } else if (i4 == -35) {
                    mobile_network_registerStruct mobile_network_registerstruct4 = this.f344837v;
                    mobile_network_registerstruct4.f343880g = 3;
                    mobile_network_registerstruct4.f343881h = 2;
                    mobile_network_registerstruct4.mo86054n();
                    C7660a a = C7660a.m7782a(str);
                    if (a != null) {
                        a.mo8792b(this, new C115019o(aVar), (DialogInterface.OnClickListener) null);
                    } else {
                        C76879j.m92750u(this, getString(C0966R.string.ajf), (String) null, new C115003a(aVar), (DialogInterface.OnClickListener) null);
                    }
                } else if (i4 == -212) {
                    mobile_network_registerStruct mobile_network_registerstruct5 = this.f344837v;
                    mobile_network_registerstruct5.f343880g = 3;
                    mobile_network_registerstruct5.f343881h = 2;
                    mobile_network_registerstruct5.mo86054n();
                    Intent intent4 = new Intent(this, MobileLoginOrForceReg.class);
                    intent4.putExtra("ticket", this.f344833r);
                    intent4.putExtra("moble", this.f344824f);
                    intent4.putExtra("regsession_id", this.f344827i);
                    intent4.putExtra("next_controll", aVar.mo91377o1());
                    intent4.putExtra("username", aVar.getUsername());
                    intent4.putExtra("password", aVar.mo91380q1());
                    intent4.putExtra("nickname", aVar.mo91362I());
                    intent4.putExtra("avatar_url", aVar.mo91379q0());
                    intent4.putExtra("mobile_check_type", this.f344834s);
                    intent4.putExtra("kintent_hasavatar", this.f344831p);
                    intent4.putExtra("kintent_nickname", this.f344829n);
                    intent4.putExtra("kintent_password", this.f344830o);
                    intent4.putExtra("key_reg_style", this.f344832q);
                    intent4.putExtra("need_do_post_check", aVar.mo91376n1());
                    C9556a aVar4 = new C9556a();
                    aVar4.mo10233c(intent4);
                    C117292a.m165358d(this, aVar4.mo10232b(), "com/tencent/mm/plugin/account/ui/RegByMobileAutoVerifyUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((Intent) aVar4.mo10231a(0));
                    C117292a.m165359e(this, "com/tencent/mm/plugin/account/ui/RegByMobileAutoVerifyUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else if (i4 == -449 || i4 == -450 || i4 == -451) {
                    mobile_network_registerStruct mobile_network_registerstruct6 = this.f344837v;
                    mobile_network_registerstruct6.f343880g = 3;
                    mobile_network_registerstruct6.f343881h = 2;
                    mobile_network_registerstruct6.mo86054n();
                    C76879j.m92711E(this, getString(C0966R.string.hwy), "", getString(C0966R.string.f8028zq), false, new C115004b());
                    return;
                } else {
                    mobile_network_registerStruct mobile_network_registerstruct7 = this.f344837v;
                    mobile_network_registerstruct7.f343880g = 3;
                    mobile_network_registerstruct7.f343881h = 2;
                    mobile_network_registerstruct7.mo86054n();
                    C76701a.makeText((Context) this, (CharSequence) getString(C0966R.string.al8, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}), 0).show();
                }
            }
        } else if (yVar.getType() == 126) {
            C114739c0 c0Var2 = (C114739c0) yVar;
            if (i4 == -6 || i4 == -311 || i4 == -310) {
                SecurityImage securityImage = this.f344836u;
                if (securityImage == null) {
                    this.f344836u = SecurityImage.C116047a.m163296a(this, C0966R.string.hyo, 0, c0Var2.mo174371j1(), c0Var2.mo174372k1(), "", new C115005c(c0Var2), (DialogInterface.OnCancelListener) null, new C115007d(), new C115008e(c0Var2));
                    return;
                }
                securityImage.mo177230b(0, c0Var2.mo174371j1(), c0Var2.mo174372k1(), "");
                return;
            } else if (i3 == 0 && i4 == 0) {
                String str5 = this.f344824f;
                C86718e.m107546E();
                C86718e.f251744t = true;
                C5139t.m5183e(1, 8);
                C5139t.m5183e(1, 3);
                C5139t.m5183e(1, 1);
                if (this.f344831p) {
                    String str6 = C112760b.m154235i() + "temp.avatar";
                    String str7 = C112760b.m154235i() + "temp.avatar.hd";
                    C86013q1.m106463x(str6, str7);
                    C86013q1.m106447h(str6);
                    BitmapUtil.createThumbNail(str7, 156, 156, Bitmap.CompressFormat.JPEG, 90, str6, true);
                    ((C1295s) ((C117475p) C86312j.m106911c(C117475p.class)).mo182091fC(this, C112760b.m154235i() + "temp.avatar", true)).mo1219a(1, new C115009f(c0Var2, str5), new C115010g(c0Var2, str5));
                    return;
                }
                this.f344833r = c0Var2.mo174376o1();
                C7624i3.f25910c.mo8756d("login_user_name", str5);
                Intent b = ((C67654r1) ((C11502f) C86312j.m106911c(cls)).mo11462yM()).mo93169b(this);
                b.addFlags(67108864);
                b.putExtra("LauncherUI.enter_from_reg", true);
                C9556a aVar5 = new C9556a();
                aVar5.mo10233c(b);
                C117292a.m165358d(this, aVar5.mo10232b(), "com/tencent/mm/plugin/account/ui/RegByMobileAutoVerifyUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((Intent) aVar5.mo10231a(0));
                C117292a.m165359e(this, "com/tencent/mm/plugin/account/ui/RegByMobileAutoVerifyUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                mo174750J7();
                finish();
                C78595a.m94985e("RE900_100");
                StringBuilder sb = new StringBuilder();
                C86709a0.m107523b();
                sb.append(C86718e.m107547e());
                sb.append(",");
                sb.append(getClass().getName());
                sb.append(",");
                sb.append("R200_600");
                sb.append(",");
                C86709a0.m107523b();
                sb.append(C86718e.m107548f("R200_600"));
                sb.append(",");
                sb.append(4);
                C78595a.m94983c(10645, false, sb.toString());
                return;
            }
        }
        C7660a a2 = C7660a.m7782a(str);
        if (a2 == null || !a2.mo8792b(this, (DialogInterface.OnClickListener) null, (DialogInterface.OnClickListener) null)) {
            ((C11502f) C86312j.m106911c(cls)).mo11461Sr().mo93163uP(this, i3, i4, str2);
        }
    }
}
