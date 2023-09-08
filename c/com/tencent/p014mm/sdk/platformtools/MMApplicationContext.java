package com.tencent.p014mm.sdk.platformtools;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import com.tencent.p014mm.app.C80589e;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import java.util.LinkedList;
import java.util.List;
import p385u2.C111105a;

/* renamed from: com.tencent.mm.sdk.platformtools.MMApplicationContext */
public final class MMApplicationContext {
    public static final String INTENT_PROCESS_NAME = "_application_context_process_";
    private static final String TAG = "MicroMsg.MMApplicationContext";
    private static Context context = null;
    private static String launchName = "com.tencent.mm.ui.LauncherUI";
    private static ActivityManager mActivityManager = null;
    private static boolean mAppHasInitFlag = false;
    private static volatile IResourceProvider mResourceProvider = null;
    private static volatile Resources mResources = null;
    private static String pkgName = "com.tencent.mm";
    private static final ThreadLocal<Boolean> sGetResReenterMark = new ThreadLocal<Boolean>() {
        public Boolean initialValue() {
            return Boolean.FALSE;
        }
    };
    private static long sInstallTime = -1;
    private static boolean sIsVersionChange = false;
    private static String sourcePkgName = "com.tencent.mm";

    /* renamed from: com.tencent.mm.sdk.platformtools.MMApplicationContext$IResourceProvider */
    public interface IResourceProvider {
        Resources getResources();
    }

    private MMApplicationContext() {
    }

    private static boolean enableIsolatedProcessForXWebPrivilegedProcess(String str) {
        return str.contains(pkgName + ":xweb_privileged_process");
    }

    private static boolean enableIsolatedProcessForXWebSandboxedProcess(String str) {
        return str.contains(pkgName + ":xweb_sandboxed_process");
    }

    private static boolean enableIsolatedProcessForXWebSandboxedProcessEx(String str) {
        return str.contains(pkgName + ":xweb_sandboxed_process_ex");
    }

    public static List<String> getAliveProcess() {
        LinkedList linkedList = new LinkedList();
        Context context2 = context;
        if (!(context2 == null || pkgName == null)) {
            if (mActivityManager == null) {
                mActivityManager = (ActivityManager) context2.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            }
            try {
                for (ActivityManager.RunningAppProcessInfo next : mActivityManager.getRunningAppProcesses()) {
                    String str = next.processName;
                    int i = next.pid;
                    linkedList.add(str + "@" + i);
                }
                return linkedList;
            } catch (Exception e) {
                Log.m105920e(TAG, "isMMProcessExist Exception: " + e.toString());
            } catch (Error e2) {
                Log.m105920e(TAG, "isMMProcessExist Error: " + e2.toString());
                return linkedList;
            }
        }
        return linkedList;
    }

    public static String getApplicationId() {
        return pkgName;
    }

    public static int getColor(int i) {
        return C111105a.m151500b(getContext(), i);
    }

    public static Context getContext() {
        return context;
    }

    public static SharedPreferences getDefaultPreference() {
        Context context2 = context;
        if (context2 != null) {
            return context2.getSharedPreferences(getDefaultPreferencePath(), 0);
        }
        return null;
    }

    public static String getDefaultPreferencePath() {
        return pkgName + "_preferences";
    }

    public static SharedPreferences getExdeviceProcessPreference() {
        if (context != null) {
            return context.getSharedPreferences(getExdeviceProcessPreferencePath(), 4);
        }
        return null;
    }

    public static String getExdeviceProcessPreferencePath() {
        return pkgName + "_preferences_exdevice_";
    }

    public static long getInstallTime() {
        long j = sInstallTime;
        if (j >= 0) {
            return j;
        }
        try {
            sInstallTime = new C86009m1(context.getPackageManager().getApplicationInfo(getApplicationId(), 0).sourceDir).mo119979q();
        } catch (Throwable th) {
            Log.printErrStackTrace(TAG, th, "", new Object[0]);
        }
        return sInstallTime;
    }

    public static String getLaunchName() {
        return launchName;
    }

    public static String getMainProcessName() {
        return pkgName;
    }

    @Deprecated
    public static String getPackageName() {
        return pkgName;
    }

    public static String getProcessName() {
        return C80589e.f235762c;
    }

    public static Resources getResources() {
        if (mResources != null) {
            return mResources;
        }
        if (mResourceProvider == null) {
            return null;
        }
        ThreadLocal<Boolean> threadLocal = sGetResReenterMark;
        if (threadLocal.get().booleanValue()) {
            return null;
        }
        try {
            threadLocal.set(Boolean.TRUE);
            mResources = mResourceProvider.getResources();
            Resources resources = mResources;
            threadLocal.set(Boolean.FALSE);
            return resources;
        } catch (Throwable th) {
            sGetResReenterMark.set(Boolean.FALSE);
            throw th;
        }
    }

    public static String getSourcePackageName() {
        return sourcePkgName;
    }

    public static String getString(int i) {
        return getResources().getString(i);
    }

    public static SharedPreferences getTmpPreference() {
        Context context2 = context;
        if (context2 != null) {
            return context2.getSharedPreferences(getTmpPreferencePath(), 0);
        }
        return null;
    }

    public static String getTmpPreferencePath() {
        return pkgName + "_tmp_preferences";
    }

    public static String getToolsProcessPreferencePath() {
        return pkgName + "_preferences_tools";
    }

