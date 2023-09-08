package com.tencent.xweb.util;

import android.text.TextUtils;
import com.tencent.xweb.file.XVFSFile;
import java.util.Calendar;

public class NumberUtil {
    public static final long DAY_MILLS = 86400000;
    public static final long HOUR_MILLS = 3600000;
    public static final long MINUTE_MILLS = 60000;
    private static final String TAG = "NumberUtil";

    public static class ParseResult {
        public Object numberValue;
        public boolean parseSuc = false;

        public double doubleValue() {
            Object obj = this.numberValue;
            if (obj == null) {
                return 0.0d;
            }
            return ((Double) obj).doubleValue();
        }

        public int intValue() {
            Object obj = this.numberValue;
            if (obj == null) {
                return 0;
            }
            return ((Integer) obj).intValue();
        }
    }

    public static double getCurrentHour() {
        Calendar instance = Calendar.getInstance();
        return ((double) instance.get(11)) + (((double) instance.get(12)) / 60.0d);
    }

    public static double getTimeDoubleValue(String str) {
        String[] split;
        if (!(TextUtils.isEmpty(str) || (split = str.split(XVFSFile.PATH_SEPARATOR)) == null || split.length == 0)) {
            ParseResult safeParseDouble = safeParseDouble(split[0]);
            if (!safeParseDouble.parseSuc) {
                return -1.0d;
            }
            double doubleValue = safeParseDouble.doubleValue();
            if (split.length == 2) {
                int intValue = safeParseInt(split[1]).intValue();
                if (intValue < 0 || intValue >= 60) {
                    return -1.0d;
                }
                doubleValue += (((double) intValue) * 1.0d) / 60.0d;
            }
            if (doubleValue < 0.0d || doubleValue > 24.0d) {
                return -1.0d;
            }
            return doubleValue;
        }
        return -1.0d;
    }

    public static double milliesToHourInDay(long j) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        return ((double) instance.get(11)) + (((double) instance.get(12)) / 60.0d);
    }

    public static long milliesToNextDay() {
        Calendar instance = Calendar.getInstance();
        return (((long) (24 - instance.get(11))) * 3600000) - (((long) instance.get(12)) * 60000);
    }

    public static ParseResult safeParseDouble(String str) {
        ParseResult parseResult = new ParseResult();
        try {
            parseResult.numberValue = Double.valueOf(Double.parseDouble(str));
            parseResult.parseSuc = true;
        } catch (Throwable th) {
            XWebLog.m21910e(TAG, "safeParseDouble error", th);
        }
        return parseResult;
    }

    public static ParseResult safeParseInt(String str) {
        ParseResult parseResult = new ParseResult();
        if (str == null) {
            return parseResult;
        }
        try {
            String trim = str.trim();
            while (trim.startsWith("0") && trim.length() > 1) {
                trim = trim.substring(1);
            }
            parseResult.numberValue = Integer.valueOf(Integer.parseInt(trim));
            parseResult.parseSuc = true;
        } catch (Throwable th) {
            XWebLog.m21910e(TAG, "safeParseInt error", th);
        }
        return parseResult;
    }

    public static double getCurrentHour(Calendar calendar) {
        return ((double) calendar.get(11)) + (((double) calendar.get(12)) / 60.0d);
    }

    public static long milliesToNextDay(Calendar calendar) {
        return ((((long) (24 - calendar.get(11))) * 3600000) - (((long) calendar.get(12)) * 60000)) - ((long) (calendar.get(13) * 1000));
    }
}
