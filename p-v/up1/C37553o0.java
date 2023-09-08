package up1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import gy3.C87412m;
import p749xh.C38712z3;

/* renamed from: up1.o0 */
public final class C37553o0 extends MAutoStorage<C37552n0> {

    /* renamed from: e */
    public static final String[] f99609e = {MAutoStorage.getCreateSQLs(C37552n0.f99608z, "FinderSnsKeyWordsJumpConfig")};

    /* renamed from: d */
    public final ISQLiteDatabase f99610d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37553o0(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C37552n0.f99608z, "FinderSnsKeyWordsJumpConfig", C38712z3.f104413o);
        C87412m.m108594g(iSQLiteDatabase, "db");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C37552n0.f99608z;
        this.f99610d = iSQLiteDatabase;
    }

    /* renamed from: Lo */
    public final int mo61202Lo(boolean z) {
        int delete = this.f99610d.delete("FinderSnsKeyWordsJumpConfig", (String) null, (String[]) null);
        if (z) {
            doNotify("SnsHotWord remove data");
        }
        Log.m105924i("Finder.FinderSnsKeyWordsStorage", "removeAllInfo , result:" + delete);
        return delete;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00a7, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00a8, code lost:
        cy3.C58003b.m67160a(r0, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00ab, code lost:
        throw r1;
     */
    /* renamed from: jo */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo61203jo(up1.C37552n0 r9) {
        /*
            r8 = this;
            java.lang.String r0 = "info"
            gy3.C87412m.m108594g(r9, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "insert, localId:"
            r0.append(r1)
            long r1 = r9.field_localId
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Finder.FinderSnsKeyWordsStorage"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            long r2 = r9.field_localId
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "select *, rowid from FinderSnsKeyWordsJumpConfig where localId = '"
            r0.append(r4)
            r0.append(r2)
            java.lang.String r2 = "' "
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r2 = r8.f99610d
            r3 = 0
            android.database.Cursor r0 = r2.rawQuery(r0, r3)
            int r2 = r0.getCount()     // Catch:{ all -> 0x00a5 }
            r4 = 1
            r5 = 0
            if (r2 <= 0) goto L_0x0046
            r2 = 1
            goto L_0x0047
        L_0x0046:
            r2 = 0
        L_0x0047:
            cy3.C58003b.m67160a(r0, r3)
            if (r2 == 0) goto L_0x008c
            android.content.ContentValues r0 = r9.convertTo()
            java.lang.String r2 = "rowid"
            r0.remove(r2)
            com.tencent.mm.sdk.storage.ISQLiteDatabase r2 = r8.f99610d
            java.lang.String[] r3 = new java.lang.String[r4]
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = ""
            r4.append(r6)
            long r6 = r9.field_localId
            r4.append(r6)
            java.lang.String r9 = r4.toString()
            r3[r5] = r9
            java.lang.String r9 = "FinderSnsKeyWordsJumpConfig"
            java.lang.String r4 = "localId=?"
            int r9 = r2.update(r9, r0, r4, r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "update, result:"
            r0.append(r2)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r9)
            goto L_0x00a4
        L_0x008c:
            boolean r9 = super.insertNotify(r9, r5)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "insert, result:"
            r0.append(r2)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r9)
        L_0x00a4:
            return
        L_0x00a5:
            r9 = move-exception
            throw r9     // Catch:{ all -> 0x00a7 }
        L_0x00a7:
            r1 = move-exception
            cy3.C58003b.m67160a(r0, r9)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: up1.C37553o0.mo61203jo(up1.n0):void");
    }
}
