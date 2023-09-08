package rv1;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.wcdb.database.SQLiteDatabase;

/* renamed from: rv1.h */
public class C101474h implements ISQLiteDatabase {

    /* renamed from: a */
    public final SQLiteDatabase f297183a;

    public C101474h(SQLiteDatabase sQLiteDatabase) {
        this.f297183a = sQLiteDatabase;
    }

    public long beginTransaction(long j) {
        this.f297183a.beginTransaction();
        return j;
    }

    public void close() {
        this.f297183a.close();
    }

    public int delete(String str, String str2, String[] strArr) {
        return this.f297183a.delete(str, str2, strArr);
    }

    public int endTransaction(long j) {
        this.f297183a.endTransaction();
        return 0;
    }

    public boolean execSQL(String str, String str2) {
        try {
            this.f297183a.execSQL(str2);
            return true;
        } catch (SQLException unused) {
            return false;
        }
    }

    public long insert(String str, String str2, ContentValues contentValues) {
        return this.f297183a.insert(str, str2, contentValues);
    }

    public long insertOrThrow(String str, String str2, ContentValues contentValues) {
        return this.f297183a.insertOrThrow(str, str2, contentValues);
    }

    public boolean isClose() {
        return !this.f297183a.isOpen();
    }

    public Cursor query(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        return this.f297183a.query(str, strArr, str2, strArr2, str3, str4, str5);
    }

    public Cursor rawQuery(String str, String[] strArr) {
        return this.f297183a.rawQuery(str, strArr);
    }

    public Cursor rawQueryWithCancel(String str, String[] strArr) {
        return this.f297183a.rawQuery(str, strArr);
    }

    public long replace(String str, String str2, ContentValues contentValues) {
        return this.f297183a.replace(str, str2, contentValues);
    }

    public int update(String str, ContentValues contentValues, String str2, String[] strArr) {
        return this.f297183a.update(str, contentValues, str2, strArr);
    }

    public Cursor query(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, int i) {
        return this.f297183a.query(str, strArr, str2, strArr2, str3, str4, str5);
    }

    public Cursor rawQuery(String str, String[] strArr, int i) {
        return this.f297183a.rawQuery(str, strArr);
    }

    public Cursor query(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, int i, String str6) {
        return this.f297183a.query(str, strArr, str2, strArr2, str3, str4, str5, str6);
    }
}
