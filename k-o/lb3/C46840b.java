package lb3;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import p749xh.C53351u9;

/* renamed from: lb3.b */
public class C46840b extends MAutoStorage<C46839a> {

    /* renamed from: e */
    public static final String[] f125990e = {MAutoStorage.getCreateSQLs(C46839a.f125989B, "WePkgDiffPackage")};

    /* renamed from: f */
    public static C46840b f125991f;

    /* renamed from: g */
    public static final Object f125992g = new Object();

    /* renamed from: d */
    public ISQLiteDatabase f125993d;

    public C46840b(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C46839a.f125989B, "WePkgDiffPackage", C53351u9.f149959p);
        this.f125993d = iSQLiteDatabase;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0012, code lost:
        if ((r1.f125993d != null) == false) goto L_0x0014;
     */
    /* renamed from: Lo */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static lb3.C46840b m52131Lo() {
        /*
            lb3.b r0 = f125991f
            if (r0 != 0) goto L_0x0026
            java.lang.Object r0 = f125992g
            monitor-enter(r0)
            lb3.b r1 = f125991f     // Catch:{ all -> 0x0023 }
            if (r1 == 0) goto L_0x0014
            com.tencent.mm.sdk.storage.ISQLiteDatabase r1 = r1.f125993d     // Catch:{ all -> 0x0023 }
            if (r1 == 0) goto L_0x0011
            r1 = 1
            goto L_0x0012
        L_0x0011:
            r1 = 0
        L_0x0012:
            if (r1 != 0) goto L_0x0021
        L_0x0014:
            lb3.b r1 = new lb3.b     // Catch:{ all -> 0x0023 }
            f40.o r2 = f40.C86709a0.m107535s()     // Catch:{ all -> 0x0023 }
            zh3.f r2 = r2.f251811i     // Catch:{ all -> 0x0023 }
            r1.<init>(r2)     // Catch:{ all -> 0x0023 }
            f125991f = r1     // Catch:{ all -> 0x0023 }
        L_0x0021:
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            goto L_0x0026
        L_0x0023:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            throw r1
        L_0x0026:
            lb3.b r0 = f125991f
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lb3.C46840b.m52131Lo():lb3.b");
    }

    /* renamed from: c */
    public boolean mo72038c(String str) {
        if (!(this.f125993d != null) || Util.isNullOrNil(str)) {
            return false;
        }
        return execSQL("WePkgDiffPackage", String.format("delete from %s where %s=%s", new Object[]{"WePkgDiffPackage", "pkgId", "'" + str + "'"}));
    }

    /* renamed from: jo */
    public C46839a mo72039jo(String str) {
        if ((this.f125993d != null) && !Util.isNullOrNil(str)) {
            Cursor rawQuery = rawQuery(String.format("select * from %s where %s=%s", new Object[]{"WePkgDiffPackage", "pkgId", "'" + str + "'"}), new String[0]);
            if (rawQuery != null) {
                if (rawQuery.moveToFirst()) {
                    C46839a aVar = new C46839a();
                    aVar.convertFrom(rawQuery);
                    rawQuery.close();
                    return aVar;
                }
                rawQuery.close();
            }
        }
        return null;
    }
}
