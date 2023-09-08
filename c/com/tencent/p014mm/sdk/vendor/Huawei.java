package com.tencent.p014mm.sdk.vendor;

import android.content.Context;
import android.os.Build;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.tencent.mm.sdk.vendor.Huawei */
public class Huawei {
    private static final String HUAWEI_SYSTEM_EMUI10_START = "EmotionUI_10";
    private static final String HUAWEI_SYSTEM_EMUI8_START = "EmotionUI_8";
    private static final String HUAWEI_SYSTEM_EMUI9_START = "EmotionUI_9";
    private static final String HUAWEI_SYSTEM_NOT_BELOW_EMUI10_START = "EmotionUI_1";
    private static final String HUAWEI_SYSTEM_STRING = "ro.build.version.emui";
    private static final String TAG = "MicroMsg.Vendor.Huawei";
    private static Boolean ifHUAWEI;
    private static Boolean ifOnlyHUAWEI;
    private static String systemName;

    private static String getProperty() {
        Class<String> cls = String.class;
        if (!Util.isNullOrNil(systemName)) {
            return systemName;
        }
        String str = "unknown";
        try {
            Class<?> cls2 = Class.forName("android.os.SystemProperties");
            str = (String) cls2.getMethod("get", new Class[]{cls, cls}).invoke(cls2, new Object[]{HUAWEI_SYSTEM_STRING, str});
        } catch (Exception e) {
            Log.m105921e(TAG, "getProperty() Exception:%s", e.getMessage());
        }
        String lowerCase = Util.nullAs(str, "").toLowerCase();
        systemName = lowerCase;
        return lowerCase;
    }

    public static boolean huaweihasCutOut(Context context) {
        if (context == null) {
            return false;
        }
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            boolean booleanValue = ((Boolean) loadClass.getMethod("hasNotchInScreen", new Class[0]).invoke(loadClass, new Object[0])).booleanValue();
            Log.m105919d(TAG, "huawei hasCutOut: %s", Boolean.valueOf(booleanValue));
            return booleanValue;
        } catch (ClassNotFoundException unused) {
            Log.m105920e(TAG, "hasCutOut, ClassNotFoundException!!");
            Log.m105919d(TAG, "huawei hasCutOut: %s", Boolean.FALSE);
            return false;
        } catch (NoSuchMethodException unused2) {
            Log.m105920e(TAG, "hasCutOut, NoSuchMethodException!!");
            Log.m105919d(TAG, "huawei hasCutOut: %s", Boolean.FALSE);
            return false;
        } catch (IllegalAccessException unused3) {
            Log.m105920e(TAG, "hasCutOut, IllegalAccessException!!");
            Log.m105919d(TAG, "huawei hasCutOut: %s", Boolean.FALSE);
            return false;
        } catch (InvocationTargetException unused4) {
            Log.m105920e(TAG, "hasCutOut, InvocationTargetException!!");
            Log.m105919d(TAG, "huawei hasCutOut: %s", Boolean.FALSE);
            return false;
        } catch (Throwable unused5) {
            Log.m105919d(TAG, "huawei hasCutOut: %s", Boolean.FALSE);
            return false;
        }
    }

    @Deprecated
    public static boolean ifHUAWEI() {
        if (ifHUAWEI == null) {
            String str = Build.BRAND;
            Log.m105925i(TAG, "Build.BRAND = %s", str);
            if ("HONOR".equalsIgnoreCase(str)) {
                ifHUAWEI = Boolean.TRUE;
            } else if ("HUAWEI".equalsIgnoreCase(str)) {
                ifHUAWEI = Boolean.TRUE;
            } else {
                ifHUAWEI = Boolean.FALSE;
            }
        }
        return ifHUAWEI.booleanValue();
    }

    public static boolean ifOnlyHUAWEI() {
        if (ifOnlyHUAWEI == null) {
            String str = Build.BRAND;
            Log.m105925i(TAG, "Build.BRAND = %s", str);
            if ("HUAWEI".equalsIgnoreCase(str)) {
                ifOnlyHUAWEI = Boolean.TRUE;
            } else if ("HONOR".equalsIgnoreCase(str)) {
                String str2 = Build.MANUFACTURER;
                Log.m105925i(TAG, "Build.MANUFACTURER = %s", str2);
                ifOnlyHUAWEI = Boolean.valueOf(!"HONOR".equalsIgnoreCase(str2));
            } else {
                ifOnlyHUAWEI = Boolean.FALSE;
            }
        }
        return ifOnlyHUAWEI.booleanValue();
    }

    public static boolean isEMUI10() {
        return getProperty().startsWith(HUAWEI_SYSTEM_EMUI10_START.toLowerCase());
    }

    public static boolean isEMUI8() {
        return getProperty().startsWith(HUAWEI_SYSTEM_EMUI8_START.toLowerCase());
    }

    public static boolean isEMUI9() {
        return getProperty().startsWith(HUAWEI_SYSTEM_EMUI9_START.toLowerCase());
    }

    public static boolean isNotBelowEMUI10() {
        return getProperty().startsWith(HUAWEI_SYSTEM_NOT_BELOW_EMUI10_START.toLowerCase());
    }
}
