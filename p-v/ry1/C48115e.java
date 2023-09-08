package ry1;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import j20.C117292a;
import k20.C9556a;

/* renamed from: ry1.e */
public class C48115e implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C48111d f128987d;

    public C48115e(C48111d dVar) {
        this.f128987d = dVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Intent intent = new Intent("android.settings.SECURITY_SETTINGS");
        Context context = this.f128987d.f128975e;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Context context2 = context;
        C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/game/ui/CommonGameClickListener$3", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/mm/plugin/game/ui/CommonGameClickListener$3", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        dialogInterface.cancel();
    }
}
