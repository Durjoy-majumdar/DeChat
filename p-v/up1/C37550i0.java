package up1;

import cm1.C28617v1;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import gy3.C87412m;
import p749xh.C38674u3;

/* renamed from: up1.i0 */
public final class C37550i0 extends MAutoStorage<C28617v1> {

    /* renamed from: e */
    public static final String[] f99605e = {MAutoStorage.getCreateSQLs(C28617v1.f78522p, "FinderOrAliasDeletingInfo")};

    /* renamed from: d */
    public final ISQLiteDatabase f99606d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37550i0(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C28617v1.f78522p, "FinderOrAliasDeletingInfo", C38674u3.f103883g);
        C87412m.m108594g(iSQLiteDatabase, "db");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C28617v1.f78522p;
        this.f99606d = iSQLiteDatabase;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        cy3.C58003b.m67160a(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        throw r2;
     */
    /* renamed from: jo */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.LinkedList<cm1.C28617v1> mo61201jo() {
        /*
            r4 = this;
            java.lang.String r0 = "Finder.FinderOrAliasDeletingInfoStorage"
            java.lang.String r1 = "getAllDeletingInfo"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r1 = r4.f99606d
            java.lang.String r2 = "select * , rowid from FinderOrAliasDeletingInfo"
            r3 = 0
            android.database.Cursor r1 = r1.rawQuery(r2, r3)
        L_0x0015:
            boolean r2 = r1.moveToNext()     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x0027
            cm1.v1 r2 = new cm1.v1     // Catch:{ all -> 0x002d }
            r2.<init>()     // Catch:{ all -> 0x002d }
            r2.convertFrom(r1)     // Catch:{ all -> 0x002d }
            r0.add(r2)     // Catch:{ all -> 0x002d }
            goto L_0x0015
        L_0x0027:
            rx3.b0 r2 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x002d }
            cy3.C58003b.m67160a(r1, r3)
            return r0
        L_0x002d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x002f }
        L_0x002f:
            r2 = move-exception
            cy3.C58003b.m67160a(r1, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: up1.C37550i0.mo61201jo():java.util.LinkedList");
    }
}
