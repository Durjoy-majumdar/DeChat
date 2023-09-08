package com.tencent.p014mm.plugin.lite.storage;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;

/* renamed from: com.tencent.mm.plugin.lite.storage.g */
public class C115505g extends MAutoStorage<C115504f> {

    /* renamed from: e */
    public static final String[] f346324e = {MAutoStorage.getCreateSQLs(C115504f.f346323D, "LiteAppBaselibInfo")};

    /* renamed from: d */
    public ISQLiteDatabase f346325d;

    public C115505g(ISQLiteDatabase iSQLiteDatabase, IAutoDBItem.MAutoDBInfo mAutoDBInfo, String str, String[] strArr) {
        super(iSQLiteDatabase, mAutoDBInfo, str, strArr);
        this.f346325d = iSQLiteDatabase;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0038, code lost:
        if (r8 != null) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003a, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0054, code lost:
        if (r8 != null) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0057, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005b  */
    /* renamed from: Lo */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.p014mm.plugin.lite.storage.C115504f mo175484Lo(java.lang.String r8) {
        /*
            r7 = this;
            r0 = 0
            if (r8 != 0) goto L_0x0004
            return r0
        L_0x0004:
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "LiteAppBaselibInfo"
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "majorVersion"
            r4 = 1
            r1[r4] = r2
            r2 = 2
            r1[r2] = r8
            java.lang.String r8 = "select * from %s where %s='%s'"
            java.lang.String r8 = java.lang.String.format(r8, r1)
            java.lang.String[] r1 = new java.lang.String[r3]
            com.tencent.mm.sdk.storage.ISQLiteDatabase r5 = r7.f346325d     // Catch:{ Exception -> 0x0043, all -> 0x003e }
            android.database.Cursor r8 = r5.rawQuery(r8, r1, r2)     // Catch:{ Exception -> 0x0043, all -> 0x003e }
            if (r8 == 0) goto L_0x0038
            boolean r1 = r8.moveToFirst()     // Catch:{ Exception -> 0x0036 }
            if (r1 == 0) goto L_0x0038
            com.tencent.mm.plugin.lite.storage.f r1 = new com.tencent.mm.plugin.lite.storage.f     // Catch:{ Exception -> 0x0036 }
            r1.<init>()     // Catch:{ Exception -> 0x0036 }
            r1.convertFrom(r8)     // Catch:{ Exception -> 0x0036 }
            r8.close()
            return r1
        L_0x0036:
            r1 = move-exception
            goto L_0x0045
        L_0x0038:
            if (r8 == 0) goto L_0x0057
        L_0x003a:
            r8.close()
            goto L_0x0057
        L_0x003e:
            r8 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
            goto L_0x0059
        L_0x0043:
            r1 = move-exception
            r8 = r0
        L_0x0045:
            java.lang.String r2 = "MicroMsg.LiteAppBaselibInfoStorage"
            java.lang.String r5 = "getLiteAppBaselibInfo failed. :%s"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0058 }
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r1)     // Catch:{ all -> 0x0058 }
            r4[r3] = r1     // Catch:{ all -> 0x0058 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r5, r4)     // Catch:{ all -> 0x0058 }
            if (r8 == 0) goto L_0x0057
            goto L_0x003a
        L_0x0057:
            return r0
        L_0x0058:
            r0 = move-exception
        L_0x0059:
            if (r8 == 0) goto L_0x005e
            r8.close()
        L_0x005e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.lite.storage.C115505g.mo175484Lo(java.lang.String):com.tencent.mm.plugin.lite.storage.f");
    }

    public boolean insert(IAutoDBItem iAutoDBItem) {
        this.f346325d.insert("LiteAppBaselibInfo", "majorVersion", ((C115504f) iAutoDBItem).convertTo());
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: com.tencent.mm.plugin.lite.storage.f} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v2, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: type inference failed for: r4v12 */
    /* JADX WARNING: type inference failed for: r4v13 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0064  */
    /* renamed from: jo */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.p014mm.plugin.lite.storage.C115504f mo175485jo() {
        /*
            r8 = this;
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "LiteAppBaselibInfo"
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "select * from %s"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            java.lang.String[] r2 = new java.lang.String[r3]
            r4 = 0
            com.tencent.mm.sdk.storage.ISQLiteDatabase r5 = r8.f346325d     // Catch:{ Exception -> 0x004a }
            r6 = 2
            android.database.Cursor r1 = r5.rawQuery(r1, r2, r6)     // Catch:{ Exception -> 0x004a }
            boolean r2 = r1.moveToFirst()     // Catch:{ Exception -> 0x0043, all -> 0x0040 }
            if (r2 == 0) goto L_0x003c
            r2 = 1
        L_0x001f:
            com.tencent.mm.plugin.lite.storage.f r5 = new com.tencent.mm.plugin.lite.storage.f     // Catch:{ Exception -> 0x0043, all -> 0x0040 }
            r5.<init>()     // Catch:{ Exception -> 0x0043, all -> 0x0040 }
            r5.convertFrom(r1)     // Catch:{ Exception -> 0x0043, all -> 0x0040 }
            java.lang.String r6 = r5.field_majorVersion     // Catch:{ Exception -> 0x0043, all -> 0x0040 }
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ Exception -> 0x0043, all -> 0x0040 }
            if (r6 < r2) goto L_0x0036
            java.lang.String r2 = r5.field_majorVersion     // Catch:{ Exception -> 0x0043, all -> 0x0040 }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ Exception -> 0x0043, all -> 0x0040 }
            r4 = r5
        L_0x0036:
            boolean r5 = r1.moveToNext()     // Catch:{ Exception -> 0x0043, all -> 0x0040 }
            if (r5 != 0) goto L_0x001f
        L_0x003c:
            r1.close()
            goto L_0x0061
        L_0x0040:
            r0 = move-exception
            r4 = r1
            goto L_0x0062
        L_0x0043:
            r2 = move-exception
            r7 = r4
            r4 = r1
            r1 = r7
            goto L_0x004c
        L_0x0048:
            r0 = move-exception
            goto L_0x0062
        L_0x004a:
            r2 = move-exception
            r1 = r4
        L_0x004c:
            java.lang.String r5 = "MicroMsg.LiteAppBaselibInfoStorage"
            java.lang.String r6 = "getLatestLiteAppBaselibInfo failed. :%s"
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x0048 }
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r2)     // Catch:{ all -> 0x0048 }
            r0[r3] = r2     // Catch:{ all -> 0x0048 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r6, r0)     // Catch:{ all -> 0x0048 }
            if (r4 == 0) goto L_0x0060
            r4.close()
        L_0x0060:
            r4 = r1
        L_0x0061:
            return r4
        L_0x0062:
            if (r4 == 0) goto L_0x0067
            r4.close()
        L_0x0067:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.lite.storage.C115505g.mo175485jo():com.tencent.mm.plugin.lite.storage.f");
    }

    public boolean replace(IAutoDBItem iAutoDBItem) {
        this.f346325d.replace("LiteAppBaselibInfo", "majorVersion", ((C115504f) iAutoDBItem).convertTo());
        return true;
    }
}
