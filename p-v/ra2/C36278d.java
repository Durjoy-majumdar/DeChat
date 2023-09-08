package ra2;

import android.database.Cursor;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import o90.C100308d;
import p823sg.C101611g;
import q90.C101062d;

/* renamed from: ra2.d */
public class C36278d extends MAutoStorage<C36277c> {

    /* renamed from: d */
    public C101611g<String, C36277c> f96594d = new C100308d(20);

    /* renamed from: e */
    public ISQLiteDatabase f96595e;

    public C36278d(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C36277c.f96593z, "PieceMusicInfo", (String[]) null);
        this.f96595e = iSQLiteDatabase;
    }

    /* renamed from: jo */
    public C36277c mo60600jo(String str) {
        if (((C101062d) this.f96594d).get(str) != null) {
            return (C36277c) ((C101062d) this.f96594d).get(str);
        }
        String format = String.format("Select * From PieceMusicInfo Where musicId=?", new Object[0]);
        Cursor rawQuery = this.f96595e.rawQuery(format, new String[]{str}, 2);
        if (rawQuery != null && rawQuery.moveToFirst()) {
            C36277c cVar = new C36277c();
            cVar.convertFrom(rawQuery);
            rawQuery.close();
            ((C101062d) this.f96594d).put(str, cVar);
            return cVar;
        } else if (rawQuery == null) {
            return null;
        } else {
            rawQuery.close();
            return null;
        }
    }
}
