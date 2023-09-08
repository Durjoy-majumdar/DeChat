package com.tencent.p014mm.plugin.appbrand.launching;

import android.app.Activity;
import android.content.Context;
import com.tencent.p014mm.modelappbrand.LaunchParamsOptional;
import com.tencent.p014mm.plugin.appbrand.appcache.C81289m;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.p014mm.plugin.appbrand.launching.params.LaunchParcel;
import com.tencent.p014mm.plugin.appbrand.launching.precondition.C83428o;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.reflect.Method;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.a */
public abstract class C83285a implements C83428o {
    /* renamed from: a */
    public static void m102231a(Activity activity) {
        try {
            Method declaredMethod = Activity.class.getDeclaredMethod("convertFromTranslucent", new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(activity, new Object[0]);
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.AppBrand.Precondition.AbstractLaunchEntry", th, "call convertActivityFromTranslucent Fail: %s", th.getMessage());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a6, code lost:
        if (r0 == null) goto L_0x00b3;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo115582b(android.content.Context r8, com.tencent.p014mm.plugin.appbrand.launching.params.LaunchParcel r9) {
        /*
            r7 = this;
            com.tencent.mm.plugin.appbrand.launching.f1 r0 = com.tencent.p014mm.plugin.appbrand.launching.C83316f1.f243478a
            boolean r0 = r0.mo115610d()
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r8
            java.lang.String r3 = r9.f243730d
            r4 = 1
            r1[r4] = r3
            java.lang.String r3 = r9.f243731e
            r5 = 2
            r1[r5] = r3
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            r6 = 3
            r1[r6] = r3
            java.lang.String r3 = "MicroMsg.AppBrand.Precondition.AbstractLaunchEntry"
            java.lang.String r6 = "start(context: %s, username:%s, appId:%s), forcedOpenWxaAppTypedDemo:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r6, r1)
            java.lang.String r1 = r9.f243730d
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x0036
            java.lang.String r1 = r9.f243731e
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x0036
            return r2
        L_0x0036:
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r1 = r9.f243738o
            if (r1 == 0) goto L_0x0052
            r6 = 1167(0x48f, float:1.635E-42)
            int r1 = r1.f245533f
            if (r6 != r1) goto L_0x0052
            com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer r1 = r9.f243739p
            if (r1 == 0) goto L_0x004c
            java.lang.String r1 = r1.f239397e
            boolean r1 = u24.C90599h.m113511d(r1)
            if (r1 == 0) goto L_0x0052
        L_0x004c:
            java.lang.String r1 = "start from 1167(wx h5 open tag) but get null WebView appId"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r1)
        L_0x0052:
            if (r0 == 0) goto L_0x0056
            r9.f243733g = r5
        L_0x0056:
            com.tencent.luggage.sdk.launching.h r0 = com.tencent.luggage.sdk.launching.C80247h.LEGACY
            r9.f243720L = r0
            r9.mo115684d()
            android.app.Activity r0 = com.tencent.p014mm.sdk.system.AndroidContextUtil.castActivityOrNull(r8)
            if (r0 == 0) goto L_0x0064
            r8 = r0
        L_0x0064:
            if (r8 == 0) goto L_0x00af
            boolean r0 = r8 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0074
            r1 = r8
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r1 = r1.isFinishing()
            if (r1 == 0) goto L_0x0074
            goto L_0x00af
        L_0x0074:
            if (r0 == 0) goto L_0x00b3
            r0 = 0
            int[] r1 = new int[r4]     // Catch:{ Exception -> 0x0094 }
            r5 = 16842840(0x1010058, float:2.3693805E-38)
            r1[r2] = r5     // Catch:{ Exception -> 0x0094 }
            android.content.res.TypedArray r0 = r8.obtainStyledAttributes(r1)     // Catch:{ Exception -> 0x0094 }
            boolean r1 = r0.getBoolean(r2, r2)     // Catch:{ Exception -> 0x0094 }
            if (r1 != 0) goto L_0x008e
            r1 = r8
            android.app.Activity r1 = (android.app.Activity) r1     // Catch:{ Exception -> 0x0094 }
            m102231a(r1)     // Catch:{ Exception -> 0x0094 }
        L_0x008e:
            r0.recycle()
            goto L_0x00b3
        L_0x0092:
            r8 = move-exception
            goto L_0x00a9
        L_0x0094:
            r1 = move-exception
            java.lang.String r5 = "convertActivityFromTranslucent %s"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0092 }
            java.lang.Class r6 = r8.getClass()     // Catch:{ all -> 0x0092 }
            java.lang.String r6 = r6.getSimpleName()     // Catch:{ all -> 0x0092 }
            r4[r2] = r6     // Catch:{ all -> 0x0092 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r1, r5, r4)     // Catch:{ all -> 0x0092 }
            if (r0 == 0) goto L_0x00b3
            goto L_0x008e
        L_0x00a9:
            if (r0 == 0) goto L_0x00ae
            r0.recycle()
        L_0x00ae:
            throw r8
        L_0x00af:
            android.content.Context r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
        L_0x00b3:
            boolean r8 = r7.mo115585e(r8, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.launching.C83285a.mo115582b(android.content.Context, com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel):boolean");
    }

    /* renamed from: c */
    public final boolean mo115583c(Context context, String str, String str2, String str3, int i, int i2, AppBrandStatObject appBrandStatObject, AppBrandLaunchReferrer appBrandLaunchReferrer, LaunchParamsOptional launchParamsOptional) {
        return mo115584d(context, str, str2, str3, i, i2, appBrandStatObject, appBrandLaunchReferrer, launchParamsOptional, "");
    }

    /* renamed from: d */
    public boolean mo115584d(Context context, String str, String str2, String str3, int i, int i2, AppBrandStatObject appBrandStatObject, AppBrandLaunchReferrer appBrandLaunchReferrer, LaunchParamsOptional launchParamsOptional, String str4) {
        LaunchParcel launchParcel = new LaunchParcel();
        launchParcel.f243730d = str;
        launchParcel.f243731e = str2;
        launchParcel.f243735i = str3 == null ? null : str3.trim();
        if (C81289m.C81290a.m99664b(i) || C81289m.C81290a.m99663a(i)) {
            launchParcel.f243733g = i;
        } else {
            Log.m105921e("MicroMsg.AppBrand.Precondition.AbstractLaunchEntry", "start with invalid versionType[%d], use 0 instead, stack=%s", Integer.valueOf(i), android.util.Log.getStackTraceString(new Throwable()));
            launchParcel.f243733g = 0;
        }
        launchParcel.f243732f = i2;
        launchParcel.f243738o = appBrandStatObject;
        launchParcel.f243739p = appBrandLaunchReferrer;
        launchParcel.f243740q = launchParamsOptional;
        if (!(launchParamsOptional == null || launchParamsOptional.f237922h == 0)) {
            launchParcel.f243711C = 1;
        }
        launchParcel.f243710B = str4;
        return mo115582b(context, launchParcel);
    }

    /* renamed from: e */
    public abstract boolean mo115585e(Context context, LaunchParcel launchParcel);
}
