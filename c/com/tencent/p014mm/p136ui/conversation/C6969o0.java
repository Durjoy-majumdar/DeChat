package com.tencent.p014mm.p136ui.conversation;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import j20.C117292a;
import k20.C9556a;

/* renamed from: com.tencent.mm.ui.conversation.o0 */
public class C6969o0 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ InitHelper f24688d;

    public C6969o0(InitHelper initHelper) {
        this.f24688d = initHelper;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Intent intent = new Intent();
        intent.setClassName(this.f24688d.f219447o, "com.tencent.mm.plugin.account.ui.RegByFacebookSetPwdUI");
        Activity activity = this.f24688d.f219447o;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Activity activity2 = activity;
        C117292a.m165358d(activity2, aVar.mo10232b(), "com/tencent/mm/ui/conversation/InitHelper$11", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(activity2, "com/tencent/mm/ui/conversation/InitHelper$11", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
