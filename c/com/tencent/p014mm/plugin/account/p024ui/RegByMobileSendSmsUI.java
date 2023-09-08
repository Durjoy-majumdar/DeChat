package com.tencent.p014mm.plugin.account.p024ui;

import a70.C112760b;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import bc0.C67216a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.mmdata.rpt.ThirdAppRegisterStruct;
import com.tencent.p014mm.modelavatar.C1295s;
import com.tencent.p014mm.modelsimple.C114739c0;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.applet.SecurityImage;
import com.tencent.p014mm.plugin.report.service.C5139t;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import de3.C75375u;
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
import wg0.C78595a;

/* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileSendSmsUI */
public class RegByMobileSendSmsUI extends MMActivity implements C11385n {

    /* renamed from: z */
    public static final /* synthetic */ int f344929z = 0;

    /* renamed from: d */
    public String f344930d = "";

    /* renamed from: e */
    public String f344931e = "";

    /* renamed from: f */
    public String f344932f = "";

    /* renamed from: g */
    public String f344933g = "";

    /* renamed from: h */
    public String f344934h;

    /* renamed from: i */
    public String f344935i;

    /* renamed from: j */
    public boolean f344936j;

    /* renamed from: n */
    public ProgressDialog f344937n;

    /* renamed from: o */
    public int f344938o;

    /* renamed from: p */
    public Button f344939p;

    /* renamed from: q */
    public Button f344940q;

    /* renamed from: r */
    public MTimerHandler f344941r;

    /* renamed from: s */
    public int f344942s = 15;

    /* renamed from: t */
    public SecurityImage f344943t;

    /* renamed from: u */
    public String f344944u;

    /* renamed from: v */
    public int f344945v;

    /* renamed from: w */
    public String f344946w;

    /* renamed from: x */
    public int f344947x;

    /* renamed from: y */
    public ThirdAppRegisterStruct f344948y = new ThirdAppRegisterStruct();

