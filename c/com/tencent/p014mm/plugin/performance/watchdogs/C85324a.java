package com.tencent.p014mm.plugin.performance.watchdogs;

import android.app.ActivityManager;
import android.os.Debug;
import android.os.Process;
import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import java.util.ArrayList;
import java.util.List;
import junit.framework.Assert;
import p757xv.C91355x;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.performance.watchdogs.a */
public class C85324a implements Runnable {

    /* renamed from: e */
    public static C85324a f248602e = new C85324a();

    /* renamed from: f */
    public static boolean f248603f = false;

    /* renamed from: g */
    public static int f248604g = 0;

    /* renamed from: d */
    public final ActivityManager f248605d = ((ActivityManager) MMApplicationContext.getContext().getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME));

    public void run() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = this.f248605d.getRunningAppProcesses();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < runningAppProcesses.size(); i++) {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = runningAppProcesses.get(i);
            String packageName = WeChatBrands.AppInfo.current().getPackageName();
            Log.m105919d("AppbrandMemoryMonitor", "pkg name is [%s]", packageName);
            if (Process.myUid() != runningAppProcessInfo.uid || TextUtils.isEmpty(runningAppProcessInfo.processName) || !runningAppProcessInfo.processName.startsWith(packageName)) {
                Log.m105921e("AppbrandMemoryMonitor", "info with uid [%s] & process name [%s] is not current app [%s][%s]", Integer.valueOf(runningAppProcesses.get(i).uid), runningAppProcesses.get(i).processName, Integer.valueOf(Process.myUid()), packageName);
            } else {
                C91355x xVar = new C91355x();
                xVar.f261999a = runningAppProcesses.get(i).pid;
                xVar.f262000b = runningAppProcesses.get(i).processName;
                arrayList.add(xVar);
                Log.m105919d("AppbrandMemoryMonitor", "pid = %s, process = %s", Integer.valueOf(xVar.f261999a), xVar.f262000b);
            }
        }
        int size = arrayList.size();
        C91355x[] xVarArr = new C91355x[size];
        arrayList.toArray(xVarArr);
        Debug.MemoryInfo[] memoryInfoArr = null;
        try {
            ActivityManager activityManager = this.f248605d;
            int[] iArr = new int[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = xVarArr[i2].f261999a;
            }
            memoryInfoArr = activityManager.getProcessMemoryInfo(iArr);
        } catch (Exception e) {
            Log.printErrStackTrace("AppbrandMemoryMonitor", e, "", new Object[0]);
        }
        if (memoryInfoArr != null) {
            Log.m105919d("AppbrandMemoryMonitor", "pidMemInfoArray2 size = %s, memoryInfos size = %s", Integer.valueOf(memoryInfoArr.length), Integer.valueOf(size));
            if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || WeChatEnvironment.isCoolassistEnv()) {
                Assert.assertEquals(size, memoryInfoArr.length);
            }
            int i3 = 0;
            for (int i4 = 0; i4 < Math.min(memoryInfoArr.length, size); i4++) {
                Debug.MemoryInfo memoryInfo = memoryInfoArr[i4];
                if (memoryInfo != null) {
                    Log.m105919d("AppbrandMemoryMonitor", "total pss = %d", Integer.valueOf(memoryInfo.getTotalPss()));
                    xVarArr[i4].f262023y = memoryInfoArr[i4].getTotalPss();
                    i3 += xVarArr[i4].f262023y;
                }
            }
            if (i3 > f248604g) {
                f248603f = true;
            } else {
                f248603f = false;
            }
        } else {
            Log.m105920e("AppbrandMemoryMonitor", "pidMemInfoArray2 == null");
        }
        ((C119157j) C119157j.f356862d).mo183879j(this, 300000, "AppbrandMemoryMonitor");
    }
}
