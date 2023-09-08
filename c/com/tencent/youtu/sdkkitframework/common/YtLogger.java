package com.tencent.youtu.sdkkitframework.common;

import android.os.Environment;
import android.util.Log;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class YtLogger {
    public static final int DEBUG_LEVEL = 4;
    public static final int ERROR_LEVEL = 0;
    public static final int INFO_LEVEL = 2;
    public static final int VERB_LEVEL = 5;
    public static final int WARN_LEVEL = 1;
    private static int currentLogLevel = 0;
    private static DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss.SSS");
    private static File localFile = null;
    private static String localLogName = "youtu_log";
    private static IYtLoggerListener loggerListener;
    private static ExecutorService mExecutorService = Executors.newSingleThreadExecutor();
    private static boolean needLogFile;

    public interface IYtLoggerListener {
        void log(String str, String str2);
    }

    private static String buildMessage(String str, String str2, Throwable th) {
        String str3 = localLogName;
        if (str3 != null && !"".equals(str3) && needLogFile) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(str2);
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(dateFormat.format(new Date()));
            stringBuffer2.append("    ");
            stringBuffer2.append("    ");
            stringBuffer2.append(str);
            stringBuffer2.append("    ");
            stringBuffer2.append(stringBuffer);
            if (th != null) {
                stringBuffer2.append(System.getProperty("line.separator"));
                stringBuffer2.append(Log.getStackTraceString(th));
            }
            save2File(stringBuffer2.toString());
        }
        return str2;
    }

    /* renamed from: d */
    public static void m106578d(String str, Object obj) {
        if (currentLogLevel >= 4) {
            showLog(str, "[YoutuLog]-[DEBUG]-" + obj);
        }
    }

    /* renamed from: e */
    public static void m106579e(String str, String str2) {
        if (currentLogLevel >= 0) {
            showLog(str, "[YoutuLog]-[ERROR]-" + str2);
        }
    }

    private static File getLogFile(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory());
        String str2 = File.separator;
        sb.append(str2);
        sb.append("youtulog");
        sb.append(str2);
        sb.append(str);
        File file = new File(sb.toString());
        if (!file.exists() && !file.mkdirs()) {
            return null;
        }
        File file2 = new File(file.getPath() + str2 + (dateFormat.format(new Date()) + ".log"));
        if (!file2.exists()) {
            try {
                file2.createNewFile();
            } catch (Exception unused) {
            }
        }
        return file2;
    }

    /* renamed from: i */
    public static void m106580i(String str, String str2) {
        if (currentLogLevel >= 2) {
            showLog(str, "[YoutuLog]-[INFO]-" + str2);
        }
    }

    private static void save2File(String str) {
        File file = localFile;
        if (file != null) {
            writeFile(file, str);
        }
    }

    public static void setLogLevel(int i) {
        currentLogLevel = Math.min(i, Math.max(i, 0));
    }

    public static void setLoggerListener(IYtLoggerListener iYtLoggerListener) {
        loggerListener = iYtLoggerListener;
    }

    public static void setNeedLogFile(boolean z, String str) {
        needLogFile = z;
        if (z) {
            localLogName = str;
            localFile = getLogFile(str);
        }
    }

    private static void showLog(String str, String str2) {
        IYtLoggerListener iYtLoggerListener = loggerListener;
        if (iYtLoggerListener != null) {
            iYtLoggerListener.log(str, str2);
        }
        buildMessage(str, str2, (Throwable) null);
    }

    /* renamed from: v */
    public static void m106581v(String str, Object obj) {
        if (currentLogLevel >= 5) {
            showLog(str, "[YoutuLog]-[VERB]-" + obj);
        }
    }

    /* renamed from: w */
    public static void m106582w(String str, String str2) {
        if (currentLogLevel >= 1) {
            showLog(str, "[YoutuLog]-[WARN]-" + str2);
        }
    }

    private static void writeFile(final File file, final String str) {
        mExecutorService.submit(new Runnable() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0029  */
            /* JADX WARNING: Removed duplicated region for block: B:16:0x002f  */
            /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r7 = this;
                    r0 = 0
                    java.io.PrintWriter r1 = new java.io.PrintWriter     // Catch:{ Exception -> 0x002d, all -> 0x0023 }
                    java.io.BufferedWriter r2 = new java.io.BufferedWriter     // Catch:{ Exception -> 0x002d, all -> 0x0023 }
                    java.io.FileWriter r3 = new java.io.FileWriter     // Catch:{ Exception -> 0x002d, all -> 0x0023 }
                    java.io.File r4 = r2     // Catch:{ Exception -> 0x002d, all -> 0x0023 }
                    r5 = 1
                    r3.<init>(r4, r5)     // Catch:{ Exception -> 0x002d, all -> 0x0023 }
                    r2.<init>(r3)     // Catch:{ Exception -> 0x002d, all -> 0x0023 }
                    r1.<init>(r2)     // Catch:{ Exception -> 0x002d, all -> 0x0023 }
                    java.lang.String r0 = r3     // Catch:{ Exception -> 0x0021, all -> 0x001f }
                    r1.println(r0)     // Catch:{ Exception -> 0x0021, all -> 0x001f }
                    r1.flush()     // Catch:{ Exception -> 0x0021, all -> 0x001f }
                    r1.close()
                    goto L_0x0032
                L_0x001f:
                    r0 = move-exception
                    goto L_0x0027
                L_0x0021:
                    r0 = r1
                    goto L_0x002d
                L_0x0023:
                    r1 = move-exception
                    r6 = r1
                    r1 = r0
                    r0 = r6
                L_0x0027:
                    if (r1 == 0) goto L_0x002c
                    r1.close()
                L_0x002c:
                    throw r0
                L_0x002d:
                    if (r0 == 0) goto L_0x0032
                    r0.close()
                L_0x0032:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.youtu.sdkkitframework.common.YtLogger.C860771.run():void");
            }
        });
    }
}
