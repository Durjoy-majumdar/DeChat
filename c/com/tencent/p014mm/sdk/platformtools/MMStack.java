package com.tencent.p014mm.sdk.platformtools;

import com.tencent.xweb.file.XVFSFile;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* renamed from: com.tencent.mm.sdk.platformtools.MMStack */
public class MMStack {
    private static final String TAG = "MicroMsg.Util.MMStack";

    public static String getCaller() {
        try {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            if (stackTrace == null) {
                return "";
            }
            if (stackTrace.length < 3) {
                return "";
            }
            return (stackTrace[2].getClassName().substring(15) + XVFSFile.PATH_SEPARATOR + stackTrace[2].getMethodName()) + "(" + stackTrace[2].getLineNumber() + ")";
        } catch (Throwable th) {
            Log.m105921e(TAG, "getCaller e:%s", stackTraceToString(th));
            return "";
        }
    }

    public static String getStack(boolean z) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        if (stackTrace == null || stackTrace.length < 4) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 3; i < stackTrace.length; i++) {
            if (stackTrace[i].getClassName().contains("com.tencent.") && !stackTrace[i].getClassName().contains("sdk.platformtools.Log")) {
                sb.append("[");
                sb.append(stackTrace[i].getClassName().replace("com.tencent.mm", ""));
                sb.append(XVFSFile.PATH_SEPARATOR);
                sb.append(stackTrace[i].getMethodName());
                if (z) {
                    sb.append("(" + stackTrace[i].getLineNumber() + ")]");
                } else {
                    sb.append("]");
                }
            }
        }
        return sb.toString();
    }

    public static String stackTraceToString(Throwable th) {
        if (th == null) {
            return "";
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            PrintStream printStream = new PrintStream(byteArrayOutputStream);
            th.printStackTrace(printStream);
            String byteArrayOutputStream2 = byteArrayOutputStream.toString();
            printStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream2;
        } catch (Exception unused) {
            return "";
        }
    }

    public String toString() {
        return getStack(true);
    }

    public static String stackTraceToString(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null || stackTraceElementArr.length < 4) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 3; i < stackTraceElementArr.length; i++) {
            if (stackTraceElementArr[i].getClassName().contains("com.tencent.mm") && !stackTraceElementArr[i].getClassName().contains("sdk.platformtools.Log")) {
                sb.append("[");
                sb.append(stackTraceElementArr[i].getClassName().substring(15));
                sb.append(XVFSFile.PATH_SEPARATOR);
                sb.append(stackTraceElementArr[i].getMethodName());
                sb.append("(" + stackTraceElementArr[i].getLineNumber() + ")]");
            }
        }
        return sb.toString();
    }
}
