package com.tencent.p014mm.sdk.platformtools;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.alibaba.android.patronus.Patrons;
import com.alibaba.android.patronus.util.Log;
import com.tencent.p014mm.app.C80589e;
import com.tencent.p014mm.app.C80611s0;
import com.tencent.p014mm.sdk.platformtools.MMUncaughtExceptionHandler;
import com.tencent.xweb.file.XVFSFile;
import java.io.File;
import java.io.FilenameFilter;
import java.util.concurrent.TimeUnit;
import zt3.C119157j;

/* renamed from: com.tencent.mm.sdk.platformtools.PatronsWrapper */
public class PatronsWrapper {
    private static final String DATA_DIR_NAME = "patrons";
    private static final String ENABLED_3G_STRATEY_MARK_FILE_NAME = "3g_strategy_enabled";
    private static final String ENABLED_MARK_FILE_NAME = "enabled";
    private static final String ENABLED_MARK_ONCE_FILE_NAME = "enabled_marked_once";
    private static final String FUSE_BROKEN_FILE_NAME_PREFIX = "fuse_broken_";
    private static final PeriodRecorder REPORT_FREQ_LIMIT = new PeriodRecorder("patrons_w", TimeUnit.HOURS.toMillis(24), true, true);
    private static final String TAG = "MicroMsg.PatronsWrapper";
    private static boolean sFuseInstalled = false;

