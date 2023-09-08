package com.tencent.p014mm.sdk.platformtools;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.tencent.matrix.hook.C80379a;
import com.tencent.matrix.hook.HookManager;
import com.tencent.matrix.hook.memory.WVPreAllocHook;
import com.tencent.p014mm.app.C80589e;
import com.tencent.p014mm.app.C80611s0;
import com.tencent.xweb.file.XVFSFile;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;
import p206nj.C88957l;

/* renamed from: com.tencent.mm.sdk.platformtools.WVReservedSpaceShinkerWrapper */
public class WVReservedSpaceShinkerWrapper {
    private static final String DATA_DIR_NAME = "wv_reserved_space_shinker";
    private static final String ENABLED_MARK_FILE_NAME = "enabled";
    private static final PeriodRecorder REPORT_FREQ_LIMIT = new PeriodRecorder("wv_rss_rpt", TimeUnit.HOURS.toMillis(24), true, true);
    private static final String TAG = "MicroMsg.WVReservedSpaceShinkerWrapper";

    private static int getAndIncEnableCounter(Context context) {
        int i;
        DataOutputStream dataOutputStream;
        DataInputStream dataInputStream;
        String markerFileName = getMarkerFileName(context, ENABLED_MARK_FILE_NAME);
        if (TextUtils.isEmpty(markerFileName)) {
            C80611s0.m98245c(TAG, "[-] Fail to get marker file name, return -1 instead.", new Object[0]);
            return -1;
        }
        File file = new File(getDataStoreDir(context), markerFileName);
        if (!file.exists()) {
            C80611s0.m98245c(TAG, "[-] Not enabled, return -1 instead.", new Object[0]);
            return -1;
        }
        try {
            dataInputStream = new DataInputStream(new FileInputStream(file));
            i = dataInputStream.readInt();
            dataInputStream.close();
        } catch (Throwable th) {
            C80611s0.m98246d(TAG, th, "[-] Fail to read marker file, assigned lastCount to zero.", new Object[0]);
            i = 0;
        }
        try {
            dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            dataOutputStream.writeInt(i + 1);
            dataOutputStream.close();
            return i;
        } catch (Throwable th4) {
            C80611s0.m98246d(TAG, th4, "[-] Fail to update marker file, return -1 instead.", new Object[0]);
            return -1;
        }
        throw th;
        throw th;
    }

    private static File getDataStoreDir(Context context) {
        File dir = context.getDir(DATA_DIR_NAME, 0);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        return dir;
    }

    private static String getMarkerFileName(Context context, String str) {
        String str2 = C80589e.f235762c;
        if (TextUtils.isEmpty(str2)) {
            str2 = Util.getProcessNameByPid(context, Process.myPid());
        }
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        return str2.replace('.', '_').replace(XVFSFile.PATH_SEPARATOR, "__") + "_" + str;
    }

    public static boolean isEnabled(Context context) {
        if (!isPreconditionsSatisfied(context)) {
            return false;
        }
        String markerFileName = getMarkerFileName(context, ENABLED_MARK_FILE_NAME);
        if (!TextUtils.isEmpty(markerFileName)) {
            return new File(getDataStoreDir(context), markerFileName).exists();
        }
        C80611s0.m98245c(TAG, "[-] Fail to get marker file name, treat as disabled.", new Object[0]);
        return false;
    }

    private static boolean isPreconditionsSatisfied(Context context) {
        return !BuildInfo.IS_ARM64;
    }

    public static void markDisabled(Context context) {
        try {
            if (isPreconditionsSatisfied(context)) {
                String markerFileName = getMarkerFileName(context, ENABLED_MARK_FILE_NAME);
                if (TextUtils.isEmpty(markerFileName)) {
                    C80611s0.m98245c(TAG, "[-] Fail to get marker file name, skip marking disabled.", new Object[0]);
                    return;
                }
                File file = new File(getDataStoreDir(context), markerFileName);
                if (file.exists()) {
                    if (!file.delete()) {
                        C80611s0.m98245c(TAG, "[-] Fail to mark disabled.", new Object[0]);
                        return;
                    }
                }
                C80611s0.m98247e(TAG, "[+] Mark disabled successfully.", new Object[0]);
            }
        } catch (Throwable th) {
            C80611s0.m98246d(TAG, th, "[-] Fail to mark disabled.", new Object[0]);
        }
    }

