package com.tencent.p014mm.app;

import android.app.ActivityManager;
import android.os.Process;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import java.util.List;
import p723vf.C118672d;

/* renamed from: com.tencent.mm.app.n0$$b */
public final /* synthetic */ class n0$$b implements Runnable {
    public final void run() {
        int i = 25;
        try {
            ActivityManager activityManager = (ActivityManager) MMApplicationContext.getContext().getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            if (activityManager != null) {
                while (i > 0) {
                    i--;
                    List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
                    if (processesInErrorState != null) {
                        Log.m105920e("MicroMsg.MMCrashReporter", "errorStateInfos.size = " + processesInErrorState.size());
                        for (ActivityManager.ProcessErrorStateInfo next : processesInErrorState) {
                            if (next.pid == Process.myPid()) {
                                C118672d.m167353c("MicroMsg.MMCrashReporter", "ANR error sate condition = %d", Integer.valueOf(next.condition));
                                C118672d.m167353c("MicroMsg.MMCrashReporter", "ANR error sate longMsg = %s", next.longMsg);
                            }
                        }
                    } else {
                        Log.m105920e("MicroMsg.MMCrashReporter", "errorStateInfos == null");
                    }
                    Thread.sleep(1000);
                }
            }
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.MMCrashReporter", "get errorStateInfos error : " + th.getMessage());
        }
    }
}
