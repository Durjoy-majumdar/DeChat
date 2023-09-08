package com.tencent.xweb.updater;

import android.content.SharedPreferences;
import android.os.Process;
import com.tencent.xweb.util.XWebLog;
import com.tencent.xweb.util.XWebSharedPreferenceUtil;

public class XWalkUpdateLocker {
    private static final String SP_KEY_Start_Time = "Start_Time";
    private static final String SP_KEY_UpdatingProcessId = "UpdatingProcessId";
    public static final String TAG = "XWalkUpdateLocker";
    private static boolean sIsUpdating;
    private static long sUpdateFinishedTime;

    public static synchronized void finishUpdatingProcess() {
        synchronized (XWalkUpdateLocker.class) {
            if (!sIsUpdating) {
                XWebLog.addInitializeLog(TAG, "updating progress not started");
                return;
            }
            sIsUpdating = false;
            sUpdateFinishedTime = System.currentTimeMillis();
            SharedPreferences.Editor edit = XWebSharedPreferenceUtil.getMMKVSharedPreferencesForUpdatingTag().edit();
            edit.remove(SP_KEY_UpdatingProcessId);
            edit.commit();
            XWebLog.addInitializeLog(TAG, "finish updating progress");
        }
    }

    public static long getUpdateFinishedTime() {
        return sUpdateFinishedTime;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a5, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean isInUpdatingProgress() {
        /*
            java.lang.Class<com.tencent.xweb.updater.XWalkUpdateLocker> r0 = com.tencent.xweb.updater.XWalkUpdateLocker.class
            monitor-enter(r0)
            boolean r1 = sIsUpdating     // Catch:{ all -> 0x00a6 }
            r2 = 1
            if (r1 == 0) goto L_0x0011
            java.lang.String r1 = "XWalkUpdateLocker"
            java.lang.String r3 = "already in updating progress"
            com.tencent.xweb.util.XWebLog.addInitializeLog(r1, r3)     // Catch:{ all -> 0x00a6 }
            monitor-exit(r0)
            return r2
        L_0x0011:
            android.content.SharedPreferences r1 = com.tencent.xweb.util.XWebSharedPreferenceUtil.getMMKVSharedPreferencesForUpdatingTag()     // Catch:{ all -> 0x00a6 }
            java.lang.String r3 = "UpdatingProcessId"
            r4 = -1
            int r3 = r1.getInt(r3, r4)     // Catch:{ all -> 0x00a6 }
            int r4 = android.os.Process.myPid()     // Catch:{ all -> 0x00a6 }
            if (r3 != r4) goto L_0x003f
            java.lang.String r1 = "XWalkUpdateLocker"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a6 }
            r4.<init>()     // Catch:{ all -> 0x00a6 }
            java.lang.String r5 = "current process("
            r4.append(r5)     // Catch:{ all -> 0x00a6 }
            r4.append(r3)     // Catch:{ all -> 0x00a6 }
            java.lang.String r3 = ") is in updating progress"
            r4.append(r3)     // Catch:{ all -> 0x00a6 }
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x00a6 }
            com.tencent.xweb.util.XWebLog.addInitializeLog(r1, r3)     // Catch:{ all -> 0x00a6 }
            monitor-exit(r0)
            return r2
        L_0x003f:
            r4 = 0
            if (r3 >= 0) goto L_0x0044
            monitor-exit(r0)
            return r4
        L_0x0044:
            android.content.Context r5 = org.xwalk.core.XWalkEnvironment.getApplicationContext()     // Catch:{ all -> 0x00a6 }
            java.lang.String r6 = "activity"
            java.lang.Object r5 = r5.getSystemService(r6)     // Catch:{ all -> 0x00a6 }
            android.app.ActivityManager r5 = (android.app.ActivityManager) r5     // Catch:{ all -> 0x00a6 }
            if (r5 == 0) goto L_0x00a4
            java.util.List r6 = r5.getRunningAppProcesses()     // Catch:{ all -> 0x00a6 }
            if (r6 != 0) goto L_0x0059
            goto L_0x00a4
        L_0x0059:
            int r6 = android.os.Process.myUid()     // Catch:{ all -> 0x00a6 }
            java.util.List r5 = r5.getRunningAppProcesses()     // Catch:{ all -> 0x00a6 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x00a6 }
        L_0x0065:
            boolean r7 = r5.hasNext()     // Catch:{ all -> 0x00a6 }
            if (r7 == 0) goto L_0x0096
            java.lang.Object r7 = r5.next()     // Catch:{ all -> 0x00a6 }
            android.app.ActivityManager$RunningAppProcessInfo r7 = (android.app.ActivityManager.RunningAppProcessInfo) r7     // Catch:{ all -> 0x00a6 }
            int r8 = r7.pid     // Catch:{ all -> 0x00a6 }
            if (r8 != r3) goto L_0x0065
            int r5 = r7.uid     // Catch:{ all -> 0x00a6 }
            if (r5 != r6) goto L_0x0096
            java.lang.String r1 = "XWalkUpdateLocker"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a6 }
            r4.<init>()     // Catch:{ all -> 0x00a6 }
            java.lang.String r5 = "other process("
            r4.append(r5)     // Catch:{ all -> 0x00a6 }
            r4.append(r3)     // Catch:{ all -> 0x00a6 }
            java.lang.String r3 = ") is in updating progress"
            r4.append(r3)     // Catch:{ all -> 0x00a6 }
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x00a6 }
            com.tencent.xweb.util.XWebLog.addInitializeLog(r1, r3)     // Catch:{ all -> 0x00a6 }
            monitor-exit(r0)
            return r2
        L_0x0096:
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ all -> 0x00a6 }
            java.lang.String r2 = "UpdatingProcessId"
            r1.remove(r2)     // Catch:{ all -> 0x00a6 }
            r1.commit()     // Catch:{ all -> 0x00a6 }
            monitor-exit(r0)
            return r4
        L_0x00a4:
            monitor-exit(r0)
            return r4
        L_0x00a6:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.xweb.updater.XWalkUpdateLocker.isInUpdatingProgress():boolean");
    }

    public static synchronized boolean startUpdatingProgress() {
        synchronized (XWalkUpdateLocker.class) {
            if (isInUpdatingProgress()) {
                XWebLog.addInitializeLog(TAG, "already in updating progress");
                return false;
            }
            sIsUpdating = true;
            int myPid = Process.myPid();
            SharedPreferences.Editor edit = XWebSharedPreferenceUtil.getMMKVSharedPreferencesForUpdatingTag().edit();
            edit.putInt(SP_KEY_UpdatingProcessId, myPid);
            edit.putLong(SP_KEY_Start_Time, System.currentTimeMillis());
            edit.commit();
            XWebLog.addInitializeLog(TAG, "start updating progress");
            return true;
        }
    }
}
