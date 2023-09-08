package zh3;

import com.tencent.wcdb.database.SQLiteDatabase;

public final class e$$g {

    /* renamed from: a */
    public SQLiteDatabase f262810a;

    /* renamed from: b */
    public int f262811b;

    /* renamed from: c */
    public String f262812c;

    /* renamed from: d */
    public long f262813d;

    /* renamed from: a */
    public void mo125612a(SQLiteDatabase sQLiteDatabase, int i, String str) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this) {
            this.f262810a = sQLiteDatabase;
            this.f262811b = i;
            this.f262812c = str;
            this.f262813d = currentTimeMillis;
        }
    }
}