    private static void clearFuseBrokenMarkAsync(final Context context) {
        if (isPreconditionsSatisfied(context)) {
            ((C119157j) C119157j.f356862d).mo183875f(new Runnable() {
                public void run() {
                    File[] listFiles;
                    File access$000 = PatronsWrapper.getDataStoreDir(context);
                    if (access$000 != null && access$000.exists() && (listFiles = access$000.listFiles(new FilenameFilter() {
                        public final String actualPrefix;

                        {
                            this.actualPrefix = PatronsWrapper.getMarkerFileName(context, PatronsWrapper.FUSE_BROKEN_FILE_NAME_PREFIX);
                        }

                        public boolean accept(File file, String str) {
                            return str.startsWith(this.actualPrefix);
                        }
                    })) != null) {
                        for (File file : listFiles) {
                            if (!file.getName().endsWith("_" + BuildInfo.CLIENT_VERSION_INT)) {
                                C80611s0.m98247e(PatronsWrapper.TAG, "Fuse broken marker %s was removed.", file.getName());
                                file.delete();
                            }
                        }
                    }
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public static File getDataStoreDir(Context context) {
        File dir = context.getDir(DATA_DIR_NAME, 0);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        return dir;
    }

    /* access modifiers changed from: private */
    public static String getMarkerFileName(Context context, String str) {
        String str2 = C80589e.f235762c;
        if (TextUtils.isEmpty(str2)) {
            str2 = Util.getProcessNameByPid(context, Process.myPid());
        }
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        return str2.replace('.', '_').replace(XVFSFile.PATH_SEPARATOR, "__") + "_" + str;
    }

    public static void installExceptionFuse() {
        if (!sFuseInstalled) {
            final Context context = MMApplicationContext.getContext();
            if (!isFuseBroken(context)) {
                clearFuseBrokenMarkAsync(context);
            }
            MMUncaughtExceptionHandler.addOnUncaughtExceptionListener(new MMUncaughtExceptionHandler.IOnUncaughtExceptionListener() {
                public void uncaughtException(MMUncaughtExceptionHandler mMUncaughtExceptionHandler, String str, Throwable th) {
                    if (th instanceof OutOfMemoryError) {
                        if (str == null || str.contains("failed due to fragmentation")) {
                            PatronsWrapper.markFuseBroken(context);
                        }
                    }
                }
            });
            sFuseInstalled = true;
        }
    }

    public static boolean isAggressiveStrategyEnabled(Context context) {
        if (!isPreconditionsSatisfied(context)) {
            return false;
        }
        String markerFileName = getMarkerFileName(context, ENABLED_3G_STRATEY_MARK_FILE_NAME);
        if (!TextUtils.isEmpty(markerFileName)) {
            return new File(getDataStoreDir(context), markerFileName).exists();
        }
        C80611s0.m98245c(TAG, "[-] Fail to get marker file name, treat as aggressive strategy disabled.", new Object[0]);
        return false;
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

    private static boolean isFuseBroken(Context context) {
        if (!isPreconditionsSatisfied(context)) {
            return false;
        }
        String markerFileName = getMarkerFileName(context, FUSE_BROKEN_FILE_NAME_PREFIX + BuildInfo.CLIENT_VERSION_INT);
        if (!TextUtils.isEmpty(markerFileName)) {
            return new File(getDataStoreDir(context), markerFileName).exists();
        }
        C80611s0.m98245c(TAG, "[-] Fail to get marker file name, treat as fuse not broken.", new Object[0]);
        return false;
    }

    private static boolean isPreconditionsSatisfied(Context context) {
        return !BuildInfo.IS_ARM64 && Build.VERSION.SDK_INT >= 26;
    }

    public static void markAggressiveStrategyDisabled(Context context) {
        try {
            if (isPreconditionsSatisfied(context)) {
                String markerFileName = getMarkerFileName(context, ENABLED_3G_STRATEY_MARK_FILE_NAME);
                if (TextUtils.isEmpty(markerFileName)) {
                    C80611s0.m98245c(TAG, "[-] Fail to get marker file name, skip marking aggressive strategy disabled.", new Object[0]);
                    return;
                }
                File file = new File(getDataStoreDir(context), markerFileName);
                if (file.exists()) {
                    if (!file.delete()) {
                        C80611s0.m98245c(TAG, "[-] Fail to mark aggressive strategy disabled.", new Object[0]);
                        return;
                    }
                }
                C80611s0.m98247e(TAG, "[+] Mark aggressive strategy disabled successfully.", new Object[0]);
            }
        } catch (Throwable th) {
            C80611s0.m98246d(TAG, th, "[-] Fail to mark aggressive strategy disabled.", new Object[0]);
        }
    }

    public static void markAggressiveStrategyEnabled(Context context) {
        try {
            if (isPreconditionsSatisfied(context)) {
                C80611s0.m98247e(TAG, "[+] markAggressiveStrategyEnabled called.", new Object[0]);
                String markerFileName = getMarkerFileName(context, ENABLED_3G_STRATEY_MARK_FILE_NAME);
                if (TextUtils.isEmpty(markerFileName)) {
                    C80611s0.m98245c(TAG, "[-] Fail to get marker file name, skip marking aggressive strategy enabled.", new Object[0]);
                    return;
                }
                File file = new File(getDataStoreDir(context), markerFileName);
                if (!file.exists()) {
                    if (!file.createNewFile()) {
                        C80611s0.m98245c(TAG, "[-] Fail to mark aggressive strategy enabled.", new Object[0]);
                        return;
                    }
                }
                C80611s0.m98247e(TAG, "[+] Mark aggressive strategy enabled successfully.", new Object[0]);
            }
        } catch (Throwable th) {
            C80611s0.m98246d(TAG, th, "[-] Fail to mark aggressive strategy enabled.", new Object[0]);
        }
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

    public static void markEnabled(Context context, boolean z) {
        try {
            if (isPreconditionsSatisfied(context)) {
                C80611s0.m98247e(TAG, "[+] markEnabled called.", new Object[0]);
                if (z) {
                    File file = new File(getDataStoreDir(context), getMarkerFileName(context, ENABLED_MARK_ONCE_FILE_NAME));
                    if (file.exists()) {
                        C80611s0.m98248f(TAG, "[!] Marked before, skip marking this time.", new Object[0]);
                        return;
                    }
                    file.createNewFile();
                }
                String markerFileName = getMarkerFileName(context, ENABLED_MARK_FILE_NAME);
                if (TextUtils.isEmpty(markerFileName)) {
                    C80611s0.m98245c(TAG, "[-] Fail to get marker file name, skip marking enabled.", new Object[0]);
                    return;
                }
                File file2 = new File(getDataStoreDir(context), markerFileName);
                if (!file2.exists()) {
                    if (!file2.createNewFile()) {
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

    /* access modifiers changed from: private */
    public static void markFuseBroken(Context context) {
        try {
            if (isPreconditionsSatisfied(context)) {
                C80611s0.m98247e(TAG, "[+] markFuseBroken called.", new Object[0]);
                String markerFileName = getMarkerFileName(context, FUSE_BROKEN_FILE_NAME_PREFIX + BuildInfo.CLIENT_VERSION_INT);
                if (TextUtils.isEmpty(markerFileName)) {
                    C80611s0.m98245c(TAG, "[-] Fail to get marker file name, skip marking fuse broken.", new Object[0]);
                    return;
                }
                File file = new File(getDataStoreDir(context), markerFileName);
                if (!file.exists()) {
                    if (!file.createNewFile()) {
                        C80611s0.m98245c(TAG, "[-] Fail to mark fuse broken.", new Object[0]);
                        return;
                    }
                }
                C80611s0.m98247e(TAG, "[+] Mark fuse broken successfully.", new Object[0]);
            }
        } catch (Throwable th) {
            C80611s0.m98246d(TAG, th, "[-] Fail to mark fuse broken.", new Object[0]);
        }
    }

    public static void tryToInstall(Context context) {
        boolean z = false;
        if (!isPreconditionsSatisfied(context)) {
            C80611s0.m98247e(TAG, "[+] Env condition is not satisfied, skip installation.", new Object[0]);
        } else if (!isEnabled(context)) {
            C80611s0.m98247e(TAG, "[+] Not enabled, skip installation.", new Object[0]);
        } else if (isFuseBroken(context)) {
            C80611s0.m98245c(TAG, "[-] Fuse was broken, skip installation.", new Object[0]);
        } else {
            try {
                Patrons.setLogger(new Log.ILogger() {
                    public void println(int i, String str, String str2) {
                        ((C80611s0.C80612a) C80611s0.f235836c).println(i, str, str2);
                    }
                });
                Patrons.PatronsConfig patronsConfig = new Patrons.PatronsConfig();
                if (isAggressiveStrategyEnabled(context) && Patrons.getCurrentMaxAvailableVMAddr() < 3221225472L) {
                    C80611s0.m98247e(TAG, "Use aggressive strategy for 3G VmSize.", new Object[0]);
                    if (MMApplicationContext.isAppBrandProcess()) {
                        patronsConfig.periodOfCheck = 10;
                        patronsConfig.periodOfShrink = 0.1f;
                        patronsConfig.lowerLimit = 96;
                        patronsConfig.shrinkStep = 64;
                    } else {
                        patronsConfig.periodOfCheck = 10;
                        patronsConfig.periodOfShrink = 0.2f;
                        patronsConfig.lowerLimit = 96;
                        patronsConfig.shrinkStep = 64;
                    }
                } else if (MMApplicationContext.isAppBrandProcess()) {
                    patronsConfig.periodOfCheck = 10;
                    patronsConfig.periodOfShrink = 0.1f;
                    patronsConfig.lowerLimit = 128;
                    patronsConfig.shrinkStep = 64;
                } else {
                    patronsConfig.periodOfShrink = 0.75f;
                }
                if (Patrons.init(context, patronsConfig) == 0) {
                    z = true;
                }
            } catch (Throwable th) {
                C80611s0.m98246d(TAG, th, "[-] install failed.", new Object[0]);
            }
            if (z) {
                if (REPORT_FREQ_LIMIT.isExpired("do_rpt")) {
                    StartupILogsReport.reportNumericValue(context, StartupILogsReport.TYPEID_PATRONS_STATUS, 1);
                    StartupILogsReport.reportNumericValue(context, StartupILogsReport.TYPEID_PATRONS_STATUS, 2);
                }
            } else if (REPORT_FREQ_LIMIT.isExpired("do_rpt")) {
                StartupILogsReport.reportNumericValue(context, StartupILogsReport.TYPEID_PATRONS_STATUS, 1);
                StartupILogsReport.reportNumericValue(context, StartupILogsReport.TYPEID_PATRONS_STATUS, 3);
            }
        }
    }
}
