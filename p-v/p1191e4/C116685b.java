package p1191e4;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import p1188d4.C116568e;

/* renamed from: e4.b */
public class C116685b implements SQLiteDatabase.CursorFactory {

    /* renamed from: a */
    public final /* synthetic */ C116568e f349942a;

    public C116685b(C116683a aVar, C116568e eVar) {
        this.f349942a = eVar;
    }

    public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        this.f349942a.mo180539b(new C116690e(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }
}
