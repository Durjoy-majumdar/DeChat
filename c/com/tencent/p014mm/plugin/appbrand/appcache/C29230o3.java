package com.tencent.p014mm.plugin.appbrand.appcache;

import fy3.C32224a;
import gy3.C87413o;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.o3 */
public final class C29230o3 extends C87413o implements C32224a<Boolean> {

    /* renamed from: d */
    public final /* synthetic */ C29233p3 f79886d;

    /* renamed from: e */
    public final /* synthetic */ C29228n3 f79887e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29230o3(C29233p3 p3Var, C29228n3 n3Var) {
        super(0);
        this.f79886d = p3Var;
        this.f79887e = n3Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0050, code lost:
        cy3.C58003b.m67160a(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke() {
        /*
            r6 = this;
            com.tencent.mm.plugin.appbrand.appcache.p3 r0 = r6.f79886d
            com.tencent.mm.plugin.appbrand.appcache.n3 r1 = r6.f79887e
            r0.getClass()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "select count(*) from "
            r2.append(r3)
            java.lang.String r3 = r0.getTableName()
            r2.append(r3)
            java.lang.String r3 = " where pluginAppID=? and pluginAppVersion=?"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r0.f79893e
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]
            java.lang.String r4 = r1.field_pluginAppID
            r5 = 0
            r3[r5] = r4
            int r1 = r1.field_pluginAppVersion
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r4 = 1
            r3[r4] = r1
            android.database.Cursor r0 = r0.rawQuery(r2, r3)
            if (r0 == 0) goto L_0x0054
            r1 = 0
            boolean r2 = r0.moveToFirst()     // Catch:{ all -> 0x004d }
            if (r2 == 0) goto L_0x0048
            int r2 = r0.getInt(r5)     // Catch:{ all -> 0x004d }
            if (r2 <= 0) goto L_0x0048
            goto L_0x0049
        L_0x0048:
            r4 = 0
        L_0x0049:
            cy3.C58003b.m67160a(r0, r1)
            goto L_0x0055
        L_0x004d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004f }
        L_0x004f:
            r2 = move-exception
            cy3.C58003b.m67160a(r0, r1)
            throw r2
        L_0x0054:
            r4 = 0
        L_0x0055:
            if (r4 == 0) goto L_0x0062
            com.tencent.mm.plugin.appbrand.appcache.p3 r0 = r6.f79886d
            com.tencent.mm.plugin.appbrand.appcache.n3 r1 = r6.f79887e
            java.lang.String[] r2 = new java.lang.String[r5]
            boolean r0 = r0.update(r1, (java.lang.String[]) r2)
            goto L_0x006a
        L_0x0062:
            com.tencent.mm.plugin.appbrand.appcache.p3 r0 = r6.f79886d
            com.tencent.mm.plugin.appbrand.appcache.n3 r1 = r6.f79887e
            boolean r0 = r0.insert(r1)
        L_0x006a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.appcache.C29230o3.invoke():java.lang.Object");
    }
}
