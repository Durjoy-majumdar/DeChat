package com.tencent.liteav.base.util;

import com.tencent.liteav.base.Log;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeFormat {
    public static String format(long j, String str) {
        try {
            return new SimpleDateFormat(str).format(new Date(j));
        } catch (Exception e) {
            Log.m97547i("TimeFormat", "toString: Date conversion failed.", e);
            return "";
        }
    }

    public static long fromString(String str, String str2) {
        try {
            Date parse = new SimpleDateFormat(str2).parse(str);
            if (parse == null) {
                return 0;
            }
            return parse.getTime();
        } catch (Exception e) {
            Log.m97547i("TimeFormat", "formString: Date conversion failed.", e);
            return 0;
        }
    }
}
