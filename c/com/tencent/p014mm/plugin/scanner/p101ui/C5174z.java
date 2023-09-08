package com.tencent.p014mm.plugin.scanner.p101ui;

import android.content.Intent;
import android.provider.ContactsContract;
import eb0.C116756s5;
import j20.C117292a;
import k20.C9556a;
import nj3.C76879j;

/* renamed from: com.tencent.mm.plugin.scanner.ui.z */
public class C5174z implements C76879j.C11180n {

    /* renamed from: a */
    public final /* synthetic */ VcardContactUI f20610a;

    public C5174z(VcardContactUI vcardContactUI) {
        this.f20610a = vcardContactUI;
    }

    /* renamed from: j */
    public void mo782j(int i) {
        if (i == 0) {
            C116756s5.m164691d().mo180727a(10238, 1);
            Intent intent = new Intent("android.intent.action.INSERT", ContactsContract.Contacts.CONTENT_URI);
            VcardContactUI.m20231H7(this.f20610a, intent);
            VcardContactUI vcardContactUI = this.f20610a;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            VcardContactUI vcardContactUI2 = vcardContactUI;
            C117292a.m165358d(vcardContactUI2, aVar.mo10232b(), "com/tencent/mm/plugin/scanner/ui/VcardContactUI$4", "onClick", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            vcardContactUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(vcardContactUI2, "com/tencent/mm/plugin/scanner/ui/VcardContactUI$4", "onClick", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (i == 1) {
            C116756s5.m164691d().mo180727a(10239, 1);
            Intent intent2 = new Intent("android.intent.action.INSERT_OR_EDIT", ContactsContract.Contacts.CONTENT_URI);
            intent2.setType("vnd.android.cursor.item/person");
            VcardContactUI.m20231H7(this.f20610a, intent2);
            VcardContactUI vcardContactUI3 = this.f20610a;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(intent2);
            VcardContactUI vcardContactUI4 = vcardContactUI3;
            C117292a.m165358d(vcardContactUI4, aVar2.mo10232b(), "com/tencent/mm/plugin/scanner/ui/VcardContactUI$4", "onClick", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            vcardContactUI3.startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(vcardContactUI4, "com/tencent/mm/plugin/scanner/ui/VcardContactUI$4", "onClick", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }
}
