package com.tencent.p014mm.plugin.appbrand.appcache;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.m2 */
public final class C81292m2 {

    /* renamed from: a */
    public static final C81292m2 f238703a = new C81292m2();

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0069, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006a, code lost:
        cy3.C58003b.m67160a(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006d, code lost:
        throw r0;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.tencent.p014mm.plugin.appbrand.appcache.C29315z2 m99672b(com.tencent.p014mm.plugin.appbrand.appcache.C81258h3 r4, int r5) {
        /*
            java.lang.String r0 = "<this>"
            gy3.C87412m.m108594g(r4, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "select * from "
            r0.append(r1)
            java.lang.String r1 = r4.mo113531o()
            r0.append(r1)
            java.lang.String r1 = " where appId=? and debugType=? and pkgPath!=? order by version desc"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r4 = r4.f238664d
            r1 = 3
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = 0
            java.lang.String r3 = "@LibraryAppId"
            r1[r2] = r3
            r2 = 1
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r1[r2] = r5
            java.lang.String r5 = ""
            r2 = 2
            r1[r2] = r5
            android.database.Cursor r4 = r4.rawQuery(r0, r1, r2)
            r5 = 0
            if (r4 == 0) goto L_0x006e
            boolean r0 = r4.moveToFirst()     // Catch:{ all -> 0x0067 }
            if (r0 == 0) goto L_0x0063
            com.tencent.mm.plugin.appbrand.appcache.z2 r0 = new com.tencent.mm.plugin.appbrand.appcache.z2     // Catch:{ all -> 0x0067 }
            r0.<init>()     // Catch:{ all -> 0x0067 }
        L_0x0048:
            r0.convertFrom(r4)     // Catch:{ all -> 0x0067 }
            com.tencent.mm.plugin.appbrand.appcache.m2 r1 = f238703a     // Catch:{ all -> 0x0067 }
            boolean r1 = r1.mo113566a(r0)     // Catch:{ all -> 0x0067 }
            if (r1 == 0) goto L_0x0057
            cy3.C58003b.m67160a(r4, r5)
            return r0
        L_0x0057:
            boolean r1 = r4.moveToNext()     // Catch:{ all -> 0x0067 }
            if (r1 != 0) goto L_0x0048
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0067 }
            cy3.C58003b.m67160a(r4, r5)
            goto L_0x006e
        L_0x0063:
            cy3.C58003b.m67160a(r4, r5)
            return r5
        L_0x0067:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0069 }
        L_0x0069:
            r0 = move-exception
            cy3.C58003b.m67160a(r4, r5)
            throw r0
        L_0x006e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.appcache.C81292m2.m99672b(com.tencent.mm.plugin.appbrand.appcache.h3, int):com.tencent.mm.plugin.appbrand.appcache.z2");
    }

    /* renamed from: c */
    public static final WxaPkgWrappingInfo m99673c(C29315z2 z2Var) {
        C87412m.m108594g(z2Var, "<this>");
        WxaPkgWrappingInfo wxaPkgWrappingInfo = new WxaPkgWrappingInfo();
        int i = z2Var.field_debugType;
        boolean z = false;
        wxaPkgWrappingInfo.pkgVersion = i == 0 ? z2Var.field_version : 0;
        wxaPkgWrappingInfo.f238586e = z2Var.field_createTime;
        wxaPkgWrappingInfo.f238585d = i;
        wxaPkgWrappingInfo.pkgPath = z2Var.field_pkgPath;
        wxaPkgWrappingInfo.f238587f = false;
        String str = z2Var.field_versionMd5;
        if (str == null || str.length() == 0) {
            z = true;
        }
        wxaPkgWrappingInfo.md5 = z ? WxaPkgWrappingInfo.m99521f(new C86009m1(wxaPkgWrappingInfo.pkgPath)) : z2Var.field_versionMd5;
        return wxaPkgWrappingInfo;
    }

    /* renamed from: a */
    public final boolean mo113566a(C29315z2 z2Var) {
        C87412m.m108594g(z2Var, "<this>");
        if (999 == z2Var.field_debugType) {
            long j = z2Var.field_endTime;
            if (j > 0 && j <= Util.nowSecond()) {
                Log.m105920e("Luggage.WxaCommLibVersionUtils", "checkIsValid BETA_LIBRARY expired, endTime:" + z2Var.field_endTime);
                return false;
            }
        }
        if (C86013q1.m106450k(z2Var.field_pkgPath)) {
            try {
                String f = WxaPkgWrappingInfo.m99521f(new C86009m1(z2Var.field_pkgPath));
                C87412m.m108591d(f);
                if (C87412m.m108589b(f, z2Var.field_versionMd5) || C87412m.m108589b(f, z2Var.field_NewMd5)) {
                    return true;
                }
            } catch (Exception e) {
                Log.m105920e("Luggage.WxaCommLibVersionUtils", "checkIsValid getFileMD5 failed " + e + ", path:" + z2Var.field_pkgPath + ", version:" + z2Var.field_version + ", versionType:" + z2Var.field_debugType);
            }
        }
        return false;
    }
}
