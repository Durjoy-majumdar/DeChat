package com.tencent.p014mm.plugin.account.p024ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import bc0.C67216a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelsimple.C114735a0;
import com.tencent.p014mm.p136ui.applet.SecurityImage;
import com.tencent.p014mm.plugin.account.p024ui.C115203z0;
import com.tencent.p014mm.plugin.account.p024ui.MobileVerifyUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import f40.C86718e;
import hg0.C76170j0;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p148ei.C7660a;
import p206nj.C76861g;
import p910lj.C76701a;
import wg0.C78595a;

/* renamed from: com.tencent.mm.plugin.account.ui.z1 */
public class C115207z1 implements MobileVerifyUI.C68466n, C11385n {

    /* renamed from: d */
    public MobileVerifyUI f345254d;

    /* renamed from: e */
    public C115203z0 f345255e = null;

    /* renamed from: f */
    public int f345256f;

    /* renamed from: g */
    public SecurityImage f345257g = null;

    /* renamed from: h */
    public C115135m0 f345258h = null;

    /* renamed from: com.tencent.mm.plugin.account.ui.z1$a */
    public class C68509a implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C117747y f196784d;

        public C68509a(C117747y yVar) {
            this.f196784d = yVar;
        }

        public void onCancel(DialogInterface dialogInterface) {
            C86709a0.m107524d().mo123458d(this.f196784d);
            C86709a0.m107524d().mo123470p(145, C115207z1.this);
            C86709a0.m107524d().mo123470p(132, C115207z1.this);
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.z1$b */
    public class C115208b implements DialogInterface.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.account.ui.z1$b$a */
        public class C115209a implements DialogInterface.OnCancelListener {

            /* renamed from: d */
            public final /* synthetic */ C114735a0 f345260d;

            public C115209a(C114735a0 a0Var) {
                this.f345260d = a0Var;
            }

            public void onCancel(DialogInterface dialogInterface) {
                C86709a0.m107524d().mo123458d(this.f345260d);
                C86709a0.m107524d().mo123470p(701, C115207z1.this);
                C86709a0.m107524d().mo123470p(252, C115207z1.this);
            }
        }

        public C115208b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105918d("MicroMsg.MobileVerifyForgetPwdLogic", "imgSid:" + C115207z1.this.f345258h.f345165e + " img len" + C115207z1.this.f345258h.f345167g.length + " " + C76861g.m92660c());
            C115207z1 z1Var = C115207z1.this;
            C115135m0 m0Var = z1Var.f345258h;
            C114735a0 a0Var = new C114735a0(m0Var.f345162b, m0Var.f345164d, m0Var.f345168h, z1Var.f345257g.getSecImgCode(), C115207z1.this.f345257g.getSecImgSid(), C115207z1.this.f345257g.getSecImgEncryptKey(), 1, "", false, true);
            C86709a0.m107524d().mo123460f(a0Var);
            MobileVerifyUI mobileVerifyUI = C115207z1.this.f345254d;
            C76879j.m92723Q(mobileVerifyUI, mobileVerifyUI.getString(C0966R.string.a3h), C115207z1.this.f345254d.getString(C0966R.string.gda), true, true, new C115209a(a0Var));
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.z1$c */
    public class C115210c implements DialogInterface.OnDismissListener {
        public C115210c() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            C115207z1.this.f345257g = null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.z1$d */
    public class C115211d implements C115203z0.C115206d {
        public C115211d() {
        }

        /* renamed from: a */
        public void mo174591a(ProgressDialog progressDialog) {
            C115207z1.this.f345254d.f196684f = progressDialog;
        }
    }

    public C115207z1(int i) {
        this.f345256f = i;
        Log.m105925i("MicroMsg.MobileVerifyForgetPwdLogic", "forget pwd, purpose %d", Integer.valueOf(i));
    }

    /* JADX WARNING: type inference failed for: r10v6, types: [ob0.y] */
    /* JADX WARNING: type inference failed for: r10v9 */
    /* JADX WARNING: type inference failed for: r1v4, types: [hg0.j0] */
    /* JADX WARNING: type inference failed for: r3v6, types: [bc0.a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo94016a(com.tencent.p014mm.plugin.account.p024ui.MobileVerifyUI.C68465m r10) {
        /*
            r9 = this;
            int r10 = r10.ordinal()
            r0 = 1
            if (r10 == r0) goto L_0x008d
            r1 = 2
            r2 = 3
            if (r10 == r1) goto L_0x0014
            if (r10 == r2) goto L_0x000f
            goto L_0x0090
        L_0x000f:
            r9.mo174960c()
            goto L_0x0090
        L_0x0014:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            f40.C86709a0.m107523b()
            java.lang.String r1 = f40.C86718e.m107547e()
            r10.append(r1)
            java.lang.String r1 = ","
            r10.append(r1)
            java.lang.Class<com.tencent.mm.plugin.account.ui.z1> r3 = com.tencent.p014mm.plugin.account.p024ui.C115207z1.class
            java.lang.String r3 = r3.getName()
            r10.append(r3)
            r10.append(r1)
            java.lang.String r3 = "R200_400"
            r10.append(r3)
            r10.append(r1)
            f40.C86709a0.m107523b()
            int r3 = f40.C86718e.m107548f(r3)
            r10.append(r3)
            r10.append(r1)
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            r0 = 10645(0x2995, float:1.4917E-41)
            wg0.C78595a.m94982b(r0, r10)
            int r10 = r9.f345256f
            if (r10 != r2) goto L_0x006b
            bc0.a r10 = new bc0.a
            com.tencent.mm.plugin.account.ui.MobileVerifyUI r0 = r9.f345254d
            java.lang.String r4 = r0.f196691p
            r5 = 8
            r7 = 0
            java.lang.String r6 = ""
            java.lang.String r8 = ""
            r3 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            goto L_0x0083
        L_0x006b:
            r0 = 5
            if (r10 != r0) goto L_0x0082
            hg0.j0 r10 = new hg0.j0
            com.tencent.mm.plugin.account.ui.MobileVerifyUI r0 = r9.f345254d
            java.lang.String r2 = r0.f196691p
            r3 = 20
            r5 = 0
            java.lang.String r4 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = ""
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
            goto L_0x0083
        L_0x0082:
            r10 = 0
        L_0x0083:
            if (r10 == 0) goto L_0x0090
            ob0.b0 r0 = f40.C86709a0.m107524d()
            r0.mo123460f(r10)
            goto L_0x0090
        L_0x008d:
            r9.mo174960c()
        L_0x0090:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.account.p024ui.C115207z1.mo94016a(com.tencent.mm.plugin.account.ui.MobileVerifyUI$m):boolean");
    }

    /* renamed from: b */
    public void mo94017b(MobileVerifyUI mobileVerifyUI) {
        this.f345254d = mobileVerifyUI;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [ob0.y] */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r2v9, types: [hg0.j0] */
    /* JADX WARNING: type inference failed for: r2v10, types: [bc0.a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo174960c() {
        /*
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            f40.C86709a0.m107523b()
            java.lang.String r1 = f40.C86718e.m107547e()
            r0.append(r1)
            java.lang.String r1 = ","
            r0.append(r1)
            java.lang.Class<com.tencent.mm.plugin.account.ui.z1> r2 = com.tencent.p014mm.plugin.account.p024ui.C115207z1.class
            java.lang.String r2 = r2.getName()
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = "R200_350_auto"
            r0.append(r2)
            r0.append(r1)
            f40.C86709a0.m107523b()
            int r2 = f40.C86718e.m107548f(r2)
            r0.append(r2)
            r0.append(r1)
            r1 = 1
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 10645(0x2995, float:1.4917E-41)
            wg0.C78595a.m94982b(r1, r0)
            ob0.b0 r0 = f40.C86709a0.m107524d()
            r1 = 145(0x91, float:2.03E-43)
            r0.mo123455a(r1, r9)
            ob0.b0 r0 = f40.C86709a0.m107524d()
            r1 = 132(0x84, float:1.85E-43)
            r0.mo123455a(r1, r9)
            int r0 = r9.f345256f
            r1 = 3
            if (r0 != r1) goto L_0x0077
            bc0.a r0 = new bc0.a
            com.tencent.mm.plugin.account.ui.MobileVerifyUI r1 = r9.f345254d
            java.lang.String r3 = r1.f196691p
            r4 = 9
            android.widget.EditText r1 = r1.f196683e
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            java.lang.String r5 = r1.trim()
            r6 = 0
            java.lang.String r7 = ""
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            goto L_0x009b
        L_0x0077:
            r1 = 5
            if (r0 != r1) goto L_0x009a
            hg0.j0 r0 = new hg0.j0
            com.tencent.mm.plugin.account.ui.MobileVerifyUI r1 = r9.f345254d
            java.lang.String r3 = r1.f196691p
            r4 = 21
            android.widget.EditText r1 = r1.f196683e
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            java.lang.String r5 = r1.trim()
            r6 = 0
            java.lang.String r7 = ""
            java.lang.String r8 = ""
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            goto L_0x009b
        L_0x009a:
            r0 = 0
        L_0x009b:
            if (r0 == 0) goto L_0x00c4
            ob0.b0 r1 = f40.C86709a0.m107524d()
            r1.mo123460f(r0)
            com.tencent.mm.plugin.account.ui.MobileVerifyUI r1 = r9.f345254d
            r2 = 2131821704(0x7f110488, float:1.9276159E38)
            java.lang.String r3 = r1.getString(r2)
            com.tencent.mm.plugin.account.ui.MobileVerifyUI r2 = r9.f345254d
            r4 = 2131822529(0x7f1107c1, float:1.9277832E38)
            java.lang.String r4 = r2.getString(r4)
            r5 = 1
            r6 = 1
            com.tencent.mm.plugin.account.ui.z1$a r7 = new com.tencent.mm.plugin.account.ui.z1$a
            r7.<init>(r0)
            r2 = r1
            qo3.i0 r0 = nj3.C76879j.m92723Q(r2, r3, r4, r5, r6, r7)
            r1.f196684f = r0
        L_0x00c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.account.p024ui.C115207z1.mo174960c():void");
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C7660a a;
        int i3 = i;
        int i4 = i2;
        String str2 = str;
        C117747y yVar2 = yVar;
        Log.m105924i("MicroMsg.MobileVerifyForgetPwdLogic", "onSceneEnd: errType = " + i3 + " errCode = " + i4 + " errMsg = " + str2);
        ProgressDialog progressDialog = this.f345254d.f196684f;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f345254d.f196684f = null;
        }
        if (this.f345258h == null) {
            this.f345258h = new C115135m0();
        }
        boolean z = true;
        if ((yVar.getType() == 252 || yVar.getType() == 701) && this.f345255e != null) {
            C86709a0.m107524d().mo123470p(701, this);
            C86709a0.m107524d().mo123470p(252, this);
            C114735a0 a0Var = (C114735a0) yVar2;
            this.f345258h.f345165e = a0Var.mo174359o1();
            this.f345258h.f345167g = a0Var.mo174357m1();
            this.f345258h.f345166f = a0Var.mo174358n1();
            this.f345258h.f345168h = a0Var.mo174360p1();
            if (i4 == -6 || i4 == -311 || i4 == -310) {
                C86709a0.m107524d().mo123455a(701, this);
                C86709a0.m107524d().mo123455a(252, this);
                if (this.f345257g == null) {
                    MobileVerifyUI mobileVerifyUI = this.f345254d;
                    C115135m0 m0Var = this.f345258h;
                    this.f345257g = SecurityImage.C116047a.m163296a(mobileVerifyUI, C0966R.string.hyo, m0Var.f345168h, m0Var.f345167g, m0Var.f345165e, m0Var.f345166f, new C115208b(), (DialogInterface.OnCancelListener) null, new C115210c(), m0Var);
                    return;
                }
                Log.m105918d("MicroMsg.MobileVerifyForgetPwdLogic", "imgSid:" + this.f345258h.f345165e + " img len" + this.f345258h.f345167g.length + " " + C76861g.m92660c());
                SecurityImage securityImage = this.f345257g;
                C115135m0 m0Var2 = this.f345258h;
                securityImage.mo177230b(m0Var2.f345168h, m0Var2.f345167g, m0Var2.f345165e, m0Var2.f345166f);
                return;
            }
            this.f345255e.mo174957a(this.f345254d, i, i2, str, yVar);
            if (i3 == 0 && i4 == 0) {
                if (yVar2 instanceof C114735a0) {
                    z = a0Var.mo174368x1();
                }
                this.f345254d.mo94000K7(z);
                return;
            }
            return;
        }
        if (yVar.getType() == 145) {
            C67216a aVar = (C67216a) yVar2;
            this.f345258h.f345162b = aVar.getUsername();
            this.f345258h.f345164d = aVar.mo91380q1();
            C86709a0.m107524d().mo123470p(145, this);
            if (i3 == 0 && i4 == 0) {
                if (this.f345256f == 3) {
                    C86709a0.m107524d().mo123455a(701, this);
                    C86709a0.m107524d().mo123455a(252, this);
                    C115211d dVar = new C115211d();
                    String username = aVar.getUsername();
                    String q1 = aVar.mo91380q1();
                    MobileVerifyUI mobileVerifyUI2 = this.f345254d;
                    C115203z0 z0Var = new C115203z0(dVar, username, q1, mobileVerifyUI2.f196691p);
                    this.f345255e = z0Var;
                    z0Var.mo174958b(mobileVerifyUI2);
                    return;
                }
                return;
            } else if (i4 == -51) {
                C7660a a2 = C7660a.m7782a(str);
                if (a2 != null) {
                    a2.mo8792b(this.f345254d, (DialogInterface.OnClickListener) null, (DialogInterface.OnClickListener) null);
                    return;
                } else {
                    C76879j.m92738i(this.f345254d, C0966R.string.al9, C0966R.string.ale);
                    return;
                }
            }
        }
        if (yVar.getType() == 132) {
            C86709a0.m107524d().mo123470p(132, this);
            if (i3 == 0 && i4 == 0) {
                if (this.f345256f == 5) {
                    String j1 = ((C76170j0) yVar2).mo106408j1();
                    Intent intent = new Intent();
                    intent.putExtra("setpwd_ticket", j1);
                    this.f345254d.setResult(-1, intent);
                    this.f345254d.finish();
                    return;
                }
                return;
            } else if (i4 == -51) {
                C7660a a3 = C7660a.m7782a(str);
                if (a3 != null) {
                    a3.mo8792b(this.f345254d, (DialogInterface.OnClickListener) null, (DialogInterface.OnClickListener) null);
                    return;
                } else {
                    C76879j.m92738i(this.f345254d, C0966R.string.al9, C0966R.string.ale);
                    return;
                }
            }
        }
        if (!this.f345254d.mo93999J7(i3, i4, str2)) {
            if ((yVar.getType() != 252 && yVar.getType() != 701) || (a = C7660a.m7782a(str)) == null || !a.mo8792b(this.f345254d, (DialogInterface.OnClickListener) null, (DialogInterface.OnClickListener) null)) {
                if (i3 != 0 || i4 != 0) {
                    MobileVerifyUI mobileVerifyUI3 = this.f345254d;
                    C76701a.makeText((Context) mobileVerifyUI3, (CharSequence) mobileVerifyUI3.getString(C0966R.string.al8, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}), 0).show();
                }
            }
        }
    }

    public void start() {
        StringBuilder sb = new StringBuilder();
        C86709a0.m107523b();
        sb.append(C86718e.m107547e());
        sb.append(",");
        sb.append(C115207z1.class.getName());
        sb.append(",");
        sb.append("F200_300");
        sb.append(",");
        C86709a0.m107523b();
        sb.append(C86718e.m107548f("F200_300"));
        sb.append(",");
        sb.append(1);
        C78595a.m94983c(10645, true, sb.toString());
        C78595a.m94984d("F200_300");
    }

    public void stop() {
        int i = this.f345254d.f196700y;
        if (i == -1) {
            i = 2;
        }
        StringBuilder sb = new StringBuilder();
        C86709a0.m107523b();
        sb.append(C86718e.m107547e());
        sb.append(",");
        sb.append(C115207z1.class.getName());
        sb.append(",");
        sb.append("F200_300");
        sb.append(",");
        C86709a0.m107523b();
        sb.append(C86718e.m107548f("F200_300"));
        sb.append(",");
        sb.append(i);
        C78595a.m94983c(10645, false, sb.toString());
        C86709a0.m107524d().mo123470p(132, this);
        C86709a0.m107524d().mo123470p(701, this);
        C86709a0.m107524d().mo123470p(252, this);
        C86709a0.m107524d().mo123470p(145, this);
    }
}
