package com.tencent.p014mm.plugin.account.p024ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import bc0.C67216a;
import com.pay.tool.APPluginConstants;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.mmdata.rpt.FoldingPhoneLoginTypeStruct;
import com.tencent.p014mm.modelsimple.C114735a0;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.applet.SecurityImage;
import com.tencent.p014mm.plugin.account.p024ui.C115203z0;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.PhoneFormater;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C75576f4;
import eb0.C75592q0;
import eb0.C75593t5;
import eb0.C7624i3;
import f40.C86709a0;
import f40.C86718e;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import kg3.C76577a;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p148ei.C7660a;
import p156gj.C87203t;
import p206nj.C76861g;
import p214om.C11502f;
import p910lj.C76701a;
import qo3.C89779i0;
import sf0.C118276e;
import sf0.C13665i0;
import wg0.C78595a;

/* renamed from: com.tencent.mm.plugin.account.ui.p1 */
public class C115152p1 implements MobileInputUI$$u, C11385n {

    /* renamed from: d */
    public MobileInputUI f345193d;

    /* renamed from: e */
    public SecurityImage f345194e = null;

    /* renamed from: f */
    public String f345195f;

    /* renamed from: g */
    public String f345196g;

    /* renamed from: h */
    public String f345197h;

    /* renamed from: i */
    public boolean f345198i = true;

    /* renamed from: j */
    public String f345199j;

    /* renamed from: com.tencent.mm.plugin.account.ui.p1$a */
    public class C115153a implements DialogInterface.OnClickListener {
        public C115153a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C115152p1.m161952c(C115152p1.this);
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.p1$b */
    public class C115154b implements DialogInterface.OnClickListener {
        public C115154b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C115152p1.this.f345193d.f344694h.mo101693b();
            C115152p1 p1Var = C115152p1.this;
            p1Var.mo174918g(p1Var.f345196g);
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.p1$c */
    public class C115155c implements C115203z0.C115206d {
        public C115155c() {
        }

