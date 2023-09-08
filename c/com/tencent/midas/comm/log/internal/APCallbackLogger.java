package com.tencent.midas.comm.log.internal;

import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.Locale;

public class APCallbackLogger {
    private static Object logCallbackObj;
    private static Method onLoggingMethod;

    public static boolean init(String str) {
        Class<String> cls = String.class;
        if (!TextUtils.isEmpty(str)) {
            try {
                Class<?> cls2 = Class.forName(str);
                logCallbackObj = cls2.newInstance();
                onLoggingMethod = cls2.getDeclaredMethod("onLogging", new Class[]{Integer.TYPE, cls, cls});
            } catch (Exception unused) {
                return false;
            }
        }
        return true;
    }

    public static void log(int i, String str, String str2) {
        Method method;
        int i2 = 0;
        while (i2 < str2.length()) {
            try {
                int i3 = i2 + 3600;
                String substring = str2.length() <= i3 ? str2.substring(i2) : str2.substring(i2, i3);
                Object obj = logCallbackObj;
                if (!(obj == null || (method = onLoggingMethod) == null)) {
                    try {
                        method.invoke(obj, new Object[]{Integer.valueOf(i), str, substring});
                    } catch (Exception unused) {
                    }
                }
                i2 = i3;
            } catch (Throwable th) {
                String.format(Locale.CHINA, "print log error: <%s>%s", new Object[]{th.getClass().getName(), th.getMessage()});
                return;
            }
        }
    }

    public static void release() {
        logCallbackObj = null;
        onLoggingMethod = null;
    }
}
