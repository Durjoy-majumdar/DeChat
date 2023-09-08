package ag0;

import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ag0.d */
public class C27891d extends MAutoStorage<C27890c> {

    /* renamed from: e */
    public static final String[] f77051e = {MAutoStorage.getCreateSQLs(C27890c.f77050t, "AARecord")};

    /* renamed from: f */
    public static final String[] f77052f = {"*", "rowid"};

    /* renamed from: g */
    public static Map<String, C27890c> f77053g = new HashMap();

    /* renamed from: d */
    public ISQLiteDatabase f77054d;

    public C27891d(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C27890c.f77050t, "AARecord", (String[]) null);
        this.f77054d = iSQLiteDatabase;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0046, code lost:
        if (r13 == null) goto L_0x0049;
     */
    /* renamed from: Lo */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ag0.C27890c mo55666Lo(java.lang.String r13) {
        /*
            r12 = this;
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            com.tencent.mm.sdk.storage.ISQLiteDatabase r2 = r12.f77054d
            java.lang.String[] r4 = f77052f
            r0 = 1
            java.lang.String[] r6 = new java.lang.String[r0]
            r11 = 0
            r6[r11] = r13
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 2
            java.lang.String r3 = "AARecord"
            java.lang.String r5 = "billNo=?"
            android.database.Cursor r13 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)
            boolean r2 = r13.moveToFirst()     // Catch:{ Exception -> 0x0036 }
            if (r2 == 0) goto L_0x0030
            ag0.c r2 = new ag0.c     // Catch:{ Exception -> 0x0036 }
            r2.<init>()     // Catch:{ Exception -> 0x0036 }
            r2.convertFrom(r13)     // Catch:{ Exception -> 0x0036 }
            r13.close()
            return r2
        L_0x0030:
            r13.close()
            goto L_0x0049
        L_0x0034:
            r0 = move-exception
            goto L_0x004a
        L_0x0036:
            r2 = move-exception
            java.lang.String r3 = "MicroMsg.AARecordStorage"
            java.lang.String r4 = "getRecordByBillno error: %s"
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x0034 }
            java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x0034 }
            r0[r11] = r2     // Catch:{ all -> 0x0034 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r4, r0)     // Catch:{ all -> 0x0034 }
            if (r13 == 0) goto L_0x0049
            goto L_0x0030
        L_0x0049:
            return r1
        L_0x004a:
            if (r13 == 0) goto L_0x004f
            r13.close()
        L_0x004f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ag0.C27891d.mo55666Lo(java.lang.String):ag0.c");
    }

    /* renamed from: Yt */
    public boolean replace(C27890c cVar) {
        if (cVar != null) {
            if (((HashMap) f77053g).containsKey(cVar.field_billNo)) {
                ((HashMap) f77053g).put(cVar.field_billNo, cVar);
            }
        }
        return super.replace(cVar);
    }

    /* renamed from: jo */
    public boolean delete(C27890c cVar, String... strArr) {
        if (cVar != null) {
            if (((HashMap) f77053g).containsKey(cVar.field_billNo)) {
                ((HashMap) f77053g).remove(cVar.field_billNo);
            }
        }
        return super.delete(cVar, strArr);
    }

    /* renamed from: qq */
    public boolean insert(C27890c cVar) {
        if (cVar != null) {
            if (((HashMap) f77053g).containsKey(cVar.field_billNo)) {
                ((HashMap) f77053g).put(cVar.field_billNo, cVar);
            }
        }
        return super.insert(cVar);
    }
}
