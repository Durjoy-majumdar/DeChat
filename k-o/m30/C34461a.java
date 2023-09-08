package m30;

import android.database.Cursor;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.sdk.storage.sql.SingleTable;
import p749xh.C38682v2;

/* renamed from: m30.a */
public class C34461a extends MAutoStorage<C38682v2> {

    /* renamed from: e */
    public static final String[] f92767e = {MAutoStorage.getCreateSQLs(C38682v2.f103942v, "FewShotLearning")};

    /* renamed from: d */
    public final ISQLiteDatabase f92768d;

    static {
        SingleTable singleTable = C38682v2.f103933j;
    }

    public C34461a(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C38682v2.f103942v, "FewShotLearning", f92767e);
        this.f92768d = iSQLiteDatabase;
        iSQLiteDatabase.execSQL("FewShotLearning", "Alter table FewShotLearning add tag INT");
    }

    /* renamed from: jo */
    public final int mo59597jo(String str, int i) {
        Cursor rawQuery = this.f92768d.rawQuery("select * from FewShotLearning where model='" + str + "' and " + "label" + "=" + i, new String[0]);
        int count = rawQuery.getCount();
        rawQuery.close();
        return count;
    }
}
