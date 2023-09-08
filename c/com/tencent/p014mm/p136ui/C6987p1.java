package com.tencent.p014mm.p136ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import k20.C9556a;

/* renamed from: com.tencent.mm.ui.p1 */
public class C6987p1 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Context f24717d;

    public C6987p1(Context context) {
        this.f24717d = context;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            Intent intent = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
            Context context = this.f24717d;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/ui/MMAppMgr$14", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/ui/MMAppMgr$14", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MMAppMgr", e, "showLbsTipsAlert", new Object[0]);
        }
    }
}
