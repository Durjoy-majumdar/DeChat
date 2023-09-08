package p52;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;

/* renamed from: p52.f */
public class C117989f extends MAutoStorage<C117988e> {

    /* renamed from: e */
    public static final String[] f352680e = {MAutoStorage.getCreateSQLs(C117988e.f352679J, "MagicPkgInfo")};

    /* renamed from: d */
    public ISQLiteDatabase f352681d;

    public C117989f(ISQLiteDatabase iSQLiteDatabase, IAutoDBItem.MAutoDBInfo mAutoDBInfo, String str, String[] strArr) {
        super(iSQLiteDatabase, mAutoDBInfo, str, strArr);
        this.f352681d = iSQLiteDatabase;
    }

    public boolean insert(IAutoDBItem iAutoDBItem) {
        this.f352681d.insert("MagicPkgInfo", "pkgId", ((C117988e) iAutoDBItem).convertTo());
        return true;
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
    /* renamed from: jo */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p52.C117988e mo182752jo(java.lang.String r8) {
        /*
            r7 = this;
            r0 = 0
            if (r8 != 0) goto L_0x0004
            return r0
        L_0x0004:
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "MagicPkgInfo"
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "pkgId"
            r4 = 1
            r1[r4] = r2
            r2 = 2
            r1[r2] = r8
            java.lang.String r8 = "select * from %s where %s='%s'"
            java.lang.String r8 = java.lang.String.format(r8, r1)
            java.lang.String[] r1 = new java.lang.String[r3]
            com.tencent.mm.sdk.storage.ISQLiteDatabase r5 = r7.f352681d     // Catch:{ Exception -> 0x0043, all -> 0x003e }
            android.database.Cursor r8 = r5.rawQuery(r8, r1, r2)     // Catch:{ Exception -> 0x0043, all -> 0x003e }
            if (r8 == 0) goto L_0x0038
            boolean r1 = r8.moveToFirst()     // Catch:{ Exception -> 0x0036 }
            if (r1 == 0) goto L_0x0038
            p52.e r1 = new p52.e     // Catch:{ Exception -> 0x0036 }
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
            java.lang.String r2 = "MicroMsg.MagicPkgInfoStorage"
            java.lang.String r5 = "getMagicPkgInfo failed. :%s"
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
        throw new UnsupportedOperationException("Method not decompiled: p52.C117989f.mo182752jo(java.lang.String):p52.e");
    }

    public boolean replace(IAutoDBItem iAutoDBItem) {
        this.f352681d.replace("MagicPkgInfo", "pkgId", ((C117988e) iAutoDBItem).convertTo());
        return true;
    }
}
