package com.tencent.liteav.base.system;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.util.C113472r;

/* renamed from: com.tencent.liteav.base.system.a */
final class C113457a {

    /* renamed from: a */
    private static final C113472r<PackageInfo> f339521a = new C113472r<>(C113458b.m155344a());

    /* renamed from: a */
    public static String m155340a() {
        PackageInfo a = f339521a.mo169971a();
        return a == null ? "" : a.packageName;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        r2 = f339521a.mo169971a();
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m155341b() {
        /*
            android.content.Context r0 = com.tencent.liteav.base.ContextUtils.getApplicationContext()
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0009
            return r1
        L_0x0009:
            com.tencent.liteav.base.util.r<android.content.pm.PackageInfo> r2 = f339521a
            java.lang.Object r2 = r2.mo169971a()
            android.content.pm.PackageInfo r2 = (android.content.pm.PackageInfo) r2
            if (r2 != 0) goto L_0x0014
            return r1
        L_0x0014:
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.content.pm.ApplicationInfo r1 = r2.applicationInfo
            java.lang.CharSequence r0 = r0.getApplicationLabel(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.base.system.C113457a.m155341b():java.lang.String");
    }

    /* renamed from: c */
    public static String m155342c() {
        PackageInfo a = f339521a.mo169971a();
        return a == null ? "" : a.versionName;
    }

    /* renamed from: d */
    public static /* synthetic */ PackageInfo m155343d() {
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null) {
            return null;
        }
        return applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 0);
    }
}
