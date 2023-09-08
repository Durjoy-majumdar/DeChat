package com.tencent.xweb.util;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.xweb.IXWebPreferences;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import org.xwalk.core.XWalkEnvironment;

public class XWebCommandHandler {
    public static final String COMMAND_KILL_ALL_PROCESS = "killAllProcess";
    public static final String COMMAND_KILL_GPU_PROCESS = "killGpuProcess";
    public static final String COMMAND_KILL_RENDER_PROCESS = "killRenderProcess";
    public static final String COMMAND_KILL_TOOLS_PROCESS = "killToolsProcess";
    public static final String TAG = "XWebCommandHandler";
    private byte _hellAccFlag_;

    public static void killAllProcess(Context context) {
        XWebLog.m21911i(TAG, COMMAND_KILL_ALL_PROCESS);
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        for (ActivityManager.RunningAppProcessInfo next : ((ActivityManager) context.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getRunningAppProcesses()) {
            if (next.uid == myUid && next.pid != myPid) {
                String str = next.processName;
                if (str == null || !str.contains("com.tencent.mm") || str.contains(XWalkEnvironment.MODULE_TOOLS) || str.contains(XWalkEnvironment.MODULE_APPBRAND) || str.contains("support") || str.contains(IXWebPreferences.XWEB_RENDERER_SANDBOX)) {
                    XWebLog.m21911i(TAG, "killAllProcess, pid:" + next.pid);
                    int i = next.pid;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(Integer.valueOf(i));
                    Object obj = new Object();
                    C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/xweb/util/XWebCommandHandler", COMMAND_KILL_ALL_PROCESS, "(Landroid/content/Context;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                    Process.killProcess(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(obj, "com/tencent/xweb/util/XWebCommandHandler", COMMAND_KILL_ALL_PROCESS, "(Landroid/content/Context;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                }
            }
        }
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(Integer.valueOf(myPid));
        Object obj2 = new Object();
        C117292a.m165358d(obj2, aVar2.mo10232b(), "com/tencent/xweb/util/XWebCommandHandler", COMMAND_KILL_ALL_PROCESS, "(Landroid/content/Context;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        Process.killProcess(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(obj2, "com/tencent/xweb/util/XWebCommandHandler", COMMAND_KILL_ALL_PROCESS, "(Landroid/content/Context;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
    }

    public static void killGpuProcess(Context context) {
        String str;
        XWebLog.m21911i(TAG, COMMAND_KILL_GPU_PROCESS);
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        for (ActivityManager.RunningAppProcessInfo next : ((ActivityManager) context.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getRunningAppProcesses()) {
            if (next.uid == myUid && next.pid != myPid && (str = next.processName) != null && str.contains("com.tencent.mm") && str.contains("xweb_privileged_process")) {
                XWebLog.m21911i(TAG, "killGpuProcess, pid:" + next.pid);
                int i = next.pid;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(i));
                Object obj = new Object();
                C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/xweb/util/XWebCommandHandler", COMMAND_KILL_GPU_PROCESS, "(Landroid/content/Context;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                Process.killProcess(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(obj, "com/tencent/xweb/util/XWebCommandHandler", COMMAND_KILL_GPU_PROCESS, "(Landroid/content/Context;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
            }
        }
    }

    public static void killRenderProcess(Context context) {
        String str;
        XWebLog.m21911i(TAG, COMMAND_KILL_RENDER_PROCESS);
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        for (ActivityManager.RunningAppProcessInfo next : ((ActivityManager) context.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getRunningAppProcesses()) {
            if (next.uid == myUid && next.pid != myPid && (str = next.processName) != null && str.contains("com.tencent.mm") && str.contains("xweb_sandboxed_process")) {
                XWebLog.m21911i(TAG, "killRenderProcess, pid:" + next.pid);
                int i = next.pid;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(i));
                Object obj = new Object();
                C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/xweb/util/XWebCommandHandler", COMMAND_KILL_RENDER_PROCESS, "(Landroid/content/Context;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                Process.killProcess(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(obj, "com/tencent/xweb/util/XWebCommandHandler", COMMAND_KILL_RENDER_PROCESS, "(Landroid/content/Context;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
            }
        }
    }

    public static void killToolsProcess(Context context) {
        XWebLog.m21911i(TAG, COMMAND_KILL_TOOLS_PROCESS);
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        for (ActivityManager.RunningAppProcessInfo next : ((ActivityManager) context.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getRunningAppProcesses()) {
            if (next.uid == myUid && next.pid != myPid) {
                String str = next.processName;
                XWebLog.m21911i(TAG, "killToolsProcess, process:" + str);
                if (str != null && str.contains("com.tencent.mm") && str.contains(XWalkEnvironment.MODULE_TOOLS)) {
                    XWebLog.m21911i(TAG, "killToolsProcess, pid:" + next.pid);
                    int i = next.pid;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(Integer.valueOf(i));
                    Object obj = new Object();
                    C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/xweb/util/XWebCommandHandler", COMMAND_KILL_TOOLS_PROCESS, "(Landroid/content/Context;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                    Process.killProcess(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(obj, "com/tencent/xweb/util/XWebCommandHandler", COMMAND_KILL_TOOLS_PROCESS, "(Landroid/content/Context;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                }
            }
        }
    }

    public static void runCommand(Bundle bundle) {
        XWebLog.m21911i(TAG, "runCommand, bundle:" + bundle);
        String string = bundle.getString("command", (String) null);
        XWebLog.m21911i(TAG, "runCommand, command:" + string);
        if (!TextUtils.isEmpty(string)) {
            string.getClass();
            char c = 65535;
            switch (string.hashCode()) {
                case -1796889966:
                    if (string.equals(COMMAND_KILL_TOOLS_PROCESS)) {
                        c = 0;
                        break;
                    }
                    break;
                case -1277409759:
                    if (string.equals(COMMAND_KILL_GPU_PROCESS)) {
                        c = 1;
                        break;
                    }
                    break;
                case 36130700:
                    if (string.equals(COMMAND_KILL_ALL_PROCESS)) {
                        c = 2;
                        break;
                    }
                    break;
                case 1443134779:
                    if (string.equals(COMMAND_KILL_RENDER_PROCESS)) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    killToolsProcess(XWalkEnvironment.getApplicationContext());
                    return;
                case 1:
                    killGpuProcess(XWalkEnvironment.getApplicationContext());
                    return;
                case 2:
                    killAllProcess(XWalkEnvironment.getApplicationContext());
                    return;
                case 3:
                    killRenderProcess(XWalkEnvironment.getApplicationContext());
                    return;
                default:
                    return;
            }
        }
    }
}
