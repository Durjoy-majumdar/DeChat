package com.tencent.stubs.logger;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.StringTokenizer;

public final class Log {
    public static final int ASSERT = 7;
    public static final int DEBUG = 3;
    public static final int ERROR = 6;
    public static final int INFO = 4;
    private static final long LOGGER_JAVA = 3;
    private static final long LOGGER_LOGCAT = 2;
    private static final long LOGGER_NOOP = 0;
    private static final long LOGGER_STDOUT = 1;
    public static final int VERBOSE = 2;
    public static final int WARN = 5;
    public static volatile Logger sLogger;
    public static volatile long sLoggerPtr;

    public interface Logger {
        boolean isLoggable(String str, int i);

        void println(int i, String str, String str2);
    }

    static {
        long j;
        Logger logger;
        try {
            Class.forName("android.util.Log");
            logger = new AndroidLogcat();
            j = 2;
        } catch (ClassNotFoundException unused) {
            logger = new Logger() {
                public boolean isLoggable(String str, int i) {
                    return true;
                }

                public void println(int i, String str, String str2) {
                    PrintStream printStream = System.out;
                    printStream.println("[" + str + "] " + str2);
                }
            };
            j = 1;
        }
        sLogger = logger;
        sLoggerPtr = j;
    }

    private Log() {
    }

    /* renamed from: d */
    public static void m106493d(String str, String str2) {
        println(3, str, str2);
    }

    /* renamed from: e */
    public static void m106497e(String str, String str2) {
        println(6, str, str2);
    }

    /* renamed from: f */
    public static void m106501f(String str, String str2) {
        println(7, str, str2);
    }

    /* renamed from: i */
    public static void m106505i(String str, String str2) {
        println(4, str, str2);
    }

    public static void printFormat(int i, String str, String str2, Object... objArr) {
        Logger logger = sLogger;
        if (logger != null && logger.isLoggable(str, i)) {
            logger.println(i, str, String.format(str2, objArr));
        }
    }

    public static void printStack(int i, String str, Throwable th) {
        Logger logger = sLogger;
        if (logger != null && logger.isLoggable(str, i)) {
            StringWriter stringWriter = new StringWriter(512);
            th.printStackTrace(new PrintWriter(stringWriter));
            StringTokenizer stringTokenizer = new StringTokenizer(stringWriter.toString(), "\n");
            while (stringTokenizer.hasMoreTokens()) {
                logger.println(i, str, stringTokenizer.nextToken());
            }
        }
    }

    public static void println(int i, String str, String str2) {
        Logger logger = sLogger;
        if (logger != null) {
            logger.println(i, str, str2);
        }
    }

    public static void setLogger(Logger logger) {
        sLogger = logger;
        sLoggerPtr = logger == null ? 0 : 3;
    }

    /* renamed from: v */
    public static void m106509v(String str, String str2) {
        println(2, str, str2);
    }

    /* renamed from: w */
    public static void m106513w(String str, String str2) {
        println(5, str, str2);
    }

    /* renamed from: d */
    public static void m106495d(String str, Throwable th, String str2) {
        if (str2 != null && !str2.isEmpty()) {
            println(3, str, str2);
        }
        if (th != null) {
            printStack(3, str, th);
        }
    }

    /* renamed from: e */
    public static void m106499e(String str, Throwable th, String str2) {
        if (str2 != null && !str2.isEmpty()) {
            println(6, str, str2);
        }
        if (th != null) {
            printStack(6, str, th);
        }
    }

    /* renamed from: f */
    public static void m106503f(String str, Throwable th, String str2) {
        if (str2 != null && !str2.isEmpty()) {
            println(7, str, str2);
        }
        if (th != null) {
            printStack(7, str, th);
        }
    }

    /* renamed from: i */
    public static void m106507i(String str, Throwable th, String str2) {
        if (str2 != null && !str2.isEmpty()) {
            println(4, str, str2);
        }
        if (th != null) {
            printStack(4, str, th);
        }
    }

    /* renamed from: v */
    public static void m106511v(String str, Throwable th, String str2) {
        if (str2 != null && !str2.isEmpty()) {
            println(2, str, str2);
        }
        if (th != null) {
            printStack(2, str, th);
        }
    }

    /* renamed from: w */
    public static void m106515w(String str, Throwable th, String str2) {
        if (str2 != null && !str2.isEmpty()) {
            println(5, str, str2);
        }
        if (th != null) {
            printStack(5, str, th);
        }
    }

    /* renamed from: d */
    public static void m106494d(String str, String str2, Object... objArr) {
        printFormat(3, str, str2, objArr);
    }

    /* renamed from: e */
    public static void m106498e(String str, String str2, Object... objArr) {
        printFormat(6, str, str2, objArr);
    }

    /* renamed from: f */
    public static void m106502f(String str, String str2, Object... objArr) {
        printFormat(7, str, str2, objArr);
    }

    /* renamed from: i */
    public static void m106506i(String str, String str2, Object... objArr) {
        printFormat(4, str, str2, objArr);
    }

    /* renamed from: v */
    public static void m106510v(String str, String str2, Object... objArr) {
        printFormat(2, str, str2, objArr);
    }

    /* renamed from: w */
    public static void m106514w(String str, String str2, Object... objArr) {
        printFormat(5, str, str2, objArr);
    }

    /* renamed from: d */
    public static void m106496d(String str, Throwable th, String str2, Object... objArr) {
        printFormat(3, str, str2, objArr);
        if (th != null) {
            printStack(3, str, th);
        }
    }

    /* renamed from: e */
    public static void m106500e(String str, Throwable th, String str2, Object... objArr) {
        printFormat(6, str, str2, objArr);
        if (th != null) {
            printStack(6, str, th);
        }
    }

    /* renamed from: f */
    public static void m106504f(String str, Throwable th, String str2, Object... objArr) {
        printFormat(7, str, str2, objArr);
        if (th != null) {
            printStack(7, str, th);
        }
    }

    /* renamed from: i */
    public static void m106508i(String str, Throwable th, String str2, Object... objArr) {
        printFormat(4, str, str2, objArr);
        if (th != null) {
            printStack(4, str, th);
        }
    }

    /* renamed from: v */
    public static void m106512v(String str, Throwable th, String str2, Object... objArr) {
        printFormat(2, str, str2, objArr);
        if (th != null) {
            printStack(2, str, th);
        }
    }

    /* renamed from: w */
    public static void m106516w(String str, Throwable th, String str2, Object... objArr) {
        printFormat(5, str, str2, objArr);
        if (th != null) {
            printStack(7, str, th);
        }
    }
}