    public static SharedPreferences getToolsProcesstPreference() {
        Context context2 = context;
        if (context2 != null) {
            return context2.getSharedPreferences(getToolsProcessPreferencePath(), 0);
        }
        return null;
    }

    public static boolean isAppBrandProcess() {
        String processName = getProcessName();
        if (processName == null || processName.length() == 0) {
            processName = pkgName;
        }
        return processName.startsWith(pkgName + ":appbrand");
    }

    public static boolean isAppHasInit() {
        return mAppHasInitFlag;
    }

    public static boolean isBacktraceProcess() {
        String processName = getProcessName();
        if (processName == null || processName.length() == 0) {
            processName = pkgName;
        }
        return (pkgName + ":backtrace__").equalsIgnoreCase(processName);
    }

    public static boolean isExdeviceProcess() {
        String processName = getProcessName();
        if (processName == null || processName.length() == 0) {
            processName = pkgName;
        }
        return (pkgName + ":exdevice").equalsIgnoreCase(processName);
    }

    public static boolean isHotpotDotDotProcess() {
        String processName = getProcessName();
        if (processName == null || processName.length() == 0) {
            processName = pkgName;
        }
        return (pkgName + ":hotpot..").equalsIgnoreCase(processName);
    }

    @Deprecated
    public static boolean isMMProcess() {
        return isMainProcess();
    }

    public static boolean isMMProcessExist() {
        return isProcessExist(pkgName);
    }

    public static boolean isMainProcess() {
        String str = C80589e.f235762c;
        if (str == null || str.length() == 0) {
            str = pkgName;
        }
        return pkgName.equals(str);
    }

    public static boolean isNoSpaceProcess() {
        String processName = getProcessName();
        if (processName == null || processName.length() == 0) {
            processName = pkgName;
        }
        return (pkgName + ":nospace").equalsIgnoreCase(processName);
    }

    public static boolean isProcessExist(String str) {
        Context context2 = context;
        if (!(context2 == null || pkgName == null)) {
            if (mActivityManager == null) {
                mActivityManager = (ActivityManager) context2.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            }
            try {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : mActivityManager.getRunningAppProcesses()) {
                    if (runningAppProcessInfo.processName.equals(str)) {
                        return true;
                    }
                }
                return false;
            } catch (Exception e) {
                Log.m105920e(TAG, "isMMProcessExist Exception: " + e.toString());
            } catch (Error e2) {
                Log.m105920e(TAG, "isMMProcessExist Error: " + e2.toString());
                return false;
            }
        }
        return false;
    }

    public static boolean isPushProcess() {
        String processName = getProcessName();
        if (processName == null || processName.length() == 0) {
            processName = pkgName;
        }
        return (pkgName + ":push").equalsIgnoreCase(processName);
    }

    public static boolean isRecoveryProcess() {
        String processName = getProcessName();
        if (processName == null || processName.length() == 0) {
            processName = pkgName;
        }
        return (pkgName + ":recovery").equalsIgnoreCase(processName);
    }

    public static boolean isSandBoxProcess() {
        String processName = getProcessName();
        if (processName == null || processName.length() == 0) {
            processName = pkgName;
        }
        return (pkgName + ":sandbox").equalsIgnoreCase(processName);
    }

    public static boolean isSupportProcess() {
        String processName = getProcessName();
        if (processName == null || processName.length() == 0) {
            processName = pkgName;
        }
        return (pkgName + ":support").equalsIgnoreCase(processName);
    }

    public static boolean isSwitchProcess() {
        String processName = getProcessName();
        if (processName == null || processName.length() == 0) {
            processName = pkgName;
        }
        return (pkgName + ":switch").equalsIgnoreCase(processName);
    }

    public static boolean isToolsIsolatedProcess() {
        String str = C80589e.f235762c;
        Log.m105924i(TAG, "isToolsIsolatedProcess, processName:" + str);
        if (str == null || str.length() == 0) {
            str = pkgName;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(pkgName);
        sb.append(":isolated_process0");
        return sb.toString().equalsIgnoreCase(str) || enableIsolatedProcessForXWebSandboxedProcess(str) || enableIsolatedProcessForXWebSandboxedProcessEx(str) || enableIsolatedProcessForXWebPrivilegedProcess(str);
    }

    public static boolean isToolsProcess() {
        String processName = getProcessName();
        if (processName == null || processName.length() == 0) {
            processName = pkgName;
        }
        return (pkgName + ":tools").equalsIgnoreCase(processName);
    }

    public static boolean isVersionChange() {
        return sIsVersionChange;
    }

    public static void setAppHasInitFlag(boolean z) {
        mAppHasInitFlag = z;
    }

    public static void setApplicationId(String str) {
        pkgName = str;
    }

    public static void setContext(Context context2) {
        context = context2;
        pkgName = context2.getPackageName();
        Log.m105918d(TAG, "setup application context for package: " + pkgName);
        if (context2 instanceof Application) {
            ApplicationGlobal.attach((Application) context2);
        }
    }

    public static void setIsVersionChange(boolean z) {
        sIsVersionChange = z;
    }

    public static void setResourcesProvider(IResourceProvider iResourceProvider) {
        mResourceProvider = null;
        mResourceProvider = iResourceProvider;
        mResources = null;
    }

    public static String getString(int i, Object... objArr) {
        return getResources().getString(i, objArr);
    }
}
