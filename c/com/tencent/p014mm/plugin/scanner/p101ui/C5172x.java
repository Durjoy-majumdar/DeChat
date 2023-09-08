package com.tencent.p014mm.plugin.scanner.p101ui;

import android.content.Intent;
import android.net.Uri;
import j20.C117292a;
import k20.C9556a;
import nj3.C76879j;

/* renamed from: com.tencent.mm.plugin.scanner.ui.x */
public class C5172x implements C76879j.C11180n {

    /* renamed from: a */
    public final /* synthetic */ String f20606a;

    /* renamed from: b */
    public final /* synthetic */ VcardContactUI f20607b;

    public C5172x(VcardContactUI vcardContactUI, String str) {
        this.f20607b = vcardContactUI;
        this.f20606a = str;
    }

    /* renamed from: j */
    public void mo782j(int i) {
        if (i == 0) {
            Intent intent = new Intent("android.intent.action.DIAL");
            intent.setFlags(268435456);
            intent.setData(Uri.parse("tel:" + this.f20606a));
            VcardContactUI vcardContactUI = this.f20607b;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            VcardContactUI vcardContactUI2 = vcardContactUI;
            C117292a.m165358d(vcardContactUI2, aVar.mo10232b(), "com/tencent/mm/plugin/scanner/ui/VcardContactUI$1", "onClick", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            vcardContactUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(vcardContactUI2, "com/tencent/mm/plugin/scanner/ui/VcardContactUI$1", "onClick", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }
}
