package com.tencent.p014mm.plugin.account.p024ui;

import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelsimple.C114735a0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import nj3.C76879j;
import p206nj.C76861g;

/* renamed from: com.tencent.mm.plugin.account.ui.c0 */
public class C115093c0 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ int f345088d;

    /* renamed from: e */
    public final /* synthetic */ LoginByMobileSendSmsUI f345089e;

    /* renamed from: com.tencent.mm.plugin.account.ui.c0$a */
    public class C115094a implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C114735a0 f345090d;

        public C115094a(C114735a0 a0Var) {
            this.f345090d = a0Var;
        }

        public void onCancel(DialogInterface dialogInterface) {
            C86709a0.m107524d().mo123458d(this.f345090d);
            C86709a0.m107524d().mo123470p(701, C115093c0.this.f345089e);
            C86709a0.m107524d().mo123470p(252, C115093c0.this.f345089e);
        }
    }

    public C115093c0(LoginByMobileSendSmsUI loginByMobileSendSmsUI, int i) {
        this.f345089e = loginByMobileSendSmsUI;
        this.f345088d = i;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.m105918d("MicroMsg.LoginByMobileSendSmsUI", "imgSid:" + this.f345089e.f344478g.f345165e + " img len" + this.f345089e.f344478g.f345167g.length + " " + C76861g.m92660c());
        Object[] objArr = new Object[5];
        objArr[0] = Integer.valueOf(this.f345088d);
        String str = this.f345089e.f344486r;
        int i2 = -1;
        objArr[1] = Integer.valueOf(str == null ? -1 : str.length());
        objArr[2] = Util.secPrint(this.f345089e.f344486r);
        String str2 = this.f345089e.f344478g.f345163c;
        if (str2 != null) {
            i2 = str2.length();
        }
        objArr[3] = Integer.valueOf(i2);
        objArr[4] = Util.secPrint(this.f345089e.f344478g.f345163c);
        Log.m105919d("MicroMsg.LoginByMobileSendSmsUI", "summervoice errType:%d, mAuthPwd len:%d content[%s] logindata.rawPsw len:%d content[%s]", objArr);
        LoginByMobileSendSmsUI loginByMobileSendSmsUI = this.f345089e;
        C115135m0 m0Var = loginByMobileSendSmsUI.f344478g;
        C114735a0 a0Var = new C114735a0(m0Var.f345162b, m0Var.f345163c, m0Var.f345168h, loginByMobileSendSmsUI.f344482n.getSecImgCode(), this.f345089e.f344482n.getSecImgSid(), this.f345089e.f344482n.getSecImgEncryptKey(), 0, "", false, false);
        if (Util.isNullOrNil(this.f345089e.f344478g.f345163c) && !Util.isNullOrNil(this.f345089e.f344486r)) {
            Log.m105925i("MicroMsg.LoginByMobileSendSmsUI", "summervoice resetMd5BeforeDoSceneByVoice mAuthPwd:", Util.secPrint(this.f345089e.f344486r));
            a0Var.mo174366v1(this.f345089e.f344486r);
        }
        C86709a0.m107524d().mo123460f(a0Var);
        LoginByMobileSendSmsUI loginByMobileSendSmsUI2 = this.f345089e;
        loginByMobileSendSmsUI2.f344487s = C76879j.m92723Q(loginByMobileSendSmsUI2, loginByMobileSendSmsUI2.getString(C0966R.string.a3h), this.f345089e.getString(C0966R.string.gda), true, true, new C115094a(a0Var));
    }
}
