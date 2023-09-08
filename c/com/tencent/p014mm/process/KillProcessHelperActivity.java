package com.tencent.p014mm.process;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import com.tencent.p014mm.hellhoundlib.activities.HellActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/process/KillProcessHelperActivity;", "Landroid/app/Activity;", "<init>", "()V", "plugin-comm_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.process.KillProcessHelperActivity */
public final class KillProcessHelperActivity extends HellActivity {

    /* renamed from: d */
    public static final /* synthetic */ int f121043d = 0;

    public void onCreate(Bundle bundle) {
        int i;
        Log.m105924i("MicroMsg.KillProcessHelperActivity", "onCreate() called with: savedInstanceState = " + bundle);
        super.onCreate(bundle);
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        for (ActivityManager.RunningAppProcessInfo next : ((ActivityManager) getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getRunningAppProcesses()) {
            if (next.uid == myUid && (i = next.pid) != myPid) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(i));
                Object obj = new Object();
                C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/process/ProcessOperator", "killOtherProcessExceptSelf", "(Landroid/content/Context;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                Process.killProcess(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(obj, "com/tencent/mm/process/ProcessOperator", "killOtherProcessExceptSelf", "(Landroid/content/Context;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
            }
        }
        Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
        if (launchIntentForPackage == null) {
            launchIntentForPackage = new Intent();
            launchIntentForPackage.setComponent(new ComponentName(this, "com.tencent.mm.ui.LauncherUI"));
        }
        launchIntentForPackage.putExtra("Intro_Need_Clear_Top ", true);
        launchIntentForPackage.addFlags(67108864);
        launchIntentForPackage.addFlags(536870912);
        launchIntentForPackage.addFlags(268468224);
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(launchIntentForPackage);
        C117292a.m165358d(this, aVar2.mo10232b(), "com/tencent/mm/process/KillProcessHelperActivity", "onCreate", "(Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((Intent) aVar2.mo10231a(0));
        C117292a.m165359e(this, "com/tencent/mm/process/KillProcessHelperActivity", "onCreate", "(Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        finish();
        int myPid2 = Process.myPid();
        C9556a aVar3 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar3.mo10233c(Integer.valueOf(myPid2));
        Object obj2 = new Object();
        C117292a.m165358d(obj2, aVar3.mo10232b(), "com/tencent/mm/process/ProcessOperator", "killSelfProcess", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        Process.killProcess(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(obj2, "com/tencent/mm/process/ProcessOperator", "killSelfProcess", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
    }
}
