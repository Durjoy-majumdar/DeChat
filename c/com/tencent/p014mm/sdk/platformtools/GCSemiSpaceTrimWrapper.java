package com.tencent.p014mm.sdk.platformtools;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import com.tencent.matrix.hook.HookManager;
import com.tencent.matrix.hook.memory.GCSemiSpaceTrimmer;
import com.tencent.p014mm.app.C80589e;
import com.tencent.p014mm.app.C80611s0;
import com.tencent.xweb.file.XVFSFile;
import java.io.File;
import java.util.concurrent.TimeUnit;
import p206nj.C88957l;

/* renamed from: com.tencent.mm.sdk.platformtools.GCSemiSpaceTrimWrapper */
public class GCSemiSpaceTrimWrapper {
    private static final String DATA_DIR_NAME = "gc_ss_trim";
    private static final String ENABLED_MARK_FILE_NAME = "enabled";
    private static final String ENABLED_MARK_ONCE_FILE_NAME = "enabled_marked_once";
    private static final PeriodRecorder REPORT_FREQ_LIMIT = new PeriodRecorder("gc_sst_w", TimeUnit.HOURS.toMillis(24), true, true);
    private static final String TAG = "MicroMsg.GCSemiSpaceTrimWrapper";

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
        return !BuildInfo.IS_ARM64 && Build.VERSION.SDK_INT < 26;
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

    public static void tryToInstall(Context context) {
        boolean z = false;
        if (!isPreconditionsSatisfied(context)) {
            C80611s0.m98247e(TAG, "[+] Env condition is not satisfied, skip installation.", new Object[0]);
        } else if (!isEnabled(context)) {
            C80611s0.m98247e(TAG, "[+] Not enabled, skip installation.", new Object[0]);
        } else {
            try {
                GCSemiSpaceTrimmer gCSemiSpaceTrimmer = GCSemiSpaceTrimmer.f235282h;
                gCSemiSpaceTrimmer.f235285a = new HookManager.C80378b() {
                    public void loadLibrary(String str) {
                        C88957l.m111078n(str);
                    }
                };
                z = gCSemiSpaceTrimmer.mo111839c(0.7f, TimeUnit.SECONDS.toMillis(30), (Looper) null);
            } catch (Throwable th) {
                C80611s0.m98246d(TAG, th, "[-] install failed.", new Object[0]);
            }
            if (!z || !GCSemiSpaceTrimmer.f235282h.mo111840d()) {
                if (REPORT_FREQ_LIMIT.isExpired("do_rpt")) {
                    StartupILogsReport.reportNumericValue(context, StartupILogsReport.TYPEID_GC_SEMISPACE_TRIM_STATUS, 1);
                    StartupILogsReport.reportNumericValue(context, StartupILogsReport.TYPEID_GC_SEMISPACE_TRIM_STATUS, 3);
                }
            } else if (REPORT_FREQ_LIMIT.isExpired("do_rpt")) {
                StartupILogsReport.reportNumericValue(context, StartupILogsReport.TYPEID_GC_SEMISPACE_TRIM_STATUS, 1);
                StartupILogsReport.reportNumericValue(context, StartupILogsReport.TYPEID_GC_SEMISPACE_TRIM_STATUS, 2);
            }
        }
    }
}
