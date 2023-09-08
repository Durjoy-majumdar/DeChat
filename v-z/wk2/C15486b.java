package wk2;

import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import k20.C9556a;
import nj3.C11184p0;
import t83.C13855j;

/* renamed from: wk2.b */
public final class C15486b implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C13855j f42012d;

    /* renamed from: e */
    public final /* synthetic */ String f42013e;

    public C15486b(C13855j jVar, String str) {
        this.f42012d = jVar;
        this.f42013e = str;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            C15487c cVar = C15487c.f42014f;
            if (cVar.mo14293f()) {
                Context context = this.f42012d.f38998a;
                String str = this.f42013e;
                cVar.getClass();
                Intent intent = new Intent("android.intent.action.INSERT");
                intent.setType("vnd.android.cursor.dir/contact");
                intent.putExtra("phone", str);
                try {
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent);
                    C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/scanner/box/jsapi/JsApiAddToAddressBook", "phoneCreateContact", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(context, "com/tencent/mm/plugin/scanner/box/jsapi/JsApiAddToAddressBook", "phoneCreateContact", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.JsApiOpenDialPad", e, "", new Object[0]);
                }
                C115669n.INSTANCE.kvStat(10113, "1");
                return;
            }
            C15487c.m14502e(cVar, this.f42012d.f38998a, this.f42013e);
            C115669n.INSTANCE.kvStat(10114, "1");
        } else if (itemId == 1) {
            C15487c.m14502e(C15487c.f42014f, this.f42012d.f38998a, this.f42013e);
            C115669n.INSTANCE.kvStat(10114, "1");
        }
    }
}
