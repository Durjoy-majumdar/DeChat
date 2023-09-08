package p172io.flutter;

/* renamed from: io.flutter.Log */
public class Log {
    public static int ASSERT = 7;
    public static int DEBUG = 3;
    public static int ERROR = 6;
    public static int INFO = 4;
    public static int VERBOSE = 2;
    public static int WARN = 5;
    private static Delegate logDelegate = null;
    private static int logLevel = 3;

    /* renamed from: io.flutter.Log$Delegate */
    public interface Delegate {
        /* renamed from: d */
        void mo9387d(String str, String str2);

        /* renamed from: d */
        void mo9388d(String str, String str2, Throwable th);

        /* renamed from: e */
        void mo9389e(String str, String str2);

        /* renamed from: e */
        void mo9390e(String str, String str2, Throwable th);

        /* renamed from: i */
        void mo9391i(String str, String str2);

        /* renamed from: i */
        void mo9392i(String str, String str2, Throwable th);

        void println(int i, String str, String str2);

        /* renamed from: v */
        void mo9394v(String str, String str2);

        /* renamed from: v */
        void mo9395v(String str, String str2, Throwable th);

        /* renamed from: w */
        void mo9396w(String str, String str2);

        /* renamed from: w */
        void mo9397w(String str, String str2, Throwable th);

        void wtf(String str, String str2);

        void wtf(String str, String str2, Throwable th);
    }

    /* renamed from: d */
    public static void m165284d(String str, String str2) {
        Delegate delegate;
        if (logLevel <= 3 && (delegate = logDelegate) != null) {
            delegate.mo9387d(str, str2);
        }
    }

    /* renamed from: e */
    public static void m165286e(String str, String str2) {
        Delegate delegate = logDelegate;
        if (delegate != null) {
            delegate.mo9389e(str, str2);
        }
    }

    /* renamed from: i */
    public static void m165288i(String str, String str2) {
        Delegate delegate;
        if (logLevel <= 4 && (delegate = logDelegate) != null) {
            delegate.mo9391i(str, str2);
        }
    }

    public static void println(int i, String str, String str2) {
        Delegate delegate;
        if (logLevel <= i && (delegate = logDelegate) != null) {
            delegate.println(i, str, str2);
        }
    }

    public static void setLogDelegate(Delegate delegate) {
        logDelegate = delegate;
    }

    public static void setLogLevel(int i) {
        logLevel = i;
    }

    /* renamed from: v */
    public static void m165290v(String str, String str2) {
        Delegate delegate;
        if (logLevel <= 2 && (delegate = logDelegate) != null) {
            delegate.mo9394v(str, str2);
        }
    }

    /* renamed from: w */
    public static void m165292w(String str, String str2) {
        Delegate delegate = logDelegate;
        if (delegate != null) {
            delegate.mo9396w(str, str2);
        }
    }

    public static void wtf(String str, String str2) {
        Delegate delegate = logDelegate;
        if (delegate != null) {
            delegate.wtf(str, str2);
        } else {
            android.util.Log.wtf(str, str2);
        }
    }

    /* renamed from: e */
    public static void m165287e(String str, String str2, Throwable th) {
        Delegate delegate = logDelegate;
        if (delegate != null) {
            delegate.mo9390e(str, str2, th);
        }
    }

    /* renamed from: w */
    public static void m165293w(String str, String str2, Throwable th) {
        Delegate delegate = logDelegate;
        if (delegate != null) {
            delegate.mo9397w(str, str2, th);
        }
    }

    /* renamed from: d */
    public static void m165285d(String str, String str2, Throwable th) {
        Delegate delegate;
        if (logLevel <= 3 && (delegate = logDelegate) != null) {
            delegate.mo9388d(str, str2, th);
        }
    }

    /* renamed from: i */
    public static void m165289i(String str, String str2, Throwable th) {
        Delegate delegate;
        if (logLevel <= 4 && (delegate = logDelegate) != null) {
            delegate.mo9392i(str, str2, th);
        }
    }

    /* renamed from: v */
    public static void m165291v(String str, String str2, Throwable th) {
        Delegate delegate;
        if (logLevel <= 2 && (delegate = logDelegate) != null) {
            delegate.mo9395v(str, str2, th);
        }
    }

    public static void wtf(String str, String str2, Throwable th) {
        Delegate delegate = logDelegate;
        if (delegate != null) {
            delegate.wtf(str, str2, th);
        } else {
            android.util.Log.wtf(str, str2, th);
        }
    }
}
