package hz0;

import android.database.Cursor;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;

/* renamed from: hz0.g */
public class C46150g extends MAutoStorage<C46146f> {

    /* renamed from: e */
    public static final String[] f124385e = {MAutoStorage.getCreateSQLs(C46146f.f124360f1, "CardMsgInfo")};

    /* renamed from: d */
    public ISQLiteDatabase f124386d;

    public C46150g(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C46146f.f124360f1, "CardMsgInfo", (String[]) null);
        this.f124386d = iSQLiteDatabase;
    }

    public Cursor getAll() {
        return this.f124386d.rawQuery("select * from CardMsgInfo order by time desc", (String[]) null);
    }

    /* renamed from: jo */
    public int mo71599jo() {
        Cursor rawQuery = this.f124386d.rawQuery(" select count(*) from CardMsgInfo where read_state = ? ", new String[]{"1"}, 2);
        int i = 0;
        if (rawQuery == null) {
            return 0;
        }
        if (rawQuery.moveToFirst()) {
            i = rawQuery.getInt(0);
        }
        rawQuery.close();
        return i;
    }
}