    /* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileSendSmsUI$f */
    public class C1452f implements View.OnClickListener {
        public C1452f() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/ui/RegByMobileSendSmsUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SENDTO");
            intent.setData(Uri.parse("smsto:" + RegByMobileSendSmsUI.this.f344932f));
            intent.putExtra("sms_body", RegByMobileSendSmsUI.this.f344931e);
            try {
                RegByMobileSendSmsUI regByMobileSendSmsUI = RegByMobileSendSmsUI.this;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(regByMobileSendSmsUI, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/RegByMobileSendSmsUI$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                regByMobileSendSmsUI.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(regByMobileSendSmsUI, "com/tencent/mm/plugin/account/ui/RegByMobileSendSmsUI$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                RegByMobileSendSmsUI.this.overridePendingTransition(C0966R.C0968anim.f2503er, C0966R.C0968anim.f2498em);
            } catch (Exception e) {
                Log.m105920e("MicroMsg.RegByMobileSendSmsUI", e.getMessage());
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/RegByMobileSendSmsUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileSendSmsUI$a */
    public class C115037a implements DialogInterface.OnDismissListener {
        public C115037a() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            RegByMobileSendSmsUI.this.f344943t = null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileSendSmsUI$b */
    public class C115038b extends SecurityImage.C116049b {

        /* renamed from: b */
        public final /* synthetic */ C114739c0 f344950b;

        public C115038b(C114739c0 c0Var) {
            this.f344950b = c0Var;
        }

        /* renamed from: a */
        public void mo93941a() {
            RegByMobileSendSmsUI.this.hideVKB();
            RegByMobileSendSmsUI regByMobileSendSmsUI = RegByMobileSendSmsUI.this;
            C114739c0 c0Var = new C114739c0("", regByMobileSendSmsUI.f344934h, regByMobileSendSmsUI.f344935i, 0, "", regByMobileSendSmsUI.f344930d, "", "", regByMobileSendSmsUI.f344944u, 1, "", this.f344950b.mo174372k1(), RegByMobileSendSmsUI.this.f344943t.getSecImgCode(), true, RegByMobileSendSmsUI.this.f344936j);
            c0Var.mo174378q1(RegByMobileSendSmsUI.this.f344933g);
            c0Var.mo174379r1(RegByMobileSendSmsUI.this.f344946w);
            c0Var.mo174377p1(1);
            C86709a0.m107524d().mo123460f(c0Var);
        }

        /* renamed from: b */
        public void mo93942b() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileSendSmsUI$c */
    public class C115039c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C114739c0 f344952d;

        /* renamed from: e */
        public final /* synthetic */ String f344953e;

        public C115039c(C114739c0 c0Var, String str) {
            this.f344952d = c0Var;
            this.f344953e = str;
        }

        public void run() {
            RegByMobileSendSmsUI.this.f344944u = this.f344952d.mo174376o1();
            C7624i3.f25910c.mo8756d("login_user_name", this.f344953e);
            C86013q1.m106447h(C112760b.m154235i() + "temp.avatar");
            Intent b = ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93169b(RegByMobileSendSmsUI.this);
            b.addFlags(67108864);
            RegByMobileSendSmsUI regByMobileSendSmsUI = RegByMobileSendSmsUI.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(b);
            RegByMobileSendSmsUI regByMobileSendSmsUI2 = regByMobileSendSmsUI;
            C117292a.m165358d(regByMobileSendSmsUI2, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/RegByMobileSendSmsUI$12", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            regByMobileSendSmsUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(regByMobileSendSmsUI2, "com/tencent/mm/plugin/account/ui/RegByMobileSendSmsUI$12", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            StringBuilder sb = new StringBuilder();
            C86709a0.m107523b();
            sb.append(C86718e.m107547e());
            sb.append(",");
            sb.append(C115039c.class.getName());
            sb.append(",");
            sb.append("R200_600");
            sb.append(",");
            C86709a0.m107523b();
            sb.append(C86718e.m107548f("R200_600"));
            sb.append(",");
            sb.append(4);
            C78595a.m94982b(10645, sb.toString());
            RegByMobileSendSmsUI.this.finish();
            RegByMobileSendSmsUI.this.mo174794I7();
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileSendSmsUI$d */
    public class C115040d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C114739c0 f344955d;

        /* renamed from: e */
        public final /* synthetic */ String f344956e;

        public C115040d(C114739c0 c0Var, String str) {
            this.f344955d = c0Var;
            this.f344956e = str;
        }

        public void run() {
            RegByMobileSendSmsUI.this.f344944u = this.f344955d.mo174376o1();
            C7624i3.f25910c.mo8756d("login_user_name", this.f344956e);
            Intent b = ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93169b(RegByMobileSendSmsUI.this);
            b.addFlags(67108864);
            RegByMobileSendSmsUI regByMobileSendSmsUI = RegByMobileSendSmsUI.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(b);
            RegByMobileSendSmsUI regByMobileSendSmsUI2 = regByMobileSendSmsUI;
            C117292a.m165358d(regByMobileSendSmsUI2, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/RegByMobileSendSmsUI$13", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            regByMobileSendSmsUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(regByMobileSendSmsUI2, "com/tencent/mm/plugin/account/ui/RegByMobileSendSmsUI$13", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            StringBuilder sb = new StringBuilder();
            C86709a0.m107523b();
            sb.append(C86718e.m107547e());
            sb.append(",");
            sb.append(C115040d.class.getName());
            sb.append(",");
            sb.append("R200_600");
            sb.append(",");
            C86709a0.m107523b();
            sb.append(C86718e.m107548f("R200_600"));
            sb.append(",");
            sb.append(4);
            C78595a.m94982b(10645, sb.toString());
            RegByMobileSendSmsUI.this.finish();
            RegByMobileSendSmsUI.this.mo174794I7();
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileSendSmsUI$e */
    public class C115041e implements View.OnClickListener {
        public C115041e() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/ui/RegByMobileSendSmsUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            RegByMobileSendSmsUI regByMobileSendSmsUI = RegByMobileSendSmsUI.this;
            regByMobileSendSmsUI.f344940q.setEnabled(false);
            MTimerHandler mTimerHandler = regByMobileSendSmsUI.f344941r;
            if (mTimerHandler != null) {
                mTimerHandler.stopTimer();
                regByMobileSendSmsUI.f344942s = 15;
                regByMobileSendSmsUI.f344938o = 0;
                regByMobileSendSmsUI.f344941r.startTimer(0, 1000);
            } else {
                MTimerHandler mTimerHandler2 = new MTimerHandler(new C115201y2(regByMobileSendSmsUI), true);
                regByMobileSendSmsUI.f344941r = mTimerHandler2;
                mTimerHandler2.startTimer(0, 1000);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/RegByMobileSendSmsUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileSendSmsUI$g */
    public class C115042g implements MenuItem.OnMenuItemClickListener {
        public C115042g() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            RegByMobileSendSmsUI regByMobileSendSmsUI = RegByMobileSendSmsUI.this;
            int i = RegByMobileSendSmsUI.f344929z;
            C76879j.m92750u(regByMobileSendSmsUI, regByMobileSendSmsUI.getString(C0966R.string.hx_), "", new C115212z2(regByMobileSendSmsUI), (DialogInterface.OnClickListener) null);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileSendSmsUI$h */
    public class C115043h implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C114739c0 f344960d;

        public C115043h(C114739c0 c0Var) {
            this.f344960d = c0Var;
        }

        public void onCancel(DialogInterface dialogInterface) {
            C86709a0.m107524d().mo123458d(this.f344960d);
            C86709a0.m107524d().mo123470p(126, RegByMobileSendSmsUI.this);
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileSendSmsUI$i */
    public class C115044i implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C67216a f344962d;

        public C115044i(C67216a aVar) {
            this.f344962d = aVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C86709a0.m107524d().mo123455a(701, RegByMobileSendSmsUI.this);
            C86709a0.m107524d().mo123455a(252, RegByMobileSendSmsUI.this);
            RegByMobileSendSmsUI.m161900H7(RegByMobileSendSmsUI.this, this.f344962d.getUsername(), this.f344962d.mo91380q1());
            RegByMobileSendSmsUI regByMobileSendSmsUI = RegByMobileSendSmsUI.this;
            ThirdAppRegisterStruct thirdAppRegisterStruct = regByMobileSendSmsUI.f344948y;
            thirdAppRegisterStruct.f343856d = (long) regByMobileSendSmsUI.f344947x;
            thirdAppRegisterStruct.f343857e = 8;
            thirdAppRegisterStruct.mo86054n();
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileSendSmsUI$j */
    public class C115045j implements DialogInterface.OnClickListener {
        public C115045j(RegByMobileSendSmsUI regByMobileSendSmsUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileSendSmsUI$k */
    public class C115046k implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C67216a f344964d;

        public C115046k(C67216a aVar) {
            this.f344964d = aVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            RegByMobileSendSmsUI.m161900H7(RegByMobileSendSmsUI.this, this.f344964d.getUsername(), this.f344964d.mo91380q1());
            RegByMobileSendSmsUI regByMobileSendSmsUI = RegByMobileSendSmsUI.this;
            ThirdAppRegisterStruct thirdAppRegisterStruct = regByMobileSendSmsUI.f344948y;
            thirdAppRegisterStruct.f343856d = (long) regByMobileSendSmsUI.f344947x;
            thirdAppRegisterStruct.f343857e = 8;
            thirdAppRegisterStruct.mo86054n();
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileSendSmsUI$l */
    public class C115047l implements DialogInterface.OnClickListener {
        public C115047l(RegByMobileSendSmsUI regByMobileSendSmsUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileSendSmsUI$m */
    public class C115048m implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C114739c0 f344966d;

        /* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileSendSmsUI$m$a */
        public class C115049a implements DialogInterface.OnCancelListener {

            /* renamed from: d */
            public final /* synthetic */ C114739c0 f344968d;

            public C115049a(C115048m mVar, C114739c0 c0Var) {
                this.f344968d = c0Var;
            }

            public void onCancel(DialogInterface dialogInterface) {
                C86709a0.m107524d().mo123458d(this.f344968d);
            }
        }

        public C115048m(C114739c0 c0Var) {
            this.f344966d = c0Var;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            RegByMobileSendSmsUI regByMobileSendSmsUI = RegByMobileSendSmsUI.this;
            C114739c0 c0Var = r1;
            C114739c0 c0Var2 = new C114739c0("", regByMobileSendSmsUI.f344934h, regByMobileSendSmsUI.f344935i, 0, "", regByMobileSendSmsUI.f344930d, "", "", regByMobileSendSmsUI.f344944u, 1, "", this.f344966d.mo174372k1(), RegByMobileSendSmsUI.this.f344943t.getSecImgCode(), true, RegByMobileSendSmsUI.this.f344936j);
            C114739c0 c0Var3 = c0Var;
            c0Var3.mo174378q1(RegByMobileSendSmsUI.this.f344933g);
            c0Var3.mo174379r1(RegByMobileSendSmsUI.this.f344946w);
            c0Var3.mo174377p1(1);
            C86709a0.m107524d().mo123460f(c0Var3);
            RegByMobileSendSmsUI regByMobileSendSmsUI2 = RegByMobileSendSmsUI.this;
            regByMobileSendSmsUI2.f344937n = C76879j.m92723Q(regByMobileSendSmsUI2.getContext(), RegByMobileSendSmsUI.this.getString(C0966R.string.a3h), RegByMobileSendSmsUI.this.getString(C0966R.string.hym), true, true, new C115049a(this, c0Var3));
        }
    }

    /* renamed from: H7 */
    public static void m161900H7(RegByMobileSendSmsUI regByMobileSendSmsUI, String str, String str2) {
        regByMobileSendSmsUI.getClass();
        C86709a0.m107524d().mo123455a(701, regByMobileSendSmsUI);
        C86709a0.m107524d().mo123455a(252, regByMobileSendSmsUI);
        new C115203z0(new C115199x2(regByMobileSendSmsUI), str, str2, regByMobileSendSmsUI.f344930d).mo174958b(regByMobileSendSmsUI);
    }

    /* renamed from: I7 */
    public final void mo174794I7() {
        if (C75593t5.f222076d) {
            C75593t5.f222075c.mo105938a(C75592q0.m90789s());
            C75593t5.f222075c.mo105945h(C75592q0.m90789s(), C75592q0.m90788r());
            C75593t5.f222076d = false;
        }
    }

    /* renamed from: J7 */
    public final C75375u mo174795J7(String str) {
        C75375u uVar = new C75375u(str);
        Log.m105919d("MicroMsg.RegByMobileSendSmsUI", "content: %s", str);
        int indexOf = str.indexOf(32) + 1;
        uVar.mo105705b(new AbsoluteSizeSpan(getResources().getDimensionPixelSize(C0966R.dimen.f3883ht)), indexOf, str.length(), 33);
        uVar.mo105705b(new ForegroundColorSpan(getResources().getColor(C0966R.color.f3536x0)), indexOf, str.length(), 33);
        return uVar;
    }

    /* renamed from: K7 */
    public final void mo174796K7() {
        MTimerHandler mTimerHandler = this.f344941r;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
        }
        this.f344940q.setText(C0966R.string.hx8);
        this.f344940q.setEnabled(true);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bgf;
    }

    public void initView() {
        super.initView();
        ((TextView) findViewById(C0966R.C0970id.jbu)).setText(getString(C0966R.string.hxd, new Object[]{this.f344930d}));
        ((TextView) findViewById(C0966R.C0970id.jbr)).setText(mo174795J7(getString(C0966R.string.hxc, new Object[]{this.f344931e})));
        ((TextView) findViewById(C0966R.C0970id.jbv)).setText(mo174795J7(getString(C0966R.string.hxf, new Object[]{this.f344932f})));
        this.f344939p = (Button) findViewById(C0966R.C0970id.jbq);
        this.f344940q = (Button) findViewById(C0966R.C0970id.hfe);
        if (Util.isNullOrNil(this.f344930d, this.f344932f, this.f344931e)) {
            this.f344939p.setEnabled(false);
            this.f344940q.setEnabled(false);
        } else {
            this.f344940q.setOnClickListener(new C115041e());
        }
        if (Util.isNullOrNil(C87203t.m108277m())) {
            this.f344939p.setVisibility(8);
        } else {
            this.f344939p.setOnClickListener(new C1452f());
        }
        setMMTitle((int) C0966R.string.hxe);
        setBackBtn(new C115042g());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f344945v = getIntent().getIntExtra("key_reg_style", 1);
        this.f344930d = Util.nullAsNil(getIntent().getStringExtra("from_mobile"));
        this.f344932f = Util.nullAsNil(getIntent().getStringExtra("to_mobile"));
        this.f344931e = Util.nullAsNil(getIntent().getStringExtra("verify_code"));
        this.f344933g = Util.nullAsNil(getIntent().getStringExtra("regsession_id"));
        this.f344946w = Util.nullAsNil(getIntent().getStringExtra("reg_3d_app_ticket"));
        this.f344935i = Util.nullAsNil(getIntent().getStringExtra("kintent_nickname"));
        this.f344934h = Util.nullAsNil(getIntent().getStringExtra("kintent_password"));
        this.f344936j = getIntent().getBooleanExtra("kintent_hasavatar", false);
        this.f344947x = getIntent().getIntExtra("reg_3d_app_type", 0);
        initView();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        C76879j.m92750u(this, getString(C0966R.string.hx_), "", new C115212z2(this), (DialogInterface.OnClickListener) null);
        return true;
    }

    public void onResume() {
        super.onResume();
        C86709a0.m107524d().mo123455a(145, this);
        C86709a0.m107524d().mo123455a(701, this);
        C86709a0.m107524d().mo123455a(252, this);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C7660a a;
        int i3 = i2;
        Log.m105925i("MicroMsg.RegByMobileSendSmsUI", "errType %s, errCode %d, errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        ProgressDialog progressDialog = this.f344937n;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        if (yVar.getType() == 145) {
            C67216a aVar = (C67216a) yVar;
            if (aVar.mo91368f() == 15) {
                this.f344944u = aVar.mo91381r1();
                if (i3 == 0) {
                    mo174796K7();
                    if (this.f344945v == 1) {
                        C86709a0.m107524d().mo123455a(126, this);
                        C114739c0 c0Var = new C114739c0("", this.f344934h, this.f344935i, 0, "", this.f344930d, "", "", this.f344944u, 1, "", "", "", true, this.f344936j);
                        c0Var.mo174378q1(this.f344933g);
                        c0Var.mo174379r1(this.f344946w);
                        c0Var.mo174377p1(1);
                        C86709a0.m107524d().mo123460f(c0Var);
                        this.f344937n = C76879j.m92723Q(this, getString(C0966R.string.a3h), getString(C0966R.string.hym), true, true, new C115043h(c0Var));
                        return;
                    }
                    Intent intent = new Intent();
                    intent.putExtra("regsetinfo_ticket", this.f344944u);
                    intent.putExtra("regsetinfo_user", this.f344930d);
                    intent.putExtra("regsession_id", this.f344933g);
                    intent.putExtra("reg_3d_app_ticket", this.f344946w);
                    intent.putExtra("reg_3d_app_type", this.f344947x);
                    intent.putExtra("mobile_check_type", 1);
                    intent.putExtra("regsetinfo_ismobile", 4);
                    intent.putExtra("regsetinfo_NextControl", aVar.mo91377o1());
                    intent.putExtra("key_reg_style", this.f344945v);
                    intent.setClass(this, RegSetInfoUI.class);
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(intent);
                    C117292a.m165358d(this, aVar2.mo10232b(), "com/tencent/mm/plugin/account/ui/RegByMobileSendSmsUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((Intent) aVar2.mo10231a(0));
                    C117292a.m165359e(this, "com/tencent/mm/plugin/account/ui/RegByMobileSendSmsUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    return;
                } else if (i3 == -35) {
                    mo174796K7();
                    C7660a a2 = C7660a.m7782a(str);
                    ThirdAppRegisterStruct thirdAppRegisterStruct = this.f344948y;
                    thirdAppRegisterStruct.f343856d = (long) this.f344947x;
                    thirdAppRegisterStruct.f343857e = 7;
                    thirdAppRegisterStruct.mo86054n();
                    if (a2 != null) {
                        a2.mo8792b(this, new C115044i(aVar), new C115045j(this));
                        return;
                    } else {
                        C76879j.m92750u(this, getString(C0966R.string.ajf), (String) null, new C115046k(aVar), new C115047l(this));
                        return;
                    }
                } else if (i3 == -212) {
                    mo174796K7();
                    Intent intent2 = new Intent(this, MobileLoginOrForceReg.class);
                    intent2.putExtra("ticket", this.f344944u);
                    intent2.putExtra("moble", this.f344930d);
                    intent2.putExtra("regsession_id", this.f344933g);
                    intent2.putExtra("reg_3d_app_ticket", this.f344946w);
                    intent2.putExtra("reg_3d_app_type", this.f344947x);
                    intent2.putExtra("next_controll", aVar.mo91377o1());
                    intent2.putExtra("username", aVar.getUsername());
                    intent2.putExtra("password", aVar.mo91380q1());
                    intent2.putExtra("nickname", aVar.mo91362I());
                    intent2.putExtra("avatar_url", aVar.mo91379q0());
                    intent2.putExtra("mobile_check_type", 1);
                    intent2.putExtra("kintent_hasavatar", this.f344936j);
                    intent2.putExtra("kintent_nickname", this.f344935i);
                    intent2.putExtra("kintent_password", this.f344934h);
                    intent2.putExtra("key_reg_style", this.f344945v);
                    intent2.putExtra("need_do_post_check", aVar.mo91376n1());
                    C9556a aVar3 = new C9556a();
                    aVar3.mo10233c(intent2);
                    C117292a.m165358d(this, aVar3.mo10232b(), "com/tencent/mm/plugin/account/ui/RegByMobileSendSmsUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((Intent) aVar3.mo10231a(0));
                    C117292a.m165359e(this, "com/tencent/mm/plugin/account/ui/RegByMobileSendSmsUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    return;
                } else if (!Util.isNullOrNil(str) && this.f344938o >= 4 && (a = C7660a.m7782a(str)) != null) {
                    a.mo8792b(this, (DialogInterface.OnClickListener) null, (DialogInterface.OnClickListener) null);
                    return;
                } else {
                    return;
                }
            }
        }
        if (yVar.getType() == 126) {
            C114739c0 c0Var2 = (C114739c0) yVar;
            if (i3 == -6 || i3 == -311 || i3 == -310) {
                SecurityImage securityImage = this.f344943t;
                if (securityImage == null) {
                    this.f344943t = SecurityImage.C116047a.m163296a(this, C0966R.string.hyo, 0, c0Var2.mo174371j1(), c0Var2.mo174372k1(), "", new C115048m(c0Var2), (DialogInterface.OnCancelListener) null, new C115037a(), new C115038b(c0Var2));
                    return;
                }
                securityImage.mo177230b(0, c0Var2.mo174371j1(), c0Var2.mo174372k1(), "");
            } else if (i == 0 && i3 == 0) {
                String str2 = this.f344930d;
                ThirdAppRegisterStruct thirdAppRegisterStruct2 = this.f344948y;
                thirdAppRegisterStruct2.f343856d = (long) this.f344947x;
                thirdAppRegisterStruct2.f343857e = 6;
                thirdAppRegisterStruct2.mo86054n();
                C86718e.m107546E();
                C86718e.f251744t = true;
                C5139t.m5183e(1, 8);
                C5139t.m5183e(1, 3);
                C5139t.m5183e(1, 1);
                if (this.f344936j) {
                    String str3 = C112760b.m154235i() + "temp.avatar";
                    String str4 = C112760b.m154235i() + "temp.avatar.hd";
                    C86013q1.m106463x(str3, str4);
                    C86013q1.m106447h(str3);
                    BitmapUtil.createThumbNail(str4, 156, 156, Bitmap.CompressFormat.JPEG, 90, str3, true);
                    ((C1295s) ((C117475p) C86312j.m106911c(C117475p.class)).mo182091fC(this, C112760b.m154235i() + "temp.avatar", true)).mo1219a(1, new C115039c(c0Var2, str2), new C115040d(c0Var2, str2));
                    return;
                }
                this.f344944u = c0Var2.mo174376o1();
                C7624i3.f25910c.mo8756d("login_user_name", str2);
                Intent b = ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93169b(this);
                b.addFlags(67108864);
                b.putExtra("LauncherUI.enter_from_reg", true);
                C9556a aVar4 = new C9556a();
                aVar4.mo10233c(b);
                C117292a.m165358d(this, aVar4.mo10232b(), "com/tencent/mm/plugin/account/ui/RegByMobileSendSmsUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((Intent) aVar4.mo10231a(0));
                C117292a.m165359e(this, "com/tencent/mm/plugin/account/ui/RegByMobileSendSmsUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                finish();
                mo174794I7();
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
            } else {
                C7660a a3 = C7660a.m7782a(str);
                if (a3 != null) {
                    a3.mo8792b(this, (DialogInterface.OnClickListener) null, (DialogInterface.OnClickListener) null);
                }
            }
        }
    }

    public void onStop() {
        super.onStop();
        mo174796K7();
        C86709a0.m107524d().mo123470p(145, this);
        C86709a0.m107524d().mo123470p(701, this);
        C86709a0.m107524d().mo123470p(252, this);
    }
}
