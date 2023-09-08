package com.tencent.midas.jsbridge;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.midas.comm.APLog;
import com.tencent.midas.data.APPluginDataInterface;
import com.tencent.midas.data.APPluginReportManager;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class APX5 {
    private static String getTbsVersion() {
        try {
            Class<?> cls = Class.forName("com.tencent.smtt.sdk.TbsConfig");
            Field field = cls.getField("TBS_SDK_VERSIONNAME");
            field.setAccessible(true);
            return (String) field.get(cls);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return "unknown";
        }
    }

    private static boolean hasInitX5Method() {
        try {
            return Class.forName("com.tencent.smtt.sdk.QbSdk").getMethod("initX5Environment", new Class[]{Context.class, Class.forName("com.tencent.smtt.sdk.QbSdk$PreInitCallback")}) != null;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return false;
        }
    }

    private static boolean initTbs(Context context) {
        APLog.m161212e("APX5", "init Tbs Start");
        APPluginReportManager.getInstance().insertData(APPluginDataInterface.singleton().getLaunchInterface(), APPluginReportManager.MIDASPLUGIN_X5_INIT, "", "");
        boolean z = false;
        try {
            String tbsVersion = getTbsVersion();
            APLog.m161212e("APX5", "get tbs version: " + tbsVersion);
            if (hasInitX5Method()) {
                APLog.m161212e("APX5", "tbs has initX5 method");
                initX5Environment(context);
                z = true;
                APLog.m161212e("APX5", "init Tbs Success. use X5 instead of Native WebView");
            } else {
                APLog.m161212e("APX5", "tbs has no initX5 method");
                APLog.m161212e("APX5", "unsupported tbs, version: " + tbsVersion);
            }
        } catch (Throwable th) {
            APLog.m161212e("APX5", "init tbs failed, use native WebView!");
            APLog.m161212e("APX5", "unsupported tbs: exception: " + th.getMessage());
        }
        APLog.m161212e("APX5", "initTbs End");
        APPluginReportManager.getInstance().insertData(APPluginDataInterface.singleton().getLaunchInterface(), z ? APPluginReportManager.MIDASPLUGIN_X5_INIT_SUCCESS : APPluginReportManager.MIDASPLUGIN_X5_INIT_FAIL, "", "");
        return z;
    }

    public static void initX5(Context context) {
        APLog.m161212e("APX5", ">>>>>>> initX5 Start <<<<<<<");
        if (!isX5Enabled(context)) {
            APLog.m161212e("APX5", ">>>>>>> X5 is missed or disabled, use native WebView");
        } else {
            APLog.m161212e("APX5", ">>>>>>> initX5 End <<<<<<<");
        }
    }

    private static void initX5Environment(final Context context) {
        new Thread(new Runnable() {
            public void run() {
                try {
                    Method method = Class.forName("com.tencent.smtt.sdk.QbSdk").getMethod("initX5Environment", new Class[]{Context.class, Class.forName("com.tencent.smtt.sdk.QbSdk$PreInitCallback")});
                    if (method != null) {
                        method.setAccessible(true);
                        method.invoke((Object) null, new Object[]{context.getApplicationContext(), null});
                    }
                } catch (Exception unused) {
                }
            }
        }).start();
    }

    public static boolean isX5Enabled(Context context) {
        Context applicationContext = context.getApplicationContext();
        String string = applicationContext.getSharedPreferences(APPluginDataInterface.SHARE_PREFERENCE_NAME, 4).getString("enableX5", "1");
        boolean z = !TextUtils.isEmpty(string) ? !string.equals("0") : true;
        APLog.m161212e("APX5", "is enable X5: " + string);
        return z && initTbs(applicationContext);
    }

    private static boolean needDownloadTbs(Context context) {
        try {
            Method method = Class.forName("com.tencent.smtt.sdk.TbsDownloader").getMethod("needDownload", new Class[]{Context.class});
            if (method != null) {
                method.setAccessible(true);
                return ((Boolean) method.invoke((Object) null, new Object[]{context})).booleanValue();
            }
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        return false;
    }

    private static void preInit(Context context) {
        try {
            Method method = Class.forName("com.tencent.smtt.sdk.QbSdk").getMethod("preInit", new Class[]{Context.class});
            if (method != null) {
                method.setAccessible(true);
                method.invoke((Object) null, new Object[]{context});
            }
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
    }
}
