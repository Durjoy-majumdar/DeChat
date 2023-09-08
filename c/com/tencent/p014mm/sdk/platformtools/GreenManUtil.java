package com.tencent.p014mm.sdk.platformtools;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.tencent.mm.sdk.platformtools.GreenManUtil */
public class GreenManUtil {
    private static final String TAG = "MicroMsg.GreenManUtil";
    /* access modifiers changed from: private */
    public static int batteryStatus = -1;
    /* access modifiers changed from: private */
    public static int batteryStatusPlugged;
    private static BroadcastReceiver broadcastReceiver;
    private static IForeground sForeground = new ForegroundImpl();

    /* renamed from: com.tencent.mm.sdk.platformtools.GreenManUtil$ForegroundImpl */
    public static class ForegroundImpl implements IForeground {
        /* access modifiers changed from: private */
        public Field Field_processState = null;

        public ForegroundImpl() {
            prepare();
        }

        private void prepare() {
            try {
                if (this.Field_processState == null) {
                    Field declaredField = ActivityManager.RunningAppProcessInfo.class.getDeclaredField("processState");
                    declaredField.setAccessible(true);
                    this.Field_processState = declaredField;
                }
            } catch (Throwable th) {
                Log.printErrStackTrace(GreenManUtil.TAG, th, "", new Object[0]);
            }
        }

