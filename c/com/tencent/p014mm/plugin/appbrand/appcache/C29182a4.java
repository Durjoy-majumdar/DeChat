package com.tencent.p014mm.plugin.appbrand.appcache;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import gy3.C87412m;
import p749xh.C38654ra;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.a4 */
public final class C29182a4 extends MAutoStorage<C29183a> {

    /* renamed from: e */
    public static final String[] f79813e = C29183a.f79816s;

    /* renamed from: d */
    public final ISQLiteDatabase f79814d;

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.a4$a */
    public static final class C29183a extends C38654ra {

        /* renamed from: r */
        public static final IAutoDBItem.MAutoDBInfo f79815r;

        /* renamed from: s */
        public static final String[] f79816s;

        static {
            IAutoDBItem.MAutoDBInfo initAutoDBInfo = C38654ra.initAutoDBInfo(C29183a.class);
            f79815r = initAutoDBInfo;
            String createSQLs = MAutoStorage.getCreateSQLs(initAutoDBInfo, "WxaVersionTemplateIdMapping");
            C87412m.m108593f(createSQLs, "getCreateSQLs(INFO, TABLE_NAME)");
            f79816s = new String[]{createSQLs};
        }

        public IAutoDBItem.MAutoDBInfo getDBInfo() {
            return f79815r;
        }
    }

    static {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C29183a.f79815r;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29182a4(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C29183a.f79815r, "WxaVersionTemplateIdMapping", C38654ra.f103553h);
        C87412m.m108594g(iSQLiteDatabase, "db");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C29183a.f79815r;
        this.f79814d = iSQLiteDatabase;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0083, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        cy3.C58003b.m67160a(r2, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0087, code lost:
        throw r9;
     */
    /* renamed from: Lo */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo56498Lo(java.lang.String r8, int r9, long r10) {
        /*
            r7 = this;
            r0 = 1
            r1 = 0
            if (r8 == 0) goto L_0x000d
            int r2 = r8.length()
            if (r2 != 0) goto L_0x000b
            goto L_0x000d
        L_0x000b:
            r2 = 0
            goto L_0x000e
        L_0x000d:
            r2 = 1
        L_0x000e:
            if (r2 == 0) goto L_0x0011
            return r1
        L_0x0011:
            java.lang.String r2 = "MicroMsg.WxaVersionTemplateIdMappingStorage"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "setTemplateId(appId:"
            r3.append(r4)
            r3.append(r8)
            java.lang.String r4 = ", appVersion:"
            r3.append(r4)
            r3.append(r9)
            java.lang.String r4 = ", templateId:"
            r3.append(r4)
            r3.append(r10)
            r4 = 41
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            monitor-enter(r7)
            com.tencent.mm.sdk.storage.ISQLiteDatabase r2 = r7.f79814d     // Catch:{ all -> 0x009d }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x009d }
            r3.<init>()     // Catch:{ all -> 0x009d }
            java.lang.String r4 = "select count(*) from "
            r3.append(r4)     // Catch:{ all -> 0x009d }
            java.lang.String r4 = r7.getTableName()     // Catch:{ all -> 0x009d }
            r3.append(r4)     // Catch:{ all -> 0x009d }
            java.lang.String r4 = " where appId=? and appVersion=? and templateId=?"
            r3.append(r4)     // Catch:{ all -> 0x009d }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x009d }
            r4 = 3
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ all -> 0x009d }
            r4[r1] = r8     // Catch:{ all -> 0x009d }
            java.lang.String r5 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x009d }
            r4[r0] = r5     // Catch:{ all -> 0x009d }
            r5 = 2
            java.lang.String r6 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x009d }
            r4[r5] = r6     // Catch:{ all -> 0x009d }
            android.database.Cursor r2 = r2.rawQuery(r3, r4)     // Catch:{ all -> 0x009d }
            if (r2 == 0) goto L_0x0088
            r3 = 0
            boolean r4 = r2.moveToFirst()     // Catch:{ all -> 0x0081 }
            if (r4 == 0) goto L_0x007d
            int r1 = r2.getInt(r1)     // Catch:{ all -> 0x0081 }
        L_0x007d:
            cy3.C58003b.m67160a(r2, r3)     // Catch:{ all -> 0x009d }
            goto L_0x0088
        L_0x0081:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x0083 }
        L_0x0083:
            r9 = move-exception
            cy3.C58003b.m67160a(r2, r8)     // Catch:{ all -> 0x009d }
            throw r9     // Catch:{ all -> 0x009d }
        L_0x0088:
            if (r1 <= 0) goto L_0x008c
            monitor-exit(r7)
            return r0
        L_0x008c:
            com.tencent.mm.plugin.appbrand.appcache.a4$a r1 = new com.tencent.mm.plugin.appbrand.appcache.a4$a     // Catch:{ all -> 0x009d }
            r1.<init>()     // Catch:{ all -> 0x009d }
            r1.field_appId = r8     // Catch:{ all -> 0x009d }
            r1.field_appVersion = r9     // Catch:{ all -> 0x009d }
            r1.field_templateId = r10     // Catch:{ all -> 0x009d }
            boolean r8 = super.insertNotify(r1, r0)     // Catch:{ all -> 0x009d }
            monitor-exit(r7)
            return r8
        L_0x009d:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.appcache.C29182a4.mo56498Lo(java.lang.String, int, long):boolean");
    }

    /* renamed from: jo */
    public final int mo56499jo(String str, int i) {
        int delete;
        if (str == null || str.length() == 0) {
            return 0;
        }
        synchronized (this) {
            delete = this.f79814d.delete(getTableName(), "appId=? and appVersion<?", new String[]{str, String.valueOf(i)});
        }
        return delete;
    }
}
