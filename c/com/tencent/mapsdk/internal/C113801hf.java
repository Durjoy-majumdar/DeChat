package com.tencent.mapsdk.internal;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ConfigurationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.tencent.map.tools.Util;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import java.net.URLEncoder;

/* renamed from: com.tencent.mapsdk.internal.hf */
public final class C113801hf {

    /* renamed from: a */
    public static final int f340520a = 400;

    /* renamed from: b */
    public static final String f340521b = "TencentMapSDK";

    /* renamed from: c */
    private static final int f340522c = 65537;

    /* renamed from: d */
    private static String f340523d;

    /* renamed from: e */
    private static String f340524e;

    /* renamed from: f */
    private static String f340525f;

    /* renamed from: a */
    public static float m157135a(Context context) {
        if (context == null) {
            return 1.0f;
        }
        return context.getResources().getDisplayMetrics().density;
    }

    /* renamed from: b */
    public static int m157140b(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    /* renamed from: c */
    public static int m157142c(Context context) {
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    /* renamed from: d */
    public static int[] m157144d(Context context) {
        Point point = new Point();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getSize(point);
        return new int[]{point.x, point.y};
    }

    /* renamed from: e */
    public static String m157145e(Context context) {
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

    /* renamed from: f */
    public static String m157146f(Context context) {
        return Util.getMD5String(Util.getSuid(context));
    }

    /* renamed from: g */
    public static String m157147g(Context context) {
        return Util.getMD5String(Util.getDuid(context));
    }

    /* renamed from: h */
    public static String m157148h(Context context) {
        if (context == null) {
            return "";
        }
        PackageManager packageManager = context.getPackageManager();
        ApplicationInfo applicationInfo = null;
        try {
            applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException unused) {
        }
        try {
            return URLEncoder.encode((applicationInfo != null ? applicationInfo.loadLabel(packageManager) : "can't find app name").toString(), "utf-8");
        } catch (Exception unused2) {
            return "";
        }
    }

    /* renamed from: i */
    public static String m157149i(Context context) {
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

    /* renamed from: j */
    private static int m157150j(Context context) {
        ConfigurationInfo deviceConfigurationInfo = ((ActivityManager) context.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getDeviceConfigurationInfo();
        return deviceConfigurationInfo != null ? deviceConfigurationInfo.reqGlEsVersion : f340522c;
    }

    /* renamed from: a */
    public static String m157138a(Context context, String str) {
        Bundle bundle;
        if (context == null) {
            return "";
        }
        ApplicationInfo applicationInfo = null;
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
            return "";
        }
        return bundle.getString(str);
    }

    /* renamed from: b */
    public static String m157141b() {
        if (f340523d == null) {
            f340523d = "undefined";
        }
        return f340523d;
    }

    /* renamed from: c */
    public static String m157143c() {
        if (f340524e == null) {
            f340524e = Build.MODEL;
        }
        return f340524e;
    }

    /* renamed from: a */
    public static String m157137a() {
        if (f340525f == null) {
            f340525f = Util.getMD5String(Util.getUUID());
        }
        return f340525f;
    }

    /* renamed from: a */
    private static boolean m157139a(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        return f2 >= ((float) i2) && f2 <= ((float) (view.getMeasuredHeight() + i2)) && f >= ((float) i) && f <= ((float) (view.getMeasuredWidth() + i));
    }

    /* renamed from: a */
    public static Rect m157136a(View view) {
        if (view == null) {
            return new Rect();
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        return new Rect(i, i2, view.getMeasuredWidth() + i, view.getMeasuredHeight() + i2);
    }
}
