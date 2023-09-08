package com.tencent.xweb.util;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.wxmm.v2encoder;
import com.tencent.xweb.DeprecatedOutsideXWebSdk;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class XWebGrayValueUtil {
    private static final int SPECIAL_TEST_USER_ID = 10001;
    public static final String SP_KEY_DEVICE_RD = "sNDeviceRd";
    private static final String SP_KEY_GRAY_VALUE = "GRAY_VALUE";
    private static final String SP_KEY_GRAY_VALUE_TEST = "TEST_GRAY_VALUE";
    private static final String SP_KEY_USER_ID = "USER_ID";
    public static final String TAG = "XWebGrayValueUtil";
    public static int sNDeviceRd = 0;
    private static int s_grayValue = 0;
    private static String s_todayDate = "";
    private static int s_todayGrayValue;

    public static int getDeviceRd() {
        if (sNDeviceRd <= 0) {
            int i = XWebSharedPreferenceUtil.getSharedPreferencesForXWalkCore().getInt(SP_KEY_DEVICE_RD, -1);
            sNDeviceRd = i;
            if (i <= 0) {
                sNDeviceRd = new Random().nextInt(10000000) + 1;
                XWebSharedPreferenceUtil.getSharedPreferencesForXWalkCore().edit().putInt(SP_KEY_DEVICE_RD, sNDeviceRd).commit();
            }
        }
        return (sNDeviceRd % 10000) + 1;
    }

    public static int getGrayValue() {
        int i = s_grayValue;
        if (i != 0) {
            return i;
        }
        try {
            int i2 = XWebSharedPreferenceUtil.getSharedPreferencesForWebDebug().getInt(SP_KEY_GRAY_VALUE_TEST, -1);
            s_grayValue = i2;
            if (i2 > 0) {
                XWebLog.m21911i(TAG, "getGrayValue, using test gray value:" + s_grayValue);
                return s_grayValue;
            }
            int i3 = XWebSharedPreferenceUtil.getSharedPreferencesForXWalkCore().getInt(SP_KEY_GRAY_VALUE, -1);
            s_grayValue = i3;
            if (i3 > 0) {
                XWebLog.m21911i(TAG, "getGrayValue, using uin gray value:" + s_grayValue);
                return s_grayValue;
            }
            int deviceRd = getDeviceRd();
            s_grayValue = deviceRd;
            if (deviceRd > 0) {
                XWebLog.m21911i(TAG, "getGrayValue, using device gray value:" + s_grayValue);
                return s_grayValue;
            }
            return s_grayValue;
        } catch (Throwable th) {
            XWebLog.m21910e(TAG, "getGrayValue error", th);
            s_grayValue = 0;
        }
    }

    public static int getTodayGrayValue() {
        String format = new SimpleDateFormat("yyyyMMdd").format(new Date());
        if (s_todayGrayValue != 0 && format.equals(s_todayDate)) {
            return s_todayGrayValue;
        }
        s_todayDate = format;
        int userId = getUserId();
        if (userId == 0) {
            userId = getGrayValue();
        }
        long j = Util.MAX_32BIT_VALUE & ((long) userId);
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest((j + "@" + format).getBytes());
            if (digest != null) {
                if (digest.length > 3) {
                    byte b = ((digest[0] & Byte.MAX_VALUE) << 24) | (digest[3] & ExifInterface.MARKER) | ((digest[2] & ExifInterface.MARKER) << 8) | ((digest[1] & ExifInterface.MARKER) << v2encoder.enumCODEC_vcodec2);
                    if (b == 0) {
                        s_todayGrayValue = userId;
                        return userId;
                    }
                    s_todayGrayValue = (b % v2encoder.enumCODEC_vcodec2) + 1;
                    return s_todayGrayValue;
                }
            }
            s_todayGrayValue = userId;
            return userId;
        } catch (Throwable th) {
            XWebLog.m21910e(TAG, "getTodayGrayValue error", th);
            s_todayGrayValue = userId;
        }
    }

    public static int getTodayGrayValueByKey(String str) {
        String format = new SimpleDateFormat("yyyyMMdd").format(new Date());
        int userId = getUserId();
        if (userId == 0) {
            userId = getGrayValue();
        }
        long j = ((long) userId) & Util.MAX_32BIT_VALUE;
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest((j + "@" + format + "key=" + str).getBytes());
            if (digest != null) {
                if (digest.length > 3) {
                    byte b = ((digest[0] & Byte.MAX_VALUE) << 24) | (digest[3] & ExifInterface.MARKER) | ((digest[2] & ExifInterface.MARKER) << 8) | ((digest[1] & ExifInterface.MARKER) << v2encoder.enumCODEC_vcodec2);
                    return b == 0 ? s_todayGrayValue : (b % v2encoder.enumCODEC_vcodec2) + 1;
                }
            }
            return s_todayGrayValue;
        } catch (Throwable th) {
            XWebLog.m21910e(TAG, "getTodayGrayValueByKey error", th);
            return s_todayGrayValue;
        }
    }

    public static int getUserId() {
        return XWebSharedPreferenceUtil.getMMKVSharedPreferencesForXWebUserInfo().getInt(SP_KEY_USER_ID, 0);
    }

    public static boolean hasUin() {
        return getUserId() != 0;
    }

    public static void resetGrayValue() {
        s_grayValue = 0;
        s_grayValue = getGrayValue();
        XWebLog.m21911i(TAG, "resetGrayValue, gray value:" + s_grayValue);
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static boolean setGrayValueByUserId(int i) {
        if (i == 0) {
            return false;
        }
        setUserId(i);
        long j = Util.MAX_32BIT_VALUE & ((long) i);
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(("xweb_gray_value" + j).getBytes());
            if (digest != null) {
                if (digest.length > 3) {
                    byte b = ((digest[0] & Byte.MAX_VALUE) << 24) | (digest[3] & ExifInterface.MARKER) | ((digest[2] & ExifInterface.MARKER) << 8) | ((digest[1] & ExifInterface.MARKER) << v2encoder.enumCODEC_vcodec2);
                    if (b == 0) {
                        return false;
                    }
                    s_grayValue = (b % v2encoder.enumCODEC_vcodec2) + 1;
                    int i2 = XWebSharedPreferenceUtil.getSharedPreferencesForXWalkCore().getInt(SP_KEY_GRAY_VALUE, -1);
                    XWebSharedPreferenceUtil.getSharedPreferencesForXWalkCore().edit().putInt(SP_KEY_GRAY_VALUE, s_grayValue).commit();
                    if (i2 == s_grayValue) {
                        return false;
                    }
                    XWebLog.m21911i(TAG, "setGrayValueByUserId, gray value changed from " + i2 + " to " + s_grayValue);
                    WXWebReporter.idkeyReport(1749, 29, 1);
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            s_grayValue = 0;
            XWebLog.m21910e(TAG, "setGrayValueByUserId, gray value reset to 0, error", th);
        }
    }

    public static void setGrayValueForTest(int i) {
        if (i != 10001) {
            s_grayValue = i % 10000;
        }
        XWebLog.m21911i(TAG, "setGrayValueForTest, gray value:" + s_grayValue);
        XWebSharedPreferenceUtil.getSharedPreferencesForWebDebug().edit().putInt(SP_KEY_GRAY_VALUE_TEST, s_grayValue).commit();
    }

    public static void setTodayGrayValueForTest(int i) {
        s_todayGrayValue = i;
        s_todayDate = new SimpleDateFormat("yyyyMMdd").format(new Date());
    }

    private static void setUserId(int i) {
        XWebSharedPreferenceUtil.getMMKVSharedPreferencesForXWebUserInfo().edit().putInt(SP_KEY_USER_ID, i).commit();
    }
}
