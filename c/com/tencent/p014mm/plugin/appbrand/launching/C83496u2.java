package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import p749xh.C91211t5;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.u2 */
public final class C83496u2 extends MAutoStorage<C83515w2> {

    /* renamed from: e */
    public static final String f243964e = MAutoStorage.getCreateSQLs(C83515w2.f243993G, "LaunchWxaAppRespTable");

    /* renamed from: d */
    public final ISQLiteDatabase f243965d;

    public C83496u2(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C83515w2.f243993G, "LaunchWxaAppRespTable", C91211t5.f261734r);
        this.f243965d = iSQLiteDatabase;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0061 A[Catch:{ all -> 0x00a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0084 A[SYNTHETIC, Splitter:B:25:0x0084] */
    /* renamed from: Lo */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.p014mm.plugin.appbrand.launching.C83515w2 mo115787Lo(java.lang.String r17, te3.C90446wm2 r18) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            r0 = r18
            java.lang.String r3 = "appId"
            java.lang.String r4 = "flush resp, appId %s, apply %B, insert %B, cost:%d"
            java.lang.String r5 = "MicroMsg.LaunchWxaAppCacheStorage"
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r17)
            if (r6 != 0) goto L_0x00cc
            if (r0 != 0) goto L_0x0016
            goto L_0x00cc
        L_0x0016:
            long r6 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            r9 = 2
            r10 = 4
            r11 = 1
            r12 = 0
            com.tencent.mm.plugin.appbrand.launching.w2 r13 = new com.tencent.mm.plugin.appbrand.launching.w2     // Catch:{ all -> 0x00a9 }
            r13.<init>()     // Catch:{ all -> 0x00a9 }
            r13.mo115808l2(r0)     // Catch:{ all -> 0x00a9 }
            r13.field_appId = r2     // Catch:{ all -> 0x00a9 }
            com.tencent.mm.plugin.appbrand.launching.w2 r0 = new com.tencent.mm.plugin.appbrand.launching.w2     // Catch:{ all -> 0x00a9 }
            r0.<init>()     // Catch:{ all -> 0x00a9 }
            r0.field_appId = r2     // Catch:{ all -> 0x00a9 }
            java.lang.String[] r14 = new java.lang.String[]{r3}     // Catch:{ all -> 0x00a9 }
            boolean r14 = r1.get(r0, r14)     // Catch:{ all -> 0x00a9 }
            r14 = r14 ^ r11
            if (r14 != 0) goto L_0x0045
            boolean r15 = r0.equals(r13)     // Catch:{ all -> 0x0043 }
            if (r15 != 0) goto L_0x0041
            goto L_0x0045
        L_0x0041:
            r15 = 0
            goto L_0x0046
        L_0x0043:
            r0 = move-exception
            goto L_0x00ab
        L_0x0045:
            r15 = 1
        L_0x0046:
            if (r15 == 0) goto L_0x0055
            if (r14 == 0) goto L_0x004e
            r1.insertNotify(r13, r12)     // Catch:{ all -> 0x00a7 }
            goto L_0x0055
        L_0x004e:
            java.lang.String[] r8 = new java.lang.String[]{r3}     // Catch:{ all -> 0x00a7 }
            r1.updateNotify(r13, r12, r8)     // Catch:{ all -> 0x00a7 }
        L_0x0055:
            if (r15 == 0) goto L_0x0084
            java.lang.String[] r3 = new java.lang.String[]{r3}     // Catch:{ all -> 0x00a7 }
            boolean r3 = r1.get(r0, r3)     // Catch:{ all -> 0x00a7 }
            if (r3 == 0) goto L_0x0084
            com.tencent.p014mm.plugin.appbrand.launching.C83507v2.m102476a(r0)     // Catch:{ all -> 0x00a7 }
            java.lang.Object[] r3 = new java.lang.Object[r10]
            r3[r12] = r2
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r15)
            r3[r11] = r2
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r14)
            r3[r9] = r2
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            long r8 = r8 - r6
            java.lang.Long r2 = java.lang.Long.valueOf(r8)
            r6 = 3
            r3[r6] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r4, r3)
            return r0
        L_0x0084:
            com.tencent.p014mm.plugin.appbrand.launching.C83507v2.m102476a(r13)     // Catch:{ all -> 0x00a7 }
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r12] = r2
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r15)
            r0[r11] = r2
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r14)
            r0[r9] = r2
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            long r2 = r2 - r6
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 3
            r0[r3] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r4, r0)
            return r13
        L_0x00a7:
            r0 = move-exception
            goto L_0x00ac
        L_0x00a9:
            r0 = move-exception
            r14 = 0
        L_0x00ab:
            r15 = 0
        L_0x00ac:
            java.lang.Object[] r3 = new java.lang.Object[r10]
            r3[r12] = r2
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r15)
            r3[r11] = r2
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r14)
            r3[r9] = r2
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            long r8 = r8 - r6
            java.lang.Long r2 = java.lang.Long.valueOf(r8)
            r6 = 3
            r3[r6] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r4, r3)
            throw r0
        L_0x00cc:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.launching.C83496u2.mo115787Lo(java.lang.String, te3.wm2):com.tencent.mm.plugin.appbrand.launching.w2");
    }

    /* renamed from: Ow */
    public boolean updateNotify(C83515w2 w2Var, boolean z, String... strArr) {
        if (!Util.isNullOrNil(strArr)) {
            int i = 0;
            while (true) {
                if (i >= strArr.length) {
                    break;
                } else if (strArr[i].equals("appId")) {
                    strArr[i] = "appIdHash";
                    w2Var.field_appIdHash = w2Var.field_appId.hashCode();
                    break;
                } else {
                    i++;
                }
            }
        }
        boolean updateNotify = super.updateNotify(w2Var, z, strArr);
        Log.m105925i("MicroMsg.LaunchWxaAppCacheStorage", "updateNotify appId %s, ret %B", w2Var.field_appId, Boolean.valueOf(updateNotify));
        return updateNotify;
    }

    /* renamed from: Yt */
    public boolean insertNotify(C83515w2 w2Var, boolean z) {
        w2Var.field_appIdHash = w2Var.field_appId.hashCode();
        super.insertNotify(w2Var, z);
        boolean qq = get(w2Var, "appId");
        Log.m105925i("MicroMsg.LaunchWxaAppCacheStorage", "insertNotify appId %s ret %B", w2Var.field_appId, Boolean.valueOf(qq));
        return qq;
    }

    /* renamed from: jo */
    public boolean delete(C83515w2 w2Var, boolean z, String... strArr) {
        if (!Util.isNullOrNil(strArr)) {
            int i = 0;
            while (true) {
                if (i >= strArr.length) {
                    break;
                } else if (strArr[i].equals("appId")) {
                    strArr[i] = "appIdHash";
                    w2Var.field_appIdHash = w2Var.field_appId.hashCode();
                    break;
                } else {
                    i++;
                }
            }
        }
        return super.delete(w2Var, z, strArr);
    }

    /* renamed from: qq */
    public boolean get(C83515w2 w2Var, String... strArr) {
        if (!Util.isNullOrNil(strArr)) {
            int i = 0;
            while (true) {
                if (i >= strArr.length) {
                    break;
                } else if (strArr[i].equals("appId")) {
                    strArr[i] = "appIdHash";
                    w2Var.field_appIdHash = w2Var.field_appId.hashCode();
                    break;
                } else {
                    i++;
                }
            }
        }
        return super.get(w2Var, strArr);
    }
}
