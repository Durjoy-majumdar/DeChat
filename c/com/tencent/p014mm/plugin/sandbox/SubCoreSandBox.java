package com.tencent.p014mm.plugin.sandbox;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import bd2.C79690d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C80594h0;
import com.tencent.p014mm.booter.notification.MMNotification;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sandbox.monitor.C85701f;
import com.tencent.p014mm.sandbox.monitor.ExceptionMonitorBroadcastReceiver;
import com.tencent.p014mm.sandbox.monitor.ExceptionMonitorService;
import com.tencent.p014mm.sandbox.updater.AppUpdaterUI;
import com.tencent.p014mm.sandbox.updater.Updater;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import eb0.C31543z5;
import j20.C117292a;
import java.util.HashMap;
import k20.C9556a;
import org.xwalk.core.XWalkEnvironment;
import qo3.C89779i0;
import s72.C77623a;
import s72.C90148b;
import tg3.C90500z;

/* renamed from: com.tencent.mm.plugin.sandbox.SubCoreSandBox */
public class SubCoreSandBox implements C90148b {

    /* renamed from: a */
    public static boolean f248890a;

    /* renamed from: b */
    public static boolean f248891b;

    /* renamed from: a */
    public void mo118742a(boolean z) {
        f248890a = true;
        f248891b = z;
    }

    /* renamed from: b */
    public C77623a mo118743b(Context context, int i, DialogInterface.OnCancelListener onCancelListener, boolean z) {
        int i2 = Updater.f249748o;
        MMApplicationContext.getContext().getSharedPreferences("system_config_prefs", 0).edit().putLong("recomended_update_ignore", Util.nowSecond()).commit();
        ((MMNotification) ((C79690d) C86312j.m106911c(C79690d.class)).mo109806kA()).mo93207e(34);
        Log.m105924i("MicroMsg.Updater", "show update dialog");
        Updater updater = (Updater) View.inflate(context, C0966R.C0971layout.f360040cb1, (ViewGroup) null);
        updater.mo119325h();
        C89779i0 c = C89779i0.m112246c(context, "", true, 0, (DialogInterface.OnCancelListener) null);
        c.setCancelable(true);
        c.setOnCancelListener(new C90500z(updater, onCancelListener));
        C115669n.INSTANCE.idkeyStat(405, 48, 1, true);
        updater.f249750e = c;
        updater.f249751f = false;
        return updater;
    }

    /* renamed from: c */
    public void mo118744c(Context context, Intent intent) {
        if (intent != null) {
            intent.setClass(context, AppUpdaterUI.class);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/sandbox/SubCoreSandBox", "startAppUpdateUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/plugin/sandbox/SubCoreSandBox", "startAppUpdateUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    /* renamed from: d */
    public void mo118745d(Context context, Intent intent) {
        C80594h0.m98212a(10);
        if (context != null && intent != null) {
            if (MMApplicationContext.isMainProcess()) {
                Log.m105924i("MicroMsg.CrashSecondReport", "reportCrash() process:mm");
                C115669n.INSTANCE.idkeyStat(1185, 0, 1, true);
                intent.putExtra("exceptionProcess", XWalkEnvironment.MODULE_MM);
            } else if (MMApplicationContext.isPushProcess()) {
                Log.m105924i("MicroMsg.CrashSecondReport", "reportCrash() process:push");
                C115669n.INSTANCE.idkeyStat(1185, 1, 1, true);
                intent.putExtra("exceptionProcess", "push");
            } else {
                Log.m105924i("MicroMsg.CrashSecondReport", "reportCrash() process:other");
                C115669n.INSTANCE.idkeyStat(1185, 2, 1, true);
                intent.putExtra("exceptionProcess", "other");
            }
            HashMap<String, Integer> hashMap = C85701f.f249717a;
            String str = "";
            try {
                String stringExtra = intent.getStringExtra("tag");
                if (stringExtra == null) {
                    stringExtra = "exception";
                }
                str = C72994y1.f212832a + "crashprevent/" + intent.getStringExtra("userName") + "." + stringExtra + "." + C31543z5.m39451a() + ".crashlog";
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.CrashUpload", e, str, new Object[0]);
            }
            Log.m105925i("MicroMsg.SubCoreSandBox", "startExceptionMonitorService() crashPreventPath:%s", str);
            intent.putExtra("exceptionPreventPath", str);
            try {
                intent.setClass(context, ExceptionMonitorService.class);
                C80594h0.m98212a(11);
                MMApplicationContext.getContext().startService(intent);
            } catch (Exception e2) {
                Log.m105921e("MicroMsg.SubCoreSandBox", "startExceptionMonitorService() %s %s", e2.getClass().getSimpleName(), e2.getMessage());
                intent.setClass(context, ExceptionMonitorBroadcastReceiver.class);
                C80594h0.m98212a(12);
                MMApplicationContext.getContext().sendBroadcast(intent);
            }
            C85701f.m105856e(intent, str);
        }
    }
}
