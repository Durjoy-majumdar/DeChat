package p1193g6;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import p811d6.C116602o;

/* renamed from: g6.a */
public class C116921a extends SQLiteOpenHelper implements C116922b {

    /* renamed from: d */
    public static final String[] f350358d = {"_id", "url", "length", "mime"};

    public C116921a(Context context) {
        super(context, "AndroidVideoCache.db", (SQLiteDatabase.CursorFactory) null, 1);
        context.getClass();
    }

    /* renamed from: a */
    public void mo180895a(String str, C116602o oVar) {
        Object[] objArr = {str, oVar};
        for (int i = 0; i < 2; i++) {
            objArr[i].getClass();
        }
        boolean z = get(str) != null;
        ContentValues contentValues = new ContentValues();
        contentValues.put("url", oVar.f349658a);
        contentValues.put("length", Long.valueOf(oVar.f349659b));
        contentValues.put("mime", oVar.f349660c);
        if (z) {
            getWritableDatabase().update("SourceInfo", contentValues, "url=?", new String[]{str});
        } else {
            getWritableDatabase().insert("SourceInfo", (String) null, contentValues);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0056  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p811d6.C116602o get(java.lang.String r11) {
        /*
            r10 = this;
            r11.getClass()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r10.getReadableDatabase()     // Catch:{ all -> 0x0050 }
            java.lang.String r2 = "SourceInfo"
            java.lang.String[] r3 = f350358d     // Catch:{ all -> 0x0050 }
            java.lang.String r4 = "url=?"
            r5 = 1
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ all -> 0x0050 }
            r6 = 0
            r5[r6] = r11     // Catch:{ all -> 0x0050 }
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r11 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0050 }
            if (r11 == 0) goto L_0x004a
            boolean r1 = r11.moveToFirst()     // Catch:{ all -> 0x0048 }
            if (r1 != 0) goto L_0x0024
            goto L_0x004a
        L_0x0024:
            d6.o r0 = new d6.o     // Catch:{ all -> 0x0048 }
            java.lang.String r1 = "url"
            int r1 = r11.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0048 }
            java.lang.String r1 = r11.getString(r1)     // Catch:{ all -> 0x0048 }
            java.lang.String r2 = "length"
            int r2 = r11.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x0048 }
            long r2 = r11.getLong(r2)     // Catch:{ all -> 0x0048 }
            java.lang.String r4 = "mime"
            int r4 = r11.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x0048 }
            java.lang.String r4 = r11.getString(r4)     // Catch:{ all -> 0x0048 }
            r0.<init>(r1, r2, r4)     // Catch:{ all -> 0x0048 }
            goto L_0x004a
        L_0x0048:
            r0 = move-exception
            goto L_0x0054
        L_0x004a:
            if (r11 == 0) goto L_0x004f
            r11.close()
        L_0x004f:
            return r0
        L_0x0050:
            r11 = move-exception
            r9 = r0
            r0 = r11
            r11 = r9
        L_0x0054:
            if (r11 == 0) goto L_0x0059
            r11.close()
        L_0x0059:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p1193g6.C116921a.get(java.lang.String):d6.o");
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        sQLiteDatabase.execSQL("CREATE TABLE SourceInfo (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,url TEXT NOT NULL,mime TEXT,length INTEGER);");
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        throw new IllegalStateException("Should not be called. There is no any migration");
    }
}
