package com.tencent.midas.plugin;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.tencent.midas.comm.APLog;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class APPluginInstallerAndUpdater {
    private static final int BUFFER_LENGTH = 8192;
    private static final int INSTALL_ERR_LOSTZIPFILE = -2;
    private static final int INSTALL_ERR_MD5CHECKFAIL = -3;
    public static final int INSTALL_ERR_SYSTEM = -1;
    public static final int INSTALL_FROM_ASSETS = 1;
    public static final int INSTALL_FROM_LOCAL = 2;
    private static final int INSTALL_SUCC = 0;
    private static final String TAG = "APPluginInstallerAndUpdater";
    public static Map<String, File> sInstallPathMap = new ConcurrentHashMap();
    public static Map<String, PackageInfo> sPackageInfoMap = new ConcurrentHashMap();

    public static File getInstallPath(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = sInstallPathMap.get(str);
        if (file == null) {
            File pluginPath = APPluginConfig.getPluginPath(context);
            if (pluginPath == null) {
                return null;
            }
            File[] listFiles = pluginPath.listFiles();
            for (File file2 : listFiles) {
                if (file2.getName().startsWith(str)) {
                    sInstallPathMap.put(str, file2);
                    return file2;
                }
            }
        }
        return file;
    }

    public static String getInstallPathString(Context context, String str) {
        try {
            File installPath = getInstallPath(context, str);
            return installPath != null ? installPath.getCanonicalPath() : "";
        } catch (IOException unused) {
            return "";
        }
    }

    private static int installFromAssets(Context context) {
        APPluginUtils.copyEmtpyResAPKFromAssets(context);
        if (TextUtils.isEmpty(APPluginConfig.KERNEL_FILE_NAME)) {
            return -2;
        }
        InputStream inputStream = null;
        try {
            inputStream = context.getAssets().open(APPluginConfig.KERNEL_FILE_NAME);
            installFromZipStream(context, inputStream);
            if (inputStream == null) {
                return 0;
            }
            try {
                inputStream.close();
                return 0;
            } catch (IOException unused) {
                return 0;
            }
        } catch (IOException unused2) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused3) {
                }
            }
            return -1;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004f A[SYNTHETIC, Splitter:B:17:0x004f] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0056 A[SYNTHETIC, Splitter:B:24:0x0056] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int installFromData(android.content.Context r5) {
        /*
            com.tencent.midas.plugin.APPluginUtils.copyEmtpyResAPKFromAssets(r5)
            java.io.File r0 = com.tencent.midas.plugin.APPluginUtils.getDataZipFile(r5)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "installFromData zipFile:"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "APPluginUtils"
            com.tencent.midas.comm.APLog.m161214i(r2, r1)
            if (r0 != 0) goto L_0x0021
            r5 = -2
            return r5
        L_0x0021:
            r1 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0053, all -> 0x004c }
            r3.<init>()     // Catch:{ IOException -> 0x0053, all -> 0x004c }
            java.lang.String r4 = "installFromData filePath:"
            r3.append(r4)     // Catch:{ IOException -> 0x0053, all -> 0x004c }
            java.lang.String r4 = r0.getCanonicalPath()     // Catch:{ IOException -> 0x0053, all -> 0x004c }
            r3.append(r4)     // Catch:{ IOException -> 0x0053, all -> 0x004c }
            java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x0053, all -> 0x004c }
            com.tencent.midas.comm.APLog.m161214i(r2, r3)     // Catch:{ IOException -> 0x0053, all -> 0x004c }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0053, all -> 0x004c }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0053, all -> 0x004c }
            installFromZipStream(r5, r2)     // Catch:{ IOException -> 0x004a, all -> 0x0047 }
            r2.close()     // Catch:{ IOException -> 0x0045 }
        L_0x0045:
            r5 = 0
            return r5
        L_0x0047:
            r5 = move-exception
            r1 = r2
            goto L_0x004d
        L_0x004a:
            r1 = r2
            goto L_0x0053
        L_0x004c:
            r5 = move-exception
        L_0x004d:
            if (r1 == 0) goto L_0x0052
            r1.close()     // Catch:{ IOException -> 0x0052 }
        L_0x0052:
            throw r5
        L_0x0053:
            r5 = -1
            if (r1 == 0) goto L_0x0059
            r1.close()     // Catch:{ IOException -> 0x0059 }
        L_0x0059:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.midas.plugin.APPluginInstallerAndUpdater.installFromData(android.content.Context):int");
    }

    public static int installFromLocal(Context context) {
        int i;
        APLog.m161210d(TAG, "Calling into installFromLocal " + Thread.currentThread().getStackTrace()[3].toString());
        APPluginUtils.deleteBKPlugin(context);
        APPluginUtils.copyDirect(context, APPluginConfig.getPluginUpdatePath(context), APPluginConfig.getPluginBackUpPath(context));
        try {
            File pluginUpdatePath = APPluginConfig.getPluginUpdatePath(context);
            i = installFromLocalByPath(context, pluginUpdatePath);
            APLog.m161210d(TAG, "Calling into installFromLocal, installFromLocalByPath result state = " + i + " install src = " + pluginUpdatePath);
        } catch (Exception unused) {
            i = -1;
        }
        if (i != 0) {
            unInstallPlugin(context);
            i = installFromLocalByPath(context, APPluginConfig.getPluginBackUpPath(context));
            if (i != 0) {
                unInstallPlugin(context);
            }
        } else {
            APPluginUtils.deleteUpdatePlugin(context);
        }
        APLog.m161214i("APPluginUtils", "installFromLocal state:" + i);
        return i;
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r0v33 */
    /* JADX WARNING: type inference failed for: r0v35 */
    /* JADX WARNING: type inference failed for: r0v38 */
    /* JADX WARNING: type inference failed for: r0v39 */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:25|94|(0)|(0)|(0)|102|103) */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0177, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0157, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0158, code lost:
        r17 = r7;
        r0 = r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:102:0x016a */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0167 A[Catch:{ IOException -> 0x016a }] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0173 A[SYNTHETIC, Splitter:B:110:0x0173] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x017b A[Catch:{ IOException -> 0x0183 }] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0180 A[Catch:{ IOException -> 0x0183 }] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0183 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0157 A[ExcHandler: all (r0v13 'th' boolean A[CUSTOM_DECLARE]), PHI: r7 r16 
      PHI: (r7v9 java.io.BufferedOutputStream) = (r7v1 java.io.BufferedOutputStream), (r7v1 java.io.BufferedOutputStream), (r7v21 java.io.BufferedOutputStream), (r7v21 java.io.BufferedOutputStream) binds: [B:9:0x001f, B:29:0x0067, B:37:0x0093, B:38:?] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r16v9 java.io.File[]) = (r16v2 java.io.File[]), (r16v2 java.io.File[]), (r16v11 java.io.File[]), (r16v11 java.io.File[]) binds: [B:9:0x001f, B:29:0x0067, B:37:0x0093, B:38:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:9:0x001f] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x015d A[SYNTHETIC, Splitter:B:96:0x015d] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0162 A[Catch:{ IOException -> 0x016a }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int installFromLocalByPath(android.content.Context r18, java.io.File r19) {
        /*
            r1 = r19
            java.lang.String r0 = "APPluginUtils"
            java.lang.String r2 = "APPluginInstallerAndUpdater"
            r3 = -1
            if (r1 != 0) goto L_0x000f
            java.lang.String r0 = "Cannot install plugin with null path!"
            com.tencent.midas.comm.APLog.m161212e(r2, r0)
            return r3
        L_0x000f:
            r4 = 0
            java.io.File r5 = com.tencent.midas.plugin.APPluginConfig.getPluginPath(r18)     // Catch:{ Exception -> 0x018e }
            java.io.File[] r6 = r19.listFiles()     // Catch:{ Exception -> 0x018e }
            r7 = 0
            r8 = r7
            r9 = r8
            r10 = 0
        L_0x001c:
            int r11 = r6.length     // Catch:{ Exception -> 0x018e }
            if (r10 >= r11) goto L_0x018b
            r11 = r6[r10]     // Catch:{ IOException -> 0x016b, all -> 0x0157 }
            java.lang.String r12 = r11.getName()     // Catch:{ IOException -> 0x016b, all -> 0x0157 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x016b, all -> 0x0157 }
            r13.<init>()     // Catch:{ IOException -> 0x016b, all -> 0x0157 }
            java.lang.String r14 = "installFromLocal src fileName:"
            r13.append(r14)     // Catch:{ IOException -> 0x016b, all -> 0x0157 }
            r13.append(r12)     // Catch:{ IOException -> 0x016b, all -> 0x0157 }
            java.lang.String r13 = r13.toString()     // Catch:{ IOException -> 0x016b, all -> 0x0157 }
            com.tencent.midas.comm.APLog.m161214i(r0, r13)     // Catch:{ IOException -> 0x016b, all -> 0x0157 }
            java.lang.String r13 = ".apk"
            boolean r13 = r12.endsWith(r13)     // Catch:{ IOException -> 0x016b, all -> 0x0157 }
            if (r13 != 0) goto L_0x0065
            java.lang.String r13 = ".ini"
            boolean r13 = r12.endsWith(r13)     // Catch:{ IOException -> 0x0061, all -> 0x005e }
            if (r13 != 0) goto L_0x0065
            if (r7 == 0) goto L_0x004e
            r7.close()     // Catch:{ IOException -> 0x0058 }
        L_0x004e:
            if (r8 == 0) goto L_0x0053
            r8.close()     // Catch:{ IOException -> 0x0058 }
        L_0x0053:
            if (r9 == 0) goto L_0x0058
            r9.close()     // Catch:{ IOException -> 0x0058 }
        L_0x0058:
            r16 = r6
            r11 = -1
            r12 = 0
            goto L_0x0183
        L_0x005e:
            r0 = move-exception
            goto L_0x015a
        L_0x0061:
            r16 = r6
            goto L_0x016f
        L_0x0065:
            java.lang.String r13 = "\\_"
            java.lang.String[] r13 = r12.split(r13)     // Catch:{ IOException -> 0x016b, all -> 0x0157 }
            r13 = r13[r4]     // Catch:{ IOException -> 0x016b, all -> 0x0157 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x016b, all -> 0x0157 }
            r14.<init>()     // Catch:{ IOException -> 0x016b, all -> 0x0157 }
            java.lang.String r15 = "installFromLocal name:"
            r14.append(r15)     // Catch:{ IOException -> 0x016b, all -> 0x0157 }
            r14.append(r13)     // Catch:{ IOException -> 0x016b, all -> 0x0157 }
            java.lang.String r14 = r14.toString()     // Catch:{ IOException -> 0x016b, all -> 0x0157 }
            com.tencent.midas.comm.APLog.m161214i(r0, r14)     // Catch:{ IOException -> 0x016b, all -> 0x0157 }
            if (r5 == 0) goto L_0x00c3
            java.io.File[] r14 = r5.listFiles()     // Catch:{ IOException -> 0x016b, all -> 0x0157 }
            r15 = 0
        L_0x0088:
            int r4 = r14.length     // Catch:{ IOException -> 0x016b, all -> 0x0157 }
            if (r15 >= r4) goto L_0x00c3
            r4 = r14[r15]     // Catch:{ IOException -> 0x016b, all -> 0x0157 }
            java.lang.String r3 = r4.getName()     // Catch:{ IOException -> 0x016b, all -> 0x0157 }
            r16 = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x016d, all -> 0x0157 }
            r6.<init>()     // Catch:{ IOException -> 0x016d, all -> 0x0157 }
            r17 = r7
            java.lang.String r7 = "installFromLocal destFileName:"
            r6.append(r7)     // Catch:{ IOException -> 0x00bf, all -> 0x00ba }
            r6.append(r3)     // Catch:{ IOException -> 0x00bf, all -> 0x00ba }
            java.lang.String r6 = r6.toString()     // Catch:{ IOException -> 0x00bf, all -> 0x00ba }
            com.tencent.midas.comm.APLog.m161214i(r0, r6)     // Catch:{ IOException -> 0x00bf, all -> 0x00ba }
            boolean r3 = r3.startsWith(r13)     // Catch:{ IOException -> 0x00bf, all -> 0x00ba }
            if (r3 == 0) goto L_0x00b2
            r4.delete()     // Catch:{ IOException -> 0x00bf, all -> 0x00ba }
        L_0x00b2:
            int r15 = r15 + 1
            r6 = r16
            r7 = r17
            r3 = -1
            goto L_0x0088
        L_0x00ba:
            r0 = move-exception
            r7 = r17
            goto L_0x015a
        L_0x00bf:
            r7 = r17
            goto L_0x016f
        L_0x00c3:
            r16 = r6
            r17 = r7
            java.io.File r3 = new java.io.File     // Catch:{ IOException -> 0x0152, all -> 0x014d }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0152, all -> 0x014d }
            r4.<init>()     // Catch:{ IOException -> 0x0152, all -> 0x014d }
            java.lang.String r6 = r5.getCanonicalPath()     // Catch:{ IOException -> 0x0152, all -> 0x014d }
            r4.append(r6)     // Catch:{ IOException -> 0x0152, all -> 0x014d }
            java.lang.String r6 = java.io.File.separator     // Catch:{ IOException -> 0x0152, all -> 0x014d }
            r4.append(r6)     // Catch:{ IOException -> 0x0152, all -> 0x014d }
            r4.append(r12)     // Catch:{ IOException -> 0x0152, all -> 0x014d }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x0152, all -> 0x014d }
            r3.<init>(r4)     // Catch:{ IOException -> 0x0152, all -> 0x014d }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0152, all -> 0x014d }
            r4.<init>()     // Catch:{ IOException -> 0x0152, all -> 0x014d }
            java.lang.String r6 = "installFromLocal destfileName:"
            r4.append(r6)     // Catch:{ IOException -> 0x0152, all -> 0x014d }
            r4.append(r12)     // Catch:{ IOException -> 0x0152, all -> 0x014d }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x0152, all -> 0x014d }
            com.tencent.midas.comm.APLog.m161214i(r0, r4)     // Catch:{ IOException -> 0x0152, all -> 0x014d }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0152, all -> 0x014d }
            r4.<init>(r3)     // Catch:{ IOException -> 0x0152, all -> 0x014d }
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x0149, all -> 0x0145 }
            r3.<init>(r4)     // Catch:{ IOException -> 0x0149, all -> 0x0145 }
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0140, all -> 0x013b }
            java.lang.String r7 = r11.getCanonicalPath()     // Catch:{ IOException -> 0x0140, all -> 0x013b }
            r6.<init>(r7)     // Catch:{ IOException -> 0x0140, all -> 0x013b }
            r7 = 8192(0x2000, float:1.14794E-41)
            byte[] r7 = new byte[r7]     // Catch:{ IOException -> 0x0135, all -> 0x012f }
        L_0x010f:
            int r8 = r6.read(r7)     // Catch:{ IOException -> 0x0135, all -> 0x012f }
            r11 = -1
            if (r8 == r11) goto L_0x011b
            r12 = 0
            r3.write(r7, r12, r8)     // Catch:{ IOException -> 0x0137, all -> 0x012d }
            goto L_0x010f
        L_0x011b:
            r12 = 0
            r3.flush()     // Catch:{ IOException -> 0x0137, all -> 0x012d }
            r3.close()     // Catch:{ IOException -> 0x0128 }
            r6.close()     // Catch:{ IOException -> 0x0128 }
            r4.close()     // Catch:{ IOException -> 0x0128 }
        L_0x0128:
            r7 = r3
            r9 = r4
            r8 = r6
            goto L_0x0183
        L_0x012d:
            r0 = move-exception
            goto L_0x0131
        L_0x012f:
            r0 = move-exception
            r11 = -1
        L_0x0131:
            r7 = r3
            r9 = r4
            r8 = r6
            goto L_0x015b
        L_0x0135:
            r11 = -1
            r12 = 0
        L_0x0137:
            r7 = r3
            r9 = r4
            r8 = r6
            goto L_0x0171
        L_0x013b:
            r0 = move-exception
            r11 = -1
            r7 = r3
            r9 = r4
            goto L_0x015b
        L_0x0140:
            r11 = -1
            r12 = 0
            r7 = r3
            r9 = r4
            goto L_0x0171
        L_0x0145:
            r0 = move-exception
            r11 = -1
            r9 = r4
            goto L_0x014f
        L_0x0149:
            r11 = -1
            r12 = 0
            r9 = r4
            goto L_0x0154
        L_0x014d:
            r0 = move-exception
            r11 = -1
        L_0x014f:
            r7 = r17
            goto L_0x015b
        L_0x0152:
            r11 = -1
            r12 = 0
        L_0x0154:
            r7 = r17
            goto L_0x0171
        L_0x0157:
            r0 = move-exception
            r17 = r7
        L_0x015a:
            r11 = -1
        L_0x015b:
            if (r7 == 0) goto L_0x0160
            r7.close()     // Catch:{ IOException -> 0x016a }
        L_0x0160:
            if (r8 == 0) goto L_0x0165
            r8.close()     // Catch:{ IOException -> 0x016a }
        L_0x0165:
            if (r9 == 0) goto L_0x016a
            r9.close()     // Catch:{ IOException -> 0x016a }
        L_0x016a:
            throw r0     // Catch:{ Exception -> 0x0177 }
        L_0x016b:
            r16 = r6
        L_0x016d:
            r17 = r7
        L_0x016f:
            r11 = -1
            r12 = 0
        L_0x0171:
            if (r7 == 0) goto L_0x0179
            r7.close()     // Catch:{ IOException -> 0x0183 }
            goto L_0x0179
        L_0x0177:
            r0 = move-exception
            goto L_0x0190
        L_0x0179:
            if (r8 == 0) goto L_0x017e
            r8.close()     // Catch:{ IOException -> 0x0183 }
        L_0x017e:
            if (r9 == 0) goto L_0x0183
            r9.close()     // Catch:{ IOException -> 0x0183 }
        L_0x0183:
            int r10 = r10 + 1
            r6 = r16
            r3 = -1
            r4 = 0
            goto L_0x001c
        L_0x018b:
            r12 = 0
            r3 = 0
            goto L_0x0197
        L_0x018e:
            r0 = move-exception
            r11 = -1
        L_0x0190:
            java.lang.String r0 = com.tencent.midas.plugin.APPluginUtils.getFullExceptionStacktrace(r0)
            com.tencent.midas.plugin.APPluginUtils.installErrMsg = r0
            r3 = -1
        L_0x0197:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "installFromLocalByPath finish result = "
            r0.append(r4)
            r0.append(r3)
            java.lang.String r4 = " install src = "
            r0.append(r4)
            r0.append(r1)
            java.lang.String r1 = " About to clear pluginsTemp dir!"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.midas.comm.APLog.m161210d(r2, r0)
            java.io.File r0 = com.tencent.midas.plugin.APPluginConfig.getPluginUpdatePath(r18)
            com.tencent.midas.plugin.APPluginUtils.clearDirContent(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.midas.plugin.APPluginInstallerAndUpdater.installFromLocalByPath(android.content.Context, java.io.File):int");
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.util.zip.ZipInputStream] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r1v5, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r1v6, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:42|(0)|(0)|64|65) */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:48|49|(0)|(0)|55|56|57) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x00d7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:64:0x00e5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00cf A[SYNTHETIC, Splitter:B:51:0x00cf] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d4 A[Catch:{ IOException -> 0x00d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00dd A[SYNTHETIC, Splitter:B:60:0x00dd] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00e2 A[Catch:{ IOException -> 0x00e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0101 A[SYNTHETIC, Splitter:B:80:0x0101] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0107 A[SYNTHETIC, Splitter:B:85:0x0107] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int installFromZipStream(android.content.Context r12, java.io.InputStream r13) {
        /*
            java.lang.String r0 = ".jar"
            com.tencent.midas.plugin.APPluginUtils.copyEmtpyResAPKFromAssets(r12)
            if (r13 != 0) goto L_0x0009
            r12 = -2
            return r12
        L_0x0009:
            r1 = 0
            r2 = -1
            java.util.zip.ZipInputStream r3 = new java.util.zip.ZipInputStream     // Catch:{ Exception -> 0x00f8 }
            r3.<init>(r13)     // Catch:{ Exception -> 0x00f8 }
            java.util.zip.ZipEntry r13 = r3.getNextEntry()     // Catch:{ Exception -> 0x00f3, all -> 0x00f0 }
            java.io.File r12 = com.tencent.midas.plugin.APPluginConfig.getPluginPath(r12)     // Catch:{ Exception -> 0x00f3, all -> 0x00f0 }
            java.lang.String r12 = r12.getAbsolutePath()     // Catch:{ Exception -> 0x00f3, all -> 0x00f0 }
        L_0x001c:
            r4 = 0
            if (r13 == 0) goto L_0x00ec
            java.lang.String r5 = r13.getName()     // Catch:{ Exception -> 0x00f3, all -> 0x00f0 }
            boolean r13 = r13.isDirectory()     // Catch:{ Exception -> 0x00f3, all -> 0x00f0 }
            if (r13 != 0) goto L_0x00e6
            java.lang.String r13 = "../"
            boolean r13 = r5.contains(r13)     // Catch:{ Exception -> 0x00f3, all -> 0x00f0 }
            if (r13 == 0) goto L_0x0033
            goto L_0x00e6
        L_0x0033:
            r13 = 1
            java.lang.String r6 = ""
            boolean r7 = r5.endsWith(r0)     // Catch:{ Exception -> 0x00f3, all -> 0x00f0 }
            if (r7 == 0) goto L_0x006b
            int r6 = r5.lastIndexOf(r0)     // Catch:{ Exception -> 0x00f3, all -> 0x00f0 }
            if (r6 == r2) goto L_0x0047
            java.lang.String r6 = r5.substring(r4, r6)     // Catch:{ Exception -> 0x00f3, all -> 0x00f0 }
            goto L_0x0048
        L_0x0047:
            r6 = r5
        L_0x0048:
            java.lang.String r7 = "_"
            java.lang.String[] r7 = r6.split(r7)     // Catch:{ Exception -> 0x00f3, all -> 0x00f0 }
            r8 = 3
            r7 = r7[r8]     // Catch:{ Exception -> 0x00f3, all -> 0x00f0 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00f3, all -> 0x00f0 }
            r8.<init>()     // Catch:{ Exception -> 0x00f3, all -> 0x00f0 }
            r8.append(r12)     // Catch:{ Exception -> 0x00f3, all -> 0x00f0 }
            java.lang.String r9 = java.io.File.separator     // Catch:{ Exception -> 0x00f3, all -> 0x00f0 }
            r8.append(r9)     // Catch:{ Exception -> 0x00f3, all -> 0x00f0 }
            r8.append(r6)     // Catch:{ Exception -> 0x00f3, all -> 0x00f0 }
            java.lang.String r6 = ".apk"
            r8.append(r6)     // Catch:{ Exception -> 0x00f3, all -> 0x00f0 }
            java.lang.String r6 = r8.toString()     // Catch:{ Exception -> 0x00f3, all -> 0x00f0 }
            goto L_0x0082
        L_0x006b:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00f3, all -> 0x00f0 }
            r13.<init>()     // Catch:{ Exception -> 0x00f3, all -> 0x00f0 }
            r13.append(r12)     // Catch:{ Exception -> 0x00f3, all -> 0x00f0 }
            java.lang.String r7 = java.io.File.separator     // Catch:{ Exception -> 0x00f3, all -> 0x00f0 }
            r13.append(r7)     // Catch:{ Exception -> 0x00f3, all -> 0x00f0 }
            r13.append(r5)     // Catch:{ Exception -> 0x00f3, all -> 0x00f0 }
            java.lang.String r13 = r13.toString()     // Catch:{ Exception -> 0x00f3, all -> 0x00f0 }
            r7 = r6
            r6 = r13
            r13 = 0
        L_0x0082:
            java.io.File r8 = new java.io.File     // Catch:{ Exception -> 0x00f3, all -> 0x00f0 }
            r8.<init>(r6)     // Catch:{ Exception -> 0x00f3, all -> 0x00f0 }
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00c5, all -> 0x00c2 }
            r6.<init>(r8)     // Catch:{ Exception -> 0x00c5, all -> 0x00c2 }
            java.io.BufferedOutputStream r9 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x00c0 }
            r9.<init>(r6)     // Catch:{ Exception -> 0x00c0 }
            r10 = 8192(0x2000, float:1.14794E-41)
            byte[] r10 = new byte[r10]     // Catch:{ Exception -> 0x00bb, all -> 0x00b8 }
        L_0x0095:
            int r11 = r3.read(r10)     // Catch:{ Exception -> 0x00bb, all -> 0x00b8 }
            if (r11 == r2) goto L_0x009f
            r9.write(r10, r4, r11)     // Catch:{ Exception -> 0x00bb, all -> 0x00b8 }
            goto L_0x0095
        L_0x009f:
            r9.flush()     // Catch:{ Exception -> 0x00bb, all -> 0x00b8 }
            java.lang.String r4 = r8.getCanonicalPath()     // Catch:{ Exception -> 0x00bb, all -> 0x00b8 }
            com.tencent.midas.plugin.APPluginUtils.backUp(r13, r5, r7, r4)     // Catch:{ Exception -> 0x00bb, all -> 0x00b8 }
            java.util.zip.ZipEntry r13 = r3.getNextEntry()     // Catch:{ Exception -> 0x00bb, all -> 0x00b8 }
            r9.close()     // Catch:{ IOException -> 0x00b5 }
            r6.close()     // Catch:{ IOException -> 0x00b5 }
            goto L_0x001c
        L_0x00b5:
            goto L_0x001c
        L_0x00b8:
            r12 = move-exception
            r1 = r9
            goto L_0x00db
        L_0x00bb:
            r12 = move-exception
            r1 = r9
            goto L_0x00c7
        L_0x00be:
            r12 = move-exception
            goto L_0x00db
        L_0x00c0:
            r12 = move-exception
            goto L_0x00c7
        L_0x00c2:
            r12 = move-exception
            r6 = r1
            goto L_0x00db
        L_0x00c5:
            r12 = move-exception
            r6 = r1
        L_0x00c7:
            java.lang.String r12 = com.tencent.midas.plugin.APPluginUtils.getFullExceptionStacktrace(r12)     // Catch:{ all -> 0x00be }
            com.tencent.midas.plugin.APPluginUtils.installErrMsg = r12     // Catch:{ all -> 0x00be }
            if (r1 == 0) goto L_0x00d2
            r1.close()     // Catch:{ IOException -> 0x00d7 }
        L_0x00d2:
            if (r6 == 0) goto L_0x00d7
            r6.close()     // Catch:{ IOException -> 0x00d7 }
        L_0x00d7:
            r3.close()     // Catch:{ IOException -> 0x00da }
        L_0x00da:
            return r2
        L_0x00db:
            if (r1 == 0) goto L_0x00e0
            r1.close()     // Catch:{ IOException -> 0x00e5 }
        L_0x00e0:
            if (r6 == 0) goto L_0x00e5
            r6.close()     // Catch:{ IOException -> 0x00e5 }
        L_0x00e5:
            throw r12     // Catch:{ Exception -> 0x00f3, all -> 0x00f0 }
        L_0x00e6:
            java.util.zip.ZipEntry r13 = r3.getNextEntry()     // Catch:{ Exception -> 0x00f3, all -> 0x00f0 }
            goto L_0x001c
        L_0x00ec:
            r3.close()     // Catch:{ IOException -> 0x00ef }
        L_0x00ef:
            return r4
        L_0x00f0:
            r12 = move-exception
            r1 = r3
            goto L_0x0105
        L_0x00f3:
            r12 = move-exception
            r1 = r3
            goto L_0x00f9
        L_0x00f6:
            r12 = move-exception
            goto L_0x0105
        L_0x00f8:
            r12 = move-exception
        L_0x00f9:
            java.lang.String r12 = com.tencent.midas.plugin.APPluginUtils.getFullExceptionStacktrace(r12)     // Catch:{ all -> 0x00f6 }
            com.tencent.midas.plugin.APPluginUtils.installErrMsg = r12     // Catch:{ all -> 0x00f6 }
            if (r1 == 0) goto L_0x0104
            r1.close()     // Catch:{ IOException -> 0x0104 }
        L_0x0104:
            return r2
        L_0x0105:
            if (r1 == 0) goto L_0x010a
            r1.close()     // Catch:{ IOException -> 0x010a }
        L_0x010a:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.midas.plugin.APPluginInstallerAndUpdater.installFromZipStream(android.content.Context, java.io.InputStream):int");
    }

    public static int installPlugin(Context context, int i) {
        APLog.m161210d(TAG, "installPlugin from = " + i);
        int i2 = 0;
        try {
            unInstallPlugin(context);
            if (i == 1) {
                i2 = installFromAssets(context);
            } else if (i == 2) {
                i2 = installFromData(context);
            }
            if (i2 != 0) {
                unInstallPlugin(context);
            }
        } catch (Exception e) {
            APLog.m161222w("APPluginUtils", "installPlugin Exception:" + e.toString());
            APPluginUtils.installErrMsg = APPluginUtils.getFullExceptionStacktrace(e);
        }
        return i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0064 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0066  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int isNeedUpdateFromAssets(android.content.Context r5, java.lang.String r6) {
        /*
            java.lang.String r0 = "MidasCore"
            java.io.File r0 = getInstallPath(r5, r0)     // Catch:{ Exception -> 0x000b }
            java.lang.String r0 = r0.getCanonicalPath()     // Catch:{ Exception -> 0x000b }
            goto L_0x000d
        L_0x000b:
            java.lang.String r0 = ""
        L_0x000d:
            r1 = 0
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0023 }
            if (r2 != 0) goto L_0x001b
            android.content.pm.PackageInfo r0 = com.tencent.midas.plugin.APPluginUtils.getPackageInfo(r5, r0)     // Catch:{ Exception -> 0x0023 }
            int r0 = r0.versionCode     // Catch:{ Exception -> 0x0023 }
            goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            int r2 = com.tencent.midas.plugin.APPluginUtils.getAssetsVersionCode(r5)     // Catch:{ Exception -> 0x0021 }
            goto L_0x0026
        L_0x0021:
            goto L_0x0025
        L_0x0023:
            r0 = 0
        L_0x0025:
            r2 = 0
        L_0x0026:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "isNeedUpdateFromAssets coreVC:"
            r3.append(r4)
            r3.append(r0)
            java.lang.String r4 = " assetsVC:"
            r3.append(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "APPluginUtils"
            com.tencent.midas.comm.APLog.m161214i(r4, r3)
            java.lang.String r3 = "release"
            boolean r6 = r3.equals(r6)
            if (r6 != 0) goto L_0x0062
            r6 = 179010(0x2bb42, float:2.50846E-40)
            if (r6 == r2) goto L_0x0062
            if (r5 == 0) goto L_0x0062
            boolean r6 = r5 instanceof android.app.Activity
            if (r6 == 0) goto L_0x0062
            r6 = r5
            android.app.Activity r6 = (android.app.Activity) r6
            com.tencent.midas.plugin.APPluginInstallerAndUpdater$1 r3 = new com.tencent.midas.plugin.APPluginInstallerAndUpdater$1
            r3.<init>(r6)
            r6.runOnUiThread(r3)
        L_0x0062:
            if (r2 <= r0) goto L_0x0066
            r5 = 1
            return r5
        L_0x0066:
            java.io.File r6 = com.tencent.midas.plugin.APPluginUtils.getDataZipFile(r5)
            if (r6 == 0) goto L_0x008c
            java.lang.String r6 = r6.getAbsolutePath()
            int r5 = com.tencent.midas.plugin.APPluginUtils.getZipVersionCodeWtihFileName(r5, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r2 = "isNeedUpdateFromAssets dataVC:"
            r6.append(r2)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            com.tencent.midas.comm.APLog.m161214i(r4, r6)
            if (r5 <= r0) goto L_0x008c
            r5 = 2
            return r5
        L_0x008c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.midas.plugin.APPluginInstallerAndUpdater.isNeedUpdateFromAssets(android.content.Context, java.lang.String):int");
    }

    public static boolean isNeedUpdateFromLocal(Context context) {
        APLog.m161210d(TAG, "isNeedUpdateFromLocal");
        File pluginUpdatePath = APPluginConfig.getPluginUpdatePath(context);
        try {
            File file = new File(pluginUpdatePath, APPluginConfig.SIGN_FILE_NAME);
            if (!file.exists()) {
                APLog.m161210d(TAG, "isNeedUpdateFromLocal, sign file not exist, return false!");
                return false;
            }
            APLog.m161210d(TAG, "isNeedUpdateFromLocal, sign file exist!");
            HashMap hashMap = new HashMap();
            APPluginUtils.readSingInfoItems(hashMap, file);
            File[] listFiles = pluginUpdatePath.listFiles();
            if (listFiles == null) {
                APLog.m161210d(TAG, "isNeedUpdateFromLocal, cannot get local file list, return false!");
                return false;
            } else if (listFiles.length == 0) {
                APLog.m161210d(TAG, "isNeedUpdateFromLocal, empty local file list, return false!");
                return false;
            } else {
                boolean z = false;
                for (File file2 : listFiles) {
                    String name = file2.getName();
                    APLog.m161210d(TAG, "isNeedUpdateFromLocal, iterating update dir file list, current = " + name);
                    if (name.startsWith("MidasCore")) {
                        z = true;
                    }
                    if (!name.endsWith(".apk")) {
                        APLog.m161210d(TAG, "isNeedUpdateFromLocal, iterating update dir file list, current = " + name + ", not apk file, continue!");
                    } else {
                        boolean checkFileMD5 = APPluginUtils.checkFileMD5(file2.getCanonicalPath(), ((APSignIniItem) hashMap.get(name.split("\\_")[0])).md5);
                        APLog.m161210d(TAG, "isNeedUpdateFromLocal, iterating update dir file list, current = " + name + " valid = " + checkFileMD5);
                        if (!checkFileMD5) {
                            APPluginUtils.clearDirContent(pluginUpdatePath);
                            return false;
                        }
                        hashMap.remove(name.split("\\_")[0]);
                    }
                }
                if (hashMap.size() > 0) {
                    APLog.m161210d(TAG, "isNeedUpdateFromLocal, update dir file list iterate finish! sigMap size = " + hashMap.size());
                    File pluginPath = APPluginConfig.getPluginPath(context);
                    for (APSignIniItem aPSignIniItem : hashMap.values()) {
                        APLog.m161210d(TAG, "isNeedUpdateFromLocal, iterating sigMap left, current = " + aPSignIniItem.fullName);
                        if (!new File(pluginPath, aPSignIniItem.fullName).exists()) {
                            APLog.m161212e(TAG, "isNeedUpdateFromLocal, iterating sigMap left, current = " + aPSignIniItem.fullName + " missing in midasplugins!");
                            APPluginUtils.clearDirContent(pluginUpdatePath);
                            return false;
                        }
                        APLog.m161210d(TAG, "isNeedUpdateFromLocal, iterating sigMap left, current = " + aPSignIniItem.fullName + " exist in midasplugins!");
                    }
                } else {
                    APLog.m161210d(TAG, "isNeedUpdateFromLocal, update dir file list iterate finish! sigMap size is 0");
                }
                if (!z) {
                    APLog.m161210d(TAG, "isNeedUpdateFromLocal, hasMidasCoreFile == false!");
                    return false;
                }
                APLog.m161210d(TAG, "isNeedUpdateFromLocal, hasMidasCoreFile == true!");
                APLog.m161212e(TAG, "isNeedUpdateFromLocal, return true!");
                return true;
            }
        } catch (Exception e) {
            APLog.m161212e(TAG, "isNeedUpdateFromLocal, got exception = " + e);
            return false;
        }
    }

    public static void unInstallPlugin(Context context) {
        APLog.m161210d(TAG, "unInstallPlugin " + Thread.currentThread().getStackTrace()[3].toString());
        APPluginUtils.deletePlugin(context);
        APPluginUtils.deleteDex(context);
        APPluginUtils.deleteLibs(context);
        sInstallPathMap.clear();
        sPackageInfoMap.clear();
        APPluginStatic.release();
        APPluginConfig.libExtend++;
    }
}
