package zg2;

import android.content.ContentValues;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import gy3.C87412m;

/* renamed from: zg2.g */
public final class C39357g extends MAutoStorage<C103014f> {

    /* renamed from: e */
    public static final String[] f105780e;

    /* renamed from: f */
    public static final String f105781f;

    /* renamed from: d */
    public final ISQLiteDatabase f105782d;

    static {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C103014f.f303968y0;
        String str = C103014f.f303966Q0;
        f105780e = new String[]{MAutoStorage.getCreateSQLs(mAutoDBInfo, str)};
        f105781f = str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39357g(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C103014f.f303968y0, C103014f.f303966Q0, C103014f.f303967R0);
        C87412m.m108594g(iSQLiteDatabase, "db");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C103014f.f303968y0;
        this.f105782d = iSQLiteDatabase;
    }

    /* renamed from: Lo */
    public final int mo62032Lo(String str, C103014f fVar) {
        C87412m.m108594g(str, "taskId");
        C87412m.m108594g(fVar, "editorData");
        ContentValues convertTo = fVar.convertTo();
        convertTo.remove("rowid");
        ISQLiteDatabase iSQLiteDatabase = this.f105782d;
        String str2 = f105781f;
        return iSQLiteDatabase.update(str2, convertTo, "taskId=?", new String[]{"" + str});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0047, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0048, code lost:
        cy3.C58003b.m67160a(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004b, code lost:
        throw r1;
     */
    /* renamed from: jo */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final zg2.C103014f mo62033jo(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "taskId"
            gy3.C87412m.m108594g(r6, r0)
            r1 = 3
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = f105781f
            r4 = 0
            r2[r4] = r3
            r3 = 1
            r2[r3] = r0
            r0 = 2
            r2[r0] = r6
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r2, r1)
            java.lang.String r0 = "select * from %s where %s=\"%s\""
            java.lang.String r6 = java.lang.String.format(r0, r6)
            java.lang.String r0 = "format(format, *args)"
            gy3.C87412m.m108593f(r6, r0)
            java.lang.String[] r0 = new java.lang.String[r4]
            android.database.Cursor r6 = r5.rawQuery(r6, r0)
            r0 = 0
            if (r6 == 0) goto L_0x004c
            boolean r1 = r6.moveToFirst()     // Catch:{ all -> 0x0045 }
            if (r1 == 0) goto L_0x003f
            zg2.f r1 = new zg2.f     // Catch:{ all -> 0x0045 }
            r1.<init>()     // Catch:{ all -> 0x0045 }
            r1.convertFrom(r6)     // Catch:{ all -> 0x0045 }
            cy3.C58003b.m67160a(r6, r0)
            return r1
        L_0x003f:
            rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0045 }
            cy3.C58003b.m67160a(r6, r0)
            goto L_0x004c
        L_0x0045:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0047 }
        L_0x0047:
            r1 = move-exception
            cy3.C58003b.m67160a(r6, r0)
            throw r1
        L_0x004c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zg2.C39357g.mo62033jo(java.lang.String):zg2.f");
    }
}
