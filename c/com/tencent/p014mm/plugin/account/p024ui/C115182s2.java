package com.tencent.p014mm.plugin.account.p024ui;

import android.content.DialogInterface;
import android.content.Intent;
import j20.C117292a;
import k20.C9556a;
import wg0.C78595a;

/* renamed from: com.tencent.mm.plugin.account.ui.s2 */
public class C115182s2 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ RegByEmailUI f345228d;

    public C115182s2(RegByEmailUI regByEmailUI) {
        this.f345228d = regByEmailUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f345228d.finish();
        C78595a.m94985e("L2_signup");
        Intent intent = new Intent(this.f345228d, LoginPasswordUI.class);
        intent.putExtra("email_address", this.f345228d.f344809h);
        RegByEmailUI regByEmailUI = this.f345228d;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        RegByEmailUI regByEmailUI2 = regByEmailUI;
        C117292a.m165358d(regByEmailUI2, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/RegByEmailUI$12", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        regByEmailUI.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(regByEmailUI2, "com/tencent/mm/plugin/account/ui/RegByEmailUI$12", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
