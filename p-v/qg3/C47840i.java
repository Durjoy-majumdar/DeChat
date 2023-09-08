package qg3;

import android.app.ActivityManager;
import android.os.Process;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import lg3.C88494d;

/* renamed from: qg3.i */
public class C47840i implements C88494d.C46859b {
    public C47840i(C89655j jVar) {
    }

    /* renamed from: a */
    public void mo72582a() {
        ActivityManager activityManager = (ActivityManager) MMApplicationContext.getContext().getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        if (activityManager == null) {
            Log.m105920e("MicroMsg.ProcessOperator", "Fail to get ActivityManager.");
        } else {
            int myPid = Process.myPid();
            int myUid = Process.myUid();
            for (ActivityManager.RunningAppProcessInfo next : activityManager.getRunningAppProcesses()) {
                if (next.uid == myUid && next.pid != myPid && !next.processName.endsWith(":push")) {
                    Log.m105929w("MicroMsg.ProcessOperator", "Kill process: %s(%s) by killAllProcessExceptPushAndSelf()", next.processName, Integer.valueOf(next.pid));
                    int i = next.pid;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(Integer.valueOf(i));
                    Object obj = new Object();
                    C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/process/ProcessOperator", "killAllProcessExceptPushAndSelf", "(Landroid/content/Context;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                    Process.killProcess(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(obj, "com/tencent/mm/process/ProcessOperator", "killAllProcessExceptPushAndSelf", "(Landroid/content/Context;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                }
            }
            Log.appenderFlush();
        }
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(0);
        Object obj2 = new Object();
        C117292a.m165358d(obj2, aVar2.mo10232b(), "com/tencent/mm/routine/DefaultStartupRoutine$3", "onDensityChange", "()V", "java/lang/System_EXEC_", "exit", "(I)V");
        System.exit(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(obj2, "com/tencent/mm/routine/DefaultStartupRoutine$3", "onDensityChange", "()V", "java/lang/System_EXEC_", "exit", "(I)V");
    }
}
