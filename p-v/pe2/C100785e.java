package pe2;

import com.tencent.p014mm.plugin.priority.model.PriorityJni;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.wcdb.Cursor;
import com.tencent.wcdb.DatabaseErrorHandler;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteDirectCursor;
import com.tencent.wcdb.database.SQLiteDoneException;
import com.tencent.wcdb.database.SQLiteStatement;
import eb0.C75592q0;
import f40.C86709a0;
import java.util.HashMap;
import p156gj.C87203t;
import p823sg.C90193h;
import zh3.C119118e;

/* renamed from: pe2.e */
public class C100785e {

    /* renamed from: a */
    public SQLiteDatabase f295252a;

    /* renamed from: b */
    public SQLiteStatement f295253b;

    /* renamed from: c */
    public SQLiteStatement f295254c;

    /* renamed from: d */
    public SQLiteStatement f295255d;

    public C100785e(String str) {
        if (this.f295252a != null) {
            Log.m105928w("MicroMsg.Priority.PriorityDB", "before initDB, pre DB is not close, why?");
            this.f295252a.close();
        }
        String i = new C86009m1(str, "MicroMsgPriority.db").mo119971i();
        long currentTimeMillis = System.currentTimeMillis();
        SQLiteDatabase openOrCreateDatabase = SQLiteDatabase.openOrCreateDatabase(i, C90193h.m112878f((C86709a0.m107523b().mo121111i() + C75592q0.m90789s() + C87203t.m108270f(true)).getBytes()).substring(0, 7).getBytes(), (SQLiteDatabase.CursorFactory) null, (DatabaseErrorHandler) null);
        this.f295252a = openOrCreateDatabase;
        C119118e eVar = new C119118e();
        eVar.f356743b = openOrCreateDatabase;
        ((HashMap) C119118e.f356728h).put(eVar.mo183817j(), eVar);
        C119118e.m167940c(eVar);
        SQLiteDatabase sQLiteDatabase = this.f295252a;
        long acquireNativeConnectionHandle = sQLiteDatabase.acquireNativeConnectionHandle("initPriority", false, false);
        PriorityJni.nativeInit(acquireNativeConnectionHandle);
        sQLiteDatabase.releaseNativeConnection(acquireNativeConnectionHandle, (Exception) null);
        this.f295252a.execSQL(String.format("CREATE TABLE IF NOT EXISTS %s (type INTEGER PRIMARY KEY, version INTEGER);", new Object[]{"PriorityConfig"}));
        this.f295253b = this.f295252a.compileStatement(String.format("SELECT version FROM %s WHERE type=?;", new Object[]{"PriorityConfig"}));
        this.f295254c = this.f295252a.compileStatement(String.format("INSERT OR REPLACE INTO %s (type, version) VALUES (?, ?);", new Object[]{"PriorityConfig"}));
        this.f295255d = this.f295252a.compileStatement(String.format("DELETE FROM %s WHERE type=?", new Object[]{"PriorityConfig"}));
        Log.m105925i("MicroMsg.Priority.PriorityDB", "initDB index params %d %s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), Util.getSizeMB(C86013q1.m106451l(i), 100.0d));
    }

    /* renamed from: a */
    public SQLiteStatement mo140219a(String str) {
        Log.m105927v("MicroMsg.Priority.PriorityDB", "compileStatement sql = %s", str);
        return this.f295252a.compileStatement(str);
    }

    /* renamed from: b */
    public void mo140220b(String str) {
        Log.m105927v("MicroMsg.Priority.PriorityDB", "dropTable: %s", str);
        this.f295252a.execSQL(String.format("DROP TABLE %s", new Object[]{str}));
    }

    /* renamed from: c */
    public void mo140221c(String str) {
        Log.m105927v("MicroMsg.Priority.PriorityDB", "execSQL: execute sql = %s", str);
        this.f295252a.execSQL(str);
    }

    /* renamed from: d */
    public void mo140222d(String str, Object[] objArr) {
        Log.m105927v("MicroMsg.Priority.PriorityDB", "execSQL: execute sql = %s", str);
        this.f295252a.execSQL(str, objArr);
    }

    /* renamed from: e */
    public long mo140223e(long j, long j2) {
        this.f295253b.bindLong(1, j);
        try {
            return this.f295253b.simpleQueryForLong();
        } catch (SQLiteDoneException unused) {
            return j2;
        }
    }

    /* renamed from: f */
    public int mo140224f(String str) {
        Cursor rawQuery = this.f295252a.rawQuery(String.format("SELECT count(*) FROM %s;", new Object[]{str}), (Object[]) null);
        try {
            if (rawQuery.moveToNext()) {
                return rawQuery.getInt(0);
            }
            rawQuery.close();
            return 0;
        } finally {
            rawQuery.close();
        }
    }

    /* renamed from: g */
    public boolean mo140225g(String str) {
        Cursor rawQuery = this.f295252a.rawQuery("SELECT 1 FROM sqlite_master WHERE type='table' AND name=?;", new String[]{str});
        boolean moveToNext = rawQuery.moveToNext();
        rawQuery.close();
        return moveToNext;
    }

    /* renamed from: h */
    public android.database.Cursor mo140226h(String str, String[] strArr) {
        Log.m105927v("MicroMsg.Priority.PriorityDB", "rawQuery: execute sql = %s", str);
        return this.f295252a.rawQueryWithFactory(SQLiteDirectCursor.FACTORY, str, strArr, (String) null);
    }

    /* renamed from: i */
    public void mo140227i(long j, long j2) {
        this.f295254c.bindLong(1, j);
        this.f295254c.bindLong(2, j2);
        this.f295254c.execute();
    }
}
