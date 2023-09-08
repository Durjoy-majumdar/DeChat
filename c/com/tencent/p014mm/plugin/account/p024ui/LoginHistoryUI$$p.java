package com.tencent.p014mm.plugin.account.p024ui;

import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelsimple.C114735a0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import nj3.C76879j;
import p206nj.C76861g;

/* renamed from: com.tencent.mm.plugin.account.ui.LoginHistoryUI$$p */
public class LoginHistoryUI$$p implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ int f344546d;

    /* renamed from: e */
    public final /* synthetic */ LoginHistoryUI f344547e;

    /* renamed from: com.tencent.mm.plugin.account.ui.LoginHistoryUI$$p$a */
    public class C114927a implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C114735a0 f344548d;

        public C114927a(C114735a0 a0Var) {
            this.f344548d = a0Var;
        }

        public void onCancel(DialogInterface dialogInterface) {
            C86709a0.m107524d().mo123458d(this.f344548d);
            C86709a0.m107524d().mo123470p(701, LoginHistoryUI$$p.this.f344547e);
            C86709a0.m107524d().mo123470p(252, LoginHistoryUI$$p.this.f344547e);
        }
    }

    public LoginHistoryUI$$p(LoginHistoryUI loginHistoryUI, int i) {
        this.f344547e = loginHistoryUI;
        this.f344546d = i;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.m105918d("MicroMsg.LoginHistoryUI", "imgSid:" + this.f344547e.f344532t.f345165e + " img len" + this.f344547e.f344532t.f345167g.length + " " + C76861g.m92660c());
        Object[] objArr = new Object[5];
        objArr[0] = Integer.valueOf(this.f344546d);
        String str = this.f344547e.f344509M;
        int i2 = -1;
        objArr[1] = Integer.valueOf(str == null ? -1 : str.length());
        objArr[2] = Util.secPrint(this.f344547e.f344509M);
        String str2 = this.f344547e.f344532t.f345163c;
        if (str2 != null) {
            i2 = str2.length();
        }
        objArr[3] = Integer.valueOf(i2);
        objArr[4] = Util.secPrint(this.f344547e.f344532t.f345163c);
        Log.m105919d("MicroMsg.LoginHistoryUI", "summervoice errType:%d, mAuthPwd len:%d content[%s] logindata.rawPsw len:%d content[%s]", objArr);
        LoginHistoryUI loginHistoryUI = this.f344547e;
        C115135m0 m0Var = loginHistoryUI.f344532t;
        C114735a0 a0Var = new C114735a0(m0Var.f345162b, m0Var.f345163c, m0Var.f345168h, loginHistoryUI.f344531s.getSecImgCode(), this.f344547e.f344531s.getSecImgSid(), this.f344547e.f344531s.getSecImgEncryptKey(), 0, "", false, false);
        if (Util.isNullOrNil(this.f344547e.f344532t.f345163c) && !Util.isNullOrNil(this.f344547e.f344509M)) {
            Log.m105925i("MicroMsg.LoginHistoryUI", "summervoice resetMd5BeforeDoSceneByVoice mAuthPwd:", Util.secPrint(this.f344547e.f344509M));
            a0Var.mo174366v1(this.f344547e.f344509M);
        }
        C86709a0.m107524d().mo123460f(a0Var);
        LoginHistoryUI loginHistoryUI2 = this.f344547e;
        loginHistoryUI2.f344530r = C76879j.m92723Q(loginHistoryUI2, loginHistoryUI2.getString(C0966R.string.a3h), this.f344547e.getString(C0966R.string.gda), true, true, new C114927a(a0Var));
    }
}
