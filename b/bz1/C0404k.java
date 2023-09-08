package bz1;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import gy3.C87412m;
import p749xh.C38573h4;

/* renamed from: bz1.k */
public final class C0404k extends MAutoStorage<C38573h4> {

    /* renamed from: e */
    public static final String[] f1016e = {MAutoStorage.getCreateSQLs(C0394d.f998C, "GameLifeContact")};

    /* renamed from: d */
    public final ISQLiteDatabase f1017d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0404k(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C0394d.f998C, "GameLifeContact", C38573h4.f102432p);
        C87412m.m108594g(iSQLiteDatabase, "storage");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C0394d.f998C;
        this.f1017d = iSQLiteDatabase;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0033 A[Catch:{ all -> 0x002e, all -> 0x0044 }] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003c A[Catch:{ all -> 0x002e, all -> 0x0044 }] */
    /* renamed from: jo */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final bz1.C0394d mo446jo(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r0 = "username"
            gy3.C87412m.m108594g(r5, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "SELECT *, rowid FROM GameLifeContact WHERE username = "
            r0.append(r1)
            java.lang.String r5 = zh3.C91753f.m115264e(r5)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r4.f1017d
            r1 = 0
            r2 = 2
            android.database.Cursor r5 = r0.rawQuery(r5, r1, r2)
            r0 = 1
            r2 = 0
            if (r5 == 0) goto L_0x0030
            boolean r3 = r5.moveToFirst()     // Catch:{ all -> 0x002e }
            if (r3 != r0) goto L_0x0030
            goto L_0x0031
        L_0x002e:
            r0 = move-exception
            goto L_0x0043
        L_0x0030:
            r0 = 0
        L_0x0031:
            if (r0 == 0) goto L_0x003c
            bz1.d r0 = new bz1.d     // Catch:{ all -> 0x002e }
            r0.<init>()     // Catch:{ all -> 0x002e }
            r0.convertFrom(r5)     // Catch:{ all -> 0x002e }
            goto L_0x003d
        L_0x003c:
            r0 = r1
        L_0x003d:
            rx3.b0 r2 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x002e }
            cy3.C58003b.m67160a(r5, r1)
            return r0
        L_0x0043:
            throw r0     // Catch:{ all -> 0x0044 }
        L_0x0044:
            r1 = move-exception
            cy3.C58003b.m67160a(r5, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: bz1.C0404k.mo446jo(java.lang.String):bz1.d");
    }
}
