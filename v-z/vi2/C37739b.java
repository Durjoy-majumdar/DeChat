package vi2;

import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;

/* renamed from: vi2.b */
public class C37739b extends MAutoStorage<C37738a> {

    /* renamed from: e */
    public static final String[] f99954e = {MAutoStorage.getCreateSQLs(C37738a.f99953p, "DelayTransferRecord")};

    /* renamed from: f */
    public static final String[] f99955f = {"*", "rowid"};

    /* renamed from: d */
    public ISQLiteDatabase f99956d;

    public C37739b(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C37738a.f99953p, "DelayTransferRecord", (String[]) null);
        this.f99956d = iSQLiteDatabase;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0046, code lost:
        if (r13 == null) goto L_0x0049;
     */
    /* renamed from: jo */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public vi2.C37738a mo61312jo(java.lang.String r13) {
        /*
            r12 = this;
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            r1 = 0
            java.lang.String r2 = "MicroMsg.AARecordStorage"
            if (r0 == 0) goto L_0x000f
            java.lang.String r13 = "empty transferId"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r13)
            return r1
        L_0x000f:
            com.tencent.mm.sdk.storage.ISQLiteDatabase r3 = r12.f99956d
            java.lang.String[] r5 = f99955f
            r0 = 1
            java.lang.String[] r7 = new java.lang.String[r0]
            r0 = 0
            r7[r0] = r13
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 2
            java.lang.String r4 = "DelayTransferRecord"
            java.lang.String r6 = "transferId=?"
            android.database.Cursor r13 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r3 = r13.moveToFirst()     // Catch:{ Exception -> 0x003e }
            if (r3 == 0) goto L_0x0038
            vi2.a r3 = new vi2.a     // Catch:{ Exception -> 0x003e }
            r3.<init>()     // Catch:{ Exception -> 0x003e }
            r3.convertFrom(r13)     // Catch:{ Exception -> 0x003e }
            r13.close()
            return r3
        L_0x0038:
            r13.close()
            goto L_0x0049
        L_0x003c:
            r0 = move-exception
            goto L_0x004a
        L_0x003e:
            r3 = move-exception
            java.lang.String r4 = ""
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x003c }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r3, r4, r0)     // Catch:{ all -> 0x003c }
            if (r13 == 0) goto L_0x0049
            goto L_0x0038
        L_0x0049:
            return r1
        L_0x004a:
            if (r13 == 0) goto L_0x004f
            r13.close()
        L_0x004f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: vi2.C37739b.mo61312jo(java.lang.String):vi2.a");
    }
}
