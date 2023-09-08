package com.tencent.tmsqmsp.oaid2;

import android.content.Context;
import java.lang.reflect.Method;

/* renamed from: com.tencent.tmsqmsp.oaid2.y */
public class C116487y {
    /* renamed from: a */
    public static final boolean m164289a() {
        Context context = null;
        try {
            Method method = Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]);
            method.setAccessible(true);
            context = (Context) method.invoke((Object) null, new Object[0]);
        } catch (Exception e) {
            e.toString();
        }
        if (context == null) {
            return false;
        }
        return C116486x.m164281a().mo179956a(context, false);
    }

    /* renamed from: b */
    public static String m164290b(Context context) {
        C116486x a = C116486x.m164281a();
        return a.mo179954a(context.getApplicationContext(), a.f349435b);
    }

    /* renamed from: a */
    public static String m164288a(Context context) {
        C116486x a = C116486x.m164281a();
        return a.mo179954a(context.getApplicationContext(), a.f349436c);
    }
}
