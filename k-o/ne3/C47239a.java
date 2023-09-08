package ne3;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.xweb.util.XWebCommandHandler;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: ne3.a */
public class C47239a {
    /* renamed from: a */
    public static void m52540a(Context context) {
        int i;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        for (ActivityManager.RunningAppProcessInfo next : ((ActivityManager) context.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getRunningAppProcesses()) {
            if (next.uid == myUid && (i = next.pid) != myPid) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(i));
                Object obj = new Object();
                C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/process/ProcessOperator", XWebCommandHandler.COMMAND_KILL_ALL_PROCESS, "(Landroid/content/Context;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                Process.killProcess(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(obj, "com/tencent/mm/process/ProcessOperator", XWebCommandHandler.COMMAND_KILL_ALL_PROCESS, "(Landroid/content/Context;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
            }
        }
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(Integer.valueOf(myPid));
        Object obj2 = new Object();
        C117292a.m165358d(obj2, aVar2.mo10232b(), "com/tencent/mm/process/ProcessOperator", XWebCommandHandler.COMMAND_KILL_ALL_PROCESS, "(Landroid/content/Context;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        Process.killProcess(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(obj2, "com/tencent/mm/process/ProcessOperator", XWebCommandHandler.COMMAND_KILL_ALL_PROCESS, "(Landroid/content/Context;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
    }
}
