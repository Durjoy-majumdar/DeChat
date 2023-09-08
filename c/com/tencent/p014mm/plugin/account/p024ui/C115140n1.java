package com.tencent.p014mm.plugin.account.p024ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.view.animation.AnimationUtils;
import bc0.C67216a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.PhoneFormater;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import f40.C86718e;
import j20.C117292a;
import java.util.ArrayList;
import jg0.C108742l;
import k20.C60958c;
import k20.C9556a;
import lg3.C88504k;
import nc0.C76850a;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p148ei.C7660a;
import p214om.C11502f;
import qe3.C89625d;
import qg0.C12215a;
import qo3.C89779i0;
import sf0.C13665i0;
import tc2.C118418g;
import te3.C51018qv3;
import te3.lx4;
import wg0.C78595a;

/* renamed from: com.tencent.mm.plugin.account.ui.n1 */
public class C115140n1 implements MobileInputUI$$u, C11385n {

    /* renamed from: d */
    public MobileInputUI f345176d;

    /* renamed from: e */
    public String f345177e;

    /* renamed from: f */
    public String f345178f;

    /* renamed from: g */
    public int f345179g = 0;

    /* renamed from: h */
    public String f345180h;

    /* renamed from: i */
    public int f345181i = 1;

    /* renamed from: com.tencent.mm.plugin.account.ui.n1$a */
    public class C1485a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ MobileInputUI f10831d;

