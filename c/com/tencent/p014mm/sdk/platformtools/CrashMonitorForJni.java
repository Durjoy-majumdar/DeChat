package com.tencent.p014mm.sdk.platformtools;

import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;
import java.util.Set;

/* renamed from: com.tencent.mm.sdk.platformtools.CrashMonitorForJni */
public class CrashMonitorForJni {
    private static final String TAG = "MicroMsg.CrashMonitorForJni";
    private static ParcelFileDescriptor mCrashRecordFd;
    private static CrashExtraMessageGetter sCrashExtraMessageGetter;

    /* renamed from: com.tencent.mm.sdk.platformtools.CrashMonitorForJni$CrashExtraMessageGetter */
    public interface CrashExtraMessageGetter {
        String getExtraMessage();
    }

    private static void OnCrash(int i, int i2, String str) {
        CrashReportFactory.reportJniCrash(i, str, "CrashMonitor");
        Log.appenderClose();
    }

    private static CharSequence getAllThreadJavaStack() {
        StringBuilder sb = new StringBuilder(8192);
        StringBuilder sb4 = new StringBuilder(2048);
        for (Map.Entry next : Thread.getAllStackTraces().entrySet()) {
            Thread thread = (Thread) next.getKey();
            StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) next.getValue();
            sb4.setLength(0);
            sb4.append("\n (");
            sb4.append(thread.getId());
            sb4.append(") [");
            sb4.append(thread.getName());
            sb4.append("] ************\n");
            boolean z = false;
            for (int i = 0; i < stackTraceElementArr.length; i++) {
                if (stackTraceElementArr[i].toString().startsWith("com.tencent.mm.")) {
                    z = true;
                }
                sb4.append("\tat ");
                sb4.append(stackTraceElementArr[i].toString());
                sb4.append("\n");
            }
            if (z) {
                sb.append(sb4);
            }
        }
        return sb;
    }

    public static native String getCrashFilePath(String str);

    public static String getCrashThreadJavaStack() {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        CrashExtraMessageGetter crashExtraMessageGetter = sCrashExtraMessageGetter;
        if (crashExtraMessageGetter != null) {
            printWriter.append("\n");
            printWriter.append(crashExtraMessageGetter.getExtraMessage());
            printWriter.append("\n");
        }
        Throwable th = new Throwable("\n******* Java stack for JNI crash *******");
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (stackTrace.length > 1) {
            int length = stackTrace.length - 1;
            StackTraceElement[] stackTraceElementArr = new StackTraceElement[length];
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                stackTraceElementArr[i] = stackTrace[i2];
                i = i2;
            }
            th.setStackTrace(stackTraceElementArr);
        }
        th.printStackTrace(printWriter);
        printWriter.append(getAllThreadJavaStack());
        printWriter.append(10);
        return stringWriter.toString();
    }

    public static Thread getThreadByName(String str) {
        Thread thread = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Set<Thread> keySet = Thread.getAllStackTraces().keySet();
        for (Thread thread2 : (Thread[]) keySet.toArray(new Thread[keySet.size()])) {
            if (thread2.getName().equals(str)) {
                thread = thread2;
            }
        }
        return thread;
    }

    public static String getThreadJavaStack(Thread thread) {
        if (thread == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : thread.getStackTrace()) {
            sb.append(stackTraceElement.toString() + "\n");
        }
        return sb.toString();
    }

    private static native void nativeSetCrashRecordLowFd(int i);

    public static native void nativeStartCrashTest(int i);

    public static native void setClientVersionMsg(String str);

    public static void setCrashExtraMessageGetter(CrashExtraMessageGetter crashExtraMessageGetter) {
        sCrashExtraMessageGetter = crashExtraMessageGetter;
    }

    public static void setCrashRecordLowFd(ParcelFileDescriptor parcelFileDescriptor) {
        mCrashRecordFd = parcelFileDescriptor;
        nativeSetCrashRecordLowFd(parcelFileDescriptor.getFd());
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void writeStackToFile(java.lang.String r3) {
        /*
            r0 = 0
            android.os.ParcelFileDescriptor r1 = mCrashRecordFd     // Catch:{ all -> 0x0024 }
            if (r1 == 0) goto L_0x001e
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ all -> 0x0024 }
            android.os.ParcelFileDescriptor r2 = mCrashRecordFd     // Catch:{ all -> 0x0024 }
            java.io.FileDescriptor r2 = r2.getFileDescriptor()     // Catch:{ all -> 0x0024 }
            r1.<init>(r2)     // Catch:{ all -> 0x0024 }
            byte[] r3 = r3.getBytes()     // Catch:{ all -> 0x001c }
            r1.write(r3)     // Catch:{ all -> 0x001c }
            r1.flush()     // Catch:{ all -> 0x001c }
            r0 = r1
            goto L_0x001e
        L_0x001c:
            r0 = r1
            goto L_0x0024
        L_0x001e:
            if (r0 == 0) goto L_0x0027
        L_0x0020:
            r0.close()     // Catch:{ all -> 0x0027 }
            goto L_0x0027
        L_0x0024:
            if (r0 == 0) goto L_0x0027
            goto L_0x0020
        L_0x0027:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.platformtools.CrashMonitorForJni.writeStackToFile(java.lang.String):void");
    }

    private static void OnCrash(int i, int i2, String str, String str2) {
        String threadJavaStack = getThreadJavaStack(getThreadByName(str2));
        writeStackToFile(str + "\n******* Java stack for JNI crash *******\n" + threadJavaStack);
    }
}
