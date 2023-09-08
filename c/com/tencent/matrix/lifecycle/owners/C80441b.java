package com.tencent.matrix.lifecycle.owners;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.os.Process;
import com.tencent.matrix.lifecycle.owners.ForegroundServiceLifecycleOwner;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import p723vf.C118672d;

/* renamed from: com.tencent.matrix.lifecycle.owners.b */
public final class C80441b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ComponentName f235403d;

    public C80441b(ForegroundServiceLifecycleOwner.C80422b bVar, ComponentName componentName) {
        this.f235403d = componentName;
    }

    public final void run() {
        List<ActivityManager.RunningServiceInfo> runningServices;
        try {
            ActivityManager access$getActivityManager$p = ForegroundServiceLifecycleOwner.activityManager;
            if (access$getActivityManager$p != null && (runningServices = access$getActivityManager$p.getRunningServices(Integer.MAX_VALUE)) != null) {
                ArrayList<ActivityManager.RunningServiceInfo> arrayList = new ArrayList<>();
                for (T next : runningServices) {
                    ActivityManager.RunningServiceInfo runningServiceInfo = (ActivityManager.RunningServiceInfo) next;
                    if (runningServiceInfo.pid == Process.myPid() && runningServiceInfo.uid == Process.myUid() && C87412m.m108589b(runningServiceInfo.service, this.f235403d) && runningServiceInfo.foreground) {
                        arrayList.add(next);
                    }
                }
                for (ActivityManager.RunningServiceInfo runningServiceInfo2 : arrayList) {
                    C118672d.m167353c("Matrix.lifecycle.FgService", "service turned fg when create: " + runningServiceInfo2.service, new Object[0]);
                    ForegroundServiceLifecycleOwner.C80420a access$getFgServiceHandler$p = ForegroundServiceLifecycleOwner.fgServiceHandler;
                    if (access$getFgServiceHandler$p != null) {
                        ComponentName componentName = runningServiceInfo2.service;
                        C87412m.m108593f(componentName, "it.service");
                        access$getFgServiceHandler$p.mo111908b(componentName);
                    }
                }
            }
        } catch (Throwable th) {
            C118672d.m167354d("Matrix.lifecycle.FgService", th, "", new Object[0]);
        }
    }
}