        public C1485a(C115140n1 n1Var, MobileInputUI mobileInputUI) {
            this.f10831d = mobileInputUI;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/ui/MobileInputRegLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            MobileInputUI mobileInputUI = this.f10831d;
            String e = C76850a.m92633e(mobileInputUI, mobileInputUI.f344677H, mobileInputUI.getString(C0966R.string.bvs));
            MobileInputUI mobileInputUI2 = this.f10831d;
            C12215a.m11778c(mobileInputUI2, mobileInputUI2.getString(C0966R.string.f361485k83, new Object[]{LocaleUtil.getApplicationLanguage(), e}), 0, false);
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/MobileInputRegLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.n1$b */
    public class C115141b implements DialogInterface.OnClickListener {
        public C115141b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C115140n1.this.mo174904c();
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.n1$c */
    public class C115142c implements DialogInterface.OnClickListener {
        public C115142c(C115140n1 n1Var) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            StringBuilder sb = new StringBuilder();
            C86709a0.m107523b();
            sb.append(C86718e.m107547e());
            sb.append(",");
            sb.append(C115142c.class.getName());
            sb.append(",");
            sb.append("R200_200");
            sb.append(",");
            C86709a0.m107523b();
            sb.append(C86718e.m107548f("R200_200"));
            sb.append(",");
            sb.append(2);
            C78595a.m94983c(10645, true, sb.toString());
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.n1$d */
    public class C115143d implements DialogInterface.OnCancelListener {
        public C115143d(C115140n1 n1Var) {
        }

        public void onCancel(DialogInterface dialogInterface) {
        }
    }

    /* renamed from: a */
    public void mo174715a(MobileInputUI$$t mobileInputUI$$t) {
        String str;
        if (mobileInputUI$$t.ordinal() == 1) {
            this.f345176d.hideVKB();
            if (!this.f345176d.f344699p.isChecked()) {
                this.f345176d.f344698o.startAnimation(AnimationUtils.loadAnimation(this.f345176d, C0966R.C0968anim.f2342a7));
                return;
            }
            int i = this.f345181i;
            int i2 = 2;
            if (i == 1) {
                MobileInputUI mobileInputUI = this.f345176d;
                MobileInputUI mobileInputUI2 = this.f345176d;
                C12215a.m11778c(this.f345176d, mobileInputUI.getString(C0966R.string.m8p, new Object[]{LocaleUtil.getApplicationLanguage(), C76850a.m92633e(mobileInputUI2, mobileInputUI2.f344677H, mobileInputUI2.getString(C0966R.string.bvs)), "reg", 1, 0}), 32047, false);
            } else if (i != 2) {
                MobileInputUI mobileInputUI3 = this.f345176d;
                mobileInputUI3.f344673D = PhoneFormater.countryCodeWithPlus(mobileInputUI3.f344677H);
                MobileInputUI mobileInputUI4 = this.f345176d;
                mobileInputUI4.f344674E = mobileInputUI4.f344691e.getText().toString();
                String str2 = this.f345176d.f344673D + this.f345176d.f344674E;
                MobileInputUI mobileInputUI5 = this.f345176d;
                if (C12215a.m11776a(mobileInputUI5, mobileInputUI5.f344690d.getText().toString())) {
                    C89779i0 i0Var = this.f345176d.f344697n;
                    if (i0Var == null || !i0Var.isShowing()) {
                        MobileInputUI mobileInputUI6 = this.f345176d;
                        mobileInputUI6.f344697n = C76879j.m92723Q(mobileInputUI6, mobileInputUI6.getString(C0966R.string.a3h), this.f345176d.getString(C0966R.string.hwo), true, true, new C115147o1(this));
                        String obj = this.f345176d.f344691e.getText().toString();
                        String str3 = this.f345177e;
                        if (str3 == null || this.f345178f == null || obj.equals(str3) || !obj.equals(this.f345178f)) {
                            String str4 = this.f345177e;
                            if (str4 == null || (str = this.f345178f) == null || str.equals(str4) || obj.equals(this.f345178f)) {
                                i2 = 0;
                            }
                        } else {
                            i2 = 1;
                        }
                        C67216a aVar = new C67216a(str2, 12, "", 0, "");
                        aVar.mo91364O(this.f345179g);
                        aVar.mo91370g0(i2);
                        C118418g gVar = C118418g.INSTANCE;
                        if (gVar.An0("ie_reg_eu")) {
                            gVar.mo175826kl("ie_reg_eu");
                        }
                        lx4 lx4 = new lx4();
                        C51018qv3 qv32 = new C51018qv3();
                        qv32.mo73350k(gVar.vu0("ie_reg_eu"));
                        lx4.f354115d = qv32;
                        C51018qv3 qv33 = new C51018qv3();
                        qv33.mo73350k(gVar.bw0("ce_reg"));
                        lx4.f354116e = qv33;
                        C51018qv3 qv34 = new C51018qv3();
                        qv34.mo73350k(gVar.mo175821hd());
                        lx4.f354117f = qv34;
                        C51018qv3 qv35 = new C51018qv3();
                        qv35.mo73350k(gVar.b90());
                        lx4.f354121j = qv35;
                        String gF = gVar.mo175819gF("ce_reg");
                        if (gF != null) {
                            C51018qv3 qv36 = new C51018qv3();
                            qv36.mo73350k(gF.getBytes());
                            lx4.f354122n = qv36;
                        }
                        aVar.mo91365T(lx4);
                        C86709a0.m107524d().mo123460f(aVar);
                        this.f345177e = this.f345176d.f344691e.getText().toString();
                        this.f345179g++;
                    } else {
                        Log.m105918d("MicroMsg.MobileInputRegLogic", "already checking ");
                    }
                }
            } else {
                mo174904c();
            }
            this.f345181i = 0;
        }
    }

    /* renamed from: b */
    public void mo174716b(MobileInputUI mobileInputUI) {
        this.f345176d = mobileInputUI;
        String str = "";
        if (C89625d.f257845k || BuildInfo.IS_FLAVOR_BLUE) {
            str = str + C88504k.m110376b(mobileInputUI);
        }
        mobileInputUI.setMMTitle(str);
        mobileInputUI.showOptionMenu(false);
        mobileInputUI.f344703t.setVisibility(0);
        mobileInputUI.f344703t.setVisibility(0);
        mobileInputUI.f344695i.setVisibility(0);
        mobileInputUI.f344691e.setVisibility(0);
        mobileInputUI.f344692f.requestFocus();
        View view = mobileInputUI.f344698o;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/MobileInputRegLogic", "initView", "(Lcom/tencent/mm/plugin/account/ui/MobileInputUI;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/account/ui/MobileInputRegLogic", "initView", "(Lcom/tencent/mm/plugin/account/ui/MobileInputUI;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mobileInputUI.f344693g.setVisibility(0);
        View view2 = mobileInputUI.f344671B;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/account/ui/MobileInputRegLogic", "initView", "(Lcom/tencent/mm/plugin/account/ui/MobileInputUI;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/account/ui/MobileInputRegLogic", "initView", "(Lcom/tencent/mm/plugin/account/ui/MobileInputUI;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mobileInputUI.f344701r.setVisibility(0);
        mobileInputUI.f344701r.setText(C0966R.string.gdv);
        mobileInputUI.f344700q.setOnClickListener(new C1485a(this, mobileInputUI));
    }

    /* renamed from: c */
    public final void mo174904c() {
        MobileInputUI mobileInputUI = this.f345176d;
        mobileInputUI.f344697n = C76879j.m92723Q(mobileInputUI, mobileInputUI.getString(C0966R.string.a3h), this.f345176d.getString(C0966R.string.hwo), true, true, new C115143d(this));
        C67216a aVar = new C67216a(this.f345176d.f344673D + this.f345176d.f344674E, 14, "", 0, "");
        aVar.mo91367W(this.f345180h);
        C86709a0.m107524d().mo123460f(aVar);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        MobileInputUI mobileInputUI;
        int i3 = i;
        int i4 = i2;
        String str2 = str;
        Class<C115140n1> cls = C115140n1.class;
        Log.m105924i("MicroMsg.MobileInputRegLogic", "onSceneEnd: errType = " + i3 + " errCode = " + i4 + " errMsg = " + str2);
        C89779i0 i0Var = this.f345176d.f344697n;
        if (i0Var != null) {
            i0Var.dismiss();
            this.f345176d.f344697n = null;
        }
        if (i4 == -75) {
            C76879j.m92738i(this.f345176d, C0966R.string.f7561jo, C0966R.string.hvq);
        } else if (yVar.getType() != 145) {
        } else {
            if (i4 == -41 || i4 == -59) {
                C7660a a = C7660a.m7782a(str);
                if (a != null) {
                    a.mo8792b(this.f345176d, (DialogInterface.OnClickListener) null, (DialogInterface.OnClickListener) null);
                } else {
                    C76879j.m92738i(this.f345176d, C0966R.string.hx6, C0966R.string.hx7);
                }
            } else {
                C67216a aVar = (C67216a) yVar;
                int f = aVar.mo91368f();
                if (f == 12) {
                    MobileInputUI mobileInputUI2 = this.f345176d;
                    mobileInputUI2.f344674E = PhoneFormater.pureNumber(mobileInputUI2.f344674E);
                    this.f345178f = this.f345176d.f344673D + this.f345176d.f344674E;
                    this.f345180h = aVar.mo91366V0();
                    if (i4 == -36 || i4 == -35 || i4 == -3) {
                        String K0 = aVar.mo91363K0();
                        if (!Util.isNullOrNil(K0)) {
                            this.f345176d.f344674E = K0.trim();
                        }
                        StringBuilder sb = new StringBuilder();
                        C86709a0.m107523b();
                        sb.append(C86718e.m107547e());
                        sb.append(",");
                        sb.append(cls.getName());
                        sb.append(",");
                        sb.append("R200_200");
                        sb.append(",");
                        C86709a0.m107523b();
                        sb.append(C86718e.m107548f("R200_200"));
                        sb.append(",");
                        sb.append(1);
                        C78595a.m94983c(10645, true, sb.toString());
                        C7660a a2 = C7660a.m7782a(str);
                        if (a2 != null) {
                            a2.mo8792b(this.f345176d, new C115141b(), new C115142c(this));
                            return;
                        }
                        mo174904c();
                        StringBuilder sb4 = new StringBuilder();
                        C86709a0.m107523b();
                        sb4.append(C86718e.m107547e());
                        sb4.append(",");
                        sb4.append(cls.getName());
                        sb4.append(",");
                        sb4.append("R200_200");
                        sb4.append(",");
                        C86709a0.m107523b();
                        sb4.append(C86718e.m107548f("R200_200"));
                        sb4.append(",");
                        sb4.append(2);
                        C78595a.m94983c(10645, true, sb4.toString());
                        return;
                    } else if (i4 == -355) {
                        C13665i0.m12970c(this.f345176d, str2, 32046);
                        return;
                    } else if (i4 == -34) {
                        MobileInputUI mobileInputUI3 = this.f345176d;
                        C76879j.m92748s(mobileInputUI3, mobileInputUI3.getString(C0966R.string.ajx), "");
                        return;
                    }
                }
                if (f == 14) {
                    if (i4 == 0 || str2 == null) {
                        if (aVar.mo91372j1() == 1) {
                            C114799u uVar = aVar.f193010d;
                            String str3 = ((C67216a.C67220c) uVar).f193017b.f353291a.f227459y;
                            String str4 = ((C67216a.C67220c) uVar).f193017b.f353291a.f227458x;
                            Intent intent = new Intent(this.f345176d, RegByMobileSendSmsUI.class);
                            intent.putExtra("from_mobile", this.f345176d.f344673D + this.f345176d.f344674E);
                            intent.putExtra("to_mobile", str3);
                            intent.putExtra("verify_code", str4);
                            intent.putExtra("key_reg_style", 2);
                            intent.putExtra("kintent_password", this.f345176d.f344690d.getText().toString());
                            intent.putExtra("regsession_id", this.f345180h);
                            MobileInputUI mobileInputUI4 = this.f345176d;
                            C9556a aVar2 = new C9556a();
                            aVar2.mo10233c(intent);
                            MobileInputUI mobileInputUI5 = mobileInputUI4;
                            C117292a.m165358d(mobileInputUI5, aVar2.mo10232b(), "com/tencent/mm/plugin/account/ui/MobileInputRegLogic", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            mobileInputUI4.startActivity((Intent) aVar2.mo10231a(0));
                            C117292a.m165359e(mobileInputUI5, "com/tencent/mm/plugin/account/ui/MobileInputRegLogic", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        } else {
                            C78595a.m94985e("R200_300");
                            Intent intent2 = new Intent();
                            intent2.putExtra("bindmcontact_mobile", this.f345176d.f344673D + " " + this.f345176d.f344691e.getText().toString());
                            intent2.putExtra("bindmcontact_shortmobile", this.f345176d.f344674E);
                            intent2.putExtra("country_name", this.f345176d.f344676G);
                            intent2.putExtra("couttry_code", this.f345176d.f344677H);
                            intent2.putExtra("mobileverify_countdownsec", aVar.mo91373k1());
                            intent2.putExtra("mobileverify_countdownstyle", aVar.mo91374l1());
                            intent2.putExtra("mobileverify_fb", aVar.mo91375m1());
                            intent2.putExtra("mobileverify_reg_qq", aVar.mo91378p1());
                            intent2.putExtra("key_reg_style", 2);
                            intent2.putExtra("kintent_password", this.f345176d.f344690d.getText().toString());
                            intent2.putExtra("mobile_verify_purpose", 2);
                            intent2.putExtra("regsession_id", this.f345180h);
                            intent2.setClass(this.f345176d, MobileVerifyUI.class);
                            MobileInputUI mobileInputUI6 = this.f345176d;
                            C9556a aVar3 = new C9556a();
                            aVar3.mo10233c(intent2);
                            MobileInputUI mobileInputUI7 = mobileInputUI6;
                            C117292a.m165358d(mobileInputUI7, aVar3.mo10232b(), "com/tencent/mm/plugin/account/ui/MobileInputRegLogic", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            mobileInputUI6.startActivity((Intent) aVar3.mo10231a(0));
                            C117292a.m165359e(mobileInputUI7, "com/tencent/mm/plugin/account/ui/MobileInputRegLogic", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            C108742l.m147542a(C108742l.C108744b.SENT);
                        }
                    } else if (i4 == -34) {
                        MobileInputUI mobileInputUI8 = this.f345176d;
                        C76879j.m92748s(mobileInputUI8, mobileInputUI8.getString(C0966R.string.ajx), "");
                        return;
                    } else if (((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93163uP(this.f345176d, i3, i4, str2)) {
                        return;
                    }
                }
                C7660a a3 = C7660a.m7782a(str);
                if (a3 != null && (mobileInputUI = this.f345176d) != null) {
                    a3.mo8792b(mobileInputUI, (DialogInterface.OnClickListener) null, (DialogInterface.OnClickListener) null);
                }
            }
        }
    }

    public void start() {
        C86709a0.m107524d().mo123455a(145, this);
        StringBuilder sb = new StringBuilder();
        C86709a0.m107523b();
        sb.append(C86718e.m107547e());
        sb.append(",");
        sb.append(C115140n1.class.getName());
        sb.append(",");
        sb.append("R200_100");
        sb.append(",");
        C86709a0.m107523b();
        sb.append(C86718e.m107548f("R200_100"));
        sb.append(",");
        sb.append(1);
        C78595a.m94983c(10645, true, sb.toString());
        C78595a.m94984d("R200_100");
        this.f345179g = 0;
    }

    public void stop() {
        C86709a0.m107524d().mo123470p(145, this);
        StringBuilder sb = new StringBuilder();
        C86709a0.m107523b();
        sb.append(C86718e.m107547e());
        sb.append(",");
        sb.append(C115140n1.class.getName());
        sb.append(",");
        sb.append("R200_100");
        sb.append(",");
        C86709a0.m107523b();
        sb.append(C86718e.m107548f("R200_100"));
        sb.append(",");
        sb.append(2);
        C78595a.m94983c(10645, false, sb.toString());
    }
}
