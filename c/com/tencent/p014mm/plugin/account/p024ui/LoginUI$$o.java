package com.tencent.p014mm.plugin.account.p024ui;

import android.content.Intent;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.modelsimple.C114735a0;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import j20.C117292a;
import k20.C9556a;
import ob0.C117747y;
import p214om.C11502f;

/* renamed from: com.tencent.mm.plugin.account.ui.LoginUI$$o */
public class LoginUI$$o implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C117747y f344635d;

    /* renamed from: e */
    public final /* synthetic */ LoginUI f344636e;

    public LoginUI$$o(LoginUI loginUI, C117747y yVar) {
        this.f344636e = loginUI;
        this.f344635d = yVar;
    }

    public void run() {
        Log.m105918d("MicroMsg.LoginUI", "onSceneEnd, in runnable");
        Intent b = ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93169b(this.f344636e);
        b.addFlags(67108864);
        b.putExtra("kstyle_show_bind_mobile_afterauth", ((C114735a0) this.f344635d).mo174361q1());
        b.putExtra("kstyle_bind_wording", ((C114735a0) this.f344635d).mo174363s1());
        b.putExtra("kstyle_bind_recommend_show", ((C114735a0) this.f344635d).mo174362r1());
        LoginUI loginUI = this.f344636e;
        C9556a aVar = new C9556a();
        aVar.mo10233c(b);
        LoginUI loginUI2 = loginUI;
        C117292a.m165358d(loginUI2, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/LoginUI$26", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        loginUI.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(loginUI2, "com/tencent/mm/plugin/account/ui/LoginUI$26", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        this.f344636e.finish();
    }
}
