package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.p136ui.LauncherUI;
import com.tencent.p014mm.plugin.appbrand.app.C81194z;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import js0.C88015a;
import k20.C60958c;
import k20.C9556a;
import ne3.C47239a;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.b0 */
public final class C84484b0 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ AppBrandDebugUI f246589d;

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.b0$a */
    public static final class C84485a extends C88015a {
        public void onActivityCreated(Activity activity, Bundle bundle) {
            C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            C47239a.m52540a(MMApplicationContext.getContext());
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/AppBrandDebugUI$onPostCreate$58$1$1$1$1", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "java/lang/System_EXEC_", "exit", "(I)V");
            System.exit(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(obj, "com/tencent/mm/plugin/appbrand/ui/AppBrandDebugUI$onPostCreate$58$1$1$1$1", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "java/lang/System_EXEC_", "exit", "(I)V");
            throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
        }
    }

    public C84484b0(AppBrandDebugUI appBrandDebugUI) {
        this.f246589d = appBrandDebugUI;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C81194z.f238510d.Rc0("AppBrandDebugUI");
        Intent intent = new Intent();
        AppBrandDebugUI appBrandDebugUI = this.f246589d;
        intent.putExtra("Intro_Need_Clear_Top ", true);
        intent.addFlags(67108864);
        intent.addFlags(536870912);
        intent.addFlags(268435456);
        ArrayList<LauncherUI> arrayList = LauncherUI.f214332A;
        intent.setClass(MMApplicationContext.getContext(), LauncherUI.class);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        AppBrandDebugUI appBrandDebugUI2 = appBrandDebugUI;
        C117292a.m165358d(appBrandDebugUI2, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/AppBrandDebugUI$onPostCreate$58$1$1", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        appBrandDebugUI.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(appBrandDebugUI2, "com/tencent/mm/plugin/appbrand/ui/AppBrandDebugUI$onPostCreate$58$1$1", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        Context applicationContext = MMApplicationContext.getContext().getApplicationContext();
        C87412m.m108592e(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new C84485a());
        this.f246589d.finishAndRemoveTask();
    }
}
