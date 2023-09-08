package com.tencent.p014mm.sdk.platformtools;

import android.app.Application;
import java.lang.reflect.Method;

/* renamed from: com.tencent.mm.sdk.platformtools.ApplicationGlobal */
public class ApplicationGlobal {
    private static final String TAG = "MicroMsg.sdk.ApplicationGlobal";
    private static Application sActivityThreadApp;
    private static Application sAttachedApp;

    public static synchronized void attach(Application application) {
        synchronized (ApplicationGlobal.class) {
            if (sAttachedApp == null) {
                sAttachedApp = application;
            }
        }
    }

    public static synchronized Application context() {
        synchronized (ApplicationGlobal.class) {
            Application application = sAttachedApp;
            if (application != null) {
                return application;
            }
            Application application2 = sActivityThreadApp;
            if (application2 != null) {
                return application2;
            }
            Application activityThreadApplication = getActivityThreadApplication();
            sActivityThreadApp = activityThreadApplication;
            if (activityThreadApplication != null) {
                return activityThreadApplication;
            }
            throw new IllegalStateException("Please make sure you do not call Applications#context() before or inside Application#attachBaseContext(Context). If you have to, please call Applications#attach(Application) first.");
        }
    }

    private static Application getActivityThreadApplication() {
        try {
            Method declaredMethod = Class.forName("android.app.AppGlobals").getDeclaredMethod("getInitialApplication", new Class[0]);
            declaredMethod.setAccessible(true);
            return (Application) declaredMethod.invoke((Object) null, new Object[0]);
        } catch (Exception e) {
            try {
                Method declaredMethod2 = Class.forName("android.app.ActivityThread").getDeclaredMethod("currentApplication", new Class[0]);
                declaredMethod2.setAccessible(true);
                return (Application) declaredMethod2.invoke((Object) null, new Object[0]);
            } catch (Exception e2) {
                Log.m105928w(TAG, "get activity thread fail, error = " + e.getMessage() + " & " + e2.getMessage());
                return null;
            }
        }
    }
}
