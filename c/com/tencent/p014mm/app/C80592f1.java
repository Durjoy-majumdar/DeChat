package com.tencent.p014mm.app;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Process;
import com.tencent.p014mm.app.ToolsProfile;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.XWebSdk;
import j20.C117292a;
import java.util.HashSet;
import java.util.Set;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.app.f1 */
public class C80592f1 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: d */
    public Set<Activity> f235769d = new HashSet();

    /* renamed from: e */
    public final /* synthetic */ ToolsProfile f235770e;

    public C80592f1(ToolsProfile toolsProfile) {
        this.f235770e = toolsProfile;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.f235770e.f235747b++;
        ((HashSet) this.f235769d).add(activity);
    }

    public void onActivityDestroyed(Activity activity) {
        ToolsProfile toolsProfile = this.f235770e;
        int i = toolsProfile.f235747b - 1;
        toolsProfile.f235747b = i;
        Log.m105919d("MicroMsg.ToolsProfile", "onActivityDestroyed, after destroy, activityInstanceNum = %d", Integer.valueOf(i));
        if (this.f235770e.f235747b == 0) {
            Log.m105925i("MicroMsg.ToolsProcessLocker", "clearLock, beforeReset %d", Integer.valueOf(ToolsProfile.C80582b.f235748a.getAndSet(0)));
            boolean needRebootProcess = XWebSdk.needRebootProcess();
            Log.m105925i("MicroMsg.ToolsProfile", "onActivityDestroyed, xwebCanReboot = %b", Boolean.valueOf(needRebootProcess));
            if (needRebootProcess && !ToolsProfile.C80582b.m98201b()) {
                int myPid = Process.myPid();
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(myPid));
                Object obj = new Object();
                C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/app/ToolsProfile$2", "onActivityDestroyed", "(Landroid/app/Activity;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                Process.killProcess(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(obj, "com/tencent/mm/app/ToolsProfile$2", "onActivityDestroyed", "(Landroid/app/Activity;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
            }
        }
        ((HashSet) this.f235769d).remove(activity);
    }

    public void onActivityPaused(Activity activity) {
        ((HashSet) this.f235769d).remove(activity);
        Log.m105925i("MicroMsg.ToolsProcessLocker", "doLocalLock, counter %d", Integer.valueOf(ToolsProfile.C80582b.f235748a.incrementAndGet()));
    }

    public void onActivityResumed(Activity activity) {
        if (!((HashSet) this.f235769d).contains(activity)) {
            Log.m105925i("MicroMsg.ToolsProcessLocker", "doLocalUnlock, counter %d", Integer.valueOf(ToolsProfile.C80582b.f235748a.decrementAndGet()));
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }
}
