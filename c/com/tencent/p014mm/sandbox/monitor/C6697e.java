package com.tencent.p014mm.sandbox.monitor;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import j20.C117292a;
import java.util.Map;
import k20.C9556a;

/* renamed from: com.tencent.mm.sandbox.monitor.e */
public class C6697e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Map f24100d;

    public C6697e(Map map) {
        this.f24100d = map;
    }

    public void run() {
        Intent className = new Intent().setClassName(MMApplicationContext.getContext(), "com.tencent.mm.sandbox.updater.AppUpdaterUI");
        className.addFlags(268435456);
        className.putExtra("intent_extra_desc", (String) this.f24100d.get(".Response.desc"));
        className.putExtra("intent_update_type", 999);
        className.putExtra("intent_extra_download_url", new String[]{(String) this.f24100d.get(".Response.url")});
        Context context = MMApplicationContext.getContext();
        C9556a aVar = new C9556a();
        aVar.mo10233c(className);
        Context context2 = context;
        C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/sandbox/monitor/CrashUpload$4", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/mm/sandbox/monitor/CrashUpload$4", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
