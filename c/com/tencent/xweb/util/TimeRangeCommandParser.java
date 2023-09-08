package com.tencent.xweb.util;

import android.text.TextUtils;
import java.util.List;

public class TimeRangeCommandParser {

    public static class TimeRangeCommand {
        public List<TimeRange> listTimeRanges;
        public String strValue;

        private TimeRangeCommand() {
        }

        public boolean isMatchTime(double d) {
            List<TimeRange> list = this.listTimeRanges;
            if (list == null) {
                return false;
            }
            for (TimeRange next : list) {
                if (next.timeStart <= d && next.timeEnd >= d) {
                    return ((double) XWebGrayValueUtil.getTodayGrayValue()) < next.getScale(d) * 10000.0d;
                }
            }
            return false;
        }
    }

    public static String getValue(String str, double d) {
        for (String str2 : TextUtils.split(str, "]")) {
            if (!TextUtils.isEmpty(str2)) {
                String trim = str2.trim();
                if (trim.startsWith(";")) {
                    trim = trim.substring(1);
                }
                int indexOf = trim.indexOf(91);
                String substring = trim.substring(0, indexOf);
                List<TimeRange> timeRangeList = TimeRange.getTimeRangeList(trim.substring(indexOf + 1));
                TimeRangeCommand timeRangeCommand = new TimeRangeCommand();
                timeRangeCommand.strValue = substring;
                timeRangeCommand.listTimeRanges = timeRangeList;
                if (timeRangeCommand.isMatchTime(d)) {
                    return substring;
                }
            }
        }
        return "";
    }

    public static String getValueByNow(String str) {
        return getValue(str, NumberUtil.getCurrentHour());
    }
}
