package com.tencent.xweb.util;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import java.util.List;
import org.xwalk.core.XWalkEnvironment;

public class ProcessUtil {
    public static final String TAG = "ProcessUtil";

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getCurrentProcessNameByActivityThread() {
        /*
            java.lang.String r0 = "android.app.ActivityThread"
            java.lang.Class<android.app.Application> r1 = android.app.Application.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            r2 = 0
            java.lang.Class r0 = java.lang.Class.forName(r0, r2, r1)
            java.lang.Class[] r1 = new java.lang.Class[r2]
            java.lang.String r3 = "currentProcessName"
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r3, r1)
            r1 = 1
            r0.setAccessible(r1)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r2 = 0
            java.lang.Object r0 = r0.invoke(r2, r1)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L_0x0027
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
        L_0x0027:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "getCurrentProcessNameByActivityThread, processName:"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ProcessUtil"
            com.tencent.xweb.util.XWebLog.m21911i(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.xweb.util.ProcessUtil.getCurrentProcessNameByActivityThread():java.lang.String");
    }

    private static String getProcessNameByPid() {
        ActivityManager activityManager;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        Context applicationContext = XWalkEnvironment.getApplicationContext();
        int myPid = Process.myPid();
        if (!(applicationContext == null || (activityManager = (ActivityManager) applicationContext.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME)) == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null || runningAppProcesses.isEmpty())) {
            for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                if (next.pid == myPid) {
                    XWebLog.m21911i(TAG, "getProcessNameByPid, processName:" + next.processName);
                    return next.processName;
                }
            }
        }
        return null;
    }

    public static String safeGetProcessName(Context context) {
        Object invokeStatic;
        if (Build.VERSION.SDK_INT < 28 || (invokeStatic = ReflectionUtils.invokeStatic("android.app.Application", "getProcessName")) == null) {
            try {
                return getCurrentProcessNameByActivityThread();
            } catch (Throwable unused) {
                return getProcessNameByPid();
            }
        } else {
            XWebLog.m21911i(TAG, "safeGetProcessName, processName:" + invokeStatic.toString());
            return invokeStatic.toString();
        }
    }
}
