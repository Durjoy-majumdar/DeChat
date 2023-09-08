package com.tencent.p014mm.p136ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import j20.C117292a;
import k20.C9556a;

/* renamed from: com.tencent.mm.ui.u1 */
public class C7034u1 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Context f24802d;

    public C7034u1(Context context) {
        this.f24802d = context;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            Context context = this.f24802d;
            Intent intent = new Intent("android.settings.APN_SETTINGS");
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/ui/MMAppMgr$5", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/ui/MMAppMgr$5", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } catch (Exception unused) {
        }
    }
}
