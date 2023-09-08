package com.tencent.tav.decoder.logger;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Formatter;

public class Logger {
    public static final int NO_LOG = Integer.MAX_VALUE;
    private static int level = 3;
    private static ILog logProxy = new DefaultLogProxy();

    public static class DefaultLogProxy implements ILog {
        private DefaultLogProxy() {
        }

        /* renamed from: d */
        public void mo55635d(String str, String str2) {
        }

        /* renamed from: e */
        public void mo55636e(String str, String str2) {
        }

        /* renamed from: e */
        public void mo55637e(String str, String str2, Throwable th) {
        }

        /* renamed from: i */
        public void mo55638i(String str, String str2) {
        }

        /* renamed from: v */
        public void mo55639v(String str, String str2) {
        }

        /* renamed from: w */
        public void mo55640w(String str, String str2) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface LogLevel {
    }

    /* renamed from: d */
    public static void m144641d(String str, String str2) {
        ILog iLog = logProxy;
        if (iLog != null && level <= 3) {
            iLog.mo55635d(str, str2);
        }
    }

    /* renamed from: e */
    public static void m144643e(String str, String str2) {
        ILog iLog = logProxy;
        if (iLog != null && level <= 6) {
            iLog.mo55636e(str, str2);
        }
    }

    /* renamed from: i */
    public static void m144646i(String str, String str2) {
        ILog iLog = logProxy;
        if (iLog != null && level <= 4) {
            iLog.mo55638i(str, str2);
        }
    }

    public static void setLevel(int i) {
        level = i;
    }

    public static void setLogProxy(ILog iLog) {
        logProxy = iLog;
    }

    /* renamed from: v */
    public static void m144648v(String str, String str2) {
        ILog iLog = logProxy;
        if (iLog != null && level <= 2) {
            iLog.mo55639v(str, str2);
        }
    }

    /* renamed from: w */
    public static void m144649w(String str, String str2) {
        ILog iLog = logProxy;
        if (iLog != null && level <= 5) {
            iLog.mo55640w(str, str2);
        }
    }

    /* renamed from: d */
    public static void m144642d(String str, String str2, Object... objArr) {
        if (logProxy != null && level <= 3) {
            m144641d(str, new Formatter().format(str2, objArr).toString());
        }
    }

    /* renamed from: e */
    public static void m144645e(String str, String str2, Object... objArr) {
        m144643e(str, new Formatter().format(str2, objArr).toString());
    }

    /* renamed from: i */
    public static void m144647i(String str, String str2, Object... objArr) {
        if (logProxy != null && level <= 4) {
            m144646i(str, new Formatter().format(str2, objArr).toString());
        }
    }

    /* renamed from: e */
    public static void m144644e(String str, String str2, Throwable th) {
        ILog iLog = logProxy;
        if (iLog != null && level <= 6) {
            iLog.mo55637e(str, str2, th);
        }
    }
}
