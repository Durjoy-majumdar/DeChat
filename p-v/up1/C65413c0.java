package up1;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import fe1.C58969q;
import gy3.C87412m;
import ht1.C60195q3;
import p749xh.C66257b3;

/* renamed from: up1.c0 */
public final class C65413c0 extends MAutoStorage<C66257b3> implements C60195q3 {

    /* renamed from: e */
    public static final String[] f188254e = {"CREATE INDEX IF NOT EXISTS FinderMsgAliasContactStorage_username_index ON FinderMsgAliasContactStorage(username)"};

    /* renamed from: f */
    public static final String[] f188255f = {MAutoStorage.getCreateSQLs(C58969q.f168705a2, "FinderMsgAliasContactStorage")};

    /* renamed from: d */
    public final ISQLiteDatabase f188256d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65413c0(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C58969q.f168705a2, "FinderMsgAliasContactStorage", f188254e);
        C87412m.m108594g(iSQLiteDatabase, "storage");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C58969q.f168705a2;
        this.f188256d = iSQLiteDatabase;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0085, code lost:
        if (r12 > 0) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0106, code lost:
        if (r2 > 0) goto L_0x0108;
     */
    /* renamed from: S1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo85198S1(fe1.C58969q r23, boolean r24) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            java.lang.String r2 = "ct"
            gy3.C87412m.m108594g(r1, r2)
            if (r24 == 0) goto L_0x0011
            long r2 = eb0.C31543z5.m39453c()
            r1.field_updateTime = r2
        L_0x0011:
            java.lang.String r2 = r23.getUsername()
            fe1.q r2 = r0.mo89497jo(r2)
            java.lang.String r3 = "Finder.FinderMsgAliasContactStorage"
            r4 = 32
            java.lang.String r5 = "currentThread().name"
            java.lang.String r6 = ""
            r7 = 1
            java.lang.String r8 = "FinderMsgAliasContactStorage"
            r9 = 0
            if (r2 != 0) goto L_0x008c
            android.content.ContentValues r2 = r23.convertTo()
            long r10 = android.os.SystemClock.uptimeMillis()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r12 = r0.f188256d
            long r12 = r12.insert(r8, r6, r2)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            gy3.C87412m.m108593f(r2, r5)
            r15 = 44
            r16 = 59
            r17 = 0
            r18 = 4
            r19 = 0
            java.lang.String r14 = "insertContact"
            java.lang.String r16 = z04.C112551y.m153815o(r14, r15, r16, r17, r18, r19)
            long r5 = android.os.SystemClock.uptimeMillis()
            long r17 = r5 - r10
            ue1.e r5 = new ue1.e
            r20 = 0
            java.lang.String r15 = "FinderMsgAliasContactStorage.insertContact"
            r14 = r5
            r19 = r2
            r14.<init>(r15, r16, r17, r19, r20)
            r5.mo89421a()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "insert contact "
            r2.append(r5)
            r2.append(r1)
            r2.append(r4)
            r2.append(r12)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            r1.systemRowid = r12
            r2 = 0
            int r4 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0089
            goto L_0x0108
        L_0x0089:
            r7 = 0
            goto L_0x0108
        L_0x008c:
            android.content.ContentValues r2 = r23.convertTo()
            java.lang.String r10 = "rowid"
            r2.remove(r10)
            long r10 = android.os.SystemClock.uptimeMillis()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r12 = r0.f188256d
            java.lang.String[] r13 = new java.lang.String[r7]
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r6)
            java.lang.String r6 = r1.field_username
            r14.append(r6)
            java.lang.String r6 = r14.toString()
            r13[r9] = r6
            java.lang.String r6 = "username=?"
            int r2 = r12.update(r8, r2, r6, r13)
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            java.lang.String r6 = r6.getName()
            gy3.C87412m.m108593f(r6, r5)
            r13 = 44
            r14 = 59
            r15 = 0
            r16 = 4
            r17 = 0
            java.lang.String r12 = "updateContact"
            java.lang.String r14 = z04.C112551y.m153815o(r12, r13, r14, r15, r16, r17)
            long r12 = android.os.SystemClock.uptimeMillis()
            long r15 = r12 - r10
            ue1.e r5 = new ue1.e
            r18 = 0
            java.lang.String r13 = "FinderMsgAliasContactStorage.updateContact"
            r12 = r5
            r17 = r6
            r12.<init>(r13, r14, r15, r17, r18)
            r5.mo89421a()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "updateContact "
            r5.append(r6)
            java.lang.String r6 = r23.mo84193q2()
            r5.append(r6)
            r5.append(r4)
            r5.append(r2)
            java.lang.String r4 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            if (r2 <= 0) goto L_0x0089
        L_0x0108:
            if (r7 == 0) goto L_0x0112
            r2 = 4
            java.lang.String r1 = r23.getUsername()
            r0.doNotify(r8, r2, r1)
        L_0x0112:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: up1.C65413c0.mo85198S1(fe1.q, boolean):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0071 A[Catch:{ all -> 0x006b, all -> 0x0082 }] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x007a A[Catch:{ all -> 0x006b, all -> 0x0082 }] */
    /* renamed from: jo */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public fe1.C58969q mo89497jo(java.lang.String r20) {
        /*
            r19 = this;
            java.lang.String r0 = "username"
            r1 = r20
            gy3.C87412m.m108594g(r1, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "SELECT *, rowid FROM FinderMsgAliasContactStorage WHERE username = "
            r0.append(r2)
            java.lang.String r1 = zh3.C91753f.m115264e(r20)
            r0.append(r1)
            java.lang.String r2 = r0.toString()
            long r0 = android.os.SystemClock.uptimeMillis()
            r8 = r19
            com.tencent.mm.sdk.storage.ISQLiteDatabase r3 = r8.f188256d
            r9 = 0
            r4 = 2
            android.database.Cursor r10 = r3.rawQuery(r2, r9, r4)
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.String r14 = r3.getName()
            java.lang.String r3 = "currentThread().name"
            gy3.C87412m.m108593f(r14, r3)
            java.lang.String r3 = "sql"
            gy3.C87412m.m108594g(r2, r3)
            r3 = 44
            r4 = 59
            r5 = 0
            r6 = 4
            r7 = 0
            java.lang.String r13 = z04.C112551y.m153815o(r2, r3, r4, r5, r6, r7)
            long r2 = android.os.SystemClock.uptimeMillis()
            long r0 = r2 - r0
            ue1.e r2 = new ue1.e
            java.lang.String r12 = "FinderMsgAliasContactStorage.getContact"
            r17 = 0
            r11 = r2
            r3 = r14
            r14 = r0
            r16 = r3
            r11.<init>(r12, r13, r14, r16, r17)
            r2.mo89421a()
            r0 = 1
            r1 = 0
            if (r10 == 0) goto L_0x006e
            boolean r2 = r10.moveToFirst()     // Catch:{ all -> 0x006b }
            if (r2 != r0) goto L_0x006e
            goto L_0x006f
        L_0x006b:
            r0 = move-exception
            r1 = r0
            goto L_0x0081
        L_0x006e:
            r0 = 0
        L_0x006f:
            if (r0 == 0) goto L_0x007a
            fe1.q r0 = new fe1.q     // Catch:{ all -> 0x006b }
            r0.<init>()     // Catch:{ all -> 0x006b }
            r0.convertFrom(r10)     // Catch:{ all -> 0x006b }
            goto L_0x007b
        L_0x007a:
            r0 = r9
        L_0x007b:
            rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x006b }
            cy3.C58003b.m67160a(r10, r9)
            return r0
        L_0x0081:
            throw r1     // Catch:{ all -> 0x0082 }
        L_0x0082:
            r0 = move-exception
            r2 = r0
            cy3.C58003b.m67160a(r10, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: up1.C65413c0.mo89497jo(java.lang.String):fe1.q");
    }
}
