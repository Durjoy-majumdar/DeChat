package com.tencent.p014mm.app;

import android.content.Context;
import android.os.Environment;
import bp3.C79757o;

/* renamed from: com.tencent.mm.app.x */
public class C80634x {
    /* renamed from: a */
    public static String m98271a(Context context, String str) {
        return context.getSharedPreferences(context.getPackageName() + "_preferences", 0).getString("last_login_uin", str);
    }

    /* renamed from: b */
    public static String m98272b(Context context) {
        return "com.tencent.mm:isolated_process0".equalsIgnoreCase(C79757o.m96896a(context)) ? "/sdcard" : Environment.getExternalStorageDirectory().getAbsolutePath();
    }
}
