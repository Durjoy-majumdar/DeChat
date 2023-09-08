package p1191e4;

import android.database.sqlite.SQLiteProgram;
import p1188d4.C116567d;

/* renamed from: e4.e */
public class C116690e implements C116567d {

    /* renamed from: d */
    public final SQLiteProgram f349955d;

    public C116690e(SQLiteProgram sQLiteProgram) {
        this.f349955d = sQLiteProgram;
    }

    public void bindBlob(int i, byte[] bArr) {
        this.f349955d.bindBlob(i, bArr);
    }

    public void bindDouble(int i, double d) {
        this.f349955d.bindDouble(i, d);
    }

    public void bindLong(int i, long j) {
        this.f349955d.bindLong(i, j);
    }

    public void bindNull(int i) {
        this.f349955d.bindNull(i);
    }

    public void bindString(int i, String str) {
        this.f349955d.bindString(i, str);
    }

    public void close() {
        this.f349955d.close();
    }
}
