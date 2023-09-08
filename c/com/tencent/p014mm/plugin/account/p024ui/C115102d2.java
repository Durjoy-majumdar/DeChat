package com.tencent.p014mm.plugin.account.p024ui;

import a70.C112760b;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import bc0.C67216a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.mmdata.rpt.ThirdAppRegisterStruct;
import com.tencent.p014mm.modelsimple.C114739c0;
import com.tencent.p014mm.modelsimple.C1302b0;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.p136ui.applet.SecurityImage;
import com.tencent.p014mm.plugin.account.bind.p021ui.FindMContactAlertUI;
import com.tencent.p014mm.plugin.account.bind.p021ui.FindMContactIntroUI;
import com.tencent.p014mm.plugin.account.p024ui.C115203z0;
import com.tencent.p014mm.plugin.account.p024ui.MobileVerifyUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C75593t5;
import eb0.C7624i3;
import f40.C86709a0;
import f40.C86718e;
import j20.C117292a;
import jg0.C108742l;
import k20.C9556a;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p214om.C11502f;
import wg0.C78595a;

/* renamed from: com.tencent.mm.plugin.account.ui.d2 */
public class C115102d2 implements MobileVerifyUI.C68466n, C11385n {

    /* renamed from: d */
    public MobileVerifyUI f345099d;

    /* renamed from: e */
    public String f345100e;

    /* renamed from: f */
    public String f345101f;

    /* renamed from: g */
    public C115203z0 f345102g = null;

    /* renamed from: h */
    public boolean f345103h = true;

    /* renamed from: i */
    public ThirdAppRegisterStruct f345104i = new ThirdAppRegisterStruct();

    /* renamed from: com.tencent.mm.plugin.account.ui.d2$a */
    public class C115103a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f345105d;

        /* renamed from: e */
        public final /* synthetic */ String f345106e;

        /* renamed from: f */
        public final /* synthetic */ C117747y f345107f;

        /* renamed from: g */
        public final /* synthetic */ Boolean f345108g;

        /* renamed from: com.tencent.mm.plugin.account.ui.d2$a$a */
        public class C115104a implements DialogInterface.OnCancelListener {

            /* renamed from: d */
            public final /* synthetic */ C114739c0 f345110d;

            public C115104a(C114739c0 c0Var) {
                this.f345110d = c0Var;
            }

            public void onCancel(DialogInterface dialogInterface) {
                C86709a0.m107524d().mo123458d(this.f345110d);
                C86709a0.m107524d().mo123470p(126, C115102d2.this);
            }
        }

