package com.tencent.midas.comm.log.internal;

import java.util.Locale;

public class APLogger {
    public static final int LOG_LEVEL_DEBUG = 2;
    public static final int LOG_LEVEL_ERROR = 5;
    public static final int LOG_LEVEL_INFO = 3;
    public static final int LOG_LEVEL_SILENT = 6;
    public static final int LOG_LEVEL_VERBOSE = 1;
    public static final int LOG_LEVEL_WARN = 4;
    private APLogAppender appender = null;

    private APLogger() {
    }

    public static void log(int i, String str, String str2) {
        int i2 = 0;
        while (i2 < str2.length()) {
            try {
                int i3 = i2 + 3600;
                if (str2.length() <= i3) {
                    str2.substring(i2);
                } else {
                    str2.substring(i2, i3);
                }
                switch (i) {
                }
                i2 = i3;
            } catch (Throwable th) {
                String.format(Locale.CHINA, "print log error: <%s>%s", new Object[]{th.getClass().getName(), th.getMessage()});
                return;
            }
        }
    }

    public static APLogger open() {
        APLogger aPLogger = new APLogger();
        aPLogger.openAppender();
        return aPLogger;
    }

    private void openAppender() {
        this.appender = APLogAppender.open();
    }

    public void flush() {
        try {
            APLogAppender aPLogAppender = this.appender;
            if (aPLogAppender != null) {
                aPLogAppender.flushAndWrite();
            }
        } catch (Throwable th) {
            String.format(Locale.CHINA, "flush log error: %s\n, stackTrace: %s", new Object[]{th.toString(), th.getStackTrace()[3]});
        }
    }

    public void write(String str) {
        this.appender.append(str);
    }
}
