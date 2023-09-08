package p1191e4;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import p1188d4.C116561a;
import p1188d4.C116562b;
import p1188d4.C116568e;

/* renamed from: e4.a */
public class C116683a implements C116562b {

    /* renamed from: e */
    public static final String[] f349939e = new String[0];

    /* renamed from: d */
    public final SQLiteDatabase f349940d;

    /* renamed from: e4.a$a */
    public class C116684a implements SQLiteDatabase.CursorFactory {

        /* renamed from: a */
        public final /* synthetic */ C116568e f349941a;

        public C116684a(C116683a aVar, C116568e eVar) {
            this.f349941a = eVar;
        }

        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f349941a.mo180539b(new C116690e(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public C116683a(SQLiteDatabase sQLiteDatabase) {
        this.f349940d = sQLiteDatabase;
    }

    /* renamed from: a */
    public void mo180682a() {
        this.f349940d.beginTransaction();
    }

    /* renamed from: b */
    public void mo180683b() {
        this.f349940d.endTransaction();
    }

    /* renamed from: c */
    public void mo180684c(String str) {
        this.f349940d.execSQL(str);
    }

    public void close() {
        this.f349940d.close();
    }

    /* renamed from: d */
    public Cursor mo180686d(C116568e eVar) {
        return this.f349940d.rawQueryWithFactory(new C116684a(this, eVar), eVar.mo180538a(), f349939e, (String) null);
    }

    /* renamed from: e */
    public Cursor mo180687e(String str) {
        return mo180686d(new C116561a(str));
    }

    /* renamed from: g */
    public void mo180688g() {
        this.f349940d.setTransactionSuccessful();
    }
}