        public C115103a(String str, String str2, C117747y yVar, Boolean bool) {
            this.f345105d = str;
            this.f345106e = str2;
            this.f345107f = yVar;
            this.f345108g = bool;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C86709a0.m107524d().mo123455a(126, C115102d2.this);
            String str = this.f345105d;
            String str2 = this.f345106e;
            C115102d2 d2Var = C115102d2.this;
            MobileVerifyUI mobileVerifyUI = d2Var.f345099d;
            C114739c0 c0Var = new C114739c0("", str, str2, 0, "", mobileVerifyUI.f196691p, "", "", d2Var.f345101f, mobileVerifyUI.f196678E, "", ((C114739c0) this.f345107f).mo174372k1(), C115102d2.this.f345099d.f196693r.getSecImgCode(), true, this.f345108g.booleanValue());
            c0Var.mo174378q1(C115102d2.this.f345099d.f196679F);
            c0Var.mo174379r1(C115102d2.this.f345099d.f196680G);
            C86709a0.m107524d().mo123460f(c0Var);
            MobileVerifyUI mobileVerifyUI2 = C115102d2.this.f345099d;
            mobileVerifyUI2.f196684f = C76879j.m92723Q(mobileVerifyUI2, mobileVerifyUI2.getString(C0966R.string.a3h), C115102d2.this.f345099d.getString(C0966R.string.hym), true, true, new C115104a(c0Var));
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.d2$b */
    public class C115105b implements DialogInterface.OnDismissListener {
        public C115105b() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            C115102d2.this.f345099d.f196693r = null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.d2$c */
    public class C115106c extends SecurityImage.C116049b {

        /* renamed from: b */
        public final /* synthetic */ String f345113b;

        /* renamed from: c */
        public final /* synthetic */ String f345114c;

        /* renamed from: d */
        public final /* synthetic */ C117747y f345115d;

        /* renamed from: e */
        public final /* synthetic */ Boolean f345116e;

        public C115106c(String str, String str2, C117747y yVar, Boolean bool) {
            this.f345113b = str;
            this.f345114c = str2;
            this.f345115d = yVar;
            this.f345116e = bool;
        }

        /* renamed from: a */
        public void mo93941a() {
            C115102d2.this.f345099d.hideVKB();
            C86709a0.m107524d().mo123455a(126, C115102d2.this);
            String str = this.f345113b;
            String str2 = this.f345114c;
            C115102d2 d2Var = C115102d2.this;
            MobileVerifyUI mobileVerifyUI = d2Var.f345099d;
            C114739c0 c0Var = new C114739c0("", str, str2, 0, "", mobileVerifyUI.f196691p, "", "", d2Var.f345101f, mobileVerifyUI.f196678E, "", ((C114739c0) this.f345115d).mo174372k1(), "", true, this.f345116e.booleanValue());
            c0Var.mo174378q1(C115102d2.this.f345099d.f196679F);
            c0Var.mo174379r1(C115102d2.this.f345099d.f196680G);
            C86709a0.m107524d().mo123460f(c0Var);
        }

        /* renamed from: b */
        public void mo93942b() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.d2$d */
    public class C115107d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C117747y f345118d;

        /* renamed from: e */
        public final /* synthetic */ String f345119e;

        /* renamed from: f */
        public final /* synthetic */ String f345120f;

        /* renamed from: g */
        public final /* synthetic */ boolean f345121g;

        /* renamed from: h */
        public final /* synthetic */ String f345122h;

        /* renamed from: i */
        public final /* synthetic */ String f345123i;

        /* renamed from: j */
        public final /* synthetic */ int f345124j;

        public C115107d(C117747y yVar, String str, String str2, boolean z, String str3, String str4, int i) {
            this.f345118d = yVar;
            this.f345119e = str;
            this.f345120f = str2;
            this.f345121g = z;
            this.f345122h = str3;
            this.f345123i = str4;
            this.f345124j = i;
        }

        public void run() {
            Intent intent;
            Class cls = C11502f.class;
            C115102d2.this.f345100e = ((C114739c0) this.f345118d).mo174376o1();
            C7624i3.f25910c.mo8756d("login_user_name", this.f345119e);
            C86013q1.m106447h(C112760b.m154235i() + "temp.avatar");
            String str = this.f345120f;
            if (str == null || !str.contains("0")) {
                Intent b = ((C67654r1) ((C11502f) C86312j.m106911c(cls)).mo11462yM()).mo93169b(C115102d2.this.f345099d);
                b.addFlags(67108864);
                MobileVerifyUI mobileVerifyUI = C115102d2.this.f345099d;
                C9556a aVar = new C9556a();
                aVar.mo10233c(b);
                MobileVerifyUI mobileVerifyUI2 = mobileVerifyUI;
                C117292a.m165358d(mobileVerifyUI2, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/MobileVerifyRegLogic$13", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                mobileVerifyUI.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(mobileVerifyUI2, "com/tencent/mm/plugin/account/ui/MobileVerifyRegLogic$13", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                StringBuilder sb = new StringBuilder();
                C86709a0.m107523b();
                sb.append(C86718e.m107547e());
                sb.append(",");
                sb.append(C115102d2.this.f345099d.getClass().getName());
                sb.append(",");
                sb.append("R200_900_phone");
                sb.append(",");
                C86709a0.m107523b();
                sb.append(C86718e.m107548f("R200_900_phone"));
                sb.append(",");
                sb.append(4);
                C78595a.m94982b(10645, sb.toString());
                C115102d2.this.mo174873c();
                C115102d2.this.f345099d.finish();
                return;
            }
            C78595a.m94985e("R300_100_phone");
            if (!this.f345121g) {
                intent = new Intent(C115102d2.this.f345099d, FindMContactIntroUI.class);
            } else {
                intent = new Intent(C115102d2.this.f345099d, FindMContactAlertUI.class);
                intent.putExtra("alert_title", this.f345122h);
                intent.putExtra("alert_message", this.f345123i);
            }
            intent.addFlags(67108864);
            intent.putExtra("regsetinfo_ticket", C115102d2.this.f345100e);
            intent.putExtra("regsetinfo_NextStep", this.f345120f);
            intent.putExtra("regsetinfo_NextStyle", this.f345124j);
            Intent b2 = ((C67654r1) ((C11502f) C86312j.m106911c(cls)).mo11462yM()).mo93169b(C115102d2.this.f345099d);
            b2.addFlags(67108864);
            MMWizardActivity.m7018M7(C115102d2.this.f345099d, intent, b2);
            C115102d2.this.mo174873c();
            C115102d2.this.f345099d.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.d2$e */
    public class C115108e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C117747y f345126d;

        /* renamed from: e */
        public final /* synthetic */ String f345127e;

        /* renamed from: f */
        public final /* synthetic */ String f345128f;

        /* renamed from: g */
        public final /* synthetic */ boolean f345129g;

        /* renamed from: h */
        public final /* synthetic */ String f345130h;

        /* renamed from: i */
        public final /* synthetic */ String f345131i;

        /* renamed from: j */
        public final /* synthetic */ int f345132j;

        public C115108e(C117747y yVar, String str, String str2, boolean z, String str3, String str4, int i) {
            this.f345126d = yVar;
            this.f345127e = str;
            this.f345128f = str2;
            this.f345129g = z;
            this.f345130h = str3;
            this.f345131i = str4;
            this.f345132j = i;
        }

        public void run() {
            Intent intent;
            Class cls = C11502f.class;
            C115102d2.this.f345100e = ((C114739c0) this.f345126d).mo174376o1();
            C7624i3.f25910c.mo8756d("login_user_name", this.f345127e);
            String str = this.f345128f;
            if (str == null || !str.contains("0")) {
                Intent b = ((C67654r1) ((C11502f) C86312j.m106911c(cls)).mo11462yM()).mo93169b(C115102d2.this.f345099d);
                b.addFlags(67108864);
                MobileVerifyUI mobileVerifyUI = C115102d2.this.f345099d;
                C9556a aVar = new C9556a();
                aVar.mo10233c(b);
                MobileVerifyUI mobileVerifyUI2 = mobileVerifyUI;
                C117292a.m165358d(mobileVerifyUI2, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/MobileVerifyRegLogic$14", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                mobileVerifyUI.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(mobileVerifyUI2, "com/tencent/mm/plugin/account/ui/MobileVerifyRegLogic$14", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                StringBuilder sb = new StringBuilder();
                C86709a0.m107523b();
                sb.append(C86718e.m107547e());
                sb.append(",");
                sb.append(C115102d2.this.f345099d.getClass().getName());
                sb.append(",");
                sb.append("R200_900_phone");
                sb.append(",");
                C86709a0.m107523b();
                sb.append(C86718e.m107548f("R200_900_phone"));
                sb.append(",");
                sb.append(4);
                C78595a.m94982b(10645, sb.toString());
                C115102d2.this.mo174873c();
                C115102d2.this.f345099d.finish();
                return;
            }
            C78595a.m94985e("R300_100_phone");
            if (!this.f345129g) {
                intent = new Intent(C115102d2.this.f345099d, FindMContactIntroUI.class);
            } else {
                intent = new Intent(C115102d2.this.f345099d, FindMContactAlertUI.class);
                intent.putExtra("alert_title", this.f345130h);
                intent.putExtra("alert_message", this.f345131i);
            }
            intent.addFlags(67108864);
            intent.putExtra("regsetinfo_ticket", C115102d2.this.f345100e);
            intent.putExtra("regsetinfo_NextStep", this.f345128f);
            intent.putExtra("regsetinfo_NextStyle", this.f345132j);
            Intent b2 = ((C67654r1) ((C11502f) C86312j.m106911c(cls)).mo11462yM()).mo93169b(C115102d2.this.f345099d);
            b2.addFlags(67108864);
            MMWizardActivity.m7018M7(C115102d2.this.f345099d, intent, b2);
            C115102d2.this.mo174873c();
            C115102d2.this.f345099d.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.d2$f */
    public class C115109f implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C67216a f345134d;

        public C115109f(C115102d2 d2Var, C67216a aVar) {
            this.f345134d = aVar;
        }

        public void onCancel(DialogInterface dialogInterface) {
            C86709a0.m107524d().mo123458d(this.f345134d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.d2$g */
    public class C115110g implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C114739c0 f345135d;

        public C115110g(C114739c0 c0Var) {
            this.f345135d = c0Var;
        }

        public void onCancel(DialogInterface dialogInterface) {
            C86709a0.m107524d().mo123458d(this.f345135d);
            C86709a0.m107524d().mo123470p(126, C115102d2.this);
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.d2$h */
    public class C115111h implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C1302b0 f345137d;

        public C115111h(C115102d2 d2Var, C1302b0 b0Var) {
            this.f345137d = b0Var;
        }

        public void onCancel(DialogInterface dialogInterface) {
            C86709a0.m107524d().mo123458d(this.f345137d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.d2$i */
    public class C115112i implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C117747y f345138d;

        /* renamed from: e */
        public final /* synthetic */ C67216a f345139e;

        /* renamed from: com.tencent.mm.plugin.account.ui.d2$i$a */
        public class C115113a implements C115203z0.C115206d {
            public C115113a() {
            }

            /* renamed from: a */
            public void mo174591a(ProgressDialog progressDialog) {
                C115102d2.this.f345099d.f196684f = progressDialog;
            }
        }

        public C115112i(C117747y yVar, C67216a aVar) {
            this.f345138d = yVar;
            this.f345139e = aVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C86709a0.m107524d().mo123455a(701, C115102d2.this);
            C86709a0.m107524d().mo123455a(252, C115102d2.this);
            C115102d2 d2Var = C115102d2.this;
            C115113a aVar = new C115113a();
            String username = ((C67216a) this.f345138d).getUsername();
            String q1 = this.f345139e.mo91380q1();
            C115102d2 d2Var2 = C115102d2.this;
            MobileVerifyUI mobileVerifyUI = d2Var2.f345099d;
            d2Var.f345102g = new C115203z0(aVar, username, q1, mobileVerifyUI.f196691p);
            d2Var2.f345102g.mo174958b(mobileVerifyUI);
            C115102d2 d2Var3 = C115102d2.this;
            ThirdAppRegisterStruct thirdAppRegisterStruct = d2Var3.f345104i;
            thirdAppRegisterStruct.f343856d = (long) d2Var3.f345099d.f196681H;
            thirdAppRegisterStruct.f343857e = 8;
            thirdAppRegisterStruct.mo86054n();
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.d2$j */
    public class C115114j implements DialogInterface.OnClickListener {
        public C115114j(C115102d2 d2Var) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.d2$k */
    public class C115115k implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C117747y f345142d;

        /* renamed from: com.tencent.mm.plugin.account.ui.d2$k$a */
        public class C115116a implements C115203z0.C115206d {
            public C115116a() {
            }

            /* renamed from: a */
            public void mo174591a(ProgressDialog progressDialog) {
                C115102d2.this.f345099d.f196684f = progressDialog;
            }
        }

        public C115115k(C117747y yVar) {
            this.f345142d = yVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C86709a0.m107524d().mo123455a(701, C115102d2.this);
            C86709a0.m107524d().mo123455a(252, C115102d2.this);
            C115102d2 d2Var = C115102d2.this;
            C115116a aVar = new C115116a();
            String username = ((C67216a) this.f345142d).getUsername();
            String q1 = ((C67216a) this.f345142d).mo91380q1();
            C115102d2 d2Var2 = C115102d2.this;
            MobileVerifyUI mobileVerifyUI = d2Var2.f345099d;
            d2Var.f345102g = new C115203z0(aVar, username, q1, mobileVerifyUI.f196691p);
            d2Var2.f345102g.mo174958b(mobileVerifyUI);
            C115102d2 d2Var3 = C115102d2.this;
            ThirdAppRegisterStruct thirdAppRegisterStruct = d2Var3.f345104i;
            thirdAppRegisterStruct.f343856d = (long) d2Var3.f345099d.f196681H;
            thirdAppRegisterStruct.f343857e = 8;
            thirdAppRegisterStruct.mo86054n();
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.d2$l */
    public class C115117l implements DialogInterface.OnClickListener {
        public C115117l(C115102d2 d2Var) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: a */
    public boolean mo94016a(MobileVerifyUI.C68465m mVar) {
        int ordinal = mVar.ordinal();
        if (ordinal == 0) {
            MobileVerifyUI mobileVerifyUI = this.f345099d;
            C76879j.m92707A(mobileVerifyUI, mobileVerifyUI.getString(C0966R.string.gus), "", this.f345099d.getString(C0966R.string.gut), this.f345099d.getString(C0966R.string.guu), new C104718f2(this), new C115124g2(this));
            return true;
        } else if (ordinal == 1) {
            C86709a0.m107524d().mo123455a(145, this);
            MobileVerifyUI mobileVerifyUI2 = this.f345099d;
            C67216a aVar = new C67216a(mobileVerifyUI2.f196691p, 15, mobileVerifyUI2.f196683e.getText().toString().trim(), 0, "");
            aVar.mo91367W(this.f345099d.f196679F);
            C86709a0.m107524d().mo123460f(aVar);
            MobileVerifyUI mobileVerifyUI3 = this.f345099d;
            mobileVerifyUI3.f196684f = C76879j.m92723Q(mobileVerifyUI3, mobileVerifyUI3.getString(C0966R.string.a3h), this.f345099d.getString(C0966R.string.al4), true, true, new C68499h2(this, aVar));
            return false;
        } else if (ordinal == 2) {
            C86709a0.m107524d().mo123455a(145, this);
            C67216a aVar2 = new C67216a(this.f345099d.f196691p, 14, "", 0, "");
            aVar2.mo91367W(this.f345099d.f196679F);
            C86709a0.m107524d().mo123460f(aVar2);
            C108742l.m147542a(C108742l.C108744b.SENT);
            return false;
        } else if (ordinal == 3) {
            StringBuilder sb = new StringBuilder();
            C86709a0.m107523b();
            sb.append(C86718e.m107547e());
            sb.append(",");
            sb.append(C115102d2.class.getName());
            sb.append(",");
            sb.append("R200_350_auto");
            sb.append(",");
            C86709a0.m107523b();
            sb.append(C86718e.m107548f("R200_350_auto"));
            sb.append(",");
            sb.append(1);
            C78595a.m94982b(10645, sb.toString());
            C86709a0.m107524d().mo123455a(145, this);
            MobileVerifyUI mobileVerifyUI4 = this.f345099d;
            C67216a aVar3 = new C67216a(mobileVerifyUI4.f196691p, 15, mobileVerifyUI4.f196683e.getText().toString().trim(), 0, "");
            aVar3.mo91367W(this.f345099d.f196679F);
            C86709a0.m107524d().mo123460f(aVar3);
            MobileVerifyUI mobileVerifyUI5 = this.f345099d;
            mobileVerifyUI5.f196684f = C76879j.m92723Q(mobileVerifyUI5, mobileVerifyUI5.getString(C0966R.string.a3h), this.f345099d.getString(C0966R.string.al4), true, true, new C68494e2(this, aVar3));
            return false;
        } else if (ordinal != 4) {
            return false;
        } else {
            mo174874d();
            return false;
        }
    }

    /* renamed from: b */
    public void mo94017b(MobileVerifyUI mobileVerifyUI) {
        this.f345099d = mobileVerifyUI;
    }

    /* renamed from: c */
    public final void mo174873c() {
        if (C75593t5.f222076d) {
            C75593t5.f222075c.mo105938a(C75592q0.m90789s());
            C75593t5.f222075c.mo105945h(C75592q0.m90789s(), C75592q0.m90788r());
            C75593t5.f222076d = false;
        }
    }

    /* renamed from: d */
    public void mo174874d() {
        C67216a aVar = new C67216a(this.f345099d.f196691p, 26, "", 0, "");
        aVar.mo91367W(this.f345099d.f196679F);
        C86709a0.m107524d().mo123460f(aVar);
        MobileVerifyUI mobileVerifyUI = this.f345099d;
        mobileVerifyUI.f196684f = C76879j.m92723Q(mobileVerifyUI, mobileVerifyUI.getString(C0966R.string.a3h), this.f345099d.getString(C0966R.string.hym), true, true, new C115109f(this, aVar));
    }

    /* renamed from: e */
    public final void mo174875e(C67216a aVar) {
        String r1 = aVar.mo91381r1();
        this.f345101f = r1;
        Log.m105925i("MicroMsg.MobileVerifyRegLogic", "uploadNickAndAvatar ticket:%s", r1);
        C86709a0.m107524d().mo123455a(126, this);
        MobileVerifyUI mobileVerifyUI = this.f345099d;
        C114739c0 c0Var = new C114739c0("", mobileVerifyUI.f196694s, mobileVerifyUI.f196696u, 0, "", mobileVerifyUI.f196691p, "", "", this.f345101f, mobileVerifyUI.f196678E, "", "", "", true, mobileVerifyUI.f196695t.booleanValue());
        c0Var.mo174378q1(this.f345099d.f196679F);
        c0Var.mo174379r1(this.f345099d.f196680G);
        C86709a0.m107524d().mo123460f(c0Var);
        MobileVerifyUI mobileVerifyUI2 = this.f345099d;
        mobileVerifyUI2.f196684f = C76879j.m92723Q(mobileVerifyUI2, mobileVerifyUI2.getString(C0966R.string.a3h), this.f345099d.getString(C0966R.string.hym), true, true, new C115110g(c0Var));
    }

    /* JADX WARNING: type inference failed for: r7v7 */
    /* JADX WARNING: type inference failed for: r7v8 */
    /* JADX WARNING: type inference failed for: r7v11 */
    /* JADX WARNING: type inference failed for: r7v12 */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x037e, code lost:
        r14 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r14);
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r7v4, types: [boolean, int] */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x03ba  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x040e  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x049d  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x036e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r33, int r34, java.lang.String r35, ob0.C117747y r36) {
        /*
            r32 = this;
            r9 = r32
            r10 = r33
            r11 = r34
            r12 = r35
            r13 = r36
            java.lang.Class<om.f> r0 = p214om.C11502f.class
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "onSceneEnd: errType = "
            r1.append(r2)
            r1.append(r10)
            java.lang.String r2 = " errCode = "
            r1.append(r2)
            r1.append(r11)
            java.lang.String r2 = " errMsg = "
            r1.append(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MicroMsg.MobileVerifyRegLogic"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            com.tencent.mm.plugin.account.ui.MobileVerifyUI r1 = r9.f345099d
            android.app.ProgressDialog r1 = r1.f196684f
            r14 = 0
            if (r1 == 0) goto L_0x0040
            r1.dismiss()
            com.tencent.mm.plugin.account.ui.MobileVerifyUI r1 = r9.f345099d
            r1.f196684f = r14
        L_0x0040:
            int r1 = r36.getType()
            r3 = 4
            r6 = 255(0xff, float:3.57E-43)
            if (r1 != r6) goto L_0x005d
            ob0.b0 r0 = f40.C86709a0.m107524d()
            r0.mo123470p(r6, r9)
            r0 = -3
            if (r11 != r0) goto L_0x005c
            if (r10 != r3) goto L_0x005c
            com.tencent.mm.plugin.account.ui.MobileVerifyUI r0 = r9.f345099d
            boolean r1 = r9.f345103h
            r0.mo94000K7(r1)
        L_0x005c:
            return
        L_0x005d:
            int r1 = r36.getType()
            r15 = 252(0xfc, float:3.53E-43)
            r8 = 701(0x2bd, float:9.82E-43)
            r7 = 1
            if (r1 == r8) goto L_0x006e
            int r1 = r36.getType()
            if (r1 != r8) goto L_0x00d4
        L_0x006e:
            com.tencent.mm.plugin.account.ui.z0 r1 = r9.f345102g
            if (r1 == 0) goto L_0x00d4
            ob0.b0 r0 = f40.C86709a0.m107524d()
            r0.mo123470p(r8, r9)
            ob0.b0 r0 = f40.C86709a0.m107524d()
            r0.mo123470p(r15, r9)
            com.tencent.mm.plugin.account.ui.z0 r0 = r9.f345102g
            com.tencent.mm.plugin.account.ui.MobileVerifyUI r1 = r9.f345099d
            r2 = r33
            r3 = r34
            r4 = r35
            r5 = r36
            r0.mo174957a(r1, r2, r3, r4, r5)
            if (r10 != 0) goto L_0x00d3
            if (r11 != 0) goto L_0x00d3
            boolean r0 = r13 instanceof com.tencent.p014mm.modelsimple.C114735a0
            if (r0 == 0) goto L_0x00a0
            r0 = r13
            com.tencent.mm.modelsimple.a0 r0 = (com.tencent.p014mm.modelsimple.C114735a0) r0
            boolean r0 = r0.mo174368x1()
            r9.f345103h = r0
        L_0x00a0:
            ob0.b0 r0 = f40.C86709a0.m107524d()
            r0.mo123455a(r6, r9)
            com.tencent.mm.modelsimple.b0 r0 = new com.tencent.mm.modelsimple.b0
            r0.<init>(r7)
            ob0.b0 r1 = f40.C86709a0.m107524d()
            r1.mo123460f(r0)
            com.tencent.mm.plugin.account.ui.MobileVerifyUI r1 = r9.f345099d
            r2 = 2131821704(0x7f110488, float:1.9276159E38)
            java.lang.String r3 = r1.getString(r2)
            com.tencent.mm.plugin.account.ui.MobileVerifyUI r2 = r9.f345099d
            r4 = 2131821571(0x7f110403, float:1.9275889E38)
            java.lang.String r4 = r2.getString(r4)
            r5 = 1
            r6 = 1
            com.tencent.mm.plugin.account.ui.d2$h r7 = new com.tencent.mm.plugin.account.ui.d2$h
            r7.<init>(r9, r0)
            r2 = r1
            qo3.i0 r0 = nj3.C76879j.m92723Q(r2, r3, r4, r5, r6, r7)
            r1.f196684f = r0
        L_0x00d3:
            return
        L_0x00d4:
            int r1 = r36.getType()
            java.lang.String r4 = "regsetinfo_ticket"
            r6 = 2
            r5 = 145(0x91, float:2.03E-43)
            r15 = 0
            if (r1 != r5) goto L_0x02ef
            ob0.b0 r0 = f40.C86709a0.m107524d()
            r0.mo123470p(r5, r9)
            r0 = r13
            bc0.a r0 = (bc0.C67216a) r0
            int r1 = r0.mo91368f()
            java.lang.Object[] r5 = new java.lang.Object[r6]
            java.lang.Integer r17 = java.lang.Integer.valueOf(r1)
            r5[r15] = r17
            int r17 = r0.mo91376n1()
            java.lang.Integer r17 = java.lang.Integer.valueOf(r17)
            r5[r7] = r17
            java.lang.String r6 = "MMFunc_BindMobileForReg opCode=%s needDoPostCheck=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r6, r5)
            r2 = 15
            if (r1 != r2) goto L_0x02d9
            java.lang.String r1 = "key_reg_style"
            java.lang.String r2 = "reg_3d_app_type"
            java.lang.String r5 = "reg_3d_app_ticket"
            java.lang.String r6 = "regsession_id"
            if (r10 != 0) goto L_0x01b0
            if (r11 != 0) goto L_0x01b0
            com.tencent.mm.plugin.account.ui.MobileVerifyUI r8 = r9.f345099d
            int r8 = r8.f196697v
            if (r8 != r7) goto L_0x012b
            int r1 = r0.mo91376n1()
            if (r1 != r7) goto L_0x0126
            r32.mo174874d()
            goto L_0x01af
        L_0x0126:
            r9.mo174875e(r0)
            goto L_0x01af
        L_0x012b:
            android.content.Intent r7 = new android.content.Intent
            r7.<init>()
            java.lang.String r8 = r0.mo91381r1()
            r7.putExtra(r4, r8)
            com.tencent.mm.plugin.account.ui.MobileVerifyUI r4 = r9.f345099d
            java.lang.String r4 = r4.f196691p
            java.lang.String r8 = "regsetinfo_user"
            r7.putExtra(r8, r4)
            com.tencent.mm.plugin.account.ui.MobileVerifyUI r4 = r9.f345099d
            java.lang.String r4 = r4.f196679F
            r7.putExtra(r6, r4)
            com.tencent.mm.plugin.account.ui.MobileVerifyUI r4 = r9.f345099d
            java.lang.String r4 = r4.f196680G
            r7.putExtra(r5, r4)
            com.tencent.mm.plugin.account.ui.MobileVerifyUI r4 = r9.f345099d
            int r4 = r4.f196681H
            r7.putExtra(r2, r4)
            java.lang.String r2 = "regsetinfo_ismobile"
            r7.putExtra(r2, r3)
            int r0 = r0.mo91377o1()
            java.lang.String r2 = "regsetinfo_NextControl"
            r7.putExtra(r2, r0)
            com.tencent.mm.plugin.account.ui.MobileVerifyUI r0 = r9.f345099d
            int r0 = r0.f196697v
            r7.putExtra(r1, r0)
            com.tencent.mm.plugin.account.ui.MobileVerifyUI r0 = r9.f345099d
            java.lang.Class<com.tencent.mm.plugin.account.ui.RegSetInfoUI> r1 = com.tencent.p014mm.plugin.account.p024ui.RegSetInfoUI.class
            r7.setClass(r0, r1)
            com.tencent.mm.plugin.account.ui.MobileVerifyUI r0 = r9.f345099d
            k20.a r1 = new k20.a
            r1.<init>()
            r1.mo10233c(r7)
            java.lang.Object[] r17 = r1.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/account/ui/MobileVerifyRegLogic"
            java.lang.String r19 = "onSceneEnd"
            java.lang.String r20 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r21 = "Undefined"
            java.lang.String r22 = "startActivity"
            java.lang.String r23 = "(Landroid/content/Intent;)V"
            r16 = r0
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r1 = r1.mo10231a(r15)
            android.content.Intent r1 = (android.content.Intent) r1
            r0.startActivity(r1)
            java.lang.String r17 = "com/tencent/mm/plugin/account/ui/MobileVerifyRegLogic"
            java.lang.String r18 = "onSceneEnd"
            java.lang.String r19 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r20 = "Undefined"
            java.lang.String r21 = "startActivity"
            java.lang.String r22 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            jg0.l$b r0 = jg0.C108742l.C108744b.VERIFIED
            jg0.C108742l.m147542a(r0)
        L_0x01af:
            return
        L_0x01b0:
            r3 = -35
            if (r11 != r3) goto L_0x01f1
            ei.a r1 = p148ei.C7660a.m7782a(r35)
            com.tencent.mm.autogen.mmdata.rpt.ThirdAppRegisterStruct r2 = r9.f345104i
            com.tencent.mm.plugin.account.ui.MobileVerifyUI r3 = r9.f345099d
            int r3 = r3.f196681H
            long r3 = (long) r3
            r2.f343856d = r3
            r3 = 7
            r2.f343857e = r3
            r2.mo86054n()
            if (r1 == 0) goto L_0x01da
            com.tencent.mm.plugin.account.ui.MobileVerifyUI r2 = r9.f345099d
            com.tencent.mm.plugin.account.ui.d2$i r3 = new com.tencent.mm.plugin.account.ui.d2$i
            r3.<init>(r13, r0)
            com.tencent.mm.plugin.account.ui.d2$j r0 = new com.tencent.mm.plugin.account.ui.d2$j
            r0.<init>(r9)
            r1.mo8792b(r2, r3, r0)
            goto L_0x01f0
        L_0x01da:
            com.tencent.mm.plugin.account.ui.MobileVerifyUI r0 = r9.f345099d
            r1 = 2131822464(0x7f110780, float:1.92777E38)
            java.lang.String r1 = r0.getString(r1)
            com.tencent.mm.plugin.account.ui.d2$k r2 = new com.tencent.mm.plugin.account.ui.d2$k
            r2.<init>(r13)
            com.tencent.mm.plugin.account.ui.d2$l r3 = new com.tencent.mm.plugin.account.ui.d2$l
            r3.<init>(r9)
            nj3.C76879j.m92750u(r0, r1, r14, r2, r3)
        L_0x01f0:
            return
        L_0x01f1:
            r3 = -212(0xffffffffffffff2c, float:NaN)
            if (r11 != r3) goto L_0x02bd
            android.content.Intent r3 = new android.content.Intent
            com.tencent.mm.plugin.account.ui.MobileVerifyUI r4 = r9.f345099d
            java.lang.Class<com.tencent.mm.plugin.account.ui.MobileLoginOrForceReg> r8 = com.tencent.p014mm.plugin.account.p024ui.MobileLoginOrForceReg.class
            r3.<init>(r4, r8)
            java.lang.String r4 = r0.mo91381r1()
            java.lang.String r8 = "ticket"
            r3.putExtra(r8, r4)
            com.tencent.mm.plugin.account.ui.MobileVerifyUI r4 = r9.f345099d
            java.lang.String r4 = r4.f196691p
            java.lang.String r8 = "moble"
            r3.putExtra(r8, r4)
            com.tencent.mm.plugin.account.ui.MobileVerifyUI r4 = r9.f345099d
            java.lang.String r4 = r4.f196679F
            r3.putExtra(r6, r4)
            com.tencent.mm.plugin.account.ui.MobileVerifyUI r4 = r9.f345099d
            java.lang.String r4 = r4.f196680G
            r3.putExtra(r5, r4)
            com.tencent.mm.plugin.account.ui.MobileVerifyUI r4 = r9.f345099d
            int r4 = r4.f196681H
            r3.putExtra(r2, r4)
            int r2 = r0.mo91377o1()
            java.lang.String r4 = "next_controll"
            r3.putExtra(r4, r2)
            java.lang.String r2 = r0.getUsername()
            java.lang.String r4 = "username"
            r3.putExtra(r4, r2)
            java.lang.String r2 = r0.mo91380q1()
            java.lang.String r4 = "password"
            r3.putExtra(r4, r2)
            java.lang.String r2 = r0.mo91362I()
            java.lang.String r4 = "nickname"
            r3.putExtra(r4, r2)
            java.lang.String r2 = r0.mo91379q0()
            java.lang.String r4 = "avatar_url"
            r3.putExtra(r4, r2)
            com.tencent.mm.plugin.account.ui.MobileVerifyUI r2 = r9.f345099d
            int r2 = r2.f196697v
            r3.putExtra(r1, r2)
            int r0 = r0.mo91376n1()
            java.lang.String r1 = "need_do_post_check"
            r3.putExtra(r1, r0)
            com.tencent.mm.plugin.account.ui.MobileVerifyUI r0 = r9.f345099d
            int r1 = r0.f196697v
            if (r1 != r7) goto L_0x0283
            java.lang.String r0 = r0.f196696u
            java.lang.String r1 = "kintent_nickname"
            r3.putExtra(r1, r0)
            com.tencent.mm.plugin.account.ui.MobileVerifyUI r0 = r9.f345099d
            java.lang.String r0 = r0.f196694s
            java.lang.String r1 = "kintent_password"
            r3.putExtra(r1, r0)
            com.tencent.mm.plugin.account.ui.MobileVerifyUI r0 = r9.f345099d
            java.lang.Boolean r0 = r0.f196695t
            java.lang.String r1 = "kintent_hasavatar"
            r3.putExtra(r1, r0)
        L_0x0283:
            com.tencent.mm.plugin.account.ui.MobileVerifyUI r0 = r9.f345099d
            k20.a r1 = new k20.a
            r1.<init>()
            r1.mo10233c(r3)
            java.lang.Object[] r17 = r1.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/account/ui/MobileVerifyRegLogic"
            java.lang.String r19 = "onSceneEnd"
            java.lang.String r20 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r21 = "Undefined"
            java.lang.String r22 = "startActivity"
            java.lang.String r23 = "(Landroid/content/Intent;)V"
            r16 = r0
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r1 = r1.mo10231a(r15)
            android.content.Intent r1 = (android.content.Intent) r1
            r0.startActivity(r1)
            java.lang.String r17 = "com/tencent/mm/plugin/account/ui/MobileVerifyRegLogic"
            java.lang.String r18 = "onSceneEnd"
            java.lang.String r19 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r20 = "Undefined"
            java.lang.String r21 = "startActivity"
            java.lang.String r22 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            return
        L_0x02bd:
            r0 = -51
            if (r11 != r0) goto L_0x062b
            ei.a r0 = p148ei.C7660a.m7782a(r35)
            if (r0 == 0) goto L_0x02cd
            com.tencent.mm.plugin.account.ui.MobileVerifyUI r1 = r9.f345099d
            r0.mo8792b(r1, r14, r14)
            goto L_0x02d8
        L_0x02cd:
            com.tencent.mm.plugin.account.ui.MobileVerifyUI r0 = r9.f345099d
            r1 = 2131822534(0x7f1107c6, float:1.9277842E38)
            r2 = 2131822540(0x7f1107cc, float:1.9277854E38)
            nj3.C76879j.m92738i(r0, r1, r2)
        L_0x02d8:
            return
        L_0x02d9:
            r2 = 26
            if (r1 != r2) goto L_0x062b
            if (r10 != 0) goto L_0x02e6
            if (r11 != 0) goto L_0x02e6
            r9.mo174875e(r0)
            goto L_0x062b
        L_0x02e6:
            com.tencent.mm.plugin.account.ui.MobileVerifyUI r0 = r9.f345099d
            r1 = 30844(0x787c, float:4.3222E-41)
            sf0.C13665i0.m12970c(r0, r12, r1)
            goto L_0x062b
        L_0x02ef:
            int r1 = r36.getType()
            r5 = 126(0x7e, float:1.77E-43)
            if (r1 != r5) goto L_0x062b
            r1 = -6
            if (r11 == r1) goto L_0x05d0
            r1 = -311(0xfffffffffffffec9, float:NaN)
            if (r11 == r1) goto L_0x05d0
            r1 = -310(0xfffffffffffffeca, float:NaN)
            if (r11 != r1) goto L_0x0304
            goto L_0x05d0
        L_0x0304:
            if (r10 != 0) goto L_0x05c2
            if (r11 != 0) goto L_0x05c2
            com.tencent.mm.plugin.account.ui.MobileVerifyUI r1 = r9.f345099d
            java.lang.String r6 = r1.f196691p
            java.lang.Boolean r5 = r1.f196695t
            java.lang.String r8 = r1.f196694s
            java.lang.String r8 = r1.f196696u
            com.tencent.mm.autogen.mmdata.rpt.ThirdAppRegisterStruct r8 = r9.f345104i
            int r1 = r1.f196681H
            r19 = r4
            long r3 = (long) r1
            r8.f343856d = r3
            r3 = 6
            r8.f343857e = r3
            r8.mo86054n()
            r1 = r13
            com.tencent.mm.modelsimple.c0 r1 = (com.tencent.p014mm.modelsimple.C114739c0) r1
            com.tencent.mm.network.u r3 = r1.f343995e
            eb0.n3 r3 = (eb0.C116749n3) r3
            qe3.u0 r3 = r3.f350053b
            te3.t33 r3 = r3.f353324a
            te3.d54 r3 = r3.f354406G
            if (r3 == 0) goto L_0x0358
            java.util.LinkedList<te3.vc4> r4 = r3.f182633e
            if (r4 == 0) goto L_0x0358
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x0358
            java.util.LinkedList<te3.vc4> r3 = r3.f182633e
            java.util.Iterator r3 = r3.iterator()
        L_0x0341:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0358
            java.lang.Object r4 = r3.next()
            te3.vc4 r4 = (te3.vc4) r4
            int r8 = r4.f185871d
            if (r8 != r7) goto L_0x0341
            java.lang.String r3 = r4.f185872e
            int r3 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r3, (int) r15)
            goto L_0x0359
        L_0x0358:
            r3 = 0
        L_0x0359:
            java.lang.String r8 = r1.mo174373l1()
            int r4 = r1.mo174374m1()
            java.lang.String r15 = r1.mo174375n1()
            java.lang.String r7 = "wording"
            java.util.Map r7 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r15, r7, r14)
            if (r7 == 0) goto L_0x03ba
            java.lang.String r14 = ".wording.switch"
            java.lang.Object r14 = r7.get(r14)
            java.lang.String r14 = (java.lang.String) r14
            boolean r24 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r24 == 0) goto L_0x037e
        L_0x037c:
            r10 = 1
            goto L_0x038a
        L_0x037e:
            int r14 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r14)
            if (r14 != 0) goto L_0x0385
            goto L_0x0389
        L_0x0385:
            r10 = 1
            if (r14 != r10) goto L_0x0389
            goto L_0x037c
        L_0x0389:
            r10 = 0
        L_0x038a:
            if (r10 == 0) goto L_0x03b4
            java.lang.String r14 = ".wording.title"
            java.lang.Object r14 = r7.get(r14)
            java.lang.String r14 = (java.lang.String) r14
            boolean r24 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r24 != 0) goto L_0x039d
            r24 = r10
            goto L_0x03a0
        L_0x039d:
            r24 = r10
            r14 = 0
        L_0x03a0:
            java.lang.String r10 = ".wording.desc"
            java.lang.Object r7 = r7.get(r10)
            java.lang.String r7 = (java.lang.String) r7
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r10 != 0) goto L_0x03b1
            r10 = r7
            r7 = 1
            goto L_0x03bf
        L_0x03b1:
            r7 = 1
            r10 = 0
            goto L_0x03bf
        L_0x03b4:
            r24 = r10
            r7 = 1
            r10 = 0
            r14 = 0
            goto L_0x03bf
        L_0x03ba:
            r7 = 1
            r10 = 0
            r14 = 0
            r24 = 0
        L_0x03bf:
            java.lang.Object[] r11 = new java.lang.Object[r7]
            r21 = 0
            r11[r21] = r5
            java.lang.String r12 = "hasSetAvatar , %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r12, r11)
            java.lang.Object[] r11 = new java.lang.Object[r7]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r11[r21] = r3
            java.lang.String r3 = "styleId , %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r11)
            java.lang.Object[] r3 = new java.lang.Object[r7]
            r3[r21] = r8
            java.lang.String r11 = "nextStep , %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r11, r3)
            java.lang.Object[] r3 = new java.lang.Object[r7]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r4)
            r3[r21] = r11
            java.lang.String r11 = "nextStyle , %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r11, r3)
            java.lang.Object[] r3 = new java.lang.Object[r7]
            r3[r21] = r15
            java.lang.String r11 = "mShowStyleContactUploadWordings , %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r11, r3)
            f40.C86718e.m107546E()
            f40.C86718e.f251744t = r7
            r2 = 8
            com.tencent.p014mm.plugin.report.service.C5139t.m5183e(r7, r2)
            r2 = 3
            com.tencent.p014mm.plugin.report.service.C5139t.m5183e(r7, r2)
            com.tencent.p014mm.plugin.report.service.C5139t.m5183e(r7, r7)
            boolean r2 = r5.booleanValue()
            if (r2 == 0) goto L_0x049d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = a70.C112760b.m154235i()
            r0.append(r1)
            java.lang.String r1 = "temp.avatar"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = a70.C112760b.m154235i()
            r2.append(r3)
            java.lang.String r3 = "temp.avatar.hd"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.vfs.C86013q1.m106463x(r0, r2)
            com.tencent.p014mm.vfs.C86013q1.m106447h(r0)
            r26 = 156(0x9c, float:2.19E-43)
            r27 = 156(0x9c, float:2.19E-43)
            android.graphics.Bitmap$CompressFormat r28 = android.graphics.Bitmap.CompressFormat.JPEG
            r29 = 90
            r31 = 1
            r25 = r2
            r30 = r0
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.createThumbNail((java.lang.String) r25, (int) r26, (int) r27, (android.graphics.Bitmap.CompressFormat) r28, (int) r29, (java.lang.String) r30, (boolean) r31)
            java.lang.Class<ln.p> r0 = p196ln.C117475p.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ln.p r0 = (p196ln.C117475p) r0
            com.tencent.mm.plugin.account.ui.MobileVerifyUI r2 = r9.f345099d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = a70.C112760b.m154235i()
            r3.append(r5)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r7 = 1
            ln.o r11 = r0.mo182091fC(r2, r1, r7)
            com.tencent.mm.plugin.account.ui.d2$d r12 = new com.tencent.mm.plugin.account.ui.d2$d
            r0 = r12
            r1 = r32
            r2 = r36
            r3 = r6
            r15 = r4
            r4 = r8
            r5 = r24
            r22 = r6
            r6 = r14
            r13 = 1
            r7 = r10
            r17 = r8
            r8 = r15
            r0.<init>(r2, r3, r4, r5, r6, r7, r8)
            com.tencent.mm.plugin.account.ui.d2$e r8 = new com.tencent.mm.plugin.account.ui.d2$e
            r0 = r8
            r3 = r22
            r4 = r17
            r10 = r8
            r8 = r15
            r0.<init>(r2, r3, r4, r5, r6, r7, r8)
            com.tencent.mm.modelavatar.s r11 = (com.tencent.p014mm.modelavatar.C1295s) r11
            r11.mo1219a(r13, r12, r10)
            goto L_0x05c3
        L_0x049d:
            r15 = r4
            r22 = r6
            r17 = r8
            r13 = 1
            java.lang.String r1 = r1.mo174376o1()
            r9.f345100e = r1
            eb0.i3 r1 = eb0.C7624i3.f25910c
            java.lang.String r2 = "login_user_name"
            r3 = r22
            r1.mo8756d(r2, r3)
            java.lang.String r1 = "LauncherUI.enter_from_reg"
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            r3 = r17
            if (r3 == 0) goto L_0x0521
            java.lang.String r4 = "0"
            boolean r4 = r3.contains(r4)
            if (r4 == 0) goto L_0x0521
            java.lang.String r4 = "R300_100_phone"
            wg0.C78595a.m94985e(r4)
            if (r24 != 0) goto L_0x04d3
            android.content.Intent r4 = new android.content.Intent
            com.tencent.mm.plugin.account.ui.MobileVerifyUI r5 = r9.f345099d
            java.lang.Class<com.tencent.mm.plugin.account.bind.ui.FindMContactIntroUI> r6 = com.tencent.p014mm.plugin.account.bind.p021ui.FindMContactIntroUI.class
            r4.<init>(r5, r6)
            goto L_0x04e6
        L_0x04d3:
            android.content.Intent r4 = new android.content.Intent
            com.tencent.mm.plugin.account.ui.MobileVerifyUI r5 = r9.f345099d
            java.lang.Class<com.tencent.mm.plugin.account.bind.ui.FindMContactAlertUI> r6 = com.tencent.p014mm.plugin.account.bind.p021ui.FindMContactAlertUI.class
            r4.<init>(r5, r6)
            java.lang.String r5 = "alert_title"
            r4.putExtra(r5, r14)
            java.lang.String r5 = "alert_message"
            r4.putExtra(r5, r10)
        L_0x04e6:
            r4.addFlags(r2)
            java.lang.String r5 = r9.f345100e
            r6 = r19
            r4.putExtra(r6, r5)
            java.lang.String r5 = "regsetinfo_NextStep"
            r4.putExtra(r5, r3)
            java.lang.String r3 = "regsetinfo_NextStyle"
            r4.putExtra(r3, r15)
            di3.d r0 = di3.C86312j.m106911c(r0)
            om.f r0 = (p214om.C11502f) r0
            wc3.z r0 = r0.mo11462yM()
            com.tencent.mm.plugin.account.ui.MobileVerifyUI r3 = r9.f345099d
            com.tencent.mm.app.r1 r0 = (com.tencent.p014mm.app.C67654r1) r0
            android.content.Intent r0 = r0.mo93169b(r3)
            r0.addFlags(r2)
            r0.putExtra(r1, r13)
            com.tencent.mm.plugin.account.ui.MobileVerifyUI r1 = r9.f345099d
            com.tencent.p014mm.p136ui.MMWizardActivity.m7018M7(r1, r4, r0)
            r32.mo174873c()
            com.tencent.mm.plugin.account.ui.MobileVerifyUI r0 = r9.f345099d
            r0.finish()
            goto L_0x05c3
        L_0x0521:
            di3.d r0 = di3.C86312j.m106911c(r0)
            om.f r0 = (p214om.C11502f) r0
            wc3.z r0 = r0.mo11462yM()
            com.tencent.mm.plugin.account.ui.MobileVerifyUI r3 = r9.f345099d
            com.tencent.mm.app.r1 r0 = (com.tencent.p014mm.app.C67654r1) r0
            android.content.Intent r0 = r0.mo93169b(r3)
            r0.addFlags(r2)
            r0.putExtra(r1, r13)
            com.tencent.mm.plugin.account.ui.MobileVerifyUI r1 = r9.f345099d
            k20.a r2 = new k20.a
            r2.<init>()
            r2.mo10233c(r0)
            java.lang.Object[] r25 = r2.mo10232b()
            java.lang.String r26 = "com/tencent/mm/plugin/account/ui/MobileVerifyRegLogic"
            java.lang.String r27 = "onSceneEnd"
            java.lang.String r28 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r29 = "Undefined"
            java.lang.String r30 = "startActivity"
            java.lang.String r31 = "(Landroid/content/Intent;)V"
            r24 = r1
            j20.C117292a.m165358d(r24, r25, r26, r27, r28, r29, r30, r31)
            r0 = 0
            java.lang.Object r2 = r2.mo10231a(r0)
            android.content.Intent r2 = (android.content.Intent) r2
            r1.startActivity(r2)
            java.lang.String r25 = "com/tencent/mm/plugin/account/ui/MobileVerifyRegLogic"
            java.lang.String r26 = "onSceneEnd"
            java.lang.String r27 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r28 = "Undefined"
            java.lang.String r29 = "startActivity"
            java.lang.String r30 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r24, r25, r26, r27, r28, r29, r30)
            r0 = 10645(0x2995, float:1.4917E-41)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            f40.C86709a0.m107523b()
            java.lang.String r2 = f40.C86718e.m107547e()
            r1.append(r2)
            java.lang.String r2 = ","
            r1.append(r2)
            com.tencent.mm.plugin.account.ui.MobileVerifyUI r3 = r9.f345099d
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            r1.append(r3)
            r1.append(r2)
            java.lang.String r3 = "R200_900_phone"
            r1.append(r3)
            r1.append(r2)
            f40.C86709a0.m107523b()
            int r3 = f40.C86718e.m107548f(r3)
            r1.append(r3)
            r1.append(r2)
            r2 = 4
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            wg0.C78595a.m94982b(r0, r1)
            r32.mo174873c()
            com.tencent.mm.plugin.account.ui.MobileVerifyUI r0 = r9.f345099d
            r0.finish()
            goto L_0x05c3
        L_0x05c2:
            r13 = 1
        L_0x05c3:
            ei.a r0 = p148ei.C7660a.m7782a(r35)
            if (r0 == 0) goto L_0x062b
            com.tencent.mm.plugin.account.ui.MobileVerifyUI r1 = r9.f345099d
            r2 = 0
            r0.mo8792b(r1, r2, r2)
            return
        L_0x05d0:
            com.tencent.mm.plugin.account.ui.MobileVerifyUI r6 = r9.f345099d
            java.lang.String r0 = r6.f196691p
            java.lang.Boolean r7 = r6.f196695t
            java.lang.String r8 = r6.f196694s
            java.lang.String r10 = r6.f196696u
            com.tencent.mm.ui.applet.SecurityImage r0 = r6.f196693r
            if (r0 != 0) goto L_0x0618
            r11 = 2131834632(0x7f113708, float:1.930238E38)
            r12 = 0
            r0 = r36
            com.tencent.mm.modelsimple.c0 r0 = (com.tencent.p014mm.modelsimple.C114739c0) r0
            byte[] r13 = r0.mo174371j1()
            java.lang.String r14 = r0.mo174372k1()
            com.tencent.mm.plugin.account.ui.d2$a r16 = new com.tencent.mm.plugin.account.ui.d2$a
            r0 = r16
            r1 = r32
            r2 = r8
            r3 = r10
            r4 = r36
            r5 = r7
            r0.<init>(r2, r3, r4, r5)
            r17 = 0
            com.tencent.mm.plugin.account.ui.d2$b r15 = new com.tencent.mm.plugin.account.ui.d2$b
            r15.<init>()
            com.tencent.mm.plugin.account.ui.d2$c r19 = new com.tencent.mm.plugin.account.ui.d2$c
            r0 = r19
            r0.<init>(r2, r3, r4, r5)
            java.lang.String r0 = ""
            r10 = r6
            r1 = r15
            r15 = r0
            r18 = r1
            com.tencent.mm.ui.applet.SecurityImage r0 = com.tencent.p014mm.p136ui.applet.SecurityImage.C116047a.m163296a(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r6.f196693r = r0
            goto L_0x062a
        L_0x0618:
            r1 = r36
            com.tencent.mm.modelsimple.c0 r1 = (com.tencent.p014mm.modelsimple.C114739c0) r1
            byte[] r2 = r1.mo174371j1()
            java.lang.String r1 = r1.mo174372k1()
            java.lang.String r3 = ""
            r4 = 0
            r0.mo177230b(r4, r2, r1, r3)
        L_0x062a:
            return
        L_0x062b:
            r0 = 1
            com.tencent.mm.plugin.account.ui.MobileVerifyUI r1 = r9.f345099d
            r2 = r33
            r3 = r34
            r4 = r35
            boolean r1 = r1.mo93999J7(r2, r3, r4)
            if (r1 == 0) goto L_0x063b
            return
        L_0x063b:
            int r1 = r36.getType()
            r5 = 252(0xfc, float:3.53E-43)
            if (r1 == r5) goto L_0x064b
            int r1 = r36.getType()
            r5 = 701(0x2bd, float:9.82E-43)
            if (r1 != r5) goto L_0x065b
        L_0x064b:
            ei.a r1 = p148ei.C7660a.m7782a(r35)
            if (r1 == 0) goto L_0x065b
            com.tencent.mm.plugin.account.ui.MobileVerifyUI r4 = r9.f345099d
            r5 = 0
            boolean r1 = r1.mo8792b(r4, r5, r5)
            if (r1 == 0) goto L_0x065b
            return
        L_0x065b:
            if (r2 != 0) goto L_0x065f
            if (r3 == 0) goto L_0x067f
        L_0x065f:
            com.tencent.mm.plugin.account.ui.MobileVerifyUI r1 = r9.f345099d
            r4 = 2131822533(0x7f1107c5, float:1.927784E38)
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r33)
            r6 = 0
            r5[r6] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r34)
            r5[r0] = r2
            java.lang.String r0 = r1.getString(r4, r5)
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r1, (java.lang.CharSequence) r0, (int) r6)
            r0.show()
        L_0x067f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.account.p024ui.C115102d2.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }

    public void start() {
        C86709a0.m107524d().mo123455a(126, this);
    }

    public void stop() {
        C86709a0.m107524d().mo123470p(126, this);
        C86709a0.m107524d().mo123470p(145, this);
        C86709a0.m107524d().mo123470p(701, this);
        C86709a0.m107524d().mo123470p(252, this);
        C86709a0.m107524d().mo123470p(255, this);
    }
}
