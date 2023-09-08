package com.tencent.p014mm.plugin.scanner.p101ui;

import android.content.Intent;
import android.os.Bundle;
import j20.C117292a;
import k20.C9556a;
import ke3.C88144b;
import nj3.C76879j;

/* renamed from: com.tencent.mm.plugin.scanner.ui.y */
public class C5173y implements C76879j.C11180n {

    /* renamed from: a */
    public final /* synthetic */ String f20608a;

    /* renamed from: b */
    public final /* synthetic */ VcardContactUI f20609b;

    public C5173y(VcardContactUI vcardContactUI, String str) {
        this.f20609b = vcardContactUI;
        this.f20608a = str;
    }

    /* renamed from: j */
    public void mo782j(int i) {
        if (i == 0) {
            Intent intent = new Intent();
            String[] strArr = {this.f20608a + " " + this.f20608a};
            intent.putExtra("composeType", 4);
            intent.putExtra("toList", strArr);
            C88144b.m109791i(this.f20609b, "qqmail", ".ui.ComposeUI", intent, (Bundle) null);
        } else if (i == 1) {
            Intent intent2 = new Intent("android.intent.action.SEND");
            intent2.setType("text/plain");
            intent2.putExtra("android.intent.extra.EMAIL", new String[]{this.f20608a});
            VcardContactUI vcardContactUI = this.f20609b;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent2);
            VcardContactUI vcardContactUI2 = vcardContactUI;
            C117292a.m165358d(vcardContactUI2, aVar.mo10232b(), "com/tencent/mm/plugin/scanner/ui/VcardContactUI$2", "onClick", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            vcardContactUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(vcardContactUI2, "com/tencent/mm/plugin/scanner/ui/VcardContactUI$2", "onClick", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }
}
