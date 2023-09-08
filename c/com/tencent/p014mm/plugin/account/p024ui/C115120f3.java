package com.tencent.p014mm.plugin.account.p024ui;

import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelsimple.C114735a0;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import nj3.C76879j;
import p206nj.C76861g;

/* renamed from: com.tencent.mm.plugin.account.ui.f3 */
public class C115120f3 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SimpleLoginUI f345148d;

    /* renamed from: com.tencent.mm.plugin.account.ui.f3$a */
    public class C115121a implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C114735a0 f345149d;

        public C115121a(C115120f3 f3Var, C114735a0 a0Var) {
            this.f345149d = a0Var;
        }

        public void onCancel(DialogInterface dialogInterface) {
            C86709a0.m107524d().mo123458d(this.f345149d);
        }
    }

    public C115120f3(SimpleLoginUI simpleLoginUI) {
        this.f345148d = simpleLoginUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.m105918d("MicroMsg.SimpleLoginUI", "imgSid:" + this.f345148d.f345060n.f345165e + " img len" + this.f345148d.f345060n.f345167g.length + " " + C76861g.m92660c());
        SimpleLoginUI simpleLoginUI = this.f345148d;
        C115135m0 m0Var = simpleLoginUI.f345060n;
        C114735a0 a0Var = new C114735a0(m0Var.f345162b, m0Var.f345163c, m0Var.f345168h, simpleLoginUI.f345059j.getSecImgCode(), this.f345148d.f345059j.getSecImgSid(), this.f345148d.f345059j.getSecImgEncryptKey(), 0, "", false, false);
        C86709a0.m107524d().mo123460f(a0Var);
        SimpleLoginUI simpleLoginUI2 = this.f345148d;
        simpleLoginUI2.f345058i = C76879j.m92723Q(simpleLoginUI2, simpleLoginUI2.getString(C0966R.string.a3h), this.f345148d.getString(C0966R.string.gda), true, true, new C115121a(this, a0Var));
    }
}
