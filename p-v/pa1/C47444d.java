package pa1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import oa1.C47346c;

/* renamed from: pa1.d */
public class C47444d extends MAutoStorage<C47346c> {

    /* renamed from: e */
    public static final String[] f127266e = {MAutoStorage.getCreateSQLs(C47346c.f127043I, "ExptItem")};

    /* renamed from: f */
    public static final String[] f127267f = new String[0];

    /* renamed from: d */
    public ISQLiteDatabase f127268d;

    public C47444d(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C47346c.f127043I, "ExptItem", f127267f);
        this.f127268d = iSQLiteDatabase;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.tencent.mm.sdk.storage.ISQLiteDatabase] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: Lo */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<oa1.C47346c> mo72462Lo(java.util.List<oa1.C47346c> r12) {
        /*
            r11 = this;
            r0 = 0
            if (r12 == 0) goto L_0x0073
            int r1 = r12.size()
            if (r1 > 0) goto L_0x000a
            goto L_0x0073
        L_0x000a:
            r1 = -1
            com.tencent.mm.sdk.storage.ISQLiteDatabase r3 = r11.f127268d
            boolean r4 = r3 instanceof zh3.C91753f
            if (r4 == 0) goto L_0x0019
            r0 = r3
            zh3.f r0 = (zh3.C91753f) r0
            long r1 = r0.mo125613a()
        L_0x0019:
            java.util.LinkedList r3 = new java.util.LinkedList     // Catch:{ all -> 0x006c }
            r3.<init>()     // Catch:{ all -> 0x006c }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ all -> 0x006c }
        L_0x0022:
            boolean r4 = r12.hasNext()     // Catch:{ all -> 0x006c }
            if (r4 == 0) goto L_0x0066
            java.lang.Object r4 = r12.next()     // Catch:{ all -> 0x006c }
            oa1.c r4 = (oa1.C47346c) r4     // Catch:{ all -> 0x006c }
            java.lang.String r5 = "MicroMsg.ExptStorage"
            r6 = 0
            if (r4 != 0) goto L_0x0034
            goto L_0x0060
        L_0x0034:
            r7 = 1
            boolean r8 = super.replace(r4)     // Catch:{ Exception -> 0x003a }
            goto L_0x004a
        L_0x003a:
            r8 = move-exception
            java.lang.Object[] r9 = new java.lang.Object[r7]     // Catch:{ all -> 0x006c }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x006c }
            r9[r6] = r8     // Catch:{ all -> 0x006c }
            java.lang.String r8 = "replace expt error [%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r8, r9)     // Catch:{ all -> 0x006c }
            r8 = 0
        L_0x004a:
            r9 = 2
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ all -> 0x006c }
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r8)     // Catch:{ all -> 0x006c }
            r9[r6] = r10     // Catch:{ all -> 0x006c }
            java.lang.String r6 = r4.toString()     // Catch:{ all -> 0x006c }
            r9[r7] = r6     // Catch:{ all -> 0x006c }
            java.lang.String r6 = "replace expt ret[%b] item[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r6, r9)     // Catch:{ all -> 0x006c }
            r6 = r8
        L_0x0060:
            if (r6 == 0) goto L_0x0022
            r3.add(r4)     // Catch:{ all -> 0x006c }
            goto L_0x0022
        L_0x0066:
            if (r0 == 0) goto L_0x006b
            r0.endTransaction(r1)
        L_0x006b:
            return r3
        L_0x006c:
            r12 = move-exception
            if (r0 == 0) goto L_0x0072
            r0.endTransaction(r1)
        L_0x0072:
            throw r12
        L_0x0073:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pa1.C47444d.mo72462Lo(java.util.List):java.util.List");
    }

    /* renamed from: jo */
    public final boolean mo72463jo(int i) {
        int i2;
        try {
            ISQLiteDatabase iSQLiteDatabase = this.f127268d;
            i2 = iSQLiteDatabase.delete("ExptItem", "exptId=?", new String[]{i + ""});
        } catch (Exception e) {
            Log.m105921e("MicroMsg.ExptStorage", "delete expt by id [%s]", e.toString());
            i2 = 0;
        }
        return i2 > 0;
    }
}