    public static void markEnabled(Context context) {
        try {
            if (isPreconditionsSatisfied(context)) {
                C80611s0.m98247e(TAG, "[+] markEnabled called.", new Object[0]);
                String markerFileName = getMarkerFileName(context, ENABLED_MARK_FILE_NAME);
                if (TextUtils.isEmpty(markerFileName)) {
                    C80611s0.m98245c(TAG, "[-] Fail to get marker file name, skip marking enabled.", new Object[0]);
                    return;
                }
                File file = new File(getDataStoreDir(context), markerFileName);
                if (!file.exists()) {
                    if (!file.createNewFile()) {
                        C80611s0.m98245c(TAG, "[-] Fail to mark enabled.", new Object[0]);
                        return;
                    }
                }
                C80611s0.m98247e(TAG, "[+] Mark enabled successfully.", new Object[0]);
            }
        } catch (Throwable th) {
            C80611s0.m98246d(TAG, th, "[-] Fail to mark enabled.", new Object[0]);
        }
    }

    public static void markStartupFine(Context context) {
        resetEnableCounter(context);
    }

    private static void resetEnableCounter(Context context) {
        DataOutputStream dataOutputStream;
        String markerFileName = getMarkerFileName(context, ENABLED_MARK_FILE_NAME);
        if (TextUtils.isEmpty(markerFileName)) {
            C80611s0.m98245c(TAG, "[-] Fail to get marker file name, skip reset enable counter.", new Object[0]);
            return;
        }
        File file = new File(getDataStoreDir(context), markerFileName);
        if (!file.exists()) {
            C80611s0.m98245c(TAG, "[-] Not enabled, skip reset enable counter.", new Object[0]);
            return;
        }
        try {
            dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            dataOutputStream.writeInt(0);
            dataOutputStream.close();
            return;
        } catch (Throwable th) {
            C80611s0.m98246d(TAG, th, "[-] Fail to update marker file.", new Object[0]);
            return;
        }
        throw th;
    }

    public static void tryToInstall(Context context) {
        if (!isPreconditionsSatisfied(context)) {
            C80611s0.m98247e(TAG, "[+] Env condition is not satisfied, skip installation.", new Object[0]);
        } else if (!isEnabled(context)) {
            C80611s0.m98247e(TAG, "[+] Not enabled, skip installation.", new Object[0]);
        } else if (getAndIncEnableCounter(context) >= 3) {
            C80611s0.m98245c(TAG, "[-] Startup failure count was out of limit, mark disable and skip installation.", new Object[0]);
            markDisabled(context);
        } else {
            HookManager hookManager = HookManager.f235267e;
            hookManager.f235271d = new HookManager.C80378b() {
                public void loadLibrary(String str) {
                    C88957l.m111078n(str);
                }
            };
            try {
                WVPreAllocHook wVPreAllocHook = WVPreAllocHook.f235302b;
                hookManager.mo111829a(wVPreAllocHook);
                hookManager.mo111830b();
                if (wVPreAllocHook.f235272a == C80379a.C80380a.COMMIT_SUCCESS) {
                    C80611s0.m98247e(TAG, "[+] install successfully.", new Object[0]);
                    if (REPORT_FREQ_LIMIT.isExpired("do_rpt")) {
                        StartupILogsReport.reportNumericValue(context, StartupILogsReport.TYPEID_WV_RESERVED_SPACE_SHRINKER_STATUS, 1);
                        StartupILogsReport.reportNumericValue(context, StartupILogsReport.TYPEID_WV_RESERVED_SPACE_SHRINKER_STATUS, 2);
                        return;
                    }
                    return;
                }
                C80611s0.m98245c(TAG, "[-] install failed.", new Object[0]);
                if (REPORT_FREQ_LIMIT.isExpired("do_rpt")) {
                    StartupILogsReport.reportNumericValue(context, StartupILogsReport.TYPEID_WV_RESERVED_SPACE_SHRINKER_STATUS, 1);
                    StartupILogsReport.reportNumericValue(context, StartupILogsReport.TYPEID_WV_RESERVED_SPACE_SHRINKER_STATUS, 3);
                }
            } catch (Throwable th) {
                C80611s0.m98246d(TAG, th, "[-] install failed.", new Object[0]);
                if (REPORT_FREQ_LIMIT.isExpired("do_rpt")) {
                    StartupILogsReport.reportNumericValue(context, StartupILogsReport.TYPEID_WV_RESERVED_SPACE_SHRINKER_STATUS, 1);
                    StartupILogsReport.reportNumericValue(context, StartupILogsReport.TYPEID_WV_RESERVED_SPACE_SHRINKER_STATUS, 3);
                }
            }
        }
    }
}
