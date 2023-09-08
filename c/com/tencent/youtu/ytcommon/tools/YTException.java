package com.tencent.youtu.ytcommon.tools;

public class YTException {
    public static void report(Exception exc) {
        exc.getClass();
        YTLogger.m144667e("YTException", "[YTException.report] ");
    }

    public static void report(Exception exc, String str, String str2) {
        exc.getClass();
        YTLogger.m144670w("YTException" + str, str2);
    }
}
