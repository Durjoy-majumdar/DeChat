package com.tencent.p014mm.pluginsdk.p133ui.tools;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMEntryLock;
import j20.C117292a;
import k20.C9556a;
import nj3.C76879j;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.y0 */
public class C6692y0 {

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.y0$a */
    public class C6693a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Context f24056d;

        public C6693a(Context context) {
            this.f24056d = context;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Context context = this.f24056d;
            Intent intent = new Intent("android.settings.WIRELESS_SETTINGS");
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            Context context2 = context;
            C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/tools/NetworkErrAlert$1", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/pluginsdk/ui/tools/NetworkErrAlert$1", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    /* renamed from: a */
    public static boolean m7002a(Context context) {
        if (!MMEntryLock.lock("network_doctor_shown")) {
            return false;
        }
        C76879j.m92743n(context, C0966R.string.h7i, C0966R.string.a3h, new C6693a(context), (DialogInterface.OnClickListener) null);
        return true;
    }
}
