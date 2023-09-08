package com.tencent.p014mm.plugin.account.p024ui;

import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelsimple.C114735a0;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import nj3.C76879j;
import p206nj.C76861g;

/* renamed from: com.tencent.mm.plugin.account.ui.p0 */
public class C115150p0 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ LoginUI f345190d;

    /* renamed from: com.tencent.mm.plugin.account.ui.p0$a */
    public class C115151a implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C114735a0 f345191d;

        public C115151a(C114735a0 a0Var) {
            this.f345191d = a0Var;
        }

        public void onCancel(DialogInterface dialogInterface) {
            C86709a0.m107524d().mo123458d(this.f345191d);
            C86709a0.m107524d().mo123470p(701, C115150p0.this.f345190d);
            C86709a0.m107524d().mo123470p(252, C115150p0.this.f345190d);
        }
    }

    public C115150p0(LoginUI loginUI) {
        this.f345190d = loginUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (this.f345190d.f344617o == null) {
            Log.m105920e("MicroMsg.LoginUI", "secimg is null!");
            return;
        }
        Log.m105918d("MicroMsg.LoginUI", "imgSid:" + this.f345190d.f344618p.f345165e + " img len" + this.f345190d.f344618p.f345167g.length + " " + C76861g.m92660c());
        LoginUI loginUI = this.f345190d;
        C115135m0 m0Var = loginUI.f344618p;
        C114735a0 a0Var = new C114735a0(m0Var.f345162b, m0Var.f345163c, m0Var.f345168h, loginUI.f344617o.getSecImgCode(), this.f345190d.f344617o.getSecImgSid(), this.f345190d.f344617o.getSecImgEncryptKey(), 2, "", false, false);
        C86709a0.m107524d().mo123460f(a0Var);
        LoginUI loginUI2 = this.f345190d;
        loginUI2.f344613h = C76879j.m92723Q(loginUI2, loginUI2.getString(C0966R.string.a3h), this.f345190d.getString(C0966R.string.gda), true, true, new C115151a(a0Var));
    }
}
