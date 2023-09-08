package de3;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.MenuItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import k20.C9556a;
import nj3.C11184p0;

/* renamed from: de3.x */
public class C7319x implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ Context f25434d;

    public C7319x(Context context) {
        this.f25434d = context;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        String replace = menuItem.getTitle().toString().replace(" ", "").replace("(", "").replace(")", "").replace("-", "");
        Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + replace));
        intent.addFlags(268435456);
        if (Util.isIntentAvailable(this.f25434d, intent, true)) {
            try {
                Context context = this.f25434d;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/span/MailPhoneMenuHelper$4", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context, "com/tencent/mm/pluginsdk/ui/span/MailPhoneMenuHelper$4", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.MailPhoneMenuHelper", e, "", new Object[0]);
            }
        }
    }
}
