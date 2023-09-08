package com.tencent.p014mm.sdk.vendor;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.tencent.mm.sdk.vendor.Vivo */
public class Vivo {
    private static final String TAG = "MicroMsg.Vendor.Vivo";

    public static boolean vivoSupportDarkMode() {
        boolean z;
        try {
            Class<?> cls = Class.forName("android.util.FtFeature");
            z = ((Boolean) cls.getDeclaredMethod("isFeatureSupport", new Class[]{String.class}).invoke(cls, new Object[]{"vivo.software.nightmode"})).booleanValue();
        } catch (Exception e) {
            Log.m105919d(TAG, "vivo supportDarkMode Exception!:%s", e);
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
            z = false;
        }
        Log.m105919d(TAG, "vivo supportDarkMode: %s", Boolean.valueOf(z));
        return z;
    }

    public static boolean vivohasCutOut(Context context) {
        if (context == null) {
            return false;
        }
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("android.util.FtFeature");
            boolean booleanValue = ((Boolean) loadClass.getMethod("isFeatureSupport", new Class[]{Integer.TYPE}).invoke(loadClass, new Object[]{32})).booleanValue();
            Log.m105919d(TAG, "vivo hasCutOut: %s", Boolean.valueOf(booleanValue));
            return booleanValue;
        } catch (ClassNotFoundException unused) {
            Log.m105920e(TAG, "hasCutOut, ClassNotFoundException!!");
            Log.m105919d(TAG, "vivo hasCutOut: %s", Boolean.FALSE);
            return false;
        } catch (NoSuchMethodException unused2) {
            Log.m105920e(TAG, "hasCutOut, NoSuchMethodException!!");
            Log.m105919d(TAG, "vivo hasCutOut: %s", Boolean.FALSE);
            return false;
        } catch (IllegalAccessException unused3) {
            Log.m105920e(TAG, "hasCutOut, IllegalAccessException!!");
            Log.m105919d(TAG, "vivo hasCutOut: %s", Boolean.FALSE);
            return false;
        } catch (InvocationTargetException unused4) {
            Log.m105920e(TAG, "hasCutOut, InvocationTargetException!!");
            Log.m105919d(TAG, "vivo hasCutOut: %s", Boolean.FALSE);
            return false;
        } catch (Throwable unused5) {
            Log.m105919d(TAG, "vivo hasCutOut: %s", Boolean.FALSE);
            return false;
        }
    }
}
