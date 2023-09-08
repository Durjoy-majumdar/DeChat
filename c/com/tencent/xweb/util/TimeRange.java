package com.tencent.xweb.util;

import android.text.TextUtils;
import com.tencent.xweb.util.NumberUtil;
import java.util.ArrayList;
import java.util.List;

public class TimeRange {
    private static final String TAG = "TimeRange";
    public double scale = 1.0d;
    public double[] scales = new double[0];
    public double timeEnd;
    public double timeStart;

    public static TimeRange getTimeRange(String str) {
        TimeRange timeRange = new TimeRange();
        String[] split = str.replace("(", "-").replace(")", "").split("-");
        if (split == null || split.length < 2) {
            XWebLog.m21909e(TAG, "getTimeRange, length error");
            return null;
        }
        int i = 0;
        double timeDoubleValue = NumberUtil.getTimeDoubleValue(split[0]);
        if (timeDoubleValue < 0.0d || timeDoubleValue > 24.0d) {
            XWebLog.m21909e(TAG, "getTimeRange, bind.rangeFrom.timeStart parse error");
            return null;
        }
        timeRange.timeStart = timeDoubleValue;
        double timeDoubleValue2 = NumberUtil.getTimeDoubleValue(split[1]);
        if (timeDoubleValue2 < 0.0d || timeDoubleValue2 > 24.0d) {
            XWebLog.m21909e(TAG, "getTimeRange, bind.rangeFrom.timeEnd parse error");
            return null;
        }
        timeRange.timeEnd = timeDoubleValue2;
        if (split.length == 3) {
            NumberUtil.ParseResult safeParseDouble = NumberUtil.safeParseDouble(split[2]);
            if (!safeParseDouble.parseSuc) {
                XWebLog.m21909e(TAG, "getTimeRange, scale parse error");
                return null;
            }
            double doubleValue = safeParseDouble.doubleValue();
            if (doubleValue < 0.0d || doubleValue > 1000000.0001d) {
                XWebLog.m21909e(TAG, "getTimeRange, scale parse value error");
                return null;
            }
            timeRange.scale = doubleValue;
        } else if (split.length > 3) {
            double[] dArr = new double[(split.length - 2)];
            while (true) {
                int i2 = i + 2;
                if (i2 >= split.length) {
                    timeRange.scales = dArr;
                    break;
                }
                NumberUtil.ParseResult safeParseDouble2 = NumberUtil.safeParseDouble(split[i2]);
                if (!safeParseDouble2.parseSuc) {
                    XWebLog.m21909e(TAG, "getTimeRange, scales parse error");
                    return null;
                }
                double doubleValue2 = safeParseDouble2.doubleValue();
                if (doubleValue2 < 0.0d || doubleValue2 > 1000000.0001d) {
                    XWebLog.m21909e(TAG, "getTimeRange, scales parse value error");
                } else {
                    dArr[i] = doubleValue2;
                    i++;
                }
            }
            XWebLog.m21909e(TAG, "getTimeRange, scales parse value error");
            return null;
        }
        return timeRange;
    }

    public static List<TimeRange> getTimeRangeList(String str) {
        String[] split;
        TimeRange timeRange;
        ArrayList arrayList = new ArrayList();
        if (!(TextUtils.isEmpty(str) || (split = str.split(";")) == null || split.length == 0)) {
            for (String str2 : split) {
                if (!TextUtils.isEmpty(str2) && (timeRange = getTimeRange(str2)) != null) {
                    arrayList.add(timeRange);
                }
            }
        }
        return arrayList;
    }

    public double getScale(double d) {
        double d2 = this.timeStart;
        if (d < d2) {
            return 0.0d;
        }
        double d3 = this.timeEnd;
        if (d > d3) {
            return 0.0d;
        }
        double[] dArr = this.scales;
        if (dArr == null || dArr.length == 0) {
            return this.scale;
        }
        int i = 0;
        if (dArr.length == 1) {
            return dArr[0];
        }
        if (d == d3) {
            return dArr[dArr.length - 1];
        }
        int length = dArr.length - 1;
        double d4 = (d3 - d2) / ((double) length);
        double d5 = d - d2;
        while (i < length) {
            int i2 = i + 1;
            double d6 = ((double) i) * d4;
            if (d5 <= ((double) i2) * d4) {
                double[] dArr2 = this.scales;
                double d7 = dArr2[i];
                return d7 + (((dArr2[i2] - d7) * (d5 - d6)) / d4);
            }
            i = i2;
        }
        double[] dArr3 = this.scales;
        return dArr3[dArr3.length - 1];
    }
}
