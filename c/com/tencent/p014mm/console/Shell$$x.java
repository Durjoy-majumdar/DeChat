package com.tencent.p014mm.console;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import j20.C117292a;
import k20.C9556a;

/* renamed from: com.tencent.mm.console.Shell$$x */
public class Shell$$x implements Shell$$s1 {
    /* renamed from: a */
    public void mo56303a(Intent intent) {
        if (WeChatEnvironment.hasDebugger() || WeChatEnvironment.isMonkeyEnv()) {
            Log.m105924i("MicroMsg.Shell", "#RECOVERY_LAUNCH_UI");
            Intent className = new Intent().setClassName(MMApplicationContext.getContext(), "com.tencent.mm.recovery.ui.RecoveryUI");
            className.addFlags(268435456);
            className.putExtra("extra_crash_count", 3);
            Context context = MMApplicationContext.getContext();
            C9556a aVar = new C9556a();
            aVar.mo10233c(className);
            Context context2 = context;
            C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/console/Shell$29", "exec", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/console/Shell$29", "exec", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        Log.m105920e("MicroMsg.Shell", "Environment denied: not coolassist or monkey env");
    }
}
