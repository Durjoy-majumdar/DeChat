package com.tencent.tmsqmsp.oaid2;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.tencent.tmsqmsp.oaid2.e */
public class C86057e {

    /* renamed from: a */
    public static Context f250528a;

    /* renamed from: a */
    public static Context m106548a() {
        Context context;
        synchronized (C86057e.class) {
            if (f250528a == null) {
                f250528a = m106550b();
            }
            context = f250528a;
        }
        return context;
    }

    /* renamed from: b */
    public static Context m106550b() {
        try {
            return (Context) Class.forName("android.app.ActivityThread").getDeclaredMethod("currentApplication", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | SecurityException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m106549a(Context context) {
        String str;
        if (context == null) {
            return "";
        }
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            if (applicationInfo == null || TextUtils.isEmpty(applicationInfo.packageName)) {
                str = m106548a().getPackageName();
            } else {
                str = applicationInfo.packageName;
            }
            return str;
        } catch (Exception unused) {
            return "";
        }
    }
}
