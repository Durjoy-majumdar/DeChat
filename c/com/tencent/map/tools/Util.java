package com.tencent.map.tools;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.ConfigurationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.tencent.mapsdk.internal.C114202sh;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class Util {
    private static final boolean DEBUG = false;
    private static final int DEFAUlT_GlEsVersion = 65537;
    private static final String DUID_FILE_NAME = "txlbs_duid";
    private static final String DUID_KEY = "txlbs_key_duid";
    public static final String META_NAME_API_KEY = "TencentMapSDK";
    public static final int SMALL_SCREEN_THRESHOLD = 400;
    private static final String SUID_FILE_NAME = "txlbs_suid";
    private static final String SUID_KEY = "txlbs_key_suid";
    private static final String TAG = "Util";

    public static boolean equals(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static String filterBuilder(String... strArr) {
        if (strArr == null) {
            return "";
        }
        String str = "category=";
        for (int i = 0; i < strArr.length; i++) {
            if (i == 0) {
                str = str + strArr[i];
            } else {
                str = str + "," + strArr[i];
            }
        }
        return str;
    }

    public static Class findClass(String str, ClassLoader classLoader) {
        try {
            return Class.forName(str, false, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static Field findField(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            if (cls.getSuperclass() != Object.class) {
                return findField(cls.getSuperclass(), str);
            }
            return null;
        }
    }

    public static Method findMethod(Class cls, String str, Class[] clsArr) {
        try {
            return cls.getDeclaredMethod(str, clsArr);
        } catch (NoSuchMethodException unused) {
            if (cls.getSuperclass() != Object.class) {
                return findMethod(cls.getSuperclass(), str, clsArr);
            }
            return null;
        }
    }

    public static <T> void foreach(Iterable<T> iterable, Callback<T> callback) {
        if (iterable != null && callback != null) {
            for (T callback2 : iterable) {
                callback.callback(callback2);
            }
        }
    }

    public static String getAppName(Context context) {
        String rawAppName = getRawAppName(context);
        try {
            return URLEncoder.encode(rawAppName, "utf-8");
        } catch (Exception unused) {
            return rawAppName;
        }
    }

    public static String getAppVersion(Context context) {
        if (context == null) {
            return "";
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            String str = packageInfo.versionName;
            int i = packageInfo.versionCode;
            return str + i;
        } catch (Exception unused) {
            return "";
        }
    }

    public static float getDensity(Context context) {
        if (context == null) {
            return 1.0f;
        }
        return context.getResources().getDisplayMetrics().density;
    }

    public static String getDuid(Context context) {
        return context == null ? "" : getDuidFromSharePrerences(context);
    }

    private static String getDuidFromSharePrerences(Context context) {
        String sharePreference = getSharePreference(context, DUID_FILE_NAME, DUID_KEY);
        if (!TextUtils.isEmpty(sharePreference)) {
            return sharePreference;
        }
        String a = C114202sh.m159630a(context);
        saveSharePreference(context, DUID_FILE_NAME, DUID_KEY, a);
        return a;
    }

    public static Object getField(Object obj, String str) {
        if (obj == null) {
            return null;
        }
        try {
            Class<?> cls = obj.getClass();
            if (obj instanceof Class) {
                cls = (Class) obj;
            }
            Field findField = findField(cls, str);
            if (findField != null) {
                findField.setAccessible(true);
                return findField.get(obj);
            }
        } catch (IllegalAccessException unused) {
        }
        return null;
    }

    public static String getMD5String(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return getMD5String(str.getBytes());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        r4 = r2.metaData;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getMetaKey(android.content.Context r4, java.lang.String r5) {
        /*
            java.lang.String r0 = ""
            if (r4 != 0) goto L_0x0005
            return r0
        L_0x0005:
            java.lang.String r1 = r4.getPackageName()
            r2 = 0
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0015 }
            r3 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r2 = r4.getApplicationInfo(r1, r3)     // Catch:{ NameNotFoundException -> 0x0015 }
            goto L_0x0016
        L_0x0015:
        L_0x0016:
            if (r2 != 0) goto L_0x0019
            return r0
        L_0x0019:
            android.os.Bundle r4 = r2.metaData
            if (r4 != 0) goto L_0x001e
            return r0
        L_0x001e:
            java.lang.String r4 = r4.getString(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.map.tools.Util.getMetaKey(android.content.Context, java.lang.String):java.lang.String");
    }

    public static int getOpenglesVersion(Context context) {
        ConfigurationInfo deviceConfigurationInfo = ((ActivityManager) context.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getDeviceConfigurationInfo();
        return deviceConfigurationInfo != null ? deviceConfigurationInfo.reqGlEsVersion : DEFAUlT_GlEsVersion;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033 A[SYNTHETIC, Splitter:B:15:0x0033] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getProcessName(int r5) {
        /*
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ all -> 0x0030 }
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ all -> 0x0030 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0030 }
            java.lang.String r4 = "/proc/"
            r3.<init>(r4)     // Catch:{ all -> 0x0030 }
            r3.append(r5)     // Catch:{ all -> 0x0030 }
            java.lang.String r5 = "/cmdline"
            r3.append(r5)     // Catch:{ all -> 0x0030 }
            java.lang.String r5 = r3.toString()     // Catch:{ all -> 0x0030 }
            r2.<init>(r5)     // Catch:{ all -> 0x0030 }
            r1.<init>(r2)     // Catch:{ all -> 0x0030 }
            java.lang.String r5 = r1.readLine()     // Catch:{ all -> 0x0031 }
            boolean r2 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0031 }
            if (r2 != 0) goto L_0x002c
            java.lang.String r5 = r5.trim()     // Catch:{ all -> 0x0031 }
        L_0x002c:
            r1.close()     // Catch:{ IOException -> 0x002f }
        L_0x002f:
            return r5
        L_0x0030:
            r1 = r0
        L_0x0031:
            if (r1 == 0) goto L_0x0036
            r1.close()     // Catch:{ IOException -> 0x0036 }
        L_0x0036:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.map.tools.Util.getProcessName(int):java.lang.String");
    }

    public static String getRawAppName(Context context) {
        if (context == null) {
            return "";
        }
        PackageManager packageManager = context.getPackageManager();
        ApplicationInfo applicationInfo = null;
        try {
            applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return (applicationInfo != null ? applicationInfo.loadLabel(packageManager) : "can't find app name").toString();
    }

    public static String getResolution(Context context) {
        if (context == null) {
            return "";
        }
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            return displayMetrics.widthPixels + "*" + displayMetrics.heightPixels;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String getSharePreference(Context context, String str, String str2) {
        return context == null ? "" : context.getSharedPreferences(str, 0).getString(str2, "");
    }

    public static String getSuid(Context context) {
        return context == null ? "" : getSuidFromSharePrerences(context);
    }

    private static String getSuidFromSharePrerences(Context context) {
        String sharePreference = getSharePreference(context, SUID_FILE_NAME, SUID_KEY);
        if (!TextUtils.isEmpty(sharePreference)) {
            return sharePreference;
        }
        String uuid = getUUID();
        saveSharePreference(context, SUID_FILE_NAME, SUID_KEY, uuid);
        return uuid;
    }

    public static String getUUID() {
        try {
            return UUID.randomUUID().toString();
        } catch (Exception unused) {
            StringBuilder sb = new StringBuilder();
            sb.append(System.currentTimeMillis());
            return sb.toString();
        }
    }

    public static int getWindowHeight(Context context) {
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static int getWindowWidth(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static int hash(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static Object invokeMethod(Object obj, String str, Object... objArr) {
        if (obj == null) {
            return null;
        }
        int length = objArr.length;
        Class[] clsArr = new Class[length];
        for (int i = 0; i < length; i++) {
            clsArr[i] = objArr[i].getClass();
        }
        try {
            Method findMethod = findMethod(obj.getClass(), str, clsArr);
            if (findMethod != null) {
                findMethod.setAccessible(true);
                return findMethod.invoke(obj, objArr);
            }
        } catch (IllegalAccessException unused) {
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e.getTargetException());
        }
        return null;
    }

    public static Object invokeStaticMethod(Class cls, String str, Class[] clsArr, Object[] objArr) {
        if (cls == null) {
            return null;
        }
        try {
            Method findMethod = findMethod(cls, str, clsArr);
            if (findMethod != null) {
                findMethod.setAccessible(true);
                return findMethod.invoke(cls, objArr);
            }
        } catch (IllegalAccessException unused) {
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e.getTargetException());
        }
        return null;
    }

    private static boolean isMatchClassTypes(Class<?>[] clsArr, Object[] objArr) {
        if (clsArr.length != objArr.length) {
            return false;
        }
        int i = 0;
        for (int i2 = 0; i2 < clsArr.length; i2++) {
            if (clsArr[i2] == objArr[i2].getClass() || clsArr[i2].isAssignableFrom(objArr[i2].getClass())) {
                i++;
            }
        }
        return i == clsArr.length;
    }

    public static <T> List<T> listWhere(Iterable<T> iterable, Condition<T> condition) {
        List<T> emptyList = Collections.emptyList();
        if (!(iterable == null || condition == null)) {
            for (T next : iterable) {
                if (condition.callback(next).booleanValue()) {
                    emptyList.add(next);
                }
            }
        }
        return emptyList;
    }

    public static <T> T newInstance(Class<T> cls, Object... objArr) {
        if (cls != null && !cls.isEnum() && !cls.isInterface() && !cls.isAnnotation() && !cls.isArray()) {
            Constructor[] declaredConstructors = cls.getDeclaredConstructors();
            int i = 0;
            while (i < declaredConstructors.length) {
                if (isMatchClassTypes(declaredConstructors[i].getParameterTypes(), objArr)) {
                    try {
                        declaredConstructors[i].setAccessible(true);
                        return declaredConstructors[i].newInstance(objArr);
                    } catch (IllegalAccessException | InstantiationException unused) {
                    } catch (InvocationTargetException e) {
                        throw new RuntimeException(e.getTargetException());
                    }
                } else {
                    i++;
                }
            }
            try {
                return cls.newInstance();
            } catch (IllegalAccessException unused2) {
            } catch (InstantiationException e2) {
                throw new RuntimeException(e2);
            }
        }
        return null;
    }

    public static void saveSharePreference(Context context, String str, String str2, String str3) {
        if (context != null) {
            SharedPreferences.Editor edit = context.getSharedPreferences(str, 0).edit();
            edit.putString(str2, str3);
            edit.apply();
        }
    }

    public static void setField(Object obj, String str, Object obj2) {
        if (obj != null) {
            try {
                Field findField = findField(obj.getClass(), str);
                if (findField != null) {
                    findField.setAccessible(true);
                    findField.set(obj, obj2);
                }
            } catch (IllegalAccessException unused) {
            }
        }
    }

    public static <T> T singleWhere(Iterable<T> iterable, Condition<T> condition) {
        if (!(iterable == null || condition == null)) {
            for (T next : iterable) {
                if (condition.callback(next).booleanValue()) {
                    return next;
                }
            }
        }
        return null;
    }

    public static <T> boolean where(Iterable<T> iterable, ReturnCallback<Boolean, T> returnCallback) {
        if (!(iterable == null || returnCallback == null)) {
            for (T callback : iterable) {
                if (returnCallback.callback(callback).booleanValue()) {
                    return true;
                }
            }
            returnCallback.callback(null);
        }
        return false;
    }

    public static <T> Class<? extends T> findClass(String str, Class<T> cls, ClassLoader classLoader) {
        try {
            Class<?> cls2 = Class.forName(str, false, classLoader);
            if (cls.isAssignableFrom(cls2)) {
                return cls2;
            }
            return null;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static <T> void foreach(T[] tArr, Callback<T> callback) {
        if (tArr != null && callback != null) {
            for (T callback2 : tArr) {
                callback.callback(callback2);
            }
        }
    }

    public static String getMD5String(byte[] bArr) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(bArr);
            byte[] digest = instance.digest();
            char[] cArr2 = new char[32];
            int i = 0;
            for (int i2 = 0; i2 < 16; i2++) {
                byte b = digest[i2];
                int i3 = i + 1;
                cArr2[i] = cArr[(b >>> 4) & 15];
                i = i3 + 1;
                cArr2[i3] = cArr[b & 15];
            }
            return new String(cArr2);
        } catch (Exception unused) {
            return null;
        }
    }

    public static <T> boolean where(T[] tArr, ReturnCallback<Boolean, T> returnCallback) {
        if (!(tArr == null || returnCallback == null)) {
            for (T callback : tArr) {
                if (returnCallback.callback(callback).booleanValue()) {
                    return true;
                }
            }
            returnCallback.callback(null);
        }
        return false;
    }

    public static Object invokeMethod(Object obj, String str, Class[] clsArr, Object[] objArr) {
        if (obj == null) {
            return null;
        }
        try {
            Method findMethod = findMethod(obj.getClass(), str, clsArr);
            if (findMethod != null) {
                findMethod.setAccessible(true);
                return findMethod.invoke(obj, objArr);
            }
        } catch (IllegalAccessException unused) {
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e.getTargetException());
        }
        return null;
    }
}
