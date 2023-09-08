package ag0;

import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;

/* renamed from: ag0.b */
public class C27889b extends MAutoStorage<C27888a> {

    /* renamed from: e */
    public static final String[] f77047e = {MAutoStorage.getCreateSQLs(C27888a.f77046t, "AAPayRecord")};

    /* renamed from: f */
    public static final String[] f77048f = {"*", "rowid"};

    /* renamed from: d */
    public ISQLiteDatabase f77049d;

    public C27889b(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C27888a.f77046t, "AAPayRecord", (String[]) null);
        this.f77049d = iSQLiteDatabase;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0046, code lost:
        if (r13 == null) goto L_0x0049;
     */
    /* renamed from: jo */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ag0.C27888a mo55665jo(java.lang.String r13) {
        /*
            r12 = this;
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            com.tencent.mm.sdk.storage.ISQLiteDatabase r2 = r12.f77049d
            java.lang.String[] r4 = f77048f
            r0 = 1
            java.lang.String[] r6 = new java.lang.String[r0]
            r11 = 0
            r6[r11] = r13
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 2
            java.lang.String r3 = "AAPayRecord"
            java.lang.String r5 = "payMsgId=?"
            android.database.Cursor r13 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)
            boolean r2 = r13.moveToFirst()     // Catch:{ Exception -> 0x0036 }
            if (r2 == 0) goto L_0x0030
            ag0.a r2 = new ag0.a     // Catch:{ Exception -> 0x0036 }
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
            java.lang.String r3 = "MicroMsg.AAPayRecordStorage"
            java.lang.String r4 = "getByPayMsgId error: %s"
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
        throw new UnsupportedOperationException("Method not decompiled: ag0.C27889b.mo55665jo(java.lang.String):ag0.a");
    }
}