        public boolean isAppForeground(Context context) {
            boolean z;
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getRunningAppProcesses();
            if (runningAppProcesses == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                if (next.processName.startsWith(context.getPackageName())) {
                    Field field = this.Field_processState;
                    if (field != null) {
                        try {
                            int i = field.getInt(next);
                            Log.m105925i(GreenManUtil.TAG, "isAppForeground processState %s", Integer.valueOf(i));
                            if (i <= 2) {
                                return true;
                            }
                            z = false;
                            if (z && next.importance == 100) {
                                return true;
                            }
                        } catch (Throwable th) {
                            Log.printErrStackTrace(GreenManUtil.TAG, th, "", new Object[0]);
                        }
                    }
                    z = true;
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: com.tencent.mm.sdk.platformtools.GreenManUtil$IForeground */
    public interface IForeground {
        boolean isAppForeground(Context context);
    }

    public static void dumpRunningServices(Context context) {
        List<ActivityManager.RunningServiceInfo> runningServices = ((ActivityManager) context.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getRunningServices(10);
        if (runningServices != null) {
            for (ActivityManager.RunningServiceInfo next : runningServices) {
                Log.m105925i(TAG, "dumpRunningServices %s %s", next.service, Boolean.valueOf(next.foreground), Long.valueOf(next.activeSince));
            }
        }
    }

    public static String getTopActivityName(Context context) {
        if (!isAppOnForeground(context)) {
            return "";
        }
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            if (Build.VERSION.SDK_INT < 23) {
                return activityManager.getRunningTasks(1).get(0).topActivity.getClassName();
            }
            List<ActivityManager.AppTask> appTasks = activityManager.getAppTasks();
            if (appTasks != null) {
                if (appTasks.size() > 0) {
                    Iterator<ActivityManager.AppTask> it = appTasks.iterator();
                    if (it.hasNext()) {
                        ComponentName componentName = it.next().getTaskInfo().topActivity;
                        if (componentName == null) {
                            return null;
                        }
                        return componentName.getClassName();
                    }
                    return "";
                }
            }
            return "";
        } catch (Exception e) {
            Log.m105921e(TAG, "getTopActivityName Exception:%s stack:%s", e.getMessage(), Util.stackTraceToString(e));
        }
    }

    public static boolean isAppOnForeground(String str, Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
            if (next.processName.equals(str) && next.importance == 100) {
                return true;
            }
        }
        return false;
    }

    public static boolean isAppVisibleForeground(Context context) {
        return sForeground.isAppForeground(context);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:2|3|(3:5|6|7)|8|9|(1:17)|18) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x002d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean isCharging(android.content.Context r5) {
        /*
            java.lang.Class<com.tencent.mm.sdk.platformtools.GreenManUtil> r0 = com.tencent.p014mm.sdk.platformtools.GreenManUtil.class
            monitor-enter(r0)
            android.content.BroadcastReceiver r1 = broadcastReceiver     // Catch:{ all -> 0x0041 }
            r2 = 0
            if (r1 != 0) goto L_0x002d
            com.tencent.mm.sdk.platformtools.GreenManUtil$1 r1 = new com.tencent.mm.sdk.platformtools.GreenManUtil$1     // Catch:{ all -> 0x0041 }
            r1.<init>()     // Catch:{ all -> 0x0041 }
            broadcastReceiver = r1     // Catch:{ all -> 0x0041 }
            android.content.IntentFilter r3 = new android.content.IntentFilter     // Catch:{ all -> 0x002d }
            java.lang.String r4 = "android.intent.action.BATTERY_CHANGED"
            r3.<init>(r4)     // Catch:{ all -> 0x002d }
            android.content.Intent r5 = r5.registerReceiver(r1, r3)     // Catch:{ all -> 0x002d }
            java.lang.String r1 = "status"
            r3 = -1
            int r1 = r5.getIntExtra(r1, r3)     // Catch:{ all -> 0x002d }
            batteryStatus = r1     // Catch:{ all -> 0x002d }
            java.lang.String r1 = "plugged"
            int r5 = r5.getIntExtra(r1, r2)     // Catch:{ all -> 0x002d }
            batteryStatusPlugged = r5     // Catch:{ all -> 0x002d }
        L_0x002d:
            int r5 = batteryStatus     // Catch:{ all -> 0x0041 }
            r1 = 1
            r3 = 2
            if (r5 == r3) goto L_0x003e
            int r5 = batteryStatusPlugged     // Catch:{ all -> 0x0041 }
            if (r5 == r1) goto L_0x003e
            if (r5 == r3) goto L_0x003e
            int r5 = batteryStatusPlugged     // Catch:{ all -> 0x0041 }
            r3 = 4
            if (r5 != r3) goto L_0x003f
        L_0x003e:
            r2 = 1
        L_0x003f:
            monitor-exit(r0)
            return r2
        L_0x0041:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.platformtools.GreenManUtil.isCharging(android.content.Context):boolean");
    }

    public static boolean isScreenOn(Context context) {
        try {
            return ((PowerManager) context.getSystemService("power")).isInteractive();
        } catch (Exception e) {
            Log.m105921e(TAG, "isScreenOn ERROR use isScreenOn e:%s", Util.stackTraceToString(e));
            return false;
        }
    }

    public static int reflectProcessState(ActivityManager.RunningAppProcessInfo runningAppProcessInfo) {
        Field access$200;
        IForeground iForeground = sForeground;
        if ((iForeground instanceof ForegroundImpl) && (access$200 = ((ForegroundImpl) iForeground).Field_processState) != null) {
            try {
                return access$200.getInt(runningAppProcessInfo);
            } catch (Throwable th) {
                Log.printErrStackTrace(TAG, th, "", new Object[0]);
            }
        }
        return -1;
    }

    public static boolean reflectScreenOn(Context context) {
        try {
            return ((Boolean) PowerManager.class.getMethod("isScreenOn", new Class[0]).invoke((PowerManager) context.getSystemService("power"), new Object[0])).booleanValue();
        } catch (Exception e) {
            Log.m105921e(TAG, "reflectScreenOn invoke ERROR use isScreenOn e:%s", Util.stackTraceToString(e));
            return true;
        }
    }

    public static boolean isAppOnForeground(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
            if (next.importance == 100 && next.processName.startsWith(context.getPackageName())) {
                return true;
            }
        }
        return false;
    }
}
