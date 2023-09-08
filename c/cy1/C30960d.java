package cy1;

import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.stubs.logger.Log;
import com.tencent.wcdb.database.SQLiteStatement;
import gy3.C87412m;
import java.util.ArrayList;
import p749xh.C38699x5;
import px1.C35723a;
import sx3.C64175a0;
import sx3.C64197v;
import zh3.C91753f;

/* renamed from: cy1.d */
public final class C30960d extends MAutoStorage<C30958b> implements C30959c {

    /* renamed from: f */
    public static final String[] f83091f;

    /* renamed from: d */
    public final C91753f f83092d;

    /* renamed from: e */
    public final C35723a<C30958b> f83093e;

    /* renamed from: cy1.d$a */
    public static final class C30961a extends C35723a<C30958b> {
        public C30961a(C91753f fVar) {
            super(fVar);
        }

        /* renamed from: a */
        public String mo57905a() {
            return "INSERT OR REPLACE INTO `LocalLiteAppConf` (`url`,`appid`,`path`,`expire_duration`,`refresh_duration`,`wepkg_id`,`updateTime`,`hasLiteConf`) VALUES (?,?,?,?,?,?,?,?)";
        }

        /* renamed from: b */
        public void mo57906b(SQLiteStatement sQLiteStatement, Object obj) {
            C30958b bVar = (C30958b) obj;
            C87412m.m108594g(sQLiteStatement, "stmt");
            C87412m.m108594g(bVar, "entity");
            sQLiteStatement.bindAllArgs(new Object[]{bVar.field_url, bVar.field_appid, bVar.field_path, Integer.valueOf(bVar.field_expire_duration), Integer.valueOf(bVar.field_refresh_duration), bVar.field_wepkg_id, Long.valueOf(bVar.field_updateTime), Boolean.valueOf(bVar.field_hasLiteConf)});
        }
    }

    static {
        ArrayList c = C64197v.m75534c(MAutoStorage.getCreateSQLs(C30958b.f83090B, "LocalLiteAppConf"));
        String[] strArr = C38699x5.f104257p;
        C87412m.m108593f(strArr, "INDEX_CREATE");
        C64175a0.m75509q(c, strArr);
        Object[] array = c.toArray(new String[0]);
        C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        f83091f = (String[]) array;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C30960d(C91753f fVar) {
        super(fVar, C30958b.f83090B, "LocalLiteAppConf", C38699x5.f104257p);
        C87412m.m108594g(fVar, "storage");
        this.f83092d = fVar;
        this.f83093e = new C30961a(fVar);
    }

    /* renamed from: Cf */
    public void mo57902Cf(C30958b bVar) {
        C35723a<C30958b> aVar;
        SQLiteStatement sQLiteStatement;
        if (bVar != null) {
            long a = this.f83092d.mo125613a();
            try {
                aVar = this.f83093e;
                if (aVar.f95422a.compareAndSet(false, true)) {
                    if (aVar.f95424c == null) {
                        aVar.f95424c = aVar.f95423b.mo125615f().compileStatement("INSERT OR REPLACE INTO `LocalLiteAppConf` (`url`,`appid`,`path`,`expire_duration`,`refresh_duration`,`wepkg_id`,`updateTime`,`hasLiteConf`) VALUES (?,?,?,?,?,?,?,?)");
                    }
                    sQLiteStatement = aVar.f95424c;
                } else {
                    sQLiteStatement = aVar.f95423b.mo125615f().compileStatement("INSERT OR REPLACE INTO `LocalLiteAppConf` (`url`,`appid`,`path`,`expire_duration`,`refresh_duration`,`wepkg_id`,`updateTime`,`hasLiteConf`) VALUES (?,?,?,?,?,?,?,?)");
                }
                aVar.mo57906b(sQLiteStatement, bVar);
                sQLiteStatement.executeInsert();
                if (sQLiteStatement == aVar.f95424c) {
                    aVar.f95422a.set(false);
                }
                this.f83092d.endTransaction(a);
                StringBuilder sb = new StringBuilder();
                sb.append("insertOrUpdate liteAppConf =");
                sb.append("url: " + bVar.field_url + "; appId: " + bVar.field_appid + "path: " + bVar.field_path + "; wepkg_id: " + bVar.field_wepkg_id + "; expire_duration: " + bVar.field_expire_duration + "; refresh_duration: " + bVar.field_refresh_duration);
                Log.m106505i("GameLocalLiteAppConfDaoImpl", sb.toString());
            } catch (Throwable th) {
                this.f83092d.endTransaction(a);
                throw th;
            }
        }
    }

    /* renamed from: c */
    public void mo57903c(String str) {
        C87412m.m108594g(str, "hostPath");
        int delete = this.f83092d.delete("LocalLiteAppConf", "url = ?", new String[]{str});
        Log.m106505i("GameLocalLiteAppConfDaoImpl", "delete hostPath = " + str + "  result = " + delete);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0043, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0044, code lost:
        cy3.C58003b.m67160a(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0047, code lost:
        throw r1;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public cy1.C30958b mo57904m(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r0 = "hostPath"
            gy3.C87412m.m108594g(r5, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "SELECT * FROM LocalLiteAppConf WHERE url = "
            r0.append(r1)
            java.lang.String r5 = zh3.C91753f.m115264e(r5)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            gy3.f0 r0 = new gy3.f0
            r0.<init>()
            zh3.f r1 = r4.f83092d
            r2 = 0
            r3 = 2
            android.database.Cursor r5 = r1.rawQuery(r5, r2, r3)
            boolean r1 = r5.moveToFirst()     // Catch:{ all -> 0x0041 }
            if (r1 == 0) goto L_0x0037
            cy1.b r1 = new cy1.b     // Catch:{ all -> 0x0041 }
            r1.<init>()     // Catch:{ all -> 0x0041 }
            r1.convertFrom(r5)     // Catch:{ all -> 0x0041 }
            r0.f27484d = r1     // Catch:{ all -> 0x0041 }
        L_0x0037:
            rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0041 }
            cy3.C58003b.m67160a(r5, r2)
            T r5 = r0.f27484d
            cy1.b r5 = (cy1.C30958b) r5
            return r5
        L_0x0041:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0043 }
        L_0x0043:
            r1 = move-exception
            cy3.C58003b.m67160a(r5, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: cy1.C30960d.mo57904m(java.lang.String):cy1.b");
    }
}
