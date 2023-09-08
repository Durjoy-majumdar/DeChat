package com.tencent.tinker.loader.shareutil;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Process;
import com.tencent.tinker.loader.TinkerRuntimeException;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class ShareTinkerInternals {
    private static final String PATCH_PROCESS_NAME = ":patch";
    private static final String SAFEMODE_COUNT_REC_PREFIX = "safemode_count_rec_";
    private static final String TAG = "Tinker.TinkerInternals";
    private static final boolean VM_IS_ART = isVmArt(System.getProperty("java.vm.version"));
    private static final boolean VM_IS_JIT = isVmJitInternal();
    private static String currentInstructionSet = null;
    private static Boolean isARKHotRunning = null;
    private static Boolean isPatchProcess = null;
    private static final String[] processName = {null};
    private static String tinkerID = null;

    public static ShareDexDiffPatchInfo changeTestDexToClassN(ShareDexDiffPatchInfo shareDexDiffPatchInfo, int i) {
        String str;
        if (!shareDexDiffPatchInfo.rawName.startsWith(ShareConstants.TEST_DEX_NAME)) {
            return null;
        }
        if (i != 1) {
            str = "classes" + i + ShareConstants.DEX_SUFFIX;
        } else {
            str = "classes.dex";
        }
        return new ShareDexDiffPatchInfo(str, shareDexDiffPatchInfo.path, shareDexDiffPatchInfo.destMd5InDvm, shareDexDiffPatchInfo.destMd5InArt, shareDexDiffPatchInfo.dexDiffMd5, shareDexDiffPatchInfo.oldDexCrC, shareDexDiffPatchInfo.newOrPatchedDexCrC, shareDexDiffPatchInfo.dexMode);
    }

    public static int checkPackageAndTinkerFlag(ShareSecurityCheck shareSecurityCheck, int i) {
        if (isTinkerEnabledAll(i)) {
            return 0;
        }
        HashMap<String, String> metaContentMap = shareSecurityCheck.getMetaContentMap();
        if (!isTinkerEnabledForDex(i) && metaContentMap.containsKey(ShareConstants.DEX_META_FILE)) {
            return -9;
        }
        if (isTinkerEnabledForNativeLib(i) || !metaContentMap.containsKey("assets/so_meta.txt")) {
            return (isTinkerEnabledForResource(i) || !metaContentMap.containsKey("assets/res_meta.txt")) ? 0 : -9;
        }
        return -9;
    }

    public static int checkSignatureAndTinkerID(Context context, File file, ShareSecurityCheck shareSecurityCheck) {
        if (!shareSecurityCheck.verifyPatchMetaSignature(file)) {
            return -1;
        }
        String manifestTinkerID = getManifestTinkerID(context);
        if (manifestTinkerID == null) {
            return -5;
        }
        HashMap<String, String> packagePropertiesIfPresent = shareSecurityCheck.getPackagePropertiesIfPresent();
        if (packagePropertiesIfPresent == null) {
            return -2;
        }
        String str = packagePropertiesIfPresent.get(ShareConstants.TINKER_ID);
        if (str == null) {
            return -6;
        }
        if (manifestTinkerID.equals(str)) {
            return 0;
        }
        ShareTinkerLog.m106531e(TAG, "tinkerId in patch is not matched with the one in base pack, base: %s, patch: %s.", manifestTinkerID, str);
        return -7;
    }

    public static int checkTinkerPackage(Context context, int i, File file, ShareSecurityCheck shareSecurityCheck) {
        int checkSignatureAndTinkerID = checkSignatureAndTinkerID(context, file, shareSecurityCheck);
        return checkSignatureAndTinkerID == 0 ? checkPackageAndTinkerFlag(shareSecurityCheck, i) : checkSignatureAndTinkerID;
    }

    public static void cleanPatch(Context context) {
        if (context != null) {
            File patchDirectory = SharePatchFileUtil.getPatchDirectory(context);
            if (!patchDirectory.exists()) {
                ShareTinkerLog.printErrStackTrace(TAG, new Throwable(), "try to clean patch while there're not any applied patches.", new Object[0]);
                return;
            }
            File patchInfoFile = SharePatchFileUtil.getPatchInfoFile(patchDirectory.getAbsolutePath());
            if (!patchInfoFile.exists()) {
                ShareTinkerLog.printErrStackTrace(TAG, new Throwable(), "try to clean patch while patch info file does not exist.", new Object[0]);
                return;
            }
            File patchInfoLockFile = SharePatchFileUtil.getPatchInfoLockFile(patchDirectory.getAbsolutePath());
            SharePatchInfo readAndCheckPropertyWithLock = SharePatchInfo.readAndCheckPropertyWithLock(patchInfoFile, patchInfoLockFile);
            if (readAndCheckPropertyWithLock != null) {
                if (!readAndCheckPropertyWithLock.newVersion.equals(readAndCheckPropertyWithLock.oldVersion)) {
                    SharePatchFileUtil.deleteDir(new File(patchDirectory, SharePatchFileUtil.getPatchVersionDirectory(readAndCheckPropertyWithLock.newVersion)));
                    readAndCheckPropertyWithLock.newVersion = readAndCheckPropertyWithLock.oldVersion;
                    readAndCheckPropertyWithLock.versionToRemove = "";
                } else {
                    readAndCheckPropertyWithLock.versionToRemove = readAndCheckPropertyWithLock.newVersion;
                }
                SharePatchInfo.rewritePatchInfoFileWithLock(patchInfoFile, readAndCheckPropertyWithLock, patchInfoLockFile);
                return;
            }
            ShareTinkerLog.printErrStackTrace(TAG, new Throwable(), "fail to get patchInfo.", new Object[0]);
            return;
        }
        throw new TinkerRuntimeException("context is null");
    }

    public static Properties fastGetPatchPackageMeta(File file) {
        ZipFile zipFile;
        InputStream inputStream;
        ZipFile zipFile2 = null;
        if (file == null || !file.isFile() || file.length() == 0) {
            ShareTinkerLog.m106531e(TAG, "patchFile is illegal", new Object[0]);
            return null;
        }
        try {
            zipFile = new ZipFile(file);
            try {
                ZipEntry entry = zipFile.getEntry(ShareConstants.PACKAGE_META_FILE);
                if (entry == null) {
                    ShareTinkerLog.m106531e(TAG, "patch meta entry not found", new Object[0]);
                    SharePatchFileUtil.closeZip(zipFile);
                    return null;
                }
                try {
                    inputStream = zipFile.getInputStream(entry);
                    try {
                        Properties properties = new Properties();
                        properties.load(inputStream);
                        SharePatchFileUtil.closeQuietly(inputStream);
                        SharePatchFileUtil.closeZip(zipFile);
                        return properties;
                    } catch (Throwable th) {
                        th = th;
                        SharePatchFileUtil.closeQuietly(inputStream);
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    inputStream = null;
                    SharePatchFileUtil.closeQuietly(inputStream);
                    throw th;
                }
            } catch (IOException e) {
                e = e;
                try {
                    ShareTinkerLog.m106531e(TAG, "fastGetPatchPackageMeta exception:" + e.getMessage(), new Object[0]);
                    SharePatchFileUtil.closeZip(zipFile);
                    return null;
                } catch (Throwable th5) {
                    th = th5;
                    zipFile2 = zipFile;
                    SharePatchFileUtil.closeZip(zipFile2);
                    throw th;
                }
            }
        } catch (IOException e2) {
            e = e2;
            zipFile = null;
            ShareTinkerLog.m106531e(TAG, "fastGetPatchPackageMeta exception:" + e.getMessage(), new Object[0]);
            SharePatchFileUtil.closeZip(zipFile);
            return null;
        } catch (Throwable th6) {
            th = th6;
            SharePatchFileUtil.closeZip(zipFile2);
            throw th;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0076, code lost:
        if (r2.equals("x86_64") == false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getCurrentInstructionSet() {
        /*
            java.lang.String r0 = currentInstructionSet
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            r0 = 1
            r1 = 0
            java.lang.String r2 = "dalvik.system.VMRuntime"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x0025 }
            java.lang.String r3 = "getCurrentInstructionSet"
            java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch:{ all -> 0x0025 }
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r4)     // Catch:{ all -> 0x0025 }
            r2.setAccessible(r0)     // Catch:{ all -> 0x0025 }
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ all -> 0x0025 }
            java.lang.Object r2 = r2.invoke(r3, r4)     // Catch:{ all -> 0x0025 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0025 }
            currentInstructionSet = r2     // Catch:{ all -> 0x0025 }
            goto L_0x00b0
        L_0x0025:
            java.lang.String r2 = android.os.Build.CPU_ABI
            r2.getClass()
            r3 = -1
            int r4 = r2.hashCode()
            java.lang.String r5 = "mips"
            java.lang.String r6 = "x86"
            java.lang.String r7 = "x86_64"
            java.lang.String r8 = "mips64"
            switch(r4) {
                case -1073971299: goto L_0x0079;
                case -806050265: goto L_0x0072;
                case -738963905: goto L_0x0067;
                case 117110: goto L_0x005e;
                case 3351711: goto L_0x0055;
                case 145444210: goto L_0x004a;
                case 1431565292: goto L_0x003f;
                default: goto L_0x003d;
            }
        L_0x003d:
            r0 = -1
            goto L_0x0081
        L_0x003f:
            java.lang.String r0 = "arm64-v8a"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0048
            goto L_0x003d
        L_0x0048:
            r0 = 6
            goto L_0x0081
        L_0x004a:
            java.lang.String r0 = "armeabi-v7a"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0053
            goto L_0x003d
        L_0x0053:
            r0 = 5
            goto L_0x0081
        L_0x0055:
            boolean r0 = r2.equals(r5)
            if (r0 != 0) goto L_0x005c
            goto L_0x003d
        L_0x005c:
            r0 = 4
            goto L_0x0081
        L_0x005e:
            boolean r0 = r2.equals(r6)
            if (r0 != 0) goto L_0x0065
            goto L_0x003d
        L_0x0065:
            r0 = 3
            goto L_0x0081
        L_0x0067:
            java.lang.String r0 = "armeabi"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0070
            goto L_0x003d
        L_0x0070:
            r0 = 2
            goto L_0x0081
        L_0x0072:
            boolean r4 = r2.equals(r7)
            if (r4 != 0) goto L_0x0081
            goto L_0x003d
        L_0x0079:
            boolean r0 = r2.equals(r8)
            if (r0 != 0) goto L_0x0080
            goto L_0x003d
        L_0x0080:
            r0 = 0
        L_0x0081:
            switch(r0) {
                case 0: goto L_0x00ae;
                case 1: goto L_0x00ab;
                case 2: goto L_0x00a6;
                case 3: goto L_0x00a3;
                case 4: goto L_0x00a0;
                case 5: goto L_0x00a6;
                case 6: goto L_0x009b;
                default: goto L_0x0084;
            }
        L_0x0084:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Unsupported abi: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x009b:
            java.lang.String r0 = "arm64"
            currentInstructionSet = r0
            goto L_0x00b0
        L_0x00a0:
            currentInstructionSet = r5
            goto L_0x00b0
        L_0x00a3:
            currentInstructionSet = r6
            goto L_0x00b0
        L_0x00a6:
            java.lang.String r0 = "arm"
            currentInstructionSet = r0
            goto L_0x00b0
        L_0x00ab:
            currentInstructionSet = r7
            goto L_0x00b0
        L_0x00ae:
            currentInstructionSet = r8
        L_0x00b0:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "getCurrentInstructionSet:"
            r0.append(r2)
            java.lang.String r2 = currentInstructionSet
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Tinker.TinkerInternals"
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106530d(r2, r0, r1)
            java.lang.String r0 = currentInstructionSet
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tinker.loader.shareutil.ShareTinkerInternals.getCurrentInstructionSet():java.lang.String");
    }

    public static String getCurrentOatMode(Context context, String str) {
        return str.equals(ShareConstants.CHANING_DEX_OPTIMIZE_PATH) ? isInMainProcess(context) ? "odex" : ShareConstants.INTERPRET_DEX_OPTIMIZE_PATH : str;
    }

    public static String getExceptionCauseString(Throwable th) {
        if (th == null) {
            return "";
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        while (true) {
            try {
                Throwable cause = th.getCause();
                if (cause == null) {
                    th.printStackTrace(printStream);
                    return toVisualString(byteArrayOutputStream.toString());
                }
                th = cause;
            } finally {
                SharePatchFileUtil.closeQuietly(printStream);
            }
        }
    }

    public static String getManifestTinkerID(Context context) {
        String str = tinkerID;
        if (str != null) {
            return str;
        }
        try {
            Object obj = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.get(ShareConstants.TINKER_ID);
            if (obj != null) {
                tinkerID = String.valueOf(obj);
            } else {
                tinkerID = null;
            }
            return tinkerID;
        } catch (Exception e) {
            ShareTinkerLog.m106531e(TAG, "getManifestTinkerID exception:" + e.getMessage(), new Object[0]);
            return null;
        }
    }

    public static String getProcessName(Context context) {
        String[] strArr = processName;
        if (strArr[0] == null) {
            synchronized (strArr) {
                if (strArr[0] == null) {
                    strArr[0] = getProcessNameInternal(context);
                }
            }
        }
        String str = strArr[0];
        return str != null ? str : "";
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a9 A[SYNTHETIC, Splitter:B:32:0x00a9] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getProcessNameInternal(android.content.Context r7) {
        /*
            r0 = 28
            r1 = 1
            boolean r0 = isNewerOrEqualThanVersion(r0, r1)
            if (r0 == 0) goto L_0x0014
            java.lang.String r0 = android.app.Application.getProcessName()
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x0014
            return r0
        L_0x0014:
            r0 = 18
            boolean r0 = isNewerOrEqualThanVersion(r0, r1)
            java.lang.String r2 = "Tinker.TinkerInternals"
            r3 = 0
            r4 = 0
            if (r0 == 0) goto L_0x005d
            java.lang.String r0 = "android.app.ActivityThread"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x0042 }
            java.lang.String r5 = "currentProcessName"
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ all -> 0x0042 }
            java.lang.reflect.Method r0 = com.tencent.tinker.loader.shareutil.ShareReflectUtil.findMethod((java.lang.Class<?>) r0, (java.lang.String) r5, (java.lang.Class<?>[]) r6)     // Catch:{ all -> 0x0042 }
            r0.setAccessible(r1)     // Catch:{ all -> 0x0042 }
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ all -> 0x0042 }
            java.lang.Object r0 = r0.invoke(r3, r1)     // Catch:{ all -> 0x0042 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x005d
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x0042 }
            if (r1 != 0) goto L_0x005d
            return r0
        L_0x0042:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "getProcessNameInternal reflect activity thread exception:"
            r1.append(r5)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.Object[] r1 = new java.lang.Object[r4]
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106531e(r2, r0, r1)
        L_0x005d:
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ all -> 0x008a }
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ all -> 0x008a }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ all -> 0x008a }
            java.lang.String r6 = "/proc/self/cmdline"
            r5.<init>(r6)     // Catch:{ all -> 0x008a }
            java.nio.charset.Charset r6 = java.nio.charset.StandardCharsets.US_ASCII     // Catch:{ all -> 0x008a }
            r1.<init>(r5, r6)     // Catch:{ all -> 0x008a }
            r0.<init>(r1)     // Catch:{ all -> 0x008a }
            java.lang.String r1 = r0.readLine()     // Catch:{ all -> 0x0088 }
            if (r1 == 0) goto L_0x0084
            java.lang.String r1 = r1.trim()     // Catch:{ all -> 0x0088 }
            boolean r5 = r1.isEmpty()     // Catch:{ all -> 0x0088 }
            if (r5 != 0) goto L_0x0084
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeQuietly(r0)
            return r1
        L_0x0084:
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeQuietly(r0)
            goto L_0x00a7
        L_0x0088:
            r1 = move-exception
            goto L_0x008c
        L_0x008a:
            r1 = move-exception
            r0 = r3
        L_0x008c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f8 }
            r5.<init>()     // Catch:{ all -> 0x00f8 }
            java.lang.String r6 = "getProcessNameInternal parse cmdline exception:"
            r5.append(r6)     // Catch:{ all -> 0x00f8 }
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x00f8 }
            r5.append(r1)     // Catch:{ all -> 0x00f8 }
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x00f8 }
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x00f8 }
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106531e(r2, r1, r5)     // Catch:{ all -> 0x00f8 }
            goto L_0x0084
        L_0x00a7:
            if (r7 == 0) goto L_0x00f7
            int r0 = android.os.Process.myPid()     // Catch:{ all -> 0x00dc }
            int r1 = android.os.Process.myUid()     // Catch:{ all -> 0x00dc }
            java.lang.String r5 = "activity"
            java.lang.Object r7 = r7.getSystemService(r5)     // Catch:{ all -> 0x00dc }
            android.app.ActivityManager r7 = (android.app.ActivityManager) r7     // Catch:{ all -> 0x00dc }
            if (r7 == 0) goto L_0x00f7
            java.util.List r7 = r7.getRunningAppProcesses()     // Catch:{ all -> 0x00dc }
            if (r7 == 0) goto L_0x00f7
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x00dc }
        L_0x00c5:
            boolean r5 = r7.hasNext()     // Catch:{ all -> 0x00dc }
            if (r5 == 0) goto L_0x00f7
            java.lang.Object r5 = r7.next()     // Catch:{ all -> 0x00dc }
            android.app.ActivityManager$RunningAppProcessInfo r5 = (android.app.ActivityManager.RunningAppProcessInfo) r5     // Catch:{ all -> 0x00dc }
            int r6 = r5.pid     // Catch:{ all -> 0x00dc }
            if (r6 != r0) goto L_0x00c5
            int r6 = r5.uid     // Catch:{ all -> 0x00dc }
            if (r6 != r1) goto L_0x00c5
            java.lang.String r7 = r5.processName     // Catch:{ all -> 0x00dc }
            return r7
        L_0x00dc:
            r7 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "getProcessNameInternal getRunningAppProcesses exception:"
            r0.append(r1)
            java.lang.String r7 = r7.getMessage()
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.Object[] r0 = new java.lang.Object[r4]
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106531e(r2, r7, r0)
        L_0x00f7:
            return r3
        L_0x00f8:
            r7 = move-exception
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeQuietly(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tinker.loader.shareutil.ShareTinkerInternals.getProcessNameInternal(android.content.Context):java.lang.String");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:14|13|15|16|17|18) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0080, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0081, code lost:
        com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeQuietly(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0084, code lost:
        throw r8;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0061 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int getSafeModeCount(android.content.Context r8) {
        /*
            java.lang.String r0 = "safe_mode_count_1.9.14.25.2"
            java.lang.String r1 = "Tinker.TinkerInternals"
            java.lang.String r2 = getProcessName(r8)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "safemode_count_rec_"
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.io.File r3 = new java.io.File
            java.io.File r8 = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.getPatchDirectory(r8)
            r3.<init>(r8, r2)
            r8 = 0
            r4 = 0
            java.io.DataInputStream r5 = new java.io.DataInputStream     // Catch:{ all -> 0x0061 }
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ all -> 0x0061 }
            r6.<init>(r3)     // Catch:{ all -> 0x0061 }
            r5.<init>(r6)     // Catch:{ all -> 0x0061 }
            java.lang.String r3 = r5.readUTF()     // Catch:{ all -> 0x0060 }
            boolean r4 = r0.equals(r3)     // Catch:{ all -> 0x0060 }
            r6 = 1
            if (r4 != 0) goto L_0x004b
            java.lang.String r4 = "getSafeModeCount: key is not equal, expt: %s, actul: %s, return 0 instead."
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x0060 }
            r7[r8] = r0     // Catch:{ all -> 0x0060 }
            r7[r6] = r3     // Catch:{ all -> 0x0060 }
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w(r1, r4, r7)     // Catch:{ all -> 0x0060 }
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeQuietly(r5)
            return r8
        L_0x004b:
            int r0 = r5.readInt()     // Catch:{ all -> 0x0060 }
            java.lang.String r3 = "getSafeModeCount: count: %s"
            java.lang.Object[] r4 = new java.lang.Object[r6]     // Catch:{ all -> 0x0060 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0060 }
            r4[r8] = r6     // Catch:{ all -> 0x0060 }
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106532i(r1, r3, r4)     // Catch:{ all -> 0x0060 }
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeQuietly(r5)
            return r0
        L_0x0060:
            r4 = r5
        L_0x0061:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0080 }
            r0.<init>()     // Catch:{ all -> 0x0080 }
            java.lang.String r3 = "getSafeModeCount: recFileName:"
            r0.append(r3)     // Catch:{ all -> 0x0080 }
            r0.append(r2)     // Catch:{ all -> 0x0080 }
            java.lang.String r2 = " failed, return 0 instead."
            r0.append(r2)     // Catch:{ all -> 0x0080 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0080 }
            java.lang.Object[] r2 = new java.lang.Object[r8]     // Catch:{ all -> 0x0080 }
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w(r1, r0, r2)     // Catch:{ all -> 0x0080 }
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeQuietly(r4)
            return r8
        L_0x0080:
            r8 = move-exception
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeQuietly(r4)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tinker.loader.shareutil.ShareTinkerInternals.getSafeModeCount(android.content.Context):int");
    }

    private static String getTinkerSwitchSPKey(Context context) {
        String manifestTinkerID = getManifestTinkerID(context);
        if (isNullOrNil(manifestTinkerID)) {
            manifestTinkerID = "@@";
        }
        return "tinker_enable_1.9.14.25.2_" + manifestTinkerID;
    }

    public static String getTypeString(int i) {
        switch (i) {
            case 1:
                return "patch_file";
            case 2:
                return "patch_info";
            case 3:
                return "dex";
            case 4:
                return "dex_opt";
            case 5:
                return "lib";
            case 6:
                return "resource";
            default:
                return "unknown";
        }
    }

    public static boolean is32BitEnv() {
        String currentInstructionSet2 = getCurrentInstructionSet();
        return "arm".equals(currentInstructionSet2) || "x86".equals(currentInstructionSet2) || "mips".equals(currentInstructionSet2);
    }

    public static boolean isAfterAndroidO() {
        return Build.VERSION.SDK_INT > 25;
    }

    public static boolean isArkHotRuning() {
        Boolean bool = isARKHotRunning;
        if (bool != null) {
            return bool.booleanValue();
        }
        isARKHotRunning = Boolean.FALSE;
        try {
            Method declaredMethod = ClassLoader.getSystemClassLoader().getParent().loadClass("com.huawei.ark.app.ArkApplicationInfo").getDeclaredMethod("isRunningInArk", new Class[0]);
            declaredMethod.setAccessible(true);
            isARKHotRunning = (Boolean) declaredMethod.invoke((Object) null, new Object[0]);
        } catch (ClassNotFoundException unused) {
            ShareTinkerLog.m106532i(TAG, "class not found exception", new Object[0]);
        } catch (NoSuchMethodException unused2) {
            ShareTinkerLog.m106532i(TAG, "no such method exception", new Object[0]);
        } catch (SecurityException unused3) {
            ShareTinkerLog.m106532i(TAG, "security exception", new Object[0]);
        } catch (IllegalAccessException unused4) {
            ShareTinkerLog.m106532i(TAG, "illegal access exception", new Object[0]);
        } catch (InvocationTargetException unused5) {
            ShareTinkerLog.m106532i(TAG, "invocation target exception", new Object[0]);
        } catch (IllegalArgumentException unused6) {
            ShareTinkerLog.m106532i(TAG, "illegal argument exception", new Object[0]);
        }
        return isARKHotRunning.booleanValue();
    }

    public static boolean isInMainProcess(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String str = applicationInfo != null ? applicationInfo.processName : null;
        if (isNullOrNil(str)) {
            str = context.getPackageName();
        }
        String processName2 = getProcessName(context);
        if (processName2 == null || processName2.length() == 0) {
            processName2 = "";
        }
        return str.equals(processName2);
    }

    public static boolean isInPatchProcess(Context context) {
        Boolean bool = isPatchProcess;
        if (bool != null) {
            return bool.booleanValue();
        }
        Boolean valueOf = Boolean.valueOf(getProcessName(context).endsWith(PATCH_PROCESS_NAME));
        isPatchProcess = valueOf;
        return valueOf.booleanValue();
    }

    public static boolean isNewerOrEqualThanVersion(int i, boolean z) {
        int i2;
        return (!z || (i2 = Build.VERSION.SDK_INT) < 23) ? Build.VERSION.SDK_INT >= i : i2 >= i || (i2 == i - 1 && Build.VERSION.PREVIEW_SDK_INT > 0);
    }

    public static boolean isNullOrNil(String str) {
        return str == null || str.length() <= 0;
    }

    public static boolean isOlderOrEqualThanVersion(int i, boolean z) {
        int i2;
        return (!z || (i2 = Build.VERSION.SDK_INT) < 23) ? Build.VERSION.SDK_INT <= i : i2 <= i || (i2 == i - 1 && Build.VERSION.PREVIEW_SDK_INT > 0);
    }

    public static boolean isSystemOTA(String str) {
        String str2 = Build.FINGERPRINT;
        if (str == null || str.equals("") || str2 == null || str2.equals("")) {
            ShareTinkerLog.m106530d(TAG, "fingerprint empty:" + str + ",current:" + str2, new Object[0]);
            return false;
        } else if (str.equals(str2)) {
            ShareTinkerLog.m106530d(TAG, "same fingerprint:" + str2, new Object[0]);
            return false;
        } else {
            ShareTinkerLog.m106530d(TAG, "system OTA,fingerprint not equal:" + str + "," + str2, new Object[0]);
            return true;
        }
    }

    public static boolean isTinkerEnableWithSharedPreferences(Context context) {
        if (context == null) {
            return false;
        }
        return context.getSharedPreferences(ShareConstants.TINKER_SHARE_PREFERENCE_CONFIG, 4).getBoolean(getTinkerSwitchSPKey(context), true);
    }

    public static boolean isTinkerEnabled(int i) {
        return i != 0;
    }

    public static boolean isTinkerEnabledAll(int i) {
        return i == 15;
    }

    public static boolean isTinkerEnabledForArkHot(int i) {
        return (i & 8) != 0;
    }

    public static boolean isTinkerEnabledForDex(int i) {
        return (i & 1) != 0;
    }

    public static boolean isTinkerEnabledForNativeLib(int i) {
        return (i & 2) != 0;
    }

    public static boolean isTinkerEnabledForResource(int i) {
        return (i & 4) != 0;
    }

    public static boolean isVersionInRange(int i, int i2, boolean z) {
        return isNewerOrEqualThanVersion(i, z) && isOlderOrEqualThanVersion(i2, z);
    }

    public static boolean isVmArt() {
        boolean z = VM_IS_ART;
        return true;
    }

    public static boolean isVmJit() {
        return VM_IS_JIT && Build.VERSION.SDK_INT < 24;
    }

    private static boolean isVmJitInternal() {
        try {
            Method declaredMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", new Class[]{String.class});
            String str = (String) declaredMethod.invoke((Object) null, new Object[]{"dalvik.vm.usejit"});
            return !isNullOrNil(str) && isNullOrNil((String) declaredMethod.invoke((Object) null, new Object[]{"dalvik.vm.usejitprofiles"})) && str.equals("true");
        } catch (Throwable th) {
            ShareTinkerLog.m106531e(TAG, "isVmJitInternal ex:" + th, new Object[0]);
        }
    }

    public static void killAllOtherProcess(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ActivityManager activityManager = (ActivityManager) context.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
            for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                if (next.uid == Process.myUid() && next.pid != Process.myPid()) {
                    Process.killProcess(next.pid);
                }
            }
        }
    }

    public static void killProcessExceptMain(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ActivityManager activityManager = (ActivityManager) context.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
            for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                if (next.uid == Process.myUid() && !next.processName.equals(context.getPackageName())) {
                    Process.killProcess(next.pid);
                }
            }
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0057 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void setSafeModeCount(android.content.Context r6, int r7) {
        /*
            java.lang.String r0 = "Tinker.TinkerInternals"
            java.lang.String r1 = getProcessName(r6)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "safemode_count_rec_"
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.io.File r2 = new java.io.File
            java.io.File r6 = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.getPatchDirectory(r6)
            r2.<init>(r6, r1)
            boolean r6 = r2.exists()
            if (r6 != 0) goto L_0x002e
            java.io.File r6 = r2.getParentFile()
            r6.mkdirs()
        L_0x002e:
            r6 = 0
            r3 = 0
            java.io.DataOutputStream r4 = new java.io.DataOutputStream     // Catch:{ all -> 0x0057 }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ all -> 0x0057 }
            r5.<init>(r2)     // Catch:{ all -> 0x0057 }
            r4.<init>(r5)     // Catch:{ all -> 0x0057 }
            java.lang.String r6 = "safe_mode_count_1.9.14.25.2"
            r4.writeUTF(r6)     // Catch:{ all -> 0x0056 }
            r4.writeInt(r7)     // Catch:{ all -> 0x0056 }
            java.lang.String r6 = "setSafeModeCount: count: %s"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0056 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0056 }
            r2[r3] = r7     // Catch:{ all -> 0x0056 }
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106532i(r0, r6, r2)     // Catch:{ all -> 0x0056 }
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeQuietly(r4)
            goto L_0x0076
        L_0x0056:
            r6 = r4
        L_0x0057:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0077 }
            r7.<init>()     // Catch:{ all -> 0x0077 }
            java.lang.String r2 = "setSafeModeCount: recFileName:"
            r7.append(r2)     // Catch:{ all -> 0x0077 }
            r7.append(r1)     // Catch:{ all -> 0x0077 }
            java.lang.String r1 = " failed, return 0 instead."
            r7.append(r1)     // Catch:{ all -> 0x0077 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0077 }
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch:{ all -> 0x0077 }
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w(r0, r7, r1)     // Catch:{ all -> 0x0077 }
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeQuietly(r6)
        L_0x0076:
            return
        L_0x0077:
            r7 = move-exception
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeQuietly(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tinker.loader.shareutil.ShareTinkerInternals.setSafeModeCount(android.content.Context, int):void");
    }

    public static void setTinkerDisableWithSharedPreferences(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(ShareConstants.TINKER_SHARE_PREFERENCE_CONFIG, 4);
        sharedPreferences.edit().putBoolean(getTinkerSwitchSPKey(context), false).commit();
    }

    public static String toVisualString(String str) {
        char[] charArray;
        boolean z;
        if (str == null || (charArray = str.toCharArray()) == null) {
            return null;
        }
        int i = 0;
        while (true) {
            if (i >= charArray.length) {
                z = false;
                break;
            } else if (charArray[i] > 127) {
                charArray[i] = 0;
                z = true;
                break;
            } else {
                i++;
            }
        }
        return z ? new String(charArray, 0, i) : str;
    }

    private static boolean isVmArt(String str) {
        if (str == null) {
            return false;
        }
        Matcher matcher = Pattern.compile("(\\d+)\\.(\\d+)(\\.\\d+)?").matcher(str);
        if (!matcher.matches()) {
            return false;
        }
        try {
            int parseInt = Integer.parseInt(matcher.group(1));
            int parseInt2 = Integer.parseInt(matcher.group(2));
            if (parseInt > 2 || (parseInt == 2 && parseInt2 >= 1)) {
                return true;
            }
            return false;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