        /* renamed from: a */
        public void mo174591a(ProgressDialog progressDialog) {
            C115152p1.this.f345193d.f344697n = (C89779i0) progressDialog;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.p1$d */
    public class C115156d implements C75576f4.C75578b {
        public C115156d(C115152p1 p1Var) {
        }

        /* renamed from: a */
        public void mo57753a(C114770g gVar) {
            if (gVar != null) {
                gVar.mo55443A3().mo55422X0(new byte[0], new byte[0], new byte[0], C86709a0.m107523b().mo121110g());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.p1$e */
    public class C115157e implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C115135m0 f345203d;

        /* renamed from: com.tencent.mm.plugin.account.ui.p1$e$a */
        public class C115158a implements DialogInterface.OnCancelListener {

            /* renamed from: d */
            public final /* synthetic */ C114735a0 f345205d;

            public C115158a(C115157e eVar, C114735a0 a0Var) {
                this.f345205d = a0Var;
            }

            public void onCancel(DialogInterface dialogInterface) {
                C86709a0.m107524d().mo123458d(this.f345205d);
            }
        }

        public C115157e(C115135m0 m0Var) {
            this.f345203d = m0Var;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105918d("MicroMsg.MobileInputIndepPassLoginLogic", "imgSid:" + this.f345203d.f345165e + " img len" + this.f345203d.f345167g.length + " " + C76861g.m92660c());
            C115135m0 m0Var = this.f345203d;
            C114735a0 a0Var = new C114735a0(m0Var.f345162b, m0Var.f345163c, m0Var.f345168h, C115152p1.this.f345194e.getSecImgCode(), C115152p1.this.f345194e.getSecImgSid(), C115152p1.this.f345194e.getSecImgEncryptKey(), 1, "", false, false);
            C86709a0.m107524d().mo123460f(a0Var);
            MobileInputUI mobileInputUI = C115152p1.this.f345193d;
            mobileInputUI.f344697n = C76879j.m92723Q(mobileInputUI, mobileInputUI.getString(C0966R.string.a3h), C115152p1.this.f345193d.getString(C0966R.string.gda), true, true, new C115158a(this, a0Var));
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.p1$f */
    public class C115159f implements DialogInterface.OnDismissListener {
        public C115159f() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            C115152p1.this.f345194e = null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.p1$g */
    public class C115160g implements Runnable {
        public C115160g() {
        }

        public void run() {
            Log.m105918d("MicroMsg.MobileInputIndepPassLoginLogic", "onSceneEnd, in runnable");
            Intent b = ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93169b(C115152p1.this.f345193d);
            b.addFlags(67108864);
            MobileInputUI mobileInputUI = C115152p1.this.f345193d;
            C9556a aVar = new C9556a();
            aVar.mo10233c(b);
            MobileInputUI mobileInputUI2 = mobileInputUI;
            C117292a.m165358d(mobileInputUI2, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/MobileInputSmsPwdLoginLogic$16", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            mobileInputUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(mobileInputUI2, "com/tencent/mm/plugin/account/ui/MobileInputSmsPwdLoginLogic$16", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C115152p1.this.f345193d.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.p1$h */
    public class C115161h implements DialogInterface.OnClickListener {
        public C115161h(C115152p1 p1Var) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.p1$i */
    public class C115162i implements DialogInterface.OnCancelListener {
        public C115162i(C115152p1 p1Var) {
        }

        public void onCancel(DialogInterface dialogInterface) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.p1$j */
    public class C115163j implements Runnable {
        public C115163j() {
        }

        public void run() {
            C115152p1.this.mo174915d(C115135m0.m161943c(), C115135m0.m161944d());
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.p1$k */
    public class C115164k implements View.OnClickListener {
        public C115164k() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/ui/MobileInputSmsPwdLoginLogic$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C115152p1 p1Var = C115152p1.this;
            String str = p1Var.f345196g;
            p1Var.getClass();
            if (!Util.isNullOrNil(str)) {
                C67216a aVar = new C67216a(str, 13, "", 0, "");
                C86709a0.m107524d().mo123460f(aVar);
                MobileInputUI mobileInputUI = p1Var.f345193d;
                mobileInputUI.f344697n = C76879j.m92723Q(mobileInputUI, mobileInputUI.getString(C0966R.string.a3h), p1Var.f345193d.getString(C0966R.string.a4d), true, true, new C115172q1(p1Var, aVar));
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/MobileInputSmsPwdLoginLogic$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.p1$l */
    public class C115165l implements View.OnClickListener {
        public C115165l() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/ui/MobileInputSmsPwdLoginLogic$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            MobileInputUI mobileInputUI = C115152p1.this.f345193d;
            mobileInputUI.f344683N[1] = 2;
            mobileInputUI.f344681L = 7;
            mobileInputUI.f344694h.mo101694c();
            C86709a0.m107524d().mo123470p(145, C115152p1.this);
            C115152p1.this.mo174917f();
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/MobileInputSmsPwdLoginLogic$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.p1$m */
    public class C115166m implements View.OnClickListener {
        public C115166m() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/ui/MobileInputSmsPwdLoginLogic$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            MobileInputUI mobileInputUI = C115152p1.this.f345193d;
            mobileInputUI.f344683N[1] = 1;
            mobileInputUI.f344681L = 6;
            C86709a0.m107524d().mo123455a(145, C115152p1.this);
            C115152p1.this.mo174917f();
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/MobileInputSmsPwdLoginLogic$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.p1$n */
    public class C115167n implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C67216a f345212d;

        public C115167n(C115152p1 p1Var, C67216a aVar) {
            this.f345212d = aVar;
        }

        public void onCancel(DialogInterface dialogInterface) {
            C86709a0.m107524d().mo123458d(this.f345212d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.p1$o */
    public class C115168o implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C114735a0 f345213d;

        public C115168o(C115152p1 p1Var, C114735a0 a0Var) {
            this.f345213d = a0Var;
        }

        public void onCancel(DialogInterface dialogInterface) {
            C86709a0.m107524d().mo123458d(this.f345213d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.p1$p */
    public class C115169p implements DialogInterface.OnClickListener {
        public C115169p() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C115152p1.m161952c(C115152p1.this);
        }
    }

    /* renamed from: c */
    public static void m161952c(C115152p1 p1Var) {
        p1Var.getClass();
        Intent intent = new Intent(p1Var.f345193d, LoginByMobileSendSmsUI.class);
        intent.putExtra("from_mobile", p1Var.f345196g);
        intent.putExtra("from_switch_account", p1Var.f345193d.f344685Q);
        MobileInputUI mobileInputUI = p1Var.f345193d;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        MobileInputUI mobileInputUI2 = mobileInputUI;
        C117292a.m165358d(mobileInputUI2, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/MobileInputSmsPwdLoginLogic", "jumpToLoginSmsUp", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        mobileInputUI.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(mobileInputUI2, "com/tencent/mm/plugin/account/ui/MobileInputSmsPwdLoginLogic", "jumpToLoginSmsUp", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: a */
    public void mo174715a(MobileInputUI$$t mobileInputUI$$t) {
        if (mobileInputUI$$t.ordinal() == 1) {
            Log.m105924i("MicroMsg.MobileInputIndepPassLoginLogic", "goNext");
            this.f345193d.hideVKB();
            MobileInputUI mobileInputUI = this.f345193d;
            mobileInputUI.f344673D = PhoneFormater.countryCodeWithPlus(mobileInputUI.f344677H);
            MobileInputUI mobileInputUI2 = this.f345193d;
            mobileInputUI2.f344674E = mobileInputUI2.f344692f.getText().toString();
            if (!Util.isNullOrNil(this.f345193d.f344673D) && !Util.isNullOrNil(this.f345193d.f344674E)) {
                MobileInputUI mobileInputUI3 = this.f345193d;
                int i = mobileInputUI3.f344681L;
                if (i == 7) {
                    if (!Util.isNullOrNil((String) null)) {
                        mo174915d(this.f345196g, (String) null);
                    } else {
                        mo174915d(this.f345196g, this.f345193d.f344690d.getText().toString());
                    }
                } else if (i == 6) {
                    String trim = mobileInputUI3.f344694h.getText().toString().trim();
                    if (Util.isNullOrNil(trim)) {
                        C76879j.m92738i(this.f345193d, C0966R.string.k_6, C0966R.string.gcw);
                        return;
                    }
                    this.f345193d.hideVKB();
                    C67216a aVar = new C67216a(this.f345196g, 17, trim, 0, "");
                    C86709a0.m107524d().mo123460f(aVar);
                    MobileInputUI mobileInputUI4 = this.f345193d;
                    mobileInputUI4.f344697n = C76879j.m92723Q(mobileInputUI4, mobileInputUI4.getString(C0966R.string.a3h), this.f345193d.getString(C0966R.string.al4), true, true, new C115176r1(this, aVar));
                }
            }
        }
    }

    /* renamed from: b */
    public void mo174716b(MobileInputUI mobileInputUI) {
        this.f345193d = mobileInputUI;
        mobileInputUI.f344704u.setVisibility(0);
        String stringExtra = mobileInputUI.getIntent().getStringExtra("binded_mobile");
        this.f345196g = stringExtra;
        if (Util.isNullOrNil(stringExtra)) {
            this.f345196g = PhoneFormater.pureNumber(mobileInputUI.f344673D + mobileInputUI.f344674E);
        }
        mobileInputUI.f344692f.setTextColor(mobileInputUI.getResources().getColor(C0966R.color.f3563xt));
        mobileInputUI.f344692f.setEnabled(false);
        mobileInputUI.f344692f.setFocusable(false);
        mobileInputUI.f344691e.setFocusable(false);
        mobileInputUI.f344691e.setText(PhoneFormater.pureNumber(this.f345196g));
        mobileInputUI.f344691e.setVisibility(0);
        mo174917f();
        mobileInputUI.f344705v.setVisibility(0);
        mobileInputUI.f344701r.setText(C0966R.string.gd4);
        mobileInputUI.f344701r.setVisibility(0);
        mobileInputUI.f344701r.setEnabled(true);
        this.f345199j = C7624i3.f25910c.mo19a("login_weixin_username", "");
        String stringExtra2 = mobileInputUI.getIntent().getStringExtra("auth_ticket");
        this.f345195f = stringExtra2;
        if (!Util.isNullOrNil(stringExtra2)) {
            new MMHandler().postDelayed(new C115163j(), 500);
        }
    }

    /* renamed from: d */
    public final void mo174915d(String str, String str2) {
        if (Util.isNullOrNil(str)) {
            C76879j.m92738i(this.f345193d, C0966R.string.k_7, C0966R.string.gcw);
        } else if (Util.isNullOrNil(str2)) {
            C76879j.m92738i(this.f345193d, C0966R.string.k9z, C0966R.string.gcw);
        } else {
            this.f345193d.f344690d.setText(str2);
            this.f345193d.hideVKB();
            C114735a0 a0Var = new C114735a0(str, str2, (String) null, 1);
            C86709a0.m107524d().mo123460f(a0Var);
            MobileInputUI mobileInputUI = this.f345193d;
            mobileInputUI.f344697n = C76879j.m92723Q(mobileInputUI, mobileInputUI.getString(C0966R.string.a3h), this.f345193d.getString(C0966R.string.gda), true, true, new C115168o(this, a0Var));
        }
    }

    /* renamed from: e */
    public boolean mo174916e(int i, int i2, String str) {
        String str2;
        if (((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93163uP(this.f345193d, i, i2, str)) {
            return true;
        }
        if (i == 4) {
            if (i2 != -2023) {
                if (i2 == -140) {
                    if (!Util.isNullOrNil(this.f345197h)) {
                        C13665i0.m12972e(this.f345193d, str, this.f345197h);
                    }
                    return true;
                } else if (i2 != -100) {
                    if (i2 == -9) {
                        C76879j.m92738i(this.f345193d, C0966R.string.gcv, C0966R.string.gcw);
                        return true;
                    } else if (i2 == -3) {
                        C76879j.m92738i(this.f345193d, C0966R.string.cbm, C0966R.string.gcw);
                        return true;
                    } else if (i2 != -1) {
                        switch (i2) {
                            case APPluginConstants.ERROR_IO_ObjectStreamException_InvalidObjectException:
                                C76701a.makeText((Context) this.f345193d, (int) C0966R.string.ajx, 0).show();
                                return true;
                            case APPluginConstants.ERROR_IO_ObjectStreamException_InvalidClassException:
                                C76879j.m92742m(this.f345193d, C0966R.string.al9, C0966R.string.ale, (DialogInterface.OnClickListener) null);
                                return true;
                            case APPluginConstants.ERROR_IO_NoHttpResponseException:
                                C76879j.m92742m(this.f345193d, C0966R.string.ala, C0966R.string.ale, (DialogInterface.OnClickListener) null);
                                return true;
                        }
                    } else if (C86709a0.m107524d().mo123467m() != 5) {
                        return false;
                    } else {
                        C76879j.m92738i(this.f345193d, C0966R.string.h7_, C0966R.string.h79);
                        return true;
                    }
                }
            }
            C86709a0.m107523b();
            C86718e.m107550n();
            MobileInputUI mobileInputUI = this.f345193d;
            C86709a0.m107523b();
            if (TextUtils.isEmpty(C86718e.f251747w)) {
                str2 = C76577a.m92166q(this.f345193d, C0966R.string.gmc);
            } else {
                C86709a0.m107523b();
                str2 = C86718e.f251747w;
            }
            C76879j.m92719M(mobileInputUI, str2, this.f345193d.getString(C0966R.string.a3h), new C115161h(this), new C115162i(this));
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final void mo174917f() {
        MobileInputUI mobileInputUI = this.f345193d;
        int i = mobileInputUI.f344681L;
        if (i == 6) {
            mobileInputUI.f344694h.mo101694c();
            this.f345193d.f344705v.setText(C0966R.string.gd7);
            this.f345193d.f344693g.setVisibility(8);
            this.f345193d.f344694h.setVisibility(0);
            this.f345193d.f344694h.getContentEditText().requestFocus();
            this.f345193d.f344694h.setSendSmsBtnClickListener(new C115164k());
            this.f345193d.f344705v.setOnClickListener(new C115165l());
        } else if (i == 7) {
            mobileInputUI.f344705v.setText(C0966R.string.gd8);
            this.f345193d.f344693g.setVisibility(0);
            this.f345193d.f344690d.requestFocus();
            this.f345193d.f344694h.setVisibility(8);
            this.f345193d.f344705v.setOnClickListener(new C115166m());
        }
    }

    /* renamed from: g */
    public final void mo174918g(String str) {
        C67216a aVar = new C67216a(str, 16, "", 0, "");
        C86709a0.m107524d().mo123460f(aVar);
        MobileInputUI mobileInputUI = this.f345193d;
        mobileInputUI.f344697n = C76879j.m92723Q(mobileInputUI, mobileInputUI.getString(C0966R.string.a3h), this.f345193d.getString(C0966R.string.a4d), true, true, new C115167n(this, aVar));
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        MobileInputUI mobileInputUI;
        boolean z;
        int i3 = i;
        int i4 = i2;
        String str2 = str;
        Log.m105924i("MicroMsg.MobileInputIndepPassLoginLogic", "onSceneEnd: errType = " + i3 + " errCode = " + i4 + " errMsg = " + str2);
        C89779i0 i0Var = this.f345193d.f344697n;
        if (i0Var != null) {
            i0Var.dismiss();
            this.f345193d.f344697n = null;
        }
        if (yVar.getType() == 145) {
            C67216a aVar = (C67216a) yVar;
            int f = aVar.mo91368f();
            if (f == 13) {
                if (i4 == -36) {
                    C7660a a = C7660a.m7782a(str);
                    if (aVar.mo91372j1() == 1) {
                        Log.m105924i("MicroMsg.MobileInputIndepPassLoginLogic", "login check state, sms up");
                        if (a != null) {
                            a.mo8792b(this.f345193d, new C115169p(), (DialogInterface.OnClickListener) null);
                            return;
                        } else {
                            MobileInputUI mobileInputUI2 = this.f345193d;
                            C76879j.m92750u(mobileInputUI2, mobileInputUI2.getString(C0966R.string.gcl), "", new C115153a(), (DialogInterface.OnClickListener) null);
                        }
                    } else if (a != null) {
                        a.mo8792b(this.f345193d, new C115154b(), (DialogInterface.OnClickListener) null);
                        return;
                    } else {
                        this.f345193d.f344694h.mo101693b();
                        mo174918g(this.f345196g);
                    }
                }
            } else if (f == 16) {
                if (i4 == -41) {
                    this.f345193d.f344694h.mo101694c();
                    C76879j.m92738i(this.f345193d, C0966R.string.hx6, C0966R.string.hx7);
                    return;
                } else if (i4 == -75) {
                    this.f345193d.f344694h.mo101694c();
                    MobileInputUI mobileInputUI3 = this.f345193d;
                    C76879j.m92748s(mobileInputUI3, mobileInputUI3.getString(C0966R.string.f7560jn), "");
                    return;
                } else if (i4 == -106) {
                    this.f345193d.f344694h.mo101694c();
                    C13665i0.m12970c(this.f345193d, str2, 0);
                    return;
                }
            } else if (f == 17) {
                if (i3 == 0 && i4 == 0) {
                    new C115203z0(new C115155c(), aVar.getUsername(), aVar.mo91380q1(), this.f345196g).mo174958b(this.f345193d);
                    return;
                } else if (!mo174916e(i, i2, str)) {
                    C7660a a2 = C7660a.m7782a(str);
                    if (a2 != null) {
                        a2.mo8792b(this.f345193d, (DialogInterface.OnClickListener) null, (DialogInterface.OnClickListener) null);
                    }
                } else {
                    return;
                }
            }
        } else if (yVar.getType() == 252 || yVar.getType() == 701) {
            C114735a0 a0Var = (C114735a0) yVar;
            this.f345197h = a0Var.mo174354j1();
            C115135m0 m0Var = new C115135m0();
            m0Var.f345165e = a0Var.mo174359o1();
            m0Var.f345167g = a0Var.mo174357m1();
            m0Var.f345166f = a0Var.mo174358n1();
            m0Var.f345168h = a0Var.mo174360p1();
            m0Var.f345162b = a0Var.f343983h;
            m0Var.f345163c = this.f345193d.f344690d.getText().toString();
            if (i4 == -75) {
                C13665i0.m12971d(this.f345193d);
                return;
            } else if (i4 == -106) {
                C13665i0.m12970c(this.f345193d, str2, 32045);
                return;
            } else if (i4 == -217) {
                C13665i0.m12973f(this.f345193d, C118276e.m166845a(a0Var), i4);
                return;
            } else if (i4 == -205) {
                this.f345195f = a0Var.mo174355k1();
                String t1 = a0Var.mo174364t1();
                String l1 = a0Var.mo174356l1();
                Log.m105925i("MicroMsg.MobileInputIndepPassLoginLogic", "summerphone MM_ERR_QQ_OK_NEED_MOBILE authTicket[%s], closeShowStyle[%s]", Util.secPrint(this.f345195f), l1);
                C115135m0.f345161i = m0Var;
                Intent intent = new Intent();
                intent.putExtra("auth_ticket", this.f345195f);
                intent.putExtra("binded_mobile", t1);
                intent.putExtra("close_safe_device_style", l1);
                intent.putExtra("from_source", 6);
                ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93189v(this.f345193d, intent);
                return;
            } else if (i4 != -140) {
                if (i3 == 4 && (i4 == -16 || i4 == -17)) {
                    C86709a0.m107524d().mo123460f(new C75576f4(new C115156d(this), (String) null));
                    z = true;
                } else {
                    z = false;
                }
                if (i4 == -6 || i4 == -311 || i4 == -310) {
                    if (this.f345194e == null) {
                        this.f345194e = SecurityImage.C116047a.m163296a(this.f345193d, C0966R.string.hyo, m0Var.f345168h, m0Var.f345167g, m0Var.f345165e, m0Var.f345166f, new C115157e(m0Var), (DialogInterface.OnCancelListener) null, new C115159f(), m0Var);
                        return;
                    }
                    Log.m105918d("MicroMsg.MobileInputIndepPassLoginLogic", "imgSid:" + m0Var.f345165e + " img len" + m0Var.f345167g.length + " " + C76861g.m92660c());
                    this.f345194e.mo177230b(m0Var.f345168h, m0Var.f345167g, m0Var.f345165e, m0Var.f345166f);
                    return;
                } else if (z || (i3 == 0 && i4 == 0)) {
                    C86709a0.m107523b();
                    C86718e.m107546E();
                    Log.m105925i("MicroMsg.MobileInputIndepPassLoginLogic", "login username %s", m0Var.f345162b);
                    C13665i0.m12968a(this.f345193d, m0Var.f345162b);
                    String a3 = C7624i3.f25910c.mo19a("login_weixin_username", "");
                    if (this.f345193d.f344685Q) {
                        C75593t5.f222075c.mo105939b(this.f345199j, a3);
                        C75593t5.f222075c.mo105945h(C75592q0.m90789s(), C75592q0.m90788r());
                        C115669n.INSTANCE.mo160131h(14978, 1, 9, C75593t5.f222075c.mo105944g(), C75593t5.f222075c.mo105943f(), C87203t.m108273i());
                    }
                    if (C85875k4.m106157N() || C85875k4.m106210y()) {
                        FoldingPhoneLoginTypeStruct foldingPhoneLoginTypeStruct = new FoldingPhoneLoginTypeStruct();
                        foldingPhoneLoginTypeStruct.f107894d = 2;
                        foldingPhoneLoginTypeStruct.mo86054n();
                    }
                    C13665i0.m12969b(this.f345193d, new C115160g(), false, 2);
                    if (this.f345193d.f344681L == 6) {
                        this.f345198i = a0Var.mo174368x1();
                        if (a0Var.mo174365u1()) {
                            MobileInputUI mobileInputUI4 = this.f345193d;
                            boolean z2 = this.f345198i;
                            mobileInputUI4.getClass();
                            Intent intent2 = new Intent(mobileInputUI4, RegByMobileSetPwdUI.class);
                            intent2.putExtra("kintent_hint", mobileInputUI4.getString(C0966R.string.iul));
                            intent2.putExtra("kintent_cancelable", z2);
                            C9556a aVar2 = new C9556a();
                            aVar2.mo10233c(intent2);
                            C117292a.m165358d(mobileInputUI4, aVar2.mo10232b(), "com/tencent/mm/plugin/account/ui/MobileInputUI", "goToSetIndepPwd", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            mobileInputUI4.startActivity((Intent) aVar2.mo10231a(0));
                            C117292a.m165359e(mobileInputUI4, "com/tencent/mm/plugin/account/ui/MobileInputUI", "goToSetIndepPwd", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            return;
                        }
                        return;
                    }
                    return;
                } else if (!mo174916e(i, i2, str)) {
                    if (!(i3 == 0 && i4 == 0)) {
                        MobileInputUI mobileInputUI5 = this.f345193d;
                        C76701a.makeText((Context) mobileInputUI5, (CharSequence) mobileInputUI5.getString(C0966R.string.ey_, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}), 0).show();
                    }
                } else {
                    return;
                }
            } else if (!Util.isNullOrNil(this.f345197h)) {
                C13665i0.m12972e(this.f345193d, str2, this.f345197h);
                return;
            } else {
                return;
            }
        }
        C7660a a4 = C7660a.m7782a(str);
        if (a4 != null && (mobileInputUI = this.f345193d) != null) {
            a4.mo8792b(mobileInputUI, (DialogInterface.OnClickListener) null, (DialogInterface.OnClickListener) null);
        }
    }

    public void start() {
        C86709a0.m107524d().mo123455a(252, this);
        C86709a0.m107524d().mo123455a(701, this);
        C86709a0.m107524d().mo123455a(145, this);
        StringBuilder sb = new StringBuilder();
        C86709a0.m107523b();
        sb.append(C86718e.m107547e());
        sb.append(",");
        sb.append(C115152p1.class.getName());
        sb.append(",");
        sb.append("L200_100");
        sb.append(",");
        C86709a0.m107523b();
        sb.append(C86718e.m107548f("L200_100"));
        sb.append(",");
        sb.append(1);
        C78595a.m94983c(10645, true, sb.toString());
        C78595a.m94984d("L200_100");
    }

    public void stop() {
        C86709a0.m107524d().mo123470p(701, this);
        C86709a0.m107524d().mo123470p(252, this);
        C86709a0.m107524d().mo123470p(145, this);
        StringBuilder sb = new StringBuilder();
        C86709a0.m107523b();
        sb.append(C86718e.m107547e());
        sb.append(",");
        sb.append(C115152p1.class.getName());
        sb.append(",");
        sb.append("L200_100");
        sb.append(",");
        C86709a0.m107523b();
        sb.append(C86718e.m107548f("L200_100"));
        sb.append(",");
        sb.append(2);
        C78595a.m94983c(10645, false, sb.toString());
    }
}
