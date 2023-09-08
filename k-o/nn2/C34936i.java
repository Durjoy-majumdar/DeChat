package nn2;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;

/* renamed from: nn2.i */
public class C34936i extends MAutoStorage<C34935h> {

    /* renamed from: e */
    public static final String[] f93789e = {"CREATE INDEX IF NOT EXISTS  shakemessage_status_index ON shakemessage ( status )", "CREATE INDEX IF NOT EXISTS shakemessage_type_index ON shakemessage ( type )"};

    /* renamed from: f */
    public static final String[] f93790f = {MAutoStorage.getCreateSQLs(C34935h.f93788L, "shakemessage")};

    /* renamed from: d */
    public ISQLiteDatabase f93791d;

    public C34936i(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C34935h.f93788L, "shakemessage", f93789e);
        this.f93791d = iSQLiteDatabase;
    }

    /* renamed from: Lo */
    public boolean insert(C34935h hVar) {
        if (hVar == null) {
            Log.m105920e("MicroMsg.ShakeMessageStorage", "insert fail, shakeMsg is null");
            return false;
        } else if (!super.insert(hVar)) {
            return false;
        } else {
            doNotify(hVar.systemRowid + "");
            return true;
        }
    }

    /* renamed from: jo */
    public int mo59792jo() {
        ISQLiteDatabase iSQLiteDatabase = this.f93791d;
        Cursor rawQuery = iSQLiteDatabase.rawQuery("select count(*) from " + getTableName() + " where status != " + 1, (String[]) null, 2);
        int i = rawQuery.moveToFirst() ? rawQuery.getInt(0) : 0;
        rawQuery.close();
        if (i > 0) {
            return i;
        }
        return 0;
    }
}
