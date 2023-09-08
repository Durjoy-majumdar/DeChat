package com.tencent.tav.coremedia;

import com.google.android.gms.common.server.response.FastJsonResponse;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TimeUtil {
    private static final long DEVIATION = 10000;
    public static final long SECOND_TO_US = 1000000;
    public static final String YYYY2MM2DD_HH1MM1SS = "yyyy-MM-dd HH:mm:ss";

    public static boolean equals(long j, long j2) {
        return Math.abs(j - j2) < DEVIATION;
    }

    public static long getAudioDuration(long j, int i, int i2) {
        return (j * SECOND_TO_US) / ((long) ((i * 2) * i2));
    }

    public static String long2str(long j, String str) {
        if (str == null) {
            str = "yyyy-M-d  HH:mm";
        }
        return new SimpleDateFormat(str, Locale.getDefault()).format(new Date(j));
    }

    public static float milli2Second(long j) {
        return (((float) j) * 1.0f) / 1000.0f;
    }

    public static long milli2Us(long j) {
        return j * 1000;
    }

    public static String milliToSecond(long j) {
        return String.format(Locale.CHINA, "%1$.1f", new Object[]{Float.valueOf(((float) Math.round(milli2Second(j) * 10.0f)) / 10.0f)});
    }

    public static long second2Ms(float f) {
        return (long) (f * 1000.0f);
    }

    public static String second2String(int i) {
        StringBuilder sb = new StringBuilder();
        int i2 = i / 60;
        if (i2 > 0) {
            sb.append(i2 + "'");
        }
        int i3 = i % 60;
        if (i3 >= 10) {
            sb.append(i3 + FastJsonResponse.QUOTE);
        } else if (i3 >= 0) {
            sb.append("0" + i3 + FastJsonResponse.QUOTE);
        }
        return sb.toString();
    }

    public static long second2Us(float f) {
        return (long) (f * 1000000.0f);
    }

    public static CMTime us2CMTime(long j) {
        return new CMTime((long) (us2Second(j) * 600.0f));
    }

    public static long us2Milli(long j) {
        return j / 1000;
    }

    public static float us2Second(long j) {
        return (((float) j) * 1.0f) / 1000000.0f;
    }

    public static String usToSecond(long j) {
        return String.format(Locale.CHINA, "%1$.1f", new Object[]{Float.valueOf(((float) Math.round(us2Second(j) * 10.0f)) / 10.0f)});
    }
}
