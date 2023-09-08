package com.tencent.liteav.audio.earmonitor.p938a.p1179b.p1180a;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import com.tencent.liteav.base.util.LiteavLog;

/* renamed from: com.tencent.liteav.audio.earmonitor.a.b.a.b */
public final class C113440b {

    /* renamed from: b */
    private static final Object f339480b = new Object();

    /* renamed from: c */
    private static final Object f339481c = new Object();

    /* renamed from: d */
    private static final Object f339482d = new Object();

    /* renamed from: e */
    private static final Object f339483e = new Object();

    /* renamed from: f */
    private static C113440b f339484f;

    /* renamed from: a */
    public C113449e f339485a = null;

    /* renamed from: a */
    public static C113440b m155308a() {
        C113440b bVar;
        synchronized (f339481c) {
            if (f339484f == null) {
                f339484f = new C113440b();
            }
            bVar = f339484f;
        }
        return bVar;
    }

    /* renamed from: a */
    public static <T extends C113439a> T m155307a(int i, Context context) {
        if (context == null || i != 1) {
            return null;
        }
        T cVar = new C113441c(context);
        cVar.mo169925a(context);
        return cVar;
    }

    /* renamed from: a */
    public static void m155310a(Context context, ServiceConnection serviceConnection, String str) {
        synchronized (f339482d) {
            if (context != null) {
                Intent intent = new Intent();
                intent.setClassName("com.huawei.multimedia.audioengine", str);
                try {
                    context.bindService(intent, serviceConnection, 1);
                } catch (SecurityException e) {
                    LiteavLog.m16900e("HwAudioKit.FeatureKitManager", "bindService, SecurityException, %s", e.getMessage());
                }
            }
        }
    }

    /* renamed from: a */
    public static void m155309a(Context context, ServiceConnection serviceConnection) {
        synchronized (f339483e) {
            if (context != null) {
                context.unbindService(serviceConnection);
            }
        }
    }

    /* renamed from: a */
    public static boolean m155311a(Context context) {
        if (context == null) {
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return true;
        }
        try {
            if (packageManager.getPackageInfo("com.huawei.multimedia.audioengine", 0) == null) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            LiteavLog.m16898e("HwAudioKit.FeatureKitManager", "isAudioKitSupport ,NameNotFoundException");
            return false;
        }
    }

    /* renamed from: a */
    public final void mo169921a(int i) {
        synchronized (f339480b) {
            C113449e eVar = this.f339485a;
            if (eVar != null) {
                eVar.mo169913a(i);
            }
        }
    }
}
