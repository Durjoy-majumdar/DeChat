package com.tencent.midas.plugin;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.tencent.midas.comm.APLog;
import com.tencent.midas.control.APMidasPayHelper;
import com.tencent.midas.data.APPluginReportManager;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;

public class APPluginInterfaceManager {
    public static final String TAG = "APPluginInterfaceManager";

    private static Class<?> getObjectClass(Context context, String str, String str2, String str3) {
        String str4;
        try {
            str4 = APPluginInstallerAndUpdater.getInstallPath(context, str).getCanonicalPath();
        } catch (Exception unused) {
            str4 = "";
        }
        try {
            ConcurrentHashMap<String, PackageInfo> concurrentHashMap = APPluginStatic.sPackageInfoMap;
            if (concurrentHashMap.get(str4) == null) {
                PackageInfo packageInfo = APApkFileParser.getPackageInfo(context, str4, 1);
                if (packageInfo == null) {
                    return null;
                }
                concurrentHashMap.put(str4, packageInfo);
            }
            return APPluginLoader.getOrCreateClassLoaderByPath(context, str, str4).loadClass(str2);
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Class<?>[] getParamsType(java.lang.Object[] r5) {
        /*
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            if (r5 == 0) goto L_0x0026
            int r1 = r5.length
            java.lang.Class[] r2 = new java.lang.Class[r1]
            r3 = 0
        L_0x0008:
            if (r3 >= r1) goto L_0x0027
            r4 = r5[r3]
            if (r4 == 0) goto L_0x0023
            java.lang.Class r4 = r4.getClass()
            boolean r4 = r0.isAssignableFrom(r4)
            if (r4 == 0) goto L_0x001b
            r2[r3] = r0
            goto L_0x0023
        L_0x001b:
            r4 = r5[r3]
            java.lang.Class r4 = r4.getClass()
            r2[r3] = r4
        L_0x0023:
            int r3 = r3 + 1
            goto L_0x0008
        L_0x0026:
            r2 = 0
        L_0x0027:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.midas.plugin.APPluginInterfaceManager.getParamsType(java.lang.Object[]):java.lang.Class[]");
    }

    public static Object initPluginInterface(Context context, String str, String str2, String str3, Object[] objArr) {
        APLog.m161210d(TAG, "Call into initPluginInterface  plugin = " + str + " interfaceClass = " + str2 + " methodName = " + str3 + " " + Thread.currentThread().getStackTrace()[3].toString());
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            APLog.m161214i("APPLuginProxyActivity", "initPluginInterface objClass param is null");
            return null;
        }
        Class<?> objectClass = getObjectClass(context, str, str2, str3);
        if (objectClass == null) {
            APPluginReportManager.getInstance().insertData(APPluginReportManager.MIDASPLUGIN_TIMENAME_LAUNCHPAY, APPluginReportManager.MIDASPLUGIN_FORMAT_APKLOAD_FAIL, str, "objClassIsNull");
            if (APMidasPayHelper.MED_DISTRIBUTE_PAY.equals(str3)) {
                APLog.m161210d(TAG, "initPluginInterface objClass is null, current method name = " + str3 + " we need to jump to pure h5 pay!");
                APPluginUtils.showLaunchPluginFail(context.getApplicationContext(), "", true);
            } else {
                APLog.m161210d(TAG, "initPluginInterface objClass is null, current method name = " + str3 + " no need to jump to pure h5 pay!");
                APPluginUtils.showLaunchPluginFail(context.getApplicationContext(), "", false);
            }
            APPluginStatic.removeAll();
            APPluginInstallerAndUpdater.unInstallPlugin(context);
            return null;
        }
        Method method = objectClass.getMethod(str3, getParamsType(objArr));
        method.setAccessible(true);
        long currentTimeMillis = System.currentTimeMillis();
        Object invoke = method.invoke(objectClass, objArr);
        long currentTimeMillis2 = System.currentTimeMillis();
        APLog.m161214i("APPLuginProxyActivity", "initPluginInterface method=" + method + " obj=" + invoke + " time=" + (currentTimeMillis2 - currentTimeMillis));
        return invoke;
    }

    public static Object initPluginInterface2(Context context, String str, String str2, String str3, Object[] objArr) {
        APLog.m161214i("APPLuginProxyActivity", "initPluginInterface2 pluginName=" + str);
        APLog.m161214i("APPLuginProxyActivity", "initPluginInterface2 interfaceClass=" + str2);
        APLog.m161214i("APPLuginProxyActivity", "initPluginInterface2 methodName=" + str3);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            APLog.m161214i("APPLuginProxyActivity", "initPluginInterface2 objClass param is null");
            return null;
        }
        Class<?> objectClass = getObjectClass(context, str, str2, str3);
        if (objectClass == null) {
            APLog.m161214i("APPLuginProxyActivity", "initPluginInterface2 objClass is null");
            APPluginReportManager.getInstance().insertData(APPluginReportManager.MIDASPLUGIN_TIMENAME_LAUNCHPAY, APPluginReportManager.MIDASPLUGIN_FORMAT_APKLOAD_FAIL, str, "objClassIsNull");
            APPluginUtils.showLaunchPluginFail(context.getApplicationContext(), "", false);
            APPluginStatic.removeAll();
            APPluginInstallerAndUpdater.unInstallPlugin(context);
            return null;
        }
        Class[] clsArr = {objArr[0].getClass(), objArr[1].getClass(), objArr[2].getClass()};
        APLog.m161214i("APPLuginProxyActivity", "initPluginInterface2 getMethod Name:" + str3);
        APLog.m161214i("APPLuginProxyActivity", "initPluginInterface2 getMethod objClass:" + objectClass);
        for (int i = 0; i < 3; i++) {
            APLog.m161214i("APPLuginProxyActivity", "initPluginInterface2 getMethod paraTypes:" + clsArr[i]);
        }
        Method method = objectClass.getMethod(str3, clsArr);
        APLog.m161214i("APPLuginProxyActivity", "initPluginInterface2 getMethod method:" + method);
        method.setAccessible(true);
        Object invoke = method.invoke(objectClass, objArr);
        APLog.m161214i("APPLuginProxyActivity", "initPluginInterface2 obj=" + invoke);
        return invoke;
    }

    public static Object initPluginInterface(Context context, String str, String str2, String str3, Object[] objArr, Class<?>[] clsArr) {
        APLog.m161214i("APPLuginProxyActivity", "initPluginInterface2 pluginName=" + str);
        APLog.m161214i("APPLuginProxyActivity", "initPluginInterface2 interfaceClass=" + str2);
        APLog.m161214i("APPLuginProxyActivity", "initPluginInterface2 methodName=" + str3);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            APLog.m161214i("APPLuginProxyActivity", "initPluginInterface2 objClass param is null");
            return null;
        }
        Class<?> objectClass = getObjectClass(context, str, str2, str3);
        if (objectClass == null) {
            APLog.m161214i("APPLuginProxyActivity", "initPluginInterface2 objClass is null");
            APPluginReportManager.getInstance().insertData(APPluginReportManager.MIDASPLUGIN_TIMENAME_LAUNCHPAY, APPluginReportManager.MIDASPLUGIN_FORMAT_APKLOAD_FAIL, str, "objClassIsNull");
            APPluginUtils.showLaunchPluginFail(context.getApplicationContext(), "", false);
            APPluginStatic.removeAll();
            APPluginInstallerAndUpdater.unInstallPlugin(context);
            return null;
        }
        APLog.m161214i("APPLuginProxyActivity", "initPluginInterface2 getMethod Name:" + str3);
        APLog.m161214i("APPLuginProxyActivity", "initPluginInterface2 getMethod objClass:" + objectClass);
        for (int i = 0; i < clsArr.length; i++) {
            APLog.m161214i("APPLuginProxyActivity", "initPluginInterface2 getMethod paraTypes:" + clsArr[i]);
        }
        Method method = objectClass.getMethod(str3, clsArr);
        APLog.m161214i("APPLuginProxyActivity", "initPluginInterface2 getMethod method:" + method);
        method.setAccessible(true);
        Object invoke = method.invoke(objectClass, objArr);
        APLog.m161214i("APPLuginProxyActivity", "initPluginInterface2 obj=" + invoke);
        return invoke;
    }
}
