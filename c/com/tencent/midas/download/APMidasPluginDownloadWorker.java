package com.tencent.midas.download;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.midas.comm.APLog;
import com.tencent.midas.plugin.APPluginConfig;
import com.tencent.midas.plugin.APPluginUtils;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

class APMidasPluginDownloadWorker implements Runnable {
    private static final String TAG = "PluginDownloadWorker";
    private final Context context;
    private final ArrayList<APMidasPluginDownInfo> downInfos;
    private final IAPMidasPluginDownListener downListener;
    private final File saveDir;

    public APMidasPluginDownloadWorker(Context context2, ArrayList<APMidasPluginDownInfo> arrayList, File file, IAPMidasPluginDownListener iAPMidasPluginDownListener) {
        this.downInfos = arrayList;
        this.saveDir = file;
        this.downListener = iAPMidasPluginDownListener;
        this.context = context2;
    }

    private static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:80|81|82|83) */
    /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
        com.tencent.midas.comm.APLog.m161212e(TAG, "download single down info fail! File name = " + r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0319, code lost:
        closeQuietly((java.io.Closeable) null);
        closeQuietly(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x031f, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0320, code lost:
        r12 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:80:0x0305 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean downloadSingleDownInfo(com.tencent.midas.download.APMidasPluginDownInfo r12) {
        /*
            r11 = this;
            java.lang.String r0 = "/Tencent/MidasPay/"
            java.lang.String r1 = "File name = "
            r2 = 0
            java.lang.String r3 = "PluginDownloadWorker"
            if (r12 != 0) goto L_0x000f
            java.lang.String r12 = "Cannot download down info, info is null!"
            com.tencent.midas.comm.APLog.m161212e(r3, r12)
            return r2
        L_0x000f:
            java.lang.String r4 = r12.full_url
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x001d
            java.lang.String r12 = "Cannot download down info, info's url is empty!"
            com.tencent.midas.comm.APLog.m161212e(r3, r12)
            return r2
        L_0x001d:
            java.lang.String r4 = r12.name
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x002b
            java.lang.String r12 = "Cannot download down info, info's name is empty!"
            com.tencent.midas.comm.APLog.m161212e(r3, r12)
            return r2
        L_0x002b:
            java.lang.String r4 = r12.name
            java.lang.String r5 = ".apk"
            boolean r4 = r4.endsWith(r5)
            if (r4 != 0) goto L_0x005c
            java.lang.String r4 = r12.name
            java.lang.String r6 = ".Apk"
            boolean r4 = r4.endsWith(r6)
            if (r4 != 0) goto L_0x005c
            java.lang.String r4 = r12.name
            java.lang.String r6 = ".APK"
            boolean r4 = r4.endsWith(r6)
            if (r4 == 0) goto L_0x004a
            goto L_0x005c
        L_0x004a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = r12.name
            r4.append(r6)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            goto L_0x005e
        L_0x005c:
            java.lang.String r4 = r12.name
        L_0x005e:
            android.content.Context r5 = r11.context
            java.lang.String r6 = r12.new_md5_decode
            java.io.File r7 = r11.saveDir
            java.lang.String r7 = r7.getAbsolutePath()
            boolean r5 = isPluginAlreadyExist(r5, r4, r6, r7)
            r6 = 1
            if (r5 == 0) goto L_0x0084
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "plugin already test, no need to download! name = "
            r12.append(r0)
            r12.append(r4)
            java.lang.String r12 = r12.toString()
            com.tencent.midas.comm.APLog.m161210d(r3, r12)
            return r6
        L_0x0084:
            java.io.File r5 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ Exception -> 0x0150 }
            java.lang.String r5 = r5.getCanonicalPath()     // Catch:{ Exception -> 0x0150 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0150 }
            r7.<init>()     // Catch:{ Exception -> 0x0150 }
            r7.append(r5)     // Catch:{ Exception -> 0x0150 }
            r7.append(r0)     // Catch:{ Exception -> 0x0150 }
            java.lang.String r5 = r7.toString()     // Catch:{ Exception -> 0x0150 }
            java.io.File r7 = new java.io.File     // Catch:{ Exception -> 0x0150 }
            r7.<init>(r5, r4)     // Catch:{ Exception -> 0x0150 }
            boolean r5 = r7.exists()     // Catch:{ Exception -> 0x0150 }
            if (r5 == 0) goto L_0x0138
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0150 }
            r5.<init>()     // Catch:{ Exception -> 0x0150 }
            r5.append(r1)     // Catch:{ Exception -> 0x0150 }
            r5.append(r4)     // Catch:{ Exception -> 0x0150 }
            java.lang.String r8 = " already exist in sdcard! We can copy from it, no need to download, but need to check md5!"
            r5.append(r8)     // Catch:{ Exception -> 0x0150 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0150 }
            com.tencent.midas.comm.APLog.m161210d(r3, r5)     // Catch:{ Exception -> 0x0150 }
            java.lang.String r5 = r7.getAbsolutePath()     // Catch:{ Exception -> 0x0150 }
            java.lang.String r8 = r12.new_md5_decode     // Catch:{ Exception -> 0x0150 }
            boolean r5 = com.tencent.midas.plugin.APPluginUtils.checkFileMD5(r5, r8)     // Catch:{ Exception -> 0x0150 }
            if (r5 == 0) goto L_0x0120
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0150 }
            r5.<init>()     // Catch:{ Exception -> 0x0150 }
            r5.append(r1)     // Catch:{ Exception -> 0x0150 }
            r5.append(r4)     // Catch:{ Exception -> 0x0150 }
            java.lang.String r8 = " already exist in sdcard! We can copy from it, no need to download, md5 ok too!"
            r5.append(r8)     // Catch:{ Exception -> 0x0150 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0150 }
            com.tencent.midas.comm.APLog.m161210d(r3, r5)     // Catch:{ Exception -> 0x0150 }
            java.lang.String r5 = r7.getAbsolutePath()     // Catch:{ Exception -> 0x0150 }
            java.io.File r7 = r11.saveDir     // Catch:{ Exception -> 0x0150 }
            java.lang.String r7 = r7.getAbsolutePath()     // Catch:{ Exception -> 0x0150 }
            boolean r5 = com.tencent.midas.plugin.APPluginUtils.copyFile(r5, r7, r4)     // Catch:{ Exception -> 0x0150 }
            if (r5 == 0) goto L_0x0108
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0150 }
            r5.<init>()     // Catch:{ Exception -> 0x0150 }
            r5.append(r1)     // Catch:{ Exception -> 0x0150 }
            r5.append(r4)     // Catch:{ Exception -> 0x0150 }
            java.lang.String r7 = " already exist in sdcard! We can copy from it, no need to download, md5 ok too! Copy success!"
            r5.append(r7)     // Catch:{ Exception -> 0x0150 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0150 }
            com.tencent.midas.comm.APLog.m161210d(r3, r5)     // Catch:{ Exception -> 0x0150 }
            return r6
        L_0x0108:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0150 }
            r5.<init>()     // Catch:{ Exception -> 0x0150 }
            r5.append(r1)     // Catch:{ Exception -> 0x0150 }
            r5.append(r4)     // Catch:{ Exception -> 0x0150 }
            java.lang.String r7 = " already exist in sdcard! We can copy from it, no need to download, md5 ok too! Copy fail!"
            r5.append(r7)     // Catch:{ Exception -> 0x0150 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0150 }
            com.tencent.midas.comm.APLog.m161210d(r3, r5)     // Catch:{ Exception -> 0x0150 }
            goto L_0x016b
        L_0x0120:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0150 }
            r5.<init>()     // Catch:{ Exception -> 0x0150 }
            r5.append(r1)     // Catch:{ Exception -> 0x0150 }
            r5.append(r4)     // Catch:{ Exception -> 0x0150 }
            java.lang.String r7 = " already exist in sdcard! We can copy from it, no need to download, but md5 not ok!"
            r5.append(r7)     // Catch:{ Exception -> 0x0150 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0150 }
            com.tencent.midas.comm.APLog.m161210d(r3, r5)     // Catch:{ Exception -> 0x0150 }
            goto L_0x016b
        L_0x0138:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0150 }
            r5.<init>()     // Catch:{ Exception -> 0x0150 }
            r5.append(r1)     // Catch:{ Exception -> 0x0150 }
            r5.append(r4)     // Catch:{ Exception -> 0x0150 }
            java.lang.String r7 = " not exist in sdcard! Cannot copy from it, we need to download!"
            r5.append(r7)     // Catch:{ Exception -> 0x0150 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0150 }
            com.tencent.midas.comm.APLog.m161210d(r3, r5)     // Catch:{ Exception -> 0x0150 }
            goto L_0x016b
        L_0x0150:
            r5 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r1)
            r7.append(r4)
            java.lang.String r8 = " copy from sdcard got exception "
            r7.append(r8)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            com.tencent.midas.comm.APLog.m161210d(r3, r5)
        L_0x016b:
            java.lang.String r12 = r12.full_url
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "download single down info! Start to down url = "
            r5.append(r7)
            r5.append(r12)
            java.lang.String r5 = r5.toString()
            com.tencent.midas.comm.APLog.m161210d(r3, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "download single down info! Start to down file name = "
            r5.append(r7)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            com.tencent.midas.comm.APLog.m161210d(r3, r5)
            java.io.File r5 = new java.io.File
            java.io.File r7 = r11.saveDir
            r5.<init>(r7, r4)
            boolean r7 = r5.exists()
            if (r7 == 0) goto L_0x01d9
            boolean r7 = r5.delete()
            if (r7 != 0) goto L_0x01c1
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "File already exist test, cannot delete old file, file = "
            r12.append(r0)
            java.lang.String r0 = r5.getAbsolutePath()
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            com.tencent.midas.comm.APLog.m161212e(r3, r12)
            return r2
        L_0x01c1:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "download single down info! file name already exist, delete it successfully = "
            r7.append(r8)
            java.lang.String r8 = r5.getAbsolutePath()
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.tencent.midas.comm.APLog.m161222w(r3, r7)
        L_0x01d9:
            r7 = 0
            java.net.URL r8 = new java.net.URL     // Catch:{ Exception -> 0x0304, all -> 0x0301 }
            r8.<init>(r12)     // Catch:{ Exception -> 0x0304, all -> 0x0301 }
            java.net.URLConnection r12 = r8.openConnection()     // Catch:{ Exception -> 0x0304, all -> 0x0301 }
            java.net.HttpURLConnection r12 = (java.net.HttpURLConnection) r12     // Catch:{ Exception -> 0x0304, all -> 0x0301 }
            r8 = 45000(0xafc8, float:6.3058E-41)
            r12.setConnectTimeout(r8)     // Catch:{ Exception -> 0x0304, all -> 0x0301 }
            r12.setReadTimeout(r8)     // Catch:{ Exception -> 0x0304, all -> 0x0301 }
            java.lang.String r8 = "GET"
            r12.setRequestMethod(r8)     // Catch:{ Exception -> 0x0304, all -> 0x0301 }
            r12.setDoOutput(r6)     // Catch:{ Exception -> 0x0304, all -> 0x0301 }
            r12.setUseCaches(r2)     // Catch:{ Exception -> 0x0304, all -> 0x0301 }
            java.lang.String r8 = "Connection"
            java.lang.String r9 = "Keep-Alive"
            r12.setRequestProperty(r8, r9)     // Catch:{ Exception -> 0x0304, all -> 0x0301 }
            java.lang.String r8 = "Content-Type"
            java.lang.String r9 = "application/x-www-form-urlencoded"
            r12.setRequestProperty(r8, r9)     // Catch:{ Exception -> 0x0304, all -> 0x0301 }
            r12.connect()     // Catch:{ Exception -> 0x0304, all -> 0x0301 }
            int r8 = r12.getResponseCode()     // Catch:{ Exception -> 0x0304, all -> 0x0301 }
            r9 = 200(0xc8, float:2.8E-43)
            if (r8 == r9) goto L_0x022d
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0304, all -> 0x0301 }
            r12.<init>()     // Catch:{ Exception -> 0x0304, all -> 0x0301 }
            java.lang.String r0 = "Cannot download file, http code not 200! Code = "
            r12.append(r0)     // Catch:{ Exception -> 0x0304, all -> 0x0301 }
            r12.append(r8)     // Catch:{ Exception -> 0x0304, all -> 0x0301 }
            java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x0304, all -> 0x0301 }
            com.tencent.midas.comm.APLog.m161212e(r3, r12)     // Catch:{ Exception -> 0x0304, all -> 0x0301 }
            closeQuietly(r7)
            closeQuietly(r7)
            return r2
        L_0x022d:
            boolean r8 = r5.createNewFile()     // Catch:{ Exception -> 0x0304, all -> 0x0301 }
            if (r8 != 0) goto L_0x0252
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0304, all -> 0x0301 }
            r12.<init>()     // Catch:{ Exception -> 0x0304, all -> 0x0301 }
            java.lang.String r0 = "Cannot download file, fail to create file! File = "
            r12.append(r0)     // Catch:{ Exception -> 0x0304, all -> 0x0301 }
            java.lang.String r0 = r5.getAbsolutePath()     // Catch:{ Exception -> 0x0304, all -> 0x0301 }
            r12.append(r0)     // Catch:{ Exception -> 0x0304, all -> 0x0301 }
            java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x0304, all -> 0x0301 }
            com.tencent.midas.comm.APLog.m161212e(r3, r12)     // Catch:{ Exception -> 0x0304, all -> 0x0301 }
            closeQuietly(r7)
            closeQuietly(r7)
            return r2
        L_0x0252:
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0304, all -> 0x0301 }
            r8.<init>(r5)     // Catch:{ Exception -> 0x0304, all -> 0x0301 }
            java.io.InputStream r7 = r12.getInputStream()     // Catch:{ Exception -> 0x0305 }
            r12 = 2048(0x800, float:2.87E-42)
            byte[] r12 = new byte[r12]     // Catch:{ Exception -> 0x0305 }
        L_0x025f:
            int r9 = r7.read(r12)     // Catch:{ Exception -> 0x0305 }
            r10 = -1
            if (r9 == r10) goto L_0x026a
            r8.write(r12, r2, r9)     // Catch:{ Exception -> 0x0305 }
            goto L_0x025f
        L_0x026a:
            r8.flush()     // Catch:{ Exception -> 0x0305 }
            closeQuietly(r7)
            closeQuietly(r8)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r2 = "download single down info success! File name = "
            r12.append(r2)
            r12.append(r4)
            java.lang.String r2 = " About to copy to sdcard!"
            r12.append(r2)
            java.lang.String r12 = r12.toString()
            com.tencent.midas.comm.APLog.m161210d(r3, r12)
            java.io.File r12 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ Exception -> 0x02e5 }
            java.lang.String r12 = r12.getCanonicalPath()     // Catch:{ Exception -> 0x02e5 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02e5 }
            r2.<init>()     // Catch:{ Exception -> 0x02e5 }
            r2.append(r12)     // Catch:{ Exception -> 0x02e5 }
            r2.append(r0)     // Catch:{ Exception -> 0x02e5 }
            java.lang.String r12 = r2.toString()     // Catch:{ Exception -> 0x02e5 }
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x02e5 }
            r0.<init>(r12, r4)     // Catch:{ Exception -> 0x02e5 }
            boolean r0 = r0.exists()     // Catch:{ Exception -> 0x02e5 }
            if (r0 == 0) goto L_0x02c6
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02e5 }
            r12.<init>()     // Catch:{ Exception -> 0x02e5 }
            r12.append(r1)     // Catch:{ Exception -> 0x02e5 }
            r12.append(r4)     // Catch:{ Exception -> 0x02e5 }
            java.lang.String r0 = " already exist in sdcard! No need to copy!"
            r12.append(r0)     // Catch:{ Exception -> 0x02e5 }
            java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x02e5 }
            com.tencent.midas.comm.APLog.m161210d(r3, r12)     // Catch:{ Exception -> 0x02e5 }
            return r6
        L_0x02c6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02e5 }
            r0.<init>()     // Catch:{ Exception -> 0x02e5 }
            r0.append(r1)     // Catch:{ Exception -> 0x02e5 }
            r0.append(r4)     // Catch:{ Exception -> 0x02e5 }
            java.lang.String r2 = " not exist in sdcard! Need to copy!"
            r0.append(r2)     // Catch:{ Exception -> 0x02e5 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x02e5 }
            com.tencent.midas.comm.APLog.m161210d(r3, r0)     // Catch:{ Exception -> 0x02e5 }
            java.lang.String r0 = r5.getAbsolutePath()     // Catch:{ Exception -> 0x02e5 }
            com.tencent.midas.plugin.APPluginUtils.copyFile(r0, r12, r4)     // Catch:{ Exception -> 0x02e5 }
            goto L_0x0300
        L_0x02e5:
            r12 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = " copy to sdcard got exception "
            r0.append(r1)
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            com.tencent.midas.comm.APLog.m161210d(r3, r12)
        L_0x0300:
            return r6
        L_0x0301:
            r12 = move-exception
            r8 = r7
            goto L_0x0321
        L_0x0304:
            r8 = r7
        L_0x0305:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0320 }
            r12.<init>()     // Catch:{ all -> 0x0320 }
            java.lang.String r0 = "download single down info fail! File name = "
            r12.append(r0)     // Catch:{ all -> 0x0320 }
            r12.append(r4)     // Catch:{ all -> 0x0320 }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x0320 }
            com.tencent.midas.comm.APLog.m161212e(r3, r12)     // Catch:{ all -> 0x0320 }
            closeQuietly(r7)
            closeQuietly(r8)
            return r2
        L_0x0320:
            r12 = move-exception
        L_0x0321:
            closeQuietly(r7)
            closeQuietly(r8)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.midas.download.APMidasPluginDownloadWorker.downloadSingleDownInfo(com.tencent.midas.download.APMidasPluginDownInfo):boolean");
    }

    private static boolean isPluginAlreadyExist(Context context2, String str, String str2, String str3) {
        APLog.m161210d(TAG, "plugin already exist in midasplugins test, file name = " + str);
        APLog.m161210d(TAG, "plugin already exist in midasplugins test, md5 = " + str2);
        if (TextUtils.isEmpty(str)) {
            APLog.m161212e(TAG, "plugin already exist in midasplugins test error, empty file name!");
            return false;
        } else if (TextUtils.isEmpty(str2)) {
            APLog.m161212e(TAG, "plugin already exist in midasplugins test error, empty md5!");
            return false;
        } else if (context2 == null) {
            APLog.m161212e(TAG, "plugin already exist in midasplugins test error, null context!");
            return false;
        } else if (TextUtils.isEmpty(str3)) {
            APLog.m161212e(TAG, "plugin already exist in midasplugins test error, empty saveDir!");
            return false;
        } else {
            File pluginPath = APPluginConfig.getPluginPath(context2);
            if (pluginPath == null) {
                APLog.m161212e(TAG, "plugin already exist in midasplugins error, cannot get plugin path!");
                return false;
            }
            File file = new File(pluginPath, str);
            if (!file.exists()) {
                APLog.m161210d(TAG, "plugin already exist in midasplugins test, plugin not exist! Name = " + str);
                return false;
            }
            try {
                if (APPluginUtils.checkFileMD5(file.getCanonicalPath(), str2)) {
                    APLog.m161210d(TAG, "plugin already exist in midasplugins test, plugin exist & md5 correct!");
                    if (APPluginUtils.copyFile(file.getCanonicalPath(), str3, str)) {
                        APLog.m161210d(TAG, "plugin already exist in midasplugins test, plugin exist & md5 correct & copy success!");
                        return true;
                    }
                    APLog.m161212e(TAG, "plugin already exist in midasplugins test, plugin exist & md5 correct & copy fail!");
                } else {
                    APLog.m161210d(TAG, "plugin already exist in midasplugins test, plugin exist & md5 not correct!");
                }
            } catch (IOException e) {
                APLog.m161210d(TAG, "plugin already exist in midasplugins test error, exception = " + e);
            }
            APLog.m161212e(TAG, "plugin already exist in midasplugins test, final false!");
            return false;
        }
    }

    public void run() {
        APLog.m161210d(TAG, "About to enter critical region！");
        synchronized (APMidasPluginDownloadWorker.class) {
            APLog.m161210d(TAG, "Enter critical region！");
            if (this.downListener == null) {
                APLog.m161212e(TAG, "Cannot start plugin down worker, null downListener!");
                return;
            }
            ArrayList<APMidasPluginDownInfo> arrayList = this.downInfos;
            if (arrayList != null) {
                if (!arrayList.isEmpty()) {
                    if (this.context == null) {
                        APLog.m161212e(TAG, "Cannot start plugin down worker, null context!");
                        this.downListener.onDownloadFail(-8);
                        return;
                    }
                    File file = this.saveDir;
                    if (file == null) {
                        APLog.m161212e(TAG, "Cannot start plugin down worker, null save dir!");
                        this.downListener.onDownloadFail(-6);
                        return;
                    } else if (!file.isDirectory()) {
                        APLog.m161212e(TAG, "Cannot start plugin down worker, save dir not directory!");
                        this.downListener.onDownloadFail(-7);
                        return;
                    } else if (APMidasPluginDownloadUtils.checkIniFileExist(this.saveDir)) {
                        APLog.m161210d(TAG, "MidasSign.ini already exists, no need to download again!");
                        this.downListener.onDownloadFail(-2);
                        return;
                    } else {
                        APLog.m161210d(TAG, "MidasSign.ini not exists, start to download again!");
                        APPluginUtils.clearDirContent(this.saveDir);
                        if (this.saveDir.exists() || this.saveDir.mkdirs()) {
                            Iterator<APMidasPluginDownInfo> it = this.downInfos.iterator();
                            while (it.hasNext()) {
                                APMidasPluginDownInfo next = it.next();
                                if (!downloadSingleDownInfo(next)) {
                                    this.downListener.onDownloadFail(-4);
                                    APLog.m161210d(TAG, "File name = " + next.name + " download fail, about to clear download dir!");
                                    APPluginUtils.clearDirContent(this.saveDir);
                                    return;
                                }
                            }
                            this.downListener.onDownloadSuccess();
                            APLog.m161210d(TAG, "About to leave critical region");
                            APLog.m161210d(TAG, "Leave critical region");
                            return;
                        }
                        APLog.m161212e(TAG, "Cannot start plugin down worker, save dir not exist and cannot create it!");
                        this.downListener.onDownloadFail(-3);
                        return;
                    }
                }
            }
            APLog.m161212e(TAG, "Cannot start plugin down worker, empty down list!");
            this.downListener.onDownloadFail(-5);
        }
    }
}
