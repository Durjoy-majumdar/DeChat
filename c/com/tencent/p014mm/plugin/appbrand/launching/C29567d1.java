package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import p749xh.C38648r1;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.d1 */
public final class C29567d1 extends MAutoStorage<C29563c1> {

    /* renamed from: d */
    public static final String[] f80484d = {MAutoStorage.getCreateSQLs(C29563c1.f80481s, "DevPkgLaunchExtInfo")};

    public C29567d1(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C29563c1.f80481s, "DevPkgLaunchExtInfo", C38648r1.f103464h);
    }

    /* renamed from: Lo */
    public boolean mo56814Lo(String str, int i, String str2) {
        return mo56816qq(str, i, str2, true);
    }

    /* renamed from: jo */
    public String mo56815jo(String str, int i) {
        if (Util.isNullOrNil(str)) {
            return "";
        }
        C29563c1 c1Var = new C29563c1();
        c1Var.field_appId = str;
        c1Var.field_versionType = i;
        return super.get(c1Var, C29563c1.f80480r) ? c1Var.field_extJson : "";
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0074 A[SYNTHETIC, Splitter:B:15:0x0074] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0108 A[Catch:{ Exception -> 0x0115 }] */
    /* renamed from: qq */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo56816qq(java.lang.String r18, int r19, java.lang.String r20, boolean r21) {
        /*
            r17 = this;
            r1 = r17
            r9 = r18
            r10 = r19
            r0 = r20
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r18)
            r11 = 0
            if (r2 == 0) goto L_0x0011
        L_0x000f:
            r12 = 0
            goto L_0x0044
        L_0x0011:
            com.tencent.mm.plugin.appbrand.launching.c1 r2 = new com.tencent.mm.plugin.appbrand.launching.c1
            r2.<init>()
            r2.field_appId = r9
            r2.field_versionType = r10
            java.lang.String[] r3 = com.tencent.p014mm.plugin.appbrand.launching.C29563c1.f80480r
            boolean r4 = super.get(r2, (java.lang.String[]) r3)
            java.lang.String r5 = "{}"
            if (r4 == 0) goto L_0x0039
            java.lang.String r4 = r2.field_extJson
            boolean r4 = u24.C90599h.m113509b(r4, r0)
            if (r4 == 0) goto L_0x002e
            goto L_0x000f
        L_0x002e:
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r5)
            r2.field_extJson = r4
            boolean r2 = super.update(r2, (java.lang.String[]) r3)
            goto L_0x0043
        L_0x0039:
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r5)
            r2.field_extJson = r3
            boolean r2 = super.insert(r2)
        L_0x0043:
            r12 = r2
        L_0x0044:
            r2 = 5
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r11] = r9
            java.lang.Integer r3 = java.lang.Integer.valueOf(r19)
            r13 = 1
            r2[r13] = r3
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r12)
            r14 = 2
            r2[r14] = r3
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r21)
            r4 = 3
            r2[r4] = r3
            r3 = 4
            r2[r3] = r0
            java.lang.String r15 = "MicroMsg.AppBrand.DevPkgLaunchExtInfoStorage"
            java.lang.String r3 = "setExtInfo() appId:%s,versionType:%s,ret:%b,updatePkgManifests:%b,extInfo:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r3, r2)
            if (r12 == 0) goto L_0x0125
            if (r21 == 0) goto L_0x0125
            boolean r2 = android.text.TextUtils.isEmpty(r20)
            r3 = 0
            if (r2 != 0) goto L_0x008e
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x007b }
            r2.<init>(r0)     // Catch:{ Exception -> 0x007b }
            r8 = r2
            goto L_0x008f
        L_0x007b:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r2[r11] = r9
            java.lang.Integer r4 = java.lang.Integer.valueOf(r19)
            r2[r13] = r4
            r2[r14] = r0
            java.lang.String r0 = "setExtInfo parse failed, appId[%s], type[%d], e[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r15, r0, r2)
        L_0x008e:
            r8 = r3
        L_0x008f:
            if (r8 == 0) goto L_0x0125
            java.lang.String r0 = "module_list"
            org.json.JSONArray r0 = r8.optJSONArray(r0)     // Catch:{ Exception -> 0x00b0 }
            r2 = -1
            if (r0 == 0) goto L_0x00aa
            int r4 = r0.length()     // Catch:{ Exception -> 0x00b0 }
            if (r4 <= 0) goto L_0x00aa
            com.tencent.mm.plugin.appbrand.appcache.f3 r4 = com.tencent.p014mm.plugin.appbrand.appcache.C29215f3.f79864a     // Catch:{ Exception -> 0x00b0 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00b0 }
            r4.mo56524b(r9, r10, r2, r0)     // Catch:{ Exception -> 0x00b0 }
            goto L_0x00c0
        L_0x00aa:
            com.tencent.mm.plugin.appbrand.appcache.f3 r0 = com.tencent.p014mm.plugin.appbrand.appcache.C29215f3.f79864a     // Catch:{ Exception -> 0x00b0 }
            r0.mo56523a(r9, r10, r2)     // Catch:{ Exception -> 0x00b0 }
            goto L_0x00c0
        L_0x00b0:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r14]
            r2[r11] = r9
            java.lang.Integer r4 = java.lang.Integer.valueOf(r19)
            r2[r13] = r4
            java.lang.String r4 = "extract module_list with appId[%s], type[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r15, r0, r4, r2)
        L_0x00c0:
            java.lang.String r0 = "without_lib_md5"
            java.lang.String r0 = r8.optString(r0)     // Catch:{ Exception -> 0x00c9 }
            r7 = r0
            goto L_0x00ca
        L_0x00c9:
            r7 = r3
        L_0x00ca:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)     // Catch:{ Exception -> 0x00e7 }
            if (r0 != 0) goto L_0x00e4
            com.tencent.mm.plugin.appbrand.appcache.f3 r2 = com.tencent.p014mm.plugin.appbrand.appcache.C29215f3.f79864a     // Catch:{ Exception -> 0x00e7 }
            java.lang.String r4 = "__WITHOUT_PLUGINCODE__"
            r5 = 0
            r0 = 12
            r3 = r18
            r6 = r19
            r16 = r8
            r8 = r0
            r2.mo56526d(r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x00e2 }
            goto L_0x00f9
        L_0x00e2:
            r0 = move-exception
            goto L_0x00ea
        L_0x00e4:
            r16 = r8
            goto L_0x00f9
        L_0x00e7:
            r0 = move-exception
            r16 = r8
        L_0x00ea:
            java.lang.Object[] r2 = new java.lang.Object[r14]
            r2[r11] = r9
            java.lang.Integer r3 = java.lang.Integer.valueOf(r19)
            r2[r13] = r3
            java.lang.String r3 = "extract withoutLibMd5 with appId[%s], type[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r15, r0, r3, r2)
        L_0x00f9:
            java.lang.String r0 = "widget_list"
            r3 = r16
            java.lang.String r7 = r3.optString(r0)     // Catch:{ Exception -> 0x0115 }
            boolean r0 = android.text.TextUtils.isEmpty(r7)     // Catch:{ Exception -> 0x0115 }
            if (r0 != 0) goto L_0x0125
            com.tencent.mm.plugin.appbrand.appcache.f3 r2 = com.tencent.p014mm.plugin.appbrand.appcache.C29215f3.f79864a     // Catch:{ Exception -> 0x0115 }
            java.lang.String r4 = ""
            r5 = 0
            r3 = r18
            r6 = r19
            r2.mo56525c(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0115 }
            goto L_0x0125
        L_0x0115:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r14]
            r2[r11] = r9
            java.lang.Integer r3 = java.lang.Integer.valueOf(r19)
            r2[r13] = r3
            java.lang.String r3 = "extract widget_list with appId[%s], type[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r15, r0, r3, r2)
        L_0x0125:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.launching.C29567d1.mo56816qq(java.lang.String, int, java.lang.String, boolean):boolean");
    }
}
