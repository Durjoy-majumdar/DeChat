package p172io.clipworks.corekit;

/* renamed from: io.clipworks.corekit.NativeLogger */
public final class NativeLogger {
    private static final int DEBUG = 5;
    private static final int ERROR = 2;
    private static final int FATAL = 1;
    private static final int INFO = 4;
    private static final int ISSUE = 0;
    private static final int WARN = 3;

    private NativeLogger() {
    }

    public static void debug(String str, String str2) {
        printLog(5, str, str2);
    }

    public static void error(String str, String str2) {
        printLog(2, str, str2);
    }

    public static void fatal(String str, String str2) {
        printLog(1, str, str2);
    }

    public static void info(String str, String str2) {
        printLog(4, str, str2);
    }

    public static void issue(String str, String str2) {
        printLog(0, str, str2);
    }

    private static native void nativeTracingWithLevel(int i, String str);

    private static void printLog(int i, String str, String str2) {
        nativeTracingWithLevel(i, String.format("%1$s: %2$s", new Object[]{str, str2}));
    }

    public static void warning(String str, String str2) {
        printLog(3, str, str2);
    }
}
