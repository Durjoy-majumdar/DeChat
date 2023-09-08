package sl2;

import android.database.Cursor;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import fl2.C32073a;

/* renamed from: sl2.a */
public class C36680a extends MAutoStorage<C32073a> {

    /* renamed from: e */
    public static final String[] f97477e = {MAutoStorage.getCreateSQLs(C32073a.f85322x, "ScanHistoryItem")};

    /* renamed from: d */
    public ISQLiteDatabase f97478d;

    public C36680a(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C32073a.f85322x, "ScanHistoryItem", (String[]) null);
        this.f97478d = iSQLiteDatabase;
    }

    public Cursor getAll() {
        return this.f97478d.rawQuery("select * from ScanHistoryItem order by ScanTime desc", (String[]) null);
    }
}
