package com.tencent.p014mm.plugin.appbrand.app;

import android.app.Application;
import android.os.Handler;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: com.tencent.mm.plugin.appbrand.app.a */
public class C81144a {

    /* renamed from: com.tencent.mm.plugin.appbrand.app.a$a */
    public static class C81145a {

        /* renamed from: a */
        public static Object f238455a;

        /* renamed from: b */
        public static Handler f238456b;
    }

    /* renamed from: a */
    public static void m99391a(Application application) {
        Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new Class[0]);
        method.setAccessible(true);
        Object invoke = method.invoke((Object) null, new Object[0]);
        if (invoke == null) {
            Field field = application.getClass().getField("mLoadedApk");
            field.setAccessible(true);
            Object obj = field.get(application);
            Field declaredField = obj.getClass().getDeclaredField("mActivityThread");
            declaredField.setAccessible(true);
            invoke = declaredField.get(obj);
        }
        C81145a.f238455a = invoke;
        Field declaredField2 = invoke.getClass().getDeclaredField("mH");
        declaredField2.setAccessible(true);
        C81145a.f238456b = (Handler) declaredField2.get(invoke);
    }
}
