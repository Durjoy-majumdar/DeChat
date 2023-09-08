package com.tencent.midas.plugin;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.text.TextUtils;
import android.widget.Toast;
import com.pay.tool.APMidasTools;
import com.tencent.midas.api.APMidasPayAPI;
import com.tencent.midas.api.APMidasResponse;
import com.tencent.midas.comm.APLog;
import com.tencent.midas.comm.APMidasRSATools;
import com.tencent.midas.control.APMidasPayHelper;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.midas.data.APPluginReportManager;
import com.tencent.midas.jsbridge.APWebJSBridgeActivity;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.tinker.loader.shareutil.ShareConstants;
import com.tencent.xweb.file.XVFSFile;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class APPluginUtils {
    private static final int BUFFER_LENGTH = 8192;
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final String TAG = "PluginUtils";
    /* access modifiers changed from: private */
    public static Object copyFileObject = new Object();
    private static ArrayList<String> emptyResList = null;
    private static String[] fileList = null;
    public static String installErrMsg = null;

    public static void backUp(boolean z, String str, String str2, String str3) {
        String str4;
        try {
            str4 = Environment.getExternalStorageDirectory().getCanonicalPath();
        } catch (IOException unused) {
            str4 = null;
        }
        if (!TextUtils.isEmpty(str4)) {
            final String str5 = str4 + "/Tencent/MidasPay/";
            final boolean z2 = z;
            final String str6 = str;
            final String str7 = str3;
            final String str8 = str2;
            new Thread(new Runnable() {
                public void run() {
                    synchronized (APPluginUtils.copyFileObject) {
                        if (z2) {
                            String str = str6;
                            if (str.endsWith(ShareConstants.JAR_SUFFIX)) {
                                str = str.replace(ShareConstants.JAR_SUFFIX, ".apk");
                            }
                            long currentTimeMillis = System.currentTimeMillis();
                            APPluginUtils.copyFile(str7, str5, str, str8);
                            APLog.m161214i("Times", "File" + str + "backup times:" + (System.currentTimeMillis() - currentTimeMillis));
                        }
                    }
                }
            }).start();
        }
    }

    private static void callbackInMidasPluginWhenRunningInNewProcess(Context context, int i, String str) {
        try {
            Intent intent = new Intent();
            intent.putExtra("EXTRA_CALLBACK_RESULT_CODE", i);
            intent.putExtra("EXTRA_CALLBACK_RESULT_MSG", str);
            APPluginInterfaceManager.initPluginInterface(context, APMidasPayHelper.MIDAS_PLUGIN_NAME, APMidasPayHelper.PKG_DISTRIBUTE, APMidasPayHelper.MED_DISTRIBUTE_CALLBACK_FROM_MIDAS_PAY, new Object[]{context, intent});
        } catch (Exception e) {
            APLog.m161212e("PluginProxyActivity", "openPlugin error:" + e.toString());
        }
    }

    public static void callbackInMidasPluginWithoutCaringAboutNewProcess(Context context, int i, String str) {
        if (context == null) {
            APLog.m161212e(TAG, "Call back in plugin without caring process fail, null context!");
            return;
        }
        APLog.m161210d(TAG, "Call back in plugin without caring process, context ok!");
        if (APMidasPayHelper.isNewProcess(context)) {
            APLog.m161210d(TAG, "Call back in plugin without caring process, is new process!");
            callbackInMidasPluginWhenRunningInNewProcess(context, i, str);
            return;
        }
        APLog.m161210d(TAG, "Call back in plugin without caring process, not new process!");
        APMidasResponse aPMidasResponse = new APMidasResponse();
        aPMidasResponse.resultCode = i;
        aPMidasResponse.resultMsg = str;
        APMidasPayHelper.midasCallBack(aPMidasResponse);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x003c A[SYNTHETIC, Splitter:B:20:0x003c] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0047 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0049 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean checkFileMD5(java.lang.String r5, java.lang.String r6) {
        /*
            r0 = 0
            r1 = 0
            boolean r2 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Exception -> 0x0039 }
            if (r2 != 0) goto L_0x0038
            boolean r2 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x0039 }
            if (r2 == 0) goto L_0x000f
            goto L_0x0038
        L_0x000f:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0039 }
            r2.<init>(r5)     // Catch:{ Exception -> 0x0039 }
            java.lang.String r5 = "MD5"
            java.security.MessageDigest r5 = java.security.MessageDigest.getInstance(r5)     // Catch:{ Exception -> 0x0035 }
            r1 = 8192(0x2000, float:1.14794E-41)
            byte[] r1 = new byte[r1]     // Catch:{ Exception -> 0x0035 }
        L_0x001e:
            int r3 = r2.read(r1)     // Catch:{ Exception -> 0x0035 }
            r4 = -1
            if (r3 == r4) goto L_0x0029
            r5.update(r1, r0, r3)     // Catch:{ Exception -> 0x0035 }
            goto L_0x001e
        L_0x0029:
            r2.close()     // Catch:{ Exception -> 0x0035 }
            byte[] r5 = r5.digest()     // Catch:{ Exception -> 0x0035 }
            java.lang.String r5 = toHexString(r5)     // Catch:{ Exception -> 0x0035 }
            goto L_0x0041
        L_0x0035:
            r1 = r2
            goto L_0x003a
        L_0x0038:
            return r0
        L_0x0039:
        L_0x003a:
            if (r1 == 0) goto L_0x003f
            r1.close()     // Catch:{ IOException -> 0x003f }
        L_0x003f:
            java.lang.String r5 = ""
        L_0x0041:
            boolean r5 = r5.equalsIgnoreCase(r6)
            if (r5 == 0) goto L_0x0049
            r5 = 1
            return r5
        L_0x0049:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.midas.plugin.APPluginUtils.checkFileMD5(java.lang.String, java.lang.String):boolean");
    }

    public static void clearDirContent(File file) {
        if (file == null || (!file.exists() || !file.isDirectory())) {
            APLog.m161212e(TAG, "call clear dir content, but parameter error!");
            return;
        }
        APLog.m161210d(TAG, "About to clear dir, path = " + file.getAbsolutePath());
        File[] listFiles = file.listFiles();
        if (listFiles != null && listFiles.length != 0) {
            for (File file2 : listFiles) {
                if (file2 != null && file2.exists()) {
                    file2.delete();
                }
            }
        }
    }

    public static void copyDirect(Context context, File file, File file2) {
        File[] listFiles;
        if (file != null && file2 != null && (listFiles = file.listFiles()) != null) {
            for (File file3 : listFiles) {
                copyFile(file3.getAbsolutePath(), file2.getAbsolutePath(), file3.getName());
            }
        }
    }

    public static void copyEmtpyResAPKFromAssets(Context context) {
        String[] assetFileList;
        if (isHasBSL() && (assetFileList = getAssetFileList(context)) != null) {
            for (String str : assetFileList) {
                if (str.startsWith("MidasEmptyRes") && str.endsWith(".apk")) {
                    String str2 = APPluginConfig.getPluginEmptyResPath(context).getAbsolutePath() + File.separator + str;
                    APLog.m161214i("APPluginUtils", "copyEmtpyResAPKFromAssets meptyResPath:" + str2);
                    try {
                        InputStream open = context.getAssets().open(str);
                        File file = new File(str2);
                        file.createNewFile();
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = open.read(bArr);
                            if (read <= 0) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, read);
                        }
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        open.close();
                    } catch (IOException unused) {
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a0 A[SYNTHETIC, Splitter:B:50:0x00a0] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a8 A[Catch:{ IOException -> 0x00a4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00bb A[SYNTHETIC, Splitter:B:64:0x00bb] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c3 A[Catch:{ IOException -> 0x00bf }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void copyFile(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            java.lang.String r0 = ""
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x00b7, all -> 0x009b }
            r2.<init>(r5)     // Catch:{ Exception -> 0x00b7, all -> 0x009b }
            java.lang.String r5 = "MD5"
            java.security.MessageDigest r5 = java.security.MessageDigest.getInstance(r5)     // Catch:{ Exception -> 0x0097, all -> 0x0092 }
            java.io.File r3 = new java.io.File     // Catch:{ Exception -> 0x0097, all -> 0x0092 }
            r3.<init>(r6)     // Catch:{ Exception -> 0x0097, all -> 0x0092 }
            boolean r4 = r3.exists()     // Catch:{ Exception -> 0x0097, all -> 0x0092 }
            if (r4 != 0) goto L_0x001c
            r3.mkdir()     // Catch:{ Exception -> 0x0097, all -> 0x0092 }
        L_0x001c:
            java.io.File r3 = new java.io.File     // Catch:{ Exception -> 0x0097, all -> 0x0092 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0097, all -> 0x0092 }
            r4.<init>()     // Catch:{ Exception -> 0x0097, all -> 0x0092 }
            r4.append(r6)     // Catch:{ Exception -> 0x0097, all -> 0x0092 }
            r4.append(r7)     // Catch:{ Exception -> 0x0097, all -> 0x0092 }
            java.lang.String r6 = r4.toString()     // Catch:{ Exception -> 0x0097, all -> 0x0092 }
            r3.<init>(r6)     // Catch:{ Exception -> 0x0097, all -> 0x0092 }
            boolean r6 = r3.exists()     // Catch:{ Exception -> 0x0090, all -> 0x008d }
            if (r6 == 0) goto L_0x0045
            r2.close()     // Catch:{ IOException -> 0x003a }
            goto L_0x003b
        L_0x003a:
        L_0x003b:
            int r5 = r0.compareToIgnoreCase(r8)
            if (r5 == 0) goto L_0x0044
            r3.delete()
        L_0x0044:
            return
        L_0x0045:
            java.io.File r6 = r3.getParentFile()     // Catch:{ Exception -> 0x0090, all -> 0x008d }
            boolean r6 = r6.exists()     // Catch:{ Exception -> 0x0090, all -> 0x008d }
            if (r6 != 0) goto L_0x0056
            java.io.File r6 = r3.getParentFile()     // Catch:{ Exception -> 0x0090, all -> 0x008d }
            r6.mkdirs()     // Catch:{ Exception -> 0x0090, all -> 0x008d }
        L_0x0056:
            r3.createNewFile()     // Catch:{ Exception -> 0x0090, all -> 0x008d }
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0090, all -> 0x008d }
            r6.<init>(r3)     // Catch:{ Exception -> 0x0090, all -> 0x008d }
            r7 = 8192(0x2000, float:1.14794E-41)
            byte[] r7 = new byte[r7]     // Catch:{ Exception -> 0x0099, all -> 0x008b }
        L_0x0062:
            int r1 = r2.read(r7)     // Catch:{ Exception -> 0x0099, all -> 0x008b }
            r4 = -1
            if (r1 == r4) goto L_0x0071
            r4 = 0
            r6.write(r7, r4, r1)     // Catch:{ Exception -> 0x0099, all -> 0x008b }
            r5.update(r7, r4, r1)     // Catch:{ Exception -> 0x0099, all -> 0x008b }
            goto L_0x0062
        L_0x0071:
            byte[] r5 = r5.digest()     // Catch:{ Exception -> 0x0099, all -> 0x008b }
            java.lang.String r0 = toHexString(r5)     // Catch:{ Exception -> 0x0099, all -> 0x008b }
            r6.flush()     // Catch:{ Exception -> 0x0099, all -> 0x008b }
            r2.close()     // Catch:{ IOException -> 0x0083 }
            r6.close()     // Catch:{ IOException -> 0x0083 }
            goto L_0x0084
        L_0x0083:
        L_0x0084:
            int r5 = r0.compareToIgnoreCase(r8)
            if (r5 == 0) goto L_0x00d1
            goto L_0x00ce
        L_0x008b:
            r5 = move-exception
            goto L_0x0095
        L_0x008d:
            r5 = move-exception
            r6 = r1
            goto L_0x0095
        L_0x0090:
            r6 = r1
            goto L_0x0099
        L_0x0092:
            r5 = move-exception
            r6 = r1
            r3 = r6
        L_0x0095:
            r1 = r2
            goto L_0x009e
        L_0x0097:
            r6 = r1
            r3 = r6
        L_0x0099:
            r1 = r2
            goto L_0x00b9
        L_0x009b:
            r5 = move-exception
            r6 = r1
            r3 = r6
        L_0x009e:
            if (r1 == 0) goto L_0x00a6
            r1.close()     // Catch:{ IOException -> 0x00a4 }
            goto L_0x00a6
        L_0x00a4:
            goto L_0x00ab
        L_0x00a6:
            if (r6 == 0) goto L_0x00ab
            r6.close()     // Catch:{ IOException -> 0x00a4 }
        L_0x00ab:
            int r6 = r0.compareToIgnoreCase(r8)
            if (r6 == 0) goto L_0x00b6
            if (r3 == 0) goto L_0x00b6
            r3.delete()
        L_0x00b6:
            throw r5
        L_0x00b7:
            r6 = r1
            r3 = r6
        L_0x00b9:
            if (r1 == 0) goto L_0x00c1
            r1.close()     // Catch:{ IOException -> 0x00bf }
            goto L_0x00c1
        L_0x00bf:
            goto L_0x00c6
        L_0x00c1:
            if (r6 == 0) goto L_0x00c6
            r6.close()     // Catch:{ IOException -> 0x00bf }
        L_0x00c6:
            int r5 = r0.compareToIgnoreCase(r8)
            if (r5 == 0) goto L_0x00d1
            if (r3 == 0) goto L_0x00d1
        L_0x00ce:
            r3.delete()
        L_0x00d1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.midas.plugin.APPluginUtils.copyFile(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public static void deleteBKPlugin(Context context) {
        APLog.m161214i("APPluginUtils", "deleteUpdatePlugin");
        deleteFiles(APPluginConfig.getPluginBackUpPath(context));
    }

    public static void deleteDex(Context context) {
        APLog.m161214i("APPluginUtils", "deleteDex");
        deleteFiles(APPluginConfig.getOptimizedDexPath(context));
    }

    public static void deleteFiles(File file) {
        if (file != null) {
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File file2 : listFiles) {
                        if (file2 != null && file2.exists()) {
                            file2.delete();
                        }
                    }
                    file.delete();
                    return;
                }
                return;
            }
            file.delete();
        }
    }

    public static void deleteLibs(Context context) {
        APLog.m161214i("APPluginUtils", "deleteLibs");
        deleteFiles(APPluginConfig.getLibPath(context));
    }

    public static void deletePlugin(Context context) {
        APLog.m161214i("APPluginUtils", "deletePlugin");
        deleteFiles(APPluginConfig.getPluginPath(context));
    }

    public static void deleteUpdatePlugin(Context context) {
        APLog.m161210d(TAG, "Calling into deleteUpdatePlugin " + Thread.currentThread().getStackTrace()[3].toString());
        deleteFiles(APPluginConfig.getPluginUpdatePath(context));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(13:37|38|39|40|41|(3:42|43|(1:45)(1:90))|46|47|48|49|65|66|(1:81)(1:87)) */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x014d, code lost:
        if (r7 != null) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0164, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0165, code lost:
        installErrMsg = getFullExceptionStacktrace(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:?, code lost:
        return -1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0150 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x0161 */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x014a A[SYNTHETIC, Splitter:B:62:0x014a] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0159 A[SYNTHETIC, Splitter:B:71:0x0159] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x015e A[Catch:{ IOException -> 0x0161 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0162 A[EDGE_INSN: B:81:0x0162->B:77:0x0162 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0067 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int extractLibs(java.lang.String r13, java.lang.String r14) {
        /*
            java.lang.String r0 = android.os.Build.CPU_ABI
            java.lang.String r1 = "arm64-v8a"
            boolean r2 = r0.startsWith(r1)
            java.lang.String r3 = "armeabi"
            java.lang.String r4 = "x86"
            if (r2 == 0) goto L_0x000f
            goto L_0x0020
        L_0x000f:
            java.lang.String r1 = "arm"
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L_0x0019
        L_0x0017:
            r1 = r3
            goto L_0x0020
        L_0x0019:
            boolean r1 = r0.startsWith(r4)
            if (r1 == 0) goto L_0x0017
            r1 = r4
        L_0x0020:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "extractLibs end to dirToExtract:"
            r2.append(r3)
            r2.append(r1)
            java.lang.String r3 = " extractLibs ABI:"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "APPluginUtils"
            com.tencent.midas.comm.APLog.m161214i(r2, r0)
            java.lang.String r0 = java.io.File.separator
            boolean r3 = r14.endsWith(r0)
            if (r3 != 0) goto L_0x0055
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r14)
            r3.append(r0)
            java.lang.String r14 = r3.toString()
        L_0x0055:
            r0 = 0
            installErrMsg = r0
            r3 = -1
            r4 = 0
            java.util.zip.ZipFile r5 = new java.util.zip.ZipFile     // Catch:{ IOException -> 0x0164 }
            r5.<init>(r13)     // Catch:{ IOException -> 0x0164 }
            r13 = 4096(0x1000, float:5.74E-42)
            byte[] r13 = new byte[r13]     // Catch:{ IOException -> 0x0164 }
            java.util.Enumeration r6 = r5.entries()     // Catch:{ IOException -> 0x0164 }
        L_0x0067:
            boolean r7 = r6.hasMoreElements()     // Catch:{ IOException -> 0x0164 }
            if (r7 == 0) goto L_0x0162
            java.lang.Object r7 = r6.nextElement()     // Catch:{ IOException -> 0x0164 }
            java.util.zip.ZipEntry r7 = (java.util.zip.ZipEntry) r7     // Catch:{ IOException -> 0x0164 }
            java.lang.String r8 = r7.getName()     // Catch:{ IOException -> 0x0164 }
            java.lang.String r9 = java.io.File.separator     // Catch:{ IOException -> 0x0164 }
            boolean r10 = r8.endsWith(r9)     // Catch:{ IOException -> 0x0164 }
            if (r10 != 0) goto L_0x0067
            java.lang.String r10 = "../"
            boolean r10 = r8.contains(r10)     // Catch:{ IOException -> 0x0164 }
            if (r10 == 0) goto L_0x0088
            goto L_0x0067
        L_0x0088:
            java.lang.String r10 = "lib"
            boolean r10 = r8.contains(r10)     // Catch:{ IOException -> 0x0164 }
            if (r10 != 0) goto L_0x0099
            java.lang.String r10 = ".so"
            boolean r10 = r8.endsWith(r10)     // Catch:{ IOException -> 0x0164 }
            if (r10 != 0) goto L_0x0099
            goto L_0x0067
        L_0x0099:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0164 }
            r10.<init>()     // Catch:{ IOException -> 0x0164 }
            java.lang.String r11 = "fileName:"
            r10.append(r11)     // Catch:{ IOException -> 0x0164 }
            r10.append(r8)     // Catch:{ IOException -> 0x0164 }
            java.lang.String r10 = r10.toString()     // Catch:{ IOException -> 0x0164 }
            com.tencent.midas.comm.APLog.m161214i(r2, r10)     // Catch:{ IOException -> 0x0164 }
            java.io.File r10 = new java.io.File     // Catch:{ IOException -> 0x0164 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0164 }
            r11.<init>()     // Catch:{ IOException -> 0x0164 }
            r11.append(r14)     // Catch:{ IOException -> 0x0164 }
            r11.append(r8)     // Catch:{ IOException -> 0x0164 }
            java.lang.String r11 = r11.toString()     // Catch:{ IOException -> 0x0164 }
            r10.<init>(r11)     // Catch:{ IOException -> 0x0164 }
            int r9 = r8.lastIndexOf(r9)     // Catch:{ IOException -> 0x0164 }
            if (r9 == r3) goto L_0x00cd
            int r9 = r9 + 1
            java.lang.String r8 = r8.substring(r9)     // Catch:{ IOException -> 0x0164 }
        L_0x00cd:
            java.io.File r9 = new java.io.File     // Catch:{ IOException -> 0x0164 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0164 }
            r11.<init>()     // Catch:{ IOException -> 0x0164 }
            r11.append(r14)     // Catch:{ IOException -> 0x0164 }
            r11.append(r8)     // Catch:{ IOException -> 0x0164 }
            java.lang.String r8 = r11.toString()     // Catch:{ IOException -> 0x0164 }
            r9.<init>(r8)     // Catch:{ IOException -> 0x0164 }
        L_0x00e1:
            if (r10 == 0) goto L_0x00f4
            java.lang.String r8 = r10.getName()     // Catch:{ IOException -> 0x0164 }
            boolean r8 = r8.equals(r1)     // Catch:{ IOException -> 0x0164 }
            if (r8 == 0) goto L_0x00ef
            r8 = 1
            goto L_0x00f5
        L_0x00ef:
            java.io.File r10 = r10.getParentFile()     // Catch:{ IOException -> 0x0164 }
            goto L_0x00e1
        L_0x00f4:
            r8 = 0
        L_0x00f5:
            if (r8 == 0) goto L_0x0067
            java.io.File r8 = r9.getParentFile()     // Catch:{ IOException -> 0x0164 }
            r8.mkdirs()     // Catch:{ IOException -> 0x0164 }
            java.io.InputStream r7 = r5.getInputStream(r7)     // Catch:{ IOException -> 0x0125, all -> 0x0122 }
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x011f, all -> 0x011d }
            r8.<init>(r9)     // Catch:{ IOException -> 0x011f, all -> 0x011d }
        L_0x0107:
            int r9 = r7.read(r13)     // Catch:{ IOException -> 0x011b }
            if (r9 <= 0) goto L_0x0111
            r8.write(r13, r4, r9)     // Catch:{ IOException -> 0x011b }
            goto L_0x0107
        L_0x0111:
            r8.flush()     // Catch:{ IOException -> 0x011b }
            r8.close()     // Catch:{ IOException -> 0x0150 }
        L_0x0117:
            r7.close()     // Catch:{ IOException -> 0x0150 }
            goto L_0x0150
        L_0x011b:
            r9 = move-exception
            goto L_0x0128
        L_0x011d:
            r13 = move-exception
            goto L_0x0157
        L_0x011f:
            r9 = move-exception
            r8 = r0
            goto L_0x0128
        L_0x0122:
            r13 = move-exception
            r7 = r0
            goto L_0x0157
        L_0x0125:
            r9 = move-exception
            r7 = r0
            r8 = r7
        L_0x0128:
            java.lang.String r10 = "extra libs"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0155 }
            r11.<init>()     // Catch:{ all -> 0x0155 }
            java.lang.String r12 = "extra lbis error:"
            r11.append(r12)     // Catch:{ all -> 0x0155 }
            java.lang.String r12 = r9.toString()     // Catch:{ all -> 0x0155 }
            r11.append(r12)     // Catch:{ all -> 0x0155 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0155 }
            com.tencent.midas.comm.APLog.m161222w(r10, r11)     // Catch:{ all -> 0x0155 }
            java.lang.String r9 = getFullExceptionStacktrace(r9)     // Catch:{ all -> 0x0155 }
            installErrMsg = r9     // Catch:{ all -> 0x0155 }
            if (r8 == 0) goto L_0x014d
            r8.close()     // Catch:{ IOException -> 0x0150 }
        L_0x014d:
            if (r7 == 0) goto L_0x0150
            goto L_0x0117
        L_0x0150:
            java.lang.String r7 = installErrMsg     // Catch:{ IOException -> 0x0164 }
            if (r7 == 0) goto L_0x0067
            goto L_0x0162
        L_0x0155:
            r13 = move-exception
            r0 = r8
        L_0x0157:
            if (r0 == 0) goto L_0x015c
            r0.close()     // Catch:{ IOException -> 0x0161 }
        L_0x015c:
            if (r7 == 0) goto L_0x0161
            r7.close()     // Catch:{ IOException -> 0x0161 }
        L_0x0161:
            throw r13     // Catch:{ IOException -> 0x0164 }
        L_0x0162:
            r3 = 0
            goto L_0x016b
        L_0x0164:
            r13 = move-exception
            java.lang.String r13 = getFullExceptionStacktrace(r13)
            installErrMsg = r13
        L_0x016b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.midas.plugin.APPluginUtils.extractLibs(java.lang.String, java.lang.String):int");
    }

    private static String[] getAssetFileList(Context context) {
        try {
            if (fileList == null) {
                long currentTimeMillis = System.currentTimeMillis();
                fileList = context.getAssets().list("");
                APPluginReportManager.getInstance().insertTimeDataEx(APMidasTools.getCurrentThreadName(Thread.currentThread()), APPluginReportManager.MIDASPLUGIN_TIMENAME_GET_FILELIST_FROM_ASSETS, currentTimeMillis);
            }
        } catch (IOException e) {
            APLog.m161222w("APPLuginUtils", "getPluginNameFromAssets e:" + e.getMessage());
        }
        return fileList;
    }

    public static int getAssetsVersionCode(Context context) {
        InputStream inputStream = null;
        try {
            InputStream open = context.getAssets().open(APPluginConfig.KERNEL_FILE_NAME);
            int zipVersionCodeWtihStream = getZipVersionCodeWtihStream(context, open);
            if (open != null) {
                try {
                    open.close();
                } catch (IOException unused) {
                }
            }
            return zipVersionCodeWtihStream;
        } catch (Exception e) {
            installErrMsg = getFullExceptionStacktrace(e);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            APLog.m161214i("assets 目录下内核版本号：", "versionCode:0");
            return 0;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused3) {
                }
            }
            throw th;
        }
    }

    public static File getDataZipFile(Context context) {
        String path = APMidasPayAPI.getPath();
        if (TextUtils.isEmpty(path)) {
            return null;
        }
        APLog.m161214i("APPluginUtils", "getDataZipFile sPath:" + path);
        File file = new File(path);
        if (!file.getName().startsWith("MidasPay") || !file.getName().endsWith(".zip")) {
            return null;
        }
        return file;
    }

    public static String getExceptionInfo(Throwable th) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter, true));
        return stringWriter.getBuffer().toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0023 A[SYNTHETIC, Splitter:B:18:0x0023] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0028 A[Catch:{ IOException -> 0x002b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getFullExceptionStacktrace(java.lang.Throwable r3) {
        /*
            r0 = 0
            java.io.StringWriter r1 = new java.io.StringWriter     // Catch:{ all -> 0x001f }
            r1.<init>()     // Catch:{ all -> 0x001f }
            java.io.PrintWriter r2 = new java.io.PrintWriter     // Catch:{ all -> 0x001b }
            r2.<init>(r1)     // Catch:{ all -> 0x001b }
            r3.printStackTrace(r2)     // Catch:{ all -> 0x0019 }
            java.lang.String r3 = r1.toString()     // Catch:{ all -> 0x0019 }
            r1.close()     // Catch:{ IOException -> 0x0018 }
            r2.close()     // Catch:{ IOException -> 0x0018 }
        L_0x0018:
            return r3
        L_0x0019:
            r3 = move-exception
            goto L_0x001d
        L_0x001b:
            r3 = move-exception
            r2 = r0
        L_0x001d:
            r0 = r1
            goto L_0x0021
        L_0x001f:
            r3 = move-exception
            r2 = r0
        L_0x0021:
            if (r0 == 0) goto L_0x0026
            r0.close()     // Catch:{ IOException -> 0x002b }
        L_0x0026:
            if (r2 == 0) goto L_0x002b
            r2.close()     // Catch:{ IOException -> 0x002b }
        L_0x002b:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.midas.plugin.APPluginUtils.getFullExceptionStacktrace(java.lang.Throwable):java.lang.String");
    }

    public static String getInitErrorMsg() {
        return installErrMsg;
    }

    public static File getInstallPath(Context context, String str) {
        return APPluginInstallerAndUpdater.getInstallPath(context, str);
    }

    public static String getInstallPathString(Context context, String str) {
        return APPluginInstallerAndUpdater.getInstallPathString(context, str);
    }

    public static File getLibPath(Context context) {
        return APPluginConfig.getLibPath(context);
    }

    public static String getMD5FromPath(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(".apk");
        int lastIndexOf2 = str.lastIndexOf("_");
        if (lastIndexOf == -1 || lastIndexOf2 == -1) {
            return "";
        }
        try {
            return str.substring(lastIndexOf2 + 1, lastIndexOf);
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r0 = r3.getCanonicalPath();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getMidasCoreVersionName(android.content.Context r6) {
        /*
            java.io.File r0 = com.tencent.midas.plugin.APPluginConfig.getPluginPath(r6)
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x0028
            java.io.File[] r0 = r0.listFiles()
            r2 = 0
        L_0x000d:
            int r3 = r0.length
            if (r2 >= r3) goto L_0x0028
            r3 = r0[r2]
            java.lang.String r4 = r3.getName()
            java.lang.String r5 = "MidasCore"
            boolean r4 = r4.startsWith(r5)
            if (r4 == 0) goto L_0x0025
            java.lang.String r0 = r3.getCanonicalPath()     // Catch:{ IOException -> 0x0023 }
            goto L_0x0029
        L_0x0023:
            goto L_0x0028
        L_0x0025:
            int r2 = r2 + 1
            goto L_0x000d
        L_0x0028:
            r0 = r1
        L_0x0029:
            android.content.pm.PackageInfo r6 = getPackageInfo(r6, r0)
            if (r6 == 0) goto L_0x0031
            java.lang.String r1 = r6.versionName
        L_0x0031:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.midas.plugin.APPluginUtils.getMidasCoreVersionName(android.content.Context):java.lang.String");
    }

    public static ArrayList<String> getMidasEmptyPaht(Context context) {
        if (emptyResList == null) {
            emptyResList = new ArrayList<>();
            File pluginEmptyResPath = APPluginConfig.getPluginEmptyResPath(context);
            if (pluginEmptyResPath != null) {
                File[] listFiles = pluginEmptyResPath.listFiles();
                for (File file : listFiles) {
                    if (file.getName().startsWith("MidasEmptyRes") && file.getName().endsWith(".apk")) {
                        try {
                            emptyResList.add(file.getCanonicalPath());
                        } catch (IOException unused) {
                        }
                    }
                }
            }
        }
        return emptyResList;
    }

    public static PackageInfo getPackageInfo(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        PackageInfo packageInfo = APPluginInstallerAndUpdater.sPackageInfoMap.get(str);
        if (packageInfo == null && (packageInfo = packageManager.getPackageArchiveInfo(str, 128)) != null) {
            APPluginInstallerAndUpdater.sPackageInfoMap.put(str, packageInfo);
        }
        return packageInfo;
    }

    public static String getProcessName(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Application.getProcessName();
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return null;
        }
        for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
            if (next.pid == Process.myPid()) {
                return next.processName;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0035 A[SYNTHETIC, Splitter:B:18:0x0035] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0043 A[SYNTHETIC, Splitter:B:24:0x0043] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int getZipVersionCodeWtihFileName(android.content.Context r2, java.lang.String r3) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "sUnzipMidasPayFile:"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "getAssetsVersionCodeWtihFileName"
            com.tencent.midas.comm.APLog.m161214i(r1, r0)
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Exception -> 0x002c }
            r1.<init>(r3)     // Catch:{ Exception -> 0x002c }
            int r2 = getZipVersionCodeWtihStream(r2, r1)     // Catch:{ Exception -> 0x0027, all -> 0x0024 }
            r1.close()     // Catch:{ IOException -> 0x0023 }
        L_0x0023:
            return r2
        L_0x0024:
            r2 = move-exception
            r0 = r1
            goto L_0x0041
        L_0x0027:
            r2 = move-exception
            r0 = r1
            goto L_0x002d
        L_0x002a:
            r2 = move-exception
            goto L_0x0041
        L_0x002c:
            r2 = move-exception
        L_0x002d:
            java.lang.String r2 = getFullExceptionStacktrace(r2)     // Catch:{ all -> 0x002a }
            installErrMsg = r2     // Catch:{ all -> 0x002a }
            if (r0 == 0) goto L_0x0038
            r0.close()     // Catch:{ IOException -> 0x0038 }
        L_0x0038:
            java.lang.String r2 = "special data direct"
            java.lang.String r3 = "versionCode:0"
            com.tencent.midas.comm.APLog.m161214i(r2, r3)
            r2 = 0
            return r2
        L_0x0041:
            if (r0 == 0) goto L_0x0046
            r0.close()     // Catch:{ IOException -> 0x0046 }
        L_0x0046:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.midas.plugin.APPluginUtils.getZipVersionCodeWtihFileName(android.content.Context, java.lang.String):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0090 A[SYNTHETIC, Splitter:B:29:0x0090] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ac A[SYNTHETIC, Splitter:B:35:0x00ac] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int getZipVersionCodeWtihStream(android.content.Context r6, java.io.InputStream r7) {
        /*
            java.lang.String r6 = ".jar"
            java.lang.String r0 = "getAssetsVersionCodeWtihFileName"
            r1 = 0
            r2 = 0
            java.util.zip.ZipInputStream r3 = new java.util.zip.ZipInputStream     // Catch:{ Exception -> 0x0087 }
            r3.<init>(r7)     // Catch:{ Exception -> 0x0087 }
            java.util.zip.ZipEntry r7 = r3.getNextEntry()     // Catch:{ Exception -> 0x0082, all -> 0x007f }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0082, all -> 0x007f }
            r2.<init>()     // Catch:{ Exception -> 0x0082, all -> 0x007f }
            java.lang.String r4 = "zipEntry:"
            r2.append(r4)     // Catch:{ Exception -> 0x0082, all -> 0x007f }
            r2.append(r7)     // Catch:{ Exception -> 0x0082, all -> 0x007f }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0082, all -> 0x007f }
            com.tencent.midas.comm.APLog.m161214i(r0, r2)     // Catch:{ Exception -> 0x0082, all -> 0x007f }
        L_0x0023:
            if (r7 == 0) goto L_0x007b
            java.lang.String r2 = r7.getName()     // Catch:{ Exception -> 0x0082, all -> 0x007f }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0082, all -> 0x007f }
            r4.<init>()     // Catch:{ Exception -> 0x0082, all -> 0x007f }
            java.lang.String r5 = "fileName:"
            r4.append(r5)     // Catch:{ Exception -> 0x0082, all -> 0x007f }
            r4.append(r2)     // Catch:{ Exception -> 0x0082, all -> 0x007f }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0082, all -> 0x007f }
            com.tencent.midas.comm.APLog.m161214i(r0, r4)     // Catch:{ Exception -> 0x0082, all -> 0x007f }
            boolean r7 = r7.isDirectory()     // Catch:{ Exception -> 0x0082, all -> 0x007f }
            if (r7 != 0) goto L_0x0076
            java.lang.String r7 = "../"
            boolean r7 = r2.contains(r7)     // Catch:{ Exception -> 0x0082, all -> 0x007f }
            if (r7 == 0) goto L_0x004c
            goto L_0x0076
        L_0x004c:
            java.lang.String r7 = "MidasCore"
            boolean r7 = r2.startsWith(r7)     // Catch:{ Exception -> 0x0082, all -> 0x007f }
            if (r7 == 0) goto L_0x0071
            boolean r7 = r2.endsWith(r6)     // Catch:{ Exception -> 0x0082, all -> 0x007f }
            if (r7 == 0) goto L_0x0071
            int r6 = r2.lastIndexOf(r6)     // Catch:{ Exception -> 0x0082, all -> 0x007f }
            java.lang.String r6 = r2.substring(r1, r6)     // Catch:{ Exception -> 0x0082, all -> 0x007f }
            java.lang.String r7 = "_"
            java.lang.String[] r6 = r6.split(r7)     // Catch:{ Exception -> 0x0082, all -> 0x007f }
            r7 = 2
            r6 = r6[r7]     // Catch:{ Exception -> 0x0082, all -> 0x007f }
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ Exception -> 0x0082, all -> 0x007f }
            r1 = r6
            goto L_0x007b
        L_0x0071:
            java.util.zip.ZipEntry r7 = r3.getNextEntry()     // Catch:{ Exception -> 0x0082, all -> 0x007f }
            goto L_0x0023
        L_0x0076:
            java.util.zip.ZipEntry r7 = r3.getNextEntry()     // Catch:{ Exception -> 0x0082, all -> 0x007f }
            goto L_0x0023
        L_0x007b:
            r3.close()     // Catch:{ Exception -> 0x0093 }
            goto L_0x0093
        L_0x007f:
            r6 = move-exception
            r2 = r3
            goto L_0x00aa
        L_0x0082:
            r6 = move-exception
            r2 = r3
            goto L_0x0088
        L_0x0085:
            r6 = move-exception
            goto L_0x00aa
        L_0x0087:
            r6 = move-exception
        L_0x0088:
            java.lang.String r6 = getFullExceptionStacktrace(r6)     // Catch:{ all -> 0x0085 }
            installErrMsg = r6     // Catch:{ all -> 0x0085 }
            if (r2 == 0) goto L_0x0093
            r2.close()     // Catch:{ Exception -> 0x0093 }
        L_0x0093:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "versionCode:"
            r6.append(r7)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "special data direct"
            com.tencent.midas.comm.APLog.m161214i(r7, r6)
            return r1
        L_0x00aa:
            if (r2 == 0) goto L_0x00af
            r2.close()     // Catch:{ Exception -> 0x00af }
        L_0x00af:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.midas.plugin.APPluginUtils.getZipVersionCodeWtihStream(android.content.Context, java.io.InputStream):int");
    }

    private static boolean isHasBSL() {
        boolean z;
        try {
            Class.forName("com.tencent.theme.SkinEngine").getMethod("getInstances", new Class[0]);
            z = true;
        } catch (Exception e) {
            APLog.m161222w("APPluginContext", " is not has com.tencent.theme.SkinEngine e:" + e.toString());
            z = false;
        }
        if (z) {
            return z;
        }
        try {
            Class.forName("com.tencent.component.theme.SkinEngine").getMethod("getInstances", new Class[0]);
            return true;
        } catch (Exception e2) {
            APLog.m161222w("APPluginContext", " is not has com.tencent.component.theme.SkinEngine e:" + e2.toString());
            return false;
        }
    }

    public static boolean isInNewProcess(Context context) {
        String processName = getProcessName(context);
        String packageName = context.getApplicationContext().getPackageName();
        if (TextUtils.isEmpty(processName)) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(packageName);
        sb.append(XVFSFile.PATH_SEPARATOR);
        return processName.startsWith(sb.toString()) || !processName.equals(packageName);
    }

    public static void readSingInfo(HashMap<String, String> hashMap, File file) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file.getCanonicalPath()));
            APMidasRSATools aPMidasRSATools = new APMidasRSATools();
            String readLine = bufferedReader.readLine();
            while (true) {
                if (readLine == null) {
                    break;
                } else if (TextUtils.isEmpty(readLine)) {
                    break;
                } else {
                    String[] split = readLine.split("\\:");
                    String str = split[0];
                    String deCodeKey = aPMidasRSATools.deCodeKey(split[1]);
                    hashMap.put(str.split("\\_")[0], deCodeKey.substring(deCodeKey.length() - 32));
                    readLine = bufferedReader.readLine();
                }
            }
            bufferedReader.close();
        } catch (FileNotFoundException | IOException unused) {
        }
    }

    public static void readSingInfoItems(HashMap<String, APSignIniItem> hashMap, File file) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file.getCanonicalPath()));
            APMidasRSATools aPMidasRSATools = new APMidasRSATools();
            String readLine = bufferedReader.readLine();
            while (true) {
                if (readLine == null) {
                    break;
                } else if (TextUtils.isEmpty(readLine)) {
                    break;
                } else {
                    String[] split = readLine.split("\\:");
                    String str = split[0];
                    String deCodeKey = aPMidasRSATools.deCodeKey(split[1]);
                    String substring = deCodeKey.substring(deCodeKey.length() - 32);
                    String str2 = str.split("\\_")[0];
                    APSignIniItem aPSignIniItem = new APSignIniItem();
                    aPSignIniItem.name = str2;
                    aPSignIniItem.md5 = substring;
                    aPSignIniItem.fullName = split[0];
                    hashMap.put(str2, aPSignIniItem);
                    readLine = bufferedReader.readLine();
                }
            }
            bufferedReader.close();
        } catch (FileNotFoundException | IOException unused) {
        }
    }

    public static void release() {
        APPluginInstallerAndUpdater.sInstallPathMap.clear();
        APPluginInstallerAndUpdater.sPackageInfoMap.clear();
    }

    public static void showLaunchPluginFail(Context context, String str, boolean z) {
        APLog.m161210d(TAG, "Calling into showLaunchPluginFail, needToPureH5Pay = " + z + " caller = " + Thread.currentThread().getStackTrace()[3].toString());
        if (!TextUtils.isEmpty(str)) {
            APPluginReportManager.getInstance().reportImmediatelyOneRecord(APMidasPluginInfo.LAUNCH_INTERFACE_LAUNCHPAY, APPluginReportManager.MIDASPLUGIN_NAME_LAUNCH_ERROR, str);
        }
        if (z && !APWebJSBridgeActivity.startPureH5Pay(context, str, "showLaunchPluginFail")) {
            if (str != null && (str.contains("空间") || str.contains("Space"))) {
                Toast.makeText(context, "系统可用内存不足，请退出重试", 0).show();
            } else if (TextUtils.isEmpty(str) || (!str.contains("webview") && !str.contains("Webview"))) {
                Toast.makeText(context, "系统繁忙，请退出重试", 0).show();
            } else {
                Toast.makeText(context, "系统组件缺失，请退出重试", 0).show();
            }
            callbackInMidasPluginWithoutCaringAboutNewProcess(context, 100, "Unexpected error!");
        }
    }

    public static String toHexString(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i = 0; i < bArr.length; i++) {
            char[] cArr = HEX_DIGITS;
            sb.append(cArr[(bArr[i] & 240) >>> 4]);
            sb.append(cArr[bArr[i] & 15]);
        }
        return sb.toString();
    }

    public static void unInstallPlugin(Context context) {
        APLog.m161210d(TAG, "unInstallPlugin " + Thread.currentThread().getStackTrace()[3].toString());
        APPluginInstallerAndUpdater.unInstallPlugin(context);
    }

    public static void updateLibExtendNum() {
        APPluginConfig.libExtend++;
        APLog.m161214i("APPluginUtils", "updateLibExtendNum libExtend:" + APPluginConfig.libExtend);
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004a A[Catch:{ Exception -> 0x0056 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x004d A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.HashMap<java.lang.String, java.lang.String> url2Map(java.lang.String r9) {
        /*
            java.lang.String r0 = "\\="
            java.lang.String r1 = "url2Map"
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r3 = "\\?"
            java.lang.String[] r3 = r9.split(r3)
            if (r3 != 0) goto L_0x0013
            r9 = 0
            return r9
        L_0x0013:
            int r4 = r3.length
            r5 = 0
            r6 = 1
            if (r4 != r6) goto L_0x001b
            r9 = r3[r5]
            goto L_0x0021
        L_0x001b:
            int r4 = r3.length
            r7 = 2
            if (r4 != r7) goto L_0x0021
            r9 = r3[r6]
        L_0x0021:
            boolean r3 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Exception -> 0x0056 }
            if (r3 != 0) goto L_0x0050
            java.lang.String r3 = "\\&"
            java.lang.String[] r9 = r9.split(r3)     // Catch:{ Exception -> 0x0056 }
            java.lang.String r3 = ""
            r4 = r3
            r7 = 0
        L_0x0031:
            int r8 = r9.length     // Catch:{ Exception -> 0x0056 }
            if (r7 >= r8) goto L_0x005e
            r8 = r9[r7]     // Catch:{ Exception -> 0x0044 }
            java.lang.String[] r8 = r8.split(r0)     // Catch:{ Exception -> 0x0044 }
            r3 = r8[r5]     // Catch:{ Exception -> 0x0044 }
            r8 = r9[r7]     // Catch:{ Exception -> 0x0044 }
            java.lang.String[] r8 = r8.split(r0)     // Catch:{ Exception -> 0x0044 }
            r4 = r8[r6]     // Catch:{ Exception -> 0x0044 }
        L_0x0044:
            boolean r8 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x0056 }
            if (r8 != 0) goto L_0x004d
            r2.put(r3, r4)     // Catch:{ Exception -> 0x0056 }
        L_0x004d:
            int r7 = r7 + 1
            goto L_0x0031
        L_0x0050:
            java.lang.String r9 = "url后参数为空"
            com.tencent.midas.comm.APLog.m161214i(r1, r9)     // Catch:{ Exception -> 0x0056 }
            goto L_0x005e
        L_0x0056:
            r9 = move-exception
            java.lang.String r9 = r9.toString()
            com.tencent.midas.comm.APLog.m161222w(r1, r9)
        L_0x005e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.midas.plugin.APPluginUtils.url2Map(java.lang.String):java.util.HashMap");
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0050 A[SYNTHETIC, Splitter:B:38:0x0050] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0055 A[Catch:{ IOException -> 0x0058 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x005c A[SYNTHETIC, Splitter:B:47:0x005c] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0061 A[Catch:{ IOException -> 0x0064 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean copyFile(java.lang.String r4, java.lang.String r5, java.lang.String r6) {
        /*
            r0 = 0
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0059, all -> 0x004c }
            r2.<init>(r4)     // Catch:{ Exception -> 0x0059, all -> 0x004c }
            java.io.File r4 = new java.io.File     // Catch:{ Exception -> 0x0049, all -> 0x0045 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x0049, all -> 0x0045 }
            boolean r3 = r4.exists()     // Catch:{ Exception -> 0x0049, all -> 0x0045 }
            if (r3 != 0) goto L_0x0015
            r4.mkdir()     // Catch:{ Exception -> 0x0049, all -> 0x0045 }
        L_0x0015:
            java.io.File r4 = new java.io.File     // Catch:{ Exception -> 0x0049, all -> 0x0045 }
            r4.<init>(r5, r6)     // Catch:{ Exception -> 0x0049, all -> 0x0045 }
            boolean r5 = r4.exists()     // Catch:{ Exception -> 0x0049, all -> 0x0045 }
            if (r5 == 0) goto L_0x0024
            r2.close()     // Catch:{ IOException -> 0x0023 }
        L_0x0023:
            return r1
        L_0x0024:
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0049, all -> 0x0045 }
            r5.<init>(r4)     // Catch:{ Exception -> 0x0049, all -> 0x0045 }
            r4 = 8192(0x2000, float:1.14794E-41)
            byte[] r4 = new byte[r4]     // Catch:{ Exception -> 0x004a, all -> 0x0043 }
        L_0x002d:
            int r6 = r2.read(r4)     // Catch:{ Exception -> 0x004a, all -> 0x0043 }
            r0 = -1
            if (r6 == r0) goto L_0x0038
            r5.write(r4, r1, r6)     // Catch:{ Exception -> 0x004a, all -> 0x0043 }
            goto L_0x002d
        L_0x0038:
            r5.flush()     // Catch:{ Exception -> 0x004a, all -> 0x0043 }
            r4 = 1
            r2.close()     // Catch:{ IOException -> 0x0042 }
            r5.close()     // Catch:{ IOException -> 0x0042 }
        L_0x0042:
            return r4
        L_0x0043:
            r4 = move-exception
            goto L_0x0047
        L_0x0045:
            r4 = move-exception
            r5 = r0
        L_0x0047:
            r0 = r2
            goto L_0x004e
        L_0x0049:
            r5 = r0
        L_0x004a:
            r0 = r2
            goto L_0x005a
        L_0x004c:
            r4 = move-exception
            r5 = r0
        L_0x004e:
            if (r0 == 0) goto L_0x0053
            r0.close()     // Catch:{ IOException -> 0x0058 }
        L_0x0053:
            if (r5 == 0) goto L_0x0058
            r5.close()     // Catch:{ IOException -> 0x0058 }
        L_0x0058:
            throw r4
        L_0x0059:
            r5 = r0
        L_0x005a:
            if (r0 == 0) goto L_0x005f
            r0.close()     // Catch:{ IOException -> 0x0064 }
        L_0x005f:
            if (r5 == 0) goto L_0x0064
            r5.close()     // Catch:{ IOException -> 0x0064 }
        L_0x0064:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.midas.plugin.APPluginUtils.copyFile(java.lang.String, java.lang.String, java.lang.String):boolean");
    }
}
